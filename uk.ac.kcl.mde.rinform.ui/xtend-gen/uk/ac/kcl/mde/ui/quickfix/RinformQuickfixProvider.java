package uk.ac.kcl.mde.ui.quickfix;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.edit.IModification;
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;
import org.eclipse.xtext.ui.editor.model.edit.IMultiModification;
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider;
import org.eclipse.xtext.ui.editor.quickfix.Fix;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import uk.ac.kcl.mde.rinform.RoomDeclaration;
import uk.ac.kcl.mde.validation.RinformValidator;

@SuppressWarnings("all")
public class RinformQuickfixProvider extends DefaultQuickfixProvider {
  @Fix(RinformValidator.UNREACHABLE_ROOM)
  public void addDirectionStatement(final Issue issue, final IssueResolutionAcceptor acceptor) {
    final IModification _function = (IModificationContext context) -> {
      final IXtextDocument xtextDocument = context.getXtextDocument();
      final String documentString = xtextDocument.get();
      final int subStrEnd = Math.min(documentString.indexOf(" ", (issue.getOffset()).intValue()), documentString.indexOf("\n", (issue.getOffset()).intValue()));
      final String roomName = documentString.substring((issue.getOffset()).intValue(), subStrEnd).trim();
      xtextDocument.set(((((documentString + "\n") + "<") + roomName) + " >"));
    };
    acceptor.accept(issue, "Add direction", "Add new direction statement at the bottom of the file", null, _function);
  }
  
  @Fix(RinformValidator.NON_CAPITAL_NAME)
  public void capitaliseName(final Issue issue, final IssueResolutionAcceptor acceptor) {
    final IMultiModification<EObject> _function = (EObject element) -> {
      final RoomDeclaration personDeclaration = ((RoomDeclaration) element);
      personDeclaration.setName(StringExtensions.toFirstUpper(personDeclaration.getName()));
    };
    acceptor.<EObject>acceptMulti(issue, "Capitalise", "Change the name to start with a capital letter", null, _function);
  }
}
