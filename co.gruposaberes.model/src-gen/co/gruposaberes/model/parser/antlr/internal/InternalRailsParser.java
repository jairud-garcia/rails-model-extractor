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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_CLASS_WORD", "RULE_SPACE", "RULE_ID", "RULE_SYMBOL", "RULE_STRING", "RULE_INT", "RULE_INT_METHOD", "RULE_PARENTHESIS_BLOCK", "RULE_ARRAY_BLOCK", "RULE_BRACKET_BLOCK", "RULE_DO_BLOCK_PARAMETERS", "RULE_COMMA", "RULE_DECIMAL", "RULE_REGEXP", "RULE_HAS_MANY_WORD", "RULE_SL_COMMENT", "RULE_HAS_ONE_WORD", "RULE_HAS_AND_BELONGS_TO_MANY_WORD", "RULE_BELONGS_TO_WORD", "RULE_DEF_WORD", "RULE_MODULE_WORD", "RULE_ML_COMMENT", "RULE_BS", "RULE_ANY_OTHER", "'<'", "'::'", "'.'", "': '", "'?'", "'+'", "'-'", "'*'", "'/'", "'%'", "'**'", "'='", "'~'", "'|'", "'||'", "'&'", "'&&'", "'=='", "'!'", "'<<'", "'<=>'", "'>'", "'..'", "'...'", "':'", "'=>'"
    };
    public static final int T__50=50;
    public static final int RULE_HAS_MANY_WORD=18;
    public static final int RULE_DO_BLOCK_PARAMETERS=14;
    public static final int RULE_PARENTHESIS_BLOCK=11;
    public static final int RULE_HAS_ONE_WORD=20;
    public static final int RULE_SPACE=5;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int RULE_ID=6;
    public static final int RULE_COMMA=15;
    public static final int RULE_DECIMAL=16;
    public static final int RULE_MODULE_WORD=24;
    public static final int T__28=28;
    public static final int RULE_INT=9;
    public static final int T__29=29;
    public static final int RULE_ML_COMMENT=25;
    public static final int RULE_DEF_WORD=23;
    public static final int RULE_CLASS_WORD=4;
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=19;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int RULE_HAS_AND_BELONGS_TO_MANY_WORD=21;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int RULE_REGEXP=17;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ARRAY_BLOCK=12;
    public static final int RULE_ANY_OTHER=27;
    public static final int RULE_BS=26;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_BRACKET_BLOCK=13;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_SYMBOL=7;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int RULE_INT_METHOD=10;
    public static final int T__41=41;
    public static final int RULE_BELONGS_TO_WORD=22;
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

                    otherlv_4=(Token)match(input,28,FOLLOW_3); if (state.failed) return current;
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

                if ( ((LA6_0>=RULE_ID && LA6_0<=RULE_ARRAY_BLOCK)||LA6_0==RULE_HAS_MANY_WORD||(LA6_0>=RULE_HAS_ONE_WORD && LA6_0<=RULE_DEF_WORD)) ) {
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
    // InternalRails.g:175:1: ruleClassElement returns [EObject current=null] : (this_Method_0= ruleMethod | this_Relationship_1= ruleRelationship | ruleOperationsChain ) ;
    public final EObject ruleClassElement() throws RecognitionException {
        EObject current = null;

        EObject this_Method_0 = null;

        EObject this_Relationship_1 = null;


         enterRule(); 
            
        try {
            // InternalRails.g:178:28: ( (this_Method_0= ruleMethod | this_Relationship_1= ruleRelationship | ruleOperationsChain ) )
            // InternalRails.g:179:1: (this_Method_0= ruleMethod | this_Relationship_1= ruleRelationship | ruleOperationsChain )
            {
            // InternalRails.g:179:1: (this_Method_0= ruleMethod | this_Relationship_1= ruleRelationship | ruleOperationsChain )
            int alt7=3;
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
    // InternalRails.g:215:1: entryRuleNamespacedModuleName returns [String current=null] : iv_ruleNamespacedModuleName= ruleNamespacedModuleName EOF ;
    public final String entryRuleNamespacedModuleName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNamespacedModuleName = null;


        try {
            // InternalRails.g:216:2: (iv_ruleNamespacedModuleName= ruleNamespacedModuleName EOF )
            // InternalRails.g:217:2: iv_ruleNamespacedModuleName= ruleNamespacedModuleName EOF
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
    // InternalRails.g:224:1: ruleNamespacedModuleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID kw= '::' )* this_ID_2= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleNamespacedModuleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // InternalRails.g:227:28: ( ( (this_ID_0= RULE_ID kw= '::' )* this_ID_2= RULE_ID ) )
            // InternalRails.g:228:1: ( (this_ID_0= RULE_ID kw= '::' )* this_ID_2= RULE_ID )
            {
            // InternalRails.g:228:1: ( (this_ID_0= RULE_ID kw= '::' )* this_ID_2= RULE_ID )
            // InternalRails.g:228:2: (this_ID_0= RULE_ID kw= '::' )* this_ID_2= RULE_ID
            {
            // InternalRails.g:228:2: (this_ID_0= RULE_ID kw= '::' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1==29) ) {
                        alt8=1;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // InternalRails.g:228:7: this_ID_0= RULE_ID kw= '::'
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_0, grammarAccess.getNamespacedModuleNameAccess().getIDTerminalRuleCall_0_0()); 
            	          
            	    }
            	    kw=(Token)match(input,29,FOLLOW_8); if (state.failed) return current;
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
    // InternalRails.g:256:1: entryRuleMethodChainCall returns [String current=null] : iv_ruleMethodChainCall= ruleMethodChainCall EOF ;
    public final String entryRuleMethodChainCall() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMethodChainCall = null;


        try {
            // InternalRails.g:257:2: (iv_ruleMethodChainCall= ruleMethodChainCall EOF )
            // InternalRails.g:258:2: iv_ruleMethodChainCall= ruleMethodChainCall EOF
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
    // InternalRails.g:265:1: ruleMethodChainCall returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_SYMBOL_0= RULE_SYMBOL | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT | this_INT_METHOD_3= RULE_INT_METHOD | this_PARENTHESIS_BLOCK_4= RULE_PARENTHESIS_BLOCK | this_ARRAY_BLOCK_5= RULE_ARRAY_BLOCK | this_NamespacedModuleName_6= ruleNamespacedModuleName ) (kw= '.' this_ID_8= RULE_ID (this_PARENTHESIS_BLOCK_9= RULE_PARENTHESIS_BLOCK )? )* (this_SPACE_10= RULE_SPACE )* (this_MethodCallParameters_11= ruleMethodCallParameters )? ( ( RULE_SPACE )=>this_SPACE_12= RULE_SPACE )* (this_BRACKET_BLOCK_13= RULE_BRACKET_BLOCK )? ( ( RULE_SPACE )=>this_SPACE_14= RULE_SPACE )* (this_DO_BLOCK_PARAMETERS_15= RULE_DO_BLOCK_PARAMETERS )? ( ( RULE_SPACE )=>this_SPACE_16= RULE_SPACE )* ) ;
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
        AntlrDatatypeRuleToken this_NamespacedModuleName_6 = null;

        AntlrDatatypeRuleToken this_MethodCallParameters_11 = null;


         enterRule(); 
            
        try {
            // InternalRails.g:268:28: ( ( (this_SYMBOL_0= RULE_SYMBOL | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT | this_INT_METHOD_3= RULE_INT_METHOD | this_PARENTHESIS_BLOCK_4= RULE_PARENTHESIS_BLOCK | this_ARRAY_BLOCK_5= RULE_ARRAY_BLOCK | this_NamespacedModuleName_6= ruleNamespacedModuleName ) (kw= '.' this_ID_8= RULE_ID (this_PARENTHESIS_BLOCK_9= RULE_PARENTHESIS_BLOCK )? )* (this_SPACE_10= RULE_SPACE )* (this_MethodCallParameters_11= ruleMethodCallParameters )? ( ( RULE_SPACE )=>this_SPACE_12= RULE_SPACE )* (this_BRACKET_BLOCK_13= RULE_BRACKET_BLOCK )? ( ( RULE_SPACE )=>this_SPACE_14= RULE_SPACE )* (this_DO_BLOCK_PARAMETERS_15= RULE_DO_BLOCK_PARAMETERS )? ( ( RULE_SPACE )=>this_SPACE_16= RULE_SPACE )* ) )
            // InternalRails.g:269:1: ( (this_SYMBOL_0= RULE_SYMBOL | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT | this_INT_METHOD_3= RULE_INT_METHOD | this_PARENTHESIS_BLOCK_4= RULE_PARENTHESIS_BLOCK | this_ARRAY_BLOCK_5= RULE_ARRAY_BLOCK | this_NamespacedModuleName_6= ruleNamespacedModuleName ) (kw= '.' this_ID_8= RULE_ID (this_PARENTHESIS_BLOCK_9= RULE_PARENTHESIS_BLOCK )? )* (this_SPACE_10= RULE_SPACE )* (this_MethodCallParameters_11= ruleMethodCallParameters )? ( ( RULE_SPACE )=>this_SPACE_12= RULE_SPACE )* (this_BRACKET_BLOCK_13= RULE_BRACKET_BLOCK )? ( ( RULE_SPACE )=>this_SPACE_14= RULE_SPACE )* (this_DO_BLOCK_PARAMETERS_15= RULE_DO_BLOCK_PARAMETERS )? ( ( RULE_SPACE )=>this_SPACE_16= RULE_SPACE )* )
            {
            // InternalRails.g:269:1: ( (this_SYMBOL_0= RULE_SYMBOL | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT | this_INT_METHOD_3= RULE_INT_METHOD | this_PARENTHESIS_BLOCK_4= RULE_PARENTHESIS_BLOCK | this_ARRAY_BLOCK_5= RULE_ARRAY_BLOCK | this_NamespacedModuleName_6= ruleNamespacedModuleName ) (kw= '.' this_ID_8= RULE_ID (this_PARENTHESIS_BLOCK_9= RULE_PARENTHESIS_BLOCK )? )* (this_SPACE_10= RULE_SPACE )* (this_MethodCallParameters_11= ruleMethodCallParameters )? ( ( RULE_SPACE )=>this_SPACE_12= RULE_SPACE )* (this_BRACKET_BLOCK_13= RULE_BRACKET_BLOCK )? ( ( RULE_SPACE )=>this_SPACE_14= RULE_SPACE )* (this_DO_BLOCK_PARAMETERS_15= RULE_DO_BLOCK_PARAMETERS )? ( ( RULE_SPACE )=>this_SPACE_16= RULE_SPACE )* )
            // InternalRails.g:269:2: (this_SYMBOL_0= RULE_SYMBOL | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT | this_INT_METHOD_3= RULE_INT_METHOD | this_PARENTHESIS_BLOCK_4= RULE_PARENTHESIS_BLOCK | this_ARRAY_BLOCK_5= RULE_ARRAY_BLOCK | this_NamespacedModuleName_6= ruleNamespacedModuleName ) (kw= '.' this_ID_8= RULE_ID (this_PARENTHESIS_BLOCK_9= RULE_PARENTHESIS_BLOCK )? )* (this_SPACE_10= RULE_SPACE )* (this_MethodCallParameters_11= ruleMethodCallParameters )? ( ( RULE_SPACE )=>this_SPACE_12= RULE_SPACE )* (this_BRACKET_BLOCK_13= RULE_BRACKET_BLOCK )? ( ( RULE_SPACE )=>this_SPACE_14= RULE_SPACE )* (this_DO_BLOCK_PARAMETERS_15= RULE_DO_BLOCK_PARAMETERS )? ( ( RULE_SPACE )=>this_SPACE_16= RULE_SPACE )*
            {
            // InternalRails.g:269:2: (this_SYMBOL_0= RULE_SYMBOL | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT | this_INT_METHOD_3= RULE_INT_METHOD | this_PARENTHESIS_BLOCK_4= RULE_PARENTHESIS_BLOCK | this_ARRAY_BLOCK_5= RULE_ARRAY_BLOCK | this_NamespacedModuleName_6= ruleNamespacedModuleName )
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
                    // InternalRails.g:269:7: this_SYMBOL_0= RULE_SYMBOL
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
                    // InternalRails.g:277:10: this_STRING_1= RULE_STRING
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
                    // InternalRails.g:285:10: this_INT_2= RULE_INT
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
                    // InternalRails.g:293:10: this_INT_METHOD_3= RULE_INT_METHOD
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
                    // InternalRails.g:301:10: this_PARENTHESIS_BLOCK_4= RULE_PARENTHESIS_BLOCK
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
                    // InternalRails.g:309:10: this_ARRAY_BLOCK_5= RULE_ARRAY_BLOCK
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
                    // InternalRails.g:318:5: this_NamespacedModuleName_6= ruleNamespacedModuleName
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

            // InternalRails.g:328:2: (kw= '.' this_ID_8= RULE_ID (this_PARENTHESIS_BLOCK_9= RULE_PARENTHESIS_BLOCK )? )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==30) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalRails.g:329:2: kw= '.' this_ID_8= RULE_ID (this_PARENTHESIS_BLOCK_9= RULE_PARENTHESIS_BLOCK )?
            	    {
            	    kw=(Token)match(input,30,FOLLOW_8); if (state.failed) return current;
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
            	    // InternalRails.g:341:1: (this_PARENTHESIS_BLOCK_9= RULE_PARENTHESIS_BLOCK )?
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==RULE_PARENTHESIS_BLOCK) ) {
            	        alt10=1;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // InternalRails.g:341:6: this_PARENTHESIS_BLOCK_9= RULE_PARENTHESIS_BLOCK
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

            // InternalRails.g:348:5: (this_SPACE_10= RULE_SPACE )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_SPACE) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalRails.g:348:10: this_SPACE_10= RULE_SPACE
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

            // InternalRails.g:355:3: (this_MethodCallParameters_11= ruleMethodCallParameters )?
            int alt13=2;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // InternalRails.g:356:5: this_MethodCallParameters_11= ruleMethodCallParameters
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

            // InternalRails.g:366:3: ( ( RULE_SPACE )=>this_SPACE_12= RULE_SPACE )*
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
            	    // InternalRails.g:366:4: ( RULE_SPACE )=>this_SPACE_12= RULE_SPACE
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

            // InternalRails.g:373:3: (this_BRACKET_BLOCK_13= RULE_BRACKET_BLOCK )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_BRACKET_BLOCK) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalRails.g:373:8: this_BRACKET_BLOCK_13= RULE_BRACKET_BLOCK
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

            // InternalRails.g:380:3: ( ( RULE_SPACE )=>this_SPACE_14= RULE_SPACE )*
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
            	    // InternalRails.g:380:4: ( RULE_SPACE )=>this_SPACE_14= RULE_SPACE
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

            // InternalRails.g:387:3: (this_DO_BLOCK_PARAMETERS_15= RULE_DO_BLOCK_PARAMETERS )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_DO_BLOCK_PARAMETERS) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalRails.g:387:8: this_DO_BLOCK_PARAMETERS_15= RULE_DO_BLOCK_PARAMETERS
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

            // InternalRails.g:394:3: ( ( RULE_SPACE )=>this_SPACE_16= RULE_SPACE )*
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
            	    // InternalRails.g:394:4: ( RULE_SPACE )=>this_SPACE_16= RULE_SPACE
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
    // InternalRails.g:409:1: entryRuleMethodCallParameters returns [String current=null] : iv_ruleMethodCallParameters= ruleMethodCallParameters EOF ;
    public final String entryRuleMethodCallParameters() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMethodCallParameters = null;


        try {
            // InternalRails.g:410:2: (iv_ruleMethodCallParameters= ruleMethodCallParameters EOF )
            // InternalRails.g:411:2: iv_ruleMethodCallParameters= ruleMethodCallParameters EOF
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
    // InternalRails.g:418:1: ruleMethodCallParameters returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_PARENTHESIS_BLOCK_0= RULE_PARENTHESIS_BLOCK | this_ExpressionsSeparatedByCommas_1= ruleExpressionsSeparatedByCommas ) ;
    public final AntlrDatatypeRuleToken ruleMethodCallParameters() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_PARENTHESIS_BLOCK_0=null;
        AntlrDatatypeRuleToken this_ExpressionsSeparatedByCommas_1 = null;


         enterRule(); 
            
        try {
            // InternalRails.g:421:28: ( (this_PARENTHESIS_BLOCK_0= RULE_PARENTHESIS_BLOCK | this_ExpressionsSeparatedByCommas_1= ruleExpressionsSeparatedByCommas ) )
            // InternalRails.g:422:1: (this_PARENTHESIS_BLOCK_0= RULE_PARENTHESIS_BLOCK | this_ExpressionsSeparatedByCommas_1= ruleExpressionsSeparatedByCommas )
            {
            // InternalRails.g:422:1: (this_PARENTHESIS_BLOCK_0= RULE_PARENTHESIS_BLOCK | this_ExpressionsSeparatedByCommas_1= ruleExpressionsSeparatedByCommas )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_PARENTHESIS_BLOCK) ) {
                alt19=1;
            }
            else if ( ((LA19_0>=RULE_SPACE && LA19_0<=RULE_INT_METHOD)||LA19_0==RULE_ARRAY_BLOCK||(LA19_0>=RULE_DECIMAL && LA19_0<=RULE_REGEXP)) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalRails.g:422:6: this_PARENTHESIS_BLOCK_0= RULE_PARENTHESIS_BLOCK
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
                    // InternalRails.g:431:5: this_ExpressionsSeparatedByCommas_1= ruleExpressionsSeparatedByCommas
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
    // InternalRails.g:449:1: entryRuleExpressionsSeparatedByCommas returns [String current=null] : iv_ruleExpressionsSeparatedByCommas= ruleExpressionsSeparatedByCommas EOF ;
    public final String entryRuleExpressionsSeparatedByCommas() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpressionsSeparatedByCommas = null;


        try {
            // InternalRails.g:450:2: (iv_ruleExpressionsSeparatedByCommas= ruleExpressionsSeparatedByCommas EOF )
            // InternalRails.g:451:2: iv_ruleExpressionsSeparatedByCommas= ruleExpressionsSeparatedByCommas EOF
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
    // InternalRails.g:458:1: ruleExpressionsSeparatedByCommas returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ExpressionWithOutBracket_0= ruleExpressionWithOutBracket ( (this_SPACE_1= RULE_SPACE )* this_COMMA_2= RULE_COMMA (this_SPACE_3= RULE_SPACE )* this_Expression_4= ruleExpression )* ) ;
    public final AntlrDatatypeRuleToken ruleExpressionsSeparatedByCommas() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SPACE_1=null;
        Token this_COMMA_2=null;
        Token this_SPACE_3=null;
        AntlrDatatypeRuleToken this_ExpressionWithOutBracket_0 = null;

        AntlrDatatypeRuleToken this_Expression_4 = null;


         enterRule(); 
            
        try {
            // InternalRails.g:461:28: ( (this_ExpressionWithOutBracket_0= ruleExpressionWithOutBracket ( (this_SPACE_1= RULE_SPACE )* this_COMMA_2= RULE_COMMA (this_SPACE_3= RULE_SPACE )* this_Expression_4= ruleExpression )* ) )
            // InternalRails.g:462:1: (this_ExpressionWithOutBracket_0= ruleExpressionWithOutBracket ( (this_SPACE_1= RULE_SPACE )* this_COMMA_2= RULE_COMMA (this_SPACE_3= RULE_SPACE )* this_Expression_4= ruleExpression )* )
            {
            // InternalRails.g:462:1: (this_ExpressionWithOutBracket_0= ruleExpressionWithOutBracket ( (this_SPACE_1= RULE_SPACE )* this_COMMA_2= RULE_COMMA (this_SPACE_3= RULE_SPACE )* this_Expression_4= ruleExpression )* )
            // InternalRails.g:463:5: this_ExpressionWithOutBracket_0= ruleExpressionWithOutBracket ( (this_SPACE_1= RULE_SPACE )* this_COMMA_2= RULE_COMMA (this_SPACE_3= RULE_SPACE )* this_Expression_4= ruleExpression )*
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
            // InternalRails.g:473:1: ( (this_SPACE_1= RULE_SPACE )* this_COMMA_2= RULE_COMMA (this_SPACE_3= RULE_SPACE )* this_Expression_4= ruleExpression )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_SPACE) ) {
                    alt22=1;
                }
                else if ( (LA22_0==RULE_COMMA) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalRails.g:473:2: (this_SPACE_1= RULE_SPACE )* this_COMMA_2= RULE_COMMA (this_SPACE_3= RULE_SPACE )* this_Expression_4= ruleExpression
            	    {
            	    // InternalRails.g:473:2: (this_SPACE_1= RULE_SPACE )*
            	    loop20:
            	    do {
            	        int alt20=2;
            	        int LA20_0 = input.LA(1);

            	        if ( (LA20_0==RULE_SPACE) ) {
            	            alt20=1;
            	        }


            	        switch (alt20) {
            	    	case 1 :
            	    	    // InternalRails.g:473:7: this_SPACE_1= RULE_SPACE
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
            	    	    break loop20;
            	        }
            	    } while (true);

            	    this_COMMA_2=(Token)match(input,RULE_COMMA,FOLLOW_16); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_COMMA_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_COMMA_2, grammarAccess.getExpressionsSeparatedByCommasAccess().getCOMMATerminalRuleCall_1_1()); 
            	          
            	    }
            	    // InternalRails.g:487:1: (this_SPACE_3= RULE_SPACE )*
            	    loop21:
            	    do {
            	        int alt21=2;
            	        int LA21_0 = input.LA(1);

            	        if ( (LA21_0==RULE_SPACE) ) {
            	            alt21=1;
            	        }


            	        switch (alt21) {
            	    	case 1 :
            	    	    // InternalRails.g:487:6: this_SPACE_3= RULE_SPACE
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
            	    	    break loop21;
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
            	    break loop22;
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
    // InternalRails.g:513:1: entryRuleExpressionWithOutBracket returns [String current=null] : iv_ruleExpressionWithOutBracket= ruleExpressionWithOutBracket EOF ;
    public final String entryRuleExpressionWithOutBracket() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpressionWithOutBracket = null;


        try {
            // InternalRails.g:514:2: (iv_ruleExpressionWithOutBracket= ruleExpressionWithOutBracket EOF )
            // InternalRails.g:515:2: iv_ruleExpressionWithOutBracket= ruleExpressionWithOutBracket EOF
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
    // InternalRails.g:522:1: ruleExpressionWithOutBracket returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SYMBOL_0= RULE_SYMBOL | this_STRING_1= RULE_STRING | this_ARRAY_BLOCK_2= RULE_ARRAY_BLOCK | this_PARENTHESIS_BLOCK_3= RULE_PARENTHESIS_BLOCK | this_DECIMAL_4= RULE_DECIMAL | this_INT_5= RULE_INT | this_REGEXP_6= RULE_REGEXP | this_MethodChainCall_7= ruleMethodChainCall | this_IgnoredHashKeyValue_8= ruleIgnoredHashKeyValue ) ;
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
            // InternalRails.g:525:28: ( (this_SYMBOL_0= RULE_SYMBOL | this_STRING_1= RULE_STRING | this_ARRAY_BLOCK_2= RULE_ARRAY_BLOCK | this_PARENTHESIS_BLOCK_3= RULE_PARENTHESIS_BLOCK | this_DECIMAL_4= RULE_DECIMAL | this_INT_5= RULE_INT | this_REGEXP_6= RULE_REGEXP | this_MethodChainCall_7= ruleMethodChainCall | this_IgnoredHashKeyValue_8= ruleIgnoredHashKeyValue ) )
            // InternalRails.g:526:1: (this_SYMBOL_0= RULE_SYMBOL | this_STRING_1= RULE_STRING | this_ARRAY_BLOCK_2= RULE_ARRAY_BLOCK | this_PARENTHESIS_BLOCK_3= RULE_PARENTHESIS_BLOCK | this_DECIMAL_4= RULE_DECIMAL | this_INT_5= RULE_INT | this_REGEXP_6= RULE_REGEXP | this_MethodChainCall_7= ruleMethodChainCall | this_IgnoredHashKeyValue_8= ruleIgnoredHashKeyValue )
            {
            // InternalRails.g:526:1: (this_SYMBOL_0= RULE_SYMBOL | this_STRING_1= RULE_STRING | this_ARRAY_BLOCK_2= RULE_ARRAY_BLOCK | this_PARENTHESIS_BLOCK_3= RULE_PARENTHESIS_BLOCK | this_DECIMAL_4= RULE_DECIMAL | this_INT_5= RULE_INT | this_REGEXP_6= RULE_REGEXP | this_MethodChainCall_7= ruleMethodChainCall | this_IgnoredHashKeyValue_8= ruleIgnoredHashKeyValue )
            int alt23=9;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // InternalRails.g:526:6: this_SYMBOL_0= RULE_SYMBOL
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
                    // InternalRails.g:534:10: this_STRING_1= RULE_STRING
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
                    // InternalRails.g:542:10: this_ARRAY_BLOCK_2= RULE_ARRAY_BLOCK
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
                    // InternalRails.g:550:10: this_PARENTHESIS_BLOCK_3= RULE_PARENTHESIS_BLOCK
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
                    // InternalRails.g:558:10: this_DECIMAL_4= RULE_DECIMAL
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
                    // InternalRails.g:566:10: this_INT_5= RULE_INT
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
                    // InternalRails.g:574:10: this_REGEXP_6= RULE_REGEXP
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
                    // InternalRails.g:583:5: this_MethodChainCall_7= ruleMethodChainCall
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
                    // InternalRails.g:595:5: this_IgnoredHashKeyValue_8= ruleIgnoredHashKeyValue
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
    // InternalRails.g:613:1: entryRuleExpression returns [String current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final String entryRuleExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpression = null;


        try {
            // InternalRails.g:614:2: (iv_ruleExpression= ruleExpression EOF )
            // InternalRails.g:615:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalRails.g:622:1: ruleExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ExpressionWithOutBracket_0= ruleExpressionWithOutBracket | this_BRACKET_BLOCK_1= RULE_BRACKET_BLOCK ) ;
    public final AntlrDatatypeRuleToken ruleExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_BRACKET_BLOCK_1=null;
        AntlrDatatypeRuleToken this_ExpressionWithOutBracket_0 = null;


         enterRule(); 
            
        try {
            // InternalRails.g:625:28: ( (this_ExpressionWithOutBracket_0= ruleExpressionWithOutBracket | this_BRACKET_BLOCK_1= RULE_BRACKET_BLOCK ) )
            // InternalRails.g:626:1: (this_ExpressionWithOutBracket_0= ruleExpressionWithOutBracket | this_BRACKET_BLOCK_1= RULE_BRACKET_BLOCK )
            {
            // InternalRails.g:626:1: (this_ExpressionWithOutBracket_0= ruleExpressionWithOutBracket | this_BRACKET_BLOCK_1= RULE_BRACKET_BLOCK )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=RULE_SPACE && LA24_0<=RULE_ARRAY_BLOCK)||(LA24_0>=RULE_DECIMAL && LA24_0<=RULE_REGEXP)) ) {
                alt24=1;
            }
            else if ( (LA24_0==RULE_BRACKET_BLOCK) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalRails.g:627:5: this_ExpressionWithOutBracket_0= ruleExpressionWithOutBracket
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
                    // InternalRails.g:638:10: this_BRACKET_BLOCK_1= RULE_BRACKET_BLOCK
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
    // InternalRails.g:653:1: entryRuleOperationsChain returns [String current=null] : iv_ruleOperationsChain= ruleOperationsChain EOF ;
    public final String entryRuleOperationsChain() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOperationsChain = null;


        try {
            // InternalRails.g:654:2: (iv_ruleOperationsChain= ruleOperationsChain EOF )
            // InternalRails.g:655:2: iv_ruleOperationsChain= ruleOperationsChain EOF
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
    // InternalRails.g:662:1: ruleOperationsChain returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_MethodChainCall_0= ruleMethodChainCall (this_OperatorRule_1= ruleOperatorRule (this_BRACKET_BLOCK_2= RULE_BRACKET_BLOCK | this_DECIMAL_3= RULE_DECIMAL | this_MethodChainCall_4= ruleMethodChainCall | this_REGEXP_5= RULE_REGEXP ) )* ) ;
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
            // InternalRails.g:665:28: ( (this_MethodChainCall_0= ruleMethodChainCall (this_OperatorRule_1= ruleOperatorRule (this_BRACKET_BLOCK_2= RULE_BRACKET_BLOCK | this_DECIMAL_3= RULE_DECIMAL | this_MethodChainCall_4= ruleMethodChainCall | this_REGEXP_5= RULE_REGEXP ) )* ) )
            // InternalRails.g:666:1: (this_MethodChainCall_0= ruleMethodChainCall (this_OperatorRule_1= ruleOperatorRule (this_BRACKET_BLOCK_2= RULE_BRACKET_BLOCK | this_DECIMAL_3= RULE_DECIMAL | this_MethodChainCall_4= ruleMethodChainCall | this_REGEXP_5= RULE_REGEXP ) )* )
            {
            // InternalRails.g:666:1: (this_MethodChainCall_0= ruleMethodChainCall (this_OperatorRule_1= ruleOperatorRule (this_BRACKET_BLOCK_2= RULE_BRACKET_BLOCK | this_DECIMAL_3= RULE_DECIMAL | this_MethodChainCall_4= ruleMethodChainCall | this_REGEXP_5= RULE_REGEXP ) )* )
            // InternalRails.g:667:5: this_MethodChainCall_0= ruleMethodChainCall (this_OperatorRule_1= ruleOperatorRule (this_BRACKET_BLOCK_2= RULE_BRACKET_BLOCK | this_DECIMAL_3= RULE_DECIMAL | this_MethodChainCall_4= ruleMethodChainCall | this_REGEXP_5= RULE_REGEXP ) )*
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
            // InternalRails.g:677:1: (this_OperatorRule_1= ruleOperatorRule (this_BRACKET_BLOCK_2= RULE_BRACKET_BLOCK | this_DECIMAL_3= RULE_DECIMAL | this_MethodChainCall_4= ruleMethodChainCall | this_REGEXP_5= RULE_REGEXP ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==28||(LA26_0>=31 && LA26_0<=51)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalRails.g:678:5: this_OperatorRule_1= ruleOperatorRule (this_BRACKET_BLOCK_2= RULE_BRACKET_BLOCK | this_DECIMAL_3= RULE_DECIMAL | this_MethodChainCall_4= ruleMethodChainCall | this_REGEXP_5= RULE_REGEXP )
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
            	    // InternalRails.g:688:1: (this_BRACKET_BLOCK_2= RULE_BRACKET_BLOCK | this_DECIMAL_3= RULE_DECIMAL | this_MethodChainCall_4= ruleMethodChainCall | this_REGEXP_5= RULE_REGEXP )
            	    int alt25=4;
            	    switch ( input.LA(1) ) {
            	    case RULE_BRACKET_BLOCK:
            	        {
            	        alt25=1;
            	        }
            	        break;
            	    case RULE_DECIMAL:
            	        {
            	        alt25=2;
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
            	        alt25=3;
            	        }
            	        break;
            	    case RULE_REGEXP:
            	        {
            	        alt25=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 25, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt25) {
            	        case 1 :
            	            // InternalRails.g:688:6: this_BRACKET_BLOCK_2= RULE_BRACKET_BLOCK
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
            	            // InternalRails.g:696:10: this_DECIMAL_3= RULE_DECIMAL
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
            	            // InternalRails.g:705:5: this_MethodChainCall_4= ruleMethodChainCall
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
            	            // InternalRails.g:716:10: this_REGEXP_5= RULE_REGEXP
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
            	    break loop26;
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
    // InternalRails.g:731:1: entryRuleOperatorRule returns [String current=null] : iv_ruleOperatorRule= ruleOperatorRule EOF ;
    public final String entryRuleOperatorRule() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOperatorRule = null;


        try {
            // InternalRails.g:732:2: (iv_ruleOperatorRule= ruleOperatorRule EOF )
            // InternalRails.g:733:2: iv_ruleOperatorRule= ruleOperatorRule EOF
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
    // InternalRails.g:740:1: ruleOperatorRule returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= ': ' | kw= '?' | kw= '<' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= '**' | kw= '=' | kw= '~' | kw= '|' | kw= '||' | kw= '&' | kw= '&&' | kw= '==' | kw= '!' | kw= '<<' | kw= '<=>' | kw= '>' | kw= '..' | kw= '...' ) (kw= '=' )? ) ;
    public final AntlrDatatypeRuleToken ruleOperatorRule() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalRails.g:743:28: ( ( (kw= ': ' | kw= '?' | kw= '<' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= '**' | kw= '=' | kw= '~' | kw= '|' | kw= '||' | kw= '&' | kw= '&&' | kw= '==' | kw= '!' | kw= '<<' | kw= '<=>' | kw= '>' | kw= '..' | kw= '...' ) (kw= '=' )? ) )
            // InternalRails.g:744:1: ( (kw= ': ' | kw= '?' | kw= '<' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= '**' | kw= '=' | kw= '~' | kw= '|' | kw= '||' | kw= '&' | kw= '&&' | kw= '==' | kw= '!' | kw= '<<' | kw= '<=>' | kw= '>' | kw= '..' | kw= '...' ) (kw= '=' )? )
            {
            // InternalRails.g:744:1: ( (kw= ': ' | kw= '?' | kw= '<' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= '**' | kw= '=' | kw= '~' | kw= '|' | kw= '||' | kw= '&' | kw= '&&' | kw= '==' | kw= '!' | kw= '<<' | kw= '<=>' | kw= '>' | kw= '..' | kw= '...' ) (kw= '=' )? )
            // InternalRails.g:744:2: (kw= ': ' | kw= '?' | kw= '<' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= '**' | kw= '=' | kw= '~' | kw= '|' | kw= '||' | kw= '&' | kw= '&&' | kw= '==' | kw= '!' | kw= '<<' | kw= '<=>' | kw= '>' | kw= '..' | kw= '...' ) (kw= '=' )?
            {
            // InternalRails.g:744:2: (kw= ': ' | kw= '?' | kw= '<' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= '**' | kw= '=' | kw= '~' | kw= '|' | kw= '||' | kw= '&' | kw= '&&' | kw= '==' | kw= '!' | kw= '<<' | kw= '<=>' | kw= '>' | kw= '..' | kw= '...' )
            int alt27=22;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt27=1;
                }
                break;
            case 32:
                {
                alt27=2;
                }
                break;
            case 28:
                {
                alt27=3;
                }
                break;
            case 33:
                {
                alt27=4;
                }
                break;
            case 34:
                {
                alt27=5;
                }
                break;
            case 35:
                {
                alt27=6;
                }
                break;
            case 36:
                {
                alt27=7;
                }
                break;
            case 37:
                {
                alt27=8;
                }
                break;
            case 38:
                {
                alt27=9;
                }
                break;
            case 39:
                {
                alt27=10;
                }
                break;
            case 40:
                {
                alt27=11;
                }
                break;
            case 41:
                {
                alt27=12;
                }
                break;
            case 42:
                {
                alt27=13;
                }
                break;
            case 43:
                {
                alt27=14;
                }
                break;
            case 44:
                {
                alt27=15;
                }
                break;
            case 45:
                {
                alt27=16;
                }
                break;
            case 46:
                {
                alt27=17;
                }
                break;
            case 47:
                {
                alt27=18;
                }
                break;
            case 48:
                {
                alt27=19;
                }
                break;
            case 49:
                {
                alt27=20;
                }
                break;
            case 50:
                {
                alt27=21;
                }
                break;
            case 51:
                {
                alt27=22;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalRails.g:745:2: kw= ': '
                    {
                    kw=(Token)match(input,31,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorRuleAccess().getColonSpaceKeyword_0_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalRails.g:752:2: kw= '?'
                    {
                    kw=(Token)match(input,32,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorRuleAccess().getQuestionMarkKeyword_0_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalRails.g:759:2: kw= '<'
                    {
                    kw=(Token)match(input,28,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorRuleAccess().getLessThanSignKeyword_0_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // InternalRails.g:766:2: kw= '+'
                    {
                    kw=(Token)match(input,33,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorRuleAccess().getPlusSignKeyword_0_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // InternalRails.g:773:2: kw= '-'
                    {
                    kw=(Token)match(input,34,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorRuleAccess().getHyphenMinusKeyword_0_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // InternalRails.g:780:2: kw= '*'
                    {
                    kw=(Token)match(input,35,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorRuleAccess().getAsteriskKeyword_0_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // InternalRails.g:787:2: kw= '/'
                    {
                    kw=(Token)match(input,36,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorRuleAccess().getSolidusKeyword_0_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // InternalRails.g:794:2: kw= '%'
                    {
                    kw=(Token)match(input,37,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorRuleAccess().getPercentSignKeyword_0_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // InternalRails.g:801:2: kw= '**'
                    {
                    kw=(Token)match(input,38,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorRuleAccess().getAsteriskAsteriskKeyword_0_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // InternalRails.g:808:2: kw= '='
                    {
                    kw=(Token)match(input,39,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorRuleAccess().getEqualsSignKeyword_0_9()); 
                          
                    }

                    }
                    break;
                case 11 :
                    // InternalRails.g:815:2: kw= '~'
                    {
                    kw=(Token)match(input,40,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorRuleAccess().getTildeKeyword_0_10()); 
                          
                    }

                    }
                    break;
                case 12 :
                    // InternalRails.g:822:2: kw= '|'
                    {
                    kw=(Token)match(input,41,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorRuleAccess().getVerticalLineKeyword_0_11()); 
                          
                    }

                    }
                    break;
                case 13 :
                    // InternalRails.g:829:2: kw= '||'
                    {
                    kw=(Token)match(input,42,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorRuleAccess().getVerticalLineVerticalLineKeyword_0_12()); 
                          
                    }

                    }
                    break;
                case 14 :
                    // InternalRails.g:836:2: kw= '&'
                    {
                    kw=(Token)match(input,43,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorRuleAccess().getAmpersandKeyword_0_13()); 
                          
                    }

                    }
                    break;
                case 15 :
                    // InternalRails.g:843:2: kw= '&&'
                    {
                    kw=(Token)match(input,44,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorRuleAccess().getAmpersandAmpersandKeyword_0_14()); 
                          
                    }

                    }
                    break;
                case 16 :
                    // InternalRails.g:850:2: kw= '=='
                    {
                    kw=(Token)match(input,45,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorRuleAccess().getEqualsSignEqualsSignKeyword_0_15()); 
                          
                    }

                    }
                    break;
                case 17 :
                    // InternalRails.g:857:2: kw= '!'
                    {
                    kw=(Token)match(input,46,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorRuleAccess().getExclamationMarkKeyword_0_16()); 
                          
                    }

                    }
                    break;
                case 18 :
                    // InternalRails.g:864:2: kw= '<<'
                    {
                    kw=(Token)match(input,47,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorRuleAccess().getLessThanSignLessThanSignKeyword_0_17()); 
                          
                    }

                    }
                    break;
                case 19 :
                    // InternalRails.g:871:2: kw= '<=>'
                    {
                    kw=(Token)match(input,48,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorRuleAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_0_18()); 
                          
                    }

                    }
                    break;
                case 20 :
                    // InternalRails.g:878:2: kw= '>'
                    {
                    kw=(Token)match(input,49,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorRuleAccess().getGreaterThanSignKeyword_0_19()); 
                          
                    }

                    }
                    break;
                case 21 :
                    // InternalRails.g:885:2: kw= '..'
                    {
                    kw=(Token)match(input,50,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorRuleAccess().getFullStopFullStopKeyword_0_20()); 
                          
                    }

                    }
                    break;
                case 22 :
                    // InternalRails.g:892:2: kw= '...'
                    {
                    kw=(Token)match(input,51,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorRuleAccess().getFullStopFullStopFullStopKeyword_0_21()); 
                          
                    }

                    }
                    break;

            }

            // InternalRails.g:897:2: (kw= '=' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==39) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalRails.g:898:2: kw= '='
                    {
                    kw=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
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
    // InternalRails.g:911:1: entryRuleRelationship returns [EObject current=null] : iv_ruleRelationship= ruleRelationship EOF ;
    public final EObject entryRuleRelationship() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationship = null;


        try {
            // InternalRails.g:912:2: (iv_ruleRelationship= ruleRelationship EOF )
            // InternalRails.g:913:2: iv_ruleRelationship= ruleRelationship EOF
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
    // InternalRails.g:920:1: ruleRelationship returns [EObject current=null] : (this_HasMany_0= ruleHasMany | this_HasOne_1= ruleHasOne | this_HasAndBelongsToMany_2= ruleHasAndBelongsToMany | this_BelongsTo_3= ruleBelongsTo ) ;
    public final EObject ruleRelationship() throws RecognitionException {
        EObject current = null;

        EObject this_HasMany_0 = null;

        EObject this_HasOne_1 = null;

        EObject this_HasAndBelongsToMany_2 = null;

        EObject this_BelongsTo_3 = null;


         enterRule(); 
            
        try {
            // InternalRails.g:923:28: ( (this_HasMany_0= ruleHasMany | this_HasOne_1= ruleHasOne | this_HasAndBelongsToMany_2= ruleHasAndBelongsToMany | this_BelongsTo_3= ruleBelongsTo ) )
            // InternalRails.g:924:1: (this_HasMany_0= ruleHasMany | this_HasOne_1= ruleHasOne | this_HasAndBelongsToMany_2= ruleHasAndBelongsToMany | this_BelongsTo_3= ruleBelongsTo )
            {
            // InternalRails.g:924:1: (this_HasMany_0= ruleHasMany | this_HasOne_1= ruleHasOne | this_HasAndBelongsToMany_2= ruleHasAndBelongsToMany | this_BelongsTo_3= ruleBelongsTo )
            int alt29=4;
            switch ( input.LA(1) ) {
            case RULE_HAS_MANY_WORD:
                {
                alt29=1;
                }
                break;
            case RULE_HAS_ONE_WORD:
                {
                alt29=2;
                }
                break;
            case RULE_HAS_AND_BELONGS_TO_MANY_WORD:
                {
                alt29=3;
                }
                break;
            case RULE_BELONGS_TO_WORD:
                {
                alt29=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalRails.g:925:5: this_HasMany_0= ruleHasMany
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
                    // InternalRails.g:935:5: this_HasOne_1= ruleHasOne
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
                    // InternalRails.g:945:5: this_HasAndBelongsToMany_2= ruleHasAndBelongsToMany
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
                    // InternalRails.g:955:5: this_BelongsTo_3= ruleBelongsTo
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
    // InternalRails.g:971:1: entryRuleHasMany returns [EObject current=null] : iv_ruleHasMany= ruleHasMany EOF ;
    public final EObject entryRuleHasMany() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHasMany = null;


        try {
            // InternalRails.g:972:2: (iv_ruleHasMany= ruleHasMany EOF )
            // InternalRails.g:973:2: iv_ruleHasMany= ruleHasMany EOF
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
    // InternalRails.g:980:1: ruleHasMany returns [EObject current=null] : (this_HAS_MANY_WORD_0= RULE_HAS_MANY_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )* (this_SL_COMMENT_5= RULE_SL_COMMENT )? ) ;
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
            // InternalRails.g:983:28: ( (this_HAS_MANY_WORD_0= RULE_HAS_MANY_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )* (this_SL_COMMENT_5= RULE_SL_COMMENT )? ) )
            // InternalRails.g:984:1: (this_HAS_MANY_WORD_0= RULE_HAS_MANY_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )* (this_SL_COMMENT_5= RULE_SL_COMMENT )? )
            {
            // InternalRails.g:984:1: (this_HAS_MANY_WORD_0= RULE_HAS_MANY_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )* (this_SL_COMMENT_5= RULE_SL_COMMENT )? )
            // InternalRails.g:984:2: this_HAS_MANY_WORD_0= RULE_HAS_MANY_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )* (this_SL_COMMENT_5= RULE_SL_COMMENT )?
            {
            this_HAS_MANY_WORD_0=(Token)match(input,RULE_HAS_MANY_WORD,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_HAS_MANY_WORD_0, grammarAccess.getHasManyAccess().getHAS_MANY_WORDTerminalRuleCall_0()); 
                  
            }
            // InternalRails.g:988:1: (this_SPACE_1= RULE_SPACE )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_SPACE) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalRails.g:988:2: this_SPACE_1= RULE_SPACE
            	    {
            	    this_SPACE_1=(Token)match(input,RULE_SPACE,FOLLOW_19); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SPACE_1, grammarAccess.getHasManyAccess().getSPACETerminalRuleCall_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            // InternalRails.g:992:3: ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) )
            // InternalRails.g:993:1: ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) )
            {
            // InternalRails.g:993:1: ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) )
            // InternalRails.g:994:1: (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING )
            {
            // InternalRails.g:994:1: (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_SYMBOL) ) {
                alt31=1;
            }
            else if ( (LA31_0==RULE_STRING) ) {
                alt31=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalRails.g:995:3: lv_name_2_1= RULE_SYMBOL
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
                    // InternalRails.g:1010:8: lv_name_2_2= RULE_STRING
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

            // InternalRails.g:1028:2: (this_SPACE_3= RULE_SPACE )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_SPACE) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalRails.g:1028:3: this_SPACE_3= RULE_SPACE
            	    {
            	    this_SPACE_3=(Token)match(input,RULE_SPACE,FOLLOW_20); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SPACE_3, grammarAccess.getHasManyAccess().getSPACETerminalRuleCall_3()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            // InternalRails.g:1032:3: ( (lv_options_4_0= ruleHashKeyValue ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_COMMA) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalRails.g:1033:1: (lv_options_4_0= ruleHashKeyValue )
            	    {
            	    // InternalRails.g:1033:1: (lv_options_4_0= ruleHashKeyValue )
            	    // InternalRails.g:1034:3: lv_options_4_0= ruleHashKeyValue
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
            	    break loop33;
                }
            } while (true);

            // InternalRails.g:1050:3: (this_SL_COMMENT_5= RULE_SL_COMMENT )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_SL_COMMENT) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalRails.g:1050:4: this_SL_COMMENT_5= RULE_SL_COMMENT
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
    // InternalRails.g:1062:1: entryRuleHasOne returns [EObject current=null] : iv_ruleHasOne= ruleHasOne EOF ;
    public final EObject entryRuleHasOne() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHasOne = null;


        try {
            // InternalRails.g:1063:2: (iv_ruleHasOne= ruleHasOne EOF )
            // InternalRails.g:1064:2: iv_ruleHasOne= ruleHasOne EOF
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
    // InternalRails.g:1071:1: ruleHasOne returns [EObject current=null] : (this_HAS_ONE_WORD_0= RULE_HAS_ONE_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )* (this_SL_COMMENT_5= RULE_SL_COMMENT )? ) ;
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
            // InternalRails.g:1074:28: ( (this_HAS_ONE_WORD_0= RULE_HAS_ONE_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )* (this_SL_COMMENT_5= RULE_SL_COMMENT )? ) )
            // InternalRails.g:1075:1: (this_HAS_ONE_WORD_0= RULE_HAS_ONE_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )* (this_SL_COMMENT_5= RULE_SL_COMMENT )? )
            {
            // InternalRails.g:1075:1: (this_HAS_ONE_WORD_0= RULE_HAS_ONE_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )* (this_SL_COMMENT_5= RULE_SL_COMMENT )? )
            // InternalRails.g:1075:2: this_HAS_ONE_WORD_0= RULE_HAS_ONE_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )* (this_SL_COMMENT_5= RULE_SL_COMMENT )?
            {
            this_HAS_ONE_WORD_0=(Token)match(input,RULE_HAS_ONE_WORD,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_HAS_ONE_WORD_0, grammarAccess.getHasOneAccess().getHAS_ONE_WORDTerminalRuleCall_0()); 
                  
            }
            // InternalRails.g:1079:1: (this_SPACE_1= RULE_SPACE )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_SPACE) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalRails.g:1079:2: this_SPACE_1= RULE_SPACE
            	    {
            	    this_SPACE_1=(Token)match(input,RULE_SPACE,FOLLOW_19); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SPACE_1, grammarAccess.getHasOneAccess().getSPACETerminalRuleCall_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            // InternalRails.g:1083:3: ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) )
            // InternalRails.g:1084:1: ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) )
            {
            // InternalRails.g:1084:1: ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) )
            // InternalRails.g:1085:1: (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING )
            {
            // InternalRails.g:1085:1: (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_SYMBOL) ) {
                alt36=1;
            }
            else if ( (LA36_0==RULE_STRING) ) {
                alt36=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalRails.g:1086:3: lv_name_2_1= RULE_SYMBOL
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
                    // InternalRails.g:1101:8: lv_name_2_2= RULE_STRING
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

            // InternalRails.g:1119:2: (this_SPACE_3= RULE_SPACE )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_SPACE) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalRails.g:1119:3: this_SPACE_3= RULE_SPACE
            	    {
            	    this_SPACE_3=(Token)match(input,RULE_SPACE,FOLLOW_20); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SPACE_3, grammarAccess.getHasOneAccess().getSPACETerminalRuleCall_3()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            // InternalRails.g:1123:3: ( (lv_options_4_0= ruleHashKeyValue ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_COMMA) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalRails.g:1124:1: (lv_options_4_0= ruleHashKeyValue )
            	    {
            	    // InternalRails.g:1124:1: (lv_options_4_0= ruleHashKeyValue )
            	    // InternalRails.g:1125:3: lv_options_4_0= ruleHashKeyValue
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
            	    break loop38;
                }
            } while (true);

            // InternalRails.g:1141:3: (this_SL_COMMENT_5= RULE_SL_COMMENT )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_SL_COMMENT) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalRails.g:1141:4: this_SL_COMMENT_5= RULE_SL_COMMENT
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
    // InternalRails.g:1153:1: entryRuleHasAndBelongsToMany returns [EObject current=null] : iv_ruleHasAndBelongsToMany= ruleHasAndBelongsToMany EOF ;
    public final EObject entryRuleHasAndBelongsToMany() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHasAndBelongsToMany = null;


        try {
            // InternalRails.g:1154:2: (iv_ruleHasAndBelongsToMany= ruleHasAndBelongsToMany EOF )
            // InternalRails.g:1155:2: iv_ruleHasAndBelongsToMany= ruleHasAndBelongsToMany EOF
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
    // InternalRails.g:1162:1: ruleHasAndBelongsToMany returns [EObject current=null] : (this_HAS_AND_BELONGS_TO_MANY_WORD_0= RULE_HAS_AND_BELONGS_TO_MANY_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )* ) ;
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
            // InternalRails.g:1165:28: ( (this_HAS_AND_BELONGS_TO_MANY_WORD_0= RULE_HAS_AND_BELONGS_TO_MANY_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )* ) )
            // InternalRails.g:1166:1: (this_HAS_AND_BELONGS_TO_MANY_WORD_0= RULE_HAS_AND_BELONGS_TO_MANY_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )* )
            {
            // InternalRails.g:1166:1: (this_HAS_AND_BELONGS_TO_MANY_WORD_0= RULE_HAS_AND_BELONGS_TO_MANY_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )* )
            // InternalRails.g:1166:2: this_HAS_AND_BELONGS_TO_MANY_WORD_0= RULE_HAS_AND_BELONGS_TO_MANY_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )*
            {
            this_HAS_AND_BELONGS_TO_MANY_WORD_0=(Token)match(input,RULE_HAS_AND_BELONGS_TO_MANY_WORD,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_HAS_AND_BELONGS_TO_MANY_WORD_0, grammarAccess.getHasAndBelongsToManyAccess().getHAS_AND_BELONGS_TO_MANY_WORDTerminalRuleCall_0()); 
                  
            }
            // InternalRails.g:1170:1: (this_SPACE_1= RULE_SPACE )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==RULE_SPACE) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalRails.g:1170:2: this_SPACE_1= RULE_SPACE
            	    {
            	    this_SPACE_1=(Token)match(input,RULE_SPACE,FOLLOW_19); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SPACE_1, grammarAccess.getHasAndBelongsToManyAccess().getSPACETerminalRuleCall_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            // InternalRails.g:1174:3: ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) )
            // InternalRails.g:1175:1: ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) )
            {
            // InternalRails.g:1175:1: ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) )
            // InternalRails.g:1176:1: (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING )
            {
            // InternalRails.g:1176:1: (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_SYMBOL) ) {
                alt41=1;
            }
            else if ( (LA41_0==RULE_STRING) ) {
                alt41=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalRails.g:1177:3: lv_name_2_1= RULE_SYMBOL
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
                    // InternalRails.g:1192:8: lv_name_2_2= RULE_STRING
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

            // InternalRails.g:1210:2: (this_SPACE_3= RULE_SPACE )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_SPACE) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalRails.g:1210:3: this_SPACE_3= RULE_SPACE
            	    {
            	    this_SPACE_3=(Token)match(input,RULE_SPACE,FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SPACE_3, grammarAccess.getHasAndBelongsToManyAccess().getSPACETerminalRuleCall_3()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            // InternalRails.g:1214:3: ( (lv_options_4_0= ruleHashKeyValue ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_COMMA) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalRails.g:1215:1: (lv_options_4_0= ruleHashKeyValue )
            	    {
            	    // InternalRails.g:1215:1: (lv_options_4_0= ruleHashKeyValue )
            	    // InternalRails.g:1216:3: lv_options_4_0= ruleHashKeyValue
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
            	    break loop43;
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
    // InternalRails.g:1240:1: entryRuleBelongsTo returns [EObject current=null] : iv_ruleBelongsTo= ruleBelongsTo EOF ;
    public final EObject entryRuleBelongsTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBelongsTo = null;


        try {
            // InternalRails.g:1241:2: (iv_ruleBelongsTo= ruleBelongsTo EOF )
            // InternalRails.g:1242:2: iv_ruleBelongsTo= ruleBelongsTo EOF
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
    // InternalRails.g:1249:1: ruleBelongsTo returns [EObject current=null] : (this_BELONGS_TO_WORD_0= RULE_BELONGS_TO_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )* ) ;
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
            // InternalRails.g:1252:28: ( (this_BELONGS_TO_WORD_0= RULE_BELONGS_TO_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )* ) )
            // InternalRails.g:1253:1: (this_BELONGS_TO_WORD_0= RULE_BELONGS_TO_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )* )
            {
            // InternalRails.g:1253:1: (this_BELONGS_TO_WORD_0= RULE_BELONGS_TO_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )* )
            // InternalRails.g:1253:2: this_BELONGS_TO_WORD_0= RULE_BELONGS_TO_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )*
            {
            this_BELONGS_TO_WORD_0=(Token)match(input,RULE_BELONGS_TO_WORD,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_BELONGS_TO_WORD_0, grammarAccess.getBelongsToAccess().getBELONGS_TO_WORDTerminalRuleCall_0()); 
                  
            }
            // InternalRails.g:1257:1: (this_SPACE_1= RULE_SPACE )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==RULE_SPACE) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalRails.g:1257:2: this_SPACE_1= RULE_SPACE
            	    {
            	    this_SPACE_1=(Token)match(input,RULE_SPACE,FOLLOW_19); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SPACE_1, grammarAccess.getBelongsToAccess().getSPACETerminalRuleCall_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            // InternalRails.g:1261:3: ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) )
            // InternalRails.g:1262:1: ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) )
            {
            // InternalRails.g:1262:1: ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) )
            // InternalRails.g:1263:1: (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING )
            {
            // InternalRails.g:1263:1: (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_SYMBOL) ) {
                alt45=1;
            }
            else if ( (LA45_0==RULE_STRING) ) {
                alt45=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // InternalRails.g:1264:3: lv_name_2_1= RULE_SYMBOL
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
                    // InternalRails.g:1279:8: lv_name_2_2= RULE_STRING
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

            // InternalRails.g:1297:2: (this_SPACE_3= RULE_SPACE )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==RULE_SPACE) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalRails.g:1297:3: this_SPACE_3= RULE_SPACE
            	    {
            	    this_SPACE_3=(Token)match(input,RULE_SPACE,FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SPACE_3, grammarAccess.getBelongsToAccess().getSPACETerminalRuleCall_3()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            // InternalRails.g:1301:3: ( (lv_options_4_0= ruleHashKeyValue ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==RULE_COMMA) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalRails.g:1302:1: (lv_options_4_0= ruleHashKeyValue )
            	    {
            	    // InternalRails.g:1302:1: (lv_options_4_0= ruleHashKeyValue )
            	    // InternalRails.g:1303:3: lv_options_4_0= ruleHashKeyValue
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
            	    break loop47;
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
    // InternalRails.g:1327:1: entryRuleHashKeyValue returns [EObject current=null] : iv_ruleHashKeyValue= ruleHashKeyValue EOF ;
    public final EObject entryRuleHashKeyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHashKeyValue = null;


        try {
            // InternalRails.g:1328:2: (iv_ruleHashKeyValue= ruleHashKeyValue EOF )
            // InternalRails.g:1329:2: iv_ruleHashKeyValue= ruleHashKeyValue EOF
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
    // InternalRails.g:1336:1: ruleHashKeyValue returns [EObject current=null] : (this_COMMA_0= RULE_COMMA (this_SPACE_1= RULE_SPACE )* ( ( ( (lv_key_2_0= RULE_ID ) ) otherlv_3= ':' ) | ( ( ( (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING ) ) ) (this_SPACE_5= RULE_SPACE )* otherlv_6= '=>' ) ) (this_SPACE_7= RULE_SPACE )* ( ( (lv_value_8_1= RULE_SYMBOL | lv_value_8_2= RULE_STRING | lv_value_8_3= RULE_BRACKET_BLOCK | lv_value_8_4= RULE_ARRAY_BLOCK | lv_value_8_5= RULE_DECIMAL | lv_value_8_6= RULE_INT | lv_value_8_7= RULE_INT_METHOD | lv_value_8_8= ruleMethodChainCall ) ) ) (this_SPACE_9= RULE_SPACE )* ) ;
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
            // InternalRails.g:1339:28: ( (this_COMMA_0= RULE_COMMA (this_SPACE_1= RULE_SPACE )* ( ( ( (lv_key_2_0= RULE_ID ) ) otherlv_3= ':' ) | ( ( ( (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING ) ) ) (this_SPACE_5= RULE_SPACE )* otherlv_6= '=>' ) ) (this_SPACE_7= RULE_SPACE )* ( ( (lv_value_8_1= RULE_SYMBOL | lv_value_8_2= RULE_STRING | lv_value_8_3= RULE_BRACKET_BLOCK | lv_value_8_4= RULE_ARRAY_BLOCK | lv_value_8_5= RULE_DECIMAL | lv_value_8_6= RULE_INT | lv_value_8_7= RULE_INT_METHOD | lv_value_8_8= ruleMethodChainCall ) ) ) (this_SPACE_9= RULE_SPACE )* ) )
            // InternalRails.g:1340:1: (this_COMMA_0= RULE_COMMA (this_SPACE_1= RULE_SPACE )* ( ( ( (lv_key_2_0= RULE_ID ) ) otherlv_3= ':' ) | ( ( ( (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING ) ) ) (this_SPACE_5= RULE_SPACE )* otherlv_6= '=>' ) ) (this_SPACE_7= RULE_SPACE )* ( ( (lv_value_8_1= RULE_SYMBOL | lv_value_8_2= RULE_STRING | lv_value_8_3= RULE_BRACKET_BLOCK | lv_value_8_4= RULE_ARRAY_BLOCK | lv_value_8_5= RULE_DECIMAL | lv_value_8_6= RULE_INT | lv_value_8_7= RULE_INT_METHOD | lv_value_8_8= ruleMethodChainCall ) ) ) (this_SPACE_9= RULE_SPACE )* )
            {
            // InternalRails.g:1340:1: (this_COMMA_0= RULE_COMMA (this_SPACE_1= RULE_SPACE )* ( ( ( (lv_key_2_0= RULE_ID ) ) otherlv_3= ':' ) | ( ( ( (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING ) ) ) (this_SPACE_5= RULE_SPACE )* otherlv_6= '=>' ) ) (this_SPACE_7= RULE_SPACE )* ( ( (lv_value_8_1= RULE_SYMBOL | lv_value_8_2= RULE_STRING | lv_value_8_3= RULE_BRACKET_BLOCK | lv_value_8_4= RULE_ARRAY_BLOCK | lv_value_8_5= RULE_DECIMAL | lv_value_8_6= RULE_INT | lv_value_8_7= RULE_INT_METHOD | lv_value_8_8= ruleMethodChainCall ) ) ) (this_SPACE_9= RULE_SPACE )* )
            // InternalRails.g:1340:2: this_COMMA_0= RULE_COMMA (this_SPACE_1= RULE_SPACE )* ( ( ( (lv_key_2_0= RULE_ID ) ) otherlv_3= ':' ) | ( ( ( (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING ) ) ) (this_SPACE_5= RULE_SPACE )* otherlv_6= '=>' ) ) (this_SPACE_7= RULE_SPACE )* ( ( (lv_value_8_1= RULE_SYMBOL | lv_value_8_2= RULE_STRING | lv_value_8_3= RULE_BRACKET_BLOCK | lv_value_8_4= RULE_ARRAY_BLOCK | lv_value_8_5= RULE_DECIMAL | lv_value_8_6= RULE_INT | lv_value_8_7= RULE_INT_METHOD | lv_value_8_8= ruleMethodChainCall ) ) ) (this_SPACE_9= RULE_SPACE )*
            {
            this_COMMA_0=(Token)match(input,RULE_COMMA,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_COMMA_0, grammarAccess.getHashKeyValueAccess().getCOMMATerminalRuleCall_0()); 
                  
            }
            // InternalRails.g:1344:1: (this_SPACE_1= RULE_SPACE )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==RULE_SPACE) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalRails.g:1344:2: this_SPACE_1= RULE_SPACE
            	    {
            	    this_SPACE_1=(Token)match(input,RULE_SPACE,FOLLOW_23); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SPACE_1, grammarAccess.getHashKeyValueAccess().getSPACETerminalRuleCall_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

            // InternalRails.g:1348:3: ( ( ( (lv_key_2_0= RULE_ID ) ) otherlv_3= ':' ) | ( ( ( (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING ) ) ) (this_SPACE_5= RULE_SPACE )* otherlv_6= '=>' ) )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_ID) ) {
                alt51=1;
            }
            else if ( ((LA51_0>=RULE_SYMBOL && LA51_0<=RULE_STRING)) ) {
                alt51=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // InternalRails.g:1348:4: ( ( (lv_key_2_0= RULE_ID ) ) otherlv_3= ':' )
                    {
                    // InternalRails.g:1348:4: ( ( (lv_key_2_0= RULE_ID ) ) otherlv_3= ':' )
                    // InternalRails.g:1348:5: ( (lv_key_2_0= RULE_ID ) ) otherlv_3= ':'
                    {
                    // InternalRails.g:1348:5: ( (lv_key_2_0= RULE_ID ) )
                    // InternalRails.g:1349:1: (lv_key_2_0= RULE_ID )
                    {
                    // InternalRails.g:1349:1: (lv_key_2_0= RULE_ID )
                    // InternalRails.g:1350:3: lv_key_2_0= RULE_ID
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

                    otherlv_3=(Token)match(input,52,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getHashKeyValueAccess().getColonKeyword_2_0_1());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalRails.g:1371:6: ( ( ( (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING ) ) ) (this_SPACE_5= RULE_SPACE )* otherlv_6= '=>' )
                    {
                    // InternalRails.g:1371:6: ( ( ( (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING ) ) ) (this_SPACE_5= RULE_SPACE )* otherlv_6= '=>' )
                    // InternalRails.g:1371:7: ( ( (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING ) ) ) (this_SPACE_5= RULE_SPACE )* otherlv_6= '=>'
                    {
                    // InternalRails.g:1371:7: ( ( (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING ) ) )
                    // InternalRails.g:1372:1: ( (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING ) )
                    {
                    // InternalRails.g:1372:1: ( (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING ) )
                    // InternalRails.g:1373:1: (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING )
                    {
                    // InternalRails.g:1373:1: (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING )
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==RULE_SYMBOL) ) {
                        alt49=1;
                    }
                    else if ( (LA49_0==RULE_STRING) ) {
                        alt49=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 49, 0, input);

                        throw nvae;
                    }
                    switch (alt49) {
                        case 1 :
                            // InternalRails.g:1374:3: lv_key_4_1= RULE_SYMBOL
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
                            // InternalRails.g:1389:8: lv_key_4_2= RULE_STRING
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

                    // InternalRails.g:1407:2: (this_SPACE_5= RULE_SPACE )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==RULE_SPACE) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // InternalRails.g:1407:3: this_SPACE_5= RULE_SPACE
                    	    {
                    	    this_SPACE_5=(Token)match(input,RULE_SPACE,FOLLOW_26); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_SPACE_5, grammarAccess.getHashKeyValueAccess().getSPACETerminalRuleCall_2_1_1()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop50;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,53,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getHashKeyValueAccess().getEqualsSignGreaterThanSignKeyword_2_1_2());
                          
                    }

                    }


                    }
                    break;

            }

            // InternalRails.g:1415:3: (this_SPACE_7= RULE_SPACE )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==RULE_SPACE) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalRails.g:1415:4: this_SPACE_7= RULE_SPACE
            	    {
            	    this_SPACE_7=(Token)match(input,RULE_SPACE,FOLLOW_25); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SPACE_7, grammarAccess.getHashKeyValueAccess().getSPACETerminalRuleCall_3()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

            // InternalRails.g:1419:3: ( ( (lv_value_8_1= RULE_SYMBOL | lv_value_8_2= RULE_STRING | lv_value_8_3= RULE_BRACKET_BLOCK | lv_value_8_4= RULE_ARRAY_BLOCK | lv_value_8_5= RULE_DECIMAL | lv_value_8_6= RULE_INT | lv_value_8_7= RULE_INT_METHOD | lv_value_8_8= ruleMethodChainCall ) ) )
            // InternalRails.g:1420:1: ( (lv_value_8_1= RULE_SYMBOL | lv_value_8_2= RULE_STRING | lv_value_8_3= RULE_BRACKET_BLOCK | lv_value_8_4= RULE_ARRAY_BLOCK | lv_value_8_5= RULE_DECIMAL | lv_value_8_6= RULE_INT | lv_value_8_7= RULE_INT_METHOD | lv_value_8_8= ruleMethodChainCall ) )
            {
            // InternalRails.g:1420:1: ( (lv_value_8_1= RULE_SYMBOL | lv_value_8_2= RULE_STRING | lv_value_8_3= RULE_BRACKET_BLOCK | lv_value_8_4= RULE_ARRAY_BLOCK | lv_value_8_5= RULE_DECIMAL | lv_value_8_6= RULE_INT | lv_value_8_7= RULE_INT_METHOD | lv_value_8_8= ruleMethodChainCall ) )
            // InternalRails.g:1421:1: (lv_value_8_1= RULE_SYMBOL | lv_value_8_2= RULE_STRING | lv_value_8_3= RULE_BRACKET_BLOCK | lv_value_8_4= RULE_ARRAY_BLOCK | lv_value_8_5= RULE_DECIMAL | lv_value_8_6= RULE_INT | lv_value_8_7= RULE_INT_METHOD | lv_value_8_8= ruleMethodChainCall )
            {
            // InternalRails.g:1421:1: (lv_value_8_1= RULE_SYMBOL | lv_value_8_2= RULE_STRING | lv_value_8_3= RULE_BRACKET_BLOCK | lv_value_8_4= RULE_ARRAY_BLOCK | lv_value_8_5= RULE_DECIMAL | lv_value_8_6= RULE_INT | lv_value_8_7= RULE_INT_METHOD | lv_value_8_8= ruleMethodChainCall )
            int alt53=8;
            switch ( input.LA(1) ) {
            case RULE_SYMBOL:
                {
                alt53=1;
                }
                break;
            case RULE_STRING:
                {
                alt53=2;
                }
                break;
            case RULE_BRACKET_BLOCK:
                {
                alt53=3;
                }
                break;
            case RULE_ARRAY_BLOCK:
                {
                alt53=4;
                }
                break;
            case RULE_DECIMAL:
                {
                alt53=5;
                }
                break;
            case RULE_INT:
                {
                alt53=6;
                }
                break;
            case RULE_INT_METHOD:
                {
                alt53=7;
                }
                break;
            case RULE_ID:
            case RULE_PARENTHESIS_BLOCK:
                {
                alt53=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // InternalRails.g:1422:3: lv_value_8_1= RULE_SYMBOL
                    {
                    lv_value_8_1=(Token)match(input,RULE_SYMBOL,FOLLOW_13); if (state.failed) return current;
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
                    // InternalRails.g:1437:8: lv_value_8_2= RULE_STRING
                    {
                    lv_value_8_2=(Token)match(input,RULE_STRING,FOLLOW_13); if (state.failed) return current;
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
                    // InternalRails.g:1452:8: lv_value_8_3= RULE_BRACKET_BLOCK
                    {
                    lv_value_8_3=(Token)match(input,RULE_BRACKET_BLOCK,FOLLOW_13); if (state.failed) return current;
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
                    // InternalRails.g:1467:8: lv_value_8_4= RULE_ARRAY_BLOCK
                    {
                    lv_value_8_4=(Token)match(input,RULE_ARRAY_BLOCK,FOLLOW_13); if (state.failed) return current;
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
                    // InternalRails.g:1482:8: lv_value_8_5= RULE_DECIMAL
                    {
                    lv_value_8_5=(Token)match(input,RULE_DECIMAL,FOLLOW_13); if (state.failed) return current;
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
                    // InternalRails.g:1497:8: lv_value_8_6= RULE_INT
                    {
                    lv_value_8_6=(Token)match(input,RULE_INT,FOLLOW_13); if (state.failed) return current;
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
                    // InternalRails.g:1512:8: lv_value_8_7= RULE_INT_METHOD
                    {
                    lv_value_8_7=(Token)match(input,RULE_INT_METHOD,FOLLOW_13); if (state.failed) return current;
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
                    // InternalRails.g:1527:8: lv_value_8_8= ruleMethodChainCall
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getHashKeyValueAccess().getValueMethodChainCallParserRuleCall_4_0_7()); 
                      	    
                    }
                    pushFollow(FOLLOW_13);
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

            // InternalRails.g:1545:2: (this_SPACE_9= RULE_SPACE )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==RULE_SPACE) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalRails.g:1545:3: this_SPACE_9= RULE_SPACE
            	    {
            	    this_SPACE_9=(Token)match(input,RULE_SPACE,FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SPACE_9, grammarAccess.getHashKeyValueAccess().getSPACETerminalRuleCall_5()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop54;
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
    // InternalRails.g:1557:1: entryRuleIgnoredHashKeyValue returns [String current=null] : iv_ruleIgnoredHashKeyValue= ruleIgnoredHashKeyValue EOF ;
    public final String entryRuleIgnoredHashKeyValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIgnoredHashKeyValue = null;


        try {
            // InternalRails.g:1558:2: (iv_ruleIgnoredHashKeyValue= ruleIgnoredHashKeyValue EOF )
            // InternalRails.g:1559:2: iv_ruleIgnoredHashKeyValue= ruleIgnoredHashKeyValue EOF
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
    // InternalRails.g:1566:1: ruleIgnoredHashKeyValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_SPACE_0= RULE_SPACE )* ( (this_ID_1= RULE_ID kw= ':' ) | ( (this_SYMBOL_3= RULE_SYMBOL | this_STRING_4= RULE_STRING ) (this_SPACE_5= RULE_SPACE )* kw= '=>' ) ) (this_SPACE_7= RULE_SPACE )* (this_SYMBOL_8= RULE_SYMBOL | this_STRING_9= RULE_STRING | this_BRACKET_BLOCK_10= RULE_BRACKET_BLOCK | this_ARRAY_BLOCK_11= RULE_ARRAY_BLOCK | this_DECIMAL_12= RULE_DECIMAL | this_INT_13= RULE_INT | this_INT_METHOD_14= RULE_INT_METHOD | this_MethodChainCall_15= ruleMethodChainCall | this_REGEXP_16= RULE_REGEXP ) (this_SPACE_17= RULE_SPACE )* ) ;
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
            // InternalRails.g:1569:28: ( ( (this_SPACE_0= RULE_SPACE )* ( (this_ID_1= RULE_ID kw= ':' ) | ( (this_SYMBOL_3= RULE_SYMBOL | this_STRING_4= RULE_STRING ) (this_SPACE_5= RULE_SPACE )* kw= '=>' ) ) (this_SPACE_7= RULE_SPACE )* (this_SYMBOL_8= RULE_SYMBOL | this_STRING_9= RULE_STRING | this_BRACKET_BLOCK_10= RULE_BRACKET_BLOCK | this_ARRAY_BLOCK_11= RULE_ARRAY_BLOCK | this_DECIMAL_12= RULE_DECIMAL | this_INT_13= RULE_INT | this_INT_METHOD_14= RULE_INT_METHOD | this_MethodChainCall_15= ruleMethodChainCall | this_REGEXP_16= RULE_REGEXP ) (this_SPACE_17= RULE_SPACE )* ) )
            // InternalRails.g:1570:1: ( (this_SPACE_0= RULE_SPACE )* ( (this_ID_1= RULE_ID kw= ':' ) | ( (this_SYMBOL_3= RULE_SYMBOL | this_STRING_4= RULE_STRING ) (this_SPACE_5= RULE_SPACE )* kw= '=>' ) ) (this_SPACE_7= RULE_SPACE )* (this_SYMBOL_8= RULE_SYMBOL | this_STRING_9= RULE_STRING | this_BRACKET_BLOCK_10= RULE_BRACKET_BLOCK | this_ARRAY_BLOCK_11= RULE_ARRAY_BLOCK | this_DECIMAL_12= RULE_DECIMAL | this_INT_13= RULE_INT | this_INT_METHOD_14= RULE_INT_METHOD | this_MethodChainCall_15= ruleMethodChainCall | this_REGEXP_16= RULE_REGEXP ) (this_SPACE_17= RULE_SPACE )* )
            {
            // InternalRails.g:1570:1: ( (this_SPACE_0= RULE_SPACE )* ( (this_ID_1= RULE_ID kw= ':' ) | ( (this_SYMBOL_3= RULE_SYMBOL | this_STRING_4= RULE_STRING ) (this_SPACE_5= RULE_SPACE )* kw= '=>' ) ) (this_SPACE_7= RULE_SPACE )* (this_SYMBOL_8= RULE_SYMBOL | this_STRING_9= RULE_STRING | this_BRACKET_BLOCK_10= RULE_BRACKET_BLOCK | this_ARRAY_BLOCK_11= RULE_ARRAY_BLOCK | this_DECIMAL_12= RULE_DECIMAL | this_INT_13= RULE_INT | this_INT_METHOD_14= RULE_INT_METHOD | this_MethodChainCall_15= ruleMethodChainCall | this_REGEXP_16= RULE_REGEXP ) (this_SPACE_17= RULE_SPACE )* )
            // InternalRails.g:1570:2: (this_SPACE_0= RULE_SPACE )* ( (this_ID_1= RULE_ID kw= ':' ) | ( (this_SYMBOL_3= RULE_SYMBOL | this_STRING_4= RULE_STRING ) (this_SPACE_5= RULE_SPACE )* kw= '=>' ) ) (this_SPACE_7= RULE_SPACE )* (this_SYMBOL_8= RULE_SYMBOL | this_STRING_9= RULE_STRING | this_BRACKET_BLOCK_10= RULE_BRACKET_BLOCK | this_ARRAY_BLOCK_11= RULE_ARRAY_BLOCK | this_DECIMAL_12= RULE_DECIMAL | this_INT_13= RULE_INT | this_INT_METHOD_14= RULE_INT_METHOD | this_MethodChainCall_15= ruleMethodChainCall | this_REGEXP_16= RULE_REGEXP ) (this_SPACE_17= RULE_SPACE )*
            {
            // InternalRails.g:1570:2: (this_SPACE_0= RULE_SPACE )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==RULE_SPACE) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalRails.g:1570:7: this_SPACE_0= RULE_SPACE
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
            	    break loop55;
                }
            } while (true);

            // InternalRails.g:1577:3: ( (this_ID_1= RULE_ID kw= ':' ) | ( (this_SYMBOL_3= RULE_SYMBOL | this_STRING_4= RULE_STRING ) (this_SPACE_5= RULE_SPACE )* kw= '=>' ) )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_ID) ) {
                alt58=1;
            }
            else if ( ((LA58_0>=RULE_SYMBOL && LA58_0<=RULE_STRING)) ) {
                alt58=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // InternalRails.g:1577:4: (this_ID_1= RULE_ID kw= ':' )
                    {
                    // InternalRails.g:1577:4: (this_ID_1= RULE_ID kw= ':' )
                    // InternalRails.g:1577:9: this_ID_1= RULE_ID kw= ':'
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_1, grammarAccess.getIgnoredHashKeyValueAccess().getIDTerminalRuleCall_1_0_0()); 
                          
                    }
                    kw=(Token)match(input,52,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIgnoredHashKeyValueAccess().getColonKeyword_1_0_1()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalRails.g:1591:6: ( (this_SYMBOL_3= RULE_SYMBOL | this_STRING_4= RULE_STRING ) (this_SPACE_5= RULE_SPACE )* kw= '=>' )
                    {
                    // InternalRails.g:1591:6: ( (this_SYMBOL_3= RULE_SYMBOL | this_STRING_4= RULE_STRING ) (this_SPACE_5= RULE_SPACE )* kw= '=>' )
                    // InternalRails.g:1591:7: (this_SYMBOL_3= RULE_SYMBOL | this_STRING_4= RULE_STRING ) (this_SPACE_5= RULE_SPACE )* kw= '=>'
                    {
                    // InternalRails.g:1591:7: (this_SYMBOL_3= RULE_SYMBOL | this_STRING_4= RULE_STRING )
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==RULE_SYMBOL) ) {
                        alt56=1;
                    }
                    else if ( (LA56_0==RULE_STRING) ) {
                        alt56=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 56, 0, input);

                        throw nvae;
                    }
                    switch (alt56) {
                        case 1 :
                            // InternalRails.g:1591:12: this_SYMBOL_3= RULE_SYMBOL
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
                            // InternalRails.g:1599:10: this_STRING_4= RULE_STRING
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

                    // InternalRails.g:1606:2: (this_SPACE_5= RULE_SPACE )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==RULE_SPACE) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // InternalRails.g:1606:7: this_SPACE_5= RULE_SPACE
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
                    	    break loop57;
                        }
                    } while (true);

                    kw=(Token)match(input,53,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIgnoredHashKeyValueAccess().getEqualsSignGreaterThanSignKeyword_1_1_2()); 
                          
                    }

                    }


                    }
                    break;

            }

            // InternalRails.g:1619:3: (this_SPACE_7= RULE_SPACE )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==RULE_SPACE) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // InternalRails.g:1619:8: this_SPACE_7= RULE_SPACE
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
            	    break loop59;
                }
            } while (true);

            // InternalRails.g:1626:3: (this_SYMBOL_8= RULE_SYMBOL | this_STRING_9= RULE_STRING | this_BRACKET_BLOCK_10= RULE_BRACKET_BLOCK | this_ARRAY_BLOCK_11= RULE_ARRAY_BLOCK | this_DECIMAL_12= RULE_DECIMAL | this_INT_13= RULE_INT | this_INT_METHOD_14= RULE_INT_METHOD | this_MethodChainCall_15= ruleMethodChainCall | this_REGEXP_16= RULE_REGEXP )
            int alt60=9;
            alt60 = dfa60.predict(input);
            switch (alt60) {
                case 1 :
                    // InternalRails.g:1626:8: this_SYMBOL_8= RULE_SYMBOL
                    {
                    this_SYMBOL_8=(Token)match(input,RULE_SYMBOL,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_SYMBOL_8);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SYMBOL_8, grammarAccess.getIgnoredHashKeyValueAccess().getSYMBOLTerminalRuleCall_3_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalRails.g:1634:10: this_STRING_9= RULE_STRING
                    {
                    this_STRING_9=(Token)match(input,RULE_STRING,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_9);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_9, grammarAccess.getIgnoredHashKeyValueAccess().getSTRINGTerminalRuleCall_3_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalRails.g:1642:10: this_BRACKET_BLOCK_10= RULE_BRACKET_BLOCK
                    {
                    this_BRACKET_BLOCK_10=(Token)match(input,RULE_BRACKET_BLOCK,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BRACKET_BLOCK_10);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BRACKET_BLOCK_10, grammarAccess.getIgnoredHashKeyValueAccess().getBRACKET_BLOCKTerminalRuleCall_3_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // InternalRails.g:1650:10: this_ARRAY_BLOCK_11= RULE_ARRAY_BLOCK
                    {
                    this_ARRAY_BLOCK_11=(Token)match(input,RULE_ARRAY_BLOCK,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ARRAY_BLOCK_11);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ARRAY_BLOCK_11, grammarAccess.getIgnoredHashKeyValueAccess().getARRAY_BLOCKTerminalRuleCall_3_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // InternalRails.g:1658:10: this_DECIMAL_12= RULE_DECIMAL
                    {
                    this_DECIMAL_12=(Token)match(input,RULE_DECIMAL,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_DECIMAL_12);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_DECIMAL_12, grammarAccess.getIgnoredHashKeyValueAccess().getDECIMALTerminalRuleCall_3_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // InternalRails.g:1666:10: this_INT_13= RULE_INT
                    {
                    this_INT_13=(Token)match(input,RULE_INT,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_13);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_13, grammarAccess.getIgnoredHashKeyValueAccess().getINTTerminalRuleCall_3_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // InternalRails.g:1674:10: this_INT_METHOD_14= RULE_INT_METHOD
                    {
                    this_INT_METHOD_14=(Token)match(input,RULE_INT_METHOD,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_METHOD_14);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_METHOD_14, grammarAccess.getIgnoredHashKeyValueAccess().getINT_METHODTerminalRuleCall_3_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // InternalRails.g:1683:5: this_MethodChainCall_15= ruleMethodChainCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIgnoredHashKeyValueAccess().getMethodChainCallParserRuleCall_3_7()); 
                          
                    }
                    pushFollow(FOLLOW_13);
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
                    // InternalRails.g:1694:10: this_REGEXP_16= RULE_REGEXP
                    {
                    this_REGEXP_16=(Token)match(input,RULE_REGEXP,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_REGEXP_16);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_REGEXP_16, grammarAccess.getIgnoredHashKeyValueAccess().getREGEXPTerminalRuleCall_3_8()); 
                          
                    }

                    }
                    break;

            }

            // InternalRails.g:1701:2: (this_SPACE_17= RULE_SPACE )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==RULE_SPACE) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // InternalRails.g:1701:7: this_SPACE_17= RULE_SPACE
            	    {
            	    this_SPACE_17=(Token)match(input,RULE_SPACE,FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_SPACE_17);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SPACE_17, grammarAccess.getIgnoredHashKeyValueAccess().getSPACETerminalRuleCall_4()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop61;
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
    // InternalRails.g:1716:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // InternalRails.g:1717:2: (iv_ruleMethod= ruleMethod EOF )
            // InternalRails.g:1718:2: iv_ruleMethod= ruleMethod EOF
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
    // InternalRails.g:1725:1: ruleMethod returns [EObject current=null] : (this_DEF_WORD_0= RULE_DEF_WORD (this_SPACE_1= RULE_SPACE )* ( (lv_name_2_0= ruleMethodName ) ) (this_SPACE_3= RULE_SPACE )* (this_PARENTHESIS_BLOCK_4= RULE_PARENTHESIS_BLOCK )? ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        Token this_DEF_WORD_0=null;
        Token this_SPACE_1=null;
        Token this_SPACE_3=null;
        Token this_PARENTHESIS_BLOCK_4=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // InternalRails.g:1728:28: ( (this_DEF_WORD_0= RULE_DEF_WORD (this_SPACE_1= RULE_SPACE )* ( (lv_name_2_0= ruleMethodName ) ) (this_SPACE_3= RULE_SPACE )* (this_PARENTHESIS_BLOCK_4= RULE_PARENTHESIS_BLOCK )? ) )
            // InternalRails.g:1729:1: (this_DEF_WORD_0= RULE_DEF_WORD (this_SPACE_1= RULE_SPACE )* ( (lv_name_2_0= ruleMethodName ) ) (this_SPACE_3= RULE_SPACE )* (this_PARENTHESIS_BLOCK_4= RULE_PARENTHESIS_BLOCK )? )
            {
            // InternalRails.g:1729:1: (this_DEF_WORD_0= RULE_DEF_WORD (this_SPACE_1= RULE_SPACE )* ( (lv_name_2_0= ruleMethodName ) ) (this_SPACE_3= RULE_SPACE )* (this_PARENTHESIS_BLOCK_4= RULE_PARENTHESIS_BLOCK )? )
            // InternalRails.g:1729:2: this_DEF_WORD_0= RULE_DEF_WORD (this_SPACE_1= RULE_SPACE )* ( (lv_name_2_0= ruleMethodName ) ) (this_SPACE_3= RULE_SPACE )* (this_PARENTHESIS_BLOCK_4= RULE_PARENTHESIS_BLOCK )?
            {
            this_DEF_WORD_0=(Token)match(input,RULE_DEF_WORD,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_DEF_WORD_0, grammarAccess.getMethodAccess().getDEF_WORDTerminalRuleCall_0()); 
                  
            }
            // InternalRails.g:1733:1: (this_SPACE_1= RULE_SPACE )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==RULE_SPACE) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // InternalRails.g:1733:2: this_SPACE_1= RULE_SPACE
            	    {
            	    this_SPACE_1=(Token)match(input,RULE_SPACE,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SPACE_1, grammarAccess.getMethodAccess().getSPACETerminalRuleCall_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);

            // InternalRails.g:1737:3: ( (lv_name_2_0= ruleMethodName ) )
            // InternalRails.g:1738:1: (lv_name_2_0= ruleMethodName )
            {
            // InternalRails.g:1738:1: (lv_name_2_0= ruleMethodName )
            // InternalRails.g:1739:3: lv_name_2_0= ruleMethodName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMethodAccess().getNameMethodNameParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_27);
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

            // InternalRails.g:1755:2: (this_SPACE_3= RULE_SPACE )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==RULE_SPACE) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // InternalRails.g:1755:3: this_SPACE_3= RULE_SPACE
            	    {
            	    this_SPACE_3=(Token)match(input,RULE_SPACE,FOLLOW_27); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SPACE_3, grammarAccess.getMethodAccess().getSPACETerminalRuleCall_3()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);

            // InternalRails.g:1759:3: (this_PARENTHESIS_BLOCK_4= RULE_PARENTHESIS_BLOCK )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==RULE_PARENTHESIS_BLOCK) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalRails.g:1759:4: this_PARENTHESIS_BLOCK_4= RULE_PARENTHESIS_BLOCK
                    {
                    this_PARENTHESIS_BLOCK_4=(Token)match(input,RULE_PARENTHESIS_BLOCK,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PARENTHESIS_BLOCK_4, grammarAccess.getMethodAccess().getPARENTHESIS_BLOCKTerminalRuleCall_4()); 
                          
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
    // InternalRails.g:1771:1: entryRuleMethodName returns [String current=null] : iv_ruleMethodName= ruleMethodName EOF ;
    public final String entryRuleMethodName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMethodName = null;


        try {
            // InternalRails.g:1772:2: (iv_ruleMethodName= ruleMethodName EOF )
            // InternalRails.g:1773:2: iv_ruleMethodName= ruleMethodName EOF
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
    // InternalRails.g:1780:1: ruleMethodName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_NamespacedModuleName_0= ruleNamespacedModuleName kw= '.' )? this_ID_2= RULE_ID (kw= '?' | kw= '=' )? ) ;
    public final AntlrDatatypeRuleToken ruleMethodName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_2=null;
        AntlrDatatypeRuleToken this_NamespacedModuleName_0 = null;


         enterRule(); 
            
        try {
            // InternalRails.g:1783:28: ( ( (this_NamespacedModuleName_0= ruleNamespacedModuleName kw= '.' )? this_ID_2= RULE_ID (kw= '?' | kw= '=' )? ) )
            // InternalRails.g:1784:1: ( (this_NamespacedModuleName_0= ruleNamespacedModuleName kw= '.' )? this_ID_2= RULE_ID (kw= '?' | kw= '=' )? )
            {
            // InternalRails.g:1784:1: ( (this_NamespacedModuleName_0= ruleNamespacedModuleName kw= '.' )? this_ID_2= RULE_ID (kw= '?' | kw= '=' )? )
            // InternalRails.g:1784:2: (this_NamespacedModuleName_0= ruleNamespacedModuleName kw= '.' )? this_ID_2= RULE_ID (kw= '?' | kw= '=' )?
            {
            // InternalRails.g:1784:2: (this_NamespacedModuleName_0= ruleNamespacedModuleName kw= '.' )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==RULE_ID) ) {
                int LA65_1 = input.LA(2);

                if ( ((LA65_1>=29 && LA65_1<=30)) ) {
                    alt65=1;
                }
            }
            switch (alt65) {
                case 1 :
                    // InternalRails.g:1785:5: this_NamespacedModuleName_0= ruleNamespacedModuleName kw= '.'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMethodNameAccess().getNamespacedModuleNameParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_28);
                    this_NamespacedModuleName_0=ruleNamespacedModuleName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_NamespacedModuleName_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    kw=(Token)match(input,30,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getMethodNameAccess().getFullStopKeyword_0_1()); 
                          
                    }

                    }
                    break;

            }

            this_ID_2=(Token)match(input,RULE_ID,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_2);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_2, grammarAccess.getMethodNameAccess().getIDTerminalRuleCall_1()); 
                  
            }
            // InternalRails.g:1808:1: (kw= '?' | kw= '=' )?
            int alt66=3;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==32) ) {
                alt66=1;
            }
            else if ( (LA66_0==39) ) {
                alt66=2;
            }
            switch (alt66) {
                case 1 :
                    // InternalRails.g:1809:2: kw= '?'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getMethodNameAccess().getQuestionMarkKeyword_2_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalRails.g:1816:2: kw= '='
                    {
                    kw=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
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
        // InternalRails.g:366:4: ( RULE_SPACE )
        // InternalRails.g:366:6: RULE_SPACE
        {
        match(input,RULE_SPACE,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalRails

    // $ANTLR start synpred2_InternalRails
    public final void synpred2_InternalRails_fragment() throws RecognitionException {   
        // InternalRails.g:380:4: ( RULE_SPACE )
        // InternalRails.g:380:6: RULE_SPACE
        {
        match(input,RULE_SPACE,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalRails

    // $ANTLR start synpred3_InternalRails
    public final void synpred3_InternalRails_fragment() throws RecognitionException {   
        // InternalRails.g:394:4: ( RULE_SPACE )
        // InternalRails.g:394:6: RULE_SPACE
        {
        match(input,RULE_SPACE,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalRails

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
    protected DFA23 dfa23 = new DFA23(this);
    protected DFA60 dfa60 = new DFA60(this);
    static final String dfa_1s = "\4\uffff";
    static final String dfa_2s = "\2\3\2\uffff";
    static final String dfa_3s = "\2\5\2\uffff";
    static final String dfa_4s = "\2\34\2\uffff";
    static final String dfa_5s = "\2\uffff\1\1\1\2";
    static final String dfa_6s = "\4\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\7\3\5\uffff\1\3\1\uffff\4\3\4\uffff\1\2",
            "\1\1\7\3\5\uffff\1\3\1\uffff\4\3\4\uffff\1\2",
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
    static final String dfa_11s = "\1\63\7\uffff\1\63\1\uffff\2\65\1\64\1\65";
    static final String dfa_12s = "\1\uffff\7\1\1\uffff\1\2\4\uffff";
    static final String dfa_13s = "\16\uffff}>";
    static final String[] dfa_14s = {
            "\1\10\1\7\1\2\1\3\1\5\1\6\1\1\1\4\3\11\1\4\1\5\6\11\4\uffff\1\11\2\uffff\25\11",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\10\1\14\1\12\1\13\7\11\2\uffff\6\11\4\uffff\1\11\2\uffff\25\11",
            "",
            "\1\15\11\11\1\uffff\3\11\1\uffff\4\11\4\uffff\1\11\1\uffff\26\11\1\uffff\1\7",
            "\1\15\11\11\1\uffff\3\11\1\uffff\4\11\4\uffff\1\11\1\uffff\26\11\1\uffff\1\7",
            "\12\11\1\uffff\3\11\1\uffff\4\11\4\uffff\30\11\1\7",
            "\1\15\11\11\1\uffff\3\11\1\uffff\4\11\4\uffff\1\11\2\uffff\25\11\1\uffff\1\7"
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
            return "355:3: (this_MethodCallParameters_11= ruleMethodCallParameters )?";
        }
    }
    static final String dfa_15s = "\17\uffff";
    static final String dfa_16s = "\1\uffff\1\14\1\16\6\uffff\1\10\1\uffff\1\14\1\uffff\1\16\1\uffff";
    static final String dfa_17s = "\3\5\6\uffff\1\5\1\uffff\1\5\1\uffff\1\5\1\uffff";
    static final String dfa_18s = "\1\21\2\65\6\uffff\1\64\1\uffff\1\65\1\uffff\1\65\1\uffff";
    static final String dfa_19s = "\3\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\uffff\1\11\1\uffff\1\1\1\uffff\1\2";
    static final String dfa_20s = "\17\uffff}>";
    static final String[] dfa_21s = {
            "\1\12\1\11\1\1\1\2\1\6\1\10\1\4\1\3\3\uffff\1\5\1\7",
            "\1\13\12\14\2\uffff\6\14\4\uffff\1\14\2\uffff\25\14\1\uffff\1\12",
            "\1\15\12\16\2\uffff\6\16\4\uffff\1\16\2\uffff\25\16\1\uffff\1\12",
            "",
            "",
            "",
            "",
            "",
            "",
            "\23\10\4\uffff\30\10\1\12",
            "",
            "\1\13\12\14\2\uffff\6\14\4\uffff\1\14\2\uffff\25\14\1\uffff\1\12",
            "",
            "\1\15\12\16\2\uffff\6\16\4\uffff\1\16\2\uffff\25\16\1\uffff\1\12",
            ""
    };

    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final char[] dfa_18 = DFA.unpackEncodedStringToUnsignedChars(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final short[][] dfa_21 = unpackEncodedStringArray(dfa_21s);

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = dfa_15;
            this.eof = dfa_16;
            this.min = dfa_17;
            this.max = dfa_18;
            this.accept = dfa_19;
            this.special = dfa_20;
            this.transition = dfa_21;
        }
        public String getDescription() {
            return "526:1: (this_SYMBOL_0= RULE_SYMBOL | this_STRING_1= RULE_STRING | this_ARRAY_BLOCK_2= RULE_ARRAY_BLOCK | this_PARENTHESIS_BLOCK_3= RULE_PARENTHESIS_BLOCK | this_DECIMAL_4= RULE_DECIMAL | this_INT_5= RULE_INT | this_REGEXP_6= RULE_REGEXP | this_MethodChainCall_7= ruleMethodChainCall | this_IgnoredHashKeyValue_8= ruleIgnoredHashKeyValue )";
        }
    }
    static final String dfa_22s = "\12\uffff";
    static final String dfa_23s = "\1\6\11\uffff";
    static final String dfa_24s = "\1\21\11\uffff";
    static final String dfa_25s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11";
    static final String dfa_26s = "\12\uffff}>";
    static final String[] dfa_27s = {
            "\1\10\1\1\1\2\1\6\1\7\1\10\1\4\1\3\2\uffff\1\5\1\11",
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

    class DFA60 extends DFA {

        public DFA60(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 60;
            this.eot = dfa_22;
            this.eof = dfa_22;
            this.min = dfa_23;
            this.max = dfa_24;
            this.accept = dfa_25;
            this.special = dfa_26;
            this.transition = dfa_27;
        }
        public String getDescription() {
            return "1626:3: (this_SYMBOL_8= RULE_SYMBOL | this_STRING_9= RULE_STRING | this_BRACKET_BLOCK_10= RULE_BRACKET_BLOCK | this_ARRAY_BLOCK_11= RULE_ARRAY_BLOCK | this_DECIMAL_12= RULE_DECIMAL | this_INT_13= RULE_INT | this_INT_METHOD_14= RULE_INT_METHOD | this_MethodChainCall_15= ruleMethodChainCall | this_REGEXP_16= RULE_REGEXP )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000010F41FE2L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000010000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000F41FE2L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000040F77FE2L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000F77FE2L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000006022L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000004022L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000008022L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000F73FE0L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000FFFFF90000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000000000001A0L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000088022L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000088002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000000000001E0L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000F53FE0L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0020000000000020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000822L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000008100000002L});

}