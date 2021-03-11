/*
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.mde.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import uk.ac.kcl.mde.parser.antlr.internal.InternalRinformParser;
import uk.ac.kcl.mde.services.RinformGrammarAccess;

public class RinformParser extends AbstractAntlrParser {

	@Inject
	private RinformGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalRinformParser createParser(XtextTokenStream stream) {
		return new InternalRinformParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public RinformGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(RinformGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
