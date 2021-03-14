/*
 * generated by Xtext 2.20.0
 */
grammar InternalRinform;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package uk.ac.kcl.mde.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package uk.ac.kcl.mde.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import uk.ac.kcl.mde.services.RinformGrammarAccess;

}
@parser::members {
	private RinformGrammarAccess grammarAccess;

	public void setGrammarAccess(RinformGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleReverseInformProgram
entryRuleReverseInformProgram
:
{ before(grammarAccess.getReverseInformProgramRule()); }
	 ruleReverseInformProgram
{ after(grammarAccess.getReverseInformProgramRule()); } 
	 EOF 
;

// Rule ReverseInformProgram
ruleReverseInformProgram 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getReverseInformProgramAccess().getSentencesAssignment()); }
		(rule__ReverseInformProgram__SentencesAssignment)*
		{ after(grammarAccess.getReverseInformProgramAccess().getSentencesAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSentenceParts
entryRuleSentenceParts
:
{ before(grammarAccess.getSentencePartsRule()); }
	 ruleSentenceParts
{ after(grammarAccess.getSentencePartsRule()); } 
	 EOF 
;

// Rule SentenceParts
ruleSentenceParts 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSentencePartsAccess().getAlternatives()); }
		(rule__SentenceParts__Alternatives)
		{ after(grammarAccess.getSentencePartsAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRoomDeclaration
entryRuleRoomDeclaration
:
{ before(grammarAccess.getRoomDeclarationRule()); }
	 ruleRoomDeclaration
{ after(grammarAccess.getRoomDeclarationRule()); } 
	 EOF 
;

// Rule RoomDeclaration
ruleRoomDeclaration 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRoomDeclarationAccess().getGroup()); }
		(rule__RoomDeclaration__Group__0)
		{ after(grammarAccess.getRoomDeclarationAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRoomDescription
entryRuleRoomDescription
:
{ before(grammarAccess.getRoomDescriptionRule()); }
	 ruleRoomDescription
{ after(grammarAccess.getRoomDescriptionRule()); } 
	 EOF 
;

// Rule RoomDescription
ruleRoomDescription 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRoomDescriptionAccess().getGroup()); }
		(rule__RoomDescription__Group__0)
		{ after(grammarAccess.getRoomDescriptionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleItemDeclaration
entryRuleItemDeclaration
:
{ before(grammarAccess.getItemDeclarationRule()); }
	 ruleItemDeclaration
{ after(grammarAccess.getItemDeclarationRule()); } 
	 EOF 
;

// Rule ItemDeclaration
ruleItemDeclaration 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getItemDeclarationAccess().getGroup()); }
		(rule__ItemDeclaration__Group__0)
		{ after(grammarAccess.getItemDeclarationAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleItemDescription
entryRuleItemDescription
:
{ before(grammarAccess.getItemDescriptionRule()); }
	 ruleItemDescription
{ after(grammarAccess.getItemDescriptionRule()); } 
	 EOF 
;

// Rule ItemDescription
ruleItemDescription 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getItemDescriptionAccess().getGroup()); }
		(rule__ItemDescription__Group__0)
		{ after(grammarAccess.getItemDescriptionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleText
entryRuleText
:
{ before(grammarAccess.getTextRule()); }
	 ruleText
{ after(grammarAccess.getTextRule()); } 
	 EOF 
;

// Rule Text
ruleText 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		(
			{ before(grammarAccess.getTextAccess().getTextAssignment()); }
			(rule__Text__TextAssignment)
			{ after(grammarAccess.getTextAccess().getTextAssignment()); }
		)
		(
			{ before(grammarAccess.getTextAccess().getTextAssignment()); }
			(rule__Text__TextAssignment)*
			{ after(grammarAccess.getTextAccess().getTextAssignment()); }
		)
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleWord
entryRuleWord
:
{ before(grammarAccess.getWordRule()); }
	 ruleWord
{ after(grammarAccess.getWordRule()); } 
	 EOF 
;

// Rule Word
ruleWord 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getWordAccess().getWordAssignment()); }
		(rule__Word__WordAssignment)
		{ after(grammarAccess.getWordAccess().getWordAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSymbol
entryRuleSymbol
:
{ before(grammarAccess.getSymbolRule()); }
	 ruleSymbol
{ after(grammarAccess.getSymbolRule()); } 
	 EOF 
;

// Rule Symbol
ruleSymbol 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSymbolAccess().getSymbolAssignment()); }
		(rule__Symbol__SymbolAssignment)
		{ after(grammarAccess.getSymbolAccess().getSymbolAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SentenceParts__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSentencePartsAccess().getRoomDeclarationParserRuleCall_0()); }
		ruleRoomDeclaration
		{ after(grammarAccess.getSentencePartsAccess().getRoomDeclarationParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getSentencePartsAccess().getRoomDescriptionParserRuleCall_1()); }
		ruleRoomDescription
		{ after(grammarAccess.getSentencePartsAccess().getRoomDescriptionParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getSentencePartsAccess().getItemDeclarationParserRuleCall_2()); }
		ruleItemDeclaration
		{ after(grammarAccess.getSentencePartsAccess().getItemDeclarationParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getSentencePartsAccess().getItemDescriptionParserRuleCall_3()); }
		ruleItemDescription
		{ after(grammarAccess.getSentencePartsAccess().getItemDescriptionParserRuleCall_3()); }
	)
	|
	(
		{ before(grammarAccess.getSentencePartsAccess().getTextParserRuleCall_4()); }
		ruleText
		{ after(grammarAccess.getSentencePartsAccess().getTextParserRuleCall_4()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Text__TextAlternatives_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTextAccess().getTextSymbolParserRuleCall_0_0()); }
		ruleSymbol
		{ after(grammarAccess.getTextAccess().getTextSymbolParserRuleCall_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getTextAccess().getTextWordParserRuleCall_0_1()); }
		ruleWord
		{ after(grammarAccess.getTextAccess().getTextWordParserRuleCall_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Symbol__SymbolAlternatives_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSymbolAccess().getSymbolFullStopKeyword_0_0()); }
		'.'
		{ after(grammarAccess.getSymbolAccess().getSymbolFullStopKeyword_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getSymbolAccess().getSymbolCommaKeyword_0_1()); }
		','
		{ after(grammarAccess.getSymbolAccess().getSymbolCommaKeyword_0_1()); }
	)
	|
	(
		{ before(grammarAccess.getSymbolAccess().getSymbolSemicolonKeyword_0_2()); }
		';'
		{ after(grammarAccess.getSymbolAccess().getSymbolSemicolonKeyword_0_2()); }
	)
	|
	(
		{ before(grammarAccess.getSymbolAccess().getSymbolColonKeyword_0_3()); }
		':'
		{ after(grammarAccess.getSymbolAccess().getSymbolColonKeyword_0_3()); }
	)
	|
	(
		{ before(grammarAccess.getSymbolAccess().getSymbolHyphenMinusKeyword_0_4()); }
		'-'
		{ after(grammarAccess.getSymbolAccess().getSymbolHyphenMinusKeyword_0_4()); }
	)
	|
	(
		{ before(grammarAccess.getSymbolAccess().getSymbolExclamationMarkKeyword_0_5()); }
		'!'
		{ after(grammarAccess.getSymbolAccess().getSymbolExclamationMarkKeyword_0_5()); }
	)
	|
	(
		{ before(grammarAccess.getSymbolAccess().getSymbolQuestionMarkKeyword_0_6()); }
		'?'
		{ after(grammarAccess.getSymbolAccess().getSymbolQuestionMarkKeyword_0_6()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RoomDeclaration__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RoomDeclaration__Group__0__Impl
	rule__RoomDeclaration__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RoomDeclaration__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRoomDeclarationAccess().getLeftSquareBracketKeyword_0()); }
	'['
	{ after(grammarAccess.getRoomDeclarationAccess().getLeftSquareBracketKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RoomDeclaration__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RoomDeclaration__Group__1__Impl
	rule__RoomDeclaration__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__RoomDeclaration__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRoomDeclarationAccess().getNameAssignment_1()); }
	(rule__RoomDeclaration__NameAssignment_1)
	{ after(grammarAccess.getRoomDeclarationAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RoomDeclaration__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RoomDeclaration__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RoomDeclaration__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRoomDeclarationAccess().getRightSquareBracketKeyword_2()); }
	']'
	{ after(grammarAccess.getRoomDeclarationAccess().getRightSquareBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RoomDescription__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RoomDescription__Group__0__Impl
	rule__RoomDescription__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RoomDescription__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRoomDescriptionAccess().getLeftParenthesisLeftSquareBracketKeyword_0()); }
	'(['
	{ after(grammarAccess.getRoomDescriptionAccess().getLeftParenthesisLeftSquareBracketKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RoomDescription__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RoomDescription__Group__1__Impl
	rule__RoomDescription__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__RoomDescription__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRoomDescriptionAccess().getRoomAssignment_1()); }
	(rule__RoomDescription__RoomAssignment_1)
	{ after(grammarAccess.getRoomDescriptionAccess().getRoomAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RoomDescription__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RoomDescription__Group__2__Impl
	rule__RoomDescription__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__RoomDescription__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRoomDescriptionAccess().getRightSquareBracketKeyword_2()); }
	']'
	{ after(grammarAccess.getRoomDescriptionAccess().getRightSquareBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RoomDescription__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RoomDescription__Group__3__Impl
	rule__RoomDescription__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__RoomDescription__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRoomDescriptionAccess().getTextAssignment_3()); }
	(rule__RoomDescription__TextAssignment_3)
	{ after(grammarAccess.getRoomDescriptionAccess().getTextAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RoomDescription__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RoomDescription__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RoomDescription__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRoomDescriptionAccess().getRightParenthesisKeyword_4()); }
	')'
	{ after(grammarAccess.getRoomDescriptionAccess().getRightParenthesisKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ItemDeclaration__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ItemDeclaration__Group__0__Impl
	rule__ItemDeclaration__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ItemDeclaration__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getItemDeclarationAccess().getLeftCurlyBracketKeyword_0()); }
	'{'
	{ after(grammarAccess.getItemDeclarationAccess().getLeftCurlyBracketKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ItemDeclaration__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ItemDeclaration__Group__1__Impl
	rule__ItemDeclaration__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ItemDeclaration__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getItemDeclarationAccess().getNameAssignment_1()); }
	(rule__ItemDeclaration__NameAssignment_1)
	{ after(grammarAccess.getItemDeclarationAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ItemDeclaration__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ItemDeclaration__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ItemDeclaration__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getItemDeclarationAccess().getRightCurlyBracketKeyword_2()); }
	'}'
	{ after(grammarAccess.getItemDeclarationAccess().getRightCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ItemDescription__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ItemDescription__Group__0__Impl
	rule__ItemDescription__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ItemDescription__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getItemDescriptionAccess().getLeftParenthesisLeftCurlyBracketKeyword_0()); }
	'({'
	{ after(grammarAccess.getItemDescriptionAccess().getLeftParenthesisLeftCurlyBracketKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ItemDescription__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ItemDescription__Group__1__Impl
	rule__ItemDescription__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ItemDescription__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getItemDescriptionAccess().getItemAssignment_1()); }
	(rule__ItemDescription__ItemAssignment_1)
	{ after(grammarAccess.getItemDescriptionAccess().getItemAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ItemDescription__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ItemDescription__Group__2__Impl
	rule__ItemDescription__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ItemDescription__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getItemDescriptionAccess().getRightCurlyBracketKeyword_2()); }
	'}'
	{ after(grammarAccess.getItemDescriptionAccess().getRightCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ItemDescription__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ItemDescription__Group__3__Impl
	rule__ItemDescription__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ItemDescription__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getItemDescriptionAccess().getTextAssignment_3()); }
	(rule__ItemDescription__TextAssignment_3)
	{ after(grammarAccess.getItemDescriptionAccess().getTextAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ItemDescription__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ItemDescription__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ItemDescription__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getItemDescriptionAccess().getRightParenthesisKeyword_4()); }
	')'
	{ after(grammarAccess.getItemDescriptionAccess().getRightParenthesisKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ReverseInformProgram__SentencesAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getReverseInformProgramAccess().getSentencesSentencePartsParserRuleCall_0()); }
		ruleSentenceParts
		{ after(grammarAccess.getReverseInformProgramAccess().getSentencesSentencePartsParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RoomDeclaration__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRoomDeclarationAccess().getNameTextParserRuleCall_1_0()); }
		ruleText
		{ after(grammarAccess.getRoomDeclarationAccess().getNameTextParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RoomDescription__RoomAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRoomDescriptionAccess().getRoomRoomDeclarationCrossReference_1_0()); }
		(
			{ before(grammarAccess.getRoomDescriptionAccess().getRoomRoomDeclarationIDTerminalRuleCall_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getRoomDescriptionAccess().getRoomRoomDeclarationIDTerminalRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getRoomDescriptionAccess().getRoomRoomDeclarationCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RoomDescription__TextAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRoomDescriptionAccess().getTextTextParserRuleCall_3_0()); }
		ruleText
		{ after(grammarAccess.getRoomDescriptionAccess().getTextTextParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ItemDeclaration__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getItemDeclarationAccess().getNameTextParserRuleCall_1_0()); }
		ruleText
		{ after(grammarAccess.getItemDeclarationAccess().getNameTextParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ItemDescription__ItemAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getItemDescriptionAccess().getItemItemDeclarationCrossReference_1_0()); }
		(
			{ before(grammarAccess.getItemDescriptionAccess().getItemItemDeclarationIDTerminalRuleCall_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getItemDescriptionAccess().getItemItemDeclarationIDTerminalRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getItemDescriptionAccess().getItemItemDeclarationCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ItemDescription__TextAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getItemDescriptionAccess().getTextTextParserRuleCall_3_0()); }
		ruleText
		{ after(grammarAccess.getItemDescriptionAccess().getTextTextParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Text__TextAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTextAccess().getTextAlternatives_0()); }
		(rule__Text__TextAlternatives_0)
		{ after(grammarAccess.getTextAccess().getTextAlternatives_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Word__WordAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getWordAccess().getWordIDTerminalRuleCall_0()); }
		RULE_ID
		{ after(grammarAccess.getWordAccess().getWordIDTerminalRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Symbol__SymbolAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSymbolAccess().getSymbolAlternatives_0()); }
		(rule__Symbol__SymbolAlternatives_0)
		{ after(grammarAccess.getSymbolAccess().getSymbolAlternatives_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
