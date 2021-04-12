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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_WS", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'South'", "'North'", "'East'", "'West'", "'Below'", "'Above'", "'-r'", "'('", "')'", "'-c'", "'-i'", "'-p'", "'<'", "'>'"
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
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

                if ( (LA1_0==RULE_ID||(LA1_0>=17 && LA1_0<=18)||(LA1_0>=20 && LA1_0<=23)) ) {
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


    // $ANTLR start "ruleDirection"
    // InternalRinform.g:410:1: ruleDirection : ( ( rule__Direction__Alternatives ) ) ;
    public final void ruleDirection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:414:1: ( ( ( rule__Direction__Alternatives ) ) )
            // InternalRinform.g:415:2: ( ( rule__Direction__Alternatives ) )
            {
            // InternalRinform.g:415:2: ( ( rule__Direction__Alternatives ) )
            // InternalRinform.g:416:3: ( rule__Direction__Alternatives )
            {
             before(grammarAccess.getDirectionAccess().getAlternatives()); 
            // InternalRinform.g:417:3: ( rule__Direction__Alternatives )
            // InternalRinform.g:417:4: rule__Direction__Alternatives
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
    // InternalRinform.g:425:1: rule__SentencePart__Alternatives : ( ( ruleRoomDeclaration ) | ( ruleRoomDescription ) | ( ruleItemDeclaration ) | ( ruleItemDescription ) | ( rulePersonDeclaration ) | ( rulePersonDescription ) | ( ruleWords ) | ( ruleDirectionStatement ) );
    public final void rule__SentencePart__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:429:1: ( ( ruleRoomDeclaration ) | ( ruleRoomDescription ) | ( ruleItemDeclaration ) | ( ruleItemDescription ) | ( rulePersonDeclaration ) | ( rulePersonDescription ) | ( ruleWords ) | ( ruleDirectionStatement ) )
            int alt3=8;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalRinform.g:430:2: ( ruleRoomDeclaration )
                    {
                    // InternalRinform.g:430:2: ( ruleRoomDeclaration )
                    // InternalRinform.g:431:3: ruleRoomDeclaration
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
                    // InternalRinform.g:436:2: ( ruleRoomDescription )
                    {
                    // InternalRinform.g:436:2: ( ruleRoomDescription )
                    // InternalRinform.g:437:3: ruleRoomDescription
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
                    // InternalRinform.g:442:2: ( ruleItemDeclaration )
                    {
                    // InternalRinform.g:442:2: ( ruleItemDeclaration )
                    // InternalRinform.g:443:3: ruleItemDeclaration
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
                    // InternalRinform.g:448:2: ( ruleItemDescription )
                    {
                    // InternalRinform.g:448:2: ( ruleItemDescription )
                    // InternalRinform.g:449:3: ruleItemDescription
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
                    // InternalRinform.g:454:2: ( rulePersonDeclaration )
                    {
                    // InternalRinform.g:454:2: ( rulePersonDeclaration )
                    // InternalRinform.g:455:3: rulePersonDeclaration
                    {
                     before(grammarAccess.getSentencePartAccess().getPersonDeclarationParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    rulePersonDeclaration();

                    state._fsp--;

                     after(grammarAccess.getSentencePartAccess().getPersonDeclarationParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalRinform.g:460:2: ( rulePersonDescription )
                    {
                    // InternalRinform.g:460:2: ( rulePersonDescription )
                    // InternalRinform.g:461:3: rulePersonDescription
                    {
                     before(grammarAccess.getSentencePartAccess().getPersonDescriptionParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    rulePersonDescription();

                    state._fsp--;

                     after(grammarAccess.getSentencePartAccess().getPersonDescriptionParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalRinform.g:466:2: ( ruleWords )
                    {
                    // InternalRinform.g:466:2: ( ruleWords )
                    // InternalRinform.g:467:3: ruleWords
                    {
                     before(grammarAccess.getSentencePartAccess().getWordsParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleWords();

                    state._fsp--;

                     after(grammarAccess.getSentencePartAccess().getWordsParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalRinform.g:472:2: ( ruleDirectionStatement )
                    {
                    // InternalRinform.g:472:2: ( ruleDirectionStatement )
                    // InternalRinform.g:473:3: ruleDirectionStatement
                    {
                     before(grammarAccess.getSentencePartAccess().getDirectionStatementParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleDirectionStatement();

                    state._fsp--;

                     after(grammarAccess.getSentencePartAccess().getDirectionStatementParserRuleCall_7()); 

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
    // InternalRinform.g:482:1: rule__ItemDeclaration__Alternatives : ( ( ruleItemInRoomDeclaration ) | ( ruleContainerDeclaration ) | ( ruleItemInContainerDeclaration ) );
    public final void rule__ItemDeclaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:486:1: ( ( ruleItemInRoomDeclaration ) | ( ruleContainerDeclaration ) | ( ruleItemInContainerDeclaration ) )
            int alt4=3;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalRinform.g:487:2: ( ruleItemInRoomDeclaration )
                    {
                    // InternalRinform.g:487:2: ( ruleItemInRoomDeclaration )
                    // InternalRinform.g:488:3: ruleItemInRoomDeclaration
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
                    // InternalRinform.g:493:2: ( ruleContainerDeclaration )
                    {
                    // InternalRinform.g:493:2: ( ruleContainerDeclaration )
                    // InternalRinform.g:494:3: ruleContainerDeclaration
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
                    // InternalRinform.g:499:2: ( ruleItemInContainerDeclaration )
                    {
                    // InternalRinform.g:499:2: ( ruleItemInContainerDeclaration )
                    // InternalRinform.g:500:3: ruleItemInContainerDeclaration
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


    // $ANTLR start "rule__Direction__Alternatives"
    // InternalRinform.g:509:1: rule__Direction__Alternatives : ( ( ( 'South' ) ) | ( ( 'North' ) ) | ( ( 'East' ) ) | ( ( 'West' ) ) | ( ( 'Below' ) ) | ( ( 'Above' ) ) );
    public final void rule__Direction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:513:1: ( ( ( 'South' ) ) | ( ( 'North' ) ) | ( ( 'East' ) ) | ( ( 'West' ) ) | ( ( 'Below' ) ) | ( ( 'Above' ) ) )
            int alt5=6;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalRinform.g:514:2: ( ( 'South' ) )
                    {
                    // InternalRinform.g:514:2: ( ( 'South' ) )
                    // InternalRinform.g:515:3: ( 'South' )
                    {
                     before(grammarAccess.getDirectionAccess().getSouthEnumLiteralDeclaration_0()); 
                    // InternalRinform.g:516:3: ( 'South' )
                    // InternalRinform.g:516:4: 'South'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectionAccess().getSouthEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRinform.g:520:2: ( ( 'North' ) )
                    {
                    // InternalRinform.g:520:2: ( ( 'North' ) )
                    // InternalRinform.g:521:3: ( 'North' )
                    {
                     before(grammarAccess.getDirectionAccess().getNorthEnumLiteralDeclaration_1()); 
                    // InternalRinform.g:522:3: ( 'North' )
                    // InternalRinform.g:522:4: 'North'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectionAccess().getNorthEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRinform.g:526:2: ( ( 'East' ) )
                    {
                    // InternalRinform.g:526:2: ( ( 'East' ) )
                    // InternalRinform.g:527:3: ( 'East' )
                    {
                     before(grammarAccess.getDirectionAccess().getEastEnumLiteralDeclaration_2()); 
                    // InternalRinform.g:528:3: ( 'East' )
                    // InternalRinform.g:528:4: 'East'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectionAccess().getEastEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRinform.g:532:2: ( ( 'West' ) )
                    {
                    // InternalRinform.g:532:2: ( ( 'West' ) )
                    // InternalRinform.g:533:3: ( 'West' )
                    {
                     before(grammarAccess.getDirectionAccess().getWestEnumLiteralDeclaration_3()); 
                    // InternalRinform.g:534:3: ( 'West' )
                    // InternalRinform.g:534:4: 'West'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectionAccess().getWestEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalRinform.g:538:2: ( ( 'Below' ) )
                    {
                    // InternalRinform.g:538:2: ( ( 'Below' ) )
                    // InternalRinform.g:539:3: ( 'Below' )
                    {
                     before(grammarAccess.getDirectionAccess().getBelowEnumLiteralDeclaration_4()); 
                    // InternalRinform.g:540:3: ( 'Below' )
                    // InternalRinform.g:540:4: 'Below'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectionAccess().getBelowEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalRinform.g:544:2: ( ( 'Above' ) )
                    {
                    // InternalRinform.g:544:2: ( ( 'Above' ) )
                    // InternalRinform.g:545:3: ( 'Above' )
                    {
                     before(grammarAccess.getDirectionAccess().getAboveEnumLiteralDeclaration_5()); 
                    // InternalRinform.g:546:3: ( 'Above' )
                    // InternalRinform.g:546:4: 'Above'
                    {
                    match(input,16,FOLLOW_2); 

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
    // InternalRinform.g:554:1: rule__RoomDeclaration__Group__0 : rule__RoomDeclaration__Group__0__Impl rule__RoomDeclaration__Group__1 ;
    public final void rule__RoomDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:558:1: ( rule__RoomDeclaration__Group__0__Impl rule__RoomDeclaration__Group__1 )
            // InternalRinform.g:559:2: rule__RoomDeclaration__Group__0__Impl rule__RoomDeclaration__Group__1
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
    // InternalRinform.g:566:1: rule__RoomDeclaration__Group__0__Impl : ( '-r' ) ;
    public final void rule__RoomDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:570:1: ( ( '-r' ) )
            // InternalRinform.g:571:1: ( '-r' )
            {
            // InternalRinform.g:571:1: ( '-r' )
            // InternalRinform.g:572:2: '-r'
            {
             before(grammarAccess.getRoomDeclarationAccess().getRKeyword_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalRinform.g:581:1: rule__RoomDeclaration__Group__1 : rule__RoomDeclaration__Group__1__Impl ;
    public final void rule__RoomDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:585:1: ( rule__RoomDeclaration__Group__1__Impl )
            // InternalRinform.g:586:2: rule__RoomDeclaration__Group__1__Impl
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
    // InternalRinform.g:592:1: rule__RoomDeclaration__Group__1__Impl : ( ( rule__RoomDeclaration__NameAssignment_1 ) ) ;
    public final void rule__RoomDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:596:1: ( ( ( rule__RoomDeclaration__NameAssignment_1 ) ) )
            // InternalRinform.g:597:1: ( ( rule__RoomDeclaration__NameAssignment_1 ) )
            {
            // InternalRinform.g:597:1: ( ( rule__RoomDeclaration__NameAssignment_1 ) )
            // InternalRinform.g:598:2: ( rule__RoomDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getRoomDeclarationAccess().getNameAssignment_1()); 
            // InternalRinform.g:599:2: ( rule__RoomDeclaration__NameAssignment_1 )
            // InternalRinform.g:599:3: rule__RoomDeclaration__NameAssignment_1
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
    // InternalRinform.g:608:1: rule__RoomDescription__Group__0 : rule__RoomDescription__Group__0__Impl rule__RoomDescription__Group__1 ;
    public final void rule__RoomDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:612:1: ( rule__RoomDescription__Group__0__Impl rule__RoomDescription__Group__1 )
            // InternalRinform.g:613:2: rule__RoomDescription__Group__0__Impl rule__RoomDescription__Group__1
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
    // InternalRinform.g:620:1: rule__RoomDescription__Group__0__Impl : ( '(' ) ;
    public final void rule__RoomDescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:624:1: ( ( '(' ) )
            // InternalRinform.g:625:1: ( '(' )
            {
            // InternalRinform.g:625:1: ( '(' )
            // InternalRinform.g:626:2: '('
            {
             before(grammarAccess.getRoomDescriptionAccess().getLeftParenthesisKeyword_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalRinform.g:635:1: rule__RoomDescription__Group__1 : rule__RoomDescription__Group__1__Impl rule__RoomDescription__Group__2 ;
    public final void rule__RoomDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:639:1: ( rule__RoomDescription__Group__1__Impl rule__RoomDescription__Group__2 )
            // InternalRinform.g:640:2: rule__RoomDescription__Group__1__Impl rule__RoomDescription__Group__2
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
    // InternalRinform.g:647:1: rule__RoomDescription__Group__1__Impl : ( ( ( rule__RoomDescription__RoomDescriptionAssignment_1 ) ) ( ( rule__RoomDescription__RoomDescriptionAssignment_1 )* ) ) ;
    public final void rule__RoomDescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:651:1: ( ( ( ( rule__RoomDescription__RoomDescriptionAssignment_1 ) ) ( ( rule__RoomDescription__RoomDescriptionAssignment_1 )* ) ) )
            // InternalRinform.g:652:1: ( ( ( rule__RoomDescription__RoomDescriptionAssignment_1 ) ) ( ( rule__RoomDescription__RoomDescriptionAssignment_1 )* ) )
            {
            // InternalRinform.g:652:1: ( ( ( rule__RoomDescription__RoomDescriptionAssignment_1 ) ) ( ( rule__RoomDescription__RoomDescriptionAssignment_1 )* ) )
            // InternalRinform.g:653:2: ( ( rule__RoomDescription__RoomDescriptionAssignment_1 ) ) ( ( rule__RoomDescription__RoomDescriptionAssignment_1 )* )
            {
            // InternalRinform.g:653:2: ( ( rule__RoomDescription__RoomDescriptionAssignment_1 ) )
            // InternalRinform.g:654:3: ( rule__RoomDescription__RoomDescriptionAssignment_1 )
            {
             before(grammarAccess.getRoomDescriptionAccess().getRoomDescriptionAssignment_1()); 
            // InternalRinform.g:655:3: ( rule__RoomDescription__RoomDescriptionAssignment_1 )
            // InternalRinform.g:655:4: rule__RoomDescription__RoomDescriptionAssignment_1
            {
            pushFollow(FOLLOW_4);
            rule__RoomDescription__RoomDescriptionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRoomDescriptionAccess().getRoomDescriptionAssignment_1()); 

            }

            // InternalRinform.g:658:2: ( ( rule__RoomDescription__RoomDescriptionAssignment_1 )* )
            // InternalRinform.g:659:3: ( rule__RoomDescription__RoomDescriptionAssignment_1 )*
            {
             before(grammarAccess.getRoomDescriptionAccess().getRoomDescriptionAssignment_1()); 
            // InternalRinform.g:660:3: ( rule__RoomDescription__RoomDescriptionAssignment_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalRinform.g:660:4: rule__RoomDescription__RoomDescriptionAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__RoomDescription__RoomDescriptionAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalRinform.g:669:1: rule__RoomDescription__Group__2 : rule__RoomDescription__Group__2__Impl rule__RoomDescription__Group__3 ;
    public final void rule__RoomDescription__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:673:1: ( rule__RoomDescription__Group__2__Impl rule__RoomDescription__Group__3 )
            // InternalRinform.g:674:2: rule__RoomDescription__Group__2__Impl rule__RoomDescription__Group__3
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
    // InternalRinform.g:681:1: rule__RoomDescription__Group__2__Impl : ( '-r' ) ;
    public final void rule__RoomDescription__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:685:1: ( ( '-r' ) )
            // InternalRinform.g:686:1: ( '-r' )
            {
            // InternalRinform.g:686:1: ( '-r' )
            // InternalRinform.g:687:2: '-r'
            {
             before(grammarAccess.getRoomDescriptionAccess().getRKeyword_2()); 
            match(input,17,FOLLOW_2); 
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
    // InternalRinform.g:696:1: rule__RoomDescription__Group__3 : rule__RoomDescription__Group__3__Impl rule__RoomDescription__Group__4 ;
    public final void rule__RoomDescription__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:700:1: ( rule__RoomDescription__Group__3__Impl rule__RoomDescription__Group__4 )
            // InternalRinform.g:701:2: rule__RoomDescription__Group__3__Impl rule__RoomDescription__Group__4
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
    // InternalRinform.g:708:1: rule__RoomDescription__Group__3__Impl : ( ( rule__RoomDescription__RoomAssignment_3 ) ) ;
    public final void rule__RoomDescription__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:712:1: ( ( ( rule__RoomDescription__RoomAssignment_3 ) ) )
            // InternalRinform.g:713:1: ( ( rule__RoomDescription__RoomAssignment_3 ) )
            {
            // InternalRinform.g:713:1: ( ( rule__RoomDescription__RoomAssignment_3 ) )
            // InternalRinform.g:714:2: ( rule__RoomDescription__RoomAssignment_3 )
            {
             before(grammarAccess.getRoomDescriptionAccess().getRoomAssignment_3()); 
            // InternalRinform.g:715:2: ( rule__RoomDescription__RoomAssignment_3 )
            // InternalRinform.g:715:3: rule__RoomDescription__RoomAssignment_3
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
    // InternalRinform.g:723:1: rule__RoomDescription__Group__4 : rule__RoomDescription__Group__4__Impl ;
    public final void rule__RoomDescription__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:727:1: ( rule__RoomDescription__Group__4__Impl )
            // InternalRinform.g:728:2: rule__RoomDescription__Group__4__Impl
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
    // InternalRinform.g:734:1: rule__RoomDescription__Group__4__Impl : ( ')' ) ;
    public final void rule__RoomDescription__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:738:1: ( ( ')' ) )
            // InternalRinform.g:739:1: ( ')' )
            {
            // InternalRinform.g:739:1: ( ')' )
            // InternalRinform.g:740:2: ')'
            {
             before(grammarAccess.getRoomDescriptionAccess().getRightParenthesisKeyword_4()); 
            match(input,19,FOLLOW_2); 
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
    // InternalRinform.g:750:1: rule__ContainerDeclaration__Group__0 : rule__ContainerDeclaration__Group__0__Impl rule__ContainerDeclaration__Group__1 ;
    public final void rule__ContainerDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:754:1: ( rule__ContainerDeclaration__Group__0__Impl rule__ContainerDeclaration__Group__1 )
            // InternalRinform.g:755:2: rule__ContainerDeclaration__Group__0__Impl rule__ContainerDeclaration__Group__1
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
    // InternalRinform.g:762:1: rule__ContainerDeclaration__Group__0__Impl : ( '-c' ) ;
    public final void rule__ContainerDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:766:1: ( ( '-c' ) )
            // InternalRinform.g:767:1: ( '-c' )
            {
            // InternalRinform.g:767:1: ( '-c' )
            // InternalRinform.g:768:2: '-c'
            {
             before(grammarAccess.getContainerDeclarationAccess().getCKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalRinform.g:777:1: rule__ContainerDeclaration__Group__1 : rule__ContainerDeclaration__Group__1__Impl rule__ContainerDeclaration__Group__2 ;
    public final void rule__ContainerDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:781:1: ( rule__ContainerDeclaration__Group__1__Impl rule__ContainerDeclaration__Group__2 )
            // InternalRinform.g:782:2: rule__ContainerDeclaration__Group__1__Impl rule__ContainerDeclaration__Group__2
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
    // InternalRinform.g:789:1: rule__ContainerDeclaration__Group__1__Impl : ( ( rule__ContainerDeclaration__NameAssignment_1 ) ) ;
    public final void rule__ContainerDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:793:1: ( ( ( rule__ContainerDeclaration__NameAssignment_1 ) ) )
            // InternalRinform.g:794:1: ( ( rule__ContainerDeclaration__NameAssignment_1 ) )
            {
            // InternalRinform.g:794:1: ( ( rule__ContainerDeclaration__NameAssignment_1 ) )
            // InternalRinform.g:795:2: ( rule__ContainerDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getContainerDeclarationAccess().getNameAssignment_1()); 
            // InternalRinform.g:796:2: ( rule__ContainerDeclaration__NameAssignment_1 )
            // InternalRinform.g:796:3: rule__ContainerDeclaration__NameAssignment_1
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
    // InternalRinform.g:804:1: rule__ContainerDeclaration__Group__2 : rule__ContainerDeclaration__Group__2__Impl rule__ContainerDeclaration__Group__3 ;
    public final void rule__ContainerDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:808:1: ( rule__ContainerDeclaration__Group__2__Impl rule__ContainerDeclaration__Group__3 )
            // InternalRinform.g:809:2: rule__ContainerDeclaration__Group__2__Impl rule__ContainerDeclaration__Group__3
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
    // InternalRinform.g:816:1: rule__ContainerDeclaration__Group__2__Impl : ( '-r' ) ;
    public final void rule__ContainerDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:820:1: ( ( '-r' ) )
            // InternalRinform.g:821:1: ( '-r' )
            {
            // InternalRinform.g:821:1: ( '-r' )
            // InternalRinform.g:822:2: '-r'
            {
             before(grammarAccess.getContainerDeclarationAccess().getRKeyword_2()); 
            match(input,17,FOLLOW_2); 
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
    // InternalRinform.g:831:1: rule__ContainerDeclaration__Group__3 : rule__ContainerDeclaration__Group__3__Impl ;
    public final void rule__ContainerDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:835:1: ( rule__ContainerDeclaration__Group__3__Impl )
            // InternalRinform.g:836:2: rule__ContainerDeclaration__Group__3__Impl
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
    // InternalRinform.g:842:1: rule__ContainerDeclaration__Group__3__Impl : ( ( rule__ContainerDeclaration__RoomAssignment_3 ) ) ;
    public final void rule__ContainerDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:846:1: ( ( ( rule__ContainerDeclaration__RoomAssignment_3 ) ) )
            // InternalRinform.g:847:1: ( ( rule__ContainerDeclaration__RoomAssignment_3 ) )
            {
            // InternalRinform.g:847:1: ( ( rule__ContainerDeclaration__RoomAssignment_3 ) )
            // InternalRinform.g:848:2: ( rule__ContainerDeclaration__RoomAssignment_3 )
            {
             before(grammarAccess.getContainerDeclarationAccess().getRoomAssignment_3()); 
            // InternalRinform.g:849:2: ( rule__ContainerDeclaration__RoomAssignment_3 )
            // InternalRinform.g:849:3: rule__ContainerDeclaration__RoomAssignment_3
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
    // InternalRinform.g:858:1: rule__ItemInRoomDeclaration__Group__0 : rule__ItemInRoomDeclaration__Group__0__Impl rule__ItemInRoomDeclaration__Group__1 ;
    public final void rule__ItemInRoomDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:862:1: ( rule__ItemInRoomDeclaration__Group__0__Impl rule__ItemInRoomDeclaration__Group__1 )
            // InternalRinform.g:863:2: rule__ItemInRoomDeclaration__Group__0__Impl rule__ItemInRoomDeclaration__Group__1
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
    // InternalRinform.g:870:1: rule__ItemInRoomDeclaration__Group__0__Impl : ( '-i' ) ;
    public final void rule__ItemInRoomDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:874:1: ( ( '-i' ) )
            // InternalRinform.g:875:1: ( '-i' )
            {
            // InternalRinform.g:875:1: ( '-i' )
            // InternalRinform.g:876:2: '-i'
            {
             before(grammarAccess.getItemInRoomDeclarationAccess().getIKeyword_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalRinform.g:885:1: rule__ItemInRoomDeclaration__Group__1 : rule__ItemInRoomDeclaration__Group__1__Impl rule__ItemInRoomDeclaration__Group__2 ;
    public final void rule__ItemInRoomDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:889:1: ( rule__ItemInRoomDeclaration__Group__1__Impl rule__ItemInRoomDeclaration__Group__2 )
            // InternalRinform.g:890:2: rule__ItemInRoomDeclaration__Group__1__Impl rule__ItemInRoomDeclaration__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalRinform.g:897:1: rule__ItemInRoomDeclaration__Group__1__Impl : ( ( rule__ItemInRoomDeclaration__NameAssignment_1 ) ) ;
    public final void rule__ItemInRoomDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:901:1: ( ( ( rule__ItemInRoomDeclaration__NameAssignment_1 ) ) )
            // InternalRinform.g:902:1: ( ( rule__ItemInRoomDeclaration__NameAssignment_1 ) )
            {
            // InternalRinform.g:902:1: ( ( rule__ItemInRoomDeclaration__NameAssignment_1 ) )
            // InternalRinform.g:903:2: ( rule__ItemInRoomDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getItemInRoomDeclarationAccess().getNameAssignment_1()); 
            // InternalRinform.g:904:2: ( rule__ItemInRoomDeclaration__NameAssignment_1 )
            // InternalRinform.g:904:3: rule__ItemInRoomDeclaration__NameAssignment_1
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
    // InternalRinform.g:912:1: rule__ItemInRoomDeclaration__Group__2 : rule__ItemInRoomDeclaration__Group__2__Impl rule__ItemInRoomDeclaration__Group__3 ;
    public final void rule__ItemInRoomDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:916:1: ( rule__ItemInRoomDeclaration__Group__2__Impl rule__ItemInRoomDeclaration__Group__3 )
            // InternalRinform.g:917:2: rule__ItemInRoomDeclaration__Group__2__Impl rule__ItemInRoomDeclaration__Group__3
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
    // InternalRinform.g:924:1: rule__ItemInRoomDeclaration__Group__2__Impl : ( '-r' ) ;
    public final void rule__ItemInRoomDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:928:1: ( ( '-r' ) )
            // InternalRinform.g:929:1: ( '-r' )
            {
            // InternalRinform.g:929:1: ( '-r' )
            // InternalRinform.g:930:2: '-r'
            {
             before(grammarAccess.getItemInRoomDeclarationAccess().getRKeyword_2()); 
            match(input,17,FOLLOW_2); 
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
    // InternalRinform.g:939:1: rule__ItemInRoomDeclaration__Group__3 : rule__ItemInRoomDeclaration__Group__3__Impl ;
    public final void rule__ItemInRoomDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:943:1: ( rule__ItemInRoomDeclaration__Group__3__Impl )
            // InternalRinform.g:944:2: rule__ItemInRoomDeclaration__Group__3__Impl
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
    // InternalRinform.g:950:1: rule__ItemInRoomDeclaration__Group__3__Impl : ( ( rule__ItemInRoomDeclaration__RoomAssignment_3 ) ) ;
    public final void rule__ItemInRoomDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:954:1: ( ( ( rule__ItemInRoomDeclaration__RoomAssignment_3 ) ) )
            // InternalRinform.g:955:1: ( ( rule__ItemInRoomDeclaration__RoomAssignment_3 ) )
            {
            // InternalRinform.g:955:1: ( ( rule__ItemInRoomDeclaration__RoomAssignment_3 ) )
            // InternalRinform.g:956:2: ( rule__ItemInRoomDeclaration__RoomAssignment_3 )
            {
             before(grammarAccess.getItemInRoomDeclarationAccess().getRoomAssignment_3()); 
            // InternalRinform.g:957:2: ( rule__ItemInRoomDeclaration__RoomAssignment_3 )
            // InternalRinform.g:957:3: rule__ItemInRoomDeclaration__RoomAssignment_3
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
    // InternalRinform.g:966:1: rule__ItemInContainerDeclaration__Group__0 : rule__ItemInContainerDeclaration__Group__0__Impl rule__ItemInContainerDeclaration__Group__1 ;
    public final void rule__ItemInContainerDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:970:1: ( rule__ItemInContainerDeclaration__Group__0__Impl rule__ItemInContainerDeclaration__Group__1 )
            // InternalRinform.g:971:2: rule__ItemInContainerDeclaration__Group__0__Impl rule__ItemInContainerDeclaration__Group__1
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
    // InternalRinform.g:978:1: rule__ItemInContainerDeclaration__Group__0__Impl : ( '-i' ) ;
    public final void rule__ItemInContainerDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:982:1: ( ( '-i' ) )
            // InternalRinform.g:983:1: ( '-i' )
            {
            // InternalRinform.g:983:1: ( '-i' )
            // InternalRinform.g:984:2: '-i'
            {
             before(grammarAccess.getItemInContainerDeclarationAccess().getIKeyword_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalRinform.g:993:1: rule__ItemInContainerDeclaration__Group__1 : rule__ItemInContainerDeclaration__Group__1__Impl rule__ItemInContainerDeclaration__Group__2 ;
    public final void rule__ItemInContainerDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:997:1: ( rule__ItemInContainerDeclaration__Group__1__Impl rule__ItemInContainerDeclaration__Group__2 )
            // InternalRinform.g:998:2: rule__ItemInContainerDeclaration__Group__1__Impl rule__ItemInContainerDeclaration__Group__2
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
    // InternalRinform.g:1005:1: rule__ItemInContainerDeclaration__Group__1__Impl : ( ( rule__ItemInContainerDeclaration__NameAssignment_1 ) ) ;
    public final void rule__ItemInContainerDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1009:1: ( ( ( rule__ItemInContainerDeclaration__NameAssignment_1 ) ) )
            // InternalRinform.g:1010:1: ( ( rule__ItemInContainerDeclaration__NameAssignment_1 ) )
            {
            // InternalRinform.g:1010:1: ( ( rule__ItemInContainerDeclaration__NameAssignment_1 ) )
            // InternalRinform.g:1011:2: ( rule__ItemInContainerDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getItemInContainerDeclarationAccess().getNameAssignment_1()); 
            // InternalRinform.g:1012:2: ( rule__ItemInContainerDeclaration__NameAssignment_1 )
            // InternalRinform.g:1012:3: rule__ItemInContainerDeclaration__NameAssignment_1
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
    // InternalRinform.g:1020:1: rule__ItemInContainerDeclaration__Group__2 : rule__ItemInContainerDeclaration__Group__2__Impl rule__ItemInContainerDeclaration__Group__3 ;
    public final void rule__ItemInContainerDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1024:1: ( rule__ItemInContainerDeclaration__Group__2__Impl rule__ItemInContainerDeclaration__Group__3 )
            // InternalRinform.g:1025:2: rule__ItemInContainerDeclaration__Group__2__Impl rule__ItemInContainerDeclaration__Group__3
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
    // InternalRinform.g:1032:1: rule__ItemInContainerDeclaration__Group__2__Impl : ( '-c' ) ;
    public final void rule__ItemInContainerDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1036:1: ( ( '-c' ) )
            // InternalRinform.g:1037:1: ( '-c' )
            {
            // InternalRinform.g:1037:1: ( '-c' )
            // InternalRinform.g:1038:2: '-c'
            {
             before(grammarAccess.getItemInContainerDeclarationAccess().getCKeyword_2()); 
            match(input,20,FOLLOW_2); 
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
    // InternalRinform.g:1047:1: rule__ItemInContainerDeclaration__Group__3 : rule__ItemInContainerDeclaration__Group__3__Impl ;
    public final void rule__ItemInContainerDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1051:1: ( rule__ItemInContainerDeclaration__Group__3__Impl )
            // InternalRinform.g:1052:2: rule__ItemInContainerDeclaration__Group__3__Impl
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
    // InternalRinform.g:1058:1: rule__ItemInContainerDeclaration__Group__3__Impl : ( ( rule__ItemInContainerDeclaration__ContainerAssignment_3 ) ) ;
    public final void rule__ItemInContainerDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1062:1: ( ( ( rule__ItemInContainerDeclaration__ContainerAssignment_3 ) ) )
            // InternalRinform.g:1063:1: ( ( rule__ItemInContainerDeclaration__ContainerAssignment_3 ) )
            {
            // InternalRinform.g:1063:1: ( ( rule__ItemInContainerDeclaration__ContainerAssignment_3 ) )
            // InternalRinform.g:1064:2: ( rule__ItemInContainerDeclaration__ContainerAssignment_3 )
            {
             before(grammarAccess.getItemInContainerDeclarationAccess().getContainerAssignment_3()); 
            // InternalRinform.g:1065:2: ( rule__ItemInContainerDeclaration__ContainerAssignment_3 )
            // InternalRinform.g:1065:3: rule__ItemInContainerDeclaration__ContainerAssignment_3
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
    // InternalRinform.g:1074:1: rule__ItemDescription__Group__0 : rule__ItemDescription__Group__0__Impl rule__ItemDescription__Group__1 ;
    public final void rule__ItemDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1078:1: ( rule__ItemDescription__Group__0__Impl rule__ItemDescription__Group__1 )
            // InternalRinform.g:1079:2: rule__ItemDescription__Group__0__Impl rule__ItemDescription__Group__1
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
    // InternalRinform.g:1086:1: rule__ItemDescription__Group__0__Impl : ( '(' ) ;
    public final void rule__ItemDescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1090:1: ( ( '(' ) )
            // InternalRinform.g:1091:1: ( '(' )
            {
            // InternalRinform.g:1091:1: ( '(' )
            // InternalRinform.g:1092:2: '('
            {
             before(grammarAccess.getItemDescriptionAccess().getLeftParenthesisKeyword_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalRinform.g:1101:1: rule__ItemDescription__Group__1 : rule__ItemDescription__Group__1__Impl rule__ItemDescription__Group__2 ;
    public final void rule__ItemDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1105:1: ( rule__ItemDescription__Group__1__Impl rule__ItemDescription__Group__2 )
            // InternalRinform.g:1106:2: rule__ItemDescription__Group__1__Impl rule__ItemDescription__Group__2
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
    // InternalRinform.g:1113:1: rule__ItemDescription__Group__1__Impl : ( ( ( rule__ItemDescription__ItemDescriptionAssignment_1 ) ) ( ( rule__ItemDescription__ItemDescriptionAssignment_1 )* ) ) ;
    public final void rule__ItemDescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1117:1: ( ( ( ( rule__ItemDescription__ItemDescriptionAssignment_1 ) ) ( ( rule__ItemDescription__ItemDescriptionAssignment_1 )* ) ) )
            // InternalRinform.g:1118:1: ( ( ( rule__ItemDescription__ItemDescriptionAssignment_1 ) ) ( ( rule__ItemDescription__ItemDescriptionAssignment_1 )* ) )
            {
            // InternalRinform.g:1118:1: ( ( ( rule__ItemDescription__ItemDescriptionAssignment_1 ) ) ( ( rule__ItemDescription__ItemDescriptionAssignment_1 )* ) )
            // InternalRinform.g:1119:2: ( ( rule__ItemDescription__ItemDescriptionAssignment_1 ) ) ( ( rule__ItemDescription__ItemDescriptionAssignment_1 )* )
            {
            // InternalRinform.g:1119:2: ( ( rule__ItemDescription__ItemDescriptionAssignment_1 ) )
            // InternalRinform.g:1120:3: ( rule__ItemDescription__ItemDescriptionAssignment_1 )
            {
             before(grammarAccess.getItemDescriptionAccess().getItemDescriptionAssignment_1()); 
            // InternalRinform.g:1121:3: ( rule__ItemDescription__ItemDescriptionAssignment_1 )
            // InternalRinform.g:1121:4: rule__ItemDescription__ItemDescriptionAssignment_1
            {
            pushFollow(FOLLOW_4);
            rule__ItemDescription__ItemDescriptionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getItemDescriptionAccess().getItemDescriptionAssignment_1()); 

            }

            // InternalRinform.g:1124:2: ( ( rule__ItemDescription__ItemDescriptionAssignment_1 )* )
            // InternalRinform.g:1125:3: ( rule__ItemDescription__ItemDescriptionAssignment_1 )*
            {
             before(grammarAccess.getItemDescriptionAccess().getItemDescriptionAssignment_1()); 
            // InternalRinform.g:1126:3: ( rule__ItemDescription__ItemDescriptionAssignment_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalRinform.g:1126:4: rule__ItemDescription__ItemDescriptionAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__ItemDescription__ItemDescriptionAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalRinform.g:1135:1: rule__ItemDescription__Group__2 : rule__ItemDescription__Group__2__Impl rule__ItemDescription__Group__3 ;
    public final void rule__ItemDescription__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1139:1: ( rule__ItemDescription__Group__2__Impl rule__ItemDescription__Group__3 )
            // InternalRinform.g:1140:2: rule__ItemDescription__Group__2__Impl rule__ItemDescription__Group__3
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
    // InternalRinform.g:1147:1: rule__ItemDescription__Group__2__Impl : ( '-i' ) ;
    public final void rule__ItemDescription__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1151:1: ( ( '-i' ) )
            // InternalRinform.g:1152:1: ( '-i' )
            {
            // InternalRinform.g:1152:1: ( '-i' )
            // InternalRinform.g:1153:2: '-i'
            {
             before(grammarAccess.getItemDescriptionAccess().getIKeyword_2()); 
            match(input,21,FOLLOW_2); 
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
    // InternalRinform.g:1162:1: rule__ItemDescription__Group__3 : rule__ItemDescription__Group__3__Impl rule__ItemDescription__Group__4 ;
    public final void rule__ItemDescription__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1166:1: ( rule__ItemDescription__Group__3__Impl rule__ItemDescription__Group__4 )
            // InternalRinform.g:1167:2: rule__ItemDescription__Group__3__Impl rule__ItemDescription__Group__4
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
    // InternalRinform.g:1174:1: rule__ItemDescription__Group__3__Impl : ( ( rule__ItemDescription__ItemAssignment_3 ) ) ;
    public final void rule__ItemDescription__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1178:1: ( ( ( rule__ItemDescription__ItemAssignment_3 ) ) )
            // InternalRinform.g:1179:1: ( ( rule__ItemDescription__ItemAssignment_3 ) )
            {
            // InternalRinform.g:1179:1: ( ( rule__ItemDescription__ItemAssignment_3 ) )
            // InternalRinform.g:1180:2: ( rule__ItemDescription__ItemAssignment_3 )
            {
             before(grammarAccess.getItemDescriptionAccess().getItemAssignment_3()); 
            // InternalRinform.g:1181:2: ( rule__ItemDescription__ItemAssignment_3 )
            // InternalRinform.g:1181:3: rule__ItemDescription__ItemAssignment_3
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
    // InternalRinform.g:1189:1: rule__ItemDescription__Group__4 : rule__ItemDescription__Group__4__Impl ;
    public final void rule__ItemDescription__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1193:1: ( rule__ItemDescription__Group__4__Impl )
            // InternalRinform.g:1194:2: rule__ItemDescription__Group__4__Impl
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
    // InternalRinform.g:1200:1: rule__ItemDescription__Group__4__Impl : ( ')' ) ;
    public final void rule__ItemDescription__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1204:1: ( ( ')' ) )
            // InternalRinform.g:1205:1: ( ')' )
            {
            // InternalRinform.g:1205:1: ( ')' )
            // InternalRinform.g:1206:2: ')'
            {
             before(grammarAccess.getItemDescriptionAccess().getRightParenthesisKeyword_4()); 
            match(input,19,FOLLOW_2); 
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
    // InternalRinform.g:1216:1: rule__PersonDeclaration__Group__0 : rule__PersonDeclaration__Group__0__Impl rule__PersonDeclaration__Group__1 ;
    public final void rule__PersonDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1220:1: ( rule__PersonDeclaration__Group__0__Impl rule__PersonDeclaration__Group__1 )
            // InternalRinform.g:1221:2: rule__PersonDeclaration__Group__0__Impl rule__PersonDeclaration__Group__1
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
    // InternalRinform.g:1228:1: rule__PersonDeclaration__Group__0__Impl : ( '-p' ) ;
    public final void rule__PersonDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1232:1: ( ( '-p' ) )
            // InternalRinform.g:1233:1: ( '-p' )
            {
            // InternalRinform.g:1233:1: ( '-p' )
            // InternalRinform.g:1234:2: '-p'
            {
             before(grammarAccess.getPersonDeclarationAccess().getPKeyword_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalRinform.g:1243:1: rule__PersonDeclaration__Group__1 : rule__PersonDeclaration__Group__1__Impl rule__PersonDeclaration__Group__2 ;
    public final void rule__PersonDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1247:1: ( rule__PersonDeclaration__Group__1__Impl rule__PersonDeclaration__Group__2 )
            // InternalRinform.g:1248:2: rule__PersonDeclaration__Group__1__Impl rule__PersonDeclaration__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalRinform.g:1255:1: rule__PersonDeclaration__Group__1__Impl : ( ( rule__PersonDeclaration__NameAssignment_1 ) ) ;
    public final void rule__PersonDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1259:1: ( ( ( rule__PersonDeclaration__NameAssignment_1 ) ) )
            // InternalRinform.g:1260:1: ( ( rule__PersonDeclaration__NameAssignment_1 ) )
            {
            // InternalRinform.g:1260:1: ( ( rule__PersonDeclaration__NameAssignment_1 ) )
            // InternalRinform.g:1261:2: ( rule__PersonDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getPersonDeclarationAccess().getNameAssignment_1()); 
            // InternalRinform.g:1262:2: ( rule__PersonDeclaration__NameAssignment_1 )
            // InternalRinform.g:1262:3: rule__PersonDeclaration__NameAssignment_1
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
    // InternalRinform.g:1270:1: rule__PersonDeclaration__Group__2 : rule__PersonDeclaration__Group__2__Impl rule__PersonDeclaration__Group__3 ;
    public final void rule__PersonDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1274:1: ( rule__PersonDeclaration__Group__2__Impl rule__PersonDeclaration__Group__3 )
            // InternalRinform.g:1275:2: rule__PersonDeclaration__Group__2__Impl rule__PersonDeclaration__Group__3
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
    // InternalRinform.g:1282:1: rule__PersonDeclaration__Group__2__Impl : ( '-r' ) ;
    public final void rule__PersonDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1286:1: ( ( '-r' ) )
            // InternalRinform.g:1287:1: ( '-r' )
            {
            // InternalRinform.g:1287:1: ( '-r' )
            // InternalRinform.g:1288:2: '-r'
            {
             before(grammarAccess.getPersonDeclarationAccess().getRKeyword_2()); 
            match(input,17,FOLLOW_2); 
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
    // InternalRinform.g:1297:1: rule__PersonDeclaration__Group__3 : rule__PersonDeclaration__Group__3__Impl ;
    public final void rule__PersonDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1301:1: ( rule__PersonDeclaration__Group__3__Impl )
            // InternalRinform.g:1302:2: rule__PersonDeclaration__Group__3__Impl
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
    // InternalRinform.g:1308:1: rule__PersonDeclaration__Group__3__Impl : ( ( rule__PersonDeclaration__RoomAssignment_3 ) ) ;
    public final void rule__PersonDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1312:1: ( ( ( rule__PersonDeclaration__RoomAssignment_3 ) ) )
            // InternalRinform.g:1313:1: ( ( rule__PersonDeclaration__RoomAssignment_3 ) )
            {
            // InternalRinform.g:1313:1: ( ( rule__PersonDeclaration__RoomAssignment_3 ) )
            // InternalRinform.g:1314:2: ( rule__PersonDeclaration__RoomAssignment_3 )
            {
             before(grammarAccess.getPersonDeclarationAccess().getRoomAssignment_3()); 
            // InternalRinform.g:1315:2: ( rule__PersonDeclaration__RoomAssignment_3 )
            // InternalRinform.g:1315:3: rule__PersonDeclaration__RoomAssignment_3
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
    // InternalRinform.g:1324:1: rule__PersonDescription__Group__0 : rule__PersonDescription__Group__0__Impl rule__PersonDescription__Group__1 ;
    public final void rule__PersonDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1328:1: ( rule__PersonDescription__Group__0__Impl rule__PersonDescription__Group__1 )
            // InternalRinform.g:1329:2: rule__PersonDescription__Group__0__Impl rule__PersonDescription__Group__1
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
    // InternalRinform.g:1336:1: rule__PersonDescription__Group__0__Impl : ( '(' ) ;
    public final void rule__PersonDescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1340:1: ( ( '(' ) )
            // InternalRinform.g:1341:1: ( '(' )
            {
            // InternalRinform.g:1341:1: ( '(' )
            // InternalRinform.g:1342:2: '('
            {
             before(grammarAccess.getPersonDescriptionAccess().getLeftParenthesisKeyword_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalRinform.g:1351:1: rule__PersonDescription__Group__1 : rule__PersonDescription__Group__1__Impl rule__PersonDescription__Group__2 ;
    public final void rule__PersonDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1355:1: ( rule__PersonDescription__Group__1__Impl rule__PersonDescription__Group__2 )
            // InternalRinform.g:1356:2: rule__PersonDescription__Group__1__Impl rule__PersonDescription__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalRinform.g:1363:1: rule__PersonDescription__Group__1__Impl : ( ( ( rule__PersonDescription__PersonDescriptionAssignment_1 ) ) ( ( rule__PersonDescription__PersonDescriptionAssignment_1 )* ) ) ;
    public final void rule__PersonDescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1367:1: ( ( ( ( rule__PersonDescription__PersonDescriptionAssignment_1 ) ) ( ( rule__PersonDescription__PersonDescriptionAssignment_1 )* ) ) )
            // InternalRinform.g:1368:1: ( ( ( rule__PersonDescription__PersonDescriptionAssignment_1 ) ) ( ( rule__PersonDescription__PersonDescriptionAssignment_1 )* ) )
            {
            // InternalRinform.g:1368:1: ( ( ( rule__PersonDescription__PersonDescriptionAssignment_1 ) ) ( ( rule__PersonDescription__PersonDescriptionAssignment_1 )* ) )
            // InternalRinform.g:1369:2: ( ( rule__PersonDescription__PersonDescriptionAssignment_1 ) ) ( ( rule__PersonDescription__PersonDescriptionAssignment_1 )* )
            {
            // InternalRinform.g:1369:2: ( ( rule__PersonDescription__PersonDescriptionAssignment_1 ) )
            // InternalRinform.g:1370:3: ( rule__PersonDescription__PersonDescriptionAssignment_1 )
            {
             before(grammarAccess.getPersonDescriptionAccess().getPersonDescriptionAssignment_1()); 
            // InternalRinform.g:1371:3: ( rule__PersonDescription__PersonDescriptionAssignment_1 )
            // InternalRinform.g:1371:4: rule__PersonDescription__PersonDescriptionAssignment_1
            {
            pushFollow(FOLLOW_4);
            rule__PersonDescription__PersonDescriptionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPersonDescriptionAccess().getPersonDescriptionAssignment_1()); 

            }

            // InternalRinform.g:1374:2: ( ( rule__PersonDescription__PersonDescriptionAssignment_1 )* )
            // InternalRinform.g:1375:3: ( rule__PersonDescription__PersonDescriptionAssignment_1 )*
            {
             before(grammarAccess.getPersonDescriptionAccess().getPersonDescriptionAssignment_1()); 
            // InternalRinform.g:1376:3: ( rule__PersonDescription__PersonDescriptionAssignment_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalRinform.g:1376:4: rule__PersonDescription__PersonDescriptionAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__PersonDescription__PersonDescriptionAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalRinform.g:1385:1: rule__PersonDescription__Group__2 : rule__PersonDescription__Group__2__Impl rule__PersonDescription__Group__3 ;
    public final void rule__PersonDescription__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1389:1: ( rule__PersonDescription__Group__2__Impl rule__PersonDescription__Group__3 )
            // InternalRinform.g:1390:2: rule__PersonDescription__Group__2__Impl rule__PersonDescription__Group__3
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
    // InternalRinform.g:1397:1: rule__PersonDescription__Group__2__Impl : ( '-p' ) ;
    public final void rule__PersonDescription__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1401:1: ( ( '-p' ) )
            // InternalRinform.g:1402:1: ( '-p' )
            {
            // InternalRinform.g:1402:1: ( '-p' )
            // InternalRinform.g:1403:2: '-p'
            {
             before(grammarAccess.getPersonDescriptionAccess().getPKeyword_2()); 
            match(input,22,FOLLOW_2); 
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
    // InternalRinform.g:1412:1: rule__PersonDescription__Group__3 : rule__PersonDescription__Group__3__Impl rule__PersonDescription__Group__4 ;
    public final void rule__PersonDescription__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1416:1: ( rule__PersonDescription__Group__3__Impl rule__PersonDescription__Group__4 )
            // InternalRinform.g:1417:2: rule__PersonDescription__Group__3__Impl rule__PersonDescription__Group__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalRinform.g:1424:1: rule__PersonDescription__Group__3__Impl : ( ( rule__PersonDescription__PersonAssignment_3 ) ) ;
    public final void rule__PersonDescription__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1428:1: ( ( ( rule__PersonDescription__PersonAssignment_3 ) ) )
            // InternalRinform.g:1429:1: ( ( rule__PersonDescription__PersonAssignment_3 ) )
            {
            // InternalRinform.g:1429:1: ( ( rule__PersonDescription__PersonAssignment_3 ) )
            // InternalRinform.g:1430:2: ( rule__PersonDescription__PersonAssignment_3 )
            {
             before(grammarAccess.getPersonDescriptionAccess().getPersonAssignment_3()); 
            // InternalRinform.g:1431:2: ( rule__PersonDescription__PersonAssignment_3 )
            // InternalRinform.g:1431:3: rule__PersonDescription__PersonAssignment_3
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
    // InternalRinform.g:1439:1: rule__PersonDescription__Group__4 : rule__PersonDescription__Group__4__Impl ;
    public final void rule__PersonDescription__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1443:1: ( rule__PersonDescription__Group__4__Impl )
            // InternalRinform.g:1444:2: rule__PersonDescription__Group__4__Impl
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
    // InternalRinform.g:1450:1: rule__PersonDescription__Group__4__Impl : ( ')' ) ;
    public final void rule__PersonDescription__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1454:1: ( ( ')' ) )
            // InternalRinform.g:1455:1: ( ')' )
            {
            // InternalRinform.g:1455:1: ( ')' )
            // InternalRinform.g:1456:2: ')'
            {
             before(grammarAccess.getPersonDescriptionAccess().getRightParenthesisKeyword_4()); 
            match(input,19,FOLLOW_2); 
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
    // InternalRinform.g:1466:1: rule__DirectionStatement__Group__0 : rule__DirectionStatement__Group__0__Impl rule__DirectionStatement__Group__1 ;
    public final void rule__DirectionStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1470:1: ( rule__DirectionStatement__Group__0__Impl rule__DirectionStatement__Group__1 )
            // InternalRinform.g:1471:2: rule__DirectionStatement__Group__0__Impl rule__DirectionStatement__Group__1
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
    // InternalRinform.g:1478:1: rule__DirectionStatement__Group__0__Impl : ( '<' ) ;
    public final void rule__DirectionStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1482:1: ( ( '<' ) )
            // InternalRinform.g:1483:1: ( '<' )
            {
            // InternalRinform.g:1483:1: ( '<' )
            // InternalRinform.g:1484:2: '<'
            {
             before(grammarAccess.getDirectionStatementAccess().getLessThanSignKeyword_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalRinform.g:1493:1: rule__DirectionStatement__Group__1 : rule__DirectionStatement__Group__1__Impl rule__DirectionStatement__Group__2 ;
    public final void rule__DirectionStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1497:1: ( rule__DirectionStatement__Group__1__Impl rule__DirectionStatement__Group__2 )
            // InternalRinform.g:1498:2: rule__DirectionStatement__Group__1__Impl rule__DirectionStatement__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalRinform.g:1505:1: rule__DirectionStatement__Group__1__Impl : ( ( rule__DirectionStatement__Room1Assignment_1 ) ) ;
    public final void rule__DirectionStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1509:1: ( ( ( rule__DirectionStatement__Room1Assignment_1 ) ) )
            // InternalRinform.g:1510:1: ( ( rule__DirectionStatement__Room1Assignment_1 ) )
            {
            // InternalRinform.g:1510:1: ( ( rule__DirectionStatement__Room1Assignment_1 ) )
            // InternalRinform.g:1511:2: ( rule__DirectionStatement__Room1Assignment_1 )
            {
             before(grammarAccess.getDirectionStatementAccess().getRoom1Assignment_1()); 
            // InternalRinform.g:1512:2: ( rule__DirectionStatement__Room1Assignment_1 )
            // InternalRinform.g:1512:3: rule__DirectionStatement__Room1Assignment_1
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
    // InternalRinform.g:1520:1: rule__DirectionStatement__Group__2 : rule__DirectionStatement__Group__2__Impl rule__DirectionStatement__Group__3 ;
    public final void rule__DirectionStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1524:1: ( rule__DirectionStatement__Group__2__Impl rule__DirectionStatement__Group__3 )
            // InternalRinform.g:1525:2: rule__DirectionStatement__Group__2__Impl rule__DirectionStatement__Group__3
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
    // InternalRinform.g:1532:1: rule__DirectionStatement__Group__2__Impl : ( ( rule__DirectionStatement__DirectionAssignment_2 ) ) ;
    public final void rule__DirectionStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1536:1: ( ( ( rule__DirectionStatement__DirectionAssignment_2 ) ) )
            // InternalRinform.g:1537:1: ( ( rule__DirectionStatement__DirectionAssignment_2 ) )
            {
            // InternalRinform.g:1537:1: ( ( rule__DirectionStatement__DirectionAssignment_2 ) )
            // InternalRinform.g:1538:2: ( rule__DirectionStatement__DirectionAssignment_2 )
            {
             before(grammarAccess.getDirectionStatementAccess().getDirectionAssignment_2()); 
            // InternalRinform.g:1539:2: ( rule__DirectionStatement__DirectionAssignment_2 )
            // InternalRinform.g:1539:3: rule__DirectionStatement__DirectionAssignment_2
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
    // InternalRinform.g:1547:1: rule__DirectionStatement__Group__3 : rule__DirectionStatement__Group__3__Impl rule__DirectionStatement__Group__4 ;
    public final void rule__DirectionStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1551:1: ( rule__DirectionStatement__Group__3__Impl rule__DirectionStatement__Group__4 )
            // InternalRinform.g:1552:2: rule__DirectionStatement__Group__3__Impl rule__DirectionStatement__Group__4
            {
            pushFollow(FOLLOW_12);
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
    // InternalRinform.g:1559:1: rule__DirectionStatement__Group__3__Impl : ( ( rule__DirectionStatement__Room2Assignment_3 ) ) ;
    public final void rule__DirectionStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1563:1: ( ( ( rule__DirectionStatement__Room2Assignment_3 ) ) )
            // InternalRinform.g:1564:1: ( ( rule__DirectionStatement__Room2Assignment_3 ) )
            {
            // InternalRinform.g:1564:1: ( ( rule__DirectionStatement__Room2Assignment_3 ) )
            // InternalRinform.g:1565:2: ( rule__DirectionStatement__Room2Assignment_3 )
            {
             before(grammarAccess.getDirectionStatementAccess().getRoom2Assignment_3()); 
            // InternalRinform.g:1566:2: ( rule__DirectionStatement__Room2Assignment_3 )
            // InternalRinform.g:1566:3: rule__DirectionStatement__Room2Assignment_3
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
    // InternalRinform.g:1574:1: rule__DirectionStatement__Group__4 : rule__DirectionStatement__Group__4__Impl ;
    public final void rule__DirectionStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1578:1: ( rule__DirectionStatement__Group__4__Impl )
            // InternalRinform.g:1579:2: rule__DirectionStatement__Group__4__Impl
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
    // InternalRinform.g:1585:1: rule__DirectionStatement__Group__4__Impl : ( '>' ) ;
    public final void rule__DirectionStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1589:1: ( ( '>' ) )
            // InternalRinform.g:1590:1: ( '>' )
            {
            // InternalRinform.g:1590:1: ( '>' )
            // InternalRinform.g:1591:2: '>'
            {
             before(grammarAccess.getDirectionStatementAccess().getGreaterThanSignKeyword_4()); 
            match(input,24,FOLLOW_2); 
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
    // InternalRinform.g:1601:1: rule__Text__Group__0 : rule__Text__Group__0__Impl rule__Text__Group__1 ;
    public final void rule__Text__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1605:1: ( rule__Text__Group__0__Impl rule__Text__Group__1 )
            // InternalRinform.g:1606:2: rule__Text__Group__0__Impl rule__Text__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalRinform.g:1613:1: rule__Text__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__Text__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1617:1: ( ( RULE_ID ) )
            // InternalRinform.g:1618:1: ( RULE_ID )
            {
            // InternalRinform.g:1618:1: ( RULE_ID )
            // InternalRinform.g:1619:2: RULE_ID
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
    // InternalRinform.g:1628:1: rule__Text__Group__1 : rule__Text__Group__1__Impl ;
    public final void rule__Text__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1632:1: ( rule__Text__Group__1__Impl )
            // InternalRinform.g:1633:2: rule__Text__Group__1__Impl
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
    // InternalRinform.g:1639:1: rule__Text__Group__1__Impl : ( ( rule__Text__Group_1__0 )* ) ;
    public final void rule__Text__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1643:1: ( ( ( rule__Text__Group_1__0 )* ) )
            // InternalRinform.g:1644:1: ( ( rule__Text__Group_1__0 )* )
            {
            // InternalRinform.g:1644:1: ( ( rule__Text__Group_1__0 )* )
            // InternalRinform.g:1645:2: ( rule__Text__Group_1__0 )*
            {
             before(grammarAccess.getTextAccess().getGroup_1()); 
            // InternalRinform.g:1646:2: ( rule__Text__Group_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_WS) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalRinform.g:1646:3: rule__Text__Group_1__0
            	    {
            	    pushFollow(FOLLOW_14);
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
    // InternalRinform.g:1655:1: rule__Text__Group_1__0 : rule__Text__Group_1__0__Impl rule__Text__Group_1__1 ;
    public final void rule__Text__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1659:1: ( rule__Text__Group_1__0__Impl rule__Text__Group_1__1 )
            // InternalRinform.g:1660:2: rule__Text__Group_1__0__Impl rule__Text__Group_1__1
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
    // InternalRinform.g:1667:1: rule__Text__Group_1__0__Impl : ( RULE_WS ) ;
    public final void rule__Text__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1671:1: ( ( RULE_WS ) )
            // InternalRinform.g:1672:1: ( RULE_WS )
            {
            // InternalRinform.g:1672:1: ( RULE_WS )
            // InternalRinform.g:1673:2: RULE_WS
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
    // InternalRinform.g:1682:1: rule__Text__Group_1__1 : rule__Text__Group_1__1__Impl ;
    public final void rule__Text__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1686:1: ( rule__Text__Group_1__1__Impl )
            // InternalRinform.g:1687:2: rule__Text__Group_1__1__Impl
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
    // InternalRinform.g:1693:1: rule__Text__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__Text__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1697:1: ( ( RULE_ID ) )
            // InternalRinform.g:1698:1: ( RULE_ID )
            {
            // InternalRinform.g:1698:1: ( RULE_ID )
            // InternalRinform.g:1699:2: RULE_ID
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
    // InternalRinform.g:1709:1: rule__ReverseInformProgram__SentencesAssignment : ( ruleSentencePart ) ;
    public final void rule__ReverseInformProgram__SentencesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1713:1: ( ( ruleSentencePart ) )
            // InternalRinform.g:1714:2: ( ruleSentencePart )
            {
            // InternalRinform.g:1714:2: ( ruleSentencePart )
            // InternalRinform.g:1715:3: ruleSentencePart
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
    // InternalRinform.g:1724:1: rule__RoomDeclaration__NameAssignment_1 : ( ruleText ) ;
    public final void rule__RoomDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1728:1: ( ( ruleText ) )
            // InternalRinform.g:1729:2: ( ruleText )
            {
            // InternalRinform.g:1729:2: ( ruleText )
            // InternalRinform.g:1730:3: ruleText
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
    // InternalRinform.g:1739:1: rule__RoomDescription__RoomDescriptionAssignment_1 : ( ruleText ) ;
    public final void rule__RoomDescription__RoomDescriptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1743:1: ( ( ruleText ) )
            // InternalRinform.g:1744:2: ( ruleText )
            {
            // InternalRinform.g:1744:2: ( ruleText )
            // InternalRinform.g:1745:3: ruleText
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
    // InternalRinform.g:1754:1: rule__RoomDescription__RoomAssignment_3 : ( ( ruleText ) ) ;
    public final void rule__RoomDescription__RoomAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1758:1: ( ( ( ruleText ) ) )
            // InternalRinform.g:1759:2: ( ( ruleText ) )
            {
            // InternalRinform.g:1759:2: ( ( ruleText ) )
            // InternalRinform.g:1760:3: ( ruleText )
            {
             before(grammarAccess.getRoomDescriptionAccess().getRoomRoomDeclarationCrossReference_3_0()); 
            // InternalRinform.g:1761:3: ( ruleText )
            // InternalRinform.g:1762:4: ruleText
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
    // InternalRinform.g:1773:1: rule__ContainerDeclaration__NameAssignment_1 : ( ruleText ) ;
    public final void rule__ContainerDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1777:1: ( ( ruleText ) )
            // InternalRinform.g:1778:2: ( ruleText )
            {
            // InternalRinform.g:1778:2: ( ruleText )
            // InternalRinform.g:1779:3: ruleText
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
    // InternalRinform.g:1788:1: rule__ContainerDeclaration__RoomAssignment_3 : ( ( ruleText ) ) ;
    public final void rule__ContainerDeclaration__RoomAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1792:1: ( ( ( ruleText ) ) )
            // InternalRinform.g:1793:2: ( ( ruleText ) )
            {
            // InternalRinform.g:1793:2: ( ( ruleText ) )
            // InternalRinform.g:1794:3: ( ruleText )
            {
             before(grammarAccess.getContainerDeclarationAccess().getRoomRoomDeclarationCrossReference_3_0()); 
            // InternalRinform.g:1795:3: ( ruleText )
            // InternalRinform.g:1796:4: ruleText
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
    // InternalRinform.g:1807:1: rule__ItemInRoomDeclaration__NameAssignment_1 : ( ruleText ) ;
    public final void rule__ItemInRoomDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1811:1: ( ( ruleText ) )
            // InternalRinform.g:1812:2: ( ruleText )
            {
            // InternalRinform.g:1812:2: ( ruleText )
            // InternalRinform.g:1813:3: ruleText
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
    // InternalRinform.g:1822:1: rule__ItemInRoomDeclaration__RoomAssignment_3 : ( ( ruleText ) ) ;
    public final void rule__ItemInRoomDeclaration__RoomAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1826:1: ( ( ( ruleText ) ) )
            // InternalRinform.g:1827:2: ( ( ruleText ) )
            {
            // InternalRinform.g:1827:2: ( ( ruleText ) )
            // InternalRinform.g:1828:3: ( ruleText )
            {
             before(grammarAccess.getItemInRoomDeclarationAccess().getRoomRoomDeclarationCrossReference_3_0()); 
            // InternalRinform.g:1829:3: ( ruleText )
            // InternalRinform.g:1830:4: ruleText
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
    // InternalRinform.g:1841:1: rule__ItemInContainerDeclaration__NameAssignment_1 : ( ruleText ) ;
    public final void rule__ItemInContainerDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1845:1: ( ( ruleText ) )
            // InternalRinform.g:1846:2: ( ruleText )
            {
            // InternalRinform.g:1846:2: ( ruleText )
            // InternalRinform.g:1847:3: ruleText
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
    // InternalRinform.g:1856:1: rule__ItemInContainerDeclaration__ContainerAssignment_3 : ( ( ruleText ) ) ;
    public final void rule__ItemInContainerDeclaration__ContainerAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1860:1: ( ( ( ruleText ) ) )
            // InternalRinform.g:1861:2: ( ( ruleText ) )
            {
            // InternalRinform.g:1861:2: ( ( ruleText ) )
            // InternalRinform.g:1862:3: ( ruleText )
            {
             before(grammarAccess.getItemInContainerDeclarationAccess().getContainerContainerDeclarationCrossReference_3_0()); 
            // InternalRinform.g:1863:3: ( ruleText )
            // InternalRinform.g:1864:4: ruleText
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
    // InternalRinform.g:1875:1: rule__ItemDescription__ItemDescriptionAssignment_1 : ( ruleText ) ;
    public final void rule__ItemDescription__ItemDescriptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1879:1: ( ( ruleText ) )
            // InternalRinform.g:1880:2: ( ruleText )
            {
            // InternalRinform.g:1880:2: ( ruleText )
            // InternalRinform.g:1881:3: ruleText
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
    // InternalRinform.g:1890:1: rule__ItemDescription__ItemAssignment_3 : ( ( ruleText ) ) ;
    public final void rule__ItemDescription__ItemAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1894:1: ( ( ( ruleText ) ) )
            // InternalRinform.g:1895:2: ( ( ruleText ) )
            {
            // InternalRinform.g:1895:2: ( ( ruleText ) )
            // InternalRinform.g:1896:3: ( ruleText )
            {
             before(grammarAccess.getItemDescriptionAccess().getItemItemDeclarationCrossReference_3_0()); 
            // InternalRinform.g:1897:3: ( ruleText )
            // InternalRinform.g:1898:4: ruleText
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
    // InternalRinform.g:1909:1: rule__PersonDeclaration__NameAssignment_1 : ( ruleText ) ;
    public final void rule__PersonDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1913:1: ( ( ruleText ) )
            // InternalRinform.g:1914:2: ( ruleText )
            {
            // InternalRinform.g:1914:2: ( ruleText )
            // InternalRinform.g:1915:3: ruleText
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
    // InternalRinform.g:1924:1: rule__PersonDeclaration__RoomAssignment_3 : ( ( ruleText ) ) ;
    public final void rule__PersonDeclaration__RoomAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1928:1: ( ( ( ruleText ) ) )
            // InternalRinform.g:1929:2: ( ( ruleText ) )
            {
            // InternalRinform.g:1929:2: ( ( ruleText ) )
            // InternalRinform.g:1930:3: ( ruleText )
            {
             before(grammarAccess.getPersonDeclarationAccess().getRoomRoomDeclarationCrossReference_3_0()); 
            // InternalRinform.g:1931:3: ( ruleText )
            // InternalRinform.g:1932:4: ruleText
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
    // InternalRinform.g:1943:1: rule__PersonDescription__PersonDescriptionAssignment_1 : ( ruleText ) ;
    public final void rule__PersonDescription__PersonDescriptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1947:1: ( ( ruleText ) )
            // InternalRinform.g:1948:2: ( ruleText )
            {
            // InternalRinform.g:1948:2: ( ruleText )
            // InternalRinform.g:1949:3: ruleText
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
    // InternalRinform.g:1958:1: rule__PersonDescription__PersonAssignment_3 : ( ( ruleText ) ) ;
    public final void rule__PersonDescription__PersonAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1962:1: ( ( ( ruleText ) ) )
            // InternalRinform.g:1963:2: ( ( ruleText ) )
            {
            // InternalRinform.g:1963:2: ( ( ruleText ) )
            // InternalRinform.g:1964:3: ( ruleText )
            {
             before(grammarAccess.getPersonDescriptionAccess().getPersonPersonDeclarationCrossReference_3_0()); 
            // InternalRinform.g:1965:3: ( ruleText )
            // InternalRinform.g:1966:4: ruleText
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
    // InternalRinform.g:1977:1: rule__DirectionStatement__Room1Assignment_1 : ( ( ruleText ) ) ;
    public final void rule__DirectionStatement__Room1Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:1981:1: ( ( ( ruleText ) ) )
            // InternalRinform.g:1982:2: ( ( ruleText ) )
            {
            // InternalRinform.g:1982:2: ( ( ruleText ) )
            // InternalRinform.g:1983:3: ( ruleText )
            {
             before(grammarAccess.getDirectionStatementAccess().getRoom1RoomDeclarationCrossReference_1_0()); 
            // InternalRinform.g:1984:3: ( ruleText )
            // InternalRinform.g:1985:4: ruleText
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
    // InternalRinform.g:1996:1: rule__DirectionStatement__DirectionAssignment_2 : ( ruleDirection ) ;
    public final void rule__DirectionStatement__DirectionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2000:1: ( ( ruleDirection ) )
            // InternalRinform.g:2001:2: ( ruleDirection )
            {
            // InternalRinform.g:2001:2: ( ruleDirection )
            // InternalRinform.g:2002:3: ruleDirection
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
    // InternalRinform.g:2011:1: rule__DirectionStatement__Room2Assignment_3 : ( ( ruleText ) ) ;
    public final void rule__DirectionStatement__Room2Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2015:1: ( ( ( ruleText ) ) )
            // InternalRinform.g:2016:2: ( ( ruleText ) )
            {
            // InternalRinform.g:2016:2: ( ( ruleText ) )
            // InternalRinform.g:2017:3: ( ruleText )
            {
             before(grammarAccess.getDirectionStatementAccess().getRoom2RoomDeclarationCrossReference_3_0()); 
            // InternalRinform.g:2018:3: ( ruleText )
            // InternalRinform.g:2019:4: ruleText
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
    // InternalRinform.g:2030:1: rule__Words__WordsAssignment : ( ruleText ) ;
    public final void rule__Words__WordsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRinform.g:2034:1: ( ( ruleText ) )
            // InternalRinform.g:2035:2: ( ruleText )
            {
            // InternalRinform.g:2035:2: ( ruleText )
            // InternalRinform.g:2036:3: ruleText
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


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA4 dfa4 = new DFA4(this);
    static final String dfa_1s = "\20\uffff";
    static final String dfa_2s = "\1\4\1\uffff\1\4\4\uffff\3\4\3\uffff\3\4";
    static final String dfa_3s = "\1\27\1\uffff\1\4\4\uffff\1\26\1\4\1\26\3\uffff\1\26\1\4\1\26";
    static final String dfa_4s = "\1\uffff\1\1\1\uffff\1\3\1\5\1\7\1\10\3\uffff\1\6\1\2\1\4\3\uffff";
    static final String dfa_5s = "\20\uffff}>";
    static final String[] dfa_6s = {
            "\1\5\14\uffff\1\1\1\2\1\uffff\2\3\1\4\1\6",
            "",
            "\1\7",
            "",
            "",
            "",
            "",
            "\1\11\1\10\13\uffff\1\13\3\uffff\1\14\1\12",
            "\1\15",
            "\1\11\1\16\13\uffff\1\13\3\uffff\1\14\1\12",
            "",
            "",
            "",
            "\1\11\1\10\13\uffff\1\13\3\uffff\1\14\1\12",
            "\1\17",
            "\1\11\1\16\13\uffff\1\13\3\uffff\1\14\1\12"
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
            return "425:1: rule__SentencePart__Alternatives : ( ( ruleRoomDeclaration ) | ( ruleRoomDescription ) | ( ruleItemDeclaration ) | ( ruleItemDescription ) | ( rulePersonDeclaration ) | ( rulePersonDescription ) | ( ruleWords ) | ( ruleDirectionStatement ) );";
        }
    }
    static final String dfa_7s = "\10\uffff";
    static final String dfa_8s = "\1\24\1\4\1\uffff\1\5\1\4\2\uffff\1\5";
    static final String dfa_9s = "\1\25\1\4\1\uffff\1\24\1\4\2\uffff\1\24";
    static final String dfa_10s = "\2\uffff\1\2\2\uffff\1\1\1\3\1\uffff";
    static final String dfa_11s = "\10\uffff}>";
    static final String[] dfa_12s = {
            "\1\2\1\1",
            "\1\3",
            "",
            "\1\4\13\uffff\1\5\2\uffff\1\6",
            "\1\7",
            "",
            "",
            "\1\4\13\uffff\1\5\2\uffff\1\6"
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
            return "482:1: rule__ItemDeclaration__Alternatives : ( ( ruleItemInRoomDeclaration ) | ( ruleContainerDeclaration ) | ( ruleItemInContainerDeclaration ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000F60012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000000001F800L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000022L});

}