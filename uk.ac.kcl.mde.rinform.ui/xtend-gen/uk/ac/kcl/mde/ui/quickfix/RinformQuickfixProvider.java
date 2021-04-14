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
import uk.ac.kcl.mde.rinform.CharacterDeclaration;
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
      final CharacterDeclaration characterDeclaration = ((CharacterDeclaration) element);
      characterDeclaration.setName(StringExtensions.toFirstUpper(characterDeclaration.getName()));
    };
    acceptor.<EObject>acceptMulti(issue, "Capitalise", "Change the name to start with a capital letter", null, _function);
  }
  
  @Fix(RinformValidator.ROOM_ALREADY_DECLARED)
  public void removeDuplicateRoomDeclaration(final Issue issue, final IssueResolutionAcceptor acceptor) {
    final IModification _function = (IModificationContext context) -> {
      final IXtextDocument xtextDocument = context.getXtextDocument();
      final String documentString = xtextDocument.get();
      final int subStrStart = documentString.substring(0, (issue.getOffset()).intValue()).lastIndexOf("-");
      xtextDocument.replace(subStrStart, 3, "");
    };
    acceptor.accept(issue, "Remove declaration", "Delete the duplicate declaration", null, _function);
  }
  
  @Fix(RinformValidator.ITEM_IN_ROOM_ALREADY_DECLARED)
  @Fix(RinformValidator.CONTAINER_ALREADY_DECLARED)
  @Fix(RinformValidator.ITEM_IN_CONTAINER_ALREADY_DECLARED)
  @Fix(RinformValidator.CHARACTER_ALREADY_DECLARED)
  public void removeDuplicateItemAndCharacterDeclarations(final Issue issue, final IssueResolutionAcceptor acceptor) {
    final IModification _function = (IModificationContext context) -> {
      final IXtextDocument xtextDocument = context.getXtextDocument();
      final String documentString = xtextDocument.get();
      int subStrStart = documentString.substring(0, (issue.getOffset()).intValue()).lastIndexOf("-");
      xtextDocument.replace(subStrStart, 3, "");
      int _indexOf = documentString.indexOf("-", (issue.getOffset()).intValue());
      int _minus = (_indexOf - 1);
      subStrStart = _minus;
      int subStrEnd = (subStrStart + 3);
      while (Character.valueOf(documentString.charAt(subStrEnd)).toString().equals(" ")) {
        subStrEnd++;
      }
      subStrEnd = Math.min(documentString.indexOf(" ", subStrEnd), documentString.indexOf("\n", subStrEnd));
      xtextDocument.replace((subStrStart - 3), (subStrEnd - subStrStart), "");
    };
    acceptor.accept(issue, "Remove declaration", "Delete the duplicate declaration", null, _function);
  }
}
