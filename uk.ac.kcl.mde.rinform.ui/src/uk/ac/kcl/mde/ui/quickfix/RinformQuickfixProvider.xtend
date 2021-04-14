package uk.ac.kcl.mde.ui.quickfix

import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider
import uk.ac.kcl.mde.validation.RinformValidator
import org.eclipse.xtext.ui.editor.quickfix.Fix
import org.eclipse.xtext.validation.Issue
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor
import uk.ac.kcl.mde.rinform.CharacterDeclaration

class RinformQuickfixProvider extends DefaultQuickfixProvider {
	
	@Fix(RinformValidator.UNREACHABLE_ROOM)
	def addDirectionStatement(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, 'Add direction', 'Add new direction statement at the bottom of the file', null) [
			context |
			val xtextDocument = context.xtextDocument
			val documentString = xtextDocument.get
			val subStrEnd = Math.min(documentString.indexOf(' ', issue.offset), documentString.indexOf('\n', issue.offset))
			val roomName = documentString.substring(issue.offset, subStrEnd).trim
			//add <RoomName > at the end of the document
			xtextDocument.set(documentString + '\n' + "<" + roomName + " >")
		]
	}
	
	@Fix(RinformValidator.NON_CAPITAL_NAME)
	def capitaliseName(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.acceptMulti(issue, 'Capitalise', 'Change the name to start with a capital letter', null) [
			element |
			val characterDeclaration = element as CharacterDeclaration
			characterDeclaration.name = characterDeclaration.name.toFirstUpper
		]
	}
	
	@Fix(RinformValidator.ROOM_ALREADY_DECLARED)
	def removeDuplicateRoomDeclaration(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, 'Remove declaration', 'Delete the duplicate declaration', null) [
			context |
			val xtextDocument = context.xtextDocument
			val documentString = xtextDocument.get
			val subStrStart = documentString.substring(0, issue.offset).lastIndexOf("-")
			//remove the -r flag
			xtextDocument.replace(subStrStart, 3, "")
		]
	}
	
	@Fix(RinformValidator.ITEM_IN_ROOM_ALREADY_DECLARED)
	@Fix(RinformValidator.CONTAINER_ALREADY_DECLARED)
	@Fix(RinformValidator.ITEM_IN_CONTAINER_ALREADY_DECLARED)
	@Fix(RinformValidator.CHARACTER_ALREADY_DECLARED)
	def removeDuplicateItemAndCharacterDeclarations(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, 'Remove declaration', 'Delete the duplicate declaration', null) [
			context |
			val xtextDocument = context.xtextDocument
			val documentString = xtextDocument.get
			var subStrStart = documentString.substring(0, issue.offset).lastIndexOf("-")
			xtextDocument.replace(subStrStart, 3, "")
			subStrStart = documentString.indexOf("-", issue.offset) - 1
			var subStrEnd = subStrStart + 3
			//find the end index of the room/container name, accounting for the possibility of
			//several spaces in between -r/-c and the name
			while (documentString.charAt(subStrEnd).toString.equals(" ")){
				subStrEnd++
			}
			subStrEnd = Math.min(documentString.indexOf(" ", subStrEnd), documentString.indexOf('\n', subStrEnd))
			xtextDocument.replace(subStrStart - 3, subStrEnd - subStrStart, "")
		]
	}
	

}