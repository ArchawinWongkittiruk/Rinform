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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRinformParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_WS", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'.'", "','", "';'", "':'", "'-'", "'!'", "'?'", "'\\''", "'South'", "'North'", "'East'", "'West'", "'Below'", "'Above'", "'['", "']'", "'('", "')'", "'{'", "'}'", "'({'", "'<'", "'>'"
    };
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalRinformParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRinformParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRinformParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRinform.g"; }


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



    // $ANTLR start "entryRuleReverseInformProgram"
    // InternalRinform.g:53:1: entryRuleReverseInformProgram : ruleReverseInformProgram EOF ;
    public final void entryRuleReverseInformProgram() throws RecognitionException {
        try {
            // InternalRinform.g:54:1: ( ruleReverseInformProgram EOF )
            // InternalRinform.g:55:1: ruleReverseInformProgram EOF
            {
             before(grammarAccess.getReverseInformProgramRule()); 
            pushFollow(FOLLOW_1);
            ruleReverseInformProgram();

            state._fsp--;

             after(grammarAccess.getReverseInformProgramRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReverseInformProgram"


    // $ANTLR start "ruleReverseInformProgram"
    // InternalRinform.g:62:1: ruleReverseInformProgram : ( ( rule__ReverseInformProgram__SentencesAssignment )* ) ;
    public final void ruleReverseInformProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:66:2: ( ( ( rule__ReverseInformProgram__SentencesAssignment )* ) )
            // InternalRinform.g:67:2: ( ( rule__ReverseInformProgram__SentencesAssignment )* )
            {
            // InternalRinform.g:67:2: ( ( rule__ReverseInformProgram__SentencesAssignment )* )
            // InternalRinform.g:68:3: ( rule__ReverseInformProgram__SentencesAssignment )*
            {
             before(grammarAccess.getReverseInformProgramAccess().getSentencesAssignment()); 
            // InternalRinform.g:69:3: ( rule__ReverseInformProgram__SentencesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||(LA1_0>=11 && LA1_0<=18)||LA1_0==25||LA1_0==27||LA1_0==29||(LA1_0>=31 && LA1_0<=32)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRinform.g:69:4: rule__ReverseInformProgram__SentencesAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__ReverseInformProgram__SentencesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getReverseInformProgramAccess().getSentencesAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReverseInformProgram"


    // $ANTLR start "entryRuleSentencePart"
    // InternalRinform.g:78:1: entryRuleSentencePart : ruleSentencePart EOF ;
    public final void entryRuleSentencePart() throws RecognitionException {
        try {
            // InternalRinform.g:79:1: ( ruleSentencePart EOF )
            // InternalRinform.g:80:1: ruleSentencePart EOF
            {
             before(grammarAccess.getSentencePartRule()); 
            pushFollow(FOLLOW_1);
            ruleSentencePart();

            state._fsp--;

             after(grammarAccess.getSentencePartRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSentencePart"


    // $ANTLR start "ruleSentencePart"
    // InternalRinform.g:87:1: ruleSentencePart : ( ( rule__SentencePart__Alternatives ) ) ;
    public final void ruleSentencePart() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:91:2: ( ( ( rule__SentencePart__Alternatives ) ) )
            // InternalRinform.g:92:2: ( ( rule__SentencePart__Alternatives ) )
            {
            // InternalRinform.g:92:2: ( ( rule__SentencePart__Alternatives ) )
            // InternalRinform.g:93:3: ( rule__SentencePart__Alternatives )
            {
             before(grammarAccess.getSentencePartAccess().getAlternatives()); 
            // InternalRinform.g:94:3: ( rule__SentencePart__Alternatives )
            // InternalRinform.g:94:4: rule__SentencePart__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SentencePart__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSentencePartAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSentencePart"


    // $ANTLR start "entryRuleRoomDeclaration"
    // InternalRinform.g:103:1: entryRuleRoomDeclaration : ruleRoomDeclaration EOF ;
    public final void entryRuleRoomDeclaration() throws RecognitionException {
        try {
            // InternalRinform.g:104:1: ( ruleRoomDeclaration EOF )
            // InternalRinform.g:105:1: ruleRoomDeclaration EOF
            {
             before(grammarAccess.getRoomDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleRoomDeclaration();

            state._fsp--;

             after(grammarAccess.getRoomDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRoomDeclaration"


    // $ANTLR start "ruleRoomDeclaration"
    // InternalRinform.g:112:1: ruleRoomDeclaration : ( ( rule__RoomDeclaration__Group__0 ) ) ;
    public final void ruleRoomDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:116:2: ( ( ( rule__RoomDeclaration__Group__0 ) ) )
            // InternalRinform.g:117:2: ( ( rule__RoomDeclaration__Group__0 ) )
            {
            // InternalRinform.g:117:2: ( ( rule__RoomDeclaration__Group__0 ) )
            // InternalRinform.g:118:3: ( rule__RoomDeclaration__Group__0 )
            {
             before(grammarAccess.getRoomDeclarationAccess().getGroup()); 
            // InternalRinform.g:119:3: ( rule__RoomDeclaration__Group__0 )
            // InternalRinform.g:119:4: rule__RoomDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RoomDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRoomDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRoomDeclaration"


    // $ANTLR start "entryRuleRoomDescription"
    // InternalRinform.g:128:1: entryRuleRoomDescription : ruleRoomDescription EOF ;
    public final void entryRuleRoomDescription() throws RecognitionException {
        try {
            // InternalRinform.g:129:1: ( ruleRoomDescription EOF )
            // InternalRinform.g:130:1: ruleRoomDescription EOF
            {
             before(grammarAccess.getRoomDescriptionRule()); 
            pushFollow(FOLLOW_1);
            ruleRoomDescription();

            state._fsp--;

             after(grammarAccess.getRoomDescriptionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRoomDescription"


    // $ANTLR start "ruleRoomDescription"
    // InternalRinform.g:137:1: ruleRoomDescription : ( ( rule__RoomDescription__Group__0 ) ) ;
    public final void ruleRoomDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:141:2: ( ( ( rule__RoomDescription__Group__0 ) ) )
            // InternalRinform.g:142:2: ( ( rule__RoomDescription__Group__0 ) )
            {
            // InternalRinform.g:142:2: ( ( rule__RoomDescription__Group__0 ) )
            // InternalRinform.g:143:3: ( rule__RoomDescription__Group__0 )
            {
             before(grammarAccess.getRoomDescriptionAccess().getGroup()); 
            // InternalRinform.g:144:3: ( rule__RoomDescription__Group__0 )
            // InternalRinform.g:144:4: rule__RoomDescription__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RoomDescription__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRoomDescriptionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRoomDescription"


    // $ANTLR start "entryRuleItemDeclaration"
    // InternalRinform.g:153:1: entryRuleItemDeclaration : ruleItemDeclaration EOF ;
    public final void entryRuleItemDeclaration() throws RecognitionException {
        try {
            // InternalRinform.g:154:1: ( ruleItemDeclaration EOF )
            // InternalRinform.g:155:1: ruleItemDeclaration EOF
            {
             before(grammarAccess.getItemDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleItemDeclaration();

            state._fsp--;

             after(grammarAccess.getItemDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleItemDeclaration"


    // $ANTLR start "ruleItemDeclaration"
    // InternalRinform.g:162:1: ruleItemDeclaration : ( ( rule__ItemDeclaration__Group__0 ) ) ;
    public final void ruleItemDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:166:2: ( ( ( rule__ItemDeclaration__Group__0 ) ) )
            // InternalRinform.g:167:2: ( ( rule__ItemDeclaration__Group__0 ) )
            {
            // InternalRinform.g:167:2: ( ( rule__ItemDeclaration__Group__0 ) )
            // InternalRinform.g:168:3: ( rule__ItemDeclaration__Group__0 )
            {
             before(grammarAccess.getItemDeclarationAccess().getGroup()); 
            // InternalRinform.g:169:3: ( rule__ItemDeclaration__Group__0 )
            // InternalRinform.g:169:4: rule__ItemDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ItemDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getItemDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleItemDeclaration"


    // $ANTLR start "entryRuleItemDescription"
    // InternalRinform.g:178:1: entryRuleItemDescription : ruleItemDescription EOF ;
    public final void entryRuleItemDescription() throws RecognitionException {
        try {
            // InternalRinform.g:179:1: ( ruleItemDescription EOF )
            // InternalRinform.g:180:1: ruleItemDescription EOF
            {
             before(grammarAccess.getItemDescriptionRule()); 
            pushFollow(FOLLOW_1);
            ruleItemDescription();

            state._fsp--;

             after(grammarAccess.getItemDescriptionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleItemDescription"


    // $ANTLR start "ruleItemDescription"
    // InternalRinform.g:187:1: ruleItemDescription : ( ( rule__ItemDescription__Group__0 ) ) ;
    public final void ruleItemDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:191:2: ( ( ( rule__ItemDescription__Group__0 ) ) )
            // InternalRinform.g:192:2: ( ( rule__ItemDescription__Group__0 ) )
            {
            // InternalRinform.g:192:2: ( ( rule__ItemDescription__Group__0 ) )
            // InternalRinform.g:193:3: ( rule__ItemDescription__Group__0 )
            {
             before(grammarAccess.getItemDescriptionAccess().getGroup()); 
            // InternalRinform.g:194:3: ( rule__ItemDescription__Group__0 )
            // InternalRinform.g:194:4: rule__ItemDescription__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ItemDescription__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getItemDescriptionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleItemDescription"


    // $ANTLR start "entryRuleDirectionStatement"
    // InternalRinform.g:203:1: entryRuleDirectionStatement : ruleDirectionStatement EOF ;
    public final void entryRuleDirectionStatement() throws RecognitionException {
        try {
            // InternalRinform.g:204:1: ( ruleDirectionStatement EOF )
            // InternalRinform.g:205:1: ruleDirectionStatement EOF
            {
             before(grammarAccess.getDirectionStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleDirectionStatement();

            state._fsp--;

             after(grammarAccess.getDirectionStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDirectionStatement"


    // $ANTLR start "ruleDirectionStatement"
    // InternalRinform.g:212:1: ruleDirectionStatement : ( ( rule__DirectionStatement__Group__0 ) ) ;
    public final void ruleDirectionStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:216:2: ( ( ( rule__DirectionStatement__Group__0 ) ) )
            // InternalRinform.g:217:2: ( ( rule__DirectionStatement__Group__0 ) )
            {
            // InternalRinform.g:217:2: ( ( rule__DirectionStatement__Group__0 ) )
            // InternalRinform.g:218:3: ( rule__DirectionStatement__Group__0 )
            {
             before(grammarAccess.getDirectionStatementAccess().getGroup()); 
            // InternalRinform.g:219:3: ( rule__DirectionStatement__Group__0 )
            // InternalRinform.g:219:4: rule__DirectionStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DirectionStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDirectionStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDirectionStatement"


    // $ANTLR start "entryRuleText"
    // InternalRinform.g:228:1: entryRuleText : ruleText EOF ;
    public final void entryRuleText() throws RecognitionException {
        try {
            // InternalRinform.g:229:1: ( ruleText EOF )
            // InternalRinform.g:230:1: ruleText EOF
            {
             before(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_1);
            ruleText();

            state._fsp--;

             after(grammarAccess.getTextRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleText"


    // $ANTLR start "ruleText"
    // InternalRinform.g:237:1: ruleText : ( ( rule__Text__Group__0 ) ) ;
    public final void ruleText() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:241:2: ( ( ( rule__Text__Group__0 ) ) )
            // InternalRinform.g:242:2: ( ( rule__Text__Group__0 ) )
            {
            // InternalRinform.g:242:2: ( ( rule__Text__Group__0 ) )
            // InternalRinform.g:243:3: ( rule__Text__Group__0 )
            {
             before(grammarAccess.getTextAccess().getGroup()); 
            // InternalRinform.g:244:3: ( rule__Text__Group__0 )
            // InternalRinform.g:244:4: rule__Text__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Text__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTextAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleText"


    // $ANTLR start "entryRuleWords"
    // InternalRinform.g:253:1: entryRuleWords : ruleWords EOF ;
    public final void entryRuleWords() throws RecognitionException {
        try {
            // InternalRinform.g:254:1: ( ruleWords EOF )
            // InternalRinform.g:255:1: ruleWords EOF
            {
             before(grammarAccess.getWordsRule()); 
            pushFollow(FOLLOW_1);
            ruleWords();

            state._fsp--;

             after(grammarAccess.getWordsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWords"


    // $ANTLR start "ruleWords"
    // InternalRinform.g:262:1: ruleWords : ( ( ( rule__Words__WordsAssignment ) ) ( ( rule__Words__WordsAssignment )* ) ) ;
    public final void ruleWords() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:266:2: ( ( ( ( rule__Words__WordsAssignment ) ) ( ( rule__Words__WordsAssignment )* ) ) )
            // InternalRinform.g:267:2: ( ( ( rule__Words__WordsAssignment ) ) ( ( rule__Words__WordsAssignment )* ) )
            {
            // InternalRinform.g:267:2: ( ( ( rule__Words__WordsAssignment ) ) ( ( rule__Words__WordsAssignment )* ) )
            // InternalRinform.g:268:3: ( ( rule__Words__WordsAssignment ) ) ( ( rule__Words__WordsAssignment )* )
            {
            // InternalRinform.g:268:3: ( ( rule__Words__WordsAssignment ) )
            // InternalRinform.g:269:4: ( rule__Words__WordsAssignment )
            {
             before(grammarAccess.getWordsAccess().getWordsAssignment()); 
            // InternalRinform.g:270:4: ( rule__Words__WordsAssignment )
            // InternalRinform.g:270:5: rule__Words__WordsAssignment
            {
            pushFollow(FOLLOW_4);
            rule__Words__WordsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getWordsAccess().getWordsAssignment()); 

            }

            // InternalRinform.g:273:3: ( ( rule__Words__WordsAssignment )* )
            // InternalRinform.g:274:4: ( rule__Words__WordsAssignment )*
            {
             before(grammarAccess.getWordsAccess().getWordsAssignment()); 
            // InternalRinform.g:275:4: ( rule__Words__WordsAssignment )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalRinform.g:275:5: rule__Words__WordsAssignment
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Words__WordsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getWordsAccess().getWordsAssignment()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWords"


    // $ANTLR start "entryRuleSymbol"
    // InternalRinform.g:285:1: entryRuleSymbol : ruleSymbol EOF ;
    public final void entryRuleSymbol() throws RecognitionException {
        try {
            // InternalRinform.g:286:1: ( ruleSymbol EOF )
            // InternalRinform.g:287:1: ruleSymbol EOF
            {
             before(grammarAccess.getSymbolRule()); 
            pushFollow(FOLLOW_1);
            ruleSymbol();

            state._fsp--;

             after(grammarAccess.getSymbolRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSymbol"


    // $ANTLR start "ruleSymbol"
    // InternalRinform.g:294:1: ruleSymbol : ( ( rule__Symbol__SymbolAssignment ) ) ;
    public final void ruleSymbol() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:298:2: ( ( ( rule__Symbol__SymbolAssignment ) ) )
            // InternalRinform.g:299:2: ( ( rule__Symbol__SymbolAssignment ) )
            {
            // InternalRinform.g:299:2: ( ( rule__Symbol__SymbolAssignment ) )
            // InternalRinform.g:300:3: ( rule__Symbol__SymbolAssignment )
            {
             before(grammarAccess.getSymbolAccess().getSymbolAssignment()); 
            // InternalRinform.g:301:3: ( rule__Symbol__SymbolAssignment )
            // InternalRinform.g:301:4: rule__Symbol__SymbolAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Symbol__SymbolAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSymbolAccess().getSymbolAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSymbol"


    // $ANTLR start "ruleDirection"
    // InternalRinform.g:310:1: ruleDirection : ( ( rule__Direction__Alternatives ) ) ;
    public final void ruleDirection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:314:1: ( ( ( rule__Direction__Alternatives ) ) )
            // InternalRinform.g:315:2: ( ( rule__Direction__Alternatives ) )
            {
            // InternalRinform.g:315:2: ( ( rule__Direction__Alternatives ) )
            // InternalRinform.g:316:3: ( rule__Direction__Alternatives )
            {
             before(grammarAccess.getDirectionAccess().getAlternatives()); 
            // InternalRinform.g:317:3: ( rule__Direction__Alternatives )
            // InternalRinform.g:317:4: rule__Direction__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Direction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDirectionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDirection"


    // $ANTLR start "rule__SentencePart__Alternatives"
    // InternalRinform.g:325:1: rule__SentencePart__Alternatives : ( ( ruleRoomDeclaration ) | ( ruleRoomDescription ) | ( ruleItemDeclaration ) | ( ruleItemDescription ) | ( ruleWords ) | ( ruleSymbol ) | ( ruleDirectionStatement ) );
    public final void rule__SentencePart__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:329:1: ( ( ruleRoomDeclaration ) | ( ruleRoomDescription ) | ( ruleItemDeclaration ) | ( ruleItemDescription ) | ( ruleWords ) | ( ruleSymbol ) | ( ruleDirectionStatement ) )
            int alt3=7;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt3=1;
                }
                break;
            case 27:
                {
                alt3=2;
                }
                break;
            case 29:
                {
                alt3=3;
                }
                break;
            case 31:
                {
                alt3=4;
                }
                break;
            case RULE_ID:
                {
                alt3=5;
                }
                break;
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                {
                alt3=6;
                }
                break;
            case 32:
                {
                alt3=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalRinform.g:330:2: ( ruleRoomDeclaration )
                    {
                    // InternalRinform.g:330:2: ( ruleRoomDeclaration )
                    // InternalRinform.g:331:3: ruleRoomDeclaration
                    {
                     before(grammarAccess.getSentencePartAccess().getRoomDeclarationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleRoomDeclaration();

                    state._fsp--;

                     after(grammarAccess.getSentencePartAccess().getRoomDeclarationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRinform.g:336:2: ( ruleRoomDescription )
                    {
                    // InternalRinform.g:336:2: ( ruleRoomDescription )
                    // InternalRinform.g:337:3: ruleRoomDescription
                    {
                     before(grammarAccess.getSentencePartAccess().getRoomDescriptionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRoomDescription();

                    state._fsp--;

                     after(grammarAccess.getSentencePartAccess().getRoomDescriptionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRinform.g:342:2: ( ruleItemDeclaration )
                    {
                    // InternalRinform.g:342:2: ( ruleItemDeclaration )
                    // InternalRinform.g:343:3: ruleItemDeclaration
                    {
                     before(grammarAccess.getSentencePartAccess().getItemDeclarationParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleItemDeclaration();

                    state._fsp--;

                     after(grammarAccess.getSentencePartAccess().getItemDeclarationParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRinform.g:348:2: ( ruleItemDescription )
                    {
                    // InternalRinform.g:348:2: ( ruleItemDescription )
                    // InternalRinform.g:349:3: ruleItemDescription
                    {
                     before(grammarAccess.getSentencePartAccess().getItemDescriptionParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleItemDescription();

                    state._fsp--;

                     after(grammarAccess.getSentencePartAccess().getItemDescriptionParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalRinform.g:354:2: ( ruleWords )
                    {
                    // InternalRinform.g:354:2: ( ruleWords )
                    // InternalRinform.g:355:3: ruleWords
                    {
                     before(grammarAccess.getSentencePartAccess().getWordsParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleWords();

                    state._fsp--;

                     after(grammarAccess.getSentencePartAccess().getWordsParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalRinform.g:360:2: ( ruleSymbol )
                    {
                    // InternalRinform.g:360:2: ( ruleSymbol )
                    // InternalRinform.g:361:3: ruleSymbol
                    {
                     before(grammarAccess.getSentencePartAccess().getSymbolParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleSymbol();

                    state._fsp--;

                     after(grammarAccess.getSentencePartAccess().getSymbolParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalRinform.g:366:2: ( ruleDirectionStatement )
                    {
                    // InternalRinform.g:366:2: ( ruleDirectionStatement )
                    // InternalRinform.g:367:3: ruleDirectionStatement
                    {
                     before(grammarAccess.getSentencePartAccess().getDirectionStatementParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleDirectionStatement();

                    state._fsp--;

                     after(grammarAccess.getSentencePartAccess().getDirectionStatementParserRuleCall_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SentencePart__Alternatives"


    // $ANTLR start "rule__Symbol__SymbolAlternatives_0"
    // InternalRinform.g:376:1: rule__Symbol__SymbolAlternatives_0 : ( ( '.' ) | ( ',' ) | ( ';' ) | ( ':' ) | ( '-' ) | ( '!' ) | ( '?' ) | ( '\\'' ) );
    public final void rule__Symbol__SymbolAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:380:1: ( ( '.' ) | ( ',' ) | ( ';' ) | ( ':' ) | ( '-' ) | ( '!' ) | ( '?' ) | ( '\\'' ) )
            int alt4=8;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt4=1;
                }
                break;
            case 12:
                {
                alt4=2;
                }
                break;
            case 13:
                {
                alt4=3;
                }
                break;
            case 14:
                {
                alt4=4;
                }
                break;
            case 15:
                {
                alt4=5;
                }
                break;
            case 16:
                {
                alt4=6;
                }
                break;
            case 17:
                {
                alt4=7;
                }
                break;
            case 18:
                {
                alt4=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalRinform.g:381:2: ( '.' )
                    {
                    // InternalRinform.g:381:2: ( '.' )
                    // InternalRinform.g:382:3: '.'
                    {
                     before(grammarAccess.getSymbolAccess().getSymbolFullStopKeyword_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getSymbolAccess().getSymbolFullStopKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRinform.g:387:2: ( ',' )
                    {
                    // InternalRinform.g:387:2: ( ',' )
                    // InternalRinform.g:388:3: ','
                    {
                     before(grammarAccess.getSymbolAccess().getSymbolCommaKeyword_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getSymbolAccess().getSymbolCommaKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRinform.g:393:2: ( ';' )
                    {
                    // InternalRinform.g:393:2: ( ';' )
                    // InternalRinform.g:394:3: ';'
                    {
                     before(grammarAccess.getSymbolAccess().getSymbolSemicolonKeyword_0_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getSymbolAccess().getSymbolSemicolonKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRinform.g:399:2: ( ':' )
                    {
                    // InternalRinform.g:399:2: ( ':' )
                    // InternalRinform.g:400:3: ':'
                    {
                     before(grammarAccess.getSymbolAccess().getSymbolColonKeyword_0_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getSymbolAccess().getSymbolColonKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalRinform.g:405:2: ( '-' )
                    {
                    // InternalRinform.g:405:2: ( '-' )
                    // InternalRinform.g:406:3: '-'
                    {
                     before(grammarAccess.getSymbolAccess().getSymbolHyphenMinusKeyword_0_4()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getSymbolAccess().getSymbolHyphenMinusKeyword_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalRinform.g:411:2: ( '!' )
                    {
                    // InternalRinform.g:411:2: ( '!' )
                    // InternalRinform.g:412:3: '!'
                    {
                     before(grammarAccess.getSymbolAccess().getSymbolExclamationMarkKeyword_0_5()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getSymbolAccess().getSymbolExclamationMarkKeyword_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalRinform.g:417:2: ( '?' )
                    {
                    // InternalRinform.g:417:2: ( '?' )
                    // InternalRinform.g:418:3: '?'
                    {
                     before(grammarAccess.getSymbolAccess().getSymbolQuestionMarkKeyword_0_6()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getSymbolAccess().getSymbolQuestionMarkKeyword_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalRinform.g:423:2: ( '\\'' )
                    {
                    // InternalRinform.g:423:2: ( '\\'' )
                    // InternalRinform.g:424:3: '\\''
                    {
                     before(grammarAccess.getSymbolAccess().getSymbolApostropheKeyword_0_7()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getSymbolAccess().getSymbolApostropheKeyword_0_7()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__SymbolAlternatives_0"


    // $ANTLR start "rule__Direction__Alternatives"
    // InternalRinform.g:433:1: rule__Direction__Alternatives : ( ( ( 'South' ) ) | ( ( 'North' ) ) | ( ( 'East' ) ) | ( ( 'West' ) ) | ( ( 'Below' ) ) | ( ( 'Above' ) ) );
    public final void rule__Direction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:437:1: ( ( ( 'South' ) ) | ( ( 'North' ) ) | ( ( 'East' ) ) | ( ( 'West' ) ) | ( ( 'Below' ) ) | ( ( 'Above' ) ) )
            int alt5=6;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt5=1;
                }
                break;
            case 20:
                {
                alt5=2;
                }
                break;
            case 21:
                {
                alt5=3;
                }
                break;
            case 22:
                {
                alt5=4;
                }
                break;
            case 23:
                {
                alt5=5;
                }
                break;
            case 24:
                {
                alt5=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalRinform.g:438:2: ( ( 'South' ) )
                    {
                    // InternalRinform.g:438:2: ( ( 'South' ) )
                    // InternalRinform.g:439:3: ( 'South' )
                    {
                     before(grammarAccess.getDirectionAccess().getSouthEnumLiteralDeclaration_0()); 
                    // InternalRinform.g:440:3: ( 'South' )
                    // InternalRinform.g:440:4: 'South'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectionAccess().getSouthEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRinform.g:444:2: ( ( 'North' ) )
                    {
                    // InternalRinform.g:444:2: ( ( 'North' ) )
                    // InternalRinform.g:445:3: ( 'North' )
                    {
                     before(grammarAccess.getDirectionAccess().getNorthEnumLiteralDeclaration_1()); 
                    // InternalRinform.g:446:3: ( 'North' )
                    // InternalRinform.g:446:4: 'North'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectionAccess().getNorthEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRinform.g:450:2: ( ( 'East' ) )
                    {
                    // InternalRinform.g:450:2: ( ( 'East' ) )
                    // InternalRinform.g:451:3: ( 'East' )
                    {
                     before(grammarAccess.getDirectionAccess().getEastEnumLiteralDeclaration_2()); 
                    // InternalRinform.g:452:3: ( 'East' )
                    // InternalRinform.g:452:4: 'East'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectionAccess().getEastEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRinform.g:456:2: ( ( 'West' ) )
                    {
                    // InternalRinform.g:456:2: ( ( 'West' ) )
                    // InternalRinform.g:457:3: ( 'West' )
                    {
                     before(grammarAccess.getDirectionAccess().getWestEnumLiteralDeclaration_3()); 
                    // InternalRinform.g:458:3: ( 'West' )
                    // InternalRinform.g:458:4: 'West'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectionAccess().getWestEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalRinform.g:462:2: ( ( 'Below' ) )
                    {
                    // InternalRinform.g:462:2: ( ( 'Below' ) )
                    // InternalRinform.g:463:3: ( 'Below' )
                    {
                     before(grammarAccess.getDirectionAccess().getBelowEnumLiteralDeclaration_4()); 
                    // InternalRinform.g:464:3: ( 'Below' )
                    // InternalRinform.g:464:4: 'Below'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectionAccess().getBelowEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalRinform.g:468:2: ( ( 'Above' ) )
                    {
                    // InternalRinform.g:468:2: ( ( 'Above' ) )
                    // InternalRinform.g:469:3: ( 'Above' )
                    {
                     before(grammarAccess.getDirectionAccess().getAboveEnumLiteralDeclaration_5()); 
                    // InternalRinform.g:470:3: ( 'Above' )
                    // InternalRinform.g:470:4: 'Above'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectionAccess().getAboveEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Direction__Alternatives"


    // $ANTLR start "rule__RoomDeclaration__Group__0"
    // InternalRinform.g:478:1: rule__RoomDeclaration__Group__0 : rule__RoomDeclaration__Group__0__Impl rule__RoomDeclaration__Group__1 ;
    public final void rule__RoomDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:482:1: ( rule__RoomDeclaration__Group__0__Impl rule__RoomDeclaration__Group__1 )
            // InternalRinform.g:483:2: rule__RoomDeclaration__Group__0__Impl rule__RoomDeclaration__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__RoomDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoomDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoomDeclaration__Group__0"


    // $ANTLR start "rule__RoomDeclaration__Group__0__Impl"
    // InternalRinform.g:490:1: rule__RoomDeclaration__Group__0__Impl : ( '[' ) ;
    public final void rule__RoomDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:494:1: ( ( '[' ) )
            // InternalRinform.g:495:1: ( '[' )
            {
            // InternalRinform.g:495:1: ( '[' )
            // InternalRinform.g:496:2: '['
            {
             before(grammarAccess.getRoomDeclarationAccess().getLeftSquareBracketKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getRoomDeclarationAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoomDeclaration__Group__0__Impl"


    // $ANTLR start "rule__RoomDeclaration__Group__1"
    // InternalRinform.g:505:1: rule__RoomDeclaration__Group__1 : rule__RoomDeclaration__Group__1__Impl rule__RoomDeclaration__Group__2 ;
    public final void rule__RoomDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:509:1: ( rule__RoomDeclaration__Group__1__Impl rule__RoomDeclaration__Group__2 )
            // InternalRinform.g:510:2: rule__RoomDeclaration__Group__1__Impl rule__RoomDeclaration__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__RoomDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoomDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoomDeclaration__Group__1"


    // $ANTLR start "rule__RoomDeclaration__Group__1__Impl"
    // InternalRinform.g:517:1: rule__RoomDeclaration__Group__1__Impl : ( ( rule__RoomDeclaration__NameAssignment_1 ) ) ;
    public final void rule__RoomDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:521:1: ( ( ( rule__RoomDeclaration__NameAssignment_1 ) ) )
            // InternalRinform.g:522:1: ( ( rule__RoomDeclaration__NameAssignment_1 ) )
            {
            // InternalRinform.g:522:1: ( ( rule__RoomDeclaration__NameAssignment_1 ) )
            // InternalRinform.g:523:2: ( rule__RoomDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getRoomDeclarationAccess().getNameAssignment_1()); 
            // InternalRinform.g:524:2: ( rule__RoomDeclaration__NameAssignment_1 )
            // InternalRinform.g:524:3: rule__RoomDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RoomDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRoomDeclarationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoomDeclaration__Group__1__Impl"


    // $ANTLR start "rule__RoomDeclaration__Group__2"
    // InternalRinform.g:532:1: rule__RoomDeclaration__Group__2 : rule__RoomDeclaration__Group__2__Impl ;
    public final void rule__RoomDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:536:1: ( rule__RoomDeclaration__Group__2__Impl )
            // InternalRinform.g:537:2: rule__RoomDeclaration__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RoomDeclaration__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoomDeclaration__Group__2"


    // $ANTLR start "rule__RoomDeclaration__Group__2__Impl"
    // InternalRinform.g:543:1: rule__RoomDeclaration__Group__2__Impl : ( ']' ) ;
    public final void rule__RoomDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:547:1: ( ( ']' ) )
            // InternalRinform.g:548:1: ( ']' )
            {
            // InternalRinform.g:548:1: ( ']' )
            // InternalRinform.g:549:2: ']'
            {
             before(grammarAccess.getRoomDeclarationAccess().getRightSquareBracketKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getRoomDeclarationAccess().getRightSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoomDeclaration__Group__2__Impl"


    // $ANTLR start "rule__RoomDescription__Group__0"
    // InternalRinform.g:559:1: rule__RoomDescription__Group__0 : rule__RoomDescription__Group__0__Impl rule__RoomDescription__Group__1 ;
    public final void rule__RoomDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:563:1: ( rule__RoomDescription__Group__0__Impl rule__RoomDescription__Group__1 )
            // InternalRinform.g:564:2: rule__RoomDescription__Group__0__Impl rule__RoomDescription__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__RoomDescription__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoomDescription__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoomDescription__Group__0"


    // $ANTLR start "rule__RoomDescription__Group__0__Impl"
    // InternalRinform.g:571:1: rule__RoomDescription__Group__0__Impl : ( '(' ) ;
    public final void rule__RoomDescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:575:1: ( ( '(' ) )
            // InternalRinform.g:576:1: ( '(' )
            {
            // InternalRinform.g:576:1: ( '(' )
            // InternalRinform.g:577:2: '('
            {
             before(grammarAccess.getRoomDescriptionAccess().getLeftParenthesisKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getRoomDescriptionAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoomDescription__Group__0__Impl"


    // $ANTLR start "rule__RoomDescription__Group__1"
    // InternalRinform.g:586:1: rule__RoomDescription__Group__1 : rule__RoomDescription__Group__1__Impl rule__RoomDescription__Group__2 ;
    public final void rule__RoomDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:590:1: ( rule__RoomDescription__Group__1__Impl rule__RoomDescription__Group__2 )
            // InternalRinform.g:591:2: rule__RoomDescription__Group__1__Impl rule__RoomDescription__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__RoomDescription__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoomDescription__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoomDescription__Group__1"


    // $ANTLR start "rule__RoomDescription__Group__1__Impl"
    // InternalRinform.g:598:1: rule__RoomDescription__Group__1__Impl : ( '[' ) ;
    public final void rule__RoomDescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:602:1: ( ( '[' ) )
            // InternalRinform.g:603:1: ( '[' )
            {
            // InternalRinform.g:603:1: ( '[' )
            // InternalRinform.g:604:2: '['
            {
             before(grammarAccess.getRoomDescriptionAccess().getLeftSquareBracketKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getRoomDescriptionAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoomDescription__Group__1__Impl"


    // $ANTLR start "rule__RoomDescription__Group__2"
    // InternalRinform.g:613:1: rule__RoomDescription__Group__2 : rule__RoomDescription__Group__2__Impl rule__RoomDescription__Group__3 ;
    public final void rule__RoomDescription__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:617:1: ( rule__RoomDescription__Group__2__Impl rule__RoomDescription__Group__3 )
            // InternalRinform.g:618:2: rule__RoomDescription__Group__2__Impl rule__RoomDescription__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__RoomDescription__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoomDescription__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoomDescription__Group__2"


    // $ANTLR start "rule__RoomDescription__Group__2__Impl"
    // InternalRinform.g:625:1: rule__RoomDescription__Group__2__Impl : ( ( rule__RoomDescription__RoomAssignment_2 ) ) ;
    public final void rule__RoomDescription__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:629:1: ( ( ( rule__RoomDescription__RoomAssignment_2 ) ) )
            // InternalRinform.g:630:1: ( ( rule__RoomDescription__RoomAssignment_2 ) )
            {
            // InternalRinform.g:630:1: ( ( rule__RoomDescription__RoomAssignment_2 ) )
            // InternalRinform.g:631:2: ( rule__RoomDescription__RoomAssignment_2 )
            {
             before(grammarAccess.getRoomDescriptionAccess().getRoomAssignment_2()); 
            // InternalRinform.g:632:2: ( rule__RoomDescription__RoomAssignment_2 )
            // InternalRinform.g:632:3: rule__RoomDescription__RoomAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RoomDescription__RoomAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRoomDescriptionAccess().getRoomAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoomDescription__Group__2__Impl"


    // $ANTLR start "rule__RoomDescription__Group__3"
    // InternalRinform.g:640:1: rule__RoomDescription__Group__3 : rule__RoomDescription__Group__3__Impl rule__RoomDescription__Group__4 ;
    public final void rule__RoomDescription__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:644:1: ( rule__RoomDescription__Group__3__Impl rule__RoomDescription__Group__4 )
            // InternalRinform.g:645:2: rule__RoomDescription__Group__3__Impl rule__RoomDescription__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__RoomDescription__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoomDescription__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoomDescription__Group__3"


    // $ANTLR start "rule__RoomDescription__Group__3__Impl"
    // InternalRinform.g:652:1: rule__RoomDescription__Group__3__Impl : ( ']' ) ;
    public final void rule__RoomDescription__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:656:1: ( ( ']' ) )
            // InternalRinform.g:657:1: ( ']' )
            {
            // InternalRinform.g:657:1: ( ']' )
            // InternalRinform.g:658:2: ']'
            {
             before(grammarAccess.getRoomDescriptionAccess().getRightSquareBracketKeyword_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getRoomDescriptionAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoomDescription__Group__3__Impl"


    // $ANTLR start "rule__RoomDescription__Group__4"
    // InternalRinform.g:667:1: rule__RoomDescription__Group__4 : rule__RoomDescription__Group__4__Impl rule__RoomDescription__Group__5 ;
    public final void rule__RoomDescription__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:671:1: ( rule__RoomDescription__Group__4__Impl rule__RoomDescription__Group__5 )
            // InternalRinform.g:672:2: rule__RoomDescription__Group__4__Impl rule__RoomDescription__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__RoomDescription__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoomDescription__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoomDescription__Group__4"


    // $ANTLR start "rule__RoomDescription__Group__4__Impl"
    // InternalRinform.g:679:1: rule__RoomDescription__Group__4__Impl : ( ( ( rule__RoomDescription__DescriptionAssignment_4 ) ) ( ( rule__RoomDescription__DescriptionAssignment_4 )* ) ) ;
    public final void rule__RoomDescription__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:683:1: ( ( ( ( rule__RoomDescription__DescriptionAssignment_4 ) ) ( ( rule__RoomDescription__DescriptionAssignment_4 )* ) ) )
            // InternalRinform.g:684:1: ( ( ( rule__RoomDescription__DescriptionAssignment_4 ) ) ( ( rule__RoomDescription__DescriptionAssignment_4 )* ) )
            {
            // InternalRinform.g:684:1: ( ( ( rule__RoomDescription__DescriptionAssignment_4 ) ) ( ( rule__RoomDescription__DescriptionAssignment_4 )* ) )
            // InternalRinform.g:685:2: ( ( rule__RoomDescription__DescriptionAssignment_4 ) ) ( ( rule__RoomDescription__DescriptionAssignment_4 )* )
            {
            // InternalRinform.g:685:2: ( ( rule__RoomDescription__DescriptionAssignment_4 ) )
            // InternalRinform.g:686:3: ( rule__RoomDescription__DescriptionAssignment_4 )
            {
             before(grammarAccess.getRoomDescriptionAccess().getDescriptionAssignment_4()); 
            // InternalRinform.g:687:3: ( rule__RoomDescription__DescriptionAssignment_4 )
            // InternalRinform.g:687:4: rule__RoomDescription__DescriptionAssignment_4
            {
            pushFollow(FOLLOW_4);
            rule__RoomDescription__DescriptionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRoomDescriptionAccess().getDescriptionAssignment_4()); 

            }

            // InternalRinform.g:690:2: ( ( rule__RoomDescription__DescriptionAssignment_4 )* )
            // InternalRinform.g:691:3: ( rule__RoomDescription__DescriptionAssignment_4 )*
            {
             before(grammarAccess.getRoomDescriptionAccess().getDescriptionAssignment_4()); 
            // InternalRinform.g:692:3: ( rule__RoomDescription__DescriptionAssignment_4 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalRinform.g:692:4: rule__RoomDescription__DescriptionAssignment_4
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__RoomDescription__DescriptionAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getRoomDescriptionAccess().getDescriptionAssignment_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoomDescription__Group__4__Impl"


    // $ANTLR start "rule__RoomDescription__Group__5"
    // InternalRinform.g:701:1: rule__RoomDescription__Group__5 : rule__RoomDescription__Group__5__Impl ;
    public final void rule__RoomDescription__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:705:1: ( rule__RoomDescription__Group__5__Impl )
            // InternalRinform.g:706:2: rule__RoomDescription__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RoomDescription__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoomDescription__Group__5"


    // $ANTLR start "rule__RoomDescription__Group__5__Impl"
    // InternalRinform.g:712:1: rule__RoomDescription__Group__5__Impl : ( ')' ) ;
    public final void rule__RoomDescription__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:716:1: ( ( ')' ) )
            // InternalRinform.g:717:1: ( ')' )
            {
            // InternalRinform.g:717:1: ( ')' )
            // InternalRinform.g:718:2: ')'
            {
             before(grammarAccess.getRoomDescriptionAccess().getRightParenthesisKeyword_5()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getRoomDescriptionAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoomDescription__Group__5__Impl"


    // $ANTLR start "rule__ItemDeclaration__Group__0"
    // InternalRinform.g:728:1: rule__ItemDeclaration__Group__0 : rule__ItemDeclaration__Group__0__Impl rule__ItemDeclaration__Group__1 ;
    public final void rule__ItemDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:732:1: ( rule__ItemDeclaration__Group__0__Impl rule__ItemDeclaration__Group__1 )
            // InternalRinform.g:733:2: rule__ItemDeclaration__Group__0__Impl rule__ItemDeclaration__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__ItemDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ItemDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemDeclaration__Group__0"


    // $ANTLR start "rule__ItemDeclaration__Group__0__Impl"
    // InternalRinform.g:740:1: rule__ItemDeclaration__Group__0__Impl : ( '{' ) ;
    public final void rule__ItemDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:744:1: ( ( '{' ) )
            // InternalRinform.g:745:1: ( '{' )
            {
            // InternalRinform.g:745:1: ( '{' )
            // InternalRinform.g:746:2: '{'
            {
             before(grammarAccess.getItemDeclarationAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getItemDeclarationAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemDeclaration__Group__0__Impl"


    // $ANTLR start "rule__ItemDeclaration__Group__1"
    // InternalRinform.g:755:1: rule__ItemDeclaration__Group__1 : rule__ItemDeclaration__Group__1__Impl rule__ItemDeclaration__Group__2 ;
    public final void rule__ItemDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:759:1: ( rule__ItemDeclaration__Group__1__Impl rule__ItemDeclaration__Group__2 )
            // InternalRinform.g:760:2: rule__ItemDeclaration__Group__1__Impl rule__ItemDeclaration__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__ItemDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ItemDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemDeclaration__Group__1"


    // $ANTLR start "rule__ItemDeclaration__Group__1__Impl"
    // InternalRinform.g:767:1: rule__ItemDeclaration__Group__1__Impl : ( '[' ) ;
    public final void rule__ItemDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:771:1: ( ( '[' ) )
            // InternalRinform.g:772:1: ( '[' )
            {
            // InternalRinform.g:772:1: ( '[' )
            // InternalRinform.g:773:2: '['
            {
             before(grammarAccess.getItemDeclarationAccess().getLeftSquareBracketKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getItemDeclarationAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemDeclaration__Group__1__Impl"


    // $ANTLR start "rule__ItemDeclaration__Group__2"
    // InternalRinform.g:782:1: rule__ItemDeclaration__Group__2 : rule__ItemDeclaration__Group__2__Impl rule__ItemDeclaration__Group__3 ;
    public final void rule__ItemDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:786:1: ( rule__ItemDeclaration__Group__2__Impl rule__ItemDeclaration__Group__3 )
            // InternalRinform.g:787:2: rule__ItemDeclaration__Group__2__Impl rule__ItemDeclaration__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__ItemDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ItemDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemDeclaration__Group__2"


    // $ANTLR start "rule__ItemDeclaration__Group__2__Impl"
    // InternalRinform.g:794:1: rule__ItemDeclaration__Group__2__Impl : ( ( rule__ItemDeclaration__RoomAssignment_2 ) ) ;
    public final void rule__ItemDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:798:1: ( ( ( rule__ItemDeclaration__RoomAssignment_2 ) ) )
            // InternalRinform.g:799:1: ( ( rule__ItemDeclaration__RoomAssignment_2 ) )
            {
            // InternalRinform.g:799:1: ( ( rule__ItemDeclaration__RoomAssignment_2 ) )
            // InternalRinform.g:800:2: ( rule__ItemDeclaration__RoomAssignment_2 )
            {
             before(grammarAccess.getItemDeclarationAccess().getRoomAssignment_2()); 
            // InternalRinform.g:801:2: ( rule__ItemDeclaration__RoomAssignment_2 )
            // InternalRinform.g:801:3: rule__ItemDeclaration__RoomAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ItemDeclaration__RoomAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getItemDeclarationAccess().getRoomAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemDeclaration__Group__2__Impl"


    // $ANTLR start "rule__ItemDeclaration__Group__3"
    // InternalRinform.g:809:1: rule__ItemDeclaration__Group__3 : rule__ItemDeclaration__Group__3__Impl rule__ItemDeclaration__Group__4 ;
    public final void rule__ItemDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:813:1: ( rule__ItemDeclaration__Group__3__Impl rule__ItemDeclaration__Group__4 )
            // InternalRinform.g:814:2: rule__ItemDeclaration__Group__3__Impl rule__ItemDeclaration__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__ItemDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ItemDeclaration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemDeclaration__Group__3"


    // $ANTLR start "rule__ItemDeclaration__Group__3__Impl"
    // InternalRinform.g:821:1: rule__ItemDeclaration__Group__3__Impl : ( ']' ) ;
    public final void rule__ItemDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:825:1: ( ( ']' ) )
            // InternalRinform.g:826:1: ( ']' )
            {
            // InternalRinform.g:826:1: ( ']' )
            // InternalRinform.g:827:2: ']'
            {
             before(grammarAccess.getItemDeclarationAccess().getRightSquareBracketKeyword_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getItemDeclarationAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemDeclaration__Group__3__Impl"


    // $ANTLR start "rule__ItemDeclaration__Group__4"
    // InternalRinform.g:836:1: rule__ItemDeclaration__Group__4 : rule__ItemDeclaration__Group__4__Impl rule__ItemDeclaration__Group__5 ;
    public final void rule__ItemDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:840:1: ( rule__ItemDeclaration__Group__4__Impl rule__ItemDeclaration__Group__5 )
            // InternalRinform.g:841:2: rule__ItemDeclaration__Group__4__Impl rule__ItemDeclaration__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__ItemDeclaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ItemDeclaration__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemDeclaration__Group__4"


    // $ANTLR start "rule__ItemDeclaration__Group__4__Impl"
    // InternalRinform.g:848:1: rule__ItemDeclaration__Group__4__Impl : ( ( rule__ItemDeclaration__NameAssignment_4 ) ) ;
    public final void rule__ItemDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:852:1: ( ( ( rule__ItemDeclaration__NameAssignment_4 ) ) )
            // InternalRinform.g:853:1: ( ( rule__ItemDeclaration__NameAssignment_4 ) )
            {
            // InternalRinform.g:853:1: ( ( rule__ItemDeclaration__NameAssignment_4 ) )
            // InternalRinform.g:854:2: ( rule__ItemDeclaration__NameAssignment_4 )
            {
             before(grammarAccess.getItemDeclarationAccess().getNameAssignment_4()); 
            // InternalRinform.g:855:2: ( rule__ItemDeclaration__NameAssignment_4 )
            // InternalRinform.g:855:3: rule__ItemDeclaration__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ItemDeclaration__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getItemDeclarationAccess().getNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemDeclaration__Group__4__Impl"


    // $ANTLR start "rule__ItemDeclaration__Group__5"
    // InternalRinform.g:863:1: rule__ItemDeclaration__Group__5 : rule__ItemDeclaration__Group__5__Impl ;
    public final void rule__ItemDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:867:1: ( rule__ItemDeclaration__Group__5__Impl )
            // InternalRinform.g:868:2: rule__ItemDeclaration__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ItemDeclaration__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemDeclaration__Group__5"


    // $ANTLR start "rule__ItemDeclaration__Group__5__Impl"
    // InternalRinform.g:874:1: rule__ItemDeclaration__Group__5__Impl : ( '}' ) ;
    public final void rule__ItemDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:878:1: ( ( '}' ) )
            // InternalRinform.g:879:1: ( '}' )
            {
            // InternalRinform.g:879:1: ( '}' )
            // InternalRinform.g:880:2: '}'
            {
             before(grammarAccess.getItemDeclarationAccess().getRightCurlyBracketKeyword_5()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getItemDeclarationAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemDeclaration__Group__5__Impl"


    // $ANTLR start "rule__ItemDescription__Group__0"
    // InternalRinform.g:890:1: rule__ItemDescription__Group__0 : rule__ItemDescription__Group__0__Impl rule__ItemDescription__Group__1 ;
    public final void rule__ItemDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:894:1: ( rule__ItemDescription__Group__0__Impl rule__ItemDescription__Group__1 )
            // InternalRinform.g:895:2: rule__ItemDescription__Group__0__Impl rule__ItemDescription__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__ItemDescription__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ItemDescription__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemDescription__Group__0"


    // $ANTLR start "rule__ItemDescription__Group__0__Impl"
    // InternalRinform.g:902:1: rule__ItemDescription__Group__0__Impl : ( '({' ) ;
    public final void rule__ItemDescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:906:1: ( ( '({' ) )
            // InternalRinform.g:907:1: ( '({' )
            {
            // InternalRinform.g:907:1: ( '({' )
            // InternalRinform.g:908:2: '({'
            {
             before(grammarAccess.getItemDescriptionAccess().getLeftParenthesisLeftCurlyBracketKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getItemDescriptionAccess().getLeftParenthesisLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemDescription__Group__0__Impl"


    // $ANTLR start "rule__ItemDescription__Group__1"
    // InternalRinform.g:917:1: rule__ItemDescription__Group__1 : rule__ItemDescription__Group__1__Impl rule__ItemDescription__Group__2 ;
    public final void rule__ItemDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:921:1: ( rule__ItemDescription__Group__1__Impl rule__ItemDescription__Group__2 )
            // InternalRinform.g:922:2: rule__ItemDescription__Group__1__Impl rule__ItemDescription__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__ItemDescription__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ItemDescription__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemDescription__Group__1"


    // $ANTLR start "rule__ItemDescription__Group__1__Impl"
    // InternalRinform.g:929:1: rule__ItemDescription__Group__1__Impl : ( ( rule__ItemDescription__ItemAssignment_1 ) ) ;
    public final void rule__ItemDescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:933:1: ( ( ( rule__ItemDescription__ItemAssignment_1 ) ) )
            // InternalRinform.g:934:1: ( ( rule__ItemDescription__ItemAssignment_1 ) )
            {
            // InternalRinform.g:934:1: ( ( rule__ItemDescription__ItemAssignment_1 ) )
            // InternalRinform.g:935:2: ( rule__ItemDescription__ItemAssignment_1 )
            {
             before(grammarAccess.getItemDescriptionAccess().getItemAssignment_1()); 
            // InternalRinform.g:936:2: ( rule__ItemDescription__ItemAssignment_1 )
            // InternalRinform.g:936:3: rule__ItemDescription__ItemAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ItemDescription__ItemAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getItemDescriptionAccess().getItemAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemDescription__Group__1__Impl"


    // $ANTLR start "rule__ItemDescription__Group__2"
    // InternalRinform.g:944:1: rule__ItemDescription__Group__2 : rule__ItemDescription__Group__2__Impl rule__ItemDescription__Group__3 ;
    public final void rule__ItemDescription__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:948:1: ( rule__ItemDescription__Group__2__Impl rule__ItemDescription__Group__3 )
            // InternalRinform.g:949:2: rule__ItemDescription__Group__2__Impl rule__ItemDescription__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__ItemDescription__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ItemDescription__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemDescription__Group__2"


    // $ANTLR start "rule__ItemDescription__Group__2__Impl"
    // InternalRinform.g:956:1: rule__ItemDescription__Group__2__Impl : ( '}' ) ;
    public final void rule__ItemDescription__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:960:1: ( ( '}' ) )
            // InternalRinform.g:961:1: ( '}' )
            {
            // InternalRinform.g:961:1: ( '}' )
            // InternalRinform.g:962:2: '}'
            {
             before(grammarAccess.getItemDescriptionAccess().getRightCurlyBracketKeyword_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getItemDescriptionAccess().getRightCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemDescription__Group__2__Impl"


    // $ANTLR start "rule__ItemDescription__Group__3"
    // InternalRinform.g:971:1: rule__ItemDescription__Group__3 : rule__ItemDescription__Group__3__Impl rule__ItemDescription__Group__4 ;
    public final void rule__ItemDescription__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:975:1: ( rule__ItemDescription__Group__3__Impl rule__ItemDescription__Group__4 )
            // InternalRinform.g:976:2: rule__ItemDescription__Group__3__Impl rule__ItemDescription__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__ItemDescription__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ItemDescription__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemDescription__Group__3"


    // $ANTLR start "rule__ItemDescription__Group__3__Impl"
    // InternalRinform.g:983:1: rule__ItemDescription__Group__3__Impl : ( ( ( rule__ItemDescription__DescriptionAssignment_3 ) ) ( ( rule__ItemDescription__DescriptionAssignment_3 )* ) ) ;
    public final void rule__ItemDescription__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:987:1: ( ( ( ( rule__ItemDescription__DescriptionAssignment_3 ) ) ( ( rule__ItemDescription__DescriptionAssignment_3 )* ) ) )
            // InternalRinform.g:988:1: ( ( ( rule__ItemDescription__DescriptionAssignment_3 ) ) ( ( rule__ItemDescription__DescriptionAssignment_3 )* ) )
            {
            // InternalRinform.g:988:1: ( ( ( rule__ItemDescription__DescriptionAssignment_3 ) ) ( ( rule__ItemDescription__DescriptionAssignment_3 )* ) )
            // InternalRinform.g:989:2: ( ( rule__ItemDescription__DescriptionAssignment_3 ) ) ( ( rule__ItemDescription__DescriptionAssignment_3 )* )
            {
            // InternalRinform.g:989:2: ( ( rule__ItemDescription__DescriptionAssignment_3 ) )
            // InternalRinform.g:990:3: ( rule__ItemDescription__DescriptionAssignment_3 )
            {
             before(grammarAccess.getItemDescriptionAccess().getDescriptionAssignment_3()); 
            // InternalRinform.g:991:3: ( rule__ItemDescription__DescriptionAssignment_3 )
            // InternalRinform.g:991:4: rule__ItemDescription__DescriptionAssignment_3
            {
            pushFollow(FOLLOW_4);
            rule__ItemDescription__DescriptionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getItemDescriptionAccess().getDescriptionAssignment_3()); 

            }

            // InternalRinform.g:994:2: ( ( rule__ItemDescription__DescriptionAssignment_3 )* )
            // InternalRinform.g:995:3: ( rule__ItemDescription__DescriptionAssignment_3 )*
            {
             before(grammarAccess.getItemDescriptionAccess().getDescriptionAssignment_3()); 
            // InternalRinform.g:996:3: ( rule__ItemDescription__DescriptionAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalRinform.g:996:4: rule__ItemDescription__DescriptionAssignment_3
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__ItemDescription__DescriptionAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getItemDescriptionAccess().getDescriptionAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemDescription__Group__3__Impl"


    // $ANTLR start "rule__ItemDescription__Group__4"
    // InternalRinform.g:1005:1: rule__ItemDescription__Group__4 : rule__ItemDescription__Group__4__Impl ;
    public final void rule__ItemDescription__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1009:1: ( rule__ItemDescription__Group__4__Impl )
            // InternalRinform.g:1010:2: rule__ItemDescription__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ItemDescription__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemDescription__Group__4"


    // $ANTLR start "rule__ItemDescription__Group__4__Impl"
    // InternalRinform.g:1016:1: rule__ItemDescription__Group__4__Impl : ( ')' ) ;
    public final void rule__ItemDescription__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1020:1: ( ( ')' ) )
            // InternalRinform.g:1021:1: ( ')' )
            {
            // InternalRinform.g:1021:1: ( ')' )
            // InternalRinform.g:1022:2: ')'
            {
             before(grammarAccess.getItemDescriptionAccess().getRightParenthesisKeyword_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getItemDescriptionAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemDescription__Group__4__Impl"


    // $ANTLR start "rule__DirectionStatement__Group__0"
    // InternalRinform.g:1032:1: rule__DirectionStatement__Group__0 : rule__DirectionStatement__Group__0__Impl rule__DirectionStatement__Group__1 ;
    public final void rule__DirectionStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1036:1: ( rule__DirectionStatement__Group__0__Impl rule__DirectionStatement__Group__1 )
            // InternalRinform.g:1037:2: rule__DirectionStatement__Group__0__Impl rule__DirectionStatement__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__DirectionStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DirectionStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectionStatement__Group__0"


    // $ANTLR start "rule__DirectionStatement__Group__0__Impl"
    // InternalRinform.g:1044:1: rule__DirectionStatement__Group__0__Impl : ( '<' ) ;
    public final void rule__DirectionStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1048:1: ( ( '<' ) )
            // InternalRinform.g:1049:1: ( '<' )
            {
            // InternalRinform.g:1049:1: ( '<' )
            // InternalRinform.g:1050:2: '<'
            {
             before(grammarAccess.getDirectionStatementAccess().getLessThanSignKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getDirectionStatementAccess().getLessThanSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectionStatement__Group__0__Impl"


    // $ANTLR start "rule__DirectionStatement__Group__1"
    // InternalRinform.g:1059:1: rule__DirectionStatement__Group__1 : rule__DirectionStatement__Group__1__Impl rule__DirectionStatement__Group__2 ;
    public final void rule__DirectionStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1063:1: ( rule__DirectionStatement__Group__1__Impl rule__DirectionStatement__Group__2 )
            // InternalRinform.g:1064:2: rule__DirectionStatement__Group__1__Impl rule__DirectionStatement__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__DirectionStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DirectionStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectionStatement__Group__1"


    // $ANTLR start "rule__DirectionStatement__Group__1__Impl"
    // InternalRinform.g:1071:1: rule__DirectionStatement__Group__1__Impl : ( ( rule__DirectionStatement__Room1Assignment_1 ) ) ;
    public final void rule__DirectionStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1075:1: ( ( ( rule__DirectionStatement__Room1Assignment_1 ) ) )
            // InternalRinform.g:1076:1: ( ( rule__DirectionStatement__Room1Assignment_1 ) )
            {
            // InternalRinform.g:1076:1: ( ( rule__DirectionStatement__Room1Assignment_1 ) )
            // InternalRinform.g:1077:2: ( rule__DirectionStatement__Room1Assignment_1 )
            {
             before(grammarAccess.getDirectionStatementAccess().getRoom1Assignment_1()); 
            // InternalRinform.g:1078:2: ( rule__DirectionStatement__Room1Assignment_1 )
            // InternalRinform.g:1078:3: rule__DirectionStatement__Room1Assignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DirectionStatement__Room1Assignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDirectionStatementAccess().getRoom1Assignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectionStatement__Group__1__Impl"


    // $ANTLR start "rule__DirectionStatement__Group__2"
    // InternalRinform.g:1086:1: rule__DirectionStatement__Group__2 : rule__DirectionStatement__Group__2__Impl rule__DirectionStatement__Group__3 ;
    public final void rule__DirectionStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1090:1: ( rule__DirectionStatement__Group__2__Impl rule__DirectionStatement__Group__3 )
            // InternalRinform.g:1091:2: rule__DirectionStatement__Group__2__Impl rule__DirectionStatement__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__DirectionStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DirectionStatement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectionStatement__Group__2"


    // $ANTLR start "rule__DirectionStatement__Group__2__Impl"
    // InternalRinform.g:1098:1: rule__DirectionStatement__Group__2__Impl : ( ( rule__DirectionStatement__DirectionAssignment_2 ) ) ;
    public final void rule__DirectionStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1102:1: ( ( ( rule__DirectionStatement__DirectionAssignment_2 ) ) )
            // InternalRinform.g:1103:1: ( ( rule__DirectionStatement__DirectionAssignment_2 ) )
            {
            // InternalRinform.g:1103:1: ( ( rule__DirectionStatement__DirectionAssignment_2 ) )
            // InternalRinform.g:1104:2: ( rule__DirectionStatement__DirectionAssignment_2 )
            {
             before(grammarAccess.getDirectionStatementAccess().getDirectionAssignment_2()); 
            // InternalRinform.g:1105:2: ( rule__DirectionStatement__DirectionAssignment_2 )
            // InternalRinform.g:1105:3: rule__DirectionStatement__DirectionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DirectionStatement__DirectionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDirectionStatementAccess().getDirectionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectionStatement__Group__2__Impl"


    // $ANTLR start "rule__DirectionStatement__Group__3"
    // InternalRinform.g:1113:1: rule__DirectionStatement__Group__3 : rule__DirectionStatement__Group__3__Impl rule__DirectionStatement__Group__4 ;
    public final void rule__DirectionStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1117:1: ( rule__DirectionStatement__Group__3__Impl rule__DirectionStatement__Group__4 )
            // InternalRinform.g:1118:2: rule__DirectionStatement__Group__3__Impl rule__DirectionStatement__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__DirectionStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DirectionStatement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectionStatement__Group__3"


    // $ANTLR start "rule__DirectionStatement__Group__3__Impl"
    // InternalRinform.g:1125:1: rule__DirectionStatement__Group__3__Impl : ( ( rule__DirectionStatement__Room2Assignment_3 ) ) ;
    public final void rule__DirectionStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1129:1: ( ( ( rule__DirectionStatement__Room2Assignment_3 ) ) )
            // InternalRinform.g:1130:1: ( ( rule__DirectionStatement__Room2Assignment_3 ) )
            {
            // InternalRinform.g:1130:1: ( ( rule__DirectionStatement__Room2Assignment_3 ) )
            // InternalRinform.g:1131:2: ( rule__DirectionStatement__Room2Assignment_3 )
            {
             before(grammarAccess.getDirectionStatementAccess().getRoom2Assignment_3()); 
            // InternalRinform.g:1132:2: ( rule__DirectionStatement__Room2Assignment_3 )
            // InternalRinform.g:1132:3: rule__DirectionStatement__Room2Assignment_3
            {
            pushFollow(FOLLOW_2);
            rule__DirectionStatement__Room2Assignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDirectionStatementAccess().getRoom2Assignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectionStatement__Group__3__Impl"


    // $ANTLR start "rule__DirectionStatement__Group__4"
    // InternalRinform.g:1140:1: rule__DirectionStatement__Group__4 : rule__DirectionStatement__Group__4__Impl ;
    public final void rule__DirectionStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1144:1: ( rule__DirectionStatement__Group__4__Impl )
            // InternalRinform.g:1145:2: rule__DirectionStatement__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DirectionStatement__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectionStatement__Group__4"


    // $ANTLR start "rule__DirectionStatement__Group__4__Impl"
    // InternalRinform.g:1151:1: rule__DirectionStatement__Group__4__Impl : ( '>' ) ;
    public final void rule__DirectionStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1155:1: ( ( '>' ) )
            // InternalRinform.g:1156:1: ( '>' )
            {
            // InternalRinform.g:1156:1: ( '>' )
            // InternalRinform.g:1157:2: '>'
            {
             before(grammarAccess.getDirectionStatementAccess().getGreaterThanSignKeyword_4()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getDirectionStatementAccess().getGreaterThanSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectionStatement__Group__4__Impl"


    // $ANTLR start "rule__Text__Group__0"
    // InternalRinform.g:1167:1: rule__Text__Group__0 : rule__Text__Group__0__Impl rule__Text__Group__1 ;
    public final void rule__Text__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1171:1: ( rule__Text__Group__0__Impl rule__Text__Group__1 )
            // InternalRinform.g:1172:2: rule__Text__Group__0__Impl rule__Text__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Text__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__0"


    // $ANTLR start "rule__Text__Group__0__Impl"
    // InternalRinform.g:1179:1: rule__Text__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__Text__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1183:1: ( ( RULE_ID ) )
            // InternalRinform.g:1184:1: ( RULE_ID )
            {
            // InternalRinform.g:1184:1: ( RULE_ID )
            // InternalRinform.g:1185:2: RULE_ID
            {
             before(grammarAccess.getTextAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__0__Impl"


    // $ANTLR start "rule__Text__Group__1"
    // InternalRinform.g:1194:1: rule__Text__Group__1 : rule__Text__Group__1__Impl ;
    public final void rule__Text__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1198:1: ( rule__Text__Group__1__Impl )
            // InternalRinform.g:1199:2: rule__Text__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Text__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__1"


    // $ANTLR start "rule__Text__Group__1__Impl"
    // InternalRinform.g:1205:1: rule__Text__Group__1__Impl : ( ( rule__Text__Group_1__0 )* ) ;
    public final void rule__Text__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1209:1: ( ( ( rule__Text__Group_1__0 )* ) )
            // InternalRinform.g:1210:1: ( ( rule__Text__Group_1__0 )* )
            {
            // InternalRinform.g:1210:1: ( ( rule__Text__Group_1__0 )* )
            // InternalRinform.g:1211:2: ( rule__Text__Group_1__0 )*
            {
             before(grammarAccess.getTextAccess().getGroup_1()); 
            // InternalRinform.g:1212:2: ( rule__Text__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_WS) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalRinform.g:1212:3: rule__Text__Group_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Text__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getTextAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__1__Impl"


    // $ANTLR start "rule__Text__Group_1__0"
    // InternalRinform.g:1221:1: rule__Text__Group_1__0 : rule__Text__Group_1__0__Impl rule__Text__Group_1__1 ;
    public final void rule__Text__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1225:1: ( rule__Text__Group_1__0__Impl rule__Text__Group_1__1 )
            // InternalRinform.g:1226:2: rule__Text__Group_1__0__Impl rule__Text__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Text__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group_1__0"


    // $ANTLR start "rule__Text__Group_1__0__Impl"
    // InternalRinform.g:1233:1: rule__Text__Group_1__0__Impl : ( RULE_WS ) ;
    public final void rule__Text__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1237:1: ( ( RULE_WS ) )
            // InternalRinform.g:1238:1: ( RULE_WS )
            {
            // InternalRinform.g:1238:1: ( RULE_WS )
            // InternalRinform.g:1239:2: RULE_WS
            {
             before(grammarAccess.getTextAccess().getWSTerminalRuleCall_1_0()); 
            match(input,RULE_WS,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getWSTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group_1__0__Impl"


    // $ANTLR start "rule__Text__Group_1__1"
    // InternalRinform.g:1248:1: rule__Text__Group_1__1 : rule__Text__Group_1__1__Impl ;
    public final void rule__Text__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1252:1: ( rule__Text__Group_1__1__Impl )
            // InternalRinform.g:1253:2: rule__Text__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Text__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group_1__1"


    // $ANTLR start "rule__Text__Group_1__1__Impl"
    // InternalRinform.g:1259:1: rule__Text__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__Text__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1263:1: ( ( RULE_ID ) )
            // InternalRinform.g:1264:1: ( RULE_ID )
            {
            // InternalRinform.g:1264:1: ( RULE_ID )
            // InternalRinform.g:1265:2: RULE_ID
            {
             before(grammarAccess.getTextAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group_1__1__Impl"


    // $ANTLR start "rule__ReverseInformProgram__SentencesAssignment"
    // InternalRinform.g:1275:1: rule__ReverseInformProgram__SentencesAssignment : ( ruleSentencePart ) ;
    public final void rule__ReverseInformProgram__SentencesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1279:1: ( ( ruleSentencePart ) )
            // InternalRinform.g:1280:2: ( ruleSentencePart )
            {
            // InternalRinform.g:1280:2: ( ruleSentencePart )
            // InternalRinform.g:1281:3: ruleSentencePart
            {
             before(grammarAccess.getReverseInformProgramAccess().getSentencesSentencePartParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleSentencePart();

            state._fsp--;

             after(grammarAccess.getReverseInformProgramAccess().getSentencesSentencePartParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReverseInformProgram__SentencesAssignment"


    // $ANTLR start "rule__RoomDeclaration__NameAssignment_1"
    // InternalRinform.g:1290:1: rule__RoomDeclaration__NameAssignment_1 : ( ruleText ) ;
    public final void rule__RoomDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1294:1: ( ( ruleText ) )
            // InternalRinform.g:1295:2: ( ruleText )
            {
            // InternalRinform.g:1295:2: ( ruleText )
            // InternalRinform.g:1296:3: ruleText
            {
             before(grammarAccess.getRoomDeclarationAccess().getNameTextParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getRoomDeclarationAccess().getNameTextParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoomDeclaration__NameAssignment_1"


    // $ANTLR start "rule__RoomDescription__RoomAssignment_2"
    // InternalRinform.g:1305:1: rule__RoomDescription__RoomAssignment_2 : ( ( ruleText ) ) ;
    public final void rule__RoomDescription__RoomAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1309:1: ( ( ( ruleText ) ) )
            // InternalRinform.g:1310:2: ( ( ruleText ) )
            {
            // InternalRinform.g:1310:2: ( ( ruleText ) )
            // InternalRinform.g:1311:3: ( ruleText )
            {
             before(grammarAccess.getRoomDescriptionAccess().getRoomRoomDeclarationCrossReference_2_0()); 
            // InternalRinform.g:1312:3: ( ruleText )
            // InternalRinform.g:1313:4: ruleText
            {
             before(grammarAccess.getRoomDescriptionAccess().getRoomRoomDeclarationTextParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getRoomDescriptionAccess().getRoomRoomDeclarationTextParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getRoomDescriptionAccess().getRoomRoomDeclarationCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoomDescription__RoomAssignment_2"


    // $ANTLR start "rule__RoomDescription__DescriptionAssignment_4"
    // InternalRinform.g:1324:1: rule__RoomDescription__DescriptionAssignment_4 : ( ruleText ) ;
    public final void rule__RoomDescription__DescriptionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1328:1: ( ( ruleText ) )
            // InternalRinform.g:1329:2: ( ruleText )
            {
            // InternalRinform.g:1329:2: ( ruleText )
            // InternalRinform.g:1330:3: ruleText
            {
             before(grammarAccess.getRoomDescriptionAccess().getDescriptionTextParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getRoomDescriptionAccess().getDescriptionTextParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoomDescription__DescriptionAssignment_4"


    // $ANTLR start "rule__ItemDeclaration__RoomAssignment_2"
    // InternalRinform.g:1339:1: rule__ItemDeclaration__RoomAssignment_2 : ( ( ruleText ) ) ;
    public final void rule__ItemDeclaration__RoomAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1343:1: ( ( ( ruleText ) ) )
            // InternalRinform.g:1344:2: ( ( ruleText ) )
            {
            // InternalRinform.g:1344:2: ( ( ruleText ) )
            // InternalRinform.g:1345:3: ( ruleText )
            {
             before(grammarAccess.getItemDeclarationAccess().getRoomRoomDeclarationCrossReference_2_0()); 
            // InternalRinform.g:1346:3: ( ruleText )
            // InternalRinform.g:1347:4: ruleText
            {
             before(grammarAccess.getItemDeclarationAccess().getRoomRoomDeclarationTextParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getItemDeclarationAccess().getRoomRoomDeclarationTextParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getItemDeclarationAccess().getRoomRoomDeclarationCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemDeclaration__RoomAssignment_2"


    // $ANTLR start "rule__ItemDeclaration__NameAssignment_4"
    // InternalRinform.g:1358:1: rule__ItemDeclaration__NameAssignment_4 : ( ruleText ) ;
    public final void rule__ItemDeclaration__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1362:1: ( ( ruleText ) )
            // InternalRinform.g:1363:2: ( ruleText )
            {
            // InternalRinform.g:1363:2: ( ruleText )
            // InternalRinform.g:1364:3: ruleText
            {
             before(grammarAccess.getItemDeclarationAccess().getNameTextParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getItemDeclarationAccess().getNameTextParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemDeclaration__NameAssignment_4"


    // $ANTLR start "rule__ItemDescription__ItemAssignment_1"
    // InternalRinform.g:1373:1: rule__ItemDescription__ItemAssignment_1 : ( ( ruleText ) ) ;
    public final void rule__ItemDescription__ItemAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1377:1: ( ( ( ruleText ) ) )
            // InternalRinform.g:1378:2: ( ( ruleText ) )
            {
            // InternalRinform.g:1378:2: ( ( ruleText ) )
            // InternalRinform.g:1379:3: ( ruleText )
            {
             before(grammarAccess.getItemDescriptionAccess().getItemItemDeclarationCrossReference_1_0()); 
            // InternalRinform.g:1380:3: ( ruleText )
            // InternalRinform.g:1381:4: ruleText
            {
             before(grammarAccess.getItemDescriptionAccess().getItemItemDeclarationTextParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getItemDescriptionAccess().getItemItemDeclarationTextParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getItemDescriptionAccess().getItemItemDeclarationCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemDescription__ItemAssignment_1"


    // $ANTLR start "rule__ItemDescription__DescriptionAssignment_3"
    // InternalRinform.g:1392:1: rule__ItemDescription__DescriptionAssignment_3 : ( ruleText ) ;
    public final void rule__ItemDescription__DescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1396:1: ( ( ruleText ) )
            // InternalRinform.g:1397:2: ( ruleText )
            {
            // InternalRinform.g:1397:2: ( ruleText )
            // InternalRinform.g:1398:3: ruleText
            {
             before(grammarAccess.getItemDescriptionAccess().getDescriptionTextParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getItemDescriptionAccess().getDescriptionTextParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemDescription__DescriptionAssignment_3"


    // $ANTLR start "rule__DirectionStatement__Room1Assignment_1"
    // InternalRinform.g:1407:1: rule__DirectionStatement__Room1Assignment_1 : ( ( ruleText ) ) ;
    public final void rule__DirectionStatement__Room1Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1411:1: ( ( ( ruleText ) ) )
            // InternalRinform.g:1412:2: ( ( ruleText ) )
            {
            // InternalRinform.g:1412:2: ( ( ruleText ) )
            // InternalRinform.g:1413:3: ( ruleText )
            {
             before(grammarAccess.getDirectionStatementAccess().getRoom1RoomDeclarationCrossReference_1_0()); 
            // InternalRinform.g:1414:3: ( ruleText )
            // InternalRinform.g:1415:4: ruleText
            {
             before(grammarAccess.getDirectionStatementAccess().getRoom1RoomDeclarationTextParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getDirectionStatementAccess().getRoom1RoomDeclarationTextParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getDirectionStatementAccess().getRoom1RoomDeclarationCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectionStatement__Room1Assignment_1"


    // $ANTLR start "rule__DirectionStatement__DirectionAssignment_2"
    // InternalRinform.g:1426:1: rule__DirectionStatement__DirectionAssignment_2 : ( ruleDirection ) ;
    public final void rule__DirectionStatement__DirectionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1430:1: ( ( ruleDirection ) )
            // InternalRinform.g:1431:2: ( ruleDirection )
            {
            // InternalRinform.g:1431:2: ( ruleDirection )
            // InternalRinform.g:1432:3: ruleDirection
            {
             before(grammarAccess.getDirectionStatementAccess().getDirectionDirectionEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDirection();

            state._fsp--;

             after(grammarAccess.getDirectionStatementAccess().getDirectionDirectionEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectionStatement__DirectionAssignment_2"


    // $ANTLR start "rule__DirectionStatement__Room2Assignment_3"
    // InternalRinform.g:1441:1: rule__DirectionStatement__Room2Assignment_3 : ( ( ruleText ) ) ;
    public final void rule__DirectionStatement__Room2Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1445:1: ( ( ( ruleText ) ) )
            // InternalRinform.g:1446:2: ( ( ruleText ) )
            {
            // InternalRinform.g:1446:2: ( ( ruleText ) )
            // InternalRinform.g:1447:3: ( ruleText )
            {
             before(grammarAccess.getDirectionStatementAccess().getRoom2RoomDeclarationCrossReference_3_0()); 
            // InternalRinform.g:1448:3: ( ruleText )
            // InternalRinform.g:1449:4: ruleText
            {
             before(grammarAccess.getDirectionStatementAccess().getRoom2RoomDeclarationTextParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getDirectionStatementAccess().getRoom2RoomDeclarationTextParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getDirectionStatementAccess().getRoom2RoomDeclarationCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectionStatement__Room2Assignment_3"


    // $ANTLR start "rule__Words__WordsAssignment"
    // InternalRinform.g:1460:1: rule__Words__WordsAssignment : ( ruleText ) ;
    public final void rule__Words__WordsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1464:1: ( ( ruleText ) )
            // InternalRinform.g:1465:2: ( ruleText )
            {
            // InternalRinform.g:1465:2: ( ruleText )
            // InternalRinform.g:1466:3: ruleText
            {
             before(grammarAccess.getWordsAccess().getWordsTextParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getWordsAccess().getWordsTextParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Words__WordsAssignment"


    // $ANTLR start "rule__Symbol__SymbolAssignment"
    // InternalRinform.g:1475:1: rule__Symbol__SymbolAssignment : ( ( rule__Symbol__SymbolAlternatives_0 ) ) ;
    public final void rule__Symbol__SymbolAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1479:1: ( ( ( rule__Symbol__SymbolAlternatives_0 ) ) )
            // InternalRinform.g:1480:2: ( ( rule__Symbol__SymbolAlternatives_0 ) )
            {
            // InternalRinform.g:1480:2: ( ( rule__Symbol__SymbolAlternatives_0 ) )
            // InternalRinform.g:1481:3: ( rule__Symbol__SymbolAlternatives_0 )
            {
             before(grammarAccess.getSymbolAccess().getSymbolAlternatives_0()); 
            // InternalRinform.g:1482:3: ( rule__Symbol__SymbolAlternatives_0 )
            // InternalRinform.g:1482:4: rule__Symbol__SymbolAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Symbol__SymbolAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getSymbolAccess().getSymbolAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__SymbolAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000001AA07F812L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001F80000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000022L});

}