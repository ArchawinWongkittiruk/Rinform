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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_WS", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'.'", "','", "';'", "':'", "'-'", "'!'", "'?'", "'\\''", "'South'", "'North'", "'East'", "'West'", "'Below'", "'Above'", "'-r'", "'-a'", "'('", "')'", "'-i'", "'-c'", "'-p'", "'<'", "'>'"
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


    // $ANTLR start "entryRuleRoomAlias"
    // InternalRinform.g:128:1: entryRuleRoomAlias : ruleRoomAlias EOF ;
    public final void entryRuleRoomAlias() throws RecognitionException {
        try {
            // InternalRinform.g:129:1: ( ruleRoomAlias EOF )
            // InternalRinform.g:130:1: ruleRoomAlias EOF
            {
             before(grammarAccess.getRoomAliasRule()); 
            pushFollow(FOLLOW_1);
            ruleRoomAlias();

            state._fsp--;

             after(grammarAccess.getRoomAliasRule()); 
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
    // $ANTLR end "entryRuleRoomAlias"


    // $ANTLR start "ruleRoomAlias"
    // InternalRinform.g:137:1: ruleRoomAlias : ( ( rule__RoomAlias__Group__0 ) ) ;
    public final void ruleRoomAlias() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:141:2: ( ( ( rule__RoomAlias__Group__0 ) ) )
            // InternalRinform.g:142:2: ( ( rule__RoomAlias__Group__0 ) )
            {
            // InternalRinform.g:142:2: ( ( rule__RoomAlias__Group__0 ) )
            // InternalRinform.g:143:3: ( rule__RoomAlias__Group__0 )
            {
             before(grammarAccess.getRoomAliasAccess().getGroup()); 
            // InternalRinform.g:144:3: ( rule__RoomAlias__Group__0 )
            // InternalRinform.g:144:4: rule__RoomAlias__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RoomAlias__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRoomAliasAccess().getGroup()); 

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
    // $ANTLR end "ruleRoomAlias"


    // $ANTLR start "entryRuleRoomDescription"
    // InternalRinform.g:153:1: entryRuleRoomDescription : ruleRoomDescription EOF ;
    public final void entryRuleRoomDescription() throws RecognitionException {
        try {
            // InternalRinform.g:154:1: ( ruleRoomDescription EOF )
            // InternalRinform.g:155:1: ruleRoomDescription EOF
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
    // InternalRinform.g:162:1: ruleRoomDescription : ( ( rule__RoomDescription__Group__0 ) ) ;
    public final void ruleRoomDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:166:2: ( ( ( rule__RoomDescription__Group__0 ) ) )
            // InternalRinform.g:167:2: ( ( rule__RoomDescription__Group__0 ) )
            {
            // InternalRinform.g:167:2: ( ( rule__RoomDescription__Group__0 ) )
            // InternalRinform.g:168:3: ( rule__RoomDescription__Group__0 )
            {
             before(grammarAccess.getRoomDescriptionAccess().getGroup()); 
            // InternalRinform.g:169:3: ( rule__RoomDescription__Group__0 )
            // InternalRinform.g:169:4: rule__RoomDescription__Group__0
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


    // $ANTLR start "entryRuleItemInRoomDeclaration"
    // InternalRinform.g:178:1: entryRuleItemInRoomDeclaration : ruleItemInRoomDeclaration EOF ;
    public final void entryRuleItemInRoomDeclaration() throws RecognitionException {
        try {
            // InternalRinform.g:179:1: ( ruleItemInRoomDeclaration EOF )
            // InternalRinform.g:180:1: ruleItemInRoomDeclaration EOF
            {
             before(grammarAccess.getItemInRoomDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleItemInRoomDeclaration();

            state._fsp--;

             after(grammarAccess.getItemInRoomDeclarationRule()); 
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
    // $ANTLR end "entryRuleItemInRoomDeclaration"


    // $ANTLR start "ruleItemInRoomDeclaration"
    // InternalRinform.g:187:1: ruleItemInRoomDeclaration : ( ( rule__ItemInRoomDeclaration__Group__0 ) ) ;
    public final void ruleItemInRoomDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:191:2: ( ( ( rule__ItemInRoomDeclaration__Group__0 ) ) )
            // InternalRinform.g:192:2: ( ( rule__ItemInRoomDeclaration__Group__0 ) )
            {
            // InternalRinform.g:192:2: ( ( rule__ItemInRoomDeclaration__Group__0 ) )
            // InternalRinform.g:193:3: ( rule__ItemInRoomDeclaration__Group__0 )
            {
             before(grammarAccess.getItemInRoomDeclarationAccess().getGroup()); 
            // InternalRinform.g:194:3: ( rule__ItemInRoomDeclaration__Group__0 )
            // InternalRinform.g:194:4: rule__ItemInRoomDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ItemInRoomDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getItemInRoomDeclarationAccess().getGroup()); 

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
    // $ANTLR end "ruleItemInRoomDeclaration"


    // $ANTLR start "entryRuleItemInContainerDeclaration"
    // InternalRinform.g:203:1: entryRuleItemInContainerDeclaration : ruleItemInContainerDeclaration EOF ;
    public final void entryRuleItemInContainerDeclaration() throws RecognitionException {
        try {
            // InternalRinform.g:204:1: ( ruleItemInContainerDeclaration EOF )
            // InternalRinform.g:205:1: ruleItemInContainerDeclaration EOF
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
    // InternalRinform.g:212:1: ruleItemInContainerDeclaration : ( ( rule__ItemInContainerDeclaration__Group__0 ) ) ;
    public final void ruleItemInContainerDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:216:2: ( ( ( rule__ItemInContainerDeclaration__Group__0 ) ) )
            // InternalRinform.g:217:2: ( ( rule__ItemInContainerDeclaration__Group__0 ) )
            {
            // InternalRinform.g:217:2: ( ( rule__ItemInContainerDeclaration__Group__0 ) )
            // InternalRinform.g:218:3: ( rule__ItemInContainerDeclaration__Group__0 )
            {
             before(grammarAccess.getItemInContainerDeclarationAccess().getGroup()); 
            // InternalRinform.g:219:3: ( rule__ItemInContainerDeclaration__Group__0 )
            // InternalRinform.g:219:4: rule__ItemInContainerDeclaration__Group__0
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
    // InternalRinform.g:228:1: entryRuleItemDeclaration : ruleItemDeclaration EOF ;
    public final void entryRuleItemDeclaration() throws RecognitionException {
        try {
            // InternalRinform.g:229:1: ( ruleItemDeclaration EOF )
            // InternalRinform.g:230:1: ruleItemDeclaration EOF
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
    // InternalRinform.g:237:1: ruleItemDeclaration : ( ( rule__ItemDeclaration__Alternatives ) ) ;
    public final void ruleItemDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:241:2: ( ( ( rule__ItemDeclaration__Alternatives ) ) )
            // InternalRinform.g:242:2: ( ( rule__ItemDeclaration__Alternatives ) )
            {
            // InternalRinform.g:242:2: ( ( rule__ItemDeclaration__Alternatives ) )
            // InternalRinform.g:243:3: ( rule__ItemDeclaration__Alternatives )
            {
             before(grammarAccess.getItemDeclarationAccess().getAlternatives()); 
            // InternalRinform.g:244:3: ( rule__ItemDeclaration__Alternatives )
            // InternalRinform.g:244:4: rule__ItemDeclaration__Alternatives
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
    // InternalRinform.g:253:1: entryRuleItemDescription : ruleItemDescription EOF ;
    public final void entryRuleItemDescription() throws RecognitionException {
        try {
            // InternalRinform.g:254:1: ( ruleItemDescription EOF )
            // InternalRinform.g:255:1: ruleItemDescription EOF
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
    // InternalRinform.g:262:1: ruleItemDescription : ( ( rule__ItemDescription__Group__0 ) ) ;
    public final void ruleItemDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:266:2: ( ( ( rule__ItemDescription__Group__0 ) ) )
            // InternalRinform.g:267:2: ( ( rule__ItemDescription__Group__0 ) )
            {
            // InternalRinform.g:267:2: ( ( rule__ItemDescription__Group__0 ) )
            // InternalRinform.g:268:3: ( rule__ItemDescription__Group__0 )
            {
             before(grammarAccess.getItemDescriptionAccess().getGroup()); 
            // InternalRinform.g:269:3: ( rule__ItemDescription__Group__0 )
            // InternalRinform.g:269:4: rule__ItemDescription__Group__0
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


    // $ANTLR start "entryRulePersonDeclaration"
    // InternalRinform.g:278:1: entryRulePersonDeclaration : rulePersonDeclaration EOF ;
    public final void entryRulePersonDeclaration() throws RecognitionException {
        try {
            // InternalRinform.g:279:1: ( rulePersonDeclaration EOF )
            // InternalRinform.g:280:1: rulePersonDeclaration EOF
            {
             before(grammarAccess.getPersonDeclarationRule()); 
            pushFollow(FOLLOW_1);
            rulePersonDeclaration();

            state._fsp--;

             after(grammarAccess.getPersonDeclarationRule()); 
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
    // $ANTLR end "entryRulePersonDeclaration"


    // $ANTLR start "rulePersonDeclaration"
    // InternalRinform.g:287:1: rulePersonDeclaration : ( ( rule__PersonDeclaration__Group__0 ) ) ;
    public final void rulePersonDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:291:2: ( ( ( rule__PersonDeclaration__Group__0 ) ) )
            // InternalRinform.g:292:2: ( ( rule__PersonDeclaration__Group__0 ) )
            {
            // InternalRinform.g:292:2: ( ( rule__PersonDeclaration__Group__0 ) )
            // InternalRinform.g:293:3: ( rule__PersonDeclaration__Group__0 )
            {
             before(grammarAccess.getPersonDeclarationAccess().getGroup()); 
            // InternalRinform.g:294:3: ( rule__PersonDeclaration__Group__0 )
            // InternalRinform.g:294:4: rule__PersonDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PersonDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPersonDeclarationAccess().getGroup()); 

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
    // $ANTLR end "rulePersonDeclaration"


    // $ANTLR start "entryRulePersonDescription"
    // InternalRinform.g:303:1: entryRulePersonDescription : rulePersonDescription EOF ;
    public final void entryRulePersonDescription() throws RecognitionException {
        try {
            // InternalRinform.g:304:1: ( rulePersonDescription EOF )
            // InternalRinform.g:305:1: rulePersonDescription EOF
            {
             before(grammarAccess.getPersonDescriptionRule()); 
            pushFollow(FOLLOW_1);
            rulePersonDescription();

            state._fsp--;

             after(grammarAccess.getPersonDescriptionRule()); 
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
    // $ANTLR end "entryRulePersonDescription"


    // $ANTLR start "rulePersonDescription"
    // InternalRinform.g:312:1: rulePersonDescription : ( ( rule__PersonDescription__Group__0 ) ) ;
    public final void rulePersonDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:316:2: ( ( ( rule__PersonDescription__Group__0 ) ) )
            // InternalRinform.g:317:2: ( ( rule__PersonDescription__Group__0 ) )
            {
            // InternalRinform.g:317:2: ( ( rule__PersonDescription__Group__0 ) )
            // InternalRinform.g:318:3: ( rule__PersonDescription__Group__0 )
            {
             before(grammarAccess.getPersonDescriptionAccess().getGroup()); 
            // InternalRinform.g:319:3: ( rule__PersonDescription__Group__0 )
            // InternalRinform.g:319:4: rule__PersonDescription__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PersonDescription__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPersonDescriptionAccess().getGroup()); 

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
    // $ANTLR end "rulePersonDescription"


    // $ANTLR start "entryRuleDirectionStatement"
    // InternalRinform.g:328:1: entryRuleDirectionStatement : ruleDirectionStatement EOF ;
    public final void entryRuleDirectionStatement() throws RecognitionException {
        try {
            // InternalRinform.g:329:1: ( ruleDirectionStatement EOF )
            // InternalRinform.g:330:1: ruleDirectionStatement EOF
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
    // InternalRinform.g:337:1: ruleDirectionStatement : ( ( rule__DirectionStatement__Group__0 ) ) ;
    public final void ruleDirectionStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:341:2: ( ( ( rule__DirectionStatement__Group__0 ) ) )
            // InternalRinform.g:342:2: ( ( rule__DirectionStatement__Group__0 ) )
            {
            // InternalRinform.g:342:2: ( ( rule__DirectionStatement__Group__0 ) )
            // InternalRinform.g:343:3: ( rule__DirectionStatement__Group__0 )
            {
             before(grammarAccess.getDirectionStatementAccess().getGroup()); 
            // InternalRinform.g:344:3: ( rule__DirectionStatement__Group__0 )
            // InternalRinform.g:344:4: rule__DirectionStatement__Group__0
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
    // InternalRinform.g:353:1: entryRuleText : ruleText EOF ;
    public final void entryRuleText() throws RecognitionException {
        try {
            // InternalRinform.g:354:1: ( ruleText EOF )
            // InternalRinform.g:355:1: ruleText EOF
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
    // InternalRinform.g:362:1: ruleText : ( ( rule__Text__Group__0 ) ) ;
    public final void ruleText() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:366:2: ( ( ( rule__Text__Group__0 ) ) )
            // InternalRinform.g:367:2: ( ( rule__Text__Group__0 ) )
            {
            // InternalRinform.g:367:2: ( ( rule__Text__Group__0 ) )
            // InternalRinform.g:368:3: ( rule__Text__Group__0 )
            {
             before(grammarAccess.getTextAccess().getGroup()); 
            // InternalRinform.g:369:3: ( rule__Text__Group__0 )
            // InternalRinform.g:369:4: rule__Text__Group__0
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
    // InternalRinform.g:378:1: entryRuleWords : ruleWords EOF ;
    public final void entryRuleWords() throws RecognitionException {
        try {
            // InternalRinform.g:379:1: ( ruleWords EOF )
            // InternalRinform.g:380:1: ruleWords EOF
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
    // InternalRinform.g:387:1: ruleWords : ( ( ( rule__Words__WordsAssignment ) ) ( ( rule__Words__WordsAssignment )* ) ) ;
    public final void ruleWords() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:391:2: ( ( ( ( rule__Words__WordsAssignment ) ) ( ( rule__Words__WordsAssignment )* ) ) )
            // InternalRinform.g:392:2: ( ( ( rule__Words__WordsAssignment ) ) ( ( rule__Words__WordsAssignment )* ) )
            {
            // InternalRinform.g:392:2: ( ( ( rule__Words__WordsAssignment ) ) ( ( rule__Words__WordsAssignment )* ) )
            // InternalRinform.g:393:3: ( ( rule__Words__WordsAssignment ) ) ( ( rule__Words__WordsAssignment )* )
            {
            // InternalRinform.g:393:3: ( ( rule__Words__WordsAssignment ) )
            // InternalRinform.g:394:4: ( rule__Words__WordsAssignment )
            {
             before(grammarAccess.getWordsAccess().getWordsAssignment()); 
            // InternalRinform.g:395:4: ( rule__Words__WordsAssignment )
            // InternalRinform.g:395:5: rule__Words__WordsAssignment
            {
            pushFollow(FOLLOW_4);
            rule__Words__WordsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getWordsAccess().getWordsAssignment()); 

            }

            // InternalRinform.g:398:3: ( ( rule__Words__WordsAssignment )* )
            // InternalRinform.g:399:4: ( rule__Words__WordsAssignment )*
            {
             before(grammarAccess.getWordsAccess().getWordsAssignment()); 
            // InternalRinform.g:400:4: ( rule__Words__WordsAssignment )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalRinform.g:400:5: rule__Words__WordsAssignment
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
    // InternalRinform.g:410:1: entryRuleSymbol : ruleSymbol EOF ;
    public final void entryRuleSymbol() throws RecognitionException {
        try {
            // InternalRinform.g:411:1: ( ruleSymbol EOF )
            // InternalRinform.g:412:1: ruleSymbol EOF
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
    // InternalRinform.g:419:1: ruleSymbol : ( ( rule__Symbol__SymbolAssignment ) ) ;
    public final void ruleSymbol() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:423:2: ( ( ( rule__Symbol__SymbolAssignment ) ) )
            // InternalRinform.g:424:2: ( ( rule__Symbol__SymbolAssignment ) )
            {
            // InternalRinform.g:424:2: ( ( rule__Symbol__SymbolAssignment ) )
            // InternalRinform.g:425:3: ( rule__Symbol__SymbolAssignment )
            {
             before(grammarAccess.getSymbolAccess().getSymbolAssignment()); 
            // InternalRinform.g:426:3: ( rule__Symbol__SymbolAssignment )
            // InternalRinform.g:426:4: rule__Symbol__SymbolAssignment
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
    // InternalRinform.g:435:1: ruleDirection : ( ( rule__Direction__Alternatives ) ) ;
    public final void ruleDirection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:439:1: ( ( ( rule__Direction__Alternatives ) ) )
            // InternalRinform.g:440:2: ( ( rule__Direction__Alternatives ) )
            {
            // InternalRinform.g:440:2: ( ( rule__Direction__Alternatives ) )
            // InternalRinform.g:441:3: ( rule__Direction__Alternatives )
            {
             before(grammarAccess.getDirectionAccess().getAlternatives()); 
            // InternalRinform.g:442:3: ( rule__Direction__Alternatives )
            // InternalRinform.g:442:4: rule__Direction__Alternatives
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
    // InternalRinform.g:450:1: rule__SentencePart__Alternatives : ( ( ruleRoomDeclaration ) | ( ruleRoomAlias ) | ( ruleRoomDescription ) | ( ruleItemDeclaration ) | ( ruleItemDescription ) | ( rulePersonDeclaration ) | ( rulePersonDescription ) | ( ruleWords ) | ( ruleSymbol ) | ( ruleDirectionStatement ) );
    public final void rule__SentencePart__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:454:1: ( ( ruleRoomDeclaration ) | ( ruleRoomAlias ) | ( ruleRoomDescription ) | ( ruleItemDeclaration ) | ( ruleItemDescription ) | ( rulePersonDeclaration ) | ( rulePersonDescription ) | ( ruleWords ) | ( ruleSymbol ) | ( ruleDirectionStatement ) )
            int alt3=10;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalRinform.g:455:2: ( ruleRoomDeclaration )
                    {
                    // InternalRinform.g:455:2: ( ruleRoomDeclaration )
                    // InternalRinform.g:456:3: ruleRoomDeclaration
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
                    // InternalRinform.g:461:2: ( ruleRoomAlias )
                    {
                    // InternalRinform.g:461:2: ( ruleRoomAlias )
                    // InternalRinform.g:462:3: ruleRoomAlias
                    {
                     before(grammarAccess.getSentencePartAccess().getRoomAliasParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRoomAlias();

                    state._fsp--;

                     after(grammarAccess.getSentencePartAccess().getRoomAliasParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRinform.g:467:2: ( ruleRoomDescription )
                    {
                    // InternalRinform.g:467:2: ( ruleRoomDescription )
                    // InternalRinform.g:468:3: ruleRoomDescription
                    {
                     before(grammarAccess.getSentencePartAccess().getRoomDescriptionParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleRoomDescription();

                    state._fsp--;

                     after(grammarAccess.getSentencePartAccess().getRoomDescriptionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRinform.g:473:2: ( ruleItemDeclaration )
                    {
                    // InternalRinform.g:473:2: ( ruleItemDeclaration )
                    // InternalRinform.g:474:3: ruleItemDeclaration
                    {
                     before(grammarAccess.getSentencePartAccess().getItemDeclarationParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleItemDeclaration();

                    state._fsp--;

                     after(grammarAccess.getSentencePartAccess().getItemDeclarationParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalRinform.g:479:2: ( ruleItemDescription )
                    {
                    // InternalRinform.g:479:2: ( ruleItemDescription )
                    // InternalRinform.g:480:3: ruleItemDescription
                    {
                     before(grammarAccess.getSentencePartAccess().getItemDescriptionParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleItemDescription();

                    state._fsp--;

                     after(grammarAccess.getSentencePartAccess().getItemDescriptionParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalRinform.g:485:2: ( rulePersonDeclaration )
                    {
                    // InternalRinform.g:485:2: ( rulePersonDeclaration )
                    // InternalRinform.g:486:3: rulePersonDeclaration
                    {
                     before(grammarAccess.getSentencePartAccess().getPersonDeclarationParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    rulePersonDeclaration();

                    state._fsp--;

                     after(grammarAccess.getSentencePartAccess().getPersonDeclarationParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalRinform.g:491:2: ( rulePersonDescription )
                    {
                    // InternalRinform.g:491:2: ( rulePersonDescription )
                    // InternalRinform.g:492:3: rulePersonDescription
                    {
                     before(grammarAccess.getSentencePartAccess().getPersonDescriptionParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    rulePersonDescription();

                    state._fsp--;

                     after(grammarAccess.getSentencePartAccess().getPersonDescriptionParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalRinform.g:497:2: ( ruleWords )
                    {
                    // InternalRinform.g:497:2: ( ruleWords )
                    // InternalRinform.g:498:3: ruleWords
                    {
                     before(grammarAccess.getSentencePartAccess().getWordsParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleWords();

                    state._fsp--;

                     after(grammarAccess.getSentencePartAccess().getWordsParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalRinform.g:503:2: ( ruleSymbol )
                    {
                    // InternalRinform.g:503:2: ( ruleSymbol )
                    // InternalRinform.g:504:3: ruleSymbol
                    {
                     before(grammarAccess.getSentencePartAccess().getSymbolParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleSymbol();

                    state._fsp--;

                     after(grammarAccess.getSentencePartAccess().getSymbolParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalRinform.g:509:2: ( ruleDirectionStatement )
                    {
                    // InternalRinform.g:509:2: ( ruleDirectionStatement )
                    // InternalRinform.g:510:3: ruleDirectionStatement
                    {
                     before(grammarAccess.getSentencePartAccess().getDirectionStatementParserRuleCall_9()); 
                    pushFollow(FOLLOW_2);
                    ruleDirectionStatement();

                    state._fsp--;

                     after(grammarAccess.getSentencePartAccess().getDirectionStatementParserRuleCall_9()); 

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
    // InternalRinform.g:519:1: rule__ItemDeclaration__Alternatives : ( ( ruleItemInRoomDeclaration ) | ( ruleItemInContainerDeclaration ) );
    public final void rule__ItemDeclaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:523:1: ( ( ruleItemInRoomDeclaration ) | ( ruleItemInContainerDeclaration ) )
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalRinform.g:524:2: ( ruleItemInRoomDeclaration )
                    {
                    // InternalRinform.g:524:2: ( ruleItemInRoomDeclaration )
                    // InternalRinform.g:525:3: ruleItemInRoomDeclaration
                    {
                     before(grammarAccess.getItemDeclarationAccess().getItemInRoomDeclarationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleItemInRoomDeclaration();

                    state._fsp--;

                     after(grammarAccess.getItemDeclarationAccess().getItemInRoomDeclarationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRinform.g:530:2: ( ruleItemInContainerDeclaration )
                    {
                    // InternalRinform.g:530:2: ( ruleItemInContainerDeclaration )
                    // InternalRinform.g:531:3: ruleItemInContainerDeclaration
                    {
                     before(grammarAccess.getItemDeclarationAccess().getItemInContainerDeclarationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleItemInContainerDeclaration();

                    state._fsp--;

                     after(grammarAccess.getItemDeclarationAccess().getItemInContainerDeclarationParserRuleCall_1()); 

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
    // InternalRinform.g:540:1: rule__Symbol__SymbolAlternatives_0 : ( ( '.' ) | ( ',' ) | ( ';' ) | ( ':' ) | ( '-' ) | ( '!' ) | ( '?' ) | ( '\\'' ) );
    public final void rule__Symbol__SymbolAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:544:1: ( ( '.' ) | ( ',' ) | ( ';' ) | ( ':' ) | ( '-' ) | ( '!' ) | ( '?' ) | ( '\\'' ) )
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
                    // InternalRinform.g:545:2: ( '.' )
                    {
                    // InternalRinform.g:545:2: ( '.' )
                    // InternalRinform.g:546:3: '.'
                    {
                     before(grammarAccess.getSymbolAccess().getSymbolFullStopKeyword_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getSymbolAccess().getSymbolFullStopKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRinform.g:551:2: ( ',' )
                    {
                    // InternalRinform.g:551:2: ( ',' )
                    // InternalRinform.g:552:3: ','
                    {
                     before(grammarAccess.getSymbolAccess().getSymbolCommaKeyword_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getSymbolAccess().getSymbolCommaKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRinform.g:557:2: ( ';' )
                    {
                    // InternalRinform.g:557:2: ( ';' )
                    // InternalRinform.g:558:3: ';'
                    {
                     before(grammarAccess.getSymbolAccess().getSymbolSemicolonKeyword_0_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getSymbolAccess().getSymbolSemicolonKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRinform.g:563:2: ( ':' )
                    {
                    // InternalRinform.g:563:2: ( ':' )
                    // InternalRinform.g:564:3: ':'
                    {
                     before(grammarAccess.getSymbolAccess().getSymbolColonKeyword_0_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getSymbolAccess().getSymbolColonKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalRinform.g:569:2: ( '-' )
                    {
                    // InternalRinform.g:569:2: ( '-' )
                    // InternalRinform.g:570:3: '-'
                    {
                     before(grammarAccess.getSymbolAccess().getSymbolHyphenMinusKeyword_0_4()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getSymbolAccess().getSymbolHyphenMinusKeyword_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalRinform.g:575:2: ( '!' )
                    {
                    // InternalRinform.g:575:2: ( '!' )
                    // InternalRinform.g:576:3: '!'
                    {
                     before(grammarAccess.getSymbolAccess().getSymbolExclamationMarkKeyword_0_5()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getSymbolAccess().getSymbolExclamationMarkKeyword_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalRinform.g:581:2: ( '?' )
                    {
                    // InternalRinform.g:581:2: ( '?' )
                    // InternalRinform.g:582:3: '?'
                    {
                     before(grammarAccess.getSymbolAccess().getSymbolQuestionMarkKeyword_0_6()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getSymbolAccess().getSymbolQuestionMarkKeyword_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalRinform.g:587:2: ( '\\'' )
                    {
                    // InternalRinform.g:587:2: ( '\\'' )
                    // InternalRinform.g:588:3: '\\''
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
    // InternalRinform.g:597:1: rule__Direction__Alternatives : ( ( ( 'South' ) ) | ( ( 'North' ) ) | ( ( 'East' ) ) | ( ( 'West' ) ) | ( ( 'Below' ) ) | ( ( 'Above' ) ) );
    public final void rule__Direction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:601:1: ( ( ( 'South' ) ) | ( ( 'North' ) ) | ( ( 'East' ) ) | ( ( 'West' ) ) | ( ( 'Below' ) ) | ( ( 'Above' ) ) )
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
                    // InternalRinform.g:602:2: ( ( 'South' ) )
                    {
                    // InternalRinform.g:602:2: ( ( 'South' ) )
                    // InternalRinform.g:603:3: ( 'South' )
                    {
                     before(grammarAccess.getDirectionAccess().getSouthEnumLiteralDeclaration_0()); 
                    // InternalRinform.g:604:3: ( 'South' )
                    // InternalRinform.g:604:4: 'South'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectionAccess().getSouthEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRinform.g:608:2: ( ( 'North' ) )
                    {
                    // InternalRinform.g:608:2: ( ( 'North' ) )
                    // InternalRinform.g:609:3: ( 'North' )
                    {
                     before(grammarAccess.getDirectionAccess().getNorthEnumLiteralDeclaration_1()); 
                    // InternalRinform.g:610:3: ( 'North' )
                    // InternalRinform.g:610:4: 'North'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectionAccess().getNorthEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRinform.g:614:2: ( ( 'East' ) )
                    {
                    // InternalRinform.g:614:2: ( ( 'East' ) )
                    // InternalRinform.g:615:3: ( 'East' )
                    {
                     before(grammarAccess.getDirectionAccess().getEastEnumLiteralDeclaration_2()); 
                    // InternalRinform.g:616:3: ( 'East' )
                    // InternalRinform.g:616:4: 'East'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectionAccess().getEastEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRinform.g:620:2: ( ( 'West' ) )
                    {
                    // InternalRinform.g:620:2: ( ( 'West' ) )
                    // InternalRinform.g:621:3: ( 'West' )
                    {
                     before(grammarAccess.getDirectionAccess().getWestEnumLiteralDeclaration_3()); 
                    // InternalRinform.g:622:3: ( 'West' )
                    // InternalRinform.g:622:4: 'West'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectionAccess().getWestEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalRinform.g:626:2: ( ( 'Below' ) )
                    {
                    // InternalRinform.g:626:2: ( ( 'Below' ) )
                    // InternalRinform.g:627:3: ( 'Below' )
                    {
                     before(grammarAccess.getDirectionAccess().getBelowEnumLiteralDeclaration_4()); 
                    // InternalRinform.g:628:3: ( 'Below' )
                    // InternalRinform.g:628:4: 'Below'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectionAccess().getBelowEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalRinform.g:632:2: ( ( 'Above' ) )
                    {
                    // InternalRinform.g:632:2: ( ( 'Above' ) )
                    // InternalRinform.g:633:3: ( 'Above' )
                    {
                     before(grammarAccess.getDirectionAccess().getAboveEnumLiteralDeclaration_5()); 
                    // InternalRinform.g:634:3: ( 'Above' )
                    // InternalRinform.g:634:4: 'Above'
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
    // InternalRinform.g:642:1: rule__RoomDeclaration__Group__0 : rule__RoomDeclaration__Group__0__Impl rule__RoomDeclaration__Group__1 ;
    public final void rule__RoomDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:646:1: ( rule__RoomDeclaration__Group__0__Impl rule__RoomDeclaration__Group__1 )
            // InternalRinform.g:647:2: rule__RoomDeclaration__Group__0__Impl rule__RoomDeclaration__Group__1
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
    // InternalRinform.g:654:1: rule__RoomDeclaration__Group__0__Impl : ( '-r' ) ;
    public final void rule__RoomDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:658:1: ( ( '-r' ) )
            // InternalRinform.g:659:1: ( '-r' )
            {
            // InternalRinform.g:659:1: ( '-r' )
            // InternalRinform.g:660:2: '-r'
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
    // InternalRinform.g:669:1: rule__RoomDeclaration__Group__1 : rule__RoomDeclaration__Group__1__Impl ;
    public final void rule__RoomDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:673:1: ( rule__RoomDeclaration__Group__1__Impl )
            // InternalRinform.g:674:2: rule__RoomDeclaration__Group__1__Impl
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
    // InternalRinform.g:680:1: rule__RoomDeclaration__Group__1__Impl : ( ( rule__RoomDeclaration__NameAssignment_1 ) ) ;
    public final void rule__RoomDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:684:1: ( ( ( rule__RoomDeclaration__NameAssignment_1 ) ) )
            // InternalRinform.g:685:1: ( ( rule__RoomDeclaration__NameAssignment_1 ) )
            {
            // InternalRinform.g:685:1: ( ( rule__RoomDeclaration__NameAssignment_1 ) )
            // InternalRinform.g:686:2: ( rule__RoomDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getRoomDeclarationAccess().getNameAssignment_1()); 
            // InternalRinform.g:687:2: ( rule__RoomDeclaration__NameAssignment_1 )
            // InternalRinform.g:687:3: rule__RoomDeclaration__NameAssignment_1
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


    // $ANTLR start "rule__RoomAlias__Group__0"
    // InternalRinform.g:696:1: rule__RoomAlias__Group__0 : rule__RoomAlias__Group__0__Impl rule__RoomAlias__Group__1 ;
    public final void rule__RoomAlias__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:700:1: ( rule__RoomAlias__Group__0__Impl rule__RoomAlias__Group__1 )
            // InternalRinform.g:701:2: rule__RoomAlias__Group__0__Impl rule__RoomAlias__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__RoomAlias__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoomAlias__Group__1();

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
    // $ANTLR end "rule__RoomAlias__Group__0"


    // $ANTLR start "rule__RoomAlias__Group__0__Impl"
    // InternalRinform.g:708:1: rule__RoomAlias__Group__0__Impl : ( '-r' ) ;
    public final void rule__RoomAlias__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:712:1: ( ( '-r' ) )
            // InternalRinform.g:713:1: ( '-r' )
            {
            // InternalRinform.g:713:1: ( '-r' )
            // InternalRinform.g:714:2: '-r'
            {
             before(grammarAccess.getRoomAliasAccess().getRKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getRoomAliasAccess().getRKeyword_0()); 

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
    // $ANTLR end "rule__RoomAlias__Group__0__Impl"


    // $ANTLR start "rule__RoomAlias__Group__1"
    // InternalRinform.g:723:1: rule__RoomAlias__Group__1 : rule__RoomAlias__Group__1__Impl rule__RoomAlias__Group__2 ;
    public final void rule__RoomAlias__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:727:1: ( rule__RoomAlias__Group__1__Impl rule__RoomAlias__Group__2 )
            // InternalRinform.g:728:2: rule__RoomAlias__Group__1__Impl rule__RoomAlias__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__RoomAlias__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoomAlias__Group__2();

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
    // $ANTLR end "rule__RoomAlias__Group__1"


    // $ANTLR start "rule__RoomAlias__Group__1__Impl"
    // InternalRinform.g:735:1: rule__RoomAlias__Group__1__Impl : ( ( rule__RoomAlias__RoomAssignment_1 ) ) ;
    public final void rule__RoomAlias__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:739:1: ( ( ( rule__RoomAlias__RoomAssignment_1 ) ) )
            // InternalRinform.g:740:1: ( ( rule__RoomAlias__RoomAssignment_1 ) )
            {
            // InternalRinform.g:740:1: ( ( rule__RoomAlias__RoomAssignment_1 ) )
            // InternalRinform.g:741:2: ( rule__RoomAlias__RoomAssignment_1 )
            {
             before(grammarAccess.getRoomAliasAccess().getRoomAssignment_1()); 
            // InternalRinform.g:742:2: ( rule__RoomAlias__RoomAssignment_1 )
            // InternalRinform.g:742:3: rule__RoomAlias__RoomAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RoomAlias__RoomAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRoomAliasAccess().getRoomAssignment_1()); 

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
    // $ANTLR end "rule__RoomAlias__Group__1__Impl"


    // $ANTLR start "rule__RoomAlias__Group__2"
    // InternalRinform.g:750:1: rule__RoomAlias__Group__2 : rule__RoomAlias__Group__2__Impl rule__RoomAlias__Group__3 ;
    public final void rule__RoomAlias__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:754:1: ( rule__RoomAlias__Group__2__Impl rule__RoomAlias__Group__3 )
            // InternalRinform.g:755:2: rule__RoomAlias__Group__2__Impl rule__RoomAlias__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__RoomAlias__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoomAlias__Group__3();

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
    // $ANTLR end "rule__RoomAlias__Group__2"


    // $ANTLR start "rule__RoomAlias__Group__2__Impl"
    // InternalRinform.g:762:1: rule__RoomAlias__Group__2__Impl : ( '-a' ) ;
    public final void rule__RoomAlias__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:766:1: ( ( '-a' ) )
            // InternalRinform.g:767:1: ( '-a' )
            {
            // InternalRinform.g:767:1: ( '-a' )
            // InternalRinform.g:768:2: '-a'
            {
             before(grammarAccess.getRoomAliasAccess().getAKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getRoomAliasAccess().getAKeyword_2()); 

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
    // $ANTLR end "rule__RoomAlias__Group__2__Impl"


    // $ANTLR start "rule__RoomAlias__Group__3"
    // InternalRinform.g:777:1: rule__RoomAlias__Group__3 : rule__RoomAlias__Group__3__Impl ;
    public final void rule__RoomAlias__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:781:1: ( rule__RoomAlias__Group__3__Impl )
            // InternalRinform.g:782:2: rule__RoomAlias__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RoomAlias__Group__3__Impl();

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
    // $ANTLR end "rule__RoomAlias__Group__3"


    // $ANTLR start "rule__RoomAlias__Group__3__Impl"
    // InternalRinform.g:788:1: rule__RoomAlias__Group__3__Impl : ( ( ( rule__RoomAlias__AliasesAssignment_3 ) ) ( ( rule__RoomAlias__AliasesAssignment_3 )* ) ) ;
    public final void rule__RoomAlias__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:792:1: ( ( ( ( rule__RoomAlias__AliasesAssignment_3 ) ) ( ( rule__RoomAlias__AliasesAssignment_3 )* ) ) )
            // InternalRinform.g:793:1: ( ( ( rule__RoomAlias__AliasesAssignment_3 ) ) ( ( rule__RoomAlias__AliasesAssignment_3 )* ) )
            {
            // InternalRinform.g:793:1: ( ( ( rule__RoomAlias__AliasesAssignment_3 ) ) ( ( rule__RoomAlias__AliasesAssignment_3 )* ) )
            // InternalRinform.g:794:2: ( ( rule__RoomAlias__AliasesAssignment_3 ) ) ( ( rule__RoomAlias__AliasesAssignment_3 )* )
            {
            // InternalRinform.g:794:2: ( ( rule__RoomAlias__AliasesAssignment_3 ) )
            // InternalRinform.g:795:3: ( rule__RoomAlias__AliasesAssignment_3 )
            {
             before(grammarAccess.getRoomAliasAccess().getAliasesAssignment_3()); 
            // InternalRinform.g:796:3: ( rule__RoomAlias__AliasesAssignment_3 )
            // InternalRinform.g:796:4: rule__RoomAlias__AliasesAssignment_3
            {
            pushFollow(FOLLOW_4);
            rule__RoomAlias__AliasesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRoomAliasAccess().getAliasesAssignment_3()); 

            }

            // InternalRinform.g:799:2: ( ( rule__RoomAlias__AliasesAssignment_3 )* )
            // InternalRinform.g:800:3: ( rule__RoomAlias__AliasesAssignment_3 )*
            {
             before(grammarAccess.getRoomAliasAccess().getAliasesAssignment_3()); 
            // InternalRinform.g:801:3: ( rule__RoomAlias__AliasesAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalRinform.g:801:4: rule__RoomAlias__AliasesAssignment_3
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__RoomAlias__AliasesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getRoomAliasAccess().getAliasesAssignment_3()); 

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
    // $ANTLR end "rule__RoomAlias__Group__3__Impl"


    // $ANTLR start "rule__RoomDescription__Group__0"
    // InternalRinform.g:811:1: rule__RoomDescription__Group__0 : rule__RoomDescription__Group__0__Impl rule__RoomDescription__Group__1 ;
    public final void rule__RoomDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:815:1: ( rule__RoomDescription__Group__0__Impl rule__RoomDescription__Group__1 )
            // InternalRinform.g:816:2: rule__RoomDescription__Group__0__Impl rule__RoomDescription__Group__1
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
    // InternalRinform.g:823:1: rule__RoomDescription__Group__0__Impl : ( '(' ) ;
    public final void rule__RoomDescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:827:1: ( ( '(' ) )
            // InternalRinform.g:828:1: ( '(' )
            {
            // InternalRinform.g:828:1: ( '(' )
            // InternalRinform.g:829:2: '('
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
    // InternalRinform.g:838:1: rule__RoomDescription__Group__1 : rule__RoomDescription__Group__1__Impl rule__RoomDescription__Group__2 ;
    public final void rule__RoomDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:842:1: ( rule__RoomDescription__Group__1__Impl rule__RoomDescription__Group__2 )
            // InternalRinform.g:843:2: rule__RoomDescription__Group__1__Impl rule__RoomDescription__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalRinform.g:850:1: rule__RoomDescription__Group__1__Impl : ( ( ( rule__RoomDescription__RoomDescriptionAssignment_1 ) ) ( ( rule__RoomDescription__RoomDescriptionAssignment_1 )* ) ) ;
    public final void rule__RoomDescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:854:1: ( ( ( ( rule__RoomDescription__RoomDescriptionAssignment_1 ) ) ( ( rule__RoomDescription__RoomDescriptionAssignment_1 )* ) ) )
            // InternalRinform.g:855:1: ( ( ( rule__RoomDescription__RoomDescriptionAssignment_1 ) ) ( ( rule__RoomDescription__RoomDescriptionAssignment_1 )* ) )
            {
            // InternalRinform.g:855:1: ( ( ( rule__RoomDescription__RoomDescriptionAssignment_1 ) ) ( ( rule__RoomDescription__RoomDescriptionAssignment_1 )* ) )
            // InternalRinform.g:856:2: ( ( rule__RoomDescription__RoomDescriptionAssignment_1 ) ) ( ( rule__RoomDescription__RoomDescriptionAssignment_1 )* )
            {
            // InternalRinform.g:856:2: ( ( rule__RoomDescription__RoomDescriptionAssignment_1 ) )
            // InternalRinform.g:857:3: ( rule__RoomDescription__RoomDescriptionAssignment_1 )
            {
             before(grammarAccess.getRoomDescriptionAccess().getRoomDescriptionAssignment_1()); 
            // InternalRinform.g:858:3: ( rule__RoomDescription__RoomDescriptionAssignment_1 )
            // InternalRinform.g:858:4: rule__RoomDescription__RoomDescriptionAssignment_1
            {
            pushFollow(FOLLOW_4);
            rule__RoomDescription__RoomDescriptionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRoomDescriptionAccess().getRoomDescriptionAssignment_1()); 

            }

            // InternalRinform.g:861:2: ( ( rule__RoomDescription__RoomDescriptionAssignment_1 )* )
            // InternalRinform.g:862:3: ( rule__RoomDescription__RoomDescriptionAssignment_1 )*
            {
             before(grammarAccess.getRoomDescriptionAccess().getRoomDescriptionAssignment_1()); 
            // InternalRinform.g:863:3: ( rule__RoomDescription__RoomDescriptionAssignment_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalRinform.g:863:4: rule__RoomDescription__RoomDescriptionAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__RoomDescription__RoomDescriptionAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalRinform.g:872:1: rule__RoomDescription__Group__2 : rule__RoomDescription__Group__2__Impl rule__RoomDescription__Group__3 ;
    public final void rule__RoomDescription__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:876:1: ( rule__RoomDescription__Group__2__Impl rule__RoomDescription__Group__3 )
            // InternalRinform.g:877:2: rule__RoomDescription__Group__2__Impl rule__RoomDescription__Group__3
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
    // InternalRinform.g:884:1: rule__RoomDescription__Group__2__Impl : ( '-r' ) ;
    public final void rule__RoomDescription__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:888:1: ( ( '-r' ) )
            // InternalRinform.g:889:1: ( '-r' )
            {
            // InternalRinform.g:889:1: ( '-r' )
            // InternalRinform.g:890:2: '-r'
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
    // InternalRinform.g:899:1: rule__RoomDescription__Group__3 : rule__RoomDescription__Group__3__Impl rule__RoomDescription__Group__4 ;
    public final void rule__RoomDescription__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:903:1: ( rule__RoomDescription__Group__3__Impl rule__RoomDescription__Group__4 )
            // InternalRinform.g:904:2: rule__RoomDescription__Group__3__Impl rule__RoomDescription__Group__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalRinform.g:911:1: rule__RoomDescription__Group__3__Impl : ( ( rule__RoomDescription__RoomAssignment_3 ) ) ;
    public final void rule__RoomDescription__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:915:1: ( ( ( rule__RoomDescription__RoomAssignment_3 ) ) )
            // InternalRinform.g:916:1: ( ( rule__RoomDescription__RoomAssignment_3 ) )
            {
            // InternalRinform.g:916:1: ( ( rule__RoomDescription__RoomAssignment_3 ) )
            // InternalRinform.g:917:2: ( rule__RoomDescription__RoomAssignment_3 )
            {
             before(grammarAccess.getRoomDescriptionAccess().getRoomAssignment_3()); 
            // InternalRinform.g:918:2: ( rule__RoomDescription__RoomAssignment_3 )
            // InternalRinform.g:918:3: rule__RoomDescription__RoomAssignment_3
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
    // InternalRinform.g:926:1: rule__RoomDescription__Group__4 : rule__RoomDescription__Group__4__Impl ;
    public final void rule__RoomDescription__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:930:1: ( rule__RoomDescription__Group__4__Impl )
            // InternalRinform.g:931:2: rule__RoomDescription__Group__4__Impl
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
    // InternalRinform.g:937:1: rule__RoomDescription__Group__4__Impl : ( ')' ) ;
    public final void rule__RoomDescription__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:941:1: ( ( ')' ) )
            // InternalRinform.g:942:1: ( ')' )
            {
            // InternalRinform.g:942:1: ( ')' )
            // InternalRinform.g:943:2: ')'
            {
             before(grammarAccess.getRoomDescriptionAccess().getRightParenthesisKeyword_4()); 
            match(input,28,FOLLOW_2); 
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


    // $ANTLR start "rule__ItemInRoomDeclaration__Group__0"
    // InternalRinform.g:953:1: rule__ItemInRoomDeclaration__Group__0 : rule__ItemInRoomDeclaration__Group__0__Impl rule__ItemInRoomDeclaration__Group__1 ;
    public final void rule__ItemInRoomDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:957:1: ( rule__ItemInRoomDeclaration__Group__0__Impl rule__ItemInRoomDeclaration__Group__1 )
            // InternalRinform.g:958:2: rule__ItemInRoomDeclaration__Group__0__Impl rule__ItemInRoomDeclaration__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__ItemInRoomDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ItemInRoomDeclaration__Group__1();

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
    // $ANTLR end "rule__ItemInRoomDeclaration__Group__0"


    // $ANTLR start "rule__ItemInRoomDeclaration__Group__0__Impl"
    // InternalRinform.g:965:1: rule__ItemInRoomDeclaration__Group__0__Impl : ( '-i' ) ;
    public final void rule__ItemInRoomDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:969:1: ( ( '-i' ) )
            // InternalRinform.g:970:1: ( '-i' )
            {
            // InternalRinform.g:970:1: ( '-i' )
            // InternalRinform.g:971:2: '-i'
            {
             before(grammarAccess.getItemInRoomDeclarationAccess().getIKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getItemInRoomDeclarationAccess().getIKeyword_0()); 

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
    // $ANTLR end "rule__ItemInRoomDeclaration__Group__0__Impl"


    // $ANTLR start "rule__ItemInRoomDeclaration__Group__1"
    // InternalRinform.g:980:1: rule__ItemInRoomDeclaration__Group__1 : rule__ItemInRoomDeclaration__Group__1__Impl rule__ItemInRoomDeclaration__Group__2 ;
    public final void rule__ItemInRoomDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:984:1: ( rule__ItemInRoomDeclaration__Group__1__Impl rule__ItemInRoomDeclaration__Group__2 )
            // InternalRinform.g:985:2: rule__ItemInRoomDeclaration__Group__1__Impl rule__ItemInRoomDeclaration__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__ItemInRoomDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ItemInRoomDeclaration__Group__2();

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
    // $ANTLR end "rule__ItemInRoomDeclaration__Group__1"


    // $ANTLR start "rule__ItemInRoomDeclaration__Group__1__Impl"
    // InternalRinform.g:992:1: rule__ItemInRoomDeclaration__Group__1__Impl : ( ( rule__ItemInRoomDeclaration__NameAssignment_1 ) ) ;
    public final void rule__ItemInRoomDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:996:1: ( ( ( rule__ItemInRoomDeclaration__NameAssignment_1 ) ) )
            // InternalRinform.g:997:1: ( ( rule__ItemInRoomDeclaration__NameAssignment_1 ) )
            {
            // InternalRinform.g:997:1: ( ( rule__ItemInRoomDeclaration__NameAssignment_1 ) )
            // InternalRinform.g:998:2: ( rule__ItemInRoomDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getItemInRoomDeclarationAccess().getNameAssignment_1()); 
            // InternalRinform.g:999:2: ( rule__ItemInRoomDeclaration__NameAssignment_1 )
            // InternalRinform.g:999:3: rule__ItemInRoomDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ItemInRoomDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getItemInRoomDeclarationAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__ItemInRoomDeclaration__Group__1__Impl"


    // $ANTLR start "rule__ItemInRoomDeclaration__Group__2"
    // InternalRinform.g:1007:1: rule__ItemInRoomDeclaration__Group__2 : rule__ItemInRoomDeclaration__Group__2__Impl rule__ItemInRoomDeclaration__Group__3 ;
    public final void rule__ItemInRoomDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1011:1: ( rule__ItemInRoomDeclaration__Group__2__Impl rule__ItemInRoomDeclaration__Group__3 )
            // InternalRinform.g:1012:2: rule__ItemInRoomDeclaration__Group__2__Impl rule__ItemInRoomDeclaration__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__ItemInRoomDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ItemInRoomDeclaration__Group__3();

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
    // $ANTLR end "rule__ItemInRoomDeclaration__Group__2"


    // $ANTLR start "rule__ItemInRoomDeclaration__Group__2__Impl"
    // InternalRinform.g:1019:1: rule__ItemInRoomDeclaration__Group__2__Impl : ( '-r' ) ;
    public final void rule__ItemInRoomDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1023:1: ( ( '-r' ) )
            // InternalRinform.g:1024:1: ( '-r' )
            {
            // InternalRinform.g:1024:1: ( '-r' )
            // InternalRinform.g:1025:2: '-r'
            {
             before(grammarAccess.getItemInRoomDeclarationAccess().getRKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getItemInRoomDeclarationAccess().getRKeyword_2()); 

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
    // $ANTLR end "rule__ItemInRoomDeclaration__Group__2__Impl"


    // $ANTLR start "rule__ItemInRoomDeclaration__Group__3"
    // InternalRinform.g:1034:1: rule__ItemInRoomDeclaration__Group__3 : rule__ItemInRoomDeclaration__Group__3__Impl ;
    public final void rule__ItemInRoomDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1038:1: ( rule__ItemInRoomDeclaration__Group__3__Impl )
            // InternalRinform.g:1039:2: rule__ItemInRoomDeclaration__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ItemInRoomDeclaration__Group__3__Impl();

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
    // $ANTLR end "rule__ItemInRoomDeclaration__Group__3"


    // $ANTLR start "rule__ItemInRoomDeclaration__Group__3__Impl"
    // InternalRinform.g:1045:1: rule__ItemInRoomDeclaration__Group__3__Impl : ( ( rule__ItemInRoomDeclaration__RoomAssignment_3 ) ) ;
    public final void rule__ItemInRoomDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1049:1: ( ( ( rule__ItemInRoomDeclaration__RoomAssignment_3 ) ) )
            // InternalRinform.g:1050:1: ( ( rule__ItemInRoomDeclaration__RoomAssignment_3 ) )
            {
            // InternalRinform.g:1050:1: ( ( rule__ItemInRoomDeclaration__RoomAssignment_3 ) )
            // InternalRinform.g:1051:2: ( rule__ItemInRoomDeclaration__RoomAssignment_3 )
            {
             before(grammarAccess.getItemInRoomDeclarationAccess().getRoomAssignment_3()); 
            // InternalRinform.g:1052:2: ( rule__ItemInRoomDeclaration__RoomAssignment_3 )
            // InternalRinform.g:1052:3: rule__ItemInRoomDeclaration__RoomAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ItemInRoomDeclaration__RoomAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getItemInRoomDeclarationAccess().getRoomAssignment_3()); 

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
    // $ANTLR end "rule__ItemInRoomDeclaration__Group__3__Impl"


    // $ANTLR start "rule__ItemInContainerDeclaration__Group__0"
    // InternalRinform.g:1061:1: rule__ItemInContainerDeclaration__Group__0 : rule__ItemInContainerDeclaration__Group__0__Impl rule__ItemInContainerDeclaration__Group__1 ;
    public final void rule__ItemInContainerDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1065:1: ( rule__ItemInContainerDeclaration__Group__0__Impl rule__ItemInContainerDeclaration__Group__1 )
            // InternalRinform.g:1066:2: rule__ItemInContainerDeclaration__Group__0__Impl rule__ItemInContainerDeclaration__Group__1
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
    // InternalRinform.g:1073:1: rule__ItemInContainerDeclaration__Group__0__Impl : ( '-i' ) ;
    public final void rule__ItemInContainerDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1077:1: ( ( '-i' ) )
            // InternalRinform.g:1078:1: ( '-i' )
            {
            // InternalRinform.g:1078:1: ( '-i' )
            // InternalRinform.g:1079:2: '-i'
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
    // InternalRinform.g:1088:1: rule__ItemInContainerDeclaration__Group__1 : rule__ItemInContainerDeclaration__Group__1__Impl rule__ItemInContainerDeclaration__Group__2 ;
    public final void rule__ItemInContainerDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1092:1: ( rule__ItemInContainerDeclaration__Group__1__Impl rule__ItemInContainerDeclaration__Group__2 )
            // InternalRinform.g:1093:2: rule__ItemInContainerDeclaration__Group__1__Impl rule__ItemInContainerDeclaration__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalRinform.g:1100:1: rule__ItemInContainerDeclaration__Group__1__Impl : ( ( rule__ItemInContainerDeclaration__NameAssignment_1 ) ) ;
    public final void rule__ItemInContainerDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1104:1: ( ( ( rule__ItemInContainerDeclaration__NameAssignment_1 ) ) )
            // InternalRinform.g:1105:1: ( ( rule__ItemInContainerDeclaration__NameAssignment_1 ) )
            {
            // InternalRinform.g:1105:1: ( ( rule__ItemInContainerDeclaration__NameAssignment_1 ) )
            // InternalRinform.g:1106:2: ( rule__ItemInContainerDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getItemInContainerDeclarationAccess().getNameAssignment_1()); 
            // InternalRinform.g:1107:2: ( rule__ItemInContainerDeclaration__NameAssignment_1 )
            // InternalRinform.g:1107:3: rule__ItemInContainerDeclaration__NameAssignment_1
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
    // InternalRinform.g:1115:1: rule__ItemInContainerDeclaration__Group__2 : rule__ItemInContainerDeclaration__Group__2__Impl rule__ItemInContainerDeclaration__Group__3 ;
    public final void rule__ItemInContainerDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1119:1: ( rule__ItemInContainerDeclaration__Group__2__Impl rule__ItemInContainerDeclaration__Group__3 )
            // InternalRinform.g:1120:2: rule__ItemInContainerDeclaration__Group__2__Impl rule__ItemInContainerDeclaration__Group__3
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
    // InternalRinform.g:1127:1: rule__ItemInContainerDeclaration__Group__2__Impl : ( '-c' ) ;
    public final void rule__ItemInContainerDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1131:1: ( ( '-c' ) )
            // InternalRinform.g:1132:1: ( '-c' )
            {
            // InternalRinform.g:1132:1: ( '-c' )
            // InternalRinform.g:1133:2: '-c'
            {
             before(grammarAccess.getItemInContainerDeclarationAccess().getCKeyword_2()); 
            match(input,30,FOLLOW_2); 
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
    // InternalRinform.g:1142:1: rule__ItemInContainerDeclaration__Group__3 : rule__ItemInContainerDeclaration__Group__3__Impl ;
    public final void rule__ItemInContainerDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1146:1: ( rule__ItemInContainerDeclaration__Group__3__Impl )
            // InternalRinform.g:1147:2: rule__ItemInContainerDeclaration__Group__3__Impl
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
    // InternalRinform.g:1153:1: rule__ItemInContainerDeclaration__Group__3__Impl : ( ( rule__ItemInContainerDeclaration__ContainerAssignment_3 ) ) ;
    public final void rule__ItemInContainerDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1157:1: ( ( ( rule__ItemInContainerDeclaration__ContainerAssignment_3 ) ) )
            // InternalRinform.g:1158:1: ( ( rule__ItemInContainerDeclaration__ContainerAssignment_3 ) )
            {
            // InternalRinform.g:1158:1: ( ( rule__ItemInContainerDeclaration__ContainerAssignment_3 ) )
            // InternalRinform.g:1159:2: ( rule__ItemInContainerDeclaration__ContainerAssignment_3 )
            {
             before(grammarAccess.getItemInContainerDeclarationAccess().getContainerAssignment_3()); 
            // InternalRinform.g:1160:2: ( rule__ItemInContainerDeclaration__ContainerAssignment_3 )
            // InternalRinform.g:1160:3: rule__ItemInContainerDeclaration__ContainerAssignment_3
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


    // $ANTLR start "rule__ItemDescription__Group__0"
    // InternalRinform.g:1169:1: rule__ItemDescription__Group__0 : rule__ItemDescription__Group__0__Impl rule__ItemDescription__Group__1 ;
    public final void rule__ItemDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1173:1: ( rule__ItemDescription__Group__0__Impl rule__ItemDescription__Group__1 )
            // InternalRinform.g:1174:2: rule__ItemDescription__Group__0__Impl rule__ItemDescription__Group__1
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
    // InternalRinform.g:1181:1: rule__ItemDescription__Group__0__Impl : ( '(' ) ;
    public final void rule__ItemDescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1185:1: ( ( '(' ) )
            // InternalRinform.g:1186:1: ( '(' )
            {
            // InternalRinform.g:1186:1: ( '(' )
            // InternalRinform.g:1187:2: '('
            {
             before(grammarAccess.getItemDescriptionAccess().getLeftParenthesisKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalRinform.g:1196:1: rule__ItemDescription__Group__1 : rule__ItemDescription__Group__1__Impl rule__ItemDescription__Group__2 ;
    public final void rule__ItemDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1200:1: ( rule__ItemDescription__Group__1__Impl rule__ItemDescription__Group__2 )
            // InternalRinform.g:1201:2: rule__ItemDescription__Group__1__Impl rule__ItemDescription__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalRinform.g:1208:1: rule__ItemDescription__Group__1__Impl : ( ( ( rule__ItemDescription__ItemDescriptionAssignment_1 ) ) ( ( rule__ItemDescription__ItemDescriptionAssignment_1 )* ) ) ;
    public final void rule__ItemDescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1212:1: ( ( ( ( rule__ItemDescription__ItemDescriptionAssignment_1 ) ) ( ( rule__ItemDescription__ItemDescriptionAssignment_1 )* ) ) )
            // InternalRinform.g:1213:1: ( ( ( rule__ItemDescription__ItemDescriptionAssignment_1 ) ) ( ( rule__ItemDescription__ItemDescriptionAssignment_1 )* ) )
            {
            // InternalRinform.g:1213:1: ( ( ( rule__ItemDescription__ItemDescriptionAssignment_1 ) ) ( ( rule__ItemDescription__ItemDescriptionAssignment_1 )* ) )
            // InternalRinform.g:1214:2: ( ( rule__ItemDescription__ItemDescriptionAssignment_1 ) ) ( ( rule__ItemDescription__ItemDescriptionAssignment_1 )* )
            {
            // InternalRinform.g:1214:2: ( ( rule__ItemDescription__ItemDescriptionAssignment_1 ) )
            // InternalRinform.g:1215:3: ( rule__ItemDescription__ItemDescriptionAssignment_1 )
            {
             before(grammarAccess.getItemDescriptionAccess().getItemDescriptionAssignment_1()); 
            // InternalRinform.g:1216:3: ( rule__ItemDescription__ItemDescriptionAssignment_1 )
            // InternalRinform.g:1216:4: rule__ItemDescription__ItemDescriptionAssignment_1
            {
            pushFollow(FOLLOW_4);
            rule__ItemDescription__ItemDescriptionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getItemDescriptionAccess().getItemDescriptionAssignment_1()); 

            }

            // InternalRinform.g:1219:2: ( ( rule__ItemDescription__ItemDescriptionAssignment_1 )* )
            // InternalRinform.g:1220:3: ( rule__ItemDescription__ItemDescriptionAssignment_1 )*
            {
             before(grammarAccess.getItemDescriptionAccess().getItemDescriptionAssignment_1()); 
            // InternalRinform.g:1221:3: ( rule__ItemDescription__ItemDescriptionAssignment_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalRinform.g:1221:4: rule__ItemDescription__ItemDescriptionAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__ItemDescription__ItemDescriptionAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalRinform.g:1230:1: rule__ItemDescription__Group__2 : rule__ItemDescription__Group__2__Impl rule__ItemDescription__Group__3 ;
    public final void rule__ItemDescription__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1234:1: ( rule__ItemDescription__Group__2__Impl rule__ItemDescription__Group__3 )
            // InternalRinform.g:1235:2: rule__ItemDescription__Group__2__Impl rule__ItemDescription__Group__3
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
    // InternalRinform.g:1242:1: rule__ItemDescription__Group__2__Impl : ( '-i' ) ;
    public final void rule__ItemDescription__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1246:1: ( ( '-i' ) )
            // InternalRinform.g:1247:1: ( '-i' )
            {
            // InternalRinform.g:1247:1: ( '-i' )
            // InternalRinform.g:1248:2: '-i'
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
    // InternalRinform.g:1257:1: rule__ItemDescription__Group__3 : rule__ItemDescription__Group__3__Impl rule__ItemDescription__Group__4 ;
    public final void rule__ItemDescription__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1261:1: ( rule__ItemDescription__Group__3__Impl rule__ItemDescription__Group__4 )
            // InternalRinform.g:1262:2: rule__ItemDescription__Group__3__Impl rule__ItemDescription__Group__4
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
    // InternalRinform.g:1269:1: rule__ItemDescription__Group__3__Impl : ( ( rule__ItemDescription__ItemAssignment_3 ) ) ;
    public final void rule__ItemDescription__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1273:1: ( ( ( rule__ItemDescription__ItemAssignment_3 ) ) )
            // InternalRinform.g:1274:1: ( ( rule__ItemDescription__ItemAssignment_3 ) )
            {
            // InternalRinform.g:1274:1: ( ( rule__ItemDescription__ItemAssignment_3 ) )
            // InternalRinform.g:1275:2: ( rule__ItemDescription__ItemAssignment_3 )
            {
             before(grammarAccess.getItemDescriptionAccess().getItemAssignment_3()); 
            // InternalRinform.g:1276:2: ( rule__ItemDescription__ItemAssignment_3 )
            // InternalRinform.g:1276:3: rule__ItemDescription__ItemAssignment_3
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
    // InternalRinform.g:1284:1: rule__ItemDescription__Group__4 : rule__ItemDescription__Group__4__Impl ;
    public final void rule__ItemDescription__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1288:1: ( rule__ItemDescription__Group__4__Impl )
            // InternalRinform.g:1289:2: rule__ItemDescription__Group__4__Impl
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
    // InternalRinform.g:1295:1: rule__ItemDescription__Group__4__Impl : ( ')' ) ;
    public final void rule__ItemDescription__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1299:1: ( ( ')' ) )
            // InternalRinform.g:1300:1: ( ')' )
            {
            // InternalRinform.g:1300:1: ( ')' )
            // InternalRinform.g:1301:2: ')'
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


    // $ANTLR start "rule__PersonDeclaration__Group__0"
    // InternalRinform.g:1311:1: rule__PersonDeclaration__Group__0 : rule__PersonDeclaration__Group__0__Impl rule__PersonDeclaration__Group__1 ;
    public final void rule__PersonDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1315:1: ( rule__PersonDeclaration__Group__0__Impl rule__PersonDeclaration__Group__1 )
            // InternalRinform.g:1316:2: rule__PersonDeclaration__Group__0__Impl rule__PersonDeclaration__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__PersonDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PersonDeclaration__Group__1();

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
    // $ANTLR end "rule__PersonDeclaration__Group__0"


    // $ANTLR start "rule__PersonDeclaration__Group__0__Impl"
    // InternalRinform.g:1323:1: rule__PersonDeclaration__Group__0__Impl : ( '-p' ) ;
    public final void rule__PersonDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1327:1: ( ( '-p' ) )
            // InternalRinform.g:1328:1: ( '-p' )
            {
            // InternalRinform.g:1328:1: ( '-p' )
            // InternalRinform.g:1329:2: '-p'
            {
             before(grammarAccess.getPersonDeclarationAccess().getPKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getPersonDeclarationAccess().getPKeyword_0()); 

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
    // $ANTLR end "rule__PersonDeclaration__Group__0__Impl"


    // $ANTLR start "rule__PersonDeclaration__Group__1"
    // InternalRinform.g:1338:1: rule__PersonDeclaration__Group__1 : rule__PersonDeclaration__Group__1__Impl rule__PersonDeclaration__Group__2 ;
    public final void rule__PersonDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1342:1: ( rule__PersonDeclaration__Group__1__Impl rule__PersonDeclaration__Group__2 )
            // InternalRinform.g:1343:2: rule__PersonDeclaration__Group__1__Impl rule__PersonDeclaration__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__PersonDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PersonDeclaration__Group__2();

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
    // $ANTLR end "rule__PersonDeclaration__Group__1"


    // $ANTLR start "rule__PersonDeclaration__Group__1__Impl"
    // InternalRinform.g:1350:1: rule__PersonDeclaration__Group__1__Impl : ( ( rule__PersonDeclaration__NameAssignment_1 ) ) ;
    public final void rule__PersonDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1354:1: ( ( ( rule__PersonDeclaration__NameAssignment_1 ) ) )
            // InternalRinform.g:1355:1: ( ( rule__PersonDeclaration__NameAssignment_1 ) )
            {
            // InternalRinform.g:1355:1: ( ( rule__PersonDeclaration__NameAssignment_1 ) )
            // InternalRinform.g:1356:2: ( rule__PersonDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getPersonDeclarationAccess().getNameAssignment_1()); 
            // InternalRinform.g:1357:2: ( rule__PersonDeclaration__NameAssignment_1 )
            // InternalRinform.g:1357:3: rule__PersonDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PersonDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPersonDeclarationAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__PersonDeclaration__Group__1__Impl"


    // $ANTLR start "rule__PersonDeclaration__Group__2"
    // InternalRinform.g:1365:1: rule__PersonDeclaration__Group__2 : rule__PersonDeclaration__Group__2__Impl rule__PersonDeclaration__Group__3 ;
    public final void rule__PersonDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1369:1: ( rule__PersonDeclaration__Group__2__Impl rule__PersonDeclaration__Group__3 )
            // InternalRinform.g:1370:2: rule__PersonDeclaration__Group__2__Impl rule__PersonDeclaration__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__PersonDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PersonDeclaration__Group__3();

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
    // $ANTLR end "rule__PersonDeclaration__Group__2"


    // $ANTLR start "rule__PersonDeclaration__Group__2__Impl"
    // InternalRinform.g:1377:1: rule__PersonDeclaration__Group__2__Impl : ( '-r' ) ;
    public final void rule__PersonDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1381:1: ( ( '-r' ) )
            // InternalRinform.g:1382:1: ( '-r' )
            {
            // InternalRinform.g:1382:1: ( '-r' )
            // InternalRinform.g:1383:2: '-r'
            {
             before(grammarAccess.getPersonDeclarationAccess().getRKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPersonDeclarationAccess().getRKeyword_2()); 

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
    // $ANTLR end "rule__PersonDeclaration__Group__2__Impl"


    // $ANTLR start "rule__PersonDeclaration__Group__3"
    // InternalRinform.g:1392:1: rule__PersonDeclaration__Group__3 : rule__PersonDeclaration__Group__3__Impl ;
    public final void rule__PersonDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1396:1: ( rule__PersonDeclaration__Group__3__Impl )
            // InternalRinform.g:1397:2: rule__PersonDeclaration__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PersonDeclaration__Group__3__Impl();

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
    // $ANTLR end "rule__PersonDeclaration__Group__3"


    // $ANTLR start "rule__PersonDeclaration__Group__3__Impl"
    // InternalRinform.g:1403:1: rule__PersonDeclaration__Group__3__Impl : ( ( rule__PersonDeclaration__RoomAssignment_3 ) ) ;
    public final void rule__PersonDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1407:1: ( ( ( rule__PersonDeclaration__RoomAssignment_3 ) ) )
            // InternalRinform.g:1408:1: ( ( rule__PersonDeclaration__RoomAssignment_3 ) )
            {
            // InternalRinform.g:1408:1: ( ( rule__PersonDeclaration__RoomAssignment_3 ) )
            // InternalRinform.g:1409:2: ( rule__PersonDeclaration__RoomAssignment_3 )
            {
             before(grammarAccess.getPersonDeclarationAccess().getRoomAssignment_3()); 
            // InternalRinform.g:1410:2: ( rule__PersonDeclaration__RoomAssignment_3 )
            // InternalRinform.g:1410:3: rule__PersonDeclaration__RoomAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__PersonDeclaration__RoomAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPersonDeclarationAccess().getRoomAssignment_3()); 

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
    // $ANTLR end "rule__PersonDeclaration__Group__3__Impl"


    // $ANTLR start "rule__PersonDescription__Group__0"
    // InternalRinform.g:1419:1: rule__PersonDescription__Group__0 : rule__PersonDescription__Group__0__Impl rule__PersonDescription__Group__1 ;
    public final void rule__PersonDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1423:1: ( rule__PersonDescription__Group__0__Impl rule__PersonDescription__Group__1 )
            // InternalRinform.g:1424:2: rule__PersonDescription__Group__0__Impl rule__PersonDescription__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__PersonDescription__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PersonDescription__Group__1();

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
    // $ANTLR end "rule__PersonDescription__Group__0"


    // $ANTLR start "rule__PersonDescription__Group__0__Impl"
    // InternalRinform.g:1431:1: rule__PersonDescription__Group__0__Impl : ( '(' ) ;
    public final void rule__PersonDescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1435:1: ( ( '(' ) )
            // InternalRinform.g:1436:1: ( '(' )
            {
            // InternalRinform.g:1436:1: ( '(' )
            // InternalRinform.g:1437:2: '('
            {
             before(grammarAccess.getPersonDescriptionAccess().getLeftParenthesisKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getPersonDescriptionAccess().getLeftParenthesisKeyword_0()); 

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
    // $ANTLR end "rule__PersonDescription__Group__0__Impl"


    // $ANTLR start "rule__PersonDescription__Group__1"
    // InternalRinform.g:1446:1: rule__PersonDescription__Group__1 : rule__PersonDescription__Group__1__Impl rule__PersonDescription__Group__2 ;
    public final void rule__PersonDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1450:1: ( rule__PersonDescription__Group__1__Impl rule__PersonDescription__Group__2 )
            // InternalRinform.g:1451:2: rule__PersonDescription__Group__1__Impl rule__PersonDescription__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__PersonDescription__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PersonDescription__Group__2();

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
    // $ANTLR end "rule__PersonDescription__Group__1"


    // $ANTLR start "rule__PersonDescription__Group__1__Impl"
    // InternalRinform.g:1458:1: rule__PersonDescription__Group__1__Impl : ( ( ( rule__PersonDescription__PersonDescriptionAssignment_1 ) ) ( ( rule__PersonDescription__PersonDescriptionAssignment_1 )* ) ) ;
    public final void rule__PersonDescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1462:1: ( ( ( ( rule__PersonDescription__PersonDescriptionAssignment_1 ) ) ( ( rule__PersonDescription__PersonDescriptionAssignment_1 )* ) ) )
            // InternalRinform.g:1463:1: ( ( ( rule__PersonDescription__PersonDescriptionAssignment_1 ) ) ( ( rule__PersonDescription__PersonDescriptionAssignment_1 )* ) )
            {
            // InternalRinform.g:1463:1: ( ( ( rule__PersonDescription__PersonDescriptionAssignment_1 ) ) ( ( rule__PersonDescription__PersonDescriptionAssignment_1 )* ) )
            // InternalRinform.g:1464:2: ( ( rule__PersonDescription__PersonDescriptionAssignment_1 ) ) ( ( rule__PersonDescription__PersonDescriptionAssignment_1 )* )
            {
            // InternalRinform.g:1464:2: ( ( rule__PersonDescription__PersonDescriptionAssignment_1 ) )
            // InternalRinform.g:1465:3: ( rule__PersonDescription__PersonDescriptionAssignment_1 )
            {
             before(grammarAccess.getPersonDescriptionAccess().getPersonDescriptionAssignment_1()); 
            // InternalRinform.g:1466:3: ( rule__PersonDescription__PersonDescriptionAssignment_1 )
            // InternalRinform.g:1466:4: rule__PersonDescription__PersonDescriptionAssignment_1
            {
            pushFollow(FOLLOW_4);
            rule__PersonDescription__PersonDescriptionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPersonDescriptionAccess().getPersonDescriptionAssignment_1()); 

            }

            // InternalRinform.g:1469:2: ( ( rule__PersonDescription__PersonDescriptionAssignment_1 )* )
            // InternalRinform.g:1470:3: ( rule__PersonDescription__PersonDescriptionAssignment_1 )*
            {
             before(grammarAccess.getPersonDescriptionAccess().getPersonDescriptionAssignment_1()); 
            // InternalRinform.g:1471:3: ( rule__PersonDescription__PersonDescriptionAssignment_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalRinform.g:1471:4: rule__PersonDescription__PersonDescriptionAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__PersonDescription__PersonDescriptionAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getPersonDescriptionAccess().getPersonDescriptionAssignment_1()); 

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
    // $ANTLR end "rule__PersonDescription__Group__1__Impl"


    // $ANTLR start "rule__PersonDescription__Group__2"
    // InternalRinform.g:1480:1: rule__PersonDescription__Group__2 : rule__PersonDescription__Group__2__Impl rule__PersonDescription__Group__3 ;
    public final void rule__PersonDescription__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1484:1: ( rule__PersonDescription__Group__2__Impl rule__PersonDescription__Group__3 )
            // InternalRinform.g:1485:2: rule__PersonDescription__Group__2__Impl rule__PersonDescription__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__PersonDescription__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PersonDescription__Group__3();

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
    // $ANTLR end "rule__PersonDescription__Group__2"


    // $ANTLR start "rule__PersonDescription__Group__2__Impl"
    // InternalRinform.g:1492:1: rule__PersonDescription__Group__2__Impl : ( '-p' ) ;
    public final void rule__PersonDescription__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1496:1: ( ( '-p' ) )
            // InternalRinform.g:1497:1: ( '-p' )
            {
            // InternalRinform.g:1497:1: ( '-p' )
            // InternalRinform.g:1498:2: '-p'
            {
             before(grammarAccess.getPersonDescriptionAccess().getPKeyword_2()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getPersonDescriptionAccess().getPKeyword_2()); 

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
    // $ANTLR end "rule__PersonDescription__Group__2__Impl"


    // $ANTLR start "rule__PersonDescription__Group__3"
    // InternalRinform.g:1507:1: rule__PersonDescription__Group__3 : rule__PersonDescription__Group__3__Impl rule__PersonDescription__Group__4 ;
    public final void rule__PersonDescription__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1511:1: ( rule__PersonDescription__Group__3__Impl rule__PersonDescription__Group__4 )
            // InternalRinform.g:1512:2: rule__PersonDescription__Group__3__Impl rule__PersonDescription__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__PersonDescription__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PersonDescription__Group__4();

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
    // $ANTLR end "rule__PersonDescription__Group__3"


    // $ANTLR start "rule__PersonDescription__Group__3__Impl"
    // InternalRinform.g:1519:1: rule__PersonDescription__Group__3__Impl : ( ( rule__PersonDescription__PersonAssignment_3 ) ) ;
    public final void rule__PersonDescription__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1523:1: ( ( ( rule__PersonDescription__PersonAssignment_3 ) ) )
            // InternalRinform.g:1524:1: ( ( rule__PersonDescription__PersonAssignment_3 ) )
            {
            // InternalRinform.g:1524:1: ( ( rule__PersonDescription__PersonAssignment_3 ) )
            // InternalRinform.g:1525:2: ( rule__PersonDescription__PersonAssignment_3 )
            {
             before(grammarAccess.getPersonDescriptionAccess().getPersonAssignment_3()); 
            // InternalRinform.g:1526:2: ( rule__PersonDescription__PersonAssignment_3 )
            // InternalRinform.g:1526:3: rule__PersonDescription__PersonAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__PersonDescription__PersonAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPersonDescriptionAccess().getPersonAssignment_3()); 

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
    // $ANTLR end "rule__PersonDescription__Group__3__Impl"


    // $ANTLR start "rule__PersonDescription__Group__4"
    // InternalRinform.g:1534:1: rule__PersonDescription__Group__4 : rule__PersonDescription__Group__4__Impl ;
    public final void rule__PersonDescription__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1538:1: ( rule__PersonDescription__Group__4__Impl )
            // InternalRinform.g:1539:2: rule__PersonDescription__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PersonDescription__Group__4__Impl();

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
    // $ANTLR end "rule__PersonDescription__Group__4"


    // $ANTLR start "rule__PersonDescription__Group__4__Impl"
    // InternalRinform.g:1545:1: rule__PersonDescription__Group__4__Impl : ( ')' ) ;
    public final void rule__PersonDescription__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1549:1: ( ( ')' ) )
            // InternalRinform.g:1550:1: ( ')' )
            {
            // InternalRinform.g:1550:1: ( ')' )
            // InternalRinform.g:1551:2: ')'
            {
             before(grammarAccess.getPersonDescriptionAccess().getRightParenthesisKeyword_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getPersonDescriptionAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__PersonDescription__Group__4__Impl"


    // $ANTLR start "rule__DirectionStatement__Group__0"
    // InternalRinform.g:1561:1: rule__DirectionStatement__Group__0 : rule__DirectionStatement__Group__0__Impl rule__DirectionStatement__Group__1 ;
    public final void rule__DirectionStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1565:1: ( rule__DirectionStatement__Group__0__Impl rule__DirectionStatement__Group__1 )
            // InternalRinform.g:1566:2: rule__DirectionStatement__Group__0__Impl rule__DirectionStatement__Group__1
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
    // InternalRinform.g:1573:1: rule__DirectionStatement__Group__0__Impl : ( '<' ) ;
    public final void rule__DirectionStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1577:1: ( ( '<' ) )
            // InternalRinform.g:1578:1: ( '<' )
            {
            // InternalRinform.g:1578:1: ( '<' )
            // InternalRinform.g:1579:2: '<'
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
    // InternalRinform.g:1588:1: rule__DirectionStatement__Group__1 : rule__DirectionStatement__Group__1__Impl rule__DirectionStatement__Group__2 ;
    public final void rule__DirectionStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1592:1: ( rule__DirectionStatement__Group__1__Impl rule__DirectionStatement__Group__2 )
            // InternalRinform.g:1593:2: rule__DirectionStatement__Group__1__Impl rule__DirectionStatement__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalRinform.g:1600:1: rule__DirectionStatement__Group__1__Impl : ( ( rule__DirectionStatement__Room1Assignment_1 ) ) ;
    public final void rule__DirectionStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1604:1: ( ( ( rule__DirectionStatement__Room1Assignment_1 ) ) )
            // InternalRinform.g:1605:1: ( ( rule__DirectionStatement__Room1Assignment_1 ) )
            {
            // InternalRinform.g:1605:1: ( ( rule__DirectionStatement__Room1Assignment_1 ) )
            // InternalRinform.g:1606:2: ( rule__DirectionStatement__Room1Assignment_1 )
            {
             before(grammarAccess.getDirectionStatementAccess().getRoom1Assignment_1()); 
            // InternalRinform.g:1607:2: ( rule__DirectionStatement__Room1Assignment_1 )
            // InternalRinform.g:1607:3: rule__DirectionStatement__Room1Assignment_1
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
    // InternalRinform.g:1615:1: rule__DirectionStatement__Group__2 : rule__DirectionStatement__Group__2__Impl rule__DirectionStatement__Group__3 ;
    public final void rule__DirectionStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1619:1: ( rule__DirectionStatement__Group__2__Impl rule__DirectionStatement__Group__3 )
            // InternalRinform.g:1620:2: rule__DirectionStatement__Group__2__Impl rule__DirectionStatement__Group__3
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
    // InternalRinform.g:1627:1: rule__DirectionStatement__Group__2__Impl : ( ( rule__DirectionStatement__DirectionAssignment_2 ) ) ;
    public final void rule__DirectionStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1631:1: ( ( ( rule__DirectionStatement__DirectionAssignment_2 ) ) )
            // InternalRinform.g:1632:1: ( ( rule__DirectionStatement__DirectionAssignment_2 ) )
            {
            // InternalRinform.g:1632:1: ( ( rule__DirectionStatement__DirectionAssignment_2 ) )
            // InternalRinform.g:1633:2: ( rule__DirectionStatement__DirectionAssignment_2 )
            {
             before(grammarAccess.getDirectionStatementAccess().getDirectionAssignment_2()); 
            // InternalRinform.g:1634:2: ( rule__DirectionStatement__DirectionAssignment_2 )
            // InternalRinform.g:1634:3: rule__DirectionStatement__DirectionAssignment_2
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
    // InternalRinform.g:1642:1: rule__DirectionStatement__Group__3 : rule__DirectionStatement__Group__3__Impl rule__DirectionStatement__Group__4 ;
    public final void rule__DirectionStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1646:1: ( rule__DirectionStatement__Group__3__Impl rule__DirectionStatement__Group__4 )
            // InternalRinform.g:1647:2: rule__DirectionStatement__Group__3__Impl rule__DirectionStatement__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalRinform.g:1654:1: rule__DirectionStatement__Group__3__Impl : ( ( rule__DirectionStatement__Room2Assignment_3 ) ) ;
    public final void rule__DirectionStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1658:1: ( ( ( rule__DirectionStatement__Room2Assignment_3 ) ) )
            // InternalRinform.g:1659:1: ( ( rule__DirectionStatement__Room2Assignment_3 ) )
            {
            // InternalRinform.g:1659:1: ( ( rule__DirectionStatement__Room2Assignment_3 ) )
            // InternalRinform.g:1660:2: ( rule__DirectionStatement__Room2Assignment_3 )
            {
             before(grammarAccess.getDirectionStatementAccess().getRoom2Assignment_3()); 
            // InternalRinform.g:1661:2: ( rule__DirectionStatement__Room2Assignment_3 )
            // InternalRinform.g:1661:3: rule__DirectionStatement__Room2Assignment_3
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
    // InternalRinform.g:1669:1: rule__DirectionStatement__Group__4 : rule__DirectionStatement__Group__4__Impl ;
    public final void rule__DirectionStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1673:1: ( rule__DirectionStatement__Group__4__Impl )
            // InternalRinform.g:1674:2: rule__DirectionStatement__Group__4__Impl
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
    // InternalRinform.g:1680:1: rule__DirectionStatement__Group__4__Impl : ( '>' ) ;
    public final void rule__DirectionStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1684:1: ( ( '>' ) )
            // InternalRinform.g:1685:1: ( '>' )
            {
            // InternalRinform.g:1685:1: ( '>' )
            // InternalRinform.g:1686:2: '>'
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
    // InternalRinform.g:1696:1: rule__Text__Group__0 : rule__Text__Group__0__Impl rule__Text__Group__1 ;
    public final void rule__Text__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1700:1: ( rule__Text__Group__0__Impl rule__Text__Group__1 )
            // InternalRinform.g:1701:2: rule__Text__Group__0__Impl rule__Text__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalRinform.g:1708:1: rule__Text__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__Text__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1712:1: ( ( RULE_ID ) )
            // InternalRinform.g:1713:1: ( RULE_ID )
            {
            // InternalRinform.g:1713:1: ( RULE_ID )
            // InternalRinform.g:1714:2: RULE_ID
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
    // InternalRinform.g:1723:1: rule__Text__Group__1 : rule__Text__Group__1__Impl ;
    public final void rule__Text__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1727:1: ( rule__Text__Group__1__Impl )
            // InternalRinform.g:1728:2: rule__Text__Group__1__Impl
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
    // InternalRinform.g:1734:1: rule__Text__Group__1__Impl : ( ( rule__Text__Group_1__0 )* ) ;
    public final void rule__Text__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1738:1: ( ( ( rule__Text__Group_1__0 )* ) )
            // InternalRinform.g:1739:1: ( ( rule__Text__Group_1__0 )* )
            {
            // InternalRinform.g:1739:1: ( ( rule__Text__Group_1__0 )* )
            // InternalRinform.g:1740:2: ( rule__Text__Group_1__0 )*
            {
             before(grammarAccess.getTextAccess().getGroup_1()); 
            // InternalRinform.g:1741:2: ( rule__Text__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_WS) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalRinform.g:1741:3: rule__Text__Group_1__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Text__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalRinform.g:1750:1: rule__Text__Group_1__0 : rule__Text__Group_1__0__Impl rule__Text__Group_1__1 ;
    public final void rule__Text__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1754:1: ( rule__Text__Group_1__0__Impl rule__Text__Group_1__1 )
            // InternalRinform.g:1755:2: rule__Text__Group_1__0__Impl rule__Text__Group_1__1
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
    // InternalRinform.g:1762:1: rule__Text__Group_1__0__Impl : ( RULE_WS ) ;
    public final void rule__Text__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1766:1: ( ( RULE_WS ) )
            // InternalRinform.g:1767:1: ( RULE_WS )
            {
            // InternalRinform.g:1767:1: ( RULE_WS )
            // InternalRinform.g:1768:2: RULE_WS
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
    // InternalRinform.g:1777:1: rule__Text__Group_1__1 : rule__Text__Group_1__1__Impl ;
    public final void rule__Text__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1781:1: ( rule__Text__Group_1__1__Impl )
            // InternalRinform.g:1782:2: rule__Text__Group_1__1__Impl
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
    // InternalRinform.g:1788:1: rule__Text__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__Text__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1792:1: ( ( RULE_ID ) )
            // InternalRinform.g:1793:1: ( RULE_ID )
            {
            // InternalRinform.g:1793:1: ( RULE_ID )
            // InternalRinform.g:1794:2: RULE_ID
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
    // InternalRinform.g:1804:1: rule__ReverseInformProgram__SentencesAssignment : ( ruleSentencePart ) ;
    public final void rule__ReverseInformProgram__SentencesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1808:1: ( ( ruleSentencePart ) )
            // InternalRinform.g:1809:2: ( ruleSentencePart )
            {
            // InternalRinform.g:1809:2: ( ruleSentencePart )
            // InternalRinform.g:1810:3: ruleSentencePart
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
    // InternalRinform.g:1819:1: rule__RoomDeclaration__NameAssignment_1 : ( ruleText ) ;
    public final void rule__RoomDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1823:1: ( ( ruleText ) )
            // InternalRinform.g:1824:2: ( ruleText )
            {
            // InternalRinform.g:1824:2: ( ruleText )
            // InternalRinform.g:1825:3: ruleText
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


    // $ANTLR start "rule__RoomAlias__RoomAssignment_1"
    // InternalRinform.g:1834:1: rule__RoomAlias__RoomAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__RoomAlias__RoomAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1838:1: ( ( ( RULE_ID ) ) )
            // InternalRinform.g:1839:2: ( ( RULE_ID ) )
            {
            // InternalRinform.g:1839:2: ( ( RULE_ID ) )
            // InternalRinform.g:1840:3: ( RULE_ID )
            {
             before(grammarAccess.getRoomAliasAccess().getRoomRoomDeclarationCrossReference_1_0()); 
            // InternalRinform.g:1841:3: ( RULE_ID )
            // InternalRinform.g:1842:4: RULE_ID
            {
             before(grammarAccess.getRoomAliasAccess().getRoomRoomDeclarationIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRoomAliasAccess().getRoomRoomDeclarationIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getRoomAliasAccess().getRoomRoomDeclarationCrossReference_1_0()); 

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
    // $ANTLR end "rule__RoomAlias__RoomAssignment_1"


    // $ANTLR start "rule__RoomAlias__AliasesAssignment_3"
    // InternalRinform.g:1853:1: rule__RoomAlias__AliasesAssignment_3 : ( ruleText ) ;
    public final void rule__RoomAlias__AliasesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1857:1: ( ( ruleText ) )
            // InternalRinform.g:1858:2: ( ruleText )
            {
            // InternalRinform.g:1858:2: ( ruleText )
            // InternalRinform.g:1859:3: ruleText
            {
             before(grammarAccess.getRoomAliasAccess().getAliasesTextParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getRoomAliasAccess().getAliasesTextParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__RoomAlias__AliasesAssignment_3"


    // $ANTLR start "rule__RoomDescription__RoomDescriptionAssignment_1"
    // InternalRinform.g:1868:1: rule__RoomDescription__RoomDescriptionAssignment_1 : ( ruleText ) ;
    public final void rule__RoomDescription__RoomDescriptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1872:1: ( ( ruleText ) )
            // InternalRinform.g:1873:2: ( ruleText )
            {
            // InternalRinform.g:1873:2: ( ruleText )
            // InternalRinform.g:1874:3: ruleText
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
    // InternalRinform.g:1883:1: rule__RoomDescription__RoomAssignment_3 : ( ( ruleText ) ) ;
    public final void rule__RoomDescription__RoomAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1887:1: ( ( ( ruleText ) ) )
            // InternalRinform.g:1888:2: ( ( ruleText ) )
            {
            // InternalRinform.g:1888:2: ( ( ruleText ) )
            // InternalRinform.g:1889:3: ( ruleText )
            {
             before(grammarAccess.getRoomDescriptionAccess().getRoomRoomDeclarationCrossReference_3_0()); 
            // InternalRinform.g:1890:3: ( ruleText )
            // InternalRinform.g:1891:4: ruleText
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


    // $ANTLR start "rule__ItemInRoomDeclaration__NameAssignment_1"
    // InternalRinform.g:1902:1: rule__ItemInRoomDeclaration__NameAssignment_1 : ( ruleText ) ;
    public final void rule__ItemInRoomDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1906:1: ( ( ruleText ) )
            // InternalRinform.g:1907:2: ( ruleText )
            {
            // InternalRinform.g:1907:2: ( ruleText )
            // InternalRinform.g:1908:3: ruleText
            {
             before(grammarAccess.getItemInRoomDeclarationAccess().getNameTextParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getItemInRoomDeclarationAccess().getNameTextParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ItemInRoomDeclaration__NameAssignment_1"


    // $ANTLR start "rule__ItemInRoomDeclaration__RoomAssignment_3"
    // InternalRinform.g:1917:1: rule__ItemInRoomDeclaration__RoomAssignment_3 : ( ( ruleText ) ) ;
    public final void rule__ItemInRoomDeclaration__RoomAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1921:1: ( ( ( ruleText ) ) )
            // InternalRinform.g:1922:2: ( ( ruleText ) )
            {
            // InternalRinform.g:1922:2: ( ( ruleText ) )
            // InternalRinform.g:1923:3: ( ruleText )
            {
             before(grammarAccess.getItemInRoomDeclarationAccess().getRoomRoomDeclarationCrossReference_3_0()); 
            // InternalRinform.g:1924:3: ( ruleText )
            // InternalRinform.g:1925:4: ruleText
            {
             before(grammarAccess.getItemInRoomDeclarationAccess().getRoomRoomDeclarationTextParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getItemInRoomDeclarationAccess().getRoomRoomDeclarationTextParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getItemInRoomDeclarationAccess().getRoomRoomDeclarationCrossReference_3_0()); 

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
    // $ANTLR end "rule__ItemInRoomDeclaration__RoomAssignment_3"


    // $ANTLR start "rule__ItemInContainerDeclaration__NameAssignment_1"
    // InternalRinform.g:1936:1: rule__ItemInContainerDeclaration__NameAssignment_1 : ( ruleText ) ;
    public final void rule__ItemInContainerDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1940:1: ( ( ruleText ) )
            // InternalRinform.g:1941:2: ( ruleText )
            {
            // InternalRinform.g:1941:2: ( ruleText )
            // InternalRinform.g:1942:3: ruleText
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
    // InternalRinform.g:1951:1: rule__ItemInContainerDeclaration__ContainerAssignment_3 : ( ( ruleText ) ) ;
    public final void rule__ItemInContainerDeclaration__ContainerAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1955:1: ( ( ( ruleText ) ) )
            // InternalRinform.g:1956:2: ( ( ruleText ) )
            {
            // InternalRinform.g:1956:2: ( ( ruleText ) )
            // InternalRinform.g:1957:3: ( ruleText )
            {
             before(grammarAccess.getItemInContainerDeclarationAccess().getContainerItemInRoomDeclarationCrossReference_3_0()); 
            // InternalRinform.g:1958:3: ( ruleText )
            // InternalRinform.g:1959:4: ruleText
            {
             before(grammarAccess.getItemInContainerDeclarationAccess().getContainerItemInRoomDeclarationTextParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getItemInContainerDeclarationAccess().getContainerItemInRoomDeclarationTextParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getItemInContainerDeclarationAccess().getContainerItemInRoomDeclarationCrossReference_3_0()); 

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


    // $ANTLR start "rule__ItemDescription__ItemDescriptionAssignment_1"
    // InternalRinform.g:1970:1: rule__ItemDescription__ItemDescriptionAssignment_1 : ( ruleText ) ;
    public final void rule__ItemDescription__ItemDescriptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1974:1: ( ( ruleText ) )
            // InternalRinform.g:1975:2: ( ruleText )
            {
            // InternalRinform.g:1975:2: ( ruleText )
            // InternalRinform.g:1976:3: ruleText
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
    // InternalRinform.g:1985:1: rule__ItemDescription__ItemAssignment_3 : ( ( ruleText ) ) ;
    public final void rule__ItemDescription__ItemAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1989:1: ( ( ( ruleText ) ) )
            // InternalRinform.g:1990:2: ( ( ruleText ) )
            {
            // InternalRinform.g:1990:2: ( ( ruleText ) )
            // InternalRinform.g:1991:3: ( ruleText )
            {
             before(grammarAccess.getItemDescriptionAccess().getItemItemDeclarationCrossReference_3_0()); 
            // InternalRinform.g:1992:3: ( ruleText )
            // InternalRinform.g:1993:4: ruleText
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


    // $ANTLR start "rule__PersonDeclaration__NameAssignment_1"
    // InternalRinform.g:2004:1: rule__PersonDeclaration__NameAssignment_1 : ( ruleText ) ;
    public final void rule__PersonDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2008:1: ( ( ruleText ) )
            // InternalRinform.g:2009:2: ( ruleText )
            {
            // InternalRinform.g:2009:2: ( ruleText )
            // InternalRinform.g:2010:3: ruleText
            {
             before(grammarAccess.getPersonDeclarationAccess().getNameTextParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getPersonDeclarationAccess().getNameTextParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__PersonDeclaration__NameAssignment_1"


    // $ANTLR start "rule__PersonDeclaration__RoomAssignment_3"
    // InternalRinform.g:2019:1: rule__PersonDeclaration__RoomAssignment_3 : ( ( ruleText ) ) ;
    public final void rule__PersonDeclaration__RoomAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2023:1: ( ( ( ruleText ) ) )
            // InternalRinform.g:2024:2: ( ( ruleText ) )
            {
            // InternalRinform.g:2024:2: ( ( ruleText ) )
            // InternalRinform.g:2025:3: ( ruleText )
            {
             before(grammarAccess.getPersonDeclarationAccess().getRoomRoomDeclarationCrossReference_3_0()); 
            // InternalRinform.g:2026:3: ( ruleText )
            // InternalRinform.g:2027:4: ruleText
            {
             before(grammarAccess.getPersonDeclarationAccess().getRoomRoomDeclarationTextParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getPersonDeclarationAccess().getRoomRoomDeclarationTextParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getPersonDeclarationAccess().getRoomRoomDeclarationCrossReference_3_0()); 

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
    // $ANTLR end "rule__PersonDeclaration__RoomAssignment_3"


    // $ANTLR start "rule__PersonDescription__PersonDescriptionAssignment_1"
    // InternalRinform.g:2038:1: rule__PersonDescription__PersonDescriptionAssignment_1 : ( ruleText ) ;
    public final void rule__PersonDescription__PersonDescriptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2042:1: ( ( ruleText ) )
            // InternalRinform.g:2043:2: ( ruleText )
            {
            // InternalRinform.g:2043:2: ( ruleText )
            // InternalRinform.g:2044:3: ruleText
            {
             before(grammarAccess.getPersonDescriptionAccess().getPersonDescriptionTextParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getPersonDescriptionAccess().getPersonDescriptionTextParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__PersonDescription__PersonDescriptionAssignment_1"


    // $ANTLR start "rule__PersonDescription__PersonAssignment_3"
    // InternalRinform.g:2053:1: rule__PersonDescription__PersonAssignment_3 : ( ( ruleText ) ) ;
    public final void rule__PersonDescription__PersonAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2057:1: ( ( ( ruleText ) ) )
            // InternalRinform.g:2058:2: ( ( ruleText ) )
            {
            // InternalRinform.g:2058:2: ( ( ruleText ) )
            // InternalRinform.g:2059:3: ( ruleText )
            {
             before(grammarAccess.getPersonDescriptionAccess().getPersonPersonDeclarationCrossReference_3_0()); 
            // InternalRinform.g:2060:3: ( ruleText )
            // InternalRinform.g:2061:4: ruleText
            {
             before(grammarAccess.getPersonDescriptionAccess().getPersonPersonDeclarationTextParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getPersonDescriptionAccess().getPersonPersonDeclarationTextParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getPersonDescriptionAccess().getPersonPersonDeclarationCrossReference_3_0()); 

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
    // $ANTLR end "rule__PersonDescription__PersonAssignment_3"


    // $ANTLR start "rule__DirectionStatement__Room1Assignment_1"
    // InternalRinform.g:2072:1: rule__DirectionStatement__Room1Assignment_1 : ( ( ruleText ) ) ;
    public final void rule__DirectionStatement__Room1Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2076:1: ( ( ( ruleText ) ) )
            // InternalRinform.g:2077:2: ( ( ruleText ) )
            {
            // InternalRinform.g:2077:2: ( ( ruleText ) )
            // InternalRinform.g:2078:3: ( ruleText )
            {
             before(grammarAccess.getDirectionStatementAccess().getRoom1RoomDeclarationCrossReference_1_0()); 
            // InternalRinform.g:2079:3: ( ruleText )
            // InternalRinform.g:2080:4: ruleText
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
    // InternalRinform.g:2091:1: rule__DirectionStatement__DirectionAssignment_2 : ( ruleDirection ) ;
    public final void rule__DirectionStatement__DirectionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2095:1: ( ( ruleDirection ) )
            // InternalRinform.g:2096:2: ( ruleDirection )
            {
            // InternalRinform.g:2096:2: ( ruleDirection )
            // InternalRinform.g:2097:3: ruleDirection
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
    // InternalRinform.g:2106:1: rule__DirectionStatement__Room2Assignment_3 : ( ( ruleText ) ) ;
    public final void rule__DirectionStatement__Room2Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2110:1: ( ( ( ruleText ) ) )
            // InternalRinform.g:2111:2: ( ( ruleText ) )
            {
            // InternalRinform.g:2111:2: ( ( ruleText ) )
            // InternalRinform.g:2112:3: ( ruleText )
            {
             before(grammarAccess.getDirectionStatementAccess().getRoom2RoomDeclarationCrossReference_3_0()); 
            // InternalRinform.g:2113:3: ( ruleText )
            // InternalRinform.g:2114:4: ruleText
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
    // InternalRinform.g:2125:1: rule__Words__WordsAssignment : ( ruleText ) ;
    public final void rule__Words__WordsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2129:1: ( ( ruleText ) )
            // InternalRinform.g:2130:2: ( ruleText )
            {
            // InternalRinform.g:2130:2: ( ruleText )
            // InternalRinform.g:2131:3: ruleText
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
    // InternalRinform.g:2140:1: rule__Symbol__SymbolAssignment : ( ( rule__Symbol__SymbolAlternatives_0 ) ) ;
    public final void rule__Symbol__SymbolAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2144:1: ( ( ( rule__Symbol__SymbolAlternatives_0 ) ) )
            // InternalRinform.g:2145:2: ( ( rule__Symbol__SymbolAlternatives_0 ) )
            {
            // InternalRinform.g:2145:2: ( ( rule__Symbol__SymbolAlternatives_0 ) )
            // InternalRinform.g:2146:3: ( rule__Symbol__SymbolAlternatives_0 )
            {
             before(grammarAccess.getSymbolAccess().getSymbolAlternatives_0()); 
            // InternalRinform.g:2147:3: ( rule__Symbol__SymbolAlternatives_0 )
            // InternalRinform.g:2147:4: rule__Symbol__SymbolAlternatives_0
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
    static final String dfa_1s = "\24\uffff";
    static final String dfa_2s = "\10\uffff\1\12\13\uffff";
    static final String dfa_3s = "\3\4\5\uffff\2\4\2\uffff\2\4\3\uffff\3\4";
    static final String dfa_4s = "\1\40\2\4\5\uffff\1\40\1\37\2\uffff\1\4\1\37\3\uffff\1\37\1\4\1\37";
    static final String dfa_5s = "\3\uffff\1\4\1\6\1\10\1\11\1\12\2\uffff\1\1\1\2\2\uffff\1\7\1\3\1\5\3\uffff";
    static final String dfa_6s = "\24\uffff}>";
    static final String[] dfa_7s = {
            "\1\5\6\uffff\10\6\6\uffff\1\1\1\uffff\1\2\1\uffff\1\3\1\uffff\1\4\1\7",
            "\1\10",
            "\1\11",
            "",
            "",
            "",
            "",
            "",
            "\2\12\5\uffff\10\12\6\uffff\1\12\1\13\1\12\1\uffff\1\12\1\uffff\2\12",
            "\1\15\1\14\23\uffff\1\17\3\uffff\1\20\1\uffff\1\16",
            "",
            "",
            "\1\21",
            "\1\15\1\22\23\uffff\1\17\3\uffff\1\20\1\uffff\1\16",
            "",
            "",
            "",
            "\1\15\1\14\23\uffff\1\17\3\uffff\1\20\1\uffff\1\16",
            "\1\23",
            "\1\15\1\22\23\uffff\1\17\3\uffff\1\20\1\uffff\1\16"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "450:1: rule__SentencePart__Alternatives : ( ( ruleRoomDeclaration ) | ( ruleRoomAlias ) | ( ruleRoomDescription ) | ( ruleItemDeclaration ) | ( ruleItemDescription ) | ( rulePersonDeclaration ) | ( rulePersonDescription ) | ( ruleWords ) | ( ruleSymbol ) | ( ruleDirectionStatement ) );";
        }
    }
    static final String dfa_8s = "\7\uffff";
    static final String dfa_9s = "\1\35\1\4\1\5\1\4\2\uffff\1\5";
    static final String dfa_10s = "\1\35\1\4\1\36\1\4\2\uffff\1\36";
    static final String dfa_11s = "\4\uffff\1\1\1\2\1\uffff";
    static final String dfa_12s = "\7\uffff}>";
    static final String[] dfa_13s = {
            "\1\1",
            "\1\2",
            "\1\3\23\uffff\1\4\4\uffff\1\5",
            "\1\6",
            "",
            "",
            "\1\3\23\uffff\1\4\4\uffff\1\5"
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "519:1: rule__ItemDeclaration__Alternatives : ( ( ruleItemInRoomDeclaration ) | ( ruleItemInContainerDeclaration ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000001AA07F812L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001F80000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000022L});

}