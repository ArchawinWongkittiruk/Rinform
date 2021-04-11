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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_WS", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'-r'", "'('", "')'", "'-c'", "'-i'", "'<'", "'>'", "'.'", "','", "';'", "':'", "'-'", "'!'", "'?'", "'\\''", "'South'", "'North'", "'East'", "'West'", "'Below'", "'Above'"
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

                if ( (LA1_0==RULE_ID||(LA1_0>=11 && LA1_0<=12)||(LA1_0>=14 && LA1_0<=16)||(LA1_0>=18 && LA1_0<=25)) ) {
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
    // InternalRinform.g:189:1: ruleRoomDeclaration returns [EObject current=null] : (otherlv_0= '-r' ( (lv_name_1_0= ruleText ) ) ) ;
    public final EObject ruleRoomDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalRinform.g:195:2: ( (otherlv_0= '-r' ( (lv_name_1_0= ruleText ) ) ) )
            // InternalRinform.g:196:2: (otherlv_0= '-r' ( (lv_name_1_0= ruleText ) ) )
            {
            // InternalRinform.g:196:2: (otherlv_0= '-r' ( (lv_name_1_0= ruleText ) ) )
            // InternalRinform.g:197:3: otherlv_0= '-r' ( (lv_name_1_0= ruleText ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRoomDeclarationAccess().getRKeyword_0());
            		
            // InternalRinform.g:201:3: ( (lv_name_1_0= ruleText ) )
            // InternalRinform.g:202:4: (lv_name_1_0= ruleText )
            {
            // InternalRinform.g:202:4: (lv_name_1_0= ruleText )
            // InternalRinform.g:203:5: lv_name_1_0= ruleText
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
    // InternalRinform.g:224:1: entryRuleRoomDescription returns [EObject current=null] : iv_ruleRoomDescription= ruleRoomDescription EOF ;
    public final EObject entryRuleRoomDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoomDescription = null;


        try {
            // InternalRinform.g:224:56: (iv_ruleRoomDescription= ruleRoomDescription EOF )
            // InternalRinform.g:225:2: iv_ruleRoomDescription= ruleRoomDescription EOF
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
    // InternalRinform.g:231:1: ruleRoomDescription returns [EObject current=null] : (otherlv_0= '(' ( (lv_roomDescription_1_0= ruleText ) )+ otherlv_2= '-r' ( ( ruleText ) ) otherlv_4= ')' ) ;
    public final EObject ruleRoomDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_roomDescription_1_0 = null;



        	enterRule();

        try {
            // InternalRinform.g:237:2: ( (otherlv_0= '(' ( (lv_roomDescription_1_0= ruleText ) )+ otherlv_2= '-r' ( ( ruleText ) ) otherlv_4= ')' ) )
            // InternalRinform.g:238:2: (otherlv_0= '(' ( (lv_roomDescription_1_0= ruleText ) )+ otherlv_2= '-r' ( ( ruleText ) ) otherlv_4= ')' )
            {
            // InternalRinform.g:238:2: (otherlv_0= '(' ( (lv_roomDescription_1_0= ruleText ) )+ otherlv_2= '-r' ( ( ruleText ) ) otherlv_4= ')' )
            // InternalRinform.g:239:3: otherlv_0= '(' ( (lv_roomDescription_1_0= ruleText ) )+ otherlv_2= '-r' ( ( ruleText ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRoomDescriptionAccess().getLeftParenthesisKeyword_0());
            		
            // InternalRinform.g:243:3: ( (lv_roomDescription_1_0= ruleText ) )+
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
            	    // InternalRinform.g:244:4: (lv_roomDescription_1_0= ruleText )
            	    {
            	    // InternalRinform.g:244:4: (lv_roomDescription_1_0= ruleText )
            	    // InternalRinform.g:245:5: lv_roomDescription_1_0= ruleText
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
            		
            // InternalRinform.g:266:3: ( ( ruleText ) )
            // InternalRinform.g:267:4: ( ruleText )
            {
            // InternalRinform.g:267:4: ( ruleText )
            // InternalRinform.g:268:5: ruleText
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
    // InternalRinform.g:290:1: entryRuleContainerDeclaration returns [EObject current=null] : iv_ruleContainerDeclaration= ruleContainerDeclaration EOF ;
    public final EObject entryRuleContainerDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainerDeclaration = null;


        try {
            // InternalRinform.g:290:61: (iv_ruleContainerDeclaration= ruleContainerDeclaration EOF )
            // InternalRinform.g:291:2: iv_ruleContainerDeclaration= ruleContainerDeclaration EOF
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
    // InternalRinform.g:297:1: ruleContainerDeclaration returns [EObject current=null] : (otherlv_0= '-c' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-r' ( ( ruleText ) ) ) ;
    public final EObject ruleContainerDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalRinform.g:303:2: ( (otherlv_0= '-c' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-r' ( ( ruleText ) ) ) )
            // InternalRinform.g:304:2: (otherlv_0= '-c' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-r' ( ( ruleText ) ) )
            {
            // InternalRinform.g:304:2: (otherlv_0= '-c' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-r' ( ( ruleText ) ) )
            // InternalRinform.g:305:3: otherlv_0= '-c' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-r' ( ( ruleText ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getContainerDeclarationAccess().getCKeyword_0());
            		
            // InternalRinform.g:309:3: ( (lv_name_1_0= ruleText ) )
            // InternalRinform.g:310:4: (lv_name_1_0= ruleText )
            {
            // InternalRinform.g:310:4: (lv_name_1_0= ruleText )
            // InternalRinform.g:311:5: lv_name_1_0= ruleText
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
            		
            // InternalRinform.g:332:3: ( ( ruleText ) )
            // InternalRinform.g:333:4: ( ruleText )
            {
            // InternalRinform.g:333:4: ( ruleText )
            // InternalRinform.g:334:5: ruleText
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


    // $ANTLR start "entryRuleItemInContainerDeclaration"
    // InternalRinform.g:352:1: entryRuleItemInContainerDeclaration returns [EObject current=null] : iv_ruleItemInContainerDeclaration= ruleItemInContainerDeclaration EOF ;
    public final EObject entryRuleItemInContainerDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItemInContainerDeclaration = null;


        try {
            // InternalRinform.g:352:67: (iv_ruleItemInContainerDeclaration= ruleItemInContainerDeclaration EOF )
            // InternalRinform.g:353:2: iv_ruleItemInContainerDeclaration= ruleItemInContainerDeclaration EOF
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
    // InternalRinform.g:359:1: ruleItemInContainerDeclaration returns [EObject current=null] : (otherlv_0= '-i' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-c' ( ( ruleText ) ) ) ;
    public final EObject ruleItemInContainerDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalRinform.g:365:2: ( (otherlv_0= '-i' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-c' ( ( ruleText ) ) ) )
            // InternalRinform.g:366:2: (otherlv_0= '-i' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-c' ( ( ruleText ) ) )
            {
            // InternalRinform.g:366:2: (otherlv_0= '-i' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-c' ( ( ruleText ) ) )
            // InternalRinform.g:367:3: otherlv_0= '-i' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-c' ( ( ruleText ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getItemInContainerDeclarationAccess().getIKeyword_0());
            		
            // InternalRinform.g:371:3: ( (lv_name_1_0= ruleText ) )
            // InternalRinform.g:372:4: (lv_name_1_0= ruleText )
            {
            // InternalRinform.g:372:4: (lv_name_1_0= ruleText )
            // InternalRinform.g:373:5: lv_name_1_0= ruleText
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
            		
            // InternalRinform.g:394:3: ( ( ruleText ) )
            // InternalRinform.g:395:4: ( ruleText )
            {
            // InternalRinform.g:395:4: ( ruleText )
            // InternalRinform.g:396:5: ruleText
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
    // InternalRinform.g:414:1: entryRuleItemDeclaration returns [EObject current=null] : iv_ruleItemDeclaration= ruleItemDeclaration EOF ;
    public final EObject entryRuleItemDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItemDeclaration = null;


        try {
            // InternalRinform.g:414:56: (iv_ruleItemDeclaration= ruleItemDeclaration EOF )
            // InternalRinform.g:415:2: iv_ruleItemDeclaration= ruleItemDeclaration EOF
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
    // InternalRinform.g:421:1: ruleItemDeclaration returns [EObject current=null] : ( (otherlv_0= '-i' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-r' ( ( ruleText ) ) ) | this_ItemInContainerDeclaration_4= ruleItemInContainerDeclaration | this_ContainerDeclaration_5= ruleContainerDeclaration ) ;
    public final EObject ruleItemDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject this_ItemInContainerDeclaration_4 = null;

        EObject this_ContainerDeclaration_5 = null;



        	enterRule();

        try {
            // InternalRinform.g:427:2: ( ( (otherlv_0= '-i' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-r' ( ( ruleText ) ) ) | this_ItemInContainerDeclaration_4= ruleItemInContainerDeclaration | this_ContainerDeclaration_5= ruleContainerDeclaration ) )
            // InternalRinform.g:428:2: ( (otherlv_0= '-i' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-r' ( ( ruleText ) ) ) | this_ItemInContainerDeclaration_4= ruleItemInContainerDeclaration | this_ContainerDeclaration_5= ruleContainerDeclaration )
            {
            // InternalRinform.g:428:2: ( (otherlv_0= '-i' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-r' ( ( ruleText ) ) ) | this_ItemInContainerDeclaration_4= ruleItemInContainerDeclaration | this_ContainerDeclaration_5= ruleContainerDeclaration )
            int alt4=3;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalRinform.g:429:3: (otherlv_0= '-i' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-r' ( ( ruleText ) ) )
                    {
                    // InternalRinform.g:429:3: (otherlv_0= '-i' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-r' ( ( ruleText ) ) )
                    // InternalRinform.g:430:4: otherlv_0= '-i' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-r' ( ( ruleText ) )
                    {
                    otherlv_0=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getItemDeclarationAccess().getIKeyword_0_0());
                    			
                    // InternalRinform.g:434:4: ( (lv_name_1_0= ruleText ) )
                    // InternalRinform.g:435:5: (lv_name_1_0= ruleText )
                    {
                    // InternalRinform.g:435:5: (lv_name_1_0= ruleText )
                    // InternalRinform.g:436:6: lv_name_1_0= ruleText
                    {

                    						newCompositeNode(grammarAccess.getItemDeclarationAccess().getNameTextParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_7);
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

                    otherlv_2=(Token)match(input,11,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getItemDeclarationAccess().getRKeyword_0_2());
                    			
                    // InternalRinform.g:457:4: ( ( ruleText ) )
                    // InternalRinform.g:458:5: ( ruleText )
                    {
                    // InternalRinform.g:458:5: ( ruleText )
                    // InternalRinform.g:459:6: ruleText
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getItemDeclarationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getItemDeclarationAccess().getRoomRoomDeclarationCrossReference_0_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    ruleText();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRinform.g:475:3: this_ItemInContainerDeclaration_4= ruleItemInContainerDeclaration
                    {

                    			newCompositeNode(grammarAccess.getItemDeclarationAccess().getItemInContainerDeclarationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ItemInContainerDeclaration_4=ruleItemInContainerDeclaration();

                    state._fsp--;


                    			current = this_ItemInContainerDeclaration_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRinform.g:484:3: this_ContainerDeclaration_5= ruleContainerDeclaration
                    {

                    			newCompositeNode(grammarAccess.getItemDeclarationAccess().getContainerDeclarationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ContainerDeclaration_5=ruleContainerDeclaration();

                    state._fsp--;


                    			current = this_ContainerDeclaration_5;
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
    // InternalRinform.g:496:1: entryRuleItemDescription returns [EObject current=null] : iv_ruleItemDescription= ruleItemDescription EOF ;
    public final EObject entryRuleItemDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItemDescription = null;


        try {
            // InternalRinform.g:496:56: (iv_ruleItemDescription= ruleItemDescription EOF )
            // InternalRinform.g:497:2: iv_ruleItemDescription= ruleItemDescription EOF
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
    // InternalRinform.g:503:1: ruleItemDescription returns [EObject current=null] : (otherlv_0= '(' ( (lv_itemDescription_1_0= ruleText ) )+ otherlv_2= '-i' ( ( ruleText ) ) otherlv_4= ')' ) ;
    public final EObject ruleItemDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_itemDescription_1_0 = null;



        	enterRule();

        try {
            // InternalRinform.g:509:2: ( (otherlv_0= '(' ( (lv_itemDescription_1_0= ruleText ) )+ otherlv_2= '-i' ( ( ruleText ) ) otherlv_4= ')' ) )
            // InternalRinform.g:510:2: (otherlv_0= '(' ( (lv_itemDescription_1_0= ruleText ) )+ otherlv_2= '-i' ( ( ruleText ) ) otherlv_4= ')' )
            {
            // InternalRinform.g:510:2: (otherlv_0= '(' ( (lv_itemDescription_1_0= ruleText ) )+ otherlv_2= '-i' ( ( ruleText ) ) otherlv_4= ')' )
            // InternalRinform.g:511:3: otherlv_0= '(' ( (lv_itemDescription_1_0= ruleText ) )+ otherlv_2= '-i' ( ( ruleText ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getItemDescriptionAccess().getLeftParenthesisKeyword_0());
            		
            // InternalRinform.g:515:3: ( (lv_itemDescription_1_0= ruleText ) )+
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
            	    // InternalRinform.g:516:4: (lv_itemDescription_1_0= ruleText )
            	    {
            	    // InternalRinform.g:516:4: (lv_itemDescription_1_0= ruleText )
            	    // InternalRinform.g:517:5: lv_itemDescription_1_0= ruleText
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
            		
            // InternalRinform.g:538:3: ( ( ruleText ) )
            // InternalRinform.g:539:4: ( ruleText )
            {
            // InternalRinform.g:539:4: ( ruleText )
            // InternalRinform.g:540:5: ruleText
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


    // $ANTLR start "entryRuleDirectionStatement"
    // InternalRinform.g:562:1: entryRuleDirectionStatement returns [EObject current=null] : iv_ruleDirectionStatement= ruleDirectionStatement EOF ;
    public final EObject entryRuleDirectionStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirectionStatement = null;


        try {
            // InternalRinform.g:562:59: (iv_ruleDirectionStatement= ruleDirectionStatement EOF )
            // InternalRinform.g:563:2: iv_ruleDirectionStatement= ruleDirectionStatement EOF
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
    // InternalRinform.g:569:1: ruleDirectionStatement returns [EObject current=null] : (otherlv_0= '<' ( ( ruleText ) ) ( (lv_direction_2_0= ruleDirection ) ) ( ( ruleText ) ) otherlv_4= '>' ) ;
    public final EObject ruleDirectionStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        Enumerator lv_direction_2_0 = null;



        	enterRule();

        try {
            // InternalRinform.g:575:2: ( (otherlv_0= '<' ( ( ruleText ) ) ( (lv_direction_2_0= ruleDirection ) ) ( ( ruleText ) ) otherlv_4= '>' ) )
            // InternalRinform.g:576:2: (otherlv_0= '<' ( ( ruleText ) ) ( (lv_direction_2_0= ruleDirection ) ) ( ( ruleText ) ) otherlv_4= '>' )
            {
            // InternalRinform.g:576:2: (otherlv_0= '<' ( ( ruleText ) ) ( (lv_direction_2_0= ruleDirection ) ) ( ( ruleText ) ) otherlv_4= '>' )
            // InternalRinform.g:577:3: otherlv_0= '<' ( ( ruleText ) ) ( (lv_direction_2_0= ruleDirection ) ) ( ( ruleText ) ) otherlv_4= '>'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDirectionStatementAccess().getLessThanSignKeyword_0());
            		
            // InternalRinform.g:581:3: ( ( ruleText ) )
            // InternalRinform.g:582:4: ( ruleText )
            {
            // InternalRinform.g:582:4: ( ruleText )
            // InternalRinform.g:583:5: ruleText
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDirectionStatementRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDirectionStatementAccess().getRoom1RoomDeclarationCrossReference_1_0());
            				
            pushFollow(FOLLOW_10);
            ruleText();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRinform.g:597:3: ( (lv_direction_2_0= ruleDirection ) )
            // InternalRinform.g:598:4: (lv_direction_2_0= ruleDirection )
            {
            // InternalRinform.g:598:4: (lv_direction_2_0= ruleDirection )
            // InternalRinform.g:599:5: lv_direction_2_0= ruleDirection
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

            // InternalRinform.g:616:3: ( ( ruleText ) )
            // InternalRinform.g:617:4: ( ruleText )
            {
            // InternalRinform.g:617:4: ( ruleText )
            // InternalRinform.g:618:5: ruleText
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDirectionStatementRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDirectionStatementAccess().getRoom2RoomDeclarationCrossReference_3_0());
            				
            pushFollow(FOLLOW_11);
            ruleText();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_2); 

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
    // InternalRinform.g:640:1: entryRuleText returns [String current=null] : iv_ruleText= ruleText EOF ;
    public final String entryRuleText() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleText = null;


        try {
            // InternalRinform.g:640:44: (iv_ruleText= ruleText EOF )
            // InternalRinform.g:641:2: iv_ruleText= ruleText EOF
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
    // InternalRinform.g:647:1: ruleText returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (this_WS_1= RULE_WS this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleText() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_WS_1=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalRinform.g:653:2: ( (this_ID_0= RULE_ID (this_WS_1= RULE_WS this_ID_2= RULE_ID )* ) )
            // InternalRinform.g:654:2: (this_ID_0= RULE_ID (this_WS_1= RULE_WS this_ID_2= RULE_ID )* )
            {
            // InternalRinform.g:654:2: (this_ID_0= RULE_ID (this_WS_1= RULE_WS this_ID_2= RULE_ID )* )
            // InternalRinform.g:655:3: this_ID_0= RULE_ID (this_WS_1= RULE_WS this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getTextAccess().getIDTerminalRuleCall_0());
            		
            // InternalRinform.g:662:3: (this_WS_1= RULE_WS this_ID_2= RULE_ID )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_WS) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalRinform.g:663:4: this_WS_1= RULE_WS this_ID_2= RULE_ID
            	    {
            	    this_WS_1=(Token)match(input,RULE_WS,FOLLOW_4); 

            	    				current.merge(this_WS_1);
            	    			

            	    				newLeafNode(this_WS_1, grammarAccess.getTextAccess().getWSTerminalRuleCall_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_12); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getTextAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalRinform.g:682:1: entryRuleWords returns [EObject current=null] : iv_ruleWords= ruleWords EOF ;
    public final EObject entryRuleWords() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWords = null;


        try {
            // InternalRinform.g:682:46: (iv_ruleWords= ruleWords EOF )
            // InternalRinform.g:683:2: iv_ruleWords= ruleWords EOF
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
    // InternalRinform.g:689:1: ruleWords returns [EObject current=null] : ( (lv_words_0_0= ruleText ) )+ ;
    public final EObject ruleWords() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_words_0_0 = null;



        	enterRule();

        try {
            // InternalRinform.g:695:2: ( ( (lv_words_0_0= ruleText ) )+ )
            // InternalRinform.g:696:2: ( (lv_words_0_0= ruleText ) )+
            {
            // InternalRinform.g:696:2: ( (lv_words_0_0= ruleText ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalRinform.g:697:3: (lv_words_0_0= ruleText )
            	    {
            	    // InternalRinform.g:697:3: (lv_words_0_0= ruleText )
            	    // InternalRinform.g:698:4: lv_words_0_0= ruleText
            	    {

            	    				newCompositeNode(grammarAccess.getWordsAccess().getWordsTextParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_13);
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
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
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
    // InternalRinform.g:718:1: entryRuleSymbol returns [EObject current=null] : iv_ruleSymbol= ruleSymbol EOF ;
    public final EObject entryRuleSymbol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSymbol = null;


        try {
            // InternalRinform.g:718:47: (iv_ruleSymbol= ruleSymbol EOF )
            // InternalRinform.g:719:2: iv_ruleSymbol= ruleSymbol EOF
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
    // InternalRinform.g:725:1: ruleSymbol returns [EObject current=null] : ( ( (lv_symbol_0_1= '.' | lv_symbol_0_2= ',' | lv_symbol_0_3= ';' | lv_symbol_0_4= ':' | lv_symbol_0_5= '-' | lv_symbol_0_6= '!' | lv_symbol_0_7= '?' | lv_symbol_0_8= '\\'' ) ) ) ;
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
            // InternalRinform.g:731:2: ( ( ( (lv_symbol_0_1= '.' | lv_symbol_0_2= ',' | lv_symbol_0_3= ';' | lv_symbol_0_4= ':' | lv_symbol_0_5= '-' | lv_symbol_0_6= '!' | lv_symbol_0_7= '?' | lv_symbol_0_8= '\\'' ) ) ) )
            // InternalRinform.g:732:2: ( ( (lv_symbol_0_1= '.' | lv_symbol_0_2= ',' | lv_symbol_0_3= ';' | lv_symbol_0_4= ':' | lv_symbol_0_5= '-' | lv_symbol_0_6= '!' | lv_symbol_0_7= '?' | lv_symbol_0_8= '\\'' ) ) )
            {
            // InternalRinform.g:732:2: ( ( (lv_symbol_0_1= '.' | lv_symbol_0_2= ',' | lv_symbol_0_3= ';' | lv_symbol_0_4= ':' | lv_symbol_0_5= '-' | lv_symbol_0_6= '!' | lv_symbol_0_7= '?' | lv_symbol_0_8= '\\'' ) ) )
            // InternalRinform.g:733:3: ( (lv_symbol_0_1= '.' | lv_symbol_0_2= ',' | lv_symbol_0_3= ';' | lv_symbol_0_4= ':' | lv_symbol_0_5= '-' | lv_symbol_0_6= '!' | lv_symbol_0_7= '?' | lv_symbol_0_8= '\\'' ) )
            {
            // InternalRinform.g:733:3: ( (lv_symbol_0_1= '.' | lv_symbol_0_2= ',' | lv_symbol_0_3= ';' | lv_symbol_0_4= ':' | lv_symbol_0_5= '-' | lv_symbol_0_6= '!' | lv_symbol_0_7= '?' | lv_symbol_0_8= '\\'' ) )
            // InternalRinform.g:734:4: (lv_symbol_0_1= '.' | lv_symbol_0_2= ',' | lv_symbol_0_3= ';' | lv_symbol_0_4= ':' | lv_symbol_0_5= '-' | lv_symbol_0_6= '!' | lv_symbol_0_7= '?' | lv_symbol_0_8= '\\'' )
            {
            // InternalRinform.g:734:4: (lv_symbol_0_1= '.' | lv_symbol_0_2= ',' | lv_symbol_0_3= ';' | lv_symbol_0_4= ':' | lv_symbol_0_5= '-' | lv_symbol_0_6= '!' | lv_symbol_0_7= '?' | lv_symbol_0_8= '\\'' )
            int alt8=8;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt8=1;
                }
                break;
            case 19:
                {
                alt8=2;
                }
                break;
            case 20:
                {
                alt8=3;
                }
                break;
            case 21:
                {
                alt8=4;
                }
                break;
            case 22:
                {
                alt8=5;
                }
                break;
            case 23:
                {
                alt8=6;
                }
                break;
            case 24:
                {
                alt8=7;
                }
                break;
            case 25:
                {
                alt8=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalRinform.g:735:5: lv_symbol_0_1= '.'
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
                    // InternalRinform.g:746:5: lv_symbol_0_2= ','
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
                    // InternalRinform.g:757:5: lv_symbol_0_3= ';'
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
                    // InternalRinform.g:768:5: lv_symbol_0_4= ':'
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
                    // InternalRinform.g:779:5: lv_symbol_0_5= '-'
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
                    // InternalRinform.g:790:5: lv_symbol_0_6= '!'
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
                    // InternalRinform.g:801:5: lv_symbol_0_7= '?'
                    {
                    lv_symbol_0_7=(Token)match(input,24,FOLLOW_2); 

                    					newLeafNode(lv_symbol_0_7, grammarAccess.getSymbolAccess().getSymbolQuestionMarkKeyword_0_6());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSymbolRule());
                    					}
                    					setWithLastConsumed(current, "symbol", lv_symbol_0_7, null);
                    				

                    }
                    break;
                case 8 :
                    // InternalRinform.g:812:5: lv_symbol_0_8= '\\''
                    {
                    lv_symbol_0_8=(Token)match(input,25,FOLLOW_2); 

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
    // InternalRinform.g:828:1: ruleDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'South' ) | (enumLiteral_1= 'North' ) | (enumLiteral_2= 'East' ) | (enumLiteral_3= 'West' ) | (enumLiteral_4= 'Below' ) | (enumLiteral_5= 'Above' ) ) ;
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
            // InternalRinform.g:834:2: ( ( (enumLiteral_0= 'South' ) | (enumLiteral_1= 'North' ) | (enumLiteral_2= 'East' ) | (enumLiteral_3= 'West' ) | (enumLiteral_4= 'Below' ) | (enumLiteral_5= 'Above' ) ) )
            // InternalRinform.g:835:2: ( (enumLiteral_0= 'South' ) | (enumLiteral_1= 'North' ) | (enumLiteral_2= 'East' ) | (enumLiteral_3= 'West' ) | (enumLiteral_4= 'Below' ) | (enumLiteral_5= 'Above' ) )
            {
            // InternalRinform.g:835:2: ( (enumLiteral_0= 'South' ) | (enumLiteral_1= 'North' ) | (enumLiteral_2= 'East' ) | (enumLiteral_3= 'West' ) | (enumLiteral_4= 'Below' ) | (enumLiteral_5= 'Above' ) )
            int alt9=6;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt9=1;
                }
                break;
            case 27:
                {
                alt9=2;
                }
                break;
            case 28:
                {
                alt9=3;
                }
                break;
            case 29:
                {
                alt9=4;
                }
                break;
            case 30:
                {
                alt9=5;
                }
                break;
            case 31:
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
                    // InternalRinform.g:836:3: (enumLiteral_0= 'South' )
                    {
                    // InternalRinform.g:836:3: (enumLiteral_0= 'South' )
                    // InternalRinform.g:837:4: enumLiteral_0= 'South'
                    {
                    enumLiteral_0=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getDirectionAccess().getSouthEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDirectionAccess().getSouthEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRinform.g:844:3: (enumLiteral_1= 'North' )
                    {
                    // InternalRinform.g:844:3: (enumLiteral_1= 'North' )
                    // InternalRinform.g:845:4: enumLiteral_1= 'North'
                    {
                    enumLiteral_1=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getDirectionAccess().getNorthEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDirectionAccess().getNorthEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRinform.g:852:3: (enumLiteral_2= 'East' )
                    {
                    // InternalRinform.g:852:3: (enumLiteral_2= 'East' )
                    // InternalRinform.g:853:4: enumLiteral_2= 'East'
                    {
                    enumLiteral_2=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getDirectionAccess().getEastEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDirectionAccess().getEastEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRinform.g:860:3: (enumLiteral_3= 'West' )
                    {
                    // InternalRinform.g:860:3: (enumLiteral_3= 'West' )
                    // InternalRinform.g:861:4: enumLiteral_3= 'West'
                    {
                    enumLiteral_3=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getDirectionAccess().getWestEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDirectionAccess().getWestEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRinform.g:868:3: (enumLiteral_4= 'Below' )
                    {
                    // InternalRinform.g:868:3: (enumLiteral_4= 'Below' )
                    // InternalRinform.g:869:4: enumLiteral_4= 'Below'
                    {
                    enumLiteral_4=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getDirectionAccess().getBelowEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getDirectionAccess().getBelowEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalRinform.g:876:3: (enumLiteral_5= 'Above' )
                    {
                    // InternalRinform.g:876:3: (enumLiteral_5= 'Above' )
                    // InternalRinform.g:877:4: enumLiteral_5= 'Above'
                    {
                    enumLiteral_5=(Token)match(input,31,FOLLOW_2); 

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
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\4\1\uffff\1\4\4\uffff\2\4\2\uffff\1\4";
    static final String dfa_3s = "\1\31\1\uffff\1\4\4\uffff\1\17\1\4\2\uffff\1\17";
    static final String dfa_4s = "\1\uffff\1\1\1\uffff\1\3\1\5\1\6\1\7\2\uffff\1\2\1\4\1\uffff";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\4\6\uffff\1\1\1\2\1\uffff\2\3\1\6\1\uffff\10\5",
            "",
            "\1\7",
            "",
            "",
            "",
            "",
            "\1\7\1\10\5\uffff\1\11\3\uffff\1\12",
            "\1\13",
            "",
            "",
            "\1\7\1\10\5\uffff\1\11\3\uffff\1\12"
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
            return "115:2: (this_RoomDeclaration_0= ruleRoomDeclaration | this_RoomDescription_1= ruleRoomDescription | this_ItemDeclaration_2= ruleItemDeclaration | this_ItemDescription_3= ruleItemDescription | this_Words_4= ruleWords | this_Symbol_5= ruleSymbol | this_DirectionStatement_6= ruleDirectionStatement )";
        }
    }
    static final String dfa_7s = "\10\uffff";
    static final String dfa_8s = "\1\16\1\4\1\uffff\1\5\1\4\2\uffff\1\5";
    static final String dfa_9s = "\1\17\1\4\1\uffff\1\16\1\4\2\uffff\1\16";
    static final String dfa_10s = "\2\uffff\1\3\2\uffff\1\1\1\2\1\uffff";
    static final String dfa_11s = "\10\uffff}>";
    static final String[] dfa_12s = {
            "\1\2\1\1",
            "\1\3",
            "",
            "\1\4\5\uffff\1\5\2\uffff\1\6",
            "\1\7",
            "",
            "",
            "\1\4\5\uffff\1\5\2\uffff\1\6"
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
            return "428:2: ( (otherlv_0= '-i' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-r' ( ( ruleText ) ) ) | this_ItemInContainerDeclaration_4= ruleItemInContainerDeclaration | this_ContainerDeclaration_5= ruleContainerDeclaration )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000003FDD812L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000FC000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000012L});

}