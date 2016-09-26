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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_CLASS_WORD", "RULE_SPACE", "RULE_ID", "RULE_PARENTHESIS_BLOCK", "RULE_COMMA", "RULE_SYMBOL", "RULE_STRING", "RULE_ARRAY_BLOCK", "RULE_DECIMAL", "RULE_INT", "RULE_REGEXP", "RULE_ASSIGN_OPERATOR", "RULE_OPERATOR", "RULE_INT_METHOD", "RULE_HAS_MANY_WORD", "RULE_SL_COMMENT", "RULE_HAS_ONE_WORD", "RULE_HAS_AND_BELONGS_TO_MANY_WORD", "RULE_BELONGS_TO_WORD", "RULE_DEF_WORD", "RULE_BRACKET_BLOCK_ALONE", "RULE_MODULE_WORD", "RULE_ML_COMMENT", "RULE_BS", "RULE_ANY_OTHER", "'<'", "'::'", "'.'", "'='", "':'", "'=>'", "'?'", "'{'", "'}'"
    };
    public static final int RULE_HAS_MANY_WORD=18;
    public static final int RULE_CLASS_WORD=4;
    public static final int RULE_PARENTHESIS_BLOCK=7;
    public static final int RULE_HAS_ONE_WORD=20;
    public static final int RULE_STRING=10;
    public static final int RULE_SL_COMMENT=19;
    public static final int T__37=37;
    public static final int RULE_BRACKET_BLOCK_ALONE=24;
    public static final int RULE_HAS_AND_BELONGS_TO_MANY_WORD=21;
    public static final int RULE_ASSIGN_OPERATOR=15;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int RULE_SPACE=5;
    public static final int T__36=36;
    public static final int RULE_REGEXP=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_OPERATOR=16;
    public static final int T__32=32;
    public static final int RULE_ARRAY_BLOCK=11;
    public static final int RULE_ID=6;
    public static final int RULE_COMMA=8;
    public static final int RULE_ANY_OTHER=28;
    public static final int RULE_BS=27;
    public static final int RULE_DECIMAL=12;
    public static final int RULE_MODULE_WORD=25;
    public static final int RULE_INT=13;
    public static final int T__29=29;
    public static final int RULE_ML_COMMENT=26;
    public static final int RULE_SYMBOL=9;
    public static final int RULE_DEF_WORD=23;
    public static final int RULE_INT_METHOD=17;
    public static final int RULE_BELONGS_TO_WORD=22;

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

                    otherlv_4=(Token)match(input,29,FOLLOW_3); if (state.failed) return current;
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

                if ( (LA6_0==RULE_ID||LA6_0==RULE_HAS_MANY_WORD||(LA6_0>=RULE_HAS_ONE_WORD && LA6_0<=RULE_DEF_WORD)) ) {
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

                    if ( (LA8_1==30) ) {
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
            	    kw=(Token)match(input,30,FOLLOW_8); if (state.failed) return current;
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
    // InternalRails.g:265:1: ruleMethodChainCall returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NamespacedModuleName_0= ruleNamespacedModuleName (kw= '.' this_ID_2= RULE_ID )* (this_SPACE_3= RULE_SPACE )* (this_MethodCallParameters_4= ruleMethodCallParameters )? ( ( RULE_SPACE )=>this_SPACE_5= RULE_SPACE )* (this_BracketBlock_6= ruleBracketBlock )? ) ;
    public final AntlrDatatypeRuleToken ruleMethodChainCall() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_2=null;
        Token this_SPACE_3=null;
        Token this_SPACE_5=null;
        AntlrDatatypeRuleToken this_NamespacedModuleName_0 = null;

        AntlrDatatypeRuleToken this_MethodCallParameters_4 = null;

        AntlrDatatypeRuleToken this_BracketBlock_6 = null;


         enterRule(); 
            
        try {
            // InternalRails.g:268:28: ( (this_NamespacedModuleName_0= ruleNamespacedModuleName (kw= '.' this_ID_2= RULE_ID )* (this_SPACE_3= RULE_SPACE )* (this_MethodCallParameters_4= ruleMethodCallParameters )? ( ( RULE_SPACE )=>this_SPACE_5= RULE_SPACE )* (this_BracketBlock_6= ruleBracketBlock )? ) )
            // InternalRails.g:269:1: (this_NamespacedModuleName_0= ruleNamespacedModuleName (kw= '.' this_ID_2= RULE_ID )* (this_SPACE_3= RULE_SPACE )* (this_MethodCallParameters_4= ruleMethodCallParameters )? ( ( RULE_SPACE )=>this_SPACE_5= RULE_SPACE )* (this_BracketBlock_6= ruleBracketBlock )? )
            {
            // InternalRails.g:269:1: (this_NamespacedModuleName_0= ruleNamespacedModuleName (kw= '.' this_ID_2= RULE_ID )* (this_SPACE_3= RULE_SPACE )* (this_MethodCallParameters_4= ruleMethodCallParameters )? ( ( RULE_SPACE )=>this_SPACE_5= RULE_SPACE )* (this_BracketBlock_6= ruleBracketBlock )? )
            // InternalRails.g:270:5: this_NamespacedModuleName_0= ruleNamespacedModuleName (kw= '.' this_ID_2= RULE_ID )* (this_SPACE_3= RULE_SPACE )* (this_MethodCallParameters_4= ruleMethodCallParameters )? ( ( RULE_SPACE )=>this_SPACE_5= RULE_SPACE )* (this_BracketBlock_6= ruleBracketBlock )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMethodChainCallAccess().getNamespacedModuleNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_9);
            this_NamespacedModuleName_0=ruleNamespacedModuleName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_NamespacedModuleName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalRails.g:280:1: (kw= '.' this_ID_2= RULE_ID )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==31) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalRails.g:281:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,31,FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getMethodChainCallAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getMethodChainCallAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalRails.g:293:3: (this_SPACE_3= RULE_SPACE )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_SPACE) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalRails.g:293:8: this_SPACE_3= RULE_SPACE
            	    {
            	    this_SPACE_3=(Token)match(input,RULE_SPACE,FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_SPACE_3);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SPACE_3, grammarAccess.getMethodChainCallAccess().getSPACETerminalRuleCall_2()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalRails.g:300:3: (this_MethodCallParameters_4= ruleMethodCallParameters )?
            int alt11=2;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // InternalRails.g:301:5: this_MethodCallParameters_4= ruleMethodCallParameters
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMethodChainCallAccess().getMethodCallParametersParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_11);
                    this_MethodCallParameters_4=ruleMethodCallParameters();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_MethodCallParameters_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }

            // InternalRails.g:311:3: ( ( RULE_SPACE )=>this_SPACE_5= RULE_SPACE )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_SPACE) ) {
                    int LA12_2 = input.LA(2);

                    if ( (synpred1_InternalRails()) ) {
                        alt12=1;
                    }


                }


                switch (alt12) {
            	case 1 :
            	    // InternalRails.g:311:4: ( RULE_SPACE )=>this_SPACE_5= RULE_SPACE
            	    {
            	    this_SPACE_5=(Token)match(input,RULE_SPACE,FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_SPACE_5);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SPACE_5, grammarAccess.getMethodChainCallAccess().getSPACETerminalRuleCall_4()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // InternalRails.g:318:3: (this_BracketBlock_6= ruleBracketBlock )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_BRACKET_BLOCK_ALONE) ) {
                alt13=1;
            }
            else if ( (LA13_0==36) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalRails.g:319:5: this_BracketBlock_6= ruleBracketBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMethodChainCallAccess().getBracketBlockParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_BracketBlock_6=ruleBracketBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BracketBlock_6);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
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
    // InternalRails.g:337:1: entryRuleMethodCallParameters returns [String current=null] : iv_ruleMethodCallParameters= ruleMethodCallParameters EOF ;
    public final String entryRuleMethodCallParameters() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMethodCallParameters = null;


        try {
            // InternalRails.g:338:2: (iv_ruleMethodCallParameters= ruleMethodCallParameters EOF )
            // InternalRails.g:339:2: iv_ruleMethodCallParameters= ruleMethodCallParameters EOF
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
    // InternalRails.g:346:1: ruleMethodCallParameters returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_PARENTHESIS_BLOCK_0= RULE_PARENTHESIS_BLOCK | this_ExpressionsSeparatedByCommas_1= ruleExpressionsSeparatedByCommas ) ;
    public final AntlrDatatypeRuleToken ruleMethodCallParameters() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_PARENTHESIS_BLOCK_0=null;
        AntlrDatatypeRuleToken this_ExpressionsSeparatedByCommas_1 = null;


         enterRule(); 
            
        try {
            // InternalRails.g:349:28: ( (this_PARENTHESIS_BLOCK_0= RULE_PARENTHESIS_BLOCK | this_ExpressionsSeparatedByCommas_1= ruleExpressionsSeparatedByCommas ) )
            // InternalRails.g:350:1: (this_PARENTHESIS_BLOCK_0= RULE_PARENTHESIS_BLOCK | this_ExpressionsSeparatedByCommas_1= ruleExpressionsSeparatedByCommas )
            {
            // InternalRails.g:350:1: (this_PARENTHESIS_BLOCK_0= RULE_PARENTHESIS_BLOCK | this_ExpressionsSeparatedByCommas_1= ruleExpressionsSeparatedByCommas )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_PARENTHESIS_BLOCK) ) {
                alt14=1;
            }
            else if ( ((LA14_0>=RULE_SPACE && LA14_0<=RULE_ID)||(LA14_0>=RULE_SYMBOL && LA14_0<=RULE_REGEXP)) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalRails.g:350:6: this_PARENTHESIS_BLOCK_0= RULE_PARENTHESIS_BLOCK
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
                    // InternalRails.g:359:5: this_ExpressionsSeparatedByCommas_1= ruleExpressionsSeparatedByCommas
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
    // InternalRails.g:377:1: entryRuleExpressionsSeparatedByCommas returns [String current=null] : iv_ruleExpressionsSeparatedByCommas= ruleExpressionsSeparatedByCommas EOF ;
    public final String entryRuleExpressionsSeparatedByCommas() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpressionsSeparatedByCommas = null;


        try {
            // InternalRails.g:378:2: (iv_ruleExpressionsSeparatedByCommas= ruleExpressionsSeparatedByCommas EOF )
            // InternalRails.g:379:2: iv_ruleExpressionsSeparatedByCommas= ruleExpressionsSeparatedByCommas EOF
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
    // InternalRails.g:386:1: ruleExpressionsSeparatedByCommas returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ExpressionWithOutBracket_0= ruleExpressionWithOutBracket ( (this_SPACE_1= RULE_SPACE )* this_COMMA_2= RULE_COMMA (this_SPACE_3= RULE_SPACE )* this_Expression_4= ruleExpression )* ) ;
    public final AntlrDatatypeRuleToken ruleExpressionsSeparatedByCommas() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SPACE_1=null;
        Token this_COMMA_2=null;
        Token this_SPACE_3=null;
        AntlrDatatypeRuleToken this_ExpressionWithOutBracket_0 = null;

        AntlrDatatypeRuleToken this_Expression_4 = null;


         enterRule(); 
            
        try {
            // InternalRails.g:389:28: ( (this_ExpressionWithOutBracket_0= ruleExpressionWithOutBracket ( (this_SPACE_1= RULE_SPACE )* this_COMMA_2= RULE_COMMA (this_SPACE_3= RULE_SPACE )* this_Expression_4= ruleExpression )* ) )
            // InternalRails.g:390:1: (this_ExpressionWithOutBracket_0= ruleExpressionWithOutBracket ( (this_SPACE_1= RULE_SPACE )* this_COMMA_2= RULE_COMMA (this_SPACE_3= RULE_SPACE )* this_Expression_4= ruleExpression )* )
            {
            // InternalRails.g:390:1: (this_ExpressionWithOutBracket_0= ruleExpressionWithOutBracket ( (this_SPACE_1= RULE_SPACE )* this_COMMA_2= RULE_COMMA (this_SPACE_3= RULE_SPACE )* this_Expression_4= ruleExpression )* )
            // InternalRails.g:391:5: this_ExpressionWithOutBracket_0= ruleExpressionWithOutBracket ( (this_SPACE_1= RULE_SPACE )* this_COMMA_2= RULE_COMMA (this_SPACE_3= RULE_SPACE )* this_Expression_4= ruleExpression )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionsSeparatedByCommasAccess().getExpressionWithOutBracketParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_12);
            this_ExpressionWithOutBracket_0=ruleExpressionWithOutBracket();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ExpressionWithOutBracket_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalRails.g:401:1: ( (this_SPACE_1= RULE_SPACE )* this_COMMA_2= RULE_COMMA (this_SPACE_3= RULE_SPACE )* this_Expression_4= ruleExpression )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_SPACE) ) {
                    alt17=1;
                }
                else if ( (LA17_0==RULE_COMMA) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalRails.g:401:2: (this_SPACE_1= RULE_SPACE )* this_COMMA_2= RULE_COMMA (this_SPACE_3= RULE_SPACE )* this_Expression_4= ruleExpression
            	    {
            	    // InternalRails.g:401:2: (this_SPACE_1= RULE_SPACE )*
            	    loop15:
            	    do {
            	        int alt15=2;
            	        int LA15_0 = input.LA(1);

            	        if ( (LA15_0==RULE_SPACE) ) {
            	            alt15=1;
            	        }


            	        switch (alt15) {
            	    	case 1 :
            	    	    // InternalRails.g:401:7: this_SPACE_1= RULE_SPACE
            	    	    {
            	    	    this_SPACE_1=(Token)match(input,RULE_SPACE,FOLLOW_13); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      		current.merge(this_SPACE_1);
            	    	          
            	    	    }
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	          newLeafNode(this_SPACE_1, grammarAccess.getExpressionsSeparatedByCommasAccess().getSPACETerminalRuleCall_1_0()); 
            	    	          
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop15;
            	        }
            	    } while (true);

            	    this_COMMA_2=(Token)match(input,RULE_COMMA,FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_COMMA_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_COMMA_2, grammarAccess.getExpressionsSeparatedByCommasAccess().getCOMMATerminalRuleCall_1_1()); 
            	          
            	    }
            	    // InternalRails.g:415:1: (this_SPACE_3= RULE_SPACE )*
            	    loop16:
            	    do {
            	        int alt16=2;
            	        int LA16_0 = input.LA(1);

            	        if ( (LA16_0==RULE_SPACE) ) {
            	            alt16=1;
            	        }


            	        switch (alt16) {
            	    	case 1 :
            	    	    // InternalRails.g:415:6: this_SPACE_3= RULE_SPACE
            	    	    {
            	    	    this_SPACE_3=(Token)match(input,RULE_SPACE,FOLLOW_14); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      		current.merge(this_SPACE_3);
            	    	          
            	    	    }
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	          newLeafNode(this_SPACE_3, grammarAccess.getExpressionsSeparatedByCommasAccess().getSPACETerminalRuleCall_1_2()); 
            	    	          
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop16;
            	        }
            	    } while (true);

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getExpressionsSeparatedByCommasAccess().getExpressionParserRuleCall_1_3()); 
            	          
            	    }
            	    pushFollow(FOLLOW_12);
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
            	    break loop17;
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
    // InternalRails.g:441:1: entryRuleExpressionWithOutBracket returns [String current=null] : iv_ruleExpressionWithOutBracket= ruleExpressionWithOutBracket EOF ;
    public final String entryRuleExpressionWithOutBracket() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpressionWithOutBracket = null;


        try {
            // InternalRails.g:442:2: (iv_ruleExpressionWithOutBracket= ruleExpressionWithOutBracket EOF )
            // InternalRails.g:443:2: iv_ruleExpressionWithOutBracket= ruleExpressionWithOutBracket EOF
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
    // InternalRails.g:450:1: ruleExpressionWithOutBracket returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SYMBOL_0= RULE_SYMBOL | this_STRING_1= RULE_STRING | this_ARRAY_BLOCK_2= RULE_ARRAY_BLOCK | this_PARENTHESIS_BLOCK_3= RULE_PARENTHESIS_BLOCK | this_DECIMAL_4= RULE_DECIMAL | this_INT_5= RULE_INT | this_REGEXP_6= RULE_REGEXP | this_MethodChainCall_7= ruleMethodChainCall | this_IgnoredHashKeyValue_8= ruleIgnoredHashKeyValue ) ;
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
            // InternalRails.g:453:28: ( (this_SYMBOL_0= RULE_SYMBOL | this_STRING_1= RULE_STRING | this_ARRAY_BLOCK_2= RULE_ARRAY_BLOCK | this_PARENTHESIS_BLOCK_3= RULE_PARENTHESIS_BLOCK | this_DECIMAL_4= RULE_DECIMAL | this_INT_5= RULE_INT | this_REGEXP_6= RULE_REGEXP | this_MethodChainCall_7= ruleMethodChainCall | this_IgnoredHashKeyValue_8= ruleIgnoredHashKeyValue ) )
            // InternalRails.g:454:1: (this_SYMBOL_0= RULE_SYMBOL | this_STRING_1= RULE_STRING | this_ARRAY_BLOCK_2= RULE_ARRAY_BLOCK | this_PARENTHESIS_BLOCK_3= RULE_PARENTHESIS_BLOCK | this_DECIMAL_4= RULE_DECIMAL | this_INT_5= RULE_INT | this_REGEXP_6= RULE_REGEXP | this_MethodChainCall_7= ruleMethodChainCall | this_IgnoredHashKeyValue_8= ruleIgnoredHashKeyValue )
            {
            // InternalRails.g:454:1: (this_SYMBOL_0= RULE_SYMBOL | this_STRING_1= RULE_STRING | this_ARRAY_BLOCK_2= RULE_ARRAY_BLOCK | this_PARENTHESIS_BLOCK_3= RULE_PARENTHESIS_BLOCK | this_DECIMAL_4= RULE_DECIMAL | this_INT_5= RULE_INT | this_REGEXP_6= RULE_REGEXP | this_MethodChainCall_7= ruleMethodChainCall | this_IgnoredHashKeyValue_8= ruleIgnoredHashKeyValue )
            int alt18=9;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // InternalRails.g:454:6: this_SYMBOL_0= RULE_SYMBOL
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
                    // InternalRails.g:462:10: this_STRING_1= RULE_STRING
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
                    // InternalRails.g:470:10: this_ARRAY_BLOCK_2= RULE_ARRAY_BLOCK
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
                    // InternalRails.g:478:10: this_PARENTHESIS_BLOCK_3= RULE_PARENTHESIS_BLOCK
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
                    // InternalRails.g:486:10: this_DECIMAL_4= RULE_DECIMAL
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
                    // InternalRails.g:494:10: this_INT_5= RULE_INT
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
                    // InternalRails.g:502:10: this_REGEXP_6= RULE_REGEXP
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
                    // InternalRails.g:511:5: this_MethodChainCall_7= ruleMethodChainCall
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
                    // InternalRails.g:523:5: this_IgnoredHashKeyValue_8= ruleIgnoredHashKeyValue
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
    // InternalRails.g:541:1: entryRuleExpression returns [String current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final String entryRuleExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpression = null;


        try {
            // InternalRails.g:542:2: (iv_ruleExpression= ruleExpression EOF )
            // InternalRails.g:543:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalRails.g:550:1: ruleExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ExpressionWithOutBracket_0= ruleExpressionWithOutBracket | this_BracketBlock_1= ruleBracketBlock ) ;
    public final AntlrDatatypeRuleToken ruleExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_ExpressionWithOutBracket_0 = null;

        AntlrDatatypeRuleToken this_BracketBlock_1 = null;


         enterRule(); 
            
        try {
            // InternalRails.g:553:28: ( (this_ExpressionWithOutBracket_0= ruleExpressionWithOutBracket | this_BracketBlock_1= ruleBracketBlock ) )
            // InternalRails.g:554:1: (this_ExpressionWithOutBracket_0= ruleExpressionWithOutBracket | this_BracketBlock_1= ruleBracketBlock )
            {
            // InternalRails.g:554:1: (this_ExpressionWithOutBracket_0= ruleExpressionWithOutBracket | this_BracketBlock_1= ruleBracketBlock )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=RULE_SPACE && LA19_0<=RULE_PARENTHESIS_BLOCK)||(LA19_0>=RULE_SYMBOL && LA19_0<=RULE_REGEXP)) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_BRACKET_BLOCK_ALONE||LA19_0==36) ) {
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
                    // InternalRails.g:555:5: this_ExpressionWithOutBracket_0= ruleExpressionWithOutBracket
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
                    // InternalRails.g:567:5: this_BracketBlock_1= ruleBracketBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionAccess().getBracketBlockParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_BracketBlock_1=ruleBracketBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BracketBlock_1);
                          
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleOperationsChain"
    // InternalRails.g:585:1: entryRuleOperationsChain returns [String current=null] : iv_ruleOperationsChain= ruleOperationsChain EOF ;
    public final String entryRuleOperationsChain() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOperationsChain = null;


        try {
            // InternalRails.g:586:2: (iv_ruleOperationsChain= ruleOperationsChain EOF )
            // InternalRails.g:587:2: iv_ruleOperationsChain= ruleOperationsChain EOF
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
    // InternalRails.g:594:1: ruleOperationsChain returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_MethodChainCall_0= ruleMethodChainCall ( (this_ASSIGN_OPERATOR_1= RULE_ASSIGN_OPERATOR | this_OPERATOR_2= RULE_OPERATOR | kw= '=' ) (this_SYMBOL_4= RULE_SYMBOL | this_STRING_5= RULE_STRING | this_BracketBlock_6= ruleBracketBlock | this_ARRAY_BLOCK_7= RULE_ARRAY_BLOCK | this_DECIMAL_8= RULE_DECIMAL | this_INT_9= RULE_INT | this_INT_METHOD_10= RULE_INT_METHOD | this_MethodChainCall_11= ruleMethodChainCall | this_REGEXP_12= RULE_REGEXP ) )* ) ;
    public final AntlrDatatypeRuleToken ruleOperationsChain() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ASSIGN_OPERATOR_1=null;
        Token this_OPERATOR_2=null;
        Token kw=null;
        Token this_SYMBOL_4=null;
        Token this_STRING_5=null;
        Token this_ARRAY_BLOCK_7=null;
        Token this_DECIMAL_8=null;
        Token this_INT_9=null;
        Token this_INT_METHOD_10=null;
        Token this_REGEXP_12=null;
        AntlrDatatypeRuleToken this_MethodChainCall_0 = null;

        AntlrDatatypeRuleToken this_BracketBlock_6 = null;

        AntlrDatatypeRuleToken this_MethodChainCall_11 = null;


         enterRule(); 
            
        try {
            // InternalRails.g:597:28: ( (this_MethodChainCall_0= ruleMethodChainCall ( (this_ASSIGN_OPERATOR_1= RULE_ASSIGN_OPERATOR | this_OPERATOR_2= RULE_OPERATOR | kw= '=' ) (this_SYMBOL_4= RULE_SYMBOL | this_STRING_5= RULE_STRING | this_BracketBlock_6= ruleBracketBlock | this_ARRAY_BLOCK_7= RULE_ARRAY_BLOCK | this_DECIMAL_8= RULE_DECIMAL | this_INT_9= RULE_INT | this_INT_METHOD_10= RULE_INT_METHOD | this_MethodChainCall_11= ruleMethodChainCall | this_REGEXP_12= RULE_REGEXP ) )* ) )
            // InternalRails.g:598:1: (this_MethodChainCall_0= ruleMethodChainCall ( (this_ASSIGN_OPERATOR_1= RULE_ASSIGN_OPERATOR | this_OPERATOR_2= RULE_OPERATOR | kw= '=' ) (this_SYMBOL_4= RULE_SYMBOL | this_STRING_5= RULE_STRING | this_BracketBlock_6= ruleBracketBlock | this_ARRAY_BLOCK_7= RULE_ARRAY_BLOCK | this_DECIMAL_8= RULE_DECIMAL | this_INT_9= RULE_INT | this_INT_METHOD_10= RULE_INT_METHOD | this_MethodChainCall_11= ruleMethodChainCall | this_REGEXP_12= RULE_REGEXP ) )* )
            {
            // InternalRails.g:598:1: (this_MethodChainCall_0= ruleMethodChainCall ( (this_ASSIGN_OPERATOR_1= RULE_ASSIGN_OPERATOR | this_OPERATOR_2= RULE_OPERATOR | kw= '=' ) (this_SYMBOL_4= RULE_SYMBOL | this_STRING_5= RULE_STRING | this_BracketBlock_6= ruleBracketBlock | this_ARRAY_BLOCK_7= RULE_ARRAY_BLOCK | this_DECIMAL_8= RULE_DECIMAL | this_INT_9= RULE_INT | this_INT_METHOD_10= RULE_INT_METHOD | this_MethodChainCall_11= ruleMethodChainCall | this_REGEXP_12= RULE_REGEXP ) )* )
            // InternalRails.g:599:5: this_MethodChainCall_0= ruleMethodChainCall ( (this_ASSIGN_OPERATOR_1= RULE_ASSIGN_OPERATOR | this_OPERATOR_2= RULE_OPERATOR | kw= '=' ) (this_SYMBOL_4= RULE_SYMBOL | this_STRING_5= RULE_STRING | this_BracketBlock_6= ruleBracketBlock | this_ARRAY_BLOCK_7= RULE_ARRAY_BLOCK | this_DECIMAL_8= RULE_DECIMAL | this_INT_9= RULE_INT | this_INT_METHOD_10= RULE_INT_METHOD | this_MethodChainCall_11= ruleMethodChainCall | this_REGEXP_12= RULE_REGEXP ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOperationsChainAccess().getMethodChainCallParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_15);
            this_MethodChainCall_0=ruleMethodChainCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_MethodChainCall_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalRails.g:609:1: ( (this_ASSIGN_OPERATOR_1= RULE_ASSIGN_OPERATOR | this_OPERATOR_2= RULE_OPERATOR | kw= '=' ) (this_SYMBOL_4= RULE_SYMBOL | this_STRING_5= RULE_STRING | this_BracketBlock_6= ruleBracketBlock | this_ARRAY_BLOCK_7= RULE_ARRAY_BLOCK | this_DECIMAL_8= RULE_DECIMAL | this_INT_9= RULE_INT | this_INT_METHOD_10= RULE_INT_METHOD | this_MethodChainCall_11= ruleMethodChainCall | this_REGEXP_12= RULE_REGEXP ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=RULE_ASSIGN_OPERATOR && LA22_0<=RULE_OPERATOR)||LA22_0==32) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalRails.g:609:2: (this_ASSIGN_OPERATOR_1= RULE_ASSIGN_OPERATOR | this_OPERATOR_2= RULE_OPERATOR | kw= '=' ) (this_SYMBOL_4= RULE_SYMBOL | this_STRING_5= RULE_STRING | this_BracketBlock_6= ruleBracketBlock | this_ARRAY_BLOCK_7= RULE_ARRAY_BLOCK | this_DECIMAL_8= RULE_DECIMAL | this_INT_9= RULE_INT | this_INT_METHOD_10= RULE_INT_METHOD | this_MethodChainCall_11= ruleMethodChainCall | this_REGEXP_12= RULE_REGEXP )
            	    {
            	    // InternalRails.g:609:2: (this_ASSIGN_OPERATOR_1= RULE_ASSIGN_OPERATOR | this_OPERATOR_2= RULE_OPERATOR | kw= '=' )
            	    int alt20=3;
            	    switch ( input.LA(1) ) {
            	    case RULE_ASSIGN_OPERATOR:
            	        {
            	        alt20=1;
            	        }
            	        break;
            	    case RULE_OPERATOR:
            	        {
            	        alt20=2;
            	        }
            	        break;
            	    case 32:
            	        {
            	        alt20=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 20, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt20) {
            	        case 1 :
            	            // InternalRails.g:609:7: this_ASSIGN_OPERATOR_1= RULE_ASSIGN_OPERATOR
            	            {
            	            this_ASSIGN_OPERATOR_1=(Token)match(input,RULE_ASSIGN_OPERATOR,FOLLOW_16); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_ASSIGN_OPERATOR_1);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_ASSIGN_OPERATOR_1, grammarAccess.getOperationsChainAccess().getASSIGN_OPERATORTerminalRuleCall_1_0_0()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalRails.g:617:10: this_OPERATOR_2= RULE_OPERATOR
            	            {
            	            this_OPERATOR_2=(Token)match(input,RULE_OPERATOR,FOLLOW_16); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_OPERATOR_2);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_OPERATOR_2, grammarAccess.getOperationsChainAccess().getOPERATORTerminalRuleCall_1_0_1()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // InternalRails.g:626:2: kw= '='
            	            {
            	            kw=(Token)match(input,32,FOLLOW_16); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      current.merge(kw);
            	                      newLeafNode(kw, grammarAccess.getOperationsChainAccess().getEqualsSignKeyword_1_0_2()); 
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // InternalRails.g:631:2: (this_SYMBOL_4= RULE_SYMBOL | this_STRING_5= RULE_STRING | this_BracketBlock_6= ruleBracketBlock | this_ARRAY_BLOCK_7= RULE_ARRAY_BLOCK | this_DECIMAL_8= RULE_DECIMAL | this_INT_9= RULE_INT | this_INT_METHOD_10= RULE_INT_METHOD | this_MethodChainCall_11= ruleMethodChainCall | this_REGEXP_12= RULE_REGEXP )
            	    int alt21=9;
            	    switch ( input.LA(1) ) {
            	    case RULE_SYMBOL:
            	        {
            	        alt21=1;
            	        }
            	        break;
            	    case RULE_STRING:
            	        {
            	        alt21=2;
            	        }
            	        break;
            	    case RULE_BRACKET_BLOCK_ALONE:
            	    case 36:
            	        {
            	        alt21=3;
            	        }
            	        break;
            	    case RULE_ARRAY_BLOCK:
            	        {
            	        alt21=4;
            	        }
            	        break;
            	    case RULE_DECIMAL:
            	        {
            	        alt21=5;
            	        }
            	        break;
            	    case RULE_INT:
            	        {
            	        alt21=6;
            	        }
            	        break;
            	    case RULE_INT_METHOD:
            	        {
            	        alt21=7;
            	        }
            	        break;
            	    case RULE_ID:
            	        {
            	        alt21=8;
            	        }
            	        break;
            	    case RULE_REGEXP:
            	        {
            	        alt21=9;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 21, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt21) {
            	        case 1 :
            	            // InternalRails.g:631:7: this_SYMBOL_4= RULE_SYMBOL
            	            {
            	            this_SYMBOL_4=(Token)match(input,RULE_SYMBOL,FOLLOW_15); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_SYMBOL_4);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_SYMBOL_4, grammarAccess.getOperationsChainAccess().getSYMBOLTerminalRuleCall_1_1_0()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalRails.g:639:10: this_STRING_5= RULE_STRING
            	            {
            	            this_STRING_5=(Token)match(input,RULE_STRING,FOLLOW_15); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_STRING_5);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_STRING_5, grammarAccess.getOperationsChainAccess().getSTRINGTerminalRuleCall_1_1_1()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // InternalRails.g:648:5: this_BracketBlock_6= ruleBracketBlock
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	                      newCompositeNode(grammarAccess.getOperationsChainAccess().getBracketBlockParserRuleCall_1_1_2()); 
            	                  
            	            }
            	            pushFollow(FOLLOW_15);
            	            this_BracketBlock_6=ruleBracketBlock();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_BracketBlock_6);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                      afterParserOrEnumRuleCall();
            	                  
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // InternalRails.g:659:10: this_ARRAY_BLOCK_7= RULE_ARRAY_BLOCK
            	            {
            	            this_ARRAY_BLOCK_7=(Token)match(input,RULE_ARRAY_BLOCK,FOLLOW_15); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_ARRAY_BLOCK_7);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_ARRAY_BLOCK_7, grammarAccess.getOperationsChainAccess().getARRAY_BLOCKTerminalRuleCall_1_1_3()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // InternalRails.g:667:10: this_DECIMAL_8= RULE_DECIMAL
            	            {
            	            this_DECIMAL_8=(Token)match(input,RULE_DECIMAL,FOLLOW_15); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_DECIMAL_8);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_DECIMAL_8, grammarAccess.getOperationsChainAccess().getDECIMALTerminalRuleCall_1_1_4()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 6 :
            	            // InternalRails.g:675:10: this_INT_9= RULE_INT
            	            {
            	            this_INT_9=(Token)match(input,RULE_INT,FOLLOW_15); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_INT_9);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_INT_9, grammarAccess.getOperationsChainAccess().getINTTerminalRuleCall_1_1_5()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 7 :
            	            // InternalRails.g:683:10: this_INT_METHOD_10= RULE_INT_METHOD
            	            {
            	            this_INT_METHOD_10=(Token)match(input,RULE_INT_METHOD,FOLLOW_15); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_INT_METHOD_10);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_INT_METHOD_10, grammarAccess.getOperationsChainAccess().getINT_METHODTerminalRuleCall_1_1_6()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 8 :
            	            // InternalRails.g:692:5: this_MethodChainCall_11= ruleMethodChainCall
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	                      newCompositeNode(grammarAccess.getOperationsChainAccess().getMethodChainCallParserRuleCall_1_1_7()); 
            	                  
            	            }
            	            pushFollow(FOLLOW_15);
            	            this_MethodChainCall_11=ruleMethodChainCall();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_MethodChainCall_11);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                      afterParserOrEnumRuleCall();
            	                  
            	            }

            	            }
            	            break;
            	        case 9 :
            	            // InternalRails.g:703:10: this_REGEXP_12= RULE_REGEXP
            	            {
            	            this_REGEXP_12=(Token)match(input,RULE_REGEXP,FOLLOW_15); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_REGEXP_12);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_REGEXP_12, grammarAccess.getOperationsChainAccess().getREGEXPTerminalRuleCall_1_1_8()); 
            	                  
            	            }

            	            }
            	            break;

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
    // $ANTLR end "ruleOperationsChain"


    // $ANTLR start "entryRuleRelationship"
    // InternalRails.g:718:1: entryRuleRelationship returns [EObject current=null] : iv_ruleRelationship= ruleRelationship EOF ;
    public final EObject entryRuleRelationship() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationship = null;


        try {
            // InternalRails.g:719:2: (iv_ruleRelationship= ruleRelationship EOF )
            // InternalRails.g:720:2: iv_ruleRelationship= ruleRelationship EOF
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
    // InternalRails.g:727:1: ruleRelationship returns [EObject current=null] : (this_HasMany_0= ruleHasMany | this_HasOne_1= ruleHasOne | this_HasAndBelongsToMany_2= ruleHasAndBelongsToMany | this_BelongsTo_3= ruleBelongsTo ) ;
    public final EObject ruleRelationship() throws RecognitionException {
        EObject current = null;

        EObject this_HasMany_0 = null;

        EObject this_HasOne_1 = null;

        EObject this_HasAndBelongsToMany_2 = null;

        EObject this_BelongsTo_3 = null;


         enterRule(); 
            
        try {
            // InternalRails.g:730:28: ( (this_HasMany_0= ruleHasMany | this_HasOne_1= ruleHasOne | this_HasAndBelongsToMany_2= ruleHasAndBelongsToMany | this_BelongsTo_3= ruleBelongsTo ) )
            // InternalRails.g:731:1: (this_HasMany_0= ruleHasMany | this_HasOne_1= ruleHasOne | this_HasAndBelongsToMany_2= ruleHasAndBelongsToMany | this_BelongsTo_3= ruleBelongsTo )
            {
            // InternalRails.g:731:1: (this_HasMany_0= ruleHasMany | this_HasOne_1= ruleHasOne | this_HasAndBelongsToMany_2= ruleHasAndBelongsToMany | this_BelongsTo_3= ruleBelongsTo )
            int alt23=4;
            switch ( input.LA(1) ) {
            case RULE_HAS_MANY_WORD:
                {
                alt23=1;
                }
                break;
            case RULE_HAS_ONE_WORD:
                {
                alt23=2;
                }
                break;
            case RULE_HAS_AND_BELONGS_TO_MANY_WORD:
                {
                alt23=3;
                }
                break;
            case RULE_BELONGS_TO_WORD:
                {
                alt23=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalRails.g:732:5: this_HasMany_0= ruleHasMany
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
                    // InternalRails.g:742:5: this_HasOne_1= ruleHasOne
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
                    // InternalRails.g:752:5: this_HasAndBelongsToMany_2= ruleHasAndBelongsToMany
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
                    // InternalRails.g:762:5: this_BelongsTo_3= ruleBelongsTo
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
    // InternalRails.g:778:1: entryRuleHasMany returns [EObject current=null] : iv_ruleHasMany= ruleHasMany EOF ;
    public final EObject entryRuleHasMany() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHasMany = null;


        try {
            // InternalRails.g:779:2: (iv_ruleHasMany= ruleHasMany EOF )
            // InternalRails.g:780:2: iv_ruleHasMany= ruleHasMany EOF
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
    // InternalRails.g:787:1: ruleHasMany returns [EObject current=null] : (this_HAS_MANY_WORD_0= RULE_HAS_MANY_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )* (this_SL_COMMENT_5= RULE_SL_COMMENT )? ) ;
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
            // InternalRails.g:790:28: ( (this_HAS_MANY_WORD_0= RULE_HAS_MANY_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )* (this_SL_COMMENT_5= RULE_SL_COMMENT )? ) )
            // InternalRails.g:791:1: (this_HAS_MANY_WORD_0= RULE_HAS_MANY_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )* (this_SL_COMMENT_5= RULE_SL_COMMENT )? )
            {
            // InternalRails.g:791:1: (this_HAS_MANY_WORD_0= RULE_HAS_MANY_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )* (this_SL_COMMENT_5= RULE_SL_COMMENT )? )
            // InternalRails.g:791:2: this_HAS_MANY_WORD_0= RULE_HAS_MANY_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )* (this_SL_COMMENT_5= RULE_SL_COMMENT )?
            {
            this_HAS_MANY_WORD_0=(Token)match(input,RULE_HAS_MANY_WORD,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_HAS_MANY_WORD_0, grammarAccess.getHasManyAccess().getHAS_MANY_WORDTerminalRuleCall_0()); 
                  
            }
            // InternalRails.g:795:1: (this_SPACE_1= RULE_SPACE )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_SPACE) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalRails.g:795:2: this_SPACE_1= RULE_SPACE
            	    {
            	    this_SPACE_1=(Token)match(input,RULE_SPACE,FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SPACE_1, grammarAccess.getHasManyAccess().getSPACETerminalRuleCall_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            // InternalRails.g:799:3: ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) )
            // InternalRails.g:800:1: ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) )
            {
            // InternalRails.g:800:1: ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) )
            // InternalRails.g:801:1: (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING )
            {
            // InternalRails.g:801:1: (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_SYMBOL) ) {
                alt25=1;
            }
            else if ( (LA25_0==RULE_STRING) ) {
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
                    // InternalRails.g:802:3: lv_name_2_1= RULE_SYMBOL
                    {
                    lv_name_2_1=(Token)match(input,RULE_SYMBOL,FOLLOW_18); if (state.failed) return current;
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
                    // InternalRails.g:817:8: lv_name_2_2= RULE_STRING
                    {
                    lv_name_2_2=(Token)match(input,RULE_STRING,FOLLOW_18); if (state.failed) return current;
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

            // InternalRails.g:835:2: (this_SPACE_3= RULE_SPACE )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_SPACE) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalRails.g:835:3: this_SPACE_3= RULE_SPACE
            	    {
            	    this_SPACE_3=(Token)match(input,RULE_SPACE,FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SPACE_3, grammarAccess.getHasManyAccess().getSPACETerminalRuleCall_3()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            // InternalRails.g:839:3: ( (lv_options_4_0= ruleHashKeyValue ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_COMMA) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalRails.g:840:1: (lv_options_4_0= ruleHashKeyValue )
            	    {
            	    // InternalRails.g:840:1: (lv_options_4_0= ruleHashKeyValue )
            	    // InternalRails.g:841:3: lv_options_4_0= ruleHashKeyValue
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getHasManyAccess().getOptionsHashKeyValueParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_19);
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
            	    break loop27;
                }
            } while (true);

            // InternalRails.g:857:3: (this_SL_COMMENT_5= RULE_SL_COMMENT )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_SL_COMMENT) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalRails.g:857:4: this_SL_COMMENT_5= RULE_SL_COMMENT
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
    // InternalRails.g:869:1: entryRuleHasOne returns [EObject current=null] : iv_ruleHasOne= ruleHasOne EOF ;
    public final EObject entryRuleHasOne() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHasOne = null;


        try {
            // InternalRails.g:870:2: (iv_ruleHasOne= ruleHasOne EOF )
            // InternalRails.g:871:2: iv_ruleHasOne= ruleHasOne EOF
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
    // InternalRails.g:878:1: ruleHasOne returns [EObject current=null] : (this_HAS_ONE_WORD_0= RULE_HAS_ONE_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )* (this_SL_COMMENT_5= RULE_SL_COMMENT )? ) ;
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
            // InternalRails.g:881:28: ( (this_HAS_ONE_WORD_0= RULE_HAS_ONE_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )* (this_SL_COMMENT_5= RULE_SL_COMMENT )? ) )
            // InternalRails.g:882:1: (this_HAS_ONE_WORD_0= RULE_HAS_ONE_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )* (this_SL_COMMENT_5= RULE_SL_COMMENT )? )
            {
            // InternalRails.g:882:1: (this_HAS_ONE_WORD_0= RULE_HAS_ONE_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )* (this_SL_COMMENT_5= RULE_SL_COMMENT )? )
            // InternalRails.g:882:2: this_HAS_ONE_WORD_0= RULE_HAS_ONE_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )* (this_SL_COMMENT_5= RULE_SL_COMMENT )?
            {
            this_HAS_ONE_WORD_0=(Token)match(input,RULE_HAS_ONE_WORD,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_HAS_ONE_WORD_0, grammarAccess.getHasOneAccess().getHAS_ONE_WORDTerminalRuleCall_0()); 
                  
            }
            // InternalRails.g:886:1: (this_SPACE_1= RULE_SPACE )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_SPACE) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalRails.g:886:2: this_SPACE_1= RULE_SPACE
            	    {
            	    this_SPACE_1=(Token)match(input,RULE_SPACE,FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SPACE_1, grammarAccess.getHasOneAccess().getSPACETerminalRuleCall_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            // InternalRails.g:890:3: ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) )
            // InternalRails.g:891:1: ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) )
            {
            // InternalRails.g:891:1: ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) )
            // InternalRails.g:892:1: (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING )
            {
            // InternalRails.g:892:1: (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_SYMBOL) ) {
                alt30=1;
            }
            else if ( (LA30_0==RULE_STRING) ) {
                alt30=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalRails.g:893:3: lv_name_2_1= RULE_SYMBOL
                    {
                    lv_name_2_1=(Token)match(input,RULE_SYMBOL,FOLLOW_18); if (state.failed) return current;
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
                    // InternalRails.g:908:8: lv_name_2_2= RULE_STRING
                    {
                    lv_name_2_2=(Token)match(input,RULE_STRING,FOLLOW_18); if (state.failed) return current;
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

            // InternalRails.g:926:2: (this_SPACE_3= RULE_SPACE )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_SPACE) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalRails.g:926:3: this_SPACE_3= RULE_SPACE
            	    {
            	    this_SPACE_3=(Token)match(input,RULE_SPACE,FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SPACE_3, grammarAccess.getHasOneAccess().getSPACETerminalRuleCall_3()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            // InternalRails.g:930:3: ( (lv_options_4_0= ruleHashKeyValue ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_COMMA) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalRails.g:931:1: (lv_options_4_0= ruleHashKeyValue )
            	    {
            	    // InternalRails.g:931:1: (lv_options_4_0= ruleHashKeyValue )
            	    // InternalRails.g:932:3: lv_options_4_0= ruleHashKeyValue
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getHasOneAccess().getOptionsHashKeyValueParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_19);
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
            	    break loop32;
                }
            } while (true);

            // InternalRails.g:948:3: (this_SL_COMMENT_5= RULE_SL_COMMENT )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_SL_COMMENT) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalRails.g:948:4: this_SL_COMMENT_5= RULE_SL_COMMENT
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
    // InternalRails.g:960:1: entryRuleHasAndBelongsToMany returns [EObject current=null] : iv_ruleHasAndBelongsToMany= ruleHasAndBelongsToMany EOF ;
    public final EObject entryRuleHasAndBelongsToMany() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHasAndBelongsToMany = null;


        try {
            // InternalRails.g:961:2: (iv_ruleHasAndBelongsToMany= ruleHasAndBelongsToMany EOF )
            // InternalRails.g:962:2: iv_ruleHasAndBelongsToMany= ruleHasAndBelongsToMany EOF
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
    // InternalRails.g:969:1: ruleHasAndBelongsToMany returns [EObject current=null] : (this_HAS_AND_BELONGS_TO_MANY_WORD_0= RULE_HAS_AND_BELONGS_TO_MANY_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )* ) ;
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
            // InternalRails.g:972:28: ( (this_HAS_AND_BELONGS_TO_MANY_WORD_0= RULE_HAS_AND_BELONGS_TO_MANY_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )* ) )
            // InternalRails.g:973:1: (this_HAS_AND_BELONGS_TO_MANY_WORD_0= RULE_HAS_AND_BELONGS_TO_MANY_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )* )
            {
            // InternalRails.g:973:1: (this_HAS_AND_BELONGS_TO_MANY_WORD_0= RULE_HAS_AND_BELONGS_TO_MANY_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )* )
            // InternalRails.g:973:2: this_HAS_AND_BELONGS_TO_MANY_WORD_0= RULE_HAS_AND_BELONGS_TO_MANY_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )*
            {
            this_HAS_AND_BELONGS_TO_MANY_WORD_0=(Token)match(input,RULE_HAS_AND_BELONGS_TO_MANY_WORD,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_HAS_AND_BELONGS_TO_MANY_WORD_0, grammarAccess.getHasAndBelongsToManyAccess().getHAS_AND_BELONGS_TO_MANY_WORDTerminalRuleCall_0()); 
                  
            }
            // InternalRails.g:977:1: (this_SPACE_1= RULE_SPACE )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_SPACE) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalRails.g:977:2: this_SPACE_1= RULE_SPACE
            	    {
            	    this_SPACE_1=(Token)match(input,RULE_SPACE,FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SPACE_1, grammarAccess.getHasAndBelongsToManyAccess().getSPACETerminalRuleCall_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            // InternalRails.g:981:3: ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) )
            // InternalRails.g:982:1: ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) )
            {
            // InternalRails.g:982:1: ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) )
            // InternalRails.g:983:1: (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING )
            {
            // InternalRails.g:983:1: (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_SYMBOL) ) {
                alt35=1;
            }
            else if ( (LA35_0==RULE_STRING) ) {
                alt35=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalRails.g:984:3: lv_name_2_1= RULE_SYMBOL
                    {
                    lv_name_2_1=(Token)match(input,RULE_SYMBOL,FOLLOW_12); if (state.failed) return current;
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
                    // InternalRails.g:999:8: lv_name_2_2= RULE_STRING
                    {
                    lv_name_2_2=(Token)match(input,RULE_STRING,FOLLOW_12); if (state.failed) return current;
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

            // InternalRails.g:1017:2: (this_SPACE_3= RULE_SPACE )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_SPACE) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalRails.g:1017:3: this_SPACE_3= RULE_SPACE
            	    {
            	    this_SPACE_3=(Token)match(input,RULE_SPACE,FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SPACE_3, grammarAccess.getHasAndBelongsToManyAccess().getSPACETerminalRuleCall_3()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            // InternalRails.g:1021:3: ( (lv_options_4_0= ruleHashKeyValue ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_COMMA) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalRails.g:1022:1: (lv_options_4_0= ruleHashKeyValue )
            	    {
            	    // InternalRails.g:1022:1: (lv_options_4_0= ruleHashKeyValue )
            	    // InternalRails.g:1023:3: lv_options_4_0= ruleHashKeyValue
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getHasAndBelongsToManyAccess().getOptionsHashKeyValueParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_20);
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
            	    break loop37;
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
    // InternalRails.g:1047:1: entryRuleBelongsTo returns [EObject current=null] : iv_ruleBelongsTo= ruleBelongsTo EOF ;
    public final EObject entryRuleBelongsTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBelongsTo = null;


        try {
            // InternalRails.g:1048:2: (iv_ruleBelongsTo= ruleBelongsTo EOF )
            // InternalRails.g:1049:2: iv_ruleBelongsTo= ruleBelongsTo EOF
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
    // InternalRails.g:1056:1: ruleBelongsTo returns [EObject current=null] : (this_BELONGS_TO_WORD_0= RULE_BELONGS_TO_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )* ) ;
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
            // InternalRails.g:1059:28: ( (this_BELONGS_TO_WORD_0= RULE_BELONGS_TO_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )* ) )
            // InternalRails.g:1060:1: (this_BELONGS_TO_WORD_0= RULE_BELONGS_TO_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )* )
            {
            // InternalRails.g:1060:1: (this_BELONGS_TO_WORD_0= RULE_BELONGS_TO_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )* )
            // InternalRails.g:1060:2: this_BELONGS_TO_WORD_0= RULE_BELONGS_TO_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )*
            {
            this_BELONGS_TO_WORD_0=(Token)match(input,RULE_BELONGS_TO_WORD,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_BELONGS_TO_WORD_0, grammarAccess.getBelongsToAccess().getBELONGS_TO_WORDTerminalRuleCall_0()); 
                  
            }
            // InternalRails.g:1064:1: (this_SPACE_1= RULE_SPACE )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_SPACE) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalRails.g:1064:2: this_SPACE_1= RULE_SPACE
            	    {
            	    this_SPACE_1=(Token)match(input,RULE_SPACE,FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SPACE_1, grammarAccess.getBelongsToAccess().getSPACETerminalRuleCall_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            // InternalRails.g:1068:3: ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) )
            // InternalRails.g:1069:1: ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) )
            {
            // InternalRails.g:1069:1: ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) )
            // InternalRails.g:1070:1: (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING )
            {
            // InternalRails.g:1070:1: (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_SYMBOL) ) {
                alt39=1;
            }
            else if ( (LA39_0==RULE_STRING) ) {
                alt39=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalRails.g:1071:3: lv_name_2_1= RULE_SYMBOL
                    {
                    lv_name_2_1=(Token)match(input,RULE_SYMBOL,FOLLOW_12); if (state.failed) return current;
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
                    // InternalRails.g:1086:8: lv_name_2_2= RULE_STRING
                    {
                    lv_name_2_2=(Token)match(input,RULE_STRING,FOLLOW_12); if (state.failed) return current;
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

            // InternalRails.g:1104:2: (this_SPACE_3= RULE_SPACE )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==RULE_SPACE) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalRails.g:1104:3: this_SPACE_3= RULE_SPACE
            	    {
            	    this_SPACE_3=(Token)match(input,RULE_SPACE,FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SPACE_3, grammarAccess.getBelongsToAccess().getSPACETerminalRuleCall_3()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            // InternalRails.g:1108:3: ( (lv_options_4_0= ruleHashKeyValue ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_COMMA) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalRails.g:1109:1: (lv_options_4_0= ruleHashKeyValue )
            	    {
            	    // InternalRails.g:1109:1: (lv_options_4_0= ruleHashKeyValue )
            	    // InternalRails.g:1110:3: lv_options_4_0= ruleHashKeyValue
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBelongsToAccess().getOptionsHashKeyValueParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_20);
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
            	    break loop41;
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
    // InternalRails.g:1134:1: entryRuleHashKeyValue returns [EObject current=null] : iv_ruleHashKeyValue= ruleHashKeyValue EOF ;
    public final EObject entryRuleHashKeyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHashKeyValue = null;


        try {
            // InternalRails.g:1135:2: (iv_ruleHashKeyValue= ruleHashKeyValue EOF )
            // InternalRails.g:1136:2: iv_ruleHashKeyValue= ruleHashKeyValue EOF
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
    // InternalRails.g:1143:1: ruleHashKeyValue returns [EObject current=null] : (this_COMMA_0= RULE_COMMA (this_SPACE_1= RULE_SPACE )* ( ( ( (lv_key_2_0= RULE_ID ) ) otherlv_3= ':' ) | ( ( ( (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING ) ) ) (this_SPACE_5= RULE_SPACE )* otherlv_6= '=>' ) ) (this_SPACE_7= RULE_SPACE )* ( ( (lv_value_8_1= RULE_SYMBOL | lv_value_8_2= RULE_STRING | lv_value_8_3= ruleBracketBlock | lv_value_8_4= RULE_ARRAY_BLOCK | lv_value_8_5= RULE_DECIMAL | lv_value_8_6= RULE_INT | lv_value_8_7= RULE_INT_METHOD | lv_value_8_8= ruleMethodChainCall ) ) ) (this_SPACE_9= RULE_SPACE )* ) ;
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
        Token lv_value_8_4=null;
        Token lv_value_8_5=null;
        Token lv_value_8_6=null;
        Token lv_value_8_7=null;
        Token this_SPACE_9=null;
        AntlrDatatypeRuleToken lv_value_8_3 = null;

        AntlrDatatypeRuleToken lv_value_8_8 = null;


         enterRule(); 
            
        try {
            // InternalRails.g:1146:28: ( (this_COMMA_0= RULE_COMMA (this_SPACE_1= RULE_SPACE )* ( ( ( (lv_key_2_0= RULE_ID ) ) otherlv_3= ':' ) | ( ( ( (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING ) ) ) (this_SPACE_5= RULE_SPACE )* otherlv_6= '=>' ) ) (this_SPACE_7= RULE_SPACE )* ( ( (lv_value_8_1= RULE_SYMBOL | lv_value_8_2= RULE_STRING | lv_value_8_3= ruleBracketBlock | lv_value_8_4= RULE_ARRAY_BLOCK | lv_value_8_5= RULE_DECIMAL | lv_value_8_6= RULE_INT | lv_value_8_7= RULE_INT_METHOD | lv_value_8_8= ruleMethodChainCall ) ) ) (this_SPACE_9= RULE_SPACE )* ) )
            // InternalRails.g:1147:1: (this_COMMA_0= RULE_COMMA (this_SPACE_1= RULE_SPACE )* ( ( ( (lv_key_2_0= RULE_ID ) ) otherlv_3= ':' ) | ( ( ( (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING ) ) ) (this_SPACE_5= RULE_SPACE )* otherlv_6= '=>' ) ) (this_SPACE_7= RULE_SPACE )* ( ( (lv_value_8_1= RULE_SYMBOL | lv_value_8_2= RULE_STRING | lv_value_8_3= ruleBracketBlock | lv_value_8_4= RULE_ARRAY_BLOCK | lv_value_8_5= RULE_DECIMAL | lv_value_8_6= RULE_INT | lv_value_8_7= RULE_INT_METHOD | lv_value_8_8= ruleMethodChainCall ) ) ) (this_SPACE_9= RULE_SPACE )* )
            {
            // InternalRails.g:1147:1: (this_COMMA_0= RULE_COMMA (this_SPACE_1= RULE_SPACE )* ( ( ( (lv_key_2_0= RULE_ID ) ) otherlv_3= ':' ) | ( ( ( (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING ) ) ) (this_SPACE_5= RULE_SPACE )* otherlv_6= '=>' ) ) (this_SPACE_7= RULE_SPACE )* ( ( (lv_value_8_1= RULE_SYMBOL | lv_value_8_2= RULE_STRING | lv_value_8_3= ruleBracketBlock | lv_value_8_4= RULE_ARRAY_BLOCK | lv_value_8_5= RULE_DECIMAL | lv_value_8_6= RULE_INT | lv_value_8_7= RULE_INT_METHOD | lv_value_8_8= ruleMethodChainCall ) ) ) (this_SPACE_9= RULE_SPACE )* )
            // InternalRails.g:1147:2: this_COMMA_0= RULE_COMMA (this_SPACE_1= RULE_SPACE )* ( ( ( (lv_key_2_0= RULE_ID ) ) otherlv_3= ':' ) | ( ( ( (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING ) ) ) (this_SPACE_5= RULE_SPACE )* otherlv_6= '=>' ) ) (this_SPACE_7= RULE_SPACE )* ( ( (lv_value_8_1= RULE_SYMBOL | lv_value_8_2= RULE_STRING | lv_value_8_3= ruleBracketBlock | lv_value_8_4= RULE_ARRAY_BLOCK | lv_value_8_5= RULE_DECIMAL | lv_value_8_6= RULE_INT | lv_value_8_7= RULE_INT_METHOD | lv_value_8_8= ruleMethodChainCall ) ) ) (this_SPACE_9= RULE_SPACE )*
            {
            this_COMMA_0=(Token)match(input,RULE_COMMA,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_COMMA_0, grammarAccess.getHashKeyValueAccess().getCOMMATerminalRuleCall_0()); 
                  
            }
            // InternalRails.g:1151:1: (this_SPACE_1= RULE_SPACE )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_SPACE) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalRails.g:1151:2: this_SPACE_1= RULE_SPACE
            	    {
            	    this_SPACE_1=(Token)match(input,RULE_SPACE,FOLLOW_21); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SPACE_1, grammarAccess.getHashKeyValueAccess().getSPACETerminalRuleCall_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            // InternalRails.g:1155:3: ( ( ( (lv_key_2_0= RULE_ID ) ) otherlv_3= ':' ) | ( ( ( (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING ) ) ) (this_SPACE_5= RULE_SPACE )* otherlv_6= '=>' ) )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_ID) ) {
                alt45=1;
            }
            else if ( ((LA45_0>=RULE_SYMBOL && LA45_0<=RULE_STRING)) ) {
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
                    // InternalRails.g:1155:4: ( ( (lv_key_2_0= RULE_ID ) ) otherlv_3= ':' )
                    {
                    // InternalRails.g:1155:4: ( ( (lv_key_2_0= RULE_ID ) ) otherlv_3= ':' )
                    // InternalRails.g:1155:5: ( (lv_key_2_0= RULE_ID ) ) otherlv_3= ':'
                    {
                    // InternalRails.g:1155:5: ( (lv_key_2_0= RULE_ID ) )
                    // InternalRails.g:1156:1: (lv_key_2_0= RULE_ID )
                    {
                    // InternalRails.g:1156:1: (lv_key_2_0= RULE_ID )
                    // InternalRails.g:1157:3: lv_key_2_0= RULE_ID
                    {
                    lv_key_2_0=(Token)match(input,RULE_ID,FOLLOW_22); if (state.failed) return current;
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

                    otherlv_3=(Token)match(input,33,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getHashKeyValueAccess().getColonKeyword_2_0_1());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalRails.g:1178:6: ( ( ( (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING ) ) ) (this_SPACE_5= RULE_SPACE )* otherlv_6= '=>' )
                    {
                    // InternalRails.g:1178:6: ( ( ( (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING ) ) ) (this_SPACE_5= RULE_SPACE )* otherlv_6= '=>' )
                    // InternalRails.g:1178:7: ( ( (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING ) ) ) (this_SPACE_5= RULE_SPACE )* otherlv_6= '=>'
                    {
                    // InternalRails.g:1178:7: ( ( (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING ) ) )
                    // InternalRails.g:1179:1: ( (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING ) )
                    {
                    // InternalRails.g:1179:1: ( (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING ) )
                    // InternalRails.g:1180:1: (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING )
                    {
                    // InternalRails.g:1180:1: (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING )
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==RULE_SYMBOL) ) {
                        alt43=1;
                    }
                    else if ( (LA43_0==RULE_STRING) ) {
                        alt43=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 43, 0, input);

                        throw nvae;
                    }
                    switch (alt43) {
                        case 1 :
                            // InternalRails.g:1181:3: lv_key_4_1= RULE_SYMBOL
                            {
                            lv_key_4_1=(Token)match(input,RULE_SYMBOL,FOLLOW_24); if (state.failed) return current;
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
                            // InternalRails.g:1196:8: lv_key_4_2= RULE_STRING
                            {
                            lv_key_4_2=(Token)match(input,RULE_STRING,FOLLOW_24); if (state.failed) return current;
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

                    // InternalRails.g:1214:2: (this_SPACE_5= RULE_SPACE )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==RULE_SPACE) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // InternalRails.g:1214:3: this_SPACE_5= RULE_SPACE
                    	    {
                    	    this_SPACE_5=(Token)match(input,RULE_SPACE,FOLLOW_24); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_SPACE_5, grammarAccess.getHashKeyValueAccess().getSPACETerminalRuleCall_2_1_1()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,34,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getHashKeyValueAccess().getEqualsSignGreaterThanSignKeyword_2_1_2());
                          
                    }

                    }


                    }
                    break;

            }

            // InternalRails.g:1222:3: (this_SPACE_7= RULE_SPACE )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==RULE_SPACE) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalRails.g:1222:4: this_SPACE_7= RULE_SPACE
            	    {
            	    this_SPACE_7=(Token)match(input,RULE_SPACE,FOLLOW_23); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SPACE_7, grammarAccess.getHashKeyValueAccess().getSPACETerminalRuleCall_3()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            // InternalRails.g:1226:3: ( ( (lv_value_8_1= RULE_SYMBOL | lv_value_8_2= RULE_STRING | lv_value_8_3= ruleBracketBlock | lv_value_8_4= RULE_ARRAY_BLOCK | lv_value_8_5= RULE_DECIMAL | lv_value_8_6= RULE_INT | lv_value_8_7= RULE_INT_METHOD | lv_value_8_8= ruleMethodChainCall ) ) )
            // InternalRails.g:1227:1: ( (lv_value_8_1= RULE_SYMBOL | lv_value_8_2= RULE_STRING | lv_value_8_3= ruleBracketBlock | lv_value_8_4= RULE_ARRAY_BLOCK | lv_value_8_5= RULE_DECIMAL | lv_value_8_6= RULE_INT | lv_value_8_7= RULE_INT_METHOD | lv_value_8_8= ruleMethodChainCall ) )
            {
            // InternalRails.g:1227:1: ( (lv_value_8_1= RULE_SYMBOL | lv_value_8_2= RULE_STRING | lv_value_8_3= ruleBracketBlock | lv_value_8_4= RULE_ARRAY_BLOCK | lv_value_8_5= RULE_DECIMAL | lv_value_8_6= RULE_INT | lv_value_8_7= RULE_INT_METHOD | lv_value_8_8= ruleMethodChainCall ) )
            // InternalRails.g:1228:1: (lv_value_8_1= RULE_SYMBOL | lv_value_8_2= RULE_STRING | lv_value_8_3= ruleBracketBlock | lv_value_8_4= RULE_ARRAY_BLOCK | lv_value_8_5= RULE_DECIMAL | lv_value_8_6= RULE_INT | lv_value_8_7= RULE_INT_METHOD | lv_value_8_8= ruleMethodChainCall )
            {
            // InternalRails.g:1228:1: (lv_value_8_1= RULE_SYMBOL | lv_value_8_2= RULE_STRING | lv_value_8_3= ruleBracketBlock | lv_value_8_4= RULE_ARRAY_BLOCK | lv_value_8_5= RULE_DECIMAL | lv_value_8_6= RULE_INT | lv_value_8_7= RULE_INT_METHOD | lv_value_8_8= ruleMethodChainCall )
            int alt47=8;
            switch ( input.LA(1) ) {
            case RULE_SYMBOL:
                {
                alt47=1;
                }
                break;
            case RULE_STRING:
                {
                alt47=2;
                }
                break;
            case RULE_BRACKET_BLOCK_ALONE:
            case 36:
                {
                alt47=3;
                }
                break;
            case RULE_ARRAY_BLOCK:
                {
                alt47=4;
                }
                break;
            case RULE_DECIMAL:
                {
                alt47=5;
                }
                break;
            case RULE_INT:
                {
                alt47=6;
                }
                break;
            case RULE_INT_METHOD:
                {
                alt47=7;
                }
                break;
            case RULE_ID:
                {
                alt47=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // InternalRails.g:1229:3: lv_value_8_1= RULE_SYMBOL
                    {
                    lv_value_8_1=(Token)match(input,RULE_SYMBOL,FOLLOW_25); if (state.failed) return current;
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
                    // InternalRails.g:1244:8: lv_value_8_2= RULE_STRING
                    {
                    lv_value_8_2=(Token)match(input,RULE_STRING,FOLLOW_25); if (state.failed) return current;
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
                    // InternalRails.g:1259:8: lv_value_8_3= ruleBracketBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getHashKeyValueAccess().getValueBracketBlockParserRuleCall_4_0_2()); 
                      	    
                    }
                    pushFollow(FOLLOW_25);
                    lv_value_8_3=ruleBracketBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getHashKeyValueRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_8_3, 
                              		"co.gruposaberes.model.Rails.BracketBlock");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 4 :
                    // InternalRails.g:1274:8: lv_value_8_4= RULE_ARRAY_BLOCK
                    {
                    lv_value_8_4=(Token)match(input,RULE_ARRAY_BLOCK,FOLLOW_25); if (state.failed) return current;
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
                    // InternalRails.g:1289:8: lv_value_8_5= RULE_DECIMAL
                    {
                    lv_value_8_5=(Token)match(input,RULE_DECIMAL,FOLLOW_25); if (state.failed) return current;
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
                    // InternalRails.g:1304:8: lv_value_8_6= RULE_INT
                    {
                    lv_value_8_6=(Token)match(input,RULE_INT,FOLLOW_25); if (state.failed) return current;
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
                    // InternalRails.g:1319:8: lv_value_8_7= RULE_INT_METHOD
                    {
                    lv_value_8_7=(Token)match(input,RULE_INT_METHOD,FOLLOW_25); if (state.failed) return current;
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
                    // InternalRails.g:1334:8: lv_value_8_8= ruleMethodChainCall
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getHashKeyValueAccess().getValueMethodChainCallParserRuleCall_4_0_7()); 
                      	    
                    }
                    pushFollow(FOLLOW_25);
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

            // InternalRails.g:1352:2: (this_SPACE_9= RULE_SPACE )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==RULE_SPACE) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalRails.g:1352:3: this_SPACE_9= RULE_SPACE
            	    {
            	    this_SPACE_9=(Token)match(input,RULE_SPACE,FOLLOW_25); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SPACE_9, grammarAccess.getHashKeyValueAccess().getSPACETerminalRuleCall_5()); 
            	          
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
    // $ANTLR end "ruleHashKeyValue"


    // $ANTLR start "entryRuleIgnoredHashKeyValue"
    // InternalRails.g:1364:1: entryRuleIgnoredHashKeyValue returns [String current=null] : iv_ruleIgnoredHashKeyValue= ruleIgnoredHashKeyValue EOF ;
    public final String entryRuleIgnoredHashKeyValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIgnoredHashKeyValue = null;


        try {
            // InternalRails.g:1365:2: (iv_ruleIgnoredHashKeyValue= ruleIgnoredHashKeyValue EOF )
            // InternalRails.g:1366:2: iv_ruleIgnoredHashKeyValue= ruleIgnoredHashKeyValue EOF
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
    // InternalRails.g:1373:1: ruleIgnoredHashKeyValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_SPACE_0= RULE_SPACE )* ( (this_ID_1= RULE_ID kw= ':' ) | ( (this_SYMBOL_3= RULE_SYMBOL | this_STRING_4= RULE_STRING ) (this_SPACE_5= RULE_SPACE )* kw= '=>' ) ) (this_SPACE_7= RULE_SPACE )* (this_SYMBOL_8= RULE_SYMBOL | this_STRING_9= RULE_STRING | this_BracketBlock_10= ruleBracketBlock | this_ARRAY_BLOCK_11= RULE_ARRAY_BLOCK | this_DECIMAL_12= RULE_DECIMAL | this_INT_13= RULE_INT | this_INT_METHOD_14= RULE_INT_METHOD | this_MethodChainCall_15= ruleMethodChainCall | this_REGEXP_16= RULE_REGEXP ) (this_SPACE_17= RULE_SPACE )* ) ;
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
        Token this_ARRAY_BLOCK_11=null;
        Token this_DECIMAL_12=null;
        Token this_INT_13=null;
        Token this_INT_METHOD_14=null;
        Token this_REGEXP_16=null;
        Token this_SPACE_17=null;
        AntlrDatatypeRuleToken this_BracketBlock_10 = null;

        AntlrDatatypeRuleToken this_MethodChainCall_15 = null;


         enterRule(); 
            
        try {
            // InternalRails.g:1376:28: ( ( (this_SPACE_0= RULE_SPACE )* ( (this_ID_1= RULE_ID kw= ':' ) | ( (this_SYMBOL_3= RULE_SYMBOL | this_STRING_4= RULE_STRING ) (this_SPACE_5= RULE_SPACE )* kw= '=>' ) ) (this_SPACE_7= RULE_SPACE )* (this_SYMBOL_8= RULE_SYMBOL | this_STRING_9= RULE_STRING | this_BracketBlock_10= ruleBracketBlock | this_ARRAY_BLOCK_11= RULE_ARRAY_BLOCK | this_DECIMAL_12= RULE_DECIMAL | this_INT_13= RULE_INT | this_INT_METHOD_14= RULE_INT_METHOD | this_MethodChainCall_15= ruleMethodChainCall | this_REGEXP_16= RULE_REGEXP ) (this_SPACE_17= RULE_SPACE )* ) )
            // InternalRails.g:1377:1: ( (this_SPACE_0= RULE_SPACE )* ( (this_ID_1= RULE_ID kw= ':' ) | ( (this_SYMBOL_3= RULE_SYMBOL | this_STRING_4= RULE_STRING ) (this_SPACE_5= RULE_SPACE )* kw= '=>' ) ) (this_SPACE_7= RULE_SPACE )* (this_SYMBOL_8= RULE_SYMBOL | this_STRING_9= RULE_STRING | this_BracketBlock_10= ruleBracketBlock | this_ARRAY_BLOCK_11= RULE_ARRAY_BLOCK | this_DECIMAL_12= RULE_DECIMAL | this_INT_13= RULE_INT | this_INT_METHOD_14= RULE_INT_METHOD | this_MethodChainCall_15= ruleMethodChainCall | this_REGEXP_16= RULE_REGEXP ) (this_SPACE_17= RULE_SPACE )* )
            {
            // InternalRails.g:1377:1: ( (this_SPACE_0= RULE_SPACE )* ( (this_ID_1= RULE_ID kw= ':' ) | ( (this_SYMBOL_3= RULE_SYMBOL | this_STRING_4= RULE_STRING ) (this_SPACE_5= RULE_SPACE )* kw= '=>' ) ) (this_SPACE_7= RULE_SPACE )* (this_SYMBOL_8= RULE_SYMBOL | this_STRING_9= RULE_STRING | this_BracketBlock_10= ruleBracketBlock | this_ARRAY_BLOCK_11= RULE_ARRAY_BLOCK | this_DECIMAL_12= RULE_DECIMAL | this_INT_13= RULE_INT | this_INT_METHOD_14= RULE_INT_METHOD | this_MethodChainCall_15= ruleMethodChainCall | this_REGEXP_16= RULE_REGEXP ) (this_SPACE_17= RULE_SPACE )* )
            // InternalRails.g:1377:2: (this_SPACE_0= RULE_SPACE )* ( (this_ID_1= RULE_ID kw= ':' ) | ( (this_SYMBOL_3= RULE_SYMBOL | this_STRING_4= RULE_STRING ) (this_SPACE_5= RULE_SPACE )* kw= '=>' ) ) (this_SPACE_7= RULE_SPACE )* (this_SYMBOL_8= RULE_SYMBOL | this_STRING_9= RULE_STRING | this_BracketBlock_10= ruleBracketBlock | this_ARRAY_BLOCK_11= RULE_ARRAY_BLOCK | this_DECIMAL_12= RULE_DECIMAL | this_INT_13= RULE_INT | this_INT_METHOD_14= RULE_INT_METHOD | this_MethodChainCall_15= ruleMethodChainCall | this_REGEXP_16= RULE_REGEXP ) (this_SPACE_17= RULE_SPACE )*
            {
            // InternalRails.g:1377:2: (this_SPACE_0= RULE_SPACE )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==RULE_SPACE) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalRails.g:1377:7: this_SPACE_0= RULE_SPACE
            	    {
            	    this_SPACE_0=(Token)match(input,RULE_SPACE,FOLLOW_21); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_SPACE_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SPACE_0, grammarAccess.getIgnoredHashKeyValueAccess().getSPACETerminalRuleCall_0()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

            // InternalRails.g:1384:3: ( (this_ID_1= RULE_ID kw= ':' ) | ( (this_SYMBOL_3= RULE_SYMBOL | this_STRING_4= RULE_STRING ) (this_SPACE_5= RULE_SPACE )* kw= '=>' ) )
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
                    // InternalRails.g:1384:4: (this_ID_1= RULE_ID kw= ':' )
                    {
                    // InternalRails.g:1384:4: (this_ID_1= RULE_ID kw= ':' )
                    // InternalRails.g:1384:9: this_ID_1= RULE_ID kw= ':'
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_1, grammarAccess.getIgnoredHashKeyValueAccess().getIDTerminalRuleCall_1_0_0()); 
                          
                    }
                    kw=(Token)match(input,33,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIgnoredHashKeyValueAccess().getColonKeyword_1_0_1()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalRails.g:1398:6: ( (this_SYMBOL_3= RULE_SYMBOL | this_STRING_4= RULE_STRING ) (this_SPACE_5= RULE_SPACE )* kw= '=>' )
                    {
                    // InternalRails.g:1398:6: ( (this_SYMBOL_3= RULE_SYMBOL | this_STRING_4= RULE_STRING ) (this_SPACE_5= RULE_SPACE )* kw= '=>' )
                    // InternalRails.g:1398:7: (this_SYMBOL_3= RULE_SYMBOL | this_STRING_4= RULE_STRING ) (this_SPACE_5= RULE_SPACE )* kw= '=>'
                    {
                    // InternalRails.g:1398:7: (this_SYMBOL_3= RULE_SYMBOL | this_STRING_4= RULE_STRING )
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
                            // InternalRails.g:1398:12: this_SYMBOL_3= RULE_SYMBOL
                            {
                            this_SYMBOL_3=(Token)match(input,RULE_SYMBOL,FOLLOW_24); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_SYMBOL_3);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_SYMBOL_3, grammarAccess.getIgnoredHashKeyValueAccess().getSYMBOLTerminalRuleCall_1_1_0_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // InternalRails.g:1406:10: this_STRING_4= RULE_STRING
                            {
                            this_STRING_4=(Token)match(input,RULE_STRING,FOLLOW_24); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_STRING_4);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_STRING_4, grammarAccess.getIgnoredHashKeyValueAccess().getSTRINGTerminalRuleCall_1_1_0_1()); 
                                  
                            }

                            }
                            break;

                    }

                    // InternalRails.g:1413:2: (this_SPACE_5= RULE_SPACE )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==RULE_SPACE) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // InternalRails.g:1413:7: this_SPACE_5= RULE_SPACE
                    	    {
                    	    this_SPACE_5=(Token)match(input,RULE_SPACE,FOLLOW_24); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		current.merge(this_SPACE_5);
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_SPACE_5, grammarAccess.getIgnoredHashKeyValueAccess().getSPACETerminalRuleCall_1_1_1()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop51;
                        }
                    } while (true);

                    kw=(Token)match(input,34,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIgnoredHashKeyValueAccess().getEqualsSignGreaterThanSignKeyword_1_1_2()); 
                          
                    }

                    }


                    }
                    break;

            }

            // InternalRails.g:1426:3: (this_SPACE_7= RULE_SPACE )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==RULE_SPACE) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalRails.g:1426:8: this_SPACE_7= RULE_SPACE
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
            	    break loop53;
                }
            } while (true);

            // InternalRails.g:1433:3: (this_SYMBOL_8= RULE_SYMBOL | this_STRING_9= RULE_STRING | this_BracketBlock_10= ruleBracketBlock | this_ARRAY_BLOCK_11= RULE_ARRAY_BLOCK | this_DECIMAL_12= RULE_DECIMAL | this_INT_13= RULE_INT | this_INT_METHOD_14= RULE_INT_METHOD | this_MethodChainCall_15= ruleMethodChainCall | this_REGEXP_16= RULE_REGEXP )
            int alt54=9;
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
            case RULE_BRACKET_BLOCK_ALONE:
            case 36:
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
                {
                alt54=8;
                }
                break;
            case RULE_REGEXP:
                {
                alt54=9;
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
                    // InternalRails.g:1433:8: this_SYMBOL_8= RULE_SYMBOL
                    {
                    this_SYMBOL_8=(Token)match(input,RULE_SYMBOL,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_SYMBOL_8);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SYMBOL_8, grammarAccess.getIgnoredHashKeyValueAccess().getSYMBOLTerminalRuleCall_3_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalRails.g:1441:10: this_STRING_9= RULE_STRING
                    {
                    this_STRING_9=(Token)match(input,RULE_STRING,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_9);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_9, grammarAccess.getIgnoredHashKeyValueAccess().getSTRINGTerminalRuleCall_3_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalRails.g:1450:5: this_BracketBlock_10= ruleBracketBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIgnoredHashKeyValueAccess().getBracketBlockParserRuleCall_3_2()); 
                          
                    }
                    pushFollow(FOLLOW_25);
                    this_BracketBlock_10=ruleBracketBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BracketBlock_10);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // InternalRails.g:1461:10: this_ARRAY_BLOCK_11= RULE_ARRAY_BLOCK
                    {
                    this_ARRAY_BLOCK_11=(Token)match(input,RULE_ARRAY_BLOCK,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ARRAY_BLOCK_11);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ARRAY_BLOCK_11, grammarAccess.getIgnoredHashKeyValueAccess().getARRAY_BLOCKTerminalRuleCall_3_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // InternalRails.g:1469:10: this_DECIMAL_12= RULE_DECIMAL
                    {
                    this_DECIMAL_12=(Token)match(input,RULE_DECIMAL,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_DECIMAL_12);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_DECIMAL_12, grammarAccess.getIgnoredHashKeyValueAccess().getDECIMALTerminalRuleCall_3_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // InternalRails.g:1477:10: this_INT_13= RULE_INT
                    {
                    this_INT_13=(Token)match(input,RULE_INT,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_13);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_13, grammarAccess.getIgnoredHashKeyValueAccess().getINTTerminalRuleCall_3_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // InternalRails.g:1485:10: this_INT_METHOD_14= RULE_INT_METHOD
                    {
                    this_INT_METHOD_14=(Token)match(input,RULE_INT_METHOD,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_METHOD_14);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_METHOD_14, grammarAccess.getIgnoredHashKeyValueAccess().getINT_METHODTerminalRuleCall_3_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // InternalRails.g:1494:5: this_MethodChainCall_15= ruleMethodChainCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIgnoredHashKeyValueAccess().getMethodChainCallParserRuleCall_3_7()); 
                          
                    }
                    pushFollow(FOLLOW_25);
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
                    // InternalRails.g:1505:10: this_REGEXP_16= RULE_REGEXP
                    {
                    this_REGEXP_16=(Token)match(input,RULE_REGEXP,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_REGEXP_16);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_REGEXP_16, grammarAccess.getIgnoredHashKeyValueAccess().getREGEXPTerminalRuleCall_3_8()); 
                          
                    }

                    }
                    break;

            }

            // InternalRails.g:1512:2: (this_SPACE_17= RULE_SPACE )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==RULE_SPACE) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalRails.g:1512:7: this_SPACE_17= RULE_SPACE
            	    {
            	    this_SPACE_17=(Token)match(input,RULE_SPACE,FOLLOW_25); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_SPACE_17);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SPACE_17, grammarAccess.getIgnoredHashKeyValueAccess().getSPACETerminalRuleCall_4()); 
            	          
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
    // $ANTLR end "ruleIgnoredHashKeyValue"


    // $ANTLR start "entryRuleMethod"
    // InternalRails.g:1527:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // InternalRails.g:1528:2: (iv_ruleMethod= ruleMethod EOF )
            // InternalRails.g:1529:2: iv_ruleMethod= ruleMethod EOF
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
    // InternalRails.g:1536:1: ruleMethod returns [EObject current=null] : (this_DEF_WORD_0= RULE_DEF_WORD (this_SPACE_1= RULE_SPACE )* ( (lv_name_2_0= ruleMethodName ) ) (this_SPACE_3= RULE_SPACE )* (this_PARENTHESIS_BLOCK_4= RULE_PARENTHESIS_BLOCK )? ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        Token this_DEF_WORD_0=null;
        Token this_SPACE_1=null;
        Token this_SPACE_3=null;
        Token this_PARENTHESIS_BLOCK_4=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // InternalRails.g:1539:28: ( (this_DEF_WORD_0= RULE_DEF_WORD (this_SPACE_1= RULE_SPACE )* ( (lv_name_2_0= ruleMethodName ) ) (this_SPACE_3= RULE_SPACE )* (this_PARENTHESIS_BLOCK_4= RULE_PARENTHESIS_BLOCK )? ) )
            // InternalRails.g:1540:1: (this_DEF_WORD_0= RULE_DEF_WORD (this_SPACE_1= RULE_SPACE )* ( (lv_name_2_0= ruleMethodName ) ) (this_SPACE_3= RULE_SPACE )* (this_PARENTHESIS_BLOCK_4= RULE_PARENTHESIS_BLOCK )? )
            {
            // InternalRails.g:1540:1: (this_DEF_WORD_0= RULE_DEF_WORD (this_SPACE_1= RULE_SPACE )* ( (lv_name_2_0= ruleMethodName ) ) (this_SPACE_3= RULE_SPACE )* (this_PARENTHESIS_BLOCK_4= RULE_PARENTHESIS_BLOCK )? )
            // InternalRails.g:1540:2: this_DEF_WORD_0= RULE_DEF_WORD (this_SPACE_1= RULE_SPACE )* ( (lv_name_2_0= ruleMethodName ) ) (this_SPACE_3= RULE_SPACE )* (this_PARENTHESIS_BLOCK_4= RULE_PARENTHESIS_BLOCK )?
            {
            this_DEF_WORD_0=(Token)match(input,RULE_DEF_WORD,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_DEF_WORD_0, grammarAccess.getMethodAccess().getDEF_WORDTerminalRuleCall_0()); 
                  
            }
            // InternalRails.g:1544:1: (this_SPACE_1= RULE_SPACE )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==RULE_SPACE) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalRails.g:1544:2: this_SPACE_1= RULE_SPACE
            	    {
            	    this_SPACE_1=(Token)match(input,RULE_SPACE,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SPACE_1, grammarAccess.getMethodAccess().getSPACETerminalRuleCall_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

            // InternalRails.g:1548:3: ( (lv_name_2_0= ruleMethodName ) )
            // InternalRails.g:1549:1: (lv_name_2_0= ruleMethodName )
            {
            // InternalRails.g:1549:1: (lv_name_2_0= ruleMethodName )
            // InternalRails.g:1550:3: lv_name_2_0= ruleMethodName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMethodAccess().getNameMethodNameParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_26);
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

            // InternalRails.g:1566:2: (this_SPACE_3= RULE_SPACE )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==RULE_SPACE) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalRails.g:1566:3: this_SPACE_3= RULE_SPACE
            	    {
            	    this_SPACE_3=(Token)match(input,RULE_SPACE,FOLLOW_26); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SPACE_3, grammarAccess.getMethodAccess().getSPACETerminalRuleCall_3()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

            // InternalRails.g:1570:3: (this_PARENTHESIS_BLOCK_4= RULE_PARENTHESIS_BLOCK )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_PARENTHESIS_BLOCK) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalRails.g:1570:4: this_PARENTHESIS_BLOCK_4= RULE_PARENTHESIS_BLOCK
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
    // InternalRails.g:1582:1: entryRuleMethodName returns [String current=null] : iv_ruleMethodName= ruleMethodName EOF ;
    public final String entryRuleMethodName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMethodName = null;


        try {
            // InternalRails.g:1583:2: (iv_ruleMethodName= ruleMethodName EOF )
            // InternalRails.g:1584:2: iv_ruleMethodName= ruleMethodName EOF
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
    // InternalRails.g:1591:1: ruleMethodName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '?' | kw= '=' )? ) ;
    public final AntlrDatatypeRuleToken ruleMethodName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // InternalRails.g:1594:28: ( (this_ID_0= RULE_ID (kw= '?' | kw= '=' )? ) )
            // InternalRails.g:1595:1: (this_ID_0= RULE_ID (kw= '?' | kw= '=' )? )
            {
            // InternalRails.g:1595:1: (this_ID_0= RULE_ID (kw= '?' | kw= '=' )? )
            // InternalRails.g:1595:6: this_ID_0= RULE_ID (kw= '?' | kw= '=' )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getMethodNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // InternalRails.g:1602:1: (kw= '?' | kw= '=' )?
            int alt59=3;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==35) ) {
                alt59=1;
            }
            else if ( (LA59_0==32) ) {
                alt59=2;
            }
            switch (alt59) {
                case 1 :
                    // InternalRails.g:1603:2: kw= '?'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getMethodNameAccess().getQuestionMarkKeyword_1_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalRails.g:1610:2: kw= '='
                    {
                    kw=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getMethodNameAccess().getEqualsSignKeyword_1_1()); 
                          
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


    // $ANTLR start "entryRuleBracketBlock"
    // InternalRails.g:1623:1: entryRuleBracketBlock returns [String current=null] : iv_ruleBracketBlock= ruleBracketBlock EOF ;
    public final String entryRuleBracketBlock() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBracketBlock = null;


        try {
            // InternalRails.g:1624:2: (iv_ruleBracketBlock= ruleBracketBlock EOF )
            // InternalRails.g:1625:2: iv_ruleBracketBlock= ruleBracketBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBracketBlockRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBracketBlock=ruleBracketBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBracketBlock.getText(); 
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
    // $ANTLR end "entryRuleBracketBlock"


    // $ANTLR start "ruleBracketBlock"
    // InternalRails.g:1632:1: ruleBracketBlock returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_BRACKET_BLOCK_ALONE_0= RULE_BRACKET_BLOCK_ALONE | (kw= '{' (this_ExpressionsSeparatedByCommas_2= ruleExpressionsSeparatedByCommas )* kw= '}' ) ) ;
    public final AntlrDatatypeRuleToken ruleBracketBlock() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_BRACKET_BLOCK_ALONE_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_ExpressionsSeparatedByCommas_2 = null;


         enterRule(); 
            
        try {
            // InternalRails.g:1635:28: ( (this_BRACKET_BLOCK_ALONE_0= RULE_BRACKET_BLOCK_ALONE | (kw= '{' (this_ExpressionsSeparatedByCommas_2= ruleExpressionsSeparatedByCommas )* kw= '}' ) ) )
            // InternalRails.g:1636:1: (this_BRACKET_BLOCK_ALONE_0= RULE_BRACKET_BLOCK_ALONE | (kw= '{' (this_ExpressionsSeparatedByCommas_2= ruleExpressionsSeparatedByCommas )* kw= '}' ) )
            {
            // InternalRails.g:1636:1: (this_BRACKET_BLOCK_ALONE_0= RULE_BRACKET_BLOCK_ALONE | (kw= '{' (this_ExpressionsSeparatedByCommas_2= ruleExpressionsSeparatedByCommas )* kw= '}' ) )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_BRACKET_BLOCK_ALONE) ) {
                alt61=1;
            }
            else if ( (LA61_0==36) ) {
                alt61=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // InternalRails.g:1636:6: this_BRACKET_BLOCK_ALONE_0= RULE_BRACKET_BLOCK_ALONE
                    {
                    this_BRACKET_BLOCK_ALONE_0=(Token)match(input,RULE_BRACKET_BLOCK_ALONE,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BRACKET_BLOCK_ALONE_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BRACKET_BLOCK_ALONE_0, grammarAccess.getBracketBlockAccess().getBRACKET_BLOCK_ALONETerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalRails.g:1644:6: (kw= '{' (this_ExpressionsSeparatedByCommas_2= ruleExpressionsSeparatedByCommas )* kw= '}' )
                    {
                    // InternalRails.g:1644:6: (kw= '{' (this_ExpressionsSeparatedByCommas_2= ruleExpressionsSeparatedByCommas )* kw= '}' )
                    // InternalRails.g:1645:2: kw= '{' (this_ExpressionsSeparatedByCommas_2= ruleExpressionsSeparatedByCommas )* kw= '}'
                    {
                    kw=(Token)match(input,36,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBracketBlockAccess().getLeftCurlyBracketKeyword_1_0()); 
                          
                    }
                    // InternalRails.g:1650:1: (this_ExpressionsSeparatedByCommas_2= ruleExpressionsSeparatedByCommas )*
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( ((LA60_0>=RULE_SPACE && LA60_0<=RULE_PARENTHESIS_BLOCK)||(LA60_0>=RULE_SYMBOL && LA60_0<=RULE_REGEXP)) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // InternalRails.g:1651:5: this_ExpressionsSeparatedByCommas_2= ruleExpressionsSeparatedByCommas
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              newCompositeNode(grammarAccess.getBracketBlockAccess().getExpressionsSeparatedByCommasParserRuleCall_1_1()); 
                    	          
                    	    }
                    	    pushFollow(FOLLOW_28);
                    	    this_ExpressionsSeparatedByCommas_2=ruleExpressionsSeparatedByCommas();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		current.merge(this_ExpressionsSeparatedByCommas_2);
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              afterParserOrEnumRuleCall();
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop60;
                        }
                    } while (true);

                    kw=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBracketBlockAccess().getRightCurlyBracketKeyword_1_2()); 
                          
                    }

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
    // $ANTLR end "ruleBracketBlock"

    // $ANTLR start synpred1_InternalRails
    public final void synpred1_InternalRails_fragment() throws RecognitionException {   
        // InternalRails.g:311:4: ( RULE_SPACE )
        // InternalRails.g:311:6: RULE_SPACE
        {
        match(input,RULE_SPACE,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalRails

    // Delegated rules

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


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA18 dfa18 = new DFA18(this);
    static final String dfa_1s = "\4\uffff";
    static final String dfa_2s = "\2\3\2\uffff";
    static final String dfa_3s = "\2\5\2\uffff";
    static final String dfa_4s = "\2\35\2\uffff";
    static final String dfa_5s = "\2\uffff\1\1\1\2";
    static final String dfa_6s = "\4\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\3\13\uffff\1\3\1\uffff\4\3\5\uffff\1\2",
            "\1\1\1\3\13\uffff\1\3\1\uffff\4\3\5\uffff\1\2",
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
    static final String dfa_8s = "\30\uffff";
    static final String dfa_9s = "\1\12\27\uffff";
    static final String dfa_10s = "\1\5\27\uffff";
    static final String dfa_11s = "\1\45\27\uffff";
    static final String dfa_12s = "\1\uffff\11\1\1\2\15\uffff";
    static final String dfa_13s = "\30\uffff}>";
    static final String[] dfa_14s = {
            "\1\11\1\10\1\1\1\12\1\2\1\3\1\4\1\5\1\6\1\7\2\12\1\uffff\7\12\7\uffff\1\12\3\uffff\2\12",
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

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "300:3: (this_MethodCallParameters_4= ruleMethodCallParameters )?";
        }
    }
    static final String dfa_15s = "\17\uffff";
    static final String dfa_16s = "\1\uffff\1\13\1\15\5\uffff\1\16\1\uffff\1\13\1\uffff\1\15\2\uffff";
    static final String dfa_17s = "\3\5\5\uffff\1\5\1\uffff\1\5\1\uffff\1\5\2\uffff";
    static final String dfa_18s = "\1\16\2\45\5\uffff\1\45\1\uffff\1\45\1\uffff\1\45\2\uffff";
    static final String dfa_19s = "\3\uffff\1\3\1\4\1\5\1\6\1\7\1\uffff\1\11\1\uffff\1\1\1\uffff\1\2\1\10";
    static final String dfa_20s = "\17\uffff}>";
    static final String[] dfa_21s = {
            "\1\11\1\10\1\4\1\uffff\1\1\1\2\1\3\1\5\1\6\1\7",
            "\1\12\13\13\1\uffff\7\13\7\uffff\1\13\1\uffff\1\11\1\uffff\2\13",
            "\1\14\13\15\1\uffff\7\15\7\uffff\1\15\1\uffff\1\11\1\uffff\2\15",
            "",
            "",
            "",
            "",
            "",
            "\14\16\1\uffff\7\16\5\uffff\3\16\1\11\2\uffff\2\16",
            "",
            "\1\12\13\13\1\uffff\7\13\7\uffff\1\13\1\uffff\1\11\1\uffff\2\13",
            "",
            "\1\14\13\15\1\uffff\7\15\7\uffff\1\15\1\uffff\1\11\1\uffff\2\15",
            "",
            ""
    };

    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final char[] dfa_18 = DFA.unpackEncodedStringToUnsignedChars(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final short[][] dfa_21 = unpackEncodedStringArray(dfa_21s);

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = dfa_15;
            this.eof = dfa_16;
            this.min = dfa_17;
            this.max = dfa_18;
            this.accept = dfa_19;
            this.special = dfa_20;
            this.transition = dfa_21;
        }
        public String getDescription() {
            return "454:1: (this_SYMBOL_0= RULE_SYMBOL | this_STRING_1= RULE_STRING | this_ARRAY_BLOCK_2= RULE_ARRAY_BLOCK | this_PARENTHESIS_BLOCK_3= RULE_PARENTHESIS_BLOCK | this_DECIMAL_4= RULE_DECIMAL | this_INT_5= RULE_INT | this_REGEXP_6= RULE_REGEXP | this_MethodChainCall_7= ruleMethodChainCall | this_IgnoredHashKeyValue_8= ruleIgnoredHashKeyValue )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000020F40062L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000020000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000F40062L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000001081F47EE2L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000001001F47EE2L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000001001000022L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000122L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000001001F47EE0L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000100018002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000001001F67E60L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000620L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000080122L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000080102L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000660L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001001F63E60L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000400000020L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000000000000A2L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000900000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000002000F47EE0L});

}