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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_WS", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'r-'", "'-r'", "'-a'", "'{'", "'!r'", "'['", "']'", "'}'", "'c-'", "'-c'", "'i-'", "'-i'", "'!c'", "'!i'", "'p-'", "'-p'", "'!p'", "'<'", "'>'", "'.'", "','", "';'", "':'", "'-'", "'!'", "'?'", "'\\''", "'('", "')'", "'\"'", "'South'", "'North'", "'East'", "'West'", "'Below'", "'Above'"
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

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_WS)||(LA1_0>=11 && LA1_0<=12)||LA1_0==14||LA1_0==19||LA1_0==21||LA1_0==25||LA1_0==28||(LA1_0>=30 && LA1_0<=40)) ) {
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
    // InternalRinform.g:108:1: ruleSentencePart returns [EObject current=null] : (this_RoomDeclaration_0= ruleRoomDeclaration | this_RoomAlias_1= ruleRoomAlias | this_RoomDescription_2= ruleRoomDescription | this_ItemDeclaration_3= ruleItemDeclaration | this_ItemDescription_4= ruleItemDescription | this_CharacterDeclaration_5= ruleCharacterDeclaration | this_CharacterDescription_6= ruleCharacterDescription | this_Words_7= ruleWords | this_DirectionStatement_8= ruleDirectionStatement ) ;
    public final EObject ruleSentencePart() throws RecognitionException {
        EObject current = null;

        EObject this_RoomDeclaration_0 = null;

        EObject this_RoomAlias_1 = null;

        EObject this_RoomDescription_2 = null;

        EObject this_ItemDeclaration_3 = null;

        EObject this_ItemDescription_4 = null;

        EObject this_CharacterDeclaration_5 = null;

        EObject this_CharacterDescription_6 = null;

        EObject this_Words_7 = null;

        EObject this_DirectionStatement_8 = null;



        	enterRule();

        try {
            // InternalRinform.g:114:2: ( (this_RoomDeclaration_0= ruleRoomDeclaration | this_RoomAlias_1= ruleRoomAlias | this_RoomDescription_2= ruleRoomDescription | this_ItemDeclaration_3= ruleItemDeclaration | this_ItemDescription_4= ruleItemDescription | this_CharacterDeclaration_5= ruleCharacterDeclaration | this_CharacterDescription_6= ruleCharacterDescription | this_Words_7= ruleWords | this_DirectionStatement_8= ruleDirectionStatement ) )
            // InternalRinform.g:115:2: (this_RoomDeclaration_0= ruleRoomDeclaration | this_RoomAlias_1= ruleRoomAlias | this_RoomDescription_2= ruleRoomDescription | this_ItemDeclaration_3= ruleItemDeclaration | this_ItemDescription_4= ruleItemDescription | this_CharacterDeclaration_5= ruleCharacterDeclaration | this_CharacterDescription_6= ruleCharacterDescription | this_Words_7= ruleWords | this_DirectionStatement_8= ruleDirectionStatement )
            {
            // InternalRinform.g:115:2: (this_RoomDeclaration_0= ruleRoomDeclaration | this_RoomAlias_1= ruleRoomAlias | this_RoomDescription_2= ruleRoomDescription | this_ItemDeclaration_3= ruleItemDeclaration | this_ItemDescription_4= ruleItemDescription | this_CharacterDeclaration_5= ruleCharacterDeclaration | this_CharacterDescription_6= ruleCharacterDescription | this_Words_7= ruleWords | this_DirectionStatement_8= ruleDirectionStatement )
            int alt2=9;
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
                    // InternalRinform.g:161:3: this_CharacterDeclaration_5= ruleCharacterDeclaration
                    {

                    			newCompositeNode(grammarAccess.getSentencePartAccess().getCharacterDeclarationParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_CharacterDeclaration_5=ruleCharacterDeclaration();

                    state._fsp--;


                    			current = this_CharacterDeclaration_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalRinform.g:170:3: this_CharacterDescription_6= ruleCharacterDescription
                    {

                    			newCompositeNode(grammarAccess.getSentencePartAccess().getCharacterDescriptionParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_CharacterDescription_6=ruleCharacterDescription();

                    state._fsp--;


                    			current = this_CharacterDescription_6;
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
                    // InternalRinform.g:188:3: this_DirectionStatement_8= ruleDirectionStatement
                    {

                    			newCompositeNode(grammarAccess.getSentencePartAccess().getDirectionStatementParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_DirectionStatement_8=ruleDirectionStatement();

                    state._fsp--;


                    			current = this_DirectionStatement_8;
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
    // InternalRinform.g:200:1: entryRuleRoomDeclaration returns [EObject current=null] : iv_ruleRoomDeclaration= ruleRoomDeclaration EOF ;
    public final EObject entryRuleRoomDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoomDeclaration = null;


        try {
            // InternalRinform.g:200:56: (iv_ruleRoomDeclaration= ruleRoomDeclaration EOF )
            // InternalRinform.g:201:2: iv_ruleRoomDeclaration= ruleRoomDeclaration EOF
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
    // InternalRinform.g:207:1: ruleRoomDeclaration returns [EObject current=null] : (otherlv_0= 'r-' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-r' ) ;
    public final EObject ruleRoomDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalRinform.g:213:2: ( (otherlv_0= 'r-' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-r' ) )
            // InternalRinform.g:214:2: (otherlv_0= 'r-' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-r' )
            {
            // InternalRinform.g:214:2: (otherlv_0= 'r-' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-r' )
            // InternalRinform.g:215:3: otherlv_0= 'r-' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-r'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRoomDeclarationAccess().getRKeyword_0());
            		
            // InternalRinform.g:219:3: ( (lv_name_1_0= ruleText ) )
            // InternalRinform.g:220:4: (lv_name_1_0= ruleText )
            {
            // InternalRinform.g:220:4: (lv_name_1_0= ruleText )
            // InternalRinform.g:221:5: lv_name_1_0= ruleText
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

            			newLeafNode(otherlv_2, grammarAccess.getRoomDeclarationAccess().getRKeyword_2());
            		

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
    // InternalRinform.g:246:1: entryRuleRoomAlias returns [EObject current=null] : iv_ruleRoomAlias= ruleRoomAlias EOF ;
    public final EObject entryRuleRoomAlias() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoomAlias = null;


        try {
            // InternalRinform.g:246:50: (iv_ruleRoomAlias= ruleRoomAlias EOF )
            // InternalRinform.g:247:2: iv_ruleRoomAlias= ruleRoomAlias EOF
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
    // InternalRinform.g:253:1: ruleRoomAlias returns [EObject current=null] : (otherlv_0= '-r' ( (otherlv_1= RULE_ID ) ) otherlv_2= '-a' ( (lv_aliases_3_0= ruleText ) )+ ) ;
    public final EObject ruleRoomAlias() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_aliases_3_0 = null;



        	enterRule();

        try {
            // InternalRinform.g:259:2: ( (otherlv_0= '-r' ( (otherlv_1= RULE_ID ) ) otherlv_2= '-a' ( (lv_aliases_3_0= ruleText ) )+ ) )
            // InternalRinform.g:260:2: (otherlv_0= '-r' ( (otherlv_1= RULE_ID ) ) otherlv_2= '-a' ( (lv_aliases_3_0= ruleText ) )+ )
            {
            // InternalRinform.g:260:2: (otherlv_0= '-r' ( (otherlv_1= RULE_ID ) ) otherlv_2= '-a' ( (lv_aliases_3_0= ruleText ) )+ )
            // InternalRinform.g:261:3: otherlv_0= '-r' ( (otherlv_1= RULE_ID ) ) otherlv_2= '-a' ( (lv_aliases_3_0= ruleText ) )+
            {
            otherlv_0=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getRoomAliasAccess().getRKeyword_0());
            		
            // InternalRinform.g:265:3: ( (otherlv_1= RULE_ID ) )
            // InternalRinform.g:266:4: (otherlv_1= RULE_ID )
            {
            // InternalRinform.g:266:4: (otherlv_1= RULE_ID )
            // InternalRinform.g:267:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRoomAliasRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(otherlv_1, grammarAccess.getRoomAliasAccess().getRoomRoomDeclarationCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getRoomAliasAccess().getAKeyword_2());
            		
            // InternalRinform.g:282:3: ( (lv_aliases_3_0= ruleText ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                alt3 = dfa3.predict(input);
                switch (alt3) {
            	case 1 :
            	    // InternalRinform.g:283:4: (lv_aliases_3_0= ruleText )
            	    {
            	    // InternalRinform.g:283:4: (lv_aliases_3_0= ruleText )
            	    // InternalRinform.g:284:5: lv_aliases_3_0= ruleText
            	    {

            	    					newCompositeNode(grammarAccess.getRoomAliasAccess().getAliasesTextParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_8);
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
    // InternalRinform.g:305:1: entryRuleRoomDescription returns [EObject current=null] : iv_ruleRoomDescription= ruleRoomDescription EOF ;
    public final EObject entryRuleRoomDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoomDescription = null;


        try {
            // InternalRinform.g:305:56: (iv_ruleRoomDescription= ruleRoomDescription EOF )
            // InternalRinform.g:306:2: iv_ruleRoomDescription= ruleRoomDescription EOF
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
    // InternalRinform.g:312:1: ruleRoomDescription returns [EObject current=null] : (otherlv_0= '{' ( (lv_roomDescription_1_0= ruleText ) )+ otherlv_2= '!r' otherlv_3= '[' ( ( ruleText ) ) otherlv_5= ']' otherlv_6= '}' ) ;
    public final EObject ruleRoomDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_roomDescription_1_0 = null;



        	enterRule();

        try {
            // InternalRinform.g:318:2: ( (otherlv_0= '{' ( (lv_roomDescription_1_0= ruleText ) )+ otherlv_2= '!r' otherlv_3= '[' ( ( ruleText ) ) otherlv_5= ']' otherlv_6= '}' ) )
            // InternalRinform.g:319:2: (otherlv_0= '{' ( (lv_roomDescription_1_0= ruleText ) )+ otherlv_2= '!r' otherlv_3= '[' ( ( ruleText ) ) otherlv_5= ']' otherlv_6= '}' )
            {
            // InternalRinform.g:319:2: (otherlv_0= '{' ( (lv_roomDescription_1_0= ruleText ) )+ otherlv_2= '!r' otherlv_3= '[' ( ( ruleText ) ) otherlv_5= ']' otherlv_6= '}' )
            // InternalRinform.g:320:3: otherlv_0= '{' ( (lv_roomDescription_1_0= ruleText ) )+ otherlv_2= '!r' otherlv_3= '[' ( ( ruleText ) ) otherlv_5= ']' otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRoomDescriptionAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalRinform.g:324:3: ( (lv_roomDescription_1_0= ruleText ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=RULE_ID && LA4_0<=RULE_WS)||(LA4_0>=30 && LA4_0<=40)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalRinform.g:325:4: (lv_roomDescription_1_0= ruleText )
            	    {
            	    // InternalRinform.g:325:4: (lv_roomDescription_1_0= ruleText )
            	    // InternalRinform.g:326:5: lv_roomDescription_1_0= ruleText
            	    {

            	    					newCompositeNode(grammarAccess.getRoomDescriptionAccess().getRoomDescriptionTextParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_9);
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

            otherlv_2=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getRoomDescriptionAccess().getRKeyword_2());
            		
            otherlv_3=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getRoomDescriptionAccess().getLeftSquareBracketKeyword_3());
            		
            // InternalRinform.g:351:3: ( ( ruleText ) )
            // InternalRinform.g:352:4: ( ruleText )
            {
            // InternalRinform.g:352:4: ( ruleText )
            // InternalRinform.g:353:5: ruleText
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRoomDescriptionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRoomDescriptionAccess().getRoomRoomDeclarationCrossReference_4_0());
            				
            pushFollow(FOLLOW_11);
            ruleText();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getRoomDescriptionAccess().getRightSquareBracketKeyword_5());
            		
            otherlv_6=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getRoomDescriptionAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalRinform.g:379:1: entryRuleContainerDeclaration returns [EObject current=null] : iv_ruleContainerDeclaration= ruleContainerDeclaration EOF ;
    public final EObject entryRuleContainerDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainerDeclaration = null;


        try {
            // InternalRinform.g:379:61: (iv_ruleContainerDeclaration= ruleContainerDeclaration EOF )
            // InternalRinform.g:380:2: iv_ruleContainerDeclaration= ruleContainerDeclaration EOF
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
    // InternalRinform.g:386:1: ruleContainerDeclaration returns [EObject current=null] : (otherlv_0= 'c-' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-c' otherlv_3= '!r' otherlv_4= '[' ( ( ruleText ) ) otherlv_6= ']' ) ;
    public final EObject ruleContainerDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalRinform.g:392:2: ( (otherlv_0= 'c-' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-c' otherlv_3= '!r' otherlv_4= '[' ( ( ruleText ) ) otherlv_6= ']' ) )
            // InternalRinform.g:393:2: (otherlv_0= 'c-' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-c' otherlv_3= '!r' otherlv_4= '[' ( ( ruleText ) ) otherlv_6= ']' )
            {
            // InternalRinform.g:393:2: (otherlv_0= 'c-' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-c' otherlv_3= '!r' otherlv_4= '[' ( ( ruleText ) ) otherlv_6= ']' )
            // InternalRinform.g:394:3: otherlv_0= 'c-' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-c' otherlv_3= '!r' otherlv_4= '[' ( ( ruleText ) ) otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getContainerDeclarationAccess().getCKeyword_0());
            		
            // InternalRinform.g:398:3: ( (lv_name_1_0= ruleText ) )
            // InternalRinform.g:399:4: (lv_name_1_0= ruleText )
            {
            // InternalRinform.g:399:4: (lv_name_1_0= ruleText )
            // InternalRinform.g:400:5: lv_name_1_0= ruleText
            {

            					newCompositeNode(grammarAccess.getContainerDeclarationAccess().getNameTextParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
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

            otherlv_2=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getContainerDeclarationAccess().getCKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getContainerDeclarationAccess().getRKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getContainerDeclarationAccess().getLeftSquareBracketKeyword_4());
            		
            // InternalRinform.g:429:3: ( ( ruleText ) )
            // InternalRinform.g:430:4: ( ruleText )
            {
            // InternalRinform.g:430:4: ( ruleText )
            // InternalRinform.g:431:5: ruleText
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContainerDeclarationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getContainerDeclarationAccess().getRoomRoomDeclarationCrossReference_5_0());
            				
            pushFollow(FOLLOW_11);
            ruleText();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getContainerDeclarationAccess().getRightSquareBracketKeyword_6());
            		

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
    // InternalRinform.g:453:1: entryRuleItemInRoomDeclaration returns [EObject current=null] : iv_ruleItemInRoomDeclaration= ruleItemInRoomDeclaration EOF ;
    public final EObject entryRuleItemInRoomDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItemInRoomDeclaration = null;


        try {
            // InternalRinform.g:453:62: (iv_ruleItemInRoomDeclaration= ruleItemInRoomDeclaration EOF )
            // InternalRinform.g:454:2: iv_ruleItemInRoomDeclaration= ruleItemInRoomDeclaration EOF
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
    // InternalRinform.g:460:1: ruleItemInRoomDeclaration returns [EObject current=null] : (otherlv_0= 'i-' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-i' otherlv_3= '!r' otherlv_4= '[' ( ( ruleText ) ) otherlv_6= ']' ) ;
    public final EObject ruleItemInRoomDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalRinform.g:466:2: ( (otherlv_0= 'i-' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-i' otherlv_3= '!r' otherlv_4= '[' ( ( ruleText ) ) otherlv_6= ']' ) )
            // InternalRinform.g:467:2: (otherlv_0= 'i-' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-i' otherlv_3= '!r' otherlv_4= '[' ( ( ruleText ) ) otherlv_6= ']' )
            {
            // InternalRinform.g:467:2: (otherlv_0= 'i-' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-i' otherlv_3= '!r' otherlv_4= '[' ( ( ruleText ) ) otherlv_6= ']' )
            // InternalRinform.g:468:3: otherlv_0= 'i-' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-i' otherlv_3= '!r' otherlv_4= '[' ( ( ruleText ) ) otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getItemInRoomDeclarationAccess().getIKeyword_0());
            		
            // InternalRinform.g:472:3: ( (lv_name_1_0= ruleText ) )
            // InternalRinform.g:473:4: (lv_name_1_0= ruleText )
            {
            // InternalRinform.g:473:4: (lv_name_1_0= ruleText )
            // InternalRinform.g:474:5: lv_name_1_0= ruleText
            {

            					newCompositeNode(grammarAccess.getItemInRoomDeclarationAccess().getNameTextParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_15);
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

            otherlv_2=(Token)match(input,22,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getItemInRoomDeclarationAccess().getIKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getItemInRoomDeclarationAccess().getRKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getItemInRoomDeclarationAccess().getLeftSquareBracketKeyword_4());
            		
            // InternalRinform.g:503:3: ( ( ruleText ) )
            // InternalRinform.g:504:4: ( ruleText )
            {
            // InternalRinform.g:504:4: ( ruleText )
            // InternalRinform.g:505:5: ruleText
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getItemInRoomDeclarationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getItemInRoomDeclarationAccess().getRoomRoomDeclarationCrossReference_5_0());
            				
            pushFollow(FOLLOW_11);
            ruleText();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getItemInRoomDeclarationAccess().getRightSquareBracketKeyword_6());
            		

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
    // InternalRinform.g:527:1: entryRuleItemInContainerDeclaration returns [EObject current=null] : iv_ruleItemInContainerDeclaration= ruleItemInContainerDeclaration EOF ;
    public final EObject entryRuleItemInContainerDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItemInContainerDeclaration = null;


        try {
            // InternalRinform.g:527:67: (iv_ruleItemInContainerDeclaration= ruleItemInContainerDeclaration EOF )
            // InternalRinform.g:528:2: iv_ruleItemInContainerDeclaration= ruleItemInContainerDeclaration EOF
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
    // InternalRinform.g:534:1: ruleItemInContainerDeclaration returns [EObject current=null] : (otherlv_0= 'i-' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-i' otherlv_3= '!c' otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) otherlv_6= ']' ) ;
    public final EObject ruleItemInContainerDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalRinform.g:540:2: ( (otherlv_0= 'i-' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-i' otherlv_3= '!c' otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) otherlv_6= ']' ) )
            // InternalRinform.g:541:2: (otherlv_0= 'i-' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-i' otherlv_3= '!c' otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) otherlv_6= ']' )
            {
            // InternalRinform.g:541:2: (otherlv_0= 'i-' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-i' otherlv_3= '!c' otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) otherlv_6= ']' )
            // InternalRinform.g:542:3: otherlv_0= 'i-' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-i' otherlv_3= '!c' otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getItemInContainerDeclarationAccess().getIKeyword_0());
            		
            // InternalRinform.g:546:3: ( (lv_name_1_0= ruleText ) )
            // InternalRinform.g:547:4: (lv_name_1_0= ruleText )
            {
            // InternalRinform.g:547:4: (lv_name_1_0= ruleText )
            // InternalRinform.g:548:5: lv_name_1_0= ruleText
            {

            					newCompositeNode(grammarAccess.getItemInContainerDeclarationAccess().getNameTextParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_15);
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

            otherlv_2=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getItemInContainerDeclarationAccess().getIKeyword_2());
            		
            otherlv_3=(Token)match(input,23,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getItemInContainerDeclarationAccess().getCKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getItemInContainerDeclarationAccess().getLeftSquareBracketKeyword_4());
            		
            // InternalRinform.g:577:3: ( (otherlv_5= RULE_ID ) )
            // InternalRinform.g:578:4: (otherlv_5= RULE_ID )
            {
            // InternalRinform.g:578:4: (otherlv_5= RULE_ID )
            // InternalRinform.g:579:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getItemInContainerDeclarationRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_5, grammarAccess.getItemInContainerDeclarationAccess().getContainerContainerDeclarationCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getItemInContainerDeclarationAccess().getRightSquareBracketKeyword_6());
            		

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
    // InternalRinform.g:598:1: entryRuleItemDeclaration returns [EObject current=null] : iv_ruleItemDeclaration= ruleItemDeclaration EOF ;
    public final EObject entryRuleItemDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItemDeclaration = null;


        try {
            // InternalRinform.g:598:56: (iv_ruleItemDeclaration= ruleItemDeclaration EOF )
            // InternalRinform.g:599:2: iv_ruleItemDeclaration= ruleItemDeclaration EOF
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
    // InternalRinform.g:605:1: ruleItemDeclaration returns [EObject current=null] : (this_ItemInRoomDeclaration_0= ruleItemInRoomDeclaration | this_ContainerDeclaration_1= ruleContainerDeclaration | this_ItemInContainerDeclaration_2= ruleItemInContainerDeclaration ) ;
    public final EObject ruleItemDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_ItemInRoomDeclaration_0 = null;

        EObject this_ContainerDeclaration_1 = null;

        EObject this_ItemInContainerDeclaration_2 = null;



        	enterRule();

        try {
            // InternalRinform.g:611:2: ( (this_ItemInRoomDeclaration_0= ruleItemInRoomDeclaration | this_ContainerDeclaration_1= ruleContainerDeclaration | this_ItemInContainerDeclaration_2= ruleItemInContainerDeclaration ) )
            // InternalRinform.g:612:2: (this_ItemInRoomDeclaration_0= ruleItemInRoomDeclaration | this_ContainerDeclaration_1= ruleContainerDeclaration | this_ItemInContainerDeclaration_2= ruleItemInContainerDeclaration )
            {
            // InternalRinform.g:612:2: (this_ItemInRoomDeclaration_0= ruleItemInRoomDeclaration | this_ContainerDeclaration_1= ruleContainerDeclaration | this_ItemInContainerDeclaration_2= ruleItemInContainerDeclaration )
            int alt5=3;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalRinform.g:613:3: this_ItemInRoomDeclaration_0= ruleItemInRoomDeclaration
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
                    // InternalRinform.g:622:3: this_ContainerDeclaration_1= ruleContainerDeclaration
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
                    // InternalRinform.g:631:3: this_ItemInContainerDeclaration_2= ruleItemInContainerDeclaration
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
    // InternalRinform.g:643:1: entryRuleItemDescription returns [EObject current=null] : iv_ruleItemDescription= ruleItemDescription EOF ;
    public final EObject entryRuleItemDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItemDescription = null;


        try {
            // InternalRinform.g:643:56: (iv_ruleItemDescription= ruleItemDescription EOF )
            // InternalRinform.g:644:2: iv_ruleItemDescription= ruleItemDescription EOF
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
    // InternalRinform.g:650:1: ruleItemDescription returns [EObject current=null] : (otherlv_0= '{' ( (lv_itemDescription_1_0= ruleText ) )+ otherlv_2= '!i' otherlv_3= '[' ( ( ruleText ) ) otherlv_5= ']' otherlv_6= '}' ) ;
    public final EObject ruleItemDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_itemDescription_1_0 = null;



        	enterRule();

        try {
            // InternalRinform.g:656:2: ( (otherlv_0= '{' ( (lv_itemDescription_1_0= ruleText ) )+ otherlv_2= '!i' otherlv_3= '[' ( ( ruleText ) ) otherlv_5= ']' otherlv_6= '}' ) )
            // InternalRinform.g:657:2: (otherlv_0= '{' ( (lv_itemDescription_1_0= ruleText ) )+ otherlv_2= '!i' otherlv_3= '[' ( ( ruleText ) ) otherlv_5= ']' otherlv_6= '}' )
            {
            // InternalRinform.g:657:2: (otherlv_0= '{' ( (lv_itemDescription_1_0= ruleText ) )+ otherlv_2= '!i' otherlv_3= '[' ( ( ruleText ) ) otherlv_5= ']' otherlv_6= '}' )
            // InternalRinform.g:658:3: otherlv_0= '{' ( (lv_itemDescription_1_0= ruleText ) )+ otherlv_2= '!i' otherlv_3= '[' ( ( ruleText ) ) otherlv_5= ']' otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getItemDescriptionAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalRinform.g:662:3: ( (lv_itemDescription_1_0= ruleText ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=RULE_ID && LA6_0<=RULE_WS)||(LA6_0>=30 && LA6_0<=40)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalRinform.g:663:4: (lv_itemDescription_1_0= ruleText )
            	    {
            	    // InternalRinform.g:663:4: (lv_itemDescription_1_0= ruleText )
            	    // InternalRinform.g:664:5: lv_itemDescription_1_0= ruleText
            	    {

            	    					newCompositeNode(grammarAccess.getItemDescriptionAccess().getItemDescriptionTextParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_17);
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

            otherlv_2=(Token)match(input,24,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getItemDescriptionAccess().getIKeyword_2());
            		
            otherlv_3=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getItemDescriptionAccess().getLeftSquareBracketKeyword_3());
            		
            // InternalRinform.g:689:3: ( ( ruleText ) )
            // InternalRinform.g:690:4: ( ruleText )
            {
            // InternalRinform.g:690:4: ( ruleText )
            // InternalRinform.g:691:5: ruleText
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getItemDescriptionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getItemDescriptionAccess().getItemItemDeclarationCrossReference_4_0());
            				
            pushFollow(FOLLOW_11);
            ruleText();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getItemDescriptionAccess().getRightSquareBracketKeyword_5());
            		
            otherlv_6=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getItemDescriptionAccess().getRightCurlyBracketKeyword_6());
            		

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


    // $ANTLR start "entryRuleCharacterDeclaration"
    // InternalRinform.g:717:1: entryRuleCharacterDeclaration returns [EObject current=null] : iv_ruleCharacterDeclaration= ruleCharacterDeclaration EOF ;
    public final EObject entryRuleCharacterDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharacterDeclaration = null;


        try {
            // InternalRinform.g:717:61: (iv_ruleCharacterDeclaration= ruleCharacterDeclaration EOF )
            // InternalRinform.g:718:2: iv_ruleCharacterDeclaration= ruleCharacterDeclaration EOF
            {
             newCompositeNode(grammarAccess.getCharacterDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCharacterDeclaration=ruleCharacterDeclaration();

            state._fsp--;

             current =iv_ruleCharacterDeclaration; 
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
    // $ANTLR end "entryRuleCharacterDeclaration"


    // $ANTLR start "ruleCharacterDeclaration"
    // InternalRinform.g:724:1: ruleCharacterDeclaration returns [EObject current=null] : (otherlv_0= 'p-' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-p' otherlv_3= '!r' otherlv_4= '[' ( ( ruleText ) ) otherlv_6= ']' ) ;
    public final EObject ruleCharacterDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalRinform.g:730:2: ( (otherlv_0= 'p-' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-p' otherlv_3= '!r' otherlv_4= '[' ( ( ruleText ) ) otherlv_6= ']' ) )
            // InternalRinform.g:731:2: (otherlv_0= 'p-' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-p' otherlv_3= '!r' otherlv_4= '[' ( ( ruleText ) ) otherlv_6= ']' )
            {
            // InternalRinform.g:731:2: (otherlv_0= 'p-' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-p' otherlv_3= '!r' otherlv_4= '[' ( ( ruleText ) ) otherlv_6= ']' )
            // InternalRinform.g:732:3: otherlv_0= 'p-' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-p' otherlv_3= '!r' otherlv_4= '[' ( ( ruleText ) ) otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCharacterDeclarationAccess().getPKeyword_0());
            		
            // InternalRinform.g:736:3: ( (lv_name_1_0= ruleText ) )
            // InternalRinform.g:737:4: (lv_name_1_0= ruleText )
            {
            // InternalRinform.g:737:4: (lv_name_1_0= ruleText )
            // InternalRinform.g:738:5: lv_name_1_0= ruleText
            {

            					newCompositeNode(grammarAccess.getCharacterDeclarationAccess().getNameTextParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_18);
            lv_name_1_0=ruleText();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCharacterDeclarationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"uk.ac.kcl.mde.Rinform.Text");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getCharacterDeclarationAccess().getPKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getCharacterDeclarationAccess().getRKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getCharacterDeclarationAccess().getLeftSquareBracketKeyword_4());
            		
            // InternalRinform.g:767:3: ( ( ruleText ) )
            // InternalRinform.g:768:4: ( ruleText )
            {
            // InternalRinform.g:768:4: ( ruleText )
            // InternalRinform.g:769:5: ruleText
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCharacterDeclarationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCharacterDeclarationAccess().getRoomRoomDeclarationCrossReference_5_0());
            				
            pushFollow(FOLLOW_11);
            ruleText();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getCharacterDeclarationAccess().getRightSquareBracketKeyword_6());
            		

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
    // $ANTLR end "ruleCharacterDeclaration"


    // $ANTLR start "entryRuleCharacterDescription"
    // InternalRinform.g:791:1: entryRuleCharacterDescription returns [EObject current=null] : iv_ruleCharacterDescription= ruleCharacterDescription EOF ;
    public final EObject entryRuleCharacterDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharacterDescription = null;


        try {
            // InternalRinform.g:791:61: (iv_ruleCharacterDescription= ruleCharacterDescription EOF )
            // InternalRinform.g:792:2: iv_ruleCharacterDescription= ruleCharacterDescription EOF
            {
             newCompositeNode(grammarAccess.getCharacterDescriptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCharacterDescription=ruleCharacterDescription();

            state._fsp--;

             current =iv_ruleCharacterDescription; 
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
    // $ANTLR end "entryRuleCharacterDescription"


    // $ANTLR start "ruleCharacterDescription"
    // InternalRinform.g:798:1: ruleCharacterDescription returns [EObject current=null] : (otherlv_0= '{' ( (lv_personDescription_1_0= ruleText ) )+ otherlv_2= '!p' otherlv_3= '[' ( ( ruleText ) ) otherlv_5= ']' otherlv_6= '}' ) ;
    public final EObject ruleCharacterDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_personDescription_1_0 = null;



        	enterRule();

        try {
            // InternalRinform.g:804:2: ( (otherlv_0= '{' ( (lv_personDescription_1_0= ruleText ) )+ otherlv_2= '!p' otherlv_3= '[' ( ( ruleText ) ) otherlv_5= ']' otherlv_6= '}' ) )
            // InternalRinform.g:805:2: (otherlv_0= '{' ( (lv_personDescription_1_0= ruleText ) )+ otherlv_2= '!p' otherlv_3= '[' ( ( ruleText ) ) otherlv_5= ']' otherlv_6= '}' )
            {
            // InternalRinform.g:805:2: (otherlv_0= '{' ( (lv_personDescription_1_0= ruleText ) )+ otherlv_2= '!p' otherlv_3= '[' ( ( ruleText ) ) otherlv_5= ']' otherlv_6= '}' )
            // InternalRinform.g:806:3: otherlv_0= '{' ( (lv_personDescription_1_0= ruleText ) )+ otherlv_2= '!p' otherlv_3= '[' ( ( ruleText ) ) otherlv_5= ']' otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCharacterDescriptionAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalRinform.g:810:3: ( (lv_personDescription_1_0= ruleText ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=RULE_ID && LA7_0<=RULE_WS)||(LA7_0>=30 && LA7_0<=40)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalRinform.g:811:4: (lv_personDescription_1_0= ruleText )
            	    {
            	    // InternalRinform.g:811:4: (lv_personDescription_1_0= ruleText )
            	    // InternalRinform.g:812:5: lv_personDescription_1_0= ruleText
            	    {

            	    					newCompositeNode(grammarAccess.getCharacterDescriptionAccess().getPersonDescriptionTextParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_19);
            	    lv_personDescription_1_0=ruleText();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCharacterDescriptionRule());
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

            otherlv_2=(Token)match(input,27,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getCharacterDescriptionAccess().getPKeyword_2());
            		
            otherlv_3=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getCharacterDescriptionAccess().getLeftSquareBracketKeyword_3());
            		
            // InternalRinform.g:837:3: ( ( ruleText ) )
            // InternalRinform.g:838:4: ( ruleText )
            {
            // InternalRinform.g:838:4: ( ruleText )
            // InternalRinform.g:839:5: ruleText
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCharacterDescriptionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCharacterDescriptionAccess().getPersonCharacterDeclarationCrossReference_4_0());
            				
            pushFollow(FOLLOW_11);
            ruleText();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getCharacterDescriptionAccess().getRightSquareBracketKeyword_5());
            		
            otherlv_6=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getCharacterDescriptionAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleCharacterDescription"


    // $ANTLR start "entryRuleDirectionStatement"
    // InternalRinform.g:865:1: entryRuleDirectionStatement returns [EObject current=null] : iv_ruleDirectionStatement= ruleDirectionStatement EOF ;
    public final EObject entryRuleDirectionStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirectionStatement = null;


        try {
            // InternalRinform.g:865:59: (iv_ruleDirectionStatement= ruleDirectionStatement EOF )
            // InternalRinform.g:866:2: iv_ruleDirectionStatement= ruleDirectionStatement EOF
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
    // InternalRinform.g:872:1: ruleDirectionStatement returns [EObject current=null] : (otherlv_0= '<' ( ( ruleText ) ) ( (lv_direction_2_0= ruleDirection ) ) ( ( ruleText ) ) otherlv_4= '>' ) ;
    public final EObject ruleDirectionStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        Enumerator lv_direction_2_0 = null;



        	enterRule();

        try {
            // InternalRinform.g:878:2: ( (otherlv_0= '<' ( ( ruleText ) ) ( (lv_direction_2_0= ruleDirection ) ) ( ( ruleText ) ) otherlv_4= '>' ) )
            // InternalRinform.g:879:2: (otherlv_0= '<' ( ( ruleText ) ) ( (lv_direction_2_0= ruleDirection ) ) ( ( ruleText ) ) otherlv_4= '>' )
            {
            // InternalRinform.g:879:2: (otherlv_0= '<' ( ( ruleText ) ) ( (lv_direction_2_0= ruleDirection ) ) ( ( ruleText ) ) otherlv_4= '>' )
            // InternalRinform.g:880:3: otherlv_0= '<' ( ( ruleText ) ) ( (lv_direction_2_0= ruleDirection ) ) ( ( ruleText ) ) otherlv_4= '>'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDirectionStatementAccess().getLessThanSignKeyword_0());
            		
            // InternalRinform.g:884:3: ( ( ruleText ) )
            // InternalRinform.g:885:4: ( ruleText )
            {
            // InternalRinform.g:885:4: ( ruleText )
            // InternalRinform.g:886:5: ruleText
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDirectionStatementRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDirectionStatementAccess().getRoom1RoomDeclarationCrossReference_1_0());
            				
            pushFollow(FOLLOW_20);
            ruleText();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRinform.g:900:3: ( (lv_direction_2_0= ruleDirection ) )
            // InternalRinform.g:901:4: (lv_direction_2_0= ruleDirection )
            {
            // InternalRinform.g:901:4: (lv_direction_2_0= ruleDirection )
            // InternalRinform.g:902:5: lv_direction_2_0= ruleDirection
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

            // InternalRinform.g:919:3: ( ( ruleText ) )
            // InternalRinform.g:920:4: ( ruleText )
            {
            // InternalRinform.g:920:4: ( ruleText )
            // InternalRinform.g:921:5: ruleText
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDirectionStatementRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDirectionStatementAccess().getRoom2RoomDeclarationCrossReference_3_0());
            				
            pushFollow(FOLLOW_21);
            ruleText();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,29,FOLLOW_2); 

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
    // InternalRinform.g:943:1: entryRuleText returns [String current=null] : iv_ruleText= ruleText EOF ;
    public final String entryRuleText() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleText = null;


        try {
            // InternalRinform.g:943:44: (iv_ruleText= ruleText EOF )
            // InternalRinform.g:944:2: iv_ruleText= ruleText EOF
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
    // InternalRinform.g:950:1: ruleText returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_WS_1= RULE_WS | this_SYMBOL_2= ruleSYMBOL )+ ;
    public final AntlrDatatypeRuleToken ruleText() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_WS_1=null;
        AntlrDatatypeRuleToken this_SYMBOL_2 = null;



        	enterRule();

        try {
            // InternalRinform.g:956:2: ( (this_ID_0= RULE_ID | this_WS_1= RULE_WS | this_SYMBOL_2= ruleSYMBOL )+ )
            // InternalRinform.g:957:2: (this_ID_0= RULE_ID | this_WS_1= RULE_WS | this_SYMBOL_2= ruleSYMBOL )+
            {
            // InternalRinform.g:957:2: (this_ID_0= RULE_ID | this_WS_1= RULE_WS | this_SYMBOL_2= ruleSYMBOL )+
            int cnt8=0;
            loop8:
            do {
                int alt8=4;
                alt8 = dfa8.predict(input);
                switch (alt8) {
            	case 1 :
            	    // InternalRinform.g:958:3: this_ID_0= RULE_ID
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            	    			current.merge(this_ID_0);
            	    		

            	    			newLeafNode(this_ID_0, grammarAccess.getTextAccess().getIDTerminalRuleCall_0());
            	    		

            	    }
            	    break;
            	case 2 :
            	    // InternalRinform.g:966:3: this_WS_1= RULE_WS
            	    {
            	    this_WS_1=(Token)match(input,RULE_WS,FOLLOW_8); 

            	    			current.merge(this_WS_1);
            	    		

            	    			newLeafNode(this_WS_1, grammarAccess.getTextAccess().getWSTerminalRuleCall_1());
            	    		

            	    }
            	    break;
            	case 3 :
            	    // InternalRinform.g:974:3: this_SYMBOL_2= ruleSYMBOL
            	    {

            	    			newCompositeNode(grammarAccess.getTextAccess().getSYMBOLParserRuleCall_2());
            	    		
            	    pushFollow(FOLLOW_8);
            	    this_SYMBOL_2=ruleSYMBOL();

            	    state._fsp--;


            	    			current.merge(this_SYMBOL_2);
            	    		

            	    			afterParserOrEnumRuleCall();
            	    		

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
    // $ANTLR end "ruleText"


    // $ANTLR start "entryRuleWords"
    // InternalRinform.g:988:1: entryRuleWords returns [EObject current=null] : iv_ruleWords= ruleWords EOF ;
    public final EObject entryRuleWords() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWords = null;


        try {
            // InternalRinform.g:988:46: (iv_ruleWords= ruleWords EOF )
            // InternalRinform.g:989:2: iv_ruleWords= ruleWords EOF
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
    // InternalRinform.g:995:1: ruleWords returns [EObject current=null] : ( (lv_words_0_0= ruleText ) )+ ;
    public final EObject ruleWords() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_words_0_0 = null;



        	enterRule();

        try {
            // InternalRinform.g:1001:2: ( ( (lv_words_0_0= ruleText ) )+ )
            // InternalRinform.g:1002:2: ( (lv_words_0_0= ruleText ) )+
            {
            // InternalRinform.g:1002:2: ( (lv_words_0_0= ruleText ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                alt9 = dfa9.predict(input);
                switch (alt9) {
            	case 1 :
            	    // InternalRinform.g:1003:3: (lv_words_0_0= ruleText )
            	    {
            	    // InternalRinform.g:1003:3: (lv_words_0_0= ruleText )
            	    // InternalRinform.g:1004:4: lv_words_0_0= ruleText
            	    {

            	    				newCompositeNode(grammarAccess.getWordsAccess().getWordsTextParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_8);
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


    // $ANTLR start "entryRuleSYMBOL"
    // InternalRinform.g:1024:1: entryRuleSYMBOL returns [String current=null] : iv_ruleSYMBOL= ruleSYMBOL EOF ;
    public final String entryRuleSYMBOL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSYMBOL = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalRinform.g:1026:2: (iv_ruleSYMBOL= ruleSYMBOL EOF )
            // InternalRinform.g:1027:2: iv_ruleSYMBOL= ruleSYMBOL EOF
            {
             newCompositeNode(grammarAccess.getSYMBOLRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSYMBOL=ruleSYMBOL();

            state._fsp--;

             current =iv_ruleSYMBOL.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleSYMBOL"


    // $ANTLR start "ruleSYMBOL"
    // InternalRinform.g:1036:1: ruleSYMBOL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '.' | kw= ',' | kw= ';' | kw= ':' | kw= '-' | kw= '!' | kw= '?' | kw= '\\'' | kw= '(' | kw= ')' | kw= '\"' ) ;
    public final AntlrDatatypeRuleToken ruleSYMBOL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalRinform.g:1043:2: ( (kw= '.' | kw= ',' | kw= ';' | kw= ':' | kw= '-' | kw= '!' | kw= '?' | kw= '\\'' | kw= '(' | kw= ')' | kw= '\"' ) )
            // InternalRinform.g:1044:2: (kw= '.' | kw= ',' | kw= ';' | kw= ':' | kw= '-' | kw= '!' | kw= '?' | kw= '\\'' | kw= '(' | kw= ')' | kw= '\"' )
            {
            // InternalRinform.g:1044:2: (kw= '.' | kw= ',' | kw= ';' | kw= ':' | kw= '-' | kw= '!' | kw= '?' | kw= '\\'' | kw= '(' | kw= ')' | kw= '\"' )
            int alt10=11;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt10=1;
                }
                break;
            case 31:
                {
                alt10=2;
                }
                break;
            case 32:
                {
                alt10=3;
                }
                break;
            case 33:
                {
                alt10=4;
                }
                break;
            case 34:
                {
                alt10=5;
                }
                break;
            case 35:
                {
                alt10=6;
                }
                break;
            case 36:
                {
                alt10=7;
                }
                break;
            case 37:
                {
                alt10=8;
                }
                break;
            case 38:
                {
                alt10=9;
                }
                break;
            case 39:
                {
                alt10=10;
                }
                break;
            case 40:
                {
                alt10=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalRinform.g:1045:3: kw= '.'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSYMBOLAccess().getFullStopKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRinform.g:1051:3: kw= ','
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSYMBOLAccess().getCommaKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalRinform.g:1057:3: kw= ';'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSYMBOLAccess().getSemicolonKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalRinform.g:1063:3: kw= ':'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSYMBOLAccess().getColonKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalRinform.g:1069:3: kw= '-'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSYMBOLAccess().getHyphenMinusKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalRinform.g:1075:3: kw= '!'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSYMBOLAccess().getExclamationMarkKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalRinform.g:1081:3: kw= '?'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSYMBOLAccess().getQuestionMarkKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalRinform.g:1087:3: kw= '\\''
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSYMBOLAccess().getApostropheKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalRinform.g:1093:3: kw= '('
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSYMBOLAccess().getLeftParenthesisKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalRinform.g:1099:3: kw= ')'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSYMBOLAccess().getRightParenthesisKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalRinform.g:1105:3: kw= '\"'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSYMBOLAccess().getQuotationMarkKeyword_10());
                    		

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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleSYMBOL"


    // $ANTLR start "ruleDirection"
    // InternalRinform.g:1117:1: ruleDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'South' ) | (enumLiteral_1= 'North' ) | (enumLiteral_2= 'East' ) | (enumLiteral_3= 'West' ) | (enumLiteral_4= 'Below' ) | (enumLiteral_5= 'Above' ) ) ;
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
            // InternalRinform.g:1123:2: ( ( (enumLiteral_0= 'South' ) | (enumLiteral_1= 'North' ) | (enumLiteral_2= 'East' ) | (enumLiteral_3= 'West' ) | (enumLiteral_4= 'Below' ) | (enumLiteral_5= 'Above' ) ) )
            // InternalRinform.g:1124:2: ( (enumLiteral_0= 'South' ) | (enumLiteral_1= 'North' ) | (enumLiteral_2= 'East' ) | (enumLiteral_3= 'West' ) | (enumLiteral_4= 'Below' ) | (enumLiteral_5= 'Above' ) )
            {
            // InternalRinform.g:1124:2: ( (enumLiteral_0= 'South' ) | (enumLiteral_1= 'North' ) | (enumLiteral_2= 'East' ) | (enumLiteral_3= 'West' ) | (enumLiteral_4= 'Below' ) | (enumLiteral_5= 'Above' ) )
            int alt11=6;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt11=1;
                }
                break;
            case 42:
                {
                alt11=2;
                }
                break;
            case 43:
                {
                alt11=3;
                }
                break;
            case 44:
                {
                alt11=4;
                }
                break;
            case 45:
                {
                alt11=5;
                }
                break;
            case 46:
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
                    // InternalRinform.g:1125:3: (enumLiteral_0= 'South' )
                    {
                    // InternalRinform.g:1125:3: (enumLiteral_0= 'South' )
                    // InternalRinform.g:1126:4: enumLiteral_0= 'South'
                    {
                    enumLiteral_0=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getDirectionAccess().getSouthEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDirectionAccess().getSouthEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRinform.g:1133:3: (enumLiteral_1= 'North' )
                    {
                    // InternalRinform.g:1133:3: (enumLiteral_1= 'North' )
                    // InternalRinform.g:1134:4: enumLiteral_1= 'North'
                    {
                    enumLiteral_1=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getDirectionAccess().getNorthEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDirectionAccess().getNorthEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRinform.g:1141:3: (enumLiteral_2= 'East' )
                    {
                    // InternalRinform.g:1141:3: (enumLiteral_2= 'East' )
                    // InternalRinform.g:1142:4: enumLiteral_2= 'East'
                    {
                    enumLiteral_2=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getDirectionAccess().getEastEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDirectionAccess().getEastEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRinform.g:1149:3: (enumLiteral_3= 'West' )
                    {
                    // InternalRinform.g:1149:3: (enumLiteral_3= 'West' )
                    // InternalRinform.g:1150:4: enumLiteral_3= 'West'
                    {
                    enumLiteral_3=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getDirectionAccess().getWestEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDirectionAccess().getWestEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRinform.g:1157:3: (enumLiteral_4= 'Below' )
                    {
                    // InternalRinform.g:1157:3: (enumLiteral_4= 'Below' )
                    // InternalRinform.g:1158:4: enumLiteral_4= 'Below'
                    {
                    enumLiteral_4=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getDirectionAccess().getBelowEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getDirectionAccess().getBelowEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalRinform.g:1165:3: (enumLiteral_5= 'Above' )
                    {
                    // InternalRinform.g:1165:3: (enumLiteral_5= 'Above' )
                    // InternalRinform.g:1166:4: enumLiteral_5= 'Above'
                    {
                    enumLiteral_5=(Token)match(input,46,FOLLOW_2); 

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
    protected DFA3 dfa3 = new DFA3(this);
    protected DFA5 dfa5 = new DFA5(this);
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA9 dfa9 = new DFA9(this);
    static final String dfa_1s = "\30\uffff";
    static final String dfa_2s = "\1\4\2\uffff\1\4\4\uffff\15\4\3\uffff";
    static final String dfa_3s = "\1\50\2\uffff\1\50\4\uffff\15\50\3\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\uffff\1\4\1\6\1\10\1\11\15\uffff\1\5\1\3\1\7";
    static final String dfa_5s = "\30\uffff}>";
    static final String[] dfa_6s = {
            "\2\6\5\uffff\1\1\1\2\1\uffff\1\3\4\uffff\1\4\1\uffff\1\4\3\uffff\1\5\2\uffff\1\7\1\uffff\13\6",
            "",
            "",
            "\1\10\1\11\30\uffff\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24",
            "",
            "",
            "",
            "",
            "\1\10\1\11\11\uffff\1\26\10\uffff\1\25\2\uffff\1\27\2\uffff\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24",
            "\1\10\1\11\11\uffff\1\26\10\uffff\1\25\2\uffff\1\27\2\uffff\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24",
            "\1\10\1\11\11\uffff\1\26\10\uffff\1\25\2\uffff\1\27\2\uffff\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24",
            "\1\10\1\11\11\uffff\1\26\10\uffff\1\25\2\uffff\1\27\2\uffff\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24",
            "\1\10\1\11\11\uffff\1\26\10\uffff\1\25\2\uffff\1\27\2\uffff\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24",
            "\1\10\1\11\11\uffff\1\26\10\uffff\1\25\2\uffff\1\27\2\uffff\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24",
            "\1\10\1\11\11\uffff\1\26\10\uffff\1\25\2\uffff\1\27\2\uffff\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24",
            "\1\10\1\11\11\uffff\1\26\10\uffff\1\25\2\uffff\1\27\2\uffff\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24",
            "\1\10\1\11\11\uffff\1\26\10\uffff\1\25\2\uffff\1\27\2\uffff\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24",
            "\1\10\1\11\11\uffff\1\26\10\uffff\1\25\2\uffff\1\27\2\uffff\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24",
            "\1\10\1\11\11\uffff\1\26\10\uffff\1\25\2\uffff\1\27\2\uffff\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24",
            "\1\10\1\11\11\uffff\1\26\10\uffff\1\25\2\uffff\1\27\2\uffff\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24",
            "\1\10\1\11\11\uffff\1\26\10\uffff\1\25\2\uffff\1\27\2\uffff\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24",
            "",
            "",
            ""
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
            return "115:2: (this_RoomDeclaration_0= ruleRoomDeclaration | this_RoomAlias_1= ruleRoomAlias | this_RoomDescription_2= ruleRoomDescription | this_ItemDeclaration_3= ruleItemDeclaration | this_ItemDescription_4= ruleItemDescription | this_CharacterDeclaration_5= ruleCharacterDeclaration | this_CharacterDescription_6= ruleCharacterDescription | this_Words_7= ruleWords | this_DirectionStatement_8= ruleDirectionStatement )";
        }
    }
    static final String dfa_7s = "\17\uffff";
    static final String dfa_8s = "\1\1\16\uffff";
    static final String dfa_9s = "\1\4\16\uffff";
    static final String dfa_10s = "\1\50\16\uffff";
    static final String dfa_11s = "\1\uffff\1\2\15\1";
    static final String dfa_12s = "\17\uffff}>";
    static final String[] dfa_13s = {
            "\1\2\1\3\5\uffff\2\1\1\uffff\1\1\4\uffff\1\1\1\uffff\1\1\3\uffff\1\1\2\uffff\1\1\1\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16",
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

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "()+ loopback of 282:3: ( (lv_aliases_3_0= ruleText ) )+";
        }
    }
    static final String dfa_14s = "\23\uffff";
    static final String dfa_15s = "\1\23\1\4\1\uffff\15\4\1\17\2\uffff";
    static final String dfa_16s = "\1\25\1\50\1\uffff\15\50\1\27\2\uffff";
    static final String dfa_17s = "\2\uffff\1\2\16\uffff\1\1\1\3";
    static final String dfa_18s = "\23\uffff}>";
    static final String[] dfa_19s = {
            "\1\2\1\uffff\1\1",
            "\1\3\1\4\30\uffff\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17",
            "",
            "\1\3\1\4\20\uffff\1\20\7\uffff\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17",
            "\1\3\1\4\20\uffff\1\20\7\uffff\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17",
            "\1\3\1\4\20\uffff\1\20\7\uffff\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17",
            "\1\3\1\4\20\uffff\1\20\7\uffff\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17",
            "\1\3\1\4\20\uffff\1\20\7\uffff\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17",
            "\1\3\1\4\20\uffff\1\20\7\uffff\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17",
            "\1\3\1\4\20\uffff\1\20\7\uffff\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17",
            "\1\3\1\4\20\uffff\1\20\7\uffff\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17",
            "\1\3\1\4\20\uffff\1\20\7\uffff\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17",
            "\1\3\1\4\20\uffff\1\20\7\uffff\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17",
            "\1\3\1\4\20\uffff\1\20\7\uffff\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17",
            "\1\3\1\4\20\uffff\1\20\7\uffff\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17",
            "\1\3\1\4\20\uffff\1\20\7\uffff\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17",
            "\1\21\7\uffff\1\22",
            "",
            ""
    };

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[][] dfa_19 = unpackEncodedStringArray(dfa_19s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_14;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "612:2: (this_ItemInRoomDeclaration_0= ruleItemInRoomDeclaration | this_ContainerDeclaration_1= ruleContainerDeclaration | this_ItemInContainerDeclaration_2= ruleItemInContainerDeclaration )";
        }
    }
    static final String dfa_20s = "\1\56\16\uffff";
    static final String dfa_21s = "\1\uffff\1\4\1\1\1\2\13\3";
    static final String[] dfa_22s = {
            "\1\2\1\3\5\uffff\2\1\1\uffff\2\1\1\uffff\1\1\1\uffff\4\1\1\uffff\6\1\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\6\1",
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
    static final char[] dfa_20 = DFA.unpackEncodedStringToUnsignedChars(dfa_20s);
    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final short[][] dfa_22 = unpackEncodedStringArray(dfa_22s);

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_20;
            this.accept = dfa_21;
            this.special = dfa_12;
            this.transition = dfa_22;
        }
        public String getDescription() {
            return "()+ loopback of 957:2: (this_ID_0= RULE_ID | this_WS_1= RULE_WS | this_SYMBOL_2= ruleSYMBOL )+";
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "()+ loopback of 1002:2: ( (lv_words_0_0= ruleText ) )+";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000001FFD2285832L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000001FFC0000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000001FFC0000032L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000001FFC0008030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000001FFC1000030L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000001FFC8000030L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00007E0000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});

}