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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_CLASS_WORD", "RULE_SPACE", "RULE_END_WORD", "RULE_ID", "RULE_PARENTHESIS_BLOCK", "RULE_BRACKET_BLOCK", "RULE_HAS_MANY_WORD", "RULE_SYMBOL", "RULE_STRING", "RULE_SL_COMMENT", "RULE_HAS_AND_BELONGS_TO_MANY_WORD", "RULE_BELONGS_TO_WORD", "RULE_ARRAY_BLOCK", "RULE_DEF_WORD", "RULE_UNTIL_END", "RULE_MODULE_WORD", "RULE_ML_COMMENT", "RULE_WS", "RULE_INT", "RULE_ANY_OTHER", "'<'", "'::'", "'.'", "','", "':'", "'=>'", "'?'", "'='"
    };
    public static final int RULE_HAS_MANY_WORD=10;
    public static final int RULE_CLASS_WORD=4;
    public static final int RULE_PARENTHESIS_BLOCK=8;
    public static final int RULE_STRING=12;
    public static final int RULE_UNTIL_END=18;
    public static final int RULE_SL_COMMENT=13;
    public static final int RULE_HAS_AND_BELONGS_TO_MANY_WORD=14;
    public static final int RULE_SPACE=5;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_ARRAY_BLOCK=16;
    public static final int RULE_ID=7;
    public static final int RULE_WS=21;
    public static final int RULE_ANY_OTHER=23;
    public static final int RULE_MODULE_WORD=19;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=22;
    public static final int T__29=29;
    public static final int RULE_BRACKET_BLOCK=9;
    public static final int RULE_ML_COMMENT=20;
    public static final int RULE_SYMBOL=11;
    public static final int RULE_DEF_WORD=17;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_END_WORD=6;
    public static final int RULE_BELONGS_TO_WORD=15;

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
    // InternalRails.g:76:1: ruleClass returns [EObject current=null] : (this_CLASS_WORD_0= RULE_CLASS_WORD (this_SPACE_1= RULE_SPACE )* ( (lv_name_2_0= ruleNamespacedModuleName ) ) ( (this_SPACE_3= RULE_SPACE )* otherlv_4= '<' (this_SPACE_5= RULE_SPACE )* ( (lv_superType_6_0= ruleNamespacedModuleName ) ) )? (this_SPACE_7= RULE_SPACE )* ( (lv_classElements_8_0= ruleClassElement ) )* this_END_WORD_9= RULE_END_WORD ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token this_CLASS_WORD_0=null;
        Token this_SPACE_1=null;
        Token this_SPACE_3=null;
        Token otherlv_4=null;
        Token this_SPACE_5=null;
        Token this_SPACE_7=null;
        Token this_END_WORD_9=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_superType_6_0 = null;

        EObject lv_classElements_8_0 = null;


         enterRule(); 
            
        try {
            // InternalRails.g:79:28: ( (this_CLASS_WORD_0= RULE_CLASS_WORD (this_SPACE_1= RULE_SPACE )* ( (lv_name_2_0= ruleNamespacedModuleName ) ) ( (this_SPACE_3= RULE_SPACE )* otherlv_4= '<' (this_SPACE_5= RULE_SPACE )* ( (lv_superType_6_0= ruleNamespacedModuleName ) ) )? (this_SPACE_7= RULE_SPACE )* ( (lv_classElements_8_0= ruleClassElement ) )* this_END_WORD_9= RULE_END_WORD ) )
            // InternalRails.g:80:1: (this_CLASS_WORD_0= RULE_CLASS_WORD (this_SPACE_1= RULE_SPACE )* ( (lv_name_2_0= ruleNamespacedModuleName ) ) ( (this_SPACE_3= RULE_SPACE )* otherlv_4= '<' (this_SPACE_5= RULE_SPACE )* ( (lv_superType_6_0= ruleNamespacedModuleName ) ) )? (this_SPACE_7= RULE_SPACE )* ( (lv_classElements_8_0= ruleClassElement ) )* this_END_WORD_9= RULE_END_WORD )
            {
            // InternalRails.g:80:1: (this_CLASS_WORD_0= RULE_CLASS_WORD (this_SPACE_1= RULE_SPACE )* ( (lv_name_2_0= ruleNamespacedModuleName ) ) ( (this_SPACE_3= RULE_SPACE )* otherlv_4= '<' (this_SPACE_5= RULE_SPACE )* ( (lv_superType_6_0= ruleNamespacedModuleName ) ) )? (this_SPACE_7= RULE_SPACE )* ( (lv_classElements_8_0= ruleClassElement ) )* this_END_WORD_9= RULE_END_WORD )
            // InternalRails.g:80:2: this_CLASS_WORD_0= RULE_CLASS_WORD (this_SPACE_1= RULE_SPACE )* ( (lv_name_2_0= ruleNamespacedModuleName ) ) ( (this_SPACE_3= RULE_SPACE )* otherlv_4= '<' (this_SPACE_5= RULE_SPACE )* ( (lv_superType_6_0= ruleNamespacedModuleName ) ) )? (this_SPACE_7= RULE_SPACE )* ( (lv_classElements_8_0= ruleClassElement ) )* this_END_WORD_9= RULE_END_WORD
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

                    otherlv_4=(Token)match(input,24,FOLLOW_3); if (state.failed) return current;
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

                if ( (LA6_0==RULE_HAS_MANY_WORD||(LA6_0>=RULE_HAS_AND_BELONGS_TO_MANY_WORD && LA6_0<=RULE_BELONGS_TO_WORD)||LA6_0==RULE_DEF_WORD) ) {
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
            	    pushFollow(FOLLOW_7);
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

            this_END_WORD_9=(Token)match(input,RULE_END_WORD,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_END_WORD_9, grammarAccess.getClassAccess().getEND_WORDTerminalRuleCall_6()); 
                  
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
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleNamespacedModuleName"
    // InternalRails.g:170:1: entryRuleNamespacedModuleName returns [String current=null] : iv_ruleNamespacedModuleName= ruleNamespacedModuleName EOF ;
    public final String entryRuleNamespacedModuleName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNamespacedModuleName = null;


        try {
            // InternalRails.g:171:2: (iv_ruleNamespacedModuleName= ruleNamespacedModuleName EOF )
            // InternalRails.g:172:2: iv_ruleNamespacedModuleName= ruleNamespacedModuleName EOF
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
    // InternalRails.g:179:1: ruleNamespacedModuleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID kw= '::' )* this_ID_2= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleNamespacedModuleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // InternalRails.g:182:28: ( ( (this_ID_0= RULE_ID kw= '::' )* this_ID_2= RULE_ID ) )
            // InternalRails.g:183:1: ( (this_ID_0= RULE_ID kw= '::' )* this_ID_2= RULE_ID )
            {
            // InternalRails.g:183:1: ( (this_ID_0= RULE_ID kw= '::' )* this_ID_2= RULE_ID )
            // InternalRails.g:183:2: (this_ID_0= RULE_ID kw= '::' )* this_ID_2= RULE_ID
            {
            // InternalRails.g:183:2: (this_ID_0= RULE_ID kw= '::' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1==25) ) {
                        alt7=1;
                    }


                }


                switch (alt7) {
            	case 1 :
            	    // InternalRails.g:183:7: this_ID_0= RULE_ID kw= '::'
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_0, grammarAccess.getNamespacedModuleNameAccess().getIDTerminalRuleCall_0_0()); 
            	          
            	    }
            	    kw=(Token)match(input,25,FOLLOW_9); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getNamespacedModuleNameAccess().getColonColonKeyword_0_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalRails.g:211:1: entryRuleMethodChainCall returns [String current=null] : iv_ruleMethodChainCall= ruleMethodChainCall EOF ;
    public final String entryRuleMethodChainCall() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMethodChainCall = null;


        try {
            // InternalRails.g:212:2: (iv_ruleMethodChainCall= ruleMethodChainCall EOF )
            // InternalRails.g:213:2: iv_ruleMethodChainCall= ruleMethodChainCall EOF
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
    // InternalRails.g:220:1: ruleMethodChainCall returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NamespacedModuleName_0= ruleNamespacedModuleName (kw= '.' this_ID_2= RULE_ID )* ( ( RULE_SPACE )=>this_SPACE_3= RULE_SPACE )* (this_PARENTHESIS_BLOCK_4= RULE_PARENTHESIS_BLOCK )? ( ( RULE_SPACE )=>this_SPACE_5= RULE_SPACE )* (this_BRACKET_BLOCK_6= RULE_BRACKET_BLOCK )? ) ;
    public final AntlrDatatypeRuleToken ruleMethodChainCall() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_2=null;
        Token this_SPACE_3=null;
        Token this_PARENTHESIS_BLOCK_4=null;
        Token this_SPACE_5=null;
        Token this_BRACKET_BLOCK_6=null;
        AntlrDatatypeRuleToken this_NamespacedModuleName_0 = null;


         enterRule(); 
            
        try {
            // InternalRails.g:223:28: ( (this_NamespacedModuleName_0= ruleNamespacedModuleName (kw= '.' this_ID_2= RULE_ID )* ( ( RULE_SPACE )=>this_SPACE_3= RULE_SPACE )* (this_PARENTHESIS_BLOCK_4= RULE_PARENTHESIS_BLOCK )? ( ( RULE_SPACE )=>this_SPACE_5= RULE_SPACE )* (this_BRACKET_BLOCK_6= RULE_BRACKET_BLOCK )? ) )
            // InternalRails.g:224:1: (this_NamespacedModuleName_0= ruleNamespacedModuleName (kw= '.' this_ID_2= RULE_ID )* ( ( RULE_SPACE )=>this_SPACE_3= RULE_SPACE )* (this_PARENTHESIS_BLOCK_4= RULE_PARENTHESIS_BLOCK )? ( ( RULE_SPACE )=>this_SPACE_5= RULE_SPACE )* (this_BRACKET_BLOCK_6= RULE_BRACKET_BLOCK )? )
            {
            // InternalRails.g:224:1: (this_NamespacedModuleName_0= ruleNamespacedModuleName (kw= '.' this_ID_2= RULE_ID )* ( ( RULE_SPACE )=>this_SPACE_3= RULE_SPACE )* (this_PARENTHESIS_BLOCK_4= RULE_PARENTHESIS_BLOCK )? ( ( RULE_SPACE )=>this_SPACE_5= RULE_SPACE )* (this_BRACKET_BLOCK_6= RULE_BRACKET_BLOCK )? )
            // InternalRails.g:225:5: this_NamespacedModuleName_0= ruleNamespacedModuleName (kw= '.' this_ID_2= RULE_ID )* ( ( RULE_SPACE )=>this_SPACE_3= RULE_SPACE )* (this_PARENTHESIS_BLOCK_4= RULE_PARENTHESIS_BLOCK )? ( ( RULE_SPACE )=>this_SPACE_5= RULE_SPACE )* (this_BRACKET_BLOCK_6= RULE_BRACKET_BLOCK )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMethodChainCallAccess().getNamespacedModuleNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_10);
            this_NamespacedModuleName_0=ruleNamespacedModuleName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_NamespacedModuleName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalRails.g:235:1: (kw= '.' this_ID_2= RULE_ID )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==26) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalRails.g:236:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,26,FOLLOW_9); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getMethodChainCallAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getMethodChainCallAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalRails.g:248:3: ( ( RULE_SPACE )=>this_SPACE_3= RULE_SPACE )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_SPACE) ) {
                    int LA9_2 = input.LA(2);

                    if ( (synpred1_InternalRails()) ) {
                        alt9=1;
                    }


                }


                switch (alt9) {
            	case 1 :
            	    // InternalRails.g:248:4: ( RULE_SPACE )=>this_SPACE_3= RULE_SPACE
            	    {
            	    this_SPACE_3=(Token)match(input,RULE_SPACE,FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_SPACE_3);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SPACE_3, grammarAccess.getMethodChainCallAccess().getSPACETerminalRuleCall_2()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalRails.g:255:3: (this_PARENTHESIS_BLOCK_4= RULE_PARENTHESIS_BLOCK )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_PARENTHESIS_BLOCK) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalRails.g:255:8: this_PARENTHESIS_BLOCK_4= RULE_PARENTHESIS_BLOCK
                    {
                    this_PARENTHESIS_BLOCK_4=(Token)match(input,RULE_PARENTHESIS_BLOCK,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_PARENTHESIS_BLOCK_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PARENTHESIS_BLOCK_4, grammarAccess.getMethodChainCallAccess().getPARENTHESIS_BLOCKTerminalRuleCall_3()); 
                          
                    }

                    }
                    break;

            }

            // InternalRails.g:262:3: ( ( RULE_SPACE )=>this_SPACE_5= RULE_SPACE )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_SPACE) ) {
                    int LA11_2 = input.LA(2);

                    if ( (synpred2_InternalRails()) ) {
                        alt11=1;
                    }


                }


                switch (alt11) {
            	case 1 :
            	    // InternalRails.g:262:4: ( RULE_SPACE )=>this_SPACE_5= RULE_SPACE
            	    {
            	    this_SPACE_5=(Token)match(input,RULE_SPACE,FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_SPACE_5);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SPACE_5, grammarAccess.getMethodChainCallAccess().getSPACETerminalRuleCall_4()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // InternalRails.g:269:3: (this_BRACKET_BLOCK_6= RULE_BRACKET_BLOCK )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_BRACKET_BLOCK) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalRails.g:269:8: this_BRACKET_BLOCK_6= RULE_BRACKET_BLOCK
                    {
                    this_BRACKET_BLOCK_6=(Token)match(input,RULE_BRACKET_BLOCK,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BRACKET_BLOCK_6);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BRACKET_BLOCK_6, grammarAccess.getMethodChainCallAccess().getBRACKET_BLOCKTerminalRuleCall_5()); 
                          
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


    // $ANTLR start "entryRuleClassElement"
    // InternalRails.g:284:1: entryRuleClassElement returns [EObject current=null] : iv_ruleClassElement= ruleClassElement EOF ;
    public final EObject entryRuleClassElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassElement = null;


        try {
            // InternalRails.g:285:2: (iv_ruleClassElement= ruleClassElement EOF )
            // InternalRails.g:286:2: iv_ruleClassElement= ruleClassElement EOF
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
    // InternalRails.g:293:1: ruleClassElement returns [EObject current=null] : (this_Method_0= ruleMethod | this_Relationship_1= ruleRelationship ) ;
    public final EObject ruleClassElement() throws RecognitionException {
        EObject current = null;

        EObject this_Method_0 = null;

        EObject this_Relationship_1 = null;


         enterRule(); 
            
        try {
            // InternalRails.g:296:28: ( (this_Method_0= ruleMethod | this_Relationship_1= ruleRelationship ) )
            // InternalRails.g:297:1: (this_Method_0= ruleMethod | this_Relationship_1= ruleRelationship )
            {
            // InternalRails.g:297:1: (this_Method_0= ruleMethod | this_Relationship_1= ruleRelationship )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_DEF_WORD) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_HAS_MANY_WORD||(LA13_0>=RULE_HAS_AND_BELONGS_TO_MANY_WORD && LA13_0<=RULE_BELONGS_TO_WORD)) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalRails.g:298:5: this_Method_0= ruleMethod
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
                    // InternalRails.g:308:5: this_Relationship_1= ruleRelationship
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


    // $ANTLR start "entryRuleRelationship"
    // InternalRails.g:324:1: entryRuleRelationship returns [EObject current=null] : iv_ruleRelationship= ruleRelationship EOF ;
    public final EObject entryRuleRelationship() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationship = null;


        try {
            // InternalRails.g:325:2: (iv_ruleRelationship= ruleRelationship EOF )
            // InternalRails.g:326:2: iv_ruleRelationship= ruleRelationship EOF
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
    // InternalRails.g:333:1: ruleRelationship returns [EObject current=null] : (this_HasMany_0= ruleHasMany | this_HasAndBelongsToMany_1= ruleHasAndBelongsToMany | this_BelongsTo_2= ruleBelongsTo ) ;
    public final EObject ruleRelationship() throws RecognitionException {
        EObject current = null;

        EObject this_HasMany_0 = null;

        EObject this_HasAndBelongsToMany_1 = null;

        EObject this_BelongsTo_2 = null;


         enterRule(); 
            
        try {
            // InternalRails.g:336:28: ( (this_HasMany_0= ruleHasMany | this_HasAndBelongsToMany_1= ruleHasAndBelongsToMany | this_BelongsTo_2= ruleBelongsTo ) )
            // InternalRails.g:337:1: (this_HasMany_0= ruleHasMany | this_HasAndBelongsToMany_1= ruleHasAndBelongsToMany | this_BelongsTo_2= ruleBelongsTo )
            {
            // InternalRails.g:337:1: (this_HasMany_0= ruleHasMany | this_HasAndBelongsToMany_1= ruleHasAndBelongsToMany | this_BelongsTo_2= ruleBelongsTo )
            int alt14=3;
            switch ( input.LA(1) ) {
            case RULE_HAS_MANY_WORD:
                {
                alt14=1;
                }
                break;
            case RULE_HAS_AND_BELONGS_TO_MANY_WORD:
                {
                alt14=2;
                }
                break;
            case RULE_BELONGS_TO_WORD:
                {
                alt14=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalRails.g:338:5: this_HasMany_0= ruleHasMany
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
                    // InternalRails.g:348:5: this_HasAndBelongsToMany_1= ruleHasAndBelongsToMany
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRelationshipAccess().getHasAndBelongsToManyParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_HasAndBelongsToMany_1=ruleHasAndBelongsToMany();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_HasAndBelongsToMany_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalRails.g:358:5: this_BelongsTo_2= ruleBelongsTo
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRelationshipAccess().getBelongsToParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_BelongsTo_2=ruleBelongsTo();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BelongsTo_2; 
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
    // InternalRails.g:374:1: entryRuleHasMany returns [EObject current=null] : iv_ruleHasMany= ruleHasMany EOF ;
    public final EObject entryRuleHasMany() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHasMany = null;


        try {
            // InternalRails.g:375:2: (iv_ruleHasMany= ruleHasMany EOF )
            // InternalRails.g:376:2: iv_ruleHasMany= ruleHasMany EOF
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
    // InternalRails.g:383:1: ruleHasMany returns [EObject current=null] : (this_HAS_MANY_WORD_0= RULE_HAS_MANY_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )* (this_SL_COMMENT_5= RULE_SL_COMMENT )? ) ;
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
            // InternalRails.g:386:28: ( (this_HAS_MANY_WORD_0= RULE_HAS_MANY_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )* (this_SL_COMMENT_5= RULE_SL_COMMENT )? ) )
            // InternalRails.g:387:1: (this_HAS_MANY_WORD_0= RULE_HAS_MANY_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )* (this_SL_COMMENT_5= RULE_SL_COMMENT )? )
            {
            // InternalRails.g:387:1: (this_HAS_MANY_WORD_0= RULE_HAS_MANY_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )* (this_SL_COMMENT_5= RULE_SL_COMMENT )? )
            // InternalRails.g:387:2: this_HAS_MANY_WORD_0= RULE_HAS_MANY_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )* (this_SL_COMMENT_5= RULE_SL_COMMENT )?
            {
            this_HAS_MANY_WORD_0=(Token)match(input,RULE_HAS_MANY_WORD,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_HAS_MANY_WORD_0, grammarAccess.getHasManyAccess().getHAS_MANY_WORDTerminalRuleCall_0()); 
                  
            }
            // InternalRails.g:391:1: (this_SPACE_1= RULE_SPACE )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_SPACE) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalRails.g:391:2: this_SPACE_1= RULE_SPACE
            	    {
            	    this_SPACE_1=(Token)match(input,RULE_SPACE,FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SPACE_1, grammarAccess.getHasManyAccess().getSPACETerminalRuleCall_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // InternalRails.g:395:3: ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) )
            // InternalRails.g:396:1: ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) )
            {
            // InternalRails.g:396:1: ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) )
            // InternalRails.g:397:1: (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING )
            {
            // InternalRails.g:397:1: (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_SYMBOL) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_STRING) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalRails.g:398:3: lv_name_2_1= RULE_SYMBOL
                    {
                    lv_name_2_1=(Token)match(input,RULE_SYMBOL,FOLLOW_14); if (state.failed) return current;
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
                    // InternalRails.g:413:8: lv_name_2_2= RULE_STRING
                    {
                    lv_name_2_2=(Token)match(input,RULE_STRING,FOLLOW_14); if (state.failed) return current;
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

            // InternalRails.g:431:2: (this_SPACE_3= RULE_SPACE )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_SPACE) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalRails.g:431:3: this_SPACE_3= RULE_SPACE
            	    {
            	    this_SPACE_3=(Token)match(input,RULE_SPACE,FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SPACE_3, grammarAccess.getHasManyAccess().getSPACETerminalRuleCall_3()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            // InternalRails.g:435:3: ( (lv_options_4_0= ruleHashKeyValue ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==27) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalRails.g:436:1: (lv_options_4_0= ruleHashKeyValue )
            	    {
            	    // InternalRails.g:436:1: (lv_options_4_0= ruleHashKeyValue )
            	    // InternalRails.g:437:3: lv_options_4_0= ruleHashKeyValue
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getHasManyAccess().getOptionsHashKeyValueParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_15);
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
            	    break loop18;
                }
            } while (true);

            // InternalRails.g:453:3: (this_SL_COMMENT_5= RULE_SL_COMMENT )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_SL_COMMENT) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalRails.g:453:4: this_SL_COMMENT_5= RULE_SL_COMMENT
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


    // $ANTLR start "entryRuleHasAndBelongsToMany"
    // InternalRails.g:465:1: entryRuleHasAndBelongsToMany returns [EObject current=null] : iv_ruleHasAndBelongsToMany= ruleHasAndBelongsToMany EOF ;
    public final EObject entryRuleHasAndBelongsToMany() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHasAndBelongsToMany = null;


        try {
            // InternalRails.g:466:2: (iv_ruleHasAndBelongsToMany= ruleHasAndBelongsToMany EOF )
            // InternalRails.g:467:2: iv_ruleHasAndBelongsToMany= ruleHasAndBelongsToMany EOF
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
    // InternalRails.g:474:1: ruleHasAndBelongsToMany returns [EObject current=null] : (this_HAS_AND_BELONGS_TO_MANY_WORD_0= RULE_HAS_AND_BELONGS_TO_MANY_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )* ) ;
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
            // InternalRails.g:477:28: ( (this_HAS_AND_BELONGS_TO_MANY_WORD_0= RULE_HAS_AND_BELONGS_TO_MANY_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )* ) )
            // InternalRails.g:478:1: (this_HAS_AND_BELONGS_TO_MANY_WORD_0= RULE_HAS_AND_BELONGS_TO_MANY_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )* )
            {
            // InternalRails.g:478:1: (this_HAS_AND_BELONGS_TO_MANY_WORD_0= RULE_HAS_AND_BELONGS_TO_MANY_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )* )
            // InternalRails.g:478:2: this_HAS_AND_BELONGS_TO_MANY_WORD_0= RULE_HAS_AND_BELONGS_TO_MANY_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )*
            {
            this_HAS_AND_BELONGS_TO_MANY_WORD_0=(Token)match(input,RULE_HAS_AND_BELONGS_TO_MANY_WORD,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_HAS_AND_BELONGS_TO_MANY_WORD_0, grammarAccess.getHasAndBelongsToManyAccess().getHAS_AND_BELONGS_TO_MANY_WORDTerminalRuleCall_0()); 
                  
            }
            // InternalRails.g:482:1: (this_SPACE_1= RULE_SPACE )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_SPACE) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalRails.g:482:2: this_SPACE_1= RULE_SPACE
            	    {
            	    this_SPACE_1=(Token)match(input,RULE_SPACE,FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SPACE_1, grammarAccess.getHasAndBelongsToManyAccess().getSPACETerminalRuleCall_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            // InternalRails.g:486:3: ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) )
            // InternalRails.g:487:1: ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) )
            {
            // InternalRails.g:487:1: ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) )
            // InternalRails.g:488:1: (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING )
            {
            // InternalRails.g:488:1: (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_SYMBOL) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_STRING) ) {
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
                    // InternalRails.g:489:3: lv_name_2_1= RULE_SYMBOL
                    {
                    lv_name_2_1=(Token)match(input,RULE_SYMBOL,FOLLOW_16); if (state.failed) return current;
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
                    // InternalRails.g:504:8: lv_name_2_2= RULE_STRING
                    {
                    lv_name_2_2=(Token)match(input,RULE_STRING,FOLLOW_16); if (state.failed) return current;
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

            // InternalRails.g:522:2: (this_SPACE_3= RULE_SPACE )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_SPACE) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalRails.g:522:3: this_SPACE_3= RULE_SPACE
            	    {
            	    this_SPACE_3=(Token)match(input,RULE_SPACE,FOLLOW_16); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SPACE_3, grammarAccess.getHasAndBelongsToManyAccess().getSPACETerminalRuleCall_3()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            // InternalRails.g:526:3: ( (lv_options_4_0= ruleHashKeyValue ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==27) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalRails.g:527:1: (lv_options_4_0= ruleHashKeyValue )
            	    {
            	    // InternalRails.g:527:1: (lv_options_4_0= ruleHashKeyValue )
            	    // InternalRails.g:528:3: lv_options_4_0= ruleHashKeyValue
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getHasAndBelongsToManyAccess().getOptionsHashKeyValueParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_17);
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
    // $ANTLR end "ruleHasAndBelongsToMany"


    // $ANTLR start "entryRuleBelongsTo"
    // InternalRails.g:552:1: entryRuleBelongsTo returns [EObject current=null] : iv_ruleBelongsTo= ruleBelongsTo EOF ;
    public final EObject entryRuleBelongsTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBelongsTo = null;


        try {
            // InternalRails.g:553:2: (iv_ruleBelongsTo= ruleBelongsTo EOF )
            // InternalRails.g:554:2: iv_ruleBelongsTo= ruleBelongsTo EOF
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
    // InternalRails.g:561:1: ruleBelongsTo returns [EObject current=null] : (this_BELONGS_TO_WORD_0= RULE_BELONGS_TO_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )* ) ;
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
            // InternalRails.g:564:28: ( (this_BELONGS_TO_WORD_0= RULE_BELONGS_TO_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )* ) )
            // InternalRails.g:565:1: (this_BELONGS_TO_WORD_0= RULE_BELONGS_TO_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )* )
            {
            // InternalRails.g:565:1: (this_BELONGS_TO_WORD_0= RULE_BELONGS_TO_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )* )
            // InternalRails.g:565:2: this_BELONGS_TO_WORD_0= RULE_BELONGS_TO_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )*
            {
            this_BELONGS_TO_WORD_0=(Token)match(input,RULE_BELONGS_TO_WORD,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_BELONGS_TO_WORD_0, grammarAccess.getBelongsToAccess().getBELONGS_TO_WORDTerminalRuleCall_0()); 
                  
            }
            // InternalRails.g:569:1: (this_SPACE_1= RULE_SPACE )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_SPACE) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalRails.g:569:2: this_SPACE_1= RULE_SPACE
            	    {
            	    this_SPACE_1=(Token)match(input,RULE_SPACE,FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SPACE_1, grammarAccess.getBelongsToAccess().getSPACETerminalRuleCall_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            // InternalRails.g:573:3: ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) )
            // InternalRails.g:574:1: ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) )
            {
            // InternalRails.g:574:1: ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) )
            // InternalRails.g:575:1: (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING )
            {
            // InternalRails.g:575:1: (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING )
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
                    // InternalRails.g:576:3: lv_name_2_1= RULE_SYMBOL
                    {
                    lv_name_2_1=(Token)match(input,RULE_SYMBOL,FOLLOW_16); if (state.failed) return current;
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
                    // InternalRails.g:591:8: lv_name_2_2= RULE_STRING
                    {
                    lv_name_2_2=(Token)match(input,RULE_STRING,FOLLOW_16); if (state.failed) return current;
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

            // InternalRails.g:609:2: (this_SPACE_3= RULE_SPACE )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_SPACE) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalRails.g:609:3: this_SPACE_3= RULE_SPACE
            	    {
            	    this_SPACE_3=(Token)match(input,RULE_SPACE,FOLLOW_16); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SPACE_3, grammarAccess.getBelongsToAccess().getSPACETerminalRuleCall_3()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            // InternalRails.g:613:3: ( (lv_options_4_0= ruleHashKeyValue ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==27) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalRails.g:614:1: (lv_options_4_0= ruleHashKeyValue )
            	    {
            	    // InternalRails.g:614:1: (lv_options_4_0= ruleHashKeyValue )
            	    // InternalRails.g:615:3: lv_options_4_0= ruleHashKeyValue
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBelongsToAccess().getOptionsHashKeyValueParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_17);
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
    // $ANTLR end "ruleBelongsTo"


    // $ANTLR start "entryRuleHashKeyValue"
    // InternalRails.g:639:1: entryRuleHashKeyValue returns [EObject current=null] : iv_ruleHashKeyValue= ruleHashKeyValue EOF ;
    public final EObject entryRuleHashKeyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHashKeyValue = null;


        try {
            // InternalRails.g:640:2: (iv_ruleHashKeyValue= ruleHashKeyValue EOF )
            // InternalRails.g:641:2: iv_ruleHashKeyValue= ruleHashKeyValue EOF
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
    // InternalRails.g:648:1: ruleHashKeyValue returns [EObject current=null] : (otherlv_0= ',' (this_SPACE_1= RULE_SPACE )* ( ( ( (lv_key_2_0= RULE_ID ) ) otherlv_3= ':' ) | ( ( ( (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING ) ) ) (this_SPACE_5= RULE_SPACE )* otherlv_6= '=>' ) ) (this_SPACE_7= RULE_SPACE )* ( ( (lv_value_8_1= RULE_SYMBOL | lv_value_8_2= RULE_STRING | lv_value_8_3= RULE_BRACKET_BLOCK | lv_value_8_4= RULE_ARRAY_BLOCK | lv_value_8_5= ruleMethodChainCall ) ) ) (this_SPACE_9= RULE_SPACE )* ) ;
    public final EObject ruleHashKeyValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
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
        Token this_SPACE_9=null;
        AntlrDatatypeRuleToken lv_value_8_5 = null;


         enterRule(); 
            
        try {
            // InternalRails.g:651:28: ( (otherlv_0= ',' (this_SPACE_1= RULE_SPACE )* ( ( ( (lv_key_2_0= RULE_ID ) ) otherlv_3= ':' ) | ( ( ( (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING ) ) ) (this_SPACE_5= RULE_SPACE )* otherlv_6= '=>' ) ) (this_SPACE_7= RULE_SPACE )* ( ( (lv_value_8_1= RULE_SYMBOL | lv_value_8_2= RULE_STRING | lv_value_8_3= RULE_BRACKET_BLOCK | lv_value_8_4= RULE_ARRAY_BLOCK | lv_value_8_5= ruleMethodChainCall ) ) ) (this_SPACE_9= RULE_SPACE )* ) )
            // InternalRails.g:652:1: (otherlv_0= ',' (this_SPACE_1= RULE_SPACE )* ( ( ( (lv_key_2_0= RULE_ID ) ) otherlv_3= ':' ) | ( ( ( (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING ) ) ) (this_SPACE_5= RULE_SPACE )* otherlv_6= '=>' ) ) (this_SPACE_7= RULE_SPACE )* ( ( (lv_value_8_1= RULE_SYMBOL | lv_value_8_2= RULE_STRING | lv_value_8_3= RULE_BRACKET_BLOCK | lv_value_8_4= RULE_ARRAY_BLOCK | lv_value_8_5= ruleMethodChainCall ) ) ) (this_SPACE_9= RULE_SPACE )* )
            {
            // InternalRails.g:652:1: (otherlv_0= ',' (this_SPACE_1= RULE_SPACE )* ( ( ( (lv_key_2_0= RULE_ID ) ) otherlv_3= ':' ) | ( ( ( (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING ) ) ) (this_SPACE_5= RULE_SPACE )* otherlv_6= '=>' ) ) (this_SPACE_7= RULE_SPACE )* ( ( (lv_value_8_1= RULE_SYMBOL | lv_value_8_2= RULE_STRING | lv_value_8_3= RULE_BRACKET_BLOCK | lv_value_8_4= RULE_ARRAY_BLOCK | lv_value_8_5= ruleMethodChainCall ) ) ) (this_SPACE_9= RULE_SPACE )* )
            // InternalRails.g:652:3: otherlv_0= ',' (this_SPACE_1= RULE_SPACE )* ( ( ( (lv_key_2_0= RULE_ID ) ) otherlv_3= ':' ) | ( ( ( (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING ) ) ) (this_SPACE_5= RULE_SPACE )* otherlv_6= '=>' ) ) (this_SPACE_7= RULE_SPACE )* ( ( (lv_value_8_1= RULE_SYMBOL | lv_value_8_2= RULE_STRING | lv_value_8_3= RULE_BRACKET_BLOCK | lv_value_8_4= RULE_ARRAY_BLOCK | lv_value_8_5= ruleMethodChainCall ) ) ) (this_SPACE_9= RULE_SPACE )*
            {
            otherlv_0=(Token)match(input,27,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getHashKeyValueAccess().getCommaKeyword_0());
                  
            }
            // InternalRails.g:656:1: (this_SPACE_1= RULE_SPACE )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_SPACE) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalRails.g:656:2: this_SPACE_1= RULE_SPACE
            	    {
            	    this_SPACE_1=(Token)match(input,RULE_SPACE,FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SPACE_1, grammarAccess.getHashKeyValueAccess().getSPACETerminalRuleCall_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            // InternalRails.g:660:3: ( ( ( (lv_key_2_0= RULE_ID ) ) otherlv_3= ':' ) | ( ( ( (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING ) ) ) (this_SPACE_5= RULE_SPACE )* otherlv_6= '=>' ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_ID) ) {
                alt31=1;
            }
            else if ( ((LA31_0>=RULE_SYMBOL && LA31_0<=RULE_STRING)) ) {
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
                    // InternalRails.g:660:4: ( ( (lv_key_2_0= RULE_ID ) ) otherlv_3= ':' )
                    {
                    // InternalRails.g:660:4: ( ( (lv_key_2_0= RULE_ID ) ) otherlv_3= ':' )
                    // InternalRails.g:660:5: ( (lv_key_2_0= RULE_ID ) ) otherlv_3= ':'
                    {
                    // InternalRails.g:660:5: ( (lv_key_2_0= RULE_ID ) )
                    // InternalRails.g:661:1: (lv_key_2_0= RULE_ID )
                    {
                    // InternalRails.g:661:1: (lv_key_2_0= RULE_ID )
                    // InternalRails.g:662:3: lv_key_2_0= RULE_ID
                    {
                    lv_key_2_0=(Token)match(input,RULE_ID,FOLLOW_19); if (state.failed) return current;
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

                    otherlv_3=(Token)match(input,28,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getHashKeyValueAccess().getColonKeyword_2_0_1());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalRails.g:683:6: ( ( ( (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING ) ) ) (this_SPACE_5= RULE_SPACE )* otherlv_6= '=>' )
                    {
                    // InternalRails.g:683:6: ( ( ( (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING ) ) ) (this_SPACE_5= RULE_SPACE )* otherlv_6= '=>' )
                    // InternalRails.g:683:7: ( ( (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING ) ) ) (this_SPACE_5= RULE_SPACE )* otherlv_6= '=>'
                    {
                    // InternalRails.g:683:7: ( ( (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING ) ) )
                    // InternalRails.g:684:1: ( (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING ) )
                    {
                    // InternalRails.g:684:1: ( (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING ) )
                    // InternalRails.g:685:1: (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING )
                    {
                    // InternalRails.g:685:1: (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING )
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==RULE_SYMBOL) ) {
                        alt29=1;
                    }
                    else if ( (LA29_0==RULE_STRING) ) {
                        alt29=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 29, 0, input);

                        throw nvae;
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalRails.g:686:3: lv_key_4_1= RULE_SYMBOL
                            {
                            lv_key_4_1=(Token)match(input,RULE_SYMBOL,FOLLOW_21); if (state.failed) return current;
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
                            // InternalRails.g:701:8: lv_key_4_2= RULE_STRING
                            {
                            lv_key_4_2=(Token)match(input,RULE_STRING,FOLLOW_21); if (state.failed) return current;
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

                    // InternalRails.g:719:2: (this_SPACE_5= RULE_SPACE )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==RULE_SPACE) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalRails.g:719:3: this_SPACE_5= RULE_SPACE
                    	    {
                    	    this_SPACE_5=(Token)match(input,RULE_SPACE,FOLLOW_21); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_SPACE_5, grammarAccess.getHashKeyValueAccess().getSPACETerminalRuleCall_2_1_1()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,29,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getHashKeyValueAccess().getEqualsSignGreaterThanSignKeyword_2_1_2());
                          
                    }

                    }


                    }
                    break;

            }

            // InternalRails.g:727:3: (this_SPACE_7= RULE_SPACE )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_SPACE) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalRails.g:727:4: this_SPACE_7= RULE_SPACE
            	    {
            	    this_SPACE_7=(Token)match(input,RULE_SPACE,FOLLOW_20); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SPACE_7, grammarAccess.getHashKeyValueAccess().getSPACETerminalRuleCall_3()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            // InternalRails.g:731:3: ( ( (lv_value_8_1= RULE_SYMBOL | lv_value_8_2= RULE_STRING | lv_value_8_3= RULE_BRACKET_BLOCK | lv_value_8_4= RULE_ARRAY_BLOCK | lv_value_8_5= ruleMethodChainCall ) ) )
            // InternalRails.g:732:1: ( (lv_value_8_1= RULE_SYMBOL | lv_value_8_2= RULE_STRING | lv_value_8_3= RULE_BRACKET_BLOCK | lv_value_8_4= RULE_ARRAY_BLOCK | lv_value_8_5= ruleMethodChainCall ) )
            {
            // InternalRails.g:732:1: ( (lv_value_8_1= RULE_SYMBOL | lv_value_8_2= RULE_STRING | lv_value_8_3= RULE_BRACKET_BLOCK | lv_value_8_4= RULE_ARRAY_BLOCK | lv_value_8_5= ruleMethodChainCall ) )
            // InternalRails.g:733:1: (lv_value_8_1= RULE_SYMBOL | lv_value_8_2= RULE_STRING | lv_value_8_3= RULE_BRACKET_BLOCK | lv_value_8_4= RULE_ARRAY_BLOCK | lv_value_8_5= ruleMethodChainCall )
            {
            // InternalRails.g:733:1: (lv_value_8_1= RULE_SYMBOL | lv_value_8_2= RULE_STRING | lv_value_8_3= RULE_BRACKET_BLOCK | lv_value_8_4= RULE_ARRAY_BLOCK | lv_value_8_5= ruleMethodChainCall )
            int alt33=5;
            switch ( input.LA(1) ) {
            case RULE_SYMBOL:
                {
                alt33=1;
                }
                break;
            case RULE_STRING:
                {
                alt33=2;
                }
                break;
            case RULE_BRACKET_BLOCK:
                {
                alt33=3;
                }
                break;
            case RULE_ARRAY_BLOCK:
                {
                alt33=4;
                }
                break;
            case RULE_ID:
                {
                alt33=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalRails.g:734:3: lv_value_8_1= RULE_SYMBOL
                    {
                    lv_value_8_1=(Token)match(input,RULE_SYMBOL,FOLLOW_22); if (state.failed) return current;
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
                    // InternalRails.g:749:8: lv_value_8_2= RULE_STRING
                    {
                    lv_value_8_2=(Token)match(input,RULE_STRING,FOLLOW_22); if (state.failed) return current;
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
                    // InternalRails.g:764:8: lv_value_8_3= RULE_BRACKET_BLOCK
                    {
                    lv_value_8_3=(Token)match(input,RULE_BRACKET_BLOCK,FOLLOW_22); if (state.failed) return current;
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
                    // InternalRails.g:779:8: lv_value_8_4= RULE_ARRAY_BLOCK
                    {
                    lv_value_8_4=(Token)match(input,RULE_ARRAY_BLOCK,FOLLOW_22); if (state.failed) return current;
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
                    // InternalRails.g:794:8: lv_value_8_5= ruleMethodChainCall
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getHashKeyValueAccess().getValueMethodChainCallParserRuleCall_4_0_4()); 
                      	    
                    }
                    pushFollow(FOLLOW_22);
                    lv_value_8_5=ruleMethodChainCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getHashKeyValueRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_8_5, 
                              		"co.gruposaberes.model.Rails.MethodChainCall");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;

            }


            }


            }

            // InternalRails.g:812:2: (this_SPACE_9= RULE_SPACE )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_SPACE) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalRails.g:812:3: this_SPACE_9= RULE_SPACE
            	    {
            	    this_SPACE_9=(Token)match(input,RULE_SPACE,FOLLOW_22); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SPACE_9, grammarAccess.getHashKeyValueAccess().getSPACETerminalRuleCall_5()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop34;
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


    // $ANTLR start "entryRuleMethod"
    // InternalRails.g:824:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // InternalRails.g:825:2: (iv_ruleMethod= ruleMethod EOF )
            // InternalRails.g:826:2: iv_ruleMethod= ruleMethod EOF
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
    // InternalRails.g:833:1: ruleMethod returns [EObject current=null] : (this_DEF_WORD_0= RULE_DEF_WORD (this_SPACE_1= RULE_SPACE )* ( (lv_name_2_0= ruleMethodName ) ) (this_SPACE_3= RULE_SPACE )* (this_PARENTHESIS_BLOCK_4= RULE_PARENTHESIS_BLOCK )? ( ( RULE_UNTIL_END )=>this_UNTIL_END_5= RULE_UNTIL_END ) ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        Token this_DEF_WORD_0=null;
        Token this_SPACE_1=null;
        Token this_SPACE_3=null;
        Token this_PARENTHESIS_BLOCK_4=null;
        Token this_UNTIL_END_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // InternalRails.g:836:28: ( (this_DEF_WORD_0= RULE_DEF_WORD (this_SPACE_1= RULE_SPACE )* ( (lv_name_2_0= ruleMethodName ) ) (this_SPACE_3= RULE_SPACE )* (this_PARENTHESIS_BLOCK_4= RULE_PARENTHESIS_BLOCK )? ( ( RULE_UNTIL_END )=>this_UNTIL_END_5= RULE_UNTIL_END ) ) )
            // InternalRails.g:837:1: (this_DEF_WORD_0= RULE_DEF_WORD (this_SPACE_1= RULE_SPACE )* ( (lv_name_2_0= ruleMethodName ) ) (this_SPACE_3= RULE_SPACE )* (this_PARENTHESIS_BLOCK_4= RULE_PARENTHESIS_BLOCK )? ( ( RULE_UNTIL_END )=>this_UNTIL_END_5= RULE_UNTIL_END ) )
            {
            // InternalRails.g:837:1: (this_DEF_WORD_0= RULE_DEF_WORD (this_SPACE_1= RULE_SPACE )* ( (lv_name_2_0= ruleMethodName ) ) (this_SPACE_3= RULE_SPACE )* (this_PARENTHESIS_BLOCK_4= RULE_PARENTHESIS_BLOCK )? ( ( RULE_UNTIL_END )=>this_UNTIL_END_5= RULE_UNTIL_END ) )
            // InternalRails.g:837:2: this_DEF_WORD_0= RULE_DEF_WORD (this_SPACE_1= RULE_SPACE )* ( (lv_name_2_0= ruleMethodName ) ) (this_SPACE_3= RULE_SPACE )* (this_PARENTHESIS_BLOCK_4= RULE_PARENTHESIS_BLOCK )? ( ( RULE_UNTIL_END )=>this_UNTIL_END_5= RULE_UNTIL_END )
            {
            this_DEF_WORD_0=(Token)match(input,RULE_DEF_WORD,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_DEF_WORD_0, grammarAccess.getMethodAccess().getDEF_WORDTerminalRuleCall_0()); 
                  
            }
            // InternalRails.g:841:1: (this_SPACE_1= RULE_SPACE )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_SPACE) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalRails.g:841:2: this_SPACE_1= RULE_SPACE
            	    {
            	    this_SPACE_1=(Token)match(input,RULE_SPACE,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SPACE_1, grammarAccess.getMethodAccess().getSPACETerminalRuleCall_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            // InternalRails.g:845:3: ( (lv_name_2_0= ruleMethodName ) )
            // InternalRails.g:846:1: (lv_name_2_0= ruleMethodName )
            {
            // InternalRails.g:846:1: (lv_name_2_0= ruleMethodName )
            // InternalRails.g:847:3: lv_name_2_0= ruleMethodName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMethodAccess().getNameMethodNameParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_23);
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

            // InternalRails.g:863:2: (this_SPACE_3= RULE_SPACE )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_SPACE) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalRails.g:863:3: this_SPACE_3= RULE_SPACE
            	    {
            	    this_SPACE_3=(Token)match(input,RULE_SPACE,FOLLOW_23); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SPACE_3, grammarAccess.getMethodAccess().getSPACETerminalRuleCall_3()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            // InternalRails.g:867:3: (this_PARENTHESIS_BLOCK_4= RULE_PARENTHESIS_BLOCK )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_PARENTHESIS_BLOCK) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalRails.g:867:4: this_PARENTHESIS_BLOCK_4= RULE_PARENTHESIS_BLOCK
                    {
                    this_PARENTHESIS_BLOCK_4=(Token)match(input,RULE_PARENTHESIS_BLOCK,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PARENTHESIS_BLOCK_4, grammarAccess.getMethodAccess().getPARENTHESIS_BLOCKTerminalRuleCall_4()); 
                          
                    }

                    }
                    break;

            }

            // InternalRails.g:871:3: ( ( RULE_UNTIL_END )=>this_UNTIL_END_5= RULE_UNTIL_END )
            // InternalRails.g:871:4: ( RULE_UNTIL_END )=>this_UNTIL_END_5= RULE_UNTIL_END
            {
            this_UNTIL_END_5=(Token)match(input,RULE_UNTIL_END,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_UNTIL_END_5, grammarAccess.getMethodAccess().getUNTIL_ENDTerminalRuleCall_5()); 
                  
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
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleMethodName"
    // InternalRails.g:883:1: entryRuleMethodName returns [String current=null] : iv_ruleMethodName= ruleMethodName EOF ;
    public final String entryRuleMethodName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMethodName = null;


        try {
            // InternalRails.g:884:2: (iv_ruleMethodName= ruleMethodName EOF )
            // InternalRails.g:885:2: iv_ruleMethodName= ruleMethodName EOF
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
    // InternalRails.g:892:1: ruleMethodName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '?' | kw= '=' )? ) ;
    public final AntlrDatatypeRuleToken ruleMethodName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // InternalRails.g:895:28: ( (this_ID_0= RULE_ID (kw= '?' | kw= '=' )? ) )
            // InternalRails.g:896:1: (this_ID_0= RULE_ID (kw= '?' | kw= '=' )? )
            {
            // InternalRails.g:896:1: (this_ID_0= RULE_ID (kw= '?' | kw= '=' )? )
            // InternalRails.g:896:6: this_ID_0= RULE_ID (kw= '?' | kw= '=' )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getMethodNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // InternalRails.g:903:1: (kw= '?' | kw= '=' )?
            int alt38=3;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==30) ) {
                alt38=1;
            }
            else if ( (LA38_0==31) ) {
                alt38=2;
            }
            switch (alt38) {
                case 1 :
                    // InternalRails.g:904:2: kw= '?'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getMethodNameAccess().getQuestionMarkKeyword_1_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalRails.g:911:2: kw= '='
                    {
                    kw=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
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

    // $ANTLR start synpred1_InternalRails
    public final void synpred1_InternalRails_fragment() throws RecognitionException {   
        // InternalRails.g:248:4: ( RULE_SPACE )
        // InternalRails.g:248:6: RULE_SPACE
        {
        match(input,RULE_SPACE,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalRails

    // $ANTLR start synpred2_InternalRails
    public final void synpred2_InternalRails_fragment() throws RecognitionException {   
        // InternalRails.g:262:4: ( RULE_SPACE )
        // InternalRails.g:262:6: RULE_SPACE
        {
        match(input,RULE_SPACE,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalRails

    // $ANTLR start synpred3_InternalRails
    public final void synpred3_InternalRails_fragment() throws RecognitionException {   
        // InternalRails.g:871:4: ( RULE_UNTIL_END )
        // InternalRails.g:871:6: RULE_UNTIL_END
        {
        match(input,RULE_UNTIL_END,FOLLOW_2); if (state.failed) return ;

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
    static final String dfa_1s = "\4\uffff";
    static final String dfa_2s = "\2\5\2\uffff";
    static final String dfa_3s = "\2\30\2\uffff";
    static final String dfa_4s = "\2\uffff\1\1\1\2";
    static final String dfa_5s = "\4\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\3\3\uffff\1\3\3\uffff\2\3\1\uffff\1\3\6\uffff\1\2",
            "\1\1\1\3\3\uffff\1\3\3\uffff\2\3\1\uffff\1\3\6\uffff\1\2",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "106:2: ( (this_SPACE_3= RULE_SPACE )* otherlv_4= '<' (this_SPACE_5= RULE_SPACE )* ( (lv_superType_6_0= ruleNamespacedModuleName ) ) )?";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000102C460L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000002C460L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000002C440L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000004000322L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000322L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000222L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000001820L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008002022L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008002002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000022L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000000000018A0L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000011AA0L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000040120L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000000C0000002L});

}