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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_WS", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'.'", "','", "';'", "':'", "'-'", "'!'", "'?'", "'\\''", "'South'", "'North'", "'East'", "'West'", "'Below'", "'Above'", "'-r'", "'('", "')'", "'-c'", "'-i'", "'<'", "'>'"
    };
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
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
    public static final int T__30=30;
    public static final int T__31=31;
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

                if ( (LA1_0==RULE_ID||(LA1_0>=11 && LA1_0<=18)||(LA1_0>=25 && LA1_0<=26)||(LA1_0>=28 && LA1_0<=30)) ) {
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


    // $ANTLR start "entryRuleContainerDeclaration"
    // InternalRinform.g:153:1: entryRuleContainerDeclaration : ruleContainerDeclaration EOF ;
    public final void entryRuleContainerDeclaration() throws RecognitionException {
        try {
            // InternalRinform.g:154:1: ( ruleContainerDeclaration EOF )
            // InternalRinform.g:155:1: ruleContainerDeclaration EOF
            {
             before(grammarAccess.getContainerDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleContainerDeclaration();

            state._fsp--;

             after(grammarAccess.getContainerDeclarationRule()); 
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
    // $ANTLR end "entryRuleContainerDeclaration"


    // $ANTLR start "ruleContainerDeclaration"
    // InternalRinform.g:162:1: ruleContainerDeclaration : ( ( rule__ContainerDeclaration__Group__0 ) ) ;
    public final void ruleContainerDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:166:2: ( ( ( rule__ContainerDeclaration__Group__0 ) ) )
            // InternalRinform.g:167:2: ( ( rule__ContainerDeclaration__Group__0 ) )
            {
            // InternalRinform.g:167:2: ( ( rule__ContainerDeclaration__Group__0 ) )
            // InternalRinform.g:168:3: ( rule__ContainerDeclaration__Group__0 )
            {
             before(grammarAccess.getContainerDeclarationAccess().getGroup()); 
            // InternalRinform.g:169:3: ( rule__ContainerDeclaration__Group__0 )
            // InternalRinform.g:169:4: rule__ContainerDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ContainerDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContainerDeclarationAccess().getGroup()); 

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
    // $ANTLR end "ruleContainerDeclaration"


    // $ANTLR start "entryRuleItemInContainerDeclaration"
    // InternalRinform.g:178:1: entryRuleItemInContainerDeclaration : ruleItemInContainerDeclaration EOF ;
    public final void entryRuleItemInContainerDeclaration() throws RecognitionException {
        try {
            // InternalRinform.g:179:1: ( ruleItemInContainerDeclaration EOF )
            // InternalRinform.g:180:1: ruleItemInContainerDeclaration EOF
            {
             before(grammarAccess.getItemInContainerDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleItemInContainerDeclaration();

            state._fsp--;

             after(grammarAccess.getItemInContainerDeclarationRule()); 
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
    // $ANTLR end "entryRuleItemInContainerDeclaration"


    // $ANTLR start "ruleItemInContainerDeclaration"
    // InternalRinform.g:187:1: ruleItemInContainerDeclaration : ( ( rule__ItemInContainerDeclaration__Group__0 ) ) ;
    public final void ruleItemInContainerDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:191:2: ( ( ( rule__ItemInContainerDeclaration__Group__0 ) ) )
            // InternalRinform.g:192:2: ( ( rule__ItemInContainerDeclaration__Group__0 ) )
            {
            // InternalRinform.g:192:2: ( ( rule__ItemInContainerDeclaration__Group__0 ) )
            // InternalRinform.g:193:3: ( rule__ItemInContainerDeclaration__Group__0 )
            {
             before(grammarAccess.getItemInContainerDeclarationAccess().getGroup()); 
            // InternalRinform.g:194:3: ( rule__ItemInContainerDeclaration__Group__0 )
            // InternalRinform.g:194:4: rule__ItemInContainerDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ItemInContainerDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getItemInContainerDeclarationAccess().getGroup()); 

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
    // $ANTLR end "ruleItemInContainerDeclaration"


    // $ANTLR start "entryRuleItemDeclaration"
    // InternalRinform.g:203:1: entryRuleItemDeclaration : ruleItemDeclaration EOF ;
    public final void entryRuleItemDeclaration() throws RecognitionException {
        try {
            // InternalRinform.g:204:1: ( ruleItemDeclaration EOF )
            // InternalRinform.g:205:1: ruleItemDeclaration EOF
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
    // InternalRinform.g:212:1: ruleItemDeclaration : ( ( rule__ItemDeclaration__Alternatives ) ) ;
    public final void ruleItemDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:216:2: ( ( ( rule__ItemDeclaration__Alternatives ) ) )
            // InternalRinform.g:217:2: ( ( rule__ItemDeclaration__Alternatives ) )
            {
            // InternalRinform.g:217:2: ( ( rule__ItemDeclaration__Alternatives ) )
            // InternalRinform.g:218:3: ( rule__ItemDeclaration__Alternatives )
            {
             before(grammarAccess.getItemDeclarationAccess().getAlternatives()); 
            // InternalRinform.g:219:3: ( rule__ItemDeclaration__Alternatives )
            // InternalRinform.g:219:4: rule__ItemDeclaration__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ItemDeclaration__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getItemDeclarationAccess().getAlternatives()); 

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
    // InternalRinform.g:228:1: entryRuleItemDescription : ruleItemDescription EOF ;
    public final void entryRuleItemDescription() throws RecognitionException {
        try {
            // InternalRinform.g:229:1: ( ruleItemDescription EOF )
            // InternalRinform.g:230:1: ruleItemDescription EOF
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
    // InternalRinform.g:237:1: ruleItemDescription : ( ( rule__ItemDescription__Group__0 ) ) ;
    public final void ruleItemDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:241:2: ( ( ( rule__ItemDescription__Group__0 ) ) )
            // InternalRinform.g:242:2: ( ( rule__ItemDescription__Group__0 ) )
            {
            // InternalRinform.g:242:2: ( ( rule__ItemDescription__Group__0 ) )
            // InternalRinform.g:243:3: ( rule__ItemDescription__Group__0 )
            {
             before(grammarAccess.getItemDescriptionAccess().getGroup()); 
            // InternalRinform.g:244:3: ( rule__ItemDescription__Group__0 )
            // InternalRinform.g:244:4: rule__ItemDescription__Group__0
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
    // InternalRinform.g:253:1: entryRuleDirectionStatement : ruleDirectionStatement EOF ;
    public final void entryRuleDirectionStatement() throws RecognitionException {
        try {
            // InternalRinform.g:254:1: ( ruleDirectionStatement EOF )
            // InternalRinform.g:255:1: ruleDirectionStatement EOF
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
    // InternalRinform.g:262:1: ruleDirectionStatement : ( ( rule__DirectionStatement__Group__0 ) ) ;
    public final void ruleDirectionStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:266:2: ( ( ( rule__DirectionStatement__Group__0 ) ) )
            // InternalRinform.g:267:2: ( ( rule__DirectionStatement__Group__0 ) )
            {
            // InternalRinform.g:267:2: ( ( rule__DirectionStatement__Group__0 ) )
            // InternalRinform.g:268:3: ( rule__DirectionStatement__Group__0 )
            {
             before(grammarAccess.getDirectionStatementAccess().getGroup()); 
            // InternalRinform.g:269:3: ( rule__DirectionStatement__Group__0 )
            // InternalRinform.g:269:4: rule__DirectionStatement__Group__0
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
    // InternalRinform.g:278:1: entryRuleText : ruleText EOF ;
    public final void entryRuleText() throws RecognitionException {
        try {
            // InternalRinform.g:279:1: ( ruleText EOF )
            // InternalRinform.g:280:1: ruleText EOF
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
    // InternalRinform.g:287:1: ruleText : ( ( rule__Text__Group__0 ) ) ;
    public final void ruleText() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:291:2: ( ( ( rule__Text__Group__0 ) ) )
            // InternalRinform.g:292:2: ( ( rule__Text__Group__0 ) )
            {
            // InternalRinform.g:292:2: ( ( rule__Text__Group__0 ) )
            // InternalRinform.g:293:3: ( rule__Text__Group__0 )
            {
             before(grammarAccess.getTextAccess().getGroup()); 
            // InternalRinform.g:294:3: ( rule__Text__Group__0 )
            // InternalRinform.g:294:4: rule__Text__Group__0
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
    // InternalRinform.g:303:1: entryRuleWords : ruleWords EOF ;
    public final void entryRuleWords() throws RecognitionException {
        try {
            // InternalRinform.g:304:1: ( ruleWords EOF )
            // InternalRinform.g:305:1: ruleWords EOF
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
    // InternalRinform.g:312:1: ruleWords : ( ( ( rule__Words__WordsAssignment ) ) ( ( rule__Words__WordsAssignment )* ) ) ;
    public final void ruleWords() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:316:2: ( ( ( ( rule__Words__WordsAssignment ) ) ( ( rule__Words__WordsAssignment )* ) ) )
            // InternalRinform.g:317:2: ( ( ( rule__Words__WordsAssignment ) ) ( ( rule__Words__WordsAssignment )* ) )
            {
            // InternalRinform.g:317:2: ( ( ( rule__Words__WordsAssignment ) ) ( ( rule__Words__WordsAssignment )* ) )
            // InternalRinform.g:318:3: ( ( rule__Words__WordsAssignment ) ) ( ( rule__Words__WordsAssignment )* )
            {
            // InternalRinform.g:318:3: ( ( rule__Words__WordsAssignment ) )
            // InternalRinform.g:319:4: ( rule__Words__WordsAssignment )
            {
             before(grammarAccess.getWordsAccess().getWordsAssignment()); 
            // InternalRinform.g:320:4: ( rule__Words__WordsAssignment )
            // InternalRinform.g:320:5: rule__Words__WordsAssignment
            {
            pushFollow(FOLLOW_4);
            rule__Words__WordsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getWordsAccess().getWordsAssignment()); 

            }

            // InternalRinform.g:323:3: ( ( rule__Words__WordsAssignment )* )
            // InternalRinform.g:324:4: ( rule__Words__WordsAssignment )*
            {
             before(grammarAccess.getWordsAccess().getWordsAssignment()); 
            // InternalRinform.g:325:4: ( rule__Words__WordsAssignment )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalRinform.g:325:5: rule__Words__WordsAssignment
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
    // InternalRinform.g:335:1: entryRuleSymbol : ruleSymbol EOF ;
    public final void entryRuleSymbol() throws RecognitionException {
        try {
            // InternalRinform.g:336:1: ( ruleSymbol EOF )
            // InternalRinform.g:337:1: ruleSymbol EOF
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
    // InternalRinform.g:344:1: ruleSymbol : ( ( rule__Symbol__SymbolAssignment ) ) ;
    public final void ruleSymbol() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:348:2: ( ( ( rule__Symbol__SymbolAssignment ) ) )
            // InternalRinform.g:349:2: ( ( rule__Symbol__SymbolAssignment ) )
            {
            // InternalRinform.g:349:2: ( ( rule__Symbol__SymbolAssignment ) )
            // InternalRinform.g:350:3: ( rule__Symbol__SymbolAssignment )
            {
             before(grammarAccess.getSymbolAccess().getSymbolAssignment()); 
            // InternalRinform.g:351:3: ( rule__Symbol__SymbolAssignment )
            // InternalRinform.g:351:4: rule__Symbol__SymbolAssignment
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
    // InternalRinform.g:360:1: ruleDirection : ( ( rule__Direction__Alternatives ) ) ;
    public final void ruleDirection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:364:1: ( ( ( rule__Direction__Alternatives ) ) )
            // InternalRinform.g:365:2: ( ( rule__Direction__Alternatives ) )
            {
            // InternalRinform.g:365:2: ( ( rule__Direction__Alternatives ) )
            // InternalRinform.g:366:3: ( rule__Direction__Alternatives )
            {
             before(grammarAccess.getDirectionAccess().getAlternatives()); 
            // InternalRinform.g:367:3: ( rule__Direction__Alternatives )
            // InternalRinform.g:367:4: rule__Direction__Alternatives
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
    // InternalRinform.g:375:1: rule__SentencePart__Alternatives : ( ( ruleRoomDeclaration ) | ( ruleRoomDescription ) | ( ruleItemDeclaration ) | ( ruleItemDescription ) | ( ruleWords ) | ( ruleSymbol ) | ( ruleDirectionStatement ) );
    public final void rule__SentencePart__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:379:1: ( ( ruleRoomDeclaration ) | ( ruleRoomDescription ) | ( ruleItemDeclaration ) | ( ruleItemDescription ) | ( ruleWords ) | ( ruleSymbol ) | ( ruleDirectionStatement ) )
            int alt3=7;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalRinform.g:380:2: ( ruleRoomDeclaration )
                    {
                    // InternalRinform.g:380:2: ( ruleRoomDeclaration )
                    // InternalRinform.g:381:3: ruleRoomDeclaration
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
                    // InternalRinform.g:386:2: ( ruleRoomDescription )
                    {
                    // InternalRinform.g:386:2: ( ruleRoomDescription )
                    // InternalRinform.g:387:3: ruleRoomDescription
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
                    // InternalRinform.g:392:2: ( ruleItemDeclaration )
                    {
                    // InternalRinform.g:392:2: ( ruleItemDeclaration )
                    // InternalRinform.g:393:3: ruleItemDeclaration
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
                    // InternalRinform.g:398:2: ( ruleItemDescription )
                    {
                    // InternalRinform.g:398:2: ( ruleItemDescription )
                    // InternalRinform.g:399:3: ruleItemDescription
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
                    // InternalRinform.g:404:2: ( ruleWords )
                    {
                    // InternalRinform.g:404:2: ( ruleWords )
                    // InternalRinform.g:405:3: ruleWords
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
                    // InternalRinform.g:410:2: ( ruleSymbol )
                    {
                    // InternalRinform.g:410:2: ( ruleSymbol )
                    // InternalRinform.g:411:3: ruleSymbol
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
                    // InternalRinform.g:416:2: ( ruleDirectionStatement )
                    {
                    // InternalRinform.g:416:2: ( ruleDirectionStatement )
                    // InternalRinform.g:417:3: ruleDirectionStatement
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


    // $ANTLR start "rule__ItemDeclaration__Alternatives"
    // InternalRinform.g:426:1: rule__ItemDeclaration__Alternatives : ( ( ( rule__ItemDeclaration__Group_0__0 ) ) | ( ruleItemInContainerDeclaration ) | ( ruleContainerDeclaration ) );
    public final void rule__ItemDeclaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:430:1: ( ( ( rule__ItemDeclaration__Group_0__0 ) ) | ( ruleItemInContainerDeclaration ) | ( ruleContainerDeclaration ) )
            int alt4=3;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalRinform.g:431:2: ( ( rule__ItemDeclaration__Group_0__0 ) )
                    {
                    // InternalRinform.g:431:2: ( ( rule__ItemDeclaration__Group_0__0 ) )
                    // InternalRinform.g:432:3: ( rule__ItemDeclaration__Group_0__0 )
                    {
                     before(grammarAccess.getItemDeclarationAccess().getGroup_0()); 
                    // InternalRinform.g:433:3: ( rule__ItemDeclaration__Group_0__0 )
                    // InternalRinform.g:433:4: rule__ItemDeclaration__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ItemDeclaration__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getItemDeclarationAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRinform.g:437:2: ( ruleItemInContainerDeclaration )
                    {
                    // InternalRinform.g:437:2: ( ruleItemInContainerDeclaration )
                    // InternalRinform.g:438:3: ruleItemInContainerDeclaration
                    {
                     before(grammarAccess.getItemDeclarationAccess().getItemInContainerDeclarationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleItemInContainerDeclaration();

                    state._fsp--;

                     after(grammarAccess.getItemDeclarationAccess().getItemInContainerDeclarationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRinform.g:443:2: ( ruleContainerDeclaration )
                    {
                    // InternalRinform.g:443:2: ( ruleContainerDeclaration )
                    // InternalRinform.g:444:3: ruleContainerDeclaration
                    {
                     before(grammarAccess.getItemDeclarationAccess().getContainerDeclarationParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleContainerDeclaration();

                    state._fsp--;

                     after(grammarAccess.getItemDeclarationAccess().getContainerDeclarationParserRuleCall_2()); 

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
    // $ANTLR end "rule__ItemDeclaration__Alternatives"


    // $ANTLR start "rule__Symbol__SymbolAlternatives_0"
    // InternalRinform.g:453:1: rule__Symbol__SymbolAlternatives_0 : ( ( '.' ) | ( ',' ) | ( ';' ) | ( ':' ) | ( '-' ) | ( '!' ) | ( '?' ) | ( '\\'' ) );
    public final void rule__Symbol__SymbolAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:457:1: ( ( '.' ) | ( ',' ) | ( ';' ) | ( ':' ) | ( '-' ) | ( '!' ) | ( '?' ) | ( '\\'' ) )
            int alt5=8;
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
            case 18:
                {
                alt5=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalRinform.g:458:2: ( '.' )
                    {
                    // InternalRinform.g:458:2: ( '.' )
                    // InternalRinform.g:459:3: '.'
                    {
                     before(grammarAccess.getSymbolAccess().getSymbolFullStopKeyword_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getSymbolAccess().getSymbolFullStopKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRinform.g:464:2: ( ',' )
                    {
                    // InternalRinform.g:464:2: ( ',' )
                    // InternalRinform.g:465:3: ','
                    {
                     before(grammarAccess.getSymbolAccess().getSymbolCommaKeyword_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getSymbolAccess().getSymbolCommaKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRinform.g:470:2: ( ';' )
                    {
                    // InternalRinform.g:470:2: ( ';' )
                    // InternalRinform.g:471:3: ';'
                    {
                     before(grammarAccess.getSymbolAccess().getSymbolSemicolonKeyword_0_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getSymbolAccess().getSymbolSemicolonKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRinform.g:476:2: ( ':' )
                    {
                    // InternalRinform.g:476:2: ( ':' )
                    // InternalRinform.g:477:3: ':'
                    {
                     before(grammarAccess.getSymbolAccess().getSymbolColonKeyword_0_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getSymbolAccess().getSymbolColonKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalRinform.g:482:2: ( '-' )
                    {
                    // InternalRinform.g:482:2: ( '-' )
                    // InternalRinform.g:483:3: '-'
                    {
                     before(grammarAccess.getSymbolAccess().getSymbolHyphenMinusKeyword_0_4()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getSymbolAccess().getSymbolHyphenMinusKeyword_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalRinform.g:488:2: ( '!' )
                    {
                    // InternalRinform.g:488:2: ( '!' )
                    // InternalRinform.g:489:3: '!'
                    {
                     before(grammarAccess.getSymbolAccess().getSymbolExclamationMarkKeyword_0_5()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getSymbolAccess().getSymbolExclamationMarkKeyword_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalRinform.g:494:2: ( '?' )
                    {
                    // InternalRinform.g:494:2: ( '?' )
                    // InternalRinform.g:495:3: '?'
                    {
                     before(grammarAccess.getSymbolAccess().getSymbolQuestionMarkKeyword_0_6()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getSymbolAccess().getSymbolQuestionMarkKeyword_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalRinform.g:500:2: ( '\\'' )
                    {
                    // InternalRinform.g:500:2: ( '\\'' )
                    // InternalRinform.g:501:3: '\\''
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
    // InternalRinform.g:510:1: rule__Direction__Alternatives : ( ( ( 'South' ) ) | ( ( 'North' ) ) | ( ( 'East' ) ) | ( ( 'West' ) ) | ( ( 'Below' ) ) | ( ( 'Above' ) ) );
    public final void rule__Direction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:514:1: ( ( ( 'South' ) ) | ( ( 'North' ) ) | ( ( 'East' ) ) | ( ( 'West' ) ) | ( ( 'Below' ) ) | ( ( 'Above' ) ) )
            int alt6=6;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt6=1;
                }
                break;
            case 20:
                {
                alt6=2;
                }
                break;
            case 21:
                {
                alt6=3;
                }
                break;
            case 22:
                {
                alt6=4;
                }
                break;
            case 23:
                {
                alt6=5;
                }
                break;
            case 24:
                {
                alt6=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalRinform.g:515:2: ( ( 'South' ) )
                    {
                    // InternalRinform.g:515:2: ( ( 'South' ) )
                    // InternalRinform.g:516:3: ( 'South' )
                    {
                     before(grammarAccess.getDirectionAccess().getSouthEnumLiteralDeclaration_0()); 
                    // InternalRinform.g:517:3: ( 'South' )
                    // InternalRinform.g:517:4: 'South'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectionAccess().getSouthEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRinform.g:521:2: ( ( 'North' ) )
                    {
                    // InternalRinform.g:521:2: ( ( 'North' ) )
                    // InternalRinform.g:522:3: ( 'North' )
                    {
                     before(grammarAccess.getDirectionAccess().getNorthEnumLiteralDeclaration_1()); 
                    // InternalRinform.g:523:3: ( 'North' )
                    // InternalRinform.g:523:4: 'North'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectionAccess().getNorthEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRinform.g:527:2: ( ( 'East' ) )
                    {
                    // InternalRinform.g:527:2: ( ( 'East' ) )
                    // InternalRinform.g:528:3: ( 'East' )
                    {
                     before(grammarAccess.getDirectionAccess().getEastEnumLiteralDeclaration_2()); 
                    // InternalRinform.g:529:3: ( 'East' )
                    // InternalRinform.g:529:4: 'East'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectionAccess().getEastEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRinform.g:533:2: ( ( 'West' ) )
                    {
                    // InternalRinform.g:533:2: ( ( 'West' ) )
                    // InternalRinform.g:534:3: ( 'West' )
                    {
                     before(grammarAccess.getDirectionAccess().getWestEnumLiteralDeclaration_3()); 
                    // InternalRinform.g:535:3: ( 'West' )
                    // InternalRinform.g:535:4: 'West'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectionAccess().getWestEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalRinform.g:539:2: ( ( 'Below' ) )
                    {
                    // InternalRinform.g:539:2: ( ( 'Below' ) )
                    // InternalRinform.g:540:3: ( 'Below' )
                    {
                     before(grammarAccess.getDirectionAccess().getBelowEnumLiteralDeclaration_4()); 
                    // InternalRinform.g:541:3: ( 'Below' )
                    // InternalRinform.g:541:4: 'Below'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectionAccess().getBelowEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalRinform.g:545:2: ( ( 'Above' ) )
                    {
                    // InternalRinform.g:545:2: ( ( 'Above' ) )
                    // InternalRinform.g:546:3: ( 'Above' )
                    {
                     before(grammarAccess.getDirectionAccess().getAboveEnumLiteralDeclaration_5()); 
                    // InternalRinform.g:547:3: ( 'Above' )
                    // InternalRinform.g:547:4: 'Above'
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
    // InternalRinform.g:555:1: rule__RoomDeclaration__Group__0 : rule__RoomDeclaration__Group__0__Impl rule__RoomDeclaration__Group__1 ;
    public final void rule__RoomDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:559:1: ( rule__RoomDeclaration__Group__0__Impl rule__RoomDeclaration__Group__1 )
            // InternalRinform.g:560:2: rule__RoomDeclaration__Group__0__Impl rule__RoomDeclaration__Group__1
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
    // InternalRinform.g:567:1: rule__RoomDeclaration__Group__0__Impl : ( '-r' ) ;
    public final void rule__RoomDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:571:1: ( ( '-r' ) )
            // InternalRinform.g:572:1: ( '-r' )
            {
            // InternalRinform.g:572:1: ( '-r' )
            // InternalRinform.g:573:2: '-r'
            {
             before(grammarAccess.getRoomDeclarationAccess().getRKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getRoomDeclarationAccess().getRKeyword_0()); 

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
    // InternalRinform.g:582:1: rule__RoomDeclaration__Group__1 : rule__RoomDeclaration__Group__1__Impl ;
    public final void rule__RoomDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:586:1: ( rule__RoomDeclaration__Group__1__Impl )
            // InternalRinform.g:587:2: rule__RoomDeclaration__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RoomDeclaration__Group__1__Impl();

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
    // InternalRinform.g:593:1: rule__RoomDeclaration__Group__1__Impl : ( ( rule__RoomDeclaration__NameAssignment_1 ) ) ;
    public final void rule__RoomDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:597:1: ( ( ( rule__RoomDeclaration__NameAssignment_1 ) ) )
            // InternalRinform.g:598:1: ( ( rule__RoomDeclaration__NameAssignment_1 ) )
            {
            // InternalRinform.g:598:1: ( ( rule__RoomDeclaration__NameAssignment_1 ) )
            // InternalRinform.g:599:2: ( rule__RoomDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getRoomDeclarationAccess().getNameAssignment_1()); 
            // InternalRinform.g:600:2: ( rule__RoomDeclaration__NameAssignment_1 )
            // InternalRinform.g:600:3: rule__RoomDeclaration__NameAssignment_1
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


    // $ANTLR start "rule__RoomDescription__Group__0"
    // InternalRinform.g:609:1: rule__RoomDescription__Group__0 : rule__RoomDescription__Group__0__Impl rule__RoomDescription__Group__1 ;
    public final void rule__RoomDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:613:1: ( rule__RoomDescription__Group__0__Impl rule__RoomDescription__Group__1 )
            // InternalRinform.g:614:2: rule__RoomDescription__Group__0__Impl rule__RoomDescription__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalRinform.g:621:1: rule__RoomDescription__Group__0__Impl : ( '(' ) ;
    public final void rule__RoomDescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:625:1: ( ( '(' ) )
            // InternalRinform.g:626:1: ( '(' )
            {
            // InternalRinform.g:626:1: ( '(' )
            // InternalRinform.g:627:2: '('
            {
             before(grammarAccess.getRoomDescriptionAccess().getLeftParenthesisKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalRinform.g:636:1: rule__RoomDescription__Group__1 : rule__RoomDescription__Group__1__Impl rule__RoomDescription__Group__2 ;
    public final void rule__RoomDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:640:1: ( rule__RoomDescription__Group__1__Impl rule__RoomDescription__Group__2 )
            // InternalRinform.g:641:2: rule__RoomDescription__Group__1__Impl rule__RoomDescription__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalRinform.g:648:1: rule__RoomDescription__Group__1__Impl : ( ( ( rule__RoomDescription__RoomDescriptionAssignment_1 ) ) ( ( rule__RoomDescription__RoomDescriptionAssignment_1 )* ) ) ;
    public final void rule__RoomDescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:652:1: ( ( ( ( rule__RoomDescription__RoomDescriptionAssignment_1 ) ) ( ( rule__RoomDescription__RoomDescriptionAssignment_1 )* ) ) )
            // InternalRinform.g:653:1: ( ( ( rule__RoomDescription__RoomDescriptionAssignment_1 ) ) ( ( rule__RoomDescription__RoomDescriptionAssignment_1 )* ) )
            {
            // InternalRinform.g:653:1: ( ( ( rule__RoomDescription__RoomDescriptionAssignment_1 ) ) ( ( rule__RoomDescription__RoomDescriptionAssignment_1 )* ) )
            // InternalRinform.g:654:2: ( ( rule__RoomDescription__RoomDescriptionAssignment_1 ) ) ( ( rule__RoomDescription__RoomDescriptionAssignment_1 )* )
            {
            // InternalRinform.g:654:2: ( ( rule__RoomDescription__RoomDescriptionAssignment_1 ) )
            // InternalRinform.g:655:3: ( rule__RoomDescription__RoomDescriptionAssignment_1 )
            {
             before(grammarAccess.getRoomDescriptionAccess().getRoomDescriptionAssignment_1()); 
            // InternalRinform.g:656:3: ( rule__RoomDescription__RoomDescriptionAssignment_1 )
            // InternalRinform.g:656:4: rule__RoomDescription__RoomDescriptionAssignment_1
            {
            pushFollow(FOLLOW_4);
            rule__RoomDescription__RoomDescriptionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRoomDescriptionAccess().getRoomDescriptionAssignment_1()); 

            }

            // InternalRinform.g:659:2: ( ( rule__RoomDescription__RoomDescriptionAssignment_1 )* )
            // InternalRinform.g:660:3: ( rule__RoomDescription__RoomDescriptionAssignment_1 )*
            {
             before(grammarAccess.getRoomDescriptionAccess().getRoomDescriptionAssignment_1()); 
            // InternalRinform.g:661:3: ( rule__RoomDescription__RoomDescriptionAssignment_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalRinform.g:661:4: rule__RoomDescription__RoomDescriptionAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__RoomDescription__RoomDescriptionAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getRoomDescriptionAccess().getRoomDescriptionAssignment_1()); 

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
    // $ANTLR end "rule__RoomDescription__Group__1__Impl"


    // $ANTLR start "rule__RoomDescription__Group__2"
    // InternalRinform.g:670:1: rule__RoomDescription__Group__2 : rule__RoomDescription__Group__2__Impl rule__RoomDescription__Group__3 ;
    public final void rule__RoomDescription__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:674:1: ( rule__RoomDescription__Group__2__Impl rule__RoomDescription__Group__3 )
            // InternalRinform.g:675:2: rule__RoomDescription__Group__2__Impl rule__RoomDescription__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalRinform.g:682:1: rule__RoomDescription__Group__2__Impl : ( '-r' ) ;
    public final void rule__RoomDescription__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:686:1: ( ( '-r' ) )
            // InternalRinform.g:687:1: ( '-r' )
            {
            // InternalRinform.g:687:1: ( '-r' )
            // InternalRinform.g:688:2: '-r'
            {
             before(grammarAccess.getRoomDescriptionAccess().getRKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getRoomDescriptionAccess().getRKeyword_2()); 

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
    // InternalRinform.g:697:1: rule__RoomDescription__Group__3 : rule__RoomDescription__Group__3__Impl rule__RoomDescription__Group__4 ;
    public final void rule__RoomDescription__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:701:1: ( rule__RoomDescription__Group__3__Impl rule__RoomDescription__Group__4 )
            // InternalRinform.g:702:2: rule__RoomDescription__Group__3__Impl rule__RoomDescription__Group__4
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
    // InternalRinform.g:709:1: rule__RoomDescription__Group__3__Impl : ( ( rule__RoomDescription__RoomAssignment_3 ) ) ;
    public final void rule__RoomDescription__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:713:1: ( ( ( rule__RoomDescription__RoomAssignment_3 ) ) )
            // InternalRinform.g:714:1: ( ( rule__RoomDescription__RoomAssignment_3 ) )
            {
            // InternalRinform.g:714:1: ( ( rule__RoomDescription__RoomAssignment_3 ) )
            // InternalRinform.g:715:2: ( rule__RoomDescription__RoomAssignment_3 )
            {
             before(grammarAccess.getRoomDescriptionAccess().getRoomAssignment_3()); 
            // InternalRinform.g:716:2: ( rule__RoomDescription__RoomAssignment_3 )
            // InternalRinform.g:716:3: rule__RoomDescription__RoomAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__RoomDescription__RoomAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRoomDescriptionAccess().getRoomAssignment_3()); 

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
    // InternalRinform.g:724:1: rule__RoomDescription__Group__4 : rule__RoomDescription__Group__4__Impl ;
    public final void rule__RoomDescription__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:728:1: ( rule__RoomDescription__Group__4__Impl )
            // InternalRinform.g:729:2: rule__RoomDescription__Group__4__Impl
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
    // InternalRinform.g:735:1: rule__RoomDescription__Group__4__Impl : ( ')' ) ;
    public final void rule__RoomDescription__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:739:1: ( ( ')' ) )
            // InternalRinform.g:740:1: ( ')' )
            {
            // InternalRinform.g:740:1: ( ')' )
            // InternalRinform.g:741:2: ')'
            {
             before(grammarAccess.getRoomDescriptionAccess().getRightParenthesisKeyword_4()); 
            match(input,27,FOLLOW_2); 
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


    // $ANTLR start "rule__ContainerDeclaration__Group__0"
    // InternalRinform.g:751:1: rule__ContainerDeclaration__Group__0 : rule__ContainerDeclaration__Group__0__Impl rule__ContainerDeclaration__Group__1 ;
    public final void rule__ContainerDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:755:1: ( rule__ContainerDeclaration__Group__0__Impl rule__ContainerDeclaration__Group__1 )
            // InternalRinform.g:756:2: rule__ContainerDeclaration__Group__0__Impl rule__ContainerDeclaration__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__ContainerDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContainerDeclaration__Group__1();

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
    // $ANTLR end "rule__ContainerDeclaration__Group__0"


    // $ANTLR start "rule__ContainerDeclaration__Group__0__Impl"
    // InternalRinform.g:763:1: rule__ContainerDeclaration__Group__0__Impl : ( '-c' ) ;
    public final void rule__ContainerDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:767:1: ( ( '-c' ) )
            // InternalRinform.g:768:1: ( '-c' )
            {
            // InternalRinform.g:768:1: ( '-c' )
            // InternalRinform.g:769:2: '-c'
            {
             before(grammarAccess.getContainerDeclarationAccess().getCKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getContainerDeclarationAccess().getCKeyword_0()); 

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
    // $ANTLR end "rule__ContainerDeclaration__Group__0__Impl"


    // $ANTLR start "rule__ContainerDeclaration__Group__1"
    // InternalRinform.g:778:1: rule__ContainerDeclaration__Group__1 : rule__ContainerDeclaration__Group__1__Impl rule__ContainerDeclaration__Group__2 ;
    public final void rule__ContainerDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:782:1: ( rule__ContainerDeclaration__Group__1__Impl rule__ContainerDeclaration__Group__2 )
            // InternalRinform.g:783:2: rule__ContainerDeclaration__Group__1__Impl rule__ContainerDeclaration__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__ContainerDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContainerDeclaration__Group__2();

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
    // $ANTLR end "rule__ContainerDeclaration__Group__1"


    // $ANTLR start "rule__ContainerDeclaration__Group__1__Impl"
    // InternalRinform.g:790:1: rule__ContainerDeclaration__Group__1__Impl : ( ( rule__ContainerDeclaration__NameAssignment_1 ) ) ;
    public final void rule__ContainerDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:794:1: ( ( ( rule__ContainerDeclaration__NameAssignment_1 ) ) )
            // InternalRinform.g:795:1: ( ( rule__ContainerDeclaration__NameAssignment_1 ) )
            {
            // InternalRinform.g:795:1: ( ( rule__ContainerDeclaration__NameAssignment_1 ) )
            // InternalRinform.g:796:2: ( rule__ContainerDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getContainerDeclarationAccess().getNameAssignment_1()); 
            // InternalRinform.g:797:2: ( rule__ContainerDeclaration__NameAssignment_1 )
            // InternalRinform.g:797:3: rule__ContainerDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ContainerDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getContainerDeclarationAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__ContainerDeclaration__Group__1__Impl"


    // $ANTLR start "rule__ContainerDeclaration__Group__2"
    // InternalRinform.g:805:1: rule__ContainerDeclaration__Group__2 : rule__ContainerDeclaration__Group__2__Impl rule__ContainerDeclaration__Group__3 ;
    public final void rule__ContainerDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:809:1: ( rule__ContainerDeclaration__Group__2__Impl rule__ContainerDeclaration__Group__3 )
            // InternalRinform.g:810:2: rule__ContainerDeclaration__Group__2__Impl rule__ContainerDeclaration__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__ContainerDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContainerDeclaration__Group__3();

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
    // $ANTLR end "rule__ContainerDeclaration__Group__2"


    // $ANTLR start "rule__ContainerDeclaration__Group__2__Impl"
    // InternalRinform.g:817:1: rule__ContainerDeclaration__Group__2__Impl : ( '-r' ) ;
    public final void rule__ContainerDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:821:1: ( ( '-r' ) )
            // InternalRinform.g:822:1: ( '-r' )
            {
            // InternalRinform.g:822:1: ( '-r' )
            // InternalRinform.g:823:2: '-r'
            {
             before(grammarAccess.getContainerDeclarationAccess().getRKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getContainerDeclarationAccess().getRKeyword_2()); 

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
    // $ANTLR end "rule__ContainerDeclaration__Group__2__Impl"


    // $ANTLR start "rule__ContainerDeclaration__Group__3"
    // InternalRinform.g:832:1: rule__ContainerDeclaration__Group__3 : rule__ContainerDeclaration__Group__3__Impl ;
    public final void rule__ContainerDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:836:1: ( rule__ContainerDeclaration__Group__3__Impl )
            // InternalRinform.g:837:2: rule__ContainerDeclaration__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ContainerDeclaration__Group__3__Impl();

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
    // $ANTLR end "rule__ContainerDeclaration__Group__3"


    // $ANTLR start "rule__ContainerDeclaration__Group__3__Impl"
    // InternalRinform.g:843:1: rule__ContainerDeclaration__Group__3__Impl : ( ( rule__ContainerDeclaration__RoomAssignment_3 ) ) ;
    public final void rule__ContainerDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:847:1: ( ( ( rule__ContainerDeclaration__RoomAssignment_3 ) ) )
            // InternalRinform.g:848:1: ( ( rule__ContainerDeclaration__RoomAssignment_3 ) )
            {
            // InternalRinform.g:848:1: ( ( rule__ContainerDeclaration__RoomAssignment_3 ) )
            // InternalRinform.g:849:2: ( rule__ContainerDeclaration__RoomAssignment_3 )
            {
             before(grammarAccess.getContainerDeclarationAccess().getRoomAssignment_3()); 
            // InternalRinform.g:850:2: ( rule__ContainerDeclaration__RoomAssignment_3 )
            // InternalRinform.g:850:3: rule__ContainerDeclaration__RoomAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ContainerDeclaration__RoomAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getContainerDeclarationAccess().getRoomAssignment_3()); 

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
    // $ANTLR end "rule__ContainerDeclaration__Group__3__Impl"


    // $ANTLR start "rule__ItemInContainerDeclaration__Group__0"
    // InternalRinform.g:859:1: rule__ItemInContainerDeclaration__Group__0 : rule__ItemInContainerDeclaration__Group__0__Impl rule__ItemInContainerDeclaration__Group__1 ;
    public final void rule__ItemInContainerDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:863:1: ( rule__ItemInContainerDeclaration__Group__0__Impl rule__ItemInContainerDeclaration__Group__1 )
            // InternalRinform.g:864:2: rule__ItemInContainerDeclaration__Group__0__Impl rule__ItemInContainerDeclaration__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__ItemInContainerDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ItemInContainerDeclaration__Group__1();

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
    // $ANTLR end "rule__ItemInContainerDeclaration__Group__0"


    // $ANTLR start "rule__ItemInContainerDeclaration__Group__0__Impl"
    // InternalRinform.g:871:1: rule__ItemInContainerDeclaration__Group__0__Impl : ( '-i' ) ;
    public final void rule__ItemInContainerDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:875:1: ( ( '-i' ) )
            // InternalRinform.g:876:1: ( '-i' )
            {
            // InternalRinform.g:876:1: ( '-i' )
            // InternalRinform.g:877:2: '-i'
            {
             before(grammarAccess.getItemInContainerDeclarationAccess().getIKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getItemInContainerDeclarationAccess().getIKeyword_0()); 

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
    // $ANTLR end "rule__ItemInContainerDeclaration__Group__0__Impl"


    // $ANTLR start "rule__ItemInContainerDeclaration__Group__1"
    // InternalRinform.g:886:1: rule__ItemInContainerDeclaration__Group__1 : rule__ItemInContainerDeclaration__Group__1__Impl rule__ItemInContainerDeclaration__Group__2 ;
    public final void rule__ItemInContainerDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:890:1: ( rule__ItemInContainerDeclaration__Group__1__Impl rule__ItemInContainerDeclaration__Group__2 )
            // InternalRinform.g:891:2: rule__ItemInContainerDeclaration__Group__1__Impl rule__ItemInContainerDeclaration__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__ItemInContainerDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ItemInContainerDeclaration__Group__2();

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
    // $ANTLR end "rule__ItemInContainerDeclaration__Group__1"


    // $ANTLR start "rule__ItemInContainerDeclaration__Group__1__Impl"
    // InternalRinform.g:898:1: rule__ItemInContainerDeclaration__Group__1__Impl : ( ( rule__ItemInContainerDeclaration__NameAssignment_1 ) ) ;
    public final void rule__ItemInContainerDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:902:1: ( ( ( rule__ItemInContainerDeclaration__NameAssignment_1 ) ) )
            // InternalRinform.g:903:1: ( ( rule__ItemInContainerDeclaration__NameAssignment_1 ) )
            {
            // InternalRinform.g:903:1: ( ( rule__ItemInContainerDeclaration__NameAssignment_1 ) )
            // InternalRinform.g:904:2: ( rule__ItemInContainerDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getItemInContainerDeclarationAccess().getNameAssignment_1()); 
            // InternalRinform.g:905:2: ( rule__ItemInContainerDeclaration__NameAssignment_1 )
            // InternalRinform.g:905:3: rule__ItemInContainerDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ItemInContainerDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getItemInContainerDeclarationAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__ItemInContainerDeclaration__Group__1__Impl"


    // $ANTLR start "rule__ItemInContainerDeclaration__Group__2"
    // InternalRinform.g:913:1: rule__ItemInContainerDeclaration__Group__2 : rule__ItemInContainerDeclaration__Group__2__Impl rule__ItemInContainerDeclaration__Group__3 ;
    public final void rule__ItemInContainerDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:917:1: ( rule__ItemInContainerDeclaration__Group__2__Impl rule__ItemInContainerDeclaration__Group__3 )
            // InternalRinform.g:918:2: rule__ItemInContainerDeclaration__Group__2__Impl rule__ItemInContainerDeclaration__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__ItemInContainerDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ItemInContainerDeclaration__Group__3();

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
    // $ANTLR end "rule__ItemInContainerDeclaration__Group__2"


    // $ANTLR start "rule__ItemInContainerDeclaration__Group__2__Impl"
    // InternalRinform.g:925:1: rule__ItemInContainerDeclaration__Group__2__Impl : ( '-c' ) ;
    public final void rule__ItemInContainerDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:929:1: ( ( '-c' ) )
            // InternalRinform.g:930:1: ( '-c' )
            {
            // InternalRinform.g:930:1: ( '-c' )
            // InternalRinform.g:931:2: '-c'
            {
             before(grammarAccess.getItemInContainerDeclarationAccess().getCKeyword_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getItemInContainerDeclarationAccess().getCKeyword_2()); 

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
    // $ANTLR end "rule__ItemInContainerDeclaration__Group__2__Impl"


    // $ANTLR start "rule__ItemInContainerDeclaration__Group__3"
    // InternalRinform.g:940:1: rule__ItemInContainerDeclaration__Group__3 : rule__ItemInContainerDeclaration__Group__3__Impl ;
    public final void rule__ItemInContainerDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:944:1: ( rule__ItemInContainerDeclaration__Group__3__Impl )
            // InternalRinform.g:945:2: rule__ItemInContainerDeclaration__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ItemInContainerDeclaration__Group__3__Impl();

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
    // $ANTLR end "rule__ItemInContainerDeclaration__Group__3"


    // $ANTLR start "rule__ItemInContainerDeclaration__Group__3__Impl"
    // InternalRinform.g:951:1: rule__ItemInContainerDeclaration__Group__3__Impl : ( ( rule__ItemInContainerDeclaration__ContainerAssignment_3 ) ) ;
    public final void rule__ItemInContainerDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:955:1: ( ( ( rule__ItemInContainerDeclaration__ContainerAssignment_3 ) ) )
            // InternalRinform.g:956:1: ( ( rule__ItemInContainerDeclaration__ContainerAssignment_3 ) )
            {
            // InternalRinform.g:956:1: ( ( rule__ItemInContainerDeclaration__ContainerAssignment_3 ) )
            // InternalRinform.g:957:2: ( rule__ItemInContainerDeclaration__ContainerAssignment_3 )
            {
             before(grammarAccess.getItemInContainerDeclarationAccess().getContainerAssignment_3()); 
            // InternalRinform.g:958:2: ( rule__ItemInContainerDeclaration__ContainerAssignment_3 )
            // InternalRinform.g:958:3: rule__ItemInContainerDeclaration__ContainerAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ItemInContainerDeclaration__ContainerAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getItemInContainerDeclarationAccess().getContainerAssignment_3()); 

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
    // $ANTLR end "rule__ItemInContainerDeclaration__Group__3__Impl"


    // $ANTLR start "rule__ItemDeclaration__Group_0__0"
    // InternalRinform.g:967:1: rule__ItemDeclaration__Group_0__0 : rule__ItemDeclaration__Group_0__0__Impl rule__ItemDeclaration__Group_0__1 ;
    public final void rule__ItemDeclaration__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:971:1: ( rule__ItemDeclaration__Group_0__0__Impl rule__ItemDeclaration__Group_0__1 )
            // InternalRinform.g:972:2: rule__ItemDeclaration__Group_0__0__Impl rule__ItemDeclaration__Group_0__1
            {
            pushFollow(FOLLOW_5);
            rule__ItemDeclaration__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ItemDeclaration__Group_0__1();

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
    // $ANTLR end "rule__ItemDeclaration__Group_0__0"


    // $ANTLR start "rule__ItemDeclaration__Group_0__0__Impl"
    // InternalRinform.g:979:1: rule__ItemDeclaration__Group_0__0__Impl : ( '-i' ) ;
    public final void rule__ItemDeclaration__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:983:1: ( ( '-i' ) )
            // InternalRinform.g:984:1: ( '-i' )
            {
            // InternalRinform.g:984:1: ( '-i' )
            // InternalRinform.g:985:2: '-i'
            {
             before(grammarAccess.getItemDeclarationAccess().getIKeyword_0_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getItemDeclarationAccess().getIKeyword_0_0()); 

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
    // $ANTLR end "rule__ItemDeclaration__Group_0__0__Impl"


    // $ANTLR start "rule__ItemDeclaration__Group_0__1"
    // InternalRinform.g:994:1: rule__ItemDeclaration__Group_0__1 : rule__ItemDeclaration__Group_0__1__Impl rule__ItemDeclaration__Group_0__2 ;
    public final void rule__ItemDeclaration__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:998:1: ( rule__ItemDeclaration__Group_0__1__Impl rule__ItemDeclaration__Group_0__2 )
            // InternalRinform.g:999:2: rule__ItemDeclaration__Group_0__1__Impl rule__ItemDeclaration__Group_0__2
            {
            pushFollow(FOLLOW_6);
            rule__ItemDeclaration__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ItemDeclaration__Group_0__2();

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
    // $ANTLR end "rule__ItemDeclaration__Group_0__1"


    // $ANTLR start "rule__ItemDeclaration__Group_0__1__Impl"
    // InternalRinform.g:1006:1: rule__ItemDeclaration__Group_0__1__Impl : ( ( rule__ItemDeclaration__NameAssignment_0_1 ) ) ;
    public final void rule__ItemDeclaration__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1010:1: ( ( ( rule__ItemDeclaration__NameAssignment_0_1 ) ) )
            // InternalRinform.g:1011:1: ( ( rule__ItemDeclaration__NameAssignment_0_1 ) )
            {
            // InternalRinform.g:1011:1: ( ( rule__ItemDeclaration__NameAssignment_0_1 ) )
            // InternalRinform.g:1012:2: ( rule__ItemDeclaration__NameAssignment_0_1 )
            {
             before(grammarAccess.getItemDeclarationAccess().getNameAssignment_0_1()); 
            // InternalRinform.g:1013:2: ( rule__ItemDeclaration__NameAssignment_0_1 )
            // InternalRinform.g:1013:3: rule__ItemDeclaration__NameAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__ItemDeclaration__NameAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getItemDeclarationAccess().getNameAssignment_0_1()); 

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
    // $ANTLR end "rule__ItemDeclaration__Group_0__1__Impl"


    // $ANTLR start "rule__ItemDeclaration__Group_0__2"
    // InternalRinform.g:1021:1: rule__ItemDeclaration__Group_0__2 : rule__ItemDeclaration__Group_0__2__Impl rule__ItemDeclaration__Group_0__3 ;
    public final void rule__ItemDeclaration__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1025:1: ( rule__ItemDeclaration__Group_0__2__Impl rule__ItemDeclaration__Group_0__3 )
            // InternalRinform.g:1026:2: rule__ItemDeclaration__Group_0__2__Impl rule__ItemDeclaration__Group_0__3
            {
            pushFollow(FOLLOW_5);
            rule__ItemDeclaration__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ItemDeclaration__Group_0__3();

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
    // $ANTLR end "rule__ItemDeclaration__Group_0__2"


    // $ANTLR start "rule__ItemDeclaration__Group_0__2__Impl"
    // InternalRinform.g:1033:1: rule__ItemDeclaration__Group_0__2__Impl : ( '-r' ) ;
    public final void rule__ItemDeclaration__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1037:1: ( ( '-r' ) )
            // InternalRinform.g:1038:1: ( '-r' )
            {
            // InternalRinform.g:1038:1: ( '-r' )
            // InternalRinform.g:1039:2: '-r'
            {
             before(grammarAccess.getItemDeclarationAccess().getRKeyword_0_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getItemDeclarationAccess().getRKeyword_0_2()); 

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
    // $ANTLR end "rule__ItemDeclaration__Group_0__2__Impl"


    // $ANTLR start "rule__ItemDeclaration__Group_0__3"
    // InternalRinform.g:1048:1: rule__ItemDeclaration__Group_0__3 : rule__ItemDeclaration__Group_0__3__Impl ;
    public final void rule__ItemDeclaration__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1052:1: ( rule__ItemDeclaration__Group_0__3__Impl )
            // InternalRinform.g:1053:2: rule__ItemDeclaration__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ItemDeclaration__Group_0__3__Impl();

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
    // $ANTLR end "rule__ItemDeclaration__Group_0__3"


    // $ANTLR start "rule__ItemDeclaration__Group_0__3__Impl"
    // InternalRinform.g:1059:1: rule__ItemDeclaration__Group_0__3__Impl : ( ( rule__ItemDeclaration__RoomAssignment_0_3 ) ) ;
    public final void rule__ItemDeclaration__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1063:1: ( ( ( rule__ItemDeclaration__RoomAssignment_0_3 ) ) )
            // InternalRinform.g:1064:1: ( ( rule__ItemDeclaration__RoomAssignment_0_3 ) )
            {
            // InternalRinform.g:1064:1: ( ( rule__ItemDeclaration__RoomAssignment_0_3 ) )
            // InternalRinform.g:1065:2: ( rule__ItemDeclaration__RoomAssignment_0_3 )
            {
             before(grammarAccess.getItemDeclarationAccess().getRoomAssignment_0_3()); 
            // InternalRinform.g:1066:2: ( rule__ItemDeclaration__RoomAssignment_0_3 )
            // InternalRinform.g:1066:3: rule__ItemDeclaration__RoomAssignment_0_3
            {
            pushFollow(FOLLOW_2);
            rule__ItemDeclaration__RoomAssignment_0_3();

            state._fsp--;


            }

             after(grammarAccess.getItemDeclarationAccess().getRoomAssignment_0_3()); 

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
    // $ANTLR end "rule__ItemDeclaration__Group_0__3__Impl"


    // $ANTLR start "rule__ItemDescription__Group__0"
    // InternalRinform.g:1075:1: rule__ItemDescription__Group__0 : rule__ItemDescription__Group__0__Impl rule__ItemDescription__Group__1 ;
    public final void rule__ItemDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1079:1: ( rule__ItemDescription__Group__0__Impl rule__ItemDescription__Group__1 )
            // InternalRinform.g:1080:2: rule__ItemDescription__Group__0__Impl rule__ItemDescription__Group__1
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
    // InternalRinform.g:1087:1: rule__ItemDescription__Group__0__Impl : ( '(' ) ;
    public final void rule__ItemDescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1091:1: ( ( '(' ) )
            // InternalRinform.g:1092:1: ( '(' )
            {
            // InternalRinform.g:1092:1: ( '(' )
            // InternalRinform.g:1093:2: '('
            {
             before(grammarAccess.getItemDescriptionAccess().getLeftParenthesisKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getItemDescriptionAccess().getLeftParenthesisKeyword_0()); 

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
    // InternalRinform.g:1102:1: rule__ItemDescription__Group__1 : rule__ItemDescription__Group__1__Impl rule__ItemDescription__Group__2 ;
    public final void rule__ItemDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1106:1: ( rule__ItemDescription__Group__1__Impl rule__ItemDescription__Group__2 )
            // InternalRinform.g:1107:2: rule__ItemDescription__Group__1__Impl rule__ItemDescription__Group__2
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
    // InternalRinform.g:1114:1: rule__ItemDescription__Group__1__Impl : ( ( ( rule__ItemDescription__ItemDescriptionAssignment_1 ) ) ( ( rule__ItemDescription__ItemDescriptionAssignment_1 )* ) ) ;
    public final void rule__ItemDescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1118:1: ( ( ( ( rule__ItemDescription__ItemDescriptionAssignment_1 ) ) ( ( rule__ItemDescription__ItemDescriptionAssignment_1 )* ) ) )
            // InternalRinform.g:1119:1: ( ( ( rule__ItemDescription__ItemDescriptionAssignment_1 ) ) ( ( rule__ItemDescription__ItemDescriptionAssignment_1 )* ) )
            {
            // InternalRinform.g:1119:1: ( ( ( rule__ItemDescription__ItemDescriptionAssignment_1 ) ) ( ( rule__ItemDescription__ItemDescriptionAssignment_1 )* ) )
            // InternalRinform.g:1120:2: ( ( rule__ItemDescription__ItemDescriptionAssignment_1 ) ) ( ( rule__ItemDescription__ItemDescriptionAssignment_1 )* )
            {
            // InternalRinform.g:1120:2: ( ( rule__ItemDescription__ItemDescriptionAssignment_1 ) )
            // InternalRinform.g:1121:3: ( rule__ItemDescription__ItemDescriptionAssignment_1 )
            {
             before(grammarAccess.getItemDescriptionAccess().getItemDescriptionAssignment_1()); 
            // InternalRinform.g:1122:3: ( rule__ItemDescription__ItemDescriptionAssignment_1 )
            // InternalRinform.g:1122:4: rule__ItemDescription__ItemDescriptionAssignment_1
            {
            pushFollow(FOLLOW_4);
            rule__ItemDescription__ItemDescriptionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getItemDescriptionAccess().getItemDescriptionAssignment_1()); 

            }

            // InternalRinform.g:1125:2: ( ( rule__ItemDescription__ItemDescriptionAssignment_1 )* )
            // InternalRinform.g:1126:3: ( rule__ItemDescription__ItemDescriptionAssignment_1 )*
            {
             before(grammarAccess.getItemDescriptionAccess().getItemDescriptionAssignment_1()); 
            // InternalRinform.g:1127:3: ( rule__ItemDescription__ItemDescriptionAssignment_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalRinform.g:1127:4: rule__ItemDescription__ItemDescriptionAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__ItemDescription__ItemDescriptionAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getItemDescriptionAccess().getItemDescriptionAssignment_1()); 

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
    // $ANTLR end "rule__ItemDescription__Group__1__Impl"


    // $ANTLR start "rule__ItemDescription__Group__2"
    // InternalRinform.g:1136:1: rule__ItemDescription__Group__2 : rule__ItemDescription__Group__2__Impl rule__ItemDescription__Group__3 ;
    public final void rule__ItemDescription__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1140:1: ( rule__ItemDescription__Group__2__Impl rule__ItemDescription__Group__3 )
            // InternalRinform.g:1141:2: rule__ItemDescription__Group__2__Impl rule__ItemDescription__Group__3
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
    // InternalRinform.g:1148:1: rule__ItemDescription__Group__2__Impl : ( '-i' ) ;
    public final void rule__ItemDescription__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1152:1: ( ( '-i' ) )
            // InternalRinform.g:1153:1: ( '-i' )
            {
            // InternalRinform.g:1153:1: ( '-i' )
            // InternalRinform.g:1154:2: '-i'
            {
             before(grammarAccess.getItemDescriptionAccess().getIKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getItemDescriptionAccess().getIKeyword_2()); 

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
    // InternalRinform.g:1163:1: rule__ItemDescription__Group__3 : rule__ItemDescription__Group__3__Impl rule__ItemDescription__Group__4 ;
    public final void rule__ItemDescription__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1167:1: ( rule__ItemDescription__Group__3__Impl rule__ItemDescription__Group__4 )
            // InternalRinform.g:1168:2: rule__ItemDescription__Group__3__Impl rule__ItemDescription__Group__4
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
    // InternalRinform.g:1175:1: rule__ItemDescription__Group__3__Impl : ( ( rule__ItemDescription__ItemAssignment_3 ) ) ;
    public final void rule__ItemDescription__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1179:1: ( ( ( rule__ItemDescription__ItemAssignment_3 ) ) )
            // InternalRinform.g:1180:1: ( ( rule__ItemDescription__ItemAssignment_3 ) )
            {
            // InternalRinform.g:1180:1: ( ( rule__ItemDescription__ItemAssignment_3 ) )
            // InternalRinform.g:1181:2: ( rule__ItemDescription__ItemAssignment_3 )
            {
             before(grammarAccess.getItemDescriptionAccess().getItemAssignment_3()); 
            // InternalRinform.g:1182:2: ( rule__ItemDescription__ItemAssignment_3 )
            // InternalRinform.g:1182:3: rule__ItemDescription__ItemAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ItemDescription__ItemAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getItemDescriptionAccess().getItemAssignment_3()); 

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
    // InternalRinform.g:1190:1: rule__ItemDescription__Group__4 : rule__ItemDescription__Group__4__Impl ;
    public final void rule__ItemDescription__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1194:1: ( rule__ItemDescription__Group__4__Impl )
            // InternalRinform.g:1195:2: rule__ItemDescription__Group__4__Impl
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
    // InternalRinform.g:1201:1: rule__ItemDescription__Group__4__Impl : ( ')' ) ;
    public final void rule__ItemDescription__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1205:1: ( ( ')' ) )
            // InternalRinform.g:1206:1: ( ')' )
            {
            // InternalRinform.g:1206:1: ( ')' )
            // InternalRinform.g:1207:2: ')'
            {
             before(grammarAccess.getItemDescriptionAccess().getRightParenthesisKeyword_4()); 
            match(input,27,FOLLOW_2); 
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
    // InternalRinform.g:1217:1: rule__DirectionStatement__Group__0 : rule__DirectionStatement__Group__0__Impl rule__DirectionStatement__Group__1 ;
    public final void rule__DirectionStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1221:1: ( rule__DirectionStatement__Group__0__Impl rule__DirectionStatement__Group__1 )
            // InternalRinform.g:1222:2: rule__DirectionStatement__Group__0__Impl rule__DirectionStatement__Group__1
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
    // InternalRinform.g:1229:1: rule__DirectionStatement__Group__0__Impl : ( '<' ) ;
    public final void rule__DirectionStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1233:1: ( ( '<' ) )
            // InternalRinform.g:1234:1: ( '<' )
            {
            // InternalRinform.g:1234:1: ( '<' )
            // InternalRinform.g:1235:2: '<'
            {
             before(grammarAccess.getDirectionStatementAccess().getLessThanSignKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalRinform.g:1244:1: rule__DirectionStatement__Group__1 : rule__DirectionStatement__Group__1__Impl rule__DirectionStatement__Group__2 ;
    public final void rule__DirectionStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1248:1: ( rule__DirectionStatement__Group__1__Impl rule__DirectionStatement__Group__2 )
            // InternalRinform.g:1249:2: rule__DirectionStatement__Group__1__Impl rule__DirectionStatement__Group__2
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
    // InternalRinform.g:1256:1: rule__DirectionStatement__Group__1__Impl : ( ( rule__DirectionStatement__Room1Assignment_1 ) ) ;
    public final void rule__DirectionStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1260:1: ( ( ( rule__DirectionStatement__Room1Assignment_1 ) ) )
            // InternalRinform.g:1261:1: ( ( rule__DirectionStatement__Room1Assignment_1 ) )
            {
            // InternalRinform.g:1261:1: ( ( rule__DirectionStatement__Room1Assignment_1 ) )
            // InternalRinform.g:1262:2: ( rule__DirectionStatement__Room1Assignment_1 )
            {
             before(grammarAccess.getDirectionStatementAccess().getRoom1Assignment_1()); 
            // InternalRinform.g:1263:2: ( rule__DirectionStatement__Room1Assignment_1 )
            // InternalRinform.g:1263:3: rule__DirectionStatement__Room1Assignment_1
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
    // InternalRinform.g:1271:1: rule__DirectionStatement__Group__2 : rule__DirectionStatement__Group__2__Impl rule__DirectionStatement__Group__3 ;
    public final void rule__DirectionStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1275:1: ( rule__DirectionStatement__Group__2__Impl rule__DirectionStatement__Group__3 )
            // InternalRinform.g:1276:2: rule__DirectionStatement__Group__2__Impl rule__DirectionStatement__Group__3
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
    // InternalRinform.g:1283:1: rule__DirectionStatement__Group__2__Impl : ( ( rule__DirectionStatement__DirectionAssignment_2 ) ) ;
    public final void rule__DirectionStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1287:1: ( ( ( rule__DirectionStatement__DirectionAssignment_2 ) ) )
            // InternalRinform.g:1288:1: ( ( rule__DirectionStatement__DirectionAssignment_2 ) )
            {
            // InternalRinform.g:1288:1: ( ( rule__DirectionStatement__DirectionAssignment_2 ) )
            // InternalRinform.g:1289:2: ( rule__DirectionStatement__DirectionAssignment_2 )
            {
             before(grammarAccess.getDirectionStatementAccess().getDirectionAssignment_2()); 
            // InternalRinform.g:1290:2: ( rule__DirectionStatement__DirectionAssignment_2 )
            // InternalRinform.g:1290:3: rule__DirectionStatement__DirectionAssignment_2
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
    // InternalRinform.g:1298:1: rule__DirectionStatement__Group__3 : rule__DirectionStatement__Group__3__Impl rule__DirectionStatement__Group__4 ;
    public final void rule__DirectionStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1302:1: ( rule__DirectionStatement__Group__3__Impl rule__DirectionStatement__Group__4 )
            // InternalRinform.g:1303:2: rule__DirectionStatement__Group__3__Impl rule__DirectionStatement__Group__4
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
    // InternalRinform.g:1310:1: rule__DirectionStatement__Group__3__Impl : ( ( rule__DirectionStatement__Room2Assignment_3 ) ) ;
    public final void rule__DirectionStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1314:1: ( ( ( rule__DirectionStatement__Room2Assignment_3 ) ) )
            // InternalRinform.g:1315:1: ( ( rule__DirectionStatement__Room2Assignment_3 ) )
            {
            // InternalRinform.g:1315:1: ( ( rule__DirectionStatement__Room2Assignment_3 ) )
            // InternalRinform.g:1316:2: ( rule__DirectionStatement__Room2Assignment_3 )
            {
             before(grammarAccess.getDirectionStatementAccess().getRoom2Assignment_3()); 
            // InternalRinform.g:1317:2: ( rule__DirectionStatement__Room2Assignment_3 )
            // InternalRinform.g:1317:3: rule__DirectionStatement__Room2Assignment_3
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
    // InternalRinform.g:1325:1: rule__DirectionStatement__Group__4 : rule__DirectionStatement__Group__4__Impl ;
    public final void rule__DirectionStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1329:1: ( rule__DirectionStatement__Group__4__Impl )
            // InternalRinform.g:1330:2: rule__DirectionStatement__Group__4__Impl
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
    // InternalRinform.g:1336:1: rule__DirectionStatement__Group__4__Impl : ( '>' ) ;
    public final void rule__DirectionStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1340:1: ( ( '>' ) )
            // InternalRinform.g:1341:1: ( '>' )
            {
            // InternalRinform.g:1341:1: ( '>' )
            // InternalRinform.g:1342:2: '>'
            {
             before(grammarAccess.getDirectionStatementAccess().getGreaterThanSignKeyword_4()); 
            match(input,31,FOLLOW_2); 
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
    // InternalRinform.g:1352:1: rule__Text__Group__0 : rule__Text__Group__0__Impl rule__Text__Group__1 ;
    public final void rule__Text__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1356:1: ( rule__Text__Group__0__Impl rule__Text__Group__1 )
            // InternalRinform.g:1357:2: rule__Text__Group__0__Impl rule__Text__Group__1
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
    // InternalRinform.g:1364:1: rule__Text__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__Text__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1368:1: ( ( RULE_ID ) )
            // InternalRinform.g:1369:1: ( RULE_ID )
            {
            // InternalRinform.g:1369:1: ( RULE_ID )
            // InternalRinform.g:1370:2: RULE_ID
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
    // InternalRinform.g:1379:1: rule__Text__Group__1 : rule__Text__Group__1__Impl ;
    public final void rule__Text__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1383:1: ( rule__Text__Group__1__Impl )
            // InternalRinform.g:1384:2: rule__Text__Group__1__Impl
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
    // InternalRinform.g:1390:1: rule__Text__Group__1__Impl : ( ( rule__Text__Group_1__0 )* ) ;
    public final void rule__Text__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1394:1: ( ( ( rule__Text__Group_1__0 )* ) )
            // InternalRinform.g:1395:1: ( ( rule__Text__Group_1__0 )* )
            {
            // InternalRinform.g:1395:1: ( ( rule__Text__Group_1__0 )* )
            // InternalRinform.g:1396:2: ( rule__Text__Group_1__0 )*
            {
             before(grammarAccess.getTextAccess().getGroup_1()); 
            // InternalRinform.g:1397:2: ( rule__Text__Group_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_WS) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalRinform.g:1397:3: rule__Text__Group_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Text__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalRinform.g:1406:1: rule__Text__Group_1__0 : rule__Text__Group_1__0__Impl rule__Text__Group_1__1 ;
    public final void rule__Text__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1410:1: ( rule__Text__Group_1__0__Impl rule__Text__Group_1__1 )
            // InternalRinform.g:1411:2: rule__Text__Group_1__0__Impl rule__Text__Group_1__1
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
    // InternalRinform.g:1418:1: rule__Text__Group_1__0__Impl : ( RULE_WS ) ;
    public final void rule__Text__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1422:1: ( ( RULE_WS ) )
            // InternalRinform.g:1423:1: ( RULE_WS )
            {
            // InternalRinform.g:1423:1: ( RULE_WS )
            // InternalRinform.g:1424:2: RULE_WS
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
    // InternalRinform.g:1433:1: rule__Text__Group_1__1 : rule__Text__Group_1__1__Impl ;
    public final void rule__Text__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1437:1: ( rule__Text__Group_1__1__Impl )
            // InternalRinform.g:1438:2: rule__Text__Group_1__1__Impl
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
    // InternalRinform.g:1444:1: rule__Text__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__Text__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1448:1: ( ( RULE_ID ) )
            // InternalRinform.g:1449:1: ( RULE_ID )
            {
            // InternalRinform.g:1449:1: ( RULE_ID )
            // InternalRinform.g:1450:2: RULE_ID
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
    // InternalRinform.g:1460:1: rule__ReverseInformProgram__SentencesAssignment : ( ruleSentencePart ) ;
    public final void rule__ReverseInformProgram__SentencesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1464:1: ( ( ruleSentencePart ) )
            // InternalRinform.g:1465:2: ( ruleSentencePart )
            {
            // InternalRinform.g:1465:2: ( ruleSentencePart )
            // InternalRinform.g:1466:3: ruleSentencePart
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
    // InternalRinform.g:1475:1: rule__RoomDeclaration__NameAssignment_1 : ( ruleText ) ;
    public final void rule__RoomDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1479:1: ( ( ruleText ) )
            // InternalRinform.g:1480:2: ( ruleText )
            {
            // InternalRinform.g:1480:2: ( ruleText )
            // InternalRinform.g:1481:3: ruleText
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


    // $ANTLR start "rule__RoomDescription__RoomDescriptionAssignment_1"
    // InternalRinform.g:1490:1: rule__RoomDescription__RoomDescriptionAssignment_1 : ( ruleText ) ;
    public final void rule__RoomDescription__RoomDescriptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1494:1: ( ( ruleText ) )
            // InternalRinform.g:1495:2: ( ruleText )
            {
            // InternalRinform.g:1495:2: ( ruleText )
            // InternalRinform.g:1496:3: ruleText
            {
             before(grammarAccess.getRoomDescriptionAccess().getRoomDescriptionTextParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getRoomDescriptionAccess().getRoomDescriptionTextParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__RoomDescription__RoomDescriptionAssignment_1"


    // $ANTLR start "rule__RoomDescription__RoomAssignment_3"
    // InternalRinform.g:1505:1: rule__RoomDescription__RoomAssignment_3 : ( ( ruleText ) ) ;
    public final void rule__RoomDescription__RoomAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1509:1: ( ( ( ruleText ) ) )
            // InternalRinform.g:1510:2: ( ( ruleText ) )
            {
            // InternalRinform.g:1510:2: ( ( ruleText ) )
            // InternalRinform.g:1511:3: ( ruleText )
            {
             before(grammarAccess.getRoomDescriptionAccess().getRoomRoomDeclarationCrossReference_3_0()); 
            // InternalRinform.g:1512:3: ( ruleText )
            // InternalRinform.g:1513:4: ruleText
            {
             before(grammarAccess.getRoomDescriptionAccess().getRoomRoomDeclarationTextParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getRoomDescriptionAccess().getRoomRoomDeclarationTextParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getRoomDescriptionAccess().getRoomRoomDeclarationCrossReference_3_0()); 

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
    // $ANTLR end "rule__RoomDescription__RoomAssignment_3"


    // $ANTLR start "rule__ContainerDeclaration__NameAssignment_1"
    // InternalRinform.g:1524:1: rule__ContainerDeclaration__NameAssignment_1 : ( ruleText ) ;
    public final void rule__ContainerDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1528:1: ( ( ruleText ) )
            // InternalRinform.g:1529:2: ( ruleText )
            {
            // InternalRinform.g:1529:2: ( ruleText )
            // InternalRinform.g:1530:3: ruleText
            {
             before(grammarAccess.getContainerDeclarationAccess().getNameTextParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getContainerDeclarationAccess().getNameTextParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ContainerDeclaration__NameAssignment_1"


    // $ANTLR start "rule__ContainerDeclaration__RoomAssignment_3"
    // InternalRinform.g:1539:1: rule__ContainerDeclaration__RoomAssignment_3 : ( ( ruleText ) ) ;
    public final void rule__ContainerDeclaration__RoomAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1543:1: ( ( ( ruleText ) ) )
            // InternalRinform.g:1544:2: ( ( ruleText ) )
            {
            // InternalRinform.g:1544:2: ( ( ruleText ) )
            // InternalRinform.g:1545:3: ( ruleText )
            {
             before(grammarAccess.getContainerDeclarationAccess().getRoomRoomDeclarationCrossReference_3_0()); 
            // InternalRinform.g:1546:3: ( ruleText )
            // InternalRinform.g:1547:4: ruleText
            {
             before(grammarAccess.getContainerDeclarationAccess().getRoomRoomDeclarationTextParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getContainerDeclarationAccess().getRoomRoomDeclarationTextParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getContainerDeclarationAccess().getRoomRoomDeclarationCrossReference_3_0()); 

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
    // $ANTLR end "rule__ContainerDeclaration__RoomAssignment_3"


    // $ANTLR start "rule__ItemInContainerDeclaration__NameAssignment_1"
    // InternalRinform.g:1558:1: rule__ItemInContainerDeclaration__NameAssignment_1 : ( ruleText ) ;
    public final void rule__ItemInContainerDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1562:1: ( ( ruleText ) )
            // InternalRinform.g:1563:2: ( ruleText )
            {
            // InternalRinform.g:1563:2: ( ruleText )
            // InternalRinform.g:1564:3: ruleText
            {
             before(grammarAccess.getItemInContainerDeclarationAccess().getNameTextParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getItemInContainerDeclarationAccess().getNameTextParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ItemInContainerDeclaration__NameAssignment_1"


    // $ANTLR start "rule__ItemInContainerDeclaration__ContainerAssignment_3"
    // InternalRinform.g:1573:1: rule__ItemInContainerDeclaration__ContainerAssignment_3 : ( ( ruleText ) ) ;
    public final void rule__ItemInContainerDeclaration__ContainerAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1577:1: ( ( ( ruleText ) ) )
            // InternalRinform.g:1578:2: ( ( ruleText ) )
            {
            // InternalRinform.g:1578:2: ( ( ruleText ) )
            // InternalRinform.g:1579:3: ( ruleText )
            {
             before(grammarAccess.getItemInContainerDeclarationAccess().getContainerContainerDeclarationCrossReference_3_0()); 
            // InternalRinform.g:1580:3: ( ruleText )
            // InternalRinform.g:1581:4: ruleText
            {
             before(grammarAccess.getItemInContainerDeclarationAccess().getContainerContainerDeclarationTextParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getItemInContainerDeclarationAccess().getContainerContainerDeclarationTextParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getItemInContainerDeclarationAccess().getContainerContainerDeclarationCrossReference_3_0()); 

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
    // $ANTLR end "rule__ItemInContainerDeclaration__ContainerAssignment_3"


    // $ANTLR start "rule__ItemDeclaration__NameAssignment_0_1"
    // InternalRinform.g:1592:1: rule__ItemDeclaration__NameAssignment_0_1 : ( ruleText ) ;
    public final void rule__ItemDeclaration__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1596:1: ( ( ruleText ) )
            // InternalRinform.g:1597:2: ( ruleText )
            {
            // InternalRinform.g:1597:2: ( ruleText )
            // InternalRinform.g:1598:3: ruleText
            {
             before(grammarAccess.getItemDeclarationAccess().getNameTextParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getItemDeclarationAccess().getNameTextParserRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__ItemDeclaration__NameAssignment_0_1"


    // $ANTLR start "rule__ItemDeclaration__RoomAssignment_0_3"
    // InternalRinform.g:1607:1: rule__ItemDeclaration__RoomAssignment_0_3 : ( ( ruleText ) ) ;
    public final void rule__ItemDeclaration__RoomAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1611:1: ( ( ( ruleText ) ) )
            // InternalRinform.g:1612:2: ( ( ruleText ) )
            {
            // InternalRinform.g:1612:2: ( ( ruleText ) )
            // InternalRinform.g:1613:3: ( ruleText )
            {
             before(grammarAccess.getItemDeclarationAccess().getRoomRoomDeclarationCrossReference_0_3_0()); 
            // InternalRinform.g:1614:3: ( ruleText )
            // InternalRinform.g:1615:4: ruleText
            {
             before(grammarAccess.getItemDeclarationAccess().getRoomRoomDeclarationTextParserRuleCall_0_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getItemDeclarationAccess().getRoomRoomDeclarationTextParserRuleCall_0_3_0_1()); 

            }

             after(grammarAccess.getItemDeclarationAccess().getRoomRoomDeclarationCrossReference_0_3_0()); 

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
    // $ANTLR end "rule__ItemDeclaration__RoomAssignment_0_3"


    // $ANTLR start "rule__ItemDescription__ItemDescriptionAssignment_1"
    // InternalRinform.g:1626:1: rule__ItemDescription__ItemDescriptionAssignment_1 : ( ruleText ) ;
    public final void rule__ItemDescription__ItemDescriptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1630:1: ( ( ruleText ) )
            // InternalRinform.g:1631:2: ( ruleText )
            {
            // InternalRinform.g:1631:2: ( ruleText )
            // InternalRinform.g:1632:3: ruleText
            {
             before(grammarAccess.getItemDescriptionAccess().getItemDescriptionTextParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getItemDescriptionAccess().getItemDescriptionTextParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ItemDescription__ItemDescriptionAssignment_1"


    // $ANTLR start "rule__ItemDescription__ItemAssignment_3"
    // InternalRinform.g:1641:1: rule__ItemDescription__ItemAssignment_3 : ( ( ruleText ) ) ;
    public final void rule__ItemDescription__ItemAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1645:1: ( ( ( ruleText ) ) )
            // InternalRinform.g:1646:2: ( ( ruleText ) )
            {
            // InternalRinform.g:1646:2: ( ( ruleText ) )
            // InternalRinform.g:1647:3: ( ruleText )
            {
             before(grammarAccess.getItemDescriptionAccess().getItemItemDeclarationCrossReference_3_0()); 
            // InternalRinform.g:1648:3: ( ruleText )
            // InternalRinform.g:1649:4: ruleText
            {
             before(grammarAccess.getItemDescriptionAccess().getItemItemDeclarationTextParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getItemDescriptionAccess().getItemItemDeclarationTextParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getItemDescriptionAccess().getItemItemDeclarationCrossReference_3_0()); 

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
    // $ANTLR end "rule__ItemDescription__ItemAssignment_3"


    // $ANTLR start "rule__DirectionStatement__Room1Assignment_1"
    // InternalRinform.g:1660:1: rule__DirectionStatement__Room1Assignment_1 : ( ( ruleText ) ) ;
    public final void rule__DirectionStatement__Room1Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1664:1: ( ( ( ruleText ) ) )
            // InternalRinform.g:1665:2: ( ( ruleText ) )
            {
            // InternalRinform.g:1665:2: ( ( ruleText ) )
            // InternalRinform.g:1666:3: ( ruleText )
            {
             before(grammarAccess.getDirectionStatementAccess().getRoom1RoomDeclarationCrossReference_1_0()); 
            // InternalRinform.g:1667:3: ( ruleText )
            // InternalRinform.g:1668:4: ruleText
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
    // InternalRinform.g:1679:1: rule__DirectionStatement__DirectionAssignment_2 : ( ruleDirection ) ;
    public final void rule__DirectionStatement__DirectionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1683:1: ( ( ruleDirection ) )
            // InternalRinform.g:1684:2: ( ruleDirection )
            {
            // InternalRinform.g:1684:2: ( ruleDirection )
            // InternalRinform.g:1685:3: ruleDirection
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
    // InternalRinform.g:1694:1: rule__DirectionStatement__Room2Assignment_3 : ( ( ruleText ) ) ;
    public final void rule__DirectionStatement__Room2Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1698:1: ( ( ( ruleText ) ) )
            // InternalRinform.g:1699:2: ( ( ruleText ) )
            {
            // InternalRinform.g:1699:2: ( ( ruleText ) )
            // InternalRinform.g:1700:3: ( ruleText )
            {
             before(grammarAccess.getDirectionStatementAccess().getRoom2RoomDeclarationCrossReference_3_0()); 
            // InternalRinform.g:1701:3: ( ruleText )
            // InternalRinform.g:1702:4: ruleText
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
    // InternalRinform.g:1713:1: rule__Words__WordsAssignment : ( ruleText ) ;
    public final void rule__Words__WordsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1717:1: ( ( ruleText ) )
            // InternalRinform.g:1718:2: ( ruleText )
            {
            // InternalRinform.g:1718:2: ( ruleText )
            // InternalRinform.g:1719:3: ruleText
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
    // InternalRinform.g:1728:1: rule__Symbol__SymbolAssignment : ( ( rule__Symbol__SymbolAlternatives_0 ) ) ;
    public final void rule__Symbol__SymbolAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1732:1: ( ( ( rule__Symbol__SymbolAlternatives_0 ) ) )
            // InternalRinform.g:1733:2: ( ( rule__Symbol__SymbolAlternatives_0 ) )
            {
            // InternalRinform.g:1733:2: ( ( rule__Symbol__SymbolAlternatives_0 ) )
            // InternalRinform.g:1734:3: ( rule__Symbol__SymbolAlternatives_0 )
            {
             before(grammarAccess.getSymbolAccess().getSymbolAlternatives_0()); 
            // InternalRinform.g:1735:3: ( rule__Symbol__SymbolAlternatives_0 )
            // InternalRinform.g:1735:4: rule__Symbol__SymbolAlternatives_0
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


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA4 dfa4 = new DFA4(this);
    static final String dfa_1s = "\17\uffff";
    static final String dfa_2s = "\1\4\1\uffff\1\4\4\uffff\3\4\2\uffff\3\4";
    static final String dfa_3s = "\1\36\1\uffff\1\4\4\uffff\1\35\1\4\1\35\2\uffff\1\35\1\4\1\35";
    static final String dfa_4s = "\1\uffff\1\1\1\uffff\1\3\1\5\1\6\1\7\3\uffff\1\2\1\4\3\uffff";
    static final String dfa_5s = "\17\uffff}>";
    static final String[] dfa_6s = {
            "\1\4\6\uffff\10\5\6\uffff\1\1\1\2\1\uffff\2\3\1\6",
            "",
            "\1\7",
            "",
            "",
            "",
            "",
            "\1\11\1\10\23\uffff\1\12\3\uffff\1\13",
            "\1\14",
            "\1\11\1\15\23\uffff\1\12\3\uffff\1\13",
            "",
            "",
            "\1\11\1\10\23\uffff\1\12\3\uffff\1\13",
            "\1\16",
            "\1\11\1\15\23\uffff\1\12\3\uffff\1\13"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "375:1: rule__SentencePart__Alternatives : ( ( ruleRoomDeclaration ) | ( ruleRoomDescription ) | ( ruleItemDeclaration ) | ( ruleItemDescription ) | ( ruleWords ) | ( ruleSymbol ) | ( ruleDirectionStatement ) );";
        }
    }
    static final String dfa_7s = "\10\uffff";
    static final String dfa_8s = "\1\34\1\4\1\uffff\1\5\1\4\2\uffff\1\5";
    static final String dfa_9s = "\1\35\1\4\1\uffff\1\34\1\4\2\uffff\1\34";
    static final String dfa_10s = "\2\uffff\1\3\2\uffff\1\2\1\1\1\uffff";
    static final String dfa_11s = "\10\uffff}>";
    static final String[] dfa_12s = {
            "\1\2\1\1",
            "\1\3",
            "",
            "\1\4\23\uffff\1\6\2\uffff\1\5",
            "\1\7",
            "",
            "",
            "\1\4\23\uffff\1\6\2\uffff\1\5"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "426:1: rule__ItemDeclaration__Alternatives : ( ( ( rule__ItemDeclaration__Group_0__0 ) ) | ( ruleItemInContainerDeclaration ) | ( ruleContainerDeclaration ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000007607F812L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001F80000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000022L});

}