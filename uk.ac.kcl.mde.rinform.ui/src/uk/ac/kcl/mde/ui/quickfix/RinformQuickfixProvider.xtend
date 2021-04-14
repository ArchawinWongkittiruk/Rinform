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
			val subStrEnd = documentString.indexOf('-', issue.offset)
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
			//remove the r flags
			xtextDocument.replace(documentString.substring(0, issue.offset).lastIndexOf("r-"), 2, "")
			xtextDocument.replace(documentString.indexOf("-r", issue.offset), 2, "")
			
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
			var subStrStart = documentString.substring(0, issue.offset).lastIndexOf("c-")
			xtextDocument.replace(subStrStart, 2, "")
			subStrStart = documentString.indexOf("-c", issue.offset) - 1
			val subStrEnd = documentString.indexOf("]", issue.offset)
			xtextDocument.replace(subStrStart, subStrEnd - subStrStart, "")
		]
	}
	
	@Fix(RinformValidator.INVALID_DIRECTION)
	def removeInvalidDirection(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, 'Fix statement', 'Delete the second room reference', null) [
			context |
			val xtextDocument = context.xtextDocument
			val documentString = xtextDocument.get
			val subStrEnd = Math.min(documentString.indexOf(" "), documentString.indexOf(">"))
			xtextDocument.replace(issue.offset, subStrEnd - issue.offset, "")
		]
	}
}