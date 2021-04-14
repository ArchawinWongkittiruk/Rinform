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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_WS", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'.'", "','", "';'", "':'", "'-'", "'!'", "'?'", "'\\''", "'('", "')'", "'\"'", "'South'", "'North'", "'East'", "'West'", "'Below'", "'Above'", "'r-'", "'-r'", "'{'", "'!r'", "'['", "']'", "'}'", "'='", "'c-'", "'-c'", "'i-'", "'-i'", "'!c'", "'!i'", "'p-'", "'-p'", "'!p'", "'<'", "'>'"
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

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_WS)||(LA1_0>=11 && LA1_0<=21)||LA1_0==28||(LA1_0>=30 && LA1_0<=31)||LA1_0==36||LA1_0==38||(LA1_0>=41 && LA1_0<=42)||(LA1_0>=44 && LA1_0<=45)) ) {
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


    // $ANTLR start "entryRuleRoomAlias"
    // InternalRinform.g:153:1: entryRuleRoomAlias : ruleRoomAlias EOF ;
    public final void entryRuleRoomAlias() throws RecognitionException {
        try {
            // InternalRinform.g:154:1: ( ruleRoomAlias EOF )
            // InternalRinform.g:155:1: ruleRoomAlias EOF
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
    // InternalRinform.g:162:1: ruleRoomAlias : ( ( rule__RoomAlias__Group__0 ) ) ;
    public final void ruleRoomAlias() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:166:2: ( ( ( rule__RoomAlias__Group__0 ) ) )
            // InternalRinform.g:167:2: ( ( rule__RoomAlias__Group__0 ) )
            {
            // InternalRinform.g:167:2: ( ( rule__RoomAlias__Group__0 ) )
            // InternalRinform.g:168:3: ( rule__RoomAlias__Group__0 )
            {
             before(grammarAccess.getRoomAliasAccess().getGroup()); 
            // InternalRinform.g:169:3: ( rule__RoomAlias__Group__0 )
            // InternalRinform.g:169:4: rule__RoomAlias__Group__0
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


    // $ANTLR start "entryRuleItemDeclaration"
    // InternalRinform.g:178:1: entryRuleItemDeclaration : ruleItemDeclaration EOF ;
    public final void entryRuleItemDeclaration() throws RecognitionException {
        try {
            // InternalRinform.g:179:1: ( ruleItemDeclaration EOF )
            // InternalRinform.g:180:1: ruleItemDeclaration EOF
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
    // InternalRinform.g:187:1: ruleItemDeclaration : ( ( rule__ItemDeclaration__Alternatives ) ) ;
    public final void ruleItemDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:191:2: ( ( ( rule__ItemDeclaration__Alternatives ) ) )
            // InternalRinform.g:192:2: ( ( rule__ItemDeclaration__Alternatives ) )
            {
            // InternalRinform.g:192:2: ( ( rule__ItemDeclaration__Alternatives ) )
            // InternalRinform.g:193:3: ( rule__ItemDeclaration__Alternatives )
            {
             before(grammarAccess.getItemDeclarationAccess().getAlternatives()); 
            // InternalRinform.g:194:3: ( rule__ItemDeclaration__Alternatives )
            // InternalRinform.g:194:4: rule__ItemDeclaration__Alternatives
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


    // $ANTLR start "entryRuleContainerDeclaration"
    // InternalRinform.g:203:1: entryRuleContainerDeclaration : ruleContainerDeclaration EOF ;
    public final void entryRuleContainerDeclaration() throws RecognitionException {
        try {
            // InternalRinform.g:204:1: ( ruleContainerDeclaration EOF )
            // InternalRinform.g:205:1: ruleContainerDeclaration EOF
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
    // InternalRinform.g:212:1: ruleContainerDeclaration : ( ( rule__ContainerDeclaration__Group__0 ) ) ;
    public final void ruleContainerDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:216:2: ( ( ( rule__ContainerDeclaration__Group__0 ) ) )
            // InternalRinform.g:217:2: ( ( rule__ContainerDeclaration__Group__0 ) )
            {
            // InternalRinform.g:217:2: ( ( rule__ContainerDeclaration__Group__0 ) )
            // InternalRinform.g:218:3: ( rule__ContainerDeclaration__Group__0 )
            {
             before(grammarAccess.getContainerDeclarationAccess().getGroup()); 
            // InternalRinform.g:219:3: ( rule__ContainerDeclaration__Group__0 )
            // InternalRinform.g:219:4: rule__ContainerDeclaration__Group__0
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
    // InternalRinform.g:228:1: entryRuleItemInRoomDeclaration : ruleItemInRoomDeclaration EOF ;
    public final void entryRuleItemInRoomDeclaration() throws RecognitionException {
        try {
            // InternalRinform.g:229:1: ( ruleItemInRoomDeclaration EOF )
            // InternalRinform.g:230:1: ruleItemInRoomDeclaration EOF
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
    // InternalRinform.g:237:1: ruleItemInRoomDeclaration : ( ( rule__ItemInRoomDeclaration__Group__0 ) ) ;
    public final void ruleItemInRoomDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:241:2: ( ( ( rule__ItemInRoomDeclaration__Group__0 ) ) )
            // InternalRinform.g:242:2: ( ( rule__ItemInRoomDeclaration__Group__0 ) )
            {
            // InternalRinform.g:242:2: ( ( rule__ItemInRoomDeclaration__Group__0 ) )
            // InternalRinform.g:243:3: ( rule__ItemInRoomDeclaration__Group__0 )
            {
             before(grammarAccess.getItemInRoomDeclarationAccess().getGroup()); 
            // InternalRinform.g:244:3: ( rule__ItemInRoomDeclaration__Group__0 )
            // InternalRinform.g:244:4: rule__ItemInRoomDeclaration__Group__0
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
    // InternalRinform.g:253:1: entryRuleItemInContainerDeclaration : ruleItemInContainerDeclaration EOF ;
    public final void entryRuleItemInContainerDeclaration() throws RecognitionException {
        try {
            // InternalRinform.g:254:1: ( ruleItemInContainerDeclaration EOF )
            // InternalRinform.g:255:1: ruleItemInContainerDeclaration EOF
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
    // InternalRinform.g:262:1: ruleItemInContainerDeclaration : ( ( rule__ItemInContainerDeclaration__Group__0 ) ) ;
    public final void ruleItemInContainerDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:266:2: ( ( ( rule__ItemInContainerDeclaration__Group__0 ) ) )
            // InternalRinform.g:267:2: ( ( rule__ItemInContainerDeclaration__Group__0 ) )
            {
            // InternalRinform.g:267:2: ( ( rule__ItemInContainerDeclaration__Group__0 ) )
            // InternalRinform.g:268:3: ( rule__ItemInContainerDeclaration__Group__0 )
            {
             before(grammarAccess.getItemInContainerDeclarationAccess().getGroup()); 
            // InternalRinform.g:269:3: ( rule__ItemInContainerDeclaration__Group__0 )
            // InternalRinform.g:269:4: rule__ItemInContainerDeclaration__Group__0
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


    // $ANTLR start "entryRuleItemAlias"
    // InternalRinform.g:303:1: entryRuleItemAlias : ruleItemAlias EOF ;
    public final void entryRuleItemAlias() throws RecognitionException {
        try {
            // InternalRinform.g:304:1: ( ruleItemAlias EOF )
            // InternalRinform.g:305:1: ruleItemAlias EOF
            {
             before(grammarAccess.getItemAliasRule()); 
            pushFollow(FOLLOW_1);
            ruleItemAlias();

            state._fsp--;

             after(grammarAccess.getItemAliasRule()); 
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
    // $ANTLR end "entryRuleItemAlias"


    // $ANTLR start "ruleItemAlias"
    // InternalRinform.g:312:1: ruleItemAlias : ( ( rule__ItemAlias__Group__0 ) ) ;
    public final void ruleItemAlias() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:316:2: ( ( ( rule__ItemAlias__Group__0 ) ) )
            // InternalRinform.g:317:2: ( ( rule__ItemAlias__Group__0 ) )
            {
            // InternalRinform.g:317:2: ( ( rule__ItemAlias__Group__0 ) )
            // InternalRinform.g:318:3: ( rule__ItemAlias__Group__0 )
            {
             before(grammarAccess.getItemAliasAccess().getGroup()); 
            // InternalRinform.g:319:3: ( rule__ItemAlias__Group__0 )
            // InternalRinform.g:319:4: rule__ItemAlias__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ItemAlias__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getItemAliasAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleItemAlias"


    // $ANTLR start "entryRuleCharacterDeclaration"
    // InternalRinform.g:328:1: entryRuleCharacterDeclaration : ruleCharacterDeclaration EOF ;
    public final void entryRuleCharacterDeclaration() throws RecognitionException {
        try {
            // InternalRinform.g:329:1: ( ruleCharacterDeclaration EOF )
            // InternalRinform.g:330:1: ruleCharacterDeclaration EOF
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
    // InternalRinform.g:337:1: ruleCharacterDeclaration : ( ( rule__CharacterDeclaration__Group__0 ) ) ;
    public final void ruleCharacterDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:341:2: ( ( ( rule__CharacterDeclaration__Group__0 ) ) )
            // InternalRinform.g:342:2: ( ( rule__CharacterDeclaration__Group__0 ) )
            {
            // InternalRinform.g:342:2: ( ( rule__CharacterDeclaration__Group__0 ) )
            // InternalRinform.g:343:3: ( rule__CharacterDeclaration__Group__0 )
            {
             before(grammarAccess.getCharacterDeclarationAccess().getGroup()); 
            // InternalRinform.g:344:3: ( rule__CharacterDeclaration__Group__0 )
            // InternalRinform.g:344:4: rule__CharacterDeclaration__Group__0
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
    // InternalRinform.g:353:1: entryRuleCharacterDescription : ruleCharacterDescription EOF ;
    public final void entryRuleCharacterDescription() throws RecognitionException {
        try {
            // InternalRinform.g:354:1: ( ruleCharacterDescription EOF )
            // InternalRinform.g:355:1: ruleCharacterDescription EOF
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
    // InternalRinform.g:362:1: ruleCharacterDescription : ( ( rule__CharacterDescription__Group__0 ) ) ;
    public final void ruleCharacterDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:366:2: ( ( ( rule__CharacterDescription__Group__0 ) ) )
            // InternalRinform.g:367:2: ( ( rule__CharacterDescription__Group__0 ) )
            {
            // InternalRinform.g:367:2: ( ( rule__CharacterDescription__Group__0 ) )
            // InternalRinform.g:368:3: ( rule__CharacterDescription__Group__0 )
            {
             before(grammarAccess.getCharacterDescriptionAccess().getGroup()); 
            // InternalRinform.g:369:3: ( rule__CharacterDescription__Group__0 )
            // InternalRinform.g:369:4: rule__CharacterDescription__Group__0
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


    // $ANTLR start "entryRuleCharacterAlias"
    // InternalRinform.g:378:1: entryRuleCharacterAlias : ruleCharacterAlias EOF ;
    public final void entryRuleCharacterAlias() throws RecognitionException {
        try {
            // InternalRinform.g:379:1: ( ruleCharacterAlias EOF )
            // InternalRinform.g:380:1: ruleCharacterAlias EOF
            {
             before(grammarAccess.getCharacterAliasRule()); 
            pushFollow(FOLLOW_1);
            ruleCharacterAlias();

            state._fsp--;

             after(grammarAccess.getCharacterAliasRule()); 
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
    // $ANTLR end "entryRuleCharacterAlias"


    // $ANTLR start "ruleCharacterAlias"
    // InternalRinform.g:387:1: ruleCharacterAlias : ( ( rule__CharacterAlias__Group__0 ) ) ;
    public final void ruleCharacterAlias() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:391:2: ( ( ( rule__CharacterAlias__Group__0 ) ) )
            // InternalRinform.g:392:2: ( ( rule__CharacterAlias__Group__0 ) )
            {
            // InternalRinform.g:392:2: ( ( rule__CharacterAlias__Group__0 ) )
            // InternalRinform.g:393:3: ( rule__CharacterAlias__Group__0 )
            {
             before(grammarAccess.getCharacterAliasAccess().getGroup()); 
            // InternalRinform.g:394:3: ( rule__CharacterAlias__Group__0 )
            // InternalRinform.g:394:4: rule__CharacterAlias__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CharacterAlias__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCharacterAliasAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCharacterAlias"


    // $ANTLR start "entryRuleDirectionStatement"
    // InternalRinform.g:403:1: entryRuleDirectionStatement : ruleDirectionStatement EOF ;
    public final void entryRuleDirectionStatement() throws RecognitionException {
        try {
            // InternalRinform.g:404:1: ( ruleDirectionStatement EOF )
            // InternalRinform.g:405:1: ruleDirectionStatement EOF
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
    // InternalRinform.g:412:1: ruleDirectionStatement : ( ( rule__DirectionStatement__Group__0 ) ) ;
    public final void ruleDirectionStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:416:2: ( ( ( rule__DirectionStatement__Group__0 ) ) )
            // InternalRinform.g:417:2: ( ( rule__DirectionStatement__Group__0 ) )
            {
            // InternalRinform.g:417:2: ( ( rule__DirectionStatement__Group__0 ) )
            // InternalRinform.g:418:3: ( rule__DirectionStatement__Group__0 )
            {
             before(grammarAccess.getDirectionStatementAccess().getGroup()); 
            // InternalRinform.g:419:3: ( rule__DirectionStatement__Group__0 )
            // InternalRinform.g:419:4: rule__DirectionStatement__Group__0
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
    // InternalRinform.g:428:1: entryRuleText : ruleText EOF ;
    public final void entryRuleText() throws RecognitionException {
        try {
            // InternalRinform.g:429:1: ( ruleText EOF )
            // InternalRinform.g:430:1: ruleText EOF
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
    // InternalRinform.g:437:1: ruleText : ( ( ( rule__Text__Alternatives ) ) ( ( rule__Text__Alternatives )* ) ) ;
    public final void ruleText() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:441:2: ( ( ( ( rule__Text__Alternatives ) ) ( ( rule__Text__Alternatives )* ) ) )
            // InternalRinform.g:442:2: ( ( ( rule__Text__Alternatives ) ) ( ( rule__Text__Alternatives )* ) )
            {
            // InternalRinform.g:442:2: ( ( ( rule__Text__Alternatives ) ) ( ( rule__Text__Alternatives )* ) )
            // InternalRinform.g:443:3: ( ( rule__Text__Alternatives ) ) ( ( rule__Text__Alternatives )* )
            {
            // InternalRinform.g:443:3: ( ( rule__Text__Alternatives ) )
            // InternalRinform.g:444:4: ( rule__Text__Alternatives )
            {
             before(grammarAccess.getTextAccess().getAlternatives()); 
            // InternalRinform.g:445:4: ( rule__Text__Alternatives )
            // InternalRinform.g:445:5: rule__Text__Alternatives
            {
            pushFollow(FOLLOW_4);
            rule__Text__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTextAccess().getAlternatives()); 

            }

            // InternalRinform.g:448:3: ( ( rule__Text__Alternatives )* )
            // InternalRinform.g:449:4: ( rule__Text__Alternatives )*
            {
             before(grammarAccess.getTextAccess().getAlternatives()); 
            // InternalRinform.g:450:4: ( rule__Text__Alternatives )*
            loop2:
            do {
                int alt2=2;
                alt2 = dfa2.predict(input);
                switch (alt2) {
            	case 1 :
            	    // InternalRinform.g:450:5: rule__Text__Alternatives
            	    {
            	    pushFollow(FOLLOW_3);
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
    // InternalRinform.g:460:1: entryRuleWords : ruleWords EOF ;
    public final void entryRuleWords() throws RecognitionException {
        try {
            // InternalRinform.g:461:1: ( ruleWords EOF )
            // InternalRinform.g:462:1: ruleWords EOF
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
    // InternalRinform.g:469:1: ruleWords : ( ( ( rule__Words__WordsAssignment ) ) ( ( rule__Words__WordsAssignment )* ) ) ;
    public final void ruleWords() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:473:2: ( ( ( ( rule__Words__WordsAssignment ) ) ( ( rule__Words__WordsAssignment )* ) ) )
            // InternalRinform.g:474:2: ( ( ( rule__Words__WordsAssignment ) ) ( ( rule__Words__WordsAssignment )* ) )
            {
            // InternalRinform.g:474:2: ( ( ( rule__Words__WordsAssignment ) ) ( ( rule__Words__WordsAssignment )* ) )
            // InternalRinform.g:475:3: ( ( rule__Words__WordsAssignment ) ) ( ( rule__Words__WordsAssignment )* )
            {
            // InternalRinform.g:475:3: ( ( rule__Words__WordsAssignment ) )
            // InternalRinform.g:476:4: ( rule__Words__WordsAssignment )
            {
             before(grammarAccess.getWordsAccess().getWordsAssignment()); 
            // InternalRinform.g:477:4: ( rule__Words__WordsAssignment )
            // InternalRinform.g:477:5: rule__Words__WordsAssignment
            {
            pushFollow(FOLLOW_4);
            rule__Words__WordsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getWordsAccess().getWordsAssignment()); 

            }

            // InternalRinform.g:480:3: ( ( rule__Words__WordsAssignment )* )
            // InternalRinform.g:481:4: ( rule__Words__WordsAssignment )*
            {
             before(grammarAccess.getWordsAccess().getWordsAssignment()); 
            // InternalRinform.g:482:4: ( rule__Words__WordsAssignment )*
            loop3:
            do {
                int alt3=2;
                alt3 = dfa3.predict(input);
                switch (alt3) {
            	case 1 :
            	    // InternalRinform.g:482:5: rule__Words__WordsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
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
    // InternalRinform.g:492:1: entryRuleSYMBOL : ruleSYMBOL EOF ;
    public final void entryRuleSYMBOL() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalRinform.g:496:1: ( ruleSYMBOL EOF )
            // InternalRinform.g:497:1: ruleSYMBOL EOF
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
    // InternalRinform.g:507:1: ruleSYMBOL : ( ( rule__SYMBOL__Alternatives ) ) ;
    public final void ruleSYMBOL() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:512:2: ( ( ( rule__SYMBOL__Alternatives ) ) )
            // InternalRinform.g:513:2: ( ( rule__SYMBOL__Alternatives ) )
            {
            // InternalRinform.g:513:2: ( ( rule__SYMBOL__Alternatives ) )
            // InternalRinform.g:514:3: ( rule__SYMBOL__Alternatives )
            {
             before(grammarAccess.getSYMBOLAccess().getAlternatives()); 
            // InternalRinform.g:515:3: ( rule__SYMBOL__Alternatives )
            // InternalRinform.g:515:4: rule__SYMBOL__Alternatives
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
    // InternalRinform.g:525:1: ruleDirection : ( ( rule__Direction__Alternatives ) ) ;
    public final void ruleDirection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:529:1: ( ( ( rule__Direction__Alternatives ) ) )
            // InternalRinform.g:530:2: ( ( rule__Direction__Alternatives ) )
            {
            // InternalRinform.g:530:2: ( ( rule__Direction__Alternatives ) )
            // InternalRinform.g:531:3: ( rule__Direction__Alternatives )
            {
             before(grammarAccess.getDirectionAccess().getAlternatives()); 
            // InternalRinform.g:532:3: ( rule__Direction__Alternatives )
            // InternalRinform.g:532:4: rule__Direction__Alternatives
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
    // InternalRinform.g:540:1: rule__SentencePart__Alternatives : ( ( ruleRoomDeclaration ) | ( ruleItemDeclaration ) | ( ruleCharacterDeclaration ) | ( ruleRoomDescription ) | ( ruleItemDescription ) | ( ruleCharacterDescription ) | ( ruleRoomAlias ) | ( ruleItemAlias ) | ( ruleCharacterAlias ) | ( ruleDirectionStatement ) | ( ruleWords ) );
    public final void rule__SentencePart__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:544:1: ( ( ruleRoomDeclaration ) | ( ruleItemDeclaration ) | ( ruleCharacterDeclaration ) | ( ruleRoomDescription ) | ( ruleItemDescription ) | ( ruleCharacterDescription ) | ( ruleRoomAlias ) | ( ruleItemAlias ) | ( ruleCharacterAlias ) | ( ruleDirectionStatement ) | ( ruleWords ) )
            int alt4=11;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalRinform.g:545:2: ( ruleRoomDeclaration )
                    {
                    // InternalRinform.g:545:2: ( ruleRoomDeclaration )
                    // InternalRinform.g:546:3: ruleRoomDeclaration
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
                    // InternalRinform.g:551:2: ( ruleItemDeclaration )
                    {
                    // InternalRinform.g:551:2: ( ruleItemDeclaration )
                    // InternalRinform.g:552:3: ruleItemDeclaration
                    {
                     before(grammarAccess.getSentencePartAccess().getItemDeclarationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleItemDeclaration();

                    state._fsp--;

                     after(grammarAccess.getSentencePartAccess().getItemDeclarationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRinform.g:557:2: ( ruleCharacterDeclaration )
                    {
                    // InternalRinform.g:557:2: ( ruleCharacterDeclaration )
                    // InternalRinform.g:558:3: ruleCharacterDeclaration
                    {
                     before(grammarAccess.getSentencePartAccess().getCharacterDeclarationParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleCharacterDeclaration();

                    state._fsp--;

                     after(grammarAccess.getSentencePartAccess().getCharacterDeclarationParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRinform.g:563:2: ( ruleRoomDescription )
                    {
                    // InternalRinform.g:563:2: ( ruleRoomDescription )
                    // InternalRinform.g:564:3: ruleRoomDescription
                    {
                     before(grammarAccess.getSentencePartAccess().getRoomDescriptionParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleRoomDescription();

                    state._fsp--;

                     after(grammarAccess.getSentencePartAccess().getRoomDescriptionParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalRinform.g:569:2: ( ruleItemDescription )
                    {
                    // InternalRinform.g:569:2: ( ruleItemDescription )
                    // InternalRinform.g:570:3: ruleItemDescription
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
                    // InternalRinform.g:575:2: ( ruleCharacterDescription )
                    {
                    // InternalRinform.g:575:2: ( ruleCharacterDescription )
                    // InternalRinform.g:576:3: ruleCharacterDescription
                    {
                     before(grammarAccess.getSentencePartAccess().getCharacterDescriptionParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleCharacterDescription();

                    state._fsp--;

                     after(grammarAccess.getSentencePartAccess().getCharacterDescriptionParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalRinform.g:581:2: ( ruleRoomAlias )
                    {
                    // InternalRinform.g:581:2: ( ruleRoomAlias )
                    // InternalRinform.g:582:3: ruleRoomAlias
                    {
                     before(grammarAccess.getSentencePartAccess().getRoomAliasParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleRoomAlias();

                    state._fsp--;

                     after(grammarAccess.getSentencePartAccess().getRoomAliasParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalRinform.g:587:2: ( ruleItemAlias )
                    {
                    // InternalRinform.g:587:2: ( ruleItemAlias )
                    // InternalRinform.g:588:3: ruleItemAlias
                    {
                     before(grammarAccess.getSentencePartAccess().getItemAliasParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleItemAlias();

                    state._fsp--;

                     after(grammarAccess.getSentencePartAccess().getItemAliasParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalRinform.g:593:2: ( ruleCharacterAlias )
                    {
                    // InternalRinform.g:593:2: ( ruleCharacterAlias )
                    // InternalRinform.g:594:3: ruleCharacterAlias
                    {
                     before(grammarAccess.getSentencePartAccess().getCharacterAliasParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleCharacterAlias();

                    state._fsp--;

                     after(grammarAccess.getSentencePartAccess().getCharacterAliasParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalRinform.g:599:2: ( ruleDirectionStatement )
                    {
                    // InternalRinform.g:599:2: ( ruleDirectionStatement )
                    // InternalRinform.g:600:3: ruleDirectionStatement
                    {
                     before(grammarAccess.getSentencePartAccess().getDirectionStatementParserRuleCall_9()); 
                    pushFollow(FOLLOW_2);
                    ruleDirectionStatement();

                    state._fsp--;

                     after(grammarAccess.getSentencePartAccess().getDirectionStatementParserRuleCall_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalRinform.g:605:2: ( ruleWords )
                    {
                    // InternalRinform.g:605:2: ( ruleWords )
                    // InternalRinform.g:606:3: ruleWords
                    {
                     before(grammarAccess.getSentencePartAccess().getWordsParserRuleCall_10()); 
                    pushFollow(FOLLOW_2);
                    ruleWords();

                    state._fsp--;

                     after(grammarAccess.getSentencePartAccess().getWordsParserRuleCall_10()); 

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
    // InternalRinform.g:615:1: rule__ItemDeclaration__Alternatives : ( ( ruleItemInRoomDeclaration ) | ( ruleContainerDeclaration ) | ( ruleItemInContainerDeclaration ) );
    public final void rule__ItemDeclaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:619:1: ( ( ruleItemInRoomDeclaration ) | ( ruleContainerDeclaration ) | ( ruleItemInContainerDeclaration ) )
            int alt5=3;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalRinform.g:620:2: ( ruleItemInRoomDeclaration )
                    {
                    // InternalRinform.g:620:2: ( ruleItemInRoomDeclaration )
                    // InternalRinform.g:621:3: ruleItemInRoomDeclaration
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
                    // InternalRinform.g:626:2: ( ruleContainerDeclaration )
                    {
                    // InternalRinform.g:626:2: ( ruleContainerDeclaration )
                    // InternalRinform.g:627:3: ruleContainerDeclaration
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
                    // InternalRinform.g:632:2: ( ruleItemInContainerDeclaration )
                    {
                    // InternalRinform.g:632:2: ( ruleItemInContainerDeclaration )
                    // InternalRinform.g:633:3: ruleItemInContainerDeclaration
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
    // InternalRinform.g:642:1: rule__Text__Alternatives : ( ( RULE_ID ) | ( RULE_WS ) | ( ruleSYMBOL ) );
    public final void rule__Text__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:646:1: ( ( RULE_ID ) | ( RULE_WS ) | ( ruleSYMBOL ) )
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
                    // InternalRinform.g:647:2: ( RULE_ID )
                    {
                    // InternalRinform.g:647:2: ( RULE_ID )
                    // InternalRinform.g:648:3: RULE_ID
                    {
                     before(grammarAccess.getTextAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getTextAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRinform.g:653:2: ( RULE_WS )
                    {
                    // InternalRinform.g:653:2: ( RULE_WS )
                    // InternalRinform.g:654:3: RULE_WS
                    {
                     before(grammarAccess.getTextAccess().getWSTerminalRuleCall_1()); 
                    match(input,RULE_WS,FOLLOW_2); 
                     after(grammarAccess.getTextAccess().getWSTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRinform.g:659:2: ( ruleSYMBOL )
                    {
                    // InternalRinform.g:659:2: ( ruleSYMBOL )
                    // InternalRinform.g:660:3: ruleSYMBOL
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
    // InternalRinform.g:669:1: rule__SYMBOL__Alternatives : ( ( '.' ) | ( ',' ) | ( ';' ) | ( ':' ) | ( '-' ) | ( '!' ) | ( '?' ) | ( '\\'' ) | ( '(' ) | ( ')' ) | ( '\"' ) );
    public final void rule__SYMBOL__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:673:1: ( ( '.' ) | ( ',' ) | ( ';' ) | ( ':' ) | ( '-' ) | ( '!' ) | ( '?' ) | ( '\\'' ) | ( '(' ) | ( ')' ) | ( '\"' ) )
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
                    // InternalRinform.g:674:2: ( '.' )
                    {
                    // InternalRinform.g:674:2: ( '.' )
                    // InternalRinform.g:675:3: '.'
                    {
                     before(grammarAccess.getSYMBOLAccess().getFullStopKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getSYMBOLAccess().getFullStopKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRinform.g:680:2: ( ',' )
                    {
                    // InternalRinform.g:680:2: ( ',' )
                    // InternalRinform.g:681:3: ','
                    {
                     before(grammarAccess.getSYMBOLAccess().getCommaKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getSYMBOLAccess().getCommaKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRinform.g:686:2: ( ';' )
                    {
                    // InternalRinform.g:686:2: ( ';' )
                    // InternalRinform.g:687:3: ';'
                    {
                     before(grammarAccess.getSYMBOLAccess().getSemicolonKeyword_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getSYMBOLAccess().getSemicolonKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRinform.g:692:2: ( ':' )
                    {
                    // InternalRinform.g:692:2: ( ':' )
                    // InternalRinform.g:693:3: ':'
                    {
                     before(grammarAccess.getSYMBOLAccess().getColonKeyword_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getSYMBOLAccess().getColonKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalRinform.g:698:2: ( '-' )
                    {
                    // InternalRinform.g:698:2: ( '-' )
                    // InternalRinform.g:699:3: '-'
                    {
                     before(grammarAccess.getSYMBOLAccess().getHyphenMinusKeyword_4()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getSYMBOLAccess().getHyphenMinusKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalRinform.g:704:2: ( '!' )
                    {
                    // InternalRinform.g:704:2: ( '!' )
                    // InternalRinform.g:705:3: '!'
                    {
                     before(grammarAccess.getSYMBOLAccess().getExclamationMarkKeyword_5()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getSYMBOLAccess().getExclamationMarkKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalRinform.g:710:2: ( '?' )
                    {
                    // InternalRinform.g:710:2: ( '?' )
                    // InternalRinform.g:711:3: '?'
                    {
                     before(grammarAccess.getSYMBOLAccess().getQuestionMarkKeyword_6()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getSYMBOLAccess().getQuestionMarkKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalRinform.g:716:2: ( '\\'' )
                    {
                    // InternalRinform.g:716:2: ( '\\'' )
                    // InternalRinform.g:717:3: '\\''
                    {
                     before(grammarAccess.getSYMBOLAccess().getApostropheKeyword_7()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getSYMBOLAccess().getApostropheKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalRinform.g:722:2: ( '(' )
                    {
                    // InternalRinform.g:722:2: ( '(' )
                    // InternalRinform.g:723:3: '('
                    {
                     before(grammarAccess.getSYMBOLAccess().getLeftParenthesisKeyword_8()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getSYMBOLAccess().getLeftParenthesisKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalRinform.g:728:2: ( ')' )
                    {
                    // InternalRinform.g:728:2: ( ')' )
                    // InternalRinform.g:729:3: ')'
                    {
                     before(grammarAccess.getSYMBOLAccess().getRightParenthesisKeyword_9()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getSYMBOLAccess().getRightParenthesisKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalRinform.g:734:2: ( '\"' )
                    {
                    // InternalRinform.g:734:2: ( '\"' )
                    // InternalRinform.g:735:3: '\"'
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
    // InternalRinform.g:744:1: rule__Direction__Alternatives : ( ( ( 'South' ) ) | ( ( 'North' ) ) | ( ( 'East' ) ) | ( ( 'West' ) ) | ( ( 'Below' ) ) | ( ( 'Above' ) ) );
    public final void rule__Direction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:748:1: ( ( ( 'South' ) ) | ( ( 'North' ) ) | ( ( 'East' ) ) | ( ( 'West' ) ) | ( ( 'Below' ) ) | ( ( 'Above' ) ) )
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
                    // InternalRinform.g:749:2: ( ( 'South' ) )
                    {
                    // InternalRinform.g:749:2: ( ( 'South' ) )
                    // InternalRinform.g:750:3: ( 'South' )
                    {
                     before(grammarAccess.getDirectionAccess().getSouthEnumLiteralDeclaration_0()); 
                    // InternalRinform.g:751:3: ( 'South' )
                    // InternalRinform.g:751:4: 'South'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectionAccess().getSouthEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRinform.g:755:2: ( ( 'North' ) )
                    {
                    // InternalRinform.g:755:2: ( ( 'North' ) )
                    // InternalRinform.g:756:3: ( 'North' )
                    {
                     before(grammarAccess.getDirectionAccess().getNorthEnumLiteralDeclaration_1()); 
                    // InternalRinform.g:757:3: ( 'North' )
                    // InternalRinform.g:757:4: 'North'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectionAccess().getNorthEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRinform.g:761:2: ( ( 'East' ) )
                    {
                    // InternalRinform.g:761:2: ( ( 'East' ) )
                    // InternalRinform.g:762:3: ( 'East' )
                    {
                     before(grammarAccess.getDirectionAccess().getEastEnumLiteralDeclaration_2()); 
                    // InternalRinform.g:763:3: ( 'East' )
                    // InternalRinform.g:763:4: 'East'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectionAccess().getEastEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRinform.g:767:2: ( ( 'West' ) )
                    {
                    // InternalRinform.g:767:2: ( ( 'West' ) )
                    // InternalRinform.g:768:3: ( 'West' )
                    {
                     before(grammarAccess.getDirectionAccess().getWestEnumLiteralDeclaration_3()); 
                    // InternalRinform.g:769:3: ( 'West' )
                    // InternalRinform.g:769:4: 'West'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectionAccess().getWestEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalRinform.g:773:2: ( ( 'Below' ) )
                    {
                    // InternalRinform.g:773:2: ( ( 'Below' ) )
                    // InternalRinform.g:774:3: ( 'Below' )
                    {
                     before(grammarAccess.getDirectionAccess().getBelowEnumLiteralDeclaration_4()); 
                    // InternalRinform.g:775:3: ( 'Below' )
                    // InternalRinform.g:775:4: 'Below'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectionAccess().getBelowEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalRinform.g:779:2: ( ( 'Above' ) )
                    {
                    // InternalRinform.g:779:2: ( ( 'Above' ) )
                    // InternalRinform.g:780:3: ( 'Above' )
                    {
                     before(grammarAccess.getDirectionAccess().getAboveEnumLiteralDeclaration_5()); 
                    // InternalRinform.g:781:3: ( 'Above' )
                    // InternalRinform.g:781:4: 'Above'
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
    // InternalRinform.g:789:1: rule__RoomDeclaration__Group__0 : rule__RoomDeclaration__Group__0__Impl rule__RoomDeclaration__Group__1 ;
    public final void rule__RoomDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:793:1: ( rule__RoomDeclaration__Group__0__Impl rule__RoomDeclaration__Group__1 )
            // InternalRinform.g:794:2: rule__RoomDeclaration__Group__0__Impl rule__RoomDeclaration__Group__1
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
    // InternalRinform.g:801:1: rule__RoomDeclaration__Group__0__Impl : ( 'r-' ) ;
    public final void rule__RoomDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:805:1: ( ( 'r-' ) )
            // InternalRinform.g:806:1: ( 'r-' )
            {
            // InternalRinform.g:806:1: ( 'r-' )
            // InternalRinform.g:807:2: 'r-'
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
    // InternalRinform.g:816:1: rule__RoomDeclaration__Group__1 : rule__RoomDeclaration__Group__1__Impl rule__RoomDeclaration__Group__2 ;
    public final void rule__RoomDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:820:1: ( rule__RoomDeclaration__Group__1__Impl rule__RoomDeclaration__Group__2 )
            // InternalRinform.g:821:2: rule__RoomDeclaration__Group__1__Impl rule__RoomDeclaration__Group__2
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
    // InternalRinform.g:828:1: rule__RoomDeclaration__Group__1__Impl : ( ( rule__RoomDeclaration__NameAssignment_1 ) ) ;
    public final void rule__RoomDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:832:1: ( ( ( rule__RoomDeclaration__NameAssignment_1 ) ) )
            // InternalRinform.g:833:1: ( ( rule__RoomDeclaration__NameAssignment_1 ) )
            {
            // InternalRinform.g:833:1: ( ( rule__RoomDeclaration__NameAssignment_1 ) )
            // InternalRinform.g:834:2: ( rule__RoomDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getRoomDeclarationAccess().getNameAssignment_1()); 
            // InternalRinform.g:835:2: ( rule__RoomDeclaration__NameAssignment_1 )
            // InternalRinform.g:835:3: rule__RoomDeclaration__NameAssignment_1
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
    // InternalRinform.g:843:1: rule__RoomDeclaration__Group__2 : rule__RoomDeclaration__Group__2__Impl ;
    public final void rule__RoomDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:847:1: ( rule__RoomDeclaration__Group__2__Impl )
            // InternalRinform.g:848:2: rule__RoomDeclaration__Group__2__Impl
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
    // InternalRinform.g:854:1: rule__RoomDeclaration__Group__2__Impl : ( '-r' ) ;
    public final void rule__RoomDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:858:1: ( ( '-r' ) )
            // InternalRinform.g:859:1: ( '-r' )
            {
            // InternalRinform.g:859:1: ( '-r' )
            // InternalRinform.g:860:2: '-r'
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


    // $ANTLR start "rule__RoomDescription__Group__0"
    // InternalRinform.g:870:1: rule__RoomDescription__Group__0 : rule__RoomDescription__Group__0__Impl rule__RoomDescription__Group__1 ;
    public final void rule__RoomDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:874:1: ( rule__RoomDescription__Group__0__Impl rule__RoomDescription__Group__1 )
            // InternalRinform.g:875:2: rule__RoomDescription__Group__0__Impl rule__RoomDescription__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalRinform.g:882:1: rule__RoomDescription__Group__0__Impl : ( '{' ) ;
    public final void rule__RoomDescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:886:1: ( ( '{' ) )
            // InternalRinform.g:887:1: ( '{' )
            {
            // InternalRinform.g:887:1: ( '{' )
            // InternalRinform.g:888:2: '{'
            {
             before(grammarAccess.getRoomDescriptionAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalRinform.g:897:1: rule__RoomDescription__Group__1 : rule__RoomDescription__Group__1__Impl rule__RoomDescription__Group__2 ;
    public final void rule__RoomDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:901:1: ( rule__RoomDescription__Group__1__Impl rule__RoomDescription__Group__2 )
            // InternalRinform.g:902:2: rule__RoomDescription__Group__1__Impl rule__RoomDescription__Group__2
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
    // InternalRinform.g:909:1: rule__RoomDescription__Group__1__Impl : ( ( ( rule__RoomDescription__RoomDescriptionAssignment_1 ) ) ( ( rule__RoomDescription__RoomDescriptionAssignment_1 )* ) ) ;
    public final void rule__RoomDescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:913:1: ( ( ( ( rule__RoomDescription__RoomDescriptionAssignment_1 ) ) ( ( rule__RoomDescription__RoomDescriptionAssignment_1 )* ) ) )
            // InternalRinform.g:914:1: ( ( ( rule__RoomDescription__RoomDescriptionAssignment_1 ) ) ( ( rule__RoomDescription__RoomDescriptionAssignment_1 )* ) )
            {
            // InternalRinform.g:914:1: ( ( ( rule__RoomDescription__RoomDescriptionAssignment_1 ) ) ( ( rule__RoomDescription__RoomDescriptionAssignment_1 )* ) )
            // InternalRinform.g:915:2: ( ( rule__RoomDescription__RoomDescriptionAssignment_1 ) ) ( ( rule__RoomDescription__RoomDescriptionAssignment_1 )* )
            {
            // InternalRinform.g:915:2: ( ( rule__RoomDescription__RoomDescriptionAssignment_1 ) )
            // InternalRinform.g:916:3: ( rule__RoomDescription__RoomDescriptionAssignment_1 )
            {
             before(grammarAccess.getRoomDescriptionAccess().getRoomDescriptionAssignment_1()); 
            // InternalRinform.g:917:3: ( rule__RoomDescription__RoomDescriptionAssignment_1 )
            // InternalRinform.g:917:4: rule__RoomDescription__RoomDescriptionAssignment_1
            {
            pushFollow(FOLLOW_3);
            rule__RoomDescription__RoomDescriptionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRoomDescriptionAccess().getRoomDescriptionAssignment_1()); 

            }

            // InternalRinform.g:920:2: ( ( rule__RoomDescription__RoomDescriptionAssignment_1 )* )
            // InternalRinform.g:921:3: ( rule__RoomDescription__RoomDescriptionAssignment_1 )*
            {
             before(grammarAccess.getRoomDescriptionAccess().getRoomDescriptionAssignment_1()); 
            // InternalRinform.g:922:3: ( rule__RoomDescription__RoomDescriptionAssignment_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_ID && LA9_0<=RULE_WS)||(LA9_0>=11 && LA9_0<=21)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalRinform.g:922:4: rule__RoomDescription__RoomDescriptionAssignment_1
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__RoomDescription__RoomDescriptionAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalRinform.g:931:1: rule__RoomDescription__Group__2 : rule__RoomDescription__Group__2__Impl rule__RoomDescription__Group__3 ;
    public final void rule__RoomDescription__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:935:1: ( rule__RoomDescription__Group__2__Impl rule__RoomDescription__Group__3 )
            // InternalRinform.g:936:2: rule__RoomDescription__Group__2__Impl rule__RoomDescription__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalRinform.g:943:1: rule__RoomDescription__Group__2__Impl : ( '!r' ) ;
    public final void rule__RoomDescription__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:947:1: ( ( '!r' ) )
            // InternalRinform.g:948:1: ( '!r' )
            {
            // InternalRinform.g:948:1: ( '!r' )
            // InternalRinform.g:949:2: '!r'
            {
             before(grammarAccess.getRoomDescriptionAccess().getRKeyword_2()); 
            match(input,31,FOLLOW_2); 
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
    // InternalRinform.g:958:1: rule__RoomDescription__Group__3 : rule__RoomDescription__Group__3__Impl rule__RoomDescription__Group__4 ;
    public final void rule__RoomDescription__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:962:1: ( rule__RoomDescription__Group__3__Impl rule__RoomDescription__Group__4 )
            // InternalRinform.g:963:2: rule__RoomDescription__Group__3__Impl rule__RoomDescription__Group__4
            {
            pushFollow(FOLLOW_4);
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
    // InternalRinform.g:970:1: rule__RoomDescription__Group__3__Impl : ( '[' ) ;
    public final void rule__RoomDescription__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:974:1: ( ( '[' ) )
            // InternalRinform.g:975:1: ( '[' )
            {
            // InternalRinform.g:975:1: ( '[' )
            // InternalRinform.g:976:2: '['
            {
             before(grammarAccess.getRoomDescriptionAccess().getLeftSquareBracketKeyword_3()); 
            match(input,32,FOLLOW_2); 
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
    // InternalRinform.g:985:1: rule__RoomDescription__Group__4 : rule__RoomDescription__Group__4__Impl rule__RoomDescription__Group__5 ;
    public final void rule__RoomDescription__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:989:1: ( rule__RoomDescription__Group__4__Impl rule__RoomDescription__Group__5 )
            // InternalRinform.g:990:2: rule__RoomDescription__Group__4__Impl rule__RoomDescription__Group__5
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
    // InternalRinform.g:997:1: rule__RoomDescription__Group__4__Impl : ( ( rule__RoomDescription__RoomAssignment_4 ) ) ;
    public final void rule__RoomDescription__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1001:1: ( ( ( rule__RoomDescription__RoomAssignment_4 ) ) )
            // InternalRinform.g:1002:1: ( ( rule__RoomDescription__RoomAssignment_4 ) )
            {
            // InternalRinform.g:1002:1: ( ( rule__RoomDescription__RoomAssignment_4 ) )
            // InternalRinform.g:1003:2: ( rule__RoomDescription__RoomAssignment_4 )
            {
             before(grammarAccess.getRoomDescriptionAccess().getRoomAssignment_4()); 
            // InternalRinform.g:1004:2: ( rule__RoomDescription__RoomAssignment_4 )
            // InternalRinform.g:1004:3: rule__RoomDescription__RoomAssignment_4
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
    // InternalRinform.g:1012:1: rule__RoomDescription__Group__5 : rule__RoomDescription__Group__5__Impl rule__RoomDescription__Group__6 ;
    public final void rule__RoomDescription__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1016:1: ( rule__RoomDescription__Group__5__Impl rule__RoomDescription__Group__6 )
            // InternalRinform.g:1017:2: rule__RoomDescription__Group__5__Impl rule__RoomDescription__Group__6
            {
            pushFollow(FOLLOW_9);
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
    // InternalRinform.g:1024:1: rule__RoomDescription__Group__5__Impl : ( ']' ) ;
    public final void rule__RoomDescription__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1028:1: ( ( ']' ) )
            // InternalRinform.g:1029:1: ( ']' )
            {
            // InternalRinform.g:1029:1: ( ']' )
            // InternalRinform.g:1030:2: ']'
            {
             before(grammarAccess.getRoomDescriptionAccess().getRightSquareBracketKeyword_5()); 
            match(input,33,FOLLOW_2); 
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
    // InternalRinform.g:1039:1: rule__RoomDescription__Group__6 : rule__RoomDescription__Group__6__Impl ;
    public final void rule__RoomDescription__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1043:1: ( rule__RoomDescription__Group__6__Impl )
            // InternalRinform.g:1044:2: rule__RoomDescription__Group__6__Impl
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
    // InternalRinform.g:1050:1: rule__RoomDescription__Group__6__Impl : ( '}' ) ;
    public final void rule__RoomDescription__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1054:1: ( ( '}' ) )
            // InternalRinform.g:1055:1: ( '}' )
            {
            // InternalRinform.g:1055:1: ( '}' )
            // InternalRinform.g:1056:2: '}'
            {
             before(grammarAccess.getRoomDescriptionAccess().getRightCurlyBracketKeyword_6()); 
            match(input,34,FOLLOW_2); 
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


    // $ANTLR start "rule__RoomAlias__Group__0"
    // InternalRinform.g:1066:1: rule__RoomAlias__Group__0 : rule__RoomAlias__Group__0__Impl rule__RoomAlias__Group__1 ;
    public final void rule__RoomAlias__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1070:1: ( rule__RoomAlias__Group__0__Impl rule__RoomAlias__Group__1 )
            // InternalRinform.g:1071:2: rule__RoomAlias__Group__0__Impl rule__RoomAlias__Group__1
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
    // InternalRinform.g:1078:1: rule__RoomAlias__Group__0__Impl : ( '!r' ) ;
    public final void rule__RoomAlias__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1082:1: ( ( '!r' ) )
            // InternalRinform.g:1083:1: ( '!r' )
            {
            // InternalRinform.g:1083:1: ( '!r' )
            // InternalRinform.g:1084:2: '!r'
            {
             before(grammarAccess.getRoomAliasAccess().getRKeyword_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalRinform.g:1093:1: rule__RoomAlias__Group__1 : rule__RoomAlias__Group__1__Impl rule__RoomAlias__Group__2 ;
    public final void rule__RoomAlias__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1097:1: ( rule__RoomAlias__Group__1__Impl rule__RoomAlias__Group__2 )
            // InternalRinform.g:1098:2: rule__RoomAlias__Group__1__Impl rule__RoomAlias__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalRinform.g:1105:1: rule__RoomAlias__Group__1__Impl : ( '[' ) ;
    public final void rule__RoomAlias__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1109:1: ( ( '[' ) )
            // InternalRinform.g:1110:1: ( '[' )
            {
            // InternalRinform.g:1110:1: ( '[' )
            // InternalRinform.g:1111:2: '['
            {
             before(grammarAccess.getRoomAliasAccess().getLeftSquareBracketKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getRoomAliasAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
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
    // InternalRinform.g:1120:1: rule__RoomAlias__Group__2 : rule__RoomAlias__Group__2__Impl rule__RoomAlias__Group__3 ;
    public final void rule__RoomAlias__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1124:1: ( rule__RoomAlias__Group__2__Impl rule__RoomAlias__Group__3 )
            // InternalRinform.g:1125:2: rule__RoomAlias__Group__2__Impl rule__RoomAlias__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalRinform.g:1132:1: rule__RoomAlias__Group__2__Impl : ( ( rule__RoomAlias__RoomAssignment_2 ) ) ;
    public final void rule__RoomAlias__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1136:1: ( ( ( rule__RoomAlias__RoomAssignment_2 ) ) )
            // InternalRinform.g:1137:1: ( ( rule__RoomAlias__RoomAssignment_2 ) )
            {
            // InternalRinform.g:1137:1: ( ( rule__RoomAlias__RoomAssignment_2 ) )
            // InternalRinform.g:1138:2: ( rule__RoomAlias__RoomAssignment_2 )
            {
             before(grammarAccess.getRoomAliasAccess().getRoomAssignment_2()); 
            // InternalRinform.g:1139:2: ( rule__RoomAlias__RoomAssignment_2 )
            // InternalRinform.g:1139:3: rule__RoomAlias__RoomAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RoomAlias__RoomAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRoomAliasAccess().getRoomAssignment_2()); 

            }


            }

        }
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
    // InternalRinform.g:1147:1: rule__RoomAlias__Group__3 : rule__RoomAlias__Group__3__Impl rule__RoomAlias__Group__4 ;
    public final void rule__RoomAlias__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1151:1: ( rule__RoomAlias__Group__3__Impl rule__RoomAlias__Group__4 )
            // InternalRinform.g:1152:2: rule__RoomAlias__Group__3__Impl rule__RoomAlias__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__RoomAlias__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoomAlias__Group__4();

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
    // InternalRinform.g:1159:1: rule__RoomAlias__Group__3__Impl : ( ']' ) ;
    public final void rule__RoomAlias__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1163:1: ( ( ']' ) )
            // InternalRinform.g:1164:1: ( ']' )
            {
            // InternalRinform.g:1164:1: ( ']' )
            // InternalRinform.g:1165:2: ']'
            {
             before(grammarAccess.getRoomAliasAccess().getRightSquareBracketKeyword_3()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getRoomAliasAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__RoomAlias__Group__4"
    // InternalRinform.g:1174:1: rule__RoomAlias__Group__4 : rule__RoomAlias__Group__4__Impl rule__RoomAlias__Group__5 ;
    public final void rule__RoomAlias__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1178:1: ( rule__RoomAlias__Group__4__Impl rule__RoomAlias__Group__5 )
            // InternalRinform.g:1179:2: rule__RoomAlias__Group__4__Impl rule__RoomAlias__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__RoomAlias__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoomAlias__Group__5();

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
    // $ANTLR end "rule__RoomAlias__Group__4"


    // $ANTLR start "rule__RoomAlias__Group__4__Impl"
    // InternalRinform.g:1186:1: rule__RoomAlias__Group__4__Impl : ( '=' ) ;
    public final void rule__RoomAlias__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1190:1: ( ( '=' ) )
            // InternalRinform.g:1191:1: ( '=' )
            {
            // InternalRinform.g:1191:1: ( '=' )
            // InternalRinform.g:1192:2: '='
            {
             before(grammarAccess.getRoomAliasAccess().getEqualsSignKeyword_4()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getRoomAliasAccess().getEqualsSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoomAlias__Group__4__Impl"


    // $ANTLR start "rule__RoomAlias__Group__5"
    // InternalRinform.g:1201:1: rule__RoomAlias__Group__5 : rule__RoomAlias__Group__5__Impl rule__RoomAlias__Group__6 ;
    public final void rule__RoomAlias__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1205:1: ( rule__RoomAlias__Group__5__Impl rule__RoomAlias__Group__6 )
            // InternalRinform.g:1206:2: rule__RoomAlias__Group__5__Impl rule__RoomAlias__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__RoomAlias__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoomAlias__Group__6();

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
    // $ANTLR end "rule__RoomAlias__Group__5"


    // $ANTLR start "rule__RoomAlias__Group__5__Impl"
    // InternalRinform.g:1213:1: rule__RoomAlias__Group__5__Impl : ( ( rule__RoomAlias__Group_5__0 )* ) ;
    public final void rule__RoomAlias__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1217:1: ( ( ( rule__RoomAlias__Group_5__0 )* ) )
            // InternalRinform.g:1218:1: ( ( rule__RoomAlias__Group_5__0 )* )
            {
            // InternalRinform.g:1218:1: ( ( rule__RoomAlias__Group_5__0 )* )
            // InternalRinform.g:1219:2: ( rule__RoomAlias__Group_5__0 )*
            {
             before(grammarAccess.getRoomAliasAccess().getGroup_5()); 
            // InternalRinform.g:1220:2: ( rule__RoomAlias__Group_5__0 )*
            loop10:
            do {
                int alt10=2;
                alt10 = dfa10.predict(input);
                switch (alt10) {
            	case 1 :
            	    // InternalRinform.g:1220:3: rule__RoomAlias__Group_5__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__RoomAlias__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getRoomAliasAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoomAlias__Group__5__Impl"


    // $ANTLR start "rule__RoomAlias__Group__6"
    // InternalRinform.g:1228:1: rule__RoomAlias__Group__6 : rule__RoomAlias__Group__6__Impl ;
    public final void rule__RoomAlias__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1232:1: ( rule__RoomAlias__Group__6__Impl )
            // InternalRinform.g:1233:2: rule__RoomAlias__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RoomAlias__Group__6__Impl();

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
    // $ANTLR end "rule__RoomAlias__Group__6"


    // $ANTLR start "rule__RoomAlias__Group__6__Impl"
    // InternalRinform.g:1239:1: rule__RoomAlias__Group__6__Impl : ( ( rule__RoomAlias__Group_6__0 ) ) ;
    public final void rule__RoomAlias__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1243:1: ( ( ( rule__RoomAlias__Group_6__0 ) ) )
            // InternalRinform.g:1244:1: ( ( rule__RoomAlias__Group_6__0 ) )
            {
            // InternalRinform.g:1244:1: ( ( rule__RoomAlias__Group_6__0 ) )
            // InternalRinform.g:1245:2: ( rule__RoomAlias__Group_6__0 )
            {
             before(grammarAccess.getRoomAliasAccess().getGroup_6()); 
            // InternalRinform.g:1246:2: ( rule__RoomAlias__Group_6__0 )
            // InternalRinform.g:1246:3: rule__RoomAlias__Group_6__0
            {
            pushFollow(FOLLOW_2);
            rule__RoomAlias__Group_6__0();

            state._fsp--;


            }

             after(grammarAccess.getRoomAliasAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoomAlias__Group__6__Impl"


    // $ANTLR start "rule__RoomAlias__Group_5__0"
    // InternalRinform.g:1255:1: rule__RoomAlias__Group_5__0 : rule__RoomAlias__Group_5__0__Impl rule__RoomAlias__Group_5__1 ;
    public final void rule__RoomAlias__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1259:1: ( rule__RoomAlias__Group_5__0__Impl rule__RoomAlias__Group_5__1 )
            // InternalRinform.g:1260:2: rule__RoomAlias__Group_5__0__Impl rule__RoomAlias__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__RoomAlias__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoomAlias__Group_5__1();

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
    // $ANTLR end "rule__RoomAlias__Group_5__0"


    // $ANTLR start "rule__RoomAlias__Group_5__0__Impl"
    // InternalRinform.g:1267:1: rule__RoomAlias__Group_5__0__Impl : ( '[' ) ;
    public final void rule__RoomAlias__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1271:1: ( ( '[' ) )
            // InternalRinform.g:1272:1: ( '[' )
            {
            // InternalRinform.g:1272:1: ( '[' )
            // InternalRinform.g:1273:2: '['
            {
             before(grammarAccess.getRoomAliasAccess().getLeftSquareBracketKeyword_5_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getRoomAliasAccess().getLeftSquareBracketKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoomAlias__Group_5__0__Impl"


    // $ANTLR start "rule__RoomAlias__Group_5__1"
    // InternalRinform.g:1282:1: rule__RoomAlias__Group_5__1 : rule__RoomAlias__Group_5__1__Impl rule__RoomAlias__Group_5__2 ;
    public final void rule__RoomAlias__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1286:1: ( rule__RoomAlias__Group_5__1__Impl rule__RoomAlias__Group_5__2 )
            // InternalRinform.g:1287:2: rule__RoomAlias__Group_5__1__Impl rule__RoomAlias__Group_5__2
            {
            pushFollow(FOLLOW_8);
            rule__RoomAlias__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoomAlias__Group_5__2();

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
    // $ANTLR end "rule__RoomAlias__Group_5__1"


    // $ANTLR start "rule__RoomAlias__Group_5__1__Impl"
    // InternalRinform.g:1294:1: rule__RoomAlias__Group_5__1__Impl : ( ( ( rule__RoomAlias__AliasesAssignment_5_1 ) ) ( ( rule__RoomAlias__AliasesAssignment_5_1 )* ) ) ;
    public final void rule__RoomAlias__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1298:1: ( ( ( ( rule__RoomAlias__AliasesAssignment_5_1 ) ) ( ( rule__RoomAlias__AliasesAssignment_5_1 )* ) ) )
            // InternalRinform.g:1299:1: ( ( ( rule__RoomAlias__AliasesAssignment_5_1 ) ) ( ( rule__RoomAlias__AliasesAssignment_5_1 )* ) )
            {
            // InternalRinform.g:1299:1: ( ( ( rule__RoomAlias__AliasesAssignment_5_1 ) ) ( ( rule__RoomAlias__AliasesAssignment_5_1 )* ) )
            // InternalRinform.g:1300:2: ( ( rule__RoomAlias__AliasesAssignment_5_1 ) ) ( ( rule__RoomAlias__AliasesAssignment_5_1 )* )
            {
            // InternalRinform.g:1300:2: ( ( rule__RoomAlias__AliasesAssignment_5_1 ) )
            // InternalRinform.g:1301:3: ( rule__RoomAlias__AliasesAssignment_5_1 )
            {
             before(grammarAccess.getRoomAliasAccess().getAliasesAssignment_5_1()); 
            // InternalRinform.g:1302:3: ( rule__RoomAlias__AliasesAssignment_5_1 )
            // InternalRinform.g:1302:4: rule__RoomAlias__AliasesAssignment_5_1
            {
            pushFollow(FOLLOW_3);
            rule__RoomAlias__AliasesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getRoomAliasAccess().getAliasesAssignment_5_1()); 

            }

            // InternalRinform.g:1305:2: ( ( rule__RoomAlias__AliasesAssignment_5_1 )* )
            // InternalRinform.g:1306:3: ( rule__RoomAlias__AliasesAssignment_5_1 )*
            {
             before(grammarAccess.getRoomAliasAccess().getAliasesAssignment_5_1()); 
            // InternalRinform.g:1307:3: ( rule__RoomAlias__AliasesAssignment_5_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=RULE_ID && LA11_0<=RULE_WS)||(LA11_0>=11 && LA11_0<=21)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalRinform.g:1307:4: rule__RoomAlias__AliasesAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__RoomAlias__AliasesAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getRoomAliasAccess().getAliasesAssignment_5_1()); 

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
    // $ANTLR end "rule__RoomAlias__Group_5__1__Impl"


    // $ANTLR start "rule__RoomAlias__Group_5__2"
    // InternalRinform.g:1316:1: rule__RoomAlias__Group_5__2 : rule__RoomAlias__Group_5__2__Impl rule__RoomAlias__Group_5__3 ;
    public final void rule__RoomAlias__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1320:1: ( rule__RoomAlias__Group_5__2__Impl rule__RoomAlias__Group_5__3 )
            // InternalRinform.g:1321:2: rule__RoomAlias__Group_5__2__Impl rule__RoomAlias__Group_5__3
            {
            pushFollow(FOLLOW_10);
            rule__RoomAlias__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoomAlias__Group_5__3();

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
    // $ANTLR end "rule__RoomAlias__Group_5__2"


    // $ANTLR start "rule__RoomAlias__Group_5__2__Impl"
    // InternalRinform.g:1328:1: rule__RoomAlias__Group_5__2__Impl : ( ']' ) ;
    public final void rule__RoomAlias__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1332:1: ( ( ']' ) )
            // InternalRinform.g:1333:1: ( ']' )
            {
            // InternalRinform.g:1333:1: ( ']' )
            // InternalRinform.g:1334:2: ']'
            {
             before(grammarAccess.getRoomAliasAccess().getRightSquareBracketKeyword_5_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getRoomAliasAccess().getRightSquareBracketKeyword_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoomAlias__Group_5__2__Impl"


    // $ANTLR start "rule__RoomAlias__Group_5__3"
    // InternalRinform.g:1343:1: rule__RoomAlias__Group_5__3 : rule__RoomAlias__Group_5__3__Impl ;
    public final void rule__RoomAlias__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1347:1: ( rule__RoomAlias__Group_5__3__Impl )
            // InternalRinform.g:1348:2: rule__RoomAlias__Group_5__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RoomAlias__Group_5__3__Impl();

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
    // $ANTLR end "rule__RoomAlias__Group_5__3"


    // $ANTLR start "rule__RoomAlias__Group_5__3__Impl"
    // InternalRinform.g:1354:1: rule__RoomAlias__Group_5__3__Impl : ( '=' ) ;
    public final void rule__RoomAlias__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1358:1: ( ( '=' ) )
            // InternalRinform.g:1359:1: ( '=' )
            {
            // InternalRinform.g:1359:1: ( '=' )
            // InternalRinform.g:1360:2: '='
            {
             before(grammarAccess.getRoomAliasAccess().getEqualsSignKeyword_5_3()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getRoomAliasAccess().getEqualsSignKeyword_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoomAlias__Group_5__3__Impl"


    // $ANTLR start "rule__RoomAlias__Group_6__0"
    // InternalRinform.g:1370:1: rule__RoomAlias__Group_6__0 : rule__RoomAlias__Group_6__0__Impl rule__RoomAlias__Group_6__1 ;
    public final void rule__RoomAlias__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1374:1: ( rule__RoomAlias__Group_6__0__Impl rule__RoomAlias__Group_6__1 )
            // InternalRinform.g:1375:2: rule__RoomAlias__Group_6__0__Impl rule__RoomAlias__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__RoomAlias__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoomAlias__Group_6__1();

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
    // $ANTLR end "rule__RoomAlias__Group_6__0"


    // $ANTLR start "rule__RoomAlias__Group_6__0__Impl"
    // InternalRinform.g:1382:1: rule__RoomAlias__Group_6__0__Impl : ( '[' ) ;
    public final void rule__RoomAlias__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1386:1: ( ( '[' ) )
            // InternalRinform.g:1387:1: ( '[' )
            {
            // InternalRinform.g:1387:1: ( '[' )
            // InternalRinform.g:1388:2: '['
            {
             before(grammarAccess.getRoomAliasAccess().getLeftSquareBracketKeyword_6_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getRoomAliasAccess().getLeftSquareBracketKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoomAlias__Group_6__0__Impl"


    // $ANTLR start "rule__RoomAlias__Group_6__1"
    // InternalRinform.g:1397:1: rule__RoomAlias__Group_6__1 : rule__RoomAlias__Group_6__1__Impl rule__RoomAlias__Group_6__2 ;
    public final void rule__RoomAlias__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1401:1: ( rule__RoomAlias__Group_6__1__Impl rule__RoomAlias__Group_6__2 )
            // InternalRinform.g:1402:2: rule__RoomAlias__Group_6__1__Impl rule__RoomAlias__Group_6__2
            {
            pushFollow(FOLLOW_8);
            rule__RoomAlias__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoomAlias__Group_6__2();

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
    // $ANTLR end "rule__RoomAlias__Group_6__1"


    // $ANTLR start "rule__RoomAlias__Group_6__1__Impl"
    // InternalRinform.g:1409:1: rule__RoomAlias__Group_6__1__Impl : ( ( ( rule__RoomAlias__AliasesAssignment_6_1 ) ) ( ( rule__RoomAlias__AliasesAssignment_6_1 )* ) ) ;
    public final void rule__RoomAlias__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1413:1: ( ( ( ( rule__RoomAlias__AliasesAssignment_6_1 ) ) ( ( rule__RoomAlias__AliasesAssignment_6_1 )* ) ) )
            // InternalRinform.g:1414:1: ( ( ( rule__RoomAlias__AliasesAssignment_6_1 ) ) ( ( rule__RoomAlias__AliasesAssignment_6_1 )* ) )
            {
            // InternalRinform.g:1414:1: ( ( ( rule__RoomAlias__AliasesAssignment_6_1 ) ) ( ( rule__RoomAlias__AliasesAssignment_6_1 )* ) )
            // InternalRinform.g:1415:2: ( ( rule__RoomAlias__AliasesAssignment_6_1 ) ) ( ( rule__RoomAlias__AliasesAssignment_6_1 )* )
            {
            // InternalRinform.g:1415:2: ( ( rule__RoomAlias__AliasesAssignment_6_1 ) )
            // InternalRinform.g:1416:3: ( rule__RoomAlias__AliasesAssignment_6_1 )
            {
             before(grammarAccess.getRoomAliasAccess().getAliasesAssignment_6_1()); 
            // InternalRinform.g:1417:3: ( rule__RoomAlias__AliasesAssignment_6_1 )
            // InternalRinform.g:1417:4: rule__RoomAlias__AliasesAssignment_6_1
            {
            pushFollow(FOLLOW_3);
            rule__RoomAlias__AliasesAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getRoomAliasAccess().getAliasesAssignment_6_1()); 

            }

            // InternalRinform.g:1420:2: ( ( rule__RoomAlias__AliasesAssignment_6_1 )* )
            // InternalRinform.g:1421:3: ( rule__RoomAlias__AliasesAssignment_6_1 )*
            {
             before(grammarAccess.getRoomAliasAccess().getAliasesAssignment_6_1()); 
            // InternalRinform.g:1422:3: ( rule__RoomAlias__AliasesAssignment_6_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_ID && LA12_0<=RULE_WS)||(LA12_0>=11 && LA12_0<=21)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalRinform.g:1422:4: rule__RoomAlias__AliasesAssignment_6_1
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__RoomAlias__AliasesAssignment_6_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getRoomAliasAccess().getAliasesAssignment_6_1()); 

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
    // $ANTLR end "rule__RoomAlias__Group_6__1__Impl"


    // $ANTLR start "rule__RoomAlias__Group_6__2"
    // InternalRinform.g:1431:1: rule__RoomAlias__Group_6__2 : rule__RoomAlias__Group_6__2__Impl ;
    public final void rule__RoomAlias__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1435:1: ( rule__RoomAlias__Group_6__2__Impl )
            // InternalRinform.g:1436:2: rule__RoomAlias__Group_6__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RoomAlias__Group_6__2__Impl();

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
    // $ANTLR end "rule__RoomAlias__Group_6__2"


    // $ANTLR start "rule__RoomAlias__Group_6__2__Impl"
    // InternalRinform.g:1442:1: rule__RoomAlias__Group_6__2__Impl : ( ']' ) ;
    public final void rule__RoomAlias__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1446:1: ( ( ']' ) )
            // InternalRinform.g:1447:1: ( ']' )
            {
            // InternalRinform.g:1447:1: ( ']' )
            // InternalRinform.g:1448:2: ']'
            {
             before(grammarAccess.getRoomAliasAccess().getRightSquareBracketKeyword_6_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getRoomAliasAccess().getRightSquareBracketKeyword_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoomAlias__Group_6__2__Impl"


    // $ANTLR start "rule__ContainerDeclaration__Group__0"
    // InternalRinform.g:1458:1: rule__ContainerDeclaration__Group__0 : rule__ContainerDeclaration__Group__0__Impl rule__ContainerDeclaration__Group__1 ;
    public final void rule__ContainerDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1462:1: ( rule__ContainerDeclaration__Group__0__Impl rule__ContainerDeclaration__Group__1 )
            // InternalRinform.g:1463:2: rule__ContainerDeclaration__Group__0__Impl rule__ContainerDeclaration__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalRinform.g:1470:1: rule__ContainerDeclaration__Group__0__Impl : ( 'c-' ) ;
    public final void rule__ContainerDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1474:1: ( ( 'c-' ) )
            // InternalRinform.g:1475:1: ( 'c-' )
            {
            // InternalRinform.g:1475:1: ( 'c-' )
            // InternalRinform.g:1476:2: 'c-'
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
    // InternalRinform.g:1485:1: rule__ContainerDeclaration__Group__1 : rule__ContainerDeclaration__Group__1__Impl rule__ContainerDeclaration__Group__2 ;
    public final void rule__ContainerDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1489:1: ( rule__ContainerDeclaration__Group__1__Impl rule__ContainerDeclaration__Group__2 )
            // InternalRinform.g:1490:2: rule__ContainerDeclaration__Group__1__Impl rule__ContainerDeclaration__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalRinform.g:1497:1: rule__ContainerDeclaration__Group__1__Impl : ( ( rule__ContainerDeclaration__NameAssignment_1 ) ) ;
    public final void rule__ContainerDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1501:1: ( ( ( rule__ContainerDeclaration__NameAssignment_1 ) ) )
            // InternalRinform.g:1502:1: ( ( rule__ContainerDeclaration__NameAssignment_1 ) )
            {
            // InternalRinform.g:1502:1: ( ( rule__ContainerDeclaration__NameAssignment_1 ) )
            // InternalRinform.g:1503:2: ( rule__ContainerDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getContainerDeclarationAccess().getNameAssignment_1()); 
            // InternalRinform.g:1504:2: ( rule__ContainerDeclaration__NameAssignment_1 )
            // InternalRinform.g:1504:3: rule__ContainerDeclaration__NameAssignment_1
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
    // InternalRinform.g:1512:1: rule__ContainerDeclaration__Group__2 : rule__ContainerDeclaration__Group__2__Impl rule__ContainerDeclaration__Group__3 ;
    public final void rule__ContainerDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1516:1: ( rule__ContainerDeclaration__Group__2__Impl rule__ContainerDeclaration__Group__3 )
            // InternalRinform.g:1517:2: rule__ContainerDeclaration__Group__2__Impl rule__ContainerDeclaration__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalRinform.g:1524:1: rule__ContainerDeclaration__Group__2__Impl : ( '-c' ) ;
    public final void rule__ContainerDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1528:1: ( ( '-c' ) )
            // InternalRinform.g:1529:1: ( '-c' )
            {
            // InternalRinform.g:1529:1: ( '-c' )
            // InternalRinform.g:1530:2: '-c'
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
    // InternalRinform.g:1539:1: rule__ContainerDeclaration__Group__3 : rule__ContainerDeclaration__Group__3__Impl rule__ContainerDeclaration__Group__4 ;
    public final void rule__ContainerDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1543:1: ( rule__ContainerDeclaration__Group__3__Impl rule__ContainerDeclaration__Group__4 )
            // InternalRinform.g:1544:2: rule__ContainerDeclaration__Group__3__Impl rule__ContainerDeclaration__Group__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalRinform.g:1551:1: rule__ContainerDeclaration__Group__3__Impl : ( '!r' ) ;
    public final void rule__ContainerDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1555:1: ( ( '!r' ) )
            // InternalRinform.g:1556:1: ( '!r' )
            {
            // InternalRinform.g:1556:1: ( '!r' )
            // InternalRinform.g:1557:2: '!r'
            {
             before(grammarAccess.getContainerDeclarationAccess().getRKeyword_3()); 
            match(input,31,FOLLOW_2); 
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
    // InternalRinform.g:1566:1: rule__ContainerDeclaration__Group__4 : rule__ContainerDeclaration__Group__4__Impl rule__ContainerDeclaration__Group__5 ;
    public final void rule__ContainerDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1570:1: ( rule__ContainerDeclaration__Group__4__Impl rule__ContainerDeclaration__Group__5 )
            // InternalRinform.g:1571:2: rule__ContainerDeclaration__Group__4__Impl rule__ContainerDeclaration__Group__5
            {
            pushFollow(FOLLOW_4);
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
    // InternalRinform.g:1578:1: rule__ContainerDeclaration__Group__4__Impl : ( '[' ) ;
    public final void rule__ContainerDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1582:1: ( ( '[' ) )
            // InternalRinform.g:1583:1: ( '[' )
            {
            // InternalRinform.g:1583:1: ( '[' )
            // InternalRinform.g:1584:2: '['
            {
             before(grammarAccess.getContainerDeclarationAccess().getLeftSquareBracketKeyword_4()); 
            match(input,32,FOLLOW_2); 
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
    // InternalRinform.g:1593:1: rule__ContainerDeclaration__Group__5 : rule__ContainerDeclaration__Group__5__Impl rule__ContainerDeclaration__Group__6 ;
    public final void rule__ContainerDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1597:1: ( rule__ContainerDeclaration__Group__5__Impl rule__ContainerDeclaration__Group__6 )
            // InternalRinform.g:1598:2: rule__ContainerDeclaration__Group__5__Impl rule__ContainerDeclaration__Group__6
            {
            pushFollow(FOLLOW_8);
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
    // InternalRinform.g:1605:1: rule__ContainerDeclaration__Group__5__Impl : ( ( rule__ContainerDeclaration__RoomAssignment_5 ) ) ;
    public final void rule__ContainerDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1609:1: ( ( ( rule__ContainerDeclaration__RoomAssignment_5 ) ) )
            // InternalRinform.g:1610:1: ( ( rule__ContainerDeclaration__RoomAssignment_5 ) )
            {
            // InternalRinform.g:1610:1: ( ( rule__ContainerDeclaration__RoomAssignment_5 ) )
            // InternalRinform.g:1611:2: ( rule__ContainerDeclaration__RoomAssignment_5 )
            {
             before(grammarAccess.getContainerDeclarationAccess().getRoomAssignment_5()); 
            // InternalRinform.g:1612:2: ( rule__ContainerDeclaration__RoomAssignment_5 )
            // InternalRinform.g:1612:3: rule__ContainerDeclaration__RoomAssignment_5
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
    // InternalRinform.g:1620:1: rule__ContainerDeclaration__Group__6 : rule__ContainerDeclaration__Group__6__Impl ;
    public final void rule__ContainerDeclaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1624:1: ( rule__ContainerDeclaration__Group__6__Impl )
            // InternalRinform.g:1625:2: rule__ContainerDeclaration__Group__6__Impl
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
    // InternalRinform.g:1631:1: rule__ContainerDeclaration__Group__6__Impl : ( ']' ) ;
    public final void rule__ContainerDeclaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1635:1: ( ( ']' ) )
            // InternalRinform.g:1636:1: ( ']' )
            {
            // InternalRinform.g:1636:1: ( ']' )
            // InternalRinform.g:1637:2: ']'
            {
             before(grammarAccess.getContainerDeclarationAccess().getRightSquareBracketKeyword_6()); 
            match(input,33,FOLLOW_2); 
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
    // InternalRinform.g:1647:1: rule__ItemInRoomDeclaration__Group__0 : rule__ItemInRoomDeclaration__Group__0__Impl rule__ItemInRoomDeclaration__Group__1 ;
    public final void rule__ItemInRoomDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1651:1: ( rule__ItemInRoomDeclaration__Group__0__Impl rule__ItemInRoomDeclaration__Group__1 )
            // InternalRinform.g:1652:2: rule__ItemInRoomDeclaration__Group__0__Impl rule__ItemInRoomDeclaration__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalRinform.g:1659:1: rule__ItemInRoomDeclaration__Group__0__Impl : ( 'i-' ) ;
    public final void rule__ItemInRoomDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1663:1: ( ( 'i-' ) )
            // InternalRinform.g:1664:1: ( 'i-' )
            {
            // InternalRinform.g:1664:1: ( 'i-' )
            // InternalRinform.g:1665:2: 'i-'
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
    // InternalRinform.g:1674:1: rule__ItemInRoomDeclaration__Group__1 : rule__ItemInRoomDeclaration__Group__1__Impl rule__ItemInRoomDeclaration__Group__2 ;
    public final void rule__ItemInRoomDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1678:1: ( rule__ItemInRoomDeclaration__Group__1__Impl rule__ItemInRoomDeclaration__Group__2 )
            // InternalRinform.g:1679:2: rule__ItemInRoomDeclaration__Group__1__Impl rule__ItemInRoomDeclaration__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalRinform.g:1686:1: rule__ItemInRoomDeclaration__Group__1__Impl : ( ( rule__ItemInRoomDeclaration__NameAssignment_1 ) ) ;
    public final void rule__ItemInRoomDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1690:1: ( ( ( rule__ItemInRoomDeclaration__NameAssignment_1 ) ) )
            // InternalRinform.g:1691:1: ( ( rule__ItemInRoomDeclaration__NameAssignment_1 ) )
            {
            // InternalRinform.g:1691:1: ( ( rule__ItemInRoomDeclaration__NameAssignment_1 ) )
            // InternalRinform.g:1692:2: ( rule__ItemInRoomDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getItemInRoomDeclarationAccess().getNameAssignment_1()); 
            // InternalRinform.g:1693:2: ( rule__ItemInRoomDeclaration__NameAssignment_1 )
            // InternalRinform.g:1693:3: rule__ItemInRoomDeclaration__NameAssignment_1
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
    // InternalRinform.g:1701:1: rule__ItemInRoomDeclaration__Group__2 : rule__ItemInRoomDeclaration__Group__2__Impl rule__ItemInRoomDeclaration__Group__3 ;
    public final void rule__ItemInRoomDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1705:1: ( rule__ItemInRoomDeclaration__Group__2__Impl rule__ItemInRoomDeclaration__Group__3 )
            // InternalRinform.g:1706:2: rule__ItemInRoomDeclaration__Group__2__Impl rule__ItemInRoomDeclaration__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalRinform.g:1713:1: rule__ItemInRoomDeclaration__Group__2__Impl : ( '-i' ) ;
    public final void rule__ItemInRoomDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1717:1: ( ( '-i' ) )
            // InternalRinform.g:1718:1: ( '-i' )
            {
            // InternalRinform.g:1718:1: ( '-i' )
            // InternalRinform.g:1719:2: '-i'
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
    // InternalRinform.g:1728:1: rule__ItemInRoomDeclaration__Group__3 : rule__ItemInRoomDeclaration__Group__3__Impl rule__ItemInRoomDeclaration__Group__4 ;
    public final void rule__ItemInRoomDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1732:1: ( rule__ItemInRoomDeclaration__Group__3__Impl rule__ItemInRoomDeclaration__Group__4 )
            // InternalRinform.g:1733:2: rule__ItemInRoomDeclaration__Group__3__Impl rule__ItemInRoomDeclaration__Group__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalRinform.g:1740:1: rule__ItemInRoomDeclaration__Group__3__Impl : ( '!r' ) ;
    public final void rule__ItemInRoomDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1744:1: ( ( '!r' ) )
            // InternalRinform.g:1745:1: ( '!r' )
            {
            // InternalRinform.g:1745:1: ( '!r' )
            // InternalRinform.g:1746:2: '!r'
            {
             before(grammarAccess.getItemInRoomDeclarationAccess().getRKeyword_3()); 
            match(input,31,FOLLOW_2); 
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
    // InternalRinform.g:1755:1: rule__ItemInRoomDeclaration__Group__4 : rule__ItemInRoomDeclaration__Group__4__Impl rule__ItemInRoomDeclaration__Group__5 ;
    public final void rule__ItemInRoomDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1759:1: ( rule__ItemInRoomDeclaration__Group__4__Impl rule__ItemInRoomDeclaration__Group__5 )
            // InternalRinform.g:1760:2: rule__ItemInRoomDeclaration__Group__4__Impl rule__ItemInRoomDeclaration__Group__5
            {
            pushFollow(FOLLOW_4);
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
    // InternalRinform.g:1767:1: rule__ItemInRoomDeclaration__Group__4__Impl : ( '[' ) ;
    public final void rule__ItemInRoomDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1771:1: ( ( '[' ) )
            // InternalRinform.g:1772:1: ( '[' )
            {
            // InternalRinform.g:1772:1: ( '[' )
            // InternalRinform.g:1773:2: '['
            {
             before(grammarAccess.getItemInRoomDeclarationAccess().getLeftSquareBracketKeyword_4()); 
            match(input,32,FOLLOW_2); 
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
    // InternalRinform.g:1782:1: rule__ItemInRoomDeclaration__Group__5 : rule__ItemInRoomDeclaration__Group__5__Impl rule__ItemInRoomDeclaration__Group__6 ;
    public final void rule__ItemInRoomDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1786:1: ( rule__ItemInRoomDeclaration__Group__5__Impl rule__ItemInRoomDeclaration__Group__6 )
            // InternalRinform.g:1787:2: rule__ItemInRoomDeclaration__Group__5__Impl rule__ItemInRoomDeclaration__Group__6
            {
            pushFollow(FOLLOW_8);
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
    // InternalRinform.g:1794:1: rule__ItemInRoomDeclaration__Group__5__Impl : ( ( rule__ItemInRoomDeclaration__RoomAssignment_5 ) ) ;
    public final void rule__ItemInRoomDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1798:1: ( ( ( rule__ItemInRoomDeclaration__RoomAssignment_5 ) ) )
            // InternalRinform.g:1799:1: ( ( rule__ItemInRoomDeclaration__RoomAssignment_5 ) )
            {
            // InternalRinform.g:1799:1: ( ( rule__ItemInRoomDeclaration__RoomAssignment_5 ) )
            // InternalRinform.g:1800:2: ( rule__ItemInRoomDeclaration__RoomAssignment_5 )
            {
             before(grammarAccess.getItemInRoomDeclarationAccess().getRoomAssignment_5()); 
            // InternalRinform.g:1801:2: ( rule__ItemInRoomDeclaration__RoomAssignment_5 )
            // InternalRinform.g:1801:3: rule__ItemInRoomDeclaration__RoomAssignment_5
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
    // InternalRinform.g:1809:1: rule__ItemInRoomDeclaration__Group__6 : rule__ItemInRoomDeclaration__Group__6__Impl ;
    public final void rule__ItemInRoomDeclaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1813:1: ( rule__ItemInRoomDeclaration__Group__6__Impl )
            // InternalRinform.g:1814:2: rule__ItemInRoomDeclaration__Group__6__Impl
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
    // InternalRinform.g:1820:1: rule__ItemInRoomDeclaration__Group__6__Impl : ( ']' ) ;
    public final void rule__ItemInRoomDeclaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1824:1: ( ( ']' ) )
            // InternalRinform.g:1825:1: ( ']' )
            {
            // InternalRinform.g:1825:1: ( ']' )
            // InternalRinform.g:1826:2: ']'
            {
             before(grammarAccess.getItemInRoomDeclarationAccess().getRightSquareBracketKeyword_6()); 
            match(input,33,FOLLOW_2); 
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
    // InternalRinform.g:1836:1: rule__ItemInContainerDeclaration__Group__0 : rule__ItemInContainerDeclaration__Group__0__Impl rule__ItemInContainerDeclaration__Group__1 ;
    public final void rule__ItemInContainerDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1840:1: ( rule__ItemInContainerDeclaration__Group__0__Impl rule__ItemInContainerDeclaration__Group__1 )
            // InternalRinform.g:1841:2: rule__ItemInContainerDeclaration__Group__0__Impl rule__ItemInContainerDeclaration__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalRinform.g:1848:1: rule__ItemInContainerDeclaration__Group__0__Impl : ( 'i-' ) ;
    public final void rule__ItemInContainerDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1852:1: ( ( 'i-' ) )
            // InternalRinform.g:1853:1: ( 'i-' )
            {
            // InternalRinform.g:1853:1: ( 'i-' )
            // InternalRinform.g:1854:2: 'i-'
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
    // InternalRinform.g:1863:1: rule__ItemInContainerDeclaration__Group__1 : rule__ItemInContainerDeclaration__Group__1__Impl rule__ItemInContainerDeclaration__Group__2 ;
    public final void rule__ItemInContainerDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1867:1: ( rule__ItemInContainerDeclaration__Group__1__Impl rule__ItemInContainerDeclaration__Group__2 )
            // InternalRinform.g:1868:2: rule__ItemInContainerDeclaration__Group__1__Impl rule__ItemInContainerDeclaration__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalRinform.g:1875:1: rule__ItemInContainerDeclaration__Group__1__Impl : ( ( rule__ItemInContainerDeclaration__NameAssignment_1 ) ) ;
    public final void rule__ItemInContainerDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1879:1: ( ( ( rule__ItemInContainerDeclaration__NameAssignment_1 ) ) )
            // InternalRinform.g:1880:1: ( ( rule__ItemInContainerDeclaration__NameAssignment_1 ) )
            {
            // InternalRinform.g:1880:1: ( ( rule__ItemInContainerDeclaration__NameAssignment_1 ) )
            // InternalRinform.g:1881:2: ( rule__ItemInContainerDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getItemInContainerDeclarationAccess().getNameAssignment_1()); 
            // InternalRinform.g:1882:2: ( rule__ItemInContainerDeclaration__NameAssignment_1 )
            // InternalRinform.g:1882:3: rule__ItemInContainerDeclaration__NameAssignment_1
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
    // InternalRinform.g:1890:1: rule__ItemInContainerDeclaration__Group__2 : rule__ItemInContainerDeclaration__Group__2__Impl rule__ItemInContainerDeclaration__Group__3 ;
    public final void rule__ItemInContainerDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1894:1: ( rule__ItemInContainerDeclaration__Group__2__Impl rule__ItemInContainerDeclaration__Group__3 )
            // InternalRinform.g:1895:2: rule__ItemInContainerDeclaration__Group__2__Impl rule__ItemInContainerDeclaration__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalRinform.g:1902:1: rule__ItemInContainerDeclaration__Group__2__Impl : ( '-i' ) ;
    public final void rule__ItemInContainerDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1906:1: ( ( '-i' ) )
            // InternalRinform.g:1907:1: ( '-i' )
            {
            // InternalRinform.g:1907:1: ( '-i' )
            // InternalRinform.g:1908:2: '-i'
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
    // InternalRinform.g:1917:1: rule__ItemInContainerDeclaration__Group__3 : rule__ItemInContainerDeclaration__Group__3__Impl rule__ItemInContainerDeclaration__Group__4 ;
    public final void rule__ItemInContainerDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1921:1: ( rule__ItemInContainerDeclaration__Group__3__Impl rule__ItemInContainerDeclaration__Group__4 )
            // InternalRinform.g:1922:2: rule__ItemInContainerDeclaration__Group__3__Impl rule__ItemInContainerDeclaration__Group__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalRinform.g:1929:1: rule__ItemInContainerDeclaration__Group__3__Impl : ( '!c' ) ;
    public final void rule__ItemInContainerDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1933:1: ( ( '!c' ) )
            // InternalRinform.g:1934:1: ( '!c' )
            {
            // InternalRinform.g:1934:1: ( '!c' )
            // InternalRinform.g:1935:2: '!c'
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
    // InternalRinform.g:1944:1: rule__ItemInContainerDeclaration__Group__4 : rule__ItemInContainerDeclaration__Group__4__Impl rule__ItemInContainerDeclaration__Group__5 ;
    public final void rule__ItemInContainerDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1948:1: ( rule__ItemInContainerDeclaration__Group__4__Impl rule__ItemInContainerDeclaration__Group__5 )
            // InternalRinform.g:1949:2: rule__ItemInContainerDeclaration__Group__4__Impl rule__ItemInContainerDeclaration__Group__5
            {
            pushFollow(FOLLOW_4);
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
    // InternalRinform.g:1956:1: rule__ItemInContainerDeclaration__Group__4__Impl : ( '[' ) ;
    public final void rule__ItemInContainerDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1960:1: ( ( '[' ) )
            // InternalRinform.g:1961:1: ( '[' )
            {
            // InternalRinform.g:1961:1: ( '[' )
            // InternalRinform.g:1962:2: '['
            {
             before(grammarAccess.getItemInContainerDeclarationAccess().getLeftSquareBracketKeyword_4()); 
            match(input,32,FOLLOW_2); 
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
    // InternalRinform.g:1971:1: rule__ItemInContainerDeclaration__Group__5 : rule__ItemInContainerDeclaration__Group__5__Impl rule__ItemInContainerDeclaration__Group__6 ;
    public final void rule__ItemInContainerDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1975:1: ( rule__ItemInContainerDeclaration__Group__5__Impl rule__ItemInContainerDeclaration__Group__6 )
            // InternalRinform.g:1976:2: rule__ItemInContainerDeclaration__Group__5__Impl rule__ItemInContainerDeclaration__Group__6
            {
            pushFollow(FOLLOW_8);
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
    // InternalRinform.g:1983:1: rule__ItemInContainerDeclaration__Group__5__Impl : ( ( rule__ItemInContainerDeclaration__ContainerAssignment_5 ) ) ;
    public final void rule__ItemInContainerDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1987:1: ( ( ( rule__ItemInContainerDeclaration__ContainerAssignment_5 ) ) )
            // InternalRinform.g:1988:1: ( ( rule__ItemInContainerDeclaration__ContainerAssignment_5 ) )
            {
            // InternalRinform.g:1988:1: ( ( rule__ItemInContainerDeclaration__ContainerAssignment_5 ) )
            // InternalRinform.g:1989:2: ( rule__ItemInContainerDeclaration__ContainerAssignment_5 )
            {
             before(grammarAccess.getItemInContainerDeclarationAccess().getContainerAssignment_5()); 
            // InternalRinform.g:1990:2: ( rule__ItemInContainerDeclaration__ContainerAssignment_5 )
            // InternalRinform.g:1990:3: rule__ItemInContainerDeclaration__ContainerAssignment_5
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
    // InternalRinform.g:1998:1: rule__ItemInContainerDeclaration__Group__6 : rule__ItemInContainerDeclaration__Group__6__Impl ;
    public final void rule__ItemInContainerDeclaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2002:1: ( rule__ItemInContainerDeclaration__Group__6__Impl )
            // InternalRinform.g:2003:2: rule__ItemInContainerDeclaration__Group__6__Impl
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
    // InternalRinform.g:2009:1: rule__ItemInContainerDeclaration__Group__6__Impl : ( ']' ) ;
    public final void rule__ItemInContainerDeclaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2013:1: ( ( ']' ) )
            // InternalRinform.g:2014:1: ( ']' )
            {
            // InternalRinform.g:2014:1: ( ']' )
            // InternalRinform.g:2015:2: ']'
            {
             before(grammarAccess.getItemInContainerDeclarationAccess().getRightSquareBracketKeyword_6()); 
            match(input,33,FOLLOW_2); 
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
    // InternalRinform.g:2025:1: rule__ItemDescription__Group__0 : rule__ItemDescription__Group__0__Impl rule__ItemDescription__Group__1 ;
    public final void rule__ItemDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2029:1: ( rule__ItemDescription__Group__0__Impl rule__ItemDescription__Group__1 )
            // InternalRinform.g:2030:2: rule__ItemDescription__Group__0__Impl rule__ItemDescription__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalRinform.g:2037:1: rule__ItemDescription__Group__0__Impl : ( '{' ) ;
    public final void rule__ItemDescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2041:1: ( ( '{' ) )
            // InternalRinform.g:2042:1: ( '{' )
            {
            // InternalRinform.g:2042:1: ( '{' )
            // InternalRinform.g:2043:2: '{'
            {
             before(grammarAccess.getItemDescriptionAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalRinform.g:2052:1: rule__ItemDescription__Group__1 : rule__ItemDescription__Group__1__Impl rule__ItemDescription__Group__2 ;
    public final void rule__ItemDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2056:1: ( rule__ItemDescription__Group__1__Impl rule__ItemDescription__Group__2 )
            // InternalRinform.g:2057:2: rule__ItemDescription__Group__1__Impl rule__ItemDescription__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalRinform.g:2064:1: rule__ItemDescription__Group__1__Impl : ( ( ( rule__ItemDescription__ItemDescriptionAssignment_1 ) ) ( ( rule__ItemDescription__ItemDescriptionAssignment_1 )* ) ) ;
    public final void rule__ItemDescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2068:1: ( ( ( ( rule__ItemDescription__ItemDescriptionAssignment_1 ) ) ( ( rule__ItemDescription__ItemDescriptionAssignment_1 )* ) ) )
            // InternalRinform.g:2069:1: ( ( ( rule__ItemDescription__ItemDescriptionAssignment_1 ) ) ( ( rule__ItemDescription__ItemDescriptionAssignment_1 )* ) )
            {
            // InternalRinform.g:2069:1: ( ( ( rule__ItemDescription__ItemDescriptionAssignment_1 ) ) ( ( rule__ItemDescription__ItemDescriptionAssignment_1 )* ) )
            // InternalRinform.g:2070:2: ( ( rule__ItemDescription__ItemDescriptionAssignment_1 ) ) ( ( rule__ItemDescription__ItemDescriptionAssignment_1 )* )
            {
            // InternalRinform.g:2070:2: ( ( rule__ItemDescription__ItemDescriptionAssignment_1 ) )
            // InternalRinform.g:2071:3: ( rule__ItemDescription__ItemDescriptionAssignment_1 )
            {
             before(grammarAccess.getItemDescriptionAccess().getItemDescriptionAssignment_1()); 
            // InternalRinform.g:2072:3: ( rule__ItemDescription__ItemDescriptionAssignment_1 )
            // InternalRinform.g:2072:4: rule__ItemDescription__ItemDescriptionAssignment_1
            {
            pushFollow(FOLLOW_3);
            rule__ItemDescription__ItemDescriptionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getItemDescriptionAccess().getItemDescriptionAssignment_1()); 

            }

            // InternalRinform.g:2075:2: ( ( rule__ItemDescription__ItemDescriptionAssignment_1 )* )
            // InternalRinform.g:2076:3: ( rule__ItemDescription__ItemDescriptionAssignment_1 )*
            {
             before(grammarAccess.getItemDescriptionAccess().getItemDescriptionAssignment_1()); 
            // InternalRinform.g:2077:3: ( rule__ItemDescription__ItemDescriptionAssignment_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RULE_ID && LA13_0<=RULE_WS)||(LA13_0>=11 && LA13_0<=21)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalRinform.g:2077:4: rule__ItemDescription__ItemDescriptionAssignment_1
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__ItemDescription__ItemDescriptionAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalRinform.g:2086:1: rule__ItemDescription__Group__2 : rule__ItemDescription__Group__2__Impl rule__ItemDescription__Group__3 ;
    public final void rule__ItemDescription__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2090:1: ( rule__ItemDescription__Group__2__Impl rule__ItemDescription__Group__3 )
            // InternalRinform.g:2091:2: rule__ItemDescription__Group__2__Impl rule__ItemDescription__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalRinform.g:2098:1: rule__ItemDescription__Group__2__Impl : ( '!i' ) ;
    public final void rule__ItemDescription__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2102:1: ( ( '!i' ) )
            // InternalRinform.g:2103:1: ( '!i' )
            {
            // InternalRinform.g:2103:1: ( '!i' )
            // InternalRinform.g:2104:2: '!i'
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
    // InternalRinform.g:2113:1: rule__ItemDescription__Group__3 : rule__ItemDescription__Group__3__Impl rule__ItemDescription__Group__4 ;
    public final void rule__ItemDescription__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2117:1: ( rule__ItemDescription__Group__3__Impl rule__ItemDescription__Group__4 )
            // InternalRinform.g:2118:2: rule__ItemDescription__Group__3__Impl rule__ItemDescription__Group__4
            {
            pushFollow(FOLLOW_4);
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
    // InternalRinform.g:2125:1: rule__ItemDescription__Group__3__Impl : ( '[' ) ;
    public final void rule__ItemDescription__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2129:1: ( ( '[' ) )
            // InternalRinform.g:2130:1: ( '[' )
            {
            // InternalRinform.g:2130:1: ( '[' )
            // InternalRinform.g:2131:2: '['
            {
             before(grammarAccess.getItemDescriptionAccess().getLeftSquareBracketKeyword_3()); 
            match(input,32,FOLLOW_2); 
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
    // InternalRinform.g:2140:1: rule__ItemDescription__Group__4 : rule__ItemDescription__Group__4__Impl rule__ItemDescription__Group__5 ;
    public final void rule__ItemDescription__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2144:1: ( rule__ItemDescription__Group__4__Impl rule__ItemDescription__Group__5 )
            // InternalRinform.g:2145:2: rule__ItemDescription__Group__4__Impl rule__ItemDescription__Group__5
            {
            pushFollow(FOLLOW_8);
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
    // InternalRinform.g:2152:1: rule__ItemDescription__Group__4__Impl : ( ( rule__ItemDescription__ItemAssignment_4 ) ) ;
    public final void rule__ItemDescription__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2156:1: ( ( ( rule__ItemDescription__ItemAssignment_4 ) ) )
            // InternalRinform.g:2157:1: ( ( rule__ItemDescription__ItemAssignment_4 ) )
            {
            // InternalRinform.g:2157:1: ( ( rule__ItemDescription__ItemAssignment_4 ) )
            // InternalRinform.g:2158:2: ( rule__ItemDescription__ItemAssignment_4 )
            {
             before(grammarAccess.getItemDescriptionAccess().getItemAssignment_4()); 
            // InternalRinform.g:2159:2: ( rule__ItemDescription__ItemAssignment_4 )
            // InternalRinform.g:2159:3: rule__ItemDescription__ItemAssignment_4
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
    // InternalRinform.g:2167:1: rule__ItemDescription__Group__5 : rule__ItemDescription__Group__5__Impl rule__ItemDescription__Group__6 ;
    public final void rule__ItemDescription__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2171:1: ( rule__ItemDescription__Group__5__Impl rule__ItemDescription__Group__6 )
            // InternalRinform.g:2172:2: rule__ItemDescription__Group__5__Impl rule__ItemDescription__Group__6
            {
            pushFollow(FOLLOW_9);
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
    // InternalRinform.g:2179:1: rule__ItemDescription__Group__5__Impl : ( ']' ) ;
    public final void rule__ItemDescription__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2183:1: ( ( ']' ) )
            // InternalRinform.g:2184:1: ( ']' )
            {
            // InternalRinform.g:2184:1: ( ']' )
            // InternalRinform.g:2185:2: ']'
            {
             before(grammarAccess.getItemDescriptionAccess().getRightSquareBracketKeyword_5()); 
            match(input,33,FOLLOW_2); 
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
    // InternalRinform.g:2194:1: rule__ItemDescription__Group__6 : rule__ItemDescription__Group__6__Impl ;
    public final void rule__ItemDescription__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2198:1: ( rule__ItemDescription__Group__6__Impl )
            // InternalRinform.g:2199:2: rule__ItemDescription__Group__6__Impl
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
    // InternalRinform.g:2205:1: rule__ItemDescription__Group__6__Impl : ( '}' ) ;
    public final void rule__ItemDescription__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2209:1: ( ( '}' ) )
            // InternalRinform.g:2210:1: ( '}' )
            {
            // InternalRinform.g:2210:1: ( '}' )
            // InternalRinform.g:2211:2: '}'
            {
             before(grammarAccess.getItemDescriptionAccess().getRightCurlyBracketKeyword_6()); 
            match(input,34,FOLLOW_2); 
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


    // $ANTLR start "rule__ItemAlias__Group__0"
    // InternalRinform.g:2221:1: rule__ItemAlias__Group__0 : rule__ItemAlias__Group__0__Impl rule__ItemAlias__Group__1 ;
    public final void rule__ItemAlias__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2225:1: ( rule__ItemAlias__Group__0__Impl rule__ItemAlias__Group__1 )
            // InternalRinform.g:2226:2: rule__ItemAlias__Group__0__Impl rule__ItemAlias__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__ItemAlias__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ItemAlias__Group__1();

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
    // $ANTLR end "rule__ItemAlias__Group__0"


    // $ANTLR start "rule__ItemAlias__Group__0__Impl"
    // InternalRinform.g:2233:1: rule__ItemAlias__Group__0__Impl : ( '!i' ) ;
    public final void rule__ItemAlias__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2237:1: ( ( '!i' ) )
            // InternalRinform.g:2238:1: ( '!i' )
            {
            // InternalRinform.g:2238:1: ( '!i' )
            // InternalRinform.g:2239:2: '!i'
            {
             before(grammarAccess.getItemAliasAccess().getIKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getItemAliasAccess().getIKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemAlias__Group__0__Impl"


    // $ANTLR start "rule__ItemAlias__Group__1"
    // InternalRinform.g:2248:1: rule__ItemAlias__Group__1 : rule__ItemAlias__Group__1__Impl rule__ItemAlias__Group__2 ;
    public final void rule__ItemAlias__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2252:1: ( rule__ItemAlias__Group__1__Impl rule__ItemAlias__Group__2 )
            // InternalRinform.g:2253:2: rule__ItemAlias__Group__1__Impl rule__ItemAlias__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ItemAlias__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ItemAlias__Group__2();

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
    // $ANTLR end "rule__ItemAlias__Group__1"


    // $ANTLR start "rule__ItemAlias__Group__1__Impl"
    // InternalRinform.g:2260:1: rule__ItemAlias__Group__1__Impl : ( '[' ) ;
    public final void rule__ItemAlias__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2264:1: ( ( '[' ) )
            // InternalRinform.g:2265:1: ( '[' )
            {
            // InternalRinform.g:2265:1: ( '[' )
            // InternalRinform.g:2266:2: '['
            {
             before(grammarAccess.getItemAliasAccess().getLeftSquareBracketKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getItemAliasAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemAlias__Group__1__Impl"


    // $ANTLR start "rule__ItemAlias__Group__2"
    // InternalRinform.g:2275:1: rule__ItemAlias__Group__2 : rule__ItemAlias__Group__2__Impl rule__ItemAlias__Group__3 ;
    public final void rule__ItemAlias__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2279:1: ( rule__ItemAlias__Group__2__Impl rule__ItemAlias__Group__3 )
            // InternalRinform.g:2280:2: rule__ItemAlias__Group__2__Impl rule__ItemAlias__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__ItemAlias__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ItemAlias__Group__3();

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
    // $ANTLR end "rule__ItemAlias__Group__2"


    // $ANTLR start "rule__ItemAlias__Group__2__Impl"
    // InternalRinform.g:2287:1: rule__ItemAlias__Group__2__Impl : ( ( rule__ItemAlias__ItemAssignment_2 ) ) ;
    public final void rule__ItemAlias__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2291:1: ( ( ( rule__ItemAlias__ItemAssignment_2 ) ) )
            // InternalRinform.g:2292:1: ( ( rule__ItemAlias__ItemAssignment_2 ) )
            {
            // InternalRinform.g:2292:1: ( ( rule__ItemAlias__ItemAssignment_2 ) )
            // InternalRinform.g:2293:2: ( rule__ItemAlias__ItemAssignment_2 )
            {
             before(grammarAccess.getItemAliasAccess().getItemAssignment_2()); 
            // InternalRinform.g:2294:2: ( rule__ItemAlias__ItemAssignment_2 )
            // InternalRinform.g:2294:3: rule__ItemAlias__ItemAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ItemAlias__ItemAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getItemAliasAccess().getItemAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemAlias__Group__2__Impl"


    // $ANTLR start "rule__ItemAlias__Group__3"
    // InternalRinform.g:2302:1: rule__ItemAlias__Group__3 : rule__ItemAlias__Group__3__Impl rule__ItemAlias__Group__4 ;
    public final void rule__ItemAlias__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2306:1: ( rule__ItemAlias__Group__3__Impl rule__ItemAlias__Group__4 )
            // InternalRinform.g:2307:2: rule__ItemAlias__Group__3__Impl rule__ItemAlias__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__ItemAlias__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ItemAlias__Group__4();

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
    // $ANTLR end "rule__ItemAlias__Group__3"


    // $ANTLR start "rule__ItemAlias__Group__3__Impl"
    // InternalRinform.g:2314:1: rule__ItemAlias__Group__3__Impl : ( ']' ) ;
    public final void rule__ItemAlias__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2318:1: ( ( ']' ) )
            // InternalRinform.g:2319:1: ( ']' )
            {
            // InternalRinform.g:2319:1: ( ']' )
            // InternalRinform.g:2320:2: ']'
            {
             before(grammarAccess.getItemAliasAccess().getRightSquareBracketKeyword_3()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getItemAliasAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemAlias__Group__3__Impl"


    // $ANTLR start "rule__ItemAlias__Group__4"
    // InternalRinform.g:2329:1: rule__ItemAlias__Group__4 : rule__ItemAlias__Group__4__Impl rule__ItemAlias__Group__5 ;
    public final void rule__ItemAlias__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2333:1: ( rule__ItemAlias__Group__4__Impl rule__ItemAlias__Group__5 )
            // InternalRinform.g:2334:2: rule__ItemAlias__Group__4__Impl rule__ItemAlias__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__ItemAlias__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ItemAlias__Group__5();

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
    // $ANTLR end "rule__ItemAlias__Group__4"


    // $ANTLR start "rule__ItemAlias__Group__4__Impl"
    // InternalRinform.g:2341:1: rule__ItemAlias__Group__4__Impl : ( '=' ) ;
    public final void rule__ItemAlias__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2345:1: ( ( '=' ) )
            // InternalRinform.g:2346:1: ( '=' )
            {
            // InternalRinform.g:2346:1: ( '=' )
            // InternalRinform.g:2347:2: '='
            {
             before(grammarAccess.getItemAliasAccess().getEqualsSignKeyword_4()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getItemAliasAccess().getEqualsSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemAlias__Group__4__Impl"


    // $ANTLR start "rule__ItemAlias__Group__5"
    // InternalRinform.g:2356:1: rule__ItemAlias__Group__5 : rule__ItemAlias__Group__5__Impl rule__ItemAlias__Group__6 ;
    public final void rule__ItemAlias__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2360:1: ( rule__ItemAlias__Group__5__Impl rule__ItemAlias__Group__6 )
            // InternalRinform.g:2361:2: rule__ItemAlias__Group__5__Impl rule__ItemAlias__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__ItemAlias__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ItemAlias__Group__6();

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
    // $ANTLR end "rule__ItemAlias__Group__5"


    // $ANTLR start "rule__ItemAlias__Group__5__Impl"
    // InternalRinform.g:2368:1: rule__ItemAlias__Group__5__Impl : ( ( rule__ItemAlias__Group_5__0 )* ) ;
    public final void rule__ItemAlias__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2372:1: ( ( ( rule__ItemAlias__Group_5__0 )* ) )
            // InternalRinform.g:2373:1: ( ( rule__ItemAlias__Group_5__0 )* )
            {
            // InternalRinform.g:2373:1: ( ( rule__ItemAlias__Group_5__0 )* )
            // InternalRinform.g:2374:2: ( rule__ItemAlias__Group_5__0 )*
            {
             before(grammarAccess.getItemAliasAccess().getGroup_5()); 
            // InternalRinform.g:2375:2: ( rule__ItemAlias__Group_5__0 )*
            loop14:
            do {
                int alt14=2;
                alt14 = dfa14.predict(input);
                switch (alt14) {
            	case 1 :
            	    // InternalRinform.g:2375:3: rule__ItemAlias__Group_5__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ItemAlias__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getItemAliasAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemAlias__Group__5__Impl"


    // $ANTLR start "rule__ItemAlias__Group__6"
    // InternalRinform.g:2383:1: rule__ItemAlias__Group__6 : rule__ItemAlias__Group__6__Impl ;
    public final void rule__ItemAlias__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2387:1: ( rule__ItemAlias__Group__6__Impl )
            // InternalRinform.g:2388:2: rule__ItemAlias__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ItemAlias__Group__6__Impl();

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
    // $ANTLR end "rule__ItemAlias__Group__6"


    // $ANTLR start "rule__ItemAlias__Group__6__Impl"
    // InternalRinform.g:2394:1: rule__ItemAlias__Group__6__Impl : ( ( rule__ItemAlias__Group_6__0 ) ) ;
    public final void rule__ItemAlias__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2398:1: ( ( ( rule__ItemAlias__Group_6__0 ) ) )
            // InternalRinform.g:2399:1: ( ( rule__ItemAlias__Group_6__0 ) )
            {
            // InternalRinform.g:2399:1: ( ( rule__ItemAlias__Group_6__0 ) )
            // InternalRinform.g:2400:2: ( rule__ItemAlias__Group_6__0 )
            {
             before(grammarAccess.getItemAliasAccess().getGroup_6()); 
            // InternalRinform.g:2401:2: ( rule__ItemAlias__Group_6__0 )
            // InternalRinform.g:2401:3: rule__ItemAlias__Group_6__0
            {
            pushFollow(FOLLOW_2);
            rule__ItemAlias__Group_6__0();

            state._fsp--;


            }

             after(grammarAccess.getItemAliasAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemAlias__Group__6__Impl"


    // $ANTLR start "rule__ItemAlias__Group_5__0"
    // InternalRinform.g:2410:1: rule__ItemAlias__Group_5__0 : rule__ItemAlias__Group_5__0__Impl rule__ItemAlias__Group_5__1 ;
    public final void rule__ItemAlias__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2414:1: ( rule__ItemAlias__Group_5__0__Impl rule__ItemAlias__Group_5__1 )
            // InternalRinform.g:2415:2: rule__ItemAlias__Group_5__0__Impl rule__ItemAlias__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__ItemAlias__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ItemAlias__Group_5__1();

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
    // $ANTLR end "rule__ItemAlias__Group_5__0"


    // $ANTLR start "rule__ItemAlias__Group_5__0__Impl"
    // InternalRinform.g:2422:1: rule__ItemAlias__Group_5__0__Impl : ( '[' ) ;
    public final void rule__ItemAlias__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2426:1: ( ( '[' ) )
            // InternalRinform.g:2427:1: ( '[' )
            {
            // InternalRinform.g:2427:1: ( '[' )
            // InternalRinform.g:2428:2: '['
            {
             before(grammarAccess.getItemAliasAccess().getLeftSquareBracketKeyword_5_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getItemAliasAccess().getLeftSquareBracketKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemAlias__Group_5__0__Impl"


    // $ANTLR start "rule__ItemAlias__Group_5__1"
    // InternalRinform.g:2437:1: rule__ItemAlias__Group_5__1 : rule__ItemAlias__Group_5__1__Impl rule__ItemAlias__Group_5__2 ;
    public final void rule__ItemAlias__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2441:1: ( rule__ItemAlias__Group_5__1__Impl rule__ItemAlias__Group_5__2 )
            // InternalRinform.g:2442:2: rule__ItemAlias__Group_5__1__Impl rule__ItemAlias__Group_5__2
            {
            pushFollow(FOLLOW_8);
            rule__ItemAlias__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ItemAlias__Group_5__2();

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
    // $ANTLR end "rule__ItemAlias__Group_5__1"


    // $ANTLR start "rule__ItemAlias__Group_5__1__Impl"
    // InternalRinform.g:2449:1: rule__ItemAlias__Group_5__1__Impl : ( ( ( rule__ItemAlias__AliasesAssignment_5_1 ) ) ( ( rule__ItemAlias__AliasesAssignment_5_1 )* ) ) ;
    public final void rule__ItemAlias__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2453:1: ( ( ( ( rule__ItemAlias__AliasesAssignment_5_1 ) ) ( ( rule__ItemAlias__AliasesAssignment_5_1 )* ) ) )
            // InternalRinform.g:2454:1: ( ( ( rule__ItemAlias__AliasesAssignment_5_1 ) ) ( ( rule__ItemAlias__AliasesAssignment_5_1 )* ) )
            {
            // InternalRinform.g:2454:1: ( ( ( rule__ItemAlias__AliasesAssignment_5_1 ) ) ( ( rule__ItemAlias__AliasesAssignment_5_1 )* ) )
            // InternalRinform.g:2455:2: ( ( rule__ItemAlias__AliasesAssignment_5_1 ) ) ( ( rule__ItemAlias__AliasesAssignment_5_1 )* )
            {
            // InternalRinform.g:2455:2: ( ( rule__ItemAlias__AliasesAssignment_5_1 ) )
            // InternalRinform.g:2456:3: ( rule__ItemAlias__AliasesAssignment_5_1 )
            {
             before(grammarAccess.getItemAliasAccess().getAliasesAssignment_5_1()); 
            // InternalRinform.g:2457:3: ( rule__ItemAlias__AliasesAssignment_5_1 )
            // InternalRinform.g:2457:4: rule__ItemAlias__AliasesAssignment_5_1
            {
            pushFollow(FOLLOW_3);
            rule__ItemAlias__AliasesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getItemAliasAccess().getAliasesAssignment_5_1()); 

            }

            // InternalRinform.g:2460:2: ( ( rule__ItemAlias__AliasesAssignment_5_1 )* )
            // InternalRinform.g:2461:3: ( rule__ItemAlias__AliasesAssignment_5_1 )*
            {
             before(grammarAccess.getItemAliasAccess().getAliasesAssignment_5_1()); 
            // InternalRinform.g:2462:3: ( rule__ItemAlias__AliasesAssignment_5_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=RULE_ID && LA15_0<=RULE_WS)||(LA15_0>=11 && LA15_0<=21)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalRinform.g:2462:4: rule__ItemAlias__AliasesAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__ItemAlias__AliasesAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getItemAliasAccess().getAliasesAssignment_5_1()); 

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
    // $ANTLR end "rule__ItemAlias__Group_5__1__Impl"


    // $ANTLR start "rule__ItemAlias__Group_5__2"
    // InternalRinform.g:2471:1: rule__ItemAlias__Group_5__2 : rule__ItemAlias__Group_5__2__Impl rule__ItemAlias__Group_5__3 ;
    public final void rule__ItemAlias__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2475:1: ( rule__ItemAlias__Group_5__2__Impl rule__ItemAlias__Group_5__3 )
            // InternalRinform.g:2476:2: rule__ItemAlias__Group_5__2__Impl rule__ItemAlias__Group_5__3
            {
            pushFollow(FOLLOW_10);
            rule__ItemAlias__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ItemAlias__Group_5__3();

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
    // $ANTLR end "rule__ItemAlias__Group_5__2"


    // $ANTLR start "rule__ItemAlias__Group_5__2__Impl"
    // InternalRinform.g:2483:1: rule__ItemAlias__Group_5__2__Impl : ( ']' ) ;
    public final void rule__ItemAlias__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2487:1: ( ( ']' ) )
            // InternalRinform.g:2488:1: ( ']' )
            {
            // InternalRinform.g:2488:1: ( ']' )
            // InternalRinform.g:2489:2: ']'
            {
             before(grammarAccess.getItemAliasAccess().getRightSquareBracketKeyword_5_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getItemAliasAccess().getRightSquareBracketKeyword_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemAlias__Group_5__2__Impl"


    // $ANTLR start "rule__ItemAlias__Group_5__3"
    // InternalRinform.g:2498:1: rule__ItemAlias__Group_5__3 : rule__ItemAlias__Group_5__3__Impl ;
    public final void rule__ItemAlias__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2502:1: ( rule__ItemAlias__Group_5__3__Impl )
            // InternalRinform.g:2503:2: rule__ItemAlias__Group_5__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ItemAlias__Group_5__3__Impl();

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
    // $ANTLR end "rule__ItemAlias__Group_5__3"


    // $ANTLR start "rule__ItemAlias__Group_5__3__Impl"
    // InternalRinform.g:2509:1: rule__ItemAlias__Group_5__3__Impl : ( '=' ) ;
    public final void rule__ItemAlias__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2513:1: ( ( '=' ) )
            // InternalRinform.g:2514:1: ( '=' )
            {
            // InternalRinform.g:2514:1: ( '=' )
            // InternalRinform.g:2515:2: '='
            {
             before(grammarAccess.getItemAliasAccess().getEqualsSignKeyword_5_3()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getItemAliasAccess().getEqualsSignKeyword_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemAlias__Group_5__3__Impl"


    // $ANTLR start "rule__ItemAlias__Group_6__0"
    // InternalRinform.g:2525:1: rule__ItemAlias__Group_6__0 : rule__ItemAlias__Group_6__0__Impl rule__ItemAlias__Group_6__1 ;
    public final void rule__ItemAlias__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2529:1: ( rule__ItemAlias__Group_6__0__Impl rule__ItemAlias__Group_6__1 )
            // InternalRinform.g:2530:2: rule__ItemAlias__Group_6__0__Impl rule__ItemAlias__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__ItemAlias__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ItemAlias__Group_6__1();

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
    // $ANTLR end "rule__ItemAlias__Group_6__0"


    // $ANTLR start "rule__ItemAlias__Group_6__0__Impl"
    // InternalRinform.g:2537:1: rule__ItemAlias__Group_6__0__Impl : ( '[' ) ;
    public final void rule__ItemAlias__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2541:1: ( ( '[' ) )
            // InternalRinform.g:2542:1: ( '[' )
            {
            // InternalRinform.g:2542:1: ( '[' )
            // InternalRinform.g:2543:2: '['
            {
             before(grammarAccess.getItemAliasAccess().getLeftSquareBracketKeyword_6_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getItemAliasAccess().getLeftSquareBracketKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemAlias__Group_6__0__Impl"


    // $ANTLR start "rule__ItemAlias__Group_6__1"
    // InternalRinform.g:2552:1: rule__ItemAlias__Group_6__1 : rule__ItemAlias__Group_6__1__Impl rule__ItemAlias__Group_6__2 ;
    public final void rule__ItemAlias__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2556:1: ( rule__ItemAlias__Group_6__1__Impl rule__ItemAlias__Group_6__2 )
            // InternalRinform.g:2557:2: rule__ItemAlias__Group_6__1__Impl rule__ItemAlias__Group_6__2
            {
            pushFollow(FOLLOW_8);
            rule__ItemAlias__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ItemAlias__Group_6__2();

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
    // $ANTLR end "rule__ItemAlias__Group_6__1"


    // $ANTLR start "rule__ItemAlias__Group_6__1__Impl"
    // InternalRinform.g:2564:1: rule__ItemAlias__Group_6__1__Impl : ( ( ( rule__ItemAlias__AliasesAssignment_6_1 ) ) ( ( rule__ItemAlias__AliasesAssignment_6_1 )* ) ) ;
    public final void rule__ItemAlias__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2568:1: ( ( ( ( rule__ItemAlias__AliasesAssignment_6_1 ) ) ( ( rule__ItemAlias__AliasesAssignment_6_1 )* ) ) )
            // InternalRinform.g:2569:1: ( ( ( rule__ItemAlias__AliasesAssignment_6_1 ) ) ( ( rule__ItemAlias__AliasesAssignment_6_1 )* ) )
            {
            // InternalRinform.g:2569:1: ( ( ( rule__ItemAlias__AliasesAssignment_6_1 ) ) ( ( rule__ItemAlias__AliasesAssignment_6_1 )* ) )
            // InternalRinform.g:2570:2: ( ( rule__ItemAlias__AliasesAssignment_6_1 ) ) ( ( rule__ItemAlias__AliasesAssignment_6_1 )* )
            {
            // InternalRinform.g:2570:2: ( ( rule__ItemAlias__AliasesAssignment_6_1 ) )
            // InternalRinform.g:2571:3: ( rule__ItemAlias__AliasesAssignment_6_1 )
            {
             before(grammarAccess.getItemAliasAccess().getAliasesAssignment_6_1()); 
            // InternalRinform.g:2572:3: ( rule__ItemAlias__AliasesAssignment_6_1 )
            // InternalRinform.g:2572:4: rule__ItemAlias__AliasesAssignment_6_1
            {
            pushFollow(FOLLOW_3);
            rule__ItemAlias__AliasesAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getItemAliasAccess().getAliasesAssignment_6_1()); 

            }

            // InternalRinform.g:2575:2: ( ( rule__ItemAlias__AliasesAssignment_6_1 )* )
            // InternalRinform.g:2576:3: ( rule__ItemAlias__AliasesAssignment_6_1 )*
            {
             before(grammarAccess.getItemAliasAccess().getAliasesAssignment_6_1()); 
            // InternalRinform.g:2577:3: ( rule__ItemAlias__AliasesAssignment_6_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=RULE_ID && LA16_0<=RULE_WS)||(LA16_0>=11 && LA16_0<=21)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalRinform.g:2577:4: rule__ItemAlias__AliasesAssignment_6_1
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__ItemAlias__AliasesAssignment_6_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getItemAliasAccess().getAliasesAssignment_6_1()); 

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
    // $ANTLR end "rule__ItemAlias__Group_6__1__Impl"


    // $ANTLR start "rule__ItemAlias__Group_6__2"
    // InternalRinform.g:2586:1: rule__ItemAlias__Group_6__2 : rule__ItemAlias__Group_6__2__Impl ;
    public final void rule__ItemAlias__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2590:1: ( rule__ItemAlias__Group_6__2__Impl )
            // InternalRinform.g:2591:2: rule__ItemAlias__Group_6__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ItemAlias__Group_6__2__Impl();

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
    // $ANTLR end "rule__ItemAlias__Group_6__2"


    // $ANTLR start "rule__ItemAlias__Group_6__2__Impl"
    // InternalRinform.g:2597:1: rule__ItemAlias__Group_6__2__Impl : ( ']' ) ;
    public final void rule__ItemAlias__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2601:1: ( ( ']' ) )
            // InternalRinform.g:2602:1: ( ']' )
            {
            // InternalRinform.g:2602:1: ( ']' )
            // InternalRinform.g:2603:2: ']'
            {
             before(grammarAccess.getItemAliasAccess().getRightSquareBracketKeyword_6_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getItemAliasAccess().getRightSquareBracketKeyword_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemAlias__Group_6__2__Impl"


    // $ANTLR start "rule__CharacterDeclaration__Group__0"
    // InternalRinform.g:2613:1: rule__CharacterDeclaration__Group__0 : rule__CharacterDeclaration__Group__0__Impl rule__CharacterDeclaration__Group__1 ;
    public final void rule__CharacterDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2617:1: ( rule__CharacterDeclaration__Group__0__Impl rule__CharacterDeclaration__Group__1 )
            // InternalRinform.g:2618:2: rule__CharacterDeclaration__Group__0__Impl rule__CharacterDeclaration__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalRinform.g:2625:1: rule__CharacterDeclaration__Group__0__Impl : ( 'p-' ) ;
    public final void rule__CharacterDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2629:1: ( ( 'p-' ) )
            // InternalRinform.g:2630:1: ( 'p-' )
            {
            // InternalRinform.g:2630:1: ( 'p-' )
            // InternalRinform.g:2631:2: 'p-'
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
    // InternalRinform.g:2640:1: rule__CharacterDeclaration__Group__1 : rule__CharacterDeclaration__Group__1__Impl rule__CharacterDeclaration__Group__2 ;
    public final void rule__CharacterDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2644:1: ( rule__CharacterDeclaration__Group__1__Impl rule__CharacterDeclaration__Group__2 )
            // InternalRinform.g:2645:2: rule__CharacterDeclaration__Group__1__Impl rule__CharacterDeclaration__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalRinform.g:2652:1: rule__CharacterDeclaration__Group__1__Impl : ( ( rule__CharacterDeclaration__NameAssignment_1 ) ) ;
    public final void rule__CharacterDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2656:1: ( ( ( rule__CharacterDeclaration__NameAssignment_1 ) ) )
            // InternalRinform.g:2657:1: ( ( rule__CharacterDeclaration__NameAssignment_1 ) )
            {
            // InternalRinform.g:2657:1: ( ( rule__CharacterDeclaration__NameAssignment_1 ) )
            // InternalRinform.g:2658:2: ( rule__CharacterDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getCharacterDeclarationAccess().getNameAssignment_1()); 
            // InternalRinform.g:2659:2: ( rule__CharacterDeclaration__NameAssignment_1 )
            // InternalRinform.g:2659:3: rule__CharacterDeclaration__NameAssignment_1
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
    // InternalRinform.g:2667:1: rule__CharacterDeclaration__Group__2 : rule__CharacterDeclaration__Group__2__Impl rule__CharacterDeclaration__Group__3 ;
    public final void rule__CharacterDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2671:1: ( rule__CharacterDeclaration__Group__2__Impl rule__CharacterDeclaration__Group__3 )
            // InternalRinform.g:2672:2: rule__CharacterDeclaration__Group__2__Impl rule__CharacterDeclaration__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalRinform.g:2679:1: rule__CharacterDeclaration__Group__2__Impl : ( '-p' ) ;
    public final void rule__CharacterDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2683:1: ( ( '-p' ) )
            // InternalRinform.g:2684:1: ( '-p' )
            {
            // InternalRinform.g:2684:1: ( '-p' )
            // InternalRinform.g:2685:2: '-p'
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
    // InternalRinform.g:2694:1: rule__CharacterDeclaration__Group__3 : rule__CharacterDeclaration__Group__3__Impl rule__CharacterDeclaration__Group__4 ;
    public final void rule__CharacterDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2698:1: ( rule__CharacterDeclaration__Group__3__Impl rule__CharacterDeclaration__Group__4 )
            // InternalRinform.g:2699:2: rule__CharacterDeclaration__Group__3__Impl rule__CharacterDeclaration__Group__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalRinform.g:2706:1: rule__CharacterDeclaration__Group__3__Impl : ( '!r' ) ;
    public final void rule__CharacterDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2710:1: ( ( '!r' ) )
            // InternalRinform.g:2711:1: ( '!r' )
            {
            // InternalRinform.g:2711:1: ( '!r' )
            // InternalRinform.g:2712:2: '!r'
            {
             before(grammarAccess.getCharacterDeclarationAccess().getRKeyword_3()); 
            match(input,31,FOLLOW_2); 
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
    // InternalRinform.g:2721:1: rule__CharacterDeclaration__Group__4 : rule__CharacterDeclaration__Group__4__Impl rule__CharacterDeclaration__Group__5 ;
    public final void rule__CharacterDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2725:1: ( rule__CharacterDeclaration__Group__4__Impl rule__CharacterDeclaration__Group__5 )
            // InternalRinform.g:2726:2: rule__CharacterDeclaration__Group__4__Impl rule__CharacterDeclaration__Group__5
            {
            pushFollow(FOLLOW_4);
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
    // InternalRinform.g:2733:1: rule__CharacterDeclaration__Group__4__Impl : ( '[' ) ;
    public final void rule__CharacterDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2737:1: ( ( '[' ) )
            // InternalRinform.g:2738:1: ( '[' )
            {
            // InternalRinform.g:2738:1: ( '[' )
            // InternalRinform.g:2739:2: '['
            {
             before(grammarAccess.getCharacterDeclarationAccess().getLeftSquareBracketKeyword_4()); 
            match(input,32,FOLLOW_2); 
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
    // InternalRinform.g:2748:1: rule__CharacterDeclaration__Group__5 : rule__CharacterDeclaration__Group__5__Impl rule__CharacterDeclaration__Group__6 ;
    public final void rule__CharacterDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2752:1: ( rule__CharacterDeclaration__Group__5__Impl rule__CharacterDeclaration__Group__6 )
            // InternalRinform.g:2753:2: rule__CharacterDeclaration__Group__5__Impl rule__CharacterDeclaration__Group__6
            {
            pushFollow(FOLLOW_8);
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
    // InternalRinform.g:2760:1: rule__CharacterDeclaration__Group__5__Impl : ( ( rule__CharacterDeclaration__RoomAssignment_5 ) ) ;
    public final void rule__CharacterDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2764:1: ( ( ( rule__CharacterDeclaration__RoomAssignment_5 ) ) )
            // InternalRinform.g:2765:1: ( ( rule__CharacterDeclaration__RoomAssignment_5 ) )
            {
            // InternalRinform.g:2765:1: ( ( rule__CharacterDeclaration__RoomAssignment_5 ) )
            // InternalRinform.g:2766:2: ( rule__CharacterDeclaration__RoomAssignment_5 )
            {
             before(grammarAccess.getCharacterDeclarationAccess().getRoomAssignment_5()); 
            // InternalRinform.g:2767:2: ( rule__CharacterDeclaration__RoomAssignment_5 )
            // InternalRinform.g:2767:3: rule__CharacterDeclaration__RoomAssignment_5
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
    // InternalRinform.g:2775:1: rule__CharacterDeclaration__Group__6 : rule__CharacterDeclaration__Group__6__Impl ;
    public final void rule__CharacterDeclaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2779:1: ( rule__CharacterDeclaration__Group__6__Impl )
            // InternalRinform.g:2780:2: rule__CharacterDeclaration__Group__6__Impl
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
    // InternalRinform.g:2786:1: rule__CharacterDeclaration__Group__6__Impl : ( ']' ) ;
    public final void rule__CharacterDeclaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2790:1: ( ( ']' ) )
            // InternalRinform.g:2791:1: ( ']' )
            {
            // InternalRinform.g:2791:1: ( ']' )
            // InternalRinform.g:2792:2: ']'
            {
             before(grammarAccess.getCharacterDeclarationAccess().getRightSquareBracketKeyword_6()); 
            match(input,33,FOLLOW_2); 
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
    // InternalRinform.g:2802:1: rule__CharacterDescription__Group__0 : rule__CharacterDescription__Group__0__Impl rule__CharacterDescription__Group__1 ;
    public final void rule__CharacterDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2806:1: ( rule__CharacterDescription__Group__0__Impl rule__CharacterDescription__Group__1 )
            // InternalRinform.g:2807:2: rule__CharacterDescription__Group__0__Impl rule__CharacterDescription__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalRinform.g:2814:1: rule__CharacterDescription__Group__0__Impl : ( '{' ) ;
    public final void rule__CharacterDescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2818:1: ( ( '{' ) )
            // InternalRinform.g:2819:1: ( '{' )
            {
            // InternalRinform.g:2819:1: ( '{' )
            // InternalRinform.g:2820:2: '{'
            {
             before(grammarAccess.getCharacterDescriptionAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalRinform.g:2829:1: rule__CharacterDescription__Group__1 : rule__CharacterDescription__Group__1__Impl rule__CharacterDescription__Group__2 ;
    public final void rule__CharacterDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2833:1: ( rule__CharacterDescription__Group__1__Impl rule__CharacterDescription__Group__2 )
            // InternalRinform.g:2834:2: rule__CharacterDescription__Group__1__Impl rule__CharacterDescription__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalRinform.g:2841:1: rule__CharacterDescription__Group__1__Impl : ( ( ( rule__CharacterDescription__PersonDescriptionAssignment_1 ) ) ( ( rule__CharacterDescription__PersonDescriptionAssignment_1 )* ) ) ;
    public final void rule__CharacterDescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2845:1: ( ( ( ( rule__CharacterDescription__PersonDescriptionAssignment_1 ) ) ( ( rule__CharacterDescription__PersonDescriptionAssignment_1 )* ) ) )
            // InternalRinform.g:2846:1: ( ( ( rule__CharacterDescription__PersonDescriptionAssignment_1 ) ) ( ( rule__CharacterDescription__PersonDescriptionAssignment_1 )* ) )
            {
            // InternalRinform.g:2846:1: ( ( ( rule__CharacterDescription__PersonDescriptionAssignment_1 ) ) ( ( rule__CharacterDescription__PersonDescriptionAssignment_1 )* ) )
            // InternalRinform.g:2847:2: ( ( rule__CharacterDescription__PersonDescriptionAssignment_1 ) ) ( ( rule__CharacterDescription__PersonDescriptionAssignment_1 )* )
            {
            // InternalRinform.g:2847:2: ( ( rule__CharacterDescription__PersonDescriptionAssignment_1 ) )
            // InternalRinform.g:2848:3: ( rule__CharacterDescription__PersonDescriptionAssignment_1 )
            {
             before(grammarAccess.getCharacterDescriptionAccess().getPersonDescriptionAssignment_1()); 
            // InternalRinform.g:2849:3: ( rule__CharacterDescription__PersonDescriptionAssignment_1 )
            // InternalRinform.g:2849:4: rule__CharacterDescription__PersonDescriptionAssignment_1
            {
            pushFollow(FOLLOW_3);
            rule__CharacterDescription__PersonDescriptionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCharacterDescriptionAccess().getPersonDescriptionAssignment_1()); 

            }

            // InternalRinform.g:2852:2: ( ( rule__CharacterDescription__PersonDescriptionAssignment_1 )* )
            // InternalRinform.g:2853:3: ( rule__CharacterDescription__PersonDescriptionAssignment_1 )*
            {
             before(grammarAccess.getCharacterDescriptionAccess().getPersonDescriptionAssignment_1()); 
            // InternalRinform.g:2854:3: ( rule__CharacterDescription__PersonDescriptionAssignment_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=RULE_ID && LA17_0<=RULE_WS)||(LA17_0>=11 && LA17_0<=21)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalRinform.g:2854:4: rule__CharacterDescription__PersonDescriptionAssignment_1
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__CharacterDescription__PersonDescriptionAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalRinform.g:2863:1: rule__CharacterDescription__Group__2 : rule__CharacterDescription__Group__2__Impl rule__CharacterDescription__Group__3 ;
    public final void rule__CharacterDescription__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2867:1: ( rule__CharacterDescription__Group__2__Impl rule__CharacterDescription__Group__3 )
            // InternalRinform.g:2868:2: rule__CharacterDescription__Group__2__Impl rule__CharacterDescription__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalRinform.g:2875:1: rule__CharacterDescription__Group__2__Impl : ( '!p' ) ;
    public final void rule__CharacterDescription__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2879:1: ( ( '!p' ) )
            // InternalRinform.g:2880:1: ( '!p' )
            {
            // InternalRinform.g:2880:1: ( '!p' )
            // InternalRinform.g:2881:2: '!p'
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
    // InternalRinform.g:2890:1: rule__CharacterDescription__Group__3 : rule__CharacterDescription__Group__3__Impl rule__CharacterDescription__Group__4 ;
    public final void rule__CharacterDescription__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2894:1: ( rule__CharacterDescription__Group__3__Impl rule__CharacterDescription__Group__4 )
            // InternalRinform.g:2895:2: rule__CharacterDescription__Group__3__Impl rule__CharacterDescription__Group__4
            {
            pushFollow(FOLLOW_4);
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
    // InternalRinform.g:2902:1: rule__CharacterDescription__Group__3__Impl : ( '[' ) ;
    public final void rule__CharacterDescription__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2906:1: ( ( '[' ) )
            // InternalRinform.g:2907:1: ( '[' )
            {
            // InternalRinform.g:2907:1: ( '[' )
            // InternalRinform.g:2908:2: '['
            {
             before(grammarAccess.getCharacterDescriptionAccess().getLeftSquareBracketKeyword_3()); 
            match(input,32,FOLLOW_2); 
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
    // InternalRinform.g:2917:1: rule__CharacterDescription__Group__4 : rule__CharacterDescription__Group__4__Impl rule__CharacterDescription__Group__5 ;
    public final void rule__CharacterDescription__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2921:1: ( rule__CharacterDescription__Group__4__Impl rule__CharacterDescription__Group__5 )
            // InternalRinform.g:2922:2: rule__CharacterDescription__Group__4__Impl rule__CharacterDescription__Group__5
            {
            pushFollow(FOLLOW_8);
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
    // InternalRinform.g:2929:1: rule__CharacterDescription__Group__4__Impl : ( ( rule__CharacterDescription__PersonAssignment_4 ) ) ;
    public final void rule__CharacterDescription__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2933:1: ( ( ( rule__CharacterDescription__PersonAssignment_4 ) ) )
            // InternalRinform.g:2934:1: ( ( rule__CharacterDescription__PersonAssignment_4 ) )
            {
            // InternalRinform.g:2934:1: ( ( rule__CharacterDescription__PersonAssignment_4 ) )
            // InternalRinform.g:2935:2: ( rule__CharacterDescription__PersonAssignment_4 )
            {
             before(grammarAccess.getCharacterDescriptionAccess().getPersonAssignment_4()); 
            // InternalRinform.g:2936:2: ( rule__CharacterDescription__PersonAssignment_4 )
            // InternalRinform.g:2936:3: rule__CharacterDescription__PersonAssignment_4
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
    // InternalRinform.g:2944:1: rule__CharacterDescription__Group__5 : rule__CharacterDescription__Group__5__Impl rule__CharacterDescription__Group__6 ;
    public final void rule__CharacterDescription__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2948:1: ( rule__CharacterDescription__Group__5__Impl rule__CharacterDescription__Group__6 )
            // InternalRinform.g:2949:2: rule__CharacterDescription__Group__5__Impl rule__CharacterDescription__Group__6
            {
            pushFollow(FOLLOW_9);
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
    // InternalRinform.g:2956:1: rule__CharacterDescription__Group__5__Impl : ( ']' ) ;
    public final void rule__CharacterDescription__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2960:1: ( ( ']' ) )
            // InternalRinform.g:2961:1: ( ']' )
            {
            // InternalRinform.g:2961:1: ( ']' )
            // InternalRinform.g:2962:2: ']'
            {
             before(grammarAccess.getCharacterDescriptionAccess().getRightSquareBracketKeyword_5()); 
            match(input,33,FOLLOW_2); 
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
    // InternalRinform.g:2971:1: rule__CharacterDescription__Group__6 : rule__CharacterDescription__Group__6__Impl ;
    public final void rule__CharacterDescription__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2975:1: ( rule__CharacterDescription__Group__6__Impl )
            // InternalRinform.g:2976:2: rule__CharacterDescription__Group__6__Impl
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
    // InternalRinform.g:2982:1: rule__CharacterDescription__Group__6__Impl : ( '}' ) ;
    public final void rule__CharacterDescription__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2986:1: ( ( '}' ) )
            // InternalRinform.g:2987:1: ( '}' )
            {
            // InternalRinform.g:2987:1: ( '}' )
            // InternalRinform.g:2988:2: '}'
            {
             before(grammarAccess.getCharacterDescriptionAccess().getRightCurlyBracketKeyword_6()); 
            match(input,34,FOLLOW_2); 
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


    // $ANTLR start "rule__CharacterAlias__Group__0"
    // InternalRinform.g:2998:1: rule__CharacterAlias__Group__0 : rule__CharacterAlias__Group__0__Impl rule__CharacterAlias__Group__1 ;
    public final void rule__CharacterAlias__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:3002:1: ( rule__CharacterAlias__Group__0__Impl rule__CharacterAlias__Group__1 )
            // InternalRinform.g:3003:2: rule__CharacterAlias__Group__0__Impl rule__CharacterAlias__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__CharacterAlias__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CharacterAlias__Group__1();

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
    // $ANTLR end "rule__CharacterAlias__Group__0"


    // $ANTLR start "rule__CharacterAlias__Group__0__Impl"
    // InternalRinform.g:3010:1: rule__CharacterAlias__Group__0__Impl : ( '!p' ) ;
    public final void rule__CharacterAlias__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:3014:1: ( ( '!p' ) )
            // InternalRinform.g:3015:1: ( '!p' )
            {
            // InternalRinform.g:3015:1: ( '!p' )
            // InternalRinform.g:3016:2: '!p'
            {
             before(grammarAccess.getCharacterAliasAccess().getPKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getCharacterAliasAccess().getPKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacterAlias__Group__0__Impl"


    // $ANTLR start "rule__CharacterAlias__Group__1"
    // InternalRinform.g:3025:1: rule__CharacterAlias__Group__1 : rule__CharacterAlias__Group__1__Impl rule__CharacterAlias__Group__2 ;
    public final void rule__CharacterAlias__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:3029:1: ( rule__CharacterAlias__Group__1__Impl rule__CharacterAlias__Group__2 )
            // InternalRinform.g:3030:2: rule__CharacterAlias__Group__1__Impl rule__CharacterAlias__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__CharacterAlias__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CharacterAlias__Group__2();

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
    // $ANTLR end "rule__CharacterAlias__Group__1"


    // $ANTLR start "rule__CharacterAlias__Group__1__Impl"
    // InternalRinform.g:3037:1: rule__CharacterAlias__Group__1__Impl : ( '[' ) ;
    public final void rule__CharacterAlias__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:3041:1: ( ( '[' ) )
            // InternalRinform.g:3042:1: ( '[' )
            {
            // InternalRinform.g:3042:1: ( '[' )
            // InternalRinform.g:3043:2: '['
            {
             before(grammarAccess.getCharacterAliasAccess().getLeftSquareBracketKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getCharacterAliasAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacterAlias__Group__1__Impl"


    // $ANTLR start "rule__CharacterAlias__Group__2"
    // InternalRinform.g:3052:1: rule__CharacterAlias__Group__2 : rule__CharacterAlias__Group__2__Impl rule__CharacterAlias__Group__3 ;
    public final void rule__CharacterAlias__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:3056:1: ( rule__CharacterAlias__Group__2__Impl rule__CharacterAlias__Group__3 )
            // InternalRinform.g:3057:2: rule__CharacterAlias__Group__2__Impl rule__CharacterAlias__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__CharacterAlias__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CharacterAlias__Group__3();

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
    // $ANTLR end "rule__CharacterAlias__Group__2"


    // $ANTLR start "rule__CharacterAlias__Group__2__Impl"
    // InternalRinform.g:3064:1: rule__CharacterAlias__Group__2__Impl : ( ( rule__CharacterAlias__CharacterAssignment_2 ) ) ;
    public final void rule__CharacterAlias__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:3068:1: ( ( ( rule__CharacterAlias__CharacterAssignment_2 ) ) )
            // InternalRinform.g:3069:1: ( ( rule__CharacterAlias__CharacterAssignment_2 ) )
            {
            // InternalRinform.g:3069:1: ( ( rule__CharacterAlias__CharacterAssignment_2 ) )
            // InternalRinform.g:3070:2: ( rule__CharacterAlias__CharacterAssignment_2 )
            {
             before(grammarAccess.getCharacterAliasAccess().getCharacterAssignment_2()); 
            // InternalRinform.g:3071:2: ( rule__CharacterAlias__CharacterAssignment_2 )
            // InternalRinform.g:3071:3: rule__CharacterAlias__CharacterAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CharacterAlias__CharacterAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCharacterAliasAccess().getCharacterAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacterAlias__Group__2__Impl"


    // $ANTLR start "rule__CharacterAlias__Group__3"
    // InternalRinform.g:3079:1: rule__CharacterAlias__Group__3 : rule__CharacterAlias__Group__3__Impl rule__CharacterAlias__Group__4 ;
    public final void rule__CharacterAlias__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:3083:1: ( rule__CharacterAlias__Group__3__Impl rule__CharacterAlias__Group__4 )
            // InternalRinform.g:3084:2: rule__CharacterAlias__Group__3__Impl rule__CharacterAlias__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__CharacterAlias__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CharacterAlias__Group__4();

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
    // $ANTLR end "rule__CharacterAlias__Group__3"


    // $ANTLR start "rule__CharacterAlias__Group__3__Impl"
    // InternalRinform.g:3091:1: rule__CharacterAlias__Group__3__Impl : ( ']' ) ;
    public final void rule__CharacterAlias__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:3095:1: ( ( ']' ) )
            // InternalRinform.g:3096:1: ( ']' )
            {
            // InternalRinform.g:3096:1: ( ']' )
            // InternalRinform.g:3097:2: ']'
            {
             before(grammarAccess.getCharacterAliasAccess().getRightSquareBracketKeyword_3()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getCharacterAliasAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacterAlias__Group__3__Impl"


    // $ANTLR start "rule__CharacterAlias__Group__4"
    // InternalRinform.g:3106:1: rule__CharacterAlias__Group__4 : rule__CharacterAlias__Group__4__Impl rule__CharacterAlias__Group__5 ;
    public final void rule__CharacterAlias__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:3110:1: ( rule__CharacterAlias__Group__4__Impl rule__CharacterAlias__Group__5 )
            // InternalRinform.g:3111:2: rule__CharacterAlias__Group__4__Impl rule__CharacterAlias__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__CharacterAlias__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CharacterAlias__Group__5();

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
    // $ANTLR end "rule__CharacterAlias__Group__4"


    // $ANTLR start "rule__CharacterAlias__Group__4__Impl"
    // InternalRinform.g:3118:1: rule__CharacterAlias__Group__4__Impl : ( '=' ) ;
    public final void rule__CharacterAlias__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:3122:1: ( ( '=' ) )
            // InternalRinform.g:3123:1: ( '=' )
            {
            // InternalRinform.g:3123:1: ( '=' )
            // InternalRinform.g:3124:2: '='
            {
             before(grammarAccess.getCharacterAliasAccess().getEqualsSignKeyword_4()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getCharacterAliasAccess().getEqualsSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacterAlias__Group__4__Impl"


    // $ANTLR start "rule__CharacterAlias__Group__5"
    // InternalRinform.g:3133:1: rule__CharacterAlias__Group__5 : rule__CharacterAlias__Group__5__Impl rule__CharacterAlias__Group__6 ;
    public final void rule__CharacterAlias__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:3137:1: ( rule__CharacterAlias__Group__5__Impl rule__CharacterAlias__Group__6 )
            // InternalRinform.g:3138:2: rule__CharacterAlias__Group__5__Impl rule__CharacterAlias__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__CharacterAlias__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CharacterAlias__Group__6();

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
    // $ANTLR end "rule__CharacterAlias__Group__5"


    // $ANTLR start "rule__CharacterAlias__Group__5__Impl"
    // InternalRinform.g:3145:1: rule__CharacterAlias__Group__5__Impl : ( ( rule__CharacterAlias__Group_5__0 )* ) ;
    public final void rule__CharacterAlias__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:3149:1: ( ( ( rule__CharacterAlias__Group_5__0 )* ) )
            // InternalRinform.g:3150:1: ( ( rule__CharacterAlias__Group_5__0 )* )
            {
            // InternalRinform.g:3150:1: ( ( rule__CharacterAlias__Group_5__0 )* )
            // InternalRinform.g:3151:2: ( rule__CharacterAlias__Group_5__0 )*
            {
             before(grammarAccess.getCharacterAliasAccess().getGroup_5()); 
            // InternalRinform.g:3152:2: ( rule__CharacterAlias__Group_5__0 )*
            loop18:
            do {
                int alt18=2;
                alt18 = dfa18.predict(input);
                switch (alt18) {
            	case 1 :
            	    // InternalRinform.g:3152:3: rule__CharacterAlias__Group_5__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__CharacterAlias__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getCharacterAliasAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacterAlias__Group__5__Impl"


    // $ANTLR start "rule__CharacterAlias__Group__6"
    // InternalRinform.g:3160:1: rule__CharacterAlias__Group__6 : rule__CharacterAlias__Group__6__Impl ;
    public final void rule__CharacterAlias__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:3164:1: ( rule__CharacterAlias__Group__6__Impl )
            // InternalRinform.g:3165:2: rule__CharacterAlias__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CharacterAlias__Group__6__Impl();

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
    // $ANTLR end "rule__CharacterAlias__Group__6"


    // $ANTLR start "rule__CharacterAlias__Group__6__Impl"
    // InternalRinform.g:3171:1: rule__CharacterAlias__Group__6__Impl : ( ( rule__CharacterAlias__Group_6__0 ) ) ;
    public final void rule__CharacterAlias__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:3175:1: ( ( ( rule__CharacterAlias__Group_6__0 ) ) )
            // InternalRinform.g:3176:1: ( ( rule__CharacterAlias__Group_6__0 ) )
            {
            // InternalRinform.g:3176:1: ( ( rule__CharacterAlias__Group_6__0 ) )
            // InternalRinform.g:3177:2: ( rule__CharacterAlias__Group_6__0 )
            {
             before(grammarAccess.getCharacterAliasAccess().getGroup_6()); 
            // InternalRinform.g:3178:2: ( rule__CharacterAlias__Group_6__0 )
            // InternalRinform.g:3178:3: rule__CharacterAlias__Group_6__0
            {
            pushFollow(FOLLOW_2);
            rule__CharacterAlias__Group_6__0();

            state._fsp--;


            }

             after(grammarAccess.getCharacterAliasAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacterAlias__Group__6__Impl"


    // $ANTLR start "rule__CharacterAlias__Group_5__0"
    // InternalRinform.g:3187:1: rule__CharacterAlias__Group_5__0 : rule__CharacterAlias__Group_5__0__Impl rule__CharacterAlias__Group_5__1 ;
    public final void rule__CharacterAlias__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:3191:1: ( rule__CharacterAlias__Group_5__0__Impl rule__CharacterAlias__Group_5__1 )
            // InternalRinform.g:3192:2: rule__CharacterAlias__Group_5__0__Impl rule__CharacterAlias__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__CharacterAlias__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CharacterAlias__Group_5__1();

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
    // $ANTLR end "rule__CharacterAlias__Group_5__0"


    // $ANTLR start "rule__CharacterAlias__Group_5__0__Impl"
    // InternalRinform.g:3199:1: rule__CharacterAlias__Group_5__0__Impl : ( '[' ) ;
    public final void rule__CharacterAlias__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:3203:1: ( ( '[' ) )
            // InternalRinform.g:3204:1: ( '[' )
            {
            // InternalRinform.g:3204:1: ( '[' )
            // InternalRinform.g:3205:2: '['
            {
             before(grammarAccess.getCharacterAliasAccess().getLeftSquareBracketKeyword_5_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getCharacterAliasAccess().getLeftSquareBracketKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacterAlias__Group_5__0__Impl"


    // $ANTLR start "rule__CharacterAlias__Group_5__1"
    // InternalRinform.g:3214:1: rule__CharacterAlias__Group_5__1 : rule__CharacterAlias__Group_5__1__Impl rule__CharacterAlias__Group_5__2 ;
    public final void rule__CharacterAlias__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:3218:1: ( rule__CharacterAlias__Group_5__1__Impl rule__CharacterAlias__Group_5__2 )
            // InternalRinform.g:3219:2: rule__CharacterAlias__Group_5__1__Impl rule__CharacterAlias__Group_5__2
            {
            pushFollow(FOLLOW_8);
            rule__CharacterAlias__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CharacterAlias__Group_5__2();

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
    // $ANTLR end "rule__CharacterAlias__Group_5__1"


    // $ANTLR start "rule__CharacterAlias__Group_5__1__Impl"
    // InternalRinform.g:3226:1: rule__CharacterAlias__Group_5__1__Impl : ( ( ( rule__CharacterAlias__AliasesAssignment_5_1 ) ) ( ( rule__CharacterAlias__AliasesAssignment_5_1 )* ) ) ;
    public final void rule__CharacterAlias__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:3230:1: ( ( ( ( rule__CharacterAlias__AliasesAssignment_5_1 ) ) ( ( rule__CharacterAlias__AliasesAssignment_5_1 )* ) ) )
            // InternalRinform.g:3231:1: ( ( ( rule__CharacterAlias__AliasesAssignment_5_1 ) ) ( ( rule__CharacterAlias__AliasesAssignment_5_1 )* ) )
            {
            // InternalRinform.g:3231:1: ( ( ( rule__CharacterAlias__AliasesAssignment_5_1 ) ) ( ( rule__CharacterAlias__AliasesAssignment_5_1 )* ) )
            // InternalRinform.g:3232:2: ( ( rule__CharacterAlias__AliasesAssignment_5_1 ) ) ( ( rule__CharacterAlias__AliasesAssignment_5_1 )* )
            {
            // InternalRinform.g:3232:2: ( ( rule__CharacterAlias__AliasesAssignment_5_1 ) )
            // InternalRinform.g:3233:3: ( rule__CharacterAlias__AliasesAssignment_5_1 )
            {
             before(grammarAccess.getCharacterAliasAccess().getAliasesAssignment_5_1()); 
            // InternalRinform.g:3234:3: ( rule__CharacterAlias__AliasesAssignment_5_1 )
            // InternalRinform.g:3234:4: rule__CharacterAlias__AliasesAssignment_5_1
            {
            pushFollow(FOLLOW_3);
            rule__CharacterAlias__AliasesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getCharacterAliasAccess().getAliasesAssignment_5_1()); 

            }

            // InternalRinform.g:3237:2: ( ( rule__CharacterAlias__AliasesAssignment_5_1 )* )
            // InternalRinform.g:3238:3: ( rule__CharacterAlias__AliasesAssignment_5_1 )*
            {
             before(grammarAccess.getCharacterAliasAccess().getAliasesAssignment_5_1()); 
            // InternalRinform.g:3239:3: ( rule__CharacterAlias__AliasesAssignment_5_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=RULE_ID && LA19_0<=RULE_WS)||(LA19_0>=11 && LA19_0<=21)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalRinform.g:3239:4: rule__CharacterAlias__AliasesAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__CharacterAlias__AliasesAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getCharacterAliasAccess().getAliasesAssignment_5_1()); 

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
    // $ANTLR end "rule__CharacterAlias__Group_5__1__Impl"


    // $ANTLR start "rule__CharacterAlias__Group_5__2"
    // InternalRinform.g:3248:1: rule__CharacterAlias__Group_5__2 : rule__CharacterAlias__Group_5__2__Impl rule__CharacterAlias__Group_5__3 ;
    public final void rule__CharacterAlias__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:3252:1: ( rule__CharacterAlias__Group_5__2__Impl rule__CharacterAlias__Group_5__3 )
            // InternalRinform.g:3253:2: rule__CharacterAlias__Group_5__2__Impl rule__CharacterAlias__Group_5__3
            {
            pushFollow(FOLLOW_10);
            rule__CharacterAlias__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CharacterAlias__Group_5__3();

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
    // $ANTLR end "rule__CharacterAlias__Group_5__2"


    // $ANTLR start "rule__CharacterAlias__Group_5__2__Impl"
    // InternalRinform.g:3260:1: rule__CharacterAlias__Group_5__2__Impl : ( ']' ) ;
    public final void rule__CharacterAlias__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:3264:1: ( ( ']' ) )
            // InternalRinform.g:3265:1: ( ']' )
            {
            // InternalRinform.g:3265:1: ( ']' )
            // InternalRinform.g:3266:2: ']'
            {
             before(grammarAccess.getCharacterAliasAccess().getRightSquareBracketKeyword_5_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getCharacterAliasAccess().getRightSquareBracketKeyword_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacterAlias__Group_5__2__Impl"


    // $ANTLR start "rule__CharacterAlias__Group_5__3"
    // InternalRinform.g:3275:1: rule__CharacterAlias__Group_5__3 : rule__CharacterAlias__Group_5__3__Impl ;
    public final void rule__CharacterAlias__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:3279:1: ( rule__CharacterAlias__Group_5__3__Impl )
            // InternalRinform.g:3280:2: rule__CharacterAlias__Group_5__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CharacterAlias__Group_5__3__Impl();

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
    // $ANTLR end "rule__CharacterAlias__Group_5__3"


    // $ANTLR start "rule__CharacterAlias__Group_5__3__Impl"
    // InternalRinform.g:3286:1: rule__CharacterAlias__Group_5__3__Impl : ( '=' ) ;
    public final void rule__CharacterAlias__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:3290:1: ( ( '=' ) )
            // InternalRinform.g:3291:1: ( '=' )
            {
            // InternalRinform.g:3291:1: ( '=' )
            // InternalRinform.g:3292:2: '='
            {
             before(grammarAccess.getCharacterAliasAccess().getEqualsSignKeyword_5_3()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getCharacterAliasAccess().getEqualsSignKeyword_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacterAlias__Group_5__3__Impl"


    // $ANTLR start "rule__CharacterAlias__Group_6__0"
    // InternalRinform.g:3302:1: rule__CharacterAlias__Group_6__0 : rule__CharacterAlias__Group_6__0__Impl rule__CharacterAlias__Group_6__1 ;
    public final void rule__CharacterAlias__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:3306:1: ( rule__CharacterAlias__Group_6__0__Impl rule__CharacterAlias__Group_6__1 )
            // InternalRinform.g:3307:2: rule__CharacterAlias__Group_6__0__Impl rule__CharacterAlias__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__CharacterAlias__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CharacterAlias__Group_6__1();

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
    // $ANTLR end "rule__CharacterAlias__Group_6__0"


    // $ANTLR start "rule__CharacterAlias__Group_6__0__Impl"
    // InternalRinform.g:3314:1: rule__CharacterAlias__Group_6__0__Impl : ( '[' ) ;
    public final void rule__CharacterAlias__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:3318:1: ( ( '[' ) )
            // InternalRinform.g:3319:1: ( '[' )
            {
            // InternalRinform.g:3319:1: ( '[' )
            // InternalRinform.g:3320:2: '['
            {
             before(grammarAccess.getCharacterAliasAccess().getLeftSquareBracketKeyword_6_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getCharacterAliasAccess().getLeftSquareBracketKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacterAlias__Group_6__0__Impl"


    // $ANTLR start "rule__CharacterAlias__Group_6__1"
    // InternalRinform.g:3329:1: rule__CharacterAlias__Group_6__1 : rule__CharacterAlias__Group_6__1__Impl rule__CharacterAlias__Group_6__2 ;
    public final void rule__CharacterAlias__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:3333:1: ( rule__CharacterAlias__Group_6__1__Impl rule__CharacterAlias__Group_6__2 )
            // InternalRinform.g:3334:2: rule__CharacterAlias__Group_6__1__Impl rule__CharacterAlias__Group_6__2
            {
            pushFollow(FOLLOW_8);
            rule__CharacterAlias__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CharacterAlias__Group_6__2();

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
    // $ANTLR end "rule__CharacterAlias__Group_6__1"


    // $ANTLR start "rule__CharacterAlias__Group_6__1__Impl"
    // InternalRinform.g:3341:1: rule__CharacterAlias__Group_6__1__Impl : ( ( ( rule__CharacterAlias__AliasesAssignment_6_1 ) ) ( ( rule__CharacterAlias__AliasesAssignment_6_1 )* ) ) ;
    public final void rule__CharacterAlias__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:3345:1: ( ( ( ( rule__CharacterAlias__AliasesAssignment_6_1 ) ) ( ( rule__CharacterAlias__AliasesAssignment_6_1 )* ) ) )
            // InternalRinform.g:3346:1: ( ( ( rule__CharacterAlias__AliasesAssignment_6_1 ) ) ( ( rule__CharacterAlias__AliasesAssignment_6_1 )* ) )
            {
            // InternalRinform.g:3346:1: ( ( ( rule__CharacterAlias__AliasesAssignment_6_1 ) ) ( ( rule__CharacterAlias__AliasesAssignment_6_1 )* ) )
            // InternalRinform.g:3347:2: ( ( rule__CharacterAlias__AliasesAssignment_6_1 ) ) ( ( rule__CharacterAlias__AliasesAssignment_6_1 )* )
            {
            // InternalRinform.g:3347:2: ( ( rule__CharacterAlias__AliasesAssignment_6_1 ) )
            // InternalRinform.g:3348:3: ( rule__CharacterAlias__AliasesAssignment_6_1 )
            {
             before(grammarAccess.getCharacterAliasAccess().getAliasesAssignment_6_1()); 
            // InternalRinform.g:3349:3: ( rule__CharacterAlias__AliasesAssignment_6_1 )
            // InternalRinform.g:3349:4: rule__CharacterAlias__AliasesAssignment_6_1
            {
            pushFollow(FOLLOW_3);
            rule__CharacterAlias__AliasesAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getCharacterAliasAccess().getAliasesAssignment_6_1()); 

            }

            // InternalRinform.g:3352:2: ( ( rule__CharacterAlias__AliasesAssignment_6_1 )* )
            // InternalRinform.g:3353:3: ( rule__CharacterAlias__AliasesAssignment_6_1 )*
            {
             before(grammarAccess.getCharacterAliasAccess().getAliasesAssignment_6_1()); 
            // InternalRinform.g:3354:3: ( rule__CharacterAlias__AliasesAssignment_6_1 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=RULE_ID && LA20_0<=RULE_WS)||(LA20_0>=11 && LA20_0<=21)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalRinform.g:3354:4: rule__CharacterAlias__AliasesAssignment_6_1
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__CharacterAlias__AliasesAssignment_6_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getCharacterAliasAccess().getAliasesAssignment_6_1()); 

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
    // $ANTLR end "rule__CharacterAlias__Group_6__1__Impl"


    // $ANTLR start "rule__CharacterAlias__Group_6__2"
    // InternalRinform.g:3363:1: rule__CharacterAlias__Group_6__2 : rule__CharacterAlias__Group_6__2__Impl ;
    public final void rule__CharacterAlias__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:3367:1: ( rule__CharacterAlias__Group_6__2__Impl )
            // InternalRinform.g:3368:2: rule__CharacterAlias__Group_6__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CharacterAlias__Group_6__2__Impl();

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
    // $ANTLR end "rule__CharacterAlias__Group_6__2"


    // $ANTLR start "rule__CharacterAlias__Group_6__2__Impl"
    // InternalRinform.g:3374:1: rule__CharacterAlias__Group_6__2__Impl : ( ']' ) ;
    public final void rule__CharacterAlias__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:3378:1: ( ( ']' ) )
            // InternalRinform.g:3379:1: ( ']' )
            {
            // InternalRinform.g:3379:1: ( ']' )
            // InternalRinform.g:3380:2: ']'
            {
             before(grammarAccess.getCharacterAliasAccess().getRightSquareBracketKeyword_6_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getCharacterAliasAccess().getRightSquareBracketKeyword_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacterAlias__Group_6__2__Impl"


    // $ANTLR start "rule__DirectionStatement__Group__0"
    // InternalRinform.g:3390:1: rule__DirectionStatement__Group__0 : rule__DirectionStatement__Group__0__Impl rule__DirectionStatement__Group__1 ;
    public final void rule__DirectionStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:3394:1: ( rule__DirectionStatement__Group__0__Impl rule__DirectionStatement__Group__1 )
            // InternalRinform.g:3395:2: rule__DirectionStatement__Group__0__Impl rule__DirectionStatement__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalRinform.g:3402:1: rule__DirectionStatement__Group__0__Impl : ( '<' ) ;
    public final void rule__DirectionStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:3406:1: ( ( '<' ) )
            // InternalRinform.g:3407:1: ( '<' )
            {
            // InternalRinform.g:3407:1: ( '<' )
            // InternalRinform.g:3408:2: '<'
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
    // InternalRinform.g:3417:1: rule__DirectionStatement__Group__1 : rule__DirectionStatement__Group__1__Impl rule__DirectionStatement__Group__2 ;
    public final void rule__DirectionStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:3421:1: ( rule__DirectionStatement__Group__1__Impl rule__DirectionStatement__Group__2 )
            // InternalRinform.g:3422:2: rule__DirectionStatement__Group__1__Impl rule__DirectionStatement__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalRinform.g:3429:1: rule__DirectionStatement__Group__1__Impl : ( ( rule__DirectionStatement__Room1Assignment_1 ) ) ;
    public final void rule__DirectionStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:3433:1: ( ( ( rule__DirectionStatement__Room1Assignment_1 ) ) )
            // InternalRinform.g:3434:1: ( ( rule__DirectionStatement__Room1Assignment_1 ) )
            {
            // InternalRinform.g:3434:1: ( ( rule__DirectionStatement__Room1Assignment_1 ) )
            // InternalRinform.g:3435:2: ( rule__DirectionStatement__Room1Assignment_1 )
            {
             before(grammarAccess.getDirectionStatementAccess().getRoom1Assignment_1()); 
            // InternalRinform.g:3436:2: ( rule__DirectionStatement__Room1Assignment_1 )
            // InternalRinform.g:3436:3: rule__DirectionStatement__Room1Assignment_1
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
    // InternalRinform.g:3444:1: rule__DirectionStatement__Group__2 : rule__DirectionStatement__Group__2__Impl rule__DirectionStatement__Group__3 ;
    public final void rule__DirectionStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:3448:1: ( rule__DirectionStatement__Group__2__Impl rule__DirectionStatement__Group__3 )
            // InternalRinform.g:3449:2: rule__DirectionStatement__Group__2__Impl rule__DirectionStatement__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalRinform.g:3456:1: rule__DirectionStatement__Group__2__Impl : ( ( rule__DirectionStatement__DirectionAssignment_2 ) ) ;
    public final void rule__DirectionStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:3460:1: ( ( ( rule__DirectionStatement__DirectionAssignment_2 ) ) )
            // InternalRinform.g:3461:1: ( ( rule__DirectionStatement__DirectionAssignment_2 ) )
            {
            // InternalRinform.g:3461:1: ( ( rule__DirectionStatement__DirectionAssignment_2 ) )
            // InternalRinform.g:3462:2: ( rule__DirectionStatement__DirectionAssignment_2 )
            {
             before(grammarAccess.getDirectionStatementAccess().getDirectionAssignment_2()); 
            // InternalRinform.g:3463:2: ( rule__DirectionStatement__DirectionAssignment_2 )
            // InternalRinform.g:3463:3: rule__DirectionStatement__DirectionAssignment_2
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
    // InternalRinform.g:3471:1: rule__DirectionStatement__Group__3 : rule__DirectionStatement__Group__3__Impl rule__DirectionStatement__Group__4 ;
    public final void rule__DirectionStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:3475:1: ( rule__DirectionStatement__Group__3__Impl rule__DirectionStatement__Group__4 )
            // InternalRinform.g:3476:2: rule__DirectionStatement__Group__3__Impl rule__DirectionStatement__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalRinform.g:3483:1: rule__DirectionStatement__Group__3__Impl : ( ( rule__DirectionStatement__Room2Assignment_3 ) ) ;
    public final void rule__DirectionStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:3487:1: ( ( ( rule__DirectionStatement__Room2Assignment_3 ) ) )
            // InternalRinform.g:3488:1: ( ( rule__DirectionStatement__Room2Assignment_3 ) )
            {
            // InternalRinform.g:3488:1: ( ( rule__DirectionStatement__Room2Assignment_3 ) )
            // InternalRinform.g:3489:2: ( rule__DirectionStatement__Room2Assignment_3 )
            {
             before(grammarAccess.getDirectionStatementAccess().getRoom2Assignment_3()); 
            // InternalRinform.g:3490:2: ( rule__DirectionStatement__Room2Assignment_3 )
            // InternalRinform.g:3490:3: rule__DirectionStatement__Room2Assignment_3
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
    // InternalRinform.g:3498:1: rule__DirectionStatement__Group__4 : rule__DirectionStatement__Group__4__Impl ;
    public final void rule__DirectionStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:3502:1: ( rule__DirectionStatement__Group__4__Impl )
            // InternalRinform.g:3503:2: rule__DirectionStatement__Group__4__Impl
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
    // InternalRinform.g:3509:1: rule__DirectionStatement__Group__4__Impl : ( '>' ) ;
    public final void rule__DirectionStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:3513:1: ( ( '>' ) )
            // InternalRinform.g:3514:1: ( '>' )
            {
            // InternalRinform.g:3514:1: ( '>' )
            // InternalRinform.g:3515:2: '>'
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
    // InternalRinform.g:3525:1: rule__ReverseInformProgram__SentencesAssignment : ( ruleSentencePart ) ;
    public final void rule__ReverseInformProgram__SentencesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:3529:1: ( ( ruleSentencePart ) )
            // InternalRinform.g:3530:2: ( ruleSentencePart )
            {
            // InternalRinform.g:3530:2: ( ruleSentencePart )
            // InternalRinform.g:3531:3: ruleSentencePart
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
    // InternalRinform.g:3540:1: rule__RoomDeclaration__NameAssignment_1 : ( ruleText ) ;
    public final void rule__RoomDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:3544:1: ( ( ruleText ) )
            // InternalRinform.g:3545:2: ( ruleText )
            {
            // InternalRinform.g:3545:2: ( ruleText )
            // InternalRinform.g:3546:3: ruleText
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
    // InternalRinform.g:3555:1: rule__RoomDescription__RoomDescriptionAssignment_1 : ( ruleText ) ;
    public final void rule__RoomDescription__RoomDescriptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:3559:1: ( ( ruleText ) )
            // InternalRinform.g:3560:2: ( ruleText )
            {
            // InternalRinform.g:3560:2: ( ruleText )
            // InternalRinform.g:3561:3: ruleText
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
    // InternalRinform.g:3570:1: rule__RoomDescription__RoomAssignment_4 : ( ( ruleText ) ) ;
    public final void rule__RoomDescription__RoomAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:3574:1: ( ( ( ruleText ) ) )
            // InternalRinform.g:3575:2: ( ( ruleText ) )
            {
            // InternalRinform.g:3575:2: ( ( ruleText ) )
            // InternalRinform.g:3576:3: ( ruleText )
            {
             before(grammarAccess.getRoomDescriptionAccess().getRoomRoomDeclarationCrossReference_4_0()); 
            // InternalRinform.g:3577:3: ( ruleText )
            // InternalRinform.g:3578:4: ruleText
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


    // $ANTLR start "rule__RoomAlias__RoomAssignment_2"
    // InternalRinform.g:3589:1: rule__RoomAlias__RoomAssignment_2 : ( ( ruleText ) ) ;
    public final void rule__RoomAlias__RoomAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:3593:1: ( ( ( ruleText ) ) )
            // InternalRinform.g:3594:2: ( ( ruleText ) )
            {
            // InternalRinform.g:3594:2: ( ( ruleText ) )
            // InternalRinform.g:3595:3: ( ruleText )
            {
             before(grammarAccess.getRoomAliasAccess().getRoomRoomDeclarationCrossReference_2_0()); 
            // InternalRinform.g:3596:3: ( ruleText )
            // InternalRinform.g:3597:4: ruleText
            {
             before(grammarAccess.getRoomAliasAccess().getRoomRoomDeclarationTextParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getRoomAliasAccess().getRoomRoomDeclarationTextParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getRoomAliasAccess().getRoomRoomDeclarationCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoomAlias__RoomAssignment_2"


    // $ANTLR start "rule__RoomAlias__AliasesAssignment_5_1"
    // InternalRinform.g:3608:1: rule__RoomAlias__AliasesAssignment_5_1 : ( ruleText ) ;
    public final void rule__RoomAlias__AliasesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:3612:1: ( ( ruleText ) )
            // InternalRinform.g:3613:2: ( ruleText )
            {
            // InternalRinform.g:3613:2: ( ruleText )
            // InternalRinform.g:3614:3: ruleText
            {
             before(grammarAccess.getRoomAliasAccess().getAliasesTextParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getRoomAliasAccess().getAliasesTextParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoomAlias__AliasesAssignment_5_1"


    // $ANTLR start "rule__RoomAlias__AliasesAssignment_6_1"
    // InternalRinform.g:3623:1: rule__RoomAlias__AliasesAssignment_6_1 : ( ruleText ) ;
    public final void rule__RoomAlias__AliasesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:3627:1: ( ( ruleText ) )
            // InternalRinform.g:3628:2: ( ruleText )
            {
            // InternalRinform.g:3628:2: ( ruleText )
            // InternalRinform.g:3629:3: ruleText
            {
             before(grammarAccess.getRoomAliasAccess().getAliasesTextParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getRoomAliasAccess().getAliasesTextParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoomAlias__AliasesAssignment_6_1"


    // $ANTLR start "rule__ContainerDeclaration__NameAssignment_1"
    // InternalRinform.g:3638:1: rule__ContainerDeclaration__NameAssignment_1 : ( ruleText ) ;
    public final void rule__ContainerDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:3642:1: ( ( ruleText ) )
            // InternalRinform.g:3643:2: ( ruleText )
            {
            // InternalRinform.g:3643:2: ( ruleText )
            // InternalRinform.g:3644:3: ruleText
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
    // InternalRinform.g:3653:1: rule__ContainerDeclaration__RoomAssignment_5 : ( ( ruleText ) ) ;
    public final void rule__ContainerDeclaration__RoomAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:3657:1: ( ( ( ruleText ) ) )
            // InternalRinform.g:3658:2: ( ( ruleText ) )
            {
            // InternalRinform.g:3658:2: ( ( ruleText ) )
            // InternalRinform.g:3659:3: ( ruleText )
            {
             before(grammarAccess.getContainerDeclarationAccess().getRoomRoomDeclarationCrossReference_5_0()); 
            // InternalRinform.g:3660:3: ( ruleText )
            // InternalRinform.g:3661:4: ruleText
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
    // InternalRinform.g:3672:1: rule__ItemInRoomDeclaration__NameAssignment_1 : ( ruleText ) ;
    public final void rule__ItemInRoomDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:3676:1: ( ( ruleText ) )
            // InternalRinform.g:3677:2: ( ruleText )
            {
            // InternalRinform.g:3677:2: ( ruleText )
            // InternalRinform.g:3678:3: ruleText
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
    // InternalRinform.g:3687:1: rule__ItemInRoomDeclaration__RoomAssignment_5 : ( ( ruleText ) ) ;
    public final void rule__ItemInRoomDeclaration__RoomAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:3691:1: ( ( ( ruleText ) ) )
            // InternalRinform.g:3692:2: ( ( ruleText ) )
            {
            // InternalRinform.g:3692:2: ( ( ruleText ) )
            // InternalRinform.g:3693:3: ( ruleText )
            {
             before(grammarAccess.getItemInRoomDeclarationAccess().getRoomRoomDeclarationCrossReference_5_0()); 
            // InternalRinform.g:3694:3: ( ruleText )
            // InternalRinform.g:3695:4: ruleText
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
    // InternalRinform.g:3706:1: rule__ItemInContainerDeclaration__NameAssignment_1 : ( ruleText ) ;
    public final void rule__ItemInContainerDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:3710:1: ( ( ruleText ) )
            // InternalRinform.g:3711:2: ( ruleText )
            {
            // InternalRinform.g:3711:2: ( ruleText )
            // InternalRinform.g:3712:3: ruleText
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
    // InternalRinform.g:3721:1: rule__ItemInContainerDeclaration__ContainerAssignment_5 : ( ( ruleText ) ) ;
    public final void rule__ItemInContainerDeclaration__ContainerAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:3725:1: ( ( ( ruleText ) ) )
            // InternalRinform.g:3726:2: ( ( ruleText ) )
            {
            // InternalRinform.g:3726:2: ( ( ruleText ) )
            // InternalRinform.g:3727:3: ( ruleText )
            {
             before(grammarAccess.getItemInContainerDeclarationAccess().getContainerContainerDeclarationCrossReference_5_0()); 
            // InternalRinform.g:3728:3: ( ruleText )
            // InternalRinform.g:3729:4: ruleText
            {
             before(grammarAccess.getItemInContainerDeclarationAccess().getContainerContainerDeclarationTextParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getItemInContainerDeclarationAccess().getContainerContainerDeclarationTextParserRuleCall_5_0_1()); 

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
    // InternalRinform.g:3740:1: rule__ItemDescription__ItemDescriptionAssignment_1 : ( ruleText ) ;
    public final void rule__ItemDescription__ItemDescriptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:3744:1: ( ( ruleText ) )
            // InternalRinform.g:3745:2: ( ruleText )
            {
            // InternalRinform.g:3745:2: ( ruleText )
            // InternalRinform.g:3746:3: ruleText
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
    // InternalRinform.g:3755:1: rule__ItemDescription__ItemAssignment_4 : ( ( ruleText ) ) ;
    public final void rule__ItemDescription__ItemAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:3759:1: ( ( ( ruleText ) ) )
            // InternalRinform.g:3760:2: ( ( ruleText ) )
            {
            // InternalRinform.g:3760:2: ( ( ruleText ) )
            // InternalRinform.g:3761:3: ( ruleText )
            {
             before(grammarAccess.getItemDescriptionAccess().getItemItemDeclarationCrossReference_4_0()); 
            // InternalRinform.g:3762:3: ( ruleText )
            // InternalRinform.g:3763:4: ruleText
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


    // $ANTLR start "rule__ItemAlias__ItemAssignment_2"
    // InternalRinform.g:3774:1: rule__ItemAlias__ItemAssignment_2 : ( ( ruleText ) ) ;
    public final void rule__ItemAlias__ItemAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:3778:1: ( ( ( ruleText ) ) )
            // InternalRinform.g:3779:2: ( ( ruleText ) )
            {
            // InternalRinform.g:3779:2: ( ( ruleText ) )
            // InternalRinform.g:3780:3: ( ruleText )
            {
             before(grammarAccess.getItemAliasAccess().getItemItemDeclarationCrossReference_2_0()); 
            // InternalRinform.g:3781:3: ( ruleText )
            // InternalRinform.g:3782:4: ruleText
            {
             before(grammarAccess.getItemAliasAccess().getItemItemDeclarationTextParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getItemAliasAccess().getItemItemDeclarationTextParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getItemAliasAccess().getItemItemDeclarationCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemAlias__ItemAssignment_2"


    // $ANTLR start "rule__ItemAlias__AliasesAssignment_5_1"
    // InternalRinform.g:3793:1: rule__ItemAlias__AliasesAssignment_5_1 : ( ruleText ) ;
    public final void rule__ItemAlias__AliasesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:3797:1: ( ( ruleText ) )
            // InternalRinform.g:3798:2: ( ruleText )
            {
            // InternalRinform.g:3798:2: ( ruleText )
            // InternalRinform.g:3799:3: ruleText
            {
             before(grammarAccess.getItemAliasAccess().getAliasesTextParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getItemAliasAccess().getAliasesTextParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemAlias__AliasesAssignment_5_1"


    // $ANTLR start "rule__ItemAlias__AliasesAssignment_6_1"
    // InternalRinform.g:3808:1: rule__ItemAlias__AliasesAssignment_6_1 : ( ruleText ) ;
    public final void rule__ItemAlias__AliasesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:3812:1: ( ( ruleText ) )
            // InternalRinform.g:3813:2: ( ruleText )
            {
            // InternalRinform.g:3813:2: ( ruleText )
            // InternalRinform.g:3814:3: ruleText
            {
             before(grammarAccess.getItemAliasAccess().getAliasesTextParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getItemAliasAccess().getAliasesTextParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemAlias__AliasesAssignment_6_1"


    // $ANTLR start "rule__CharacterDeclaration__NameAssignment_1"
    // InternalRinform.g:3823:1: rule__CharacterDeclaration__NameAssignment_1 : ( ruleText ) ;
    public final void rule__CharacterDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:3827:1: ( ( ruleText ) )
            // InternalRinform.g:3828:2: ( ruleText )
            {
            // InternalRinform.g:3828:2: ( ruleText )
            // InternalRinform.g:3829:3: ruleText
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
    // InternalRinform.g:3838:1: rule__CharacterDeclaration__RoomAssignment_5 : ( ( ruleText ) ) ;
    public final void rule__CharacterDeclaration__RoomAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:3842:1: ( ( ( ruleText ) ) )
            // InternalRinform.g:3843:2: ( ( ruleText ) )
            {
            // InternalRinform.g:3843:2: ( ( ruleText ) )
            // InternalRinform.g:3844:3: ( ruleText )
            {
             before(grammarAccess.getCharacterDeclarationAccess().getRoomRoomDeclarationCrossReference_5_0()); 
            // InternalRinform.g:3845:3: ( ruleText )
            // InternalRinform.g:3846:4: ruleText
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
    // InternalRinform.g:3857:1: rule__CharacterDescription__PersonDescriptionAssignment_1 : ( ruleText ) ;
    public final void rule__CharacterDescription__PersonDescriptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:3861:1: ( ( ruleText ) )
            // InternalRinform.g:3862:2: ( ruleText )
            {
            // InternalRinform.g:3862:2: ( ruleText )
            // InternalRinform.g:3863:3: ruleText
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
    // InternalRinform.g:3872:1: rule__CharacterDescription__PersonAssignment_4 : ( ( ruleText ) ) ;
    public final void rule__CharacterDescription__PersonAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:3876:1: ( ( ( ruleText ) ) )
            // InternalRinform.g:3877:2: ( ( ruleText ) )
            {
            // InternalRinform.g:3877:2: ( ( ruleText ) )
            // InternalRinform.g:3878:3: ( ruleText )
            {
             before(grammarAccess.getCharacterDescriptionAccess().getPersonCharacterDeclarationCrossReference_4_0()); 
            // InternalRinform.g:3879:3: ( ruleText )
            // InternalRinform.g:3880:4: ruleText
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


    // $ANTLR start "rule__CharacterAlias__CharacterAssignment_2"
    // InternalRinform.g:3891:1: rule__CharacterAlias__CharacterAssignment_2 : ( ( ruleText ) ) ;
    public final void rule__CharacterAlias__CharacterAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:3895:1: ( ( ( ruleText ) ) )
            // InternalRinform.g:3896:2: ( ( ruleText ) )
            {
            // InternalRinform.g:3896:2: ( ( ruleText ) )
            // InternalRinform.g:3897:3: ( ruleText )
            {
             before(grammarAccess.getCharacterAliasAccess().getCharacterCharacterDeclarationCrossReference_2_0()); 
            // InternalRinform.g:3898:3: ( ruleText )
            // InternalRinform.g:3899:4: ruleText
            {
             before(grammarAccess.getCharacterAliasAccess().getCharacterCharacterDeclarationTextParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getCharacterAliasAccess().getCharacterCharacterDeclarationTextParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getCharacterAliasAccess().getCharacterCharacterDeclarationCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacterAlias__CharacterAssignment_2"


    // $ANTLR start "rule__CharacterAlias__AliasesAssignment_5_1"
    // InternalRinform.g:3910:1: rule__CharacterAlias__AliasesAssignment_5_1 : ( ruleText ) ;
    public final void rule__CharacterAlias__AliasesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:3914:1: ( ( ruleText ) )
            // InternalRinform.g:3915:2: ( ruleText )
            {
            // InternalRinform.g:3915:2: ( ruleText )
            // InternalRinform.g:3916:3: ruleText
            {
             before(grammarAccess.getCharacterAliasAccess().getAliasesTextParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getCharacterAliasAccess().getAliasesTextParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacterAlias__AliasesAssignment_5_1"


    // $ANTLR start "rule__CharacterAlias__AliasesAssignment_6_1"
    // InternalRinform.g:3925:1: rule__CharacterAlias__AliasesAssignment_6_1 : ( ruleText ) ;
    public final void rule__CharacterAlias__AliasesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:3929:1: ( ( ruleText ) )
            // InternalRinform.g:3930:2: ( ruleText )
            {
            // InternalRinform.g:3930:2: ( ruleText )
            // InternalRinform.g:3931:3: ruleText
            {
             before(grammarAccess.getCharacterAliasAccess().getAliasesTextParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getCharacterAliasAccess().getAliasesTextParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacterAlias__AliasesAssignment_6_1"


    // $ANTLR start "rule__DirectionStatement__Room1Assignment_1"
    // InternalRinform.g:3940:1: rule__DirectionStatement__Room1Assignment_1 : ( ( ruleText ) ) ;
    public final void rule__DirectionStatement__Room1Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:3944:1: ( ( ( ruleText ) ) )
            // InternalRinform.g:3945:2: ( ( ruleText ) )
            {
            // InternalRinform.g:3945:2: ( ( ruleText ) )
            // InternalRinform.g:3946:3: ( ruleText )
            {
             before(grammarAccess.getDirectionStatementAccess().getRoom1RoomDeclarationCrossReference_1_0()); 
            // InternalRinform.g:3947:3: ( ruleText )
            // InternalRinform.g:3948:4: ruleText
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
    // InternalRinform.g:3959:1: rule__DirectionStatement__DirectionAssignment_2 : ( ruleDirection ) ;
    public final void rule__DirectionStatement__DirectionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:3963:1: ( ( ruleDirection ) )
            // InternalRinform.g:3964:2: ( ruleDirection )
            {
            // InternalRinform.g:3964:2: ( ruleDirection )
            // InternalRinform.g:3965:3: ruleDirection
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
    // InternalRinform.g:3974:1: rule__DirectionStatement__Room2Assignment_3 : ( ( ruleText ) ) ;
    public final void rule__DirectionStatement__Room2Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:3978:1: ( ( ( ruleText ) ) )
            // InternalRinform.g:3979:2: ( ( ruleText ) )
            {
            // InternalRinform.g:3979:2: ( ( ruleText ) )
            // InternalRinform.g:3980:3: ( ruleText )
            {
             before(grammarAccess.getDirectionStatementAccess().getRoom2RoomDeclarationCrossReference_3_0()); 
            // InternalRinform.g:3981:3: ( ruleText )
            // InternalRinform.g:3982:4: ruleText
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
    // InternalRinform.g:3993:1: rule__Words__WordsAssignment : ( ruleText ) ;
    public final void rule__Words__WordsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:3997:1: ( ( ruleText ) )
            // InternalRinform.g:3998:2: ( ruleText )
            {
            // InternalRinform.g:3998:2: ( ruleText )
            // InternalRinform.g:3999:3: ruleText
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
    protected DFA10 dfa10 = new DFA10(this);
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA18 dfa18 = new DFA18(this);
    static final String dfa_1s = "\17\uffff";
    static final String dfa_2s = "\1\1\16\uffff";
    static final String dfa_3s = "\1\4\16\uffff";
    static final String dfa_4s = "\1\56\16\uffff";
    static final String dfa_5s = "\1\uffff\1\2\15\1";
    static final String dfa_6s = "\17\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\1\3\5\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\12\1\1\uffff\1\1\2\uffff\4\1\1\uffff\6\1",
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
            return "()* loopback of 450:4: ( rule__Text__Alternatives )*";
        }
    }
    static final String dfa_8s = "\1\55\16\uffff";
    static final String[] dfa_9s = {
            "\1\2\1\3\5\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\6\uffff\1\1\1\uffff\2\1\4\uffff\1\1\1\uffff\1\1\2\uffff\2\1\1\uffff\2\1",
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
            return "()* loopback of 482:4: ( rule__Words__WordsAssignment )*";
        }
    }
    static final String dfa_10s = "\64\uffff";
    static final String dfa_11s = "\1\4\3\uffff\1\4\5\uffff\32\4\3\uffff\15\4";
    static final String dfa_12s = "\1\55\3\uffff\1\25\5\uffff\32\54\3\uffff\15\54";
    static final String dfa_13s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\7\1\10\1\11\1\12\1\13\32\uffff\1\6\1\4\1\5\15\uffff";
    static final String dfa_14s = "\64\uffff}>";
    static final String[] dfa_15s = {
            "\2\11\5\uffff\13\11\6\uffff\1\1\1\uffff\1\4\1\5\4\uffff\1\2\1\uffff\1\2\2\uffff\1\6\1\3\1\uffff\1\7\1\10",
            "",
            "",
            "",
            "\1\12\1\13\5\uffff\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26",
            "",
            "",
            "",
            "",
            "",
            "\1\27\1\30\5\uffff\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\11\uffff\1\45\11\uffff\1\46\2\uffff\1\44",
            "\1\27\1\30\5\uffff\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\11\uffff\1\45\11\uffff\1\46\2\uffff\1\44",
            "\1\27\1\30\5\uffff\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\11\uffff\1\45\11\uffff\1\46\2\uffff\1\44",
            "\1\27\1\30\5\uffff\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\11\uffff\1\45\11\uffff\1\46\2\uffff\1\44",
            "\1\27\1\30\5\uffff\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\11\uffff\1\45\11\uffff\1\46\2\uffff\1\44",
            "\1\27\1\30\5\uffff\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\11\uffff\1\45\11\uffff\1\46\2\uffff\1\44",
            "\1\27\1\30\5\uffff\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\11\uffff\1\45\11\uffff\1\46\2\uffff\1\44",
            "\1\27\1\30\5\uffff\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\11\uffff\1\45\11\uffff\1\46\2\uffff\1\44",
            "\1\27\1\30\5\uffff\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\11\uffff\1\45\11\uffff\1\46\2\uffff\1\44",
            "\1\27\1\30\5\uffff\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\11\uffff\1\45\11\uffff\1\46\2\uffff\1\44",
            "\1\27\1\30\5\uffff\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\11\uffff\1\45\11\uffff\1\46\2\uffff\1\44",
            "\1\27\1\30\5\uffff\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\11\uffff\1\45\11\uffff\1\46\2\uffff\1\44",
            "\1\27\1\30\5\uffff\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\11\uffff\1\45\11\uffff\1\46\2\uffff\1\44",
            "\1\47\1\50\5\uffff\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\11\uffff\1\45\11\uffff\1\46\2\uffff\1\44",
            "\1\47\1\50\5\uffff\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\11\uffff\1\45\11\uffff\1\46\2\uffff\1\44",
            "\1\47\1\50\5\uffff\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\11\uffff\1\45\11\uffff\1\46\2\uffff\1\44",
            "\1\47\1\50\5\uffff\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\11\uffff\1\45\11\uffff\1\46\2\uffff\1\44",
            "\1\47\1\50\5\uffff\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\11\uffff\1\45\11\uffff\1\46\2\uffff\1\44",
            "\1\47\1\50\5\uffff\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\11\uffff\1\45\11\uffff\1\46\2\uffff\1\44",
            "\1\47\1\50\5\uffff\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\11\uffff\1\45\11\uffff\1\46\2\uffff\1\44",
            "\1\47\1\50\5\uffff\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\11\uffff\1\45\11\uffff\1\46\2\uffff\1\44",
            "\1\47\1\50\5\uffff\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\11\uffff\1\45\11\uffff\1\46\2\uffff\1\44",
            "\1\47\1\50\5\uffff\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\11\uffff\1\45\11\uffff\1\46\2\uffff\1\44",
            "\1\47\1\50\5\uffff\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\11\uffff\1\45\11\uffff\1\46\2\uffff\1\44",
            "\1\47\1\50\5\uffff\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\11\uffff\1\45\11\uffff\1\46\2\uffff\1\44",
            "\1\47\1\50\5\uffff\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\11\uffff\1\45\11\uffff\1\46\2\uffff\1\44",
            "",
            "",
            "",
            "\1\47\1\50\5\uffff\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\11\uffff\1\45\11\uffff\1\46\2\uffff\1\44",
            "\1\47\1\50\5\uffff\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\11\uffff\1\45\11\uffff\1\46\2\uffff\1\44",
            "\1\47\1\50\5\uffff\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\11\uffff\1\45\11\uffff\1\46\2\uffff\1\44",
            "\1\47\1\50\5\uffff\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\11\uffff\1\45\11\uffff\1\46\2\uffff\1\44",
            "\1\47\1\50\5\uffff\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\11\uffff\1\45\11\uffff\1\46\2\uffff\1\44",
            "\1\47\1\50\5\uffff\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\11\uffff\1\45\11\uffff\1\46\2\uffff\1\44",
            "\1\47\1\50\5\uffff\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\11\uffff\1\45\11\uffff\1\46\2\uffff\1\44",
            "\1\47\1\50\5\uffff\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\11\uffff\1\45\11\uffff\1\46\2\uffff\1\44",
            "\1\47\1\50\5\uffff\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\11\uffff\1\45\11\uffff\1\46\2\uffff\1\44",
            "\1\47\1\50\5\uffff\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\11\uffff\1\45\11\uffff\1\46\2\uffff\1\44",
            "\1\47\1\50\5\uffff\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\11\uffff\1\45\11\uffff\1\46\2\uffff\1\44",
            "\1\47\1\50\5\uffff\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\11\uffff\1\45\11\uffff\1\46\2\uffff\1\44",
            "\1\47\1\50\5\uffff\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\11\uffff\1\45\11\uffff\1\46\2\uffff\1\44"
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
            return "540:1: rule__SentencePart__Alternatives : ( ( ruleRoomDeclaration ) | ( ruleItemDeclaration ) | ( ruleCharacterDeclaration ) | ( ruleRoomDescription ) | ( ruleItemDescription ) | ( ruleCharacterDescription ) | ( ruleRoomAlias ) | ( ruleItemAlias ) | ( ruleCharacterAlias ) | ( ruleDirectionStatement ) | ( ruleWords ) );";
        }
    }
    static final String dfa_16s = "\40\uffff";
    static final String dfa_17s = "\1\44\1\4\1\uffff\32\4\1\37\2\uffff";
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
            "\1\37\10\uffff\1\36",
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
            return "615:1: rule__ItemDeclaration__Alternatives : ( ( ruleItemInRoomDeclaration ) | ( ruleContainerDeclaration ) | ( ruleItemInContainerDeclaration ) );";
        }
    }
    static final String dfa_22s = "\54\uffff";
    static final String dfa_23s = "\34\uffff\1\52\17\uffff";
    static final String dfa_24s = "\1\40\51\4\2\uffff";
    static final String dfa_25s = "\1\40\1\25\32\41\1\55\15\41\2\uffff";
    static final String dfa_26s = "\52\uffff\1\2\1\1";
    static final String dfa_27s = "\54\uffff}>";
    static final String[] dfa_28s = {
            "\1\1",
            "\1\2\1\3\5\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16",
            "\1\17\1\20\5\uffff\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\13\uffff\1\34",
            "\1\17\1\20\5\uffff\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\13\uffff\1\34",
            "\1\17\1\20\5\uffff\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\13\uffff\1\34",
            "\1\17\1\20\5\uffff\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\13\uffff\1\34",
            "\1\17\1\20\5\uffff\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\13\uffff\1\34",
            "\1\17\1\20\5\uffff\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\13\uffff\1\34",
            "\1\17\1\20\5\uffff\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\13\uffff\1\34",
            "\1\17\1\20\5\uffff\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\13\uffff\1\34",
            "\1\17\1\20\5\uffff\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\13\uffff\1\34",
            "\1\17\1\20\5\uffff\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\13\uffff\1\34",
            "\1\17\1\20\5\uffff\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\13\uffff\1\34",
            "\1\17\1\20\5\uffff\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\13\uffff\1\34",
            "\1\17\1\20\5\uffff\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\13\uffff\1\34",
            "\1\35\1\36\5\uffff\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\13\uffff\1\34",
            "\1\35\1\36\5\uffff\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\13\uffff\1\34",
            "\1\35\1\36\5\uffff\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\13\uffff\1\34",
            "\1\35\1\36\5\uffff\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\13\uffff\1\34",
            "\1\35\1\36\5\uffff\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\13\uffff\1\34",
            "\1\35\1\36\5\uffff\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\13\uffff\1\34",
            "\1\35\1\36\5\uffff\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\13\uffff\1\34",
            "\1\35\1\36\5\uffff\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\13\uffff\1\34",
            "\1\35\1\36\5\uffff\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\13\uffff\1\34",
            "\1\35\1\36\5\uffff\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\13\uffff\1\34",
            "\1\35\1\36\5\uffff\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\13\uffff\1\34",
            "\1\35\1\36\5\uffff\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\13\uffff\1\34",
            "\1\35\1\36\5\uffff\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\13\uffff\1\34",
            "\2\52\5\uffff\13\52\6\uffff\1\52\1\uffff\2\52\3\uffff\1\53\1\52\1\uffff\1\52\2\uffff\2\52\1\uffff\2\52",
            "\1\35\1\36\5\uffff\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\13\uffff\1\34",
            "\1\35\1\36\5\uffff\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\13\uffff\1\34",
            "\1\35\1\36\5\uffff\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\13\uffff\1\34",
            "\1\35\1\36\5\uffff\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\13\uffff\1\34",
            "\1\35\1\36\5\uffff\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\13\uffff\1\34",
            "\1\35\1\36\5\uffff\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\13\uffff\1\34",
            "\1\35\1\36\5\uffff\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\13\uffff\1\34",
            "\1\35\1\36\5\uffff\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\13\uffff\1\34",
            "\1\35\1\36\5\uffff\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\13\uffff\1\34",
            "\1\35\1\36\5\uffff\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\13\uffff\1\34",
            "\1\35\1\36\5\uffff\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\13\uffff\1\34",
            "\1\35\1\36\5\uffff\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\13\uffff\1\34",
            "\1\35\1\36\5\uffff\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\13\uffff\1\34",
            "",
            ""
    };

    static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final char[] dfa_24 = DFA.unpackEncodedStringToUnsignedChars(dfa_24s);
    static final char[] dfa_25 = DFA.unpackEncodedStringToUnsignedChars(dfa_25s);
    static final short[] dfa_26 = DFA.unpackEncodedString(dfa_26s);
    static final short[] dfa_27 = DFA.unpackEncodedString(dfa_27s);
    static final short[][] dfa_28 = unpackEncodedStringArray(dfa_28s);

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = dfa_22;
            this.eof = dfa_23;
            this.min = dfa_24;
            this.max = dfa_25;
            this.accept = dfa_26;
            this.special = dfa_27;
            this.transition = dfa_28;
        }
        public String getDescription() {
            return "()* loopback of 1220:2: ( rule__RoomAlias__Group_5__0 )*";
        }
    }
    static final String dfa_29s = "\34\uffff\1\53\17\uffff";
    static final String dfa_30s = "\52\uffff\1\1\1\2";
    static final String[] dfa_31s = {
            "\1\1",
            "\1\2\1\3\5\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16",
            "\1\17\1\20\5\uffff\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\13\uffff\1\34",
            "\1\17\1\20\5\uffff\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\13\uffff\1\34",
            "\1\17\1\20\5\uffff\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\13\uffff\1\34",
            "\1\17\1\20\5\uffff\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\13\uffff\1\34",
            "\1\17\1\20\5\uffff\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\13\uffff\1\34",
            "\1\17\1\20\5\uffff\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\13\uffff\1\34",
            "\1\17\1\20\5\uffff\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\13\uffff\1\34",
            "\1\17\1\20\5\uffff\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\13\uffff\1\34",
            "\1\17\1\20\5\uffff\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\13\uffff\1\34",
            "\1\17\1\20\5\uffff\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\13\uffff\1\34",
            "\1\17\1\20\5\uffff\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\13\uffff\1\34",
            "\1\17\1\20\5\uffff\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\13\uffff\1\34",
            "\1\17\1\20\5\uffff\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\13\uffff\1\34",
            "\1\35\1\36\5\uffff\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\13\uffff\1\34",
            "\1\35\1\36\5\uffff\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\13\uffff\1\34",
            "\1\35\1\36\5\uffff\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\13\uffff\1\34",
            "\1\35\1\36\5\uffff\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\13\uffff\1\34",
            "\1\35\1\36\5\uffff\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\13\uffff\1\34",
            "\1\35\1\36\5\uffff\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\13\uffff\1\34",
            "\1\35\1\36\5\uffff\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\13\uffff\1\34",
            "\1\35\1\36\5\uffff\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\13\uffff\1\34",
            "\1\35\1\36\5\uffff\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\13\uffff\1\34",
            "\1\35\1\36\5\uffff\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\13\uffff\1\34",
            "\1\35\1\36\5\uffff\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\13\uffff\1\34",
            "\1\35\1\36\5\uffff\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\13\uffff\1\34",
            "\1\35\1\36\5\uffff\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\13\uffff\1\34",
            "\2\53\5\uffff\13\53\6\uffff\1\53\1\uffff\2\53\3\uffff\1\52\1\53\1\uffff\1\53\2\uffff\2\53\1\uffff\2\53",
            "\1\35\1\36\5\uffff\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\13\uffff\1\34",
            "\1\35\1\36\5\uffff\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\13\uffff\1\34",
            "\1\35\1\36\5\uffff\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\13\uffff\1\34",
            "\1\35\1\36\5\uffff\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\13\uffff\1\34",
            "\1\35\1\36\5\uffff\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\13\uffff\1\34",
            "\1\35\1\36\5\uffff\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\13\uffff\1\34",
            "\1\35\1\36\5\uffff\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\13\uffff\1\34",
            "\1\35\1\36\5\uffff\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\13\uffff\1\34",
            "\1\35\1\36\5\uffff\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\13\uffff\1\34",
            "\1\35\1\36\5\uffff\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\13\uffff\1\34",
            "\1\35\1\36\5\uffff\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\13\uffff\1\34",
            "\1\35\1\36\5\uffff\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\13\uffff\1\34",
            "\1\35\1\36\5\uffff\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\13\uffff\1\34",
            "",
            ""
    };
    static final short[] dfa_29 = DFA.unpackEncodedString(dfa_29s);
    static final short[] dfa_30 = DFA.unpackEncodedString(dfa_30s);
    static final short[][] dfa_31 = unpackEncodedStringArray(dfa_31s);

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = dfa_22;
            this.eof = dfa_29;
            this.min = dfa_24;
            this.max = dfa_25;
            this.accept = dfa_30;
            this.special = dfa_27;
            this.transition = dfa_31;
        }
        public String getDescription() {
            return "()* loopback of 2375:2: ( rule__ItemAlias__Group_5__0 )*";
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = dfa_22;
            this.eof = dfa_23;
            this.min = dfa_24;
            this.max = dfa_25;
            this.accept = dfa_26;
            this.special = dfa_27;
            this.transition = dfa_28;
        }
        public String getDescription() {
            return "()* loopback of 3152:2: ( rule__CharacterAlias__Group_5__0 )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00003650D03FF832L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00003650D03FF830L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000FC00000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000400000000000L});

}