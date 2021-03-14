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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "','", "';'", "':'", "'-'", "'!'", "'?'", "'['", "']'", "'(['", "')'", "'{'", "'}'", "'({'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
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

                if ( (LA1_0==RULE_ID||(LA1_0>=11 && LA1_0<=18)||LA1_0==20||LA1_0==22||LA1_0==24) ) {
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


    // $ANTLR start "entryRuleSentenceParts"
    // InternalRinform.g:78:1: entryRuleSentenceParts : ruleSentenceParts EOF ;
    public final void entryRuleSentenceParts() throws RecognitionException {
        try {
            // InternalRinform.g:79:1: ( ruleSentenceParts EOF )
            // InternalRinform.g:80:1: ruleSentenceParts EOF
            {
             before(grammarAccess.getSentencePartsRule()); 
            pushFollow(FOLLOW_1);
            ruleSentenceParts();

            state._fsp--;

             after(grammarAccess.getSentencePartsRule()); 
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
    // $ANTLR end "entryRuleSentenceParts"


    // $ANTLR start "ruleSentenceParts"
    // InternalRinform.g:87:1: ruleSentenceParts : ( ( rule__SentenceParts__Alternatives ) ) ;
    public final void ruleSentenceParts() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:91:2: ( ( ( rule__SentenceParts__Alternatives ) ) )
            // InternalRinform.g:92:2: ( ( rule__SentenceParts__Alternatives ) )
            {
            // InternalRinform.g:92:2: ( ( rule__SentenceParts__Alternatives ) )
            // InternalRinform.g:93:3: ( rule__SentenceParts__Alternatives )
            {
             before(grammarAccess.getSentencePartsAccess().getAlternatives()); 
            // InternalRinform.g:94:3: ( rule__SentenceParts__Alternatives )
            // InternalRinform.g:94:4: rule__SentenceParts__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SentenceParts__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSentencePartsAccess().getAlternatives()); 

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
    // $ANTLR end "ruleSentenceParts"


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


    // $ANTLR start "entryRuleText"
    // InternalRinform.g:203:1: entryRuleText : ruleText EOF ;
    public final void entryRuleText() throws RecognitionException {
        try {
            // InternalRinform.g:204:1: ( ruleText EOF )
            // InternalRinform.g:205:1: ruleText EOF
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
    // InternalRinform.g:212:1: ruleText : ( ( ( rule__Text__TextAssignment ) ) ( ( rule__Text__TextAssignment )* ) ) ;
    public final void ruleText() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:216:2: ( ( ( ( rule__Text__TextAssignment ) ) ( ( rule__Text__TextAssignment )* ) ) )
            // InternalRinform.g:217:2: ( ( ( rule__Text__TextAssignment ) ) ( ( rule__Text__TextAssignment )* ) )
            {
            // InternalRinform.g:217:2: ( ( ( rule__Text__TextAssignment ) ) ( ( rule__Text__TextAssignment )* ) )
            // InternalRinform.g:218:3: ( ( rule__Text__TextAssignment ) ) ( ( rule__Text__TextAssignment )* )
            {
            // InternalRinform.g:218:3: ( ( rule__Text__TextAssignment ) )
            // InternalRinform.g:219:4: ( rule__Text__TextAssignment )
            {
             before(grammarAccess.getTextAccess().getTextAssignment()); 
            // InternalRinform.g:220:4: ( rule__Text__TextAssignment )
            // InternalRinform.g:220:5: rule__Text__TextAssignment
            {
            pushFollow(FOLLOW_4);
            rule__Text__TextAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTextAccess().getTextAssignment()); 

            }

            // InternalRinform.g:223:3: ( ( rule__Text__TextAssignment )* )
            // InternalRinform.g:224:4: ( rule__Text__TextAssignment )*
            {
             before(grammarAccess.getTextAccess().getTextAssignment()); 
            // InternalRinform.g:225:4: ( rule__Text__TextAssignment )*
            loop2:
            do {
                int alt2=2;
                alt2 = dfa2.predict(input);
                switch (alt2) {
            	case 1 :
            	    // InternalRinform.g:225:5: rule__Text__TextAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Text__TextAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getTextAccess().getTextAssignment()); 

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
    // $ANTLR end "ruleText"


    // $ANTLR start "entryRuleWord"
    // InternalRinform.g:235:1: entryRuleWord : ruleWord EOF ;
    public final void entryRuleWord() throws RecognitionException {
        try {
            // InternalRinform.g:236:1: ( ruleWord EOF )
            // InternalRinform.g:237:1: ruleWord EOF
            {
             before(grammarAccess.getWordRule()); 
            pushFollow(FOLLOW_1);
            ruleWord();

            state._fsp--;

             after(grammarAccess.getWordRule()); 
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
    // $ANTLR end "entryRuleWord"


    // $ANTLR start "ruleWord"
    // InternalRinform.g:244:1: ruleWord : ( ( rule__Word__WordAssignment ) ) ;
    public final void ruleWord() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:248:2: ( ( ( rule__Word__WordAssignment ) ) )
            // InternalRinform.g:249:2: ( ( rule__Word__WordAssignment ) )
            {
            // InternalRinform.g:249:2: ( ( rule__Word__WordAssignment ) )
            // InternalRinform.g:250:3: ( rule__Word__WordAssignment )
            {
             before(grammarAccess.getWordAccess().getWordAssignment()); 
            // InternalRinform.g:251:3: ( rule__Word__WordAssignment )
            // InternalRinform.g:251:4: rule__Word__WordAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Word__WordAssignment();

            state._fsp--;


            }

             after(grammarAccess.getWordAccess().getWordAssignment()); 

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
    // $ANTLR end "ruleWord"


    // $ANTLR start "entryRuleSymbol"
    // InternalRinform.g:260:1: entryRuleSymbol : ruleSymbol EOF ;
    public final void entryRuleSymbol() throws RecognitionException {
        try {
            // InternalRinform.g:261:1: ( ruleSymbol EOF )
            // InternalRinform.g:262:1: ruleSymbol EOF
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
    // InternalRinform.g:269:1: ruleSymbol : ( ( rule__Symbol__SymbolAssignment ) ) ;
    public final void ruleSymbol() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:273:2: ( ( ( rule__Symbol__SymbolAssignment ) ) )
            // InternalRinform.g:274:2: ( ( rule__Symbol__SymbolAssignment ) )
            {
            // InternalRinform.g:274:2: ( ( rule__Symbol__SymbolAssignment ) )
            // InternalRinform.g:275:3: ( rule__Symbol__SymbolAssignment )
            {
             before(grammarAccess.getSymbolAccess().getSymbolAssignment()); 
            // InternalRinform.g:276:3: ( rule__Symbol__SymbolAssignment )
            // InternalRinform.g:276:4: rule__Symbol__SymbolAssignment
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


    // $ANTLR start "rule__SentenceParts__Alternatives"
    // InternalRinform.g:284:1: rule__SentenceParts__Alternatives : ( ( ruleRoomDeclaration ) | ( ruleRoomDescription ) | ( ruleItemDeclaration ) | ( ruleItemDescription ) | ( ruleText ) );
    public final void rule__SentenceParts__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:288:1: ( ( ruleRoomDeclaration ) | ( ruleRoomDescription ) | ( ruleItemDeclaration ) | ( ruleItemDescription ) | ( ruleText ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt3=1;
                }
                break;
            case 20:
                {
                alt3=2;
                }
                break;
            case 22:
                {
                alt3=3;
                }
                break;
            case 24:
                {
                alt3=4;
                }
                break;
            case RULE_ID:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalRinform.g:289:2: ( ruleRoomDeclaration )
                    {
                    // InternalRinform.g:289:2: ( ruleRoomDeclaration )
                    // InternalRinform.g:290:3: ruleRoomDeclaration
                    {
                     before(grammarAccess.getSentencePartsAccess().getRoomDeclarationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleRoomDeclaration();

                    state._fsp--;

                     after(grammarAccess.getSentencePartsAccess().getRoomDeclarationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRinform.g:295:2: ( ruleRoomDescription )
                    {
                    // InternalRinform.g:295:2: ( ruleRoomDescription )
                    // InternalRinform.g:296:3: ruleRoomDescription
                    {
                     before(grammarAccess.getSentencePartsAccess().getRoomDescriptionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRoomDescription();

                    state._fsp--;

                     after(grammarAccess.getSentencePartsAccess().getRoomDescriptionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRinform.g:301:2: ( ruleItemDeclaration )
                    {
                    // InternalRinform.g:301:2: ( ruleItemDeclaration )
                    // InternalRinform.g:302:3: ruleItemDeclaration
                    {
                     before(grammarAccess.getSentencePartsAccess().getItemDeclarationParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleItemDeclaration();

                    state._fsp--;

                     after(grammarAccess.getSentencePartsAccess().getItemDeclarationParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRinform.g:307:2: ( ruleItemDescription )
                    {
                    // InternalRinform.g:307:2: ( ruleItemDescription )
                    // InternalRinform.g:308:3: ruleItemDescription
                    {
                     before(grammarAccess.getSentencePartsAccess().getItemDescriptionParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleItemDescription();

                    state._fsp--;

                     after(grammarAccess.getSentencePartsAccess().getItemDescriptionParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalRinform.g:313:2: ( ruleText )
                    {
                    // InternalRinform.g:313:2: ( ruleText )
                    // InternalRinform.g:314:3: ruleText
                    {
                     before(grammarAccess.getSentencePartsAccess().getTextParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleText();

                    state._fsp--;

                     after(grammarAccess.getSentencePartsAccess().getTextParserRuleCall_4()); 

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
    // $ANTLR end "rule__SentenceParts__Alternatives"


    // $ANTLR start "rule__Text__TextAlternatives_0"
    // InternalRinform.g:323:1: rule__Text__TextAlternatives_0 : ( ( ruleSymbol ) | ( ruleWord ) );
    public final void rule__Text__TextAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:327:1: ( ( ruleSymbol ) | ( ruleWord ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=11 && LA4_0<=17)) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalRinform.g:328:2: ( ruleSymbol )
                    {
                    // InternalRinform.g:328:2: ( ruleSymbol )
                    // InternalRinform.g:329:3: ruleSymbol
                    {
                     before(grammarAccess.getTextAccess().getTextSymbolParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSymbol();

                    state._fsp--;

                     after(grammarAccess.getTextAccess().getTextSymbolParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRinform.g:334:2: ( ruleWord )
                    {
                    // InternalRinform.g:334:2: ( ruleWord )
                    // InternalRinform.g:335:3: ruleWord
                    {
                     before(grammarAccess.getTextAccess().getTextWordParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleWord();

                    state._fsp--;

                     after(grammarAccess.getTextAccess().getTextWordParserRuleCall_0_1()); 

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
    // $ANTLR end "rule__Text__TextAlternatives_0"


    // $ANTLR start "rule__Symbol__SymbolAlternatives_0"
    // InternalRinform.g:344:1: rule__Symbol__SymbolAlternatives_0 : ( ( '.' ) | ( ',' ) | ( ';' ) | ( ':' ) | ( '-' ) | ( '!' ) | ( '?' ) );
    public final void rule__Symbol__SymbolAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:348:1: ( ( '.' ) | ( ',' ) | ( ';' ) | ( ':' ) | ( '-' ) | ( '!' ) | ( '?' ) )
            int alt5=7;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt5=1;
                }
                break;
            case 12:
                {
                alt5=2;
                }
                break;
            case 13:
                {
                alt5=3;
                }
                break;
            case 14:
                {
                alt5=4;
                }
                break;
            case 15:
                {
                alt5=5;
                }
                break;
            case 16:
                {
                alt5=6;
                }
                break;
            case 17:
                {
                alt5=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalRinform.g:349:2: ( '.' )
                    {
                    // InternalRinform.g:349:2: ( '.' )
                    // InternalRinform.g:350:3: '.'
                    {
                     before(grammarAccess.getSymbolAccess().getSymbolFullStopKeyword_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getSymbolAccess().getSymbolFullStopKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRinform.g:355:2: ( ',' )
                    {
                    // InternalRinform.g:355:2: ( ',' )
                    // InternalRinform.g:356:3: ','
                    {
                     before(grammarAccess.getSymbolAccess().getSymbolCommaKeyword_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getSymbolAccess().getSymbolCommaKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRinform.g:361:2: ( ';' )
                    {
                    // InternalRinform.g:361:2: ( ';' )
                    // InternalRinform.g:362:3: ';'
                    {
                     before(grammarAccess.getSymbolAccess().getSymbolSemicolonKeyword_0_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getSymbolAccess().getSymbolSemicolonKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRinform.g:367:2: ( ':' )
                    {
                    // InternalRinform.g:367:2: ( ':' )
                    // InternalRinform.g:368:3: ':'
                    {
                     before(grammarAccess.getSymbolAccess().getSymbolColonKeyword_0_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getSymbolAccess().getSymbolColonKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalRinform.g:373:2: ( '-' )
                    {
                    // InternalRinform.g:373:2: ( '-' )
                    // InternalRinform.g:374:3: '-'
                    {
                     before(grammarAccess.getSymbolAccess().getSymbolHyphenMinusKeyword_0_4()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getSymbolAccess().getSymbolHyphenMinusKeyword_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalRinform.g:379:2: ( '!' )
                    {
                    // InternalRinform.g:379:2: ( '!' )
                    // InternalRinform.g:380:3: '!'
                    {
                     before(grammarAccess.getSymbolAccess().getSymbolExclamationMarkKeyword_0_5()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getSymbolAccess().getSymbolExclamationMarkKeyword_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalRinform.g:385:2: ( '?' )
                    {
                    // InternalRinform.g:385:2: ( '?' )
                    // InternalRinform.g:386:3: '?'
                    {
                     before(grammarAccess.getSymbolAccess().getSymbolQuestionMarkKeyword_0_6()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getSymbolAccess().getSymbolQuestionMarkKeyword_0_6()); 

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


    // $ANTLR start "rule__RoomDeclaration__Group__0"
    // InternalRinform.g:395:1: rule__RoomDeclaration__Group__0 : rule__RoomDeclaration__Group__0__Impl rule__RoomDeclaration__Group__1 ;
    public final void rule__RoomDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:399:1: ( rule__RoomDeclaration__Group__0__Impl rule__RoomDeclaration__Group__1 )
            // InternalRinform.g:400:2: rule__RoomDeclaration__Group__0__Impl rule__RoomDeclaration__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalRinform.g:407:1: rule__RoomDeclaration__Group__0__Impl : ( '[' ) ;
    public final void rule__RoomDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:411:1: ( ( '[' ) )
            // InternalRinform.g:412:1: ( '[' )
            {
            // InternalRinform.g:412:1: ( '[' )
            // InternalRinform.g:413:2: '['
            {
             before(grammarAccess.getRoomDeclarationAccess().getLeftSquareBracketKeyword_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalRinform.g:422:1: rule__RoomDeclaration__Group__1 : rule__RoomDeclaration__Group__1__Impl rule__RoomDeclaration__Group__2 ;
    public final void rule__RoomDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:426:1: ( rule__RoomDeclaration__Group__1__Impl rule__RoomDeclaration__Group__2 )
            // InternalRinform.g:427:2: rule__RoomDeclaration__Group__1__Impl rule__RoomDeclaration__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalRinform.g:434:1: rule__RoomDeclaration__Group__1__Impl : ( ( rule__RoomDeclaration__NameAssignment_1 ) ) ;
    public final void rule__RoomDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:438:1: ( ( ( rule__RoomDeclaration__NameAssignment_1 ) ) )
            // InternalRinform.g:439:1: ( ( rule__RoomDeclaration__NameAssignment_1 ) )
            {
            // InternalRinform.g:439:1: ( ( rule__RoomDeclaration__NameAssignment_1 ) )
            // InternalRinform.g:440:2: ( rule__RoomDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getRoomDeclarationAccess().getNameAssignment_1()); 
            // InternalRinform.g:441:2: ( rule__RoomDeclaration__NameAssignment_1 )
            // InternalRinform.g:441:3: rule__RoomDeclaration__NameAssignment_1
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
    // InternalRinform.g:449:1: rule__RoomDeclaration__Group__2 : rule__RoomDeclaration__Group__2__Impl ;
    public final void rule__RoomDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:453:1: ( rule__RoomDeclaration__Group__2__Impl )
            // InternalRinform.g:454:2: rule__RoomDeclaration__Group__2__Impl
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
    // InternalRinform.g:460:1: rule__RoomDeclaration__Group__2__Impl : ( ']' ) ;
    public final void rule__RoomDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:464:1: ( ( ']' ) )
            // InternalRinform.g:465:1: ( ']' )
            {
            // InternalRinform.g:465:1: ( ']' )
            // InternalRinform.g:466:2: ']'
            {
             before(grammarAccess.getRoomDeclarationAccess().getRightSquareBracketKeyword_2()); 
            match(input,19,FOLLOW_2); 
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
    // InternalRinform.g:476:1: rule__RoomDescription__Group__0 : rule__RoomDescription__Group__0__Impl rule__RoomDescription__Group__1 ;
    public final void rule__RoomDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:480:1: ( rule__RoomDescription__Group__0__Impl rule__RoomDescription__Group__1 )
            // InternalRinform.g:481:2: rule__RoomDescription__Group__0__Impl rule__RoomDescription__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalRinform.g:488:1: rule__RoomDescription__Group__0__Impl : ( '([' ) ;
    public final void rule__RoomDescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:492:1: ( ( '([' ) )
            // InternalRinform.g:493:1: ( '([' )
            {
            // InternalRinform.g:493:1: ( '([' )
            // InternalRinform.g:494:2: '(['
            {
             before(grammarAccess.getRoomDescriptionAccess().getLeftParenthesisLeftSquareBracketKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getRoomDescriptionAccess().getLeftParenthesisLeftSquareBracketKeyword_0()); 

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
    // InternalRinform.g:503:1: rule__RoomDescription__Group__1 : rule__RoomDescription__Group__1__Impl rule__RoomDescription__Group__2 ;
    public final void rule__RoomDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:507:1: ( rule__RoomDescription__Group__1__Impl rule__RoomDescription__Group__2 )
            // InternalRinform.g:508:2: rule__RoomDescription__Group__1__Impl rule__RoomDescription__Group__2
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
    // InternalRinform.g:515:1: rule__RoomDescription__Group__1__Impl : ( ( rule__RoomDescription__RoomAssignment_1 ) ) ;
    public final void rule__RoomDescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:519:1: ( ( ( rule__RoomDescription__RoomAssignment_1 ) ) )
            // InternalRinform.g:520:1: ( ( rule__RoomDescription__RoomAssignment_1 ) )
            {
            // InternalRinform.g:520:1: ( ( rule__RoomDescription__RoomAssignment_1 ) )
            // InternalRinform.g:521:2: ( rule__RoomDescription__RoomAssignment_1 )
            {
             before(grammarAccess.getRoomDescriptionAccess().getRoomAssignment_1()); 
            // InternalRinform.g:522:2: ( rule__RoomDescription__RoomAssignment_1 )
            // InternalRinform.g:522:3: rule__RoomDescription__RoomAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RoomDescription__RoomAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRoomDescriptionAccess().getRoomAssignment_1()); 

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
    // InternalRinform.g:530:1: rule__RoomDescription__Group__2 : rule__RoomDescription__Group__2__Impl rule__RoomDescription__Group__3 ;
    public final void rule__RoomDescription__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:534:1: ( rule__RoomDescription__Group__2__Impl rule__RoomDescription__Group__3 )
            // InternalRinform.g:535:2: rule__RoomDescription__Group__2__Impl rule__RoomDescription__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalRinform.g:542:1: rule__RoomDescription__Group__2__Impl : ( ']' ) ;
    public final void rule__RoomDescription__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:546:1: ( ( ']' ) )
            // InternalRinform.g:547:1: ( ']' )
            {
            // InternalRinform.g:547:1: ( ']' )
            // InternalRinform.g:548:2: ']'
            {
             before(grammarAccess.getRoomDescriptionAccess().getRightSquareBracketKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getRoomDescriptionAccess().getRightSquareBracketKeyword_2()); 

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
    // InternalRinform.g:557:1: rule__RoomDescription__Group__3 : rule__RoomDescription__Group__3__Impl rule__RoomDescription__Group__4 ;
    public final void rule__RoomDescription__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:561:1: ( rule__RoomDescription__Group__3__Impl rule__RoomDescription__Group__4 )
            // InternalRinform.g:562:2: rule__RoomDescription__Group__3__Impl rule__RoomDescription__Group__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalRinform.g:569:1: rule__RoomDescription__Group__3__Impl : ( ( rule__RoomDescription__TextAssignment_3 ) ) ;
    public final void rule__RoomDescription__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:573:1: ( ( ( rule__RoomDescription__TextAssignment_3 ) ) )
            // InternalRinform.g:574:1: ( ( rule__RoomDescription__TextAssignment_3 ) )
            {
            // InternalRinform.g:574:1: ( ( rule__RoomDescription__TextAssignment_3 ) )
            // InternalRinform.g:575:2: ( rule__RoomDescription__TextAssignment_3 )
            {
             before(grammarAccess.getRoomDescriptionAccess().getTextAssignment_3()); 
            // InternalRinform.g:576:2: ( rule__RoomDescription__TextAssignment_3 )
            // InternalRinform.g:576:3: rule__RoomDescription__TextAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__RoomDescription__TextAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRoomDescriptionAccess().getTextAssignment_3()); 

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
    // InternalRinform.g:584:1: rule__RoomDescription__Group__4 : rule__RoomDescription__Group__4__Impl ;
    public final void rule__RoomDescription__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:588:1: ( rule__RoomDescription__Group__4__Impl )
            // InternalRinform.g:589:2: rule__RoomDescription__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RoomDescription__Group__4__Impl();

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
    // InternalRinform.g:595:1: rule__RoomDescription__Group__4__Impl : ( ')' ) ;
    public final void rule__RoomDescription__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:599:1: ( ( ')' ) )
            // InternalRinform.g:600:1: ( ')' )
            {
            // InternalRinform.g:600:1: ( ')' )
            // InternalRinform.g:601:2: ')'
            {
             before(grammarAccess.getRoomDescriptionAccess().getRightParenthesisKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getRoomDescriptionAccess().getRightParenthesisKeyword_4()); 

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


    // $ANTLR start "rule__ItemDeclaration__Group__0"
    // InternalRinform.g:611:1: rule__ItemDeclaration__Group__0 : rule__ItemDeclaration__Group__0__Impl rule__ItemDeclaration__Group__1 ;
    public final void rule__ItemDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:615:1: ( rule__ItemDeclaration__Group__0__Impl rule__ItemDeclaration__Group__1 )
            // InternalRinform.g:616:2: rule__ItemDeclaration__Group__0__Impl rule__ItemDeclaration__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalRinform.g:623:1: rule__ItemDeclaration__Group__0__Impl : ( '{' ) ;
    public final void rule__ItemDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:627:1: ( ( '{' ) )
            // InternalRinform.g:628:1: ( '{' )
            {
            // InternalRinform.g:628:1: ( '{' )
            // InternalRinform.g:629:2: '{'
            {
             before(grammarAccess.getItemDeclarationAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalRinform.g:638:1: rule__ItemDeclaration__Group__1 : rule__ItemDeclaration__Group__1__Impl rule__ItemDeclaration__Group__2 ;
    public final void rule__ItemDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:642:1: ( rule__ItemDeclaration__Group__1__Impl rule__ItemDeclaration__Group__2 )
            // InternalRinform.g:643:2: rule__ItemDeclaration__Group__1__Impl rule__ItemDeclaration__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalRinform.g:650:1: rule__ItemDeclaration__Group__1__Impl : ( ( rule__ItemDeclaration__NameAssignment_1 ) ) ;
    public final void rule__ItemDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:654:1: ( ( ( rule__ItemDeclaration__NameAssignment_1 ) ) )
            // InternalRinform.g:655:1: ( ( rule__ItemDeclaration__NameAssignment_1 ) )
            {
            // InternalRinform.g:655:1: ( ( rule__ItemDeclaration__NameAssignment_1 ) )
            // InternalRinform.g:656:2: ( rule__ItemDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getItemDeclarationAccess().getNameAssignment_1()); 
            // InternalRinform.g:657:2: ( rule__ItemDeclaration__NameAssignment_1 )
            // InternalRinform.g:657:3: rule__ItemDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ItemDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getItemDeclarationAccess().getNameAssignment_1()); 

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
    // InternalRinform.g:665:1: rule__ItemDeclaration__Group__2 : rule__ItemDeclaration__Group__2__Impl ;
    public final void rule__ItemDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:669:1: ( rule__ItemDeclaration__Group__2__Impl )
            // InternalRinform.g:670:2: rule__ItemDeclaration__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ItemDeclaration__Group__2__Impl();

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
    // InternalRinform.g:676:1: rule__ItemDeclaration__Group__2__Impl : ( '}' ) ;
    public final void rule__ItemDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:680:1: ( ( '}' ) )
            // InternalRinform.g:681:1: ( '}' )
            {
            // InternalRinform.g:681:1: ( '}' )
            // InternalRinform.g:682:2: '}'
            {
             before(grammarAccess.getItemDeclarationAccess().getRightCurlyBracketKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getItemDeclarationAccess().getRightCurlyBracketKeyword_2()); 

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


    // $ANTLR start "rule__ItemDescription__Group__0"
    // InternalRinform.g:692:1: rule__ItemDescription__Group__0 : rule__ItemDescription__Group__0__Impl rule__ItemDescription__Group__1 ;
    public final void rule__ItemDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:696:1: ( rule__ItemDescription__Group__0__Impl rule__ItemDescription__Group__1 )
            // InternalRinform.g:697:2: rule__ItemDescription__Group__0__Impl rule__ItemDescription__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalRinform.g:704:1: rule__ItemDescription__Group__0__Impl : ( '({' ) ;
    public final void rule__ItemDescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:708:1: ( ( '({' ) )
            // InternalRinform.g:709:1: ( '({' )
            {
            // InternalRinform.g:709:1: ( '({' )
            // InternalRinform.g:710:2: '({'
            {
             before(grammarAccess.getItemDescriptionAccess().getLeftParenthesisLeftCurlyBracketKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalRinform.g:719:1: rule__ItemDescription__Group__1 : rule__ItemDescription__Group__1__Impl rule__ItemDescription__Group__2 ;
    public final void rule__ItemDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:723:1: ( rule__ItemDescription__Group__1__Impl rule__ItemDescription__Group__2 )
            // InternalRinform.g:724:2: rule__ItemDescription__Group__1__Impl rule__ItemDescription__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalRinform.g:731:1: rule__ItemDescription__Group__1__Impl : ( ( rule__ItemDescription__ItemAssignment_1 ) ) ;
    public final void rule__ItemDescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:735:1: ( ( ( rule__ItemDescription__ItemAssignment_1 ) ) )
            // InternalRinform.g:736:1: ( ( rule__ItemDescription__ItemAssignment_1 ) )
            {
            // InternalRinform.g:736:1: ( ( rule__ItemDescription__ItemAssignment_1 ) )
            // InternalRinform.g:737:2: ( rule__ItemDescription__ItemAssignment_1 )
            {
             before(grammarAccess.getItemDescriptionAccess().getItemAssignment_1()); 
            // InternalRinform.g:738:2: ( rule__ItemDescription__ItemAssignment_1 )
            // InternalRinform.g:738:3: rule__ItemDescription__ItemAssignment_1
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
    // InternalRinform.g:746:1: rule__ItemDescription__Group__2 : rule__ItemDescription__Group__2__Impl rule__ItemDescription__Group__3 ;
    public final void rule__ItemDescription__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:750:1: ( rule__ItemDescription__Group__2__Impl rule__ItemDescription__Group__3 )
            // InternalRinform.g:751:2: rule__ItemDescription__Group__2__Impl rule__ItemDescription__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalRinform.g:758:1: rule__ItemDescription__Group__2__Impl : ( '}' ) ;
    public final void rule__ItemDescription__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:762:1: ( ( '}' ) )
            // InternalRinform.g:763:1: ( '}' )
            {
            // InternalRinform.g:763:1: ( '}' )
            // InternalRinform.g:764:2: '}'
            {
             before(grammarAccess.getItemDescriptionAccess().getRightCurlyBracketKeyword_2()); 
            match(input,23,FOLLOW_2); 
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
    // InternalRinform.g:773:1: rule__ItemDescription__Group__3 : rule__ItemDescription__Group__3__Impl rule__ItemDescription__Group__4 ;
    public final void rule__ItemDescription__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:777:1: ( rule__ItemDescription__Group__3__Impl rule__ItemDescription__Group__4 )
            // InternalRinform.g:778:2: rule__ItemDescription__Group__3__Impl rule__ItemDescription__Group__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalRinform.g:785:1: rule__ItemDescription__Group__3__Impl : ( ( rule__ItemDescription__TextAssignment_3 ) ) ;
    public final void rule__ItemDescription__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:789:1: ( ( ( rule__ItemDescription__TextAssignment_3 ) ) )
            // InternalRinform.g:790:1: ( ( rule__ItemDescription__TextAssignment_3 ) )
            {
            // InternalRinform.g:790:1: ( ( rule__ItemDescription__TextAssignment_3 ) )
            // InternalRinform.g:791:2: ( rule__ItemDescription__TextAssignment_3 )
            {
             before(grammarAccess.getItemDescriptionAccess().getTextAssignment_3()); 
            // InternalRinform.g:792:2: ( rule__ItemDescription__TextAssignment_3 )
            // InternalRinform.g:792:3: rule__ItemDescription__TextAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ItemDescription__TextAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getItemDescriptionAccess().getTextAssignment_3()); 

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
    // InternalRinform.g:800:1: rule__ItemDescription__Group__4 : rule__ItemDescription__Group__4__Impl ;
    public final void rule__ItemDescription__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:804:1: ( rule__ItemDescription__Group__4__Impl )
            // InternalRinform.g:805:2: rule__ItemDescription__Group__4__Impl
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
    // InternalRinform.g:811:1: rule__ItemDescription__Group__4__Impl : ( ')' ) ;
    public final void rule__ItemDescription__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:815:1: ( ( ')' ) )
            // InternalRinform.g:816:1: ( ')' )
            {
            // InternalRinform.g:816:1: ( ')' )
            // InternalRinform.g:817:2: ')'
            {
             before(grammarAccess.getItemDescriptionAccess().getRightParenthesisKeyword_4()); 
            match(input,21,FOLLOW_2); 
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


    // $ANTLR start "rule__ReverseInformProgram__SentencesAssignment"
    // InternalRinform.g:827:1: rule__ReverseInformProgram__SentencesAssignment : ( ruleSentenceParts ) ;
    public final void rule__ReverseInformProgram__SentencesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:831:1: ( ( ruleSentenceParts ) )
            // InternalRinform.g:832:2: ( ruleSentenceParts )
            {
            // InternalRinform.g:832:2: ( ruleSentenceParts )
            // InternalRinform.g:833:3: ruleSentenceParts
            {
             before(grammarAccess.getReverseInformProgramAccess().getSentencesSentencePartsParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleSentenceParts();

            state._fsp--;

             after(grammarAccess.getReverseInformProgramAccess().getSentencesSentencePartsParserRuleCall_0()); 

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
    // InternalRinform.g:842:1: rule__RoomDeclaration__NameAssignment_1 : ( ruleText ) ;
    public final void rule__RoomDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:846:1: ( ( ruleText ) )
            // InternalRinform.g:847:2: ( ruleText )
            {
            // InternalRinform.g:847:2: ( ruleText )
            // InternalRinform.g:848:3: ruleText
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


    // $ANTLR start "rule__RoomDescription__RoomAssignment_1"
    // InternalRinform.g:857:1: rule__RoomDescription__RoomAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__RoomDescription__RoomAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:861:1: ( ( ( RULE_ID ) ) )
            // InternalRinform.g:862:2: ( ( RULE_ID ) )
            {
            // InternalRinform.g:862:2: ( ( RULE_ID ) )
            // InternalRinform.g:863:3: ( RULE_ID )
            {
             before(grammarAccess.getRoomDescriptionAccess().getRoomRoomDeclarationCrossReference_1_0()); 
            // InternalRinform.g:864:3: ( RULE_ID )
            // InternalRinform.g:865:4: RULE_ID
            {
             before(grammarAccess.getRoomDescriptionAccess().getRoomRoomDeclarationIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRoomDescriptionAccess().getRoomRoomDeclarationIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getRoomDescriptionAccess().getRoomRoomDeclarationCrossReference_1_0()); 

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
    // $ANTLR end "rule__RoomDescription__RoomAssignment_1"


    // $ANTLR start "rule__RoomDescription__TextAssignment_3"
    // InternalRinform.g:876:1: rule__RoomDescription__TextAssignment_3 : ( ruleText ) ;
    public final void rule__RoomDescription__TextAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:880:1: ( ( ruleText ) )
            // InternalRinform.g:881:2: ( ruleText )
            {
            // InternalRinform.g:881:2: ( ruleText )
            // InternalRinform.g:882:3: ruleText
            {
             before(grammarAccess.getRoomDescriptionAccess().getTextTextParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getRoomDescriptionAccess().getTextTextParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__RoomDescription__TextAssignment_3"


    // $ANTLR start "rule__ItemDeclaration__NameAssignment_1"
    // InternalRinform.g:891:1: rule__ItemDeclaration__NameAssignment_1 : ( ruleText ) ;
    public final void rule__ItemDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:895:1: ( ( ruleText ) )
            // InternalRinform.g:896:2: ( ruleText )
            {
            // InternalRinform.g:896:2: ( ruleText )
            // InternalRinform.g:897:3: ruleText
            {
             before(grammarAccess.getItemDeclarationAccess().getNameTextParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getItemDeclarationAccess().getNameTextParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ItemDeclaration__NameAssignment_1"


    // $ANTLR start "rule__ItemDescription__ItemAssignment_1"
    // InternalRinform.g:906:1: rule__ItemDescription__ItemAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ItemDescription__ItemAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:910:1: ( ( ( RULE_ID ) ) )
            // InternalRinform.g:911:2: ( ( RULE_ID ) )
            {
            // InternalRinform.g:911:2: ( ( RULE_ID ) )
            // InternalRinform.g:912:3: ( RULE_ID )
            {
             before(grammarAccess.getItemDescriptionAccess().getItemItemDeclarationCrossReference_1_0()); 
            // InternalRinform.g:913:3: ( RULE_ID )
            // InternalRinform.g:914:4: RULE_ID
            {
             before(grammarAccess.getItemDescriptionAccess().getItemItemDeclarationIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getItemDescriptionAccess().getItemItemDeclarationIDTerminalRuleCall_1_0_1()); 

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


    // $ANTLR start "rule__ItemDescription__TextAssignment_3"
    // InternalRinform.g:925:1: rule__ItemDescription__TextAssignment_3 : ( ruleText ) ;
    public final void rule__ItemDescription__TextAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:929:1: ( ( ruleText ) )
            // InternalRinform.g:930:2: ( ruleText )
            {
            // InternalRinform.g:930:2: ( ruleText )
            // InternalRinform.g:931:3: ruleText
            {
             before(grammarAccess.getItemDescriptionAccess().getTextTextParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getItemDescriptionAccess().getTextTextParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__ItemDescription__TextAssignment_3"


    // $ANTLR start "rule__Text__TextAssignment"
    // InternalRinform.g:940:1: rule__Text__TextAssignment : ( ( rule__Text__TextAlternatives_0 ) ) ;
    public final void rule__Text__TextAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:944:1: ( ( ( rule__Text__TextAlternatives_0 ) ) )
            // InternalRinform.g:945:2: ( ( rule__Text__TextAlternatives_0 ) )
            {
            // InternalRinform.g:945:2: ( ( rule__Text__TextAlternatives_0 ) )
            // InternalRinform.g:946:3: ( rule__Text__TextAlternatives_0 )
            {
             before(grammarAccess.getTextAccess().getTextAlternatives_0()); 
            // InternalRinform.g:947:3: ( rule__Text__TextAlternatives_0 )
            // InternalRinform.g:947:4: rule__Text__TextAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Text__TextAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getTextAccess().getTextAlternatives_0()); 

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
    // $ANTLR end "rule__Text__TextAssignment"


    // $ANTLR start "rule__Word__WordAssignment"
    // InternalRinform.g:955:1: rule__Word__WordAssignment : ( RULE_ID ) ;
    public final void rule__Word__WordAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:959:1: ( ( RULE_ID ) )
            // InternalRinform.g:960:2: ( RULE_ID )
            {
            // InternalRinform.g:960:2: ( RULE_ID )
            // InternalRinform.g:961:3: RULE_ID
            {
             before(grammarAccess.getWordAccess().getWordIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWordAccess().getWordIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Word__WordAssignment"


    // $ANTLR start "rule__Symbol__SymbolAssignment"
    // InternalRinform.g:970:1: rule__Symbol__SymbolAssignment : ( ( rule__Symbol__SymbolAlternatives_0 ) ) ;
    public final void rule__Symbol__SymbolAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:974:1: ( ( ( rule__Symbol__SymbolAlternatives_0 ) ) )
            // InternalRinform.g:975:2: ( ( rule__Symbol__SymbolAlternatives_0 ) )
            {
            // InternalRinform.g:975:2: ( ( rule__Symbol__SymbolAlternatives_0 ) )
            // InternalRinform.g:976:3: ( rule__Symbol__SymbolAlternatives_0 )
            {
             before(grammarAccess.getSymbolAccess().getSymbolAlternatives_0()); 
            // InternalRinform.g:977:3: ( rule__Symbol__SymbolAlternatives_0 )
            // InternalRinform.g:977:4: rule__Symbol__SymbolAlternatives_0
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


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\1\11\uffff";
    static final String dfa_3s = "\1\4\11\uffff";
    static final String dfa_4s = "\1\30\11\uffff";
    static final String dfa_5s = "\1\uffff\1\2\10\1";
    static final String dfa_6s = "\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\11\6\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\7\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 225:4: ( rule__Text__TextAssignment )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000157F812L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000157F810L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000800000L});

}