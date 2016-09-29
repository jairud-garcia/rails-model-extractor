package co.gruposaberes.model.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import co.gruposaberes.model.services.RailsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalRailsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_CLASS_WORD", "RULE_SPACE", "RULE_SL_COMMENT", "RULE_ID", "RULE_SYMBOL", "RULE_STRING", "RULE_INT", "RULE_INT_METHOD", "RULE_PARENTHESIS_BLOCK", "RULE_ARRAY_BLOCK", "RULE_BRACKET_BLOCK", "RULE_DO_BLOCK_PARAMETERS", "RULE_BS", "RULE_COMMA", "RULE_DECIMAL", "RULE_REGEXP", "RULE_HAS_MANY_WORD", "RULE_HAS_ONE_WORD", "RULE_HAS_AND_BELONGS_TO_MANY_WORD", "RULE_BELONGS_TO_WORD", "RULE_DEF_WORD", "RULE_SET_TABLE_NAME", "RULE_MODULE_WORD", "RULE_ML_COMMENT", "RULE_REQUIRE", "RULE_ANY_OTHER", "'<'", "'::'", "'.'", "': '", "'?'", "'+'", "'-'", "'*'", "'/'", "'%'", "'**'", "'='", "'~'", "'|'", "'||'", "'&'", "'&&'", "'=='", "'!'", "'<<'", "'<=>'", "'>'", "'..'", "'...'", "':'", "'=>'"
    };
    public static final int T__50=50;
    public static final int RULE_HAS_MANY_WORD=20;
    public static final int RULE_DO_BLOCK_PARAMETERS=15;
    public static final int RULE_PARENTHESIS_BLOCK=12;
    public static final int RULE_HAS_ONE_WORD=21;
    public static final int T__55=55;
    public static final int RULE_SPACE=5;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=7;
    public static final int RULE_COMMA=17;
    public static final int RULE_DECIMAL=18;
    public static final int RULE_SET_TABLE_NAME=25;
    public static final int RULE_MODULE_WORD=26;
    public static final int RULE_INT=10;
    public static final int RULE_ML_COMMENT=27;
    public static final int RULE_DEF_WORD=24;
    public static final int RULE_REQUIRE=28;
    public static final int RULE_CLASS_WORD=4;
    public static final int RULE_STRING=9;
    public static final int RULE_SL_COMMENT=6;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int RULE_HAS_AND_BELONGS_TO_MANY_WORD=22;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int RULE_REGEXP=19;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ARRAY_BLOCK=13;
    public static final int RULE_ANY_OTHER=29;
    public static final int RULE_BS=16;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_BRACKET_BLOCK=14;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_SYMBOL=8;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int RULE_INT_METHOD=11;
    public static final int T__41=41;
    public static final int RULE_BELONGS_TO_WORD=23;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalRailsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRailsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRailsParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRails.g"; }



     	private RailsGrammarAccess grammarAccess;
     	
        public InternalRailsParser(TokenStream input, RailsGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Class";	
       	}
       	
       	@Override
       	protected RailsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleClass"
    // InternalRails.g:67:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // InternalRails.g:68:2: (iv_ruleClass= ruleClass EOF )
            // InternalRails.g:69:2: iv_ruleClass= ruleClass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleClass=ruleClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClass; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // InternalRails.g:76:1: ruleClass returns [EObject current=null] : (this_CLASS_WORD_0= RULE_CLASS_WORD (this_SPACE_1= RULE_SPACE )* ( (lv_name_2_0= ruleNamespacedModuleName ) ) ( (this_SPACE_3= RULE_SPACE )* otherlv_4= '<' (this_SPACE_5= RULE_SPACE )* ( (lv_superType_6_0= ruleNamespacedModuleName ) ) )? (this_SPACE_7= RULE_SPACE )* ( (lv_classElements_8_0= ruleClassElement ) )* ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token this_CLASS_WORD_0=null;
        Token this_SPACE_1=null;
        Token this_SPACE_3=null;
        Token otherlv_4=null;
        Token this_SPACE_5=null;
        Token this_SPACE_7=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_superType_6_0 = null;

        EObject lv_classElements_8_0 = null;


         enterRule(); 
            
        try {
            // InternalRails.g:79:28: ( (this_CLASS_WORD_0= RULE_CLASS_WORD (this_SPACE_1= RULE_SPACE )* ( (lv_name_2_0= ruleNamespacedModuleName ) ) ( (this_SPACE_3= RULE_SPACE )* otherlv_4= '<' (this_SPACE_5= RULE_SPACE )* ( (lv_superType_6_0= ruleNamespacedModuleName ) ) )? (this_SPACE_7= RULE_SPACE )* ( (lv_classElements_8_0= ruleClassElement ) )* ) )
            // InternalRails.g:80:1: (this_CLASS_WORD_0= RULE_CLASS_WORD (this_SPACE_1= RULE_SPACE )* ( (lv_name_2_0= ruleNamespacedModuleName ) ) ( (this_SPACE_3= RULE_SPACE )* otherlv_4= '<' (this_SPACE_5= RULE_SPACE )* ( (lv_superType_6_0= ruleNamespacedModuleName ) ) )? (this_SPACE_7= RULE_SPACE )* ( (lv_classElements_8_0= ruleClassElement ) )* )
            {
            // InternalRails.g:80:1: (this_CLASS_WORD_0= RULE_CLASS_WORD (this_SPACE_1= RULE_SPACE )* ( (lv_name_2_0= ruleNamespacedModuleName ) ) ( (this_SPACE_3= RULE_SPACE )* otherlv_4= '<' (this_SPACE_5= RULE_SPACE )* ( (lv_superType_6_0= ruleNamespacedModuleName ) ) )? (this_SPACE_7= RULE_SPACE )* ( (lv_classElements_8_0= ruleClassElement ) )* )
            // InternalRails.g:80:2: this_CLASS_WORD_0= RULE_CLASS_WORD (this_SPACE_1= RULE_SPACE )* ( (lv_name_2_0= ruleNamespacedModuleName ) ) ( (this_SPACE_3= RULE_SPACE )* otherlv_4= '<' (this_SPACE_5= RULE_SPACE )* ( (lv_superType_6_0= ruleNamespacedModuleName ) ) )? (this_SPACE_7= RULE_SPACE )* ( (lv_classElements_8_0= ruleClassElement ) )*
            {
            this_CLASS_WORD_0=(Token)match(input,RULE_CLASS_WORD,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_CLASS_WORD_0, grammarAccess.getClassAccess().getCLASS_WORDTerminalRuleCall_0()); 
                  
            }
            // InternalRails.g:84:1: (this_SPACE_1= RULE_SPACE )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_SPACE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRails.g:84:2: this_SPACE_1= RULE_SPACE
            	    {
            	    this_SPACE_1=(Token)match(input,RULE_SPACE,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SPACE_1, grammarAccess.getClassAccess().getSPACETerminalRuleCall_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalRails.g:88:3: ( (lv_name_2_0= ruleNamespacedModuleName ) )
            // InternalRails.g:89:1: (lv_name_2_0= ruleNamespacedModuleName )
            {
            // InternalRails.g:89:1: (lv_name_2_0= ruleNamespacedModuleName )
            // InternalRails.g:90:3: lv_name_2_0= ruleNamespacedModuleName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getClassAccess().getNameNamespacedModuleNameParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleNamespacedModuleName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getClassRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"co.gruposaberes.model.Rails.NamespacedModuleName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalRails.g:106:2: ( (this_SPACE_3= RULE_SPACE )* otherlv_4= '<' (this_SPACE_5= RULE_SPACE )* ( (lv_superType_6_0= ruleNamespacedModuleName ) ) )?
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalRails.g:106:3: (this_SPACE_3= RULE_SPACE )* otherlv_4= '<' (this_SPACE_5= RULE_SPACE )* ( (lv_superType_6_0= ruleNamespacedModuleName ) )
                    {
                    // InternalRails.g:106:3: (this_SPACE_3= RULE_SPACE )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==RULE_SPACE) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalRails.g:106:4: this_SPACE_3= RULE_SPACE
                    	    {
                    	    this_SPACE_3=(Token)match(input,RULE_SPACE,FOLLOW_5); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_SPACE_3, grammarAccess.getClassAccess().getSPACETerminalRuleCall_3_0()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,30,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getClassAccess().getLessThanSignKeyword_3_1());
                          
                    }
                    // InternalRails.g:114:1: (this_SPACE_5= RULE_SPACE )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==RULE_SPACE) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalRails.g:114:2: this_SPACE_5= RULE_SPACE
                    	    {
                    	    this_SPACE_5=(Token)match(input,RULE_SPACE,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_SPACE_5, grammarAccess.getClassAccess().getSPACETerminalRuleCall_3_2()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    // InternalRails.g:118:3: ( (lv_superType_6_0= ruleNamespacedModuleName ) )
                    // InternalRails.g:119:1: (lv_superType_6_0= ruleNamespacedModuleName )
                    {
                    // InternalRails.g:119:1: (lv_superType_6_0= ruleNamespacedModuleName )
                    // InternalRails.g:120:3: lv_superType_6_0= ruleNamespacedModuleName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getClassAccess().getSuperTypeNamespacedModuleNameParserRuleCall_3_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_6);
                    lv_superType_6_0=ruleNamespacedModuleName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getClassRule());
                      	        }
                             		set(
                             			current, 
                             			"superType",
                              		lv_superType_6_0, 
                              		"co.gruposaberes.model.Rails.NamespacedModuleName");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalRails.g:136:4: (this_SPACE_7= RULE_SPACE )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_SPACE) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalRails.g:136:5: this_SPACE_7= RULE_SPACE
            	    {
            	    this_SPACE_7=(Token)match(input,RULE_SPACE,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SPACE_7, grammarAccess.getClassAccess().getSPACETerminalRuleCall_4()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalRails.g:140:3: ( (lv_classElements_8_0= ruleClassElement ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=RULE_SL_COMMENT && LA6_0<=RULE_ARRAY_BLOCK)||(LA6_0>=RULE_HAS_MANY_WORD && LA6_0<=RULE_DEF_WORD)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalRails.g:141:1: (lv_classElements_8_0= ruleClassElement )
            	    {
            	    // InternalRails.g:141:1: (lv_classElements_8_0= ruleClassElement )
            	    // InternalRails.g:142:3: lv_classElements_8_0= ruleClassElement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getClassAccess().getClassElementsClassElementParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_6);
            	    lv_classElements_8_0=ruleClassElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getClassRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"classElements",
            	              		lv_classElements_8_0, 
            	              		"co.gruposaberes.model.Rails.ClassElement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleClassElement"
    // InternalRails.g:166:1: entryRuleClassElement returns [EObject current=null] : iv_ruleClassElement= ruleClassElement EOF ;
    public final EObject entryRuleClassElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassElement = null;


        try {
            // InternalRails.g:167:2: (iv_ruleClassElement= ruleClassElement EOF )
            // InternalRails.g:168:2: iv_ruleClassElement= ruleClassElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassElementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleClassElement=ruleClassElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClassElement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleClassElement"


    // $ANTLR start "ruleClassElement"
    // InternalRails.g:175:1: ruleClassElement returns [EObject current=null] : (this_Method_0= ruleMethod | this_Relationship_1= ruleRelationship | ruleOperationsChain | this_SL_COMMENT_3= RULE_SL_COMMENT ) ;
    public final EObject ruleClassElement() throws RecognitionException {
        EObject current = null;

        Token this_SL_COMMENT_3=null;
        EObject this_Method_0 = null;

        EObject this_Relationship_1 = null;


         enterRule(); 
            
        try {
            // InternalRails.g:178:28: ( (this_Method_0= ruleMethod | this_Relationship_1= ruleRelationship | ruleOperationsChain | this_SL_COMMENT_3= RULE_SL_COMMENT ) )
            // InternalRails.g:179:1: (this_Method_0= ruleMethod | this_Relationship_1= ruleRelationship | ruleOperationsChain | this_SL_COMMENT_3= RULE_SL_COMMENT )
            {
            // InternalRails.g:179:1: (this_Method_0= ruleMethod | this_Relationship_1= ruleRelationship | ruleOperationsChain | this_SL_COMMENT_3= RULE_SL_COMMENT )
            int alt7=4;
            switch ( input.LA(1) ) {
            case RULE_DEF_WORD:
                {
                alt7=1;
                }
                break;
            case RULE_HAS_MANY_WORD:
            case RULE_HAS_ONE_WORD:
            case RULE_HAS_AND_BELONGS_TO_MANY_WORD:
            case RULE_BELONGS_TO_WORD:
                {
                alt7=2;
                }
                break;
            case RULE_ID:
            case RULE_SYMBOL:
            case RULE_STRING:
            case RULE_INT:
            case RULE_INT_METHOD:
            case RULE_PARENTHESIS_BLOCK:
            case RULE_ARRAY_BLOCK:
                {
                alt7=3;
                }
                break;
            case RULE_SL_COMMENT:
                {
                alt7=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalRails.g:180:5: this_Method_0= ruleMethod
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getClassElementAccess().getMethodParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_Method_0=ruleMethod();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Method_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalRails.g:190:5: this_Relationship_1= ruleRelationship
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getClassElementAccess().getRelationshipParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_Relationship_1=ruleRelationship();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Relationship_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalRails.g:200:5: ruleOperationsChain
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getClassElementAccess().getOperationsChainParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    ruleOperationsChain();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // InternalRails.g:208:6: this_SL_COMMENT_3= RULE_SL_COMMENT
                    {
                    this_SL_COMMENT_3=(Token)match(input,RULE_SL_COMMENT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SL_COMMENT_3, grammarAccess.getClassElementAccess().getSL_COMMENTTerminalRuleCall_3()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleClassElement"


    // $ANTLR start "entryRuleNamespacedModuleName"
    // InternalRails.g:220:1: entryRuleNamespacedModuleName returns [String current=null] : iv_ruleNamespacedModuleName= ruleNamespacedModuleName EOF ;
    public final String entryRuleNamespacedModuleName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNamespacedModuleName = null;


        try {
            // InternalRails.g:221:2: (iv_ruleNamespacedModuleName= ruleNamespacedModuleName EOF )
            // InternalRails.g:222:2: iv_ruleNamespacedModuleName= ruleNamespacedModuleName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNamespacedModuleNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNamespacedModuleName=ruleNamespacedModuleName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNamespacedModuleName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNamespacedModuleName"


    // $ANTLR start "ruleNamespacedModuleName"
    // InternalRails.g:229:1: ruleNamespacedModuleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID kw= '::' )* this_ID_2= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleNamespacedModuleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // InternalRails.g:232:28: ( ( (this_ID_0= RULE_ID kw= '::' )* this_ID_2= RULE_ID ) )
            // InternalRails.g:233:1: ( (this_ID_0= RULE_ID kw= '::' )* this_ID_2= RULE_ID )
            {
            // InternalRails.g:233:1: ( (this_ID_0= RULE_ID kw= '::' )* this_ID_2= RULE_ID )
            // InternalRails.g:233:2: (this_ID_0= RULE_ID kw= '::' )* this_ID_2= RULE_ID
            {
            // InternalRails.g:233:2: (this_ID_0= RULE_ID kw= '::' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1==31) ) {
                        alt8=1;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // InternalRails.g:233:7: this_ID_0= RULE_ID kw= '::'
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_0, grammarAccess.getNamespacedModuleNameAccess().getIDTerminalRuleCall_0_0()); 
            	          
            	    }
            	    kw=(Token)match(input,31,FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getNamespacedModuleNameAccess().getColonColonKeyword_0_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            this_ID_2=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_2);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_2, grammarAccess.getNamespacedModuleNameAccess().getIDTerminalRuleCall_1()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleNamespacedModuleName"


    // $ANTLR start "entryRuleMethodChainCall"
    // InternalRails.g:261:1: entryRuleMethodChainCall returns [String current=null] : iv_ruleMethodChainCall= ruleMethodChainCall EOF ;
    public final String entryRuleMethodChainCall() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMethodChainCall = null;


        try {
            // InternalRails.g:262:2: (iv_ruleMethodChainCall= ruleMethodChainCall EOF )
            // InternalRails.g:263:2: iv_ruleMethodChainCall= ruleMethodChainCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMethodChainCallRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMethodChainCall=ruleMethodChainCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMethodChainCall.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMethodChainCall"


    // $ANTLR start "ruleMethodChainCall"
    // InternalRails.g:270:1: ruleMethodChainCall returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_SYMBOL_0= RULE_SYMBOL | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT | this_INT_METHOD_3= RULE_INT_METHOD | this_PARENTHESIS_BLOCK_4= RULE_PARENTHESIS_BLOCK | this_ARRAY_BLOCK_5= RULE_ARRAY_BLOCK | this_NamespacedModuleName_6= ruleNamespacedModuleName ) (kw= '.' this_ID_8= RULE_ID (this_PARENTHESIS_BLOCK_9= RULE_PARENTHESIS_BLOCK )? )* (this_SPACE_10= RULE_SPACE )* (this_MethodCallParameters_11= ruleMethodCallParameters )? ( ( RULE_SPACE )=>this_SPACE_12= RULE_SPACE )* (this_BRACKET_BLOCK_13= RULE_BRACKET_BLOCK )? ( ( RULE_SPACE )=>this_SPACE_14= RULE_SPACE )* (this_DO_BLOCK_PARAMETERS_15= RULE_DO_BLOCK_PARAMETERS )? ( ( RULE_SPACE )=>this_SPACE_16= RULE_SPACE )* ( ( RULE_BS )=>this_BS_17= RULE_BS )? ) ;
    public final AntlrDatatypeRuleToken ruleMethodChainCall() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SYMBOL_0=null;
        Token this_STRING_1=null;
        Token this_INT_2=null;
        Token this_INT_METHOD_3=null;
        Token this_PARENTHESIS_BLOCK_4=null;
        Token this_ARRAY_BLOCK_5=null;
        Token kw=null;
        Token this_ID_8=null;
        Token this_PARENTHESIS_BLOCK_9=null;
        Token this_SPACE_10=null;
        Token this_SPACE_12=null;
        Token this_BRACKET_BLOCK_13=null;
        Token this_SPACE_14=null;
        Token this_DO_BLOCK_PARAMETERS_15=null;
        Token this_SPACE_16=null;
        Token this_BS_17=null;
        AntlrDatatypeRuleToken this_NamespacedModuleName_6 = null;

        AntlrDatatypeRuleToken this_MethodCallParameters_11 = null;


         enterRule(); 
            
        try {
            // InternalRails.g:273:28: ( ( (this_SYMBOL_0= RULE_SYMBOL | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT | this_INT_METHOD_3= RULE_INT_METHOD | this_PARENTHESIS_BLOCK_4= RULE_PARENTHESIS_BLOCK | this_ARRAY_BLOCK_5= RULE_ARRAY_BLOCK | this_NamespacedModuleName_6= ruleNamespacedModuleName ) (kw= '.' this_ID_8= RULE_ID (this_PARENTHESIS_BLOCK_9= RULE_PARENTHESIS_BLOCK )? )* (this_SPACE_10= RULE_SPACE )* (this_MethodCallParameters_11= ruleMethodCallParameters )? ( ( RULE_SPACE )=>this_SPACE_12= RULE_SPACE )* (this_BRACKET_BLOCK_13= RULE_BRACKET_BLOCK )? ( ( RULE_SPACE )=>this_SPACE_14= RULE_SPACE )* (this_DO_BLOCK_PARAMETERS_15= RULE_DO_BLOCK_PARAMETERS )? ( ( RULE_SPACE )=>this_SPACE_16= RULE_SPACE )* ( ( RULE_BS )=>this_BS_17= RULE_BS )? ) )
            // InternalRails.g:274:1: ( (this_SYMBOL_0= RULE_SYMBOL | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT | this_INT_METHOD_3= RULE_INT_METHOD | this_PARENTHESIS_BLOCK_4= RULE_PARENTHESIS_BLOCK | this_ARRAY_BLOCK_5= RULE_ARRAY_BLOCK | this_NamespacedModuleName_6= ruleNamespacedModuleName ) (kw= '.' this_ID_8= RULE_ID (this_PARENTHESIS_BLOCK_9= RULE_PARENTHESIS_BLOCK )? )* (this_SPACE_10= RULE_SPACE )* (this_MethodCallParameters_11= ruleMethodCallParameters )? ( ( RULE_SPACE )=>this_SPACE_12= RULE_SPACE )* (this_BRACKET_BLOCK_13= RULE_BRACKET_BLOCK )? ( ( RULE_SPACE )=>this_SPACE_14= RULE_SPACE )* (this_DO_BLOCK_PARAMETERS_15= RULE_DO_BLOCK_PARAMETERS )? ( ( RULE_SPACE )=>this_SPACE_16= RULE_SPACE )* ( ( RULE_BS )=>this_BS_17= RULE_BS )? )
            {
            // InternalRails.g:274:1: ( (this_SYMBOL_0= RULE_SYMBOL | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT | this_INT_METHOD_3= RULE_INT_METHOD | this_PARENTHESIS_BLOCK_4= RULE_PARENTHESIS_BLOCK | this_ARRAY_BLOCK_5= RULE_ARRAY_BLOCK | this_NamespacedModuleName_6= ruleNamespacedModuleName ) (kw= '.' this_ID_8= RULE_ID (this_PARENTHESIS_BLOCK_9= RULE_PARENTHESIS_BLOCK )? )* (this_SPACE_10= RULE_SPACE )* (this_MethodCallParameters_11= ruleMethodCallParameters )? ( ( RULE_SPACE )=>this_SPACE_12= RULE_SPACE )* (this_BRACKET_BLOCK_13= RULE_BRACKET_BLOCK )? ( ( RULE_SPACE )=>this_SPACE_14= RULE_SPACE )* (this_DO_BLOCK_PARAMETERS_15= RULE_DO_BLOCK_PARAMETERS )? ( ( RULE_SPACE )=>this_SPACE_16= RULE_SPACE )* ( ( RULE_BS )=>this_BS_17= RULE_BS )? )
            // InternalRails.g:274:2: (this_SYMBOL_0= RULE_SYMBOL | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT | this_INT_METHOD_3= RULE_INT_METHOD | this_PARENTHESIS_BLOCK_4= RULE_PARENTHESIS_BLOCK | this_ARRAY_BLOCK_5= RULE_ARRAY_BLOCK | this_NamespacedModuleName_6= ruleNamespacedModuleName ) (kw= '.' this_ID_8= RULE_ID (this_PARENTHESIS_BLOCK_9= RULE_PARENTHESIS_BLOCK )? )* (this_SPACE_10= RULE_SPACE )* (this_MethodCallParameters_11= ruleMethodCallParameters )? ( ( RULE_SPACE )=>this_SPACE_12= RULE_SPACE )* (this_BRACKET_BLOCK_13= RULE_BRACKET_BLOCK )? ( ( RULE_SPACE )=>this_SPACE_14= RULE_SPACE )* (this_DO_BLOCK_PARAMETERS_15= RULE_DO_BLOCK_PARAMETERS )? ( ( RULE_SPACE )=>this_SPACE_16= RULE_SPACE )* ( ( RULE_BS )=>this_BS_17= RULE_BS )?
            {
            // InternalRails.g:274:2: (this_SYMBOL_0= RULE_SYMBOL | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT | this_INT_METHOD_3= RULE_INT_METHOD | this_PARENTHESIS_BLOCK_4= RULE_PARENTHESIS_BLOCK | this_ARRAY_BLOCK_5= RULE_ARRAY_BLOCK | this_NamespacedModuleName_6= ruleNamespacedModuleName )
            int alt9=7;
            switch ( input.LA(1) ) {
            case RULE_SYMBOL:
                {
                alt9=1;
                }
                break;
            case RULE_STRING:
                {
                alt9=2;
                }
                break;
            case RULE_INT:
                {
                alt9=3;
                }
                break;
            case RULE_INT_METHOD:
                {
                alt9=4;
                }
                break;
            case RULE_PARENTHESIS_BLOCK:
                {
                alt9=5;
                }
                break;
            case RULE_ARRAY_BLOCK:
                {
                alt9=6;
                }
                break;
            case RULE_ID:
                {
                alt9=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalRails.g:274:7: this_SYMBOL_0= RULE_SYMBOL
                    {
                    this_SYMBOL_0=(Token)match(input,RULE_SYMBOL,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_SYMBOL_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SYMBOL_0, grammarAccess.getMethodChainCallAccess().getSYMBOLTerminalRuleCall_0_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalRails.g:282:10: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_1, grammarAccess.getMethodChainCallAccess().getSTRINGTerminalRuleCall_0_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalRails.g:290:10: this_INT_2= RULE_INT
                    {
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_2, grammarAccess.getMethodChainCallAccess().getINTTerminalRuleCall_0_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // InternalRails.g:298:10: this_INT_METHOD_3= RULE_INT_METHOD
                    {
                    this_INT_METHOD_3=(Token)match(input,RULE_INT_METHOD,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_METHOD_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_METHOD_3, grammarAccess.getMethodChainCallAccess().getINT_METHODTerminalRuleCall_0_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // InternalRails.g:306:10: this_PARENTHESIS_BLOCK_4= RULE_PARENTHESIS_BLOCK
                    {
                    this_PARENTHESIS_BLOCK_4=(Token)match(input,RULE_PARENTHESIS_BLOCK,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_PARENTHESIS_BLOCK_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PARENTHESIS_BLOCK_4, grammarAccess.getMethodChainCallAccess().getPARENTHESIS_BLOCKTerminalRuleCall_0_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // InternalRails.g:314:10: this_ARRAY_BLOCK_5= RULE_ARRAY_BLOCK
                    {
                    this_ARRAY_BLOCK_5=(Token)match(input,RULE_ARRAY_BLOCK,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ARRAY_BLOCK_5);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ARRAY_BLOCK_5, grammarAccess.getMethodChainCallAccess().getARRAY_BLOCKTerminalRuleCall_0_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // InternalRails.g:323:5: this_NamespacedModuleName_6= ruleNamespacedModuleName
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMethodChainCallAccess().getNamespacedModuleNameParserRuleCall_0_6()); 
                          
                    }
                    pushFollow(FOLLOW_9);
                    this_NamespacedModuleName_6=ruleNamespacedModuleName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_NamespacedModuleName_6);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }

            // InternalRails.g:333:2: (kw= '.' this_ID_8= RULE_ID (this_PARENTHESIS_BLOCK_9= RULE_PARENTHESIS_BLOCK )? )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==32) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalRails.g:334:2: kw= '.' this_ID_8= RULE_ID (this_PARENTHESIS_BLOCK_9= RULE_PARENTHESIS_BLOCK )?
            	    {
            	    kw=(Token)match(input,32,FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getMethodChainCallAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_8=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_8);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_8, grammarAccess.getMethodChainCallAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }
            	    // InternalRails.g:346:1: (this_PARENTHESIS_BLOCK_9= RULE_PARENTHESIS_BLOCK )?
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==RULE_PARENTHESIS_BLOCK) ) {
            	        alt10=1;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // InternalRails.g:346:6: this_PARENTHESIS_BLOCK_9= RULE_PARENTHESIS_BLOCK
            	            {
            	            this_PARENTHESIS_BLOCK_9=(Token)match(input,RULE_PARENTHESIS_BLOCK,FOLLOW_9); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_PARENTHESIS_BLOCK_9);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_PARENTHESIS_BLOCK_9, grammarAccess.getMethodChainCallAccess().getPARENTHESIS_BLOCKTerminalRuleCall_1_2()); 
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // InternalRails.g:353:5: (this_SPACE_10= RULE_SPACE )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_SPACE) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalRails.g:353:10: this_SPACE_10= RULE_SPACE
            	    {
            	    this_SPACE_10=(Token)match(input,RULE_SPACE,FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_SPACE_10);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SPACE_10, grammarAccess.getMethodChainCallAccess().getSPACETerminalRuleCall_2()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // InternalRails.g:360:3: (this_MethodCallParameters_11= ruleMethodCallParameters )?
            int alt13=2;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // InternalRails.g:361:5: this_MethodCallParameters_11= ruleMethodCallParameters
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMethodChainCallAccess().getMethodCallParametersParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_11);
                    this_MethodCallParameters_11=ruleMethodCallParameters();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_MethodCallParameters_11);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }

            // InternalRails.g:371:3: ( ( RULE_SPACE )=>this_SPACE_12= RULE_SPACE )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_SPACE) ) {
                    int LA14_2 = input.LA(2);

                    if ( (synpred1_InternalRails()) ) {
                        alt14=1;
                    }


                }


                switch (alt14) {
            	case 1 :
            	    // InternalRails.g:371:4: ( RULE_SPACE )=>this_SPACE_12= RULE_SPACE
            	    {
            	    this_SPACE_12=(Token)match(input,RULE_SPACE,FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_SPACE_12);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SPACE_12, grammarAccess.getMethodChainCallAccess().getSPACETerminalRuleCall_4()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // InternalRails.g:378:3: (this_BRACKET_BLOCK_13= RULE_BRACKET_BLOCK )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_BRACKET_BLOCK) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalRails.g:378:8: this_BRACKET_BLOCK_13= RULE_BRACKET_BLOCK
                    {
                    this_BRACKET_BLOCK_13=(Token)match(input,RULE_BRACKET_BLOCK,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BRACKET_BLOCK_13);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BRACKET_BLOCK_13, grammarAccess.getMethodChainCallAccess().getBRACKET_BLOCKTerminalRuleCall_5()); 
                          
                    }

                    }
                    break;

            }

            // InternalRails.g:385:3: ( ( RULE_SPACE )=>this_SPACE_14= RULE_SPACE )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_SPACE) ) {
                    int LA16_2 = input.LA(2);

                    if ( (synpred2_InternalRails()) ) {
                        alt16=1;
                    }


                }


                switch (alt16) {
            	case 1 :
            	    // InternalRails.g:385:4: ( RULE_SPACE )=>this_SPACE_14= RULE_SPACE
            	    {
            	    this_SPACE_14=(Token)match(input,RULE_SPACE,FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_SPACE_14);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SPACE_14, grammarAccess.getMethodChainCallAccess().getSPACETerminalRuleCall_6()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            // InternalRails.g:392:3: (this_DO_BLOCK_PARAMETERS_15= RULE_DO_BLOCK_PARAMETERS )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_DO_BLOCK_PARAMETERS) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalRails.g:392:8: this_DO_BLOCK_PARAMETERS_15= RULE_DO_BLOCK_PARAMETERS
                    {
                    this_DO_BLOCK_PARAMETERS_15=(Token)match(input,RULE_DO_BLOCK_PARAMETERS,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_DO_BLOCK_PARAMETERS_15);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_DO_BLOCK_PARAMETERS_15, grammarAccess.getMethodChainCallAccess().getDO_BLOCK_PARAMETERSTerminalRuleCall_7()); 
                          
                    }

                    }
                    break;

            }

            // InternalRails.g:399:3: ( ( RULE_SPACE )=>this_SPACE_16= RULE_SPACE )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_SPACE) ) {
                    int LA18_2 = input.LA(2);

                    if ( (synpred3_InternalRails()) ) {
                        alt18=1;
                    }


                }


                switch (alt18) {
            	case 1 :
            	    // InternalRails.g:399:4: ( RULE_SPACE )=>this_SPACE_16= RULE_SPACE
            	    {
            	    this_SPACE_16=(Token)match(input,RULE_SPACE,FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_SPACE_16);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SPACE_16, grammarAccess.getMethodChainCallAccess().getSPACETerminalRuleCall_8()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            // InternalRails.g:406:3: ( ( RULE_BS )=>this_BS_17= RULE_BS )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_BS) ) {
                int LA19_1 = input.LA(2);

                if ( (synpred4_InternalRails()) ) {
                    alt19=1;
                }
            }
            switch (alt19) {
                case 1 :
                    // InternalRails.g:406:4: ( RULE_BS )=>this_BS_17= RULE_BS
                    {
                    this_BS_17=(Token)match(input,RULE_BS,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BS_17);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BS_17, grammarAccess.getMethodChainCallAccess().getBSTerminalRuleCall_9()); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleMethodChainCall"


    // $ANTLR start "entryRuleMethodCallParameters"
    // InternalRails.g:421:1: entryRuleMethodCallParameters returns [String current=null] : iv_ruleMethodCallParameters= ruleMethodCallParameters EOF ;
    public final String entryRuleMethodCallParameters() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMethodCallParameters = null;


        try {
            // InternalRails.g:422:2: (iv_ruleMethodCallParameters= ruleMethodCallParameters EOF )
            // InternalRails.g:423:2: iv_ruleMethodCallParameters= ruleMethodCallParameters EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMethodCallParametersRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMethodCallParameters=ruleMethodCallParameters();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMethodCallParameters.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMethodCallParameters"


    // $ANTLR start "ruleMethodCallParameters"
    // InternalRails.g:430:1: ruleMethodCallParameters returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_PARENTHESIS_BLOCK_0= RULE_PARENTHESIS_BLOCK | this_ExpressionsSeparatedByCommas_1= ruleExpressionsSeparatedByCommas ) ;
    public final AntlrDatatypeRuleToken ruleMethodCallParameters() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_PARENTHESIS_BLOCK_0=null;
        AntlrDatatypeRuleToken this_ExpressionsSeparatedByCommas_1 = null;


         enterRule(); 
            
        try {
            // InternalRails.g:433:28: ( (this_PARENTHESIS_BLOCK_0= RULE_PARENTHESIS_BLOCK | this_ExpressionsSeparatedByCommas_1= ruleExpressionsSeparatedByCommas ) )
            // InternalRails.g:434:1: (this_PARENTHESIS_BLOCK_0= RULE_PARENTHESIS_BLOCK | this_ExpressionsSeparatedByCommas_1= ruleExpressionsSeparatedByCommas )
            {
            // InternalRails.g:434:1: (this_PARENTHESIS_BLOCK_0= RULE_PARENTHESIS_BLOCK | this_ExpressionsSeparatedByCommas_1= ruleExpressionsSeparatedByCommas )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_PARENTHESIS_BLOCK) ) {
                alt20=1;
            }
            else if ( (LA20_0==RULE_SPACE||(LA20_0>=RULE_ID && LA20_0<=RULE_INT_METHOD)||LA20_0==RULE_ARRAY_BLOCK||(LA20_0>=RULE_DECIMAL && LA20_0<=RULE_REGEXP)) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalRails.g:434:6: this_PARENTHESIS_BLOCK_0= RULE_PARENTHESIS_BLOCK
                    {
                    this_PARENTHESIS_BLOCK_0=(Token)match(input,RULE_PARENTHESIS_BLOCK,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_PARENTHESIS_BLOCK_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PARENTHESIS_BLOCK_0, grammarAccess.getMethodCallParametersAccess().getPARENTHESIS_BLOCKTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalRails.g:443:5: this_ExpressionsSeparatedByCommas_1= ruleExpressionsSeparatedByCommas
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMethodCallParametersAccess().getExpressionsSeparatedByCommasParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_ExpressionsSeparatedByCommas_1=ruleExpressionsSeparatedByCommas();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ExpressionsSeparatedByCommas_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleMethodCallParameters"


    // $ANTLR start "entryRuleExpressionsSeparatedByCommas"
    // InternalRails.g:461:1: entryRuleExpressionsSeparatedByCommas returns [String current=null] : iv_ruleExpressionsSeparatedByCommas= ruleExpressionsSeparatedByCommas EOF ;
    public final String entryRuleExpressionsSeparatedByCommas() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpressionsSeparatedByCommas = null;


        try {
            // InternalRails.g:462:2: (iv_ruleExpressionsSeparatedByCommas= ruleExpressionsSeparatedByCommas EOF )
            // InternalRails.g:463:2: iv_ruleExpressionsSeparatedByCommas= ruleExpressionsSeparatedByCommas EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionsSeparatedByCommasRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpressionsSeparatedByCommas=ruleExpressionsSeparatedByCommas();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionsSeparatedByCommas.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionsSeparatedByCommas"


    // $ANTLR start "ruleExpressionsSeparatedByCommas"
    // InternalRails.g:470:1: ruleExpressionsSeparatedByCommas returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ExpressionWithOutBracket_0= ruleExpressionWithOutBracket ( (this_SPACE_1= RULE_SPACE )* this_COMMA_2= RULE_COMMA (this_SPACE_3= RULE_SPACE )* this_Expression_4= ruleExpression )* ) ;
    public final AntlrDatatypeRuleToken ruleExpressionsSeparatedByCommas() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SPACE_1=null;
        Token this_COMMA_2=null;
        Token this_SPACE_3=null;
        AntlrDatatypeRuleToken this_ExpressionWithOutBracket_0 = null;

        AntlrDatatypeRuleToken this_Expression_4 = null;


         enterRule(); 
            
        try {
            // InternalRails.g:473:28: ( (this_ExpressionWithOutBracket_0= ruleExpressionWithOutBracket ( (this_SPACE_1= RULE_SPACE )* this_COMMA_2= RULE_COMMA (this_SPACE_3= RULE_SPACE )* this_Expression_4= ruleExpression )* ) )
            // InternalRails.g:474:1: (this_ExpressionWithOutBracket_0= ruleExpressionWithOutBracket ( (this_SPACE_1= RULE_SPACE )* this_COMMA_2= RULE_COMMA (this_SPACE_3= RULE_SPACE )* this_Expression_4= ruleExpression )* )
            {
            // InternalRails.g:474:1: (this_ExpressionWithOutBracket_0= ruleExpressionWithOutBracket ( (this_SPACE_1= RULE_SPACE )* this_COMMA_2= RULE_COMMA (this_SPACE_3= RULE_SPACE )* this_Expression_4= ruleExpression )* )
            // InternalRails.g:475:5: this_ExpressionWithOutBracket_0= ruleExpressionWithOutBracket ( (this_SPACE_1= RULE_SPACE )* this_COMMA_2= RULE_COMMA (this_SPACE_3= RULE_SPACE )* this_Expression_4= ruleExpression )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionsSeparatedByCommasAccess().getExpressionWithOutBracketParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_14);
            this_ExpressionWithOutBracket_0=ruleExpressionWithOutBracket();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ExpressionWithOutBracket_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalRails.g:485:1: ( (this_SPACE_1= RULE_SPACE )* this_COMMA_2= RULE_COMMA (this_SPACE_3= RULE_SPACE )* this_Expression_4= ruleExpression )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_SPACE) ) {
                    alt23=1;
                }
                else if ( (LA23_0==RULE_COMMA) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalRails.g:485:2: (this_SPACE_1= RULE_SPACE )* this_COMMA_2= RULE_COMMA (this_SPACE_3= RULE_SPACE )* this_Expression_4= ruleExpression
            	    {
            	    // InternalRails.g:485:2: (this_SPACE_1= RULE_SPACE )*
            	    loop21:
            	    do {
            	        int alt21=2;
            	        int LA21_0 = input.LA(1);

            	        if ( (LA21_0==RULE_SPACE) ) {
            	            alt21=1;
            	        }


            	        switch (alt21) {
            	    	case 1 :
            	    	    // InternalRails.g:485:7: this_SPACE_1= RULE_SPACE
            	    	    {
            	    	    this_SPACE_1=(Token)match(input,RULE_SPACE,FOLLOW_15); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      		current.merge(this_SPACE_1);
            	    	          
            	    	    }
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	          newLeafNode(this_SPACE_1, grammarAccess.getExpressionsSeparatedByCommasAccess().getSPACETerminalRuleCall_1_0()); 
            	    	          
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop21;
            	        }
            	    } while (true);

            	    this_COMMA_2=(Token)match(input,RULE_COMMA,FOLLOW_16); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_COMMA_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_COMMA_2, grammarAccess.getExpressionsSeparatedByCommasAccess().getCOMMATerminalRuleCall_1_1()); 
            	          
            	    }
            	    // InternalRails.g:499:1: (this_SPACE_3= RULE_SPACE )*
            	    loop22:
            	    do {
            	        int alt22=2;
            	        int LA22_0 = input.LA(1);

            	        if ( (LA22_0==RULE_SPACE) ) {
            	            alt22=1;
            	        }


            	        switch (alt22) {
            	    	case 1 :
            	    	    // InternalRails.g:499:6: this_SPACE_3= RULE_SPACE
            	    	    {
            	    	    this_SPACE_3=(Token)match(input,RULE_SPACE,FOLLOW_16); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      		current.merge(this_SPACE_3);
            	    	          
            	    	    }
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	          newLeafNode(this_SPACE_3, grammarAccess.getExpressionsSeparatedByCommasAccess().getSPACETerminalRuleCall_1_2()); 
            	    	          
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop22;
            	        }
            	    } while (true);

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getExpressionsSeparatedByCommasAccess().getExpressionParserRuleCall_1_3()); 
            	          
            	    }
            	    pushFollow(FOLLOW_14);
            	    this_Expression_4=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_Expression_4);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleExpressionsSeparatedByCommas"


    // $ANTLR start "entryRuleExpressionWithOutBracket"
    // InternalRails.g:525:1: entryRuleExpressionWithOutBracket returns [String current=null] : iv_ruleExpressionWithOutBracket= ruleExpressionWithOutBracket EOF ;
    public final String entryRuleExpressionWithOutBracket() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpressionWithOutBracket = null;


        try {
            // InternalRails.g:526:2: (iv_ruleExpressionWithOutBracket= ruleExpressionWithOutBracket EOF )
            // InternalRails.g:527:2: iv_ruleExpressionWithOutBracket= ruleExpressionWithOutBracket EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionWithOutBracketRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpressionWithOutBracket=ruleExpressionWithOutBracket();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionWithOutBracket.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionWithOutBracket"


    // $ANTLR start "ruleExpressionWithOutBracket"
    // InternalRails.g:534:1: ruleExpressionWithOutBracket returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SYMBOL_0= RULE_SYMBOL | this_STRING_1= RULE_STRING | this_ARRAY_BLOCK_2= RULE_ARRAY_BLOCK | this_PARENTHESIS_BLOCK_3= RULE_PARENTHESIS_BLOCK | this_DECIMAL_4= RULE_DECIMAL | this_INT_5= RULE_INT | this_REGEXP_6= RULE_REGEXP | this_MethodChainCall_7= ruleMethodChainCall | this_IgnoredHashKeyValue_8= ruleIgnoredHashKeyValue ) ;
    public final AntlrDatatypeRuleToken ruleExpressionWithOutBracket() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SYMBOL_0=null;
        Token this_STRING_1=null;
        Token this_ARRAY_BLOCK_2=null;
        Token this_PARENTHESIS_BLOCK_3=null;
        Token this_DECIMAL_4=null;
        Token this_INT_5=null;
        Token this_REGEXP_6=null;
        AntlrDatatypeRuleToken this_MethodChainCall_7 = null;

        AntlrDatatypeRuleToken this_IgnoredHashKeyValue_8 = null;


         enterRule(); 
            
        try {
            // InternalRails.g:537:28: ( (this_SYMBOL_0= RULE_SYMBOL | this_STRING_1= RULE_STRING | this_ARRAY_BLOCK_2= RULE_ARRAY_BLOCK | this_PARENTHESIS_BLOCK_3= RULE_PARENTHESIS_BLOCK | this_DECIMAL_4= RULE_DECIMAL | this_INT_5= RULE_INT | this_REGEXP_6= RULE_REGEXP | this_MethodChainCall_7= ruleMethodChainCall | this_IgnoredHashKeyValue_8= ruleIgnoredHashKeyValue ) )
            // InternalRails.g:538:1: (this_SYMBOL_0= RULE_SYMBOL | this_STRING_1= RULE_STRING | this_ARRAY_BLOCK_2= RULE_ARRAY_BLOCK | this_PARENTHESIS_BLOCK_3= RULE_PARENTHESIS_BLOCK | this_DECIMAL_4= RULE_DECIMAL | this_INT_5= RULE_INT | this_REGEXP_6= RULE_REGEXP | this_MethodChainCall_7= ruleMethodChainCall | this_IgnoredHashKeyValue_8= ruleIgnoredHashKeyValue )
            {
            // InternalRails.g:538:1: (this_SYMBOL_0= RULE_SYMBOL | this_STRING_1= RULE_STRING | this_ARRAY_BLOCK_2= RULE_ARRAY_BLOCK | this_PARENTHESIS_BLOCK_3= RULE_PARENTHESIS_BLOCK | this_DECIMAL_4= RULE_DECIMAL | this_INT_5= RULE_INT | this_REGEXP_6= RULE_REGEXP | this_MethodChainCall_7= ruleMethodChainCall | this_IgnoredHashKeyValue_8= ruleIgnoredHashKeyValue )
            int alt24=9;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // InternalRails.g:538:6: this_SYMBOL_0= RULE_SYMBOL
                    {
                    this_SYMBOL_0=(Token)match(input,RULE_SYMBOL,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_SYMBOL_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SYMBOL_0, grammarAccess.getExpressionWithOutBracketAccess().getSYMBOLTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalRails.g:546:10: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_1, grammarAccess.getExpressionWithOutBracketAccess().getSTRINGTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalRails.g:554:10: this_ARRAY_BLOCK_2= RULE_ARRAY_BLOCK
                    {
                    this_ARRAY_BLOCK_2=(Token)match(input,RULE_ARRAY_BLOCK,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ARRAY_BLOCK_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ARRAY_BLOCK_2, grammarAccess.getExpressionWithOutBracketAccess().getARRAY_BLOCKTerminalRuleCall_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // InternalRails.g:562:10: this_PARENTHESIS_BLOCK_3= RULE_PARENTHESIS_BLOCK
                    {
                    this_PARENTHESIS_BLOCK_3=(Token)match(input,RULE_PARENTHESIS_BLOCK,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_PARENTHESIS_BLOCK_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PARENTHESIS_BLOCK_3, grammarAccess.getExpressionWithOutBracketAccess().getPARENTHESIS_BLOCKTerminalRuleCall_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // InternalRails.g:570:10: this_DECIMAL_4= RULE_DECIMAL
                    {
                    this_DECIMAL_4=(Token)match(input,RULE_DECIMAL,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_DECIMAL_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_DECIMAL_4, grammarAccess.getExpressionWithOutBracketAccess().getDECIMALTerminalRuleCall_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // InternalRails.g:578:10: this_INT_5= RULE_INT
                    {
                    this_INT_5=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_5);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_5, grammarAccess.getExpressionWithOutBracketAccess().getINTTerminalRuleCall_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // InternalRails.g:586:10: this_REGEXP_6= RULE_REGEXP
                    {
                    this_REGEXP_6=(Token)match(input,RULE_REGEXP,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_REGEXP_6);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_REGEXP_6, grammarAccess.getExpressionWithOutBracketAccess().getREGEXPTerminalRuleCall_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // InternalRails.g:595:5: this_MethodChainCall_7= ruleMethodChainCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionWithOutBracketAccess().getMethodChainCallParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_MethodChainCall_7=ruleMethodChainCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_MethodChainCall_7);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 9 :
                    // InternalRails.g:607:5: this_IgnoredHashKeyValue_8= ruleIgnoredHashKeyValue
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionWithOutBracketAccess().getIgnoredHashKeyValueParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_IgnoredHashKeyValue_8=ruleIgnoredHashKeyValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_IgnoredHashKeyValue_8);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleExpressionWithOutBracket"


    // $ANTLR start "entryRuleExpression"
    // InternalRails.g:625:1: entryRuleExpression returns [String current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final String entryRuleExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpression = null;


        try {
            // InternalRails.g:626:2: (iv_ruleExpression= ruleExpression EOF )
            // InternalRails.g:627:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalRails.g:634:1: ruleExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ExpressionWithOutBracket_0= ruleExpressionWithOutBracket | this_BRACKET_BLOCK_1= RULE_BRACKET_BLOCK ) ;
    public final AntlrDatatypeRuleToken ruleExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_BRACKET_BLOCK_1=null;
        AntlrDatatypeRuleToken this_ExpressionWithOutBracket_0 = null;


         enterRule(); 
            
        try {
            // InternalRails.g:637:28: ( (this_ExpressionWithOutBracket_0= ruleExpressionWithOutBracket | this_BRACKET_BLOCK_1= RULE_BRACKET_BLOCK ) )
            // InternalRails.g:638:1: (this_ExpressionWithOutBracket_0= ruleExpressionWithOutBracket | this_BRACKET_BLOCK_1= RULE_BRACKET_BLOCK )
            {
            // InternalRails.g:638:1: (this_ExpressionWithOutBracket_0= ruleExpressionWithOutBracket | this_BRACKET_BLOCK_1= RULE_BRACKET_BLOCK )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_SPACE||(LA25_0>=RULE_ID && LA25_0<=RULE_ARRAY_BLOCK)||(LA25_0>=RULE_DECIMAL && LA25_0<=RULE_REGEXP)) ) {
                alt25=1;
            }
            else if ( (LA25_0==RULE_BRACKET_BLOCK) ) {
                alt25=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalRails.g:639:5: this_ExpressionWithOutBracket_0= ruleExpressionWithOutBracket
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionAccess().getExpressionWithOutBracketParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_ExpressionWithOutBracket_0=ruleExpressionWithOutBracket();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ExpressionWithOutBracket_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalRails.g:650:10: this_BRACKET_BLOCK_1= RULE_BRACKET_BLOCK
                    {
                    this_BRACKET_BLOCK_1=(Token)match(input,RULE_BRACKET_BLOCK,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BRACKET_BLOCK_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BRACKET_BLOCK_1, grammarAccess.getExpressionAccess().getBRACKET_BLOCKTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleOperationsChain"
    // InternalRails.g:665:1: entryRuleOperationsChain returns [String current=null] : iv_ruleOperationsChain= ruleOperationsChain EOF ;
    public final String entryRuleOperationsChain() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOperationsChain = null;


        try {
            // InternalRails.g:666:2: (iv_ruleOperationsChain= ruleOperationsChain EOF )
            // InternalRails.g:667:2: iv_ruleOperationsChain= ruleOperationsChain EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationsChainRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOperationsChain=ruleOperationsChain();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationsChain.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOperationsChain"


    // $ANTLR start "ruleOperationsChain"
    // InternalRails.g:674:1: ruleOperationsChain returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_MethodChainCall_0= ruleMethodChainCall (this_OperatorRule_1= ruleOperatorRule (this_BRACKET_BLOCK_2= RULE_BRACKET_BLOCK | this_DECIMAL_3= RULE_DECIMAL | this_MethodChainCall_4= ruleMethodChainCall | this_REGEXP_5= RULE_REGEXP ) )* ) ;
    public final AntlrDatatypeRuleToken ruleOperationsChain() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_BRACKET_BLOCK_2=null;
        Token this_DECIMAL_3=null;
        Token this_REGEXP_5=null;
        AntlrDatatypeRuleToken this_MethodChainCall_0 = null;

        AntlrDatatypeRuleToken this_OperatorRule_1 = null;

        AntlrDatatypeRuleToken this_MethodChainCall_4 = null;


         enterRule(); 
            
        try {
            // InternalRails.g:677:28: ( (this_MethodChainCall_0= ruleMethodChainCall (this_OperatorRule_1= ruleOperatorRule (this_BRACKET_BLOCK_2= RULE_BRACKET_BLOCK | this_DECIMAL_3= RULE_DECIMAL | this_MethodChainCall_4= ruleMethodChainCall | this_REGEXP_5= RULE_REGEXP ) )* ) )
            // InternalRails.g:678:1: (this_MethodChainCall_0= ruleMethodChainCall (this_OperatorRule_1= ruleOperatorRule (this_BRACKET_BLOCK_2= RULE_BRACKET_BLOCK | this_DECIMAL_3= RULE_DECIMAL | this_MethodChainCall_4= ruleMethodChainCall | this_REGEXP_5= RULE_REGEXP ) )* )
            {
            // InternalRails.g:678:1: (this_MethodChainCall_0= ruleMethodChainCall (this_OperatorRule_1= ruleOperatorRule (this_BRACKET_BLOCK_2= RULE_BRACKET_BLOCK | this_DECIMAL_3= RULE_DECIMAL | this_MethodChainCall_4= ruleMethodChainCall | this_REGEXP_5= RULE_REGEXP ) )* )
            // InternalRails.g:679:5: this_MethodChainCall_0= ruleMethodChainCall (this_OperatorRule_1= ruleOperatorRule (this_BRACKET_BLOCK_2= RULE_BRACKET_BLOCK | this_DECIMAL_3= RULE_DECIMAL | this_MethodChainCall_4= ruleMethodChainCall | this_REGEXP_5= RULE_REGEXP ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOperationsChainAccess().getMethodChainCallParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_17);
            this_MethodChainCall_0=ruleMethodChainCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_MethodChainCall_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalRails.g:689:1: (this_OperatorRule_1= ruleOperatorRule (this_BRACKET_BLOCK_2= RULE_BRACKET_BLOCK | this_DECIMAL_3= RULE_DECIMAL | this_MethodChainCall_4= ruleMethodChainCall | this_REGEXP_5= RULE_REGEXP ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==30||(LA27_0>=33 && LA27_0<=53)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalRails.g:690:5: this_OperatorRule_1= ruleOperatorRule (this_BRACKET_BLOCK_2= RULE_BRACKET_BLOCK | this_DECIMAL_3= RULE_DECIMAL | this_MethodChainCall_4= ruleMethodChainCall | this_REGEXP_5= RULE_REGEXP )
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getOperationsChainAccess().getOperatorRuleParserRuleCall_1_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_16);
            	    this_OperatorRule_1=ruleOperatorRule();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_OperatorRule_1);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    // InternalRails.g:700:1: (this_BRACKET_BLOCK_2= RULE_BRACKET_BLOCK | this_DECIMAL_3= RULE_DECIMAL | this_MethodChainCall_4= ruleMethodChainCall | this_REGEXP_5= RULE_REGEXP )
            	    int alt26=4;
            	    switch ( input.LA(1) ) {
            	    case RULE_BRACKET_BLOCK:
            	        {
            	        alt26=1;
            	        }
            	        break;
            	    case RULE_DECIMAL:
            	        {
            	        alt26=2;
            	        }
            	        break;
            	    case RULE_ID:
            	    case RULE_SYMBOL:
            	    case RULE_STRING:
            	    case RULE_INT:
            	    case RULE_INT_METHOD:
            	    case RULE_PARENTHESIS_BLOCK:
            	    case RULE_ARRAY_BLOCK:
            	        {
            	        alt26=3;
            	        }
            	        break;
            	    case RULE_REGEXP:
            	        {
            	        alt26=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 26, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt26) {
            	        case 1 :
            	            // InternalRails.g:700:6: this_BRACKET_BLOCK_2= RULE_BRACKET_BLOCK
            	            {
            	            this_BRACKET_BLOCK_2=(Token)match(input,RULE_BRACKET_BLOCK,FOLLOW_17); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_BRACKET_BLOCK_2);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_BRACKET_BLOCK_2, grammarAccess.getOperationsChainAccess().getBRACKET_BLOCKTerminalRuleCall_1_1_0()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalRails.g:708:10: this_DECIMAL_3= RULE_DECIMAL
            	            {
            	            this_DECIMAL_3=(Token)match(input,RULE_DECIMAL,FOLLOW_17); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_DECIMAL_3);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_DECIMAL_3, grammarAccess.getOperationsChainAccess().getDECIMALTerminalRuleCall_1_1_1()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // InternalRails.g:717:5: this_MethodChainCall_4= ruleMethodChainCall
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	                      newCompositeNode(grammarAccess.getOperationsChainAccess().getMethodChainCallParserRuleCall_1_1_2()); 
            	                  
            	            }
            	            pushFollow(FOLLOW_17);
            	            this_MethodChainCall_4=ruleMethodChainCall();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_MethodChainCall_4);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                      afterParserOrEnumRuleCall();
            	                  
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // InternalRails.g:728:10: this_REGEXP_5= RULE_REGEXP
            	            {
            	            this_REGEXP_5=(Token)match(input,RULE_REGEXP,FOLLOW_17); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_REGEXP_5);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_REGEXP_5, grammarAccess.getOperationsChainAccess().getREGEXPTerminalRuleCall_1_1_3()); 
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOperationsChain"


    // $ANTLR start "entryRuleOperatorRule"
    // InternalRails.g:743:1: entryRuleOperatorRule returns [String current=null] : iv_ruleOperatorRule= ruleOperatorRule EOF ;
    public final String entryRuleOperatorRule() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOperatorRule = null;


        try {
            // InternalRails.g:744:2: (iv_ruleOperatorRule= ruleOperatorRule EOF )
            // InternalRails.g:745:2: iv_ruleOperatorRule= ruleOperatorRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperatorRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOperatorRule=ruleOperatorRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperatorRule.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOperatorRule"


    // $ANTLR start "ruleOperatorRule"
    // InternalRails.g:752:1: ruleOperatorRule returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= ': ' | kw= '?' | kw= '<' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= '**' | kw= '=' | kw= '~' | kw= '|' | kw= '||' | kw= '&' | kw= '&&' | kw= '==' | kw= '!' | kw= '<<' | kw= '<=>' | kw= '>' | kw= '..' | kw= '...' ) (kw= '=' )? ) ;
    public final AntlrDatatypeRuleToken ruleOperatorRule() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalRails.g:755:28: ( ( (kw= ': ' | kw= '?' | kw= '<' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= '**' | kw= '=' | kw= '~' | kw= '|' | kw= '||' | kw= '&' | kw= '&&' | kw= '==' | kw= '!' | kw= '<<' | kw= '<=>' | kw= '>' | kw= '..' | kw= '...' ) (kw= '=' )? ) )
            // InternalRails.g:756:1: ( (kw= ': ' | kw= '?' | kw= '<' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= '**' | kw= '=' | kw= '~' | kw= '|' | kw= '||' | kw= '&' | kw= '&&' | kw= '==' | kw= '!' | kw= '<<' | kw= '<=>' | kw= '>' | kw= '..' | kw= '...' ) (kw= '=' )? )
            {
            // InternalRails.g:756:1: ( (kw= ': ' | kw= '?' | kw= '<' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= '**' | kw= '=' | kw= '~' | kw= '|' | kw= '||' | kw= '&' | kw= '&&' | kw= '==' | kw= '!' | kw= '<<' | kw= '<=>' | kw= '>' | kw= '..' | kw= '...' ) (kw= '=' )? )
            // InternalRails.g:756:2: (kw= ': ' | kw= '?' | kw= '<' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= '**' | kw= '=' | kw= '~' | kw= '|' | kw= '||' | kw= '&' | kw= '&&' | kw= '==' | kw= '!' | kw= '<<' | kw= '<=>' | kw= '>' | kw= '..' | kw= '...' ) (kw= '=' )?
            {
            // InternalRails.g:756:2: (kw= ': ' | kw= '?' | kw= '<' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= '**' | kw= '=' | kw= '~' | kw= '|' | kw= '||' | kw= '&' | kw= '&&' | kw= '==' | kw= '!' | kw= '<<' | kw= '<=>' | kw= '>' | kw= '..' | kw= '...' )
            int alt28=22;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt28=1;
                }
                break;
            case 34:
                {
                alt28=2;
                }
                break;
            case 30:
                {
                alt28=3;
                }
                break;
            case 35:
                {
                alt28=4;
                }
                break;
            case 36:
                {
                alt28=5;
                }
                break;
            case 37:
                {
                alt28=6;
                }
                break;
            case 38:
                {
                alt28=7;
                }
                break;
            case 39:
                {
                alt28=8;
                }
                break;
            case 40:
                {
                alt28=9;
                }
                break;
            case 41:
                {
                alt28=10;
                }
                break;
            case 42:
                {
                alt28=11;
                }
                break;
            case 43:
                {
                alt28=12;
                }
                break;
            case 44:
                {
                alt28=13;
                }
                break;
            case 45:
                {
                alt28=14;
                }
                break;
            case 46:
                {
                alt28=15;
                }
                break;
            case 47:
                {
                alt28=16;
                }
                break;
            case 48:
                {
                alt28=17;
                }
                break;
            case 49:
                {
                alt28=18;
                }
                break;
            case 50:
                {
                alt28=19;
                }
                break;
            case 51:
                {
                alt28=20;
                }
                break;
            case 52:
                {
                alt28=21;
                }
                break;
            case 53:
                {
                alt28=22;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalRails.g:757:2: kw= ': '
                    {
                    kw=(Token)match(input,33,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorRuleAccess().getColonSpaceKeyword_0_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalRails.g:764:2: kw= '?'
                    {
                    kw=(Token)match(input,34,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorRuleAccess().getQuestionMarkKeyword_0_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalRails.g:771:2: kw= '<'
                    {
                    kw=(Token)match(input,30,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorRuleAccess().getLessThanSignKeyword_0_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // InternalRails.g:778:2: kw= '+'
                    {
                    kw=(Token)match(input,35,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorRuleAccess().getPlusSignKeyword_0_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // InternalRails.g:785:2: kw= '-'
                    {
                    kw=(Token)match(input,36,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorRuleAccess().getHyphenMinusKeyword_0_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // InternalRails.g:792:2: kw= '*'
                    {
                    kw=(Token)match(input,37,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorRuleAccess().getAsteriskKeyword_0_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // InternalRails.g:799:2: kw= '/'
                    {
                    kw=(Token)match(input,38,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorRuleAccess().getSolidusKeyword_0_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // InternalRails.g:806:2: kw= '%'
                    {
                    kw=(Token)match(input,39,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorRuleAccess().getPercentSignKeyword_0_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // InternalRails.g:813:2: kw= '**'
                    {
                    kw=(Token)match(input,40,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorRuleAccess().getAsteriskAsteriskKeyword_0_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // InternalRails.g:820:2: kw= '='
                    {
                    kw=(Token)match(input,41,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorRuleAccess().getEqualsSignKeyword_0_9()); 
                          
                    }

                    }
                    break;
                case 11 :
                    // InternalRails.g:827:2: kw= '~'
                    {
                    kw=(Token)match(input,42,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorRuleAccess().getTildeKeyword_0_10()); 
                          
                    }

                    }
                    break;
                case 12 :
                    // InternalRails.g:834:2: kw= '|'
                    {
                    kw=(Token)match(input,43,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorRuleAccess().getVerticalLineKeyword_0_11()); 
                          
                    }

                    }
                    break;
                case 13 :
                    // InternalRails.g:841:2: kw= '||'
                    {
                    kw=(Token)match(input,44,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorRuleAccess().getVerticalLineVerticalLineKeyword_0_12()); 
                          
                    }

                    }
                    break;
                case 14 :
                    // InternalRails.g:848:2: kw= '&'
                    {
                    kw=(Token)match(input,45,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorRuleAccess().getAmpersandKeyword_0_13()); 
                          
                    }

                    }
                    break;
                case 15 :
                    // InternalRails.g:855:2: kw= '&&'
                    {
                    kw=(Token)match(input,46,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorRuleAccess().getAmpersandAmpersandKeyword_0_14()); 
                          
                    }

                    }
                    break;
                case 16 :
                    // InternalRails.g:862:2: kw= '=='
                    {
                    kw=(Token)match(input,47,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorRuleAccess().getEqualsSignEqualsSignKeyword_0_15()); 
                          
                    }

                    }
                    break;
                case 17 :
                    // InternalRails.g:869:2: kw= '!'
                    {
                    kw=(Token)match(input,48,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorRuleAccess().getExclamationMarkKeyword_0_16()); 
                          
                    }

                    }
                    break;
                case 18 :
                    // InternalRails.g:876:2: kw= '<<'
                    {
                    kw=(Token)match(input,49,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorRuleAccess().getLessThanSignLessThanSignKeyword_0_17()); 
                          
                    }

                    }
                    break;
                case 19 :
                    // InternalRails.g:883:2: kw= '<=>'
                    {
                    kw=(Token)match(input,50,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorRuleAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_0_18()); 
                          
                    }

                    }
                    break;
                case 20 :
                    // InternalRails.g:890:2: kw= '>'
                    {
                    kw=(Token)match(input,51,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorRuleAccess().getGreaterThanSignKeyword_0_19()); 
                          
                    }

                    }
                    break;
                case 21 :
                    // InternalRails.g:897:2: kw= '..'
                    {
                    kw=(Token)match(input,52,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorRuleAccess().getFullStopFullStopKeyword_0_20()); 
                          
                    }

                    }
                    break;
                case 22 :
                    // InternalRails.g:904:2: kw= '...'
                    {
                    kw=(Token)match(input,53,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorRuleAccess().getFullStopFullStopFullStopKeyword_0_21()); 
                          
                    }

                    }
                    break;

            }

            // InternalRails.g:909:2: (kw= '=' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==41) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalRails.g:910:2: kw= '='
                    {
                    kw=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorRuleAccess().getEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOperatorRule"


    // $ANTLR start "entryRuleRelationship"
    // InternalRails.g:923:1: entryRuleRelationship returns [EObject current=null] : iv_ruleRelationship= ruleRelationship EOF ;
    public final EObject entryRuleRelationship() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationship = null;


        try {
            // InternalRails.g:924:2: (iv_ruleRelationship= ruleRelationship EOF )
            // InternalRails.g:925:2: iv_ruleRelationship= ruleRelationship EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationshipRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRelationship=ruleRelationship();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelationship; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRelationship"


    // $ANTLR start "ruleRelationship"
    // InternalRails.g:932:1: ruleRelationship returns [EObject current=null] : (this_HasMany_0= ruleHasMany | this_HasOne_1= ruleHasOne | this_HasAndBelongsToMany_2= ruleHasAndBelongsToMany | this_BelongsTo_3= ruleBelongsTo ) ;
    public final EObject ruleRelationship() throws RecognitionException {
        EObject current = null;

        EObject this_HasMany_0 = null;

        EObject this_HasOne_1 = null;

        EObject this_HasAndBelongsToMany_2 = null;

        EObject this_BelongsTo_3 = null;


         enterRule(); 
            
        try {
            // InternalRails.g:935:28: ( (this_HasMany_0= ruleHasMany | this_HasOne_1= ruleHasOne | this_HasAndBelongsToMany_2= ruleHasAndBelongsToMany | this_BelongsTo_3= ruleBelongsTo ) )
            // InternalRails.g:936:1: (this_HasMany_0= ruleHasMany | this_HasOne_1= ruleHasOne | this_HasAndBelongsToMany_2= ruleHasAndBelongsToMany | this_BelongsTo_3= ruleBelongsTo )
            {
            // InternalRails.g:936:1: (this_HasMany_0= ruleHasMany | this_HasOne_1= ruleHasOne | this_HasAndBelongsToMany_2= ruleHasAndBelongsToMany | this_BelongsTo_3= ruleBelongsTo )
            int alt30=4;
            switch ( input.LA(1) ) {
            case RULE_HAS_MANY_WORD:
                {
                alt30=1;
                }
                break;
            case RULE_HAS_ONE_WORD:
                {
                alt30=2;
                }
                break;
            case RULE_HAS_AND_BELONGS_TO_MANY_WORD:
                {
                alt30=3;
                }
                break;
            case RULE_BELONGS_TO_WORD:
                {
                alt30=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalRails.g:937:5: this_HasMany_0= ruleHasMany
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRelationshipAccess().getHasManyParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_HasMany_0=ruleHasMany();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_HasMany_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalRails.g:947:5: this_HasOne_1= ruleHasOne
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRelationshipAccess().getHasOneParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_HasOne_1=ruleHasOne();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_HasOne_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalRails.g:957:5: this_HasAndBelongsToMany_2= ruleHasAndBelongsToMany
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRelationshipAccess().getHasAndBelongsToManyParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_HasAndBelongsToMany_2=ruleHasAndBelongsToMany();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_HasAndBelongsToMany_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // InternalRails.g:967:5: this_BelongsTo_3= ruleBelongsTo
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRelationshipAccess().getBelongsToParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_BelongsTo_3=ruleBelongsTo();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BelongsTo_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleRelationship"


    // $ANTLR start "entryRuleHasMany"
    // InternalRails.g:983:1: entryRuleHasMany returns [EObject current=null] : iv_ruleHasMany= ruleHasMany EOF ;
    public final EObject entryRuleHasMany() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHasMany = null;


        try {
            // InternalRails.g:984:2: (iv_ruleHasMany= ruleHasMany EOF )
            // InternalRails.g:985:2: iv_ruleHasMany= ruleHasMany EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHasManyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleHasMany=ruleHasMany();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHasMany; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleHasMany"


    // $ANTLR start "ruleHasMany"
    // InternalRails.g:992:1: ruleHasMany returns [EObject current=null] : (this_HAS_MANY_WORD_0= RULE_HAS_MANY_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )* (this_SL_COMMENT_5= RULE_SL_COMMENT )? ) ;
    public final EObject ruleHasMany() throws RecognitionException {
        EObject current = null;

        Token this_HAS_MANY_WORD_0=null;
        Token this_SPACE_1=null;
        Token lv_name_2_1=null;
        Token lv_name_2_2=null;
        Token this_SPACE_3=null;
        Token this_SL_COMMENT_5=null;
        EObject lv_options_4_0 = null;


         enterRule(); 
            
        try {
            // InternalRails.g:995:28: ( (this_HAS_MANY_WORD_0= RULE_HAS_MANY_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )* (this_SL_COMMENT_5= RULE_SL_COMMENT )? ) )
            // InternalRails.g:996:1: (this_HAS_MANY_WORD_0= RULE_HAS_MANY_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )* (this_SL_COMMENT_5= RULE_SL_COMMENT )? )
            {
            // InternalRails.g:996:1: (this_HAS_MANY_WORD_0= RULE_HAS_MANY_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )* (this_SL_COMMENT_5= RULE_SL_COMMENT )? )
            // InternalRails.g:996:2: this_HAS_MANY_WORD_0= RULE_HAS_MANY_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )* (this_SL_COMMENT_5= RULE_SL_COMMENT )?
            {
            this_HAS_MANY_WORD_0=(Token)match(input,RULE_HAS_MANY_WORD,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_HAS_MANY_WORD_0, grammarAccess.getHasManyAccess().getHAS_MANY_WORDTerminalRuleCall_0()); 
                  
            }
            // InternalRails.g:1000:1: (this_SPACE_1= RULE_SPACE )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_SPACE) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalRails.g:1000:2: this_SPACE_1= RULE_SPACE
            	    {
            	    this_SPACE_1=(Token)match(input,RULE_SPACE,FOLLOW_19); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SPACE_1, grammarAccess.getHasManyAccess().getSPACETerminalRuleCall_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            // InternalRails.g:1004:3: ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) )
            // InternalRails.g:1005:1: ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) )
            {
            // InternalRails.g:1005:1: ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) )
            // InternalRails.g:1006:1: (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING )
            {
            // InternalRails.g:1006:1: (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_SYMBOL) ) {
                alt32=1;
            }
            else if ( (LA32_0==RULE_STRING) ) {
                alt32=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalRails.g:1007:3: lv_name_2_1= RULE_SYMBOL
                    {
                    lv_name_2_1=(Token)match(input,RULE_SYMBOL,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_2_1, grammarAccess.getHasManyAccess().getNameSYMBOLTerminalRuleCall_2_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getHasManyRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_2_1, 
                              		"co.gruposaberes.model.Rails.SYMBOL");
                      	    
                    }

                    }
                    break;
                case 2 :
                    // InternalRails.g:1022:8: lv_name_2_2= RULE_STRING
                    {
                    lv_name_2_2=(Token)match(input,RULE_STRING,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_2_2, grammarAccess.getHasManyAccess().getNameSTRINGTerminalRuleCall_2_0_1()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getHasManyRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_2_2, 
                              		"co.gruposaberes.model.Rails.STRING");
                      	    
                    }

                    }
                    break;

            }


            }


            }

            // InternalRails.g:1040:2: (this_SPACE_3= RULE_SPACE )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_SPACE) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalRails.g:1040:3: this_SPACE_3= RULE_SPACE
            	    {
            	    this_SPACE_3=(Token)match(input,RULE_SPACE,FOLLOW_20); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SPACE_3, grammarAccess.getHasManyAccess().getSPACETerminalRuleCall_3()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            // InternalRails.g:1044:3: ( (lv_options_4_0= ruleHashKeyValue ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_COMMA) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalRails.g:1045:1: (lv_options_4_0= ruleHashKeyValue )
            	    {
            	    // InternalRails.g:1045:1: (lv_options_4_0= ruleHashKeyValue )
            	    // InternalRails.g:1046:3: lv_options_4_0= ruleHashKeyValue
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getHasManyAccess().getOptionsHashKeyValueParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_21);
            	    lv_options_4_0=ruleHashKeyValue();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getHasManyRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"options",
            	              		lv_options_4_0, 
            	              		"co.gruposaberes.model.Rails.HashKeyValue");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            // InternalRails.g:1062:3: (this_SL_COMMENT_5= RULE_SL_COMMENT )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_SL_COMMENT) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalRails.g:1062:4: this_SL_COMMENT_5= RULE_SL_COMMENT
                    {
                    this_SL_COMMENT_5=(Token)match(input,RULE_SL_COMMENT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SL_COMMENT_5, grammarAccess.getHasManyAccess().getSL_COMMENTTerminalRuleCall_5()); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleHasMany"


    // $ANTLR start "entryRuleHasOne"
    // InternalRails.g:1074:1: entryRuleHasOne returns [EObject current=null] : iv_ruleHasOne= ruleHasOne EOF ;
    public final EObject entryRuleHasOne() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHasOne = null;


        try {
            // InternalRails.g:1075:2: (iv_ruleHasOne= ruleHasOne EOF )
            // InternalRails.g:1076:2: iv_ruleHasOne= ruleHasOne EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHasOneRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleHasOne=ruleHasOne();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHasOne; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleHasOne"


    // $ANTLR start "ruleHasOne"
    // InternalRails.g:1083:1: ruleHasOne returns [EObject current=null] : (this_HAS_ONE_WORD_0= RULE_HAS_ONE_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )* (this_SL_COMMENT_5= RULE_SL_COMMENT )? ) ;
    public final EObject ruleHasOne() throws RecognitionException {
        EObject current = null;

        Token this_HAS_ONE_WORD_0=null;
        Token this_SPACE_1=null;
        Token lv_name_2_1=null;
        Token lv_name_2_2=null;
        Token this_SPACE_3=null;
        Token this_SL_COMMENT_5=null;
        EObject lv_options_4_0 = null;


         enterRule(); 
            
        try {
            // InternalRails.g:1086:28: ( (this_HAS_ONE_WORD_0= RULE_HAS_ONE_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )* (this_SL_COMMENT_5= RULE_SL_COMMENT )? ) )
            // InternalRails.g:1087:1: (this_HAS_ONE_WORD_0= RULE_HAS_ONE_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )* (this_SL_COMMENT_5= RULE_SL_COMMENT )? )
            {
            // InternalRails.g:1087:1: (this_HAS_ONE_WORD_0= RULE_HAS_ONE_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )* (this_SL_COMMENT_5= RULE_SL_COMMENT )? )
            // InternalRails.g:1087:2: this_HAS_ONE_WORD_0= RULE_HAS_ONE_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )* (this_SL_COMMENT_5= RULE_SL_COMMENT )?
            {
            this_HAS_ONE_WORD_0=(Token)match(input,RULE_HAS_ONE_WORD,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_HAS_ONE_WORD_0, grammarAccess.getHasOneAccess().getHAS_ONE_WORDTerminalRuleCall_0()); 
                  
            }
            // InternalRails.g:1091:1: (this_SPACE_1= RULE_SPACE )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_SPACE) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalRails.g:1091:2: this_SPACE_1= RULE_SPACE
            	    {
            	    this_SPACE_1=(Token)match(input,RULE_SPACE,FOLLOW_19); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SPACE_1, grammarAccess.getHasOneAccess().getSPACETerminalRuleCall_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            // InternalRails.g:1095:3: ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) )
            // InternalRails.g:1096:1: ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) )
            {
            // InternalRails.g:1096:1: ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) )
            // InternalRails.g:1097:1: (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING )
            {
            // InternalRails.g:1097:1: (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_SYMBOL) ) {
                alt37=1;
            }
            else if ( (LA37_0==RULE_STRING) ) {
                alt37=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalRails.g:1098:3: lv_name_2_1= RULE_SYMBOL
                    {
                    lv_name_2_1=(Token)match(input,RULE_SYMBOL,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_2_1, grammarAccess.getHasOneAccess().getNameSYMBOLTerminalRuleCall_2_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getHasOneRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_2_1, 
                              		"co.gruposaberes.model.Rails.SYMBOL");
                      	    
                    }

                    }
                    break;
                case 2 :
                    // InternalRails.g:1113:8: lv_name_2_2= RULE_STRING
                    {
                    lv_name_2_2=(Token)match(input,RULE_STRING,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_2_2, grammarAccess.getHasOneAccess().getNameSTRINGTerminalRuleCall_2_0_1()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getHasOneRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_2_2, 
                              		"co.gruposaberes.model.Rails.STRING");
                      	    
                    }

                    }
                    break;

            }


            }


            }

            // InternalRails.g:1131:2: (this_SPACE_3= RULE_SPACE )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_SPACE) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalRails.g:1131:3: this_SPACE_3= RULE_SPACE
            	    {
            	    this_SPACE_3=(Token)match(input,RULE_SPACE,FOLLOW_20); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SPACE_3, grammarAccess.getHasOneAccess().getSPACETerminalRuleCall_3()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            // InternalRails.g:1135:3: ( (lv_options_4_0= ruleHashKeyValue ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_COMMA) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalRails.g:1136:1: (lv_options_4_0= ruleHashKeyValue )
            	    {
            	    // InternalRails.g:1136:1: (lv_options_4_0= ruleHashKeyValue )
            	    // InternalRails.g:1137:3: lv_options_4_0= ruleHashKeyValue
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getHasOneAccess().getOptionsHashKeyValueParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_21);
            	    lv_options_4_0=ruleHashKeyValue();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getHasOneRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"options",
            	              		lv_options_4_0, 
            	              		"co.gruposaberes.model.Rails.HashKeyValue");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            // InternalRails.g:1153:3: (this_SL_COMMENT_5= RULE_SL_COMMENT )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_SL_COMMENT) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalRails.g:1153:4: this_SL_COMMENT_5= RULE_SL_COMMENT
                    {
                    this_SL_COMMENT_5=(Token)match(input,RULE_SL_COMMENT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SL_COMMENT_5, grammarAccess.getHasOneAccess().getSL_COMMENTTerminalRuleCall_5()); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleHasOne"


    // $ANTLR start "entryRuleHasAndBelongsToMany"
    // InternalRails.g:1165:1: entryRuleHasAndBelongsToMany returns [EObject current=null] : iv_ruleHasAndBelongsToMany= ruleHasAndBelongsToMany EOF ;
    public final EObject entryRuleHasAndBelongsToMany() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHasAndBelongsToMany = null;


        try {
            // InternalRails.g:1166:2: (iv_ruleHasAndBelongsToMany= ruleHasAndBelongsToMany EOF )
            // InternalRails.g:1167:2: iv_ruleHasAndBelongsToMany= ruleHasAndBelongsToMany EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHasAndBelongsToManyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleHasAndBelongsToMany=ruleHasAndBelongsToMany();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHasAndBelongsToMany; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleHasAndBelongsToMany"


    // $ANTLR start "ruleHasAndBelongsToMany"
    // InternalRails.g:1174:1: ruleHasAndBelongsToMany returns [EObject current=null] : (this_HAS_AND_BELONGS_TO_MANY_WORD_0= RULE_HAS_AND_BELONGS_TO_MANY_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )* ) ;
    public final EObject ruleHasAndBelongsToMany() throws RecognitionException {
        EObject current = null;

        Token this_HAS_AND_BELONGS_TO_MANY_WORD_0=null;
        Token this_SPACE_1=null;
        Token lv_name_2_1=null;
        Token lv_name_2_2=null;
        Token this_SPACE_3=null;
        EObject lv_options_4_0 = null;


         enterRule(); 
            
        try {
            // InternalRails.g:1177:28: ( (this_HAS_AND_BELONGS_TO_MANY_WORD_0= RULE_HAS_AND_BELONGS_TO_MANY_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )* ) )
            // InternalRails.g:1178:1: (this_HAS_AND_BELONGS_TO_MANY_WORD_0= RULE_HAS_AND_BELONGS_TO_MANY_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )* )
            {
            // InternalRails.g:1178:1: (this_HAS_AND_BELONGS_TO_MANY_WORD_0= RULE_HAS_AND_BELONGS_TO_MANY_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )* )
            // InternalRails.g:1178:2: this_HAS_AND_BELONGS_TO_MANY_WORD_0= RULE_HAS_AND_BELONGS_TO_MANY_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )*
            {
            this_HAS_AND_BELONGS_TO_MANY_WORD_0=(Token)match(input,RULE_HAS_AND_BELONGS_TO_MANY_WORD,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_HAS_AND_BELONGS_TO_MANY_WORD_0, grammarAccess.getHasAndBelongsToManyAccess().getHAS_AND_BELONGS_TO_MANY_WORDTerminalRuleCall_0()); 
                  
            }
            // InternalRails.g:1182:1: (this_SPACE_1= RULE_SPACE )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_SPACE) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalRails.g:1182:2: this_SPACE_1= RULE_SPACE
            	    {
            	    this_SPACE_1=(Token)match(input,RULE_SPACE,FOLLOW_19); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SPACE_1, grammarAccess.getHasAndBelongsToManyAccess().getSPACETerminalRuleCall_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            // InternalRails.g:1186:3: ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) )
            // InternalRails.g:1187:1: ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) )
            {
            // InternalRails.g:1187:1: ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) )
            // InternalRails.g:1188:1: (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING )
            {
            // InternalRails.g:1188:1: (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_SYMBOL) ) {
                alt42=1;
            }
            else if ( (LA42_0==RULE_STRING) ) {
                alt42=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalRails.g:1189:3: lv_name_2_1= RULE_SYMBOL
                    {
                    lv_name_2_1=(Token)match(input,RULE_SYMBOL,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_2_1, grammarAccess.getHasAndBelongsToManyAccess().getNameSYMBOLTerminalRuleCall_2_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getHasAndBelongsToManyRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_2_1, 
                              		"co.gruposaberes.model.Rails.SYMBOL");
                      	    
                    }

                    }
                    break;
                case 2 :
                    // InternalRails.g:1204:8: lv_name_2_2= RULE_STRING
                    {
                    lv_name_2_2=(Token)match(input,RULE_STRING,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_2_2, grammarAccess.getHasAndBelongsToManyAccess().getNameSTRINGTerminalRuleCall_2_0_1()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getHasAndBelongsToManyRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_2_2, 
                              		"co.gruposaberes.model.Rails.STRING");
                      	    
                    }

                    }
                    break;

            }


            }


            }

            // InternalRails.g:1222:2: (this_SPACE_3= RULE_SPACE )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_SPACE) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalRails.g:1222:3: this_SPACE_3= RULE_SPACE
            	    {
            	    this_SPACE_3=(Token)match(input,RULE_SPACE,FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SPACE_3, grammarAccess.getHasAndBelongsToManyAccess().getSPACETerminalRuleCall_3()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            // InternalRails.g:1226:3: ( (lv_options_4_0= ruleHashKeyValue ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==RULE_COMMA) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalRails.g:1227:1: (lv_options_4_0= ruleHashKeyValue )
            	    {
            	    // InternalRails.g:1227:1: (lv_options_4_0= ruleHashKeyValue )
            	    // InternalRails.g:1228:3: lv_options_4_0= ruleHashKeyValue
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getHasAndBelongsToManyAccess().getOptionsHashKeyValueParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_22);
            	    lv_options_4_0=ruleHashKeyValue();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getHasAndBelongsToManyRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"options",
            	              		lv_options_4_0, 
            	              		"co.gruposaberes.model.Rails.HashKeyValue");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleHasAndBelongsToMany"


    // $ANTLR start "entryRuleBelongsTo"
    // InternalRails.g:1252:1: entryRuleBelongsTo returns [EObject current=null] : iv_ruleBelongsTo= ruleBelongsTo EOF ;
    public final EObject entryRuleBelongsTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBelongsTo = null;


        try {
            // InternalRails.g:1253:2: (iv_ruleBelongsTo= ruleBelongsTo EOF )
            // InternalRails.g:1254:2: iv_ruleBelongsTo= ruleBelongsTo EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBelongsToRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBelongsTo=ruleBelongsTo();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBelongsTo; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBelongsTo"


    // $ANTLR start "ruleBelongsTo"
    // InternalRails.g:1261:1: ruleBelongsTo returns [EObject current=null] : (this_BELONGS_TO_WORD_0= RULE_BELONGS_TO_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )* ) ;
    public final EObject ruleBelongsTo() throws RecognitionException {
        EObject current = null;

        Token this_BELONGS_TO_WORD_0=null;
        Token this_SPACE_1=null;
        Token lv_name_2_1=null;
        Token lv_name_2_2=null;
        Token this_SPACE_3=null;
        EObject lv_options_4_0 = null;


         enterRule(); 
            
        try {
            // InternalRails.g:1264:28: ( (this_BELONGS_TO_WORD_0= RULE_BELONGS_TO_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )* ) )
            // InternalRails.g:1265:1: (this_BELONGS_TO_WORD_0= RULE_BELONGS_TO_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )* )
            {
            // InternalRails.g:1265:1: (this_BELONGS_TO_WORD_0= RULE_BELONGS_TO_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )* )
            // InternalRails.g:1265:2: this_BELONGS_TO_WORD_0= RULE_BELONGS_TO_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )*
            {
            this_BELONGS_TO_WORD_0=(Token)match(input,RULE_BELONGS_TO_WORD,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_BELONGS_TO_WORD_0, grammarAccess.getBelongsToAccess().getBELONGS_TO_WORDTerminalRuleCall_0()); 
                  
            }
            // InternalRails.g:1269:1: (this_SPACE_1= RULE_SPACE )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==RULE_SPACE) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalRails.g:1269:2: this_SPACE_1= RULE_SPACE
            	    {
            	    this_SPACE_1=(Token)match(input,RULE_SPACE,FOLLOW_19); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SPACE_1, grammarAccess.getBelongsToAccess().getSPACETerminalRuleCall_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            // InternalRails.g:1273:3: ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) )
            // InternalRails.g:1274:1: ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) )
            {
            // InternalRails.g:1274:1: ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) )
            // InternalRails.g:1275:1: (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING )
            {
            // InternalRails.g:1275:1: (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_SYMBOL) ) {
                alt46=1;
            }
            else if ( (LA46_0==RULE_STRING) ) {
                alt46=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // InternalRails.g:1276:3: lv_name_2_1= RULE_SYMBOL
                    {
                    lv_name_2_1=(Token)match(input,RULE_SYMBOL,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_2_1, grammarAccess.getBelongsToAccess().getNameSYMBOLTerminalRuleCall_2_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBelongsToRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_2_1, 
                              		"co.gruposaberes.model.Rails.SYMBOL");
                      	    
                    }

                    }
                    break;
                case 2 :
                    // InternalRails.g:1291:8: lv_name_2_2= RULE_STRING
                    {
                    lv_name_2_2=(Token)match(input,RULE_STRING,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_2_2, grammarAccess.getBelongsToAccess().getNameSTRINGTerminalRuleCall_2_0_1()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBelongsToRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_2_2, 
                              		"co.gruposaberes.model.Rails.STRING");
                      	    
                    }

                    }
                    break;

            }


            }


            }

            // InternalRails.g:1309:2: (this_SPACE_3= RULE_SPACE )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==RULE_SPACE) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalRails.g:1309:3: this_SPACE_3= RULE_SPACE
            	    {
            	    this_SPACE_3=(Token)match(input,RULE_SPACE,FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SPACE_3, grammarAccess.getBelongsToAccess().getSPACETerminalRuleCall_3()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            // InternalRails.g:1313:3: ( (lv_options_4_0= ruleHashKeyValue ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==RULE_COMMA) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalRails.g:1314:1: (lv_options_4_0= ruleHashKeyValue )
            	    {
            	    // InternalRails.g:1314:1: (lv_options_4_0= ruleHashKeyValue )
            	    // InternalRails.g:1315:3: lv_options_4_0= ruleHashKeyValue
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBelongsToAccess().getOptionsHashKeyValueParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_22);
            	    lv_options_4_0=ruleHashKeyValue();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBelongsToRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"options",
            	              		lv_options_4_0, 
            	              		"co.gruposaberes.model.Rails.HashKeyValue");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleBelongsTo"


    // $ANTLR start "entryRuleHashKeyValue"
    // InternalRails.g:1339:1: entryRuleHashKeyValue returns [EObject current=null] : iv_ruleHashKeyValue= ruleHashKeyValue EOF ;
    public final EObject entryRuleHashKeyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHashKeyValue = null;


        try {
            // InternalRails.g:1340:2: (iv_ruleHashKeyValue= ruleHashKeyValue EOF )
            // InternalRails.g:1341:2: iv_ruleHashKeyValue= ruleHashKeyValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHashKeyValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleHashKeyValue=ruleHashKeyValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHashKeyValue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleHashKeyValue"


    // $ANTLR start "ruleHashKeyValue"
    // InternalRails.g:1348:1: ruleHashKeyValue returns [EObject current=null] : (this_COMMA_0= RULE_COMMA (this_SPACE_1= RULE_SPACE )* ( ( ( (lv_key_2_0= RULE_ID ) ) otherlv_3= ':' ) | ( ( ( (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING ) ) ) (this_SPACE_5= RULE_SPACE )* otherlv_6= '=>' ) ) (this_SPACE_7= RULE_SPACE )* ( ( (lv_value_8_1= RULE_SYMBOL | lv_value_8_2= RULE_STRING | lv_value_8_3= RULE_BRACKET_BLOCK | lv_value_8_4= RULE_ARRAY_BLOCK | lv_value_8_5= RULE_DECIMAL | lv_value_8_6= RULE_INT | lv_value_8_7= RULE_INT_METHOD | lv_value_8_8= ruleMethodChainCall ) ) ) (this_SPACE_9= RULE_SPACE )* ) ;
    public final EObject ruleHashKeyValue() throws RecognitionException {
        EObject current = null;

        Token this_COMMA_0=null;
        Token this_SPACE_1=null;
        Token lv_key_2_0=null;
        Token otherlv_3=null;
        Token lv_key_4_1=null;
        Token lv_key_4_2=null;
        Token this_SPACE_5=null;
        Token otherlv_6=null;
        Token this_SPACE_7=null;
        Token lv_value_8_1=null;
        Token lv_value_8_2=null;
        Token lv_value_8_3=null;
        Token lv_value_8_4=null;
        Token lv_value_8_5=null;
        Token lv_value_8_6=null;
        Token lv_value_8_7=null;
        Token this_SPACE_9=null;
        AntlrDatatypeRuleToken lv_value_8_8 = null;


         enterRule(); 
            
        try {
            // InternalRails.g:1351:28: ( (this_COMMA_0= RULE_COMMA (this_SPACE_1= RULE_SPACE )* ( ( ( (lv_key_2_0= RULE_ID ) ) otherlv_3= ':' ) | ( ( ( (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING ) ) ) (this_SPACE_5= RULE_SPACE )* otherlv_6= '=>' ) ) (this_SPACE_7= RULE_SPACE )* ( ( (lv_value_8_1= RULE_SYMBOL | lv_value_8_2= RULE_STRING | lv_value_8_3= RULE_BRACKET_BLOCK | lv_value_8_4= RULE_ARRAY_BLOCK | lv_value_8_5= RULE_DECIMAL | lv_value_8_6= RULE_INT | lv_value_8_7= RULE_INT_METHOD | lv_value_8_8= ruleMethodChainCall ) ) ) (this_SPACE_9= RULE_SPACE )* ) )
            // InternalRails.g:1352:1: (this_COMMA_0= RULE_COMMA (this_SPACE_1= RULE_SPACE )* ( ( ( (lv_key_2_0= RULE_ID ) ) otherlv_3= ':' ) | ( ( ( (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING ) ) ) (this_SPACE_5= RULE_SPACE )* otherlv_6= '=>' ) ) (this_SPACE_7= RULE_SPACE )* ( ( (lv_value_8_1= RULE_SYMBOL | lv_value_8_2= RULE_STRING | lv_value_8_3= RULE_BRACKET_BLOCK | lv_value_8_4= RULE_ARRAY_BLOCK | lv_value_8_5= RULE_DECIMAL | lv_value_8_6= RULE_INT | lv_value_8_7= RULE_INT_METHOD | lv_value_8_8= ruleMethodChainCall ) ) ) (this_SPACE_9= RULE_SPACE )* )
            {
            // InternalRails.g:1352:1: (this_COMMA_0= RULE_COMMA (this_SPACE_1= RULE_SPACE )* ( ( ( (lv_key_2_0= RULE_ID ) ) otherlv_3= ':' ) | ( ( ( (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING ) ) ) (this_SPACE_5= RULE_SPACE )* otherlv_6= '=>' ) ) (this_SPACE_7= RULE_SPACE )* ( ( (lv_value_8_1= RULE_SYMBOL | lv_value_8_2= RULE_STRING | lv_value_8_3= RULE_BRACKET_BLOCK | lv_value_8_4= RULE_ARRAY_BLOCK | lv_value_8_5= RULE_DECIMAL | lv_value_8_6= RULE_INT | lv_value_8_7= RULE_INT_METHOD | lv_value_8_8= ruleMethodChainCall ) ) ) (this_SPACE_9= RULE_SPACE )* )
            // InternalRails.g:1352:2: this_COMMA_0= RULE_COMMA (this_SPACE_1= RULE_SPACE )* ( ( ( (lv_key_2_0= RULE_ID ) ) otherlv_3= ':' ) | ( ( ( (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING ) ) ) (this_SPACE_5= RULE_SPACE )* otherlv_6= '=>' ) ) (this_SPACE_7= RULE_SPACE )* ( ( (lv_value_8_1= RULE_SYMBOL | lv_value_8_2= RULE_STRING | lv_value_8_3= RULE_BRACKET_BLOCK | lv_value_8_4= RULE_ARRAY_BLOCK | lv_value_8_5= RULE_DECIMAL | lv_value_8_6= RULE_INT | lv_value_8_7= RULE_INT_METHOD | lv_value_8_8= ruleMethodChainCall ) ) ) (this_SPACE_9= RULE_SPACE )*
            {
            this_COMMA_0=(Token)match(input,RULE_COMMA,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_COMMA_0, grammarAccess.getHashKeyValueAccess().getCOMMATerminalRuleCall_0()); 
                  
            }
            // InternalRails.g:1356:1: (this_SPACE_1= RULE_SPACE )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==RULE_SPACE) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalRails.g:1356:2: this_SPACE_1= RULE_SPACE
            	    {
            	    this_SPACE_1=(Token)match(input,RULE_SPACE,FOLLOW_23); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SPACE_1, grammarAccess.getHashKeyValueAccess().getSPACETerminalRuleCall_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

            // InternalRails.g:1360:3: ( ( ( (lv_key_2_0= RULE_ID ) ) otherlv_3= ':' ) | ( ( ( (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING ) ) ) (this_SPACE_5= RULE_SPACE )* otherlv_6= '=>' ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_ID) ) {
                alt52=1;
            }
            else if ( ((LA52_0>=RULE_SYMBOL && LA52_0<=RULE_STRING)) ) {
                alt52=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // InternalRails.g:1360:4: ( ( (lv_key_2_0= RULE_ID ) ) otherlv_3= ':' )
                    {
                    // InternalRails.g:1360:4: ( ( (lv_key_2_0= RULE_ID ) ) otherlv_3= ':' )
                    // InternalRails.g:1360:5: ( (lv_key_2_0= RULE_ID ) ) otherlv_3= ':'
                    {
                    // InternalRails.g:1360:5: ( (lv_key_2_0= RULE_ID ) )
                    // InternalRails.g:1361:1: (lv_key_2_0= RULE_ID )
                    {
                    // InternalRails.g:1361:1: (lv_key_2_0= RULE_ID )
                    // InternalRails.g:1362:3: lv_key_2_0= RULE_ID
                    {
                    lv_key_2_0=(Token)match(input,RULE_ID,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_key_2_0, grammarAccess.getHashKeyValueAccess().getKeyIDTerminalRuleCall_2_0_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getHashKeyValueRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"key",
                              		lv_key_2_0, 
                              		"co.gruposaberes.model.Rails.ID");
                      	    
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,54,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getHashKeyValueAccess().getColonKeyword_2_0_1());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalRails.g:1383:6: ( ( ( (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING ) ) ) (this_SPACE_5= RULE_SPACE )* otherlv_6= '=>' )
                    {
                    // InternalRails.g:1383:6: ( ( ( (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING ) ) ) (this_SPACE_5= RULE_SPACE )* otherlv_6= '=>' )
                    // InternalRails.g:1383:7: ( ( (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING ) ) ) (this_SPACE_5= RULE_SPACE )* otherlv_6= '=>'
                    {
                    // InternalRails.g:1383:7: ( ( (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING ) ) )
                    // InternalRails.g:1384:1: ( (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING ) )
                    {
                    // InternalRails.g:1384:1: ( (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING ) )
                    // InternalRails.g:1385:1: (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING )
                    {
                    // InternalRails.g:1385:1: (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING )
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==RULE_SYMBOL) ) {
                        alt50=1;
                    }
                    else if ( (LA50_0==RULE_STRING) ) {
                        alt50=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 50, 0, input);

                        throw nvae;
                    }
                    switch (alt50) {
                        case 1 :
                            // InternalRails.g:1386:3: lv_key_4_1= RULE_SYMBOL
                            {
                            lv_key_4_1=(Token)match(input,RULE_SYMBOL,FOLLOW_26); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_key_4_1, grammarAccess.getHashKeyValueAccess().getKeySYMBOLTerminalRuleCall_2_1_0_0_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getHashKeyValueRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"key",
                                      		lv_key_4_1, 
                                      		"co.gruposaberes.model.Rails.SYMBOL");
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // InternalRails.g:1401:8: lv_key_4_2= RULE_STRING
                            {
                            lv_key_4_2=(Token)match(input,RULE_STRING,FOLLOW_26); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_key_4_2, grammarAccess.getHashKeyValueAccess().getKeySTRINGTerminalRuleCall_2_1_0_0_1()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getHashKeyValueRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"key",
                                      		lv_key_4_2, 
                                      		"co.gruposaberes.model.Rails.STRING");
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }

                    // InternalRails.g:1419:2: (this_SPACE_5= RULE_SPACE )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==RULE_SPACE) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // InternalRails.g:1419:3: this_SPACE_5= RULE_SPACE
                    	    {
                    	    this_SPACE_5=(Token)match(input,RULE_SPACE,FOLLOW_26); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_SPACE_5, grammarAccess.getHashKeyValueAccess().getSPACETerminalRuleCall_2_1_1()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop51;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,55,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getHashKeyValueAccess().getEqualsSignGreaterThanSignKeyword_2_1_2());
                          
                    }

                    }


                    }
                    break;

            }

            // InternalRails.g:1427:3: (this_SPACE_7= RULE_SPACE )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==RULE_SPACE) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalRails.g:1427:4: this_SPACE_7= RULE_SPACE
            	    {
            	    this_SPACE_7=(Token)match(input,RULE_SPACE,FOLLOW_25); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SPACE_7, grammarAccess.getHashKeyValueAccess().getSPACETerminalRuleCall_3()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

            // InternalRails.g:1431:3: ( ( (lv_value_8_1= RULE_SYMBOL | lv_value_8_2= RULE_STRING | lv_value_8_3= RULE_BRACKET_BLOCK | lv_value_8_4= RULE_ARRAY_BLOCK | lv_value_8_5= RULE_DECIMAL | lv_value_8_6= RULE_INT | lv_value_8_7= RULE_INT_METHOD | lv_value_8_8= ruleMethodChainCall ) ) )
            // InternalRails.g:1432:1: ( (lv_value_8_1= RULE_SYMBOL | lv_value_8_2= RULE_STRING | lv_value_8_3= RULE_BRACKET_BLOCK | lv_value_8_4= RULE_ARRAY_BLOCK | lv_value_8_5= RULE_DECIMAL | lv_value_8_6= RULE_INT | lv_value_8_7= RULE_INT_METHOD | lv_value_8_8= ruleMethodChainCall ) )
            {
            // InternalRails.g:1432:1: ( (lv_value_8_1= RULE_SYMBOL | lv_value_8_2= RULE_STRING | lv_value_8_3= RULE_BRACKET_BLOCK | lv_value_8_4= RULE_ARRAY_BLOCK | lv_value_8_5= RULE_DECIMAL | lv_value_8_6= RULE_INT | lv_value_8_7= RULE_INT_METHOD | lv_value_8_8= ruleMethodChainCall ) )
            // InternalRails.g:1433:1: (lv_value_8_1= RULE_SYMBOL | lv_value_8_2= RULE_STRING | lv_value_8_3= RULE_BRACKET_BLOCK | lv_value_8_4= RULE_ARRAY_BLOCK | lv_value_8_5= RULE_DECIMAL | lv_value_8_6= RULE_INT | lv_value_8_7= RULE_INT_METHOD | lv_value_8_8= ruleMethodChainCall )
            {
            // InternalRails.g:1433:1: (lv_value_8_1= RULE_SYMBOL | lv_value_8_2= RULE_STRING | lv_value_8_3= RULE_BRACKET_BLOCK | lv_value_8_4= RULE_ARRAY_BLOCK | lv_value_8_5= RULE_DECIMAL | lv_value_8_6= RULE_INT | lv_value_8_7= RULE_INT_METHOD | lv_value_8_8= ruleMethodChainCall )
            int alt54=8;
            switch ( input.LA(1) ) {
            case RULE_SYMBOL:
                {
                alt54=1;
                }
                break;
            case RULE_STRING:
                {
                alt54=2;
                }
                break;
            case RULE_BRACKET_BLOCK:
                {
                alt54=3;
                }
                break;
            case RULE_ARRAY_BLOCK:
                {
                alt54=4;
                }
                break;
            case RULE_DECIMAL:
                {
                alt54=5;
                }
                break;
            case RULE_INT:
                {
                alt54=6;
                }
                break;
            case RULE_INT_METHOD:
                {
                alt54=7;
                }
                break;
            case RULE_ID:
            case RULE_PARENTHESIS_BLOCK:
                {
                alt54=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }

            switch (alt54) {
                case 1 :
                    // InternalRails.g:1434:3: lv_value_8_1= RULE_SYMBOL
                    {
                    lv_value_8_1=(Token)match(input,RULE_SYMBOL,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_8_1, grammarAccess.getHashKeyValueAccess().getValueSYMBOLTerminalRuleCall_4_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getHashKeyValueRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_8_1, 
                              		"co.gruposaberes.model.Rails.SYMBOL");
                      	    
                    }

                    }
                    break;
                case 2 :
                    // InternalRails.g:1449:8: lv_value_8_2= RULE_STRING
                    {
                    lv_value_8_2=(Token)match(input,RULE_STRING,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_8_2, grammarAccess.getHashKeyValueAccess().getValueSTRINGTerminalRuleCall_4_0_1()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getHashKeyValueRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_8_2, 
                              		"co.gruposaberes.model.Rails.STRING");
                      	    
                    }

                    }
                    break;
                case 3 :
                    // InternalRails.g:1464:8: lv_value_8_3= RULE_BRACKET_BLOCK
                    {
                    lv_value_8_3=(Token)match(input,RULE_BRACKET_BLOCK,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_8_3, grammarAccess.getHashKeyValueAccess().getValueBRACKET_BLOCKTerminalRuleCall_4_0_2()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getHashKeyValueRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_8_3, 
                              		"co.gruposaberes.model.Rails.BRACKET_BLOCK");
                      	    
                    }

                    }
                    break;
                case 4 :
                    // InternalRails.g:1479:8: lv_value_8_4= RULE_ARRAY_BLOCK
                    {
                    lv_value_8_4=(Token)match(input,RULE_ARRAY_BLOCK,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_8_4, grammarAccess.getHashKeyValueAccess().getValueARRAY_BLOCKTerminalRuleCall_4_0_3()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getHashKeyValueRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_8_4, 
                              		"co.gruposaberes.model.Rails.ARRAY_BLOCK");
                      	    
                    }

                    }
                    break;
                case 5 :
                    // InternalRails.g:1494:8: lv_value_8_5= RULE_DECIMAL
                    {
                    lv_value_8_5=(Token)match(input,RULE_DECIMAL,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_8_5, grammarAccess.getHashKeyValueAccess().getValueDECIMALTerminalRuleCall_4_0_4()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getHashKeyValueRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_8_5, 
                              		"co.gruposaberes.model.Rails.DECIMAL");
                      	    
                    }

                    }
                    break;
                case 6 :
                    // InternalRails.g:1509:8: lv_value_8_6= RULE_INT
                    {
                    lv_value_8_6=(Token)match(input,RULE_INT,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_8_6, grammarAccess.getHashKeyValueAccess().getValueINTTerminalRuleCall_4_0_5()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getHashKeyValueRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_8_6, 
                              		"co.gruposaberes.model.Rails.INT");
                      	    
                    }

                    }
                    break;
                case 7 :
                    // InternalRails.g:1524:8: lv_value_8_7= RULE_INT_METHOD
                    {
                    lv_value_8_7=(Token)match(input,RULE_INT_METHOD,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_8_7, grammarAccess.getHashKeyValueAccess().getValueINT_METHODTerminalRuleCall_4_0_6()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getHashKeyValueRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_8_7, 
                              		"co.gruposaberes.model.Rails.INT_METHOD");
                      	    
                    }

                    }
                    break;
                case 8 :
                    // InternalRails.g:1539:8: lv_value_8_8= ruleMethodChainCall
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getHashKeyValueAccess().getValueMethodChainCallParserRuleCall_4_0_7()); 
                      	    
                    }
                    pushFollow(FOLLOW_27);
                    lv_value_8_8=ruleMethodChainCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getHashKeyValueRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_8_8, 
                              		"co.gruposaberes.model.Rails.MethodChainCall");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;

            }


            }


            }

            // InternalRails.g:1557:2: (this_SPACE_9= RULE_SPACE )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==RULE_SPACE) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalRails.g:1557:3: this_SPACE_9= RULE_SPACE
            	    {
            	    this_SPACE_9=(Token)match(input,RULE_SPACE,FOLLOW_27); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SPACE_9, grammarAccess.getHashKeyValueAccess().getSPACETerminalRuleCall_5()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleHashKeyValue"


    // $ANTLR start "entryRuleIgnoredHashKeyValue"
    // InternalRails.g:1569:1: entryRuleIgnoredHashKeyValue returns [String current=null] : iv_ruleIgnoredHashKeyValue= ruleIgnoredHashKeyValue EOF ;
    public final String entryRuleIgnoredHashKeyValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIgnoredHashKeyValue = null;


        try {
            // InternalRails.g:1570:2: (iv_ruleIgnoredHashKeyValue= ruleIgnoredHashKeyValue EOF )
            // InternalRails.g:1571:2: iv_ruleIgnoredHashKeyValue= ruleIgnoredHashKeyValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIgnoredHashKeyValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIgnoredHashKeyValue=ruleIgnoredHashKeyValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIgnoredHashKeyValue.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIgnoredHashKeyValue"


    // $ANTLR start "ruleIgnoredHashKeyValue"
    // InternalRails.g:1578:1: ruleIgnoredHashKeyValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_SPACE_0= RULE_SPACE )* ( (this_ID_1= RULE_ID kw= ':' ) | ( (this_SYMBOL_3= RULE_SYMBOL | this_STRING_4= RULE_STRING ) (this_SPACE_5= RULE_SPACE )* kw= '=>' ) ) (this_SPACE_7= RULE_SPACE )* (this_SYMBOL_8= RULE_SYMBOL | this_STRING_9= RULE_STRING | this_BRACKET_BLOCK_10= RULE_BRACKET_BLOCK | this_ARRAY_BLOCK_11= RULE_ARRAY_BLOCK | this_DECIMAL_12= RULE_DECIMAL | this_INT_13= RULE_INT | this_INT_METHOD_14= RULE_INT_METHOD | this_MethodChainCall_15= ruleMethodChainCall | this_REGEXP_16= RULE_REGEXP ) (this_SPACE_17= RULE_SPACE )* ) ;
    public final AntlrDatatypeRuleToken ruleIgnoredHashKeyValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SPACE_0=null;
        Token this_ID_1=null;
        Token kw=null;
        Token this_SYMBOL_3=null;
        Token this_STRING_4=null;
        Token this_SPACE_5=null;
        Token this_SPACE_7=null;
        Token this_SYMBOL_8=null;
        Token this_STRING_9=null;
        Token this_BRACKET_BLOCK_10=null;
        Token this_ARRAY_BLOCK_11=null;
        Token this_DECIMAL_12=null;
        Token this_INT_13=null;
        Token this_INT_METHOD_14=null;
        Token this_REGEXP_16=null;
        Token this_SPACE_17=null;
        AntlrDatatypeRuleToken this_MethodChainCall_15 = null;


         enterRule(); 
            
        try {
            // InternalRails.g:1581:28: ( ( (this_SPACE_0= RULE_SPACE )* ( (this_ID_1= RULE_ID kw= ':' ) | ( (this_SYMBOL_3= RULE_SYMBOL | this_STRING_4= RULE_STRING ) (this_SPACE_5= RULE_SPACE )* kw= '=>' ) ) (this_SPACE_7= RULE_SPACE )* (this_SYMBOL_8= RULE_SYMBOL | this_STRING_9= RULE_STRING | this_BRACKET_BLOCK_10= RULE_BRACKET_BLOCK | this_ARRAY_BLOCK_11= RULE_ARRAY_BLOCK | this_DECIMAL_12= RULE_DECIMAL | this_INT_13= RULE_INT | this_INT_METHOD_14= RULE_INT_METHOD | this_MethodChainCall_15= ruleMethodChainCall | this_REGEXP_16= RULE_REGEXP ) (this_SPACE_17= RULE_SPACE )* ) )
            // InternalRails.g:1582:1: ( (this_SPACE_0= RULE_SPACE )* ( (this_ID_1= RULE_ID kw= ':' ) | ( (this_SYMBOL_3= RULE_SYMBOL | this_STRING_4= RULE_STRING ) (this_SPACE_5= RULE_SPACE )* kw= '=>' ) ) (this_SPACE_7= RULE_SPACE )* (this_SYMBOL_8= RULE_SYMBOL | this_STRING_9= RULE_STRING | this_BRACKET_BLOCK_10= RULE_BRACKET_BLOCK | this_ARRAY_BLOCK_11= RULE_ARRAY_BLOCK | this_DECIMAL_12= RULE_DECIMAL | this_INT_13= RULE_INT | this_INT_METHOD_14= RULE_INT_METHOD | this_MethodChainCall_15= ruleMethodChainCall | this_REGEXP_16= RULE_REGEXP ) (this_SPACE_17= RULE_SPACE )* )
            {
            // InternalRails.g:1582:1: ( (this_SPACE_0= RULE_SPACE )* ( (this_ID_1= RULE_ID kw= ':' ) | ( (this_SYMBOL_3= RULE_SYMBOL | this_STRING_4= RULE_STRING ) (this_SPACE_5= RULE_SPACE )* kw= '=>' ) ) (this_SPACE_7= RULE_SPACE )* (this_SYMBOL_8= RULE_SYMBOL | this_STRING_9= RULE_STRING | this_BRACKET_BLOCK_10= RULE_BRACKET_BLOCK | this_ARRAY_BLOCK_11= RULE_ARRAY_BLOCK | this_DECIMAL_12= RULE_DECIMAL | this_INT_13= RULE_INT | this_INT_METHOD_14= RULE_INT_METHOD | this_MethodChainCall_15= ruleMethodChainCall | this_REGEXP_16= RULE_REGEXP ) (this_SPACE_17= RULE_SPACE )* )
            // InternalRails.g:1582:2: (this_SPACE_0= RULE_SPACE )* ( (this_ID_1= RULE_ID kw= ':' ) | ( (this_SYMBOL_3= RULE_SYMBOL | this_STRING_4= RULE_STRING ) (this_SPACE_5= RULE_SPACE )* kw= '=>' ) ) (this_SPACE_7= RULE_SPACE )* (this_SYMBOL_8= RULE_SYMBOL | this_STRING_9= RULE_STRING | this_BRACKET_BLOCK_10= RULE_BRACKET_BLOCK | this_ARRAY_BLOCK_11= RULE_ARRAY_BLOCK | this_DECIMAL_12= RULE_DECIMAL | this_INT_13= RULE_INT | this_INT_METHOD_14= RULE_INT_METHOD | this_MethodChainCall_15= ruleMethodChainCall | this_REGEXP_16= RULE_REGEXP ) (this_SPACE_17= RULE_SPACE )*
            {
            // InternalRails.g:1582:2: (this_SPACE_0= RULE_SPACE )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==RULE_SPACE) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalRails.g:1582:7: this_SPACE_0= RULE_SPACE
            	    {
            	    this_SPACE_0=(Token)match(input,RULE_SPACE,FOLLOW_23); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_SPACE_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SPACE_0, grammarAccess.getIgnoredHashKeyValueAccess().getSPACETerminalRuleCall_0()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

            // InternalRails.g:1589:3: ( (this_ID_1= RULE_ID kw= ':' ) | ( (this_SYMBOL_3= RULE_SYMBOL | this_STRING_4= RULE_STRING ) (this_SPACE_5= RULE_SPACE )* kw= '=>' ) )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_ID) ) {
                alt59=1;
            }
            else if ( ((LA59_0>=RULE_SYMBOL && LA59_0<=RULE_STRING)) ) {
                alt59=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // InternalRails.g:1589:4: (this_ID_1= RULE_ID kw= ':' )
                    {
                    // InternalRails.g:1589:4: (this_ID_1= RULE_ID kw= ':' )
                    // InternalRails.g:1589:9: this_ID_1= RULE_ID kw= ':'
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_1, grammarAccess.getIgnoredHashKeyValueAccess().getIDTerminalRuleCall_1_0_0()); 
                          
                    }
                    kw=(Token)match(input,54,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIgnoredHashKeyValueAccess().getColonKeyword_1_0_1()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalRails.g:1603:6: ( (this_SYMBOL_3= RULE_SYMBOL | this_STRING_4= RULE_STRING ) (this_SPACE_5= RULE_SPACE )* kw= '=>' )
                    {
                    // InternalRails.g:1603:6: ( (this_SYMBOL_3= RULE_SYMBOL | this_STRING_4= RULE_STRING ) (this_SPACE_5= RULE_SPACE )* kw= '=>' )
                    // InternalRails.g:1603:7: (this_SYMBOL_3= RULE_SYMBOL | this_STRING_4= RULE_STRING ) (this_SPACE_5= RULE_SPACE )* kw= '=>'
                    {
                    // InternalRails.g:1603:7: (this_SYMBOL_3= RULE_SYMBOL | this_STRING_4= RULE_STRING )
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==RULE_SYMBOL) ) {
                        alt57=1;
                    }
                    else if ( (LA57_0==RULE_STRING) ) {
                        alt57=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 57, 0, input);

                        throw nvae;
                    }
                    switch (alt57) {
                        case 1 :
                            // InternalRails.g:1603:12: this_SYMBOL_3= RULE_SYMBOL
                            {
                            this_SYMBOL_3=(Token)match(input,RULE_SYMBOL,FOLLOW_26); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_SYMBOL_3);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_SYMBOL_3, grammarAccess.getIgnoredHashKeyValueAccess().getSYMBOLTerminalRuleCall_1_1_0_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // InternalRails.g:1611:10: this_STRING_4= RULE_STRING
                            {
                            this_STRING_4=(Token)match(input,RULE_STRING,FOLLOW_26); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_STRING_4);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_STRING_4, grammarAccess.getIgnoredHashKeyValueAccess().getSTRINGTerminalRuleCall_1_1_0_1()); 
                                  
                            }

                            }
                            break;

                    }

                    // InternalRails.g:1618:2: (this_SPACE_5= RULE_SPACE )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==RULE_SPACE) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // InternalRails.g:1618:7: this_SPACE_5= RULE_SPACE
                    	    {
                    	    this_SPACE_5=(Token)match(input,RULE_SPACE,FOLLOW_26); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		current.merge(this_SPACE_5);
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_SPACE_5, grammarAccess.getIgnoredHashKeyValueAccess().getSPACETerminalRuleCall_1_1_1()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop58;
                        }
                    } while (true);

                    kw=(Token)match(input,55,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIgnoredHashKeyValueAccess().getEqualsSignGreaterThanSignKeyword_1_1_2()); 
                          
                    }

                    }


                    }
                    break;

            }

            // InternalRails.g:1631:3: (this_SPACE_7= RULE_SPACE )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==RULE_SPACE) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // InternalRails.g:1631:8: this_SPACE_7= RULE_SPACE
            	    {
            	    this_SPACE_7=(Token)match(input,RULE_SPACE,FOLLOW_16); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_SPACE_7);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SPACE_7, grammarAccess.getIgnoredHashKeyValueAccess().getSPACETerminalRuleCall_2()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);

            // InternalRails.g:1638:3: (this_SYMBOL_8= RULE_SYMBOL | this_STRING_9= RULE_STRING | this_BRACKET_BLOCK_10= RULE_BRACKET_BLOCK | this_ARRAY_BLOCK_11= RULE_ARRAY_BLOCK | this_DECIMAL_12= RULE_DECIMAL | this_INT_13= RULE_INT | this_INT_METHOD_14= RULE_INT_METHOD | this_MethodChainCall_15= ruleMethodChainCall | this_REGEXP_16= RULE_REGEXP )
            int alt61=9;
            alt61 = dfa61.predict(input);
            switch (alt61) {
                case 1 :
                    // InternalRails.g:1638:8: this_SYMBOL_8= RULE_SYMBOL
                    {
                    this_SYMBOL_8=(Token)match(input,RULE_SYMBOL,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_SYMBOL_8);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SYMBOL_8, grammarAccess.getIgnoredHashKeyValueAccess().getSYMBOLTerminalRuleCall_3_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalRails.g:1646:10: this_STRING_9= RULE_STRING
                    {
                    this_STRING_9=(Token)match(input,RULE_STRING,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_9);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_9, grammarAccess.getIgnoredHashKeyValueAccess().getSTRINGTerminalRuleCall_3_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalRails.g:1654:10: this_BRACKET_BLOCK_10= RULE_BRACKET_BLOCK
                    {
                    this_BRACKET_BLOCK_10=(Token)match(input,RULE_BRACKET_BLOCK,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BRACKET_BLOCK_10);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BRACKET_BLOCK_10, grammarAccess.getIgnoredHashKeyValueAccess().getBRACKET_BLOCKTerminalRuleCall_3_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // InternalRails.g:1662:10: this_ARRAY_BLOCK_11= RULE_ARRAY_BLOCK
                    {
                    this_ARRAY_BLOCK_11=(Token)match(input,RULE_ARRAY_BLOCK,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ARRAY_BLOCK_11);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ARRAY_BLOCK_11, grammarAccess.getIgnoredHashKeyValueAccess().getARRAY_BLOCKTerminalRuleCall_3_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // InternalRails.g:1670:10: this_DECIMAL_12= RULE_DECIMAL
                    {
                    this_DECIMAL_12=(Token)match(input,RULE_DECIMAL,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_DECIMAL_12);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_DECIMAL_12, grammarAccess.getIgnoredHashKeyValueAccess().getDECIMALTerminalRuleCall_3_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // InternalRails.g:1678:10: this_INT_13= RULE_INT
                    {
                    this_INT_13=(Token)match(input,RULE_INT,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_13);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_13, grammarAccess.getIgnoredHashKeyValueAccess().getINTTerminalRuleCall_3_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // InternalRails.g:1686:10: this_INT_METHOD_14= RULE_INT_METHOD
                    {
                    this_INT_METHOD_14=(Token)match(input,RULE_INT_METHOD,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_METHOD_14);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_METHOD_14, grammarAccess.getIgnoredHashKeyValueAccess().getINT_METHODTerminalRuleCall_3_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // InternalRails.g:1695:5: this_MethodChainCall_15= ruleMethodChainCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIgnoredHashKeyValueAccess().getMethodChainCallParserRuleCall_3_7()); 
                          
                    }
                    pushFollow(FOLLOW_27);
                    this_MethodChainCall_15=ruleMethodChainCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_MethodChainCall_15);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 9 :
                    // InternalRails.g:1706:10: this_REGEXP_16= RULE_REGEXP
                    {
                    this_REGEXP_16=(Token)match(input,RULE_REGEXP,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_REGEXP_16);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_REGEXP_16, grammarAccess.getIgnoredHashKeyValueAccess().getREGEXPTerminalRuleCall_3_8()); 
                          
                    }

                    }
                    break;

            }

            // InternalRails.g:1713:2: (this_SPACE_17= RULE_SPACE )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==RULE_SPACE) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // InternalRails.g:1713:7: this_SPACE_17= RULE_SPACE
            	    {
            	    this_SPACE_17=(Token)match(input,RULE_SPACE,FOLLOW_27); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_SPACE_17);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SPACE_17, grammarAccess.getIgnoredHashKeyValueAccess().getSPACETerminalRuleCall_4()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleIgnoredHashKeyValue"


    // $ANTLR start "entryRuleMethod"
    // InternalRails.g:1728:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // InternalRails.g:1729:2: (iv_ruleMethod= ruleMethod EOF )
            // InternalRails.g:1730:2: iv_ruleMethod= ruleMethod EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMethodRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMethod=ruleMethod();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMethod; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // InternalRails.g:1737:1: ruleMethod returns [EObject current=null] : (this_DEF_WORD_0= RULE_DEF_WORD (this_SPACE_1= RULE_SPACE )* ( (lv_name_2_0= ruleMethodName ) ) (this_SPACE_3= RULE_SPACE )* (this_PARENTHESIS_BLOCK_4= RULE_PARENTHESIS_BLOCK )? (this_SPACE_5= RULE_SPACE )* (this_BS_6= RULE_BS )? ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        Token this_DEF_WORD_0=null;
        Token this_SPACE_1=null;
        Token this_SPACE_3=null;
        Token this_PARENTHESIS_BLOCK_4=null;
        Token this_SPACE_5=null;
        Token this_BS_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // InternalRails.g:1740:28: ( (this_DEF_WORD_0= RULE_DEF_WORD (this_SPACE_1= RULE_SPACE )* ( (lv_name_2_0= ruleMethodName ) ) (this_SPACE_3= RULE_SPACE )* (this_PARENTHESIS_BLOCK_4= RULE_PARENTHESIS_BLOCK )? (this_SPACE_5= RULE_SPACE )* (this_BS_6= RULE_BS )? ) )
            // InternalRails.g:1741:1: (this_DEF_WORD_0= RULE_DEF_WORD (this_SPACE_1= RULE_SPACE )* ( (lv_name_2_0= ruleMethodName ) ) (this_SPACE_3= RULE_SPACE )* (this_PARENTHESIS_BLOCK_4= RULE_PARENTHESIS_BLOCK )? (this_SPACE_5= RULE_SPACE )* (this_BS_6= RULE_BS )? )
            {
            // InternalRails.g:1741:1: (this_DEF_WORD_0= RULE_DEF_WORD (this_SPACE_1= RULE_SPACE )* ( (lv_name_2_0= ruleMethodName ) ) (this_SPACE_3= RULE_SPACE )* (this_PARENTHESIS_BLOCK_4= RULE_PARENTHESIS_BLOCK )? (this_SPACE_5= RULE_SPACE )* (this_BS_6= RULE_BS )? )
            // InternalRails.g:1741:2: this_DEF_WORD_0= RULE_DEF_WORD (this_SPACE_1= RULE_SPACE )* ( (lv_name_2_0= ruleMethodName ) ) (this_SPACE_3= RULE_SPACE )* (this_PARENTHESIS_BLOCK_4= RULE_PARENTHESIS_BLOCK )? (this_SPACE_5= RULE_SPACE )* (this_BS_6= RULE_BS )?
            {
            this_DEF_WORD_0=(Token)match(input,RULE_DEF_WORD,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_DEF_WORD_0, grammarAccess.getMethodAccess().getDEF_WORDTerminalRuleCall_0()); 
                  
            }
            // InternalRails.g:1745:1: (this_SPACE_1= RULE_SPACE )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==RULE_SPACE) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // InternalRails.g:1745:2: this_SPACE_1= RULE_SPACE
            	    {
            	    this_SPACE_1=(Token)match(input,RULE_SPACE,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SPACE_1, grammarAccess.getMethodAccess().getSPACETerminalRuleCall_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);

            // InternalRails.g:1749:3: ( (lv_name_2_0= ruleMethodName ) )
            // InternalRails.g:1750:1: (lv_name_2_0= ruleMethodName )
            {
            // InternalRails.g:1750:1: (lv_name_2_0= ruleMethodName )
            // InternalRails.g:1751:3: lv_name_2_0= ruleMethodName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMethodAccess().getNameMethodNameParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_28);
            lv_name_2_0=ruleMethodName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMethodRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"co.gruposaberes.model.Rails.MethodName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalRails.g:1767:2: (this_SPACE_3= RULE_SPACE )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==RULE_SPACE) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // InternalRails.g:1767:3: this_SPACE_3= RULE_SPACE
            	    {
            	    this_SPACE_3=(Token)match(input,RULE_SPACE,FOLLOW_28); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SPACE_3, grammarAccess.getMethodAccess().getSPACETerminalRuleCall_3()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);

            // InternalRails.g:1771:3: (this_PARENTHESIS_BLOCK_4= RULE_PARENTHESIS_BLOCK )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==RULE_PARENTHESIS_BLOCK) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalRails.g:1771:4: this_PARENTHESIS_BLOCK_4= RULE_PARENTHESIS_BLOCK
                    {
                    this_PARENTHESIS_BLOCK_4=(Token)match(input,RULE_PARENTHESIS_BLOCK,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PARENTHESIS_BLOCK_4, grammarAccess.getMethodAccess().getPARENTHESIS_BLOCKTerminalRuleCall_4()); 
                          
                    }

                    }
                    break;

            }

            // InternalRails.g:1775:3: (this_SPACE_5= RULE_SPACE )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==RULE_SPACE) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // InternalRails.g:1775:4: this_SPACE_5= RULE_SPACE
            	    {
            	    this_SPACE_5=(Token)match(input,RULE_SPACE,FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SPACE_5, grammarAccess.getMethodAccess().getSPACETerminalRuleCall_5()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);

            // InternalRails.g:1779:3: (this_BS_6= RULE_BS )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==RULE_BS) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalRails.g:1779:4: this_BS_6= RULE_BS
                    {
                    this_BS_6=(Token)match(input,RULE_BS,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BS_6, grammarAccess.getMethodAccess().getBSTerminalRuleCall_6()); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleMethodName"
    // InternalRails.g:1791:1: entryRuleMethodName returns [String current=null] : iv_ruleMethodName= ruleMethodName EOF ;
    public final String entryRuleMethodName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMethodName = null;


        try {
            // InternalRails.g:1792:2: (iv_ruleMethodName= ruleMethodName EOF )
            // InternalRails.g:1793:2: iv_ruleMethodName= ruleMethodName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMethodNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMethodName=ruleMethodName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMethodName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMethodName"


    // $ANTLR start "ruleMethodName"
    // InternalRails.g:1800:1: ruleMethodName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_NamespacedModuleName_0= ruleNamespacedModuleName kw= '.' )? this_ID_2= RULE_ID (kw= '?' | kw= '=' )? ) ;
    public final AntlrDatatypeRuleToken ruleMethodName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_2=null;
        AntlrDatatypeRuleToken this_NamespacedModuleName_0 = null;


         enterRule(); 
            
        try {
            // InternalRails.g:1803:28: ( ( (this_NamespacedModuleName_0= ruleNamespacedModuleName kw= '.' )? this_ID_2= RULE_ID (kw= '?' | kw= '=' )? ) )
            // InternalRails.g:1804:1: ( (this_NamespacedModuleName_0= ruleNamespacedModuleName kw= '.' )? this_ID_2= RULE_ID (kw= '?' | kw= '=' )? )
            {
            // InternalRails.g:1804:1: ( (this_NamespacedModuleName_0= ruleNamespacedModuleName kw= '.' )? this_ID_2= RULE_ID (kw= '?' | kw= '=' )? )
            // InternalRails.g:1804:2: (this_NamespacedModuleName_0= ruleNamespacedModuleName kw= '.' )? this_ID_2= RULE_ID (kw= '?' | kw= '=' )?
            {
            // InternalRails.g:1804:2: (this_NamespacedModuleName_0= ruleNamespacedModuleName kw= '.' )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==RULE_ID) ) {
                int LA68_1 = input.LA(2);

                if ( ((LA68_1>=31 && LA68_1<=32)) ) {
                    alt68=1;
                }
            }
            switch (alt68) {
                case 1 :
                    // InternalRails.g:1805:5: this_NamespacedModuleName_0= ruleNamespacedModuleName kw= '.'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMethodNameAccess().getNamespacedModuleNameParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_29);
                    this_NamespacedModuleName_0=ruleNamespacedModuleName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_NamespacedModuleName_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    kw=(Token)match(input,32,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getMethodNameAccess().getFullStopKeyword_0_1()); 
                          
                    }

                    }
                    break;

            }

            this_ID_2=(Token)match(input,RULE_ID,FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_2);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_2, grammarAccess.getMethodNameAccess().getIDTerminalRuleCall_1()); 
                  
            }
            // InternalRails.g:1828:1: (kw= '?' | kw= '=' )?
            int alt69=3;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==34) ) {
                alt69=1;
            }
            else if ( (LA69_0==41) ) {
                alt69=2;
            }
            switch (alt69) {
                case 1 :
                    // InternalRails.g:1829:2: kw= '?'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getMethodNameAccess().getQuestionMarkKeyword_2_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalRails.g:1836:2: kw= '='
                    {
                    kw=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getMethodNameAccess().getEqualsSignKeyword_2_1()); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleMethodName"

    // $ANTLR start synpred1_InternalRails
    public final void synpred1_InternalRails_fragment() throws RecognitionException {   
        // InternalRails.g:371:4: ( RULE_SPACE )
        // InternalRails.g:371:6: RULE_SPACE
        {
        match(input,RULE_SPACE,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalRails

    // $ANTLR start synpred2_InternalRails
    public final void synpred2_InternalRails_fragment() throws RecognitionException {   
        // InternalRails.g:385:4: ( RULE_SPACE )
        // InternalRails.g:385:6: RULE_SPACE
        {
        match(input,RULE_SPACE,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalRails

    // $ANTLR start synpred3_InternalRails
    public final void synpred3_InternalRails_fragment() throws RecognitionException {   
        // InternalRails.g:399:4: ( RULE_SPACE )
        // InternalRails.g:399:6: RULE_SPACE
        {
        match(input,RULE_SPACE,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalRails

    // $ANTLR start synpred4_InternalRails
    public final void synpred4_InternalRails_fragment() throws RecognitionException {   
        // InternalRails.g:406:4: ( RULE_BS )
        // InternalRails.g:406:6: RULE_BS
        {
        match(input,RULE_BS,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_InternalRails

    // Delegated rules

    public final boolean synpred3_InternalRails() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalRails_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalRails() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalRails_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalRails() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalRails_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalRails() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalRails_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA13 dfa13 = new DFA13(this);
    protected DFA24 dfa24 = new DFA24(this);
    protected DFA61 dfa61 = new DFA61(this);
    static final String dfa_1s = "\4\uffff";
    static final String dfa_2s = "\2\3\2\uffff";
    static final String dfa_3s = "\2\5\2\uffff";
    static final String dfa_4s = "\2\36\2\uffff";
    static final String dfa_5s = "\2\uffff\1\1\1\2";
    static final String dfa_6s = "\4\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\10\3\6\uffff\5\3\5\uffff\1\2",
            "\1\1\10\3\6\uffff\5\3\5\uffff\1\2",
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
            return "106:2: ( (this_SPACE_3= RULE_SPACE )* otherlv_4= '<' (this_SPACE_5= RULE_SPACE )* ( (lv_superType_6_0= ruleNamespacedModuleName ) ) )?";
        }
    }
    static final String dfa_8s = "\16\uffff";
    static final String dfa_9s = "\1\11\7\uffff\1\11\1\uffff\4\11";
    static final String dfa_10s = "\1\5\7\uffff\1\5\1\uffff\4\5";
    static final String dfa_11s = "\1\65\7\uffff\1\65\1\uffff\2\67\1\66\1\67";
    static final String dfa_12s = "\1\uffff\7\1\1\uffff\1\2\4\uffff";
    static final String dfa_13s = "\16\uffff}>";
    static final String[] dfa_14s = {
            "\1\10\1\11\1\7\1\2\1\3\1\5\1\6\1\1\1\4\4\11\1\4\1\5\5\11\5\uffff\1\11\2\uffff\25\11",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\10\1\11\1\14\1\12\1\13\10\11\2\uffff\5\11\5\uffff\1\11\2\uffff\25\11",
            "",
            "\1\15\13\11\1\uffff\7\11\5\uffff\1\11\1\uffff\26\11\1\uffff\1\7",
            "\1\15\13\11\1\uffff\7\11\5\uffff\1\11\1\uffff\26\11\1\uffff\1\7",
            "\14\11\1\uffff\7\11\5\uffff\30\11\1\7",
            "\1\15\13\11\1\uffff\7\11\5\uffff\1\11\2\uffff\25\11\1\uffff\1\7"
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "360:3: (this_MethodCallParameters_11= ruleMethodCallParameters )?";
        }
    }
    static final String dfa_15s = "\17\uffff";
    static final String dfa_16s = "\1\uffff\1\14\1\16\6\uffff\1\10\1\uffff\1\14\1\uffff\1\16\1\uffff";
    static final String dfa_17s = "\3\5\6\uffff\1\5\1\uffff\1\5\1\uffff\1\5\1\uffff";
    static final String dfa_18s = "\1\23\2\67\6\uffff\1\66\1\uffff\1\67\1\uffff\1\67\1\uffff";
    static final String dfa_19s = "\3\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\uffff\1\11\1\uffff\1\1\1\uffff\1\2";
    static final String dfa_20s = "\17\uffff}>";
    static final String[] dfa_21s = {
            "\1\12\1\uffff\1\11\1\1\1\2\1\6\1\10\1\4\1\3\4\uffff\1\5\1\7",
            "\1\13\14\14\2\uffff\5\14\5\uffff\1\14\2\uffff\25\14\1\uffff\1\12",
            "\1\15\14\16\2\uffff\5\16\5\uffff\1\16\2\uffff\25\16\1\uffff\1\12",
            "",
            "",
            "",
            "",
            "",
            "",
            "\24\10\5\uffff\30\10\1\12",
            "",
            "\1\13\14\14\2\uffff\5\14\5\uffff\1\14\2\uffff\25\14\1\uffff\1\12",
            "",
            "\1\15\14\16\2\uffff\5\16\5\uffff\1\16\2\uffff\25\16\1\uffff\1\12",
            ""
    };

    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final char[] dfa_18 = DFA.unpackEncodedStringToUnsignedChars(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final short[][] dfa_21 = unpackEncodedStringArray(dfa_21s);

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = dfa_15;
            this.eof = dfa_16;
            this.min = dfa_17;
            this.max = dfa_18;
            this.accept = dfa_19;
            this.special = dfa_20;
            this.transition = dfa_21;
        }
        public String getDescription() {
            return "538:1: (this_SYMBOL_0= RULE_SYMBOL | this_STRING_1= RULE_STRING | this_ARRAY_BLOCK_2= RULE_ARRAY_BLOCK | this_PARENTHESIS_BLOCK_3= RULE_PARENTHESIS_BLOCK | this_DECIMAL_4= RULE_DECIMAL | this_INT_5= RULE_INT | this_REGEXP_6= RULE_REGEXP | this_MethodChainCall_7= ruleMethodChainCall | this_IgnoredHashKeyValue_8= ruleIgnoredHashKeyValue )";
        }
    }
    static final String dfa_22s = "\12\uffff";
    static final String dfa_23s = "\1\7\11\uffff";
    static final String dfa_24s = "\1\23\11\uffff";
    static final String dfa_25s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11";
    static final String dfa_26s = "\12\uffff}>";
    static final String[] dfa_27s = {
            "\1\10\1\1\1\2\1\6\1\7\1\10\1\4\1\3\3\uffff\1\5\1\11",
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

    static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);
    static final char[] dfa_23 = DFA.unpackEncodedStringToUnsignedChars(dfa_23s);
    static final char[] dfa_24 = DFA.unpackEncodedStringToUnsignedChars(dfa_24s);
    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final short[] dfa_26 = DFA.unpackEncodedString(dfa_26s);
    static final short[][] dfa_27 = unpackEncodedStringArray(dfa_27s);

    class DFA61 extends DFA {

        public DFA61(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 61;
            this.eot = dfa_22;
            this.eof = dfa_22;
            this.min = dfa_23;
            this.max = dfa_24;
            this.accept = dfa_25;
            this.special = dfa_26;
            this.transition = dfa_27;
        }
        public String getDescription() {
            return "1638:3: (this_SYMBOL_8= RULE_SYMBOL | this_STRING_9= RULE_STRING | this_BRACKET_BLOCK_10= RULE_BRACKET_BLOCK | this_ARRAY_BLOCK_11= RULE_ARRAY_BLOCK | this_DECIMAL_12= RULE_DECIMAL | this_INT_13= RULE_INT | this_INT_METHOD_14= RULE_INT_METHOD | this_MethodChainCall_15= ruleMethodChainCall | this_REGEXP_16= RULE_REGEXP )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000041F03FE2L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000040000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000001F03FE2L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000001000DFFA2L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000DFFA2L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000000001C022L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000018022L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000010022L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020022L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000000C7FA0L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x003FFFFE40000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000320L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000020062L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000020042L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000000000003A0L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000047FA0L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0080000000000020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000011022L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000020400000002L});

}