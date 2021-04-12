package uk.ac.kcl.mde.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import uk.ac.kcl.mde.services.RinformGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRinformParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_WS", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'-r'", "'('", "')'", "'-c'", "'-i'", "'-p'", "'<'", "'>'", "'South'", "'North'", "'East'", "'West'", "'Below'", "'Above'"
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

        public InternalRinformParser(TokenStream input, RinformGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ReverseInformProgram";
       	}

       	@Override
       	protected RinformGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleReverseInformProgram"
    // InternalRinform.g:65:1: entryRuleReverseInformProgram returns [EObject current=null] : iv_ruleReverseInformProgram= ruleReverseInformProgram EOF ;
    public final EObject entryRuleReverseInformProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReverseInformProgram = null;


        try {
            // InternalRinform.g:65:61: (iv_ruleReverseInformProgram= ruleReverseInformProgram EOF )
            // InternalRinform.g:66:2: iv_ruleReverseInformProgram= ruleReverseInformProgram EOF
            {
             newCompositeNode(grammarAccess.getReverseInformProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReverseInformProgram=ruleReverseInformProgram();

            state._fsp--;

             current =iv_ruleReverseInformProgram; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReverseInformProgram"


    // $ANTLR start "ruleReverseInformProgram"
    // InternalRinform.g:72:1: ruleReverseInformProgram returns [EObject current=null] : ( (lv_sentences_0_0= ruleSentencePart ) )* ;
    public final EObject ruleReverseInformProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_sentences_0_0 = null;



        	enterRule();

        try {
            // InternalRinform.g:78:2: ( ( (lv_sentences_0_0= ruleSentencePart ) )* )
            // InternalRinform.g:79:2: ( (lv_sentences_0_0= ruleSentencePart ) )*
            {
            // InternalRinform.g:79:2: ( (lv_sentences_0_0= ruleSentencePart ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||(LA1_0>=11 && LA1_0<=12)||(LA1_0>=14 && LA1_0<=17)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRinform.g:80:3: (lv_sentences_0_0= ruleSentencePart )
            	    {
            	    // InternalRinform.g:80:3: (lv_sentences_0_0= ruleSentencePart )
            	    // InternalRinform.g:81:4: lv_sentences_0_0= ruleSentencePart
            	    {

            	    				newCompositeNode(grammarAccess.getReverseInformProgramAccess().getSentencesSentencePartParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_sentences_0_0=ruleSentencePart();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getReverseInformProgramRule());
            	    				}
            	    				add(
            	    					current,
            	    					"sentences",
            	    					lv_sentences_0_0,
            	    					"uk.ac.kcl.mde.Rinform.SentencePart");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReverseInformProgram"


    // $ANTLR start "entryRuleSentencePart"
    // InternalRinform.g:101:1: entryRuleSentencePart returns [EObject current=null] : iv_ruleSentencePart= ruleSentencePart EOF ;
    public final EObject entryRuleSentencePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSentencePart = null;


        try {
            // InternalRinform.g:101:53: (iv_ruleSentencePart= ruleSentencePart EOF )
            // InternalRinform.g:102:2: iv_ruleSentencePart= ruleSentencePart EOF
            {
             newCompositeNode(grammarAccess.getSentencePartRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSentencePart=ruleSentencePart();

            state._fsp--;

             current =iv_ruleSentencePart; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSentencePart"


    // $ANTLR start "ruleSentencePart"
    // InternalRinform.g:108:1: ruleSentencePart returns [EObject current=null] : (this_RoomDeclaration_0= ruleRoomDeclaration | this_RoomDescription_1= ruleRoomDescription | this_ItemDeclaration_2= ruleItemDeclaration | this_ItemDescription_3= ruleItemDescription | this_PersonDeclaration_4= rulePersonDeclaration | this_PersonDescription_5= rulePersonDescription | this_Words_6= ruleWords | this_DirectionStatement_7= ruleDirectionStatement ) ;
    public final EObject ruleSentencePart() throws RecognitionException {
        EObject current = null;

        EObject this_RoomDeclaration_0 = null;

        EObject this_RoomDescription_1 = null;

        EObject this_ItemDeclaration_2 = null;

        EObject this_ItemDescription_3 = null;

        EObject this_PersonDeclaration_4 = null;

        EObject this_PersonDescription_5 = null;

        EObject this_Words_6 = null;

        EObject this_DirectionStatement_7 = null;



        	enterRule();

        try {
            // InternalRinform.g:114:2: ( (this_RoomDeclaration_0= ruleRoomDeclaration | this_RoomDescription_1= ruleRoomDescription | this_ItemDeclaration_2= ruleItemDeclaration | this_ItemDescription_3= ruleItemDescription | this_PersonDeclaration_4= rulePersonDeclaration | this_PersonDescription_5= rulePersonDescription | this_Words_6= ruleWords | this_DirectionStatement_7= ruleDirectionStatement ) )
            // InternalRinform.g:115:2: (this_RoomDeclaration_0= ruleRoomDeclaration | this_RoomDescription_1= ruleRoomDescription | this_ItemDeclaration_2= ruleItemDeclaration | this_ItemDescription_3= ruleItemDescription | this_PersonDeclaration_4= rulePersonDeclaration | this_PersonDescription_5= rulePersonDescription | this_Words_6= ruleWords | this_DirectionStatement_7= ruleDirectionStatement )
            {
            // InternalRinform.g:115:2: (this_RoomDeclaration_0= ruleRoomDeclaration | this_RoomDescription_1= ruleRoomDescription | this_ItemDeclaration_2= ruleItemDeclaration | this_ItemDescription_3= ruleItemDescription | this_PersonDeclaration_4= rulePersonDeclaration | this_PersonDescription_5= rulePersonDescription | this_Words_6= ruleWords | this_DirectionStatement_7= ruleDirectionStatement )
            int alt2=8;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalRinform.g:116:3: this_RoomDeclaration_0= ruleRoomDeclaration
                    {

                    			newCompositeNode(grammarAccess.getSentencePartAccess().getRoomDeclarationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_RoomDeclaration_0=ruleRoomDeclaration();

                    state._fsp--;


                    			current = this_RoomDeclaration_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRinform.g:125:3: this_RoomDescription_1= ruleRoomDescription
                    {

                    			newCompositeNode(grammarAccess.getSentencePartAccess().getRoomDescriptionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RoomDescription_1=ruleRoomDescription();

                    state._fsp--;


                    			current = this_RoomDescription_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRinform.g:134:3: this_ItemDeclaration_2= ruleItemDeclaration
                    {

                    			newCompositeNode(grammarAccess.getSentencePartAccess().getItemDeclarationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ItemDeclaration_2=ruleItemDeclaration();

                    state._fsp--;


                    			current = this_ItemDeclaration_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRinform.g:143:3: this_ItemDescription_3= ruleItemDescription
                    {

                    			newCompositeNode(grammarAccess.getSentencePartAccess().getItemDescriptionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ItemDescription_3=ruleItemDescription();

                    state._fsp--;


                    			current = this_ItemDescription_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalRinform.g:152:3: this_PersonDeclaration_4= rulePersonDeclaration
                    {

                    			newCompositeNode(grammarAccess.getSentencePartAccess().getPersonDeclarationParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_PersonDeclaration_4=rulePersonDeclaration();

                    state._fsp--;


                    			current = this_PersonDeclaration_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalRinform.g:161:3: this_PersonDescription_5= rulePersonDescription
                    {

                    			newCompositeNode(grammarAccess.getSentencePartAccess().getPersonDescriptionParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_PersonDescription_5=rulePersonDescription();

                    state._fsp--;


                    			current = this_PersonDescription_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalRinform.g:170:3: this_Words_6= ruleWords
                    {

                    			newCompositeNode(grammarAccess.getSentencePartAccess().getWordsParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Words_6=ruleWords();

                    state._fsp--;


                    			current = this_Words_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalRinform.g:179:3: this_DirectionStatement_7= ruleDirectionStatement
                    {

                    			newCompositeNode(grammarAccess.getSentencePartAccess().getDirectionStatementParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_DirectionStatement_7=ruleDirectionStatement();

                    state._fsp--;


                    			current = this_DirectionStatement_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSentencePart"


    // $ANTLR start "entryRuleRoomDeclaration"
    // InternalRinform.g:191:1: entryRuleRoomDeclaration returns [EObject current=null] : iv_ruleRoomDeclaration= ruleRoomDeclaration EOF ;
    public final EObject entryRuleRoomDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoomDeclaration = null;


        try {
            // InternalRinform.g:191:56: (iv_ruleRoomDeclaration= ruleRoomDeclaration EOF )
            // InternalRinform.g:192:2: iv_ruleRoomDeclaration= ruleRoomDeclaration EOF
            {
             newCompositeNode(grammarAccess.getRoomDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoomDeclaration=ruleRoomDeclaration();

            state._fsp--;

             current =iv_ruleRoomDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRoomDeclaration"


    // $ANTLR start "ruleRoomDeclaration"
    // InternalRinform.g:198:1: ruleRoomDeclaration returns [EObject current=null] : (otherlv_0= '-r' ( (lv_name_1_0= ruleText ) ) ) ;
    public final EObject ruleRoomDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalRinform.g:204:2: ( (otherlv_0= '-r' ( (lv_name_1_0= ruleText ) ) ) )
            // InternalRinform.g:205:2: (otherlv_0= '-r' ( (lv_name_1_0= ruleText ) ) )
            {
            // InternalRinform.g:205:2: (otherlv_0= '-r' ( (lv_name_1_0= ruleText ) ) )
            // InternalRinform.g:206:3: otherlv_0= '-r' ( (lv_name_1_0= ruleText ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRoomDeclarationAccess().getRKeyword_0());
            		
            // InternalRinform.g:210:3: ( (lv_name_1_0= ruleText ) )
            // InternalRinform.g:211:4: (lv_name_1_0= ruleText )
            {
            // InternalRinform.g:211:4: (lv_name_1_0= ruleText )
            // InternalRinform.g:212:5: lv_name_1_0= ruleText
            {

            					newCompositeNode(grammarAccess.getRoomDeclarationAccess().getNameTextParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleText();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRoomDeclarationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"uk.ac.kcl.mde.Rinform.Text");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRoomDeclaration"


    // $ANTLR start "entryRuleRoomDescription"
    // InternalRinform.g:233:1: entryRuleRoomDescription returns [EObject current=null] : iv_ruleRoomDescription= ruleRoomDescription EOF ;
    public final EObject entryRuleRoomDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoomDescription = null;


        try {
            // InternalRinform.g:233:56: (iv_ruleRoomDescription= ruleRoomDescription EOF )
            // InternalRinform.g:234:2: iv_ruleRoomDescription= ruleRoomDescription EOF
            {
             newCompositeNode(grammarAccess.getRoomDescriptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoomDescription=ruleRoomDescription();

            state._fsp--;

             current =iv_ruleRoomDescription; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRoomDescription"


    // $ANTLR start "ruleRoomDescription"
    // InternalRinform.g:240:1: ruleRoomDescription returns [EObject current=null] : (otherlv_0= '(' ( (lv_roomDescription_1_0= ruleText ) )+ otherlv_2= '-r' ( ( ruleText ) ) otherlv_4= ')' ) ;
    public final EObject ruleRoomDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_roomDescription_1_0 = null;



        	enterRule();

        try {
            // InternalRinform.g:246:2: ( (otherlv_0= '(' ( (lv_roomDescription_1_0= ruleText ) )+ otherlv_2= '-r' ( ( ruleText ) ) otherlv_4= ')' ) )
            // InternalRinform.g:247:2: (otherlv_0= '(' ( (lv_roomDescription_1_0= ruleText ) )+ otherlv_2= '-r' ( ( ruleText ) ) otherlv_4= ')' )
            {
            // InternalRinform.g:247:2: (otherlv_0= '(' ( (lv_roomDescription_1_0= ruleText ) )+ otherlv_2= '-r' ( ( ruleText ) ) otherlv_4= ')' )
            // InternalRinform.g:248:3: otherlv_0= '(' ( (lv_roomDescription_1_0= ruleText ) )+ otherlv_2= '-r' ( ( ruleText ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRoomDescriptionAccess().getLeftParenthesisKeyword_0());
            		
            // InternalRinform.g:252:3: ( (lv_roomDescription_1_0= ruleText ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalRinform.g:253:4: (lv_roomDescription_1_0= ruleText )
            	    {
            	    // InternalRinform.g:253:4: (lv_roomDescription_1_0= ruleText )
            	    // InternalRinform.g:254:5: lv_roomDescription_1_0= ruleText
            	    {

            	    					newCompositeNode(grammarAccess.getRoomDescriptionAccess().getRoomDescriptionTextParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_roomDescription_1_0=ruleText();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRoomDescriptionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"roomDescription",
            	    						lv_roomDescription_1_0,
            	    						"uk.ac.kcl.mde.Rinform.Text");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            otherlv_2=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getRoomDescriptionAccess().getRKeyword_2());
            		
            // InternalRinform.g:275:3: ( ( ruleText ) )
            // InternalRinform.g:276:4: ( ruleText )
            {
            // InternalRinform.g:276:4: ( ruleText )
            // InternalRinform.g:277:5: ruleText
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRoomDescriptionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRoomDescriptionAccess().getRoomRoomDeclarationCrossReference_3_0());
            				
            pushFollow(FOLLOW_6);
            ruleText();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getRoomDescriptionAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRoomDescription"


    // $ANTLR start "entryRuleContainerDeclaration"
    // InternalRinform.g:299:1: entryRuleContainerDeclaration returns [EObject current=null] : iv_ruleContainerDeclaration= ruleContainerDeclaration EOF ;
    public final EObject entryRuleContainerDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainerDeclaration = null;


        try {
            // InternalRinform.g:299:61: (iv_ruleContainerDeclaration= ruleContainerDeclaration EOF )
            // InternalRinform.g:300:2: iv_ruleContainerDeclaration= ruleContainerDeclaration EOF
            {
             newCompositeNode(grammarAccess.getContainerDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContainerDeclaration=ruleContainerDeclaration();

            state._fsp--;

             current =iv_ruleContainerDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContainerDeclaration"


    // $ANTLR start "ruleContainerDeclaration"
    // InternalRinform.g:306:1: ruleContainerDeclaration returns [EObject current=null] : (otherlv_0= '-c' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-r' ( ( ruleText ) ) ) ;
    public final EObject ruleContainerDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalRinform.g:312:2: ( (otherlv_0= '-c' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-r' ( ( ruleText ) ) ) )
            // InternalRinform.g:313:2: (otherlv_0= '-c' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-r' ( ( ruleText ) ) )
            {
            // InternalRinform.g:313:2: (otherlv_0= '-c' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-r' ( ( ruleText ) ) )
            // InternalRinform.g:314:3: otherlv_0= '-c' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-r' ( ( ruleText ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getContainerDeclarationAccess().getCKeyword_0());
            		
            // InternalRinform.g:318:3: ( (lv_name_1_0= ruleText ) )
            // InternalRinform.g:319:4: (lv_name_1_0= ruleText )
            {
            // InternalRinform.g:319:4: (lv_name_1_0= ruleText )
            // InternalRinform.g:320:5: lv_name_1_0= ruleText
            {

            					newCompositeNode(grammarAccess.getContainerDeclarationAccess().getNameTextParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_name_1_0=ruleText();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContainerDeclarationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"uk.ac.kcl.mde.Rinform.Text");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getContainerDeclarationAccess().getRKeyword_2());
            		
            // InternalRinform.g:341:3: ( ( ruleText ) )
            // InternalRinform.g:342:4: ( ruleText )
            {
            // InternalRinform.g:342:4: ( ruleText )
            // InternalRinform.g:343:5: ruleText
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContainerDeclarationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getContainerDeclarationAccess().getRoomRoomDeclarationCrossReference_3_0());
            				
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContainerDeclaration"


    // $ANTLR start "entryRuleItemInRoomDeclaration"
    // InternalRinform.g:361:1: entryRuleItemInRoomDeclaration returns [EObject current=null] : iv_ruleItemInRoomDeclaration= ruleItemInRoomDeclaration EOF ;
    public final EObject entryRuleItemInRoomDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItemInRoomDeclaration = null;


        try {
            // InternalRinform.g:361:62: (iv_ruleItemInRoomDeclaration= ruleItemInRoomDeclaration EOF )
            // InternalRinform.g:362:2: iv_ruleItemInRoomDeclaration= ruleItemInRoomDeclaration EOF
            {
             newCompositeNode(grammarAccess.getItemInRoomDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleItemInRoomDeclaration=ruleItemInRoomDeclaration();

            state._fsp--;

             current =iv_ruleItemInRoomDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleItemInRoomDeclaration"


    // $ANTLR start "ruleItemInRoomDeclaration"
    // InternalRinform.g:368:1: ruleItemInRoomDeclaration returns [EObject current=null] : (otherlv_0= '-i' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-r' ( ( ruleText ) ) ) ;
    public final EObject ruleItemInRoomDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalRinform.g:374:2: ( (otherlv_0= '-i' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-r' ( ( ruleText ) ) ) )
            // InternalRinform.g:375:2: (otherlv_0= '-i' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-r' ( ( ruleText ) ) )
            {
            // InternalRinform.g:375:2: (otherlv_0= '-i' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-r' ( ( ruleText ) ) )
            // InternalRinform.g:376:3: otherlv_0= '-i' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-r' ( ( ruleText ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getItemInRoomDeclarationAccess().getIKeyword_0());
            		
            // InternalRinform.g:380:3: ( (lv_name_1_0= ruleText ) )
            // InternalRinform.g:381:4: (lv_name_1_0= ruleText )
            {
            // InternalRinform.g:381:4: (lv_name_1_0= ruleText )
            // InternalRinform.g:382:5: lv_name_1_0= ruleText
            {

            					newCompositeNode(grammarAccess.getItemInRoomDeclarationAccess().getNameTextParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_name_1_0=ruleText();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getItemInRoomDeclarationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"uk.ac.kcl.mde.Rinform.Text");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getItemInRoomDeclarationAccess().getRKeyword_2());
            		
            // InternalRinform.g:403:3: ( ( ruleText ) )
            // InternalRinform.g:404:4: ( ruleText )
            {
            // InternalRinform.g:404:4: ( ruleText )
            // InternalRinform.g:405:5: ruleText
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getItemInRoomDeclarationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getItemInRoomDeclarationAccess().getRoomRoomDeclarationCrossReference_3_0());
            				
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleItemInRoomDeclaration"


    // $ANTLR start "entryRuleItemInContainerDeclaration"
    // InternalRinform.g:423:1: entryRuleItemInContainerDeclaration returns [EObject current=null] : iv_ruleItemInContainerDeclaration= ruleItemInContainerDeclaration EOF ;
    public final EObject entryRuleItemInContainerDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItemInContainerDeclaration = null;


        try {
            // InternalRinform.g:423:67: (iv_ruleItemInContainerDeclaration= ruleItemInContainerDeclaration EOF )
            // InternalRinform.g:424:2: iv_ruleItemInContainerDeclaration= ruleItemInContainerDeclaration EOF
            {
             newCompositeNode(grammarAccess.getItemInContainerDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleItemInContainerDeclaration=ruleItemInContainerDeclaration();

            state._fsp--;

             current =iv_ruleItemInContainerDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleItemInContainerDeclaration"


    // $ANTLR start "ruleItemInContainerDeclaration"
    // InternalRinform.g:430:1: ruleItemInContainerDeclaration returns [EObject current=null] : (otherlv_0= '-i' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-c' ( ( ruleText ) ) ) ;
    public final EObject ruleItemInContainerDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalRinform.g:436:2: ( (otherlv_0= '-i' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-c' ( ( ruleText ) ) ) )
            // InternalRinform.g:437:2: (otherlv_0= '-i' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-c' ( ( ruleText ) ) )
            {
            // InternalRinform.g:437:2: (otherlv_0= '-i' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-c' ( ( ruleText ) ) )
            // InternalRinform.g:438:3: otherlv_0= '-i' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-c' ( ( ruleText ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getItemInContainerDeclarationAccess().getIKeyword_0());
            		
            // InternalRinform.g:442:3: ( (lv_name_1_0= ruleText ) )
            // InternalRinform.g:443:4: (lv_name_1_0= ruleText )
            {
            // InternalRinform.g:443:4: (lv_name_1_0= ruleText )
            // InternalRinform.g:444:5: lv_name_1_0= ruleText
            {

            					newCompositeNode(grammarAccess.getItemInContainerDeclarationAccess().getNameTextParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_name_1_0=ruleText();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getItemInContainerDeclarationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"uk.ac.kcl.mde.Rinform.Text");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getItemInContainerDeclarationAccess().getCKeyword_2());
            		
            // InternalRinform.g:465:3: ( ( ruleText ) )
            // InternalRinform.g:466:4: ( ruleText )
            {
            // InternalRinform.g:466:4: ( ruleText )
            // InternalRinform.g:467:5: ruleText
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getItemInContainerDeclarationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getItemInContainerDeclarationAccess().getContainerContainerDeclarationCrossReference_3_0());
            				
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleItemInContainerDeclaration"


    // $ANTLR start "entryRuleItemDeclaration"
    // InternalRinform.g:485:1: entryRuleItemDeclaration returns [EObject current=null] : iv_ruleItemDeclaration= ruleItemDeclaration EOF ;
    public final EObject entryRuleItemDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItemDeclaration = null;


        try {
            // InternalRinform.g:485:56: (iv_ruleItemDeclaration= ruleItemDeclaration EOF )
            // InternalRinform.g:486:2: iv_ruleItemDeclaration= ruleItemDeclaration EOF
            {
             newCompositeNode(grammarAccess.getItemDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleItemDeclaration=ruleItemDeclaration();

            state._fsp--;

             current =iv_ruleItemDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleItemDeclaration"


    // $ANTLR start "ruleItemDeclaration"
    // InternalRinform.g:492:1: ruleItemDeclaration returns [EObject current=null] : (this_ItemInRoomDeclaration_0= ruleItemInRoomDeclaration | this_ContainerDeclaration_1= ruleContainerDeclaration | this_ItemInContainerDeclaration_2= ruleItemInContainerDeclaration ) ;
    public final EObject ruleItemDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_ItemInRoomDeclaration_0 = null;

        EObject this_ContainerDeclaration_1 = null;

        EObject this_ItemInContainerDeclaration_2 = null;



        	enterRule();

        try {
            // InternalRinform.g:498:2: ( (this_ItemInRoomDeclaration_0= ruleItemInRoomDeclaration | this_ContainerDeclaration_1= ruleContainerDeclaration | this_ItemInContainerDeclaration_2= ruleItemInContainerDeclaration ) )
            // InternalRinform.g:499:2: (this_ItemInRoomDeclaration_0= ruleItemInRoomDeclaration | this_ContainerDeclaration_1= ruleContainerDeclaration | this_ItemInContainerDeclaration_2= ruleItemInContainerDeclaration )
            {
            // InternalRinform.g:499:2: (this_ItemInRoomDeclaration_0= ruleItemInRoomDeclaration | this_ContainerDeclaration_1= ruleContainerDeclaration | this_ItemInContainerDeclaration_2= ruleItemInContainerDeclaration )
            int alt4=3;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalRinform.g:500:3: this_ItemInRoomDeclaration_0= ruleItemInRoomDeclaration
                    {

                    			newCompositeNode(grammarAccess.getItemDeclarationAccess().getItemInRoomDeclarationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ItemInRoomDeclaration_0=ruleItemInRoomDeclaration();

                    state._fsp--;


                    			current = this_ItemInRoomDeclaration_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRinform.g:509:3: this_ContainerDeclaration_1= ruleContainerDeclaration
                    {

                    			newCompositeNode(grammarAccess.getItemDeclarationAccess().getContainerDeclarationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ContainerDeclaration_1=ruleContainerDeclaration();

                    state._fsp--;


                    			current = this_ContainerDeclaration_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRinform.g:518:3: this_ItemInContainerDeclaration_2= ruleItemInContainerDeclaration
                    {

                    			newCompositeNode(grammarAccess.getItemDeclarationAccess().getItemInContainerDeclarationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ItemInContainerDeclaration_2=ruleItemInContainerDeclaration();

                    state._fsp--;


                    			current = this_ItemInContainerDeclaration_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleItemDeclaration"


    // $ANTLR start "entryRuleItemDescription"
    // InternalRinform.g:530:1: entryRuleItemDescription returns [EObject current=null] : iv_ruleItemDescription= ruleItemDescription EOF ;
    public final EObject entryRuleItemDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItemDescription = null;


        try {
            // InternalRinform.g:530:56: (iv_ruleItemDescription= ruleItemDescription EOF )
            // InternalRinform.g:531:2: iv_ruleItemDescription= ruleItemDescription EOF
            {
             newCompositeNode(grammarAccess.getItemDescriptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleItemDescription=ruleItemDescription();

            state._fsp--;

             current =iv_ruleItemDescription; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleItemDescription"


    // $ANTLR start "ruleItemDescription"
    // InternalRinform.g:537:1: ruleItemDescription returns [EObject current=null] : (otherlv_0= '(' ( (lv_itemDescription_1_0= ruleText ) )+ otherlv_2= '-i' ( ( ruleText ) ) otherlv_4= ')' ) ;
    public final EObject ruleItemDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_itemDescription_1_0 = null;



        	enterRule();

        try {
            // InternalRinform.g:543:2: ( (otherlv_0= '(' ( (lv_itemDescription_1_0= ruleText ) )+ otherlv_2= '-i' ( ( ruleText ) ) otherlv_4= ')' ) )
            // InternalRinform.g:544:2: (otherlv_0= '(' ( (lv_itemDescription_1_0= ruleText ) )+ otherlv_2= '-i' ( ( ruleText ) ) otherlv_4= ')' )
            {
            // InternalRinform.g:544:2: (otherlv_0= '(' ( (lv_itemDescription_1_0= ruleText ) )+ otherlv_2= '-i' ( ( ruleText ) ) otherlv_4= ')' )
            // InternalRinform.g:545:3: otherlv_0= '(' ( (lv_itemDescription_1_0= ruleText ) )+ otherlv_2= '-i' ( ( ruleText ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getItemDescriptionAccess().getLeftParenthesisKeyword_0());
            		
            // InternalRinform.g:549:3: ( (lv_itemDescription_1_0= ruleText ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalRinform.g:550:4: (lv_itemDescription_1_0= ruleText )
            	    {
            	    // InternalRinform.g:550:4: (lv_itemDescription_1_0= ruleText )
            	    // InternalRinform.g:551:5: lv_itemDescription_1_0= ruleText
            	    {

            	    					newCompositeNode(grammarAccess.getItemDescriptionAccess().getItemDescriptionTextParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_itemDescription_1_0=ruleText();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getItemDescriptionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"itemDescription",
            	    						lv_itemDescription_1_0,
            	    						"uk.ac.kcl.mde.Rinform.Text");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            otherlv_2=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getItemDescriptionAccess().getIKeyword_2());
            		
            // InternalRinform.g:572:3: ( ( ruleText ) )
            // InternalRinform.g:573:4: ( ruleText )
            {
            // InternalRinform.g:573:4: ( ruleText )
            // InternalRinform.g:574:5: ruleText
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getItemDescriptionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getItemDescriptionAccess().getItemItemDeclarationCrossReference_3_0());
            				
            pushFollow(FOLLOW_6);
            ruleText();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getItemDescriptionAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleItemDescription"


    // $ANTLR start "entryRulePersonDeclaration"
    // InternalRinform.g:596:1: entryRulePersonDeclaration returns [EObject current=null] : iv_rulePersonDeclaration= rulePersonDeclaration EOF ;
    public final EObject entryRulePersonDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePersonDeclaration = null;


        try {
            // InternalRinform.g:596:58: (iv_rulePersonDeclaration= rulePersonDeclaration EOF )
            // InternalRinform.g:597:2: iv_rulePersonDeclaration= rulePersonDeclaration EOF
            {
             newCompositeNode(grammarAccess.getPersonDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePersonDeclaration=rulePersonDeclaration();

            state._fsp--;

             current =iv_rulePersonDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePersonDeclaration"


    // $ANTLR start "rulePersonDeclaration"
    // InternalRinform.g:603:1: rulePersonDeclaration returns [EObject current=null] : (otherlv_0= '-p' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-r' ( ( ruleText ) ) ) ;
    public final EObject rulePersonDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalRinform.g:609:2: ( (otherlv_0= '-p' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-r' ( ( ruleText ) ) ) )
            // InternalRinform.g:610:2: (otherlv_0= '-p' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-r' ( ( ruleText ) ) )
            {
            // InternalRinform.g:610:2: (otherlv_0= '-p' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-r' ( ( ruleText ) ) )
            // InternalRinform.g:611:3: otherlv_0= '-p' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-r' ( ( ruleText ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPersonDeclarationAccess().getPKeyword_0());
            		
            // InternalRinform.g:615:3: ( (lv_name_1_0= ruleText ) )
            // InternalRinform.g:616:4: (lv_name_1_0= ruleText )
            {
            // InternalRinform.g:616:4: (lv_name_1_0= ruleText )
            // InternalRinform.g:617:5: lv_name_1_0= ruleText
            {

            					newCompositeNode(grammarAccess.getPersonDeclarationAccess().getNameTextParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_name_1_0=ruleText();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPersonDeclarationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"uk.ac.kcl.mde.Rinform.Text");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getPersonDeclarationAccess().getRKeyword_2());
            		
            // InternalRinform.g:638:3: ( ( ruleText ) )
            // InternalRinform.g:639:4: ( ruleText )
            {
            // InternalRinform.g:639:4: ( ruleText )
            // InternalRinform.g:640:5: ruleText
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPersonDeclarationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPersonDeclarationAccess().getRoomRoomDeclarationCrossReference_3_0());
            				
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePersonDeclaration"


    // $ANTLR start "entryRulePersonDescription"
    // InternalRinform.g:658:1: entryRulePersonDescription returns [EObject current=null] : iv_rulePersonDescription= rulePersonDescription EOF ;
    public final EObject entryRulePersonDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePersonDescription = null;


        try {
            // InternalRinform.g:658:58: (iv_rulePersonDescription= rulePersonDescription EOF )
            // InternalRinform.g:659:2: iv_rulePersonDescription= rulePersonDescription EOF
            {
             newCompositeNode(grammarAccess.getPersonDescriptionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePersonDescription=rulePersonDescription();

            state._fsp--;

             current =iv_rulePersonDescription; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePersonDescription"


    // $ANTLR start "rulePersonDescription"
    // InternalRinform.g:665:1: rulePersonDescription returns [EObject current=null] : (otherlv_0= '(' ( (lv_personDescription_1_0= ruleText ) )+ otherlv_2= '-p' ( ( ruleText ) ) otherlv_4= ')' ) ;
    public final EObject rulePersonDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_personDescription_1_0 = null;



        	enterRule();

        try {
            // InternalRinform.g:671:2: ( (otherlv_0= '(' ( (lv_personDescription_1_0= ruleText ) )+ otherlv_2= '-p' ( ( ruleText ) ) otherlv_4= ')' ) )
            // InternalRinform.g:672:2: (otherlv_0= '(' ( (lv_personDescription_1_0= ruleText ) )+ otherlv_2= '-p' ( ( ruleText ) ) otherlv_4= ')' )
            {
            // InternalRinform.g:672:2: (otherlv_0= '(' ( (lv_personDescription_1_0= ruleText ) )+ otherlv_2= '-p' ( ( ruleText ) ) otherlv_4= ')' )
            // InternalRinform.g:673:3: otherlv_0= '(' ( (lv_personDescription_1_0= ruleText ) )+ otherlv_2= '-p' ( ( ruleText ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPersonDescriptionAccess().getLeftParenthesisKeyword_0());
            		
            // InternalRinform.g:677:3: ( (lv_personDescription_1_0= ruleText ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalRinform.g:678:4: (lv_personDescription_1_0= ruleText )
            	    {
            	    // InternalRinform.g:678:4: (lv_personDescription_1_0= ruleText )
            	    // InternalRinform.g:679:5: lv_personDescription_1_0= ruleText
            	    {

            	    					newCompositeNode(grammarAccess.getPersonDescriptionAccess().getPersonDescriptionTextParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_personDescription_1_0=ruleText();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPersonDescriptionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"personDescription",
            	    						lv_personDescription_1_0,
            	    						"uk.ac.kcl.mde.Rinform.Text");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            otherlv_2=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getPersonDescriptionAccess().getPKeyword_2());
            		
            // InternalRinform.g:700:3: ( ( ruleText ) )
            // InternalRinform.g:701:4: ( ruleText )
            {
            // InternalRinform.g:701:4: ( ruleText )
            // InternalRinform.g:702:5: ruleText
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPersonDescriptionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPersonDescriptionAccess().getPersonPersonDeclarationCrossReference_3_0());
            				
            pushFollow(FOLLOW_6);
            ruleText();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getPersonDescriptionAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePersonDescription"


    // $ANTLR start "entryRuleDirectionStatement"
    // InternalRinform.g:724:1: entryRuleDirectionStatement returns [EObject current=null] : iv_ruleDirectionStatement= ruleDirectionStatement EOF ;
    public final EObject entryRuleDirectionStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirectionStatement = null;


        try {
            // InternalRinform.g:724:59: (iv_ruleDirectionStatement= ruleDirectionStatement EOF )
            // InternalRinform.g:725:2: iv_ruleDirectionStatement= ruleDirectionStatement EOF
            {
             newCompositeNode(grammarAccess.getDirectionStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDirectionStatement=ruleDirectionStatement();

            state._fsp--;

             current =iv_ruleDirectionStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDirectionStatement"


    // $ANTLR start "ruleDirectionStatement"
    // InternalRinform.g:731:1: ruleDirectionStatement returns [EObject current=null] : (otherlv_0= '<' ( ( ruleText ) ) ( (lv_direction_2_0= ruleDirection ) ) ( ( ruleText ) ) otherlv_4= '>' ) ;
    public final EObject ruleDirectionStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        Enumerator lv_direction_2_0 = null;



        	enterRule();

        try {
            // InternalRinform.g:737:2: ( (otherlv_0= '<' ( ( ruleText ) ) ( (lv_direction_2_0= ruleDirection ) ) ( ( ruleText ) ) otherlv_4= '>' ) )
            // InternalRinform.g:738:2: (otherlv_0= '<' ( ( ruleText ) ) ( (lv_direction_2_0= ruleDirection ) ) ( ( ruleText ) ) otherlv_4= '>' )
            {
            // InternalRinform.g:738:2: (otherlv_0= '<' ( ( ruleText ) ) ( (lv_direction_2_0= ruleDirection ) ) ( ( ruleText ) ) otherlv_4= '>' )
            // InternalRinform.g:739:3: otherlv_0= '<' ( ( ruleText ) ) ( (lv_direction_2_0= ruleDirection ) ) ( ( ruleText ) ) otherlv_4= '>'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDirectionStatementAccess().getLessThanSignKeyword_0());
            		
            // InternalRinform.g:743:3: ( ( ruleText ) )
            // InternalRinform.g:744:4: ( ruleText )
            {
            // InternalRinform.g:744:4: ( ruleText )
            // InternalRinform.g:745:5: ruleText
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDirectionStatementRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDirectionStatementAccess().getRoom1RoomDeclarationCrossReference_1_0());
            				
            pushFollow(FOLLOW_11);
            ruleText();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRinform.g:759:3: ( (lv_direction_2_0= ruleDirection ) )
            // InternalRinform.g:760:4: (lv_direction_2_0= ruleDirection )
            {
            // InternalRinform.g:760:4: (lv_direction_2_0= ruleDirection )
            // InternalRinform.g:761:5: lv_direction_2_0= ruleDirection
            {

            					newCompositeNode(grammarAccess.getDirectionStatementAccess().getDirectionDirectionEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_direction_2_0=ruleDirection();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDirectionStatementRule());
            					}
            					set(
            						current,
            						"direction",
            						lv_direction_2_0,
            						"uk.ac.kcl.mde.Rinform.Direction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRinform.g:778:3: ( ( ruleText ) )
            // InternalRinform.g:779:4: ( ruleText )
            {
            // InternalRinform.g:779:4: ( ruleText )
            // InternalRinform.g:780:5: ruleText
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDirectionStatementRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDirectionStatementAccess().getRoom2RoomDeclarationCrossReference_3_0());
            				
            pushFollow(FOLLOW_12);
            ruleText();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDirectionStatementAccess().getGreaterThanSignKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDirectionStatement"


    // $ANTLR start "entryRuleText"
    // InternalRinform.g:802:1: entryRuleText returns [String current=null] : iv_ruleText= ruleText EOF ;
    public final String entryRuleText() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleText = null;


        try {
            // InternalRinform.g:802:44: (iv_ruleText= ruleText EOF )
            // InternalRinform.g:803:2: iv_ruleText= ruleText EOF
            {
             newCompositeNode(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleText=ruleText();

            state._fsp--;

             current =iv_ruleText.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleText"


    // $ANTLR start "ruleText"
    // InternalRinform.g:809:1: ruleText returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (this_WS_1= RULE_WS this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleText() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_WS_1=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalRinform.g:815:2: ( (this_ID_0= RULE_ID (this_WS_1= RULE_WS this_ID_2= RULE_ID )* ) )
            // InternalRinform.g:816:2: (this_ID_0= RULE_ID (this_WS_1= RULE_WS this_ID_2= RULE_ID )* )
            {
            // InternalRinform.g:816:2: (this_ID_0= RULE_ID (this_WS_1= RULE_WS this_ID_2= RULE_ID )* )
            // InternalRinform.g:817:3: this_ID_0= RULE_ID (this_WS_1= RULE_WS this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getTextAccess().getIDTerminalRuleCall_0());
            		
            // InternalRinform.g:824:3: (this_WS_1= RULE_WS this_ID_2= RULE_ID )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_WS) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalRinform.g:825:4: this_WS_1= RULE_WS this_ID_2= RULE_ID
            	    {
            	    this_WS_1=(Token)match(input,RULE_WS,FOLLOW_4); 

            	    				current.merge(this_WS_1);
            	    			

            	    				newLeafNode(this_WS_1, grammarAccess.getTextAccess().getWSTerminalRuleCall_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_13); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getTextAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleText"


    // $ANTLR start "entryRuleWords"
    // InternalRinform.g:844:1: entryRuleWords returns [EObject current=null] : iv_ruleWords= ruleWords EOF ;
    public final EObject entryRuleWords() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWords = null;


        try {
            // InternalRinform.g:844:46: (iv_ruleWords= ruleWords EOF )
            // InternalRinform.g:845:2: iv_ruleWords= ruleWords EOF
            {
             newCompositeNode(grammarAccess.getWordsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWords=ruleWords();

            state._fsp--;

             current =iv_ruleWords; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWords"


    // $ANTLR start "ruleWords"
    // InternalRinform.g:851:1: ruleWords returns [EObject current=null] : ( (lv_words_0_0= ruleText ) )+ ;
    public final EObject ruleWords() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_words_0_0 = null;



        	enterRule();

        try {
            // InternalRinform.g:857:2: ( ( (lv_words_0_0= ruleText ) )+ )
            // InternalRinform.g:858:2: ( (lv_words_0_0= ruleText ) )+
            {
            // InternalRinform.g:858:2: ( (lv_words_0_0= ruleText ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalRinform.g:859:3: (lv_words_0_0= ruleText )
            	    {
            	    // InternalRinform.g:859:3: (lv_words_0_0= ruleText )
            	    // InternalRinform.g:860:4: lv_words_0_0= ruleText
            	    {

            	    				newCompositeNode(grammarAccess.getWordsAccess().getWordsTextParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_14);
            	    lv_words_0_0=ruleText();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getWordsRule());
            	    				}
            	    				add(
            	    					current,
            	    					"words",
            	    					lv_words_0_0,
            	    					"uk.ac.kcl.mde.Rinform.Text");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWords"


    // $ANTLR start "ruleDirection"
    // InternalRinform.g:880:1: ruleDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'South' ) | (enumLiteral_1= 'North' ) | (enumLiteral_2= 'East' ) | (enumLiteral_3= 'West' ) | (enumLiteral_4= 'Below' ) | (enumLiteral_5= 'Above' ) ) ;
    public final Enumerator ruleDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalRinform.g:886:2: ( ( (enumLiteral_0= 'South' ) | (enumLiteral_1= 'North' ) | (enumLiteral_2= 'East' ) | (enumLiteral_3= 'West' ) | (enumLiteral_4= 'Below' ) | (enumLiteral_5= 'Above' ) ) )
            // InternalRinform.g:887:2: ( (enumLiteral_0= 'South' ) | (enumLiteral_1= 'North' ) | (enumLiteral_2= 'East' ) | (enumLiteral_3= 'West' ) | (enumLiteral_4= 'Below' ) | (enumLiteral_5= 'Above' ) )
            {
            // InternalRinform.g:887:2: ( (enumLiteral_0= 'South' ) | (enumLiteral_1= 'North' ) | (enumLiteral_2= 'East' ) | (enumLiteral_3= 'West' ) | (enumLiteral_4= 'Below' ) | (enumLiteral_5= 'Above' ) )
            int alt9=6;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt9=1;
                }
                break;
            case 20:
                {
                alt9=2;
                }
                break;
            case 21:
                {
                alt9=3;
                }
                break;
            case 22:
                {
                alt9=4;
                }
                break;
            case 23:
                {
                alt9=5;
                }
                break;
            case 24:
                {
                alt9=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalRinform.g:888:3: (enumLiteral_0= 'South' )
                    {
                    // InternalRinform.g:888:3: (enumLiteral_0= 'South' )
                    // InternalRinform.g:889:4: enumLiteral_0= 'South'
                    {
                    enumLiteral_0=(Token)match(input,19,FOLLOW_2); 

                    				current = grammarAccess.getDirectionAccess().getSouthEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDirectionAccess().getSouthEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRinform.g:896:3: (enumLiteral_1= 'North' )
                    {
                    // InternalRinform.g:896:3: (enumLiteral_1= 'North' )
                    // InternalRinform.g:897:4: enumLiteral_1= 'North'
                    {
                    enumLiteral_1=(Token)match(input,20,FOLLOW_2); 

                    				current = grammarAccess.getDirectionAccess().getNorthEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDirectionAccess().getNorthEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRinform.g:904:3: (enumLiteral_2= 'East' )
                    {
                    // InternalRinform.g:904:3: (enumLiteral_2= 'East' )
                    // InternalRinform.g:905:4: enumLiteral_2= 'East'
                    {
                    enumLiteral_2=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getDirectionAccess().getEastEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDirectionAccess().getEastEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRinform.g:912:3: (enumLiteral_3= 'West' )
                    {
                    // InternalRinform.g:912:3: (enumLiteral_3= 'West' )
                    // InternalRinform.g:913:4: enumLiteral_3= 'West'
                    {
                    enumLiteral_3=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getDirectionAccess().getWestEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDirectionAccess().getWestEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRinform.g:920:3: (enumLiteral_4= 'Below' )
                    {
                    // InternalRinform.g:920:3: (enumLiteral_4= 'Below' )
                    // InternalRinform.g:921:4: enumLiteral_4= 'Below'
                    {
                    enumLiteral_4=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getDirectionAccess().getBelowEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getDirectionAccess().getBelowEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalRinform.g:928:3: (enumLiteral_5= 'Above' )
                    {
                    // InternalRinform.g:928:3: (enumLiteral_5= 'Above' )
                    // InternalRinform.g:929:4: enumLiteral_5= 'Above'
                    {
                    enumLiteral_5=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getDirectionAccess().getAboveEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getDirectionAccess().getAboveEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDirection"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA4 dfa4 = new DFA4(this);
    static final String dfa_1s = "\15\uffff";
    static final String dfa_2s = "\1\4\1\uffff\1\4\4\uffff\2\4\3\uffff\1\4";
    static final String dfa_3s = "\1\21\1\uffff\1\4\4\uffff\1\20\1\4\3\uffff\1\20";
    static final String dfa_4s = "\1\uffff\1\1\1\uffff\1\3\1\5\1\7\1\10\2\uffff\1\4\1\6\1\2\1\uffff";
    static final String dfa_5s = "\15\uffff}>";
    static final String[] dfa_6s = {
            "\1\5\6\uffff\1\1\1\2\1\uffff\2\3\1\4\1\6",
            "",
            "\1\7",
            "",
            "",
            "",
            "",
            "\1\7\1\10\5\uffff\1\13\3\uffff\1\11\1\12",
            "\1\14",
            "",
            "",
            "",
            "\1\7\1\10\5\uffff\1\13\3\uffff\1\11\1\12"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "115:2: (this_RoomDeclaration_0= ruleRoomDeclaration | this_RoomDescription_1= ruleRoomDescription | this_ItemDeclaration_2= ruleItemDeclaration | this_ItemDescription_3= ruleItemDescription | this_PersonDeclaration_4= rulePersonDeclaration | this_PersonDescription_5= rulePersonDescription | this_Words_6= ruleWords | this_DirectionStatement_7= ruleDirectionStatement )";
        }
    }
    static final String dfa_7s = "\10\uffff";
    static final String dfa_8s = "\1\16\1\4\1\uffff\1\5\1\4\2\uffff\1\5";
    static final String dfa_9s = "\1\17\1\4\1\uffff\1\16\1\4\2\uffff\1\16";
    static final String dfa_10s = "\2\uffff\1\2\2\uffff\1\3\1\1\1\uffff";
    static final String dfa_11s = "\10\uffff}>";
    static final String[] dfa_12s = {
            "\1\2\1\1",
            "\1\3",
            "",
            "\1\4\5\uffff\1\6\2\uffff\1\5",
            "\1\7",
            "",
            "",
            "\1\4\5\uffff\1\6\2\uffff\1\5"
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
            return "499:2: (this_ItemInRoomDeclaration_0= ruleItemInRoomDeclaration | this_ContainerDeclaration_1= ruleContainerDeclaration | this_ItemInContainerDeclaration_2= ruleItemInContainerDeclaration )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000003D812L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001F80000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000012L});

}