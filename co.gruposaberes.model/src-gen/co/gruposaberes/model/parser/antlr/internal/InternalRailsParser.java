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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_CLASS_WORD", "RULE_END_WORD", "RULE_ID", "RULE_HAS_MANY_WORD", "RULE_STRING", "RULE_HAS_AND_BELONGS_TO_MANY_WORD", "RULE_SYMBOL", "RULE_BELONGS_TO_WORD", "RULE_DEF_WORD", "RULE_MODULE_WORD", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_INT", "RULE_ANY_OTHER", "' '", "'<'", "'::'", "','", "':'", "'=>'", "'?'", "'='"
    };
    public static final int RULE_HAS_MANY_WORD=7;
    public static final int RULE_CLASS_WORD=4;
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=15;
    public static final int T__19=19;
    public static final int RULE_HAS_AND_BELONGS_TO_MANY_WORD=9;
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
    public static final int RULE_SYMBOL=10;
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

                if ( (LA6_0==RULE_HAS_MANY_WORD||LA6_0==RULE_HAS_AND_BELONGS_TO_MANY_WORD||(LA6_0>=RULE_BELONGS_TO_WORD && LA6_0<=RULE_DEF_WORD)) ) {
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
            else if ( (LA8_0==RULE_HAS_MANY_WORD||LA8_0==RULE_HAS_AND_BELONGS_TO_MANY_WORD||LA8_0==RULE_BELONGS_TO_WORD) ) {
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
    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:310:1: ruleHasMany returns [EObject current=null] : (this_HAS_MANY_WORD_0= RULE_HAS_MANY_WORD ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleHasMany() throws RecognitionException {
        EObject current = null;

        Token this_HAS_MANY_WORD_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:313:28: ( (this_HAS_MANY_WORD_0= RULE_HAS_MANY_WORD ( (lv_name_1_0= RULE_STRING ) ) ) )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:314:1: (this_HAS_MANY_WORD_0= RULE_HAS_MANY_WORD ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:314:1: (this_HAS_MANY_WORD_0= RULE_HAS_MANY_WORD ( (lv_name_1_0= RULE_STRING ) ) )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:314:2: this_HAS_MANY_WORD_0= RULE_HAS_MANY_WORD ( (lv_name_1_0= RULE_STRING ) )
            {
            this_HAS_MANY_WORD_0=(Token)match(input,RULE_HAS_MANY_WORD,FOLLOW_RULE_HAS_MANY_WORD_in_ruleHasMany749); 
             
                newLeafNode(this_HAS_MANY_WORD_0, grammarAccess.getHasManyAccess().getHAS_MANY_WORDTerminalRuleCall_0()); 
                
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:318:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:319:1: (lv_name_1_0= RULE_STRING )
            {
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:319:1: (lv_name_1_0= RULE_STRING )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:320:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleHasMany765); 

            			newLeafNode(lv_name_1_0, grammarAccess.getHasManyAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getHasManyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleHasMany"


    // $ANTLR start "entryRuleHasAndBelongsToMany"
    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:344:1: entryRuleHasAndBelongsToMany returns [EObject current=null] : iv_ruleHasAndBelongsToMany= ruleHasAndBelongsToMany EOF ;
    public final EObject entryRuleHasAndBelongsToMany() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHasAndBelongsToMany = null;


        try {
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:345:2: (iv_ruleHasAndBelongsToMany= ruleHasAndBelongsToMany EOF )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:346:2: iv_ruleHasAndBelongsToMany= ruleHasAndBelongsToMany EOF
            {
             newCompositeNode(grammarAccess.getHasAndBelongsToManyRule()); 
            pushFollow(FOLLOW_ruleHasAndBelongsToMany_in_entryRuleHasAndBelongsToMany806);
            iv_ruleHasAndBelongsToMany=ruleHasAndBelongsToMany();

            state._fsp--;

             current =iv_ruleHasAndBelongsToMany; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHasAndBelongsToMany816); 

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
    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:353:1: ruleHasAndBelongsToMany returns [EObject current=null] : (this_HAS_AND_BELONGS_TO_MANY_WORD_0= RULE_HAS_AND_BELONGS_TO_MANY_WORD ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleHasAndBelongsToMany() throws RecognitionException {
        EObject current = null;

        Token this_HAS_AND_BELONGS_TO_MANY_WORD_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:356:28: ( (this_HAS_AND_BELONGS_TO_MANY_WORD_0= RULE_HAS_AND_BELONGS_TO_MANY_WORD ( (lv_name_1_0= RULE_STRING ) ) ) )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:357:1: (this_HAS_AND_BELONGS_TO_MANY_WORD_0= RULE_HAS_AND_BELONGS_TO_MANY_WORD ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:357:1: (this_HAS_AND_BELONGS_TO_MANY_WORD_0= RULE_HAS_AND_BELONGS_TO_MANY_WORD ( (lv_name_1_0= RULE_STRING ) ) )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:357:2: this_HAS_AND_BELONGS_TO_MANY_WORD_0= RULE_HAS_AND_BELONGS_TO_MANY_WORD ( (lv_name_1_0= RULE_STRING ) )
            {
            this_HAS_AND_BELONGS_TO_MANY_WORD_0=(Token)match(input,RULE_HAS_AND_BELONGS_TO_MANY_WORD,FOLLOW_RULE_HAS_AND_BELONGS_TO_MANY_WORD_in_ruleHasAndBelongsToMany852); 
             
                newLeafNode(this_HAS_AND_BELONGS_TO_MANY_WORD_0, grammarAccess.getHasAndBelongsToManyAccess().getHAS_AND_BELONGS_TO_MANY_WORDTerminalRuleCall_0()); 
                
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:361:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:362:1: (lv_name_1_0= RULE_STRING )
            {
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:362:1: (lv_name_1_0= RULE_STRING )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:363:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleHasAndBelongsToMany868); 

            			newLeafNode(lv_name_1_0, grammarAccess.getHasAndBelongsToManyAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getHasAndBelongsToManyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleHasAndBelongsToMany"


    // $ANTLR start "entryRuleHashKeyValue"
    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:391:1: entryRuleHashKeyValue returns [EObject current=null] : iv_ruleHashKeyValue= ruleHashKeyValue EOF ;
    public final EObject entryRuleHashKeyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHashKeyValue = null;


        try {
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:392:2: (iv_ruleHashKeyValue= ruleHashKeyValue EOF )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:393:2: iv_ruleHashKeyValue= ruleHashKeyValue EOF
            {
             newCompositeNode(grammarAccess.getHashKeyValueRule()); 
            pushFollow(FOLLOW_ruleHashKeyValue_in_entryRuleHashKeyValue913);
            iv_ruleHashKeyValue=ruleHashKeyValue();

            state._fsp--;

             current =iv_ruleHashKeyValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHashKeyValue923); 

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
    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:400:1: ruleHashKeyValue returns [EObject current=null] : (otherlv_0= ',' (otherlv_1= ' ' )* ( ( ( (lv_key_2_0= RULE_ID ) ) otherlv_3= ':' ) | ( ( ( (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING ) ) ) (otherlv_5= ' ' )* otherlv_6= '=>' ) ) (otherlv_7= ' ' )* ( ( (lv_value_8_1= RULE_SYMBOL | lv_value_8_2= RULE_STRING ) ) ) ) ;
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
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:403:28: ( (otherlv_0= ',' (otherlv_1= ' ' )* ( ( ( (lv_key_2_0= RULE_ID ) ) otherlv_3= ':' ) | ( ( ( (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING ) ) ) (otherlv_5= ' ' )* otherlv_6= '=>' ) ) (otherlv_7= ' ' )* ( ( (lv_value_8_1= RULE_SYMBOL | lv_value_8_2= RULE_STRING ) ) ) ) )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:404:1: (otherlv_0= ',' (otherlv_1= ' ' )* ( ( ( (lv_key_2_0= RULE_ID ) ) otherlv_3= ':' ) | ( ( ( (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING ) ) ) (otherlv_5= ' ' )* otherlv_6= '=>' ) ) (otherlv_7= ' ' )* ( ( (lv_value_8_1= RULE_SYMBOL | lv_value_8_2= RULE_STRING ) ) ) )
            {
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:404:1: (otherlv_0= ',' (otherlv_1= ' ' )* ( ( ( (lv_key_2_0= RULE_ID ) ) otherlv_3= ':' ) | ( ( ( (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING ) ) ) (otherlv_5= ' ' )* otherlv_6= '=>' ) ) (otherlv_7= ' ' )* ( ( (lv_value_8_1= RULE_SYMBOL | lv_value_8_2= RULE_STRING ) ) ) )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:404:3: otherlv_0= ',' (otherlv_1= ' ' )* ( ( ( (lv_key_2_0= RULE_ID ) ) otherlv_3= ':' ) | ( ( ( (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING ) ) ) (otherlv_5= ' ' )* otherlv_6= '=>' ) ) (otherlv_7= ' ' )* ( ( (lv_value_8_1= RULE_SYMBOL | lv_value_8_2= RULE_STRING ) ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleHashKeyValue960); 

                	newLeafNode(otherlv_0, grammarAccess.getHashKeyValueAccess().getCommaKeyword_0());
                
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:408:1: (otherlv_1= ' ' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==19) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:408:3: otherlv_1= ' '
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleHashKeyValue973); 

            	        	newLeafNode(otherlv_1, grammarAccess.getHashKeyValueAccess().getSpaceKeyword_1());
            	        

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:412:3: ( ( ( (lv_key_2_0= RULE_ID ) ) otherlv_3= ':' ) | ( ( ( (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING ) ) ) (otherlv_5= ' ' )* otherlv_6= '=>' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_STRING||LA13_0==RULE_SYMBOL) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:412:4: ( ( (lv_key_2_0= RULE_ID ) ) otherlv_3= ':' )
                    {
                    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:412:4: ( ( (lv_key_2_0= RULE_ID ) ) otherlv_3= ':' )
                    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:412:5: ( (lv_key_2_0= RULE_ID ) ) otherlv_3= ':'
                    {
                    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:412:5: ( (lv_key_2_0= RULE_ID ) )
                    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:413:1: (lv_key_2_0= RULE_ID )
                    {
                    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:413:1: (lv_key_2_0= RULE_ID )
                    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:414:3: lv_key_2_0= RULE_ID
                    {
                    lv_key_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleHashKeyValue994); 

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

                    otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleHashKeyValue1011); 

                        	newLeafNode(otherlv_3, grammarAccess.getHashKeyValueAccess().getColonKeyword_2_0_1());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:435:6: ( ( ( (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING ) ) ) (otherlv_5= ' ' )* otherlv_6= '=>' )
                    {
                    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:435:6: ( ( ( (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING ) ) ) (otherlv_5= ' ' )* otherlv_6= '=>' )
                    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:435:7: ( ( (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING ) ) ) (otherlv_5= ' ' )* otherlv_6= '=>'
                    {
                    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:435:7: ( ( (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING ) ) )
                    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:436:1: ( (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING ) )
                    {
                    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:436:1: ( (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING ) )
                    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:437:1: (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING )
                    {
                    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:437:1: (lv_key_4_1= RULE_SYMBOL | lv_key_4_2= RULE_STRING )
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
                            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:438:3: lv_key_4_1= RULE_SYMBOL
                            {
                            lv_key_4_1=(Token)match(input,RULE_SYMBOL,FOLLOW_RULE_SYMBOL_in_ruleHashKeyValue1038); 

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
                            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:453:8: lv_key_4_2= RULE_STRING
                            {
                            lv_key_4_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleHashKeyValue1058); 

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

                    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:471:2: (otherlv_5= ' ' )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==19) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:471:4: otherlv_5= ' '
                    	    {
                    	    otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleHashKeyValue1079); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getHashKeyValueAccess().getSpaceKeyword_2_1_1());
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,24,FOLLOW_24_in_ruleHashKeyValue1093); 

                        	newLeafNode(otherlv_6, grammarAccess.getHashKeyValueAccess().getEqualsSignGreaterThanSignKeyword_2_1_2());
                        

                    }


                    }
                    break;

            }

            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:479:3: (otherlv_7= ' ' )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==19) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:479:5: otherlv_7= ' '
            	    {
            	    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleHashKeyValue1108); 

            	        	newLeafNode(otherlv_7, grammarAccess.getHashKeyValueAccess().getSpaceKeyword_3());
            	        

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:483:3: ( ( (lv_value_8_1= RULE_SYMBOL | lv_value_8_2= RULE_STRING ) ) )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:484:1: ( (lv_value_8_1= RULE_SYMBOL | lv_value_8_2= RULE_STRING ) )
            {
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:484:1: ( (lv_value_8_1= RULE_SYMBOL | lv_value_8_2= RULE_STRING ) )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:485:1: (lv_value_8_1= RULE_SYMBOL | lv_value_8_2= RULE_STRING )
            {
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:485:1: (lv_value_8_1= RULE_SYMBOL | lv_value_8_2= RULE_STRING )
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
                    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:486:3: lv_value_8_1= RULE_SYMBOL
                    {
                    lv_value_8_1=(Token)match(input,RULE_SYMBOL,FOLLOW_RULE_SYMBOL_in_ruleHashKeyValue1129); 

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
                    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:501:8: lv_value_8_2= RULE_STRING
                    {
                    lv_value_8_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleHashKeyValue1149); 

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


    // $ANTLR start "entryRuleBelongsTo"
    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:527:1: entryRuleBelongsTo returns [EObject current=null] : iv_ruleBelongsTo= ruleBelongsTo EOF ;
    public final EObject entryRuleBelongsTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBelongsTo = null;


        try {
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:528:2: (iv_ruleBelongsTo= ruleBelongsTo EOF )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:529:2: iv_ruleBelongsTo= ruleBelongsTo EOF
            {
             newCompositeNode(grammarAccess.getBelongsToRule()); 
            pushFollow(FOLLOW_ruleBelongsTo_in_entryRuleBelongsTo1193);
            iv_ruleBelongsTo=ruleBelongsTo();

            state._fsp--;

             current =iv_ruleBelongsTo; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBelongsTo1203); 

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
    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:536:1: ruleBelongsTo returns [EObject current=null] : (this_BELONGS_TO_WORD_0= RULE_BELONGS_TO_WORD (otherlv_1= ' ' )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (otherlv_3= ' ' )* ( (lv_options_4_0= ruleHashKeyValue ) )* ) ;
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
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:539:28: ( (this_BELONGS_TO_WORD_0= RULE_BELONGS_TO_WORD (otherlv_1= ' ' )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (otherlv_3= ' ' )* ( (lv_options_4_0= ruleHashKeyValue ) )* ) )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:540:1: (this_BELONGS_TO_WORD_0= RULE_BELONGS_TO_WORD (otherlv_1= ' ' )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (otherlv_3= ' ' )* ( (lv_options_4_0= ruleHashKeyValue ) )* )
            {
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:540:1: (this_BELONGS_TO_WORD_0= RULE_BELONGS_TO_WORD (otherlv_1= ' ' )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (otherlv_3= ' ' )* ( (lv_options_4_0= ruleHashKeyValue ) )* )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:540:2: this_BELONGS_TO_WORD_0= RULE_BELONGS_TO_WORD (otherlv_1= ' ' )* ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) ) (otherlv_3= ' ' )* ( (lv_options_4_0= ruleHashKeyValue ) )*
            {
            this_BELONGS_TO_WORD_0=(Token)match(input,RULE_BELONGS_TO_WORD,FOLLOW_RULE_BELONGS_TO_WORD_in_ruleBelongsTo1239); 
             
                newLeafNode(this_BELONGS_TO_WORD_0, grammarAccess.getBelongsToAccess().getBELONGS_TO_WORDTerminalRuleCall_0()); 
                
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:544:1: (otherlv_1= ' ' )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==19) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:544:3: otherlv_1= ' '
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleBelongsTo1251); 

            	        	newLeafNode(otherlv_1, grammarAccess.getBelongsToAccess().getSpaceKeyword_1());
            	        

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:548:3: ( ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) ) )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:549:1: ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) )
            {
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:549:1: ( (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING ) )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:550:1: (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING )
            {
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:550:1: (lv_name_2_1= RULE_SYMBOL | lv_name_2_2= RULE_STRING )
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
                    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:551:3: lv_name_2_1= RULE_SYMBOL
                    {
                    lv_name_2_1=(Token)match(input,RULE_SYMBOL,FOLLOW_RULE_SYMBOL_in_ruleBelongsTo1272); 

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
                    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:566:8: lv_name_2_2= RULE_STRING
                    {
                    lv_name_2_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBelongsTo1292); 

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

            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:584:2: (otherlv_3= ' ' )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==19) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:584:4: otherlv_3= ' '
            	    {
            	    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleBelongsTo1313); 

            	        	newLeafNode(otherlv_3, grammarAccess.getBelongsToAccess().getSpaceKeyword_3());
            	        

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:588:3: ( (lv_options_4_0= ruleHashKeyValue ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==22) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:589:1: (lv_options_4_0= ruleHashKeyValue )
            	    {
            	    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:589:1: (lv_options_4_0= ruleHashKeyValue )
            	    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:590:3: lv_options_4_0= ruleHashKeyValue
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBelongsToAccess().getOptionsHashKeyValueParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleHashKeyValue_in_ruleBelongsTo1336);
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
    // $ANTLR end "ruleBelongsTo"


    // $ANTLR start "entryRuleMethod"
    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:614:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:615:2: (iv_ruleMethod= ruleMethod EOF )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:616:2: iv_ruleMethod= ruleMethod EOF
            {
             newCompositeNode(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_ruleMethod_in_entryRuleMethod1373);
            iv_ruleMethod=ruleMethod();

            state._fsp--;

             current =iv_ruleMethod; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethod1383); 

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
    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:623:1: ruleMethod returns [EObject current=null] : (this_DEF_WORD_0= RULE_DEF_WORD ( (lv_name_1_0= ruleMethodName ) ) ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        Token this_DEF_WORD_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:626:28: ( (this_DEF_WORD_0= RULE_DEF_WORD ( (lv_name_1_0= ruleMethodName ) ) ) )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:627:1: (this_DEF_WORD_0= RULE_DEF_WORD ( (lv_name_1_0= ruleMethodName ) ) )
            {
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:627:1: (this_DEF_WORD_0= RULE_DEF_WORD ( (lv_name_1_0= ruleMethodName ) ) )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:627:2: this_DEF_WORD_0= RULE_DEF_WORD ( (lv_name_1_0= ruleMethodName ) )
            {
            this_DEF_WORD_0=(Token)match(input,RULE_DEF_WORD,FOLLOW_RULE_DEF_WORD_in_ruleMethod1419); 
             
                newLeafNode(this_DEF_WORD_0, grammarAccess.getMethodAccess().getDEF_WORDTerminalRuleCall_0()); 
                
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:631:1: ( (lv_name_1_0= ruleMethodName ) )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:632:1: (lv_name_1_0= ruleMethodName )
            {
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:632:1: (lv_name_1_0= ruleMethodName )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:633:3: lv_name_1_0= ruleMethodName
            {
             
            	        newCompositeNode(grammarAccess.getMethodAccess().getNameMethodNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleMethodName_in_ruleMethod1439);
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
    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:657:1: entryRuleMethodName returns [String current=null] : iv_ruleMethodName= ruleMethodName EOF ;
    public final String entryRuleMethodName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMethodName = null;


        try {
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:658:2: (iv_ruleMethodName= ruleMethodName EOF )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:659:2: iv_ruleMethodName= ruleMethodName EOF
            {
             newCompositeNode(grammarAccess.getMethodNameRule()); 
            pushFollow(FOLLOW_ruleMethodName_in_entryRuleMethodName1476);
            iv_ruleMethodName=ruleMethodName();

            state._fsp--;

             current =iv_ruleMethodName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodName1487); 

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
    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:666:1: ruleMethodName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '?' | kw= '=' )? ) ;
    public final AntlrDatatypeRuleToken ruleMethodName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:669:28: ( (this_ID_0= RULE_ID (kw= '?' | kw= '=' )? ) )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:670:1: (this_ID_0= RULE_ID (kw= '?' | kw= '=' )? )
            {
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:670:1: (this_ID_0= RULE_ID (kw= '?' | kw= '=' )? )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:670:6: this_ID_0= RULE_ID (kw= '?' | kw= '=' )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMethodName1527); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getMethodNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:677:1: (kw= '?' | kw= '=' )?
            int alt20=3;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==25) ) {
                alt20=1;
            }
            else if ( (LA20_0==26) ) {
                alt20=2;
            }
            switch (alt20) {
                case 1 :
                    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:678:2: kw= '?'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleMethodName1546); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMethodNameAccess().getQuestionMarkKeyword_1_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:685:2: kw= '='
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleMethodName1565); 

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
            "\1\3\1\uffff\1\3\1\uffff\1\3\1\uffff\2\3\6\uffff\1\1\1\2",
            "\1\3\1\uffff\1\3\1\uffff\1\3\1\uffff\2\3\6\uffff\1\1\1\2",
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
    public static final BitSet FOLLOW_ruleNamespacedModuleName_in_ruleClass156 = new BitSet(new long[]{0x0000000000181AA0L});
    public static final BitSet FOLLOW_19_in_ruleClass170 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_20_in_ruleClass184 = new BitSet(new long[]{0x0000000000080040L});
    public static final BitSet FOLLOW_19_in_ruleClass197 = new BitSet(new long[]{0x0000000000080040L});
    public static final BitSet FOLLOW_ruleNamespacedModuleName_in_ruleClass220 = new BitSet(new long[]{0x0000000000081AA0L});
    public static final BitSet FOLLOW_19_in_ruleClass235 = new BitSet(new long[]{0x0000000000081AA0L});
    public static final BitSet FOLLOW_ruleClassElement_in_ruleClass258 = new BitSet(new long[]{0x0000000000001AA0L});
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
    public static final BitSet FOLLOW_RULE_HAS_MANY_WORD_in_ruleHasMany749 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleHasMany765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHasAndBelongsToMany_in_entryRuleHasAndBelongsToMany806 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHasAndBelongsToMany816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HAS_AND_BELONGS_TO_MANY_WORD_in_ruleHasAndBelongsToMany852 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleHasAndBelongsToMany868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHashKeyValue_in_entryRuleHashKeyValue913 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHashKeyValue923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleHashKeyValue960 = new BitSet(new long[]{0x0000000000080540L});
    public static final BitSet FOLLOW_19_in_ruleHashKeyValue973 = new BitSet(new long[]{0x0000000000080540L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleHashKeyValue994 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleHashKeyValue1011 = new BitSet(new long[]{0x0000000000080500L});
    public static final BitSet FOLLOW_RULE_SYMBOL_in_ruleHashKeyValue1038 = new BitSet(new long[]{0x0000000001080000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleHashKeyValue1058 = new BitSet(new long[]{0x0000000001080000L});
    public static final BitSet FOLLOW_19_in_ruleHashKeyValue1079 = new BitSet(new long[]{0x0000000001080000L});
    public static final BitSet FOLLOW_24_in_ruleHashKeyValue1093 = new BitSet(new long[]{0x0000000000080500L});
    public static final BitSet FOLLOW_19_in_ruleHashKeyValue1108 = new BitSet(new long[]{0x0000000000080500L});
    public static final BitSet FOLLOW_RULE_SYMBOL_in_ruleHashKeyValue1129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleHashKeyValue1149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBelongsTo_in_entryRuleBelongsTo1193 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBelongsTo1203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BELONGS_TO_WORD_in_ruleBelongsTo1239 = new BitSet(new long[]{0x0000000000080500L});
    public static final BitSet FOLLOW_19_in_ruleBelongsTo1251 = new BitSet(new long[]{0x0000000000080500L});
    public static final BitSet FOLLOW_RULE_SYMBOL_in_ruleBelongsTo1272 = new BitSet(new long[]{0x0000000000480002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBelongsTo1292 = new BitSet(new long[]{0x0000000000480002L});
    public static final BitSet FOLLOW_19_in_ruleBelongsTo1313 = new BitSet(new long[]{0x0000000000480002L});
    public static final BitSet FOLLOW_ruleHashKeyValue_in_ruleBelongsTo1336 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleMethod_in_entryRuleMethod1373 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethod1383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DEF_WORD_in_ruleMethod1419 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleMethodName_in_ruleMethod1439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodName_in_entryRuleMethodName1476 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodName1487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMethodName1527 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_25_in_ruleMethodName1546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleMethodName1565 = new BitSet(new long[]{0x0000000000000002L});

}