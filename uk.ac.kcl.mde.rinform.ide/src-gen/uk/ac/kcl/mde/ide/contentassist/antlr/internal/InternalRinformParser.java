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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_WS", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'.'", "','", "';'", "':'", "'-'", "'!'", "'?'", "'\\''", "'('", "')'", "'\"'", "'South'", "'North'", "'East'", "'West'", "'Below'", "'Above'", "'r-'", "'-r'", "'-a'", "'{'", "'!r'", "'['", "']'", "'}'", "'c-'", "'-c'", "'i-'", "'-i'", "'!c'", "'!i'", "'p-'", "'-p'", "'!p'", "'<'", "'>'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
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
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_WS)||(LA1_0>=11 && LA1_0<=21)||(LA1_0>=28 && LA1_0<=29)||LA1_0==31||LA1_0==36||LA1_0==38||LA1_0==42||LA1_0==45) ) {
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


    // $ANTLR start "entryRuleCharacterDeclaration"
    // InternalRinform.g:303:1: entryRuleCharacterDeclaration : ruleCharacterDeclaration EOF ;
    public final void entryRuleCharacterDeclaration() throws RecognitionException {
        try {
            // InternalRinform.g:304:1: ( ruleCharacterDeclaration EOF )
            // InternalRinform.g:305:1: ruleCharacterDeclaration EOF
            {
             before(grammarAccess.getCharacterDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleCharacterDeclaration();

            state._fsp--;

             after(grammarAccess.getCharacterDeclarationRule()); 
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
    // $ANTLR end "entryRuleCharacterDeclaration"


    // $ANTLR start "ruleCharacterDeclaration"
    // InternalRinform.g:312:1: ruleCharacterDeclaration : ( ( rule__CharacterDeclaration__Group__0 ) ) ;
    public final void ruleCharacterDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:316:2: ( ( ( rule__CharacterDeclaration__Group__0 ) ) )
            // InternalRinform.g:317:2: ( ( rule__CharacterDeclaration__Group__0 ) )
            {
            // InternalRinform.g:317:2: ( ( rule__CharacterDeclaration__Group__0 ) )
            // InternalRinform.g:318:3: ( rule__CharacterDeclaration__Group__0 )
            {
             before(grammarAccess.getCharacterDeclarationAccess().getGroup()); 
            // InternalRinform.g:319:3: ( rule__CharacterDeclaration__Group__0 )
            // InternalRinform.g:319:4: rule__CharacterDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CharacterDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCharacterDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCharacterDeclaration"


    // $ANTLR start "entryRuleCharacterDescription"
    // InternalRinform.g:328:1: entryRuleCharacterDescription : ruleCharacterDescription EOF ;
    public final void entryRuleCharacterDescription() throws RecognitionException {
        try {
            // InternalRinform.g:329:1: ( ruleCharacterDescription EOF )
            // InternalRinform.g:330:1: ruleCharacterDescription EOF
            {
             before(grammarAccess.getCharacterDescriptionRule()); 
            pushFollow(FOLLOW_1);
            ruleCharacterDescription();

            state._fsp--;

             after(grammarAccess.getCharacterDescriptionRule()); 
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
    // $ANTLR end "entryRuleCharacterDescription"


    // $ANTLR start "ruleCharacterDescription"
    // InternalRinform.g:337:1: ruleCharacterDescription : ( ( rule__CharacterDescription__Group__0 ) ) ;
    public final void ruleCharacterDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:341:2: ( ( ( rule__CharacterDescription__Group__0 ) ) )
            // InternalRinform.g:342:2: ( ( rule__CharacterDescription__Group__0 ) )
            {
            // InternalRinform.g:342:2: ( ( rule__CharacterDescription__Group__0 ) )
            // InternalRinform.g:343:3: ( rule__CharacterDescription__Group__0 )
            {
             before(grammarAccess.getCharacterDescriptionAccess().getGroup()); 
            // InternalRinform.g:344:3: ( rule__CharacterDescription__Group__0 )
            // InternalRinform.g:344:4: rule__CharacterDescription__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CharacterDescription__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCharacterDescriptionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCharacterDescription"


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
    // InternalRinform.g:387:1: ruleText : ( ( ( rule__Text__Alternatives ) ) ( ( rule__Text__Alternatives )* ) ) ;
    public final void ruleText() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:391:2: ( ( ( ( rule__Text__Alternatives ) ) ( ( rule__Text__Alternatives )* ) ) )
            // InternalRinform.g:392:2: ( ( ( rule__Text__Alternatives ) ) ( ( rule__Text__Alternatives )* ) )
            {
            // InternalRinform.g:392:2: ( ( ( rule__Text__Alternatives ) ) ( ( rule__Text__Alternatives )* ) )
            // InternalRinform.g:393:3: ( ( rule__Text__Alternatives ) ) ( ( rule__Text__Alternatives )* )
            {
            // InternalRinform.g:393:3: ( ( rule__Text__Alternatives ) )
            // InternalRinform.g:394:4: ( rule__Text__Alternatives )
            {
             before(grammarAccess.getTextAccess().getAlternatives()); 
            // InternalRinform.g:395:4: ( rule__Text__Alternatives )
            // InternalRinform.g:395:5: rule__Text__Alternatives
            {
            pushFollow(FOLLOW_4);
            rule__Text__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTextAccess().getAlternatives()); 

            }

            // InternalRinform.g:398:3: ( ( rule__Text__Alternatives )* )
            // InternalRinform.g:399:4: ( rule__Text__Alternatives )*
            {
             before(grammarAccess.getTextAccess().getAlternatives()); 
            // InternalRinform.g:400:4: ( rule__Text__Alternatives )*
            loop2:
            do {
                int alt2=2;
                alt2 = dfa2.predict(input);
                switch (alt2) {
            	case 1 :
            	    // InternalRinform.g:400:5: rule__Text__Alternatives
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Text__Alternatives();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getTextAccess().getAlternatives()); 

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


    // $ANTLR start "entryRuleWords"
    // InternalRinform.g:410:1: entryRuleWords : ruleWords EOF ;
    public final void entryRuleWords() throws RecognitionException {
        try {
            // InternalRinform.g:411:1: ( ruleWords EOF )
            // InternalRinform.g:412:1: ruleWords EOF
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
    // InternalRinform.g:419:1: ruleWords : ( ( ( rule__Words__WordsAssignment ) ) ( ( rule__Words__WordsAssignment )* ) ) ;
    public final void ruleWords() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:423:2: ( ( ( ( rule__Words__WordsAssignment ) ) ( ( rule__Words__WordsAssignment )* ) ) )
            // InternalRinform.g:424:2: ( ( ( rule__Words__WordsAssignment ) ) ( ( rule__Words__WordsAssignment )* ) )
            {
            // InternalRinform.g:424:2: ( ( ( rule__Words__WordsAssignment ) ) ( ( rule__Words__WordsAssignment )* ) )
            // InternalRinform.g:425:3: ( ( rule__Words__WordsAssignment ) ) ( ( rule__Words__WordsAssignment )* )
            {
            // InternalRinform.g:425:3: ( ( rule__Words__WordsAssignment ) )
            // InternalRinform.g:426:4: ( rule__Words__WordsAssignment )
            {
             before(grammarAccess.getWordsAccess().getWordsAssignment()); 
            // InternalRinform.g:427:4: ( rule__Words__WordsAssignment )
            // InternalRinform.g:427:5: rule__Words__WordsAssignment
            {
            pushFollow(FOLLOW_4);
            rule__Words__WordsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getWordsAccess().getWordsAssignment()); 

            }

            // InternalRinform.g:430:3: ( ( rule__Words__WordsAssignment )* )
            // InternalRinform.g:431:4: ( rule__Words__WordsAssignment )*
            {
             before(grammarAccess.getWordsAccess().getWordsAssignment()); 
            // InternalRinform.g:432:4: ( rule__Words__WordsAssignment )*
            loop3:
            do {
                int alt3=2;
                alt3 = dfa3.predict(input);
                switch (alt3) {
            	case 1 :
            	    // InternalRinform.g:432:5: rule__Words__WordsAssignment
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Words__WordsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
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


    // $ANTLR start "entryRuleSYMBOL"
    // InternalRinform.g:442:1: entryRuleSYMBOL : ruleSYMBOL EOF ;
    public final void entryRuleSYMBOL() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalRinform.g:446:1: ( ruleSYMBOL EOF )
            // InternalRinform.g:447:1: ruleSYMBOL EOF
            {
             before(grammarAccess.getSYMBOLRule()); 
            pushFollow(FOLLOW_1);
            ruleSYMBOL();

            state._fsp--;

             after(grammarAccess.getSYMBOLRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleSYMBOL"


    // $ANTLR start "ruleSYMBOL"
    // InternalRinform.g:457:1: ruleSYMBOL : ( ( rule__SYMBOL__Alternatives ) ) ;
    public final void ruleSYMBOL() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:462:2: ( ( ( rule__SYMBOL__Alternatives ) ) )
            // InternalRinform.g:463:2: ( ( rule__SYMBOL__Alternatives ) )
            {
            // InternalRinform.g:463:2: ( ( rule__SYMBOL__Alternatives ) )
            // InternalRinform.g:464:3: ( rule__SYMBOL__Alternatives )
            {
             before(grammarAccess.getSYMBOLAccess().getAlternatives()); 
            // InternalRinform.g:465:3: ( rule__SYMBOL__Alternatives )
            // InternalRinform.g:465:4: rule__SYMBOL__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SYMBOL__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSYMBOLAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleSYMBOL"


    // $ANTLR start "ruleDirection"
    // InternalRinform.g:475:1: ruleDirection : ( ( rule__Direction__Alternatives ) ) ;
    public final void ruleDirection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:479:1: ( ( ( rule__Direction__Alternatives ) ) )
            // InternalRinform.g:480:2: ( ( rule__Direction__Alternatives ) )
            {
            // InternalRinform.g:480:2: ( ( rule__Direction__Alternatives ) )
            // InternalRinform.g:481:3: ( rule__Direction__Alternatives )
            {
             before(grammarAccess.getDirectionAccess().getAlternatives()); 
            // InternalRinform.g:482:3: ( rule__Direction__Alternatives )
            // InternalRinform.g:482:4: rule__Direction__Alternatives
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
    // InternalRinform.g:490:1: rule__SentencePart__Alternatives : ( ( ruleRoomDeclaration ) | ( ruleRoomAlias ) | ( ruleRoomDescription ) | ( ruleItemDeclaration ) | ( ruleItemDescription ) | ( ruleCharacterDeclaration ) | ( ruleCharacterDescription ) | ( ruleWords ) | ( ruleDirectionStatement ) );
    public final void rule__SentencePart__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:494:1: ( ( ruleRoomDeclaration ) | ( ruleRoomAlias ) | ( ruleRoomDescription ) | ( ruleItemDeclaration ) | ( ruleItemDescription ) | ( ruleCharacterDeclaration ) | ( ruleCharacterDescription ) | ( ruleWords ) | ( ruleDirectionStatement ) )
            int alt4=9;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalRinform.g:495:2: ( ruleRoomDeclaration )
                    {
                    // InternalRinform.g:495:2: ( ruleRoomDeclaration )
                    // InternalRinform.g:496:3: ruleRoomDeclaration
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
                    // InternalRinform.g:501:2: ( ruleRoomAlias )
                    {
                    // InternalRinform.g:501:2: ( ruleRoomAlias )
                    // InternalRinform.g:502:3: ruleRoomAlias
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
                    // InternalRinform.g:507:2: ( ruleRoomDescription )
                    {
                    // InternalRinform.g:507:2: ( ruleRoomDescription )
                    // InternalRinform.g:508:3: ruleRoomDescription
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
                    // InternalRinform.g:513:2: ( ruleItemDeclaration )
                    {
                    // InternalRinform.g:513:2: ( ruleItemDeclaration )
                    // InternalRinform.g:514:3: ruleItemDeclaration
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
                    // InternalRinform.g:519:2: ( ruleItemDescription )
                    {
                    // InternalRinform.g:519:2: ( ruleItemDescription )
                    // InternalRinform.g:520:3: ruleItemDescription
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
                    // InternalRinform.g:525:2: ( ruleCharacterDeclaration )
                    {
                    // InternalRinform.g:525:2: ( ruleCharacterDeclaration )
                    // InternalRinform.g:526:3: ruleCharacterDeclaration
                    {
                     before(grammarAccess.getSentencePartAccess().getCharacterDeclarationParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleCharacterDeclaration();

                    state._fsp--;

                     after(grammarAccess.getSentencePartAccess().getCharacterDeclarationParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalRinform.g:531:2: ( ruleCharacterDescription )
                    {
                    // InternalRinform.g:531:2: ( ruleCharacterDescription )
                    // InternalRinform.g:532:3: ruleCharacterDescription
                    {
                     before(grammarAccess.getSentencePartAccess().getCharacterDescriptionParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleCharacterDescription();

                    state._fsp--;

                     after(grammarAccess.getSentencePartAccess().getCharacterDescriptionParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalRinform.g:537:2: ( ruleWords )
                    {
                    // InternalRinform.g:537:2: ( ruleWords )
                    // InternalRinform.g:538:3: ruleWords
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
                    // InternalRinform.g:543:2: ( ruleDirectionStatement )
                    {
                    // InternalRinform.g:543:2: ( ruleDirectionStatement )
                    // InternalRinform.g:544:3: ruleDirectionStatement
                    {
                     before(grammarAccess.getSentencePartAccess().getDirectionStatementParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleDirectionStatement();

                    state._fsp--;

                     after(grammarAccess.getSentencePartAccess().getDirectionStatementParserRuleCall_8()); 

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
    // InternalRinform.g:553:1: rule__ItemDeclaration__Alternatives : ( ( ruleItemInRoomDeclaration ) | ( ruleContainerDeclaration ) | ( ruleItemInContainerDeclaration ) );
    public final void rule__ItemDeclaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:557:1: ( ( ruleItemInRoomDeclaration ) | ( ruleContainerDeclaration ) | ( ruleItemInContainerDeclaration ) )
            int alt5=3;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalRinform.g:558:2: ( ruleItemInRoomDeclaration )
                    {
                    // InternalRinform.g:558:2: ( ruleItemInRoomDeclaration )
                    // InternalRinform.g:559:3: ruleItemInRoomDeclaration
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
                    // InternalRinform.g:564:2: ( ruleContainerDeclaration )
                    {
                    // InternalRinform.g:564:2: ( ruleContainerDeclaration )
                    // InternalRinform.g:565:3: ruleContainerDeclaration
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
                    // InternalRinform.g:570:2: ( ruleItemInContainerDeclaration )
                    {
                    // InternalRinform.g:570:2: ( ruleItemInContainerDeclaration )
                    // InternalRinform.g:571:3: ruleItemInContainerDeclaration
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


    // $ANTLR start "rule__Text__Alternatives"
    // InternalRinform.g:580:1: rule__Text__Alternatives : ( ( RULE_ID ) | ( RULE_WS ) | ( ruleSYMBOL ) );
    public final void rule__Text__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:584:1: ( ( RULE_ID ) | ( RULE_WS ) | ( ruleSYMBOL ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt6=1;
                }
                break;
            case RULE_WS:
                {
                alt6=2;
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
            case 19:
            case 20:
            case 21:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalRinform.g:585:2: ( RULE_ID )
                    {
                    // InternalRinform.g:585:2: ( RULE_ID )
                    // InternalRinform.g:586:3: RULE_ID
                    {
                     before(grammarAccess.getTextAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getTextAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRinform.g:591:2: ( RULE_WS )
                    {
                    // InternalRinform.g:591:2: ( RULE_WS )
                    // InternalRinform.g:592:3: RULE_WS
                    {
                     before(grammarAccess.getTextAccess().getWSTerminalRuleCall_1()); 
                    match(input,RULE_WS,FOLLOW_2); 
                     after(grammarAccess.getTextAccess().getWSTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRinform.g:597:2: ( ruleSYMBOL )
                    {
                    // InternalRinform.g:597:2: ( ruleSYMBOL )
                    // InternalRinform.g:598:3: ruleSYMBOL
                    {
                     before(grammarAccess.getTextAccess().getSYMBOLParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleSYMBOL();

                    state._fsp--;

                     after(grammarAccess.getTextAccess().getSYMBOLParserRuleCall_2()); 

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
    // $ANTLR end "rule__Text__Alternatives"


    // $ANTLR start "rule__SYMBOL__Alternatives"
    // InternalRinform.g:607:1: rule__SYMBOL__Alternatives : ( ( '.' ) | ( ',' ) | ( ';' ) | ( ':' ) | ( '-' ) | ( '!' ) | ( '?' ) | ( '\\'' ) | ( '(' ) | ( ')' ) | ( '\"' ) );
    public final void rule__SYMBOL__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:611:1: ( ( '.' ) | ( ',' ) | ( ';' ) | ( ':' ) | ( '-' ) | ( '!' ) | ( '?' ) | ( '\\'' ) | ( '(' ) | ( ')' ) | ( '\"' ) )
            int alt7=11;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt7=1;
                }
                break;
            case 12:
                {
                alt7=2;
                }
                break;
            case 13:
                {
                alt7=3;
                }
                break;
            case 14:
                {
                alt7=4;
                }
                break;
            case 15:
                {
                alt7=5;
                }
                break;
            case 16:
                {
                alt7=6;
                }
                break;
            case 17:
                {
                alt7=7;
                }
                break;
            case 18:
                {
                alt7=8;
                }
                break;
            case 19:
                {
                alt7=9;
                }
                break;
            case 20:
                {
                alt7=10;
                }
                break;
            case 21:
                {
                alt7=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalRinform.g:612:2: ( '.' )
                    {
                    // InternalRinform.g:612:2: ( '.' )
                    // InternalRinform.g:613:3: '.'
                    {
                     before(grammarAccess.getSYMBOLAccess().getFullStopKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getSYMBOLAccess().getFullStopKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRinform.g:618:2: ( ',' )
                    {
                    // InternalRinform.g:618:2: ( ',' )
                    // InternalRinform.g:619:3: ','
                    {
                     before(grammarAccess.getSYMBOLAccess().getCommaKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getSYMBOLAccess().getCommaKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRinform.g:624:2: ( ';' )
                    {
                    // InternalRinform.g:624:2: ( ';' )
                    // InternalRinform.g:625:3: ';'
                    {
                     before(grammarAccess.getSYMBOLAccess().getSemicolonKeyword_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getSYMBOLAccess().getSemicolonKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRinform.g:630:2: ( ':' )
                    {
                    // InternalRinform.g:630:2: ( ':' )
                    // InternalRinform.g:631:3: ':'
                    {
                     before(grammarAccess.getSYMBOLAccess().getColonKeyword_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getSYMBOLAccess().getColonKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalRinform.g:636:2: ( '-' )
                    {
                    // InternalRinform.g:636:2: ( '-' )
                    // InternalRinform.g:637:3: '-'
                    {
                     before(grammarAccess.getSYMBOLAccess().getHyphenMinusKeyword_4()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getSYMBOLAccess().getHyphenMinusKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalRinform.g:642:2: ( '!' )
                    {
                    // InternalRinform.g:642:2: ( '!' )
                    // InternalRinform.g:643:3: '!'
                    {
                     before(grammarAccess.getSYMBOLAccess().getExclamationMarkKeyword_5()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getSYMBOLAccess().getExclamationMarkKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalRinform.g:648:2: ( '?' )
                    {
                    // InternalRinform.g:648:2: ( '?' )
                    // InternalRinform.g:649:3: '?'
                    {
                     before(grammarAccess.getSYMBOLAccess().getQuestionMarkKeyword_6()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getSYMBOLAccess().getQuestionMarkKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalRinform.g:654:2: ( '\\'' )
                    {
                    // InternalRinform.g:654:2: ( '\\'' )
                    // InternalRinform.g:655:3: '\\''
                    {
                     before(grammarAccess.getSYMBOLAccess().getApostropheKeyword_7()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getSYMBOLAccess().getApostropheKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalRinform.g:660:2: ( '(' )
                    {
                    // InternalRinform.g:660:2: ( '(' )
                    // InternalRinform.g:661:3: '('
                    {
                     before(grammarAccess.getSYMBOLAccess().getLeftParenthesisKeyword_8()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getSYMBOLAccess().getLeftParenthesisKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalRinform.g:666:2: ( ')' )
                    {
                    // InternalRinform.g:666:2: ( ')' )
                    // InternalRinform.g:667:3: ')'
                    {
                     before(grammarAccess.getSYMBOLAccess().getRightParenthesisKeyword_9()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getSYMBOLAccess().getRightParenthesisKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalRinform.g:672:2: ( '\"' )
                    {
                    // InternalRinform.g:672:2: ( '\"' )
                    // InternalRinform.g:673:3: '\"'
                    {
                     before(grammarAccess.getSYMBOLAccess().getQuotationMarkKeyword_10()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getSYMBOLAccess().getQuotationMarkKeyword_10()); 

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
    // $ANTLR end "rule__SYMBOL__Alternatives"


    // $ANTLR start "rule__Direction__Alternatives"
    // InternalRinform.g:682:1: rule__Direction__Alternatives : ( ( ( 'South' ) ) | ( ( 'North' ) ) | ( ( 'East' ) ) | ( ( 'West' ) ) | ( ( 'Below' ) ) | ( ( 'Above' ) ) );
    public final void rule__Direction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:686:1: ( ( ( 'South' ) ) | ( ( 'North' ) ) | ( ( 'East' ) ) | ( ( 'West' ) ) | ( ( 'Below' ) ) | ( ( 'Above' ) ) )
            int alt8=6;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt8=1;
                }
                break;
            case 23:
                {
                alt8=2;
                }
                break;
            case 24:
                {
                alt8=3;
                }
                break;
            case 25:
                {
                alt8=4;
                }
                break;
            case 26:
                {
                alt8=5;
                }
                break;
            case 27:
                {
                alt8=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalRinform.g:687:2: ( ( 'South' ) )
                    {
                    // InternalRinform.g:687:2: ( ( 'South' ) )
                    // InternalRinform.g:688:3: ( 'South' )
                    {
                     before(grammarAccess.getDirectionAccess().getSouthEnumLiteralDeclaration_0()); 
                    // InternalRinform.g:689:3: ( 'South' )
                    // InternalRinform.g:689:4: 'South'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectionAccess().getSouthEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRinform.g:693:2: ( ( 'North' ) )
                    {
                    // InternalRinform.g:693:2: ( ( 'North' ) )
                    // InternalRinform.g:694:3: ( 'North' )
                    {
                     before(grammarAccess.getDirectionAccess().getNorthEnumLiteralDeclaration_1()); 
                    // InternalRinform.g:695:3: ( 'North' )
                    // InternalRinform.g:695:4: 'North'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectionAccess().getNorthEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRinform.g:699:2: ( ( 'East' ) )
                    {
                    // InternalRinform.g:699:2: ( ( 'East' ) )
                    // InternalRinform.g:700:3: ( 'East' )
                    {
                     before(grammarAccess.getDirectionAccess().getEastEnumLiteralDeclaration_2()); 
                    // InternalRinform.g:701:3: ( 'East' )
                    // InternalRinform.g:701:4: 'East'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectionAccess().getEastEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRinform.g:705:2: ( ( 'West' ) )
                    {
                    // InternalRinform.g:705:2: ( ( 'West' ) )
                    // InternalRinform.g:706:3: ( 'West' )
                    {
                     before(grammarAccess.getDirectionAccess().getWestEnumLiteralDeclaration_3()); 
                    // InternalRinform.g:707:3: ( 'West' )
                    // InternalRinform.g:707:4: 'West'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectionAccess().getWestEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalRinform.g:711:2: ( ( 'Below' ) )
                    {
                    // InternalRinform.g:711:2: ( ( 'Below' ) )
                    // InternalRinform.g:712:3: ( 'Below' )
                    {
                     before(grammarAccess.getDirectionAccess().getBelowEnumLiteralDeclaration_4()); 
                    // InternalRinform.g:713:3: ( 'Below' )
                    // InternalRinform.g:713:4: 'Below'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectionAccess().getBelowEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalRinform.g:717:2: ( ( 'Above' ) )
                    {
                    // InternalRinform.g:717:2: ( ( 'Above' ) )
                    // InternalRinform.g:718:3: ( 'Above' )
                    {
                     before(grammarAccess.getDirectionAccess().getAboveEnumLiteralDeclaration_5()); 
                    // InternalRinform.g:719:3: ( 'Above' )
                    // InternalRinform.g:719:4: 'Above'
                    {
                    match(input,27,FOLLOW_2); 

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
    // InternalRinform.g:727:1: rule__RoomDeclaration__Group__0 : rule__RoomDeclaration__Group__0__Impl rule__RoomDeclaration__Group__1 ;
    public final void rule__RoomDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:731:1: ( rule__RoomDeclaration__Group__0__Impl rule__RoomDeclaration__Group__1 )
            // InternalRinform.g:732:2: rule__RoomDeclaration__Group__0__Impl rule__RoomDeclaration__Group__1
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
    // InternalRinform.g:739:1: rule__RoomDeclaration__Group__0__Impl : ( 'r-' ) ;
    public final void rule__RoomDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:743:1: ( ( 'r-' ) )
            // InternalRinform.g:744:1: ( 'r-' )
            {
            // InternalRinform.g:744:1: ( 'r-' )
            // InternalRinform.g:745:2: 'r-'
            {
             before(grammarAccess.getRoomDeclarationAccess().getRKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalRinform.g:754:1: rule__RoomDeclaration__Group__1 : rule__RoomDeclaration__Group__1__Impl rule__RoomDeclaration__Group__2 ;
    public final void rule__RoomDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:758:1: ( rule__RoomDeclaration__Group__1__Impl rule__RoomDeclaration__Group__2 )
            // InternalRinform.g:759:2: rule__RoomDeclaration__Group__1__Impl rule__RoomDeclaration__Group__2
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
    // InternalRinform.g:766:1: rule__RoomDeclaration__Group__1__Impl : ( ( rule__RoomDeclaration__NameAssignment_1 ) ) ;
    public final void rule__RoomDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:770:1: ( ( ( rule__RoomDeclaration__NameAssignment_1 ) ) )
            // InternalRinform.g:771:1: ( ( rule__RoomDeclaration__NameAssignment_1 ) )
            {
            // InternalRinform.g:771:1: ( ( rule__RoomDeclaration__NameAssignment_1 ) )
            // InternalRinform.g:772:2: ( rule__RoomDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getRoomDeclarationAccess().getNameAssignment_1()); 
            // InternalRinform.g:773:2: ( rule__RoomDeclaration__NameAssignment_1 )
            // InternalRinform.g:773:3: rule__RoomDeclaration__NameAssignment_1
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
    // InternalRinform.g:781:1: rule__RoomDeclaration__Group__2 : rule__RoomDeclaration__Group__2__Impl ;
    public final void rule__RoomDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:785:1: ( rule__RoomDeclaration__Group__2__Impl )
            // InternalRinform.g:786:2: rule__RoomDeclaration__Group__2__Impl
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
    // InternalRinform.g:792:1: rule__RoomDeclaration__Group__2__Impl : ( '-r' ) ;
    public final void rule__RoomDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:796:1: ( ( '-r' ) )
            // InternalRinform.g:797:1: ( '-r' )
            {
            // InternalRinform.g:797:1: ( '-r' )
            // InternalRinform.g:798:2: '-r'
            {
             before(grammarAccess.getRoomDeclarationAccess().getRKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getRoomDeclarationAccess().getRKeyword_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__RoomAlias__Group__0"
    // InternalRinform.g:808:1: rule__RoomAlias__Group__0 : rule__RoomAlias__Group__0__Impl rule__RoomAlias__Group__1 ;
    public final void rule__RoomAlias__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:812:1: ( rule__RoomAlias__Group__0__Impl rule__RoomAlias__Group__1 )
            // InternalRinform.g:813:2: rule__RoomAlias__Group__0__Impl rule__RoomAlias__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalRinform.g:820:1: rule__RoomAlias__Group__0__Impl : ( '-r' ) ;
    public final void rule__RoomAlias__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:824:1: ( ( '-r' ) )
            // InternalRinform.g:825:1: ( '-r' )
            {
            // InternalRinform.g:825:1: ( '-r' )
            // InternalRinform.g:826:2: '-r'
            {
             before(grammarAccess.getRoomAliasAccess().getRKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalRinform.g:835:1: rule__RoomAlias__Group__1 : rule__RoomAlias__Group__1__Impl rule__RoomAlias__Group__2 ;
    public final void rule__RoomAlias__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:839:1: ( rule__RoomAlias__Group__1__Impl rule__RoomAlias__Group__2 )
            // InternalRinform.g:840:2: rule__RoomAlias__Group__1__Impl rule__RoomAlias__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalRinform.g:847:1: rule__RoomAlias__Group__1__Impl : ( ( rule__RoomAlias__RoomAssignment_1 ) ) ;
    public final void rule__RoomAlias__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:851:1: ( ( ( rule__RoomAlias__RoomAssignment_1 ) ) )
            // InternalRinform.g:852:1: ( ( rule__RoomAlias__RoomAssignment_1 ) )
            {
            // InternalRinform.g:852:1: ( ( rule__RoomAlias__RoomAssignment_1 ) )
            // InternalRinform.g:853:2: ( rule__RoomAlias__RoomAssignment_1 )
            {
             before(grammarAccess.getRoomAliasAccess().getRoomAssignment_1()); 
            // InternalRinform.g:854:2: ( rule__RoomAlias__RoomAssignment_1 )
            // InternalRinform.g:854:3: rule__RoomAlias__RoomAssignment_1
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
    // InternalRinform.g:862:1: rule__RoomAlias__Group__2 : rule__RoomAlias__Group__2__Impl rule__RoomAlias__Group__3 ;
    public final void rule__RoomAlias__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:866:1: ( rule__RoomAlias__Group__2__Impl rule__RoomAlias__Group__3 )
            // InternalRinform.g:867:2: rule__RoomAlias__Group__2__Impl rule__RoomAlias__Group__3
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
    // InternalRinform.g:874:1: rule__RoomAlias__Group__2__Impl : ( '-a' ) ;
    public final void rule__RoomAlias__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:878:1: ( ( '-a' ) )
            // InternalRinform.g:879:1: ( '-a' )
            {
            // InternalRinform.g:879:1: ( '-a' )
            // InternalRinform.g:880:2: '-a'
            {
             before(grammarAccess.getRoomAliasAccess().getAKeyword_2()); 
            match(input,30,FOLLOW_2); 
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
    // InternalRinform.g:889:1: rule__RoomAlias__Group__3 : rule__RoomAlias__Group__3__Impl ;
    public final void rule__RoomAlias__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:893:1: ( rule__RoomAlias__Group__3__Impl )
            // InternalRinform.g:894:2: rule__RoomAlias__Group__3__Impl
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
    // InternalRinform.g:900:1: rule__RoomAlias__Group__3__Impl : ( ( ( rule__RoomAlias__AliasesAssignment_3 ) ) ( ( rule__RoomAlias__AliasesAssignment_3 )* ) ) ;
    public final void rule__RoomAlias__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:904:1: ( ( ( ( rule__RoomAlias__AliasesAssignment_3 ) ) ( ( rule__RoomAlias__AliasesAssignment_3 )* ) ) )
            // InternalRinform.g:905:1: ( ( ( rule__RoomAlias__AliasesAssignment_3 ) ) ( ( rule__RoomAlias__AliasesAssignment_3 )* ) )
            {
            // InternalRinform.g:905:1: ( ( ( rule__RoomAlias__AliasesAssignment_3 ) ) ( ( rule__RoomAlias__AliasesAssignment_3 )* ) )
            // InternalRinform.g:906:2: ( ( rule__RoomAlias__AliasesAssignment_3 ) ) ( ( rule__RoomAlias__AliasesAssignment_3 )* )
            {
            // InternalRinform.g:906:2: ( ( rule__RoomAlias__AliasesAssignment_3 ) )
            // InternalRinform.g:907:3: ( rule__RoomAlias__AliasesAssignment_3 )
            {
             before(grammarAccess.getRoomAliasAccess().getAliasesAssignment_3()); 
            // InternalRinform.g:908:3: ( rule__RoomAlias__AliasesAssignment_3 )
            // InternalRinform.g:908:4: rule__RoomAlias__AliasesAssignment_3
            {
            pushFollow(FOLLOW_4);
            rule__RoomAlias__AliasesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRoomAliasAccess().getAliasesAssignment_3()); 

            }

            // InternalRinform.g:911:2: ( ( rule__RoomAlias__AliasesAssignment_3 )* )
            // InternalRinform.g:912:3: ( rule__RoomAlias__AliasesAssignment_3 )*
            {
             before(grammarAccess.getRoomAliasAccess().getAliasesAssignment_3()); 
            // InternalRinform.g:913:3: ( rule__RoomAlias__AliasesAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                alt9 = dfa9.predict(input);
                switch (alt9) {
            	case 1 :
            	    // InternalRinform.g:913:4: rule__RoomAlias__AliasesAssignment_3
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__RoomAlias__AliasesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalRinform.g:923:1: rule__RoomDescription__Group__0 : rule__RoomDescription__Group__0__Impl rule__RoomDescription__Group__1 ;
    public final void rule__RoomDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:927:1: ( rule__RoomDescription__Group__0__Impl rule__RoomDescription__Group__1 )
            // InternalRinform.g:928:2: rule__RoomDescription__Group__0__Impl rule__RoomDescription__Group__1
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
    // InternalRinform.g:935:1: rule__RoomDescription__Group__0__Impl : ( '{' ) ;
    public final void rule__RoomDescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:939:1: ( ( '{' ) )
            // InternalRinform.g:940:1: ( '{' )
            {
            // InternalRinform.g:940:1: ( '{' )
            // InternalRinform.g:941:2: '{'
            {
             before(grammarAccess.getRoomDescriptionAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getRoomDescriptionAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
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
    // InternalRinform.g:950:1: rule__RoomDescription__Group__1 : rule__RoomDescription__Group__1__Impl rule__RoomDescription__Group__2 ;
    public final void rule__RoomDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:954:1: ( rule__RoomDescription__Group__1__Impl rule__RoomDescription__Group__2 )
            // InternalRinform.g:955:2: rule__RoomDescription__Group__1__Impl rule__RoomDescription__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalRinform.g:962:1: rule__RoomDescription__Group__1__Impl : ( ( ( rule__RoomDescription__RoomDescriptionAssignment_1 ) ) ( ( rule__RoomDescription__RoomDescriptionAssignment_1 )* ) ) ;
    public final void rule__RoomDescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:966:1: ( ( ( ( rule__RoomDescription__RoomDescriptionAssignment_1 ) ) ( ( rule__RoomDescription__RoomDescriptionAssignment_1 )* ) ) )
            // InternalRinform.g:967:1: ( ( ( rule__RoomDescription__RoomDescriptionAssignment_1 ) ) ( ( rule__RoomDescription__RoomDescriptionAssignment_1 )* ) )
            {
            // InternalRinform.g:967:1: ( ( ( rule__RoomDescription__RoomDescriptionAssignment_1 ) ) ( ( rule__RoomDescription__RoomDescriptionAssignment_1 )* ) )
            // InternalRinform.g:968:2: ( ( rule__RoomDescription__RoomDescriptionAssignment_1 ) ) ( ( rule__RoomDescription__RoomDescriptionAssignment_1 )* )
            {
            // InternalRinform.g:968:2: ( ( rule__RoomDescription__RoomDescriptionAssignment_1 ) )
            // InternalRinform.g:969:3: ( rule__RoomDescription__RoomDescriptionAssignment_1 )
            {
             before(grammarAccess.getRoomDescriptionAccess().getRoomDescriptionAssignment_1()); 
            // InternalRinform.g:970:3: ( rule__RoomDescription__RoomDescriptionAssignment_1 )
            // InternalRinform.g:970:4: rule__RoomDescription__RoomDescriptionAssignment_1
            {
            pushFollow(FOLLOW_4);
            rule__RoomDescription__RoomDescriptionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRoomDescriptionAccess().getRoomDescriptionAssignment_1()); 

            }

            // InternalRinform.g:973:2: ( ( rule__RoomDescription__RoomDescriptionAssignment_1 )* )
            // InternalRinform.g:974:3: ( rule__RoomDescription__RoomDescriptionAssignment_1 )*
            {
             before(grammarAccess.getRoomDescriptionAccess().getRoomDescriptionAssignment_1()); 
            // InternalRinform.g:975:3: ( rule__RoomDescription__RoomDescriptionAssignment_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_WS)||(LA10_0>=11 && LA10_0<=21)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalRinform.g:975:4: rule__RoomDescription__RoomDescriptionAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__RoomDescription__RoomDescriptionAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalRinform.g:984:1: rule__RoomDescription__Group__2 : rule__RoomDescription__Group__2__Impl rule__RoomDescription__Group__3 ;
    public final void rule__RoomDescription__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:988:1: ( rule__RoomDescription__Group__2__Impl rule__RoomDescription__Group__3 )
            // InternalRinform.g:989:2: rule__RoomDescription__Group__2__Impl rule__RoomDescription__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalRinform.g:996:1: rule__RoomDescription__Group__2__Impl : ( '!r' ) ;
    public final void rule__RoomDescription__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1000:1: ( ( '!r' ) )
            // InternalRinform.g:1001:1: ( '!r' )
            {
            // InternalRinform.g:1001:1: ( '!r' )
            // InternalRinform.g:1002:2: '!r'
            {
             before(grammarAccess.getRoomDescriptionAccess().getRKeyword_2()); 
            match(input,32,FOLLOW_2); 
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
    // InternalRinform.g:1011:1: rule__RoomDescription__Group__3 : rule__RoomDescription__Group__3__Impl rule__RoomDescription__Group__4 ;
    public final void rule__RoomDescription__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1015:1: ( rule__RoomDescription__Group__3__Impl rule__RoomDescription__Group__4 )
            // InternalRinform.g:1016:2: rule__RoomDescription__Group__3__Impl rule__RoomDescription__Group__4
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
    // InternalRinform.g:1023:1: rule__RoomDescription__Group__3__Impl : ( '[' ) ;
    public final void rule__RoomDescription__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1027:1: ( ( '[' ) )
            // InternalRinform.g:1028:1: ( '[' )
            {
            // InternalRinform.g:1028:1: ( '[' )
            // InternalRinform.g:1029:2: '['
            {
             before(grammarAccess.getRoomDescriptionAccess().getLeftSquareBracketKeyword_3()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getRoomDescriptionAccess().getLeftSquareBracketKeyword_3()); 

            }


            }

        }
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
    // InternalRinform.g:1038:1: rule__RoomDescription__Group__4 : rule__RoomDescription__Group__4__Impl rule__RoomDescription__Group__5 ;
    public final void rule__RoomDescription__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1042:1: ( rule__RoomDescription__Group__4__Impl rule__RoomDescription__Group__5 )
            // InternalRinform.g:1043:2: rule__RoomDescription__Group__4__Impl rule__RoomDescription__Group__5
            {
            pushFollow(FOLLOW_11);
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
    // InternalRinform.g:1050:1: rule__RoomDescription__Group__4__Impl : ( ( rule__RoomDescription__RoomAssignment_4 ) ) ;
    public final void rule__RoomDescription__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1054:1: ( ( ( rule__RoomDescription__RoomAssignment_4 ) ) )
            // InternalRinform.g:1055:1: ( ( rule__RoomDescription__RoomAssignment_4 ) )
            {
            // InternalRinform.g:1055:1: ( ( rule__RoomDescription__RoomAssignment_4 ) )
            // InternalRinform.g:1056:2: ( rule__RoomDescription__RoomAssignment_4 )
            {
             before(grammarAccess.getRoomDescriptionAccess().getRoomAssignment_4()); 
            // InternalRinform.g:1057:2: ( rule__RoomDescription__RoomAssignment_4 )
            // InternalRinform.g:1057:3: rule__RoomDescription__RoomAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__RoomDescription__RoomAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRoomDescriptionAccess().getRoomAssignment_4()); 

            }


            }

        }
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
    // InternalRinform.g:1065:1: rule__RoomDescription__Group__5 : rule__RoomDescription__Group__5__Impl rule__RoomDescription__Group__6 ;
    public final void rule__RoomDescription__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1069:1: ( rule__RoomDescription__Group__5__Impl rule__RoomDescription__Group__6 )
            // InternalRinform.g:1070:2: rule__RoomDescription__Group__5__Impl rule__RoomDescription__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__RoomDescription__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoomDescription__Group__6();

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
    // InternalRinform.g:1077:1: rule__RoomDescription__Group__5__Impl : ( ']' ) ;
    public final void rule__RoomDescription__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1081:1: ( ( ']' ) )
            // InternalRinform.g:1082:1: ( ']' )
            {
            // InternalRinform.g:1082:1: ( ']' )
            // InternalRinform.g:1083:2: ']'
            {
             before(grammarAccess.getRoomDescriptionAccess().getRightSquareBracketKeyword_5()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getRoomDescriptionAccess().getRightSquareBracketKeyword_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__RoomDescription__Group__6"
    // InternalRinform.g:1092:1: rule__RoomDescription__Group__6 : rule__RoomDescription__Group__6__Impl ;
    public final void rule__RoomDescription__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1096:1: ( rule__RoomDescription__Group__6__Impl )
            // InternalRinform.g:1097:2: rule__RoomDescription__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RoomDescription__Group__6__Impl();

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
    // $ANTLR end "rule__RoomDescription__Group__6"


    // $ANTLR start "rule__RoomDescription__Group__6__Impl"
    // InternalRinform.g:1103:1: rule__RoomDescription__Group__6__Impl : ( '}' ) ;
    public final void rule__RoomDescription__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1107:1: ( ( '}' ) )
            // InternalRinform.g:1108:1: ( '}' )
            {
            // InternalRinform.g:1108:1: ( '}' )
            // InternalRinform.g:1109:2: '}'
            {
             before(grammarAccess.getRoomDescriptionAccess().getRightCurlyBracketKeyword_6()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getRoomDescriptionAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoomDescription__Group__6__Impl"


    // $ANTLR start "rule__ContainerDeclaration__Group__0"
    // InternalRinform.g:1119:1: rule__ContainerDeclaration__Group__0 : rule__ContainerDeclaration__Group__0__Impl rule__ContainerDeclaration__Group__1 ;
    public final void rule__ContainerDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1123:1: ( rule__ContainerDeclaration__Group__0__Impl rule__ContainerDeclaration__Group__1 )
            // InternalRinform.g:1124:2: rule__ContainerDeclaration__Group__0__Impl rule__ContainerDeclaration__Group__1
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
    // InternalRinform.g:1131:1: rule__ContainerDeclaration__Group__0__Impl : ( 'c-' ) ;
    public final void rule__ContainerDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1135:1: ( ( 'c-' ) )
            // InternalRinform.g:1136:1: ( 'c-' )
            {
            // InternalRinform.g:1136:1: ( 'c-' )
            // InternalRinform.g:1137:2: 'c-'
            {
             before(grammarAccess.getContainerDeclarationAccess().getCKeyword_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalRinform.g:1146:1: rule__ContainerDeclaration__Group__1 : rule__ContainerDeclaration__Group__1__Impl rule__ContainerDeclaration__Group__2 ;
    public final void rule__ContainerDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1150:1: ( rule__ContainerDeclaration__Group__1__Impl rule__ContainerDeclaration__Group__2 )
            // InternalRinform.g:1151:2: rule__ContainerDeclaration__Group__1__Impl rule__ContainerDeclaration__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalRinform.g:1158:1: rule__ContainerDeclaration__Group__1__Impl : ( ( rule__ContainerDeclaration__NameAssignment_1 ) ) ;
    public final void rule__ContainerDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1162:1: ( ( ( rule__ContainerDeclaration__NameAssignment_1 ) ) )
            // InternalRinform.g:1163:1: ( ( rule__ContainerDeclaration__NameAssignment_1 ) )
            {
            // InternalRinform.g:1163:1: ( ( rule__ContainerDeclaration__NameAssignment_1 ) )
            // InternalRinform.g:1164:2: ( rule__ContainerDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getContainerDeclarationAccess().getNameAssignment_1()); 
            // InternalRinform.g:1165:2: ( rule__ContainerDeclaration__NameAssignment_1 )
            // InternalRinform.g:1165:3: rule__ContainerDeclaration__NameAssignment_1
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
    // InternalRinform.g:1173:1: rule__ContainerDeclaration__Group__2 : rule__ContainerDeclaration__Group__2__Impl rule__ContainerDeclaration__Group__3 ;
    public final void rule__ContainerDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1177:1: ( rule__ContainerDeclaration__Group__2__Impl rule__ContainerDeclaration__Group__3 )
            // InternalRinform.g:1178:2: rule__ContainerDeclaration__Group__2__Impl rule__ContainerDeclaration__Group__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalRinform.g:1185:1: rule__ContainerDeclaration__Group__2__Impl : ( '-c' ) ;
    public final void rule__ContainerDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1189:1: ( ( '-c' ) )
            // InternalRinform.g:1190:1: ( '-c' )
            {
            // InternalRinform.g:1190:1: ( '-c' )
            // InternalRinform.g:1191:2: '-c'
            {
             before(grammarAccess.getContainerDeclarationAccess().getCKeyword_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getContainerDeclarationAccess().getCKeyword_2()); 

            }


            }

        }
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
    // InternalRinform.g:1200:1: rule__ContainerDeclaration__Group__3 : rule__ContainerDeclaration__Group__3__Impl rule__ContainerDeclaration__Group__4 ;
    public final void rule__ContainerDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1204:1: ( rule__ContainerDeclaration__Group__3__Impl rule__ContainerDeclaration__Group__4 )
            // InternalRinform.g:1205:2: rule__ContainerDeclaration__Group__3__Impl rule__ContainerDeclaration__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__ContainerDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContainerDeclaration__Group__4();

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
    // InternalRinform.g:1212:1: rule__ContainerDeclaration__Group__3__Impl : ( '!r' ) ;
    public final void rule__ContainerDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1216:1: ( ( '!r' ) )
            // InternalRinform.g:1217:1: ( '!r' )
            {
            // InternalRinform.g:1217:1: ( '!r' )
            // InternalRinform.g:1218:2: '!r'
            {
             before(grammarAccess.getContainerDeclarationAccess().getRKeyword_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getContainerDeclarationAccess().getRKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__ContainerDeclaration__Group__4"
    // InternalRinform.g:1227:1: rule__ContainerDeclaration__Group__4 : rule__ContainerDeclaration__Group__4__Impl rule__ContainerDeclaration__Group__5 ;
    public final void rule__ContainerDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1231:1: ( rule__ContainerDeclaration__Group__4__Impl rule__ContainerDeclaration__Group__5 )
            // InternalRinform.g:1232:2: rule__ContainerDeclaration__Group__4__Impl rule__ContainerDeclaration__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__ContainerDeclaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContainerDeclaration__Group__5();

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
    // $ANTLR end "rule__ContainerDeclaration__Group__4"


    // $ANTLR start "rule__ContainerDeclaration__Group__4__Impl"
    // InternalRinform.g:1239:1: rule__ContainerDeclaration__Group__4__Impl : ( '[' ) ;
    public final void rule__ContainerDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1243:1: ( ( '[' ) )
            // InternalRinform.g:1244:1: ( '[' )
            {
            // InternalRinform.g:1244:1: ( '[' )
            // InternalRinform.g:1245:2: '['
            {
             before(grammarAccess.getContainerDeclarationAccess().getLeftSquareBracketKeyword_4()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getContainerDeclarationAccess().getLeftSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContainerDeclaration__Group__4__Impl"


    // $ANTLR start "rule__ContainerDeclaration__Group__5"
    // InternalRinform.g:1254:1: rule__ContainerDeclaration__Group__5 : rule__ContainerDeclaration__Group__5__Impl rule__ContainerDeclaration__Group__6 ;
    public final void rule__ContainerDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1258:1: ( rule__ContainerDeclaration__Group__5__Impl rule__ContainerDeclaration__Group__6 )
            // InternalRinform.g:1259:2: rule__ContainerDeclaration__Group__5__Impl rule__ContainerDeclaration__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__ContainerDeclaration__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContainerDeclaration__Group__6();

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
    // $ANTLR end "rule__ContainerDeclaration__Group__5"


    // $ANTLR start "rule__ContainerDeclaration__Group__5__Impl"
    // InternalRinform.g:1266:1: rule__ContainerDeclaration__Group__5__Impl : ( ( rule__ContainerDeclaration__RoomAssignment_5 ) ) ;
    public final void rule__ContainerDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1270:1: ( ( ( rule__ContainerDeclaration__RoomAssignment_5 ) ) )
            // InternalRinform.g:1271:1: ( ( rule__ContainerDeclaration__RoomAssignment_5 ) )
            {
            // InternalRinform.g:1271:1: ( ( rule__ContainerDeclaration__RoomAssignment_5 ) )
            // InternalRinform.g:1272:2: ( rule__ContainerDeclaration__RoomAssignment_5 )
            {
             before(grammarAccess.getContainerDeclarationAccess().getRoomAssignment_5()); 
            // InternalRinform.g:1273:2: ( rule__ContainerDeclaration__RoomAssignment_5 )
            // InternalRinform.g:1273:3: rule__ContainerDeclaration__RoomAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ContainerDeclaration__RoomAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getContainerDeclarationAccess().getRoomAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContainerDeclaration__Group__5__Impl"


    // $ANTLR start "rule__ContainerDeclaration__Group__6"
    // InternalRinform.g:1281:1: rule__ContainerDeclaration__Group__6 : rule__ContainerDeclaration__Group__6__Impl ;
    public final void rule__ContainerDeclaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1285:1: ( rule__ContainerDeclaration__Group__6__Impl )
            // InternalRinform.g:1286:2: rule__ContainerDeclaration__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ContainerDeclaration__Group__6__Impl();

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
    // $ANTLR end "rule__ContainerDeclaration__Group__6"


    // $ANTLR start "rule__ContainerDeclaration__Group__6__Impl"
    // InternalRinform.g:1292:1: rule__ContainerDeclaration__Group__6__Impl : ( ']' ) ;
    public final void rule__ContainerDeclaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1296:1: ( ( ']' ) )
            // InternalRinform.g:1297:1: ( ']' )
            {
            // InternalRinform.g:1297:1: ( ']' )
            // InternalRinform.g:1298:2: ']'
            {
             before(grammarAccess.getContainerDeclarationAccess().getRightSquareBracketKeyword_6()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getContainerDeclarationAccess().getRightSquareBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContainerDeclaration__Group__6__Impl"


    // $ANTLR start "rule__ItemInRoomDeclaration__Group__0"
    // InternalRinform.g:1308:1: rule__ItemInRoomDeclaration__Group__0 : rule__ItemInRoomDeclaration__Group__0__Impl rule__ItemInRoomDeclaration__Group__1 ;
    public final void rule__ItemInRoomDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1312:1: ( rule__ItemInRoomDeclaration__Group__0__Impl rule__ItemInRoomDeclaration__Group__1 )
            // InternalRinform.g:1313:2: rule__ItemInRoomDeclaration__Group__0__Impl rule__ItemInRoomDeclaration__Group__1
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
    // InternalRinform.g:1320:1: rule__ItemInRoomDeclaration__Group__0__Impl : ( 'i-' ) ;
    public final void rule__ItemInRoomDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1324:1: ( ( 'i-' ) )
            // InternalRinform.g:1325:1: ( 'i-' )
            {
            // InternalRinform.g:1325:1: ( 'i-' )
            // InternalRinform.g:1326:2: 'i-'
            {
             before(grammarAccess.getItemInRoomDeclarationAccess().getIKeyword_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalRinform.g:1335:1: rule__ItemInRoomDeclaration__Group__1 : rule__ItemInRoomDeclaration__Group__1__Impl rule__ItemInRoomDeclaration__Group__2 ;
    public final void rule__ItemInRoomDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1339:1: ( rule__ItemInRoomDeclaration__Group__1__Impl rule__ItemInRoomDeclaration__Group__2 )
            // InternalRinform.g:1340:2: rule__ItemInRoomDeclaration__Group__1__Impl rule__ItemInRoomDeclaration__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalRinform.g:1347:1: rule__ItemInRoomDeclaration__Group__1__Impl : ( ( rule__ItemInRoomDeclaration__NameAssignment_1 ) ) ;
    public final void rule__ItemInRoomDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1351:1: ( ( ( rule__ItemInRoomDeclaration__NameAssignment_1 ) ) )
            // InternalRinform.g:1352:1: ( ( rule__ItemInRoomDeclaration__NameAssignment_1 ) )
            {
            // InternalRinform.g:1352:1: ( ( rule__ItemInRoomDeclaration__NameAssignment_1 ) )
            // InternalRinform.g:1353:2: ( rule__ItemInRoomDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getItemInRoomDeclarationAccess().getNameAssignment_1()); 
            // InternalRinform.g:1354:2: ( rule__ItemInRoomDeclaration__NameAssignment_1 )
            // InternalRinform.g:1354:3: rule__ItemInRoomDeclaration__NameAssignment_1
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
    // InternalRinform.g:1362:1: rule__ItemInRoomDeclaration__Group__2 : rule__ItemInRoomDeclaration__Group__2__Impl rule__ItemInRoomDeclaration__Group__3 ;
    public final void rule__ItemInRoomDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1366:1: ( rule__ItemInRoomDeclaration__Group__2__Impl rule__ItemInRoomDeclaration__Group__3 )
            // InternalRinform.g:1367:2: rule__ItemInRoomDeclaration__Group__2__Impl rule__ItemInRoomDeclaration__Group__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalRinform.g:1374:1: rule__ItemInRoomDeclaration__Group__2__Impl : ( '-i' ) ;
    public final void rule__ItemInRoomDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1378:1: ( ( '-i' ) )
            // InternalRinform.g:1379:1: ( '-i' )
            {
            // InternalRinform.g:1379:1: ( '-i' )
            // InternalRinform.g:1380:2: '-i'
            {
             before(grammarAccess.getItemInRoomDeclarationAccess().getIKeyword_2()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getItemInRoomDeclarationAccess().getIKeyword_2()); 

            }


            }

        }
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
    // InternalRinform.g:1389:1: rule__ItemInRoomDeclaration__Group__3 : rule__ItemInRoomDeclaration__Group__3__Impl rule__ItemInRoomDeclaration__Group__4 ;
    public final void rule__ItemInRoomDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1393:1: ( rule__ItemInRoomDeclaration__Group__3__Impl rule__ItemInRoomDeclaration__Group__4 )
            // InternalRinform.g:1394:2: rule__ItemInRoomDeclaration__Group__3__Impl rule__ItemInRoomDeclaration__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__ItemInRoomDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ItemInRoomDeclaration__Group__4();

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
    // InternalRinform.g:1401:1: rule__ItemInRoomDeclaration__Group__3__Impl : ( '!r' ) ;
    public final void rule__ItemInRoomDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1405:1: ( ( '!r' ) )
            // InternalRinform.g:1406:1: ( '!r' )
            {
            // InternalRinform.g:1406:1: ( '!r' )
            // InternalRinform.g:1407:2: '!r'
            {
             before(grammarAccess.getItemInRoomDeclarationAccess().getRKeyword_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getItemInRoomDeclarationAccess().getRKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__ItemInRoomDeclaration__Group__4"
    // InternalRinform.g:1416:1: rule__ItemInRoomDeclaration__Group__4 : rule__ItemInRoomDeclaration__Group__4__Impl rule__ItemInRoomDeclaration__Group__5 ;
    public final void rule__ItemInRoomDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1420:1: ( rule__ItemInRoomDeclaration__Group__4__Impl rule__ItemInRoomDeclaration__Group__5 )
            // InternalRinform.g:1421:2: rule__ItemInRoomDeclaration__Group__4__Impl rule__ItemInRoomDeclaration__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__ItemInRoomDeclaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ItemInRoomDeclaration__Group__5();

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
    // $ANTLR end "rule__ItemInRoomDeclaration__Group__4"


    // $ANTLR start "rule__ItemInRoomDeclaration__Group__4__Impl"
    // InternalRinform.g:1428:1: rule__ItemInRoomDeclaration__Group__4__Impl : ( '[' ) ;
    public final void rule__ItemInRoomDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1432:1: ( ( '[' ) )
            // InternalRinform.g:1433:1: ( '[' )
            {
            // InternalRinform.g:1433:1: ( '[' )
            // InternalRinform.g:1434:2: '['
            {
             before(grammarAccess.getItemInRoomDeclarationAccess().getLeftSquareBracketKeyword_4()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getItemInRoomDeclarationAccess().getLeftSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemInRoomDeclaration__Group__4__Impl"


    // $ANTLR start "rule__ItemInRoomDeclaration__Group__5"
    // InternalRinform.g:1443:1: rule__ItemInRoomDeclaration__Group__5 : rule__ItemInRoomDeclaration__Group__5__Impl rule__ItemInRoomDeclaration__Group__6 ;
    public final void rule__ItemInRoomDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1447:1: ( rule__ItemInRoomDeclaration__Group__5__Impl rule__ItemInRoomDeclaration__Group__6 )
            // InternalRinform.g:1448:2: rule__ItemInRoomDeclaration__Group__5__Impl rule__ItemInRoomDeclaration__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__ItemInRoomDeclaration__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ItemInRoomDeclaration__Group__6();

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
    // $ANTLR end "rule__ItemInRoomDeclaration__Group__5"


    // $ANTLR start "rule__ItemInRoomDeclaration__Group__5__Impl"
    // InternalRinform.g:1455:1: rule__ItemInRoomDeclaration__Group__5__Impl : ( ( rule__ItemInRoomDeclaration__RoomAssignment_5 ) ) ;
    public final void rule__ItemInRoomDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1459:1: ( ( ( rule__ItemInRoomDeclaration__RoomAssignment_5 ) ) )
            // InternalRinform.g:1460:1: ( ( rule__ItemInRoomDeclaration__RoomAssignment_5 ) )
            {
            // InternalRinform.g:1460:1: ( ( rule__ItemInRoomDeclaration__RoomAssignment_5 ) )
            // InternalRinform.g:1461:2: ( rule__ItemInRoomDeclaration__RoomAssignment_5 )
            {
             before(grammarAccess.getItemInRoomDeclarationAccess().getRoomAssignment_5()); 
            // InternalRinform.g:1462:2: ( rule__ItemInRoomDeclaration__RoomAssignment_5 )
            // InternalRinform.g:1462:3: rule__ItemInRoomDeclaration__RoomAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ItemInRoomDeclaration__RoomAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getItemInRoomDeclarationAccess().getRoomAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemInRoomDeclaration__Group__5__Impl"


    // $ANTLR start "rule__ItemInRoomDeclaration__Group__6"
    // InternalRinform.g:1470:1: rule__ItemInRoomDeclaration__Group__6 : rule__ItemInRoomDeclaration__Group__6__Impl ;
    public final void rule__ItemInRoomDeclaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1474:1: ( rule__ItemInRoomDeclaration__Group__6__Impl )
            // InternalRinform.g:1475:2: rule__ItemInRoomDeclaration__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ItemInRoomDeclaration__Group__6__Impl();

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
    // $ANTLR end "rule__ItemInRoomDeclaration__Group__6"


    // $ANTLR start "rule__ItemInRoomDeclaration__Group__6__Impl"
    // InternalRinform.g:1481:1: rule__ItemInRoomDeclaration__Group__6__Impl : ( ']' ) ;
    public final void rule__ItemInRoomDeclaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1485:1: ( ( ']' ) )
            // InternalRinform.g:1486:1: ( ']' )
            {
            // InternalRinform.g:1486:1: ( ']' )
            // InternalRinform.g:1487:2: ']'
            {
             before(grammarAccess.getItemInRoomDeclarationAccess().getRightSquareBracketKeyword_6()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getItemInRoomDeclarationAccess().getRightSquareBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemInRoomDeclaration__Group__6__Impl"


    // $ANTLR start "rule__ItemInContainerDeclaration__Group__0"
    // InternalRinform.g:1497:1: rule__ItemInContainerDeclaration__Group__0 : rule__ItemInContainerDeclaration__Group__0__Impl rule__ItemInContainerDeclaration__Group__1 ;
    public final void rule__ItemInContainerDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1501:1: ( rule__ItemInContainerDeclaration__Group__0__Impl rule__ItemInContainerDeclaration__Group__1 )
            // InternalRinform.g:1502:2: rule__ItemInContainerDeclaration__Group__0__Impl rule__ItemInContainerDeclaration__Group__1
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
    // InternalRinform.g:1509:1: rule__ItemInContainerDeclaration__Group__0__Impl : ( 'i-' ) ;
    public final void rule__ItemInContainerDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1513:1: ( ( 'i-' ) )
            // InternalRinform.g:1514:1: ( 'i-' )
            {
            // InternalRinform.g:1514:1: ( 'i-' )
            // InternalRinform.g:1515:2: 'i-'
            {
             before(grammarAccess.getItemInContainerDeclarationAccess().getIKeyword_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalRinform.g:1524:1: rule__ItemInContainerDeclaration__Group__1 : rule__ItemInContainerDeclaration__Group__1__Impl rule__ItemInContainerDeclaration__Group__2 ;
    public final void rule__ItemInContainerDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1528:1: ( rule__ItemInContainerDeclaration__Group__1__Impl rule__ItemInContainerDeclaration__Group__2 )
            // InternalRinform.g:1529:2: rule__ItemInContainerDeclaration__Group__1__Impl rule__ItemInContainerDeclaration__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalRinform.g:1536:1: rule__ItemInContainerDeclaration__Group__1__Impl : ( ( rule__ItemInContainerDeclaration__NameAssignment_1 ) ) ;
    public final void rule__ItemInContainerDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1540:1: ( ( ( rule__ItemInContainerDeclaration__NameAssignment_1 ) ) )
            // InternalRinform.g:1541:1: ( ( rule__ItemInContainerDeclaration__NameAssignment_1 ) )
            {
            // InternalRinform.g:1541:1: ( ( rule__ItemInContainerDeclaration__NameAssignment_1 ) )
            // InternalRinform.g:1542:2: ( rule__ItemInContainerDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getItemInContainerDeclarationAccess().getNameAssignment_1()); 
            // InternalRinform.g:1543:2: ( rule__ItemInContainerDeclaration__NameAssignment_1 )
            // InternalRinform.g:1543:3: rule__ItemInContainerDeclaration__NameAssignment_1
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
    // InternalRinform.g:1551:1: rule__ItemInContainerDeclaration__Group__2 : rule__ItemInContainerDeclaration__Group__2__Impl rule__ItemInContainerDeclaration__Group__3 ;
    public final void rule__ItemInContainerDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1555:1: ( rule__ItemInContainerDeclaration__Group__2__Impl rule__ItemInContainerDeclaration__Group__3 )
            // InternalRinform.g:1556:2: rule__ItemInContainerDeclaration__Group__2__Impl rule__ItemInContainerDeclaration__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalRinform.g:1563:1: rule__ItemInContainerDeclaration__Group__2__Impl : ( '-i' ) ;
    public final void rule__ItemInContainerDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1567:1: ( ( '-i' ) )
            // InternalRinform.g:1568:1: ( '-i' )
            {
            // InternalRinform.g:1568:1: ( '-i' )
            // InternalRinform.g:1569:2: '-i'
            {
             before(grammarAccess.getItemInContainerDeclarationAccess().getIKeyword_2()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getItemInContainerDeclarationAccess().getIKeyword_2()); 

            }


            }

        }
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
    // InternalRinform.g:1578:1: rule__ItemInContainerDeclaration__Group__3 : rule__ItemInContainerDeclaration__Group__3__Impl rule__ItemInContainerDeclaration__Group__4 ;
    public final void rule__ItemInContainerDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1582:1: ( rule__ItemInContainerDeclaration__Group__3__Impl rule__ItemInContainerDeclaration__Group__4 )
            // InternalRinform.g:1583:2: rule__ItemInContainerDeclaration__Group__3__Impl rule__ItemInContainerDeclaration__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__ItemInContainerDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ItemInContainerDeclaration__Group__4();

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
    // InternalRinform.g:1590:1: rule__ItemInContainerDeclaration__Group__3__Impl : ( '!c' ) ;
    public final void rule__ItemInContainerDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1594:1: ( ( '!c' ) )
            // InternalRinform.g:1595:1: ( '!c' )
            {
            // InternalRinform.g:1595:1: ( '!c' )
            // InternalRinform.g:1596:2: '!c'
            {
             before(grammarAccess.getItemInContainerDeclarationAccess().getCKeyword_3()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getItemInContainerDeclarationAccess().getCKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__ItemInContainerDeclaration__Group__4"
    // InternalRinform.g:1605:1: rule__ItemInContainerDeclaration__Group__4 : rule__ItemInContainerDeclaration__Group__4__Impl rule__ItemInContainerDeclaration__Group__5 ;
    public final void rule__ItemInContainerDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1609:1: ( rule__ItemInContainerDeclaration__Group__4__Impl rule__ItemInContainerDeclaration__Group__5 )
            // InternalRinform.g:1610:2: rule__ItemInContainerDeclaration__Group__4__Impl rule__ItemInContainerDeclaration__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__ItemInContainerDeclaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ItemInContainerDeclaration__Group__5();

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
    // $ANTLR end "rule__ItemInContainerDeclaration__Group__4"


    // $ANTLR start "rule__ItemInContainerDeclaration__Group__4__Impl"
    // InternalRinform.g:1617:1: rule__ItemInContainerDeclaration__Group__4__Impl : ( '[' ) ;
    public final void rule__ItemInContainerDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1621:1: ( ( '[' ) )
            // InternalRinform.g:1622:1: ( '[' )
            {
            // InternalRinform.g:1622:1: ( '[' )
            // InternalRinform.g:1623:2: '['
            {
             before(grammarAccess.getItemInContainerDeclarationAccess().getLeftSquareBracketKeyword_4()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getItemInContainerDeclarationAccess().getLeftSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemInContainerDeclaration__Group__4__Impl"


    // $ANTLR start "rule__ItemInContainerDeclaration__Group__5"
    // InternalRinform.g:1632:1: rule__ItemInContainerDeclaration__Group__5 : rule__ItemInContainerDeclaration__Group__5__Impl rule__ItemInContainerDeclaration__Group__6 ;
    public final void rule__ItemInContainerDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1636:1: ( rule__ItemInContainerDeclaration__Group__5__Impl rule__ItemInContainerDeclaration__Group__6 )
            // InternalRinform.g:1637:2: rule__ItemInContainerDeclaration__Group__5__Impl rule__ItemInContainerDeclaration__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__ItemInContainerDeclaration__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ItemInContainerDeclaration__Group__6();

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
    // $ANTLR end "rule__ItemInContainerDeclaration__Group__5"


    // $ANTLR start "rule__ItemInContainerDeclaration__Group__5__Impl"
    // InternalRinform.g:1644:1: rule__ItemInContainerDeclaration__Group__5__Impl : ( ( rule__ItemInContainerDeclaration__ContainerAssignment_5 ) ) ;
    public final void rule__ItemInContainerDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1648:1: ( ( ( rule__ItemInContainerDeclaration__ContainerAssignment_5 ) ) )
            // InternalRinform.g:1649:1: ( ( rule__ItemInContainerDeclaration__ContainerAssignment_5 ) )
            {
            // InternalRinform.g:1649:1: ( ( rule__ItemInContainerDeclaration__ContainerAssignment_5 ) )
            // InternalRinform.g:1650:2: ( rule__ItemInContainerDeclaration__ContainerAssignment_5 )
            {
             before(grammarAccess.getItemInContainerDeclarationAccess().getContainerAssignment_5()); 
            // InternalRinform.g:1651:2: ( rule__ItemInContainerDeclaration__ContainerAssignment_5 )
            // InternalRinform.g:1651:3: rule__ItemInContainerDeclaration__ContainerAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ItemInContainerDeclaration__ContainerAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getItemInContainerDeclarationAccess().getContainerAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemInContainerDeclaration__Group__5__Impl"


    // $ANTLR start "rule__ItemInContainerDeclaration__Group__6"
    // InternalRinform.g:1659:1: rule__ItemInContainerDeclaration__Group__6 : rule__ItemInContainerDeclaration__Group__6__Impl ;
    public final void rule__ItemInContainerDeclaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1663:1: ( rule__ItemInContainerDeclaration__Group__6__Impl )
            // InternalRinform.g:1664:2: rule__ItemInContainerDeclaration__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ItemInContainerDeclaration__Group__6__Impl();

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
    // $ANTLR end "rule__ItemInContainerDeclaration__Group__6"


    // $ANTLR start "rule__ItemInContainerDeclaration__Group__6__Impl"
    // InternalRinform.g:1670:1: rule__ItemInContainerDeclaration__Group__6__Impl : ( ']' ) ;
    public final void rule__ItemInContainerDeclaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1674:1: ( ( ']' ) )
            // InternalRinform.g:1675:1: ( ']' )
            {
            // InternalRinform.g:1675:1: ( ']' )
            // InternalRinform.g:1676:2: ']'
            {
             before(grammarAccess.getItemInContainerDeclarationAccess().getRightSquareBracketKeyword_6()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getItemInContainerDeclarationAccess().getRightSquareBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemInContainerDeclaration__Group__6__Impl"


    // $ANTLR start "rule__ItemDescription__Group__0"
    // InternalRinform.g:1686:1: rule__ItemDescription__Group__0 : rule__ItemDescription__Group__0__Impl rule__ItemDescription__Group__1 ;
    public final void rule__ItemDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1690:1: ( rule__ItemDescription__Group__0__Impl rule__ItemDescription__Group__1 )
            // InternalRinform.g:1691:2: rule__ItemDescription__Group__0__Impl rule__ItemDescription__Group__1
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
    // InternalRinform.g:1698:1: rule__ItemDescription__Group__0__Impl : ( '{' ) ;
    public final void rule__ItemDescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1702:1: ( ( '{' ) )
            // InternalRinform.g:1703:1: ( '{' )
            {
            // InternalRinform.g:1703:1: ( '{' )
            // InternalRinform.g:1704:2: '{'
            {
             before(grammarAccess.getItemDescriptionAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getItemDescriptionAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
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
    // InternalRinform.g:1713:1: rule__ItemDescription__Group__1 : rule__ItemDescription__Group__1__Impl rule__ItemDescription__Group__2 ;
    public final void rule__ItemDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1717:1: ( rule__ItemDescription__Group__1__Impl rule__ItemDescription__Group__2 )
            // InternalRinform.g:1718:2: rule__ItemDescription__Group__1__Impl rule__ItemDescription__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalRinform.g:1725:1: rule__ItemDescription__Group__1__Impl : ( ( ( rule__ItemDescription__ItemDescriptionAssignment_1 ) ) ( ( rule__ItemDescription__ItemDescriptionAssignment_1 )* ) ) ;
    public final void rule__ItemDescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1729:1: ( ( ( ( rule__ItemDescription__ItemDescriptionAssignment_1 ) ) ( ( rule__ItemDescription__ItemDescriptionAssignment_1 )* ) ) )
            // InternalRinform.g:1730:1: ( ( ( rule__ItemDescription__ItemDescriptionAssignment_1 ) ) ( ( rule__ItemDescription__ItemDescriptionAssignment_1 )* ) )
            {
            // InternalRinform.g:1730:1: ( ( ( rule__ItemDescription__ItemDescriptionAssignment_1 ) ) ( ( rule__ItemDescription__ItemDescriptionAssignment_1 )* ) )
            // InternalRinform.g:1731:2: ( ( rule__ItemDescription__ItemDescriptionAssignment_1 ) ) ( ( rule__ItemDescription__ItemDescriptionAssignment_1 )* )
            {
            // InternalRinform.g:1731:2: ( ( rule__ItemDescription__ItemDescriptionAssignment_1 ) )
            // InternalRinform.g:1732:3: ( rule__ItemDescription__ItemDescriptionAssignment_1 )
            {
             before(grammarAccess.getItemDescriptionAccess().getItemDescriptionAssignment_1()); 
            // InternalRinform.g:1733:3: ( rule__ItemDescription__ItemDescriptionAssignment_1 )
            // InternalRinform.g:1733:4: rule__ItemDescription__ItemDescriptionAssignment_1
            {
            pushFollow(FOLLOW_4);
            rule__ItemDescription__ItemDescriptionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getItemDescriptionAccess().getItemDescriptionAssignment_1()); 

            }

            // InternalRinform.g:1736:2: ( ( rule__ItemDescription__ItemDescriptionAssignment_1 )* )
            // InternalRinform.g:1737:3: ( rule__ItemDescription__ItemDescriptionAssignment_1 )*
            {
             before(grammarAccess.getItemDescriptionAccess().getItemDescriptionAssignment_1()); 
            // InternalRinform.g:1738:3: ( rule__ItemDescription__ItemDescriptionAssignment_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=RULE_ID && LA11_0<=RULE_WS)||(LA11_0>=11 && LA11_0<=21)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalRinform.g:1738:4: rule__ItemDescription__ItemDescriptionAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__ItemDescription__ItemDescriptionAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalRinform.g:1747:1: rule__ItemDescription__Group__2 : rule__ItemDescription__Group__2__Impl rule__ItemDescription__Group__3 ;
    public final void rule__ItemDescription__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1751:1: ( rule__ItemDescription__Group__2__Impl rule__ItemDescription__Group__3 )
            // InternalRinform.g:1752:2: rule__ItemDescription__Group__2__Impl rule__ItemDescription__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalRinform.g:1759:1: rule__ItemDescription__Group__2__Impl : ( '!i' ) ;
    public final void rule__ItemDescription__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1763:1: ( ( '!i' ) )
            // InternalRinform.g:1764:1: ( '!i' )
            {
            // InternalRinform.g:1764:1: ( '!i' )
            // InternalRinform.g:1765:2: '!i'
            {
             before(grammarAccess.getItemDescriptionAccess().getIKeyword_2()); 
            match(input,41,FOLLOW_2); 
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
    // InternalRinform.g:1774:1: rule__ItemDescription__Group__3 : rule__ItemDescription__Group__3__Impl rule__ItemDescription__Group__4 ;
    public final void rule__ItemDescription__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1778:1: ( rule__ItemDescription__Group__3__Impl rule__ItemDescription__Group__4 )
            // InternalRinform.g:1779:2: rule__ItemDescription__Group__3__Impl rule__ItemDescription__Group__4
            {
            pushFollow(FOLLOW_5);
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
    // InternalRinform.g:1786:1: rule__ItemDescription__Group__3__Impl : ( '[' ) ;
    public final void rule__ItemDescription__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1790:1: ( ( '[' ) )
            // InternalRinform.g:1791:1: ( '[' )
            {
            // InternalRinform.g:1791:1: ( '[' )
            // InternalRinform.g:1792:2: '['
            {
             before(grammarAccess.getItemDescriptionAccess().getLeftSquareBracketKeyword_3()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getItemDescriptionAccess().getLeftSquareBracketKeyword_3()); 

            }


            }

        }
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
    // InternalRinform.g:1801:1: rule__ItemDescription__Group__4 : rule__ItemDescription__Group__4__Impl rule__ItemDescription__Group__5 ;
    public final void rule__ItemDescription__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1805:1: ( rule__ItemDescription__Group__4__Impl rule__ItemDescription__Group__5 )
            // InternalRinform.g:1806:2: rule__ItemDescription__Group__4__Impl rule__ItemDescription__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__ItemDescription__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ItemDescription__Group__5();

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
    // InternalRinform.g:1813:1: rule__ItemDescription__Group__4__Impl : ( ( rule__ItemDescription__ItemAssignment_4 ) ) ;
    public final void rule__ItemDescription__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1817:1: ( ( ( rule__ItemDescription__ItemAssignment_4 ) ) )
            // InternalRinform.g:1818:1: ( ( rule__ItemDescription__ItemAssignment_4 ) )
            {
            // InternalRinform.g:1818:1: ( ( rule__ItemDescription__ItemAssignment_4 ) )
            // InternalRinform.g:1819:2: ( rule__ItemDescription__ItemAssignment_4 )
            {
             before(grammarAccess.getItemDescriptionAccess().getItemAssignment_4()); 
            // InternalRinform.g:1820:2: ( rule__ItemDescription__ItemAssignment_4 )
            // InternalRinform.g:1820:3: rule__ItemDescription__ItemAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ItemDescription__ItemAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getItemDescriptionAccess().getItemAssignment_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__ItemDescription__Group__5"
    // InternalRinform.g:1828:1: rule__ItemDescription__Group__5 : rule__ItemDescription__Group__5__Impl rule__ItemDescription__Group__6 ;
    public final void rule__ItemDescription__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1832:1: ( rule__ItemDescription__Group__5__Impl rule__ItemDescription__Group__6 )
            // InternalRinform.g:1833:2: rule__ItemDescription__Group__5__Impl rule__ItemDescription__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__ItemDescription__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ItemDescription__Group__6();

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
    // $ANTLR end "rule__ItemDescription__Group__5"


    // $ANTLR start "rule__ItemDescription__Group__5__Impl"
    // InternalRinform.g:1840:1: rule__ItemDescription__Group__5__Impl : ( ']' ) ;
    public final void rule__ItemDescription__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1844:1: ( ( ']' ) )
            // InternalRinform.g:1845:1: ( ']' )
            {
            // InternalRinform.g:1845:1: ( ']' )
            // InternalRinform.g:1846:2: ']'
            {
             before(grammarAccess.getItemDescriptionAccess().getRightSquareBracketKeyword_5()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getItemDescriptionAccess().getRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemDescription__Group__5__Impl"


    // $ANTLR start "rule__ItemDescription__Group__6"
    // InternalRinform.g:1855:1: rule__ItemDescription__Group__6 : rule__ItemDescription__Group__6__Impl ;
    public final void rule__ItemDescription__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1859:1: ( rule__ItemDescription__Group__6__Impl )
            // InternalRinform.g:1860:2: rule__ItemDescription__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ItemDescription__Group__6__Impl();

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
    // $ANTLR end "rule__ItemDescription__Group__6"


    // $ANTLR start "rule__ItemDescription__Group__6__Impl"
    // InternalRinform.g:1866:1: rule__ItemDescription__Group__6__Impl : ( '}' ) ;
    public final void rule__ItemDescription__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1870:1: ( ( '}' ) )
            // InternalRinform.g:1871:1: ( '}' )
            {
            // InternalRinform.g:1871:1: ( '}' )
            // InternalRinform.g:1872:2: '}'
            {
             before(grammarAccess.getItemDescriptionAccess().getRightCurlyBracketKeyword_6()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getItemDescriptionAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemDescription__Group__6__Impl"


    // $ANTLR start "rule__CharacterDeclaration__Group__0"
    // InternalRinform.g:1882:1: rule__CharacterDeclaration__Group__0 : rule__CharacterDeclaration__Group__0__Impl rule__CharacterDeclaration__Group__1 ;
    public final void rule__CharacterDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1886:1: ( rule__CharacterDeclaration__Group__0__Impl rule__CharacterDeclaration__Group__1 )
            // InternalRinform.g:1887:2: rule__CharacterDeclaration__Group__0__Impl rule__CharacterDeclaration__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__CharacterDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CharacterDeclaration__Group__1();

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
    // $ANTLR end "rule__CharacterDeclaration__Group__0"


    // $ANTLR start "rule__CharacterDeclaration__Group__0__Impl"
    // InternalRinform.g:1894:1: rule__CharacterDeclaration__Group__0__Impl : ( 'p-' ) ;
    public final void rule__CharacterDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1898:1: ( ( 'p-' ) )
            // InternalRinform.g:1899:1: ( 'p-' )
            {
            // InternalRinform.g:1899:1: ( 'p-' )
            // InternalRinform.g:1900:2: 'p-'
            {
             before(grammarAccess.getCharacterDeclarationAccess().getPKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getCharacterDeclarationAccess().getPKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacterDeclaration__Group__0__Impl"


    // $ANTLR start "rule__CharacterDeclaration__Group__1"
    // InternalRinform.g:1909:1: rule__CharacterDeclaration__Group__1 : rule__CharacterDeclaration__Group__1__Impl rule__CharacterDeclaration__Group__2 ;
    public final void rule__CharacterDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1913:1: ( rule__CharacterDeclaration__Group__1__Impl rule__CharacterDeclaration__Group__2 )
            // InternalRinform.g:1914:2: rule__CharacterDeclaration__Group__1__Impl rule__CharacterDeclaration__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__CharacterDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CharacterDeclaration__Group__2();

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
    // $ANTLR end "rule__CharacterDeclaration__Group__1"


    // $ANTLR start "rule__CharacterDeclaration__Group__1__Impl"
    // InternalRinform.g:1921:1: rule__CharacterDeclaration__Group__1__Impl : ( ( rule__CharacterDeclaration__NameAssignment_1 ) ) ;
    public final void rule__CharacterDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1925:1: ( ( ( rule__CharacterDeclaration__NameAssignment_1 ) ) )
            // InternalRinform.g:1926:1: ( ( rule__CharacterDeclaration__NameAssignment_1 ) )
            {
            // InternalRinform.g:1926:1: ( ( rule__CharacterDeclaration__NameAssignment_1 ) )
            // InternalRinform.g:1927:2: ( rule__CharacterDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getCharacterDeclarationAccess().getNameAssignment_1()); 
            // InternalRinform.g:1928:2: ( rule__CharacterDeclaration__NameAssignment_1 )
            // InternalRinform.g:1928:3: rule__CharacterDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CharacterDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCharacterDeclarationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacterDeclaration__Group__1__Impl"


    // $ANTLR start "rule__CharacterDeclaration__Group__2"
    // InternalRinform.g:1936:1: rule__CharacterDeclaration__Group__2 : rule__CharacterDeclaration__Group__2__Impl rule__CharacterDeclaration__Group__3 ;
    public final void rule__CharacterDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1940:1: ( rule__CharacterDeclaration__Group__2__Impl rule__CharacterDeclaration__Group__3 )
            // InternalRinform.g:1941:2: rule__CharacterDeclaration__Group__2__Impl rule__CharacterDeclaration__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__CharacterDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CharacterDeclaration__Group__3();

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
    // $ANTLR end "rule__CharacterDeclaration__Group__2"


    // $ANTLR start "rule__CharacterDeclaration__Group__2__Impl"
    // InternalRinform.g:1948:1: rule__CharacterDeclaration__Group__2__Impl : ( '-p' ) ;
    public final void rule__CharacterDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1952:1: ( ( '-p' ) )
            // InternalRinform.g:1953:1: ( '-p' )
            {
            // InternalRinform.g:1953:1: ( '-p' )
            // InternalRinform.g:1954:2: '-p'
            {
             before(grammarAccess.getCharacterDeclarationAccess().getPKeyword_2()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getCharacterDeclarationAccess().getPKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacterDeclaration__Group__2__Impl"


    // $ANTLR start "rule__CharacterDeclaration__Group__3"
    // InternalRinform.g:1963:1: rule__CharacterDeclaration__Group__3 : rule__CharacterDeclaration__Group__3__Impl rule__CharacterDeclaration__Group__4 ;
    public final void rule__CharacterDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1967:1: ( rule__CharacterDeclaration__Group__3__Impl rule__CharacterDeclaration__Group__4 )
            // InternalRinform.g:1968:2: rule__CharacterDeclaration__Group__3__Impl rule__CharacterDeclaration__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__CharacterDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CharacterDeclaration__Group__4();

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
    // $ANTLR end "rule__CharacterDeclaration__Group__3"


    // $ANTLR start "rule__CharacterDeclaration__Group__3__Impl"
    // InternalRinform.g:1975:1: rule__CharacterDeclaration__Group__3__Impl : ( '!r' ) ;
    public final void rule__CharacterDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1979:1: ( ( '!r' ) )
            // InternalRinform.g:1980:1: ( '!r' )
            {
            // InternalRinform.g:1980:1: ( '!r' )
            // InternalRinform.g:1981:2: '!r'
            {
             before(grammarAccess.getCharacterDeclarationAccess().getRKeyword_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getCharacterDeclarationAccess().getRKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacterDeclaration__Group__3__Impl"


    // $ANTLR start "rule__CharacterDeclaration__Group__4"
    // InternalRinform.g:1990:1: rule__CharacterDeclaration__Group__4 : rule__CharacterDeclaration__Group__4__Impl rule__CharacterDeclaration__Group__5 ;
    public final void rule__CharacterDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1994:1: ( rule__CharacterDeclaration__Group__4__Impl rule__CharacterDeclaration__Group__5 )
            // InternalRinform.g:1995:2: rule__CharacterDeclaration__Group__4__Impl rule__CharacterDeclaration__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__CharacterDeclaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CharacterDeclaration__Group__5();

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
    // $ANTLR end "rule__CharacterDeclaration__Group__4"


    // $ANTLR start "rule__CharacterDeclaration__Group__4__Impl"
    // InternalRinform.g:2002:1: rule__CharacterDeclaration__Group__4__Impl : ( '[' ) ;
    public final void rule__CharacterDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2006:1: ( ( '[' ) )
            // InternalRinform.g:2007:1: ( '[' )
            {
            // InternalRinform.g:2007:1: ( '[' )
            // InternalRinform.g:2008:2: '['
            {
             before(grammarAccess.getCharacterDeclarationAccess().getLeftSquareBracketKeyword_4()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getCharacterDeclarationAccess().getLeftSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacterDeclaration__Group__4__Impl"


    // $ANTLR start "rule__CharacterDeclaration__Group__5"
    // InternalRinform.g:2017:1: rule__CharacterDeclaration__Group__5 : rule__CharacterDeclaration__Group__5__Impl rule__CharacterDeclaration__Group__6 ;
    public final void rule__CharacterDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2021:1: ( rule__CharacterDeclaration__Group__5__Impl rule__CharacterDeclaration__Group__6 )
            // InternalRinform.g:2022:2: rule__CharacterDeclaration__Group__5__Impl rule__CharacterDeclaration__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__CharacterDeclaration__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CharacterDeclaration__Group__6();

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
    // $ANTLR end "rule__CharacterDeclaration__Group__5"


    // $ANTLR start "rule__CharacterDeclaration__Group__5__Impl"
    // InternalRinform.g:2029:1: rule__CharacterDeclaration__Group__5__Impl : ( ( rule__CharacterDeclaration__RoomAssignment_5 ) ) ;
    public final void rule__CharacterDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2033:1: ( ( ( rule__CharacterDeclaration__RoomAssignment_5 ) ) )
            // InternalRinform.g:2034:1: ( ( rule__CharacterDeclaration__RoomAssignment_5 ) )
            {
            // InternalRinform.g:2034:1: ( ( rule__CharacterDeclaration__RoomAssignment_5 ) )
            // InternalRinform.g:2035:2: ( rule__CharacterDeclaration__RoomAssignment_5 )
            {
             before(grammarAccess.getCharacterDeclarationAccess().getRoomAssignment_5()); 
            // InternalRinform.g:2036:2: ( rule__CharacterDeclaration__RoomAssignment_5 )
            // InternalRinform.g:2036:3: rule__CharacterDeclaration__RoomAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__CharacterDeclaration__RoomAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getCharacterDeclarationAccess().getRoomAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacterDeclaration__Group__5__Impl"


    // $ANTLR start "rule__CharacterDeclaration__Group__6"
    // InternalRinform.g:2044:1: rule__CharacterDeclaration__Group__6 : rule__CharacterDeclaration__Group__6__Impl ;
    public final void rule__CharacterDeclaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2048:1: ( rule__CharacterDeclaration__Group__6__Impl )
            // InternalRinform.g:2049:2: rule__CharacterDeclaration__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CharacterDeclaration__Group__6__Impl();

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
    // $ANTLR end "rule__CharacterDeclaration__Group__6"


    // $ANTLR start "rule__CharacterDeclaration__Group__6__Impl"
    // InternalRinform.g:2055:1: rule__CharacterDeclaration__Group__6__Impl : ( ']' ) ;
    public final void rule__CharacterDeclaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2059:1: ( ( ']' ) )
            // InternalRinform.g:2060:1: ( ']' )
            {
            // InternalRinform.g:2060:1: ( ']' )
            // InternalRinform.g:2061:2: ']'
            {
             before(grammarAccess.getCharacterDeclarationAccess().getRightSquareBracketKeyword_6()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getCharacterDeclarationAccess().getRightSquareBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacterDeclaration__Group__6__Impl"


    // $ANTLR start "rule__CharacterDescription__Group__0"
    // InternalRinform.g:2071:1: rule__CharacterDescription__Group__0 : rule__CharacterDescription__Group__0__Impl rule__CharacterDescription__Group__1 ;
    public final void rule__CharacterDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2075:1: ( rule__CharacterDescription__Group__0__Impl rule__CharacterDescription__Group__1 )
            // InternalRinform.g:2076:2: rule__CharacterDescription__Group__0__Impl rule__CharacterDescription__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__CharacterDescription__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CharacterDescription__Group__1();

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
    // $ANTLR end "rule__CharacterDescription__Group__0"


    // $ANTLR start "rule__CharacterDescription__Group__0__Impl"
    // InternalRinform.g:2083:1: rule__CharacterDescription__Group__0__Impl : ( '{' ) ;
    public final void rule__CharacterDescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2087:1: ( ( '{' ) )
            // InternalRinform.g:2088:1: ( '{' )
            {
            // InternalRinform.g:2088:1: ( '{' )
            // InternalRinform.g:2089:2: '{'
            {
             before(grammarAccess.getCharacterDescriptionAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getCharacterDescriptionAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacterDescription__Group__0__Impl"


    // $ANTLR start "rule__CharacterDescription__Group__1"
    // InternalRinform.g:2098:1: rule__CharacterDescription__Group__1 : rule__CharacterDescription__Group__1__Impl rule__CharacterDescription__Group__2 ;
    public final void rule__CharacterDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2102:1: ( rule__CharacterDescription__Group__1__Impl rule__CharacterDescription__Group__2 )
            // InternalRinform.g:2103:2: rule__CharacterDescription__Group__1__Impl rule__CharacterDescription__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__CharacterDescription__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CharacterDescription__Group__2();

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
    // $ANTLR end "rule__CharacterDescription__Group__1"


    // $ANTLR start "rule__CharacterDescription__Group__1__Impl"
    // InternalRinform.g:2110:1: rule__CharacterDescription__Group__1__Impl : ( ( ( rule__CharacterDescription__PersonDescriptionAssignment_1 ) ) ( ( rule__CharacterDescription__PersonDescriptionAssignment_1 )* ) ) ;
    public final void rule__CharacterDescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2114:1: ( ( ( ( rule__CharacterDescription__PersonDescriptionAssignment_1 ) ) ( ( rule__CharacterDescription__PersonDescriptionAssignment_1 )* ) ) )
            // InternalRinform.g:2115:1: ( ( ( rule__CharacterDescription__PersonDescriptionAssignment_1 ) ) ( ( rule__CharacterDescription__PersonDescriptionAssignment_1 )* ) )
            {
            // InternalRinform.g:2115:1: ( ( ( rule__CharacterDescription__PersonDescriptionAssignment_1 ) ) ( ( rule__CharacterDescription__PersonDescriptionAssignment_1 )* ) )
            // InternalRinform.g:2116:2: ( ( rule__CharacterDescription__PersonDescriptionAssignment_1 ) ) ( ( rule__CharacterDescription__PersonDescriptionAssignment_1 )* )
            {
            // InternalRinform.g:2116:2: ( ( rule__CharacterDescription__PersonDescriptionAssignment_1 ) )
            // InternalRinform.g:2117:3: ( rule__CharacterDescription__PersonDescriptionAssignment_1 )
            {
             before(grammarAccess.getCharacterDescriptionAccess().getPersonDescriptionAssignment_1()); 
            // InternalRinform.g:2118:3: ( rule__CharacterDescription__PersonDescriptionAssignment_1 )
            // InternalRinform.g:2118:4: rule__CharacterDescription__PersonDescriptionAssignment_1
            {
            pushFollow(FOLLOW_4);
            rule__CharacterDescription__PersonDescriptionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCharacterDescriptionAccess().getPersonDescriptionAssignment_1()); 

            }

            // InternalRinform.g:2121:2: ( ( rule__CharacterDescription__PersonDescriptionAssignment_1 )* )
            // InternalRinform.g:2122:3: ( rule__CharacterDescription__PersonDescriptionAssignment_1 )*
            {
             before(grammarAccess.getCharacterDescriptionAccess().getPersonDescriptionAssignment_1()); 
            // InternalRinform.g:2123:3: ( rule__CharacterDescription__PersonDescriptionAssignment_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_ID && LA12_0<=RULE_WS)||(LA12_0>=11 && LA12_0<=21)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalRinform.g:2123:4: rule__CharacterDescription__PersonDescriptionAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__CharacterDescription__PersonDescriptionAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getCharacterDescriptionAccess().getPersonDescriptionAssignment_1()); 

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
    // $ANTLR end "rule__CharacterDescription__Group__1__Impl"


    // $ANTLR start "rule__CharacterDescription__Group__2"
    // InternalRinform.g:2132:1: rule__CharacterDescription__Group__2 : rule__CharacterDescription__Group__2__Impl rule__CharacterDescription__Group__3 ;
    public final void rule__CharacterDescription__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2136:1: ( rule__CharacterDescription__Group__2__Impl rule__CharacterDescription__Group__3 )
            // InternalRinform.g:2137:2: rule__CharacterDescription__Group__2__Impl rule__CharacterDescription__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__CharacterDescription__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CharacterDescription__Group__3();

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
    // $ANTLR end "rule__CharacterDescription__Group__2"


    // $ANTLR start "rule__CharacterDescription__Group__2__Impl"
    // InternalRinform.g:2144:1: rule__CharacterDescription__Group__2__Impl : ( '!p' ) ;
    public final void rule__CharacterDescription__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2148:1: ( ( '!p' ) )
            // InternalRinform.g:2149:1: ( '!p' )
            {
            // InternalRinform.g:2149:1: ( '!p' )
            // InternalRinform.g:2150:2: '!p'
            {
             before(grammarAccess.getCharacterDescriptionAccess().getPKeyword_2()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getCharacterDescriptionAccess().getPKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacterDescription__Group__2__Impl"


    // $ANTLR start "rule__CharacterDescription__Group__3"
    // InternalRinform.g:2159:1: rule__CharacterDescription__Group__3 : rule__CharacterDescription__Group__3__Impl rule__CharacterDescription__Group__4 ;
    public final void rule__CharacterDescription__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2163:1: ( rule__CharacterDescription__Group__3__Impl rule__CharacterDescription__Group__4 )
            // InternalRinform.g:2164:2: rule__CharacterDescription__Group__3__Impl rule__CharacterDescription__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__CharacterDescription__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CharacterDescription__Group__4();

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
    // $ANTLR end "rule__CharacterDescription__Group__3"


    // $ANTLR start "rule__CharacterDescription__Group__3__Impl"
    // InternalRinform.g:2171:1: rule__CharacterDescription__Group__3__Impl : ( '[' ) ;
    public final void rule__CharacterDescription__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2175:1: ( ( '[' ) )
            // InternalRinform.g:2176:1: ( '[' )
            {
            // InternalRinform.g:2176:1: ( '[' )
            // InternalRinform.g:2177:2: '['
            {
             before(grammarAccess.getCharacterDescriptionAccess().getLeftSquareBracketKeyword_3()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getCharacterDescriptionAccess().getLeftSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacterDescription__Group__3__Impl"


    // $ANTLR start "rule__CharacterDescription__Group__4"
    // InternalRinform.g:2186:1: rule__CharacterDescription__Group__4 : rule__CharacterDescription__Group__4__Impl rule__CharacterDescription__Group__5 ;
    public final void rule__CharacterDescription__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2190:1: ( rule__CharacterDescription__Group__4__Impl rule__CharacterDescription__Group__5 )
            // InternalRinform.g:2191:2: rule__CharacterDescription__Group__4__Impl rule__CharacterDescription__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__CharacterDescription__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CharacterDescription__Group__5();

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
    // $ANTLR end "rule__CharacterDescription__Group__4"


    // $ANTLR start "rule__CharacterDescription__Group__4__Impl"
    // InternalRinform.g:2198:1: rule__CharacterDescription__Group__4__Impl : ( ( rule__CharacterDescription__PersonAssignment_4 ) ) ;
    public final void rule__CharacterDescription__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2202:1: ( ( ( rule__CharacterDescription__PersonAssignment_4 ) ) )
            // InternalRinform.g:2203:1: ( ( rule__CharacterDescription__PersonAssignment_4 ) )
            {
            // InternalRinform.g:2203:1: ( ( rule__CharacterDescription__PersonAssignment_4 ) )
            // InternalRinform.g:2204:2: ( rule__CharacterDescription__PersonAssignment_4 )
            {
             before(grammarAccess.getCharacterDescriptionAccess().getPersonAssignment_4()); 
            // InternalRinform.g:2205:2: ( rule__CharacterDescription__PersonAssignment_4 )
            // InternalRinform.g:2205:3: rule__CharacterDescription__PersonAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__CharacterDescription__PersonAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCharacterDescriptionAccess().getPersonAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacterDescription__Group__4__Impl"


    // $ANTLR start "rule__CharacterDescription__Group__5"
    // InternalRinform.g:2213:1: rule__CharacterDescription__Group__5 : rule__CharacterDescription__Group__5__Impl rule__CharacterDescription__Group__6 ;
    public final void rule__CharacterDescription__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2217:1: ( rule__CharacterDescription__Group__5__Impl rule__CharacterDescription__Group__6 )
            // InternalRinform.g:2218:2: rule__CharacterDescription__Group__5__Impl rule__CharacterDescription__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__CharacterDescription__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CharacterDescription__Group__6();

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
    // $ANTLR end "rule__CharacterDescription__Group__5"


    // $ANTLR start "rule__CharacterDescription__Group__5__Impl"
    // InternalRinform.g:2225:1: rule__CharacterDescription__Group__5__Impl : ( ']' ) ;
    public final void rule__CharacterDescription__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2229:1: ( ( ']' ) )
            // InternalRinform.g:2230:1: ( ']' )
            {
            // InternalRinform.g:2230:1: ( ']' )
            // InternalRinform.g:2231:2: ']'
            {
             before(grammarAccess.getCharacterDescriptionAccess().getRightSquareBracketKeyword_5()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getCharacterDescriptionAccess().getRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacterDescription__Group__5__Impl"


    // $ANTLR start "rule__CharacterDescription__Group__6"
    // InternalRinform.g:2240:1: rule__CharacterDescription__Group__6 : rule__CharacterDescription__Group__6__Impl ;
    public final void rule__CharacterDescription__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2244:1: ( rule__CharacterDescription__Group__6__Impl )
            // InternalRinform.g:2245:2: rule__CharacterDescription__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CharacterDescription__Group__6__Impl();

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
    // $ANTLR end "rule__CharacterDescription__Group__6"


    // $ANTLR start "rule__CharacterDescription__Group__6__Impl"
    // InternalRinform.g:2251:1: rule__CharacterDescription__Group__6__Impl : ( '}' ) ;
    public final void rule__CharacterDescription__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2255:1: ( ( '}' ) )
            // InternalRinform.g:2256:1: ( '}' )
            {
            // InternalRinform.g:2256:1: ( '}' )
            // InternalRinform.g:2257:2: '}'
            {
             before(grammarAccess.getCharacterDescriptionAccess().getRightCurlyBracketKeyword_6()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getCharacterDescriptionAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacterDescription__Group__6__Impl"


    // $ANTLR start "rule__DirectionStatement__Group__0"
    // InternalRinform.g:2267:1: rule__DirectionStatement__Group__0 : rule__DirectionStatement__Group__0__Impl rule__DirectionStatement__Group__1 ;
    public final void rule__DirectionStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2271:1: ( rule__DirectionStatement__Group__0__Impl rule__DirectionStatement__Group__1 )
            // InternalRinform.g:2272:2: rule__DirectionStatement__Group__0__Impl rule__DirectionStatement__Group__1
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
    // InternalRinform.g:2279:1: rule__DirectionStatement__Group__0__Impl : ( '<' ) ;
    public final void rule__DirectionStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2283:1: ( ( '<' ) )
            // InternalRinform.g:2284:1: ( '<' )
            {
            // InternalRinform.g:2284:1: ( '<' )
            // InternalRinform.g:2285:2: '<'
            {
             before(grammarAccess.getDirectionStatementAccess().getLessThanSignKeyword_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalRinform.g:2294:1: rule__DirectionStatement__Group__1 : rule__DirectionStatement__Group__1__Impl rule__DirectionStatement__Group__2 ;
    public final void rule__DirectionStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2298:1: ( rule__DirectionStatement__Group__1__Impl rule__DirectionStatement__Group__2 )
            // InternalRinform.g:2299:2: rule__DirectionStatement__Group__1__Impl rule__DirectionStatement__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalRinform.g:2306:1: rule__DirectionStatement__Group__1__Impl : ( ( rule__DirectionStatement__Room1Assignment_1 ) ) ;
    public final void rule__DirectionStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2310:1: ( ( ( rule__DirectionStatement__Room1Assignment_1 ) ) )
            // InternalRinform.g:2311:1: ( ( rule__DirectionStatement__Room1Assignment_1 ) )
            {
            // InternalRinform.g:2311:1: ( ( rule__DirectionStatement__Room1Assignment_1 ) )
            // InternalRinform.g:2312:2: ( rule__DirectionStatement__Room1Assignment_1 )
            {
             before(grammarAccess.getDirectionStatementAccess().getRoom1Assignment_1()); 
            // InternalRinform.g:2313:2: ( rule__DirectionStatement__Room1Assignment_1 )
            // InternalRinform.g:2313:3: rule__DirectionStatement__Room1Assignment_1
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
    // InternalRinform.g:2321:1: rule__DirectionStatement__Group__2 : rule__DirectionStatement__Group__2__Impl rule__DirectionStatement__Group__3 ;
    public final void rule__DirectionStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2325:1: ( rule__DirectionStatement__Group__2__Impl rule__DirectionStatement__Group__3 )
            // InternalRinform.g:2326:2: rule__DirectionStatement__Group__2__Impl rule__DirectionStatement__Group__3
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
    // InternalRinform.g:2333:1: rule__DirectionStatement__Group__2__Impl : ( ( rule__DirectionStatement__DirectionAssignment_2 ) ) ;
    public final void rule__DirectionStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2337:1: ( ( ( rule__DirectionStatement__DirectionAssignment_2 ) ) )
            // InternalRinform.g:2338:1: ( ( rule__DirectionStatement__DirectionAssignment_2 ) )
            {
            // InternalRinform.g:2338:1: ( ( rule__DirectionStatement__DirectionAssignment_2 ) )
            // InternalRinform.g:2339:2: ( rule__DirectionStatement__DirectionAssignment_2 )
            {
             before(grammarAccess.getDirectionStatementAccess().getDirectionAssignment_2()); 
            // InternalRinform.g:2340:2: ( rule__DirectionStatement__DirectionAssignment_2 )
            // InternalRinform.g:2340:3: rule__DirectionStatement__DirectionAssignment_2
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
    // InternalRinform.g:2348:1: rule__DirectionStatement__Group__3 : rule__DirectionStatement__Group__3__Impl rule__DirectionStatement__Group__4 ;
    public final void rule__DirectionStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2352:1: ( rule__DirectionStatement__Group__3__Impl rule__DirectionStatement__Group__4 )
            // InternalRinform.g:2353:2: rule__DirectionStatement__Group__3__Impl rule__DirectionStatement__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalRinform.g:2360:1: rule__DirectionStatement__Group__3__Impl : ( ( rule__DirectionStatement__Room2Assignment_3 ) ) ;
    public final void rule__DirectionStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2364:1: ( ( ( rule__DirectionStatement__Room2Assignment_3 ) ) )
            // InternalRinform.g:2365:1: ( ( rule__DirectionStatement__Room2Assignment_3 ) )
            {
            // InternalRinform.g:2365:1: ( ( rule__DirectionStatement__Room2Assignment_3 ) )
            // InternalRinform.g:2366:2: ( rule__DirectionStatement__Room2Assignment_3 )
            {
             before(grammarAccess.getDirectionStatementAccess().getRoom2Assignment_3()); 
            // InternalRinform.g:2367:2: ( rule__DirectionStatement__Room2Assignment_3 )
            // InternalRinform.g:2367:3: rule__DirectionStatement__Room2Assignment_3
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
    // InternalRinform.g:2375:1: rule__DirectionStatement__Group__4 : rule__DirectionStatement__Group__4__Impl ;
    public final void rule__DirectionStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2379:1: ( rule__DirectionStatement__Group__4__Impl )
            // InternalRinform.g:2380:2: rule__DirectionStatement__Group__4__Impl
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
    // InternalRinform.g:2386:1: rule__DirectionStatement__Group__4__Impl : ( '>' ) ;
    public final void rule__DirectionStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2390:1: ( ( '>' ) )
            // InternalRinform.g:2391:1: ( '>' )
            {
            // InternalRinform.g:2391:1: ( '>' )
            // InternalRinform.g:2392:2: '>'
            {
             before(grammarAccess.getDirectionStatementAccess().getGreaterThanSignKeyword_4()); 
            match(input,46,FOLLOW_2); 
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


    // $ANTLR start "rule__ReverseInformProgram__SentencesAssignment"
    // InternalRinform.g:2402:1: rule__ReverseInformProgram__SentencesAssignment : ( ruleSentencePart ) ;
    public final void rule__ReverseInformProgram__SentencesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2406:1: ( ( ruleSentencePart ) )
            // InternalRinform.g:2407:2: ( ruleSentencePart )
            {
            // InternalRinform.g:2407:2: ( ruleSentencePart )
            // InternalRinform.g:2408:3: ruleSentencePart
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
    // InternalRinform.g:2417:1: rule__RoomDeclaration__NameAssignment_1 : ( ruleText ) ;
    public final void rule__RoomDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2421:1: ( ( ruleText ) )
            // InternalRinform.g:2422:2: ( ruleText )
            {
            // InternalRinform.g:2422:2: ( ruleText )
            // InternalRinform.g:2423:3: ruleText
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
    // InternalRinform.g:2432:1: rule__RoomAlias__RoomAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__RoomAlias__RoomAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2436:1: ( ( ( RULE_ID ) ) )
            // InternalRinform.g:2437:2: ( ( RULE_ID ) )
            {
            // InternalRinform.g:2437:2: ( ( RULE_ID ) )
            // InternalRinform.g:2438:3: ( RULE_ID )
            {
             before(grammarAccess.getRoomAliasAccess().getRoomRoomDeclarationCrossReference_1_0()); 
            // InternalRinform.g:2439:3: ( RULE_ID )
            // InternalRinform.g:2440:4: RULE_ID
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
    // InternalRinform.g:2451:1: rule__RoomAlias__AliasesAssignment_3 : ( ruleText ) ;
    public final void rule__RoomAlias__AliasesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2455:1: ( ( ruleText ) )
            // InternalRinform.g:2456:2: ( ruleText )
            {
            // InternalRinform.g:2456:2: ( ruleText )
            // InternalRinform.g:2457:3: ruleText
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
    // InternalRinform.g:2466:1: rule__RoomDescription__RoomDescriptionAssignment_1 : ( ruleText ) ;
    public final void rule__RoomDescription__RoomDescriptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2470:1: ( ( ruleText ) )
            // InternalRinform.g:2471:2: ( ruleText )
            {
            // InternalRinform.g:2471:2: ( ruleText )
            // InternalRinform.g:2472:3: ruleText
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


    // $ANTLR start "rule__RoomDescription__RoomAssignment_4"
    // InternalRinform.g:2481:1: rule__RoomDescription__RoomAssignment_4 : ( ( ruleText ) ) ;
    public final void rule__RoomDescription__RoomAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2485:1: ( ( ( ruleText ) ) )
            // InternalRinform.g:2486:2: ( ( ruleText ) )
            {
            // InternalRinform.g:2486:2: ( ( ruleText ) )
            // InternalRinform.g:2487:3: ( ruleText )
            {
             before(grammarAccess.getRoomDescriptionAccess().getRoomRoomDeclarationCrossReference_4_0()); 
            // InternalRinform.g:2488:3: ( ruleText )
            // InternalRinform.g:2489:4: ruleText
            {
             before(grammarAccess.getRoomDescriptionAccess().getRoomRoomDeclarationTextParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getRoomDescriptionAccess().getRoomRoomDeclarationTextParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getRoomDescriptionAccess().getRoomRoomDeclarationCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoomDescription__RoomAssignment_4"


    // $ANTLR start "rule__ContainerDeclaration__NameAssignment_1"
    // InternalRinform.g:2500:1: rule__ContainerDeclaration__NameAssignment_1 : ( ruleText ) ;
    public final void rule__ContainerDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2504:1: ( ( ruleText ) )
            // InternalRinform.g:2505:2: ( ruleText )
            {
            // InternalRinform.g:2505:2: ( ruleText )
            // InternalRinform.g:2506:3: ruleText
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


    // $ANTLR start "rule__ContainerDeclaration__RoomAssignment_5"
    // InternalRinform.g:2515:1: rule__ContainerDeclaration__RoomAssignment_5 : ( ( ruleText ) ) ;
    public final void rule__ContainerDeclaration__RoomAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2519:1: ( ( ( ruleText ) ) )
            // InternalRinform.g:2520:2: ( ( ruleText ) )
            {
            // InternalRinform.g:2520:2: ( ( ruleText ) )
            // InternalRinform.g:2521:3: ( ruleText )
            {
             before(grammarAccess.getContainerDeclarationAccess().getRoomRoomDeclarationCrossReference_5_0()); 
            // InternalRinform.g:2522:3: ( ruleText )
            // InternalRinform.g:2523:4: ruleText
            {
             before(grammarAccess.getContainerDeclarationAccess().getRoomRoomDeclarationTextParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getContainerDeclarationAccess().getRoomRoomDeclarationTextParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getContainerDeclarationAccess().getRoomRoomDeclarationCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContainerDeclaration__RoomAssignment_5"


    // $ANTLR start "rule__ItemInRoomDeclaration__NameAssignment_1"
    // InternalRinform.g:2534:1: rule__ItemInRoomDeclaration__NameAssignment_1 : ( ruleText ) ;
    public final void rule__ItemInRoomDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2538:1: ( ( ruleText ) )
            // InternalRinform.g:2539:2: ( ruleText )
            {
            // InternalRinform.g:2539:2: ( ruleText )
            // InternalRinform.g:2540:3: ruleText
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


    // $ANTLR start "rule__ItemInRoomDeclaration__RoomAssignment_5"
    // InternalRinform.g:2549:1: rule__ItemInRoomDeclaration__RoomAssignment_5 : ( ( ruleText ) ) ;
    public final void rule__ItemInRoomDeclaration__RoomAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2553:1: ( ( ( ruleText ) ) )
            // InternalRinform.g:2554:2: ( ( ruleText ) )
            {
            // InternalRinform.g:2554:2: ( ( ruleText ) )
            // InternalRinform.g:2555:3: ( ruleText )
            {
             before(grammarAccess.getItemInRoomDeclarationAccess().getRoomRoomDeclarationCrossReference_5_0()); 
            // InternalRinform.g:2556:3: ( ruleText )
            // InternalRinform.g:2557:4: ruleText
            {
             before(grammarAccess.getItemInRoomDeclarationAccess().getRoomRoomDeclarationTextParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getItemInRoomDeclarationAccess().getRoomRoomDeclarationTextParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getItemInRoomDeclarationAccess().getRoomRoomDeclarationCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemInRoomDeclaration__RoomAssignment_5"


    // $ANTLR start "rule__ItemInContainerDeclaration__NameAssignment_1"
    // InternalRinform.g:2568:1: rule__ItemInContainerDeclaration__NameAssignment_1 : ( ruleText ) ;
    public final void rule__ItemInContainerDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2572:1: ( ( ruleText ) )
            // InternalRinform.g:2573:2: ( ruleText )
            {
            // InternalRinform.g:2573:2: ( ruleText )
            // InternalRinform.g:2574:3: ruleText
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


    // $ANTLR start "rule__ItemInContainerDeclaration__ContainerAssignment_5"
    // InternalRinform.g:2583:1: rule__ItemInContainerDeclaration__ContainerAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__ItemInContainerDeclaration__ContainerAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2587:1: ( ( ( RULE_ID ) ) )
            // InternalRinform.g:2588:2: ( ( RULE_ID ) )
            {
            // InternalRinform.g:2588:2: ( ( RULE_ID ) )
            // InternalRinform.g:2589:3: ( RULE_ID )
            {
             before(grammarAccess.getItemInContainerDeclarationAccess().getContainerContainerDeclarationCrossReference_5_0()); 
            // InternalRinform.g:2590:3: ( RULE_ID )
            // InternalRinform.g:2591:4: RULE_ID
            {
             before(grammarAccess.getItemInContainerDeclarationAccess().getContainerContainerDeclarationIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getItemInContainerDeclarationAccess().getContainerContainerDeclarationIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getItemInContainerDeclarationAccess().getContainerContainerDeclarationCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemInContainerDeclaration__ContainerAssignment_5"


    // $ANTLR start "rule__ItemDescription__ItemDescriptionAssignment_1"
    // InternalRinform.g:2602:1: rule__ItemDescription__ItemDescriptionAssignment_1 : ( ruleText ) ;
    public final void rule__ItemDescription__ItemDescriptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2606:1: ( ( ruleText ) )
            // InternalRinform.g:2607:2: ( ruleText )
            {
            // InternalRinform.g:2607:2: ( ruleText )
            // InternalRinform.g:2608:3: ruleText
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


    // $ANTLR start "rule__ItemDescription__ItemAssignment_4"
    // InternalRinform.g:2617:1: rule__ItemDescription__ItemAssignment_4 : ( ( ruleText ) ) ;
    public final void rule__ItemDescription__ItemAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2621:1: ( ( ( ruleText ) ) )
            // InternalRinform.g:2622:2: ( ( ruleText ) )
            {
            // InternalRinform.g:2622:2: ( ( ruleText ) )
            // InternalRinform.g:2623:3: ( ruleText )
            {
             before(grammarAccess.getItemDescriptionAccess().getItemItemDeclarationCrossReference_4_0()); 
            // InternalRinform.g:2624:3: ( ruleText )
            // InternalRinform.g:2625:4: ruleText
            {
             before(grammarAccess.getItemDescriptionAccess().getItemItemDeclarationTextParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getItemDescriptionAccess().getItemItemDeclarationTextParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getItemDescriptionAccess().getItemItemDeclarationCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemDescription__ItemAssignment_4"


    // $ANTLR start "rule__CharacterDeclaration__NameAssignment_1"
    // InternalRinform.g:2636:1: rule__CharacterDeclaration__NameAssignment_1 : ( ruleText ) ;
    public final void rule__CharacterDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2640:1: ( ( ruleText ) )
            // InternalRinform.g:2641:2: ( ruleText )
            {
            // InternalRinform.g:2641:2: ( ruleText )
            // InternalRinform.g:2642:3: ruleText
            {
             before(grammarAccess.getCharacterDeclarationAccess().getNameTextParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getCharacterDeclarationAccess().getNameTextParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacterDeclaration__NameAssignment_1"


    // $ANTLR start "rule__CharacterDeclaration__RoomAssignment_5"
    // InternalRinform.g:2651:1: rule__CharacterDeclaration__RoomAssignment_5 : ( ( ruleText ) ) ;
    public final void rule__CharacterDeclaration__RoomAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2655:1: ( ( ( ruleText ) ) )
            // InternalRinform.g:2656:2: ( ( ruleText ) )
            {
            // InternalRinform.g:2656:2: ( ( ruleText ) )
            // InternalRinform.g:2657:3: ( ruleText )
            {
             before(grammarAccess.getCharacterDeclarationAccess().getRoomRoomDeclarationCrossReference_5_0()); 
            // InternalRinform.g:2658:3: ( ruleText )
            // InternalRinform.g:2659:4: ruleText
            {
             before(grammarAccess.getCharacterDeclarationAccess().getRoomRoomDeclarationTextParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getCharacterDeclarationAccess().getRoomRoomDeclarationTextParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getCharacterDeclarationAccess().getRoomRoomDeclarationCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacterDeclaration__RoomAssignment_5"


    // $ANTLR start "rule__CharacterDescription__PersonDescriptionAssignment_1"
    // InternalRinform.g:2670:1: rule__CharacterDescription__PersonDescriptionAssignment_1 : ( ruleText ) ;
    public final void rule__CharacterDescription__PersonDescriptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2674:1: ( ( ruleText ) )
            // InternalRinform.g:2675:2: ( ruleText )
            {
            // InternalRinform.g:2675:2: ( ruleText )
            // InternalRinform.g:2676:3: ruleText
            {
             before(grammarAccess.getCharacterDescriptionAccess().getPersonDescriptionTextParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getCharacterDescriptionAccess().getPersonDescriptionTextParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacterDescription__PersonDescriptionAssignment_1"


    // $ANTLR start "rule__CharacterDescription__PersonAssignment_4"
    // InternalRinform.g:2685:1: rule__CharacterDescription__PersonAssignment_4 : ( ( ruleText ) ) ;
    public final void rule__CharacterDescription__PersonAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2689:1: ( ( ( ruleText ) ) )
            // InternalRinform.g:2690:2: ( ( ruleText ) )
            {
            // InternalRinform.g:2690:2: ( ( ruleText ) )
            // InternalRinform.g:2691:3: ( ruleText )
            {
             before(grammarAccess.getCharacterDescriptionAccess().getPersonCharacterDeclarationCrossReference_4_0()); 
            // InternalRinform.g:2692:3: ( ruleText )
            // InternalRinform.g:2693:4: ruleText
            {
             before(grammarAccess.getCharacterDescriptionAccess().getPersonCharacterDeclarationTextParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getCharacterDescriptionAccess().getPersonCharacterDeclarationTextParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getCharacterDescriptionAccess().getPersonCharacterDeclarationCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacterDescription__PersonAssignment_4"


    // $ANTLR start "rule__DirectionStatement__Room1Assignment_1"
    // InternalRinform.g:2704:1: rule__DirectionStatement__Room1Assignment_1 : ( ( ruleText ) ) ;
    public final void rule__DirectionStatement__Room1Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2708:1: ( ( ( ruleText ) ) )
            // InternalRinform.g:2709:2: ( ( ruleText ) )
            {
            // InternalRinform.g:2709:2: ( ( ruleText ) )
            // InternalRinform.g:2710:3: ( ruleText )
            {
             before(grammarAccess.getDirectionStatementAccess().getRoom1RoomDeclarationCrossReference_1_0()); 
            // InternalRinform.g:2711:3: ( ruleText )
            // InternalRinform.g:2712:4: ruleText
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
    // InternalRinform.g:2723:1: rule__DirectionStatement__DirectionAssignment_2 : ( ruleDirection ) ;
    public final void rule__DirectionStatement__DirectionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2727:1: ( ( ruleDirection ) )
            // InternalRinform.g:2728:2: ( ruleDirection )
            {
            // InternalRinform.g:2728:2: ( ruleDirection )
            // InternalRinform.g:2729:3: ruleDirection
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
    // InternalRinform.g:2738:1: rule__DirectionStatement__Room2Assignment_3 : ( ( ruleText ) ) ;
    public final void rule__DirectionStatement__Room2Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2742:1: ( ( ( ruleText ) ) )
            // InternalRinform.g:2743:2: ( ( ruleText ) )
            {
            // InternalRinform.g:2743:2: ( ( ruleText ) )
            // InternalRinform.g:2744:3: ( ruleText )
            {
             before(grammarAccess.getDirectionStatementAccess().getRoom2RoomDeclarationCrossReference_3_0()); 
            // InternalRinform.g:2745:3: ( ruleText )
            // InternalRinform.g:2746:4: ruleText
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
    // InternalRinform.g:2757:1: rule__Words__WordsAssignment : ( ruleText ) ;
    public final void rule__Words__WordsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2761:1: ( ( ruleText ) )
            // InternalRinform.g:2762:2: ( ruleText )
            {
            // InternalRinform.g:2762:2: ( ruleText )
            // InternalRinform.g:2763:3: ruleText
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

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA3 dfa3 = new DFA3(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA5 dfa5 = new DFA5(this);
    protected DFA9 dfa9 = new DFA9(this);
    static final String dfa_1s = "\17\uffff";
    static final String dfa_2s = "\1\1\16\uffff";
    static final String dfa_3s = "\1\4\16\uffff";
    static final String dfa_4s = "\1\56\16\uffff";
    static final String dfa_5s = "\1\uffff\1\2\15\1";
    static final String dfa_6s = "\17\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\1\3\5\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\10\1\1\uffff\2\1\1\uffff\1\1\1\uffff\4\1\1\uffff\6\1",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 400:4: ( rule__Text__Alternatives )*";
        }
    }
    static final String dfa_8s = "\1\55\16\uffff";
    static final String[] dfa_9s = {
            "\1\2\1\3\5\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\6\uffff\2\1\1\uffff\1\1\4\uffff\1\1\1\uffff\1\1\3\uffff\1\1\2\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
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
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final short[][] dfa_9 = unpackEncodedStringArray(dfa_9s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_8;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_9;
        }
        public String getDescription() {
            return "()* loopback of 432:4: ( rule__Words__WordsAssignment )*";
        }
    }
    static final String dfa_10s = "\62\uffff";
    static final String dfa_11s = "\1\4\2\uffff\1\4\4\uffff\32\4\3\uffff\15\4";
    static final String dfa_12s = "\1\55\2\uffff\1\25\4\uffff\32\54\3\uffff\15\54";
    static final String dfa_13s = "\1\uffff\1\1\1\2\1\uffff\1\4\1\6\1\10\1\11\32\uffff\1\7\1\3\1\5\15\uffff";
    static final String dfa_14s = "\62\uffff}>";
    static final String[] dfa_15s = {
            "\2\6\5\uffff\13\6\6\uffff\1\1\1\2\1\uffff\1\3\4\uffff\1\4\1\uffff\1\4\3\uffff\1\5\2\uffff\1\7",
            "",
            "",
            "\1\10\1\11\5\uffff\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24",
            "",
            "",
            "",
            "",
            "\1\25\1\26\5\uffff\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\12\uffff\1\43\10\uffff\1\44\2\uffff\1\42",
            "\1\25\1\26\5\uffff\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\12\uffff\1\43\10\uffff\1\44\2\uffff\1\42",
            "\1\25\1\26\5\uffff\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\12\uffff\1\43\10\uffff\1\44\2\uffff\1\42",
            "\1\25\1\26\5\uffff\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\12\uffff\1\43\10\uffff\1\44\2\uffff\1\42",
            "\1\25\1\26\5\uffff\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\12\uffff\1\43\10\uffff\1\44\2\uffff\1\42",
            "\1\25\1\26\5\uffff\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\12\uffff\1\43\10\uffff\1\44\2\uffff\1\42",
            "\1\25\1\26\5\uffff\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\12\uffff\1\43\10\uffff\1\44\2\uffff\1\42",
            "\1\25\1\26\5\uffff\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\12\uffff\1\43\10\uffff\1\44\2\uffff\1\42",
            "\1\25\1\26\5\uffff\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\12\uffff\1\43\10\uffff\1\44\2\uffff\1\42",
            "\1\25\1\26\5\uffff\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\12\uffff\1\43\10\uffff\1\44\2\uffff\1\42",
            "\1\25\1\26\5\uffff\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\12\uffff\1\43\10\uffff\1\44\2\uffff\1\42",
            "\1\25\1\26\5\uffff\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\12\uffff\1\43\10\uffff\1\44\2\uffff\1\42",
            "\1\25\1\26\5\uffff\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\12\uffff\1\43\10\uffff\1\44\2\uffff\1\42",
            "\1\45\1\46\5\uffff\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\12\uffff\1\43\10\uffff\1\44\2\uffff\1\42",
            "\1\45\1\46\5\uffff\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\12\uffff\1\43\10\uffff\1\44\2\uffff\1\42",
            "\1\45\1\46\5\uffff\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\12\uffff\1\43\10\uffff\1\44\2\uffff\1\42",
            "\1\45\1\46\5\uffff\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\12\uffff\1\43\10\uffff\1\44\2\uffff\1\42",
            "\1\45\1\46\5\uffff\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\12\uffff\1\43\10\uffff\1\44\2\uffff\1\42",
            "\1\45\1\46\5\uffff\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\12\uffff\1\43\10\uffff\1\44\2\uffff\1\42",
            "\1\45\1\46\5\uffff\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\12\uffff\1\43\10\uffff\1\44\2\uffff\1\42",
            "\1\45\1\46\5\uffff\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\12\uffff\1\43\10\uffff\1\44\2\uffff\1\42",
            "\1\45\1\46\5\uffff\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\12\uffff\1\43\10\uffff\1\44\2\uffff\1\42",
            "\1\45\1\46\5\uffff\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\12\uffff\1\43\10\uffff\1\44\2\uffff\1\42",
            "\1\45\1\46\5\uffff\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\12\uffff\1\43\10\uffff\1\44\2\uffff\1\42",
            "\1\45\1\46\5\uffff\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\12\uffff\1\43\10\uffff\1\44\2\uffff\1\42",
            "\1\45\1\46\5\uffff\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\12\uffff\1\43\10\uffff\1\44\2\uffff\1\42",
            "",
            "",
            "",
            "\1\45\1\46\5\uffff\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\12\uffff\1\43\10\uffff\1\44\2\uffff\1\42",
            "\1\45\1\46\5\uffff\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\12\uffff\1\43\10\uffff\1\44\2\uffff\1\42",
            "\1\45\1\46\5\uffff\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\12\uffff\1\43\10\uffff\1\44\2\uffff\1\42",
            "\1\45\1\46\5\uffff\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\12\uffff\1\43\10\uffff\1\44\2\uffff\1\42",
            "\1\45\1\46\5\uffff\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\12\uffff\1\43\10\uffff\1\44\2\uffff\1\42",
            "\1\45\1\46\5\uffff\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\12\uffff\1\43\10\uffff\1\44\2\uffff\1\42",
            "\1\45\1\46\5\uffff\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\12\uffff\1\43\10\uffff\1\44\2\uffff\1\42",
            "\1\45\1\46\5\uffff\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\12\uffff\1\43\10\uffff\1\44\2\uffff\1\42",
            "\1\45\1\46\5\uffff\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\12\uffff\1\43\10\uffff\1\44\2\uffff\1\42",
            "\1\45\1\46\5\uffff\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\12\uffff\1\43\10\uffff\1\44\2\uffff\1\42",
            "\1\45\1\46\5\uffff\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\12\uffff\1\43\10\uffff\1\44\2\uffff\1\42",
            "\1\45\1\46\5\uffff\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\12\uffff\1\43\10\uffff\1\44\2\uffff\1\42",
            "\1\45\1\46\5\uffff\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\12\uffff\1\43\10\uffff\1\44\2\uffff\1\42"
    };

    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final char[] dfa_12 = DFA.unpackEncodedStringToUnsignedChars(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final short[][] dfa_15 = unpackEncodedStringArray(dfa_15s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_10;
            this.eof = dfa_10;
            this.min = dfa_11;
            this.max = dfa_12;
            this.accept = dfa_13;
            this.special = dfa_14;
            this.transition = dfa_15;
        }
        public String getDescription() {
            return "490:1: rule__SentencePart__Alternatives : ( ( ruleRoomDeclaration ) | ( ruleRoomAlias ) | ( ruleRoomDescription ) | ( ruleItemDeclaration ) | ( ruleItemDescription ) | ( ruleCharacterDeclaration ) | ( ruleCharacterDescription ) | ( ruleWords ) | ( ruleDirectionStatement ) );";
        }
    }
    static final String dfa_16s = "\40\uffff";
    static final String dfa_17s = "\1\44\1\4\1\uffff\32\4\1\40\2\uffff";
    static final String dfa_18s = "\1\46\1\25\1\uffff\32\47\1\50\2\uffff";
    static final String dfa_19s = "\2\uffff\1\2\33\uffff\1\3\1\1";
    static final String dfa_20s = "\40\uffff}>";
    static final String[] dfa_21s = {
            "\1\2\1\uffff\1\1",
            "\1\3\1\4\5\uffff\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17",
            "",
            "\1\20\1\21\5\uffff\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\21\uffff\1\35",
            "\1\20\1\21\5\uffff\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\21\uffff\1\35",
            "\1\20\1\21\5\uffff\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\21\uffff\1\35",
            "\1\20\1\21\5\uffff\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\21\uffff\1\35",
            "\1\20\1\21\5\uffff\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\21\uffff\1\35",
            "\1\20\1\21\5\uffff\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\21\uffff\1\35",
            "\1\20\1\21\5\uffff\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\21\uffff\1\35",
            "\1\20\1\21\5\uffff\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\21\uffff\1\35",
            "\1\20\1\21\5\uffff\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\21\uffff\1\35",
            "\1\20\1\21\5\uffff\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\21\uffff\1\35",
            "\1\20\1\21\5\uffff\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\21\uffff\1\35",
            "\1\20\1\21\5\uffff\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\21\uffff\1\35",
            "\1\20\1\21\5\uffff\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\21\uffff\1\35",
            "\1\20\1\21\5\uffff\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\21\uffff\1\35",
            "\1\20\1\21\5\uffff\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\21\uffff\1\35",
            "\1\20\1\21\5\uffff\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\21\uffff\1\35",
            "\1\20\1\21\5\uffff\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\21\uffff\1\35",
            "\1\20\1\21\5\uffff\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\21\uffff\1\35",
            "\1\20\1\21\5\uffff\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\21\uffff\1\35",
            "\1\20\1\21\5\uffff\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\21\uffff\1\35",
            "\1\20\1\21\5\uffff\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\21\uffff\1\35",
            "\1\20\1\21\5\uffff\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\21\uffff\1\35",
            "\1\20\1\21\5\uffff\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\21\uffff\1\35",
            "\1\20\1\21\5\uffff\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\21\uffff\1\35",
            "\1\20\1\21\5\uffff\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\21\uffff\1\35",
            "\1\20\1\21\5\uffff\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\21\uffff\1\35",
            "\1\37\7\uffff\1\36",
            "",
            ""
    };

    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final char[] dfa_18 = DFA.unpackEncodedStringToUnsignedChars(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final short[][] dfa_21 = unpackEncodedStringArray(dfa_21s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_16;
            this.eof = dfa_16;
            this.min = dfa_17;
            this.max = dfa_18;
            this.accept = dfa_19;
            this.special = dfa_20;
            this.transition = dfa_21;
        }
        public String getDescription() {
            return "553:1: rule__ItemDeclaration__Alternatives : ( ( ruleItemInRoomDeclaration ) | ( ruleContainerDeclaration ) | ( ruleItemInContainerDeclaration ) );";
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_8;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_9;
        }
        public String getDescription() {
            return "()* loopback of 913:3: ( rule__RoomAlias__AliasesAssignment_3 )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00002450B03FF832L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000003FF832L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000003FF830L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000000FC00000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000400000000000L});

}