package uk.ac.kcl.mde.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'['", "']'", "'(['", "')'", "'{'", "'}'", "'({'", "'.'", "','", "';'", "':'", "'-'", "'!'", "'?'"
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
    // InternalRinform.g:64:1: entryRuleReverseInformProgram returns [EObject current=null] : iv_ruleReverseInformProgram= ruleReverseInformProgram EOF ;
    public final EObject entryRuleReverseInformProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReverseInformProgram = null;


        try {
            // InternalRinform.g:64:61: (iv_ruleReverseInformProgram= ruleReverseInformProgram EOF )
            // InternalRinform.g:65:2: iv_ruleReverseInformProgram= ruleReverseInformProgram EOF
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
    // InternalRinform.g:71:1: ruleReverseInformProgram returns [EObject current=null] : ( (lv_sentences_0_0= ruleSentenceParts ) )* ;
    public final EObject ruleReverseInformProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_sentences_0_0 = null;



        	enterRule();

        try {
            // InternalRinform.g:77:2: ( ( (lv_sentences_0_0= ruleSentenceParts ) )* )
            // InternalRinform.g:78:2: ( (lv_sentences_0_0= ruleSentenceParts ) )*
            {
            // InternalRinform.g:78:2: ( (lv_sentences_0_0= ruleSentenceParts ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==11||LA1_0==13||LA1_0==15||(LA1_0>=17 && LA1_0<=24)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRinform.g:79:3: (lv_sentences_0_0= ruleSentenceParts )
            	    {
            	    // InternalRinform.g:79:3: (lv_sentences_0_0= ruleSentenceParts )
            	    // InternalRinform.g:80:4: lv_sentences_0_0= ruleSentenceParts
            	    {

            	    				newCompositeNode(grammarAccess.getReverseInformProgramAccess().getSentencesSentencePartsParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_sentences_0_0=ruleSentenceParts();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getReverseInformProgramRule());
            	    				}
            	    				add(
            	    					current,
            	    					"sentences",
            	    					lv_sentences_0_0,
            	    					"uk.ac.kcl.mde.Rinform.SentenceParts");
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


    // $ANTLR start "entryRuleSentenceParts"
    // InternalRinform.g:100:1: entryRuleSentenceParts returns [EObject current=null] : iv_ruleSentenceParts= ruleSentenceParts EOF ;
    public final EObject entryRuleSentenceParts() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSentenceParts = null;


        try {
            // InternalRinform.g:100:54: (iv_ruleSentenceParts= ruleSentenceParts EOF )
            // InternalRinform.g:101:2: iv_ruleSentenceParts= ruleSentenceParts EOF
            {
             newCompositeNode(grammarAccess.getSentencePartsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSentenceParts=ruleSentenceParts();

            state._fsp--;

             current =iv_ruleSentenceParts; 
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
    // $ANTLR end "entryRuleSentenceParts"


    // $ANTLR start "ruleSentenceParts"
    // InternalRinform.g:107:1: ruleSentenceParts returns [EObject current=null] : (this_RoomDeclaration_0= ruleRoomDeclaration | this_RoomDescription_1= ruleRoomDescription | this_ItemDeclaration_2= ruleItemDeclaration | this_ItemDescription_3= ruleItemDescription | this_Text_4= ruleText ) ;
    public final EObject ruleSentenceParts() throws RecognitionException {
        EObject current = null;

        EObject this_RoomDeclaration_0 = null;

        EObject this_RoomDescription_1 = null;

        EObject this_ItemDeclaration_2 = null;

        EObject this_ItemDescription_3 = null;

        EObject this_Text_4 = null;



        	enterRule();

        try {
            // InternalRinform.g:113:2: ( (this_RoomDeclaration_0= ruleRoomDeclaration | this_RoomDescription_1= ruleRoomDescription | this_ItemDeclaration_2= ruleItemDeclaration | this_ItemDescription_3= ruleItemDescription | this_Text_4= ruleText ) )
            // InternalRinform.g:114:2: (this_RoomDeclaration_0= ruleRoomDeclaration | this_RoomDescription_1= ruleRoomDescription | this_ItemDeclaration_2= ruleItemDeclaration | this_ItemDescription_3= ruleItemDescription | this_Text_4= ruleText )
            {
            // InternalRinform.g:114:2: (this_RoomDeclaration_0= ruleRoomDeclaration | this_RoomDescription_1= ruleRoomDescription | this_ItemDeclaration_2= ruleItemDeclaration | this_ItemDescription_3= ruleItemDescription | this_Text_4= ruleText )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 13:
                {
                alt2=2;
                }
                break;
            case 15:
                {
                alt2=3;
                }
                break;
            case 17:
                {
                alt2=4;
                }
                break;
            case RULE_ID:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalRinform.g:115:3: this_RoomDeclaration_0= ruleRoomDeclaration
                    {

                    			newCompositeNode(grammarAccess.getSentencePartsAccess().getRoomDeclarationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_RoomDeclaration_0=ruleRoomDeclaration();

                    state._fsp--;


                    			current = this_RoomDeclaration_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRinform.g:124:3: this_RoomDescription_1= ruleRoomDescription
                    {

                    			newCompositeNode(grammarAccess.getSentencePartsAccess().getRoomDescriptionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RoomDescription_1=ruleRoomDescription();

                    state._fsp--;


                    			current = this_RoomDescription_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRinform.g:133:3: this_ItemDeclaration_2= ruleItemDeclaration
                    {

                    			newCompositeNode(grammarAccess.getSentencePartsAccess().getItemDeclarationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ItemDeclaration_2=ruleItemDeclaration();

                    state._fsp--;


                    			current = this_ItemDeclaration_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRinform.g:142:3: this_ItemDescription_3= ruleItemDescription
                    {

                    			newCompositeNode(grammarAccess.getSentencePartsAccess().getItemDescriptionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ItemDescription_3=ruleItemDescription();

                    state._fsp--;


                    			current = this_ItemDescription_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalRinform.g:151:3: this_Text_4= ruleText
                    {

                    			newCompositeNode(grammarAccess.getSentencePartsAccess().getTextParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Text_4=ruleText();

                    state._fsp--;


                    			current = this_Text_4;
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
    // $ANTLR end "ruleSentenceParts"


    // $ANTLR start "entryRuleRoomDeclaration"
    // InternalRinform.g:163:1: entryRuleRoomDeclaration returns [EObject current=null] : iv_ruleRoomDeclaration= ruleRoomDeclaration EOF ;
    public final EObject entryRuleRoomDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoomDeclaration = null;


        try {
            // InternalRinform.g:163:56: (iv_ruleRoomDeclaration= ruleRoomDeclaration EOF )
            // InternalRinform.g:164:2: iv_ruleRoomDeclaration= ruleRoomDeclaration EOF
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
    // InternalRinform.g:170:1: ruleRoomDeclaration returns [EObject current=null] : (otherlv_0= '[' ( (lv_name_1_0= ruleText ) ) otherlv_2= ']' ) ;
    public final EObject ruleRoomDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalRinform.g:176:2: ( (otherlv_0= '[' ( (lv_name_1_0= ruleText ) ) otherlv_2= ']' ) )
            // InternalRinform.g:177:2: (otherlv_0= '[' ( (lv_name_1_0= ruleText ) ) otherlv_2= ']' )
            {
            // InternalRinform.g:177:2: (otherlv_0= '[' ( (lv_name_1_0= ruleText ) ) otherlv_2= ']' )
            // InternalRinform.g:178:3: otherlv_0= '[' ( (lv_name_1_0= ruleText ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRoomDeclarationAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalRinform.g:182:3: ( (lv_name_1_0= ruleText ) )
            // InternalRinform.g:183:4: (lv_name_1_0= ruleText )
            {
            // InternalRinform.g:183:4: (lv_name_1_0= ruleText )
            // InternalRinform.g:184:5: lv_name_1_0= ruleText
            {

            					newCompositeNode(grammarAccess.getRoomDeclarationAccess().getNameTextParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
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

            otherlv_2=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getRoomDeclarationAccess().getRightSquareBracketKeyword_2());
            		

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
    // InternalRinform.g:209:1: entryRuleRoomDescription returns [EObject current=null] : iv_ruleRoomDescription= ruleRoomDescription EOF ;
    public final EObject entryRuleRoomDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoomDescription = null;


        try {
            // InternalRinform.g:209:56: (iv_ruleRoomDescription= ruleRoomDescription EOF )
            // InternalRinform.g:210:2: iv_ruleRoomDescription= ruleRoomDescription EOF
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
    // InternalRinform.g:216:1: ruleRoomDescription returns [EObject current=null] : (otherlv_0= '([' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']' ( (lv_text_3_0= ruleText ) ) otherlv_4= ')' ) ;
    public final EObject ruleRoomDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_text_3_0 = null;



        	enterRule();

        try {
            // InternalRinform.g:222:2: ( (otherlv_0= '([' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']' ( (lv_text_3_0= ruleText ) ) otherlv_4= ')' ) )
            // InternalRinform.g:223:2: (otherlv_0= '([' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']' ( (lv_text_3_0= ruleText ) ) otherlv_4= ')' )
            {
            // InternalRinform.g:223:2: (otherlv_0= '([' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']' ( (lv_text_3_0= ruleText ) ) otherlv_4= ')' )
            // InternalRinform.g:224:3: otherlv_0= '([' ( (otherlv_1= RULE_ID ) ) otherlv_2= ']' ( (lv_text_3_0= ruleText ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getRoomDescriptionAccess().getLeftParenthesisLeftSquareBracketKeyword_0());
            		
            // InternalRinform.g:228:3: ( (otherlv_1= RULE_ID ) )
            // InternalRinform.g:229:4: (otherlv_1= RULE_ID )
            {
            // InternalRinform.g:229:4: (otherlv_1= RULE_ID )
            // InternalRinform.g:230:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRoomDescriptionRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(otherlv_1, grammarAccess.getRoomDescriptionAccess().getRoomRoomDeclarationCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getRoomDescriptionAccess().getRightSquareBracketKeyword_2());
            		
            // InternalRinform.g:245:3: ( (lv_text_3_0= ruleText ) )
            // InternalRinform.g:246:4: (lv_text_3_0= ruleText )
            {
            // InternalRinform.g:246:4: (lv_text_3_0= ruleText )
            // InternalRinform.g:247:5: lv_text_3_0= ruleText
            {

            					newCompositeNode(grammarAccess.getRoomDescriptionAccess().getTextTextParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_text_3_0=ruleText();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRoomDescriptionRule());
            					}
            					set(
            						current,
            						"text",
            						lv_text_3_0,
            						"uk.ac.kcl.mde.Rinform.Text");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

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


    // $ANTLR start "entryRuleItemDeclaration"
    // InternalRinform.g:272:1: entryRuleItemDeclaration returns [EObject current=null] : iv_ruleItemDeclaration= ruleItemDeclaration EOF ;
    public final EObject entryRuleItemDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItemDeclaration = null;


        try {
            // InternalRinform.g:272:56: (iv_ruleItemDeclaration= ruleItemDeclaration EOF )
            // InternalRinform.g:273:2: iv_ruleItemDeclaration= ruleItemDeclaration EOF
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
    // InternalRinform.g:279:1: ruleItemDeclaration returns [EObject current=null] : (otherlv_0= '{' ( (lv_name_1_0= ruleText ) ) otherlv_2= '}' ) ;
    public final EObject ruleItemDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalRinform.g:285:2: ( (otherlv_0= '{' ( (lv_name_1_0= ruleText ) ) otherlv_2= '}' ) )
            // InternalRinform.g:286:2: (otherlv_0= '{' ( (lv_name_1_0= ruleText ) ) otherlv_2= '}' )
            {
            // InternalRinform.g:286:2: (otherlv_0= '{' ( (lv_name_1_0= ruleText ) ) otherlv_2= '}' )
            // InternalRinform.g:287:3: otherlv_0= '{' ( (lv_name_1_0= ruleText ) ) otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getItemDeclarationAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalRinform.g:291:3: ( (lv_name_1_0= ruleText ) )
            // InternalRinform.g:292:4: (lv_name_1_0= ruleText )
            {
            // InternalRinform.g:292:4: (lv_name_1_0= ruleText )
            // InternalRinform.g:293:5: lv_name_1_0= ruleText
            {

            					newCompositeNode(grammarAccess.getItemDeclarationAccess().getNameTextParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
            lv_name_1_0=ruleText();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getItemDeclarationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"uk.ac.kcl.mde.Rinform.Text");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getItemDeclarationAccess().getRightCurlyBracketKeyword_2());
            		

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
    // InternalRinform.g:318:1: entryRuleItemDescription returns [EObject current=null] : iv_ruleItemDescription= ruleItemDescription EOF ;
    public final EObject entryRuleItemDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItemDescription = null;


        try {
            // InternalRinform.g:318:56: (iv_ruleItemDescription= ruleItemDescription EOF )
            // InternalRinform.g:319:2: iv_ruleItemDescription= ruleItemDescription EOF
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
    // InternalRinform.g:325:1: ruleItemDescription returns [EObject current=null] : (otherlv_0= '({' ( (otherlv_1= RULE_ID ) ) otherlv_2= '}' ( (lv_text_3_0= ruleText ) ) otherlv_4= ')' ) ;
    public final EObject ruleItemDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_text_3_0 = null;



        	enterRule();

        try {
            // InternalRinform.g:331:2: ( (otherlv_0= '({' ( (otherlv_1= RULE_ID ) ) otherlv_2= '}' ( (lv_text_3_0= ruleText ) ) otherlv_4= ')' ) )
            // InternalRinform.g:332:2: (otherlv_0= '({' ( (otherlv_1= RULE_ID ) ) otherlv_2= '}' ( (lv_text_3_0= ruleText ) ) otherlv_4= ')' )
            {
            // InternalRinform.g:332:2: (otherlv_0= '({' ( (otherlv_1= RULE_ID ) ) otherlv_2= '}' ( (lv_text_3_0= ruleText ) ) otherlv_4= ')' )
            // InternalRinform.g:333:3: otherlv_0= '({' ( (otherlv_1= RULE_ID ) ) otherlv_2= '}' ( (lv_text_3_0= ruleText ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getItemDescriptionAccess().getLeftParenthesisLeftCurlyBracketKeyword_0());
            		
            // InternalRinform.g:337:3: ( (otherlv_1= RULE_ID ) )
            // InternalRinform.g:338:4: (otherlv_1= RULE_ID )
            {
            // InternalRinform.g:338:4: (otherlv_1= RULE_ID )
            // InternalRinform.g:339:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getItemDescriptionRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_1, grammarAccess.getItemDescriptionAccess().getItemItemDeclarationCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getItemDescriptionAccess().getRightCurlyBracketKeyword_2());
            		
            // InternalRinform.g:354:3: ( (lv_text_3_0= ruleText ) )
            // InternalRinform.g:355:4: (lv_text_3_0= ruleText )
            {
            // InternalRinform.g:355:4: (lv_text_3_0= ruleText )
            // InternalRinform.g:356:5: lv_text_3_0= ruleText
            {

            					newCompositeNode(grammarAccess.getItemDescriptionAccess().getTextTextParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_text_3_0=ruleText();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getItemDescriptionRule());
            					}
            					set(
            						current,
            						"text",
            						lv_text_3_0,
            						"uk.ac.kcl.mde.Rinform.Text");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

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


    // $ANTLR start "entryRuleText"
    // InternalRinform.g:381:1: entryRuleText returns [EObject current=null] : iv_ruleText= ruleText EOF ;
    public final EObject entryRuleText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleText = null;


        try {
            // InternalRinform.g:381:45: (iv_ruleText= ruleText EOF )
            // InternalRinform.g:382:2: iv_ruleText= ruleText EOF
            {
             newCompositeNode(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleText=ruleText();

            state._fsp--;

             current =iv_ruleText; 
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
    // InternalRinform.g:388:1: ruleText returns [EObject current=null] : ( ( (lv_text_0_1= ruleSymbol | lv_text_0_2= ruleWord ) ) )+ ;
    public final EObject ruleText() throws RecognitionException {
        EObject current = null;

        EObject lv_text_0_1 = null;

        EObject lv_text_0_2 = null;



        	enterRule();

        try {
            // InternalRinform.g:394:2: ( ( ( (lv_text_0_1= ruleSymbol | lv_text_0_2= ruleWord ) ) )+ )
            // InternalRinform.g:395:2: ( ( (lv_text_0_1= ruleSymbol | lv_text_0_2= ruleWord ) ) )+
            {
            // InternalRinform.g:395:2: ( ( (lv_text_0_1= ruleSymbol | lv_text_0_2= ruleWord ) ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                alt4 = dfa4.predict(input);
                switch (alt4) {
            	case 1 :
            	    // InternalRinform.g:396:3: ( (lv_text_0_1= ruleSymbol | lv_text_0_2= ruleWord ) )
            	    {
            	    // InternalRinform.g:396:3: ( (lv_text_0_1= ruleSymbol | lv_text_0_2= ruleWord ) )
            	    // InternalRinform.g:397:4: (lv_text_0_1= ruleSymbol | lv_text_0_2= ruleWord )
            	    {
            	    // InternalRinform.g:397:4: (lv_text_0_1= ruleSymbol | lv_text_0_2= ruleWord )
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( ((LA3_0>=18 && LA3_0<=24)) ) {
            	        alt3=1;
            	    }
            	    else if ( (LA3_0==RULE_ID) ) {
            	        alt3=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 3, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // InternalRinform.g:398:5: lv_text_0_1= ruleSymbol
            	            {

            	            					newCompositeNode(grammarAccess.getTextAccess().getTextSymbolParserRuleCall_0_0());
            	            				
            	            pushFollow(FOLLOW_3);
            	            lv_text_0_1=ruleSymbol();

            	            state._fsp--;


            	            					if (current==null) {
            	            						current = createModelElementForParent(grammarAccess.getTextRule());
            	            					}
            	            					add(
            	            						current,
            	            						"text",
            	            						lv_text_0_1,
            	            						"uk.ac.kcl.mde.Rinform.Symbol");
            	            					afterParserOrEnumRuleCall();
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalRinform.g:414:5: lv_text_0_2= ruleWord
            	            {

            	            					newCompositeNode(grammarAccess.getTextAccess().getTextWordParserRuleCall_0_1());
            	            				
            	            pushFollow(FOLLOW_3);
            	            lv_text_0_2=ruleWord();

            	            state._fsp--;


            	            					if (current==null) {
            	            						current = createModelElementForParent(grammarAccess.getTextRule());
            	            					}
            	            					add(
            	            						current,
            	            						"text",
            	            						lv_text_0_2,
            	            						"uk.ac.kcl.mde.Rinform.Word");
            	            					afterParserOrEnumRuleCall();
            	            				

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
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
    // $ANTLR end "ruleText"


    // $ANTLR start "entryRuleWord"
    // InternalRinform.g:435:1: entryRuleWord returns [EObject current=null] : iv_ruleWord= ruleWord EOF ;
    public final EObject entryRuleWord() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWord = null;


        try {
            // InternalRinform.g:435:45: (iv_ruleWord= ruleWord EOF )
            // InternalRinform.g:436:2: iv_ruleWord= ruleWord EOF
            {
             newCompositeNode(grammarAccess.getWordRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWord=ruleWord();

            state._fsp--;

             current =iv_ruleWord; 
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
    // $ANTLR end "entryRuleWord"


    // $ANTLR start "ruleWord"
    // InternalRinform.g:442:1: ruleWord returns [EObject current=null] : ( (lv_word_0_0= RULE_ID ) ) ;
    public final EObject ruleWord() throws RecognitionException {
        EObject current = null;

        Token lv_word_0_0=null;


        	enterRule();

        try {
            // InternalRinform.g:448:2: ( ( (lv_word_0_0= RULE_ID ) ) )
            // InternalRinform.g:449:2: ( (lv_word_0_0= RULE_ID ) )
            {
            // InternalRinform.g:449:2: ( (lv_word_0_0= RULE_ID ) )
            // InternalRinform.g:450:3: (lv_word_0_0= RULE_ID )
            {
            // InternalRinform.g:450:3: (lv_word_0_0= RULE_ID )
            // InternalRinform.g:451:4: lv_word_0_0= RULE_ID
            {
            lv_word_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_word_0_0, grammarAccess.getWordAccess().getWordIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getWordRule());
            				}
            				setWithLastConsumed(
            					current,
            					"word",
            					lv_word_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleWord"


    // $ANTLR start "entryRuleSymbol"
    // InternalRinform.g:470:1: entryRuleSymbol returns [EObject current=null] : iv_ruleSymbol= ruleSymbol EOF ;
    public final EObject entryRuleSymbol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSymbol = null;


        try {
            // InternalRinform.g:470:47: (iv_ruleSymbol= ruleSymbol EOF )
            // InternalRinform.g:471:2: iv_ruleSymbol= ruleSymbol EOF
            {
             newCompositeNode(grammarAccess.getSymbolRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSymbol=ruleSymbol();

            state._fsp--;

             current =iv_ruleSymbol; 
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
    // $ANTLR end "entryRuleSymbol"


    // $ANTLR start "ruleSymbol"
    // InternalRinform.g:477:1: ruleSymbol returns [EObject current=null] : ( ( (lv_symbol_0_1= '.' | lv_symbol_0_2= ',' | lv_symbol_0_3= ';' | lv_symbol_0_4= ':' | lv_symbol_0_5= '-' | lv_symbol_0_6= '!' | lv_symbol_0_7= '?' ) ) ) ;
    public final EObject ruleSymbol() throws RecognitionException {
        EObject current = null;

        Token lv_symbol_0_1=null;
        Token lv_symbol_0_2=null;
        Token lv_symbol_0_3=null;
        Token lv_symbol_0_4=null;
        Token lv_symbol_0_5=null;
        Token lv_symbol_0_6=null;
        Token lv_symbol_0_7=null;


        	enterRule();

        try {
            // InternalRinform.g:483:2: ( ( ( (lv_symbol_0_1= '.' | lv_symbol_0_2= ',' | lv_symbol_0_3= ';' | lv_symbol_0_4= ':' | lv_symbol_0_5= '-' | lv_symbol_0_6= '!' | lv_symbol_0_7= '?' ) ) ) )
            // InternalRinform.g:484:2: ( ( (lv_symbol_0_1= '.' | lv_symbol_0_2= ',' | lv_symbol_0_3= ';' | lv_symbol_0_4= ':' | lv_symbol_0_5= '-' | lv_symbol_0_6= '!' | lv_symbol_0_7= '?' ) ) )
            {
            // InternalRinform.g:484:2: ( ( (lv_symbol_0_1= '.' | lv_symbol_0_2= ',' | lv_symbol_0_3= ';' | lv_symbol_0_4= ':' | lv_symbol_0_5= '-' | lv_symbol_0_6= '!' | lv_symbol_0_7= '?' ) ) )
            // InternalRinform.g:485:3: ( (lv_symbol_0_1= '.' | lv_symbol_0_2= ',' | lv_symbol_0_3= ';' | lv_symbol_0_4= ':' | lv_symbol_0_5= '-' | lv_symbol_0_6= '!' | lv_symbol_0_7= '?' ) )
            {
            // InternalRinform.g:485:3: ( (lv_symbol_0_1= '.' | lv_symbol_0_2= ',' | lv_symbol_0_3= ';' | lv_symbol_0_4= ':' | lv_symbol_0_5= '-' | lv_symbol_0_6= '!' | lv_symbol_0_7= '?' ) )
            // InternalRinform.g:486:4: (lv_symbol_0_1= '.' | lv_symbol_0_2= ',' | lv_symbol_0_3= ';' | lv_symbol_0_4= ':' | lv_symbol_0_5= '-' | lv_symbol_0_6= '!' | lv_symbol_0_7= '?' )
            {
            // InternalRinform.g:486:4: (lv_symbol_0_1= '.' | lv_symbol_0_2= ',' | lv_symbol_0_3= ';' | lv_symbol_0_4= ':' | lv_symbol_0_5= '-' | lv_symbol_0_6= '!' | lv_symbol_0_7= '?' )
            int alt5=7;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt5=1;
                }
                break;
            case 19:
                {
                alt5=2;
                }
                break;
            case 20:
                {
                alt5=3;
                }
                break;
            case 21:
                {
                alt5=4;
                }
                break;
            case 22:
                {
                alt5=5;
                }
                break;
            case 23:
                {
                alt5=6;
                }
                break;
            case 24:
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
                    // InternalRinform.g:487:5: lv_symbol_0_1= '.'
                    {
                    lv_symbol_0_1=(Token)match(input,18,FOLLOW_2); 

                    					newLeafNode(lv_symbol_0_1, grammarAccess.getSymbolAccess().getSymbolFullStopKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSymbolRule());
                    					}
                    					setWithLastConsumed(current, "symbol", lv_symbol_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalRinform.g:498:5: lv_symbol_0_2= ','
                    {
                    lv_symbol_0_2=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(lv_symbol_0_2, grammarAccess.getSymbolAccess().getSymbolCommaKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSymbolRule());
                    					}
                    					setWithLastConsumed(current, "symbol", lv_symbol_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalRinform.g:509:5: lv_symbol_0_3= ';'
                    {
                    lv_symbol_0_3=(Token)match(input,20,FOLLOW_2); 

                    					newLeafNode(lv_symbol_0_3, grammarAccess.getSymbolAccess().getSymbolSemicolonKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSymbolRule());
                    					}
                    					setWithLastConsumed(current, "symbol", lv_symbol_0_3, null);
                    				

                    }
                    break;
                case 4 :
                    // InternalRinform.g:520:5: lv_symbol_0_4= ':'
                    {
                    lv_symbol_0_4=(Token)match(input,21,FOLLOW_2); 

                    					newLeafNode(lv_symbol_0_4, grammarAccess.getSymbolAccess().getSymbolColonKeyword_0_3());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSymbolRule());
                    					}
                    					setWithLastConsumed(current, "symbol", lv_symbol_0_4, null);
                    				

                    }
                    break;
                case 5 :
                    // InternalRinform.g:531:5: lv_symbol_0_5= '-'
                    {
                    lv_symbol_0_5=(Token)match(input,22,FOLLOW_2); 

                    					newLeafNode(lv_symbol_0_5, grammarAccess.getSymbolAccess().getSymbolHyphenMinusKeyword_0_4());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSymbolRule());
                    					}
                    					setWithLastConsumed(current, "symbol", lv_symbol_0_5, null);
                    				

                    }
                    break;
                case 6 :
                    // InternalRinform.g:542:5: lv_symbol_0_6= '!'
                    {
                    lv_symbol_0_6=(Token)match(input,23,FOLLOW_2); 

                    					newLeafNode(lv_symbol_0_6, grammarAccess.getSymbolAccess().getSymbolExclamationMarkKeyword_0_5());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSymbolRule());
                    					}
                    					setWithLastConsumed(current, "symbol", lv_symbol_0_6, null);
                    				

                    }
                    break;
                case 7 :
                    // InternalRinform.g:553:5: lv_symbol_0_7= '?'
                    {
                    lv_symbol_0_7=(Token)match(input,24,FOLLOW_2); 

                    					newLeafNode(lv_symbol_0_7, grammarAccess.getSymbolAccess().getSymbolQuestionMarkKeyword_0_6());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSymbolRule());
                    					}
                    					setWithLastConsumed(current, "symbol", lv_symbol_0_7, null);
                    				

                    }
                    break;

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
    // $ANTLR end "ruleSymbol"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\1\11\uffff";
    static final String dfa_3s = "\1\4\11\uffff";
    static final String dfa_4s = "\1\30\11\uffff";
    static final String dfa_5s = "\1\uffff\1\2\10\1";
    static final String dfa_6s = "\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\11\6\uffff\7\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10",
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

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()+ loopback of 395:2: ( ( (lv_text_0_1= ruleSymbol | lv_text_0_2= ruleWord ) ) )+";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000001FEA812L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000001FEB810L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001FEE810L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001FFA810L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});

}