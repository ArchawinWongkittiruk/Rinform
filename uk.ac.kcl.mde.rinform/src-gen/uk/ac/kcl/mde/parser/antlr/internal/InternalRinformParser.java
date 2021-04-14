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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_WS", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'r-'", "'-r'", "'{'", "'!r'", "'['", "']'", "'}'", "'='", "'c-'", "'-c'", "'i-'", "'-i'", "'!c'", "'!i'", "'p-'", "'-p'", "'!p'", "'<'", "'>'", "'.'", "','", "';'", "':'", "'-'", "'!'", "'?'", "'\\''", "'('", "')'", "'\"'", "'South'", "'North'", "'East'", "'West'", "'Below'", "'Above'"
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

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_WS)||LA1_0==11||(LA1_0>=13 && LA1_0<=14)||LA1_0==19||LA1_0==21||(LA1_0>=24 && LA1_0<=25)||(LA1_0>=27 && LA1_0<=28)||(LA1_0>=30 && LA1_0<=40)) ) {
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
    // InternalRinform.g:108:1: ruleSentencePart returns [EObject current=null] : (this_RoomDeclaration_0= ruleRoomDeclaration | this_ItemDeclaration_1= ruleItemDeclaration | this_CharacterDeclaration_2= ruleCharacterDeclaration | this_RoomDescription_3= ruleRoomDescription | this_ItemDescription_4= ruleItemDescription | this_CharacterDescription_5= ruleCharacterDescription | this_RoomAlias_6= ruleRoomAlias | this_ItemAlias_7= ruleItemAlias | this_CharacterAlias_8= ruleCharacterAlias | this_DirectionStatement_9= ruleDirectionStatement | this_Words_10= ruleWords ) ;
    public final EObject ruleSentencePart() throws RecognitionException {
        EObject current = null;

        EObject this_RoomDeclaration_0 = null;

        EObject this_ItemDeclaration_1 = null;

        EObject this_CharacterDeclaration_2 = null;

        EObject this_RoomDescription_3 = null;

        EObject this_ItemDescription_4 = null;

        EObject this_CharacterDescription_5 = null;

        EObject this_RoomAlias_6 = null;

        EObject this_ItemAlias_7 = null;

        EObject this_CharacterAlias_8 = null;

        EObject this_DirectionStatement_9 = null;

        EObject this_Words_10 = null;



        	enterRule();

        try {
            // InternalRinform.g:114:2: ( (this_RoomDeclaration_0= ruleRoomDeclaration | this_ItemDeclaration_1= ruleItemDeclaration | this_CharacterDeclaration_2= ruleCharacterDeclaration | this_RoomDescription_3= ruleRoomDescription | this_ItemDescription_4= ruleItemDescription | this_CharacterDescription_5= ruleCharacterDescription | this_RoomAlias_6= ruleRoomAlias | this_ItemAlias_7= ruleItemAlias | this_CharacterAlias_8= ruleCharacterAlias | this_DirectionStatement_9= ruleDirectionStatement | this_Words_10= ruleWords ) )
            // InternalRinform.g:115:2: (this_RoomDeclaration_0= ruleRoomDeclaration | this_ItemDeclaration_1= ruleItemDeclaration | this_CharacterDeclaration_2= ruleCharacterDeclaration | this_RoomDescription_3= ruleRoomDescription | this_ItemDescription_4= ruleItemDescription | this_CharacterDescription_5= ruleCharacterDescription | this_RoomAlias_6= ruleRoomAlias | this_ItemAlias_7= ruleItemAlias | this_CharacterAlias_8= ruleCharacterAlias | this_DirectionStatement_9= ruleDirectionStatement | this_Words_10= ruleWords )
            {
            // InternalRinform.g:115:2: (this_RoomDeclaration_0= ruleRoomDeclaration | this_ItemDeclaration_1= ruleItemDeclaration | this_CharacterDeclaration_2= ruleCharacterDeclaration | this_RoomDescription_3= ruleRoomDescription | this_ItemDescription_4= ruleItemDescription | this_CharacterDescription_5= ruleCharacterDescription | this_RoomAlias_6= ruleRoomAlias | this_ItemAlias_7= ruleItemAlias | this_CharacterAlias_8= ruleCharacterAlias | this_DirectionStatement_9= ruleDirectionStatement | this_Words_10= ruleWords )
            int alt2=11;
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
                    // InternalRinform.g:125:3: this_ItemDeclaration_1= ruleItemDeclaration
                    {

                    			newCompositeNode(grammarAccess.getSentencePartAccess().getItemDeclarationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ItemDeclaration_1=ruleItemDeclaration();

                    state._fsp--;


                    			current = this_ItemDeclaration_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRinform.g:134:3: this_CharacterDeclaration_2= ruleCharacterDeclaration
                    {

                    			newCompositeNode(grammarAccess.getSentencePartAccess().getCharacterDeclarationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_CharacterDeclaration_2=ruleCharacterDeclaration();

                    state._fsp--;


                    			current = this_CharacterDeclaration_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRinform.g:143:3: this_RoomDescription_3= ruleRoomDescription
                    {

                    			newCompositeNode(grammarAccess.getSentencePartAccess().getRoomDescriptionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_RoomDescription_3=ruleRoomDescription();

                    state._fsp--;


                    			current = this_RoomDescription_3;
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
                    // InternalRinform.g:161:3: this_CharacterDescription_5= ruleCharacterDescription
                    {

                    			newCompositeNode(grammarAccess.getSentencePartAccess().getCharacterDescriptionParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_CharacterDescription_5=ruleCharacterDescription();

                    state._fsp--;


                    			current = this_CharacterDescription_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalRinform.g:170:3: this_RoomAlias_6= ruleRoomAlias
                    {

                    			newCompositeNode(grammarAccess.getSentencePartAccess().getRoomAliasParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_RoomAlias_6=ruleRoomAlias();

                    state._fsp--;


                    			current = this_RoomAlias_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalRinform.g:179:3: this_ItemAlias_7= ruleItemAlias
                    {

                    			newCompositeNode(grammarAccess.getSentencePartAccess().getItemAliasParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_ItemAlias_7=ruleItemAlias();

                    state._fsp--;


                    			current = this_ItemAlias_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalRinform.g:188:3: this_CharacterAlias_8= ruleCharacterAlias
                    {

                    			newCompositeNode(grammarAccess.getSentencePartAccess().getCharacterAliasParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_CharacterAlias_8=ruleCharacterAlias();

                    state._fsp--;


                    			current = this_CharacterAlias_8;
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
                case 11 :
                    // InternalRinform.g:206:3: this_Words_10= ruleWords
                    {

                    			newCompositeNode(grammarAccess.getSentencePartAccess().getWordsParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_Words_10=ruleWords();

                    state._fsp--;


                    			current = this_Words_10;
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
    // InternalRinform.g:218:1: entryRuleRoomDeclaration returns [EObject current=null] : iv_ruleRoomDeclaration= ruleRoomDeclaration EOF ;
    public final EObject entryRuleRoomDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoomDeclaration = null;


        try {
            // InternalRinform.g:218:56: (iv_ruleRoomDeclaration= ruleRoomDeclaration EOF )
            // InternalRinform.g:219:2: iv_ruleRoomDeclaration= ruleRoomDeclaration EOF
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
    // InternalRinform.g:225:1: ruleRoomDeclaration returns [EObject current=null] : (otherlv_0= 'r-' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-r' ) ;
    public final EObject ruleRoomDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalRinform.g:231:2: ( (otherlv_0= 'r-' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-r' ) )
            // InternalRinform.g:232:2: (otherlv_0= 'r-' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-r' )
            {
            // InternalRinform.g:232:2: (otherlv_0= 'r-' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-r' )
            // InternalRinform.g:233:3: otherlv_0= 'r-' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-r'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRoomDeclarationAccess().getRKeyword_0());
            		
            // InternalRinform.g:237:3: ( (lv_name_1_0= ruleText ) )
            // InternalRinform.g:238:4: (lv_name_1_0= ruleText )
            {
            // InternalRinform.g:238:4: (lv_name_1_0= ruleText )
            // InternalRinform.g:239:5: lv_name_1_0= ruleText
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


    // $ANTLR start "entryRuleRoomDescription"
    // InternalRinform.g:264:1: entryRuleRoomDescription returns [EObject current=null] : iv_ruleRoomDescription= ruleRoomDescription EOF ;
    public final EObject entryRuleRoomDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoomDescription = null;


        try {
            // InternalRinform.g:264:56: (iv_ruleRoomDescription= ruleRoomDescription EOF )
            // InternalRinform.g:265:2: iv_ruleRoomDescription= ruleRoomDescription EOF
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
    // InternalRinform.g:271:1: ruleRoomDescription returns [EObject current=null] : (otherlv_0= '{' ( (lv_roomDescription_1_0= ruleText ) )+ otherlv_2= '!r' otherlv_3= '[' ( ( ruleText ) ) otherlv_5= ']' otherlv_6= '}' ) ;
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
            // InternalRinform.g:277:2: ( (otherlv_0= '{' ( (lv_roomDescription_1_0= ruleText ) )+ otherlv_2= '!r' otherlv_3= '[' ( ( ruleText ) ) otherlv_5= ']' otherlv_6= '}' ) )
            // InternalRinform.g:278:2: (otherlv_0= '{' ( (lv_roomDescription_1_0= ruleText ) )+ otherlv_2= '!r' otherlv_3= '[' ( ( ruleText ) ) otherlv_5= ']' otherlv_6= '}' )
            {
            // InternalRinform.g:278:2: (otherlv_0= '{' ( (lv_roomDescription_1_0= ruleText ) )+ otherlv_2= '!r' otherlv_3= '[' ( ( ruleText ) ) otherlv_5= ']' otherlv_6= '}' )
            // InternalRinform.g:279:3: otherlv_0= '{' ( (lv_roomDescription_1_0= ruleText ) )+ otherlv_2= '!r' otherlv_3= '[' ( ( ruleText ) ) otherlv_5= ']' otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getRoomDescriptionAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalRinform.g:283:3: ( (lv_roomDescription_1_0= ruleText ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=RULE_ID && LA3_0<=RULE_WS)||(LA3_0>=30 && LA3_0<=40)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalRinform.g:284:4: (lv_roomDescription_1_0= ruleText )
            	    {
            	    // InternalRinform.g:284:4: (lv_roomDescription_1_0= ruleText )
            	    // InternalRinform.g:285:5: lv_roomDescription_1_0= ruleText
            	    {

            	    					newCompositeNode(grammarAccess.getRoomDescriptionAccess().getRoomDescriptionTextParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_6);
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

            otherlv_2=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getRoomDescriptionAccess().getRKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getRoomDescriptionAccess().getLeftSquareBracketKeyword_3());
            		
            // InternalRinform.g:310:3: ( ( ruleText ) )
            // InternalRinform.g:311:4: ( ruleText )
            {
            // InternalRinform.g:311:4: ( ruleText )
            // InternalRinform.g:312:5: ruleText
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRoomDescriptionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRoomDescriptionAccess().getRoomRoomDeclarationCrossReference_4_0());
            				
            pushFollow(FOLLOW_9);
            ruleText();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getRoomDescriptionAccess().getRightSquareBracketKeyword_5());
            		
            otherlv_6=(Token)match(input,17,FOLLOW_2); 

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


    // $ANTLR start "entryRuleRoomAlias"
    // InternalRinform.g:338:1: entryRuleRoomAlias returns [EObject current=null] : iv_ruleRoomAlias= ruleRoomAlias EOF ;
    public final EObject entryRuleRoomAlias() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoomAlias = null;


        try {
            // InternalRinform.g:338:50: (iv_ruleRoomAlias= ruleRoomAlias EOF )
            // InternalRinform.g:339:2: iv_ruleRoomAlias= ruleRoomAlias EOF
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
    // InternalRinform.g:345:1: ruleRoomAlias returns [EObject current=null] : (otherlv_0= '!r' otherlv_1= '[' ( ( ruleText ) ) otherlv_3= ']' otherlv_4= '=' (otherlv_5= '[' ( (lv_aliases_6_0= ruleText ) )+ otherlv_7= ']' otherlv_8= '=' )* (otherlv_9= '[' ( (lv_aliases_10_0= ruleText ) )+ otherlv_11= ']' ) ) ;
    public final EObject ruleRoomAlias() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_aliases_6_0 = null;

        AntlrDatatypeRuleToken lv_aliases_10_0 = null;



        	enterRule();

        try {
            // InternalRinform.g:351:2: ( (otherlv_0= '!r' otherlv_1= '[' ( ( ruleText ) ) otherlv_3= ']' otherlv_4= '=' (otherlv_5= '[' ( (lv_aliases_6_0= ruleText ) )+ otherlv_7= ']' otherlv_8= '=' )* (otherlv_9= '[' ( (lv_aliases_10_0= ruleText ) )+ otherlv_11= ']' ) ) )
            // InternalRinform.g:352:2: (otherlv_0= '!r' otherlv_1= '[' ( ( ruleText ) ) otherlv_3= ']' otherlv_4= '=' (otherlv_5= '[' ( (lv_aliases_6_0= ruleText ) )+ otherlv_7= ']' otherlv_8= '=' )* (otherlv_9= '[' ( (lv_aliases_10_0= ruleText ) )+ otherlv_11= ']' ) )
            {
            // InternalRinform.g:352:2: (otherlv_0= '!r' otherlv_1= '[' ( ( ruleText ) ) otherlv_3= ']' otherlv_4= '=' (otherlv_5= '[' ( (lv_aliases_6_0= ruleText ) )+ otherlv_7= ']' otherlv_8= '=' )* (otherlv_9= '[' ( (lv_aliases_10_0= ruleText ) )+ otherlv_11= ']' ) )
            // InternalRinform.g:353:3: otherlv_0= '!r' otherlv_1= '[' ( ( ruleText ) ) otherlv_3= ']' otherlv_4= '=' (otherlv_5= '[' ( (lv_aliases_6_0= ruleText ) )+ otherlv_7= ']' otherlv_8= '=' )* (otherlv_9= '[' ( (lv_aliases_10_0= ruleText ) )+ otherlv_11= ']' )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getRoomAliasAccess().getRKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getRoomAliasAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalRinform.g:361:3: ( ( ruleText ) )
            // InternalRinform.g:362:4: ( ruleText )
            {
            // InternalRinform.g:362:4: ( ruleText )
            // InternalRinform.g:363:5: ruleText
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRoomAliasRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRoomAliasAccess().getRoomRoomDeclarationCrossReference_2_0());
            				
            pushFollow(FOLLOW_9);
            ruleText();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getRoomAliasAccess().getRightSquareBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getRoomAliasAccess().getEqualsSignKeyword_4());
            		
            // InternalRinform.g:385:3: (otherlv_5= '[' ( (lv_aliases_6_0= ruleText ) )+ otherlv_7= ']' otherlv_8= '=' )*
            loop5:
            do {
                int alt5=2;
                alt5 = dfa5.predict(input);
                switch (alt5) {
            	case 1 :
            	    // InternalRinform.g:386:4: otherlv_5= '[' ( (lv_aliases_6_0= ruleText ) )+ otherlv_7= ']' otherlv_8= '='
            	    {
            	    otherlv_5=(Token)match(input,15,FOLLOW_8); 

            	    				newLeafNode(otherlv_5, grammarAccess.getRoomAliasAccess().getLeftSquareBracketKeyword_5_0());
            	    			
            	    // InternalRinform.g:390:4: ( (lv_aliases_6_0= ruleText ) )+
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
            	    	    // InternalRinform.g:391:5: (lv_aliases_6_0= ruleText )
            	    	    {
            	    	    // InternalRinform.g:391:5: (lv_aliases_6_0= ruleText )
            	    	    // InternalRinform.g:392:6: lv_aliases_6_0= ruleText
            	    	    {

            	    	    						newCompositeNode(grammarAccess.getRoomAliasAccess().getAliasesTextParserRuleCall_5_1_0());
            	    	    					
            	    	    pushFollow(FOLLOW_8);
            	    	    lv_aliases_6_0=ruleText();

            	    	    state._fsp--;


            	    	    						if (current==null) {
            	    	    							current = createModelElementForParent(grammarAccess.getRoomAliasRule());
            	    	    						}
            	    	    						add(
            	    	    							current,
            	    	    							"aliases",
            	    	    							lv_aliases_6_0,
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

            	    otherlv_7=(Token)match(input,16,FOLLOW_11); 

            	    				newLeafNode(otherlv_7, grammarAccess.getRoomAliasAccess().getRightSquareBracketKeyword_5_2());
            	    			
            	    otherlv_8=(Token)match(input,18,FOLLOW_7); 

            	    				newLeafNode(otherlv_8, grammarAccess.getRoomAliasAccess().getEqualsSignKeyword_5_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalRinform.g:418:3: (otherlv_9= '[' ( (lv_aliases_10_0= ruleText ) )+ otherlv_11= ']' )
            // InternalRinform.g:419:4: otherlv_9= '[' ( (lv_aliases_10_0= ruleText ) )+ otherlv_11= ']'
            {
            otherlv_9=(Token)match(input,15,FOLLOW_8); 

            				newLeafNode(otherlv_9, grammarAccess.getRoomAliasAccess().getLeftSquareBracketKeyword_6_0());
            			
            // InternalRinform.g:423:4: ( (lv_aliases_10_0= ruleText ) )+
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
            	    // InternalRinform.g:424:5: (lv_aliases_10_0= ruleText )
            	    {
            	    // InternalRinform.g:424:5: (lv_aliases_10_0= ruleText )
            	    // InternalRinform.g:425:6: lv_aliases_10_0= ruleText
            	    {

            	    						newCompositeNode(grammarAccess.getRoomAliasAccess().getAliasesTextParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_aliases_10_0=ruleText();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRoomAliasRule());
            	    						}
            	    						add(
            	    							current,
            	    							"aliases",
            	    							lv_aliases_10_0,
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

            otherlv_11=(Token)match(input,16,FOLLOW_2); 

            				newLeafNode(otherlv_11, grammarAccess.getRoomAliasAccess().getRightSquareBracketKeyword_6_2());
            			

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
    // $ANTLR end "ruleRoomAlias"


    // $ANTLR start "entryRuleItemDeclaration"
    // InternalRinform.g:451:1: entryRuleItemDeclaration returns [EObject current=null] : iv_ruleItemDeclaration= ruleItemDeclaration EOF ;
    public final EObject entryRuleItemDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItemDeclaration = null;


        try {
            // InternalRinform.g:451:56: (iv_ruleItemDeclaration= ruleItemDeclaration EOF )
            // InternalRinform.g:452:2: iv_ruleItemDeclaration= ruleItemDeclaration EOF
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
    // InternalRinform.g:458:1: ruleItemDeclaration returns [EObject current=null] : (this_ItemInRoomDeclaration_0= ruleItemInRoomDeclaration | this_ContainerDeclaration_1= ruleContainerDeclaration | this_ItemInContainerDeclaration_2= ruleItemInContainerDeclaration ) ;
    public final EObject ruleItemDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_ItemInRoomDeclaration_0 = null;

        EObject this_ContainerDeclaration_1 = null;

        EObject this_ItemInContainerDeclaration_2 = null;



        	enterRule();

        try {
            // InternalRinform.g:464:2: ( (this_ItemInRoomDeclaration_0= ruleItemInRoomDeclaration | this_ContainerDeclaration_1= ruleContainerDeclaration | this_ItemInContainerDeclaration_2= ruleItemInContainerDeclaration ) )
            // InternalRinform.g:465:2: (this_ItemInRoomDeclaration_0= ruleItemInRoomDeclaration | this_ContainerDeclaration_1= ruleContainerDeclaration | this_ItemInContainerDeclaration_2= ruleItemInContainerDeclaration )
            {
            // InternalRinform.g:465:2: (this_ItemInRoomDeclaration_0= ruleItemInRoomDeclaration | this_ContainerDeclaration_1= ruleContainerDeclaration | this_ItemInContainerDeclaration_2= ruleItemInContainerDeclaration )
            int alt7=3;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalRinform.g:466:3: this_ItemInRoomDeclaration_0= ruleItemInRoomDeclaration
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
                    // InternalRinform.g:475:3: this_ContainerDeclaration_1= ruleContainerDeclaration
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
                    // InternalRinform.g:484:3: this_ItemInContainerDeclaration_2= ruleItemInContainerDeclaration
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


    // $ANTLR start "entryRuleContainerDeclaration"
    // InternalRinform.g:496:1: entryRuleContainerDeclaration returns [EObject current=null] : iv_ruleContainerDeclaration= ruleContainerDeclaration EOF ;
    public final EObject entryRuleContainerDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainerDeclaration = null;


        try {
            // InternalRinform.g:496:61: (iv_ruleContainerDeclaration= ruleContainerDeclaration EOF )
            // InternalRinform.g:497:2: iv_ruleContainerDeclaration= ruleContainerDeclaration EOF
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
    // InternalRinform.g:503:1: ruleContainerDeclaration returns [EObject current=null] : (otherlv_0= 'c-' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-c' otherlv_3= '!r' otherlv_4= '[' ( ( ruleText ) ) otherlv_6= ']' ) ;
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
            // InternalRinform.g:509:2: ( (otherlv_0= 'c-' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-c' otherlv_3= '!r' otherlv_4= '[' ( ( ruleText ) ) otherlv_6= ']' ) )
            // InternalRinform.g:510:2: (otherlv_0= 'c-' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-c' otherlv_3= '!r' otherlv_4= '[' ( ( ruleText ) ) otherlv_6= ']' )
            {
            // InternalRinform.g:510:2: (otherlv_0= 'c-' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-c' otherlv_3= '!r' otherlv_4= '[' ( ( ruleText ) ) otherlv_6= ']' )
            // InternalRinform.g:511:3: otherlv_0= 'c-' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-c' otherlv_3= '!r' otherlv_4= '[' ( ( ruleText ) ) otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getContainerDeclarationAccess().getCKeyword_0());
            		
            // InternalRinform.g:515:3: ( (lv_name_1_0= ruleText ) )
            // InternalRinform.g:516:4: (lv_name_1_0= ruleText )
            {
            // InternalRinform.g:516:4: (lv_name_1_0= ruleText )
            // InternalRinform.g:517:5: lv_name_1_0= ruleText
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
            		
            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getContainerDeclarationAccess().getRKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getContainerDeclarationAccess().getLeftSquareBracketKeyword_4());
            		
            // InternalRinform.g:546:3: ( ( ruleText ) )
            // InternalRinform.g:547:4: ( ruleText )
            {
            // InternalRinform.g:547:4: ( ruleText )
            // InternalRinform.g:548:5: ruleText
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContainerDeclarationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getContainerDeclarationAccess().getRoomRoomDeclarationCrossReference_5_0());
            				
            pushFollow(FOLLOW_9);
            ruleText();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

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
    // InternalRinform.g:570:1: entryRuleItemInRoomDeclaration returns [EObject current=null] : iv_ruleItemInRoomDeclaration= ruleItemInRoomDeclaration EOF ;
    public final EObject entryRuleItemInRoomDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItemInRoomDeclaration = null;


        try {
            // InternalRinform.g:570:62: (iv_ruleItemInRoomDeclaration= ruleItemInRoomDeclaration EOF )
            // InternalRinform.g:571:2: iv_ruleItemInRoomDeclaration= ruleItemInRoomDeclaration EOF
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
    // InternalRinform.g:577:1: ruleItemInRoomDeclaration returns [EObject current=null] : (otherlv_0= 'i-' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-i' otherlv_3= '!r' otherlv_4= '[' ( ( ruleText ) ) otherlv_6= ']' ) ;
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
            // InternalRinform.g:583:2: ( (otherlv_0= 'i-' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-i' otherlv_3= '!r' otherlv_4= '[' ( ( ruleText ) ) otherlv_6= ']' ) )
            // InternalRinform.g:584:2: (otherlv_0= 'i-' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-i' otherlv_3= '!r' otherlv_4= '[' ( ( ruleText ) ) otherlv_6= ']' )
            {
            // InternalRinform.g:584:2: (otherlv_0= 'i-' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-i' otherlv_3= '!r' otherlv_4= '[' ( ( ruleText ) ) otherlv_6= ']' )
            // InternalRinform.g:585:3: otherlv_0= 'i-' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-i' otherlv_3= '!r' otherlv_4= '[' ( ( ruleText ) ) otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getItemInRoomDeclarationAccess().getIKeyword_0());
            		
            // InternalRinform.g:589:3: ( (lv_name_1_0= ruleText ) )
            // InternalRinform.g:590:4: (lv_name_1_0= ruleText )
            {
            // InternalRinform.g:590:4: (lv_name_1_0= ruleText )
            // InternalRinform.g:591:5: lv_name_1_0= ruleText
            {

            					newCompositeNode(grammarAccess.getItemInRoomDeclarationAccess().getNameTextParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_16);
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
            		
            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getItemInRoomDeclarationAccess().getRKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getItemInRoomDeclarationAccess().getLeftSquareBracketKeyword_4());
            		
            // InternalRinform.g:620:3: ( ( ruleText ) )
            // InternalRinform.g:621:4: ( ruleText )
            {
            // InternalRinform.g:621:4: ( ruleText )
            // InternalRinform.g:622:5: ruleText
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getItemInRoomDeclarationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getItemInRoomDeclarationAccess().getRoomRoomDeclarationCrossReference_5_0());
            				
            pushFollow(FOLLOW_9);
            ruleText();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

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
    // InternalRinform.g:644:1: entryRuleItemInContainerDeclaration returns [EObject current=null] : iv_ruleItemInContainerDeclaration= ruleItemInContainerDeclaration EOF ;
    public final EObject entryRuleItemInContainerDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItemInContainerDeclaration = null;


        try {
            // InternalRinform.g:644:67: (iv_ruleItemInContainerDeclaration= ruleItemInContainerDeclaration EOF )
            // InternalRinform.g:645:2: iv_ruleItemInContainerDeclaration= ruleItemInContainerDeclaration EOF
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
    // InternalRinform.g:651:1: ruleItemInContainerDeclaration returns [EObject current=null] : (otherlv_0= 'i-' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-i' otherlv_3= '!c' otherlv_4= '[' ( ( ruleText ) ) otherlv_6= ']' ) ;
    public final EObject ruleItemInContainerDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalRinform.g:657:2: ( (otherlv_0= 'i-' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-i' otherlv_3= '!c' otherlv_4= '[' ( ( ruleText ) ) otherlv_6= ']' ) )
            // InternalRinform.g:658:2: (otherlv_0= 'i-' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-i' otherlv_3= '!c' otherlv_4= '[' ( ( ruleText ) ) otherlv_6= ']' )
            {
            // InternalRinform.g:658:2: (otherlv_0= 'i-' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-i' otherlv_3= '!c' otherlv_4= '[' ( ( ruleText ) ) otherlv_6= ']' )
            // InternalRinform.g:659:3: otherlv_0= 'i-' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-i' otherlv_3= '!c' otherlv_4= '[' ( ( ruleText ) ) otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getItemInContainerDeclarationAccess().getIKeyword_0());
            		
            // InternalRinform.g:663:3: ( (lv_name_1_0= ruleText ) )
            // InternalRinform.g:664:4: (lv_name_1_0= ruleText )
            {
            // InternalRinform.g:664:4: (lv_name_1_0= ruleText )
            // InternalRinform.g:665:5: lv_name_1_0= ruleText
            {

            					newCompositeNode(grammarAccess.getItemInContainerDeclarationAccess().getNameTextParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_16);
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

            otherlv_2=(Token)match(input,22,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getItemInContainerDeclarationAccess().getIKeyword_2());
            		
            otherlv_3=(Token)match(input,23,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getItemInContainerDeclarationAccess().getCKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getItemInContainerDeclarationAccess().getLeftSquareBracketKeyword_4());
            		
            // InternalRinform.g:694:3: ( ( ruleText ) )
            // InternalRinform.g:695:4: ( ruleText )
            {
            // InternalRinform.g:695:4: ( ruleText )
            // InternalRinform.g:696:5: ruleText
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getItemInContainerDeclarationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getItemInContainerDeclarationAccess().getContainerContainerDeclarationCrossReference_5_0());
            				
            pushFollow(FOLLOW_9);
            ruleText();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

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


    // $ANTLR start "entryRuleItemDescription"
    // InternalRinform.g:718:1: entryRuleItemDescription returns [EObject current=null] : iv_ruleItemDescription= ruleItemDescription EOF ;
    public final EObject entryRuleItemDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItemDescription = null;


        try {
            // InternalRinform.g:718:56: (iv_ruleItemDescription= ruleItemDescription EOF )
            // InternalRinform.g:719:2: iv_ruleItemDescription= ruleItemDescription EOF
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
    // InternalRinform.g:725:1: ruleItemDescription returns [EObject current=null] : (otherlv_0= '{' ( (lv_itemDescription_1_0= ruleText ) )+ otherlv_2= '!i' otherlv_3= '[' ( ( ruleText ) ) otherlv_5= ']' otherlv_6= '}' ) ;
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
            // InternalRinform.g:731:2: ( (otherlv_0= '{' ( (lv_itemDescription_1_0= ruleText ) )+ otherlv_2= '!i' otherlv_3= '[' ( ( ruleText ) ) otherlv_5= ']' otherlv_6= '}' ) )
            // InternalRinform.g:732:2: (otherlv_0= '{' ( (lv_itemDescription_1_0= ruleText ) )+ otherlv_2= '!i' otherlv_3= '[' ( ( ruleText ) ) otherlv_5= ']' otherlv_6= '}' )
            {
            // InternalRinform.g:732:2: (otherlv_0= '{' ( (lv_itemDescription_1_0= ruleText ) )+ otherlv_2= '!i' otherlv_3= '[' ( ( ruleText ) ) otherlv_5= ']' otherlv_6= '}' )
            // InternalRinform.g:733:3: otherlv_0= '{' ( (lv_itemDescription_1_0= ruleText ) )+ otherlv_2= '!i' otherlv_3= '[' ( ( ruleText ) ) otherlv_5= ']' otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getItemDescriptionAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalRinform.g:737:3: ( (lv_itemDescription_1_0= ruleText ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=RULE_ID && LA8_0<=RULE_WS)||(LA8_0>=30 && LA8_0<=40)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalRinform.g:738:4: (lv_itemDescription_1_0= ruleText )
            	    {
            	    // InternalRinform.g:738:4: (lv_itemDescription_1_0= ruleText )
            	    // InternalRinform.g:739:5: lv_itemDescription_1_0= ruleText
            	    {

            	    					newCompositeNode(grammarAccess.getItemDescriptionAccess().getItemDescriptionTextParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_6);
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
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            otherlv_2=(Token)match(input,24,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getItemDescriptionAccess().getIKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getItemDescriptionAccess().getLeftSquareBracketKeyword_3());
            		
            // InternalRinform.g:764:3: ( ( ruleText ) )
            // InternalRinform.g:765:4: ( ruleText )
            {
            // InternalRinform.g:765:4: ( ruleText )
            // InternalRinform.g:766:5: ruleText
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getItemDescriptionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getItemDescriptionAccess().getItemItemDeclarationCrossReference_4_0());
            				
            pushFollow(FOLLOW_9);
            ruleText();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getItemDescriptionAccess().getRightSquareBracketKeyword_5());
            		
            otherlv_6=(Token)match(input,17,FOLLOW_2); 

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


    // $ANTLR start "entryRuleItemAlias"
    // InternalRinform.g:792:1: entryRuleItemAlias returns [EObject current=null] : iv_ruleItemAlias= ruleItemAlias EOF ;
    public final EObject entryRuleItemAlias() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItemAlias = null;


        try {
            // InternalRinform.g:792:50: (iv_ruleItemAlias= ruleItemAlias EOF )
            // InternalRinform.g:793:2: iv_ruleItemAlias= ruleItemAlias EOF
            {
             newCompositeNode(grammarAccess.getItemAliasRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleItemAlias=ruleItemAlias();

            state._fsp--;

             current =iv_ruleItemAlias; 
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
    // $ANTLR end "entryRuleItemAlias"


    // $ANTLR start "ruleItemAlias"
    // InternalRinform.g:799:1: ruleItemAlias returns [EObject current=null] : (otherlv_0= '!i' otherlv_1= '[' ( ( ruleText ) ) otherlv_3= ']' otherlv_4= '=' (otherlv_5= '[' ( (lv_aliases_6_0= ruleText ) )+ otherlv_7= ']' otherlv_8= '=' )* (otherlv_9= '[' ( (lv_aliases_10_0= ruleText ) )+ otherlv_11= ']' ) ) ;
    public final EObject ruleItemAlias() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_aliases_6_0 = null;

        AntlrDatatypeRuleToken lv_aliases_10_0 = null;



        	enterRule();

        try {
            // InternalRinform.g:805:2: ( (otherlv_0= '!i' otherlv_1= '[' ( ( ruleText ) ) otherlv_3= ']' otherlv_4= '=' (otherlv_5= '[' ( (lv_aliases_6_0= ruleText ) )+ otherlv_7= ']' otherlv_8= '=' )* (otherlv_9= '[' ( (lv_aliases_10_0= ruleText ) )+ otherlv_11= ']' ) ) )
            // InternalRinform.g:806:2: (otherlv_0= '!i' otherlv_1= '[' ( ( ruleText ) ) otherlv_3= ']' otherlv_4= '=' (otherlv_5= '[' ( (lv_aliases_6_0= ruleText ) )+ otherlv_7= ']' otherlv_8= '=' )* (otherlv_9= '[' ( (lv_aliases_10_0= ruleText ) )+ otherlv_11= ']' ) )
            {
            // InternalRinform.g:806:2: (otherlv_0= '!i' otherlv_1= '[' ( ( ruleText ) ) otherlv_3= ']' otherlv_4= '=' (otherlv_5= '[' ( (lv_aliases_6_0= ruleText ) )+ otherlv_7= ']' otherlv_8= '=' )* (otherlv_9= '[' ( (lv_aliases_10_0= ruleText ) )+ otherlv_11= ']' ) )
            // InternalRinform.g:807:3: otherlv_0= '!i' otherlv_1= '[' ( ( ruleText ) ) otherlv_3= ']' otherlv_4= '=' (otherlv_5= '[' ( (lv_aliases_6_0= ruleText ) )+ otherlv_7= ']' otherlv_8= '=' )* (otherlv_9= '[' ( (lv_aliases_10_0= ruleText ) )+ otherlv_11= ']' )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getItemAliasAccess().getIKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getItemAliasAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalRinform.g:815:3: ( ( ruleText ) )
            // InternalRinform.g:816:4: ( ruleText )
            {
            // InternalRinform.g:816:4: ( ruleText )
            // InternalRinform.g:817:5: ruleText
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getItemAliasRule());
            					}
            				

            					newCompositeNode(grammarAccess.getItemAliasAccess().getItemItemDeclarationCrossReference_2_0());
            				
            pushFollow(FOLLOW_9);
            ruleText();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getItemAliasAccess().getRightSquareBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getItemAliasAccess().getEqualsSignKeyword_4());
            		
            // InternalRinform.g:839:3: (otherlv_5= '[' ( (lv_aliases_6_0= ruleText ) )+ otherlv_7= ']' otherlv_8= '=' )*
            loop10:
            do {
                int alt10=2;
                alt10 = dfa10.predict(input);
                switch (alt10) {
            	case 1 :
            	    // InternalRinform.g:840:4: otherlv_5= '[' ( (lv_aliases_6_0= ruleText ) )+ otherlv_7= ']' otherlv_8= '='
            	    {
            	    otherlv_5=(Token)match(input,15,FOLLOW_8); 

            	    				newLeafNode(otherlv_5, grammarAccess.getItemAliasAccess().getLeftSquareBracketKeyword_5_0());
            	    			
            	    // InternalRinform.g:844:4: ( (lv_aliases_6_0= ruleText ) )+
            	    int cnt9=0;
            	    loop9:
            	    do {
            	        int alt9=2;
            	        int LA9_0 = input.LA(1);

            	        if ( ((LA9_0>=RULE_ID && LA9_0<=RULE_WS)||(LA9_0>=30 && LA9_0<=40)) ) {
            	            alt9=1;
            	        }


            	        switch (alt9) {
            	    	case 1 :
            	    	    // InternalRinform.g:845:5: (lv_aliases_6_0= ruleText )
            	    	    {
            	    	    // InternalRinform.g:845:5: (lv_aliases_6_0= ruleText )
            	    	    // InternalRinform.g:846:6: lv_aliases_6_0= ruleText
            	    	    {

            	    	    						newCompositeNode(grammarAccess.getItemAliasAccess().getAliasesTextParserRuleCall_5_1_0());
            	    	    					
            	    	    pushFollow(FOLLOW_8);
            	    	    lv_aliases_6_0=ruleText();

            	    	    state._fsp--;


            	    	    						if (current==null) {
            	    	    							current = createModelElementForParent(grammarAccess.getItemAliasRule());
            	    	    						}
            	    	    						add(
            	    	    							current,
            	    	    							"aliases",
            	    	    							lv_aliases_6_0,
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

            	    otherlv_7=(Token)match(input,16,FOLLOW_11); 

            	    				newLeafNode(otherlv_7, grammarAccess.getItemAliasAccess().getRightSquareBracketKeyword_5_2());
            	    			
            	    otherlv_8=(Token)match(input,18,FOLLOW_7); 

            	    				newLeafNode(otherlv_8, grammarAccess.getItemAliasAccess().getEqualsSignKeyword_5_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalRinform.g:872:3: (otherlv_9= '[' ( (lv_aliases_10_0= ruleText ) )+ otherlv_11= ']' )
            // InternalRinform.g:873:4: otherlv_9= '[' ( (lv_aliases_10_0= ruleText ) )+ otherlv_11= ']'
            {
            otherlv_9=(Token)match(input,15,FOLLOW_8); 

            				newLeafNode(otherlv_9, grammarAccess.getItemAliasAccess().getLeftSquareBracketKeyword_6_0());
            			
            // InternalRinform.g:877:4: ( (lv_aliases_10_0= ruleText ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=RULE_ID && LA11_0<=RULE_WS)||(LA11_0>=30 && LA11_0<=40)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalRinform.g:878:5: (lv_aliases_10_0= ruleText )
            	    {
            	    // InternalRinform.g:878:5: (lv_aliases_10_0= ruleText )
            	    // InternalRinform.g:879:6: lv_aliases_10_0= ruleText
            	    {

            	    						newCompositeNode(grammarAccess.getItemAliasAccess().getAliasesTextParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_aliases_10_0=ruleText();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getItemAliasRule());
            	    						}
            	    						add(
            	    							current,
            	    							"aliases",
            	    							lv_aliases_10_0,
            	    							"uk.ac.kcl.mde.Rinform.Text");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            otherlv_11=(Token)match(input,16,FOLLOW_2); 

            				newLeafNode(otherlv_11, grammarAccess.getItemAliasAccess().getRightSquareBracketKeyword_6_2());
            			

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
    // $ANTLR end "ruleItemAlias"


    // $ANTLR start "entryRuleCharacterDeclaration"
    // InternalRinform.g:905:1: entryRuleCharacterDeclaration returns [EObject current=null] : iv_ruleCharacterDeclaration= ruleCharacterDeclaration EOF ;
    public final EObject entryRuleCharacterDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharacterDeclaration = null;


        try {
            // InternalRinform.g:905:61: (iv_ruleCharacterDeclaration= ruleCharacterDeclaration EOF )
            // InternalRinform.g:906:2: iv_ruleCharacterDeclaration= ruleCharacterDeclaration EOF
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
    // InternalRinform.g:912:1: ruleCharacterDeclaration returns [EObject current=null] : (otherlv_0= 'p-' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-p' otherlv_3= '!r' otherlv_4= '[' ( ( ruleText ) ) otherlv_6= ']' ) ;
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
            // InternalRinform.g:918:2: ( (otherlv_0= 'p-' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-p' otherlv_3= '!r' otherlv_4= '[' ( ( ruleText ) ) otherlv_6= ']' ) )
            // InternalRinform.g:919:2: (otherlv_0= 'p-' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-p' otherlv_3= '!r' otherlv_4= '[' ( ( ruleText ) ) otherlv_6= ']' )
            {
            // InternalRinform.g:919:2: (otherlv_0= 'p-' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-p' otherlv_3= '!r' otherlv_4= '[' ( ( ruleText ) ) otherlv_6= ']' )
            // InternalRinform.g:920:3: otherlv_0= 'p-' ( (lv_name_1_0= ruleText ) ) otherlv_2= '-p' otherlv_3= '!r' otherlv_4= '[' ( ( ruleText ) ) otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getCharacterDeclarationAccess().getPKeyword_0());
            		
            // InternalRinform.g:924:3: ( (lv_name_1_0= ruleText ) )
            // InternalRinform.g:925:4: (lv_name_1_0= ruleText )
            {
            // InternalRinform.g:925:4: (lv_name_1_0= ruleText )
            // InternalRinform.g:926:5: lv_name_1_0= ruleText
            {

            					newCompositeNode(grammarAccess.getCharacterDeclarationAccess().getNameTextParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_19);
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
            		
            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getCharacterDeclarationAccess().getRKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getCharacterDeclarationAccess().getLeftSquareBracketKeyword_4());
            		
            // InternalRinform.g:955:3: ( ( ruleText ) )
            // InternalRinform.g:956:4: ( ruleText )
            {
            // InternalRinform.g:956:4: ( ruleText )
            // InternalRinform.g:957:5: ruleText
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCharacterDeclarationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCharacterDeclarationAccess().getRoomRoomDeclarationCrossReference_5_0());
            				
            pushFollow(FOLLOW_9);
            ruleText();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

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
    // InternalRinform.g:979:1: entryRuleCharacterDescription returns [EObject current=null] : iv_ruleCharacterDescription= ruleCharacterDescription EOF ;
    public final EObject entryRuleCharacterDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharacterDescription = null;


        try {
            // InternalRinform.g:979:61: (iv_ruleCharacterDescription= ruleCharacterDescription EOF )
            // InternalRinform.g:980:2: iv_ruleCharacterDescription= ruleCharacterDescription EOF
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
    // InternalRinform.g:986:1: ruleCharacterDescription returns [EObject current=null] : (otherlv_0= '{' ( (lv_personDescription_1_0= ruleText ) )+ otherlv_2= '!p' otherlv_3= '[' ( ( ruleText ) ) otherlv_5= ']' otherlv_6= '}' ) ;
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
            // InternalRinform.g:992:2: ( (otherlv_0= '{' ( (lv_personDescription_1_0= ruleText ) )+ otherlv_2= '!p' otherlv_3= '[' ( ( ruleText ) ) otherlv_5= ']' otherlv_6= '}' ) )
            // InternalRinform.g:993:2: (otherlv_0= '{' ( (lv_personDescription_1_0= ruleText ) )+ otherlv_2= '!p' otherlv_3= '[' ( ( ruleText ) ) otherlv_5= ']' otherlv_6= '}' )
            {
            // InternalRinform.g:993:2: (otherlv_0= '{' ( (lv_personDescription_1_0= ruleText ) )+ otherlv_2= '!p' otherlv_3= '[' ( ( ruleText ) ) otherlv_5= ']' otherlv_6= '}' )
            // InternalRinform.g:994:3: otherlv_0= '{' ( (lv_personDescription_1_0= ruleText ) )+ otherlv_2= '!p' otherlv_3= '[' ( ( ruleText ) ) otherlv_5= ']' otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getCharacterDescriptionAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalRinform.g:998:3: ( (lv_personDescription_1_0= ruleText ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_ID && LA12_0<=RULE_WS)||(LA12_0>=30 && LA12_0<=40)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalRinform.g:999:4: (lv_personDescription_1_0= ruleText )
            	    {
            	    // InternalRinform.g:999:4: (lv_personDescription_1_0= ruleText )
            	    // InternalRinform.g:1000:5: lv_personDescription_1_0= ruleText
            	    {

            	    					newCompositeNode(grammarAccess.getCharacterDescriptionAccess().getPersonDescriptionTextParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_6);
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
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);

            otherlv_2=(Token)match(input,27,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getCharacterDescriptionAccess().getPKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getCharacterDescriptionAccess().getLeftSquareBracketKeyword_3());
            		
            // InternalRinform.g:1025:3: ( ( ruleText ) )
            // InternalRinform.g:1026:4: ( ruleText )
            {
            // InternalRinform.g:1026:4: ( ruleText )
            // InternalRinform.g:1027:5: ruleText
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCharacterDescriptionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCharacterDescriptionAccess().getPersonCharacterDeclarationCrossReference_4_0());
            				
            pushFollow(FOLLOW_9);
            ruleText();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getCharacterDescriptionAccess().getRightSquareBracketKeyword_5());
            		
            otherlv_6=(Token)match(input,17,FOLLOW_2); 

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


    // $ANTLR start "entryRuleCharacterAlias"
    // InternalRinform.g:1053:1: entryRuleCharacterAlias returns [EObject current=null] : iv_ruleCharacterAlias= ruleCharacterAlias EOF ;
    public final EObject entryRuleCharacterAlias() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharacterAlias = null;


        try {
            // InternalRinform.g:1053:55: (iv_ruleCharacterAlias= ruleCharacterAlias EOF )
            // InternalRinform.g:1054:2: iv_ruleCharacterAlias= ruleCharacterAlias EOF
            {
             newCompositeNode(grammarAccess.getCharacterAliasRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCharacterAlias=ruleCharacterAlias();

            state._fsp--;

             current =iv_ruleCharacterAlias; 
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
    // $ANTLR end "entryRuleCharacterAlias"


    // $ANTLR start "ruleCharacterAlias"
    // InternalRinform.g:1060:1: ruleCharacterAlias returns [EObject current=null] : (otherlv_0= '!p' otherlv_1= '[' ( ( ruleText ) ) otherlv_3= ']' otherlv_4= '=' (otherlv_5= '[' ( (lv_aliases_6_0= ruleText ) )+ otherlv_7= ']' otherlv_8= '=' )* (otherlv_9= '[' ( (lv_aliases_10_0= ruleText ) )+ otherlv_11= ']' ) ) ;
    public final EObject ruleCharacterAlias() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_aliases_6_0 = null;

        AntlrDatatypeRuleToken lv_aliases_10_0 = null;



        	enterRule();

        try {
            // InternalRinform.g:1066:2: ( (otherlv_0= '!p' otherlv_1= '[' ( ( ruleText ) ) otherlv_3= ']' otherlv_4= '=' (otherlv_5= '[' ( (lv_aliases_6_0= ruleText ) )+ otherlv_7= ']' otherlv_8= '=' )* (otherlv_9= '[' ( (lv_aliases_10_0= ruleText ) )+ otherlv_11= ']' ) ) )
            // InternalRinform.g:1067:2: (otherlv_0= '!p' otherlv_1= '[' ( ( ruleText ) ) otherlv_3= ']' otherlv_4= '=' (otherlv_5= '[' ( (lv_aliases_6_0= ruleText ) )+ otherlv_7= ']' otherlv_8= '=' )* (otherlv_9= '[' ( (lv_aliases_10_0= ruleText ) )+ otherlv_11= ']' ) )
            {
            // InternalRinform.g:1067:2: (otherlv_0= '!p' otherlv_1= '[' ( ( ruleText ) ) otherlv_3= ']' otherlv_4= '=' (otherlv_5= '[' ( (lv_aliases_6_0= ruleText ) )+ otherlv_7= ']' otherlv_8= '=' )* (otherlv_9= '[' ( (lv_aliases_10_0= ruleText ) )+ otherlv_11= ']' ) )
            // InternalRinform.g:1068:3: otherlv_0= '!p' otherlv_1= '[' ( ( ruleText ) ) otherlv_3= ']' otherlv_4= '=' (otherlv_5= '[' ( (lv_aliases_6_0= ruleText ) )+ otherlv_7= ']' otherlv_8= '=' )* (otherlv_9= '[' ( (lv_aliases_10_0= ruleText ) )+ otherlv_11= ']' )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getCharacterAliasAccess().getPKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getCharacterAliasAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalRinform.g:1076:3: ( ( ruleText ) )
            // InternalRinform.g:1077:4: ( ruleText )
            {
            // InternalRinform.g:1077:4: ( ruleText )
            // InternalRinform.g:1078:5: ruleText
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCharacterAliasRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCharacterAliasAccess().getCharacterCharacterDeclarationCrossReference_2_0());
            				
            pushFollow(FOLLOW_9);
            ruleText();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getCharacterAliasAccess().getRightSquareBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getCharacterAliasAccess().getEqualsSignKeyword_4());
            		
            // InternalRinform.g:1100:3: (otherlv_5= '[' ( (lv_aliases_6_0= ruleText ) )+ otherlv_7= ']' otherlv_8= '=' )*
            loop14:
            do {
                int alt14=2;
                alt14 = dfa14.predict(input);
                switch (alt14) {
            	case 1 :
            	    // InternalRinform.g:1101:4: otherlv_5= '[' ( (lv_aliases_6_0= ruleText ) )+ otherlv_7= ']' otherlv_8= '='
            	    {
            	    otherlv_5=(Token)match(input,15,FOLLOW_8); 

            	    				newLeafNode(otherlv_5, grammarAccess.getCharacterAliasAccess().getLeftSquareBracketKeyword_5_0());
            	    			
            	    // InternalRinform.g:1105:4: ( (lv_aliases_6_0= ruleText ) )+
            	    int cnt13=0;
            	    loop13:
            	    do {
            	        int alt13=2;
            	        int LA13_0 = input.LA(1);

            	        if ( ((LA13_0>=RULE_ID && LA13_0<=RULE_WS)||(LA13_0>=30 && LA13_0<=40)) ) {
            	            alt13=1;
            	        }


            	        switch (alt13) {
            	    	case 1 :
            	    	    // InternalRinform.g:1106:5: (lv_aliases_6_0= ruleText )
            	    	    {
            	    	    // InternalRinform.g:1106:5: (lv_aliases_6_0= ruleText )
            	    	    // InternalRinform.g:1107:6: lv_aliases_6_0= ruleText
            	    	    {

            	    	    						newCompositeNode(grammarAccess.getCharacterAliasAccess().getAliasesTextParserRuleCall_5_1_0());
            	    	    					
            	    	    pushFollow(FOLLOW_8);
            	    	    lv_aliases_6_0=ruleText();

            	    	    state._fsp--;


            	    	    						if (current==null) {
            	    	    							current = createModelElementForParent(grammarAccess.getCharacterAliasRule());
            	    	    						}
            	    	    						add(
            	    	    							current,
            	    	    							"aliases",
            	    	    							lv_aliases_6_0,
            	    	    							"uk.ac.kcl.mde.Rinform.Text");
            	    	    						afterParserOrEnumRuleCall();
            	    	    					

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt13 >= 1 ) break loop13;
            	                EarlyExitException eee =
            	                    new EarlyExitException(13, input);
            	                throw eee;
            	        }
            	        cnt13++;
            	    } while (true);

            	    otherlv_7=(Token)match(input,16,FOLLOW_11); 

            	    				newLeafNode(otherlv_7, grammarAccess.getCharacterAliasAccess().getRightSquareBracketKeyword_5_2());
            	    			
            	    otherlv_8=(Token)match(input,18,FOLLOW_7); 

            	    				newLeafNode(otherlv_8, grammarAccess.getCharacterAliasAccess().getEqualsSignKeyword_5_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // InternalRinform.g:1133:3: (otherlv_9= '[' ( (lv_aliases_10_0= ruleText ) )+ otherlv_11= ']' )
            // InternalRinform.g:1134:4: otherlv_9= '[' ( (lv_aliases_10_0= ruleText ) )+ otherlv_11= ']'
            {
            otherlv_9=(Token)match(input,15,FOLLOW_8); 

            				newLeafNode(otherlv_9, grammarAccess.getCharacterAliasAccess().getLeftSquareBracketKeyword_6_0());
            			
            // InternalRinform.g:1138:4: ( (lv_aliases_10_0= ruleText ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=RULE_ID && LA15_0<=RULE_WS)||(LA15_0>=30 && LA15_0<=40)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalRinform.g:1139:5: (lv_aliases_10_0= ruleText )
            	    {
            	    // InternalRinform.g:1139:5: (lv_aliases_10_0= ruleText )
            	    // InternalRinform.g:1140:6: lv_aliases_10_0= ruleText
            	    {

            	    						newCompositeNode(grammarAccess.getCharacterAliasAccess().getAliasesTextParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_aliases_10_0=ruleText();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCharacterAliasRule());
            	    						}
            	    						add(
            	    							current,
            	    							"aliases",
            	    							lv_aliases_10_0,
            	    							"uk.ac.kcl.mde.Rinform.Text");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);

            otherlv_11=(Token)match(input,16,FOLLOW_2); 

            				newLeafNode(otherlv_11, grammarAccess.getCharacterAliasAccess().getRightSquareBracketKeyword_6_2());
            			

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
    // $ANTLR end "ruleCharacterAlias"


    // $ANTLR start "entryRuleDirectionStatement"
    // InternalRinform.g:1166:1: entryRuleDirectionStatement returns [EObject current=null] : iv_ruleDirectionStatement= ruleDirectionStatement EOF ;
    public final EObject entryRuleDirectionStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirectionStatement = null;


        try {
            // InternalRinform.g:1166:59: (iv_ruleDirectionStatement= ruleDirectionStatement EOF )
            // InternalRinform.g:1167:2: iv_ruleDirectionStatement= ruleDirectionStatement EOF
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
    // InternalRinform.g:1173:1: ruleDirectionStatement returns [EObject current=null] : (otherlv_0= '<' ( ( ruleText ) ) ( (lv_direction_2_0= ruleDirection ) ) ( ( ruleText ) ) otherlv_4= '>' ) ;
    public final EObject ruleDirectionStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        Enumerator lv_direction_2_0 = null;



        	enterRule();

        try {
            // InternalRinform.g:1179:2: ( (otherlv_0= '<' ( ( ruleText ) ) ( (lv_direction_2_0= ruleDirection ) ) ( ( ruleText ) ) otherlv_4= '>' ) )
            // InternalRinform.g:1180:2: (otherlv_0= '<' ( ( ruleText ) ) ( (lv_direction_2_0= ruleDirection ) ) ( ( ruleText ) ) otherlv_4= '>' )
            {
            // InternalRinform.g:1180:2: (otherlv_0= '<' ( ( ruleText ) ) ( (lv_direction_2_0= ruleDirection ) ) ( ( ruleText ) ) otherlv_4= '>' )
            // InternalRinform.g:1181:3: otherlv_0= '<' ( ( ruleText ) ) ( (lv_direction_2_0= ruleDirection ) ) ( ( ruleText ) ) otherlv_4= '>'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getDirectionStatementAccess().getLessThanSignKeyword_0());
            		
            // InternalRinform.g:1185:3: ( ( ruleText ) )
            // InternalRinform.g:1186:4: ( ruleText )
            {
            // InternalRinform.g:1186:4: ( ruleText )
            // InternalRinform.g:1187:5: ruleText
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

            // InternalRinform.g:1201:3: ( (lv_direction_2_0= ruleDirection ) )
            // InternalRinform.g:1202:4: (lv_direction_2_0= ruleDirection )
            {
            // InternalRinform.g:1202:4: (lv_direction_2_0= ruleDirection )
            // InternalRinform.g:1203:5: lv_direction_2_0= ruleDirection
            {

            					newCompositeNode(grammarAccess.getDirectionStatementAccess().getDirectionDirectionEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_21);
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

            // InternalRinform.g:1220:3: ( ( ruleText ) )
            // InternalRinform.g:1221:4: ( ruleText )
            {
            // InternalRinform.g:1221:4: ( ruleText )
            // InternalRinform.g:1222:5: ruleText
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDirectionStatementRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDirectionStatementAccess().getRoom2RoomDeclarationCrossReference_3_0());
            				
            pushFollow(FOLLOW_22);
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
    // InternalRinform.g:1244:1: entryRuleText returns [String current=null] : iv_ruleText= ruleText EOF ;
    public final String entryRuleText() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleText = null;


        try {
            // InternalRinform.g:1244:44: (iv_ruleText= ruleText EOF )
            // InternalRinform.g:1245:2: iv_ruleText= ruleText EOF
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
    // InternalRinform.g:1251:1: ruleText returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_WS_1= RULE_WS | this_SYMBOL_2= ruleSYMBOL )+ ;
    public final AntlrDatatypeRuleToken ruleText() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_WS_1=null;
        AntlrDatatypeRuleToken this_SYMBOL_2 = null;



        	enterRule();

        try {
            // InternalRinform.g:1257:2: ( (this_ID_0= RULE_ID | this_WS_1= RULE_WS | this_SYMBOL_2= ruleSYMBOL )+ )
            // InternalRinform.g:1258:2: (this_ID_0= RULE_ID | this_WS_1= RULE_WS | this_SYMBOL_2= ruleSYMBOL )+
            {
            // InternalRinform.g:1258:2: (this_ID_0= RULE_ID | this_WS_1= RULE_WS | this_SYMBOL_2= ruleSYMBOL )+
            int cnt16=0;
            loop16:
            do {
                int alt16=4;
                alt16 = dfa16.predict(input);
                switch (alt16) {
            	case 1 :
            	    // InternalRinform.g:1259:3: this_ID_0= RULE_ID
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            	    			current.merge(this_ID_0);
            	    		

            	    			newLeafNode(this_ID_0, grammarAccess.getTextAccess().getIDTerminalRuleCall_0());
            	    		

            	    }
            	    break;
            	case 2 :
            	    // InternalRinform.g:1267:3: this_WS_1= RULE_WS
            	    {
            	    this_WS_1=(Token)match(input,RULE_WS,FOLLOW_3); 

            	    			current.merge(this_WS_1);
            	    		

            	    			newLeafNode(this_WS_1, grammarAccess.getTextAccess().getWSTerminalRuleCall_1());
            	    		

            	    }
            	    break;
            	case 3 :
            	    // InternalRinform.g:1275:3: this_SYMBOL_2= ruleSYMBOL
            	    {

            	    			newCompositeNode(grammarAccess.getTextAccess().getSYMBOLParserRuleCall_2());
            	    		
            	    pushFollow(FOLLOW_3);
            	    this_SYMBOL_2=ruleSYMBOL();

            	    state._fsp--;


            	    			current.merge(this_SYMBOL_2);
            	    		

            	    			afterParserOrEnumRuleCall();
            	    		

            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
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
    // InternalRinform.g:1289:1: entryRuleWords returns [EObject current=null] : iv_ruleWords= ruleWords EOF ;
    public final EObject entryRuleWords() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWords = null;


        try {
            // InternalRinform.g:1289:46: (iv_ruleWords= ruleWords EOF )
            // InternalRinform.g:1290:2: iv_ruleWords= ruleWords EOF
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
    // InternalRinform.g:1296:1: ruleWords returns [EObject current=null] : ( (lv_words_0_0= ruleText ) )+ ;
    public final EObject ruleWords() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_words_0_0 = null;



        	enterRule();

        try {
            // InternalRinform.g:1302:2: ( ( (lv_words_0_0= ruleText ) )+ )
            // InternalRinform.g:1303:2: ( (lv_words_0_0= ruleText ) )+
            {
            // InternalRinform.g:1303:2: ( (lv_words_0_0= ruleText ) )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                alt17 = dfa17.predict(input);
                switch (alt17) {
            	case 1 :
            	    // InternalRinform.g:1304:3: (lv_words_0_0= ruleText )
            	    {
            	    // InternalRinform.g:1304:3: (lv_words_0_0= ruleText )
            	    // InternalRinform.g:1305:4: lv_words_0_0= ruleText
            	    {

            	    				newCompositeNode(grammarAccess.getWordsAccess().getWordsTextParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
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
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
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
    // InternalRinform.g:1325:1: entryRuleSYMBOL returns [String current=null] : iv_ruleSYMBOL= ruleSYMBOL EOF ;
    public final String entryRuleSYMBOL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSYMBOL = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalRinform.g:1327:2: (iv_ruleSYMBOL= ruleSYMBOL EOF )
            // InternalRinform.g:1328:2: iv_ruleSYMBOL= ruleSYMBOL EOF
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
    // InternalRinform.g:1337:1: ruleSYMBOL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '.' | kw= ',' | kw= ';' | kw= ':' | kw= '-' | kw= '!' | kw= '?' | kw= '\\'' | kw= '(' | kw= ')' | kw= '\"' ) ;
    public final AntlrDatatypeRuleToken ruleSYMBOL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalRinform.g:1344:2: ( (kw= '.' | kw= ',' | kw= ';' | kw= ':' | kw= '-' | kw= '!' | kw= '?' | kw= '\\'' | kw= '(' | kw= ')' | kw= '\"' ) )
            // InternalRinform.g:1345:2: (kw= '.' | kw= ',' | kw= ';' | kw= ':' | kw= '-' | kw= '!' | kw= '?' | kw= '\\'' | kw= '(' | kw= ')' | kw= '\"' )
            {
            // InternalRinform.g:1345:2: (kw= '.' | kw= ',' | kw= ';' | kw= ':' | kw= '-' | kw= '!' | kw= '?' | kw= '\\'' | kw= '(' | kw= ')' | kw= '\"' )
            int alt18=11;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt18=1;
                }
                break;
            case 31:
                {
                alt18=2;
                }
                break;
            case 32:
                {
                alt18=3;
                }
                break;
            case 33:
                {
                alt18=4;
                }
                break;
            case 34:
                {
                alt18=5;
                }
                break;
            case 35:
                {
                alt18=6;
                }
                break;
            case 36:
                {
                alt18=7;
                }
                break;
            case 37:
                {
                alt18=8;
                }
                break;
            case 38:
                {
                alt18=9;
                }
                break;
            case 39:
                {
                alt18=10;
                }
                break;
            case 40:
                {
                alt18=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalRinform.g:1346:3: kw= '.'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSYMBOLAccess().getFullStopKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRinform.g:1352:3: kw= ','
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSYMBOLAccess().getCommaKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalRinform.g:1358:3: kw= ';'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSYMBOLAccess().getSemicolonKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalRinform.g:1364:3: kw= ':'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSYMBOLAccess().getColonKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalRinform.g:1370:3: kw= '-'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSYMBOLAccess().getHyphenMinusKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalRinform.g:1376:3: kw= '!'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSYMBOLAccess().getExclamationMarkKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalRinform.g:1382:3: kw= '?'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSYMBOLAccess().getQuestionMarkKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalRinform.g:1388:3: kw= '\\''
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSYMBOLAccess().getApostropheKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalRinform.g:1394:3: kw= '('
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSYMBOLAccess().getLeftParenthesisKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalRinform.g:1400:3: kw= ')'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSYMBOLAccess().getRightParenthesisKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalRinform.g:1406:3: kw= '\"'
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
    // InternalRinform.g:1418:1: ruleDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'South' ) | (enumLiteral_1= 'North' ) | (enumLiteral_2= 'East' ) | (enumLiteral_3= 'West' ) | (enumLiteral_4= 'Below' ) | (enumLiteral_5= 'Above' ) ) ;
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
            // InternalRinform.g:1424:2: ( ( (enumLiteral_0= 'South' ) | (enumLiteral_1= 'North' ) | (enumLiteral_2= 'East' ) | (enumLiteral_3= 'West' ) | (enumLiteral_4= 'Below' ) | (enumLiteral_5= 'Above' ) ) )
            // InternalRinform.g:1425:2: ( (enumLiteral_0= 'South' ) | (enumLiteral_1= 'North' ) | (enumLiteral_2= 'East' ) | (enumLiteral_3= 'West' ) | (enumLiteral_4= 'Below' ) | (enumLiteral_5= 'Above' ) )
            {
            // InternalRinform.g:1425:2: ( (enumLiteral_0= 'South' ) | (enumLiteral_1= 'North' ) | (enumLiteral_2= 'East' ) | (enumLiteral_3= 'West' ) | (enumLiteral_4= 'Below' ) | (enumLiteral_5= 'Above' ) )
            int alt19=6;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt19=1;
                }
                break;
            case 42:
                {
                alt19=2;
                }
                break;
            case 43:
                {
                alt19=3;
                }
                break;
            case 44:
                {
                alt19=4;
                }
                break;
            case 45:
                {
                alt19=5;
                }
                break;
            case 46:
                {
                alt19=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalRinform.g:1426:3: (enumLiteral_0= 'South' )
                    {
                    // InternalRinform.g:1426:3: (enumLiteral_0= 'South' )
                    // InternalRinform.g:1427:4: enumLiteral_0= 'South'
                    {
                    enumLiteral_0=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getDirectionAccess().getSouthEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDirectionAccess().getSouthEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRinform.g:1434:3: (enumLiteral_1= 'North' )
                    {
                    // InternalRinform.g:1434:3: (enumLiteral_1= 'North' )
                    // InternalRinform.g:1435:4: enumLiteral_1= 'North'
                    {
                    enumLiteral_1=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getDirectionAccess().getNorthEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDirectionAccess().getNorthEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRinform.g:1442:3: (enumLiteral_2= 'East' )
                    {
                    // InternalRinform.g:1442:3: (enumLiteral_2= 'East' )
                    // InternalRinform.g:1443:4: enumLiteral_2= 'East'
                    {
                    enumLiteral_2=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getDirectionAccess().getEastEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDirectionAccess().getEastEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRinform.g:1450:3: (enumLiteral_3= 'West' )
                    {
                    // InternalRinform.g:1450:3: (enumLiteral_3= 'West' )
                    // InternalRinform.g:1451:4: enumLiteral_3= 'West'
                    {
                    enumLiteral_3=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getDirectionAccess().getWestEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDirectionAccess().getWestEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRinform.g:1458:3: (enumLiteral_4= 'Below' )
                    {
                    // InternalRinform.g:1458:3: (enumLiteral_4= 'Below' )
                    // InternalRinform.g:1459:4: enumLiteral_4= 'Below'
                    {
                    enumLiteral_4=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getDirectionAccess().getBelowEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getDirectionAccess().getBelowEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalRinform.g:1466:3: (enumLiteral_5= 'Above' )
                    {
                    // InternalRinform.g:1466:3: (enumLiteral_5= 'Above' )
                    // InternalRinform.g:1467:4: enumLiteral_5= 'Above'
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
    protected DFA5 dfa5 = new DFA5(this);
    protected DFA7 dfa7 = new DFA7(this);
    protected DFA10 dfa10 = new DFA10(this);
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA17 dfa17 = new DFA17(this);
    static final String dfa_1s = "\32\uffff";
    static final String dfa_2s = "\1\4\3\uffff\1\4\5\uffff\15\4\3\uffff";
    static final String dfa_3s = "\1\50\3\uffff\1\50\5\uffff\15\50\3\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\7\1\10\1\11\1\12\1\13\15\uffff\1\6\1\4\1\5";
    static final String dfa_5s = "\32\uffff}>";
    static final String[] dfa_6s = {
            "\2\11\5\uffff\1\1\1\uffff\1\4\1\5\4\uffff\1\2\1\uffff\1\2\2\uffff\1\6\1\3\1\uffff\1\7\1\10\1\uffff\13\11",
            "",
            "",
            "",
            "\1\12\1\13\30\uffff\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26",
            "",
            "",
            "",
            "",
            "",
            "\1\12\1\13\10\uffff\1\30\11\uffff\1\31\2\uffff\1\27\2\uffff\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26",
            "\1\12\1\13\10\uffff\1\30\11\uffff\1\31\2\uffff\1\27\2\uffff\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26",
            "\1\12\1\13\10\uffff\1\30\11\uffff\1\31\2\uffff\1\27\2\uffff\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26",
            "\1\12\1\13\10\uffff\1\30\11\uffff\1\31\2\uffff\1\27\2\uffff\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26",
            "\1\12\1\13\10\uffff\1\30\11\uffff\1\31\2\uffff\1\27\2\uffff\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26",
            "\1\12\1\13\10\uffff\1\30\11\uffff\1\31\2\uffff\1\27\2\uffff\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26",
            "\1\12\1\13\10\uffff\1\30\11\uffff\1\31\2\uffff\1\27\2\uffff\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26",
            "\1\12\1\13\10\uffff\1\30\11\uffff\1\31\2\uffff\1\27\2\uffff\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26",
            "\1\12\1\13\10\uffff\1\30\11\uffff\1\31\2\uffff\1\27\2\uffff\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26",
            "\1\12\1\13\10\uffff\1\30\11\uffff\1\31\2\uffff\1\27\2\uffff\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26",
            "\1\12\1\13\10\uffff\1\30\11\uffff\1\31\2\uffff\1\27\2\uffff\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26",
            "\1\12\1\13\10\uffff\1\30\11\uffff\1\31\2\uffff\1\27\2\uffff\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26",
            "\1\12\1\13\10\uffff\1\30\11\uffff\1\31\2\uffff\1\27\2\uffff\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26",
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
            return "115:2: (this_RoomDeclaration_0= ruleRoomDeclaration | this_ItemDeclaration_1= ruleItemDeclaration | this_CharacterDeclaration_2= ruleCharacterDeclaration | this_RoomDescription_3= ruleRoomDescription | this_ItemDescription_4= ruleItemDescription | this_CharacterDescription_5= ruleCharacterDescription | this_RoomAlias_6= ruleRoomAlias | this_ItemAlias_7= ruleItemAlias | this_CharacterAlias_8= ruleCharacterAlias | this_DirectionStatement_9= ruleDirectionStatement | this_Words_10= ruleWords )";
        }
    }
    static final String dfa_7s = "\22\uffff";
    static final String dfa_8s = "\17\uffff\1\21\2\uffff";
    static final String dfa_9s = "\1\17\17\4\2\uffff";
    static final String dfa_10s = "\1\17\17\50\2\uffff";
    static final String dfa_11s = "\20\uffff\1\1\1\2";
    static final String dfa_12s = "\22\uffff}>";
    static final String[] dfa_13s = {
            "\1\1",
            "\1\2\1\3\30\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16",
            "\1\2\1\3\12\uffff\1\17\15\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16",
            "\1\2\1\3\12\uffff\1\17\15\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16",
            "\1\2\1\3\12\uffff\1\17\15\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16",
            "\1\2\1\3\12\uffff\1\17\15\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16",
            "\1\2\1\3\12\uffff\1\17\15\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16",
            "\1\2\1\3\12\uffff\1\17\15\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16",
            "\1\2\1\3\12\uffff\1\17\15\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16",
            "\1\2\1\3\12\uffff\1\17\15\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16",
            "\1\2\1\3\12\uffff\1\17\15\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16",
            "\1\2\1\3\12\uffff\1\17\15\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16",
            "\1\2\1\3\12\uffff\1\17\15\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16",
            "\1\2\1\3\12\uffff\1\17\15\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16",
            "\1\2\1\3\12\uffff\1\17\15\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16",
            "\2\21\5\uffff\1\21\1\uffff\2\21\3\uffff\1\20\1\21\1\uffff\1\21\2\uffff\2\21\1\uffff\2\21\1\uffff\13\21",
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

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "()* loopback of 385:3: (otherlv_5= '[' ( (lv_aliases_6_0= ruleText ) )+ otherlv_7= ']' otherlv_8= '=' )*";
        }
    }
    static final String dfa_14s = "\23\uffff";
    static final String dfa_15s = "\1\23\1\4\1\uffff\15\4\1\16\2\uffff";
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
            "\1\21\10\uffff\1\22",
            "",
            ""
    };

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[][] dfa_19 = unpackEncodedStringArray(dfa_19s);

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_14;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "465:2: (this_ItemInRoomDeclaration_0= ruleItemInRoomDeclaration | this_ContainerDeclaration_1= ruleContainerDeclaration | this_ItemInContainerDeclaration_2= ruleItemInContainerDeclaration )";
        }
    }
    static final String dfa_20s = "\17\uffff\1\20\2\uffff";
    static final String dfa_21s = "\20\uffff\1\2\1\1";
    static final String[] dfa_22s = {
            "\1\1",
            "\1\2\1\3\30\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16",
            "\1\2\1\3\12\uffff\1\17\15\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16",
            "\1\2\1\3\12\uffff\1\17\15\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16",
            "\1\2\1\3\12\uffff\1\17\15\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16",
            "\1\2\1\3\12\uffff\1\17\15\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16",
            "\1\2\1\3\12\uffff\1\17\15\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16",
            "\1\2\1\3\12\uffff\1\17\15\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16",
            "\1\2\1\3\12\uffff\1\17\15\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16",
            "\1\2\1\3\12\uffff\1\17\15\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16",
            "\1\2\1\3\12\uffff\1\17\15\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16",
            "\1\2\1\3\12\uffff\1\17\15\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16",
            "\1\2\1\3\12\uffff\1\17\15\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16",
            "\1\2\1\3\12\uffff\1\17\15\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16",
            "\1\2\1\3\12\uffff\1\17\15\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16",
            "\2\20\5\uffff\1\20\1\uffff\2\20\3\uffff\1\21\1\20\1\uffff\1\20\2\uffff\2\20\1\uffff\2\20\1\uffff\13\20",
            "",
            ""
    };
    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final short[][] dfa_22 = unpackEncodedStringArray(dfa_22s);

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = dfa_7;
            this.eof = dfa_20;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_21;
            this.special = dfa_12;
            this.transition = dfa_22;
        }
        public String getDescription() {
            return "()* loopback of 839:3: (otherlv_5= '[' ( (lv_aliases_6_0= ruleText ) )+ otherlv_7= ']' otherlv_8= '=' )*";
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = dfa_7;
            this.eof = dfa_20;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_21;
            this.special = dfa_12;
            this.transition = dfa_22;
        }
        public String getDescription() {
            return "()* loopback of 1100:3: (otherlv_5= '[' ( (lv_aliases_6_0= ruleText ) )+ otherlv_7= ']' otherlv_8= '=' )*";
        }
    }
    static final String dfa_23s = "\17\uffff";
    static final String dfa_24s = "\1\1\16\uffff";
    static final String dfa_25s = "\1\4\16\uffff";
    static final String dfa_26s = "\1\56\16\uffff";
    static final String dfa_27s = "\1\uffff\1\4\1\1\1\2\13\3";
    static final String dfa_28s = "\17\uffff}>";
    static final String[] dfa_29s = {
            "\1\2\1\3\5\uffff\4\1\1\uffff\1\1\2\uffff\4\1\1\uffff\6\1\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\6\1",
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

    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final char[] dfa_25 = DFA.unpackEncodedStringToUnsignedChars(dfa_25s);
    static final char[] dfa_26 = DFA.unpackEncodedStringToUnsignedChars(dfa_26s);
    static final short[] dfa_27 = DFA.unpackEncodedString(dfa_27s);
    static final short[] dfa_28 = DFA.unpackEncodedString(dfa_28s);
    static final short[][] dfa_29 = unpackEncodedStringArray(dfa_29s);

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = dfa_23;
            this.eof = dfa_24;
            this.min = dfa_25;
            this.max = dfa_26;
            this.accept = dfa_27;
            this.special = dfa_28;
            this.transition = dfa_29;
        }
        public String getDescription() {
            return "()+ loopback of 1258:2: (this_ID_0= RULE_ID | this_WS_1= RULE_WS | this_SYMBOL_2= ruleSYMBOL )+";
        }
    }
    static final String dfa_30s = "\1\50\16\uffff";
    static final String dfa_31s = "\1\uffff\1\2\15\1";
    static final String[] dfa_32s = {
            "\1\2\1\3\5\uffff\1\1\1\uffff\2\1\4\uffff\1\1\1\uffff\1\1\2\uffff\2\1\1\uffff\2\1\1\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16",
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
    static final char[] dfa_30 = DFA.unpackEncodedStringToUnsignedChars(dfa_30s);
    static final short[] dfa_31 = DFA.unpackEncodedString(dfa_31s);
    static final short[][] dfa_32 = unpackEncodedStringArray(dfa_32s);

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = dfa_23;
            this.eof = dfa_24;
            this.min = dfa_25;
            this.max = dfa_30;
            this.accept = dfa_31;
            this.special = dfa_28;
            this.transition = dfa_32;
        }
        public String getDescription() {
            return "()+ loopback of 1303:2: ( (lv_words_0_0= ruleText ) )+";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000001FFDB286832L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000001FFDB287830L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000001FFDB286830L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000001FFDB296830L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000001FFDB386830L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000001FFDB686830L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000001FFDF286830L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00007FFFDB286830L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000001FFFB286830L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});

}