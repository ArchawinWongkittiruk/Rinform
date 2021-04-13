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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_WS", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'-r'", "'-a'", "'('", "')'", "'-i'", "'-c'", "'-p'", "'<'", "'>'", "'.'", "','", "';'", "':'", "'-'", "'!'", "'?'", "'\\''", "'South'", "'North'", "'East'", "'West'", "'Below'", "'Above'"
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
    // InternalRinform.g:108:1: ruleSentencePart returns [EObject current=null] : (this_RoomDeclaration_0= ruleRoomDeclaration | this_RoomAlias_1= ruleRoomAlias | this_RoomDescription_2= ruleRoomDescription | this_ItemDeclaration_3= ruleItemDeclaration | this_ItemDescription_4= ruleItemDescription | this_PersonDeclaration_5= rulePersonDeclaration | this_PersonDescription_6= rulePersonDescription | this_Words_7= ruleWords | this_Symbol_8= ruleSymbol | this_DirectionStatement_9= ruleDirectionStatement ) ;
    public final EObject ruleSentencePart() throws RecognitionException {
        EObject current = null;

        EObject this_RoomDeclaration_0 = null;

        EObject this_RoomAlias_1 = null;

        EObject this_RoomDescription_2 = null;

        EObject this_ItemDeclaration_3 = null;

        EObject this_ItemDescription_4 = null;

        EObject this_PersonDeclaration_5 = null;

        EObject this_PersonDescription_6 = null;

        EObject this_Words_7 = null;

        EObject this_Symbol_8 = null;

        EObject this_DirectionStatement_9 = null;



        	enterRule();

        try {
            // InternalRinform.g:114:2: ( (this_RoomDeclaration_0= ruleRoomDeclaration | this_RoomAlias_1= ruleRoomAlias | this_RoomDescription_2= ruleRoomDescription | this_ItemDeclaration_3= ruleItemDeclaration | this_ItemDescription_4= ruleItemDescription | this_PersonDeclaration_5= rulePersonDeclaration | this_PersonDescription_6= rulePersonDescription | this_Words_7= ruleWords | this_Symbol_8= ruleSymbol | this_DirectionStatement_9= ruleDirectionStatement ) )
            // InternalRinform.g:115:2: (this_RoomDeclaration_0= ruleRoomDeclaration | this_RoomAlias_1= ruleRoomAlias | this_RoomDescription_2= ruleRoomDescription | this_ItemDeclaration_3= ruleItemDeclaration | this_ItemDescription_4= ruleItemDescription | this_PersonDeclaration_5= rulePersonDeclaration | this_PersonDescription_6= rulePersonDescription | this_Words_7= ruleWords | this_Symbol_8= ruleSymbol | this_DirectionStatement_9= ruleDirectionStatement )
            {
            // InternalRinform.g:115:2: (this_RoomDeclaration_0= ruleRoomDeclaration | this_RoomAlias_1= ruleRoomAlias | this_RoomDescription_2= ruleRoomDescription | this_ItemDeclaration_3= ruleItemDeclaration | this_ItemDescription_4= ruleItemDescription | this_PersonDeclaration_5= rulePersonDeclaration | this_PersonDescription_6= rulePersonDescription | this_Words_7= ruleWords | this_Symbol_8= ruleSymbol | this_DirectionStatement_9= ruleDirectionStatement )
            int alt2=10;
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
                    // InternalRinform.g:125:3: this_RoomAlias_1= ruleRoomAlias
                    {

                    			newCompositeNode(grammarAccess.getSentencePartAccess().getRoomAliasParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RoomAlias_1=ruleRoomAlias();

                    state._fsp--;


                    			current = this_RoomAlias_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRinform.g:134:3: this_RoomDescription_2= ruleRoomDescription
                    {

                    			newCompositeNode(grammarAccess.getSentencePartAccess().getRoomDescriptionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_RoomDescription_2=ruleRoomDescription();

                    state._fsp--;


                    			current = this_RoomDescription_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRinform.g:143:3: this_ItemDeclaration_3= ruleItemDeclaration
                    {

                    			newCompositeNode(grammarAccess.getSentencePartAccess().getItemDeclarationParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ItemDeclaration_3=ruleItemDeclaration();

                    state._fsp--;


                    			current = this_ItemDeclaration_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalRinform.g:152:3: this_ItemDescription_4= ruleItemDescription
                    {

                    			newCompositeNode(grammarAccess.getSentencePartAccess().getItemDescriptionParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ItemDescription_4=ruleItemDescription();

                    state._fsp--;


                    			current = this_ItemDescription_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalRinform.g:161:3: this_PersonDeclaration_5= rulePersonDeclaration
                    {

                    			newCompositeNode(grammarAccess.getSentencePartAccess().getPersonDeclarationParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_PersonDeclaration_5=rulePersonDeclaration();

                    state._fsp--;


                    			current = this_PersonDeclaration_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalRinform.g:170:3: this_PersonDescription_6= rulePersonDescription
                    {

                    			newCompositeNode(grammarAccess.getSentencePartAccess().getPersonDescriptionParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_PersonDescription_6=rulePersonDescription();

                    state._fsp--;


                    			current = this_PersonDescription_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalRinform.g:179:3: this_Words_7= ruleWords
                    {

                    			newCompositeNode(grammarAccess.getSentencePartAccess().getWordsParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_Words_7=ruleWords();

                    state._fsp--;


                    			current = this_Words_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalRinform.g:188:3: this_Symbol_8= ruleSymbol
                    {

                    			newCompositeNode(grammarAccess.getSentencePartAccess().getSymbolParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_Symbol_8=ruleSymbol();

                    state._fsp--;


                    			current = this_Symbol_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalRinform.g:197:3: this_DirectionStatement_9= ruleDirectionStatement
                    {

                    			newCompositeNode(grammarAccess.getSentencePartAccess().getDirectionStatementParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_DirectionStatement_9=ruleDirectionStatement();

                    state._fsp--;


                    			current = this_DirectionStatement_9;
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
    // InternalRinform.g:209:1: entryRuleRoomDeclaration returns [EObject current=null] : iv_ruleRoomDeclaration= ruleRoomDeclaration EOF ;
    public final EObject entryRuleRoomDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoomDeclaration = null;


        try {
            // InternalRinform.g:209:56: (iv_ruleRoomDeclaration= ruleRoomDeclaration EOF )
            // InternalRinform.g:210:2: iv_ruleRoomDeclaration= ruleRoomDeclaration EOF
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
    // InternalRinform.g:216:1: ruleRoomDeclaration returns [EObject current=null] : (otherlv_0= '-r' ( (lv_name_1_0= ruleText ) ) ) ;
    public final EObject ruleRoomDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalRinform.g:222:2: ( (otherlv_0= '-r' ( (lv_name_1_0= ruleText ) ) ) )
            // InternalRinform.g:223:2: (otherlv_0= '-r' ( (lv_name_1_0= ruleText ) ) )
            {
            // InternalRinform.g:223:2: (otherlv_0= '-r' ( (lv_name_1_0= ruleText ) ) )
            // InternalRinform.g:224:3: otherlv_0= '-r' ( (lv_name_1_0= ruleText ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRoomDeclarationAccess().getRKeyword_0());
            		
            // InternalRinform.g:228:3: ( (lv_name_1_0= ruleText ) )
            // InternalRinform.g:229:4: (lv_name_1_0= ruleText )
            {
            // InternalRinform.g:229:4: (lv_name_1_0= ruleText )
            // InternalRinform.g:230:5: lv_name_1_0= ruleText
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


    // $ANTLR start "entryRuleRoomAlias"
    // InternalRinform.g:251:1: entryRuleRoomAlias returns [EObject current=null] : iv_ruleRoomAlias= ruleRoomAlias EOF ;
    public final EObject entryRuleRoomAlias() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoomAlias = null;


        try {
            // InternalRinform.g:251:50: (iv_ruleRoomAlias= ruleRoomAlias EOF )
            // InternalRinform.g:252:2: iv_ruleRoomAlias= ruleRoomAlias EOF
            {
             newCompositeNode(grammarAccess.getRoomAliasRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoomAlias=ruleRoomAlias();

            state._fsp--;

             current =iv_ruleRoomAlias; 
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
    // $ANTLR end "entryRuleRoomAlias"


    // $ANTLR start "ruleRoomAlias"
    // InternalRinform.g:258:1: ruleRoomAlias returns [EObject current=null] : (otherlv_0= '-r' ( (otherlv_1= RULE_ID ) ) otherlv_2= '-a' ( (lv_aliases_3_0= ruleText ) )+ ) ;
    public final EObject ruleRoomAlias() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_aliases_3_0 = null;



        	enterRule();

        try {
            // InternalRinform.g:264:2: ( (otherlv_0= '-r' ( (otherlv_1= RULE_ID ) ) otherlv_2= '-a' ( (lv_aliases_3_0= ruleText ) )+ ) )
            // InternalRinform.g:265:2: (otherlv_0= '-r' ( (otherlv_1= RULE_ID ) ) otherlv_2= '-a' ( (lv_aliases_3_0= ruleText ) )+ )
            {
            // InternalRinform.g:265:2: (otherlv_0= '-r' ( (otherlv_1= RULE_ID ) ) otherlv_2= '-a' ( (lv_aliases_3_0= ruleText ) )+ )
            // InternalRinform.g:266:3: otherlv_0= '-r' ( (otherlv_1= RULE_ID ) ) otherlv_2= '-a' ( (lv_aliases_3_0= ruleText ) )+
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRoomAliasAccess().getRKeyword_0());
            		
            // InternalRinform.g:270:3: ( (otherlv_1= RULE_ID ) )
            // InternalRinform.g:271:4: (otherlv_1= RULE_ID )
            {
            // InternalRinform.g:271:4: (otherlv_1= RULE_ID )
            // InternalRinform.g:272:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRoomAliasRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(otherlv_1, grammarAccess.getRoomAliasAccess().getRoomRoomDeclarationCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getRoomAliasAccess().getAKeyword_2());
            		
            // InternalRinform.g:287:3: ( (lv_aliases_3_0= ruleText ) )+
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
            	    // InternalRinform.g:288:4: (lv_aliases_3_0= ruleText )
            	    {
            	    // InternalRinform.g:288:4: (lv_aliases_3_0= ruleText )
            	    // InternalRinform.g:289:5: lv_aliases_3_0= ruleText
            	    {

            	    					newCompositeNode(grammarAccess.getRoomAliasAccess().getAliasesTextParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_aliases_3_0=ruleText();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRoomAliasRule());
            	    					}
            	    					add(
            	    						current,
            	    						"aliases",
            	    						lv_aliases_3_0,
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
    // $ANTLR end "ruleRoomAlias"


    // $ANTLR start "entryRuleRoomDescription"
    // InternalRinform.g:310:1: entryRuleRoomDescription returns [EObject current=null] : iv_ruleRoomDescription= ruleRoomDescription EOF ;
    public final EObject entryRuleRoomDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoomDescription = null;


        try {
            // InternalRinform.g:310:56: (iv_ruleRoomDescription= ruleRoomDescription EOF )
            // InternalRinform.g:311:2: iv_ruleRoomDescription= ruleRoomDescription EOF
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
    // InternalRinform.g:317:1: ruleRoomDescription returns [EObject current=null] : (otherlv_0= '(' ( (lv_roomDescription_1_0= ruleText ) )+ otherlv_2= '-r' ( ( ruleText ) ) otherlv_4= ')' ) ;
    public final EObject ruleRoomDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_roomDescription_1_0 = null;



        	enterRule();

        try {
            // InternalRinform.g:323:2: ( (otherlv_0= '(' ( (lv_roomDescription_1_0= ruleText ) )+ otherlv_2= '-r' ( ( ruleText ) ) otherlv_4= ')' ) )
            // InternalRinform.g:324:2: (otherlv_0= '(' ( (lv_roomDescription_1_0= ruleText ) )+ otherlv_2= '-r' ( ( ruleText ) ) otherlv_4= ')' )
            {
            // InternalRinform.g:324:2: (otherlv_0= '(' ( (lv_roomDescription_1_0= ruleText ) )+ otherlv_2= '-r' ( ( ruleText ) ) otherlv_4= ')' )
            // InternalRinform.g:325:3: otherlv_0= '(' ( (lv_roomDescription_1_0= ruleText ) )+ otherlv_2= '-r' ( ( ruleText ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRoomDescriptionAccess().getLeftParenthesisKeyword_0());
            		
            // InternalRinform.g:329:3: ( (lv_roomDescription_1_0= ruleText ) )+
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
            	    // InternalRinform.g:330:4: (lv_roomDescription_1_0= ruleText )
            	    {
            	    // InternalRinform.g:330:4: (lv_roomDescription_1_0= ruleText )
            	    // InternalRinform.g:331:5: lv_roomDescription_1_0= ruleText
            	    {

            	    					newCompositeNode(grammarAccess.getRoomDescriptionAccess().getRoomDescriptionTextParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_7);
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
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            otherlv_2=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getRoomDescriptionAccess().getRKeyword_2());
            		
            // InternalRinform.g:352:3: ( ( ruleText ) )
            // InternalRinform.g:353:4: ( ruleText )
            {
            // InternalRinform.g:353:4: ( ruleText )
            // InternalRinform.g:354:5: ruleText
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRoomDescriptionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRoomDescriptionAccess().getRoomRoomDeclarationCrossReference_3_0());
            				
            pushFollow(FOLLOW_8);
            ruleText();

            state._fsp--;


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


    // $ANTLR start "entryRuleItemInRoomDeclaration"
    // InternalRinform.g:376:1: entryRuleItemInRoomDeclaration returns [EObject current=null] : iv_ruleItemInRoomDeclaration= ruleItemInRoomDeclaration EOF ;
    public final EObject entryRuleItemInRoomDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItemInRoomDeclaration = null;


        try {
            // InternalRinform.g:376:62: (iv_ruleItemInRoomDeclaration= ruleItemInRoomDeclaration EOF )
            // InternalRinform.g:377:2: iv_ruleItemInRoomDeclaration= ruleItemInRoomDeclaration EOF
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
    // InternalRinform.g:383:1: ruleItemInRoomDeclaration returns [EObject current=null] : (otherlv_0= '-i' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-r' ( ( ruleText ) ) ) ;
    public final EObject ruleItemInRoomDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalRinform.g:389:2: ( (otherlv_0= '-i' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-r' ( ( ruleText ) ) ) )
            // InternalRinform.g:390:2: (otherlv_0= '-i' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-r' ( ( ruleText ) ) )
            {
            // InternalRinform.g:390:2: (otherlv_0= '-i' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-r' ( ( ruleText ) ) )
            // InternalRinform.g:391:3: otherlv_0= '-i' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-r' ( ( ruleText ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getItemInRoomDeclarationAccess().getIKeyword_0());
            		
            // InternalRinform.g:395:3: ( (lv_name_1_0= ruleText ) )
            // InternalRinform.g:396:4: (lv_name_1_0= ruleText )
            {
            // InternalRinform.g:396:4: (lv_name_1_0= ruleText )
            // InternalRinform.g:397:5: lv_name_1_0= ruleText
            {

            					newCompositeNode(grammarAccess.getItemInRoomDeclarationAccess().getNameTextParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
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
            		
            // InternalRinform.g:418:3: ( ( ruleText ) )
            // InternalRinform.g:419:4: ( ruleText )
            {
            // InternalRinform.g:419:4: ( ruleText )
            // InternalRinform.g:420:5: ruleText
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
    // InternalRinform.g:438:1: entryRuleItemInContainerDeclaration returns [EObject current=null] : iv_ruleItemInContainerDeclaration= ruleItemInContainerDeclaration EOF ;
    public final EObject entryRuleItemInContainerDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItemInContainerDeclaration = null;


        try {
            // InternalRinform.g:438:67: (iv_ruleItemInContainerDeclaration= ruleItemInContainerDeclaration EOF )
            // InternalRinform.g:439:2: iv_ruleItemInContainerDeclaration= ruleItemInContainerDeclaration EOF
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
    // InternalRinform.g:445:1: ruleItemInContainerDeclaration returns [EObject current=null] : (otherlv_0= '-i' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-c' ( ( ruleText ) ) ) ;
    public final EObject ruleItemInContainerDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalRinform.g:451:2: ( (otherlv_0= '-i' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-c' ( ( ruleText ) ) ) )
            // InternalRinform.g:452:2: (otherlv_0= '-i' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-c' ( ( ruleText ) ) )
            {
            // InternalRinform.g:452:2: (otherlv_0= '-i' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-c' ( ( ruleText ) ) )
            // InternalRinform.g:453:3: otherlv_0= '-i' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-c' ( ( ruleText ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getItemInContainerDeclarationAccess().getIKeyword_0());
            		
            // InternalRinform.g:457:3: ( (lv_name_1_0= ruleText ) )
            // InternalRinform.g:458:4: (lv_name_1_0= ruleText )
            {
            // InternalRinform.g:458:4: (lv_name_1_0= ruleText )
            // InternalRinform.g:459:5: lv_name_1_0= ruleText
            {

            					newCompositeNode(grammarAccess.getItemInContainerDeclarationAccess().getNameTextParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
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

            otherlv_2=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getItemInContainerDeclarationAccess().getCKeyword_2());
            		
            // InternalRinform.g:480:3: ( ( ruleText ) )
            // InternalRinform.g:481:4: ( ruleText )
            {
            // InternalRinform.g:481:4: ( ruleText )
            // InternalRinform.g:482:5: ruleText
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getItemInContainerDeclarationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getItemInContainerDeclarationAccess().getContainerItemInRoomDeclarationCrossReference_3_0());
            				
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
    // InternalRinform.g:500:1: entryRuleItemDeclaration returns [EObject current=null] : iv_ruleItemDeclaration= ruleItemDeclaration EOF ;
    public final EObject entryRuleItemDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItemDeclaration = null;


        try {
            // InternalRinform.g:500:56: (iv_ruleItemDeclaration= ruleItemDeclaration EOF )
            // InternalRinform.g:501:2: iv_ruleItemDeclaration= ruleItemDeclaration EOF
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
    // InternalRinform.g:507:1: ruleItemDeclaration returns [EObject current=null] : (this_ItemInRoomDeclaration_0= ruleItemInRoomDeclaration | this_ItemInContainerDeclaration_1= ruleItemInContainerDeclaration ) ;
    public final EObject ruleItemDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_ItemInRoomDeclaration_0 = null;

        EObject this_ItemInContainerDeclaration_1 = null;



        	enterRule();

        try {
            // InternalRinform.g:513:2: ( (this_ItemInRoomDeclaration_0= ruleItemInRoomDeclaration | this_ItemInContainerDeclaration_1= ruleItemInContainerDeclaration ) )
            // InternalRinform.g:514:2: (this_ItemInRoomDeclaration_0= ruleItemInRoomDeclaration | this_ItemInContainerDeclaration_1= ruleItemInContainerDeclaration )
            {
            // InternalRinform.g:514:2: (this_ItemInRoomDeclaration_0= ruleItemInRoomDeclaration | this_ItemInContainerDeclaration_1= ruleItemInContainerDeclaration )
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalRinform.g:515:3: this_ItemInRoomDeclaration_0= ruleItemInRoomDeclaration
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
                    // InternalRinform.g:524:3: this_ItemInContainerDeclaration_1= ruleItemInContainerDeclaration
                    {

                    			newCompositeNode(grammarAccess.getItemDeclarationAccess().getItemInContainerDeclarationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ItemInContainerDeclaration_1=ruleItemInContainerDeclaration();

                    state._fsp--;


                    			current = this_ItemInContainerDeclaration_1;
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
    // InternalRinform.g:536:1: entryRuleItemDescription returns [EObject current=null] : iv_ruleItemDescription= ruleItemDescription EOF ;
    public final EObject entryRuleItemDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItemDescription = null;


        try {
            // InternalRinform.g:536:56: (iv_ruleItemDescription= ruleItemDescription EOF )
            // InternalRinform.g:537:2: iv_ruleItemDescription= ruleItemDescription EOF
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
    // InternalRinform.g:543:1: ruleItemDescription returns [EObject current=null] : (otherlv_0= '(' ( (lv_itemDescription_1_0= ruleText ) )+ otherlv_2= '-i' ( ( ruleText ) ) otherlv_4= ')' ) ;
    public final EObject ruleItemDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_itemDescription_1_0 = null;



        	enterRule();

        try {
            // InternalRinform.g:549:2: ( (otherlv_0= '(' ( (lv_itemDescription_1_0= ruleText ) )+ otherlv_2= '-i' ( ( ruleText ) ) otherlv_4= ')' ) )
            // InternalRinform.g:550:2: (otherlv_0= '(' ( (lv_itemDescription_1_0= ruleText ) )+ otherlv_2= '-i' ( ( ruleText ) ) otherlv_4= ')' )
            {
            // InternalRinform.g:550:2: (otherlv_0= '(' ( (lv_itemDescription_1_0= ruleText ) )+ otherlv_2= '-i' ( ( ruleText ) ) otherlv_4= ')' )
            // InternalRinform.g:551:3: otherlv_0= '(' ( (lv_itemDescription_1_0= ruleText ) )+ otherlv_2= '-i' ( ( ruleText ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getItemDescriptionAccess().getLeftParenthesisKeyword_0());
            		
            // InternalRinform.g:555:3: ( (lv_itemDescription_1_0= ruleText ) )+
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
            	    // InternalRinform.g:556:4: (lv_itemDescription_1_0= ruleText )
            	    {
            	    // InternalRinform.g:556:4: (lv_itemDescription_1_0= ruleText )
            	    // InternalRinform.g:557:5: lv_itemDescription_1_0= ruleText
            	    {

            	    					newCompositeNode(grammarAccess.getItemDescriptionAccess().getItemDescriptionTextParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_11);
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
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            otherlv_2=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getItemDescriptionAccess().getIKeyword_2());
            		
            // InternalRinform.g:578:3: ( ( ruleText ) )
            // InternalRinform.g:579:4: ( ruleText )
            {
            // InternalRinform.g:579:4: ( ruleText )
            // InternalRinform.g:580:5: ruleText
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getItemDescriptionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getItemDescriptionAccess().getItemItemDeclarationCrossReference_3_0());
            				
            pushFollow(FOLLOW_8);
            ruleText();

            state._fsp--;


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


    // $ANTLR start "entryRulePersonDeclaration"
    // InternalRinform.g:602:1: entryRulePersonDeclaration returns [EObject current=null] : iv_rulePersonDeclaration= rulePersonDeclaration EOF ;
    public final EObject entryRulePersonDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePersonDeclaration = null;


        try {
            // InternalRinform.g:602:58: (iv_rulePersonDeclaration= rulePersonDeclaration EOF )
            // InternalRinform.g:603:2: iv_rulePersonDeclaration= rulePersonDeclaration EOF
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
    // InternalRinform.g:609:1: rulePersonDeclaration returns [EObject current=null] : (otherlv_0= '-p' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-r' ( ( ruleText ) ) ) ;
    public final EObject rulePersonDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalRinform.g:615:2: ( (otherlv_0= '-p' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-r' ( ( ruleText ) ) ) )
            // InternalRinform.g:616:2: (otherlv_0= '-p' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-r' ( ( ruleText ) ) )
            {
            // InternalRinform.g:616:2: (otherlv_0= '-p' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-r' ( ( ruleText ) ) )
            // InternalRinform.g:617:3: otherlv_0= '-p' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-r' ( ( ruleText ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPersonDeclarationAccess().getPKeyword_0());
            		
            // InternalRinform.g:621:3: ( (lv_name_1_0= ruleText ) )
            // InternalRinform.g:622:4: (lv_name_1_0= ruleText )
            {
            // InternalRinform.g:622:4: (lv_name_1_0= ruleText )
            // InternalRinform.g:623:5: lv_name_1_0= ruleText
            {

            					newCompositeNode(grammarAccess.getPersonDeclarationAccess().getNameTextParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
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
            		
            // InternalRinform.g:644:3: ( ( ruleText ) )
            // InternalRinform.g:645:4: ( ruleText )
            {
            // InternalRinform.g:645:4: ( ruleText )
            // InternalRinform.g:646:5: ruleText
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
    // InternalRinform.g:664:1: entryRulePersonDescription returns [EObject current=null] : iv_rulePersonDescription= rulePersonDescription EOF ;
    public final EObject entryRulePersonDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePersonDescription = null;


        try {
            // InternalRinform.g:664:58: (iv_rulePersonDescription= rulePersonDescription EOF )
            // InternalRinform.g:665:2: iv_rulePersonDescription= rulePersonDescription EOF
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
    // InternalRinform.g:671:1: rulePersonDescription returns [EObject current=null] : (otherlv_0= '(' ( (lv_personDescription_1_0= ruleText ) )+ otherlv_2= '-p' ( ( ruleText ) ) otherlv_4= ')' ) ;
    public final EObject rulePersonDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_personDescription_1_0 = null;



        	enterRule();

        try {
            // InternalRinform.g:677:2: ( (otherlv_0= '(' ( (lv_personDescription_1_0= ruleText ) )+ otherlv_2= '-p' ( ( ruleText ) ) otherlv_4= ')' ) )
            // InternalRinform.g:678:2: (otherlv_0= '(' ( (lv_personDescription_1_0= ruleText ) )+ otherlv_2= '-p' ( ( ruleText ) ) otherlv_4= ')' )
            {
            // InternalRinform.g:678:2: (otherlv_0= '(' ( (lv_personDescription_1_0= ruleText ) )+ otherlv_2= '-p' ( ( ruleText ) ) otherlv_4= ')' )
            // InternalRinform.g:679:3: otherlv_0= '(' ( (lv_personDescription_1_0= ruleText ) )+ otherlv_2= '-p' ( ( ruleText ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPersonDescriptionAccess().getLeftParenthesisKeyword_0());
            		
            // InternalRinform.g:683:3: ( (lv_personDescription_1_0= ruleText ) )+
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
            	    // InternalRinform.g:684:4: (lv_personDescription_1_0= ruleText )
            	    {
            	    // InternalRinform.g:684:4: (lv_personDescription_1_0= ruleText )
            	    // InternalRinform.g:685:5: lv_personDescription_1_0= ruleText
            	    {

            	    					newCompositeNode(grammarAccess.getPersonDescriptionAccess().getPersonDescriptionTextParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_12);
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
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            otherlv_2=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getPersonDescriptionAccess().getPKeyword_2());
            		
            // InternalRinform.g:706:3: ( ( ruleText ) )
            // InternalRinform.g:707:4: ( ruleText )
            {
            // InternalRinform.g:707:4: ( ruleText )
            // InternalRinform.g:708:5: ruleText
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPersonDescriptionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPersonDescriptionAccess().getPersonPersonDeclarationCrossReference_3_0());
            				
            pushFollow(FOLLOW_8);
            ruleText();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

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
    // InternalRinform.g:730:1: entryRuleDirectionStatement returns [EObject current=null] : iv_ruleDirectionStatement= ruleDirectionStatement EOF ;
    public final EObject entryRuleDirectionStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirectionStatement = null;


        try {
            // InternalRinform.g:730:59: (iv_ruleDirectionStatement= ruleDirectionStatement EOF )
            // InternalRinform.g:731:2: iv_ruleDirectionStatement= ruleDirectionStatement EOF
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
    // InternalRinform.g:737:1: ruleDirectionStatement returns [EObject current=null] : (otherlv_0= '<' ( ( ruleText ) ) ( (lv_direction_2_0= ruleDirection ) ) ( ( ruleText ) ) otherlv_4= '>' ) ;
    public final EObject ruleDirectionStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        Enumerator lv_direction_2_0 = null;



        	enterRule();

        try {
            // InternalRinform.g:743:2: ( (otherlv_0= '<' ( ( ruleText ) ) ( (lv_direction_2_0= ruleDirection ) ) ( ( ruleText ) ) otherlv_4= '>' ) )
            // InternalRinform.g:744:2: (otherlv_0= '<' ( ( ruleText ) ) ( (lv_direction_2_0= ruleDirection ) ) ( ( ruleText ) ) otherlv_4= '>' )
            {
            // InternalRinform.g:744:2: (otherlv_0= '<' ( ( ruleText ) ) ( (lv_direction_2_0= ruleDirection ) ) ( ( ruleText ) ) otherlv_4= '>' )
            // InternalRinform.g:745:3: otherlv_0= '<' ( ( ruleText ) ) ( (lv_direction_2_0= ruleDirection ) ) ( ( ruleText ) ) otherlv_4= '>'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDirectionStatementAccess().getLessThanSignKeyword_0());
            		
            // InternalRinform.g:749:3: ( ( ruleText ) )
            // InternalRinform.g:750:4: ( ruleText )
            {
            // InternalRinform.g:750:4: ( ruleText )
            // InternalRinform.g:751:5: ruleText
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDirectionStatementRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDirectionStatementAccess().getRoom1RoomDeclarationCrossReference_1_0());
            				
            pushFollow(FOLLOW_13);
            ruleText();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRinform.g:765:3: ( (lv_direction_2_0= ruleDirection ) )
            // InternalRinform.g:766:4: (lv_direction_2_0= ruleDirection )
            {
            // InternalRinform.g:766:4: (lv_direction_2_0= ruleDirection )
            // InternalRinform.g:767:5: lv_direction_2_0= ruleDirection
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

            // InternalRinform.g:784:3: ( ( ruleText ) )
            // InternalRinform.g:785:4: ( ruleText )
            {
            // InternalRinform.g:785:4: ( ruleText )
            // InternalRinform.g:786:5: ruleText
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDirectionStatementRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDirectionStatementAccess().getRoom2RoomDeclarationCrossReference_3_0());
            				
            pushFollow(FOLLOW_14);
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
    // InternalRinform.g:808:1: entryRuleText returns [String current=null] : iv_ruleText= ruleText EOF ;
    public final String entryRuleText() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleText = null;


        try {
            // InternalRinform.g:808:44: (iv_ruleText= ruleText EOF )
            // InternalRinform.g:809:2: iv_ruleText= ruleText EOF
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
    // InternalRinform.g:815:1: ruleText returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (this_WS_1= RULE_WS this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleText() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_WS_1=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalRinform.g:821:2: ( (this_ID_0= RULE_ID (this_WS_1= RULE_WS this_ID_2= RULE_ID )* ) )
            // InternalRinform.g:822:2: (this_ID_0= RULE_ID (this_WS_1= RULE_WS this_ID_2= RULE_ID )* )
            {
            // InternalRinform.g:822:2: (this_ID_0= RULE_ID (this_WS_1= RULE_WS this_ID_2= RULE_ID )* )
            // InternalRinform.g:823:3: this_ID_0= RULE_ID (this_WS_1= RULE_WS this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getTextAccess().getIDTerminalRuleCall_0());
            		
            // InternalRinform.g:830:3: (this_WS_1= RULE_WS this_ID_2= RULE_ID )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_WS) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalRinform.g:831:4: this_WS_1= RULE_WS this_ID_2= RULE_ID
            	    {
            	    this_WS_1=(Token)match(input,RULE_WS,FOLLOW_4); 

            	    				current.merge(this_WS_1);
            	    			

            	    				newLeafNode(this_WS_1, grammarAccess.getTextAccess().getWSTerminalRuleCall_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_15); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getTextAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalRinform.g:850:1: entryRuleWords returns [EObject current=null] : iv_ruleWords= ruleWords EOF ;
    public final EObject entryRuleWords() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWords = null;


        try {
            // InternalRinform.g:850:46: (iv_ruleWords= ruleWords EOF )
            // InternalRinform.g:851:2: iv_ruleWords= ruleWords EOF
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
    // InternalRinform.g:857:1: ruleWords returns [EObject current=null] : ( (lv_words_0_0= ruleText ) )+ ;
    public final EObject ruleWords() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_words_0_0 = null;



        	enterRule();

        try {
            // InternalRinform.g:863:2: ( ( (lv_words_0_0= ruleText ) )+ )
            // InternalRinform.g:864:2: ( (lv_words_0_0= ruleText ) )+
            {
            // InternalRinform.g:864:2: ( (lv_words_0_0= ruleText ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalRinform.g:865:3: (lv_words_0_0= ruleText )
            	    {
            	    // InternalRinform.g:865:3: (lv_words_0_0= ruleText )
            	    // InternalRinform.g:866:4: lv_words_0_0= ruleText
            	    {

            	    				newCompositeNode(grammarAccess.getWordsAccess().getWordsTextParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_6);
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
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
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
    // InternalRinform.g:886:1: entryRuleSymbol returns [EObject current=null] : iv_ruleSymbol= ruleSymbol EOF ;
    public final EObject entryRuleSymbol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSymbol = null;


        try {
            // InternalRinform.g:886:47: (iv_ruleSymbol= ruleSymbol EOF )
            // InternalRinform.g:887:2: iv_ruleSymbol= ruleSymbol EOF
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
    // InternalRinform.g:893:1: ruleSymbol returns [EObject current=null] : ( ( (lv_symbol_0_1= '.' | lv_symbol_0_2= ',' | lv_symbol_0_3= ';' | lv_symbol_0_4= ':' | lv_symbol_0_5= '-' | lv_symbol_0_6= '!' | lv_symbol_0_7= '?' | lv_symbol_0_8= '\\'' ) ) ) ;
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
            // InternalRinform.g:899:2: ( ( ( (lv_symbol_0_1= '.' | lv_symbol_0_2= ',' | lv_symbol_0_3= ';' | lv_symbol_0_4= ':' | lv_symbol_0_5= '-' | lv_symbol_0_6= '!' | lv_symbol_0_7= '?' | lv_symbol_0_8= '\\'' ) ) ) )
            // InternalRinform.g:900:2: ( ( (lv_symbol_0_1= '.' | lv_symbol_0_2= ',' | lv_symbol_0_3= ';' | lv_symbol_0_4= ':' | lv_symbol_0_5= '-' | lv_symbol_0_6= '!' | lv_symbol_0_7= '?' | lv_symbol_0_8= '\\'' ) ) )
            {
            // InternalRinform.g:900:2: ( ( (lv_symbol_0_1= '.' | lv_symbol_0_2= ',' | lv_symbol_0_3= ';' | lv_symbol_0_4= ':' | lv_symbol_0_5= '-' | lv_symbol_0_6= '!' | lv_symbol_0_7= '?' | lv_symbol_0_8= '\\'' ) ) )
            // InternalRinform.g:901:3: ( (lv_symbol_0_1= '.' | lv_symbol_0_2= ',' | lv_symbol_0_3= ';' | lv_symbol_0_4= ':' | lv_symbol_0_5= '-' | lv_symbol_0_6= '!' | lv_symbol_0_7= '?' | lv_symbol_0_8= '\\'' ) )
            {
            // InternalRinform.g:901:3: ( (lv_symbol_0_1= '.' | lv_symbol_0_2= ',' | lv_symbol_0_3= ';' | lv_symbol_0_4= ':' | lv_symbol_0_5= '-' | lv_symbol_0_6= '!' | lv_symbol_0_7= '?' | lv_symbol_0_8= '\\'' ) )
            // InternalRinform.g:902:4: (lv_symbol_0_1= '.' | lv_symbol_0_2= ',' | lv_symbol_0_3= ';' | lv_symbol_0_4= ':' | lv_symbol_0_5= '-' | lv_symbol_0_6= '!' | lv_symbol_0_7= '?' | lv_symbol_0_8= '\\'' )
            {
            // InternalRinform.g:902:4: (lv_symbol_0_1= '.' | lv_symbol_0_2= ',' | lv_symbol_0_3= ';' | lv_symbol_0_4= ':' | lv_symbol_0_5= '-' | lv_symbol_0_6= '!' | lv_symbol_0_7= '?' | lv_symbol_0_8= '\\'' )
            int alt10=8;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt10=1;
                }
                break;
            case 21:
                {
                alt10=2;
                }
                break;
            case 22:
                {
                alt10=3;
                }
                break;
            case 23:
                {
                alt10=4;
                }
                break;
            case 24:
                {
                alt10=5;
                }
                break;
            case 25:
                {
                alt10=6;
                }
                break;
            case 26:
                {
                alt10=7;
                }
                break;
            case 27:
                {
                alt10=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalRinform.g:903:5: lv_symbol_0_1= '.'
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
                    // InternalRinform.g:914:5: lv_symbol_0_2= ','
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
                    // InternalRinform.g:925:5: lv_symbol_0_3= ';'
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
                    // InternalRinform.g:936:5: lv_symbol_0_4= ':'
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
                    // InternalRinform.g:947:5: lv_symbol_0_5= '-'
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
                    // InternalRinform.g:958:5: lv_symbol_0_6= '!'
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
                    // InternalRinform.g:969:5: lv_symbol_0_7= '?'
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
                    // InternalRinform.g:980:5: lv_symbol_0_8= '\\''
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
    // InternalRinform.g:996:1: ruleDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'South' ) | (enumLiteral_1= 'North' ) | (enumLiteral_2= 'East' ) | (enumLiteral_3= 'West' ) | (enumLiteral_4= 'Below' ) | (enumLiteral_5= 'Above' ) ) ;
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
            // InternalRinform.g:1002:2: ( ( (enumLiteral_0= 'South' ) | (enumLiteral_1= 'North' ) | (enumLiteral_2= 'East' ) | (enumLiteral_3= 'West' ) | (enumLiteral_4= 'Below' ) | (enumLiteral_5= 'Above' ) ) )
            // InternalRinform.g:1003:2: ( (enumLiteral_0= 'South' ) | (enumLiteral_1= 'North' ) | (enumLiteral_2= 'East' ) | (enumLiteral_3= 'West' ) | (enumLiteral_4= 'Below' ) | (enumLiteral_5= 'Above' ) )
            {
            // InternalRinform.g:1003:2: ( (enumLiteral_0= 'South' ) | (enumLiteral_1= 'North' ) | (enumLiteral_2= 'East' ) | (enumLiteral_3= 'West' ) | (enumLiteral_4= 'Below' ) | (enumLiteral_5= 'Above' ) )
            int alt11=6;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt11=1;
                }
                break;
            case 29:
                {
                alt11=2;
                }
                break;
            case 30:
                {
                alt11=3;
                }
                break;
            case 31:
                {
                alt11=4;
                }
                break;
            case 32:
                {
                alt11=5;
                }
                break;
            case 33:
                {
                alt11=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalRinform.g:1004:3: (enumLiteral_0= 'South' )
                    {
                    // InternalRinform.g:1004:3: (enumLiteral_0= 'South' )
                    // InternalRinform.g:1005:4: enumLiteral_0= 'South'
                    {
                    enumLiteral_0=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getDirectionAccess().getSouthEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDirectionAccess().getSouthEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRinform.g:1012:3: (enumLiteral_1= 'North' )
                    {
                    // InternalRinform.g:1012:3: (enumLiteral_1= 'North' )
                    // InternalRinform.g:1013:4: enumLiteral_1= 'North'
                    {
                    enumLiteral_1=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getDirectionAccess().getNorthEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDirectionAccess().getNorthEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRinform.g:1020:3: (enumLiteral_2= 'East' )
                    {
                    // InternalRinform.g:1020:3: (enumLiteral_2= 'East' )
                    // InternalRinform.g:1021:4: enumLiteral_2= 'East'
                    {
                    enumLiteral_2=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getDirectionAccess().getEastEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDirectionAccess().getEastEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRinform.g:1028:3: (enumLiteral_3= 'West' )
                    {
                    // InternalRinform.g:1028:3: (enumLiteral_3= 'West' )
                    // InternalRinform.g:1029:4: enumLiteral_3= 'West'
                    {
                    enumLiteral_3=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getDirectionAccess().getWestEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDirectionAccess().getWestEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRinform.g:1036:3: (enumLiteral_4= 'Below' )
                    {
                    // InternalRinform.g:1036:3: (enumLiteral_4= 'Below' )
                    // InternalRinform.g:1037:4: enumLiteral_4= 'Below'
                    {
                    enumLiteral_4=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getDirectionAccess().getBelowEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getDirectionAccess().getBelowEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalRinform.g:1044:3: (enumLiteral_5= 'Above' )
                    {
                    // InternalRinform.g:1044:3: (enumLiteral_5= 'Above' )
                    // InternalRinform.g:1045:4: enumLiteral_5= 'Above'
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


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA5 dfa5 = new DFA5(this);
    static final String dfa_1s = "\21\uffff";
    static final String dfa_2s = "\10\uffff\1\12\10\uffff";
    static final String dfa_3s = "\3\4\5\uffff\2\4\2\uffff\1\4\3\uffff\1\4";
    static final String dfa_4s = "\1\33\2\4\5\uffff\1\33\1\21\2\uffff\1\4\3\uffff\1\21";
    static final String dfa_5s = "\3\uffff\1\4\1\6\1\10\1\11\1\12\2\uffff\1\1\1\2\1\uffff\1\5\1\7\1\3\1\uffff";
    static final String dfa_6s = "\21\uffff}>";
    static final String[] dfa_7s = {
            "\1\5\6\uffff\1\1\1\uffff\1\2\1\uffff\1\3\1\uffff\1\4\1\7\1\uffff\10\6",
            "\1\10",
            "\1\11",
            "",
            "",
            "",
            "",
            "",
            "\2\12\5\uffff\1\12\1\13\1\12\1\uffff\1\12\1\uffff\2\12\1\uffff\10\12",
            "\1\11\1\14\5\uffff\1\17\3\uffff\1\15\1\uffff\1\16",
            "",
            "",
            "\1\20",
            "",
            "",
            "",
            "\1\11\1\14\5\uffff\1\17\3\uffff\1\15\1\uffff\1\16"
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
            return "115:2: (this_RoomDeclaration_0= ruleRoomDeclaration | this_RoomAlias_1= ruleRoomAlias | this_RoomDescription_2= ruleRoomDescription | this_ItemDeclaration_3= ruleItemDeclaration | this_ItemDescription_4= ruleItemDescription | this_PersonDeclaration_5= rulePersonDeclaration | this_PersonDescription_6= rulePersonDescription | this_Words_7= ruleWords | this_Symbol_8= ruleSymbol | this_DirectionStatement_9= ruleDirectionStatement )";
        }
    }
    static final String dfa_8s = "\7\uffff";
    static final String dfa_9s = "\1\17\1\4\1\5\1\4\2\uffff\1\5";
    static final String dfa_10s = "\1\17\1\4\1\20\1\4\2\uffff\1\20";
    static final String dfa_11s = "\4\uffff\1\2\1\1\1\uffff";
    static final String dfa_12s = "\7\uffff}>";
    static final String[] dfa_13s = {
            "\1\1",
            "\1\2",
            "\1\3\5\uffff\1\5\4\uffff\1\4",
            "\1\6",
            "",
            "",
            "\1\3\5\uffff\1\5\4\uffff\1\4"
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "514:2: (this_ItemInRoomDeclaration_0= ruleItemInRoomDeclaration | this_ItemInContainerDeclaration_1= ruleItemInContainerDeclaration )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000FF6A812L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000003F0000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000022L});

}