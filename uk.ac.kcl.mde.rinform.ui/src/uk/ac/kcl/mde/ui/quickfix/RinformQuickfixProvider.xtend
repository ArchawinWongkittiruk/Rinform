package uk.ac.kcl.mde.ui.quickfix

import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider
import uk.ac.kcl.mde.validation.RinformValidator
import org.eclipse.xtext.ui.editor.quickfix.Fix
import org.eclipse.xtext.validation.Issue
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor
import uk.ac.kcl.mde.rinform.RoomDeclaration

class RinformQuickfixProvider extends DefaultQuickfixProvider {
	
	@Fix(RinformValidator.UNREACHABLE_ROOM)
	def addDirectionStatement(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, 'Add direction', 'Add new direction statement at the bottom of the file', null) [
			context |
			val xtextDocument = context.xtextDocument
			val documentString = xtextDocument.get
			val subStrEnd = Math.min(documentString.indexOf(' ', issue.offset), documentString.indexOf('\n', issue.offset))
			val roomName = documentString.substring(issue.offset, subStrEnd).trim
			xtextDocument.set(documentString + '\n' + "<" + roomName + " >")
		]
	}
	
	@Fix(RinformValidator.NON_CAPITAL_NAME)
	def capitaliseName(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.acceptMulti(issue, 'Capitalise', 'Change the name to start with a capital letter', null) [
			element |
			val personDeclaration = element as RoomDeclaration
			personDeclaration.name = personDeclaration.name.toFirstUpper
		]
	}

}