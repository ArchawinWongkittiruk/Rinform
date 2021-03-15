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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_WS", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'['", "']'", "'('", "')'", "'{'", "'}'", "'({'", "'<'", "'>'", "'.'", "','", "';'", "':'", "'-'", "'!'", "'?'", "'\\''", "'South'", "'North'", "'East'", "'West'", "'Below'", "'Above'"
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

                if ( (LA1_0==RULE_ID||LA1_0==11||LA1_0==13||LA1_0==15||(LA1_0>=17 && LA1_0<=18)||(LA1_0>=20 && LA1_0<=27)) ) {
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
    // InternalRinform.g:108:1: ruleSentencePart returns [EObject current=null] : (this_RoomDeclaration_0= ruleRoomDeclaration | this_RoomDescription_1= ruleRoomDescription | this_ItemDeclaration_2= ruleItemDeclaration | this_ItemDescription_3= ruleItemDescription | this_Words_4= ruleWords | this_Symbol_5= ruleSymbol | this_DirectionStatement_6= ruleDirectionStatement ) ;
    public final EObject ruleSentencePart() throws RecognitionException {
        EObject current = null;

        EObject this_RoomDeclaration_0 = null;

        EObject this_RoomDescription_1 = null;

        EObject this_ItemDeclaration_2 = null;

        EObject this_ItemDescription_3 = null;

        EObject this_Words_4 = null;

        EObject this_Symbol_5 = null;

        EObject this_DirectionStatement_6 = null;



        	enterRule();

        try {
            // InternalRinform.g:114:2: ( (this_RoomDeclaration_0= ruleRoomDeclaration | this_RoomDescription_1= ruleRoomDescription | this_ItemDeclaration_2= ruleItemDeclaration | this_ItemDescription_3= ruleItemDescription | this_Words_4= ruleWords | this_Symbol_5= ruleSymbol | this_DirectionStatement_6= ruleDirectionStatement ) )
            // InternalRinform.g:115:2: (this_RoomDeclaration_0= ruleRoomDeclaration | this_RoomDescription_1= ruleRoomDescription | this_ItemDeclaration_2= ruleItemDeclaration | this_ItemDescription_3= ruleItemDescription | this_Words_4= ruleWords | this_Symbol_5= ruleSymbol | this_DirectionStatement_6= ruleDirectionStatement )
            {
            // InternalRinform.g:115:2: (this_RoomDeclaration_0= ruleRoomDeclaration | this_RoomDescription_1= ruleRoomDescription | this_ItemDeclaration_2= ruleItemDeclaration | this_ItemDescription_3= ruleItemDescription | this_Words_4= ruleWords | this_Symbol_5= ruleSymbol | this_DirectionStatement_6= ruleDirectionStatement )
            int alt2=7;
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
                {
                alt2=5;
                }
                break;
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
                {
                alt2=6;
                }
                break;
            case 18:
                {
                alt2=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

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
                    // InternalRinform.g:152:3: this_Words_4= ruleWords
                    {

                    			newCompositeNode(grammarAccess.getSentencePartAccess().getWordsParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Words_4=ruleWords();

                    state._fsp--;


                    			current = this_Words_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalRinform.g:161:3: this_Symbol_5= ruleSymbol
                    {

                    			newCompositeNode(grammarAccess.getSentencePartAccess().getSymbolParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Symbol_5=ruleSymbol();

                    state._fsp--;


                    			current = this_Symbol_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalRinform.g:170:3: this_DirectionStatement_6= ruleDirectionStatement
                    {

                    			newCompositeNode(grammarAccess.getSentencePartAccess().getDirectionStatementParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_DirectionStatement_6=ruleDirectionStatement();

                    state._fsp--;


                    			current = this_DirectionStatement_6;
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
    // InternalRinform.g:182:1: entryRuleRoomDeclaration returns [EObject current=null] : iv_ruleRoomDeclaration= ruleRoomDeclaration EOF ;
    public final EObject entryRuleRoomDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoomDeclaration = null;


        try {
            // InternalRinform.g:182:56: (iv_ruleRoomDeclaration= ruleRoomDeclaration EOF )
            // InternalRinform.g:183:2: iv_ruleRoomDeclaration= ruleRoomDeclaration EOF
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
    // InternalRinform.g:189:1: ruleRoomDeclaration returns [EObject current=null] : (otherlv_0= '[' ( (lv_name_1_0= ruleText ) ) otherlv_2= ']' ) ;
    public final EObject ruleRoomDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalRinform.g:195:2: ( (otherlv_0= '[' ( (lv_name_1_0= ruleText ) ) otherlv_2= ']' ) )
            // InternalRinform.g:196:2: (otherlv_0= '[' ( (lv_name_1_0= ruleText ) ) otherlv_2= ']' )
            {
            // InternalRinform.g:196:2: (otherlv_0= '[' ( (lv_name_1_0= ruleText ) ) otherlv_2= ']' )
            // InternalRinform.g:197:3: otherlv_0= '[' ( (lv_name_1_0= ruleText ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRoomDeclarationAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalRinform.g:201:3: ( (lv_name_1_0= ruleText ) )
            // InternalRinform.g:202:4: (lv_name_1_0= ruleText )
            {
            // InternalRinform.g:202:4: (lv_name_1_0= ruleText )
            // InternalRinform.g:203:5: lv_name_1_0= ruleText
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
    // InternalRinform.g:228:1: entryRuleRoomDescription returns [EObject current=null] : iv_ruleRoomDescription= ruleRoomDescription EOF ;
    public final EObject entryRuleRoomDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoomDescription = null;


        try {
            // InternalRinform.g:228:56: (iv_ruleRoomDescription= ruleRoomDescription EOF )
            // InternalRinform.g:229:2: iv_ruleRoomDescription= ruleRoomDescription EOF
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
    // InternalRinform.g:235:1: ruleRoomDescription returns [EObject current=null] : (otherlv_0= '(' otherlv_1= '[' ( ( ruleText ) ) otherlv_3= ']' ( (lv_description_4_0= ruleText ) )+ otherlv_5= ')' ) ;
    public final EObject ruleRoomDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_description_4_0 = null;



        	enterRule();

        try {
            // InternalRinform.g:241:2: ( (otherlv_0= '(' otherlv_1= '[' ( ( ruleText ) ) otherlv_3= ']' ( (lv_description_4_0= ruleText ) )+ otherlv_5= ')' ) )
            // InternalRinform.g:242:2: (otherlv_0= '(' otherlv_1= '[' ( ( ruleText ) ) otherlv_3= ']' ( (lv_description_4_0= ruleText ) )+ otherlv_5= ')' )
            {
            // InternalRinform.g:242:2: (otherlv_0= '(' otherlv_1= '[' ( ( ruleText ) ) otherlv_3= ']' ( (lv_description_4_0= ruleText ) )+ otherlv_5= ')' )
            // InternalRinform.g:243:3: otherlv_0= '(' otherlv_1= '[' ( ( ruleText ) ) otherlv_3= ']' ( (lv_description_4_0= ruleText ) )+ otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getRoomDescriptionAccess().getLeftParenthesisKeyword_0());
            		
            otherlv_1=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getRoomDescriptionAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalRinform.g:251:3: ( ( ruleText ) )
            // InternalRinform.g:252:4: ( ruleText )
            {
            // InternalRinform.g:252:4: ( ruleText )
            // InternalRinform.g:253:5: ruleText
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRoomDescriptionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRoomDescriptionAccess().getRoomRoomDeclarationCrossReference_2_0());
            				
            pushFollow(FOLLOW_5);
            ruleText();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getRoomDescriptionAccess().getRightSquareBracketKeyword_3());
            		
            // InternalRinform.g:271:3: ( (lv_description_4_0= ruleText ) )+
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
            	    // InternalRinform.g:272:4: (lv_description_4_0= ruleText )
            	    {
            	    // InternalRinform.g:272:4: (lv_description_4_0= ruleText )
            	    // InternalRinform.g:273:5: lv_description_4_0= ruleText
            	    {

            	    					newCompositeNode(grammarAccess.getRoomDescriptionAccess().getDescriptionTextParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_description_4_0=ruleText();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRoomDescriptionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"description",
            	    						lv_description_4_0,
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

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getRoomDescriptionAccess().getRightParenthesisKeyword_5());
            		

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
    // InternalRinform.g:298:1: entryRuleItemDeclaration returns [EObject current=null] : iv_ruleItemDeclaration= ruleItemDeclaration EOF ;
    public final EObject entryRuleItemDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItemDeclaration = null;


        try {
            // InternalRinform.g:298:56: (iv_ruleItemDeclaration= ruleItemDeclaration EOF )
            // InternalRinform.g:299:2: iv_ruleItemDeclaration= ruleItemDeclaration EOF
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
    // InternalRinform.g:305:1: ruleItemDeclaration returns [EObject current=null] : (otherlv_0= '{' otherlv_1= '[' ( ( ruleText ) ) otherlv_3= ']' ( (lv_name_4_0= ruleText ) ) otherlv_5= '}' ) ;
    public final EObject ruleItemDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;



        	enterRule();

        try {
            // InternalRinform.g:311:2: ( (otherlv_0= '{' otherlv_1= '[' ( ( ruleText ) ) otherlv_3= ']' ( (lv_name_4_0= ruleText ) ) otherlv_5= '}' ) )
            // InternalRinform.g:312:2: (otherlv_0= '{' otherlv_1= '[' ( ( ruleText ) ) otherlv_3= ']' ( (lv_name_4_0= ruleText ) ) otherlv_5= '}' )
            {
            // InternalRinform.g:312:2: (otherlv_0= '{' otherlv_1= '[' ( ( ruleText ) ) otherlv_3= ']' ( (lv_name_4_0= ruleText ) ) otherlv_5= '}' )
            // InternalRinform.g:313:3: otherlv_0= '{' otherlv_1= '[' ( ( ruleText ) ) otherlv_3= ']' ( (lv_name_4_0= ruleText ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getItemDeclarationAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getItemDeclarationAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalRinform.g:321:3: ( ( ruleText ) )
            // InternalRinform.g:322:4: ( ruleText )
            {
            // InternalRinform.g:322:4: ( ruleText )
            // InternalRinform.g:323:5: ruleText
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getItemDeclarationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getItemDeclarationAccess().getRoomRoomDeclarationCrossReference_2_0());
            				
            pushFollow(FOLLOW_5);
            ruleText();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getItemDeclarationAccess().getRightSquareBracketKeyword_3());
            		
            // InternalRinform.g:341:3: ( (lv_name_4_0= ruleText ) )
            // InternalRinform.g:342:4: (lv_name_4_0= ruleText )
            {
            // InternalRinform.g:342:4: (lv_name_4_0= ruleText )
            // InternalRinform.g:343:5: lv_name_4_0= ruleText
            {

            					newCompositeNode(grammarAccess.getItemDeclarationAccess().getNameTextParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_name_4_0=ruleText();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getItemDeclarationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"uk.ac.kcl.mde.Rinform.Text");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getItemDeclarationAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalRinform.g:368:1: entryRuleItemDescription returns [EObject current=null] : iv_ruleItemDescription= ruleItemDescription EOF ;
    public final EObject entryRuleItemDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItemDescription = null;


        try {
            // InternalRinform.g:368:56: (iv_ruleItemDescription= ruleItemDescription EOF )
            // InternalRinform.g:369:2: iv_ruleItemDescription= ruleItemDescription EOF
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
    // InternalRinform.g:375:1: ruleItemDescription returns [EObject current=null] : (otherlv_0= '({' ( ( ruleText ) ) otherlv_2= '}' ( (lv_description_3_0= ruleText ) )+ otherlv_4= ')' ) ;
    public final EObject ruleItemDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_description_3_0 = null;



        	enterRule();

        try {
            // InternalRinform.g:381:2: ( (otherlv_0= '({' ( ( ruleText ) ) otherlv_2= '}' ( (lv_description_3_0= ruleText ) )+ otherlv_4= ')' ) )
            // InternalRinform.g:382:2: (otherlv_0= '({' ( ( ruleText ) ) otherlv_2= '}' ( (lv_description_3_0= ruleText ) )+ otherlv_4= ')' )
            {
            // InternalRinform.g:382:2: (otherlv_0= '({' ( ( ruleText ) ) otherlv_2= '}' ( (lv_description_3_0= ruleText ) )+ otherlv_4= ')' )
            // InternalRinform.g:383:3: otherlv_0= '({' ( ( ruleText ) ) otherlv_2= '}' ( (lv_description_3_0= ruleText ) )+ otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getItemDescriptionAccess().getLeftParenthesisLeftCurlyBracketKeyword_0());
            		
            // InternalRinform.g:387:3: ( ( ruleText ) )
            // InternalRinform.g:388:4: ( ruleText )
            {
            // InternalRinform.g:388:4: ( ruleText )
            // InternalRinform.g:389:5: ruleText
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getItemDescriptionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getItemDescriptionAccess().getItemItemDeclarationCrossReference_1_0());
            				
            pushFollow(FOLLOW_8);
            ruleText();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getItemDescriptionAccess().getRightCurlyBracketKeyword_2());
            		
            // InternalRinform.g:407:3: ( (lv_description_3_0= ruleText ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalRinform.g:408:4: (lv_description_3_0= ruleText )
            	    {
            	    // InternalRinform.g:408:4: (lv_description_3_0= ruleText )
            	    // InternalRinform.g:409:5: lv_description_3_0= ruleText
            	    {

            	    					newCompositeNode(grammarAccess.getItemDescriptionAccess().getDescriptionTextParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_description_3_0=ruleText();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getItemDescriptionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"description",
            	    						lv_description_3_0,
            	    						"uk.ac.kcl.mde.Rinform.Text");
            	    					afterParserOrEnumRuleCall();
            	    				

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


    // $ANTLR start "entryRuleDirectionStatement"
    // InternalRinform.g:434:1: entryRuleDirectionStatement returns [EObject current=null] : iv_ruleDirectionStatement= ruleDirectionStatement EOF ;
    public final EObject entryRuleDirectionStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirectionStatement = null;


        try {
            // InternalRinform.g:434:59: (iv_ruleDirectionStatement= ruleDirectionStatement EOF )
            // InternalRinform.g:435:2: iv_ruleDirectionStatement= ruleDirectionStatement EOF
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
    // InternalRinform.g:441:1: ruleDirectionStatement returns [EObject current=null] : (otherlv_0= '<' ( ( ruleText ) ) ( (lv_direction_2_0= ruleDirection ) ) ( ( ruleText ) ) otherlv_4= '>' ) ;
    public final EObject ruleDirectionStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        Enumerator lv_direction_2_0 = null;



        	enterRule();

        try {
            // InternalRinform.g:447:2: ( (otherlv_0= '<' ( ( ruleText ) ) ( (lv_direction_2_0= ruleDirection ) ) ( ( ruleText ) ) otherlv_4= '>' ) )
            // InternalRinform.g:448:2: (otherlv_0= '<' ( ( ruleText ) ) ( (lv_direction_2_0= ruleDirection ) ) ( ( ruleText ) ) otherlv_4= '>' )
            {
            // InternalRinform.g:448:2: (otherlv_0= '<' ( ( ruleText ) ) ( (lv_direction_2_0= ruleDirection ) ) ( ( ruleText ) ) otherlv_4= '>' )
            // InternalRinform.g:449:3: otherlv_0= '<' ( ( ruleText ) ) ( (lv_direction_2_0= ruleDirection ) ) ( ( ruleText ) ) otherlv_4= '>'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDirectionStatementAccess().getLessThanSignKeyword_0());
            		
            // InternalRinform.g:453:3: ( ( ruleText ) )
            // InternalRinform.g:454:4: ( ruleText )
            {
            // InternalRinform.g:454:4: ( ruleText )
            // InternalRinform.g:455:5: ruleText
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDirectionStatementRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDirectionStatementAccess().getRoom1RoomDeclarationCrossReference_1_0());
            				
            pushFollow(FOLLOW_9);
            ruleText();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRinform.g:469:3: ( (lv_direction_2_0= ruleDirection ) )
            // InternalRinform.g:470:4: (lv_direction_2_0= ruleDirection )
            {
            // InternalRinform.g:470:4: (lv_direction_2_0= ruleDirection )
            // InternalRinform.g:471:5: lv_direction_2_0= ruleDirection
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

            // InternalRinform.g:488:3: ( ( ruleText ) )
            // InternalRinform.g:489:4: ( ruleText )
            {
            // InternalRinform.g:489:4: ( ruleText )
            // InternalRinform.g:490:5: ruleText
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDirectionStatementRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDirectionStatementAccess().getRoom2RoomDeclarationCrossReference_3_0());
            				
            pushFollow(FOLLOW_10);
            ruleText();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_2); 

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
    // InternalRinform.g:512:1: entryRuleText returns [String current=null] : iv_ruleText= ruleText EOF ;
    public final String entryRuleText() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleText = null;


        try {
            // InternalRinform.g:512:44: (iv_ruleText= ruleText EOF )
            // InternalRinform.g:513:2: iv_ruleText= ruleText EOF
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
    // InternalRinform.g:519:1: ruleText returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (this_WS_1= RULE_WS this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleText() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_WS_1=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalRinform.g:525:2: ( (this_ID_0= RULE_ID (this_WS_1= RULE_WS this_ID_2= RULE_ID )* ) )
            // InternalRinform.g:526:2: (this_ID_0= RULE_ID (this_WS_1= RULE_WS this_ID_2= RULE_ID )* )
            {
            // InternalRinform.g:526:2: (this_ID_0= RULE_ID (this_WS_1= RULE_WS this_ID_2= RULE_ID )* )
            // InternalRinform.g:527:3: this_ID_0= RULE_ID (this_WS_1= RULE_WS this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getTextAccess().getIDTerminalRuleCall_0());
            		
            // InternalRinform.g:534:3: (this_WS_1= RULE_WS this_ID_2= RULE_ID )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_WS) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalRinform.g:535:4: this_WS_1= RULE_WS this_ID_2= RULE_ID
            	    {
            	    this_WS_1=(Token)match(input,RULE_WS,FOLLOW_4); 

            	    				current.merge(this_WS_1);
            	    			

            	    				newLeafNode(this_WS_1, grammarAccess.getTextAccess().getWSTerminalRuleCall_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_11); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getTextAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop5;
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
    // InternalRinform.g:554:1: entryRuleWords returns [EObject current=null] : iv_ruleWords= ruleWords EOF ;
    public final EObject entryRuleWords() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWords = null;


        try {
            // InternalRinform.g:554:46: (iv_ruleWords= ruleWords EOF )
            // InternalRinform.g:555:2: iv_ruleWords= ruleWords EOF
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
    // InternalRinform.g:561:1: ruleWords returns [EObject current=null] : ( (lv_words_0_0= ruleText ) )+ ;
    public final EObject ruleWords() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_words_0_0 = null;



        	enterRule();

        try {
            // InternalRinform.g:567:2: ( ( (lv_words_0_0= ruleText ) )+ )
            // InternalRinform.g:568:2: ( (lv_words_0_0= ruleText ) )+
            {
            // InternalRinform.g:568:2: ( (lv_words_0_0= ruleText ) )+
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
            	    // InternalRinform.g:569:3: (lv_words_0_0= ruleText )
            	    {
            	    // InternalRinform.g:569:3: (lv_words_0_0= ruleText )
            	    // InternalRinform.g:570:4: lv_words_0_0= ruleText
            	    {

            	    				newCompositeNode(grammarAccess.getWordsAccess().getWordsTextParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_12);
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
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
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


    // $ANTLR start "entryRuleSymbol"
    // InternalRinform.g:590:1: entryRuleSymbol returns [EObject current=null] : iv_ruleSymbol= ruleSymbol EOF ;
    public final EObject entryRuleSymbol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSymbol = null;


        try {
            // InternalRinform.g:590:47: (iv_ruleSymbol= ruleSymbol EOF )
            // InternalRinform.g:591:2: iv_ruleSymbol= ruleSymbol EOF
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
    // InternalRinform.g:597:1: ruleSymbol returns [EObject current=null] : ( ( (lv_symbol_0_1= '.' | lv_symbol_0_2= ',' | lv_symbol_0_3= ';' | lv_symbol_0_4= ':' | lv_symbol_0_5= '-' | lv_symbol_0_6= '!' | lv_symbol_0_7= '?' | lv_symbol_0_8= '\\'' ) ) ) ;
    public final EObject ruleSymbol() throws RecognitionException {
        EObject current = null;

        Token lv_symbol_0_1=null;
        Token lv_symbol_0_2=null;
        Token lv_symbol_0_3=null;
        Token lv_symbol_0_4=null;
        Token lv_symbol_0_5=null;
        Token lv_symbol_0_6=null;
        Token lv_symbol_0_7=null;
        Token lv_symbol_0_8=null;


        	enterRule();

        try {
            // InternalRinform.g:603:2: ( ( ( (lv_symbol_0_1= '.' | lv_symbol_0_2= ',' | lv_symbol_0_3= ';' | lv_symbol_0_4= ':' | lv_symbol_0_5= '-' | lv_symbol_0_6= '!' | lv_symbol_0_7= '?' | lv_symbol_0_8= '\\'' ) ) ) )
            // InternalRinform.g:604:2: ( ( (lv_symbol_0_1= '.' | lv_symbol_0_2= ',' | lv_symbol_0_3= ';' | lv_symbol_0_4= ':' | lv_symbol_0_5= '-' | lv_symbol_0_6= '!' | lv_symbol_0_7= '?' | lv_symbol_0_8= '\\'' ) ) )
            {
            // InternalRinform.g:604:2: ( ( (lv_symbol_0_1= '.' | lv_symbol_0_2= ',' | lv_symbol_0_3= ';' | lv_symbol_0_4= ':' | lv_symbol_0_5= '-' | lv_symbol_0_6= '!' | lv_symbol_0_7= '?' | lv_symbol_0_8= '\\'' ) ) )
            // InternalRinform.g:605:3: ( (lv_symbol_0_1= '.' | lv_symbol_0_2= ',' | lv_symbol_0_3= ';' | lv_symbol_0_4= ':' | lv_symbol_0_5= '-' | lv_symbol_0_6= '!' | lv_symbol_0_7= '?' | lv_symbol_0_8= '\\'' ) )
            {
            // InternalRinform.g:605:3: ( (lv_symbol_0_1= '.' | lv_symbol_0_2= ',' | lv_symbol_0_3= ';' | lv_symbol_0_4= ':' | lv_symbol_0_5= '-' | lv_symbol_0_6= '!' | lv_symbol_0_7= '?' | lv_symbol_0_8= '\\'' ) )
            // InternalRinform.g:606:4: (lv_symbol_0_1= '.' | lv_symbol_0_2= ',' | lv_symbol_0_3= ';' | lv_symbol_0_4= ':' | lv_symbol_0_5= '-' | lv_symbol_0_6= '!' | lv_symbol_0_7= '?' | lv_symbol_0_8= '\\'' )
            {
            // InternalRinform.g:606:4: (lv_symbol_0_1= '.' | lv_symbol_0_2= ',' | lv_symbol_0_3= ';' | lv_symbol_0_4= ':' | lv_symbol_0_5= '-' | lv_symbol_0_6= '!' | lv_symbol_0_7= '?' | lv_symbol_0_8= '\\'' )
            int alt7=8;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt7=1;
                }
                break;
            case 21:
                {
                alt7=2;
                }
                break;
            case 22:
                {
                alt7=3;
                }
                break;
            case 23:
                {
                alt7=4;
                }
                break;
            case 24:
                {
                alt7=5;
                }
                break;
            case 25:
                {
                alt7=6;
                }
                break;
            case 26:
                {
                alt7=7;
                }
                break;
            case 27:
                {
                alt7=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalRinform.g:607:5: lv_symbol_0_1= '.'
                    {
                    lv_symbol_0_1=(Token)match(input,20,FOLLOW_2); 

                    					newLeafNode(lv_symbol_0_1, grammarAccess.getSymbolAccess().getSymbolFullStopKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSymbolRule());
                    					}
                    					setWithLastConsumed(current, "symbol", lv_symbol_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalRinform.g:618:5: lv_symbol_0_2= ','
                    {
                    lv_symbol_0_2=(Token)match(input,21,FOLLOW_2); 

                    					newLeafNode(lv_symbol_0_2, grammarAccess.getSymbolAccess().getSymbolCommaKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSymbolRule());
                    					}
                    					setWithLastConsumed(current, "symbol", lv_symbol_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalRinform.g:629:5: lv_symbol_0_3= ';'
                    {
                    lv_symbol_0_3=(Token)match(input,22,FOLLOW_2); 

                    					newLeafNode(lv_symbol_0_3, grammarAccess.getSymbolAccess().getSymbolSemicolonKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSymbolRule());
                    					}
                    					setWithLastConsumed(current, "symbol", lv_symbol_0_3, null);
                    				

                    }
                    break;
                case 4 :
                    // InternalRinform.g:640:5: lv_symbol_0_4= ':'
                    {
                    lv_symbol_0_4=(Token)match(input,23,FOLLOW_2); 

                    					newLeafNode(lv_symbol_0_4, grammarAccess.getSymbolAccess().getSymbolColonKeyword_0_3());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSymbolRule());
                    					}
                    					setWithLastConsumed(current, "symbol", lv_symbol_0_4, null);
                    				

                    }
                    break;
                case 5 :
                    // InternalRinform.g:651:5: lv_symbol_0_5= '-'
                    {
                    lv_symbol_0_5=(Token)match(input,24,FOLLOW_2); 

                    					newLeafNode(lv_symbol_0_5, grammarAccess.getSymbolAccess().getSymbolHyphenMinusKeyword_0_4());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSymbolRule());
                    					}
                    					setWithLastConsumed(current, "symbol", lv_symbol_0_5, null);
                    				

                    }
                    break;
                case 6 :
                    // InternalRinform.g:662:5: lv_symbol_0_6= '!'
                    {
                    lv_symbol_0_6=(Token)match(input,25,FOLLOW_2); 

                    					newLeafNode(lv_symbol_0_6, grammarAccess.getSymbolAccess().getSymbolExclamationMarkKeyword_0_5());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSymbolRule());
                    					}
                    					setWithLastConsumed(current, "symbol", lv_symbol_0_6, null);
                    				

                    }
                    break;
                case 7 :
                    // InternalRinform.g:673:5: lv_symbol_0_7= '?'
                    {
                    lv_symbol_0_7=(Token)match(input,26,FOLLOW_2); 

                    					newLeafNode(lv_symbol_0_7, grammarAccess.getSymbolAccess().getSymbolQuestionMarkKeyword_0_6());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSymbolRule());
                    					}
                    					setWithLastConsumed(current, "symbol", lv_symbol_0_7, null);
                    				

                    }
                    break;
                case 8 :
                    // InternalRinform.g:684:5: lv_symbol_0_8= '\\''
                    {
                    lv_symbol_0_8=(Token)match(input,27,FOLLOW_2); 

                    					newLeafNode(lv_symbol_0_8, grammarAccess.getSymbolAccess().getSymbolApostropheKeyword_0_7());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSymbolRule());
                    					}
                    					setWithLastConsumed(current, "symbol", lv_symbol_0_8, null);
                    				

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


    // $ANTLR start "ruleDirection"
    // InternalRinform.g:700:1: ruleDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'South' ) | (enumLiteral_1= 'North' ) | (enumLiteral_2= 'East' ) | (enumLiteral_3= 'West' ) | (enumLiteral_4= 'Below' ) | (enumLiteral_5= 'Above' ) ) ;
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
            // InternalRinform.g:706:2: ( ( (enumLiteral_0= 'South' ) | (enumLiteral_1= 'North' ) | (enumLiteral_2= 'East' ) | (enumLiteral_3= 'West' ) | (enumLiteral_4= 'Below' ) | (enumLiteral_5= 'Above' ) ) )
            // InternalRinform.g:707:2: ( (enumLiteral_0= 'South' ) | (enumLiteral_1= 'North' ) | (enumLiteral_2= 'East' ) | (enumLiteral_3= 'West' ) | (enumLiteral_4= 'Below' ) | (enumLiteral_5= 'Above' ) )
            {
            // InternalRinform.g:707:2: ( (enumLiteral_0= 'South' ) | (enumLiteral_1= 'North' ) | (enumLiteral_2= 'East' ) | (enumLiteral_3= 'West' ) | (enumLiteral_4= 'Below' ) | (enumLiteral_5= 'Above' ) )
            int alt8=6;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt8=1;
                }
                break;
            case 29:
                {
                alt8=2;
                }
                break;
            case 30:
                {
                alt8=3;
                }
                break;
            case 31:
                {
                alt8=4;
                }
                break;
            case 32:
                {
                alt8=5;
                }
                break;
            case 33:
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
                    // InternalRinform.g:708:3: (enumLiteral_0= 'South' )
                    {
                    // InternalRinform.g:708:3: (enumLiteral_0= 'South' )
                    // InternalRinform.g:709:4: enumLiteral_0= 'South'
                    {
                    enumLiteral_0=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getDirectionAccess().getSouthEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDirectionAccess().getSouthEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRinform.g:716:3: (enumLiteral_1= 'North' )
                    {
                    // InternalRinform.g:716:3: (enumLiteral_1= 'North' )
                    // InternalRinform.g:717:4: enumLiteral_1= 'North'
                    {
                    enumLiteral_1=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getDirectionAccess().getNorthEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDirectionAccess().getNorthEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRinform.g:724:3: (enumLiteral_2= 'East' )
                    {
                    // InternalRinform.g:724:3: (enumLiteral_2= 'East' )
                    // InternalRinform.g:725:4: enumLiteral_2= 'East'
                    {
                    enumLiteral_2=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getDirectionAccess().getEastEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDirectionAccess().getEastEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRinform.g:732:3: (enumLiteral_3= 'West' )
                    {
                    // InternalRinform.g:732:3: (enumLiteral_3= 'West' )
                    // InternalRinform.g:733:4: enumLiteral_3= 'West'
                    {
                    enumLiteral_3=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getDirectionAccess().getWestEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDirectionAccess().getWestEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRinform.g:740:3: (enumLiteral_4= 'Below' )
                    {
                    // InternalRinform.g:740:3: (enumLiteral_4= 'Below' )
                    // InternalRinform.g:741:4: enumLiteral_4= 'Below'
                    {
                    enumLiteral_4=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getDirectionAccess().getBelowEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getDirectionAccess().getBelowEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalRinform.g:748:3: (enumLiteral_5= 'Above' )
                    {
                    // InternalRinform.g:748:3: (enumLiteral_5= 'Above' )
                    // InternalRinform.g:749:4: enumLiteral_5= 'Above'
                    {
                    enumLiteral_5=(Token)match(input,33,FOLLOW_2); 

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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000FF6A812L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000003F0000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000012L});

}