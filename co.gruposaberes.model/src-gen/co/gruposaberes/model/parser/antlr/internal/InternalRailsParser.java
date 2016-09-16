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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_CLASS_WORD", "RULE_END_WORD", "RULE_ID", "RULE_HAS_MANY_WORD", "RULE_SYMBOL", "RULE_STRING", "RULE_HAS_AND_BELONGS_TO_MANY_WORD", "RULE_BELONGS_TO_WORD", "RULE_DEF_WORD", "RULE_MODULE_WORD", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_INT", "RULE_ANY_OTHER", "' '", "'<'", "'::'", "','", "':'", "'=>'", "'?'", "'='"
    };
    public static final int RULE_HAS_MANY_WORD=7;
    public static final int RULE_CLASS_WORD=4;
    public static final int RULE_STRING=9;
    public static final int RULE_SL_COMMENT=15;
    public static final int T__19=19;
    public static final int RULE_HAS_AND_BELONGS_TO_MANY_WORD=10;
    public static final int EOF=-1;
    public static final int RULE_ID=6;
    public static final int RULE_WS=16;
    public static final int RULE_ANY_OTHER=18;
    public static final int RULE_MODULE_WORD=13;
    public static final int T__26=26;
    public static final int RULE_INT=17;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=14;
    public static final int T__23=23;
    public static final int RULE_SYMBOL=8;
    public static final int RULE_DEF_WORD=12;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_END_WORD=5;
    public static final int RULE_BELONGS_TO_WORD=11;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalRailsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRailsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRailsParser.tokenNames; }
    public String getGrammarFileName() { return "../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g"; }



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
    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:67:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:68:2: (iv_ruleClass= ruleClass EOF )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:69:2: iv_ruleClass= ruleClass EOF
            {
             newCompositeNode(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_ruleClass_in_entryRuleClass75);
            iv_ruleClass=ruleClass();

            state._fsp--;

             current =iv_ruleClass; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClass85); 

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
    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:76:1: ruleClass returns [EObject current=null] : (this_CLASS_WORD_0= RULE_CLASS_WORD (otherlv_1= ' ' )* ( (lv_name_2_0= ruleNamespacedModuleName ) ) ( (otherlv_3= ' ' )* otherlv_4= '<' (otherlv_5= ' ' )* ( (lv_superType_6_0= ruleNamespacedModuleName ) ) )? (otherlv_7= ' ' )* ( (lv_classElements_8_0= ruleClassElement ) )* this_END_WORD_9= RULE_END_WORD ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token this_CLASS_WORD_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token this_END_WORD_9=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_superType_6_0 = null;

        EObject lv_classElements_8_0 = null;


         enterRule(); 
            
        try {
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:79:28: ( (this_CLASS_WORD_0= RULE_CLASS_WORD (otherlv_1= ' ' )* ( (lv_name_2_0= ruleNamespacedModuleName ) ) ( (otherlv_3= ' ' )* otherlv_4= '<' (otherlv_5= ' ' )* ( (lv_superType_6_0= ruleNamespacedModuleName ) ) )? (otherlv_7= ' ' )* ( (lv_classElements_8_0= ruleClassElement ) )* this_END_WORD_9= RULE_END_WORD ) )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:80:1: (this_CLASS_WORD_0= RULE_CLASS_WORD (otherlv_1= ' ' )* ( (lv_name_2_0= ruleNamespacedModuleName ) ) ( (otherlv_3= ' ' )* otherlv_4= '<' (otherlv_5= ' ' )* ( (lv_superType_6_0= ruleNamespacedModuleName ) ) )? (otherlv_7= ' ' )* ( (lv_classElements_8_0= ruleClassElement ) )* this_END_WORD_9= RULE_END_WORD )
            {
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:80:1: (this_CLASS_WORD_0= RULE_CLASS_WORD (otherlv_1= ' ' )* ( (lv_name_2_0= ruleNamespacedModuleName ) ) ( (otherlv_3= ' ' )* otherlv_4= '<' (otherlv_5= ' ' )* ( (lv_superType_6_0= ruleNamespacedModuleName ) ) )? (otherlv_7= ' ' )* ( (lv_classElements_8_0= ruleClassElement ) )* this_END_WORD_9= RULE_END_WORD )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:80:2: this_CLASS_WORD_0= RULE_CLASS_WORD (otherlv_1= ' ' )* ( (lv_name_2_0= ruleNamespacedModuleName ) ) ( (otherlv_3= ' ' )* otherlv_4= '<' (otherlv_5= ' ' )* ( (lv_superType_6_0= ruleNamespacedModuleName ) ) )? (otherlv_7= ' ' )* ( (lv_classElements_8_0= ruleClassElement ) )* this_END_WORD_9= RULE_END_WORD
            {
            this_CLASS_WORD_0=(Token)match(input,RULE_CLASS_WORD,FOLLOW_RULE_CLASS_WORD_in_ruleClass121); 
             
                newLeafNode(this_CLASS_WORD_0, grammarAccess.getClassAccess().getCLASS_WORDTerminalRuleCall_0()); 
                
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:84:1: (otherlv_1= ' ' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==19) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:84:3: otherlv_1= ' '
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleClass133); 

            	        	newLeafNode(otherlv_1, grammarAccess.getClassAccess().getSpaceKeyword_1());
            	        

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:88:3: ( (lv_name_2_0= ruleNamespacedModuleName ) )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:89:1: (lv_name_2_0= ruleNamespacedModuleName )
            {
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:89:1: (lv_name_2_0= ruleNamespacedModuleName )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:90:3: lv_name_2_0= ruleNamespacedModuleName
            {
             
            	        newCompositeNode(grammarAccess.getClassAccess().getNameNamespacedModuleNameParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleNamespacedModuleName_in_ruleClass156);
            lv_name_2_0=ruleNamespacedModuleName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getClassRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"NamespacedModuleName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:106:2: ( (otherlv_3= ' ' )* otherlv_4= '<' (otherlv_5= ' ' )* ( (lv_superType_6_0= ruleNamespacedModuleName ) ) )?
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:106:3: (otherlv_3= ' ' )* otherlv_4= '<' (otherlv_5= ' ' )* ( (lv_superType_6_0= ruleNamespacedModuleName ) )
                    {
                    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:106:3: (otherlv_3= ' ' )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==19) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:106:5: otherlv_3= ' '
                    	    {
                    	    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleClass170); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getClassAccess().getSpaceKeyword_3_0());
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleClass184); 

                        	newLeafNode(otherlv_4, grammarAccess.getClassAccess().getLessThanSignKeyword_3_1());
                        
                    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:114:1: (otherlv_5= ' ' )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==19) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:114:3: otherlv_5= ' '
                    	    {
                    	    otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleClass197); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getClassAccess().getSpaceKeyword_3_2());
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:118:3: ( (lv_superType_6_0= ruleNamespacedModuleName ) )
                    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:119:1: (lv_superType_6_0= ruleNamespacedModuleName )
                    {
                    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:119:1: (lv_superType_6_0= ruleNamespacedModuleName )
                    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:120:3: lv_superType_6_0= ruleNamespacedModuleName
                    {
                     
                    	        newCompositeNode(grammarAccess.getClassAccess().getSuperTypeNamespacedModuleNameParserRuleCall_3_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNamespacedModuleName_in_ruleClass220);
                    lv_superType_6_0=ruleNamespacedModuleName();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClassRule());
                    	        }
                           		set(
                           			current, 
                           			"superType",
                            		lv_superType_6_0, 
                            		"NamespacedModuleName");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:136:4: (otherlv_7= ' ' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:136:6: otherlv_7= ' '
            	    {
            	    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleClass235); 

            	        	newLeafNode(otherlv_7, grammarAccess.getClassAccess().getSpaceKeyword_4());
            	        

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:140:3: ( (lv_classElements_8_0= ruleClassElement ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_HAS_MANY_WORD||(LA6_0>=RULE_HAS_AND_BELONGS_TO_MANY_WORD && LA6_0<=RULE_DEF_WORD)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:141:1: (lv_classElements_8_0= ruleClassElement )
            	    {
            	    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:141:1: (lv_classElements_8_0= ruleClassElement )
            	    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:142:3: lv_classElements_8_0= ruleClassElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getClassAccess().getClassElementsClassElementParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleClassElement_in_ruleClass258);
            	    lv_classElements_8_0=ruleClassElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getClassRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"classElements",
            	            		lv_classElements_8_0, 
            	            		"ClassElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            this_END_WORD_9=(Token)match(input,RULE_END_WORD,FOLLOW_RULE_END_WORD_in_ruleClass270); 
             
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
    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:170:1: entryRuleNamespacedModuleName returns [String current=null] : iv_ruleNamespacedModuleName= ruleNamespacedModuleName EOF ;
    public final String entryRuleNamespacedModuleName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNamespacedModuleName = null;


        try {
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:171:2: (iv_ruleNamespacedModuleName= ruleNamespacedModuleName EOF )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:172:2: iv_ruleNamespacedModuleName= ruleNamespacedModuleName EOF
            {
             newCompositeNode(grammarAccess.getNamespacedModuleNameRule()); 
            pushFollow(FOLLOW_ruleNamespacedModuleName_in_entryRuleNamespacedModuleName306);
            iv_ruleNamespacedModuleName=ruleNamespacedModuleName();

            state._fsp--;

             current =iv_ruleNamespacedModuleName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamespacedModuleName317); 

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
    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:179:1: ruleNamespacedModuleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID kw= '::' )* this_ID_2= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleNamespacedModuleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:182:28: ( ( (this_ID_0= RULE_ID kw= '::' )* this_ID_2= RULE_ID ) )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:183:1: ( (this_ID_0= RULE_ID kw= '::' )* this_ID_2= RULE_ID )
            {
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:183:1: ( (this_ID_0= RULE_ID kw= '::' )* this_ID_2= RULE_ID )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:183:2: (this_ID_0= RULE_ID kw= '::' )* this_ID_2= RULE_ID
            {
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:183:2: (this_ID_0= RULE_ID kw= '::' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1==21) ) {
                        alt7=1;
                    }


                }


                switch (alt7) {
            	case 1 :
            	    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:183:7: this_ID_0= RULE_ID kw= '::'
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNamespacedModuleName358); 

            	    		current.merge(this_ID_0);
            	        
            	     
            	        newLeafNode(this_ID_0, grammarAccess.getNamespacedModuleNameAccess().getIDTerminalRuleCall_0_0()); 
            	        
            	    kw=(Token)match(input,21,FOLLOW_21_in_ruleNamespacedModuleName376); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getNamespacedModuleNameAccess().getColonColonKeyword_0_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNamespacedModuleName393); 

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


    // $ANTLR start "entryRuleClassElement"
    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:211:1: entryRuleClassElement returns [EObject current=null] : iv_ruleClassElement= ruleClassElement EOF ;
    public final EObject entryRuleClassElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassElement = null;


        try {
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:212:2: (iv_ruleClassElement= ruleClassElement EOF )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:213:2: iv_ruleClassElement= ruleClassElement EOF
            {
             newCompositeNode(grammarAccess.getClassElementRule()); 
            pushFollow(FOLLOW_ruleClassElement_in_entryRuleClassElement438);
            iv_ruleClassElement=ruleClassElement();

            state._fsp--;

             current =iv_ruleClassElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassElement448); 

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
    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:220:1: ruleClassElement returns [EObject current=null] : (this_Method_0= ruleMethod | this_Relationship_1= ruleRelationship ) ;
    public final EObject ruleClassElement() throws RecognitionException {
        EObject current = null;

        EObject this_Method_0 = null;

        EObject this_Relationship_1 = null;


         enterRule(); 
            
        try {
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:223:28: ( (this_Method_0= ruleMethod | this_Relationship_1= ruleRelationship ) )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:224:1: (this_Method_0= ruleMethod | this_Relationship_1= ruleRelationship )
            {
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:224:1: (this_Method_0= ruleMethod | this_Relationship_1= ruleRelationship )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_DEF_WORD) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_HAS_MANY_WORD||(LA8_0>=RULE_HAS_AND_BELONGS_TO_MANY_WORD && LA8_0<=RULE_BELONGS_TO_WORD)) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:225:5: this_Method_0= ruleMethod
                    {
                     
                            newCompositeNode(grammarAccess.getClassElementAccess().getMethodParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleMethod_in_ruleClassElement495);
                    this_Method_0=ruleMethod();

                    state._fsp--;

                     
                            current = this_Method_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:235:5: this_Relationship_1= ruleRelationship
                    {
                     
                            newCompositeNode(grammarAccess.getClassElementAccess().getRelationshipParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleRelationship_in_ruleClassElement522);
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
    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:251:1: entryRuleRelationship returns [EObject current=null] : iv_ruleRelationship= ruleRelationship EOF ;
    public final EObject entryRuleRelationship() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationship = null;


        try {
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:252:2: (iv_ruleRelationship= ruleRelationship EOF )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:253:2: iv_ruleRelationship= ruleRelationship EOF
            {
             newCompositeNode(grammarAccess.getRelationshipRule()); 
            pushFollow(FOLLOW_ruleRelationship_in_entryRuleRelationship557);
            iv_ruleRelationship=ruleRelationship();

            state._fsp--;

             current =iv_ruleRelationship; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationship567); 

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
    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:260:1: ruleRelationship returns [EObject current=null] : (this_HasMany_0= ruleHasMany | this_HasAndBelongsToMany_1= ruleHasAndBelongsToMany | this_BelongsTo_2= ruleBelongsTo ) ;
    public final EObject ruleRelationship() throws RecognitionException {
        EObject current = null;

        EObject this_HasMany_0 = null;

        EObject this_HasAndBelongsToMany_1 = null;

        EObject this_BelongsTo_2 = null;


         enterRule(); 
            
        try {
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:263:28: ( (this_HasMany_0= ruleHasMany | this_HasAndBelongsToMany_1= ruleHasAndBelongsToMany | this_BelongsTo_2= ruleBelongsTo ) )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:264:1: (this_HasMany_0= ruleHasMany | this_HasAndBelongsToMany_1= ruleHasAndBelongsToMany | this_BelongsTo_2= ruleBelongsTo )
            {
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:264:1: (this_HasMany_0= ruleHasMany | this_HasAndBelongsToMany_1= ruleHasAndBelongsToMany | this_BelongsTo_2= ruleBelongsTo )
            int alt9=3;
            switch ( input.LA(1) ) {
            case RULE_HAS_MANY_WORD:
                {
                alt9=1;
                }
                break;
            case RULE_HAS_AND_BELONGS_TO_MANY_WORD:
                {
                alt9=2;
                }
                break;
            case RULE_BELONGS_TO_WORD:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:265:5: this_HasMany_0= ruleHasMany
                    {
                     
                            newCompositeNode(grammarAccess.getRelationshipAccess().getHasManyParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleHasMany_in_ruleRelationship614);
                    this_HasMany_0=ruleHasMany();

                    state._fsp--;

                     
                            current = this_HasMany_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:275:5: this_HasAndBelongsToMany_1= ruleHasAndBelongsToMany
                    {
                     
                            newCompositeNode(grammarAccess.getRelationshipAccess().getHasAndBelongsToManyParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleHasAndBelongsToMany_in_ruleRelationship641);
                    this_HasAndBelongsToMany_1=ruleHasAndBelongsToMany();

                    state._fsp--;

                     
                            current = this_HasAndBelongsToMany_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:285:5: this_BelongsTo_2= ruleBelongsTo
                    {
                     
                            newCompositeNode(grammarAccess.getRelationshipAccess().getBelongsToParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleBelongsTo_in_ruleRelationship668);
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
    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:301:1: entryRuleHasMany returns [EObject current=null] : iv_ruleHasMany= ruleHasMany EOF ;
    public final EObject entryRuleHasMany() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHasMany = null;


        try {
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:302:2: (iv_ruleHasMany= ruleHasMany EOF )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:303:2: iv_ruleHasMany= ruleHasMany EOF
            {
             newCompositeNode(grammarAccess.getHasManyRule()); 
            pushFollow(FOLLOW_ruleHasMany_in_entryRuleHasMany703);
            iv_ruleHasMany=ruleHasMany();

            state._fsp--;

             current =iv_ruleHasMany; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHasMany713); 

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
    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:310:1: ruleHasMany returns [EObject current=null] : (this_HAS_MANY_WORD_0= RULE_HAS_MANY_WORD (otherlv_1= ' ' )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (otherlv_3= ' ' )* ( (lv_options_4_0= ruleHashKeyValue ) )* ) ;
    public final EObject ruleHasMany() throws RecognitionException {
        EObject current = null;

        Token this_HAS_MANY_WORD_0=null;
        Token otherlv_1=null;
        Token lv_name_2_1=null;
        Token lv_name_2_2=null;
        Token otherlv_3=null;
        EObject lv_options_4_0 = null;


         enterRule(); 
            
        try {
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:313:28: ( (this_HAS_MANY_WORD_0= RULE_HAS_MANY_WORD (otherlv_1= ' ' )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (otherlv_3= ' ' )* ( (lv_options_4_0= ruleHashKeyValue ) )* ) )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:314:1: (this_HAS_MANY_WORD_0= RULE_HAS_MANY_WORD (otherlv_1= ' ' )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (otherlv_3= ' ' )* ( (lv_options_4_0= ruleHashKeyValue ) )* )
            {
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:314:1: (this_HAS_MANY_WORD_0= RULE_HAS_MANY_WORD (otherlv_1= ' ' )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (otherlv_3= ' ' )* ( (lv_options_4_0= ruleHashKeyValue ) )* )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:314:2: this_HAS_MANY_WORD_0= RULE_HAS_MANY_WORD (otherlv_1= ' ' )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (otherlv_3= ' ' )* ( (lv_options_4_0= ruleHashKeyValue ) )*
            {
            this_HAS_MANY_WORD_0=(Token)match(input,RULE_HAS_MANY_WORD,FOLLOW_RULE_HAS_MANY_WORD_in_ruleHasMany749); 
             
                newLeafNode(this_HAS_MANY_WORD_0, grammarAccess.getHasManyAccess().getHAS_MANY_WORDTerminalRuleCall_0()); 
                
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:318:1: (otherlv_1= ' ' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==19) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:318:3: otherlv_1= ' '
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleHasMany761); 

            	        	newLeafNode(otherlv_1, grammarAccess.getHasManyAccess().getSpaceKeyword_1());
            	        

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:322:3: ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:323:1: ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) )
            {
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:323:1: ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:324:1: (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING )
            {
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:324:1: (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_SYMBOL) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_STRING) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:325:3: lv_name_2_1= RULE_SYMBOL
                    {
                    lv_name_2_1=(Token)match(input,RULE_SYMBOL,FOLLOW_RULE_SYMBOL_in_ruleHasMany782); 

                    			newLeafNode(lv_name_2_1, grammarAccess.getHasManyAccess().getNameSYMBOLTerminalRuleCall_2_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getHasManyRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_2_1, 
                            		"SYMBOL");
                    	    

                    }
                    break;
                case 2 :
                    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:340:8: lv_name_2_2= RULE_STRING
                    {
                    lv_name_2_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleHasMany802); 

                    			newLeafNode(lv_name_2_2, grammarAccess.getHasManyAccess().getNameSTRINGTerminalRuleCall_2_0_1()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getHasManyRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_2_2, 
                            		"STRING");
                    	    

                    }
                    break;

            }


            }


            }

            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:358:2: (otherlv_3= ' ' )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==19) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:358:4: otherlv_3= ' '
            	    {
            	    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleHasMany823); 

            	        	newLeafNode(otherlv_3, grammarAccess.getHasManyAccess().getSpaceKeyword_3());
            	        

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:362:3: ( (lv_options_4_0= ruleHashKeyValue ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==22) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:363:1: (lv_options_4_0= ruleHashKeyValue )
            	    {
            	    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:363:1: (lv_options_4_0= ruleHashKeyValue )
            	    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:364:3: lv_options_4_0= ruleHashKeyValue
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getHasManyAccess().getOptionsHashKeyValueParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleHashKeyValue_in_ruleHasMany846);
            	    lv_options_4_0=ruleHashKeyValue();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getHasManyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"options",
            	            		lv_options_4_0, 
            	            		"HashKeyValue");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // $ANTLR end "ruleHasMany"


    // $ANTLR start "entryRuleHasAndBelongsToMany"
    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:388:1: entryRuleHasAndBelongsToMany returns [EObject current=null] : iv_ruleHasAndBelongsToMany= ruleHasAndBelongsToMany EOF ;
    public final EObject entryRuleHasAndBelongsToMany() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHasAndBelongsToMany = null;


        try {
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:389:2: (iv_ruleHasAndBelongsToMany= ruleHasAndBelongsToMany EOF )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:390:2: iv_ruleHasAndBelongsToMany= ruleHasAndBelongsToMany EOF
            {
             newCompositeNode(grammarAccess.getHasAndBelongsToManyRule()); 
            pushFollow(FOLLOW_ruleHasAndBelongsToMany_in_entryRuleHasAndBelongsToMany883);
            iv_ruleHasAndBelongsToMany=ruleHasAndBelongsToMany();

            state._fsp--;

             current =iv_ruleHasAndBelongsToMany; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHasAndBelongsToMany893); 

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
    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:397:1: ruleHasAndBelongsToMany returns [EObject current=null] : (this_HAS_AND_BELONGS_TO_MANY_WORD_0= RULE_HAS_AND_BELONGS_TO_MANY_WORD (otherlv_1= ' ' )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (otherlv_3= ' ' )* ( (lv_options_4_0= ruleHashKeyValue ) )* ) ;
    public final EObject ruleHasAndBelongsToMany() throws RecognitionException {
        EObject current = null;

        Token this_HAS_AND_BELONGS_TO_MANY_WORD_0=null;
        Token otherlv_1=null;
        Token lv_name_2_1=null;
        Token lv_name_2_2=null;
        Token otherlv_3=null;
        EObject lv_options_4_0 = null;


         enterRule(); 
            
        try {
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:400:28: ( (this_HAS_AND_BELONGS_TO_MANY_WORD_0= RULE_HAS_AND_BELONGS_TO_MANY_WORD (otherlv_1= ' ' )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (otherlv_3= ' ' )* ( (lv_options_4_0= ruleHashKeyValue ) )* ) )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:401:1: (this_HAS_AND_BELONGS_TO_MANY_WORD_0= RULE_HAS_AND_BELONGS_TO_MANY_WORD (otherlv_1= ' ' )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (otherlv_3= ' ' )* ( (lv_options_4_0= ruleHashKeyValue ) )* )
            {
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:401:1: (this_HAS_AND_BELONGS_TO_MANY_WORD_0= RULE_HAS_AND_BELONGS_TO_MANY_WORD (otherlv_1= ' ' )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (otherlv_3= ' ' )* ( (lv_options_4_0= ruleHashKeyValue ) )* )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:401:2: this_HAS_AND_BELONGS_TO_MANY_WORD_0= RULE_HAS_AND_BELONGS_TO_MANY_WORD (otherlv_1= ' ' )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (otherlv_3= ' ' )* ( (lv_options_4_0= ruleHashKeyValue ) )*
            {
            this_HAS_AND_BELONGS_TO_MANY_WORD_0=(Token)match(input,RULE_HAS_AND_BELONGS_TO_MANY_WORD,FOLLOW_RULE_HAS_AND_BELONGS_TO_MANY_WORD_in_ruleHasAndBelongsToMany929); 
             
                newLeafNode(this_HAS_AND_BELONGS_TO_MANY_WORD_0, grammarAccess.getHasAndBelongsToManyAccess().getHAS_AND_BELONGS_TO_MANY_WORDTerminalRuleCall_0()); 
                
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:405:1: (otherlv_1= ' ' )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==19) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:405:3: otherlv_1= ' '
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleHasAndBelongsToMany941); 

            	        	newLeafNode(otherlv_1, grammarAccess.getHasAndBelongsToManyAccess().getSpaceKeyword_1());
            	        

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:409:3: ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:410:1: ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) )
            {
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:410:1: ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:411:1: (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING )
            {
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:411:1: (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_SYMBOL) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_STRING) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:412:3: lv_name_2_1= RULE_SYMBOL
                    {
                    lv_name_2_1=(Token)match(input,RULE_SYMBOL,FOLLOW_RULE_SYMBOL_in_ruleHasAndBelongsToMany962); 

                    			newLeafNode(lv_name_2_1, grammarAccess.getHasAndBelongsToManyAccess().getNameSYMBOLTerminalRuleCall_2_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getHasAndBelongsToManyRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_2_1, 
                            		"SYMBOL");
                    	    

                    }
                    break;
                case 2 :
                    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:427:8: lv_name_2_2= RULE_STRING
                    {
                    lv_name_2_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleHasAndBelongsToMany982); 

                    			newLeafNode(lv_name_2_2, grammarAccess.getHasAndBelongsToManyAccess().getNameSTRINGTerminalRuleCall_2_0_1()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getHasAndBelongsToManyRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_2_2, 
                            		"STRING");
                    	    

                    }
                    break;

            }


            }


            }

            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:445:2: (otherlv_3= ' ' )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==19) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:445:4: otherlv_3= ' '
            	    {
            	    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleHasAndBelongsToMany1003); 

            	        	newLeafNode(otherlv_3, grammarAccess.getHasAndBelongsToManyAccess().getSpaceKeyword_3());
            	        

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:449:3: ( (lv_options_4_0= ruleHashKeyValue ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==22) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:450:1: (lv_options_4_0= ruleHashKeyValue )
            	    {
            	    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:450:1: (lv_options_4_0= ruleHashKeyValue )
            	    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:451:3: lv_options_4_0= ruleHashKeyValue
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getHasAndBelongsToManyAccess().getOptionsHashKeyValueParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleHashKeyValue_in_ruleHasAndBelongsToMany1026);
            	    lv_options_4_0=ruleHashKeyValue();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getHasAndBelongsToManyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"options",
            	            		lv_options_4_0, 
            	            		"HashKeyValue");
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
    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:475:1: entryRuleBelongsTo returns [EObject current=null] : iv_ruleBelongsTo= ruleBelongsTo EOF ;
    public final EObject entryRuleBelongsTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBelongsTo = null;


        try {
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:476:2: (iv_ruleBelongsTo= ruleBelongsTo EOF )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:477:2: iv_ruleBelongsTo= ruleBelongsTo EOF
            {
             newCompositeNode(grammarAccess.getBelongsToRule()); 
            pushFollow(FOLLOW_ruleBelongsTo_in_entryRuleBelongsTo1063);
            iv_ruleBelongsTo=ruleBelongsTo();

            state._fsp--;

             current =iv_ruleBelongsTo; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBelongsTo1073); 

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
    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:484:1: ruleBelongsTo returns [EObject current=null] : (this_BELONGS_TO_WORD_0= RULE_BELONGS_TO_WORD (otherlv_1= ' ' )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (otherlv_3= ' ' )* ( (lv_options_4_0= ruleHashKeyValue ) )* ) ;
    public final EObject ruleBelongsTo() throws RecognitionException {
        EObject current = null;

        Token this_BELONGS_TO_WORD_0=null;
        Token otherlv_1=null;
        Token lv_name_2_1=null;
        Token lv_name_2_2=null;
        Token otherlv_3=null;
        EObject lv_options_4_0 = null;


         enterRule(); 
            
        try {
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:487:28: ( (this_BELONGS_TO_WORD_0= RULE_BELONGS_TO_WORD (otherlv_1= ' ' )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (otherlv_3= ' ' )* ( (lv_options_4_0= ruleHashKeyValue ) )* ) )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:488:1: (this_BELONGS_TO_WORD_0= RULE_BELONGS_TO_WORD (otherlv_1= ' ' )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (otherlv_3= ' ' )* ( (lv_options_4_0= ruleHashKeyValue ) )* )
            {
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:488:1: (this_BELONGS_TO_WORD_0= RULE_BELONGS_TO_WORD (otherlv_1= ' ' )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (otherlv_3= ' ' )* ( (lv_options_4_0= ruleHashKeyValue ) )* )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:488:2: this_BELONGS_TO_WORD_0= RULE_BELONGS_TO_WORD (otherlv_1= ' ' )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (otherlv_3= ' ' )* ( (lv_options_4_0= ruleHashKeyValue ) )*
            {
            this_BELONGS_TO_WORD_0=(Token)match(input,RULE_BELONGS_TO_WORD,FOLLOW_RULE_BELONGS_TO_WORD_in_ruleBelongsTo1109); 
             
                newLeafNode(this_BELONGS_TO_WORD_0, grammarAccess.getBelongsToAccess().getBELONGS_TO_WORDTerminalRuleCall_0()); 
                
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:492:1: (otherlv_1= ' ' )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==19) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:492:3: otherlv_1= ' '
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleBelongsTo1121); 

            	        	newLeafNode(otherlv_1, grammarAccess.getBelongsToAccess().getSpaceKeyword_1());
            	        

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:496:3: ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:497:1: ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) )
            {
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:497:1: ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:498:1: (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING )
            {
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:498:1: (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_SYMBOL) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_STRING) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:499:3: lv_name_2_1= RULE_SYMBOL
                    {
                    lv_name_2_1=(Token)match(input,RULE_SYMBOL,FOLLOW_RULE_SYMBOL_in_ruleBelongsTo1142); 

                    			newLeafNode(lv_name_2_1, grammarAccess.getBelongsToAccess().getNameSYMBOLTerminalRuleCall_2_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBelongsToRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_2_1, 
                            		"SYMBOL");
                    	    

                    }
                    break;
                case 2 :
                    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:514:8: lv_name_2_2= RULE_STRING
                    {
                    lv_name_2_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBelongsTo1162); 

                    			newLeafNode(lv_name_2_2, grammarAccess.getBelongsToAccess().getNameSTRINGTerminalRuleCall_2_0_1()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBelongsToRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_2_2, 
                            		"STRING");
                    	    

                    }
                    break;

            }


            }


            }

            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:532:2: (otherlv_3= ' ' )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==19) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:532:4: otherlv_3= ' '
            	    {
            	    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleBelongsTo1183); 

            	        	newLeafNode(otherlv_3, grammarAccess.getBelongsToAccess().getSpaceKeyword_3());
            	        

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:536:3: ( (lv_options_4_0= ruleHashKeyValue ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==22) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:537:1: (lv_options_4_0= ruleHashKeyValue )
            	    {
            	    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:537:1: (lv_options_4_0= ruleHashKeyValue )
            	    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:538:3: lv_options_4_0= ruleHashKeyValue
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBelongsToAccess().getOptionsHashKeyValueParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleHashKeyValue_in_ruleBelongsTo1206);
            	    lv_options_4_0=ruleHashKeyValue();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBelongsToRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"options",
            	            		lv_options_4_0, 
            	            		"HashKeyValue");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:562:1: entryRuleHashKeyValue returns [EObject current=null] : iv_ruleHashKeyValue= ruleHashKeyValue EOF ;
    public final EObject entryRuleHashKeyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHashKeyValue = null;


        try {
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:563:2: (iv_ruleHashKeyValue= ruleHashKeyValue EOF )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:564:2: iv_ruleHashKeyValue= ruleHashKeyValue EOF
            {
             newCompositeNode(grammarAccess.getHashKeyValueRule()); 
            pushFollow(FOLLOW_ruleHashKeyValue_in_entryRuleHashKeyValue1243);
            iv_ruleHashKeyValue=ruleHashKeyValue();

            state._fsp--;

             current =iv_ruleHashKeyValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHashKeyValue1253); 

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
    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:571:1: ruleHashKeyValue returns [EObject current=null] : (otherlv_0= ',' (otherlv_1= ' ' )* ( ( ( (lv_key_2_0= RULE_ID ) ) otherlv_3= ':' ) | ( ( ( (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING ) ) ) (otherlv_5= ' ' )* otherlv_6= '=>' ) ) (otherlv_7= ' ' )* ( ( (lv_value_8_1= RULE_SYMBOL | lv_value_8_2= RULE_STRING ) ) ) ) ;
    public final EObject ruleHashKeyValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_key_2_0=null;
        Token otherlv_3=null;
        Token lv_key_4_1=null;
        Token lv_key_4_2=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_value_8_1=null;
        Token lv_value_8_2=null;

         enterRule(); 
            
        try {
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:574:28: ( (otherlv_0= ',' (otherlv_1= ' ' )* ( ( ( (lv_key_2_0= RULE_ID ) ) otherlv_3= ':' ) | ( ( ( (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING ) ) ) (otherlv_5= ' ' )* otherlv_6= '=>' ) ) (otherlv_7= ' ' )* ( ( (lv_value_8_1= RULE_SYMBOL | lv_value_8_2= RULE_STRING ) ) ) ) )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:575:1: (otherlv_0= ',' (otherlv_1= ' ' )* ( ( ( (lv_key_2_0= RULE_ID ) ) otherlv_3= ':' ) | ( ( ( (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING ) ) ) (otherlv_5= ' ' )* otherlv_6= '=>' ) ) (otherlv_7= ' ' )* ( ( (lv_value_8_1= RULE_SYMBOL | lv_value_8_2= RULE_STRING ) ) ) )
            {
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:575:1: (otherlv_0= ',' (otherlv_1= ' ' )* ( ( ( (lv_key_2_0= RULE_ID ) ) otherlv_3= ':' ) | ( ( ( (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING ) ) ) (otherlv_5= ' ' )* otherlv_6= '=>' ) ) (otherlv_7= ' ' )* ( ( (lv_value_8_1= RULE_SYMBOL | lv_value_8_2= RULE_STRING ) ) ) )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:575:3: otherlv_0= ',' (otherlv_1= ' ' )* ( ( ( (lv_key_2_0= RULE_ID ) ) otherlv_3= ':' ) | ( ( ( (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING ) ) ) (otherlv_5= ' ' )* otherlv_6= '=>' ) ) (otherlv_7= ' ' )* ( ( (lv_value_8_1= RULE_SYMBOL | lv_value_8_2= RULE_STRING ) ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleHashKeyValue1290); 

                	newLeafNode(otherlv_0, grammarAccess.getHashKeyValueAccess().getCommaKeyword_0());
                
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:579:1: (otherlv_1= ' ' )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==19) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:579:3: otherlv_1= ' '
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleHashKeyValue1303); 

            	        	newLeafNode(otherlv_1, grammarAccess.getHashKeyValueAccess().getSpaceKeyword_1());
            	        

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:583:3: ( ( ( (lv_key_2_0= RULE_ID ) ) otherlv_3= ':' ) | ( ( ( (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING ) ) ) (otherlv_5= ' ' )* otherlv_6= '=>' ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID) ) {
                alt25=1;
            }
            else if ( ((LA25_0>=RULE_SYMBOL && LA25_0<=RULE_STRING)) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:583:4: ( ( (lv_key_2_0= RULE_ID ) ) otherlv_3= ':' )
                    {
                    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:583:4: ( ( (lv_key_2_0= RULE_ID ) ) otherlv_3= ':' )
                    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:583:5: ( (lv_key_2_0= RULE_ID ) ) otherlv_3= ':'
                    {
                    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:583:5: ( (lv_key_2_0= RULE_ID ) )
                    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:584:1: (lv_key_2_0= RULE_ID )
                    {
                    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:584:1: (lv_key_2_0= RULE_ID )
                    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:585:3: lv_key_2_0= RULE_ID
                    {
                    lv_key_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleHashKeyValue1324); 

                    			newLeafNode(lv_key_2_0, grammarAccess.getHashKeyValueAccess().getKeyIDTerminalRuleCall_2_0_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getHashKeyValueRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"key",
                            		lv_key_2_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleHashKeyValue1341); 

                        	newLeafNode(otherlv_3, grammarAccess.getHashKeyValueAccess().getColonKeyword_2_0_1());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:606:6: ( ( ( (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING ) ) ) (otherlv_5= ' ' )* otherlv_6= '=>' )
                    {
                    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:606:6: ( ( ( (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING ) ) ) (otherlv_5= ' ' )* otherlv_6= '=>' )
                    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:606:7: ( ( (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING ) ) ) (otherlv_5= ' ' )* otherlv_6= '=>'
                    {
                    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:606:7: ( ( (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING ) ) )
                    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:607:1: ( (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING ) )
                    {
                    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:607:1: ( (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING ) )
                    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:608:1: (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING )
                    {
                    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:608:1: (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING )
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==RULE_SYMBOL) ) {
                        alt23=1;
                    }
                    else if ( (LA23_0==RULE_STRING) ) {
                        alt23=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 0, input);

                        throw nvae;
                    }
                    switch (alt23) {
                        case 1 :
                            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:609:3: lv_key_4_1= RULE_SYMBOL
                            {
                            lv_key_4_1=(Token)match(input,RULE_SYMBOL,FOLLOW_RULE_SYMBOL_in_ruleHashKeyValue1368); 

                            			newLeafNode(lv_key_4_1, grammarAccess.getHashKeyValueAccess().getKeySYMBOLTerminalRuleCall_2_1_0_0_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getHashKeyValueRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"key",
                                    		lv_key_4_1, 
                                    		"SYMBOL");
                            	    

                            }
                            break;
                        case 2 :
                            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:624:8: lv_key_4_2= RULE_STRING
                            {
                            lv_key_4_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleHashKeyValue1388); 

                            			newLeafNode(lv_key_4_2, grammarAccess.getHashKeyValueAccess().getKeySTRINGTerminalRuleCall_2_1_0_0_1()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getHashKeyValueRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"key",
                                    		lv_key_4_2, 
                                    		"STRING");
                            	    

                            }
                            break;

                    }


                    }


                    }

                    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:642:2: (otherlv_5= ' ' )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==19) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:642:4: otherlv_5= ' '
                    	    {
                    	    otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleHashKeyValue1409); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getHashKeyValueAccess().getSpaceKeyword_2_1_1());
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,24,FOLLOW_24_in_ruleHashKeyValue1423); 

                        	newLeafNode(otherlv_6, grammarAccess.getHashKeyValueAccess().getEqualsSignGreaterThanSignKeyword_2_1_2());
                        

                    }


                    }
                    break;

            }

            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:650:3: (otherlv_7= ' ' )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==19) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:650:5: otherlv_7= ' '
            	    {
            	    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleHashKeyValue1438); 

            	        	newLeafNode(otherlv_7, grammarAccess.getHashKeyValueAccess().getSpaceKeyword_3());
            	        

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:654:3: ( ( (lv_value_8_1= RULE_SYMBOL | lv_value_8_2= RULE_STRING ) ) )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:655:1: ( (lv_value_8_1= RULE_SYMBOL | lv_value_8_2= RULE_STRING ) )
            {
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:655:1: ( (lv_value_8_1= RULE_SYMBOL | lv_value_8_2= RULE_STRING ) )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:656:1: (lv_value_8_1= RULE_SYMBOL | lv_value_8_2= RULE_STRING )
            {
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:656:1: (lv_value_8_1= RULE_SYMBOL | lv_value_8_2= RULE_STRING )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_SYMBOL) ) {
                alt27=1;
            }
            else if ( (LA27_0==RULE_STRING) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:657:3: lv_value_8_1= RULE_SYMBOL
                    {
                    lv_value_8_1=(Token)match(input,RULE_SYMBOL,FOLLOW_RULE_SYMBOL_in_ruleHashKeyValue1459); 

                    			newLeafNode(lv_value_8_1, grammarAccess.getHashKeyValueAccess().getValueSYMBOLTerminalRuleCall_4_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getHashKeyValueRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_8_1, 
                            		"SYMBOL");
                    	    

                    }
                    break;
                case 2 :
                    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:672:8: lv_value_8_2= RULE_STRING
                    {
                    lv_value_8_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleHashKeyValue1479); 

                    			newLeafNode(lv_value_8_2, grammarAccess.getHashKeyValueAccess().getValueSTRINGTerminalRuleCall_4_0_1()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getHashKeyValueRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_8_2, 
                            		"STRING");
                    	    

                    }
                    break;

            }


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
    // $ANTLR end "ruleHashKeyValue"


    // $ANTLR start "entryRuleMethod"
    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:698:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:699:2: (iv_ruleMethod= ruleMethod EOF )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:700:2: iv_ruleMethod= ruleMethod EOF
            {
             newCompositeNode(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_ruleMethod_in_entryRuleMethod1523);
            iv_ruleMethod=ruleMethod();

            state._fsp--;

             current =iv_ruleMethod; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethod1533); 

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
    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:707:1: ruleMethod returns [EObject current=null] : (this_DEF_WORD_0= RULE_DEF_WORD ( (lv_name_1_0= ruleMethodName ) ) ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        Token this_DEF_WORD_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:710:28: ( (this_DEF_WORD_0= RULE_DEF_WORD ( (lv_name_1_0= ruleMethodName ) ) ) )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:711:1: (this_DEF_WORD_0= RULE_DEF_WORD ( (lv_name_1_0= ruleMethodName ) ) )
            {
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:711:1: (this_DEF_WORD_0= RULE_DEF_WORD ( (lv_name_1_0= ruleMethodName ) ) )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:711:2: this_DEF_WORD_0= RULE_DEF_WORD ( (lv_name_1_0= ruleMethodName ) )
            {
            this_DEF_WORD_0=(Token)match(input,RULE_DEF_WORD,FOLLOW_RULE_DEF_WORD_in_ruleMethod1569); 
             
                newLeafNode(this_DEF_WORD_0, grammarAccess.getMethodAccess().getDEF_WORDTerminalRuleCall_0()); 
                
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:715:1: ( (lv_name_1_0= ruleMethodName ) )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:716:1: (lv_name_1_0= ruleMethodName )
            {
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:716:1: (lv_name_1_0= ruleMethodName )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:717:3: lv_name_1_0= ruleMethodName
            {
             
            	        newCompositeNode(grammarAccess.getMethodAccess().getNameMethodNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleMethodName_in_ruleMethod1589);
            lv_name_1_0=ruleMethodName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMethodRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"MethodName");
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
    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:741:1: entryRuleMethodName returns [String current=null] : iv_ruleMethodName= ruleMethodName EOF ;
    public final String entryRuleMethodName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMethodName = null;


        try {
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:742:2: (iv_ruleMethodName= ruleMethodName EOF )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:743:2: iv_ruleMethodName= ruleMethodName EOF
            {
             newCompositeNode(grammarAccess.getMethodNameRule()); 
            pushFollow(FOLLOW_ruleMethodName_in_entryRuleMethodName1626);
            iv_ruleMethodName=ruleMethodName();

            state._fsp--;

             current =iv_ruleMethodName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodName1637); 

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
    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:750:1: ruleMethodName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '?' | kw= '=' )? ) ;
    public final AntlrDatatypeRuleToken ruleMethodName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:753:28: ( (this_ID_0= RULE_ID (kw= '?' | kw= '=' )? ) )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:754:1: (this_ID_0= RULE_ID (kw= '?' | kw= '=' )? )
            {
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:754:1: (this_ID_0= RULE_ID (kw= '?' | kw= '=' )? )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:754:6: this_ID_0= RULE_ID (kw= '?' | kw= '=' )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMethodName1677); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getMethodNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:761:1: (kw= '?' | kw= '=' )?
            int alt28=3;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==25) ) {
                alt28=1;
            }
            else if ( (LA28_0==26) ) {
                alt28=2;
            }
            switch (alt28) {
                case 1 :
                    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:762:2: kw= '?'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleMethodName1696); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMethodNameAccess().getQuestionMarkKeyword_1_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:769:2: kw= '='
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleMethodName1715); 

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
    static final String DFA4_eotS =
        "\4\uffff";
    static final String DFA4_eofS =
        "\4\uffff";
    static final String DFA4_minS =
        "\2\5\2\uffff";
    static final String DFA4_maxS =
        "\2\24\2\uffff";
    static final String DFA4_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA4_specialS =
        "\4\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\3\1\uffff\1\3\2\uffff\3\3\6\uffff\1\1\1\2",
            "\1\3\1\uffff\1\3\2\uffff\3\3\6\uffff\1\1\1\2",
            "",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "106:2: ( (otherlv_3= ' ' )* otherlv_4= '<' (otherlv_5= ' ' )* ( (lv_superType_6_0= ruleNamespacedModuleName ) ) )?";
        }
    }
 

    public static final BitSet FOLLOW_ruleClass_in_entryRuleClass75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CLASS_WORD_in_ruleClass121 = new BitSet(new long[]{0x0000000000080040L});
    public static final BitSet FOLLOW_19_in_ruleClass133 = new BitSet(new long[]{0x0000000000080040L});
    public static final BitSet FOLLOW_ruleNamespacedModuleName_in_ruleClass156 = new BitSet(new long[]{0x0000000000181CA0L});
    public static final BitSet FOLLOW_19_in_ruleClass170 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_20_in_ruleClass184 = new BitSet(new long[]{0x0000000000080040L});
    public static final BitSet FOLLOW_19_in_ruleClass197 = new BitSet(new long[]{0x0000000000080040L});
    public static final BitSet FOLLOW_ruleNamespacedModuleName_in_ruleClass220 = new BitSet(new long[]{0x0000000000081CA0L});
    public static final BitSet FOLLOW_19_in_ruleClass235 = new BitSet(new long[]{0x0000000000081CA0L});
    public static final BitSet FOLLOW_ruleClassElement_in_ruleClass258 = new BitSet(new long[]{0x0000000000001CA0L});
    public static final BitSet FOLLOW_RULE_END_WORD_in_ruleClass270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespacedModuleName_in_entryRuleNamespacedModuleName306 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamespacedModuleName317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNamespacedModuleName358 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleNamespacedModuleName376 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNamespacedModuleName393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassElement_in_entryRuleClassElement438 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassElement448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_ruleClassElement495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationship_in_ruleClassElement522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationship_in_entryRuleRelationship557 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationship567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHasMany_in_ruleRelationship614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHasAndBelongsToMany_in_ruleRelationship641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBelongsTo_in_ruleRelationship668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHasMany_in_entryRuleHasMany703 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHasMany713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HAS_MANY_WORD_in_ruleHasMany749 = new BitSet(new long[]{0x0000000000080300L});
    public static final BitSet FOLLOW_19_in_ruleHasMany761 = new BitSet(new long[]{0x0000000000080300L});
    public static final BitSet FOLLOW_RULE_SYMBOL_in_ruleHasMany782 = new BitSet(new long[]{0x0000000000480002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleHasMany802 = new BitSet(new long[]{0x0000000000480002L});
    public static final BitSet FOLLOW_19_in_ruleHasMany823 = new BitSet(new long[]{0x0000000000480002L});
    public static final BitSet FOLLOW_ruleHashKeyValue_in_ruleHasMany846 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleHasAndBelongsToMany_in_entryRuleHasAndBelongsToMany883 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHasAndBelongsToMany893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HAS_AND_BELONGS_TO_MANY_WORD_in_ruleHasAndBelongsToMany929 = new BitSet(new long[]{0x0000000000080300L});
    public static final BitSet FOLLOW_19_in_ruleHasAndBelongsToMany941 = new BitSet(new long[]{0x0000000000080300L});
    public static final BitSet FOLLOW_RULE_SYMBOL_in_ruleHasAndBelongsToMany962 = new BitSet(new long[]{0x0000000000480002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleHasAndBelongsToMany982 = new BitSet(new long[]{0x0000000000480002L});
    public static final BitSet FOLLOW_19_in_ruleHasAndBelongsToMany1003 = new BitSet(new long[]{0x0000000000480002L});
    public static final BitSet FOLLOW_ruleHashKeyValue_in_ruleHasAndBelongsToMany1026 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleBelongsTo_in_entryRuleBelongsTo1063 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBelongsTo1073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BELONGS_TO_WORD_in_ruleBelongsTo1109 = new BitSet(new long[]{0x0000000000080300L});
    public static final BitSet FOLLOW_19_in_ruleBelongsTo1121 = new BitSet(new long[]{0x0000000000080300L});
    public static final BitSet FOLLOW_RULE_SYMBOL_in_ruleBelongsTo1142 = new BitSet(new long[]{0x0000000000480002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBelongsTo1162 = new BitSet(new long[]{0x0000000000480002L});
    public static final BitSet FOLLOW_19_in_ruleBelongsTo1183 = new BitSet(new long[]{0x0000000000480002L});
    public static final BitSet FOLLOW_ruleHashKeyValue_in_ruleBelongsTo1206 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleHashKeyValue_in_entryRuleHashKeyValue1243 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHashKeyValue1253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleHashKeyValue1290 = new BitSet(new long[]{0x0000000000080340L});
    public static final BitSet FOLLOW_19_in_ruleHashKeyValue1303 = new BitSet(new long[]{0x0000000000080340L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleHashKeyValue1324 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleHashKeyValue1341 = new BitSet(new long[]{0x0000000000080300L});
    public static final BitSet FOLLOW_RULE_SYMBOL_in_ruleHashKeyValue1368 = new BitSet(new long[]{0x0000000001080000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleHashKeyValue1388 = new BitSet(new long[]{0x0000000001080000L});
    public static final BitSet FOLLOW_19_in_ruleHashKeyValue1409 = new BitSet(new long[]{0x0000000001080000L});
    public static final BitSet FOLLOW_24_in_ruleHashKeyValue1423 = new BitSet(new long[]{0x0000000000080300L});
    public static final BitSet FOLLOW_19_in_ruleHashKeyValue1438 = new BitSet(new long[]{0x0000000000080300L});
    public static final BitSet FOLLOW_RULE_SYMBOL_in_ruleHashKeyValue1459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleHashKeyValue1479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_entryRuleMethod1523 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethod1533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DEF_WORD_in_ruleMethod1569 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleMethodName_in_ruleMethod1589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodName_in_entryRuleMethodName1626 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodName1637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMethodName1677 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_25_in_ruleMethodName1696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleMethodName1715 = new BitSet(new long[]{0x0000000000000002L});

}