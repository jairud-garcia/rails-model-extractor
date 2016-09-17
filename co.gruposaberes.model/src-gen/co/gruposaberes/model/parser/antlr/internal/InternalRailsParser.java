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

@SuppressWarnings("all")
public class InternalRailsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_CLASS_WORD", "RULE_SPACE", "RULE_END_WORD", "RULE_ID", "RULE_HAS_MANY_WORD", "RULE_SYMBOL", "RULE_STRING", "RULE_SL_COMMENT", "RULE_HAS_AND_BELONGS_TO_MANY_WORD", "RULE_BELONGS_TO_WORD", "RULE_BRACKET_BLOCK", "RULE_ARRAY_BLOCK", "RULE_DEF_WORD", "RULE_MODULE_WORD", "RULE_ML_COMMENT", "RULE_WS", "RULE_INT", "RULE_ANY_OTHER", "'<'", "'::'", "'.'", "','", "':'", "'=>'", "'?'", "'='"
    };
    public static final int RULE_HAS_MANY_WORD=8;
    public static final int RULE_CLASS_WORD=4;
    public static final int RULE_STRING=10;
    public static final int RULE_SL_COMMENT=11;
    public static final int RULE_HAS_AND_BELONGS_TO_MANY_WORD=12;
    public static final int RULE_SPACE=5;
    public static final int EOF=-1;
    public static final int RULE_ARRAY_BLOCK=15;
    public static final int RULE_ID=7;
    public static final int RULE_WS=19;
    public static final int RULE_ANY_OTHER=21;
    public static final int RULE_MODULE_WORD=17;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=20;
    public static final int T__29=29;
    public static final int RULE_BRACKET_BLOCK=14;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=18;
    public static final int T__23=23;
    public static final int RULE_SYMBOL=9;
    public static final int RULE_DEF_WORD=16;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_END_WORD=6;
    public static final int RULE_BELONGS_TO_WORD=13;

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
             newCompositeNode(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClass=ruleClass();

            state._fsp--;

             current =iv_ruleClass; 
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
            this_CLASS_WORD_0=(Token)match(input,RULE_CLASS_WORD,FOLLOW_3); 
             
                newLeafNode(this_CLASS_WORD_0, grammarAccess.getClassAccess().getCLASS_WORDTerminalRuleCall_0()); 
                
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
            	    this_SPACE_1=(Token)match(input,RULE_SPACE,FOLLOW_3); 
            	     
            	        newLeafNode(this_SPACE_1, grammarAccess.getClassAccess().getSPACETerminalRuleCall_1()); 
            	        

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
             
            	        newCompositeNode(grammarAccess.getClassAccess().getNameNamespacedModuleNameParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleNamespacedModuleName();

            state._fsp--;


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
                    	    this_SPACE_3=(Token)match(input,RULE_SPACE,FOLLOW_5); 
                    	     
                    	        newLeafNode(this_SPACE_3, grammarAccess.getClassAccess().getSPACETerminalRuleCall_3_0()); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,22,FOLLOW_3); 

                        	newLeafNode(otherlv_4, grammarAccess.getClassAccess().getLessThanSignKeyword_3_1());
                        
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
                    	    this_SPACE_5=(Token)match(input,RULE_SPACE,FOLLOW_3); 
                    	     
                    	        newLeafNode(this_SPACE_5, grammarAccess.getClassAccess().getSPACETerminalRuleCall_3_2()); 
                    	        

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
                     
                    	        newCompositeNode(grammarAccess.getClassAccess().getSuperTypeNamespacedModuleNameParserRuleCall_3_3_0()); 
                    	    
                    pushFollow(FOLLOW_6);
                    lv_superType_6_0=ruleNamespacedModuleName();

                    state._fsp--;


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
            	    this_SPACE_7=(Token)match(input,RULE_SPACE,FOLLOW_6); 
            	     
            	        newLeafNode(this_SPACE_7, grammarAccess.getClassAccess().getSPACETerminalRuleCall_4()); 
            	        

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
            	     
            	    	        newCompositeNode(grammarAccess.getClassAccess().getClassElementsClassElementParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_7);
            	    lv_classElements_8_0=ruleClassElement();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            this_END_WORD_9=(Token)match(input,RULE_END_WORD,FOLLOW_2); 
             
                newLeafNode(this_END_WORD_9, grammarAccess.getClassAccess().getEND_WORDTerminalRuleCall_6()); 
                

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
             newCompositeNode(grammarAccess.getNamespacedModuleNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNamespacedModuleName=ruleNamespacedModuleName();

            state._fsp--;

             current =iv_ruleNamespacedModuleName.getText(); 
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

                    if ( (LA7_1==23) ) {
                        alt7=1;
                    }


                }


                switch (alt7) {
            	case 1 :
            	    // InternalRails.g:183:7: this_ID_0= RULE_ID kw= '::'
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            	    		current.merge(this_ID_0);
            	        
            	     
            	        newLeafNode(this_ID_0, grammarAccess.getNamespacedModuleNameAccess().getIDTerminalRuleCall_0_0()); 
            	        
            	    kw=(Token)match(input,23,FOLLOW_9); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getNamespacedModuleNameAccess().getColonColonKeyword_0_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            this_ID_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            		current.merge(this_ID_2);
                
             
                newLeafNode(this_ID_2, grammarAccess.getNamespacedModuleNameAccess().getIDTerminalRuleCall_1()); 
                

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
             newCompositeNode(grammarAccess.getMethodChainCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMethodChainCall=ruleMethodChainCall();

            state._fsp--;

             current =iv_ruleMethodChainCall.getText(); 
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
    // $ANTLR end "entryRuleMethodChainCall"


    // $ANTLR start "ruleMethodChainCall"
    // InternalRails.g:220:1: ruleMethodChainCall returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NamespacedModuleName_0= ruleNamespacedModuleName (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleMethodChainCall() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_2=null;
        AntlrDatatypeRuleToken this_NamespacedModuleName_0 = null;


         enterRule(); 
            
        try {
            // InternalRails.g:223:28: ( (this_NamespacedModuleName_0= ruleNamespacedModuleName (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalRails.g:224:1: (this_NamespacedModuleName_0= ruleNamespacedModuleName (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalRails.g:224:1: (this_NamespacedModuleName_0= ruleNamespacedModuleName (kw= '.' this_ID_2= RULE_ID )* )
            // InternalRails.g:225:5: this_NamespacedModuleName_0= ruleNamespacedModuleName (kw= '.' this_ID_2= RULE_ID )*
            {
             
                    newCompositeNode(grammarAccess.getMethodChainCallAccess().getNamespacedModuleNameParserRuleCall_0()); 
                
            pushFollow(FOLLOW_10);
            this_NamespacedModuleName_0=ruleNamespacedModuleName();

            state._fsp--;


            		current.merge(this_NamespacedModuleName_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // InternalRails.g:235:1: (kw= '.' this_ID_2= RULE_ID )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==24) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalRails.g:236:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,24,FOLLOW_9); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getMethodChainCallAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_10); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getMethodChainCallAccess().getIDTerminalRuleCall_1_1()); 
            	        

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
    // $ANTLR end "ruleMethodChainCall"


    // $ANTLR start "entryRuleClassElement"
    // InternalRails.g:256:1: entryRuleClassElement returns [EObject current=null] : iv_ruleClassElement= ruleClassElement EOF ;
    public final EObject entryRuleClassElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassElement = null;


        try {
            // InternalRails.g:257:2: (iv_ruleClassElement= ruleClassElement EOF )
            // InternalRails.g:258:2: iv_ruleClassElement= ruleClassElement EOF
            {
             newCompositeNode(grammarAccess.getClassElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassElement=ruleClassElement();

            state._fsp--;

             current =iv_ruleClassElement; 
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
    // $ANTLR end "entryRuleClassElement"


    // $ANTLR start "ruleClassElement"
    // InternalRails.g:265:1: ruleClassElement returns [EObject current=null] : (this_Method_0= ruleMethod | this_Relationship_1= ruleRelationship ) ;
    public final EObject ruleClassElement() throws RecognitionException {
        EObject current = null;

        EObject this_Method_0 = null;

        EObject this_Relationship_1 = null;


         enterRule(); 
            
        try {
            // InternalRails.g:268:28: ( (this_Method_0= ruleMethod | this_Relationship_1= ruleRelationship ) )
            // InternalRails.g:269:1: (this_Method_0= ruleMethod | this_Relationship_1= ruleRelationship )
            {
            // InternalRails.g:269:1: (this_Method_0= ruleMethod | this_Relationship_1= ruleRelationship )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_DEF_WORD) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_HAS_MANY_WORD||(LA9_0>=RULE_HAS_AND_BELONGS_TO_MANY_WORD && LA9_0<=RULE_BELONGS_TO_WORD)) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalRails.g:270:5: this_Method_0= ruleMethod
                    {
                     
                            newCompositeNode(grammarAccess.getClassElementAccess().getMethodParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Method_0=ruleMethod();

                    state._fsp--;

                     
                            current = this_Method_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalRails.g:280:5: this_Relationship_1= ruleRelationship
                    {
                     
                            newCompositeNode(grammarAccess.getClassElementAccess().getRelationshipParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Relationship_1=ruleRelationship();

                    state._fsp--;

                     
                            current = this_Relationship_1; 
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
    // $ANTLR end "ruleClassElement"


    // $ANTLR start "entryRuleRelationship"
    // InternalRails.g:296:1: entryRuleRelationship returns [EObject current=null] : iv_ruleRelationship= ruleRelationship EOF ;
    public final EObject entryRuleRelationship() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationship = null;


        try {
            // InternalRails.g:297:2: (iv_ruleRelationship= ruleRelationship EOF )
            // InternalRails.g:298:2: iv_ruleRelationship= ruleRelationship EOF
            {
             newCompositeNode(grammarAccess.getRelationshipRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelationship=ruleRelationship();

            state._fsp--;

             current =iv_ruleRelationship; 
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
    // $ANTLR end "entryRuleRelationship"


    // $ANTLR start "ruleRelationship"
    // InternalRails.g:305:1: ruleRelationship returns [EObject current=null] : (this_HasMany_0= ruleHasMany | this_HasAndBelongsToMany_1= ruleHasAndBelongsToMany | this_BelongsTo_2= ruleBelongsTo ) ;
    public final EObject ruleRelationship() throws RecognitionException {
        EObject current = null;

        EObject this_HasMany_0 = null;

        EObject this_HasAndBelongsToMany_1 = null;

        EObject this_BelongsTo_2 = null;


         enterRule(); 
            
        try {
            // InternalRails.g:308:28: ( (this_HasMany_0= ruleHasMany | this_HasAndBelongsToMany_1= ruleHasAndBelongsToMany | this_BelongsTo_2= ruleBelongsTo ) )
            // InternalRails.g:309:1: (this_HasMany_0= ruleHasMany | this_HasAndBelongsToMany_1= ruleHasAndBelongsToMany | this_BelongsTo_2= ruleBelongsTo )
            {
            // InternalRails.g:309:1: (this_HasMany_0= ruleHasMany | this_HasAndBelongsToMany_1= ruleHasAndBelongsToMany | this_BelongsTo_2= ruleBelongsTo )
            int alt10=3;
            switch ( input.LA(1) ) {
            case RULE_HAS_MANY_WORD:
                {
                alt10=1;
                }
                break;
            case RULE_HAS_AND_BELONGS_TO_MANY_WORD:
                {
                alt10=2;
                }
                break;
            case RULE_BELONGS_TO_WORD:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalRails.g:310:5: this_HasMany_0= ruleHasMany
                    {
                     
                            newCompositeNode(grammarAccess.getRelationshipAccess().getHasManyParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_HasMany_0=ruleHasMany();

                    state._fsp--;

                     
                            current = this_HasMany_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalRails.g:320:5: this_HasAndBelongsToMany_1= ruleHasAndBelongsToMany
                    {
                     
                            newCompositeNode(grammarAccess.getRelationshipAccess().getHasAndBelongsToManyParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_HasAndBelongsToMany_1=ruleHasAndBelongsToMany();

                    state._fsp--;

                     
                            current = this_HasAndBelongsToMany_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalRails.g:330:5: this_BelongsTo_2= ruleBelongsTo
                    {
                     
                            newCompositeNode(grammarAccess.getRelationshipAccess().getBelongsToParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_2);
                    this_BelongsTo_2=ruleBelongsTo();

                    state._fsp--;

                     
                            current = this_BelongsTo_2; 
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
    // $ANTLR end "ruleRelationship"


    // $ANTLR start "entryRuleHasMany"
    // InternalRails.g:346:1: entryRuleHasMany returns [EObject current=null] : iv_ruleHasMany= ruleHasMany EOF ;
    public final EObject entryRuleHasMany() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHasMany = null;


        try {
            // InternalRails.g:347:2: (iv_ruleHasMany= ruleHasMany EOF )
            // InternalRails.g:348:2: iv_ruleHasMany= ruleHasMany EOF
            {
             newCompositeNode(grammarAccess.getHasManyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHasMany=ruleHasMany();

            state._fsp--;

             current =iv_ruleHasMany; 
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
    // $ANTLR end "entryRuleHasMany"


    // $ANTLR start "ruleHasMany"
    // InternalRails.g:355:1: ruleHasMany returns [EObject current=null] : (this_HAS_MANY_WORD_0= RULE_HAS_MANY_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )* (this_SL_COMMENT_5= RULE_SL_COMMENT )? ) ;
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
            // InternalRails.g:358:28: ( (this_HAS_MANY_WORD_0= RULE_HAS_MANY_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )* (this_SL_COMMENT_5= RULE_SL_COMMENT )? ) )
            // InternalRails.g:359:1: (this_HAS_MANY_WORD_0= RULE_HAS_MANY_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )* (this_SL_COMMENT_5= RULE_SL_COMMENT )? )
            {
            // InternalRails.g:359:1: (this_HAS_MANY_WORD_0= RULE_HAS_MANY_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )* (this_SL_COMMENT_5= RULE_SL_COMMENT )? )
            // InternalRails.g:359:2: this_HAS_MANY_WORD_0= RULE_HAS_MANY_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )* (this_SL_COMMENT_5= RULE_SL_COMMENT )?
            {
            this_HAS_MANY_WORD_0=(Token)match(input,RULE_HAS_MANY_WORD,FOLLOW_11); 
             
                newLeafNode(this_HAS_MANY_WORD_0, grammarAccess.getHasManyAccess().getHAS_MANY_WORDTerminalRuleCall_0()); 
                
            // InternalRails.g:363:1: (this_SPACE_1= RULE_SPACE )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_SPACE) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalRails.g:363:2: this_SPACE_1= RULE_SPACE
            	    {
            	    this_SPACE_1=(Token)match(input,RULE_SPACE,FOLLOW_11); 
            	     
            	        newLeafNode(this_SPACE_1, grammarAccess.getHasManyAccess().getSPACETerminalRuleCall_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // InternalRails.g:367:3: ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) )
            // InternalRails.g:368:1: ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) )
            {
            // InternalRails.g:368:1: ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) )
            // InternalRails.g:369:1: (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING )
            {
            // InternalRails.g:369:1: (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_SYMBOL) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_STRING) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalRails.g:370:3: lv_name_2_1= RULE_SYMBOL
                    {
                    lv_name_2_1=(Token)match(input,RULE_SYMBOL,FOLLOW_12); 

                    			newLeafNode(lv_name_2_1, grammarAccess.getHasManyAccess().getNameSYMBOLTerminalRuleCall_2_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getHasManyRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_2_1, 
                            		"co.gruposaberes.model.Rails.SYMBOL");
                    	    

                    }
                    break;
                case 2 :
                    // InternalRails.g:385:8: lv_name_2_2= RULE_STRING
                    {
                    lv_name_2_2=(Token)match(input,RULE_STRING,FOLLOW_12); 

                    			newLeafNode(lv_name_2_2, grammarAccess.getHasManyAccess().getNameSTRINGTerminalRuleCall_2_0_1()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getHasManyRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_2_2, 
                            		"co.gruposaberes.model.Rails.STRING");
                    	    

                    }
                    break;

            }


            }


            }

            // InternalRails.g:403:2: (this_SPACE_3= RULE_SPACE )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_SPACE) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalRails.g:403:3: this_SPACE_3= RULE_SPACE
            	    {
            	    this_SPACE_3=(Token)match(input,RULE_SPACE,FOLLOW_12); 
            	     
            	        newLeafNode(this_SPACE_3, grammarAccess.getHasManyAccess().getSPACETerminalRuleCall_3()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // InternalRails.g:407:3: ( (lv_options_4_0= ruleHashKeyValue ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==25) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalRails.g:408:1: (lv_options_4_0= ruleHashKeyValue )
            	    {
            	    // InternalRails.g:408:1: (lv_options_4_0= ruleHashKeyValue )
            	    // InternalRails.g:409:3: lv_options_4_0= ruleHashKeyValue
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getHasManyAccess().getOptionsHashKeyValueParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_13);
            	    lv_options_4_0=ruleHashKeyValue();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // InternalRails.g:425:3: (this_SL_COMMENT_5= RULE_SL_COMMENT )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_SL_COMMENT) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalRails.g:425:4: this_SL_COMMENT_5= RULE_SL_COMMENT
                    {
                    this_SL_COMMENT_5=(Token)match(input,RULE_SL_COMMENT,FOLLOW_2); 
                     
                        newLeafNode(this_SL_COMMENT_5, grammarAccess.getHasManyAccess().getSL_COMMENTTerminalRuleCall_5()); 
                        

                    }
                    break;

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
    // $ANTLR end "ruleHasMany"


    // $ANTLR start "entryRuleHasAndBelongsToMany"
    // InternalRails.g:437:1: entryRuleHasAndBelongsToMany returns [EObject current=null] : iv_ruleHasAndBelongsToMany= ruleHasAndBelongsToMany EOF ;
    public final EObject entryRuleHasAndBelongsToMany() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHasAndBelongsToMany = null;


        try {
            // InternalRails.g:438:2: (iv_ruleHasAndBelongsToMany= ruleHasAndBelongsToMany EOF )
            // InternalRails.g:439:2: iv_ruleHasAndBelongsToMany= ruleHasAndBelongsToMany EOF
            {
             newCompositeNode(grammarAccess.getHasAndBelongsToManyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHasAndBelongsToMany=ruleHasAndBelongsToMany();

            state._fsp--;

             current =iv_ruleHasAndBelongsToMany; 
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
    // $ANTLR end "entryRuleHasAndBelongsToMany"


    // $ANTLR start "ruleHasAndBelongsToMany"
    // InternalRails.g:446:1: ruleHasAndBelongsToMany returns [EObject current=null] : (this_HAS_AND_BELONGS_TO_MANY_WORD_0= RULE_HAS_AND_BELONGS_TO_MANY_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )* ) ;
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
            // InternalRails.g:449:28: ( (this_HAS_AND_BELONGS_TO_MANY_WORD_0= RULE_HAS_AND_BELONGS_TO_MANY_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )* ) )
            // InternalRails.g:450:1: (this_HAS_AND_BELONGS_TO_MANY_WORD_0= RULE_HAS_AND_BELONGS_TO_MANY_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )* )
            {
            // InternalRails.g:450:1: (this_HAS_AND_BELONGS_TO_MANY_WORD_0= RULE_HAS_AND_BELONGS_TO_MANY_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )* )
            // InternalRails.g:450:2: this_HAS_AND_BELONGS_TO_MANY_WORD_0= RULE_HAS_AND_BELONGS_TO_MANY_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )*
            {
            this_HAS_AND_BELONGS_TO_MANY_WORD_0=(Token)match(input,RULE_HAS_AND_BELONGS_TO_MANY_WORD,FOLLOW_11); 
             
                newLeafNode(this_HAS_AND_BELONGS_TO_MANY_WORD_0, grammarAccess.getHasAndBelongsToManyAccess().getHAS_AND_BELONGS_TO_MANY_WORDTerminalRuleCall_0()); 
                
            // InternalRails.g:454:1: (this_SPACE_1= RULE_SPACE )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_SPACE) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalRails.g:454:2: this_SPACE_1= RULE_SPACE
            	    {
            	    this_SPACE_1=(Token)match(input,RULE_SPACE,FOLLOW_11); 
            	     
            	        newLeafNode(this_SPACE_1, grammarAccess.getHasAndBelongsToManyAccess().getSPACETerminalRuleCall_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            // InternalRails.g:458:3: ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) )
            // InternalRails.g:459:1: ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) )
            {
            // InternalRails.g:459:1: ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) )
            // InternalRails.g:460:1: (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING )
            {
            // InternalRails.g:460:1: (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_SYMBOL) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_STRING) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalRails.g:461:3: lv_name_2_1= RULE_SYMBOL
                    {
                    lv_name_2_1=(Token)match(input,RULE_SYMBOL,FOLLOW_14); 

                    			newLeafNode(lv_name_2_1, grammarAccess.getHasAndBelongsToManyAccess().getNameSYMBOLTerminalRuleCall_2_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getHasAndBelongsToManyRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_2_1, 
                            		"co.gruposaberes.model.Rails.SYMBOL");
                    	    

                    }
                    break;
                case 2 :
                    // InternalRails.g:476:8: lv_name_2_2= RULE_STRING
                    {
                    lv_name_2_2=(Token)match(input,RULE_STRING,FOLLOW_14); 

                    			newLeafNode(lv_name_2_2, grammarAccess.getHasAndBelongsToManyAccess().getNameSTRINGTerminalRuleCall_2_0_1()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getHasAndBelongsToManyRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_2_2, 
                            		"co.gruposaberes.model.Rails.STRING");
                    	    

                    }
                    break;

            }


            }


            }

            // InternalRails.g:494:2: (this_SPACE_3= RULE_SPACE )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_SPACE) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalRails.g:494:3: this_SPACE_3= RULE_SPACE
            	    {
            	    this_SPACE_3=(Token)match(input,RULE_SPACE,FOLLOW_14); 
            	     
            	        newLeafNode(this_SPACE_3, grammarAccess.getHasAndBelongsToManyAccess().getSPACETerminalRuleCall_3()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            // InternalRails.g:498:3: ( (lv_options_4_0= ruleHashKeyValue ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==25) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalRails.g:499:1: (lv_options_4_0= ruleHashKeyValue )
            	    {
            	    // InternalRails.g:499:1: (lv_options_4_0= ruleHashKeyValue )
            	    // InternalRails.g:500:3: lv_options_4_0= ruleHashKeyValue
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getHasAndBelongsToManyAccess().getOptionsHashKeyValueParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_15);
            	    lv_options_4_0=ruleHashKeyValue();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop19;
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
    // $ANTLR end "ruleHasAndBelongsToMany"


    // $ANTLR start "entryRuleBelongsTo"
    // InternalRails.g:524:1: entryRuleBelongsTo returns [EObject current=null] : iv_ruleBelongsTo= ruleBelongsTo EOF ;
    public final EObject entryRuleBelongsTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBelongsTo = null;


        try {
            // InternalRails.g:525:2: (iv_ruleBelongsTo= ruleBelongsTo EOF )
            // InternalRails.g:526:2: iv_ruleBelongsTo= ruleBelongsTo EOF
            {
             newCompositeNode(grammarAccess.getBelongsToRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBelongsTo=ruleBelongsTo();

            state._fsp--;

             current =iv_ruleBelongsTo; 
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
    // $ANTLR end "entryRuleBelongsTo"


    // $ANTLR start "ruleBelongsTo"
    // InternalRails.g:533:1: ruleBelongsTo returns [EObject current=null] : (this_BELONGS_TO_WORD_0= RULE_BELONGS_TO_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )* ) ;
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
            // InternalRails.g:536:28: ( (this_BELONGS_TO_WORD_0= RULE_BELONGS_TO_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )* ) )
            // InternalRails.g:537:1: (this_BELONGS_TO_WORD_0= RULE_BELONGS_TO_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )* )
            {
            // InternalRails.g:537:1: (this_BELONGS_TO_WORD_0= RULE_BELONGS_TO_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )* )
            // InternalRails.g:537:2: this_BELONGS_TO_WORD_0= RULE_BELONGS_TO_WORD (this_SPACE_1= RULE_SPACE )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (this_SPACE_3= RULE_SPACE )* ( (lv_options_4_0= ruleHashKeyValue ) )*
            {
            this_BELONGS_TO_WORD_0=(Token)match(input,RULE_BELONGS_TO_WORD,FOLLOW_11); 
             
                newLeafNode(this_BELONGS_TO_WORD_0, grammarAccess.getBelongsToAccess().getBELONGS_TO_WORDTerminalRuleCall_0()); 
                
            // InternalRails.g:541:1: (this_SPACE_1= RULE_SPACE )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_SPACE) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalRails.g:541:2: this_SPACE_1= RULE_SPACE
            	    {
            	    this_SPACE_1=(Token)match(input,RULE_SPACE,FOLLOW_11); 
            	     
            	        newLeafNode(this_SPACE_1, grammarAccess.getBelongsToAccess().getSPACETerminalRuleCall_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            // InternalRails.g:545:3: ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) )
            // InternalRails.g:546:1: ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) )
            {
            // InternalRails.g:546:1: ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) )
            // InternalRails.g:547:1: (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING )
            {
            // InternalRails.g:547:1: (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_SYMBOL) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_STRING) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalRails.g:548:3: lv_name_2_1= RULE_SYMBOL
                    {
                    lv_name_2_1=(Token)match(input,RULE_SYMBOL,FOLLOW_14); 

                    			newLeafNode(lv_name_2_1, grammarAccess.getBelongsToAccess().getNameSYMBOLTerminalRuleCall_2_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBelongsToRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_2_1, 
                            		"co.gruposaberes.model.Rails.SYMBOL");
                    	    

                    }
                    break;
                case 2 :
                    // InternalRails.g:563:8: lv_name_2_2= RULE_STRING
                    {
                    lv_name_2_2=(Token)match(input,RULE_STRING,FOLLOW_14); 

                    			newLeafNode(lv_name_2_2, grammarAccess.getBelongsToAccess().getNameSTRINGTerminalRuleCall_2_0_1()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBelongsToRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_2_2, 
                            		"co.gruposaberes.model.Rails.STRING");
                    	    

                    }
                    break;

            }


            }


            }

            // InternalRails.g:581:2: (this_SPACE_3= RULE_SPACE )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_SPACE) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalRails.g:581:3: this_SPACE_3= RULE_SPACE
            	    {
            	    this_SPACE_3=(Token)match(input,RULE_SPACE,FOLLOW_14); 
            	     
            	        newLeafNode(this_SPACE_3, grammarAccess.getBelongsToAccess().getSPACETerminalRuleCall_3()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            // InternalRails.g:585:3: ( (lv_options_4_0= ruleHashKeyValue ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==25) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalRails.g:586:1: (lv_options_4_0= ruleHashKeyValue )
            	    {
            	    // InternalRails.g:586:1: (lv_options_4_0= ruleHashKeyValue )
            	    // InternalRails.g:587:3: lv_options_4_0= ruleHashKeyValue
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBelongsToAccess().getOptionsHashKeyValueParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_15);
            	    lv_options_4_0=ruleHashKeyValue();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop23;
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
    // $ANTLR end "ruleBelongsTo"


    // $ANTLR start "entryRuleHashKeyValue"
    // InternalRails.g:611:1: entryRuleHashKeyValue returns [EObject current=null] : iv_ruleHashKeyValue= ruleHashKeyValue EOF ;
    public final EObject entryRuleHashKeyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHashKeyValue = null;


        try {
            // InternalRails.g:612:2: (iv_ruleHashKeyValue= ruleHashKeyValue EOF )
            // InternalRails.g:613:2: iv_ruleHashKeyValue= ruleHashKeyValue EOF
            {
             newCompositeNode(grammarAccess.getHashKeyValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHashKeyValue=ruleHashKeyValue();

            state._fsp--;

             current =iv_ruleHashKeyValue; 
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
    // $ANTLR end "entryRuleHashKeyValue"


    // $ANTLR start "ruleHashKeyValue"
    // InternalRails.g:620:1: ruleHashKeyValue returns [EObject current=null] : (otherlv_0= ',' (this_SPACE_1= RULE_SPACE )* ( ( ( (lv_key_2_0= RULE_ID ) ) otherlv_3= ':' ) | ( ( ( (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING ) ) ) (this_SPACE_5= RULE_SPACE )* otherlv_6= '=>' ) ) (this_SPACE_7= RULE_SPACE )* ( ( (lv_value_8_1= RULE_SYMBOL | lv_value_8_2= RULE_STRING | lv_value_8_3= RULE_BRACKET_BLOCK | lv_value_8_4= RULE_ARRAY_BLOCK | lv_value_8_5= ruleMethodChainCall ) ) ) (this_SPACE_9= RULE_SPACE )* ) ;
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
            // InternalRails.g:623:28: ( (otherlv_0= ',' (this_SPACE_1= RULE_SPACE )* ( ( ( (lv_key_2_0= RULE_ID ) ) otherlv_3= ':' ) | ( ( ( (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING ) ) ) (this_SPACE_5= RULE_SPACE )* otherlv_6= '=>' ) ) (this_SPACE_7= RULE_SPACE )* ( ( (lv_value_8_1= RULE_SYMBOL | lv_value_8_2= RULE_STRING | lv_value_8_3= RULE_BRACKET_BLOCK | lv_value_8_4= RULE_ARRAY_BLOCK | lv_value_8_5= ruleMethodChainCall ) ) ) (this_SPACE_9= RULE_SPACE )* ) )
            // InternalRails.g:624:1: (otherlv_0= ',' (this_SPACE_1= RULE_SPACE )* ( ( ( (lv_key_2_0= RULE_ID ) ) otherlv_3= ':' ) | ( ( ( (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING ) ) ) (this_SPACE_5= RULE_SPACE )* otherlv_6= '=>' ) ) (this_SPACE_7= RULE_SPACE )* ( ( (lv_value_8_1= RULE_SYMBOL | lv_value_8_2= RULE_STRING | lv_value_8_3= RULE_BRACKET_BLOCK | lv_value_8_4= RULE_ARRAY_BLOCK | lv_value_8_5= ruleMethodChainCall ) ) ) (this_SPACE_9= RULE_SPACE )* )
            {
            // InternalRails.g:624:1: (otherlv_0= ',' (this_SPACE_1= RULE_SPACE )* ( ( ( (lv_key_2_0= RULE_ID ) ) otherlv_3= ':' ) | ( ( ( (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING ) ) ) (this_SPACE_5= RULE_SPACE )* otherlv_6= '=>' ) ) (this_SPACE_7= RULE_SPACE )* ( ( (lv_value_8_1= RULE_SYMBOL | lv_value_8_2= RULE_STRING | lv_value_8_3= RULE_BRACKET_BLOCK | lv_value_8_4= RULE_ARRAY_BLOCK | lv_value_8_5= ruleMethodChainCall ) ) ) (this_SPACE_9= RULE_SPACE )* )
            // InternalRails.g:624:3: otherlv_0= ',' (this_SPACE_1= RULE_SPACE )* ( ( ( (lv_key_2_0= RULE_ID ) ) otherlv_3= ':' ) | ( ( ( (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING ) ) ) (this_SPACE_5= RULE_SPACE )* otherlv_6= '=>' ) ) (this_SPACE_7= RULE_SPACE )* ( ( (lv_value_8_1= RULE_SYMBOL | lv_value_8_2= RULE_STRING | lv_value_8_3= RULE_BRACKET_BLOCK | lv_value_8_4= RULE_ARRAY_BLOCK | lv_value_8_5= ruleMethodChainCall ) ) ) (this_SPACE_9= RULE_SPACE )*
            {
            otherlv_0=(Token)match(input,25,FOLLOW_16); 

                	newLeafNode(otherlv_0, grammarAccess.getHashKeyValueAccess().getCommaKeyword_0());
                
            // InternalRails.g:628:1: (this_SPACE_1= RULE_SPACE )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_SPACE) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalRails.g:628:2: this_SPACE_1= RULE_SPACE
            	    {
            	    this_SPACE_1=(Token)match(input,RULE_SPACE,FOLLOW_16); 
            	     
            	        newLeafNode(this_SPACE_1, grammarAccess.getHashKeyValueAccess().getSPACETerminalRuleCall_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            // InternalRails.g:632:3: ( ( ( (lv_key_2_0= RULE_ID ) ) otherlv_3= ':' ) | ( ( ( (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING ) ) ) (this_SPACE_5= RULE_SPACE )* otherlv_6= '=>' ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID) ) {
                alt27=1;
            }
            else if ( ((LA27_0>=RULE_SYMBOL && LA27_0<=RULE_STRING)) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalRails.g:632:4: ( ( (lv_key_2_0= RULE_ID ) ) otherlv_3= ':' )
                    {
                    // InternalRails.g:632:4: ( ( (lv_key_2_0= RULE_ID ) ) otherlv_3= ':' )
                    // InternalRails.g:632:5: ( (lv_key_2_0= RULE_ID ) ) otherlv_3= ':'
                    {
                    // InternalRails.g:632:5: ( (lv_key_2_0= RULE_ID ) )
                    // InternalRails.g:633:1: (lv_key_2_0= RULE_ID )
                    {
                    // InternalRails.g:633:1: (lv_key_2_0= RULE_ID )
                    // InternalRails.g:634:3: lv_key_2_0= RULE_ID
                    {
                    lv_key_2_0=(Token)match(input,RULE_ID,FOLLOW_17); 

                    			newLeafNode(lv_key_2_0, grammarAccess.getHashKeyValueAccess().getKeyIDTerminalRuleCall_2_0_0_0()); 
                    		

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

                    otherlv_3=(Token)match(input,26,FOLLOW_18); 

                        	newLeafNode(otherlv_3, grammarAccess.getHashKeyValueAccess().getColonKeyword_2_0_1());
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalRails.g:655:6: ( ( ( (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING ) ) ) (this_SPACE_5= RULE_SPACE )* otherlv_6= '=>' )
                    {
                    // InternalRails.g:655:6: ( ( ( (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING ) ) ) (this_SPACE_5= RULE_SPACE )* otherlv_6= '=>' )
                    // InternalRails.g:655:7: ( ( (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING ) ) ) (this_SPACE_5= RULE_SPACE )* otherlv_6= '=>'
                    {
                    // InternalRails.g:655:7: ( ( (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING ) ) )
                    // InternalRails.g:656:1: ( (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING ) )
                    {
                    // InternalRails.g:656:1: ( (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING ) )
                    // InternalRails.g:657:1: (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING )
                    {
                    // InternalRails.g:657:1: (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING )
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==RULE_SYMBOL) ) {
                        alt25=1;
                    }
                    else if ( (LA25_0==RULE_STRING) ) {
                        alt25=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 0, input);

                        throw nvae;
                    }
                    switch (alt25) {
                        case 1 :
                            // InternalRails.g:658:3: lv_key_4_1= RULE_SYMBOL
                            {
                            lv_key_4_1=(Token)match(input,RULE_SYMBOL,FOLLOW_19); 

                            			newLeafNode(lv_key_4_1, grammarAccess.getHashKeyValueAccess().getKeySYMBOLTerminalRuleCall_2_1_0_0_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getHashKeyValueRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"key",
                                    		lv_key_4_1, 
                                    		"co.gruposaberes.model.Rails.SYMBOL");
                            	    

                            }
                            break;
                        case 2 :
                            // InternalRails.g:673:8: lv_key_4_2= RULE_STRING
                            {
                            lv_key_4_2=(Token)match(input,RULE_STRING,FOLLOW_19); 

                            			newLeafNode(lv_key_4_2, grammarAccess.getHashKeyValueAccess().getKeySTRINGTerminalRuleCall_2_1_0_0_1()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getHashKeyValueRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"key",
                                    		lv_key_4_2, 
                                    		"co.gruposaberes.model.Rails.STRING");
                            	    

                            }
                            break;

                    }


                    }


                    }

                    // InternalRails.g:691:2: (this_SPACE_5= RULE_SPACE )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==RULE_SPACE) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalRails.g:691:3: this_SPACE_5= RULE_SPACE
                    	    {
                    	    this_SPACE_5=(Token)match(input,RULE_SPACE,FOLLOW_19); 
                    	     
                    	        newLeafNode(this_SPACE_5, grammarAccess.getHashKeyValueAccess().getSPACETerminalRuleCall_2_1_1()); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,27,FOLLOW_18); 

                        	newLeafNode(otherlv_6, grammarAccess.getHashKeyValueAccess().getEqualsSignGreaterThanSignKeyword_2_1_2());
                        

                    }


                    }
                    break;

            }

            // InternalRails.g:699:3: (this_SPACE_7= RULE_SPACE )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_SPACE) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalRails.g:699:4: this_SPACE_7= RULE_SPACE
            	    {
            	    this_SPACE_7=(Token)match(input,RULE_SPACE,FOLLOW_18); 
            	     
            	        newLeafNode(this_SPACE_7, grammarAccess.getHashKeyValueAccess().getSPACETerminalRuleCall_3()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            // InternalRails.g:703:3: ( ( (lv_value_8_1= RULE_SYMBOL | lv_value_8_2= RULE_STRING | lv_value_8_3= RULE_BRACKET_BLOCK | lv_value_8_4= RULE_ARRAY_BLOCK | lv_value_8_5= ruleMethodChainCall ) ) )
            // InternalRails.g:704:1: ( (lv_value_8_1= RULE_SYMBOL | lv_value_8_2= RULE_STRING | lv_value_8_3= RULE_BRACKET_BLOCK | lv_value_8_4= RULE_ARRAY_BLOCK | lv_value_8_5= ruleMethodChainCall ) )
            {
            // InternalRails.g:704:1: ( (lv_value_8_1= RULE_SYMBOL | lv_value_8_2= RULE_STRING | lv_value_8_3= RULE_BRACKET_BLOCK | lv_value_8_4= RULE_ARRAY_BLOCK | lv_value_8_5= ruleMethodChainCall ) )
            // InternalRails.g:705:1: (lv_value_8_1= RULE_SYMBOL | lv_value_8_2= RULE_STRING | lv_value_8_3= RULE_BRACKET_BLOCK | lv_value_8_4= RULE_ARRAY_BLOCK | lv_value_8_5= ruleMethodChainCall )
            {
            // InternalRails.g:705:1: (lv_value_8_1= RULE_SYMBOL | lv_value_8_2= RULE_STRING | lv_value_8_3= RULE_BRACKET_BLOCK | lv_value_8_4= RULE_ARRAY_BLOCK | lv_value_8_5= ruleMethodChainCall )
            int alt29=5;
            switch ( input.LA(1) ) {
            case RULE_SYMBOL:
                {
                alt29=1;
                }
                break;
            case RULE_STRING:
                {
                alt29=2;
                }
                break;
            case RULE_BRACKET_BLOCK:
                {
                alt29=3;
                }
                break;
            case RULE_ARRAY_BLOCK:
                {
                alt29=4;
                }
                break;
            case RULE_ID:
                {
                alt29=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalRails.g:706:3: lv_value_8_1= RULE_SYMBOL
                    {
                    lv_value_8_1=(Token)match(input,RULE_SYMBOL,FOLLOW_20); 

                    			newLeafNode(lv_value_8_1, grammarAccess.getHashKeyValueAccess().getValueSYMBOLTerminalRuleCall_4_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getHashKeyValueRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_8_1, 
                            		"co.gruposaberes.model.Rails.SYMBOL");
                    	    

                    }
                    break;
                case 2 :
                    // InternalRails.g:721:8: lv_value_8_2= RULE_STRING
                    {
                    lv_value_8_2=(Token)match(input,RULE_STRING,FOLLOW_20); 

                    			newLeafNode(lv_value_8_2, grammarAccess.getHashKeyValueAccess().getValueSTRINGTerminalRuleCall_4_0_1()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getHashKeyValueRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_8_2, 
                            		"co.gruposaberes.model.Rails.STRING");
                    	    

                    }
                    break;
                case 3 :
                    // InternalRails.g:736:8: lv_value_8_3= RULE_BRACKET_BLOCK
                    {
                    lv_value_8_3=(Token)match(input,RULE_BRACKET_BLOCK,FOLLOW_20); 

                    			newLeafNode(lv_value_8_3, grammarAccess.getHashKeyValueAccess().getValueBRACKET_BLOCKTerminalRuleCall_4_0_2()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getHashKeyValueRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_8_3, 
                            		"co.gruposaberes.model.Rails.BRACKET_BLOCK");
                    	    

                    }
                    break;
                case 4 :
                    // InternalRails.g:751:8: lv_value_8_4= RULE_ARRAY_BLOCK
                    {
                    lv_value_8_4=(Token)match(input,RULE_ARRAY_BLOCK,FOLLOW_20); 

                    			newLeafNode(lv_value_8_4, grammarAccess.getHashKeyValueAccess().getValueARRAY_BLOCKTerminalRuleCall_4_0_3()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getHashKeyValueRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_8_4, 
                            		"co.gruposaberes.model.Rails.ARRAY_BLOCK");
                    	    

                    }
                    break;
                case 5 :
                    // InternalRails.g:766:8: lv_value_8_5= ruleMethodChainCall
                    {
                     
                    	        newCompositeNode(grammarAccess.getHashKeyValueAccess().getValueMethodChainCallParserRuleCall_4_0_4()); 
                    	    
                    pushFollow(FOLLOW_20);
                    lv_value_8_5=ruleMethodChainCall();

                    state._fsp--;


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
                    break;

            }


            }


            }

            // InternalRails.g:784:2: (this_SPACE_9= RULE_SPACE )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_SPACE) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalRails.g:784:3: this_SPACE_9= RULE_SPACE
            	    {
            	    this_SPACE_9=(Token)match(input,RULE_SPACE,FOLLOW_20); 
            	     
            	        newLeafNode(this_SPACE_9, grammarAccess.getHashKeyValueAccess().getSPACETerminalRuleCall_5()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop30;
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
    // $ANTLR end "ruleHashKeyValue"


    // $ANTLR start "entryRuleMethod"
    // InternalRails.g:796:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // InternalRails.g:797:2: (iv_ruleMethod= ruleMethod EOF )
            // InternalRails.g:798:2: iv_ruleMethod= ruleMethod EOF
            {
             newCompositeNode(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMethod=ruleMethod();

            state._fsp--;

             current =iv_ruleMethod; 
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
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // InternalRails.g:805:1: ruleMethod returns [EObject current=null] : (this_DEF_WORD_0= RULE_DEF_WORD ( (lv_name_1_0= ruleMethodName ) ) ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        Token this_DEF_WORD_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // InternalRails.g:808:28: ( (this_DEF_WORD_0= RULE_DEF_WORD ( (lv_name_1_0= ruleMethodName ) ) ) )
            // InternalRails.g:809:1: (this_DEF_WORD_0= RULE_DEF_WORD ( (lv_name_1_0= ruleMethodName ) ) )
            {
            // InternalRails.g:809:1: (this_DEF_WORD_0= RULE_DEF_WORD ( (lv_name_1_0= ruleMethodName ) ) )
            // InternalRails.g:809:2: this_DEF_WORD_0= RULE_DEF_WORD ( (lv_name_1_0= ruleMethodName ) )
            {
            this_DEF_WORD_0=(Token)match(input,RULE_DEF_WORD,FOLLOW_9); 
             
                newLeafNode(this_DEF_WORD_0, grammarAccess.getMethodAccess().getDEF_WORDTerminalRuleCall_0()); 
                
            // InternalRails.g:813:1: ( (lv_name_1_0= ruleMethodName ) )
            // InternalRails.g:814:1: (lv_name_1_0= ruleMethodName )
            {
            // InternalRails.g:814:1: (lv_name_1_0= ruleMethodName )
            // InternalRails.g:815:3: lv_name_1_0= ruleMethodName
            {
             
            	        newCompositeNode(grammarAccess.getMethodAccess().getNameMethodNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleMethodName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMethodRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"co.gruposaberes.model.Rails.MethodName");
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
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleMethodName"
    // InternalRails.g:839:1: entryRuleMethodName returns [String current=null] : iv_ruleMethodName= ruleMethodName EOF ;
    public final String entryRuleMethodName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMethodName = null;


        try {
            // InternalRails.g:840:2: (iv_ruleMethodName= ruleMethodName EOF )
            // InternalRails.g:841:2: iv_ruleMethodName= ruleMethodName EOF
            {
             newCompositeNode(grammarAccess.getMethodNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMethodName=ruleMethodName();

            state._fsp--;

             current =iv_ruleMethodName.getText(); 
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
    // $ANTLR end "entryRuleMethodName"


    // $ANTLR start "ruleMethodName"
    // InternalRails.g:848:1: ruleMethodName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '?' | kw= '=' )? ) ;
    public final AntlrDatatypeRuleToken ruleMethodName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // InternalRails.g:851:28: ( (this_ID_0= RULE_ID (kw= '?' | kw= '=' )? ) )
            // InternalRails.g:852:1: (this_ID_0= RULE_ID (kw= '?' | kw= '=' )? )
            {
            // InternalRails.g:852:1: (this_ID_0= RULE_ID (kw= '?' | kw= '=' )? )
            // InternalRails.g:852:6: this_ID_0= RULE_ID (kw= '?' | kw= '=' )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getMethodNameAccess().getIDTerminalRuleCall_0()); 
                
            // InternalRails.g:859:1: (kw= '?' | kw= '=' )?
            int alt31=3;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==28) ) {
                alt31=1;
            }
            else if ( (LA31_0==29) ) {
                alt31=2;
            }
            switch (alt31) {
                case 1 :
                    // InternalRails.g:860:2: kw= '?'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMethodNameAccess().getQuestionMarkKeyword_1_0()); 
                        

                    }
                    break;
                case 2 :
                    // InternalRails.g:867:2: kw= '='
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMethodNameAccess().getEqualsSignKeyword_1_1()); 
                        

                    }
                    break;

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
    // $ANTLR end "ruleMethodName"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    static final String dfa_1s = "\4\uffff";
    static final String dfa_2s = "\2\5\2\uffff";
    static final String dfa_3s = "\2\26\2\uffff";
    static final String dfa_4s = "\2\uffff\1\1\1\2";
    static final String dfa_5s = "\4\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\3\1\uffff\1\3\3\uffff\2\3\2\uffff\1\3\5\uffff\1\2",
            "\1\1\1\3\1\uffff\1\3\3\uffff\2\3\2\uffff\1\3\5\uffff\1\2",
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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000413160L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000013160L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000013140L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000620L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000822L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000802L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000022L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000000006A0L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000000C6A0L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000030000002L});

}