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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_WS", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'.'", "','", "';'", "':'", "'-'", "'!'", "'?'", "'\\''", "'South'", "'North'", "'East'", "'West'", "'Below'", "'Above'", "'-r'", "'-a'", "'('", "')'", "'-c'", "'-i'", "'-p'", "'<'", "'>'"
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

                if ( (LA1_0==RULE_ID||(LA1_0>=11 && LA1_0<=18)||LA1_0==25||LA1_0==27||(LA1_0>=29 && LA1_0<=32)) ) {
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


    // $ANTLR start "entryRuleContainerDeclaration"
    // InternalRinform.g:178:1: entryRuleContainerDeclaration : ruleContainerDeclaration EOF ;
    public final void entryRuleContainerDeclaration() throws RecognitionException {
        try {
            // InternalRinform.g:179:1: ( ruleContainerDeclaration EOF )
            // InternalRinform.g:180:1: ruleContainerDeclaration EOF
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
    // InternalRinform.g:187:1: ruleContainerDeclaration : ( ( rule__ContainerDeclaration__Group__0 ) ) ;
    public final void ruleContainerDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:191:2: ( ( ( rule__ContainerDeclaration__Group__0 ) ) )
            // InternalRinform.g:192:2: ( ( rule__ContainerDeclaration__Group__0 ) )
            {
            // InternalRinform.g:192:2: ( ( rule__ContainerDeclaration__Group__0 ) )
            // InternalRinform.g:193:3: ( rule__ContainerDeclaration__Group__0 )
            {
             before(grammarAccess.getContainerDeclarationAccess().getGroup()); 
            // InternalRinform.g:194:3: ( rule__ContainerDeclaration__Group__0 )
            // InternalRinform.g:194:4: rule__ContainerDeclaration__Group__0
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


    // $ANTLR start "entryRuleItemInRoomDeclaration"
    // InternalRinform.g:203:1: entryRuleItemInRoomDeclaration : ruleItemInRoomDeclaration EOF ;
    public final void entryRuleItemInRoomDeclaration() throws RecognitionException {
        try {
            // InternalRinform.g:204:1: ( ruleItemInRoomDeclaration EOF )
            // InternalRinform.g:205:1: ruleItemInRoomDeclaration EOF
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
    // InternalRinform.g:212:1: ruleItemInRoomDeclaration : ( ( rule__ItemInRoomDeclaration__Group__0 ) ) ;
    public final void ruleItemInRoomDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:216:2: ( ( ( rule__ItemInRoomDeclaration__Group__0 ) ) )
            // InternalRinform.g:217:2: ( ( rule__ItemInRoomDeclaration__Group__0 ) )
            {
            // InternalRinform.g:217:2: ( ( rule__ItemInRoomDeclaration__Group__0 ) )
            // InternalRinform.g:218:3: ( rule__ItemInRoomDeclaration__Group__0 )
            {
             before(grammarAccess.getItemInRoomDeclarationAccess().getGroup()); 
            // InternalRinform.g:219:3: ( rule__ItemInRoomDeclaration__Group__0 )
            // InternalRinform.g:219:4: rule__ItemInRoomDeclaration__Group__0
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
    // InternalRinform.g:228:1: entryRuleItemInContainerDeclaration : ruleItemInContainerDeclaration EOF ;
    public final void entryRuleItemInContainerDeclaration() throws RecognitionException {
        try {
            // InternalRinform.g:229:1: ( ruleItemInContainerDeclaration EOF )
            // InternalRinform.g:230:1: ruleItemInContainerDeclaration EOF
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
    // InternalRinform.g:237:1: ruleItemInContainerDeclaration : ( ( rule__ItemInContainerDeclaration__Group__0 ) ) ;
    public final void ruleItemInContainerDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:241:2: ( ( ( rule__ItemInContainerDeclaration__Group__0 ) ) )
            // InternalRinform.g:242:2: ( ( rule__ItemInContainerDeclaration__Group__0 ) )
            {
            // InternalRinform.g:242:2: ( ( rule__ItemInContainerDeclaration__Group__0 ) )
            // InternalRinform.g:243:3: ( rule__ItemInContainerDeclaration__Group__0 )
            {
             before(grammarAccess.getItemInContainerDeclarationAccess().getGroup()); 
            // InternalRinform.g:244:3: ( rule__ItemInContainerDeclaration__Group__0 )
            // InternalRinform.g:244:4: rule__ItemInContainerDeclaration__Group__0
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
    // InternalRinform.g:253:1: entryRuleItemDeclaration : ruleItemDeclaration EOF ;
    public final void entryRuleItemDeclaration() throws RecognitionException {
        try {
            // InternalRinform.g:254:1: ( ruleItemDeclaration EOF )
            // InternalRinform.g:255:1: ruleItemDeclaration EOF
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
    // InternalRinform.g:262:1: ruleItemDeclaration : ( ( rule__ItemDeclaration__Alternatives ) ) ;
    public final void ruleItemDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:266:2: ( ( ( rule__ItemDeclaration__Alternatives ) ) )
            // InternalRinform.g:267:2: ( ( rule__ItemDeclaration__Alternatives ) )
            {
            // InternalRinform.g:267:2: ( ( rule__ItemDeclaration__Alternatives ) )
            // InternalRinform.g:268:3: ( rule__ItemDeclaration__Alternatives )
            {
             before(grammarAccess.getItemDeclarationAccess().getAlternatives()); 
            // InternalRinform.g:269:3: ( rule__ItemDeclaration__Alternatives )
            // InternalRinform.g:269:4: rule__ItemDeclaration__Alternatives
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
    // InternalRinform.g:278:1: entryRuleItemDescription : ruleItemDescription EOF ;
    public final void entryRuleItemDescription() throws RecognitionException {
        try {
            // InternalRinform.g:279:1: ( ruleItemDescription EOF )
            // InternalRinform.g:280:1: ruleItemDescription EOF
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
    // InternalRinform.g:287:1: ruleItemDescription : ( ( rule__ItemDescription__Group__0 ) ) ;
    public final void ruleItemDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:291:2: ( ( ( rule__ItemDescription__Group__0 ) ) )
            // InternalRinform.g:292:2: ( ( rule__ItemDescription__Group__0 ) )
            {
            // InternalRinform.g:292:2: ( ( rule__ItemDescription__Group__0 ) )
            // InternalRinform.g:293:3: ( rule__ItemDescription__Group__0 )
            {
             before(grammarAccess.getItemDescriptionAccess().getGroup()); 
            // InternalRinform.g:294:3: ( rule__ItemDescription__Group__0 )
            // InternalRinform.g:294:4: rule__ItemDescription__Group__0
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
    // InternalRinform.g:303:1: entryRulePersonDeclaration : rulePersonDeclaration EOF ;
    public final void entryRulePersonDeclaration() throws RecognitionException {
        try {
            // InternalRinform.g:304:1: ( rulePersonDeclaration EOF )
            // InternalRinform.g:305:1: rulePersonDeclaration EOF
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
    // InternalRinform.g:312:1: rulePersonDeclaration : ( ( rule__PersonDeclaration__Group__0 ) ) ;
    public final void rulePersonDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:316:2: ( ( ( rule__PersonDeclaration__Group__0 ) ) )
            // InternalRinform.g:317:2: ( ( rule__PersonDeclaration__Group__0 ) )
            {
            // InternalRinform.g:317:2: ( ( rule__PersonDeclaration__Group__0 ) )
            // InternalRinform.g:318:3: ( rule__PersonDeclaration__Group__0 )
            {
             before(grammarAccess.getPersonDeclarationAccess().getGroup()); 
            // InternalRinform.g:319:3: ( rule__PersonDeclaration__Group__0 )
            // InternalRinform.g:319:4: rule__PersonDeclaration__Group__0
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
    // InternalRinform.g:328:1: entryRulePersonDescription : rulePersonDescription EOF ;
    public final void entryRulePersonDescription() throws RecognitionException {
        try {
            // InternalRinform.g:329:1: ( rulePersonDescription EOF )
            // InternalRinform.g:330:1: rulePersonDescription EOF
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
    // InternalRinform.g:337:1: rulePersonDescription : ( ( rule__PersonDescription__Group__0 ) ) ;
    public final void rulePersonDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:341:2: ( ( ( rule__PersonDescription__Group__0 ) ) )
            // InternalRinform.g:342:2: ( ( rule__PersonDescription__Group__0 ) )
            {
            // InternalRinform.g:342:2: ( ( rule__PersonDescription__Group__0 ) )
            // InternalRinform.g:343:3: ( rule__PersonDescription__Group__0 )
            {
             before(grammarAccess.getPersonDescriptionAccess().getGroup()); 
            // InternalRinform.g:344:3: ( rule__PersonDescription__Group__0 )
            // InternalRinform.g:344:4: rule__PersonDescription__Group__0
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
    // InternalRinform.g:353:1: entryRuleDirectionStatement : ruleDirectionStatement EOF ;
    public final void entryRuleDirectionStatement() throws RecognitionException {
        try {
            // InternalRinform.g:354:1: ( ruleDirectionStatement EOF )
            // InternalRinform.g:355:1: ruleDirectionStatement EOF
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
    // InternalRinform.g:362:1: ruleDirectionStatement : ( ( rule__DirectionStatement__Group__0 ) ) ;
    public final void ruleDirectionStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:366:2: ( ( ( rule__DirectionStatement__Group__0 ) ) )
            // InternalRinform.g:367:2: ( ( rule__DirectionStatement__Group__0 ) )
            {
            // InternalRinform.g:367:2: ( ( rule__DirectionStatement__Group__0 ) )
            // InternalRinform.g:368:3: ( rule__DirectionStatement__Group__0 )
            {
             before(grammarAccess.getDirectionStatementAccess().getGroup()); 
            // InternalRinform.g:369:3: ( rule__DirectionStatement__Group__0 )
            // InternalRinform.g:369:4: rule__DirectionStatement__Group__0
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
    // InternalRinform.g:378:1: entryRuleText : ruleText EOF ;
    public final void entryRuleText() throws RecognitionException {
        try {
            // InternalRinform.g:379:1: ( ruleText EOF )
            // InternalRinform.g:380:1: ruleText EOF
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
    // InternalRinform.g:387:1: ruleText : ( ( rule__Text__Group__0 ) ) ;
    public final void ruleText() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:391:2: ( ( ( rule__Text__Group__0 ) ) )
            // InternalRinform.g:392:2: ( ( rule__Text__Group__0 ) )
            {
            // InternalRinform.g:392:2: ( ( rule__Text__Group__0 ) )
            // InternalRinform.g:393:3: ( rule__Text__Group__0 )
            {
             before(grammarAccess.getTextAccess().getGroup()); 
            // InternalRinform.g:394:3: ( rule__Text__Group__0 )
            // InternalRinform.g:394:4: rule__Text__Group__0
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
    // InternalRinform.g:403:1: entryRuleWords : ruleWords EOF ;
    public final void entryRuleWords() throws RecognitionException {
        try {
            // InternalRinform.g:404:1: ( ruleWords EOF )
            // InternalRinform.g:405:1: ruleWords EOF
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
    // InternalRinform.g:412:1: ruleWords : ( ( ( rule__Words__WordsAssignment ) ) ( ( rule__Words__WordsAssignment )* ) ) ;
    public final void ruleWords() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:416:2: ( ( ( ( rule__Words__WordsAssignment ) ) ( ( rule__Words__WordsAssignment )* ) ) )
            // InternalRinform.g:417:2: ( ( ( rule__Words__WordsAssignment ) ) ( ( rule__Words__WordsAssignment )* ) )
            {
            // InternalRinform.g:417:2: ( ( ( rule__Words__WordsAssignment ) ) ( ( rule__Words__WordsAssignment )* ) )
            // InternalRinform.g:418:3: ( ( rule__Words__WordsAssignment ) ) ( ( rule__Words__WordsAssignment )* )
            {
            // InternalRinform.g:418:3: ( ( rule__Words__WordsAssignment ) )
            // InternalRinform.g:419:4: ( rule__Words__WordsAssignment )
            {
             before(grammarAccess.getWordsAccess().getWordsAssignment()); 
            // InternalRinform.g:420:4: ( rule__Words__WordsAssignment )
            // InternalRinform.g:420:5: rule__Words__WordsAssignment
            {
            pushFollow(FOLLOW_4);
            rule__Words__WordsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getWordsAccess().getWordsAssignment()); 

            }

            // InternalRinform.g:423:3: ( ( rule__Words__WordsAssignment )* )
            // InternalRinform.g:424:4: ( rule__Words__WordsAssignment )*
            {
             before(grammarAccess.getWordsAccess().getWordsAssignment()); 
            // InternalRinform.g:425:4: ( rule__Words__WordsAssignment )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalRinform.g:425:5: rule__Words__WordsAssignment
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
    // InternalRinform.g:435:1: entryRuleSymbol : ruleSymbol EOF ;
    public final void entryRuleSymbol() throws RecognitionException {
        try {
            // InternalRinform.g:436:1: ( ruleSymbol EOF )
            // InternalRinform.g:437:1: ruleSymbol EOF
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
    // InternalRinform.g:444:1: ruleSymbol : ( ( rule__Symbol__SymbolAssignment ) ) ;
    public final void ruleSymbol() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:448:2: ( ( ( rule__Symbol__SymbolAssignment ) ) )
            // InternalRinform.g:449:2: ( ( rule__Symbol__SymbolAssignment ) )
            {
            // InternalRinform.g:449:2: ( ( rule__Symbol__SymbolAssignment ) )
            // InternalRinform.g:450:3: ( rule__Symbol__SymbolAssignment )
            {
             before(grammarAccess.getSymbolAccess().getSymbolAssignment()); 
            // InternalRinform.g:451:3: ( rule__Symbol__SymbolAssignment )
            // InternalRinform.g:451:4: rule__Symbol__SymbolAssignment
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
    // InternalRinform.g:460:1: ruleDirection : ( ( rule__Direction__Alternatives ) ) ;
    public final void ruleDirection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:464:1: ( ( ( rule__Direction__Alternatives ) ) )
            // InternalRinform.g:465:2: ( ( rule__Direction__Alternatives ) )
            {
            // InternalRinform.g:465:2: ( ( rule__Direction__Alternatives ) )
            // InternalRinform.g:466:3: ( rule__Direction__Alternatives )
            {
             before(grammarAccess.getDirectionAccess().getAlternatives()); 
            // InternalRinform.g:467:3: ( rule__Direction__Alternatives )
            // InternalRinform.g:467:4: rule__Direction__Alternatives
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
    // InternalRinform.g:475:1: rule__SentencePart__Alternatives : ( ( ruleRoomDeclaration ) | ( ruleRoomAlias ) | ( ruleRoomDescription ) | ( ruleItemDeclaration ) | ( ruleItemDescription ) | ( rulePersonDeclaration ) | ( rulePersonDescription ) | ( ruleWords ) | ( ruleSymbol ) | ( ruleDirectionStatement ) );
    public final void rule__SentencePart__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:479:1: ( ( ruleRoomDeclaration ) | ( ruleRoomAlias ) | ( ruleRoomDescription ) | ( ruleItemDeclaration ) | ( ruleItemDescription ) | ( rulePersonDeclaration ) | ( rulePersonDescription ) | ( ruleWords ) | ( ruleSymbol ) | ( ruleDirectionStatement ) )
            int alt3=10;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalRinform.g:480:2: ( ruleRoomDeclaration )
                    {
                    // InternalRinform.g:480:2: ( ruleRoomDeclaration )
                    // InternalRinform.g:481:3: ruleRoomDeclaration
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
                    // InternalRinform.g:486:2: ( ruleRoomAlias )
                    {
                    // InternalRinform.g:486:2: ( ruleRoomAlias )
                    // InternalRinform.g:487:3: ruleRoomAlias
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
                    // InternalRinform.g:492:2: ( ruleRoomDescription )
                    {
                    // InternalRinform.g:492:2: ( ruleRoomDescription )
                    // InternalRinform.g:493:3: ruleRoomDescription
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
                    // InternalRinform.g:498:2: ( ruleItemDeclaration )
                    {
                    // InternalRinform.g:498:2: ( ruleItemDeclaration )
                    // InternalRinform.g:499:3: ruleItemDeclaration
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
                    // InternalRinform.g:504:2: ( ruleItemDescription )
                    {
                    // InternalRinform.g:504:2: ( ruleItemDescription )
                    // InternalRinform.g:505:3: ruleItemDescription
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
                    // InternalRinform.g:510:2: ( rulePersonDeclaration )
                    {
                    // InternalRinform.g:510:2: ( rulePersonDeclaration )
                    // InternalRinform.g:511:3: rulePersonDeclaration
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
                    // InternalRinform.g:516:2: ( rulePersonDescription )
                    {
                    // InternalRinform.g:516:2: ( rulePersonDescription )
                    // InternalRinform.g:517:3: rulePersonDescription
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
                    // InternalRinform.g:522:2: ( ruleWords )
                    {
                    // InternalRinform.g:522:2: ( ruleWords )
                    // InternalRinform.g:523:3: ruleWords
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
                    // InternalRinform.g:528:2: ( ruleSymbol )
                    {
                    // InternalRinform.g:528:2: ( ruleSymbol )
                    // InternalRinform.g:529:3: ruleSymbol
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
                    // InternalRinform.g:534:2: ( ruleDirectionStatement )
                    {
                    // InternalRinform.g:534:2: ( ruleDirectionStatement )
                    // InternalRinform.g:535:3: ruleDirectionStatement
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
    // InternalRinform.g:544:1: rule__ItemDeclaration__Alternatives : ( ( ruleItemInRoomDeclaration ) | ( ruleContainerDeclaration ) | ( ruleItemInContainerDeclaration ) );
    public final void rule__ItemDeclaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:548:1: ( ( ruleItemInRoomDeclaration ) | ( ruleContainerDeclaration ) | ( ruleItemInContainerDeclaration ) )
            int alt4=3;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalRinform.g:549:2: ( ruleItemInRoomDeclaration )
                    {
                    // InternalRinform.g:549:2: ( ruleItemInRoomDeclaration )
                    // InternalRinform.g:550:3: ruleItemInRoomDeclaration
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
                    // InternalRinform.g:555:2: ( ruleContainerDeclaration )
                    {
                    // InternalRinform.g:555:2: ( ruleContainerDeclaration )
                    // InternalRinform.g:556:3: ruleContainerDeclaration
                    {
                     before(grammarAccess.getItemDeclarationAccess().getContainerDeclarationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleContainerDeclaration();

                    state._fsp--;

                     after(grammarAccess.getItemDeclarationAccess().getContainerDeclarationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRinform.g:561:2: ( ruleItemInContainerDeclaration )
                    {
                    // InternalRinform.g:561:2: ( ruleItemInContainerDeclaration )
                    // InternalRinform.g:562:3: ruleItemInContainerDeclaration
                    {
                     before(grammarAccess.getItemDeclarationAccess().getItemInContainerDeclarationParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleItemInContainerDeclaration();

                    state._fsp--;

                     after(grammarAccess.getItemDeclarationAccess().getItemInContainerDeclarationParserRuleCall_2()); 

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
    // InternalRinform.g:571:1: rule__Symbol__SymbolAlternatives_0 : ( ( '.' ) | ( ',' ) | ( ';' ) | ( ':' ) | ( '-' ) | ( '!' ) | ( '?' ) | ( '\\'' ) );
    public final void rule__Symbol__SymbolAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:575:1: ( ( '.' ) | ( ',' ) | ( ';' ) | ( ':' ) | ( '-' ) | ( '!' ) | ( '?' ) | ( '\\'' ) )
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
                    // InternalRinform.g:576:2: ( '.' )
                    {
                    // InternalRinform.g:576:2: ( '.' )
                    // InternalRinform.g:577:3: '.'
                    {
                     before(grammarAccess.getSymbolAccess().getSymbolFullStopKeyword_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getSymbolAccess().getSymbolFullStopKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRinform.g:582:2: ( ',' )
                    {
                    // InternalRinform.g:582:2: ( ',' )
                    // InternalRinform.g:583:3: ','
                    {
                     before(grammarAccess.getSymbolAccess().getSymbolCommaKeyword_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getSymbolAccess().getSymbolCommaKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRinform.g:588:2: ( ';' )
                    {
                    // InternalRinform.g:588:2: ( ';' )
                    // InternalRinform.g:589:3: ';'
                    {
                     before(grammarAccess.getSymbolAccess().getSymbolSemicolonKeyword_0_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getSymbolAccess().getSymbolSemicolonKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRinform.g:594:2: ( ':' )
                    {
                    // InternalRinform.g:594:2: ( ':' )
                    // InternalRinform.g:595:3: ':'
                    {
                     before(grammarAccess.getSymbolAccess().getSymbolColonKeyword_0_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getSymbolAccess().getSymbolColonKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalRinform.g:600:2: ( '-' )
                    {
                    // InternalRinform.g:600:2: ( '-' )
                    // InternalRinform.g:601:3: '-'
                    {
                     before(grammarAccess.getSymbolAccess().getSymbolHyphenMinusKeyword_0_4()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getSymbolAccess().getSymbolHyphenMinusKeyword_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalRinform.g:606:2: ( '!' )
                    {
                    // InternalRinform.g:606:2: ( '!' )
                    // InternalRinform.g:607:3: '!'
                    {
                     before(grammarAccess.getSymbolAccess().getSymbolExclamationMarkKeyword_0_5()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getSymbolAccess().getSymbolExclamationMarkKeyword_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalRinform.g:612:2: ( '?' )
                    {
                    // InternalRinform.g:612:2: ( '?' )
                    // InternalRinform.g:613:3: '?'
                    {
                     before(grammarAccess.getSymbolAccess().getSymbolQuestionMarkKeyword_0_6()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getSymbolAccess().getSymbolQuestionMarkKeyword_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalRinform.g:618:2: ( '\\'' )
                    {
                    // InternalRinform.g:618:2: ( '\\'' )
                    // InternalRinform.g:619:3: '\\''
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
    // InternalRinform.g:628:1: rule__Direction__Alternatives : ( ( ( 'South' ) ) | ( ( 'North' ) ) | ( ( 'East' ) ) | ( ( 'West' ) ) | ( ( 'Below' ) ) | ( ( 'Above' ) ) );
    public final void rule__Direction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:632:1: ( ( ( 'South' ) ) | ( ( 'North' ) ) | ( ( 'East' ) ) | ( ( 'West' ) ) | ( ( 'Below' ) ) | ( ( 'Above' ) ) )
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
                    // InternalRinform.g:633:2: ( ( 'South' ) )
                    {
                    // InternalRinform.g:633:2: ( ( 'South' ) )
                    // InternalRinform.g:634:3: ( 'South' )
                    {
                     before(grammarAccess.getDirectionAccess().getSouthEnumLiteralDeclaration_0()); 
                    // InternalRinform.g:635:3: ( 'South' )
                    // InternalRinform.g:635:4: 'South'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectionAccess().getSouthEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRinform.g:639:2: ( ( 'North' ) )
                    {
                    // InternalRinform.g:639:2: ( ( 'North' ) )
                    // InternalRinform.g:640:3: ( 'North' )
                    {
                     before(grammarAccess.getDirectionAccess().getNorthEnumLiteralDeclaration_1()); 
                    // InternalRinform.g:641:3: ( 'North' )
                    // InternalRinform.g:641:4: 'North'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectionAccess().getNorthEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRinform.g:645:2: ( ( 'East' ) )
                    {
                    // InternalRinform.g:645:2: ( ( 'East' ) )
                    // InternalRinform.g:646:3: ( 'East' )
                    {
                     before(grammarAccess.getDirectionAccess().getEastEnumLiteralDeclaration_2()); 
                    // InternalRinform.g:647:3: ( 'East' )
                    // InternalRinform.g:647:4: 'East'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectionAccess().getEastEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRinform.g:651:2: ( ( 'West' ) )
                    {
                    // InternalRinform.g:651:2: ( ( 'West' ) )
                    // InternalRinform.g:652:3: ( 'West' )
                    {
                     before(grammarAccess.getDirectionAccess().getWestEnumLiteralDeclaration_3()); 
                    // InternalRinform.g:653:3: ( 'West' )
                    // InternalRinform.g:653:4: 'West'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectionAccess().getWestEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalRinform.g:657:2: ( ( 'Below' ) )
                    {
                    // InternalRinform.g:657:2: ( ( 'Below' ) )
                    // InternalRinform.g:658:3: ( 'Below' )
                    {
                     before(grammarAccess.getDirectionAccess().getBelowEnumLiteralDeclaration_4()); 
                    // InternalRinform.g:659:3: ( 'Below' )
                    // InternalRinform.g:659:4: 'Below'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectionAccess().getBelowEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalRinform.g:663:2: ( ( 'Above' ) )
                    {
                    // InternalRinform.g:663:2: ( ( 'Above' ) )
                    // InternalRinform.g:664:3: ( 'Above' )
                    {
                     before(grammarAccess.getDirectionAccess().getAboveEnumLiteralDeclaration_5()); 
                    // InternalRinform.g:665:3: ( 'Above' )
                    // InternalRinform.g:665:4: 'Above'
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
    // InternalRinform.g:673:1: rule__RoomDeclaration__Group__0 : rule__RoomDeclaration__Group__0__Impl rule__RoomDeclaration__Group__1 ;
    public final void rule__RoomDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:677:1: ( rule__RoomDeclaration__Group__0__Impl rule__RoomDeclaration__Group__1 )
            // InternalRinform.g:678:2: rule__RoomDeclaration__Group__0__Impl rule__RoomDeclaration__Group__1
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
    // InternalRinform.g:685:1: rule__RoomDeclaration__Group__0__Impl : ( '-r' ) ;
    public final void rule__RoomDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:689:1: ( ( '-r' ) )
            // InternalRinform.g:690:1: ( '-r' )
            {
            // InternalRinform.g:690:1: ( '-r' )
            // InternalRinform.g:691:2: '-r'
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
    // InternalRinform.g:700:1: rule__RoomDeclaration__Group__1 : rule__RoomDeclaration__Group__1__Impl ;
    public final void rule__RoomDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:704:1: ( rule__RoomDeclaration__Group__1__Impl )
            // InternalRinform.g:705:2: rule__RoomDeclaration__Group__1__Impl
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
    // InternalRinform.g:711:1: rule__RoomDeclaration__Group__1__Impl : ( ( rule__RoomDeclaration__NameAssignment_1 ) ) ;
    public final void rule__RoomDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:715:1: ( ( ( rule__RoomDeclaration__NameAssignment_1 ) ) )
            // InternalRinform.g:716:1: ( ( rule__RoomDeclaration__NameAssignment_1 ) )
            {
            // InternalRinform.g:716:1: ( ( rule__RoomDeclaration__NameAssignment_1 ) )
            // InternalRinform.g:717:2: ( rule__RoomDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getRoomDeclarationAccess().getNameAssignment_1()); 
            // InternalRinform.g:718:2: ( rule__RoomDeclaration__NameAssignment_1 )
            // InternalRinform.g:718:3: rule__RoomDeclaration__NameAssignment_1
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
    // InternalRinform.g:727:1: rule__RoomAlias__Group__0 : rule__RoomAlias__Group__0__Impl rule__RoomAlias__Group__1 ;
    public final void rule__RoomAlias__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:731:1: ( rule__RoomAlias__Group__0__Impl rule__RoomAlias__Group__1 )
            // InternalRinform.g:732:2: rule__RoomAlias__Group__0__Impl rule__RoomAlias__Group__1
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
    // InternalRinform.g:739:1: rule__RoomAlias__Group__0__Impl : ( '-r' ) ;
    public final void rule__RoomAlias__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:743:1: ( ( '-r' ) )
            // InternalRinform.g:744:1: ( '-r' )
            {
            // InternalRinform.g:744:1: ( '-r' )
            // InternalRinform.g:745:2: '-r'
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
    // InternalRinform.g:754:1: rule__RoomAlias__Group__1 : rule__RoomAlias__Group__1__Impl rule__RoomAlias__Group__2 ;
    public final void rule__RoomAlias__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:758:1: ( rule__RoomAlias__Group__1__Impl rule__RoomAlias__Group__2 )
            // InternalRinform.g:759:2: rule__RoomAlias__Group__1__Impl rule__RoomAlias__Group__2
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
    // InternalRinform.g:766:1: rule__RoomAlias__Group__1__Impl : ( ( rule__RoomAlias__RoomAssignment_1 ) ) ;
    public final void rule__RoomAlias__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:770:1: ( ( ( rule__RoomAlias__RoomAssignment_1 ) ) )
            // InternalRinform.g:771:1: ( ( rule__RoomAlias__RoomAssignment_1 ) )
            {
            // InternalRinform.g:771:1: ( ( rule__RoomAlias__RoomAssignment_1 ) )
            // InternalRinform.g:772:2: ( rule__RoomAlias__RoomAssignment_1 )
            {
             before(grammarAccess.getRoomAliasAccess().getRoomAssignment_1()); 
            // InternalRinform.g:773:2: ( rule__RoomAlias__RoomAssignment_1 )
            // InternalRinform.g:773:3: rule__RoomAlias__RoomAssignment_1
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
    // InternalRinform.g:781:1: rule__RoomAlias__Group__2 : rule__RoomAlias__Group__2__Impl rule__RoomAlias__Group__3 ;
    public final void rule__RoomAlias__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:785:1: ( rule__RoomAlias__Group__2__Impl rule__RoomAlias__Group__3 )
            // InternalRinform.g:786:2: rule__RoomAlias__Group__2__Impl rule__RoomAlias__Group__3
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
    // InternalRinform.g:793:1: rule__RoomAlias__Group__2__Impl : ( '-a' ) ;
    public final void rule__RoomAlias__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:797:1: ( ( '-a' ) )
            // InternalRinform.g:798:1: ( '-a' )
            {
            // InternalRinform.g:798:1: ( '-a' )
            // InternalRinform.g:799:2: '-a'
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
    // InternalRinform.g:808:1: rule__RoomAlias__Group__3 : rule__RoomAlias__Group__3__Impl ;
    public final void rule__RoomAlias__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:812:1: ( rule__RoomAlias__Group__3__Impl )
            // InternalRinform.g:813:2: rule__RoomAlias__Group__3__Impl
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
    // InternalRinform.g:819:1: rule__RoomAlias__Group__3__Impl : ( ( ( rule__RoomAlias__AliasesAssignment_3 ) ) ( ( rule__RoomAlias__AliasesAssignment_3 )* ) ) ;
    public final void rule__RoomAlias__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:823:1: ( ( ( ( rule__RoomAlias__AliasesAssignment_3 ) ) ( ( rule__RoomAlias__AliasesAssignment_3 )* ) ) )
            // InternalRinform.g:824:1: ( ( ( rule__RoomAlias__AliasesAssignment_3 ) ) ( ( rule__RoomAlias__AliasesAssignment_3 )* ) )
            {
            // InternalRinform.g:824:1: ( ( ( rule__RoomAlias__AliasesAssignment_3 ) ) ( ( rule__RoomAlias__AliasesAssignment_3 )* ) )
            // InternalRinform.g:825:2: ( ( rule__RoomAlias__AliasesAssignment_3 ) ) ( ( rule__RoomAlias__AliasesAssignment_3 )* )
            {
            // InternalRinform.g:825:2: ( ( rule__RoomAlias__AliasesAssignment_3 ) )
            // InternalRinform.g:826:3: ( rule__RoomAlias__AliasesAssignment_3 )
            {
             before(grammarAccess.getRoomAliasAccess().getAliasesAssignment_3()); 
            // InternalRinform.g:827:3: ( rule__RoomAlias__AliasesAssignment_3 )
            // InternalRinform.g:827:4: rule__RoomAlias__AliasesAssignment_3
            {
            pushFollow(FOLLOW_4);
            rule__RoomAlias__AliasesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRoomAliasAccess().getAliasesAssignment_3()); 

            }

            // InternalRinform.g:830:2: ( ( rule__RoomAlias__AliasesAssignment_3 )* )
            // InternalRinform.g:831:3: ( rule__RoomAlias__AliasesAssignment_3 )*
            {
             before(grammarAccess.getRoomAliasAccess().getAliasesAssignment_3()); 
            // InternalRinform.g:832:3: ( rule__RoomAlias__AliasesAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalRinform.g:832:4: rule__RoomAlias__AliasesAssignment_3
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
    // InternalRinform.g:842:1: rule__RoomDescription__Group__0 : rule__RoomDescription__Group__0__Impl rule__RoomDescription__Group__1 ;
    public final void rule__RoomDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:846:1: ( rule__RoomDescription__Group__0__Impl rule__RoomDescription__Group__1 )
            // InternalRinform.g:847:2: rule__RoomDescription__Group__0__Impl rule__RoomDescription__Group__1
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
    // InternalRinform.g:854:1: rule__RoomDescription__Group__0__Impl : ( '(' ) ;
    public final void rule__RoomDescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:858:1: ( ( '(' ) )
            // InternalRinform.g:859:1: ( '(' )
            {
            // InternalRinform.g:859:1: ( '(' )
            // InternalRinform.g:860:2: '('
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
    // InternalRinform.g:869:1: rule__RoomDescription__Group__1 : rule__RoomDescription__Group__1__Impl rule__RoomDescription__Group__2 ;
    public final void rule__RoomDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:873:1: ( rule__RoomDescription__Group__1__Impl rule__RoomDescription__Group__2 )
            // InternalRinform.g:874:2: rule__RoomDescription__Group__1__Impl rule__RoomDescription__Group__2
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
    // InternalRinform.g:881:1: rule__RoomDescription__Group__1__Impl : ( ( ( rule__RoomDescription__RoomDescriptionAssignment_1 ) ) ( ( rule__RoomDescription__RoomDescriptionAssignment_1 )* ) ) ;
    public final void rule__RoomDescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:885:1: ( ( ( ( rule__RoomDescription__RoomDescriptionAssignment_1 ) ) ( ( rule__RoomDescription__RoomDescriptionAssignment_1 )* ) ) )
            // InternalRinform.g:886:1: ( ( ( rule__RoomDescription__RoomDescriptionAssignment_1 ) ) ( ( rule__RoomDescription__RoomDescriptionAssignment_1 )* ) )
            {
            // InternalRinform.g:886:1: ( ( ( rule__RoomDescription__RoomDescriptionAssignment_1 ) ) ( ( rule__RoomDescription__RoomDescriptionAssignment_1 )* ) )
            // InternalRinform.g:887:2: ( ( rule__RoomDescription__RoomDescriptionAssignment_1 ) ) ( ( rule__RoomDescription__RoomDescriptionAssignment_1 )* )
            {
            // InternalRinform.g:887:2: ( ( rule__RoomDescription__RoomDescriptionAssignment_1 ) )
            // InternalRinform.g:888:3: ( rule__RoomDescription__RoomDescriptionAssignment_1 )
            {
             before(grammarAccess.getRoomDescriptionAccess().getRoomDescriptionAssignment_1()); 
            // InternalRinform.g:889:3: ( rule__RoomDescription__RoomDescriptionAssignment_1 )
            // InternalRinform.g:889:4: rule__RoomDescription__RoomDescriptionAssignment_1
            {
            pushFollow(FOLLOW_4);
            rule__RoomDescription__RoomDescriptionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRoomDescriptionAccess().getRoomDescriptionAssignment_1()); 

            }

            // InternalRinform.g:892:2: ( ( rule__RoomDescription__RoomDescriptionAssignment_1 )* )
            // InternalRinform.g:893:3: ( rule__RoomDescription__RoomDescriptionAssignment_1 )*
            {
             before(grammarAccess.getRoomDescriptionAccess().getRoomDescriptionAssignment_1()); 
            // InternalRinform.g:894:3: ( rule__RoomDescription__RoomDescriptionAssignment_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalRinform.g:894:4: rule__RoomDescription__RoomDescriptionAssignment_1
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
    // InternalRinform.g:903:1: rule__RoomDescription__Group__2 : rule__RoomDescription__Group__2__Impl rule__RoomDescription__Group__3 ;
    public final void rule__RoomDescription__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:907:1: ( rule__RoomDescription__Group__2__Impl rule__RoomDescription__Group__3 )
            // InternalRinform.g:908:2: rule__RoomDescription__Group__2__Impl rule__RoomDescription__Group__3
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
    // InternalRinform.g:915:1: rule__RoomDescription__Group__2__Impl : ( '-r' ) ;
    public final void rule__RoomDescription__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:919:1: ( ( '-r' ) )
            // InternalRinform.g:920:1: ( '-r' )
            {
            // InternalRinform.g:920:1: ( '-r' )
            // InternalRinform.g:921:2: '-r'
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
    // InternalRinform.g:930:1: rule__RoomDescription__Group__3 : rule__RoomDescription__Group__3__Impl rule__RoomDescription__Group__4 ;
    public final void rule__RoomDescription__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:934:1: ( rule__RoomDescription__Group__3__Impl rule__RoomDescription__Group__4 )
            // InternalRinform.g:935:2: rule__RoomDescription__Group__3__Impl rule__RoomDescription__Group__4
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
    // InternalRinform.g:942:1: rule__RoomDescription__Group__3__Impl : ( ( rule__RoomDescription__RoomAssignment_3 ) ) ;
    public final void rule__RoomDescription__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:946:1: ( ( ( rule__RoomDescription__RoomAssignment_3 ) ) )
            // InternalRinform.g:947:1: ( ( rule__RoomDescription__RoomAssignment_3 ) )
            {
            // InternalRinform.g:947:1: ( ( rule__RoomDescription__RoomAssignment_3 ) )
            // InternalRinform.g:948:2: ( rule__RoomDescription__RoomAssignment_3 )
            {
             before(grammarAccess.getRoomDescriptionAccess().getRoomAssignment_3()); 
            // InternalRinform.g:949:2: ( rule__RoomDescription__RoomAssignment_3 )
            // InternalRinform.g:949:3: rule__RoomDescription__RoomAssignment_3
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
    // InternalRinform.g:957:1: rule__RoomDescription__Group__4 : rule__RoomDescription__Group__4__Impl ;
    public final void rule__RoomDescription__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:961:1: ( rule__RoomDescription__Group__4__Impl )
            // InternalRinform.g:962:2: rule__RoomDescription__Group__4__Impl
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
    // InternalRinform.g:968:1: rule__RoomDescription__Group__4__Impl : ( ')' ) ;
    public final void rule__RoomDescription__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:972:1: ( ( ')' ) )
            // InternalRinform.g:973:1: ( ')' )
            {
            // InternalRinform.g:973:1: ( ')' )
            // InternalRinform.g:974:2: ')'
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


    // $ANTLR start "rule__ContainerDeclaration__Group__0"
    // InternalRinform.g:984:1: rule__ContainerDeclaration__Group__0 : rule__ContainerDeclaration__Group__0__Impl rule__ContainerDeclaration__Group__1 ;
    public final void rule__ContainerDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:988:1: ( rule__ContainerDeclaration__Group__0__Impl rule__ContainerDeclaration__Group__1 )
            // InternalRinform.g:989:2: rule__ContainerDeclaration__Group__0__Impl rule__ContainerDeclaration__Group__1
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
    // InternalRinform.g:996:1: rule__ContainerDeclaration__Group__0__Impl : ( '-c' ) ;
    public final void rule__ContainerDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1000:1: ( ( '-c' ) )
            // InternalRinform.g:1001:1: ( '-c' )
            {
            // InternalRinform.g:1001:1: ( '-c' )
            // InternalRinform.g:1002:2: '-c'
            {
             before(grammarAccess.getContainerDeclarationAccess().getCKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalRinform.g:1011:1: rule__ContainerDeclaration__Group__1 : rule__ContainerDeclaration__Group__1__Impl rule__ContainerDeclaration__Group__2 ;
    public final void rule__ContainerDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1015:1: ( rule__ContainerDeclaration__Group__1__Impl rule__ContainerDeclaration__Group__2 )
            // InternalRinform.g:1016:2: rule__ContainerDeclaration__Group__1__Impl rule__ContainerDeclaration__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalRinform.g:1023:1: rule__ContainerDeclaration__Group__1__Impl : ( ( rule__ContainerDeclaration__NameAssignment_1 ) ) ;
    public final void rule__ContainerDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1027:1: ( ( ( rule__ContainerDeclaration__NameAssignment_1 ) ) )
            // InternalRinform.g:1028:1: ( ( rule__ContainerDeclaration__NameAssignment_1 ) )
            {
            // InternalRinform.g:1028:1: ( ( rule__ContainerDeclaration__NameAssignment_1 ) )
            // InternalRinform.g:1029:2: ( rule__ContainerDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getContainerDeclarationAccess().getNameAssignment_1()); 
            // InternalRinform.g:1030:2: ( rule__ContainerDeclaration__NameAssignment_1 )
            // InternalRinform.g:1030:3: rule__ContainerDeclaration__NameAssignment_1
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
    // InternalRinform.g:1038:1: rule__ContainerDeclaration__Group__2 : rule__ContainerDeclaration__Group__2__Impl rule__ContainerDeclaration__Group__3 ;
    public final void rule__ContainerDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1042:1: ( rule__ContainerDeclaration__Group__2__Impl rule__ContainerDeclaration__Group__3 )
            // InternalRinform.g:1043:2: rule__ContainerDeclaration__Group__2__Impl rule__ContainerDeclaration__Group__3
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
    // InternalRinform.g:1050:1: rule__ContainerDeclaration__Group__2__Impl : ( '-r' ) ;
    public final void rule__ContainerDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1054:1: ( ( '-r' ) )
            // InternalRinform.g:1055:1: ( '-r' )
            {
            // InternalRinform.g:1055:1: ( '-r' )
            // InternalRinform.g:1056:2: '-r'
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
    // InternalRinform.g:1065:1: rule__ContainerDeclaration__Group__3 : rule__ContainerDeclaration__Group__3__Impl ;
    public final void rule__ContainerDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1069:1: ( rule__ContainerDeclaration__Group__3__Impl )
            // InternalRinform.g:1070:2: rule__ContainerDeclaration__Group__3__Impl
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
    // InternalRinform.g:1076:1: rule__ContainerDeclaration__Group__3__Impl : ( ( rule__ContainerDeclaration__RoomAssignment_3 ) ) ;
    public final void rule__ContainerDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1080:1: ( ( ( rule__ContainerDeclaration__RoomAssignment_3 ) ) )
            // InternalRinform.g:1081:1: ( ( rule__ContainerDeclaration__RoomAssignment_3 ) )
            {
            // InternalRinform.g:1081:1: ( ( rule__ContainerDeclaration__RoomAssignment_3 ) )
            // InternalRinform.g:1082:2: ( rule__ContainerDeclaration__RoomAssignment_3 )
            {
             before(grammarAccess.getContainerDeclarationAccess().getRoomAssignment_3()); 
            // InternalRinform.g:1083:2: ( rule__ContainerDeclaration__RoomAssignment_3 )
            // InternalRinform.g:1083:3: rule__ContainerDeclaration__RoomAssignment_3
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


    // $ANTLR start "rule__ItemInRoomDeclaration__Group__0"
    // InternalRinform.g:1092:1: rule__ItemInRoomDeclaration__Group__0 : rule__ItemInRoomDeclaration__Group__0__Impl rule__ItemInRoomDeclaration__Group__1 ;
    public final void rule__ItemInRoomDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1096:1: ( rule__ItemInRoomDeclaration__Group__0__Impl rule__ItemInRoomDeclaration__Group__1 )
            // InternalRinform.g:1097:2: rule__ItemInRoomDeclaration__Group__0__Impl rule__ItemInRoomDeclaration__Group__1
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
    // InternalRinform.g:1104:1: rule__ItemInRoomDeclaration__Group__0__Impl : ( '-i' ) ;
    public final void rule__ItemInRoomDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1108:1: ( ( '-i' ) )
            // InternalRinform.g:1109:1: ( '-i' )
            {
            // InternalRinform.g:1109:1: ( '-i' )
            // InternalRinform.g:1110:2: '-i'
            {
             before(grammarAccess.getItemInRoomDeclarationAccess().getIKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalRinform.g:1119:1: rule__ItemInRoomDeclaration__Group__1 : rule__ItemInRoomDeclaration__Group__1__Impl rule__ItemInRoomDeclaration__Group__2 ;
    public final void rule__ItemInRoomDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1123:1: ( rule__ItemInRoomDeclaration__Group__1__Impl rule__ItemInRoomDeclaration__Group__2 )
            // InternalRinform.g:1124:2: rule__ItemInRoomDeclaration__Group__1__Impl rule__ItemInRoomDeclaration__Group__2
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
    // InternalRinform.g:1131:1: rule__ItemInRoomDeclaration__Group__1__Impl : ( ( rule__ItemInRoomDeclaration__NameAssignment_1 ) ) ;
    public final void rule__ItemInRoomDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1135:1: ( ( ( rule__ItemInRoomDeclaration__NameAssignment_1 ) ) )
            // InternalRinform.g:1136:1: ( ( rule__ItemInRoomDeclaration__NameAssignment_1 ) )
            {
            // InternalRinform.g:1136:1: ( ( rule__ItemInRoomDeclaration__NameAssignment_1 ) )
            // InternalRinform.g:1137:2: ( rule__ItemInRoomDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getItemInRoomDeclarationAccess().getNameAssignment_1()); 
            // InternalRinform.g:1138:2: ( rule__ItemInRoomDeclaration__NameAssignment_1 )
            // InternalRinform.g:1138:3: rule__ItemInRoomDeclaration__NameAssignment_1
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
    // InternalRinform.g:1146:1: rule__ItemInRoomDeclaration__Group__2 : rule__ItemInRoomDeclaration__Group__2__Impl rule__ItemInRoomDeclaration__Group__3 ;
    public final void rule__ItemInRoomDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1150:1: ( rule__ItemInRoomDeclaration__Group__2__Impl rule__ItemInRoomDeclaration__Group__3 )
            // InternalRinform.g:1151:2: rule__ItemInRoomDeclaration__Group__2__Impl rule__ItemInRoomDeclaration__Group__3
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
    // InternalRinform.g:1158:1: rule__ItemInRoomDeclaration__Group__2__Impl : ( '-r' ) ;
    public final void rule__ItemInRoomDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1162:1: ( ( '-r' ) )
            // InternalRinform.g:1163:1: ( '-r' )
            {
            // InternalRinform.g:1163:1: ( '-r' )
            // InternalRinform.g:1164:2: '-r'
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
    // InternalRinform.g:1173:1: rule__ItemInRoomDeclaration__Group__3 : rule__ItemInRoomDeclaration__Group__3__Impl ;
    public final void rule__ItemInRoomDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1177:1: ( rule__ItemInRoomDeclaration__Group__3__Impl )
            // InternalRinform.g:1178:2: rule__ItemInRoomDeclaration__Group__3__Impl
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
    // InternalRinform.g:1184:1: rule__ItemInRoomDeclaration__Group__3__Impl : ( ( rule__ItemInRoomDeclaration__RoomAssignment_3 ) ) ;
    public final void rule__ItemInRoomDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1188:1: ( ( ( rule__ItemInRoomDeclaration__RoomAssignment_3 ) ) )
            // InternalRinform.g:1189:1: ( ( rule__ItemInRoomDeclaration__RoomAssignment_3 ) )
            {
            // InternalRinform.g:1189:1: ( ( rule__ItemInRoomDeclaration__RoomAssignment_3 ) )
            // InternalRinform.g:1190:2: ( rule__ItemInRoomDeclaration__RoomAssignment_3 )
            {
             before(grammarAccess.getItemInRoomDeclarationAccess().getRoomAssignment_3()); 
            // InternalRinform.g:1191:2: ( rule__ItemInRoomDeclaration__RoomAssignment_3 )
            // InternalRinform.g:1191:3: rule__ItemInRoomDeclaration__RoomAssignment_3
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
    // InternalRinform.g:1200:1: rule__ItemInContainerDeclaration__Group__0 : rule__ItemInContainerDeclaration__Group__0__Impl rule__ItemInContainerDeclaration__Group__1 ;
    public final void rule__ItemInContainerDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1204:1: ( rule__ItemInContainerDeclaration__Group__0__Impl rule__ItemInContainerDeclaration__Group__1 )
            // InternalRinform.g:1205:2: rule__ItemInContainerDeclaration__Group__0__Impl rule__ItemInContainerDeclaration__Group__1
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
    // InternalRinform.g:1212:1: rule__ItemInContainerDeclaration__Group__0__Impl : ( '-i' ) ;
    public final void rule__ItemInContainerDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1216:1: ( ( '-i' ) )
            // InternalRinform.g:1217:1: ( '-i' )
            {
            // InternalRinform.g:1217:1: ( '-i' )
            // InternalRinform.g:1218:2: '-i'
            {
             before(grammarAccess.getItemInContainerDeclarationAccess().getIKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalRinform.g:1227:1: rule__ItemInContainerDeclaration__Group__1 : rule__ItemInContainerDeclaration__Group__1__Impl rule__ItemInContainerDeclaration__Group__2 ;
    public final void rule__ItemInContainerDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1231:1: ( rule__ItemInContainerDeclaration__Group__1__Impl rule__ItemInContainerDeclaration__Group__2 )
            // InternalRinform.g:1232:2: rule__ItemInContainerDeclaration__Group__1__Impl rule__ItemInContainerDeclaration__Group__2
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
    // InternalRinform.g:1239:1: rule__ItemInContainerDeclaration__Group__1__Impl : ( ( rule__ItemInContainerDeclaration__NameAssignment_1 ) ) ;
    public final void rule__ItemInContainerDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1243:1: ( ( ( rule__ItemInContainerDeclaration__NameAssignment_1 ) ) )
            // InternalRinform.g:1244:1: ( ( rule__ItemInContainerDeclaration__NameAssignment_1 ) )
            {
            // InternalRinform.g:1244:1: ( ( rule__ItemInContainerDeclaration__NameAssignment_1 ) )
            // InternalRinform.g:1245:2: ( rule__ItemInContainerDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getItemInContainerDeclarationAccess().getNameAssignment_1()); 
            // InternalRinform.g:1246:2: ( rule__ItemInContainerDeclaration__NameAssignment_1 )
            // InternalRinform.g:1246:3: rule__ItemInContainerDeclaration__NameAssignment_1
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
    // InternalRinform.g:1254:1: rule__ItemInContainerDeclaration__Group__2 : rule__ItemInContainerDeclaration__Group__2__Impl rule__ItemInContainerDeclaration__Group__3 ;
    public final void rule__ItemInContainerDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1258:1: ( rule__ItemInContainerDeclaration__Group__2__Impl rule__ItemInContainerDeclaration__Group__3 )
            // InternalRinform.g:1259:2: rule__ItemInContainerDeclaration__Group__2__Impl rule__ItemInContainerDeclaration__Group__3
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
    // InternalRinform.g:1266:1: rule__ItemInContainerDeclaration__Group__2__Impl : ( '-c' ) ;
    public final void rule__ItemInContainerDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1270:1: ( ( '-c' ) )
            // InternalRinform.g:1271:1: ( '-c' )
            {
            // InternalRinform.g:1271:1: ( '-c' )
            // InternalRinform.g:1272:2: '-c'
            {
             before(grammarAccess.getItemInContainerDeclarationAccess().getCKeyword_2()); 
            match(input,29,FOLLOW_2); 
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
    // InternalRinform.g:1281:1: rule__ItemInContainerDeclaration__Group__3 : rule__ItemInContainerDeclaration__Group__3__Impl ;
    public final void rule__ItemInContainerDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1285:1: ( rule__ItemInContainerDeclaration__Group__3__Impl )
            // InternalRinform.g:1286:2: rule__ItemInContainerDeclaration__Group__3__Impl
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
    // InternalRinform.g:1292:1: rule__ItemInContainerDeclaration__Group__3__Impl : ( ( rule__ItemInContainerDeclaration__ContainerAssignment_3 ) ) ;
    public final void rule__ItemInContainerDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1296:1: ( ( ( rule__ItemInContainerDeclaration__ContainerAssignment_3 ) ) )
            // InternalRinform.g:1297:1: ( ( rule__ItemInContainerDeclaration__ContainerAssignment_3 ) )
            {
            // InternalRinform.g:1297:1: ( ( rule__ItemInContainerDeclaration__ContainerAssignment_3 ) )
            // InternalRinform.g:1298:2: ( rule__ItemInContainerDeclaration__ContainerAssignment_3 )
            {
             before(grammarAccess.getItemInContainerDeclarationAccess().getContainerAssignment_3()); 
            // InternalRinform.g:1299:2: ( rule__ItemInContainerDeclaration__ContainerAssignment_3 )
            // InternalRinform.g:1299:3: rule__ItemInContainerDeclaration__ContainerAssignment_3
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
    // InternalRinform.g:1308:1: rule__ItemDescription__Group__0 : rule__ItemDescription__Group__0__Impl rule__ItemDescription__Group__1 ;
    public final void rule__ItemDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1312:1: ( rule__ItemDescription__Group__0__Impl rule__ItemDescription__Group__1 )
            // InternalRinform.g:1313:2: rule__ItemDescription__Group__0__Impl rule__ItemDescription__Group__1
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
    // InternalRinform.g:1320:1: rule__ItemDescription__Group__0__Impl : ( '(' ) ;
    public final void rule__ItemDescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1324:1: ( ( '(' ) )
            // InternalRinform.g:1325:1: ( '(' )
            {
            // InternalRinform.g:1325:1: ( '(' )
            // InternalRinform.g:1326:2: '('
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
    // InternalRinform.g:1335:1: rule__ItemDescription__Group__1 : rule__ItemDescription__Group__1__Impl rule__ItemDescription__Group__2 ;
    public final void rule__ItemDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1339:1: ( rule__ItemDescription__Group__1__Impl rule__ItemDescription__Group__2 )
            // InternalRinform.g:1340:2: rule__ItemDescription__Group__1__Impl rule__ItemDescription__Group__2
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
    // InternalRinform.g:1347:1: rule__ItemDescription__Group__1__Impl : ( ( ( rule__ItemDescription__ItemDescriptionAssignment_1 ) ) ( ( rule__ItemDescription__ItemDescriptionAssignment_1 )* ) ) ;
    public final void rule__ItemDescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1351:1: ( ( ( ( rule__ItemDescription__ItemDescriptionAssignment_1 ) ) ( ( rule__ItemDescription__ItemDescriptionAssignment_1 )* ) ) )
            // InternalRinform.g:1352:1: ( ( ( rule__ItemDescription__ItemDescriptionAssignment_1 ) ) ( ( rule__ItemDescription__ItemDescriptionAssignment_1 )* ) )
            {
            // InternalRinform.g:1352:1: ( ( ( rule__ItemDescription__ItemDescriptionAssignment_1 ) ) ( ( rule__ItemDescription__ItemDescriptionAssignment_1 )* ) )
            // InternalRinform.g:1353:2: ( ( rule__ItemDescription__ItemDescriptionAssignment_1 ) ) ( ( rule__ItemDescription__ItemDescriptionAssignment_1 )* )
            {
            // InternalRinform.g:1353:2: ( ( rule__ItemDescription__ItemDescriptionAssignment_1 ) )
            // InternalRinform.g:1354:3: ( rule__ItemDescription__ItemDescriptionAssignment_1 )
            {
             before(grammarAccess.getItemDescriptionAccess().getItemDescriptionAssignment_1()); 
            // InternalRinform.g:1355:3: ( rule__ItemDescription__ItemDescriptionAssignment_1 )
            // InternalRinform.g:1355:4: rule__ItemDescription__ItemDescriptionAssignment_1
            {
            pushFollow(FOLLOW_4);
            rule__ItemDescription__ItemDescriptionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getItemDescriptionAccess().getItemDescriptionAssignment_1()); 

            }

            // InternalRinform.g:1358:2: ( ( rule__ItemDescription__ItemDescriptionAssignment_1 )* )
            // InternalRinform.g:1359:3: ( rule__ItemDescription__ItemDescriptionAssignment_1 )*
            {
             before(grammarAccess.getItemDescriptionAccess().getItemDescriptionAssignment_1()); 
            // InternalRinform.g:1360:3: ( rule__ItemDescription__ItemDescriptionAssignment_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalRinform.g:1360:4: rule__ItemDescription__ItemDescriptionAssignment_1
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
    // InternalRinform.g:1369:1: rule__ItemDescription__Group__2 : rule__ItemDescription__Group__2__Impl rule__ItemDescription__Group__3 ;
    public final void rule__ItemDescription__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1373:1: ( rule__ItemDescription__Group__2__Impl rule__ItemDescription__Group__3 )
            // InternalRinform.g:1374:2: rule__ItemDescription__Group__2__Impl rule__ItemDescription__Group__3
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
    // InternalRinform.g:1381:1: rule__ItemDescription__Group__2__Impl : ( '-i' ) ;
    public final void rule__ItemDescription__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1385:1: ( ( '-i' ) )
            // InternalRinform.g:1386:1: ( '-i' )
            {
            // InternalRinform.g:1386:1: ( '-i' )
            // InternalRinform.g:1387:2: '-i'
            {
             before(grammarAccess.getItemDescriptionAccess().getIKeyword_2()); 
            match(input,30,FOLLOW_2); 
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
    // InternalRinform.g:1396:1: rule__ItemDescription__Group__3 : rule__ItemDescription__Group__3__Impl rule__ItemDescription__Group__4 ;
    public final void rule__ItemDescription__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1400:1: ( rule__ItemDescription__Group__3__Impl rule__ItemDescription__Group__4 )
            // InternalRinform.g:1401:2: rule__ItemDescription__Group__3__Impl rule__ItemDescription__Group__4
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
    // InternalRinform.g:1408:1: rule__ItemDescription__Group__3__Impl : ( ( rule__ItemDescription__ItemAssignment_3 ) ) ;
    public final void rule__ItemDescription__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1412:1: ( ( ( rule__ItemDescription__ItemAssignment_3 ) ) )
            // InternalRinform.g:1413:1: ( ( rule__ItemDescription__ItemAssignment_3 ) )
            {
            // InternalRinform.g:1413:1: ( ( rule__ItemDescription__ItemAssignment_3 ) )
            // InternalRinform.g:1414:2: ( rule__ItemDescription__ItemAssignment_3 )
            {
             before(grammarAccess.getItemDescriptionAccess().getItemAssignment_3()); 
            // InternalRinform.g:1415:2: ( rule__ItemDescription__ItemAssignment_3 )
            // InternalRinform.g:1415:3: rule__ItemDescription__ItemAssignment_3
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
    // InternalRinform.g:1423:1: rule__ItemDescription__Group__4 : rule__ItemDescription__Group__4__Impl ;
    public final void rule__ItemDescription__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1427:1: ( rule__ItemDescription__Group__4__Impl )
            // InternalRinform.g:1428:2: rule__ItemDescription__Group__4__Impl
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
    // InternalRinform.g:1434:1: rule__ItemDescription__Group__4__Impl : ( ')' ) ;
    public final void rule__ItemDescription__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1438:1: ( ( ')' ) )
            // InternalRinform.g:1439:1: ( ')' )
            {
            // InternalRinform.g:1439:1: ( ')' )
            // InternalRinform.g:1440:2: ')'
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
    // InternalRinform.g:1450:1: rule__PersonDeclaration__Group__0 : rule__PersonDeclaration__Group__0__Impl rule__PersonDeclaration__Group__1 ;
    public final void rule__PersonDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1454:1: ( rule__PersonDeclaration__Group__0__Impl rule__PersonDeclaration__Group__1 )
            // InternalRinform.g:1455:2: rule__PersonDeclaration__Group__0__Impl rule__PersonDeclaration__Group__1
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
    // InternalRinform.g:1462:1: rule__PersonDeclaration__Group__0__Impl : ( '-p' ) ;
    public final void rule__PersonDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1466:1: ( ( '-p' ) )
            // InternalRinform.g:1467:1: ( '-p' )
            {
            // InternalRinform.g:1467:1: ( '-p' )
            // InternalRinform.g:1468:2: '-p'
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
    // InternalRinform.g:1477:1: rule__PersonDeclaration__Group__1 : rule__PersonDeclaration__Group__1__Impl rule__PersonDeclaration__Group__2 ;
    public final void rule__PersonDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1481:1: ( rule__PersonDeclaration__Group__1__Impl rule__PersonDeclaration__Group__2 )
            // InternalRinform.g:1482:2: rule__PersonDeclaration__Group__1__Impl rule__PersonDeclaration__Group__2
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
    // InternalRinform.g:1489:1: rule__PersonDeclaration__Group__1__Impl : ( ( rule__PersonDeclaration__NameAssignment_1 ) ) ;
    public final void rule__PersonDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1493:1: ( ( ( rule__PersonDeclaration__NameAssignment_1 ) ) )
            // InternalRinform.g:1494:1: ( ( rule__PersonDeclaration__NameAssignment_1 ) )
            {
            // InternalRinform.g:1494:1: ( ( rule__PersonDeclaration__NameAssignment_1 ) )
            // InternalRinform.g:1495:2: ( rule__PersonDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getPersonDeclarationAccess().getNameAssignment_1()); 
            // InternalRinform.g:1496:2: ( rule__PersonDeclaration__NameAssignment_1 )
            // InternalRinform.g:1496:3: rule__PersonDeclaration__NameAssignment_1
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
    // InternalRinform.g:1504:1: rule__PersonDeclaration__Group__2 : rule__PersonDeclaration__Group__2__Impl rule__PersonDeclaration__Group__3 ;
    public final void rule__PersonDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1508:1: ( rule__PersonDeclaration__Group__2__Impl rule__PersonDeclaration__Group__3 )
            // InternalRinform.g:1509:2: rule__PersonDeclaration__Group__2__Impl rule__PersonDeclaration__Group__3
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
    // InternalRinform.g:1516:1: rule__PersonDeclaration__Group__2__Impl : ( '-r' ) ;
    public final void rule__PersonDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1520:1: ( ( '-r' ) )
            // InternalRinform.g:1521:1: ( '-r' )
            {
            // InternalRinform.g:1521:1: ( '-r' )
            // InternalRinform.g:1522:2: '-r'
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
    // InternalRinform.g:1531:1: rule__PersonDeclaration__Group__3 : rule__PersonDeclaration__Group__3__Impl ;
    public final void rule__PersonDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1535:1: ( rule__PersonDeclaration__Group__3__Impl )
            // InternalRinform.g:1536:2: rule__PersonDeclaration__Group__3__Impl
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
    // InternalRinform.g:1542:1: rule__PersonDeclaration__Group__3__Impl : ( ( rule__PersonDeclaration__RoomAssignment_3 ) ) ;
    public final void rule__PersonDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1546:1: ( ( ( rule__PersonDeclaration__RoomAssignment_3 ) ) )
            // InternalRinform.g:1547:1: ( ( rule__PersonDeclaration__RoomAssignment_3 ) )
            {
            // InternalRinform.g:1547:1: ( ( rule__PersonDeclaration__RoomAssignment_3 ) )
            // InternalRinform.g:1548:2: ( rule__PersonDeclaration__RoomAssignment_3 )
            {
             before(grammarAccess.getPersonDeclarationAccess().getRoomAssignment_3()); 
            // InternalRinform.g:1549:2: ( rule__PersonDeclaration__RoomAssignment_3 )
            // InternalRinform.g:1549:3: rule__PersonDeclaration__RoomAssignment_3
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
    // InternalRinform.g:1558:1: rule__PersonDescription__Group__0 : rule__PersonDescription__Group__0__Impl rule__PersonDescription__Group__1 ;
    public final void rule__PersonDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1562:1: ( rule__PersonDescription__Group__0__Impl rule__PersonDescription__Group__1 )
            // InternalRinform.g:1563:2: rule__PersonDescription__Group__0__Impl rule__PersonDescription__Group__1
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
    // InternalRinform.g:1570:1: rule__PersonDescription__Group__0__Impl : ( '(' ) ;
    public final void rule__PersonDescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1574:1: ( ( '(' ) )
            // InternalRinform.g:1575:1: ( '(' )
            {
            // InternalRinform.g:1575:1: ( '(' )
            // InternalRinform.g:1576:2: '('
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
    // InternalRinform.g:1585:1: rule__PersonDescription__Group__1 : rule__PersonDescription__Group__1__Impl rule__PersonDescription__Group__2 ;
    public final void rule__PersonDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1589:1: ( rule__PersonDescription__Group__1__Impl rule__PersonDescription__Group__2 )
            // InternalRinform.g:1590:2: rule__PersonDescription__Group__1__Impl rule__PersonDescription__Group__2
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
    // InternalRinform.g:1597:1: rule__PersonDescription__Group__1__Impl : ( ( ( rule__PersonDescription__PersonDescriptionAssignment_1 ) ) ( ( rule__PersonDescription__PersonDescriptionAssignment_1 )* ) ) ;
    public final void rule__PersonDescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1601:1: ( ( ( ( rule__PersonDescription__PersonDescriptionAssignment_1 ) ) ( ( rule__PersonDescription__PersonDescriptionAssignment_1 )* ) ) )
            // InternalRinform.g:1602:1: ( ( ( rule__PersonDescription__PersonDescriptionAssignment_1 ) ) ( ( rule__PersonDescription__PersonDescriptionAssignment_1 )* ) )
            {
            // InternalRinform.g:1602:1: ( ( ( rule__PersonDescription__PersonDescriptionAssignment_1 ) ) ( ( rule__PersonDescription__PersonDescriptionAssignment_1 )* ) )
            // InternalRinform.g:1603:2: ( ( rule__PersonDescription__PersonDescriptionAssignment_1 ) ) ( ( rule__PersonDescription__PersonDescriptionAssignment_1 )* )
            {
            // InternalRinform.g:1603:2: ( ( rule__PersonDescription__PersonDescriptionAssignment_1 ) )
            // InternalRinform.g:1604:3: ( rule__PersonDescription__PersonDescriptionAssignment_1 )
            {
             before(grammarAccess.getPersonDescriptionAccess().getPersonDescriptionAssignment_1()); 
            // InternalRinform.g:1605:3: ( rule__PersonDescription__PersonDescriptionAssignment_1 )
            // InternalRinform.g:1605:4: rule__PersonDescription__PersonDescriptionAssignment_1
            {
            pushFollow(FOLLOW_4);
            rule__PersonDescription__PersonDescriptionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPersonDescriptionAccess().getPersonDescriptionAssignment_1()); 

            }

            // InternalRinform.g:1608:2: ( ( rule__PersonDescription__PersonDescriptionAssignment_1 )* )
            // InternalRinform.g:1609:3: ( rule__PersonDescription__PersonDescriptionAssignment_1 )*
            {
             before(grammarAccess.getPersonDescriptionAccess().getPersonDescriptionAssignment_1()); 
            // InternalRinform.g:1610:3: ( rule__PersonDescription__PersonDescriptionAssignment_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalRinform.g:1610:4: rule__PersonDescription__PersonDescriptionAssignment_1
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
    // InternalRinform.g:1619:1: rule__PersonDescription__Group__2 : rule__PersonDescription__Group__2__Impl rule__PersonDescription__Group__3 ;
    public final void rule__PersonDescription__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1623:1: ( rule__PersonDescription__Group__2__Impl rule__PersonDescription__Group__3 )
            // InternalRinform.g:1624:2: rule__PersonDescription__Group__2__Impl rule__PersonDescription__Group__3
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
    // InternalRinform.g:1631:1: rule__PersonDescription__Group__2__Impl : ( '-p' ) ;
    public final void rule__PersonDescription__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1635:1: ( ( '-p' ) )
            // InternalRinform.g:1636:1: ( '-p' )
            {
            // InternalRinform.g:1636:1: ( '-p' )
            // InternalRinform.g:1637:2: '-p'
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
    // InternalRinform.g:1646:1: rule__PersonDescription__Group__3 : rule__PersonDescription__Group__3__Impl rule__PersonDescription__Group__4 ;
    public final void rule__PersonDescription__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1650:1: ( rule__PersonDescription__Group__3__Impl rule__PersonDescription__Group__4 )
            // InternalRinform.g:1651:2: rule__PersonDescription__Group__3__Impl rule__PersonDescription__Group__4
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
    // InternalRinform.g:1658:1: rule__PersonDescription__Group__3__Impl : ( ( rule__PersonDescription__PersonAssignment_3 ) ) ;
    public final void rule__PersonDescription__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1662:1: ( ( ( rule__PersonDescription__PersonAssignment_3 ) ) )
            // InternalRinform.g:1663:1: ( ( rule__PersonDescription__PersonAssignment_3 ) )
            {
            // InternalRinform.g:1663:1: ( ( rule__PersonDescription__PersonAssignment_3 ) )
            // InternalRinform.g:1664:2: ( rule__PersonDescription__PersonAssignment_3 )
            {
             before(grammarAccess.getPersonDescriptionAccess().getPersonAssignment_3()); 
            // InternalRinform.g:1665:2: ( rule__PersonDescription__PersonAssignment_3 )
            // InternalRinform.g:1665:3: rule__PersonDescription__PersonAssignment_3
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
    // InternalRinform.g:1673:1: rule__PersonDescription__Group__4 : rule__PersonDescription__Group__4__Impl ;
    public final void rule__PersonDescription__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1677:1: ( rule__PersonDescription__Group__4__Impl )
            // InternalRinform.g:1678:2: rule__PersonDescription__Group__4__Impl
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
    // InternalRinform.g:1684:1: rule__PersonDescription__Group__4__Impl : ( ')' ) ;
    public final void rule__PersonDescription__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1688:1: ( ( ')' ) )
            // InternalRinform.g:1689:1: ( ')' )
            {
            // InternalRinform.g:1689:1: ( ')' )
            // InternalRinform.g:1690:2: ')'
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
    // InternalRinform.g:1700:1: rule__DirectionStatement__Group__0 : rule__DirectionStatement__Group__0__Impl rule__DirectionStatement__Group__1 ;
    public final void rule__DirectionStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1704:1: ( rule__DirectionStatement__Group__0__Impl rule__DirectionStatement__Group__1 )
            // InternalRinform.g:1705:2: rule__DirectionStatement__Group__0__Impl rule__DirectionStatement__Group__1
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
    // InternalRinform.g:1712:1: rule__DirectionStatement__Group__0__Impl : ( '<' ) ;
    public final void rule__DirectionStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1716:1: ( ( '<' ) )
            // InternalRinform.g:1717:1: ( '<' )
            {
            // InternalRinform.g:1717:1: ( '<' )
            // InternalRinform.g:1718:2: '<'
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
    // InternalRinform.g:1727:1: rule__DirectionStatement__Group__1 : rule__DirectionStatement__Group__1__Impl rule__DirectionStatement__Group__2 ;
    public final void rule__DirectionStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1731:1: ( rule__DirectionStatement__Group__1__Impl rule__DirectionStatement__Group__2 )
            // InternalRinform.g:1732:2: rule__DirectionStatement__Group__1__Impl rule__DirectionStatement__Group__2
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
    // InternalRinform.g:1739:1: rule__DirectionStatement__Group__1__Impl : ( ( rule__DirectionStatement__Room1Assignment_1 ) ) ;
    public final void rule__DirectionStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1743:1: ( ( ( rule__DirectionStatement__Room1Assignment_1 ) ) )
            // InternalRinform.g:1744:1: ( ( rule__DirectionStatement__Room1Assignment_1 ) )
            {
            // InternalRinform.g:1744:1: ( ( rule__DirectionStatement__Room1Assignment_1 ) )
            // InternalRinform.g:1745:2: ( rule__DirectionStatement__Room1Assignment_1 )
            {
             before(grammarAccess.getDirectionStatementAccess().getRoom1Assignment_1()); 
            // InternalRinform.g:1746:2: ( rule__DirectionStatement__Room1Assignment_1 )
            // InternalRinform.g:1746:3: rule__DirectionStatement__Room1Assignment_1
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
    // InternalRinform.g:1754:1: rule__DirectionStatement__Group__2 : rule__DirectionStatement__Group__2__Impl rule__DirectionStatement__Group__3 ;
    public final void rule__DirectionStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1758:1: ( rule__DirectionStatement__Group__2__Impl rule__DirectionStatement__Group__3 )
            // InternalRinform.g:1759:2: rule__DirectionStatement__Group__2__Impl rule__DirectionStatement__Group__3
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
    // InternalRinform.g:1766:1: rule__DirectionStatement__Group__2__Impl : ( ( rule__DirectionStatement__DirectionAssignment_2 ) ) ;
    public final void rule__DirectionStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1770:1: ( ( ( rule__DirectionStatement__DirectionAssignment_2 ) ) )
            // InternalRinform.g:1771:1: ( ( rule__DirectionStatement__DirectionAssignment_2 ) )
            {
            // InternalRinform.g:1771:1: ( ( rule__DirectionStatement__DirectionAssignment_2 ) )
            // InternalRinform.g:1772:2: ( rule__DirectionStatement__DirectionAssignment_2 )
            {
             before(grammarAccess.getDirectionStatementAccess().getDirectionAssignment_2()); 
            // InternalRinform.g:1773:2: ( rule__DirectionStatement__DirectionAssignment_2 )
            // InternalRinform.g:1773:3: rule__DirectionStatement__DirectionAssignment_2
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
    // InternalRinform.g:1781:1: rule__DirectionStatement__Group__3 : rule__DirectionStatement__Group__3__Impl rule__DirectionStatement__Group__4 ;
    public final void rule__DirectionStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1785:1: ( rule__DirectionStatement__Group__3__Impl rule__DirectionStatement__Group__4 )
            // InternalRinform.g:1786:2: rule__DirectionStatement__Group__3__Impl rule__DirectionStatement__Group__4
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
    // InternalRinform.g:1793:1: rule__DirectionStatement__Group__3__Impl : ( ( rule__DirectionStatement__Room2Assignment_3 ) ) ;
    public final void rule__DirectionStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1797:1: ( ( ( rule__DirectionStatement__Room2Assignment_3 ) ) )
            // InternalRinform.g:1798:1: ( ( rule__DirectionStatement__Room2Assignment_3 ) )
            {
            // InternalRinform.g:1798:1: ( ( rule__DirectionStatement__Room2Assignment_3 ) )
            // InternalRinform.g:1799:2: ( rule__DirectionStatement__Room2Assignment_3 )
            {
             before(grammarAccess.getDirectionStatementAccess().getRoom2Assignment_3()); 
            // InternalRinform.g:1800:2: ( rule__DirectionStatement__Room2Assignment_3 )
            // InternalRinform.g:1800:3: rule__DirectionStatement__Room2Assignment_3
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
    // InternalRinform.g:1808:1: rule__DirectionStatement__Group__4 : rule__DirectionStatement__Group__4__Impl ;
    public final void rule__DirectionStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1812:1: ( rule__DirectionStatement__Group__4__Impl )
            // InternalRinform.g:1813:2: rule__DirectionStatement__Group__4__Impl
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
    // InternalRinform.g:1819:1: rule__DirectionStatement__Group__4__Impl : ( '>' ) ;
    public final void rule__DirectionStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1823:1: ( ( '>' ) )
            // InternalRinform.g:1824:1: ( '>' )
            {
            // InternalRinform.g:1824:1: ( '>' )
            // InternalRinform.g:1825:2: '>'
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
    // InternalRinform.g:1835:1: rule__Text__Group__0 : rule__Text__Group__0__Impl rule__Text__Group__1 ;
    public final void rule__Text__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1839:1: ( rule__Text__Group__0__Impl rule__Text__Group__1 )
            // InternalRinform.g:1840:2: rule__Text__Group__0__Impl rule__Text__Group__1
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
    // InternalRinform.g:1847:1: rule__Text__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__Text__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1851:1: ( ( RULE_ID ) )
            // InternalRinform.g:1852:1: ( RULE_ID )
            {
            // InternalRinform.g:1852:1: ( RULE_ID )
            // InternalRinform.g:1853:2: RULE_ID
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
    // InternalRinform.g:1862:1: rule__Text__Group__1 : rule__Text__Group__1__Impl ;
    public final void rule__Text__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1866:1: ( rule__Text__Group__1__Impl )
            // InternalRinform.g:1867:2: rule__Text__Group__1__Impl
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
    // InternalRinform.g:1873:1: rule__Text__Group__1__Impl : ( ( rule__Text__Group_1__0 )* ) ;
    public final void rule__Text__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1877:1: ( ( ( rule__Text__Group_1__0 )* ) )
            // InternalRinform.g:1878:1: ( ( rule__Text__Group_1__0 )* )
            {
            // InternalRinform.g:1878:1: ( ( rule__Text__Group_1__0 )* )
            // InternalRinform.g:1879:2: ( rule__Text__Group_1__0 )*
            {
             before(grammarAccess.getTextAccess().getGroup_1()); 
            // InternalRinform.g:1880:2: ( rule__Text__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_WS) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalRinform.g:1880:3: rule__Text__Group_1__0
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
    // InternalRinform.g:1889:1: rule__Text__Group_1__0 : rule__Text__Group_1__0__Impl rule__Text__Group_1__1 ;
    public final void rule__Text__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1893:1: ( rule__Text__Group_1__0__Impl rule__Text__Group_1__1 )
            // InternalRinform.g:1894:2: rule__Text__Group_1__0__Impl rule__Text__Group_1__1
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
    // InternalRinform.g:1901:1: rule__Text__Group_1__0__Impl : ( RULE_WS ) ;
    public final void rule__Text__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1905:1: ( ( RULE_WS ) )
            // InternalRinform.g:1906:1: ( RULE_WS )
            {
            // InternalRinform.g:1906:1: ( RULE_WS )
            // InternalRinform.g:1907:2: RULE_WS
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
    // InternalRinform.g:1916:1: rule__Text__Group_1__1 : rule__Text__Group_1__1__Impl ;
    public final void rule__Text__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1920:1: ( rule__Text__Group_1__1__Impl )
            // InternalRinform.g:1921:2: rule__Text__Group_1__1__Impl
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
    // InternalRinform.g:1927:1: rule__Text__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__Text__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1931:1: ( ( RULE_ID ) )
            // InternalRinform.g:1932:1: ( RULE_ID )
            {
            // InternalRinform.g:1932:1: ( RULE_ID )
            // InternalRinform.g:1933:2: RULE_ID
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
    // InternalRinform.g:1943:1: rule__ReverseInformProgram__SentencesAssignment : ( ruleSentencePart ) ;
    public final void rule__ReverseInformProgram__SentencesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1947:1: ( ( ruleSentencePart ) )
            // InternalRinform.g:1948:2: ( ruleSentencePart )
            {
            // InternalRinform.g:1948:2: ( ruleSentencePart )
            // InternalRinform.g:1949:3: ruleSentencePart
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
    // InternalRinform.g:1958:1: rule__RoomDeclaration__NameAssignment_1 : ( ruleText ) ;
    public final void rule__RoomDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1962:1: ( ( ruleText ) )
            // InternalRinform.g:1963:2: ( ruleText )
            {
            // InternalRinform.g:1963:2: ( ruleText )
            // InternalRinform.g:1964:3: ruleText
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
    // InternalRinform.g:1973:1: rule__RoomAlias__RoomAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__RoomAlias__RoomAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1977:1: ( ( ( RULE_ID ) ) )
            // InternalRinform.g:1978:2: ( ( RULE_ID ) )
            {
            // InternalRinform.g:1978:2: ( ( RULE_ID ) )
            // InternalRinform.g:1979:3: ( RULE_ID )
            {
             before(grammarAccess.getRoomAliasAccess().getRoomRoomDeclarationCrossReference_1_0()); 
            // InternalRinform.g:1980:3: ( RULE_ID )
            // InternalRinform.g:1981:4: RULE_ID
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
    // InternalRinform.g:1992:1: rule__RoomAlias__AliasesAssignment_3 : ( ruleText ) ;
    public final void rule__RoomAlias__AliasesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1996:1: ( ( ruleText ) )
            // InternalRinform.g:1997:2: ( ruleText )
            {
            // InternalRinform.g:1997:2: ( ruleText )
            // InternalRinform.g:1998:3: ruleText
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
    // InternalRinform.g:2007:1: rule__RoomDescription__RoomDescriptionAssignment_1 : ( ruleText ) ;
    public final void rule__RoomDescription__RoomDescriptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2011:1: ( ( ruleText ) )
            // InternalRinform.g:2012:2: ( ruleText )
            {
            // InternalRinform.g:2012:2: ( ruleText )
            // InternalRinform.g:2013:3: ruleText
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
    // InternalRinform.g:2022:1: rule__RoomDescription__RoomAssignment_3 : ( ( ruleText ) ) ;
    public final void rule__RoomDescription__RoomAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2026:1: ( ( ( ruleText ) ) )
            // InternalRinform.g:2027:2: ( ( ruleText ) )
            {
            // InternalRinform.g:2027:2: ( ( ruleText ) )
            // InternalRinform.g:2028:3: ( ruleText )
            {
             before(grammarAccess.getRoomDescriptionAccess().getRoomRoomDeclarationCrossReference_3_0()); 
            // InternalRinform.g:2029:3: ( ruleText )
            // InternalRinform.g:2030:4: ruleText
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
    // InternalRinform.g:2041:1: rule__ContainerDeclaration__NameAssignment_1 : ( ruleText ) ;
    public final void rule__ContainerDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2045:1: ( ( ruleText ) )
            // InternalRinform.g:2046:2: ( ruleText )
            {
            // InternalRinform.g:2046:2: ( ruleText )
            // InternalRinform.g:2047:3: ruleText
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
    // InternalRinform.g:2056:1: rule__ContainerDeclaration__RoomAssignment_3 : ( ( ruleText ) ) ;
    public final void rule__ContainerDeclaration__RoomAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2060:1: ( ( ( ruleText ) ) )
            // InternalRinform.g:2061:2: ( ( ruleText ) )
            {
            // InternalRinform.g:2061:2: ( ( ruleText ) )
            // InternalRinform.g:2062:3: ( ruleText )
            {
             before(grammarAccess.getContainerDeclarationAccess().getRoomRoomDeclarationCrossReference_3_0()); 
            // InternalRinform.g:2063:3: ( ruleText )
            // InternalRinform.g:2064:4: ruleText
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


    // $ANTLR start "rule__ItemInRoomDeclaration__NameAssignment_1"
    // InternalRinform.g:2075:1: rule__ItemInRoomDeclaration__NameAssignment_1 : ( ruleText ) ;
    public final void rule__ItemInRoomDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2079:1: ( ( ruleText ) )
            // InternalRinform.g:2080:2: ( ruleText )
            {
            // InternalRinform.g:2080:2: ( ruleText )
            // InternalRinform.g:2081:3: ruleText
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
    // InternalRinform.g:2090:1: rule__ItemInRoomDeclaration__RoomAssignment_3 : ( ( ruleText ) ) ;
    public final void rule__ItemInRoomDeclaration__RoomAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2094:1: ( ( ( ruleText ) ) )
            // InternalRinform.g:2095:2: ( ( ruleText ) )
            {
            // InternalRinform.g:2095:2: ( ( ruleText ) )
            // InternalRinform.g:2096:3: ( ruleText )
            {
             before(grammarAccess.getItemInRoomDeclarationAccess().getRoomRoomDeclarationCrossReference_3_0()); 
            // InternalRinform.g:2097:3: ( ruleText )
            // InternalRinform.g:2098:4: ruleText
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
    // InternalRinform.g:2109:1: rule__ItemInContainerDeclaration__NameAssignment_1 : ( ruleText ) ;
    public final void rule__ItemInContainerDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2113:1: ( ( ruleText ) )
            // InternalRinform.g:2114:2: ( ruleText )
            {
            // InternalRinform.g:2114:2: ( ruleText )
            // InternalRinform.g:2115:3: ruleText
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
    // InternalRinform.g:2124:1: rule__ItemInContainerDeclaration__ContainerAssignment_3 : ( ( ruleText ) ) ;
    public final void rule__ItemInContainerDeclaration__ContainerAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2128:1: ( ( ( ruleText ) ) )
            // InternalRinform.g:2129:2: ( ( ruleText ) )
            {
            // InternalRinform.g:2129:2: ( ( ruleText ) )
            // InternalRinform.g:2130:3: ( ruleText )
            {
             before(grammarAccess.getItemInContainerDeclarationAccess().getContainerContainerDeclarationCrossReference_3_0()); 
            // InternalRinform.g:2131:3: ( ruleText )
            // InternalRinform.g:2132:4: ruleText
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


    // $ANTLR start "rule__ItemDescription__ItemDescriptionAssignment_1"
    // InternalRinform.g:2143:1: rule__ItemDescription__ItemDescriptionAssignment_1 : ( ruleText ) ;
    public final void rule__ItemDescription__ItemDescriptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2147:1: ( ( ruleText ) )
            // InternalRinform.g:2148:2: ( ruleText )
            {
            // InternalRinform.g:2148:2: ( ruleText )
            // InternalRinform.g:2149:3: ruleText
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
    // InternalRinform.g:2158:1: rule__ItemDescription__ItemAssignment_3 : ( ( ruleText ) ) ;
    public final void rule__ItemDescription__ItemAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2162:1: ( ( ( ruleText ) ) )
            // InternalRinform.g:2163:2: ( ( ruleText ) )
            {
            // InternalRinform.g:2163:2: ( ( ruleText ) )
            // InternalRinform.g:2164:3: ( ruleText )
            {
             before(grammarAccess.getItemDescriptionAccess().getItemItemDeclarationCrossReference_3_0()); 
            // InternalRinform.g:2165:3: ( ruleText )
            // InternalRinform.g:2166:4: ruleText
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
    // InternalRinform.g:2177:1: rule__PersonDeclaration__NameAssignment_1 : ( ruleText ) ;
    public final void rule__PersonDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2181:1: ( ( ruleText ) )
            // InternalRinform.g:2182:2: ( ruleText )
            {
            // InternalRinform.g:2182:2: ( ruleText )
            // InternalRinform.g:2183:3: ruleText
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
    // InternalRinform.g:2192:1: rule__PersonDeclaration__RoomAssignment_3 : ( ( ruleText ) ) ;
    public final void rule__PersonDeclaration__RoomAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2196:1: ( ( ( ruleText ) ) )
            // InternalRinform.g:2197:2: ( ( ruleText ) )
            {
            // InternalRinform.g:2197:2: ( ( ruleText ) )
            // InternalRinform.g:2198:3: ( ruleText )
            {
             before(grammarAccess.getPersonDeclarationAccess().getRoomRoomDeclarationCrossReference_3_0()); 
            // InternalRinform.g:2199:3: ( ruleText )
            // InternalRinform.g:2200:4: ruleText
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
    // InternalRinform.g:2211:1: rule__PersonDescription__PersonDescriptionAssignment_1 : ( ruleText ) ;
    public final void rule__PersonDescription__PersonDescriptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2215:1: ( ( ruleText ) )
            // InternalRinform.g:2216:2: ( ruleText )
            {
            // InternalRinform.g:2216:2: ( ruleText )
            // InternalRinform.g:2217:3: ruleText
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
    // InternalRinform.g:2226:1: rule__PersonDescription__PersonAssignment_3 : ( ( ruleText ) ) ;
    public final void rule__PersonDescription__PersonAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2230:1: ( ( ( ruleText ) ) )
            // InternalRinform.g:2231:2: ( ( ruleText ) )
            {
            // InternalRinform.g:2231:2: ( ( ruleText ) )
            // InternalRinform.g:2232:3: ( ruleText )
            {
             before(grammarAccess.getPersonDescriptionAccess().getPersonPersonDeclarationCrossReference_3_0()); 
            // InternalRinform.g:2233:3: ( ruleText )
            // InternalRinform.g:2234:4: ruleText
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
    // InternalRinform.g:2245:1: rule__DirectionStatement__Room1Assignment_1 : ( ( ruleText ) ) ;
    public final void rule__DirectionStatement__Room1Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2249:1: ( ( ( ruleText ) ) )
            // InternalRinform.g:2250:2: ( ( ruleText ) )
            {
            // InternalRinform.g:2250:2: ( ( ruleText ) )
            // InternalRinform.g:2251:3: ( ruleText )
            {
             before(grammarAccess.getDirectionStatementAccess().getRoom1RoomDeclarationCrossReference_1_0()); 
            // InternalRinform.g:2252:3: ( ruleText )
            // InternalRinform.g:2253:4: ruleText
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
    // InternalRinform.g:2264:1: rule__DirectionStatement__DirectionAssignment_2 : ( ruleDirection ) ;
    public final void rule__DirectionStatement__DirectionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2268:1: ( ( ruleDirection ) )
            // InternalRinform.g:2269:2: ( ruleDirection )
            {
            // InternalRinform.g:2269:2: ( ruleDirection )
            // InternalRinform.g:2270:3: ruleDirection
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
    // InternalRinform.g:2279:1: rule__DirectionStatement__Room2Assignment_3 : ( ( ruleText ) ) ;
    public final void rule__DirectionStatement__Room2Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2283:1: ( ( ( ruleText ) ) )
            // InternalRinform.g:2284:2: ( ( ruleText ) )
            {
            // InternalRinform.g:2284:2: ( ( ruleText ) )
            // InternalRinform.g:2285:3: ( ruleText )
            {
             before(grammarAccess.getDirectionStatementAccess().getRoom2RoomDeclarationCrossReference_3_0()); 
            // InternalRinform.g:2286:3: ( ruleText )
            // InternalRinform.g:2287:4: ruleText
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
    // InternalRinform.g:2298:1: rule__Words__WordsAssignment : ( ruleText ) ;
    public final void rule__Words__WordsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2302:1: ( ( ruleText ) )
            // InternalRinform.g:2303:2: ( ruleText )
            {
            // InternalRinform.g:2303:2: ( ruleText )
            // InternalRinform.g:2304:3: ruleText
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
    // InternalRinform.g:2313:1: rule__Symbol__SymbolAssignment : ( ( rule__Symbol__SymbolAlternatives_0 ) ) ;
    public final void rule__Symbol__SymbolAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2317:1: ( ( ( rule__Symbol__SymbolAlternatives_0 ) ) )
            // InternalRinform.g:2318:2: ( ( rule__Symbol__SymbolAlternatives_0 ) )
            {
            // InternalRinform.g:2318:2: ( ( rule__Symbol__SymbolAlternatives_0 ) )
            // InternalRinform.g:2319:3: ( rule__Symbol__SymbolAlternatives_0 )
            {
             before(grammarAccess.getSymbolAccess().getSymbolAlternatives_0()); 
            // InternalRinform.g:2320:3: ( rule__Symbol__SymbolAlternatives_0 )
            // InternalRinform.g:2320:4: rule__Symbol__SymbolAlternatives_0
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
    static final String dfa_2s = "\10\uffff\1\13\13\uffff";
    static final String dfa_3s = "\3\4\5\uffff\2\4\2\uffff\2\4\3\uffff\3\4";
    static final String dfa_4s = "\1\40\2\4\5\uffff\1\40\1\37\2\uffff\1\4\1\37\3\uffff\1\37\1\4\1\37";
    static final String dfa_5s = "\3\uffff\1\4\1\6\1\10\1\11\1\12\2\uffff\1\2\1\1\2\uffff\1\5\1\7\1\3\3\uffff";
    static final String dfa_6s = "\24\uffff}>";
    static final String[] dfa_7s = {
            "\1\5\6\uffff\10\6\6\uffff\1\1\1\uffff\1\2\1\uffff\2\3\1\4\1\7",
            "\1\10",
            "\1\11",
            "",
            "",
            "",
            "",
            "",
            "\2\13\5\uffff\10\13\6\uffff\1\13\1\12\1\13\1\uffff\4\13",
            "\1\15\1\14\23\uffff\1\20\4\uffff\1\16\1\17",
            "",
            "",
            "\1\21",
            "\1\15\1\22\23\uffff\1\20\4\uffff\1\16\1\17",
            "",
            "",
            "",
            "\1\15\1\14\23\uffff\1\20\4\uffff\1\16\1\17",
            "\1\23",
            "\1\15\1\22\23\uffff\1\20\4\uffff\1\16\1\17"
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
            return "475:1: rule__SentencePart__Alternatives : ( ( ruleRoomDeclaration ) | ( ruleRoomAlias ) | ( ruleRoomDescription ) | ( ruleItemDeclaration ) | ( ruleItemDescription ) | ( rulePersonDeclaration ) | ( rulePersonDescription ) | ( ruleWords ) | ( ruleSymbol ) | ( ruleDirectionStatement ) );";
        }
    }
    static final String dfa_8s = "\10\uffff";
    static final String dfa_9s = "\1\35\1\4\1\uffff\1\5\1\4\2\uffff\1\5";
    static final String dfa_10s = "\1\36\1\4\1\uffff\1\35\1\4\2\uffff\1\35";
    static final String dfa_11s = "\2\uffff\1\2\2\uffff\1\1\1\3\1\uffff";
    static final String dfa_12s = "\10\uffff}>";
    static final String[] dfa_13s = {
            "\1\2\1\1",
            "\1\3",
            "",
            "\1\4\23\uffff\1\5\3\uffff\1\6",
            "\1\7",
            "",
            "",
            "\1\4\23\uffff\1\5\3\uffff\1\6"
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
            return "544:1: rule__ItemDeclaration__Alternatives : ( ( ruleItemInRoomDeclaration ) | ( ruleContainerDeclaration ) | ( ruleItemInContainerDeclaration ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000001EA07F812L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001F80000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000022L});

}