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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_CLASS_WORD", "RULE_SPACE", "RULE_SET_TABLE_NAME", "RULE_STRING", "RULE_ID", "RULE_SYMBOL", "RULE_INT", "RULE_INT_METHOD", "RULE_PARENTHESIS_BLOCK", "RULE_ARRAY_BLOCK", "RULE_BRACKET_BLOCK", "RULE_DO_BLOCK_PARAMETERS", "RULE_LF", "RULE_COMMA", "RULE_DECIMAL", "RULE_REGEXP", "RULE_HAS_MANY_WORD", "RULE_HAS_ONE_WORD", "RULE_HAS_AND_BELONGS_TO_MANY_WORD", "RULE_BELONGS_TO_WORD", "RULE_DEF_WORD", "RULE_NOT_BRACKET_SEQ", "RULE_FIRST_LEVEL_BRACKET_BLOCK", "RULE_SECOND_LEVEL_BRACKET_BLOCK", "RULE_THIRD_LEVEL_BRACKET_BLOCK", "RULE_NOT_ARRAY_SEQ", "RULE_FIRST_LEVEL_ARRAY_BLOCK", "RULE_SECOND_LEVEL_ARRAY_BLOCK", "RULE_THIRD_LEVEL_ARRAY_BLOCK", "RULE_NOT_PARENTHESIS_SEQ", "RULE_FIRST_LEVEL_PARENTHESIS_BLOCK", "RULE_SECOND_LEVEL_PARENTHESIS_BLOCK", "RULE_THIRD_LEVEL_PARENTHESIS_BLOCK", "RULE_MODULE_WORD", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_CR", "RULE_REQUIRE", "RULE_ANY_OTHER", "'<'", "'::'", "'.'", "':'", "'=>'", "'?'", "'='", "': '", "'<='", "'+'", "'-'", "'*'", "'/'", "'%'", "'**'", "'~'", "'|'", "'||'", "'&'", "'&&'", "'=='", "'!'", "'<<'", "'<=>'", "'>'", "'..'", "'...'"
    };
    public static final int RULE_FIRST_LEVEL_ARRAY_BLOCK=30;
    public static final int T__50=50;
    public static final int RULE_HAS_MANY_WORD=20;
    public static final int RULE_DO_BLOCK_PARAMETERS=15;
    public static final int RULE_LF=16;
    public static final int RULE_PARENTHESIS_BLOCK=12;
    public static final int RULE_HAS_ONE_WORD=21;
    public static final int RULE_CR=40;
    public static final int RULE_THIRD_LEVEL_PARENTHESIS_BLOCK=36;
    public static final int RULE_NOT_ARRAY_SEQ=29;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int RULE_NOT_BRACKET_SEQ=25;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int RULE_SPACE=5;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=8;
    public static final int RULE_COMMA=17;
    public static final int RULE_DECIMAL=18;
    public static final int RULE_SET_TABLE_NAME=6;
    public static final int RULE_THIRD_LEVEL_ARRAY_BLOCK=32;
    public static final int RULE_MODULE_WORD=37;
    public static final int RULE_SECOND_LEVEL_BRACKET_BLOCK=27;
    public static final int RULE_INT=10;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=38;
    public static final int T__67=67;
    public static final int RULE_DEF_WORD=24;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int RULE_REQUIRE=41;
    public static final int RULE_CLASS_WORD=4;
    public static final int RULE_STRING=7;
    public static final int RULE_FIRST_LEVEL_BRACKET_BLOCK=26;
    public static final int RULE_NOT_PARENTHESIS_SEQ=33;
    public static final int RULE_SL_COMMENT=39;
    public static final int RULE_SECOND_LEVEL_PARENTHESIS_BLOCK=35;
    public static final int RULE_THIRD_LEVEL_BRACKET_BLOCK=28;
    public static final int RULE_HAS_AND_BELONGS_TO_MANY_WORD=22;
    public static final int RULE_REGEXP=19;
    public static final int EOF=-1;
    public static final int RULE_ARRAY_BLOCK=13;
    public static final int RULE_SECOND_LEVEL_ARRAY_BLOCK=31;
    public static final int RULE_ANY_OTHER=42;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_BRACKET_BLOCK=14;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_SYMBOL=9;
    public static final int RULE_FIRST_LEVEL_PARENTHESIS_BLOCK=34;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int RULE_INT_METHOD=11;
    public static final int RULE_BELONGS_TO_WORD=23;
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

                    otherlv_4=(Token)match(input,43,FOLLOW_3); if (state.failed) return current;
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

                if ( ((LA6_0>=RULE_SET_TABLE_NAME && LA6_0<=RULE_ARRAY_BLOCK)||(LA6_0>=RULE_HAS_MANY_WORD && LA6_0<=RULE_DEF_WORD)) ) {
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
    // InternalRails.g:175:1: ruleClassElement returns [EObject current=null] : ( ( ( RULE_DEF_WORD | RULE_HAS_MANY_WORD | RULE_HAS_ONE_WORD | RULE_HAS_AND_BELONGS_TO_MANY_WORD | RULE_BELONGS_TO_WORD | RULE_SET_TABLE_NAME )=> (this_Method_0= ruleMethod | ( ( RULE_HAS_MANY_WORD | RULE_HAS_ONE_WORD | RULE_HAS_AND_BELONGS_TO_MANY_WORD | RULE_BELONGS_TO_WORD )=>this_Relationship_1= ruleRelationship ) | this_TableName_2= ruleTableName ) ) | this_OperationsChain_3= ruleOperationsChain ) ;
    public final EObject ruleClassElement() throws RecognitionException {
        EObject current = null;

        EObject this_Method_0 = null;

        EObject this_Relationship_1 = null;

        EObject this_TableName_2 = null;

        EObject this_OperationsChain_3 = null;


         enterRule(); 
            
        try {
            // InternalRails.g:178:28: ( ( ( ( RULE_DEF_WORD | RULE_HAS_MANY_WORD | RULE_HAS_ONE_WORD | RULE_HAS_AND_BELONGS_TO_MANY_WORD | RULE_BELONGS_TO_WORD | RULE_SET_TABLE_NAME )=> (this_Method_0= ruleMethod | ( ( RULE_HAS_MANY_WORD | RULE_HAS_ONE_WORD | RULE_HAS_AND_BELONGS_TO_MANY_WORD | RULE_BELONGS_TO_WORD )=>this_Relationship_1= ruleRelationship ) | this_TableName_2= ruleTableName ) ) | this_OperationsChain_3= ruleOperationsChain ) )
            // InternalRails.g:179:1: ( ( ( RULE_DEF_WORD | RULE_HAS_MANY_WORD | RULE_HAS_ONE_WORD | RULE_HAS_AND_BELONGS_TO_MANY_WORD | RULE_BELONGS_TO_WORD | RULE_SET_TABLE_NAME )=> (this_Method_0= ruleMethod | ( ( RULE_HAS_MANY_WORD | RULE_HAS_ONE_WORD | RULE_HAS_AND_BELONGS_TO_MANY_WORD | RULE_BELONGS_TO_WORD )=>this_Relationship_1= ruleRelationship ) | this_TableName_2= ruleTableName ) ) | this_OperationsChain_3= ruleOperationsChain )
            {
            // InternalRails.g:179:1: ( ( ( RULE_DEF_WORD | RULE_HAS_MANY_WORD | RULE_HAS_ONE_WORD | RULE_HAS_AND_BELONGS_TO_MANY_WORD | RULE_BELONGS_TO_WORD | RULE_SET_TABLE_NAME )=> (this_Method_0= ruleMethod | ( ( RULE_HAS_MANY_WORD | RULE_HAS_ONE_WORD | RULE_HAS_AND_BELONGS_TO_MANY_WORD | RULE_BELONGS_TO_WORD )=>this_Relationship_1= ruleRelationship ) | this_TableName_2= ruleTableName ) ) | this_OperationsChain_3= ruleOperationsChain )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_DEF_WORD) && (synpred1_InternalRails())) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_HAS_MANY_WORD) && (synpred1_InternalRails())) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_HAS_ONE_WORD) && (synpred1_InternalRails())) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_HAS_AND_BELONGS_TO_MANY_WORD) && (synpred1_InternalRails())) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_BELONGS_TO_WORD) && (synpred1_InternalRails())) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_SET_TABLE_NAME) && (synpred1_InternalRails())) {
                alt8=1;
            }
            else if ( ((LA8_0>=RULE_STRING && LA8_0<=RULE_ARRAY_BLOCK)) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalRails.g:179:2: ( ( RULE_DEF_WORD | RULE_HAS_MANY_WORD | RULE_HAS_ONE_WORD | RULE_HAS_AND_BELONGS_TO_MANY_WORD | RULE_BELONGS_TO_WORD | RULE_SET_TABLE_NAME )=> (this_Method_0= ruleMethod | ( ( RULE_HAS_MANY_WORD | RULE_HAS_ONE_WORD | RULE_HAS_AND_BELONGS_TO_MANY_WORD | RULE_BELONGS_TO_WORD )=>this_Relationship_1= ruleRelationship ) | this_TableName_2= ruleTableName ) )
                    {
                    // InternalRails.g:179:2: ( ( RULE_DEF_WORD | RULE_HAS_MANY_WORD | RULE_HAS_ONE_WORD | RULE_HAS_AND_BELONGS_TO_MANY_WORD | RULE_BELONGS_TO_WORD | RULE_SET_TABLE_NAME )=> (this_Method_0= ruleMethod | ( ( RULE_HAS_MANY_WORD | RULE_HAS_ONE_WORD | RULE_HAS_AND_BELONGS_TO_MANY_WORD | RULE_BELONGS_TO_WORD )=>this_Relationship_1= ruleRelationship ) | this_TableName_2= ruleTableName ) )
                    // InternalRails.g:179:3: ( RULE_DEF_WORD | RULE_HAS_MANY_WORD | RULE_HAS_ONE_WORD | RULE_HAS_AND_BELONGS_TO_MANY_WORD | RULE_BELONGS_TO_WORD | RULE_SET_TABLE_NAME )=> (this_Method_0= ruleMethod | ( ( RULE_HAS_MANY_WORD | RULE_HAS_ONE_WORD | RULE_HAS_AND_BELONGS_TO_MANY_WORD | RULE_BELONGS_TO_WORD )=>this_Relationship_1= ruleRelationship ) | this_TableName_2= ruleTableName )
                    {
                    // InternalRails.g:179:148: (this_Method_0= ruleMethod | ( ( RULE_HAS_MANY_WORD | RULE_HAS_ONE_WORD | RULE_HAS_AND_BELONGS_TO_MANY_WORD | RULE_BELONGS_TO_WORD )=>this_Relationship_1= ruleRelationship ) | this_TableName_2= ruleTableName )
                    int alt7=3;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==RULE_DEF_WORD) ) {
                        alt7=1;
                    }
                    else if ( (LA7_0==RULE_HAS_MANY_WORD) && (synpred2_InternalRails())) {
                        alt7=2;
                    }
                    else if ( (LA7_0==RULE_HAS_ONE_WORD) && (synpred2_InternalRails())) {
                        alt7=2;
                    }
                    else if ( (LA7_0==RULE_HAS_AND_BELONGS_TO_MANY_WORD) && (synpred2_InternalRails())) {
                        alt7=2;
                    }
                    else if ( (LA7_0==RULE_BELONGS_TO_WORD) && (synpred2_InternalRails())) {
                        alt7=2;
                    }
                    else if ( (LA7_0==RULE_SET_TABLE_NAME) ) {
                        alt7=3;
                    }
                    else {
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
                               
                                      newCompositeNode(grammarAccess.getClassElementAccess().getMethodParserRuleCall_0_0_0()); 
                                  
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
                            // InternalRails.g:189:6: ( ( RULE_HAS_MANY_WORD | RULE_HAS_ONE_WORD | RULE_HAS_AND_BELONGS_TO_MANY_WORD | RULE_BELONGS_TO_WORD )=>this_Relationship_1= ruleRelationship )
                            {
                            // InternalRails.g:189:6: ( ( RULE_HAS_MANY_WORD | RULE_HAS_ONE_WORD | RULE_HAS_AND_BELONGS_TO_MANY_WORD | RULE_BELONGS_TO_WORD )=>this_Relationship_1= ruleRelationship )
                            // InternalRails.g:189:7: ( RULE_HAS_MANY_WORD | RULE_HAS_ONE_WORD | RULE_HAS_AND_BELONGS_TO_MANY_WORD | RULE_BELONGS_TO_WORD )=>this_Relationship_1= ruleRelationship
                            {
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getClassElementAccess().getRelationshipParserRuleCall_0_0_1()); 
                                  
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


                            }
                            break;
                        case 3 :
                            // InternalRails.g:200:5: this_TableName_2= ruleTableName
                            {
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getClassElementAccess().getTableNameParserRuleCall_0_0_2()); 
                                  
                            }
                            pushFollow(FOLLOW_2);
                            this_TableName_2=ruleTableName();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                      current = this_TableName_2; 
                                      afterParserOrEnumRuleCall();
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRails.g:210:5: this_OperationsChain_3= ruleOperationsChain
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getClassElementAccess().getOperationsChainParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_OperationsChain_3=ruleOperationsChain();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_OperationsChain_3; 
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


    // $ANTLR start "entryRuleTableName"
    // InternalRails.g:226:1: entryRuleTableName returns [EObject current=null] : iv_ruleTableName= ruleTableName EOF ;
    public final EObject entryRuleTableName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableName = null;


        try {
            // InternalRails.g:227:2: (iv_ruleTableName= ruleTableName EOF )
            // InternalRails.g:228:2: iv_ruleTableName= ruleTableName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTableNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTableName=ruleTableName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTableName; 
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
    // $ANTLR end "entryRuleTableName"


    // $ANTLR start "ruleTableName"
    // InternalRails.g:235:1: ruleTableName returns [EObject current=null] : (this_SET_TABLE_NAME_0= RULE_SET_TABLE_NAME ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleTableName() throws RecognitionException {
        EObject current = null;

        Token this_SET_TABLE_NAME_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // InternalRails.g:238:28: ( (this_SET_TABLE_NAME_0= RULE_SET_TABLE_NAME ( (lv_name_1_0= RULE_STRING ) ) ) )
            // InternalRails.g:239:1: (this_SET_TABLE_NAME_0= RULE_SET_TABLE_NAME ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // InternalRails.g:239:1: (this_SET_TABLE_NAME_0= RULE_SET_TABLE_NAME ( (lv_name_1_0= RULE_STRING ) ) )
            // InternalRails.g:239:2: this_SET_TABLE_NAME_0= RULE_SET_TABLE_NAME ( (lv_name_1_0= RULE_STRING ) )
            {
            this_SET_TABLE_NAME_0=(Token)match(input,RULE_SET_TABLE_NAME,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_SET_TABLE_NAME_0, grammarAccess.getTableNameAccess().getSET_TABLE_NAMETerminalRuleCall_0()); 
                  
            }
            // InternalRails.g:243:1: ( (lv_name_1_0= RULE_STRING ) )
            // InternalRails.g:244:1: (lv_name_1_0= RULE_STRING )
            {
            // InternalRails.g:244:1: (lv_name_1_0= RULE_STRING )
            // InternalRails.g:245:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getTableNameAccess().getNameSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getTableNameRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"co.gruposaberes.model.Rails.STRING");
              	    
            }

            }


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
    // $ANTLR end "ruleTableName"


    // $ANTLR start "entryRuleNamespacedModuleName"
    // InternalRails.g:271:1: entryRuleNamespacedModuleName returns [String current=null] : iv_ruleNamespacedModuleName= ruleNamespacedModuleName EOF ;
    public final String entryRuleNamespacedModuleName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNamespacedModuleName = null;


        try {
            // InternalRails.g:272:2: (iv_ruleNamespacedModuleName= ruleNamespacedModuleName EOF )
            // InternalRails.g:273:2: iv_ruleNamespacedModuleName= ruleNamespacedModuleName EOF
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
    // InternalRails.g:280:1: ruleNamespacedModuleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID kw= '::' )* this_ID_2= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleNamespacedModuleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // InternalRails.g:283:28: ( ( (this_ID_0= RULE_ID kw= '::' )* this_ID_2= RULE_ID ) )
            // InternalRails.g:284:1: ( (this_ID_0= RULE_ID kw= '::' )* this_ID_2= RULE_ID )
            {
            // InternalRails.g:284:1: ( (this_ID_0= RULE_ID kw= '::' )* this_ID_2= RULE_ID )
            // InternalRails.g:284:2: (this_ID_0= RULE_ID kw= '::' )* this_ID_2= RULE_ID
            {
            // InternalRails.g:284:2: (this_ID_0= RULE_ID kw= '::' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1==44) ) {
                        alt9=1;
                    }


                }


                switch (alt9) {
            	case 1 :
            	    // InternalRails.g:284:7: this_ID_0= RULE_ID kw= '::'
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_0, grammarAccess.getNamespacedModuleNameAccess().getIDTerminalRuleCall_0_0()); 
            	          
            	    }
            	    kw=(Token)match(input,44,FOLLOW_9); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getNamespacedModuleNameAccess().getColonColonKeyword_0_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalRails.g:312:1: entryRuleMethodChainCall returns [String current=null] : iv_ruleMethodChainCall= ruleMethodChainCall EOF ;
    public final String entryRuleMethodChainCall() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMethodChainCall = null;


        try {
            // InternalRails.g:313:2: (iv_ruleMethodChainCall= ruleMethodChainCall EOF )
            // InternalRails.g:314:2: iv_ruleMethodChainCall= ruleMethodChainCall EOF
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
    // InternalRails.g:321:1: ruleMethodChainCall returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_SYMBOL_0= RULE_SYMBOL | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT | this_INT_METHOD_3= RULE_INT_METHOD | this_PARENTHESIS_BLOCK_4= RULE_PARENTHESIS_BLOCK | this_ARRAY_BLOCK_5= RULE_ARRAY_BLOCK | this_NamespacedModuleName_6= ruleNamespacedModuleName ) (kw= '.' this_ID_8= RULE_ID (this_PARENTHESIS_BLOCK_9= RULE_PARENTHESIS_BLOCK )? )* (this_SPACE_10= RULE_SPACE )* (this_MethodCallParameters_11= ruleMethodCallParameters )? ( ( RULE_SPACE )=>this_SPACE_12= RULE_SPACE )* (this_BRACKET_BLOCK_13= RULE_BRACKET_BLOCK )? ( ( RULE_SPACE )=>this_SPACE_14= RULE_SPACE )* (this_DO_BLOCK_PARAMETERS_15= RULE_DO_BLOCK_PARAMETERS )? ( ( RULE_SPACE )=>this_SPACE_16= RULE_SPACE )* ( ( RULE_LF )=>this_LF_17= RULE_LF )? ) ;
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
        Token this_LF_17=null;
        AntlrDatatypeRuleToken this_NamespacedModuleName_6 = null;

        AntlrDatatypeRuleToken this_MethodCallParameters_11 = null;


         enterRule(); 
            
        try {
            // InternalRails.g:324:28: ( ( (this_SYMBOL_0= RULE_SYMBOL | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT | this_INT_METHOD_3= RULE_INT_METHOD | this_PARENTHESIS_BLOCK_4= RULE_PARENTHESIS_BLOCK | this_ARRAY_BLOCK_5= RULE_ARRAY_BLOCK | this_NamespacedModuleName_6= ruleNamespacedModuleName ) (kw= '.' this_ID_8= RULE_ID (this_PARENTHESIS_BLOCK_9= RULE_PARENTHESIS_BLOCK )? )* (this_SPACE_10= RULE_SPACE )* (this_MethodCallParameters_11= ruleMethodCallParameters )? ( ( RULE_SPACE )=>this_SPACE_12= RULE_SPACE )* (this_BRACKET_BLOCK_13= RULE_BRACKET_BLOCK )? ( ( RULE_SPACE )=>this_SPACE_14= RULE_SPACE )* (this_DO_BLOCK_PARAMETERS_15= RULE_DO_BLOCK_PARAMETERS )? ( ( RULE_SPACE )=>this_SPACE_16= RULE_SPACE )* ( ( RULE_LF )=>this_LF_17= RULE_LF )? ) )
            // InternalRails.g:325:1: ( (this_SYMBOL_0= RULE_SYMBOL | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT | this_INT_METHOD_3= RULE_INT_METHOD | this_PARENTHESIS_BLOCK_4= RULE_PARENTHESIS_BLOCK | this_ARRAY_BLOCK_5= RULE_ARRAY_BLOCK | this_NamespacedModuleName_6= ruleNamespacedModuleName ) (kw= '.' this_ID_8= RULE_ID (this_PARENTHESIS_BLOCK_9= RULE_PARENTHESIS_BLOCK )? )* (this_SPACE_10= RULE_SPACE )* (this_MethodCallParameters_11= ruleMethodCallParameters )? ( ( RULE_SPACE )=>this_SPACE_12= RULE_SPACE )* (this_BRACKET_BLOCK_13= RULE_BRACKET_BLOCK )? ( ( RULE_SPACE )=>this_SPACE_14= RULE_SPACE )* (this_DO_BLOCK_PARAMETERS_15= RULE_DO_BLOCK_PARAMETERS )? ( ( RULE_SPACE )=>this_SPACE_16= RULE_SPACE )* ( ( RULE_LF )=>this_LF_17= RULE_LF )? )
            {
            // InternalRails.g:325:1: ( (this_SYMBOL_0= RULE_SYMBOL | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT | this_INT_METHOD_3= RULE_INT_METHOD | this_PARENTHESIS_BLOCK_4= RULE_PARENTHESIS_BLOCK | this_ARRAY_BLOCK_5= RULE_ARRAY_BLOCK | this_NamespacedModuleName_6= ruleNamespacedModuleName ) (kw= '.' this_ID_8= RULE_ID (this_PARENTHESIS_BLOCK_9= RULE_PARENTHESIS_BLOCK )? )* (this_SPACE_10= RULE_SPACE )* (this_MethodCallParameters_11= ruleMethodCallParameters )? ( ( RULE_SPACE )=>this_SPACE_12= RULE_SPACE )* (this_BRACKET_BLOCK_13= RULE_BRACKET_BLOCK )? ( ( RULE_SPACE )=>this_SPACE_14= RULE_SPACE )* (this_DO_BLOCK_PARAMETERS_15= RULE_DO_BLOCK_PARAMETERS )? ( ( RULE_SPACE )=>this_SPACE_16= RULE_SPACE )* ( ( RULE_LF )=>this_LF_17= RULE_LF )? )
            // InternalRails.g:325:2: (this_SYMBOL_0= RULE_SYMBOL | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT | this_INT_METHOD_3= RULE_INT_METHOD | this_PARENTHESIS_BLOCK_4= RULE_PARENTHESIS_BLOCK | this_ARRAY_BLOCK_5= RULE_ARRAY_BLOCK | this_NamespacedModuleName_6= ruleNamespacedModuleName ) (kw= '.' this_ID_8= RULE_ID (this_PARENTHESIS_BLOCK_9= RULE_PARENTHESIS_BLOCK )? )* (this_SPACE_10= RULE_SPACE )* (this_MethodCallParameters_11= ruleMethodCallParameters )? ( ( RULE_SPACE )=>this_SPACE_12= RULE_SPACE )* (this_BRACKET_BLOCK_13= RULE_BRACKET_BLOCK )? ( ( RULE_SPACE )=>this_SPACE_14= RULE_SPACE )* (this_DO_BLOCK_PARAMETERS_15= RULE_DO_BLOCK_PARAMETERS )? ( ( RULE_SPACE )=>this_SPACE_16= RULE_SPACE )* ( ( RULE_LF )=>this_LF_17= RULE_LF )?
            {
            // InternalRails.g:325:2: (this_SYMBOL_0= RULE_SYMBOL | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT | this_INT_METHOD_3= RULE_INT_METHOD | this_PARENTHESIS_BLOCK_4= RULE_PARENTHESIS_BLOCK | this_ARRAY_BLOCK_5= RULE_ARRAY_BLOCK | this_NamespacedModuleName_6= ruleNamespacedModuleName )
            int alt10=7;
            switch ( input.LA(1) ) {
            case RULE_SYMBOL:
                {
                alt10=1;
                }
                break;
            case RULE_STRING:
                {
                alt10=2;
                }
                break;
            case RULE_INT:
                {
                alt10=3;
                }
                break;
            case RULE_INT_METHOD:
                {
                alt10=4;
                }
                break;
            case RULE_PARENTHESIS_BLOCK:
                {
                alt10=5;
                }
                break;
            case RULE_ARRAY_BLOCK:
                {
                alt10=6;
                }
                break;
            case RULE_ID:
                {
                alt10=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalRails.g:325:7: this_SYMBOL_0= RULE_SYMBOL
                    {
                    this_SYMBOL_0=(Token)match(input,RULE_SYMBOL,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_SYMBOL_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SYMBOL_0, grammarAccess.getMethodChainCallAccess().getSYMBOLTerminalRuleCall_0_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalRails.g:333:10: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_1, grammarAccess.getMethodChainCallAccess().getSTRINGTerminalRuleCall_0_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalRails.g:341:10: this_INT_2= RULE_INT
                    {
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_2, grammarAccess.getMethodChainCallAccess().getINTTerminalRuleCall_0_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // InternalRails.g:349:10: this_INT_METHOD_3= RULE_INT_METHOD
                    {
                    this_INT_METHOD_3=(Token)match(input,RULE_INT_METHOD,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_METHOD_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_METHOD_3, grammarAccess.getMethodChainCallAccess().getINT_METHODTerminalRuleCall_0_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // InternalRails.g:357:10: this_PARENTHESIS_BLOCK_4= RULE_PARENTHESIS_BLOCK
                    {
                    this_PARENTHESIS_BLOCK_4=(Token)match(input,RULE_PARENTHESIS_BLOCK,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_PARENTHESIS_BLOCK_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PARENTHESIS_BLOCK_4, grammarAccess.getMethodChainCallAccess().getPARENTHESIS_BLOCKTerminalRuleCall_0_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // InternalRails.g:365:10: this_ARRAY_BLOCK_5= RULE_ARRAY_BLOCK
                    {
                    this_ARRAY_BLOCK_5=(Token)match(input,RULE_ARRAY_BLOCK,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ARRAY_BLOCK_5);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ARRAY_BLOCK_5, grammarAccess.getMethodChainCallAccess().getARRAY_BLOCKTerminalRuleCall_0_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // InternalRails.g:374:5: this_NamespacedModuleName_6= ruleNamespacedModuleName
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMethodChainCallAccess().getNamespacedModuleNameParserRuleCall_0_6()); 
                          
                    }
                    pushFollow(FOLLOW_10);
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

            // InternalRails.g:384:2: (kw= '.' this_ID_8= RULE_ID (this_PARENTHESIS_BLOCK_9= RULE_PARENTHESIS_BLOCK )? )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==45) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalRails.g:385:2: kw= '.' this_ID_8= RULE_ID (this_PARENTHESIS_BLOCK_9= RULE_PARENTHESIS_BLOCK )?
            	    {
            	    kw=(Token)match(input,45,FOLLOW_9); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getMethodChainCallAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_8=(Token)match(input,RULE_ID,FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_8);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_8, grammarAccess.getMethodChainCallAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }
            	    // InternalRails.g:397:1: (this_PARENTHESIS_BLOCK_9= RULE_PARENTHESIS_BLOCK )?
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==RULE_PARENTHESIS_BLOCK) ) {
            	        alt11=1;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // InternalRails.g:397:6: this_PARENTHESIS_BLOCK_9= RULE_PARENTHESIS_BLOCK
            	            {
            	            this_PARENTHESIS_BLOCK_9=(Token)match(input,RULE_PARENTHESIS_BLOCK,FOLLOW_10); if (state.failed) return current;
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
            	    break loop12;
                }
            } while (true);

            // InternalRails.g:404:5: (this_SPACE_10= RULE_SPACE )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_SPACE) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalRails.g:404:10: this_SPACE_10= RULE_SPACE
            	    {
            	    this_SPACE_10=(Token)match(input,RULE_SPACE,FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_SPACE_10);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SPACE_10, grammarAccess.getMethodChainCallAccess().getSPACETerminalRuleCall_2()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // InternalRails.g:411:3: (this_MethodCallParameters_11= ruleMethodCallParameters )?
            int alt14=2;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // InternalRails.g:412:5: this_MethodCallParameters_11= ruleMethodCallParameters
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMethodChainCallAccess().getMethodCallParametersParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_12);
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

            // InternalRails.g:422:3: ( ( RULE_SPACE )=>this_SPACE_12= RULE_SPACE )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_SPACE) ) {
                    int LA15_2 = input.LA(2);

                    if ( (synpred3_InternalRails()) ) {
                        alt15=1;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // InternalRails.g:422:4: ( RULE_SPACE )=>this_SPACE_12= RULE_SPACE
            	    {
            	    this_SPACE_12=(Token)match(input,RULE_SPACE,FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_SPACE_12);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SPACE_12, grammarAccess.getMethodChainCallAccess().getSPACETerminalRuleCall_4()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // InternalRails.g:429:3: (this_BRACKET_BLOCK_13= RULE_BRACKET_BLOCK )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_BRACKET_BLOCK) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalRails.g:429:8: this_BRACKET_BLOCK_13= RULE_BRACKET_BLOCK
                    {
                    this_BRACKET_BLOCK_13=(Token)match(input,RULE_BRACKET_BLOCK,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BRACKET_BLOCK_13);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BRACKET_BLOCK_13, grammarAccess.getMethodChainCallAccess().getBRACKET_BLOCKTerminalRuleCall_5()); 
                          
                    }

                    }
                    break;

            }

            // InternalRails.g:436:3: ( ( RULE_SPACE )=>this_SPACE_14= RULE_SPACE )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_SPACE) ) {
                    int LA17_2 = input.LA(2);

                    if ( (synpred4_InternalRails()) ) {
                        alt17=1;
                    }


                }


                switch (alt17) {
            	case 1 :
            	    // InternalRails.g:436:4: ( RULE_SPACE )=>this_SPACE_14= RULE_SPACE
            	    {
            	    this_SPACE_14=(Token)match(input,RULE_SPACE,FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_SPACE_14);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SPACE_14, grammarAccess.getMethodChainCallAccess().getSPACETerminalRuleCall_6()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            // InternalRails.g:443:3: (this_DO_BLOCK_PARAMETERS_15= RULE_DO_BLOCK_PARAMETERS )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_DO_BLOCK_PARAMETERS) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalRails.g:443:8: this_DO_BLOCK_PARAMETERS_15= RULE_DO_BLOCK_PARAMETERS
                    {
                    this_DO_BLOCK_PARAMETERS_15=(Token)match(input,RULE_DO_BLOCK_PARAMETERS,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_DO_BLOCK_PARAMETERS_15);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_DO_BLOCK_PARAMETERS_15, grammarAccess.getMethodChainCallAccess().getDO_BLOCK_PARAMETERSTerminalRuleCall_7()); 
                          
                    }

                    }
                    break;

            }

            // InternalRails.g:450:3: ( ( RULE_SPACE )=>this_SPACE_16= RULE_SPACE )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_SPACE) ) {
                    int LA19_2 = input.LA(2);

                    if ( (synpred5_InternalRails()) ) {
                        alt19=1;
                    }


                }


                switch (alt19) {
            	case 1 :
            	    // InternalRails.g:450:4: ( RULE_SPACE )=>this_SPACE_16= RULE_SPACE
            	    {
            	    this_SPACE_16=(Token)match(input,RULE_SPACE,FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_SPACE_16);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SPACE_16, grammarAccess.getMethodChainCallAccess().getSPACETerminalRuleCall_8()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // InternalRails.g:457:3: ( ( RULE_LF )=>this_LF_17= RULE_LF )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_LF) ) {
                int LA20_1 = input.LA(2);

                if ( (synpred6_InternalRails()) ) {
                    alt20=1;
                }
            }
            switch (alt20) {
                case 1 :
                    // InternalRails.g:457:4: ( RULE_LF )=>this_LF_17= RULE_LF
                    {
                    this_LF_17=(Token)match(input,RULE_LF,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LF_17);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LF_17, grammarAccess.getMethodChainCallAccess().getLFTerminalRuleCall_9()); 
                          
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
    // InternalRails.g:472:1: entryRuleMethodCallParameters returns [String current=null] : iv_ruleMethodCallParameters= ruleMethodCallParameters EOF ;
    public final String entryRuleMethodCallParameters() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMethodCallParameters = null;


        try {
            // InternalRails.g:473:2: (iv_ruleMethodCallParameters= ruleMethodCallParameters EOF )
            // InternalRails.g:474:2: iv_ruleMethodCallParameters= ruleMethodCallParameters EOF
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
    // InternalRails.g:481:1: ruleMethodCallParameters returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_PARENTHESIS_BLOCK_0= RULE_PARENTHESIS_BLOCK | this_ExpressionsSeparatedByCommas_1= ruleExpressionsSeparatedByCommas ) ;
    public final AntlrDatatypeRuleToken ruleMethodCallParameters() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_PARENTHESIS_BLOCK_0=null;
        AntlrDatatypeRuleToken this_ExpressionsSeparatedByCommas_1 = null;


         enterRule(); 
            
        try {
            // InternalRails.g:484:28: ( (this_PARENTHESIS_BLOCK_0= RULE_PARENTHESIS_BLOCK | this_ExpressionsSeparatedByCommas_1= ruleExpressionsSeparatedByCommas ) )
            // InternalRails.g:485:1: (this_PARENTHESIS_BLOCK_0= RULE_PARENTHESIS_BLOCK | this_ExpressionsSeparatedByCommas_1= ruleExpressionsSeparatedByCommas )
            {
            // InternalRails.g:485:1: (this_PARENTHESIS_BLOCK_0= RULE_PARENTHESIS_BLOCK | this_ExpressionsSeparatedByCommas_1= ruleExpressionsSeparatedByCommas )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_PARENTHESIS_BLOCK) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_SPACE||(LA21_0>=RULE_STRING && LA21_0<=RULE_INT_METHOD)||LA21_0==RULE_ARRAY_BLOCK||(LA21_0>=RULE_DECIMAL && LA21_0<=RULE_REGEXP)) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalRails.g:485:6: this_PARENTHESIS_BLOCK_0= RULE_PARENTHESIS_BLOCK
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
                    // InternalRails.g:494:5: this_ExpressionsSeparatedByCommas_1= ruleExpressionsSeparatedByCommas
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
    // InternalRails.g:512:1: entryRuleExpressionsSeparatedByCommas returns [String current=null] : iv_ruleExpressionsSeparatedByCommas= ruleExpressionsSeparatedByCommas EOF ;
    public final String entryRuleExpressionsSeparatedByCommas() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpressionsSeparatedByCommas = null;


        try {
            // InternalRails.g:513:2: (iv_ruleExpressionsSeparatedByCommas= ruleExpressionsSeparatedByCommas EOF )
            // InternalRails.g:514:2: iv_ruleExpressionsSeparatedByCommas= ruleExpressionsSeparatedByCommas EOF
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
    // InternalRails.g:521:1: ruleExpressionsSeparatedByCommas returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ExpressionWithOutBracket_0= ruleExpressionWithOutBracket ( (this_SPACE_1= RULE_SPACE )* this_COMMA_2= RULE_COMMA ( (this_SPACE_3= RULE_SPACE )* this_LF_4= RULE_LF )? (this_SPACE_5= RULE_SPACE )* this_Expression_6= ruleExpression )* ) ;
    public final AntlrDatatypeRuleToken ruleExpressionsSeparatedByCommas() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SPACE_1=null;
        Token this_COMMA_2=null;
        Token this_SPACE_3=null;
        Token this_LF_4=null;
        Token this_SPACE_5=null;
        AntlrDatatypeRuleToken this_ExpressionWithOutBracket_0 = null;

        AntlrDatatypeRuleToken this_Expression_6 = null;


         enterRule(); 
            
        try {
            // InternalRails.g:524:28: ( (this_ExpressionWithOutBracket_0= ruleExpressionWithOutBracket ( (this_SPACE_1= RULE_SPACE )* this_COMMA_2= RULE_COMMA ( (this_SPACE_3= RULE_SPACE )* this_LF_4= RULE_LF )? (this_SPACE_5= RULE_SPACE )* this_Expression_6= ruleExpression )* ) )
            // InternalRails.g:525:1: (this_ExpressionWithOutBracket_0= ruleExpressionWithOutBracket ( (this_SPACE_1= RULE_SPACE )* this_COMMA_2= RULE_COMMA ( (this_SPACE_3= RULE_SPACE )* this_LF_4= RULE_LF )? (this_SPACE_5= RULE_SPACE )* this_Expression_6= ruleExpression )* )
            {
            // InternalRails.g:525:1: (this_ExpressionWithOutBracket_0= ruleExpressionWithOutBracket ( (this_SPACE_1= RULE_SPACE )* this_COMMA_2= RULE_COMMA ( (this_SPACE_3= RULE_SPACE )* this_LF_4= RULE_LF )? (this_SPACE_5= RULE_SPACE )* this_Expression_6= ruleExpression )* )
            // InternalRails.g:526:5: this_ExpressionWithOutBracket_0= ruleExpressionWithOutBracket ( (this_SPACE_1= RULE_SPACE )* this_COMMA_2= RULE_COMMA ( (this_SPACE_3= RULE_SPACE )* this_LF_4= RULE_LF )? (this_SPACE_5= RULE_SPACE )* this_Expression_6= ruleExpression )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionsSeparatedByCommasAccess().getExpressionWithOutBracketParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_15);
            this_ExpressionWithOutBracket_0=ruleExpressionWithOutBracket();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ExpressionWithOutBracket_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalRails.g:536:1: ( (this_SPACE_1= RULE_SPACE )* this_COMMA_2= RULE_COMMA ( (this_SPACE_3= RULE_SPACE )* this_LF_4= RULE_LF )? (this_SPACE_5= RULE_SPACE )* this_Expression_6= ruleExpression )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_SPACE) ) {
                    alt26=1;
                }
                else if ( (LA26_0==RULE_COMMA) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalRails.g:536:2: (this_SPACE_1= RULE_SPACE )* this_COMMA_2= RULE_COMMA ( (this_SPACE_3= RULE_SPACE )* this_LF_4= RULE_LF )? (this_SPACE_5= RULE_SPACE )* this_Expression_6= ruleExpression
            	    {
            	    // InternalRails.g:536:2: (this_SPACE_1= RULE_SPACE )*
            	    loop22:
            	    do {
            	        int alt22=2;
            	        int LA22_0 = input.LA(1);

            	        if ( (LA22_0==RULE_SPACE) ) {
            	            alt22=1;
            	        }


            	        switch (alt22) {
            	    	case 1 :
            	    	    // InternalRails.g:536:7: this_SPACE_1= RULE_SPACE
            	    	    {
            	    	    this_SPACE_1=(Token)match(input,RULE_SPACE,FOLLOW_16); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      		current.merge(this_SPACE_1);
            	    	          
            	    	    }
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	          newLeafNode(this_SPACE_1, grammarAccess.getExpressionsSeparatedByCommasAccess().getSPACETerminalRuleCall_1_0()); 
            	    	          
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop22;
            	        }
            	    } while (true);

            	    this_COMMA_2=(Token)match(input,RULE_COMMA,FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_COMMA_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_COMMA_2, grammarAccess.getExpressionsSeparatedByCommasAccess().getCOMMATerminalRuleCall_1_1()); 
            	          
            	    }
            	    // InternalRails.g:550:1: ( (this_SPACE_3= RULE_SPACE )* this_LF_4= RULE_LF )?
            	    int alt24=2;
            	    alt24 = dfa24.predict(input);
            	    switch (alt24) {
            	        case 1 :
            	            // InternalRails.g:550:2: (this_SPACE_3= RULE_SPACE )* this_LF_4= RULE_LF
            	            {
            	            // InternalRails.g:550:2: (this_SPACE_3= RULE_SPACE )*
            	            loop23:
            	            do {
            	                int alt23=2;
            	                int LA23_0 = input.LA(1);

            	                if ( (LA23_0==RULE_SPACE) ) {
            	                    alt23=1;
            	                }


            	                switch (alt23) {
            	            	case 1 :
            	            	    // InternalRails.g:550:7: this_SPACE_3= RULE_SPACE
            	            	    {
            	            	    this_SPACE_3=(Token)match(input,RULE_SPACE,FOLLOW_18); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	      		current.merge(this_SPACE_3);
            	            	          
            	            	    }
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	          newLeafNode(this_SPACE_3, grammarAccess.getExpressionsSeparatedByCommasAccess().getSPACETerminalRuleCall_1_2_0()); 
            	            	          
            	            	    }

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop23;
            	                }
            	            } while (true);

            	            this_LF_4=(Token)match(input,RULE_LF,FOLLOW_17); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_LF_4);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_LF_4, grammarAccess.getExpressionsSeparatedByCommasAccess().getLFTerminalRuleCall_1_2_1()); 
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // InternalRails.g:564:3: (this_SPACE_5= RULE_SPACE )*
            	    loop25:
            	    do {
            	        int alt25=2;
            	        int LA25_0 = input.LA(1);

            	        if ( (LA25_0==RULE_SPACE) ) {
            	            alt25=1;
            	        }


            	        switch (alt25) {
            	    	case 1 :
            	    	    // InternalRails.g:564:8: this_SPACE_5= RULE_SPACE
            	    	    {
            	    	    this_SPACE_5=(Token)match(input,RULE_SPACE,FOLLOW_17); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      		current.merge(this_SPACE_5);
            	    	          
            	    	    }
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	          newLeafNode(this_SPACE_5, grammarAccess.getExpressionsSeparatedByCommasAccess().getSPACETerminalRuleCall_1_3()); 
            	    	          
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop25;
            	        }
            	    } while (true);

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getExpressionsSeparatedByCommasAccess().getExpressionParserRuleCall_1_4()); 
            	          
            	    }
            	    pushFollow(FOLLOW_15);
            	    this_Expression_6=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_Expression_6);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
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
    // $ANTLR end "ruleExpressionsSeparatedByCommas"


    // $ANTLR start "entryRuleExpressionWithOutBracket"
    // InternalRails.g:590:1: entryRuleExpressionWithOutBracket returns [String current=null] : iv_ruleExpressionWithOutBracket= ruleExpressionWithOutBracket EOF ;
    public final String entryRuleExpressionWithOutBracket() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpressionWithOutBracket = null;


        try {
            // InternalRails.g:591:2: (iv_ruleExpressionWithOutBracket= ruleExpressionWithOutBracket EOF )
            // InternalRails.g:592:2: iv_ruleExpressionWithOutBracket= ruleExpressionWithOutBracket EOF
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
    // InternalRails.g:599:1: ruleExpressionWithOutBracket returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SYMBOL_0= RULE_SYMBOL | this_STRING_1= RULE_STRING | this_ARRAY_BLOCK_2= RULE_ARRAY_BLOCK | this_PARENTHESIS_BLOCK_3= RULE_PARENTHESIS_BLOCK | this_DECIMAL_4= RULE_DECIMAL | this_INT_5= RULE_INT | this_REGEXP_6= RULE_REGEXP | this_MethodChainCall_7= ruleMethodChainCall | this_IgnoredHashKeyValue_8= ruleIgnoredHashKeyValue ) ;
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
            // InternalRails.g:602:28: ( (this_SYMBOL_0= RULE_SYMBOL | this_STRING_1= RULE_STRING | this_ARRAY_BLOCK_2= RULE_ARRAY_BLOCK | this_PARENTHESIS_BLOCK_3= RULE_PARENTHESIS_BLOCK | this_DECIMAL_4= RULE_DECIMAL | this_INT_5= RULE_INT | this_REGEXP_6= RULE_REGEXP | this_MethodChainCall_7= ruleMethodChainCall | this_IgnoredHashKeyValue_8= ruleIgnoredHashKeyValue ) )
            // InternalRails.g:603:1: (this_SYMBOL_0= RULE_SYMBOL | this_STRING_1= RULE_STRING | this_ARRAY_BLOCK_2= RULE_ARRAY_BLOCK | this_PARENTHESIS_BLOCK_3= RULE_PARENTHESIS_BLOCK | this_DECIMAL_4= RULE_DECIMAL | this_INT_5= RULE_INT | this_REGEXP_6= RULE_REGEXP | this_MethodChainCall_7= ruleMethodChainCall | this_IgnoredHashKeyValue_8= ruleIgnoredHashKeyValue )
            {
            // InternalRails.g:603:1: (this_SYMBOL_0= RULE_SYMBOL | this_STRING_1= RULE_STRING | this_ARRAY_BLOCK_2= RULE_ARRAY_BLOCK | this_PARENTHESIS_BLOCK_3= RULE_PARENTHESIS_BLOCK | this_DECIMAL_4= RULE_DECIMAL | this_INT_5= RULE_INT | this_REGEXP_6= RULE_REGEXP | this_MethodChainCall_7= ruleMethodChainCall | this_IgnoredHashKeyValue_8= ruleIgnoredHashKeyValue )
            int alt27=9;
            alt27 = dfa27.predict(input);
            switch (alt27) {
                case 1 :
                    // InternalRails.g:603:6: this_SYMBOL_0= RULE_SYMBOL
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
                    // InternalRails.g:611:10: this_STRING_1= RULE_STRING
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
                    // InternalRails.g:619:10: this_ARRAY_BLOCK_2= RULE_ARRAY_BLOCK
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
                    // InternalRails.g:627:10: this_PARENTHESIS_BLOCK_3= RULE_PARENTHESIS_BLOCK
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
                    // InternalRails.g:635:10: this_DECIMAL_4= RULE_DECIMAL
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
                    // InternalRails.g:643:10: this_INT_5= RULE_INT
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
                    // InternalRails.g:651:10: this_REGEXP_6= RULE_REGEXP
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
                    // InternalRails.g:660:5: this_MethodChainCall_7= ruleMethodChainCall
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
                    // InternalRails.g:672:5: this_IgnoredHashKeyValue_8= ruleIgnoredHashKeyValue
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
    // InternalRails.g:690:1: entryRuleExpression returns [String current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final String entryRuleExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpression = null;


        try {
            // InternalRails.g:691:2: (iv_ruleExpression= ruleExpression EOF )
            // InternalRails.g:692:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalRails.g:699:1: ruleExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ExpressionWithOutBracket_0= ruleExpressionWithOutBracket | this_BRACKET_BLOCK_1= RULE_BRACKET_BLOCK ) ;
    public final AntlrDatatypeRuleToken ruleExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_BRACKET_BLOCK_1=null;
        AntlrDatatypeRuleToken this_ExpressionWithOutBracket_0 = null;


         enterRule(); 
            
        try {
            // InternalRails.g:702:28: ( (this_ExpressionWithOutBracket_0= ruleExpressionWithOutBracket | this_BRACKET_BLOCK_1= RULE_BRACKET_BLOCK ) )
            // InternalRails.g:703:1: (this_ExpressionWithOutBracket_0= ruleExpressionWithOutBracket | this_BRACKET_BLOCK_1= RULE_BRACKET_BLOCK )
            {
            // InternalRails.g:703:1: (this_ExpressionWithOutBracket_0= ruleExpressionWithOutBracket | this_BRACKET_BLOCK_1= RULE_BRACKET_BLOCK )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_SPACE||(LA28_0>=RULE_STRING && LA28_0<=RULE_ARRAY_BLOCK)||(LA28_0>=RULE_DECIMAL && LA28_0<=RULE_REGEXP)) ) {
                alt28=1;
            }
            else if ( (LA28_0==RULE_BRACKET_BLOCK) ) {
                alt28=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalRails.g:704:5: this_ExpressionWithOutBracket_0= ruleExpressionWithOutBracket
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
                    // InternalRails.g:715:10: this_BRACKET_BLOCK_1= RULE_BRACKET_BLOCK
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


    // $ANTLR start "entryRuleRelationship"
    // InternalRails.g:730:1: entryRuleRelationship returns [EObject current=null] : iv_ruleRelationship= ruleRelationship EOF ;
    public final EObject entryRuleRelationship() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationship = null;


        try {
            // InternalRails.g:731:2: (iv_ruleRelationship= ruleRelationship EOF )
            // InternalRails.g:732:2: iv_ruleRelationship= ruleRelationship EOF
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
    // InternalRails.g:739:1: ruleRelationship returns [EObject current=null] : ( ( ( (lv_relationType_0_1= RULE_HAS_MANY_WORD | lv_relationType_0_2= RULE_HAS_ONE_WORD | lv_relationType_0_3= RULE_HAS_AND_BELONGS_TO_MANY_WORD | lv_relationType_0_4= RULE_BELONGS_TO_WORD ) ) ) (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )* ) ;
    public final EObject ruleRelationship() throws RecognitionException {
        EObject current = null;

        Token lv_relationType_0_1=null;
        Token lv_relationType_0_2=null;
        Token lv_relationType_0_3=null;
        Token lv_relationType_0_4=null;
        Token this_SPACE_1=null;
        Token lv_name_2_1=null;
        Token lv_name_2_2=null;
        Token this_SPACE_3=null;
        EObject lv_options_4_0 = null;


         enterRule(); 
            
        try {
            // InternalRails.g:742:28: ( ( ( ( (lv_relationType_0_1= RULE_HAS_MANY_WORD | lv_relationType_0_2= RULE_HAS_ONE_WORD | lv_relationType_0_3= RULE_HAS_AND_BELONGS_TO_MANY_WORD | lv_relationType_0_4= RULE_BELONGS_TO_WORD ) ) ) (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )* ) )
            // InternalRails.g:743:1: ( ( ( (lv_relationType_0_1= RULE_HAS_MANY_WORD | lv_relationType_0_2= RULE_HAS_ONE_WORD | lv_relationType_0_3= RULE_HAS_AND_BELONGS_TO_MANY_WORD | lv_relationType_0_4= RULE_BELONGS_TO_WORD ) ) ) (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )* )
            {
            // InternalRails.g:743:1: ( ( ( (lv_relationType_0_1= RULE_HAS_MANY_WORD | lv_relationType_0_2= RULE_HAS_ONE_WORD | lv_relationType_0_3= RULE_HAS_AND_BELONGS_TO_MANY_WORD | lv_relationType_0_4= RULE_BELONGS_TO_WORD ) ) ) (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )* )
            // InternalRails.g:743:2: ( ( (lv_relationType_0_1= RULE_HAS_MANY_WORD | lv_relationType_0_2= RULE_HAS_ONE_WORD | lv_relationType_0_3= RULE_HAS_AND_BELONGS_TO_MANY_WORD | lv_relationType_0_4= RULE_BELONGS_TO_WORD ) ) ) (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )*
            {
            // InternalRails.g:743:2: ( ( (lv_relationType_0_1= RULE_HAS_MANY_WORD | lv_relationType_0_2= RULE_HAS_ONE_WORD | lv_relationType_0_3= RULE_HAS_AND_BELONGS_TO_MANY_WORD | lv_relationType_0_4= RULE_BELONGS_TO_WORD ) ) )
            // InternalRails.g:744:1: ( (lv_relationType_0_1= RULE_HAS_MANY_WORD | lv_relationType_0_2= RULE_HAS_ONE_WORD | lv_relationType_0_3= RULE_HAS_AND_BELONGS_TO_MANY_WORD | lv_relationType_0_4= RULE_BELONGS_TO_WORD ) )
            {
            // InternalRails.g:744:1: ( (lv_relationType_0_1= RULE_HAS_MANY_WORD | lv_relationType_0_2= RULE_HAS_ONE_WORD | lv_relationType_0_3= RULE_HAS_AND_BELONGS_TO_MANY_WORD | lv_relationType_0_4= RULE_BELONGS_TO_WORD ) )
            // InternalRails.g:745:1: (lv_relationType_0_1= RULE_HAS_MANY_WORD | lv_relationType_0_2= RULE_HAS_ONE_WORD | lv_relationType_0_3= RULE_HAS_AND_BELONGS_TO_MANY_WORD | lv_relationType_0_4= RULE_BELONGS_TO_WORD )
            {
            // InternalRails.g:745:1: (lv_relationType_0_1= RULE_HAS_MANY_WORD | lv_relationType_0_2= RULE_HAS_ONE_WORD | lv_relationType_0_3= RULE_HAS_AND_BELONGS_TO_MANY_WORD | lv_relationType_0_4= RULE_BELONGS_TO_WORD )
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
                    // InternalRails.g:746:3: lv_relationType_0_1= RULE_HAS_MANY_WORD
                    {
                    lv_relationType_0_1=(Token)match(input,RULE_HAS_MANY_WORD,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_relationType_0_1, grammarAccess.getRelationshipAccess().getRelationTypeHAS_MANY_WORDTerminalRuleCall_0_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getRelationshipRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"relationType",
                              		lv_relationType_0_1, 
                              		"co.gruposaberes.model.Rails.HAS_MANY_WORD");
                      	    
                    }

                    }
                    break;
                case 2 :
                    // InternalRails.g:761:8: lv_relationType_0_2= RULE_HAS_ONE_WORD
                    {
                    lv_relationType_0_2=(Token)match(input,RULE_HAS_ONE_WORD,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_relationType_0_2, grammarAccess.getRelationshipAccess().getRelationTypeHAS_ONE_WORDTerminalRuleCall_0_0_1()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getRelationshipRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"relationType",
                              		lv_relationType_0_2, 
                              		"co.gruposaberes.model.Rails.HAS_ONE_WORD");
                      	    
                    }

                    }
                    break;
                case 3 :
                    // InternalRails.g:776:8: lv_relationType_0_3= RULE_HAS_AND_BELONGS_TO_MANY_WORD
                    {
                    lv_relationType_0_3=(Token)match(input,RULE_HAS_AND_BELONGS_TO_MANY_WORD,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_relationType_0_3, grammarAccess.getRelationshipAccess().getRelationTypeHAS_AND_BELONGS_TO_MANY_WORDTerminalRuleCall_0_0_2()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getRelationshipRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"relationType",
                              		lv_relationType_0_3, 
                              		"co.gruposaberes.model.Rails.HAS_AND_BELONGS_TO_MANY_WORD");
                      	    
                    }

                    }
                    break;
                case 4 :
                    // InternalRails.g:791:8: lv_relationType_0_4= RULE_BELONGS_TO_WORD
                    {
                    lv_relationType_0_4=(Token)match(input,RULE_BELONGS_TO_WORD,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_relationType_0_4, grammarAccess.getRelationshipAccess().getRelationTypeBELONGS_TO_WORDTerminalRuleCall_0_0_3()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getRelationshipRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"relationType",
                              		lv_relationType_0_4, 
                              		"co.gruposaberes.model.Rails.BELONGS_TO_WORD");
                      	    
                    }

                    }
                    break;

            }


            }


            }

            // InternalRails.g:809:2: (this_SPACE_1= RULE_SPACE )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_SPACE) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalRails.g:809:3: this_SPACE_1= RULE_SPACE
            	    {
            	    this_SPACE_1=(Token)match(input,RULE_SPACE,FOLLOW_19); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SPACE_1, grammarAccess.getRelationshipAccess().getSPACETerminalRuleCall_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            // InternalRails.g:813:3: ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) )
            // InternalRails.g:814:1: ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) )
            {
            // InternalRails.g:814:1: ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) )
            // InternalRails.g:815:1: (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING )
            {
            // InternalRails.g:815:1: (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING )
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
                    // InternalRails.g:816:3: lv_name_2_1= RULE_SYMBOL
                    {
                    lv_name_2_1=(Token)match(input,RULE_SYMBOL,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_2_1, grammarAccess.getRelationshipAccess().getNameSYMBOLTerminalRuleCall_2_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getRelationshipRule());
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
                    // InternalRails.g:831:8: lv_name_2_2= RULE_STRING
                    {
                    lv_name_2_2=(Token)match(input,RULE_STRING,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_2_2, grammarAccess.getRelationshipAccess().getNameSTRINGTerminalRuleCall_2_0_1()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getRelationshipRule());
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

            // InternalRails.g:849:2: (this_SPACE_3= RULE_SPACE )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_SPACE) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalRails.g:849:3: this_SPACE_3= RULE_SPACE
            	    {
            	    this_SPACE_3=(Token)match(input,RULE_SPACE,FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SPACE_3, grammarAccess.getRelationshipAccess().getSPACETerminalRuleCall_3()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            // InternalRails.g:853:3: ( (lv_options_4_0= ruleHashKeyValue ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_COMMA) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalRails.g:854:1: (lv_options_4_0= ruleHashKeyValue )
            	    {
            	    // InternalRails.g:854:1: (lv_options_4_0= ruleHashKeyValue )
            	    // InternalRails.g:855:3: lv_options_4_0= ruleHashKeyValue
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRelationshipAccess().getOptionsHashKeyValueParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_20);
            	    lv_options_4_0=ruleHashKeyValue();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getRelationshipRule());
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


    // $ANTLR start "entryRuleHashKeyValue"
    // InternalRails.g:887:1: entryRuleHashKeyValue returns [EObject current=null] : iv_ruleHashKeyValue= ruleHashKeyValue EOF ;
    public final EObject entryRuleHashKeyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHashKeyValue = null;


        try {
            // InternalRails.g:888:2: (iv_ruleHashKeyValue= ruleHashKeyValue EOF )
            // InternalRails.g:889:2: iv_ruleHashKeyValue= ruleHashKeyValue EOF
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
    // InternalRails.g:896:1: ruleHashKeyValue returns [EObject current=null] : (this_COMMA_0= RULE_COMMA (this_SPACE_1= RULE_SPACE )* (this_LF_2= RULE_LF (this_SPACE_3= RULE_SPACE )* )? ( ( ( (lv_key_4_0= RULE_ID ) ) otherlv_5= ':' ) | ( ( ( (lv_key_6_1= RULE_SYMBOL | lv_key_6_2= RULE_STRING ) ) ) (this_SPACE_7= RULE_SPACE )* otherlv_8= '=>' ) ) (this_SPACE_9= RULE_SPACE )* ( ( (lv_value_10_1= RULE_SYMBOL | lv_value_10_2= RULE_STRING | lv_value_10_3= RULE_BRACKET_BLOCK | lv_value_10_4= RULE_ARRAY_BLOCK | lv_value_10_5= RULE_DECIMAL | lv_value_10_6= RULE_INT | lv_value_10_7= RULE_INT_METHOD | lv_value_10_8= ruleMethodChainCall ) ) ) (this_SPACE_11= RULE_SPACE )* ) ;
    public final EObject ruleHashKeyValue() throws RecognitionException {
        EObject current = null;

        Token this_COMMA_0=null;
        Token this_SPACE_1=null;
        Token this_LF_2=null;
        Token this_SPACE_3=null;
        Token lv_key_4_0=null;
        Token otherlv_5=null;
        Token lv_key_6_1=null;
        Token lv_key_6_2=null;
        Token this_SPACE_7=null;
        Token otherlv_8=null;
        Token this_SPACE_9=null;
        Token lv_value_10_1=null;
        Token lv_value_10_2=null;
        Token lv_value_10_3=null;
        Token lv_value_10_4=null;
        Token lv_value_10_5=null;
        Token lv_value_10_6=null;
        Token lv_value_10_7=null;
        Token this_SPACE_11=null;
        AntlrDatatypeRuleToken lv_value_10_8 = null;


         enterRule(); 
            
        try {
            // InternalRails.g:899:28: ( (this_COMMA_0= RULE_COMMA (this_SPACE_1= RULE_SPACE )* (this_LF_2= RULE_LF (this_SPACE_3= RULE_SPACE )* )? ( ( ( (lv_key_4_0= RULE_ID ) ) otherlv_5= ':' ) | ( ( ( (lv_key_6_1= RULE_SYMBOL | lv_key_6_2= RULE_STRING ) ) ) (this_SPACE_7= RULE_SPACE )* otherlv_8= '=>' ) ) (this_SPACE_9= RULE_SPACE )* ( ( (lv_value_10_1= RULE_SYMBOL | lv_value_10_2= RULE_STRING | lv_value_10_3= RULE_BRACKET_BLOCK | lv_value_10_4= RULE_ARRAY_BLOCK | lv_value_10_5= RULE_DECIMAL | lv_value_10_6= RULE_INT | lv_value_10_7= RULE_INT_METHOD | lv_value_10_8= ruleMethodChainCall ) ) ) (this_SPACE_11= RULE_SPACE )* ) )
            // InternalRails.g:900:1: (this_COMMA_0= RULE_COMMA (this_SPACE_1= RULE_SPACE )* (this_LF_2= RULE_LF (this_SPACE_3= RULE_SPACE )* )? ( ( ( (lv_key_4_0= RULE_ID ) ) otherlv_5= ':' ) | ( ( ( (lv_key_6_1= RULE_SYMBOL | lv_key_6_2= RULE_STRING ) ) ) (this_SPACE_7= RULE_SPACE )* otherlv_8= '=>' ) ) (this_SPACE_9= RULE_SPACE )* ( ( (lv_value_10_1= RULE_SYMBOL | lv_value_10_2= RULE_STRING | lv_value_10_3= RULE_BRACKET_BLOCK | lv_value_10_4= RULE_ARRAY_BLOCK | lv_value_10_5= RULE_DECIMAL | lv_value_10_6= RULE_INT | lv_value_10_7= RULE_INT_METHOD | lv_value_10_8= ruleMethodChainCall ) ) ) (this_SPACE_11= RULE_SPACE )* )
            {
            // InternalRails.g:900:1: (this_COMMA_0= RULE_COMMA (this_SPACE_1= RULE_SPACE )* (this_LF_2= RULE_LF (this_SPACE_3= RULE_SPACE )* )? ( ( ( (lv_key_4_0= RULE_ID ) ) otherlv_5= ':' ) | ( ( ( (lv_key_6_1= RULE_SYMBOL | lv_key_6_2= RULE_STRING ) ) ) (this_SPACE_7= RULE_SPACE )* otherlv_8= '=>' ) ) (this_SPACE_9= RULE_SPACE )* ( ( (lv_value_10_1= RULE_SYMBOL | lv_value_10_2= RULE_STRING | lv_value_10_3= RULE_BRACKET_BLOCK | lv_value_10_4= RULE_ARRAY_BLOCK | lv_value_10_5= RULE_DECIMAL | lv_value_10_6= RULE_INT | lv_value_10_7= RULE_INT_METHOD | lv_value_10_8= ruleMethodChainCall ) ) ) (this_SPACE_11= RULE_SPACE )* )
            // InternalRails.g:900:2: this_COMMA_0= RULE_COMMA (this_SPACE_1= RULE_SPACE )* (this_LF_2= RULE_LF (this_SPACE_3= RULE_SPACE )* )? ( ( ( (lv_key_4_0= RULE_ID ) ) otherlv_5= ':' ) | ( ( ( (lv_key_6_1= RULE_SYMBOL | lv_key_6_2= RULE_STRING ) ) ) (this_SPACE_7= RULE_SPACE )* otherlv_8= '=>' ) ) (this_SPACE_9= RULE_SPACE )* ( ( (lv_value_10_1= RULE_SYMBOL | lv_value_10_2= RULE_STRING | lv_value_10_3= RULE_BRACKET_BLOCK | lv_value_10_4= RULE_ARRAY_BLOCK | lv_value_10_5= RULE_DECIMAL | lv_value_10_6= RULE_INT | lv_value_10_7= RULE_INT_METHOD | lv_value_10_8= ruleMethodChainCall ) ) ) (this_SPACE_11= RULE_SPACE )*
            {
            this_COMMA_0=(Token)match(input,RULE_COMMA,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_COMMA_0, grammarAccess.getHashKeyValueAccess().getCOMMATerminalRuleCall_0()); 
                  
            }
            // InternalRails.g:904:1: (this_SPACE_1= RULE_SPACE )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_SPACE) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalRails.g:904:2: this_SPACE_1= RULE_SPACE
            	    {
            	    this_SPACE_1=(Token)match(input,RULE_SPACE,FOLLOW_21); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SPACE_1, grammarAccess.getHashKeyValueAccess().getSPACETerminalRuleCall_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            // InternalRails.g:908:3: (this_LF_2= RULE_LF (this_SPACE_3= RULE_SPACE )* )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_LF) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalRails.g:908:4: this_LF_2= RULE_LF (this_SPACE_3= RULE_SPACE )*
                    {
                    this_LF_2=(Token)match(input,RULE_LF,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LF_2, grammarAccess.getHashKeyValueAccess().getLFTerminalRuleCall_2_0()); 
                          
                    }
                    // InternalRails.g:912:1: (this_SPACE_3= RULE_SPACE )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==RULE_SPACE) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalRails.g:912:2: this_SPACE_3= RULE_SPACE
                    	    {
                    	    this_SPACE_3=(Token)match(input,RULE_SPACE,FOLLOW_22); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_SPACE_3, grammarAccess.getHashKeyValueAccess().getSPACETerminalRuleCall_2_1()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRails.g:916:5: ( ( ( (lv_key_4_0= RULE_ID ) ) otherlv_5= ':' ) | ( ( ( (lv_key_6_1= RULE_SYMBOL | lv_key_6_2= RULE_STRING ) ) ) (this_SPACE_7= RULE_SPACE )* otherlv_8= '=>' ) )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_ID) ) {
                alt39=1;
            }
            else if ( (LA39_0==RULE_STRING||LA39_0==RULE_SYMBOL) ) {
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
                    // InternalRails.g:916:6: ( ( (lv_key_4_0= RULE_ID ) ) otherlv_5= ':' )
                    {
                    // InternalRails.g:916:6: ( ( (lv_key_4_0= RULE_ID ) ) otherlv_5= ':' )
                    // InternalRails.g:916:7: ( (lv_key_4_0= RULE_ID ) ) otherlv_5= ':'
                    {
                    // InternalRails.g:916:7: ( (lv_key_4_0= RULE_ID ) )
                    // InternalRails.g:917:1: (lv_key_4_0= RULE_ID )
                    {
                    // InternalRails.g:917:1: (lv_key_4_0= RULE_ID )
                    // InternalRails.g:918:3: lv_key_4_0= RULE_ID
                    {
                    lv_key_4_0=(Token)match(input,RULE_ID,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_key_4_0, grammarAccess.getHashKeyValueAccess().getKeyIDTerminalRuleCall_3_0_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getHashKeyValueRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"key",
                              		lv_key_4_0, 
                              		"co.gruposaberes.model.Rails.ID");
                      	    
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,46,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getHashKeyValueAccess().getColonKeyword_3_0_1());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalRails.g:939:6: ( ( ( (lv_key_6_1= RULE_SYMBOL | lv_key_6_2= RULE_STRING ) ) ) (this_SPACE_7= RULE_SPACE )* otherlv_8= '=>' )
                    {
                    // InternalRails.g:939:6: ( ( ( (lv_key_6_1= RULE_SYMBOL | lv_key_6_2= RULE_STRING ) ) ) (this_SPACE_7= RULE_SPACE )* otherlv_8= '=>' )
                    // InternalRails.g:939:7: ( ( (lv_key_6_1= RULE_SYMBOL | lv_key_6_2= RULE_STRING ) ) ) (this_SPACE_7= RULE_SPACE )* otherlv_8= '=>'
                    {
                    // InternalRails.g:939:7: ( ( (lv_key_6_1= RULE_SYMBOL | lv_key_6_2= RULE_STRING ) ) )
                    // InternalRails.g:940:1: ( (lv_key_6_1= RULE_SYMBOL | lv_key_6_2= RULE_STRING ) )
                    {
                    // InternalRails.g:940:1: ( (lv_key_6_1= RULE_SYMBOL | lv_key_6_2= RULE_STRING ) )
                    // InternalRails.g:941:1: (lv_key_6_1= RULE_SYMBOL | lv_key_6_2= RULE_STRING )
                    {
                    // InternalRails.g:941:1: (lv_key_6_1= RULE_SYMBOL | lv_key_6_2= RULE_STRING )
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
                            // InternalRails.g:942:3: lv_key_6_1= RULE_SYMBOL
                            {
                            lv_key_6_1=(Token)match(input,RULE_SYMBOL,FOLLOW_25); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_key_6_1, grammarAccess.getHashKeyValueAccess().getKeySYMBOLTerminalRuleCall_3_1_0_0_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getHashKeyValueRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"key",
                                      		lv_key_6_1, 
                                      		"co.gruposaberes.model.Rails.SYMBOL");
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // InternalRails.g:957:8: lv_key_6_2= RULE_STRING
                            {
                            lv_key_6_2=(Token)match(input,RULE_STRING,FOLLOW_25); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_key_6_2, grammarAccess.getHashKeyValueAccess().getKeySTRINGTerminalRuleCall_3_1_0_0_1()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getHashKeyValueRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"key",
                                      		lv_key_6_2, 
                                      		"co.gruposaberes.model.Rails.STRING");
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }

                    // InternalRails.g:975:2: (this_SPACE_7= RULE_SPACE )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==RULE_SPACE) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalRails.g:975:3: this_SPACE_7= RULE_SPACE
                    	    {
                    	    this_SPACE_7=(Token)match(input,RULE_SPACE,FOLLOW_25); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_SPACE_7, grammarAccess.getHashKeyValueAccess().getSPACETerminalRuleCall_3_1_1()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,47,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getHashKeyValueAccess().getEqualsSignGreaterThanSignKeyword_3_1_2());
                          
                    }

                    }


                    }
                    break;

            }

            // InternalRails.g:983:3: (this_SPACE_9= RULE_SPACE )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==RULE_SPACE) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalRails.g:983:4: this_SPACE_9= RULE_SPACE
            	    {
            	    this_SPACE_9=(Token)match(input,RULE_SPACE,FOLLOW_24); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SPACE_9, grammarAccess.getHashKeyValueAccess().getSPACETerminalRuleCall_4()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            // InternalRails.g:987:3: ( ( (lv_value_10_1= RULE_SYMBOL | lv_value_10_2= RULE_STRING | lv_value_10_3= RULE_BRACKET_BLOCK | lv_value_10_4= RULE_ARRAY_BLOCK | lv_value_10_5= RULE_DECIMAL | lv_value_10_6= RULE_INT | lv_value_10_7= RULE_INT_METHOD | lv_value_10_8= ruleMethodChainCall ) ) )
            // InternalRails.g:988:1: ( (lv_value_10_1= RULE_SYMBOL | lv_value_10_2= RULE_STRING | lv_value_10_3= RULE_BRACKET_BLOCK | lv_value_10_4= RULE_ARRAY_BLOCK | lv_value_10_5= RULE_DECIMAL | lv_value_10_6= RULE_INT | lv_value_10_7= RULE_INT_METHOD | lv_value_10_8= ruleMethodChainCall ) )
            {
            // InternalRails.g:988:1: ( (lv_value_10_1= RULE_SYMBOL | lv_value_10_2= RULE_STRING | lv_value_10_3= RULE_BRACKET_BLOCK | lv_value_10_4= RULE_ARRAY_BLOCK | lv_value_10_5= RULE_DECIMAL | lv_value_10_6= RULE_INT | lv_value_10_7= RULE_INT_METHOD | lv_value_10_8= ruleMethodChainCall ) )
            // InternalRails.g:989:1: (lv_value_10_1= RULE_SYMBOL | lv_value_10_2= RULE_STRING | lv_value_10_3= RULE_BRACKET_BLOCK | lv_value_10_4= RULE_ARRAY_BLOCK | lv_value_10_5= RULE_DECIMAL | lv_value_10_6= RULE_INT | lv_value_10_7= RULE_INT_METHOD | lv_value_10_8= ruleMethodChainCall )
            {
            // InternalRails.g:989:1: (lv_value_10_1= RULE_SYMBOL | lv_value_10_2= RULE_STRING | lv_value_10_3= RULE_BRACKET_BLOCK | lv_value_10_4= RULE_ARRAY_BLOCK | lv_value_10_5= RULE_DECIMAL | lv_value_10_6= RULE_INT | lv_value_10_7= RULE_INT_METHOD | lv_value_10_8= ruleMethodChainCall )
            int alt41=8;
            switch ( input.LA(1) ) {
            case RULE_SYMBOL:
                {
                alt41=1;
                }
                break;
            case RULE_STRING:
                {
                alt41=2;
                }
                break;
            case RULE_BRACKET_BLOCK:
                {
                alt41=3;
                }
                break;
            case RULE_ARRAY_BLOCK:
                {
                alt41=4;
                }
                break;
            case RULE_DECIMAL:
                {
                alt41=5;
                }
                break;
            case RULE_INT:
                {
                alt41=6;
                }
                break;
            case RULE_INT_METHOD:
                {
                alt41=7;
                }
                break;
            case RULE_ID:
            case RULE_PARENTHESIS_BLOCK:
                {
                alt41=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // InternalRails.g:990:3: lv_value_10_1= RULE_SYMBOL
                    {
                    lv_value_10_1=(Token)match(input,RULE_SYMBOL,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_10_1, grammarAccess.getHashKeyValueAccess().getValueSYMBOLTerminalRuleCall_5_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getHashKeyValueRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_10_1, 
                              		"co.gruposaberes.model.Rails.SYMBOL");
                      	    
                    }

                    }
                    break;
                case 2 :
                    // InternalRails.g:1005:8: lv_value_10_2= RULE_STRING
                    {
                    lv_value_10_2=(Token)match(input,RULE_STRING,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_10_2, grammarAccess.getHashKeyValueAccess().getValueSTRINGTerminalRuleCall_5_0_1()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getHashKeyValueRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_10_2, 
                              		"co.gruposaberes.model.Rails.STRING");
                      	    
                    }

                    }
                    break;
                case 3 :
                    // InternalRails.g:1020:8: lv_value_10_3= RULE_BRACKET_BLOCK
                    {
                    lv_value_10_3=(Token)match(input,RULE_BRACKET_BLOCK,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_10_3, grammarAccess.getHashKeyValueAccess().getValueBRACKET_BLOCKTerminalRuleCall_5_0_2()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getHashKeyValueRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_10_3, 
                              		"co.gruposaberes.model.Rails.BRACKET_BLOCK");
                      	    
                    }

                    }
                    break;
                case 4 :
                    // InternalRails.g:1035:8: lv_value_10_4= RULE_ARRAY_BLOCK
                    {
                    lv_value_10_4=(Token)match(input,RULE_ARRAY_BLOCK,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_10_4, grammarAccess.getHashKeyValueAccess().getValueARRAY_BLOCKTerminalRuleCall_5_0_3()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getHashKeyValueRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_10_4, 
                              		"co.gruposaberes.model.Rails.ARRAY_BLOCK");
                      	    
                    }

                    }
                    break;
                case 5 :
                    // InternalRails.g:1050:8: lv_value_10_5= RULE_DECIMAL
                    {
                    lv_value_10_5=(Token)match(input,RULE_DECIMAL,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_10_5, grammarAccess.getHashKeyValueAccess().getValueDECIMALTerminalRuleCall_5_0_4()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getHashKeyValueRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_10_5, 
                              		"co.gruposaberes.model.Rails.DECIMAL");
                      	    
                    }

                    }
                    break;
                case 6 :
                    // InternalRails.g:1065:8: lv_value_10_6= RULE_INT
                    {
                    lv_value_10_6=(Token)match(input,RULE_INT,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_10_6, grammarAccess.getHashKeyValueAccess().getValueINTTerminalRuleCall_5_0_5()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getHashKeyValueRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_10_6, 
                              		"co.gruposaberes.model.Rails.INT");
                      	    
                    }

                    }
                    break;
                case 7 :
                    // InternalRails.g:1080:8: lv_value_10_7= RULE_INT_METHOD
                    {
                    lv_value_10_7=(Token)match(input,RULE_INT_METHOD,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_10_7, grammarAccess.getHashKeyValueAccess().getValueINT_METHODTerminalRuleCall_5_0_6()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getHashKeyValueRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_10_7, 
                              		"co.gruposaberes.model.Rails.INT_METHOD");
                      	    
                    }

                    }
                    break;
                case 8 :
                    // InternalRails.g:1095:8: lv_value_10_8= ruleMethodChainCall
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getHashKeyValueAccess().getValueMethodChainCallParserRuleCall_5_0_7()); 
                      	    
                    }
                    pushFollow(FOLLOW_26);
                    lv_value_10_8=ruleMethodChainCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getHashKeyValueRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_10_8, 
                              		"co.gruposaberes.model.Rails.MethodChainCall");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;

            }


            }


            }

            // InternalRails.g:1113:2: (this_SPACE_11= RULE_SPACE )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_SPACE) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalRails.g:1113:3: this_SPACE_11= RULE_SPACE
            	    {
            	    this_SPACE_11=(Token)match(input,RULE_SPACE,FOLLOW_26); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SPACE_11, grammarAccess.getHashKeyValueAccess().getSPACETerminalRuleCall_6()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop42;
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
    // InternalRails.g:1125:1: entryRuleIgnoredHashKeyValue returns [String current=null] : iv_ruleIgnoredHashKeyValue= ruleIgnoredHashKeyValue EOF ;
    public final String entryRuleIgnoredHashKeyValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIgnoredHashKeyValue = null;


        try {
            // InternalRails.g:1126:2: (iv_ruleIgnoredHashKeyValue= ruleIgnoredHashKeyValue EOF )
            // InternalRails.g:1127:2: iv_ruleIgnoredHashKeyValue= ruleIgnoredHashKeyValue EOF
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
    // InternalRails.g:1134:1: ruleIgnoredHashKeyValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_SPACE_0= RULE_SPACE )* ( (this_ID_1= RULE_ID kw= ':' ) | ( (this_SYMBOL_3= RULE_SYMBOL | this_STRING_4= RULE_STRING ) (this_SPACE_5= RULE_SPACE )* kw= '=>' ) ) (this_SPACE_7= RULE_SPACE )* (this_SYMBOL_8= RULE_SYMBOL | this_STRING_9= RULE_STRING | this_BRACKET_BLOCK_10= RULE_BRACKET_BLOCK | this_ARRAY_BLOCK_11= RULE_ARRAY_BLOCK | this_DECIMAL_12= RULE_DECIMAL | this_INT_13= RULE_INT | this_INT_METHOD_14= RULE_INT_METHOD | this_MethodChainCall_15= ruleMethodChainCall | this_REGEXP_16= RULE_REGEXP ) (this_SPACE_17= RULE_SPACE )* ) ;
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
            // InternalRails.g:1137:28: ( ( (this_SPACE_0= RULE_SPACE )* ( (this_ID_1= RULE_ID kw= ':' ) | ( (this_SYMBOL_3= RULE_SYMBOL | this_STRING_4= RULE_STRING ) (this_SPACE_5= RULE_SPACE )* kw= '=>' ) ) (this_SPACE_7= RULE_SPACE )* (this_SYMBOL_8= RULE_SYMBOL | this_STRING_9= RULE_STRING | this_BRACKET_BLOCK_10= RULE_BRACKET_BLOCK | this_ARRAY_BLOCK_11= RULE_ARRAY_BLOCK | this_DECIMAL_12= RULE_DECIMAL | this_INT_13= RULE_INT | this_INT_METHOD_14= RULE_INT_METHOD | this_MethodChainCall_15= ruleMethodChainCall | this_REGEXP_16= RULE_REGEXP ) (this_SPACE_17= RULE_SPACE )* ) )
            // InternalRails.g:1138:1: ( (this_SPACE_0= RULE_SPACE )* ( (this_ID_1= RULE_ID kw= ':' ) | ( (this_SYMBOL_3= RULE_SYMBOL | this_STRING_4= RULE_STRING ) (this_SPACE_5= RULE_SPACE )* kw= '=>' ) ) (this_SPACE_7= RULE_SPACE )* (this_SYMBOL_8= RULE_SYMBOL | this_STRING_9= RULE_STRING | this_BRACKET_BLOCK_10= RULE_BRACKET_BLOCK | this_ARRAY_BLOCK_11= RULE_ARRAY_BLOCK | this_DECIMAL_12= RULE_DECIMAL | this_INT_13= RULE_INT | this_INT_METHOD_14= RULE_INT_METHOD | this_MethodChainCall_15= ruleMethodChainCall | this_REGEXP_16= RULE_REGEXP ) (this_SPACE_17= RULE_SPACE )* )
            {
            // InternalRails.g:1138:1: ( (this_SPACE_0= RULE_SPACE )* ( (this_ID_1= RULE_ID kw= ':' ) | ( (this_SYMBOL_3= RULE_SYMBOL | this_STRING_4= RULE_STRING ) (this_SPACE_5= RULE_SPACE )* kw= '=>' ) ) (this_SPACE_7= RULE_SPACE )* (this_SYMBOL_8= RULE_SYMBOL | this_STRING_9= RULE_STRING | this_BRACKET_BLOCK_10= RULE_BRACKET_BLOCK | this_ARRAY_BLOCK_11= RULE_ARRAY_BLOCK | this_DECIMAL_12= RULE_DECIMAL | this_INT_13= RULE_INT | this_INT_METHOD_14= RULE_INT_METHOD | this_MethodChainCall_15= ruleMethodChainCall | this_REGEXP_16= RULE_REGEXP ) (this_SPACE_17= RULE_SPACE )* )
            // InternalRails.g:1138:2: (this_SPACE_0= RULE_SPACE )* ( (this_ID_1= RULE_ID kw= ':' ) | ( (this_SYMBOL_3= RULE_SYMBOL | this_STRING_4= RULE_STRING ) (this_SPACE_5= RULE_SPACE )* kw= '=>' ) ) (this_SPACE_7= RULE_SPACE )* (this_SYMBOL_8= RULE_SYMBOL | this_STRING_9= RULE_STRING | this_BRACKET_BLOCK_10= RULE_BRACKET_BLOCK | this_ARRAY_BLOCK_11= RULE_ARRAY_BLOCK | this_DECIMAL_12= RULE_DECIMAL | this_INT_13= RULE_INT | this_INT_METHOD_14= RULE_INT_METHOD | this_MethodChainCall_15= ruleMethodChainCall | this_REGEXP_16= RULE_REGEXP ) (this_SPACE_17= RULE_SPACE )*
            {
            // InternalRails.g:1138:2: (this_SPACE_0= RULE_SPACE )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_SPACE) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalRails.g:1138:7: this_SPACE_0= RULE_SPACE
            	    {
            	    this_SPACE_0=(Token)match(input,RULE_SPACE,FOLLOW_22); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_SPACE_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SPACE_0, grammarAccess.getIgnoredHashKeyValueAccess().getSPACETerminalRuleCall_0()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            // InternalRails.g:1145:3: ( (this_ID_1= RULE_ID kw= ':' ) | ( (this_SYMBOL_3= RULE_SYMBOL | this_STRING_4= RULE_STRING ) (this_SPACE_5= RULE_SPACE )* kw= '=>' ) )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_ID) ) {
                alt46=1;
            }
            else if ( (LA46_0==RULE_STRING||LA46_0==RULE_SYMBOL) ) {
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
                    // InternalRails.g:1145:4: (this_ID_1= RULE_ID kw= ':' )
                    {
                    // InternalRails.g:1145:4: (this_ID_1= RULE_ID kw= ':' )
                    // InternalRails.g:1145:9: this_ID_1= RULE_ID kw= ':'
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_1, grammarAccess.getIgnoredHashKeyValueAccess().getIDTerminalRuleCall_1_0_0()); 
                          
                    }
                    kw=(Token)match(input,46,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIgnoredHashKeyValueAccess().getColonKeyword_1_0_1()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalRails.g:1159:6: ( (this_SYMBOL_3= RULE_SYMBOL | this_STRING_4= RULE_STRING ) (this_SPACE_5= RULE_SPACE )* kw= '=>' )
                    {
                    // InternalRails.g:1159:6: ( (this_SYMBOL_3= RULE_SYMBOL | this_STRING_4= RULE_STRING ) (this_SPACE_5= RULE_SPACE )* kw= '=>' )
                    // InternalRails.g:1159:7: (this_SYMBOL_3= RULE_SYMBOL | this_STRING_4= RULE_STRING ) (this_SPACE_5= RULE_SPACE )* kw= '=>'
                    {
                    // InternalRails.g:1159:7: (this_SYMBOL_3= RULE_SYMBOL | this_STRING_4= RULE_STRING )
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==RULE_SYMBOL) ) {
                        alt44=1;
                    }
                    else if ( (LA44_0==RULE_STRING) ) {
                        alt44=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 44, 0, input);

                        throw nvae;
                    }
                    switch (alt44) {
                        case 1 :
                            // InternalRails.g:1159:12: this_SYMBOL_3= RULE_SYMBOL
                            {
                            this_SYMBOL_3=(Token)match(input,RULE_SYMBOL,FOLLOW_25); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_SYMBOL_3);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_SYMBOL_3, grammarAccess.getIgnoredHashKeyValueAccess().getSYMBOLTerminalRuleCall_1_1_0_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // InternalRails.g:1167:10: this_STRING_4= RULE_STRING
                            {
                            this_STRING_4=(Token)match(input,RULE_STRING,FOLLOW_25); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_STRING_4);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_STRING_4, grammarAccess.getIgnoredHashKeyValueAccess().getSTRINGTerminalRuleCall_1_1_0_1()); 
                                  
                            }

                            }
                            break;

                    }

                    // InternalRails.g:1174:2: (this_SPACE_5= RULE_SPACE )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==RULE_SPACE) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // InternalRails.g:1174:7: this_SPACE_5= RULE_SPACE
                    	    {
                    	    this_SPACE_5=(Token)match(input,RULE_SPACE,FOLLOW_25); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		current.merge(this_SPACE_5);
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_SPACE_5, grammarAccess.getIgnoredHashKeyValueAccess().getSPACETerminalRuleCall_1_1_1()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);

                    kw=(Token)match(input,47,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIgnoredHashKeyValueAccess().getEqualsSignGreaterThanSignKeyword_1_1_2()); 
                          
                    }

                    }


                    }
                    break;

            }

            // InternalRails.g:1187:3: (this_SPACE_7= RULE_SPACE )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==RULE_SPACE) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalRails.g:1187:8: this_SPACE_7= RULE_SPACE
            	    {
            	    this_SPACE_7=(Token)match(input,RULE_SPACE,FOLLOW_27); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_SPACE_7);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SPACE_7, grammarAccess.getIgnoredHashKeyValueAccess().getSPACETerminalRuleCall_2()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            // InternalRails.g:1194:3: (this_SYMBOL_8= RULE_SYMBOL | this_STRING_9= RULE_STRING | this_BRACKET_BLOCK_10= RULE_BRACKET_BLOCK | this_ARRAY_BLOCK_11= RULE_ARRAY_BLOCK | this_DECIMAL_12= RULE_DECIMAL | this_INT_13= RULE_INT | this_INT_METHOD_14= RULE_INT_METHOD | this_MethodChainCall_15= ruleMethodChainCall | this_REGEXP_16= RULE_REGEXP )
            int alt48=9;
            alt48 = dfa48.predict(input);
            switch (alt48) {
                case 1 :
                    // InternalRails.g:1194:8: this_SYMBOL_8= RULE_SYMBOL
                    {
                    this_SYMBOL_8=(Token)match(input,RULE_SYMBOL,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_SYMBOL_8);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SYMBOL_8, grammarAccess.getIgnoredHashKeyValueAccess().getSYMBOLTerminalRuleCall_3_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalRails.g:1202:10: this_STRING_9= RULE_STRING
                    {
                    this_STRING_9=(Token)match(input,RULE_STRING,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_9);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_9, grammarAccess.getIgnoredHashKeyValueAccess().getSTRINGTerminalRuleCall_3_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalRails.g:1210:10: this_BRACKET_BLOCK_10= RULE_BRACKET_BLOCK
                    {
                    this_BRACKET_BLOCK_10=(Token)match(input,RULE_BRACKET_BLOCK,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BRACKET_BLOCK_10);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BRACKET_BLOCK_10, grammarAccess.getIgnoredHashKeyValueAccess().getBRACKET_BLOCKTerminalRuleCall_3_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // InternalRails.g:1218:10: this_ARRAY_BLOCK_11= RULE_ARRAY_BLOCK
                    {
                    this_ARRAY_BLOCK_11=(Token)match(input,RULE_ARRAY_BLOCK,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ARRAY_BLOCK_11);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ARRAY_BLOCK_11, grammarAccess.getIgnoredHashKeyValueAccess().getARRAY_BLOCKTerminalRuleCall_3_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // InternalRails.g:1226:10: this_DECIMAL_12= RULE_DECIMAL
                    {
                    this_DECIMAL_12=(Token)match(input,RULE_DECIMAL,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_DECIMAL_12);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_DECIMAL_12, grammarAccess.getIgnoredHashKeyValueAccess().getDECIMALTerminalRuleCall_3_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // InternalRails.g:1234:10: this_INT_13= RULE_INT
                    {
                    this_INT_13=(Token)match(input,RULE_INT,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_13);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_13, grammarAccess.getIgnoredHashKeyValueAccess().getINTTerminalRuleCall_3_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // InternalRails.g:1242:10: this_INT_METHOD_14= RULE_INT_METHOD
                    {
                    this_INT_METHOD_14=(Token)match(input,RULE_INT_METHOD,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_METHOD_14);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_METHOD_14, grammarAccess.getIgnoredHashKeyValueAccess().getINT_METHODTerminalRuleCall_3_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // InternalRails.g:1251:5: this_MethodChainCall_15= ruleMethodChainCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIgnoredHashKeyValueAccess().getMethodChainCallParserRuleCall_3_7()); 
                          
                    }
                    pushFollow(FOLLOW_26);
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
                    // InternalRails.g:1262:10: this_REGEXP_16= RULE_REGEXP
                    {
                    this_REGEXP_16=(Token)match(input,RULE_REGEXP,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_REGEXP_16);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_REGEXP_16, grammarAccess.getIgnoredHashKeyValueAccess().getREGEXPTerminalRuleCall_3_8()); 
                          
                    }

                    }
                    break;

            }

            // InternalRails.g:1269:2: (this_SPACE_17= RULE_SPACE )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==RULE_SPACE) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalRails.g:1269:7: this_SPACE_17= RULE_SPACE
            	    {
            	    this_SPACE_17=(Token)match(input,RULE_SPACE,FOLLOW_26); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_SPACE_17);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SPACE_17, grammarAccess.getIgnoredHashKeyValueAccess().getSPACETerminalRuleCall_4()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop49;
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
    // InternalRails.g:1284:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // InternalRails.g:1285:2: (iv_ruleMethod= ruleMethod EOF )
            // InternalRails.g:1286:2: iv_ruleMethod= ruleMethod EOF
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
    // InternalRails.g:1293:1: ruleMethod returns [EObject current=null] : (this_DEF_WORD_0= RULE_DEF_WORD (this_SPACE_1= RULE_SPACE )* ( (lv_name_2_0= ruleMethodName ) ) (this_SPACE_3= RULE_SPACE )* (this_PARENTHESIS_BLOCK_4= RULE_PARENTHESIS_BLOCK )? (this_SPACE_5= RULE_SPACE )* (this_LF_6= RULE_LF )? ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        Token this_DEF_WORD_0=null;
        Token this_SPACE_1=null;
        Token this_SPACE_3=null;
        Token this_PARENTHESIS_BLOCK_4=null;
        Token this_SPACE_5=null;
        Token this_LF_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // InternalRails.g:1296:28: ( (this_DEF_WORD_0= RULE_DEF_WORD (this_SPACE_1= RULE_SPACE )* ( (lv_name_2_0= ruleMethodName ) ) (this_SPACE_3= RULE_SPACE )* (this_PARENTHESIS_BLOCK_4= RULE_PARENTHESIS_BLOCK )? (this_SPACE_5= RULE_SPACE )* (this_LF_6= RULE_LF )? ) )
            // InternalRails.g:1297:1: (this_DEF_WORD_0= RULE_DEF_WORD (this_SPACE_1= RULE_SPACE )* ( (lv_name_2_0= ruleMethodName ) ) (this_SPACE_3= RULE_SPACE )* (this_PARENTHESIS_BLOCK_4= RULE_PARENTHESIS_BLOCK )? (this_SPACE_5= RULE_SPACE )* (this_LF_6= RULE_LF )? )
            {
            // InternalRails.g:1297:1: (this_DEF_WORD_0= RULE_DEF_WORD (this_SPACE_1= RULE_SPACE )* ( (lv_name_2_0= ruleMethodName ) ) (this_SPACE_3= RULE_SPACE )* (this_PARENTHESIS_BLOCK_4= RULE_PARENTHESIS_BLOCK )? (this_SPACE_5= RULE_SPACE )* (this_LF_6= RULE_LF )? )
            // InternalRails.g:1297:2: this_DEF_WORD_0= RULE_DEF_WORD (this_SPACE_1= RULE_SPACE )* ( (lv_name_2_0= ruleMethodName ) ) (this_SPACE_3= RULE_SPACE )* (this_PARENTHESIS_BLOCK_4= RULE_PARENTHESIS_BLOCK )? (this_SPACE_5= RULE_SPACE )* (this_LF_6= RULE_LF )?
            {
            this_DEF_WORD_0=(Token)match(input,RULE_DEF_WORD,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_DEF_WORD_0, grammarAccess.getMethodAccess().getDEF_WORDTerminalRuleCall_0()); 
                  
            }
            // InternalRails.g:1301:1: (this_SPACE_1= RULE_SPACE )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==RULE_SPACE) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalRails.g:1301:2: this_SPACE_1= RULE_SPACE
            	    {
            	    this_SPACE_1=(Token)match(input,RULE_SPACE,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SPACE_1, grammarAccess.getMethodAccess().getSPACETerminalRuleCall_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

            // InternalRails.g:1305:3: ( (lv_name_2_0= ruleMethodName ) )
            // InternalRails.g:1306:1: (lv_name_2_0= ruleMethodName )
            {
            // InternalRails.g:1306:1: (lv_name_2_0= ruleMethodName )
            // InternalRails.g:1307:3: lv_name_2_0= ruleMethodName
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

            // InternalRails.g:1323:2: (this_SPACE_3= RULE_SPACE )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==RULE_SPACE) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalRails.g:1323:3: this_SPACE_3= RULE_SPACE
            	    {
            	    this_SPACE_3=(Token)match(input,RULE_SPACE,FOLLOW_28); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SPACE_3, grammarAccess.getMethodAccess().getSPACETerminalRuleCall_3()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

            // InternalRails.g:1327:3: (this_PARENTHESIS_BLOCK_4= RULE_PARENTHESIS_BLOCK )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_PARENTHESIS_BLOCK) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalRails.g:1327:4: this_PARENTHESIS_BLOCK_4= RULE_PARENTHESIS_BLOCK
                    {
                    this_PARENTHESIS_BLOCK_4=(Token)match(input,RULE_PARENTHESIS_BLOCK,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PARENTHESIS_BLOCK_4, grammarAccess.getMethodAccess().getPARENTHESIS_BLOCKTerminalRuleCall_4()); 
                          
                    }

                    }
                    break;

            }

            // InternalRails.g:1331:3: (this_SPACE_5= RULE_SPACE )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==RULE_SPACE) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalRails.g:1331:4: this_SPACE_5= RULE_SPACE
            	    {
            	    this_SPACE_5=(Token)match(input,RULE_SPACE,FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SPACE_5, grammarAccess.getMethodAccess().getSPACETerminalRuleCall_5()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

            // InternalRails.g:1335:3: (this_LF_6= RULE_LF )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_LF) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalRails.g:1335:4: this_LF_6= RULE_LF
                    {
                    this_LF_6=(Token)match(input,RULE_LF,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LF_6, grammarAccess.getMethodAccess().getLFTerminalRuleCall_6()); 
                          
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
    // InternalRails.g:1347:1: entryRuleMethodName returns [String current=null] : iv_ruleMethodName= ruleMethodName EOF ;
    public final String entryRuleMethodName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMethodName = null;


        try {
            // InternalRails.g:1348:2: (iv_ruleMethodName= ruleMethodName EOF )
            // InternalRails.g:1349:2: iv_ruleMethodName= ruleMethodName EOF
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
    // InternalRails.g:1356:1: ruleMethodName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_NamespacedModuleName_0= ruleNamespacedModuleName kw= '.' )? this_ID_2= RULE_ID (kw= '?' | kw= '=' )? ) ;
    public final AntlrDatatypeRuleToken ruleMethodName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_2=null;
        AntlrDatatypeRuleToken this_NamespacedModuleName_0 = null;


         enterRule(); 
            
        try {
            // InternalRails.g:1359:28: ( ( (this_NamespacedModuleName_0= ruleNamespacedModuleName kw= '.' )? this_ID_2= RULE_ID (kw= '?' | kw= '=' )? ) )
            // InternalRails.g:1360:1: ( (this_NamespacedModuleName_0= ruleNamespacedModuleName kw= '.' )? this_ID_2= RULE_ID (kw= '?' | kw= '=' )? )
            {
            // InternalRails.g:1360:1: ( (this_NamespacedModuleName_0= ruleNamespacedModuleName kw= '.' )? this_ID_2= RULE_ID (kw= '?' | kw= '=' )? )
            // InternalRails.g:1360:2: (this_NamespacedModuleName_0= ruleNamespacedModuleName kw= '.' )? this_ID_2= RULE_ID (kw= '?' | kw= '=' )?
            {
            // InternalRails.g:1360:2: (this_NamespacedModuleName_0= ruleNamespacedModuleName kw= '.' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_ID) ) {
                int LA55_1 = input.LA(2);

                if ( ((LA55_1>=44 && LA55_1<=45)) ) {
                    alt55=1;
                }
            }
            switch (alt55) {
                case 1 :
                    // InternalRails.g:1361:5: this_NamespacedModuleName_0= ruleNamespacedModuleName kw= '.'
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
                    kw=(Token)match(input,45,FOLLOW_9); if (state.failed) return current;
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
            // InternalRails.g:1384:1: (kw= '?' | kw= '=' )?
            int alt56=3;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==48) ) {
                alt56=1;
            }
            else if ( (LA56_0==49) ) {
                alt56=2;
            }
            switch (alt56) {
                case 1 :
                    // InternalRails.g:1385:2: kw= '?'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getMethodNameAccess().getQuestionMarkKeyword_2_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalRails.g:1392:2: kw= '='
                    {
                    kw=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleOperationsChain"
    // InternalRails.g:1405:1: entryRuleOperationsChain returns [EObject current=null] : iv_ruleOperationsChain= ruleOperationsChain EOF ;
    public final EObject entryRuleOperationsChain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationsChain = null;


        try {
            // InternalRails.g:1406:2: (iv_ruleOperationsChain= ruleOperationsChain EOF )
            // InternalRails.g:1407:2: iv_ruleOperationsChain= ruleOperationsChain EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationsChainRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOperationsChain=ruleOperationsChain();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationsChain; 
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
    // InternalRails.g:1414:1: ruleOperationsChain returns [EObject current=null] : ( ( (lv_name_0_0= ruleMethodChainCall ) ) ( ( (lv_operators_1_0= ruleOperatorRule ) ) ( ( (lv_operants_2_1= RULE_BRACKET_BLOCK | lv_operants_2_2= RULE_DECIMAL | lv_operants_2_3= ruleMethodChainCall | lv_operants_2_4= RULE_REGEXP ) ) ) )* ) ;
    public final EObject ruleOperationsChain() throws RecognitionException {
        EObject current = null;

        Token lv_operants_2_1=null;
        Token lv_operants_2_2=null;
        Token lv_operants_2_4=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_operators_1_0 = null;

        AntlrDatatypeRuleToken lv_operants_2_3 = null;


         enterRule(); 
            
        try {
            // InternalRails.g:1417:28: ( ( ( (lv_name_0_0= ruleMethodChainCall ) ) ( ( (lv_operators_1_0= ruleOperatorRule ) ) ( ( (lv_operants_2_1= RULE_BRACKET_BLOCK | lv_operants_2_2= RULE_DECIMAL | lv_operants_2_3= ruleMethodChainCall | lv_operants_2_4= RULE_REGEXP ) ) ) )* ) )
            // InternalRails.g:1418:1: ( ( (lv_name_0_0= ruleMethodChainCall ) ) ( ( (lv_operators_1_0= ruleOperatorRule ) ) ( ( (lv_operants_2_1= RULE_BRACKET_BLOCK | lv_operants_2_2= RULE_DECIMAL | lv_operants_2_3= ruleMethodChainCall | lv_operants_2_4= RULE_REGEXP ) ) ) )* )
            {
            // InternalRails.g:1418:1: ( ( (lv_name_0_0= ruleMethodChainCall ) ) ( ( (lv_operators_1_0= ruleOperatorRule ) ) ( ( (lv_operants_2_1= RULE_BRACKET_BLOCK | lv_operants_2_2= RULE_DECIMAL | lv_operants_2_3= ruleMethodChainCall | lv_operants_2_4= RULE_REGEXP ) ) ) )* )
            // InternalRails.g:1418:2: ( (lv_name_0_0= ruleMethodChainCall ) ) ( ( (lv_operators_1_0= ruleOperatorRule ) ) ( ( (lv_operants_2_1= RULE_BRACKET_BLOCK | lv_operants_2_2= RULE_DECIMAL | lv_operants_2_3= ruleMethodChainCall | lv_operants_2_4= RULE_REGEXP ) ) ) )*
            {
            // InternalRails.g:1418:2: ( (lv_name_0_0= ruleMethodChainCall ) )
            // InternalRails.g:1419:1: (lv_name_0_0= ruleMethodChainCall )
            {
            // InternalRails.g:1419:1: (lv_name_0_0= ruleMethodChainCall )
            // InternalRails.g:1420:3: lv_name_0_0= ruleMethodChainCall
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOperationsChainAccess().getNameMethodChainCallParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_31);
            lv_name_0_0=ruleMethodChainCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getOperationsChainRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"co.gruposaberes.model.Rails.MethodChainCall");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalRails.g:1436:2: ( ( (lv_operators_1_0= ruleOperatorRule ) ) ( ( (lv_operants_2_1= RULE_BRACKET_BLOCK | lv_operants_2_2= RULE_DECIMAL | lv_operants_2_3= ruleMethodChainCall | lv_operants_2_4= RULE_REGEXP ) ) ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==43||(LA58_0>=48 && LA58_0<=69)) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalRails.g:1436:3: ( (lv_operators_1_0= ruleOperatorRule ) ) ( ( (lv_operants_2_1= RULE_BRACKET_BLOCK | lv_operants_2_2= RULE_DECIMAL | lv_operants_2_3= ruleMethodChainCall | lv_operants_2_4= RULE_REGEXP ) ) )
            	    {
            	    // InternalRails.g:1436:3: ( (lv_operators_1_0= ruleOperatorRule ) )
            	    // InternalRails.g:1437:1: (lv_operators_1_0= ruleOperatorRule )
            	    {
            	    // InternalRails.g:1437:1: (lv_operators_1_0= ruleOperatorRule )
            	    // InternalRails.g:1438:3: lv_operators_1_0= ruleOperatorRule
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOperationsChainAccess().getOperatorsOperatorRuleParserRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_27);
            	    lv_operators_1_0=ruleOperatorRule();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getOperationsChainRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"operators",
            	              		lv_operators_1_0, 
            	              		"co.gruposaberes.model.Rails.OperatorRule");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // InternalRails.g:1454:2: ( ( (lv_operants_2_1= RULE_BRACKET_BLOCK | lv_operants_2_2= RULE_DECIMAL | lv_operants_2_3= ruleMethodChainCall | lv_operants_2_4= RULE_REGEXP ) ) )
            	    // InternalRails.g:1455:1: ( (lv_operants_2_1= RULE_BRACKET_BLOCK | lv_operants_2_2= RULE_DECIMAL | lv_operants_2_3= ruleMethodChainCall | lv_operants_2_4= RULE_REGEXP ) )
            	    {
            	    // InternalRails.g:1455:1: ( (lv_operants_2_1= RULE_BRACKET_BLOCK | lv_operants_2_2= RULE_DECIMAL | lv_operants_2_3= ruleMethodChainCall | lv_operants_2_4= RULE_REGEXP ) )
            	    // InternalRails.g:1456:1: (lv_operants_2_1= RULE_BRACKET_BLOCK | lv_operants_2_2= RULE_DECIMAL | lv_operants_2_3= ruleMethodChainCall | lv_operants_2_4= RULE_REGEXP )
            	    {
            	    // InternalRails.g:1456:1: (lv_operants_2_1= RULE_BRACKET_BLOCK | lv_operants_2_2= RULE_DECIMAL | lv_operants_2_3= ruleMethodChainCall | lv_operants_2_4= RULE_REGEXP )
            	    int alt57=4;
            	    switch ( input.LA(1) ) {
            	    case RULE_BRACKET_BLOCK:
            	        {
            	        alt57=1;
            	        }
            	        break;
            	    case RULE_DECIMAL:
            	        {
            	        alt57=2;
            	        }
            	        break;
            	    case RULE_STRING:
            	    case RULE_ID:
            	    case RULE_SYMBOL:
            	    case RULE_INT:
            	    case RULE_INT_METHOD:
            	    case RULE_PARENTHESIS_BLOCK:
            	    case RULE_ARRAY_BLOCK:
            	        {
            	        alt57=3;
            	        }
            	        break;
            	    case RULE_REGEXP:
            	        {
            	        alt57=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 57, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt57) {
            	        case 1 :
            	            // InternalRails.g:1457:3: lv_operants_2_1= RULE_BRACKET_BLOCK
            	            {
            	            lv_operants_2_1=(Token)match(input,RULE_BRACKET_BLOCK,FOLLOW_31); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              			newLeafNode(lv_operants_2_1, grammarAccess.getOperationsChainAccess().getOperantsBRACKET_BLOCKTerminalRuleCall_1_1_0_0()); 
            	              		
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getOperationsChainRule());
            	              	        }
            	                     		addWithLastConsumed(
            	                     			current, 
            	                     			"operants",
            	                      		lv_operants_2_1, 
            	                      		"co.gruposaberes.model.Rails.BRACKET_BLOCK");
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalRails.g:1472:8: lv_operants_2_2= RULE_DECIMAL
            	            {
            	            lv_operants_2_2=(Token)match(input,RULE_DECIMAL,FOLLOW_31); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              			newLeafNode(lv_operants_2_2, grammarAccess.getOperationsChainAccess().getOperantsDECIMALTerminalRuleCall_1_1_0_1()); 
            	              		
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getOperationsChainRule());
            	              	        }
            	                     		addWithLastConsumed(
            	                     			current, 
            	                     			"operants",
            	                      		lv_operants_2_2, 
            	                      		"co.gruposaberes.model.Rails.DECIMAL");
            	              	    
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // InternalRails.g:1487:8: lv_operants_2_3= ruleMethodChainCall
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getOperationsChainAccess().getOperantsMethodChainCallParserRuleCall_1_1_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_31);
            	            lv_operants_2_3=ruleMethodChainCall();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getOperationsChainRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"operants",
            	                      		lv_operants_2_3, 
            	                      		"co.gruposaberes.model.Rails.MethodChainCall");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // InternalRails.g:1502:8: lv_operants_2_4= RULE_REGEXP
            	            {
            	            lv_operants_2_4=(Token)match(input,RULE_REGEXP,FOLLOW_31); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              			newLeafNode(lv_operants_2_4, grammarAccess.getOperationsChainAccess().getOperantsREGEXPTerminalRuleCall_1_1_0_3()); 
            	              		
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getOperationsChainRule());
            	              	        }
            	                     		addWithLastConsumed(
            	                     			current, 
            	                     			"operants",
            	                      		lv_operants_2_4, 
            	                      		"co.gruposaberes.model.Rails.REGEXP");
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop58;
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
    // InternalRails.g:1528:1: entryRuleOperatorRule returns [String current=null] : iv_ruleOperatorRule= ruleOperatorRule EOF ;
    public final String entryRuleOperatorRule() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOperatorRule = null;


        try {
            // InternalRails.g:1529:2: (iv_ruleOperatorRule= ruleOperatorRule EOF )
            // InternalRails.g:1530:2: iv_ruleOperatorRule= ruleOperatorRule EOF
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
    // InternalRails.g:1537:1: ruleOperatorRule returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= ': ' | kw= '?' | kw= '<=' | kw= '<' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= '**' | kw= '=' | kw= '~' | kw= '|' | kw= '||' | kw= '&' | kw= '&&' | kw= '==' | kw= '!' | kw= '<<' | kw= '<=>' | kw= '>' | kw= '..' | kw= '...' ) (kw= '=' )? ) ;
    public final AntlrDatatypeRuleToken ruleOperatorRule() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalRails.g:1540:28: ( ( (kw= ': ' | kw= '?' | kw= '<=' | kw= '<' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= '**' | kw= '=' | kw= '~' | kw= '|' | kw= '||' | kw= '&' | kw= '&&' | kw= '==' | kw= '!' | kw= '<<' | kw= '<=>' | kw= '>' | kw= '..' | kw= '...' ) (kw= '=' )? ) )
            // InternalRails.g:1541:1: ( (kw= ': ' | kw= '?' | kw= '<=' | kw= '<' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= '**' | kw= '=' | kw= '~' | kw= '|' | kw= '||' | kw= '&' | kw= '&&' | kw= '==' | kw= '!' | kw= '<<' | kw= '<=>' | kw= '>' | kw= '..' | kw= '...' ) (kw= '=' )? )
            {
            // InternalRails.g:1541:1: ( (kw= ': ' | kw= '?' | kw= '<=' | kw= '<' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= '**' | kw= '=' | kw= '~' | kw= '|' | kw= '||' | kw= '&' | kw= '&&' | kw= '==' | kw= '!' | kw= '<<' | kw= '<=>' | kw= '>' | kw= '..' | kw= '...' ) (kw= '=' )? )
            // InternalRails.g:1541:2: (kw= ': ' | kw= '?' | kw= '<=' | kw= '<' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= '**' | kw= '=' | kw= '~' | kw= '|' | kw= '||' | kw= '&' | kw= '&&' | kw= '==' | kw= '!' | kw= '<<' | kw= '<=>' | kw= '>' | kw= '..' | kw= '...' ) (kw= '=' )?
            {
            // InternalRails.g:1541:2: (kw= ': ' | kw= '?' | kw= '<=' | kw= '<' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= '**' | kw= '=' | kw= '~' | kw= '|' | kw= '||' | kw= '&' | kw= '&&' | kw= '==' | kw= '!' | kw= '<<' | kw= '<=>' | kw= '>' | kw= '..' | kw= '...' )
            int alt59=23;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt59=1;
                }
                break;
            case 48:
                {
                alt59=2;
                }
                break;
            case 51:
                {
                alt59=3;
                }
                break;
            case 43:
                {
                alt59=4;
                }
                break;
            case 52:
                {
                alt59=5;
                }
                break;
            case 53:
                {
                alt59=6;
                }
                break;
            case 54:
                {
                alt59=7;
                }
                break;
            case 55:
                {
                alt59=8;
                }
                break;
            case 56:
                {
                alt59=9;
                }
                break;
            case 57:
                {
                alt59=10;
                }
                break;
            case 49:
                {
                alt59=11;
                }
                break;
            case 58:
                {
                alt59=12;
                }
                break;
            case 59:
                {
                alt59=13;
                }
                break;
            case 60:
                {
                alt59=14;
                }
                break;
            case 61:
                {
                alt59=15;
                }
                break;
            case 62:
                {
                alt59=16;
                }
                break;
            case 63:
                {
                alt59=17;
                }
                break;
            case 64:
                {
                alt59=18;
                }
                break;
            case 65:
                {
                alt59=19;
                }
                break;
            case 66:
                {
                alt59=20;
                }
                break;
            case 67:
                {
                alt59=21;
                }
                break;
            case 68:
                {
                alt59=22;
                }
                break;
            case 69:
                {
                alt59=23;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }

            switch (alt59) {
                case 1 :
                    // InternalRails.g:1542:2: kw= ': '
                    {
                    kw=(Token)match(input,50,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorRuleAccess().getColonSpaceKeyword_0_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalRails.g:1549:2: kw= '?'
                    {
                    kw=(Token)match(input,48,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorRuleAccess().getQuestionMarkKeyword_0_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalRails.g:1556:2: kw= '<='
                    {
                    kw=(Token)match(input,51,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorRuleAccess().getLessThanSignEqualsSignKeyword_0_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // InternalRails.g:1563:2: kw= '<'
                    {
                    kw=(Token)match(input,43,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorRuleAccess().getLessThanSignKeyword_0_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // InternalRails.g:1570:2: kw= '+'
                    {
                    kw=(Token)match(input,52,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorRuleAccess().getPlusSignKeyword_0_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // InternalRails.g:1577:2: kw= '-'
                    {
                    kw=(Token)match(input,53,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorRuleAccess().getHyphenMinusKeyword_0_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // InternalRails.g:1584:2: kw= '*'
                    {
                    kw=(Token)match(input,54,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorRuleAccess().getAsteriskKeyword_0_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // InternalRails.g:1591:2: kw= '/'
                    {
                    kw=(Token)match(input,55,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorRuleAccess().getSolidusKeyword_0_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // InternalRails.g:1598:2: kw= '%'
                    {
                    kw=(Token)match(input,56,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorRuleAccess().getPercentSignKeyword_0_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // InternalRails.g:1605:2: kw= '**'
                    {
                    kw=(Token)match(input,57,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorRuleAccess().getAsteriskAsteriskKeyword_0_9()); 
                          
                    }

                    }
                    break;
                case 11 :
                    // InternalRails.g:1612:2: kw= '='
                    {
                    kw=(Token)match(input,49,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorRuleAccess().getEqualsSignKeyword_0_10()); 
                          
                    }

                    }
                    break;
                case 12 :
                    // InternalRails.g:1619:2: kw= '~'
                    {
                    kw=(Token)match(input,58,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorRuleAccess().getTildeKeyword_0_11()); 
                          
                    }

                    }
                    break;
                case 13 :
                    // InternalRails.g:1626:2: kw= '|'
                    {
                    kw=(Token)match(input,59,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorRuleAccess().getVerticalLineKeyword_0_12()); 
                          
                    }

                    }
                    break;
                case 14 :
                    // InternalRails.g:1633:2: kw= '||'
                    {
                    kw=(Token)match(input,60,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorRuleAccess().getVerticalLineVerticalLineKeyword_0_13()); 
                          
                    }

                    }
                    break;
                case 15 :
                    // InternalRails.g:1640:2: kw= '&'
                    {
                    kw=(Token)match(input,61,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorRuleAccess().getAmpersandKeyword_0_14()); 
                          
                    }

                    }
                    break;
                case 16 :
                    // InternalRails.g:1647:2: kw= '&&'
                    {
                    kw=(Token)match(input,62,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorRuleAccess().getAmpersandAmpersandKeyword_0_15()); 
                          
                    }

                    }
                    break;
                case 17 :
                    // InternalRails.g:1654:2: kw= '=='
                    {
                    kw=(Token)match(input,63,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorRuleAccess().getEqualsSignEqualsSignKeyword_0_16()); 
                          
                    }

                    }
                    break;
                case 18 :
                    // InternalRails.g:1661:2: kw= '!'
                    {
                    kw=(Token)match(input,64,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorRuleAccess().getExclamationMarkKeyword_0_17()); 
                          
                    }

                    }
                    break;
                case 19 :
                    // InternalRails.g:1668:2: kw= '<<'
                    {
                    kw=(Token)match(input,65,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorRuleAccess().getLessThanSignLessThanSignKeyword_0_18()); 
                          
                    }

                    }
                    break;
                case 20 :
                    // InternalRails.g:1675:2: kw= '<=>'
                    {
                    kw=(Token)match(input,66,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorRuleAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_0_19()); 
                          
                    }

                    }
                    break;
                case 21 :
                    // InternalRails.g:1682:2: kw= '>'
                    {
                    kw=(Token)match(input,67,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorRuleAccess().getGreaterThanSignKeyword_0_20()); 
                          
                    }

                    }
                    break;
                case 22 :
                    // InternalRails.g:1689:2: kw= '..'
                    {
                    kw=(Token)match(input,68,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorRuleAccess().getFullStopFullStopKeyword_0_21()); 
                          
                    }

                    }
                    break;
                case 23 :
                    // InternalRails.g:1696:2: kw= '...'
                    {
                    kw=(Token)match(input,69,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorRuleAccess().getFullStopFullStopFullStopKeyword_0_22()); 
                          
                    }

                    }
                    break;

            }

            // InternalRails.g:1701:2: (kw= '=' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==49) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalRails.g:1702:2: kw= '='
                    {
                    kw=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
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

    // $ANTLR start synpred1_InternalRails
    public final void synpred1_InternalRails_fragment() throws RecognitionException {   
        // InternalRails.g:179:3: ( RULE_DEF_WORD | RULE_HAS_MANY_WORD | RULE_HAS_ONE_WORD | RULE_HAS_AND_BELONGS_TO_MANY_WORD | RULE_BELONGS_TO_WORD | RULE_SET_TABLE_NAME )
        // InternalRails.g:
        {
        if ( input.LA(1)==RULE_SET_TABLE_NAME||(input.LA(1)>=RULE_HAS_MANY_WORD && input.LA(1)<=RULE_DEF_WORD) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }
    }
    // $ANTLR end synpred1_InternalRails

    // $ANTLR start synpred2_InternalRails
    public final void synpred2_InternalRails_fragment() throws RecognitionException {   
        // InternalRails.g:189:7: ( RULE_HAS_MANY_WORD | RULE_HAS_ONE_WORD | RULE_HAS_AND_BELONGS_TO_MANY_WORD | RULE_BELONGS_TO_WORD )
        // InternalRails.g:
        {
        if ( (input.LA(1)>=RULE_HAS_MANY_WORD && input.LA(1)<=RULE_BELONGS_TO_WORD) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }
    }
    // $ANTLR end synpred2_InternalRails

    // $ANTLR start synpred3_InternalRails
    public final void synpred3_InternalRails_fragment() throws RecognitionException {   
        // InternalRails.g:422:4: ( RULE_SPACE )
        // InternalRails.g:422:6: RULE_SPACE
        {
        match(input,RULE_SPACE,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalRails

    // $ANTLR start synpred4_InternalRails
    public final void synpred4_InternalRails_fragment() throws RecognitionException {   
        // InternalRails.g:436:4: ( RULE_SPACE )
        // InternalRails.g:436:6: RULE_SPACE
        {
        match(input,RULE_SPACE,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_InternalRails

    // $ANTLR start synpred5_InternalRails
    public final void synpred5_InternalRails_fragment() throws RecognitionException {   
        // InternalRails.g:450:4: ( RULE_SPACE )
        // InternalRails.g:450:6: RULE_SPACE
        {
        match(input,RULE_SPACE,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_InternalRails

    // $ANTLR start synpred6_InternalRails
    public final void synpred6_InternalRails_fragment() throws RecognitionException {   
        // InternalRails.g:457:4: ( RULE_LF )
        // InternalRails.g:457:6: RULE_LF
        {
        match(input,RULE_LF,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_InternalRails

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
    public final boolean synpred6_InternalRails() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalRails_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalRails() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalRails_fragment(); // can never throw exception
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
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA24 dfa24 = new DFA24(this);
    protected DFA27 dfa27 = new DFA27(this);
    protected DFA48 dfa48 = new DFA48(this);
    static final String dfa_1s = "\4\uffff";
    static final String dfa_2s = "\2\3\2\uffff";
    static final String dfa_3s = "\2\5\2\uffff";
    static final String dfa_4s = "\2\53\2\uffff";
    static final String dfa_5s = "\2\uffff\1\1\1\2";
    static final String dfa_6s = "\4\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\10\3\6\uffff\5\3\22\uffff\1\2",
            "\1\1\10\3\6\uffff\5\3\22\uffff\1\2",
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
    static final String dfa_11s = "\1\105\7\uffff\1\105\1\uffff\4\105";
    static final String dfa_12s = "\1\uffff\7\1\1\uffff\1\2\4\uffff";
    static final String dfa_13s = "\16\uffff}>";
    static final String[] dfa_14s = {
            "\1\10\1\11\1\3\1\7\1\2\1\5\1\6\1\1\1\4\4\11\1\4\1\5\5\11\22\uffff\1\11\4\uffff\26\11",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\10\1\11\1\14\1\12\1\13\10\11\2\uffff\5\11\22\uffff\1\11\4\uffff\26\11",
            "",
            "\14\11\1\uffff\7\11\22\uffff\3\11\1\7\1\uffff\26\11",
            "\1\15\13\11\1\uffff\7\11\22\uffff\1\11\1\uffff\1\11\1\uffff\1\7\26\11",
            "\1\15\13\11\1\uffff\7\11\22\uffff\1\11\1\uffff\1\11\1\uffff\1\7\26\11",
            "\1\15\13\11\1\uffff\7\11\22\uffff\1\11\3\uffff\1\7\26\11"
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "411:3: (this_MethodCallParameters_11= ruleMethodCallParameters )?";
        }
    }
    static final String dfa_15s = "\2\23\2\uffff";
    static final String[] dfa_16s = {
            "\1\1\1\uffff\10\3\1\uffff\1\2\1\uffff\2\3",
            "\1\1\1\uffff\10\3\1\uffff\1\2\1\uffff\2\3",
            "",
            ""
    };
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final short[][] dfa_16 = unpackEncodedStringArray(dfa_16s);

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_3;
            this.max = dfa_15;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_16;
        }
        public String getDescription() {
            return "550:1: ( (this_SPACE_3= RULE_SPACE )* this_LF_4= RULE_LF )?";
        }
    }
    static final String dfa_17s = "\17\uffff";
    static final String dfa_18s = "\1\uffff\1\14\1\16\6\uffff\1\10\1\uffff\1\14\1\uffff\1\16\1\uffff";
    static final String dfa_19s = "\3\5\6\uffff\1\5\1\uffff\1\5\1\uffff\1\5\1\uffff";
    static final String dfa_20s = "\1\23\2\105\6\uffff\1\105\1\uffff\1\105\1\uffff\1\105\1\uffff";
    static final String dfa_21s = "\3\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\uffff\1\11\1\uffff\1\1\1\uffff\1\2";
    static final String dfa_22s = "\17\uffff}>";
    static final String[] dfa_23s = {
            "\1\12\1\uffff\1\2\1\11\1\1\1\6\1\10\1\4\1\3\4\uffff\1\5\1\7",
            "\1\13\14\14\2\uffff\5\14\22\uffff\1\14\3\uffff\1\12\26\14",
            "\1\15\14\16\2\uffff\5\16\22\uffff\1\16\3\uffff\1\12\26\16",
            "",
            "",
            "",
            "",
            "",
            "",
            "\24\10\22\uffff\3\10\1\12\1\uffff\26\10",
            "",
            "\1\13\14\14\2\uffff\5\14\22\uffff\1\14\3\uffff\1\12\26\14",
            "",
            "\1\15\14\16\2\uffff\5\16\22\uffff\1\16\3\uffff\1\12\26\16",
            ""
    };

    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final char[] dfa_19 = DFA.unpackEncodedStringToUnsignedChars(dfa_19s);
    static final char[] dfa_20 = DFA.unpackEncodedStringToUnsignedChars(dfa_20s);
    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);
    static final short[][] dfa_23 = unpackEncodedStringArray(dfa_23s);

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = dfa_17;
            this.eof = dfa_18;
            this.min = dfa_19;
            this.max = dfa_20;
            this.accept = dfa_21;
            this.special = dfa_22;
            this.transition = dfa_23;
        }
        public String getDescription() {
            return "603:1: (this_SYMBOL_0= RULE_SYMBOL | this_STRING_1= RULE_STRING | this_ARRAY_BLOCK_2= RULE_ARRAY_BLOCK | this_PARENTHESIS_BLOCK_3= RULE_PARENTHESIS_BLOCK | this_DECIMAL_4= RULE_DECIMAL | this_INT_5= RULE_INT | this_REGEXP_6= RULE_REGEXP | this_MethodChainCall_7= ruleMethodChainCall | this_IgnoredHashKeyValue_8= ruleIgnoredHashKeyValue )";
        }
    }
    static final String dfa_24s = "\12\uffff";
    static final String dfa_25s = "\1\7\11\uffff";
    static final String dfa_26s = "\1\23\11\uffff";
    static final String dfa_27s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11";
    static final String dfa_28s = "\12\uffff}>";
    static final String[] dfa_29s = {
            "\1\2\1\10\1\1\1\6\1\7\1\10\1\4\1\3\3\uffff\1\5\1\11",
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

    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final char[] dfa_25 = DFA.unpackEncodedStringToUnsignedChars(dfa_25s);
    static final char[] dfa_26 = DFA.unpackEncodedStringToUnsignedChars(dfa_26s);
    static final short[] dfa_27 = DFA.unpackEncodedString(dfa_27s);
    static final short[] dfa_28 = DFA.unpackEncodedString(dfa_28s);
    static final short[][] dfa_29 = unpackEncodedStringArray(dfa_29s);

    class DFA48 extends DFA {

        public DFA48(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 48;
            this.eot = dfa_24;
            this.eof = dfa_24;
            this.min = dfa_25;
            this.max = dfa_26;
            this.accept = dfa_27;
            this.special = dfa_28;
            this.transition = dfa_29;
        }
        public String getDescription() {
            return "1194:3: (this_SYMBOL_8= RULE_SYMBOL | this_STRING_9= RULE_STRING | this_BRACKET_BLOCK_10= RULE_BRACKET_BLOCK | this_ARRAY_BLOCK_11= RULE_ARRAY_BLOCK | this_DECIMAL_12= RULE_DECIMAL | this_INT_13= RULE_INT | this_INT_METHOD_14= RULE_INT_METHOD | this_MethodChainCall_15= ruleMethodChainCall | this_REGEXP_16= RULE_REGEXP )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000080001F03FE2L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000080000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000001F03FE2L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000200001FDFFE2L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001FDFFE2L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000001C022L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000018022L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000010022L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000020022L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001FD7FE0L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000000000002A0L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000000000103A0L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000000003A0L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000001F47FE0L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000800000000020L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000001FC7FE0L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000011022L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0003000000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0xFFFF080000000002L,0x000000000000003FL});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0002000000000002L});

}