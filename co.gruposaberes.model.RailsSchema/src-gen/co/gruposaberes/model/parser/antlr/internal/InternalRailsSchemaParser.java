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
import co.gruposaberes.model.services.RailsSchemaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalRailsSchemaParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_PARENTHESIS_BLOCK", "RULE_DO_WORD", "RULE_END_WORD", "RULE_STRING", "RULE_COMMA", "RULE_BLOCK_PARAMS", "RULE_ID", "RULE_SPACE", "RULE_SYMBOL", "RULE_ARRAY_BLOCK", "RULE_INT", "RULE_DECIMAL", "RULE_BRACKET_BLOCK_ALONE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_BS", "RULE_ANY_OTHER", "'ActiveRecord::Schema.define'", "'create_table'", "'t.'", "':'", "'=>'"
    };
    public static final int RULE_DO_WORD=5;
    public static final int RULE_PARENTHESIS_BLOCK=4;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=18;
    public static final int RULE_BRACKET_BLOCK_ALONE=16;
    public static final int RULE_SPACE=11;
    public static final int EOF=-1;
    public static final int RULE_ARRAY_BLOCK=13;
    public static final int RULE_ID=10;
    public static final int RULE_COMMA=8;
    public static final int RULE_ANY_OTHER=20;
    public static final int RULE_BS=19;
    public static final int RULE_DECIMAL=15;
    public static final int RULE_INT=14;
    public static final int RULE_BLOCK_PARAMS=9;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=17;
    public static final int T__23=23;
    public static final int RULE_SYMBOL=12;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_END_WORD=6;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalRailsSchemaParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRailsSchemaParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRailsSchemaParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRailsSchema.g"; }



     	private RailsSchemaGrammarAccess grammarAccess;

        public InternalRailsSchemaParser(TokenStream input, RailsSchemaGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Schema";
       	}

       	@Override
       	protected RailsSchemaGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSchema"
    // InternalRailsSchema.g:64:1: entryRuleSchema returns [EObject current=null] : iv_ruleSchema= ruleSchema EOF ;
    public final EObject entryRuleSchema() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchema = null;


        try {
            // InternalRailsSchema.g:64:47: (iv_ruleSchema= ruleSchema EOF )
            // InternalRailsSchema.g:65:2: iv_ruleSchema= ruleSchema EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSchemaRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSchema=ruleSchema();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSchema; 
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
    // $ANTLR end "entryRuleSchema"


    // $ANTLR start "ruleSchema"
    // InternalRailsSchema.g:71:1: ruleSchema returns [EObject current=null] : (otherlv_0= 'ActiveRecord::Schema.define' this_PARENTHESIS_BLOCK_1= RULE_PARENTHESIS_BLOCK this_DO_WORD_2= RULE_DO_WORD ( (lv_schema_members_3_0= ruleSchemaMember ) )* this_END_WORD_4= RULE_END_WORD ) ;
    public final EObject ruleSchema() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_PARENTHESIS_BLOCK_1=null;
        Token this_DO_WORD_2=null;
        Token this_END_WORD_4=null;
        EObject lv_schema_members_3_0 = null;



        	enterRule();

        try {
            // InternalRailsSchema.g:77:2: ( (otherlv_0= 'ActiveRecord::Schema.define' this_PARENTHESIS_BLOCK_1= RULE_PARENTHESIS_BLOCK this_DO_WORD_2= RULE_DO_WORD ( (lv_schema_members_3_0= ruleSchemaMember ) )* this_END_WORD_4= RULE_END_WORD ) )
            // InternalRailsSchema.g:78:2: (otherlv_0= 'ActiveRecord::Schema.define' this_PARENTHESIS_BLOCK_1= RULE_PARENTHESIS_BLOCK this_DO_WORD_2= RULE_DO_WORD ( (lv_schema_members_3_0= ruleSchemaMember ) )* this_END_WORD_4= RULE_END_WORD )
            {
            // InternalRailsSchema.g:78:2: (otherlv_0= 'ActiveRecord::Schema.define' this_PARENTHESIS_BLOCK_1= RULE_PARENTHESIS_BLOCK this_DO_WORD_2= RULE_DO_WORD ( (lv_schema_members_3_0= ruleSchemaMember ) )* this_END_WORD_4= RULE_END_WORD )
            // InternalRailsSchema.g:79:3: otherlv_0= 'ActiveRecord::Schema.define' this_PARENTHESIS_BLOCK_1= RULE_PARENTHESIS_BLOCK this_DO_WORD_2= RULE_DO_WORD ( (lv_schema_members_3_0= ruleSchemaMember ) )* this_END_WORD_4= RULE_END_WORD
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSchemaAccess().getActiveRecordSchemaDefineKeyword_0());
              		
            }
            this_PARENTHESIS_BLOCK_1=(Token)match(input,RULE_PARENTHESIS_BLOCK,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_PARENTHESIS_BLOCK_1, grammarAccess.getSchemaAccess().getPARENTHESIS_BLOCKTerminalRuleCall_1());
              		
            }
            this_DO_WORD_2=(Token)match(input,RULE_DO_WORD,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DO_WORD_2, grammarAccess.getSchemaAccess().getDO_WORDTerminalRuleCall_2());
              		
            }
            // InternalRailsSchema.g:91:3: ( (lv_schema_members_3_0= ruleSchemaMember ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==22) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRailsSchema.g:92:4: (lv_schema_members_3_0= ruleSchemaMember )
            	    {
            	    // InternalRailsSchema.g:92:4: (lv_schema_members_3_0= ruleSchemaMember )
            	    // InternalRailsSchema.g:93:5: lv_schema_members_3_0= ruleSchemaMember
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSchemaAccess().getSchema_membersSchemaMemberParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_schema_members_3_0=ruleSchemaMember();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getSchemaRule());
            	      					}
            	      					add(
            	      						current,
            	      						"schema_members",
            	      						lv_schema_members_3_0,
            	      						"co.gruposaberes.model.RailsSchema.SchemaMember");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            this_END_WORD_4=(Token)match(input,RULE_END_WORD,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_END_WORD_4, grammarAccess.getSchemaAccess().getEND_WORDTerminalRuleCall_4());
              		
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
    // $ANTLR end "ruleSchema"


    // $ANTLR start "entryRuleSchemaMember"
    // InternalRailsSchema.g:118:1: entryRuleSchemaMember returns [EObject current=null] : iv_ruleSchemaMember= ruleSchemaMember EOF ;
    public final EObject entryRuleSchemaMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemaMember = null;


        try {
            // InternalRailsSchema.g:118:53: (iv_ruleSchemaMember= ruleSchemaMember EOF )
            // InternalRailsSchema.g:119:2: iv_ruleSchemaMember= ruleSchemaMember EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSchemaMemberRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSchemaMember=ruleSchemaMember();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSchemaMember; 
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
    // $ANTLR end "entryRuleSchemaMember"


    // $ANTLR start "ruleSchemaMember"
    // InternalRailsSchema.g:125:1: ruleSchemaMember returns [EObject current=null] : (this_Table_0= ruleTable | ruleIndex ) ;
    public final EObject ruleSchemaMember() throws RecognitionException {
        EObject current = null;

        EObject this_Table_0 = null;



        	enterRule();

        try {
            // InternalRailsSchema.g:131:2: ( (this_Table_0= ruleTable | ruleIndex ) )
            // InternalRailsSchema.g:132:2: (this_Table_0= ruleTable | ruleIndex )
            {
            // InternalRailsSchema.g:132:2: (this_Table_0= ruleTable | ruleIndex )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==22) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalRailsSchema.g:133:3: this_Table_0= ruleTable
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSchemaMemberAccess().getTableParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Table_0=ruleTable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Table_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalRailsSchema.g:142:3: ruleIndex
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSchemaMemberAccess().getIndexParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    ruleIndex();

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
    // $ANTLR end "ruleSchemaMember"


    // $ANTLR start "entryRuleTable"
    // InternalRailsSchema.g:153:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // InternalRailsSchema.g:153:46: (iv_ruleTable= ruleTable EOF )
            // InternalRailsSchema.g:154:2: iv_ruleTable= ruleTable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTableRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTable=ruleTable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTable; 
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
    // $ANTLR end "entryRuleTable"


    // $ANTLR start "ruleTable"
    // InternalRailsSchema.g:160:1: ruleTable returns [EObject current=null] : (otherlv_0= 'create_table' ( (lv_name_1_0= RULE_STRING ) ) (this_COMMA_2= RULE_COMMA ruleIgnoredHashKeyValue )* this_DO_WORD_4= RULE_DO_WORD this_BLOCK_PARAMS_5= RULE_BLOCK_PARAMS ( (lv_attributes_6_0= ruleTableAttributes ) )* ( ( RULE_END_WORD )=>this_END_WORD_7= RULE_END_WORD ) ) ;
    public final EObject ruleTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token this_COMMA_2=null;
        Token this_DO_WORD_4=null;
        Token this_BLOCK_PARAMS_5=null;
        Token this_END_WORD_7=null;
        EObject lv_attributes_6_0 = null;



        	enterRule();

        try {
            // InternalRailsSchema.g:166:2: ( (otherlv_0= 'create_table' ( (lv_name_1_0= RULE_STRING ) ) (this_COMMA_2= RULE_COMMA ruleIgnoredHashKeyValue )* this_DO_WORD_4= RULE_DO_WORD this_BLOCK_PARAMS_5= RULE_BLOCK_PARAMS ( (lv_attributes_6_0= ruleTableAttributes ) )* ( ( RULE_END_WORD )=>this_END_WORD_7= RULE_END_WORD ) ) )
            // InternalRailsSchema.g:167:2: (otherlv_0= 'create_table' ( (lv_name_1_0= RULE_STRING ) ) (this_COMMA_2= RULE_COMMA ruleIgnoredHashKeyValue )* this_DO_WORD_4= RULE_DO_WORD this_BLOCK_PARAMS_5= RULE_BLOCK_PARAMS ( (lv_attributes_6_0= ruleTableAttributes ) )* ( ( RULE_END_WORD )=>this_END_WORD_7= RULE_END_WORD ) )
            {
            // InternalRailsSchema.g:167:2: (otherlv_0= 'create_table' ( (lv_name_1_0= RULE_STRING ) ) (this_COMMA_2= RULE_COMMA ruleIgnoredHashKeyValue )* this_DO_WORD_4= RULE_DO_WORD this_BLOCK_PARAMS_5= RULE_BLOCK_PARAMS ( (lv_attributes_6_0= ruleTableAttributes ) )* ( ( RULE_END_WORD )=>this_END_WORD_7= RULE_END_WORD ) )
            // InternalRailsSchema.g:168:3: otherlv_0= 'create_table' ( (lv_name_1_0= RULE_STRING ) ) (this_COMMA_2= RULE_COMMA ruleIgnoredHashKeyValue )* this_DO_WORD_4= RULE_DO_WORD this_BLOCK_PARAMS_5= RULE_BLOCK_PARAMS ( (lv_attributes_6_0= ruleTableAttributes ) )* ( ( RULE_END_WORD )=>this_END_WORD_7= RULE_END_WORD )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTableAccess().getCreate_tableKeyword_0());
              		
            }
            // InternalRailsSchema.g:172:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalRailsSchema.g:173:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalRailsSchema.g:173:4: (lv_name_1_0= RULE_STRING )
            // InternalRailsSchema.g:174:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getTableAccess().getNameSTRINGTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTableRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"co.gruposaberes.model.RailsSchema.STRING");
              				
            }

            }


            }

            // InternalRailsSchema.g:190:3: (this_COMMA_2= RULE_COMMA ruleIgnoredHashKeyValue )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_COMMA) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalRailsSchema.g:191:4: this_COMMA_2= RULE_COMMA ruleIgnoredHashKeyValue
            	    {
            	    this_COMMA_2=(Token)match(input,RULE_COMMA,FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_COMMA_2, grammarAccess.getTableAccess().getCOMMATerminalRuleCall_2_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getTableAccess().getIgnoredHashKeyValueParserRuleCall_2_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_7);
            	    ruleIgnoredHashKeyValue();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            this_DO_WORD_4=(Token)match(input,RULE_DO_WORD,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DO_WORD_4, grammarAccess.getTableAccess().getDO_WORDTerminalRuleCall_3());
              		
            }
            this_BLOCK_PARAMS_5=(Token)match(input,RULE_BLOCK_PARAMS,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_BLOCK_PARAMS_5, grammarAccess.getTableAccess().getBLOCK_PARAMSTerminalRuleCall_4());
              		
            }
            // InternalRailsSchema.g:211:3: ( (lv_attributes_6_0= ruleTableAttributes ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==23) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalRailsSchema.g:212:4: (lv_attributes_6_0= ruleTableAttributes )
            	    {
            	    // InternalRailsSchema.g:212:4: (lv_attributes_6_0= ruleTableAttributes )
            	    // InternalRailsSchema.g:213:5: lv_attributes_6_0= ruleTableAttributes
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getTableAccess().getAttributesTableAttributesParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_10);
            	    lv_attributes_6_0=ruleTableAttributes();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getTableRule());
            	      					}
            	      					add(
            	      						current,
            	      						"attributes",
            	      						lv_attributes_6_0,
            	      						"co.gruposaberes.model.RailsSchema.TableAttributes");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalRailsSchema.g:230:3: ( ( RULE_END_WORD )=>this_END_WORD_7= RULE_END_WORD )
            // InternalRailsSchema.g:231:4: ( RULE_END_WORD )=>this_END_WORD_7= RULE_END_WORD
            {
            this_END_WORD_7=(Token)match(input,RULE_END_WORD,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(this_END_WORD_7, grammarAccess.getTableAccess().getEND_WORDTerminalRuleCall_6());
              			
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
    // $ANTLR end "ruleTable"


    // $ANTLR start "entryRuleTableAttributes"
    // InternalRailsSchema.g:241:1: entryRuleTableAttributes returns [EObject current=null] : iv_ruleTableAttributes= ruleTableAttributes EOF ;
    public final EObject entryRuleTableAttributes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableAttributes = null;


        try {
            // InternalRailsSchema.g:241:56: (iv_ruleTableAttributes= ruleTableAttributes EOF )
            // InternalRailsSchema.g:242:2: iv_ruleTableAttributes= ruleTableAttributes EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTableAttributesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTableAttributes=ruleTableAttributes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTableAttributes; 
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
    // $ANTLR end "entryRuleTableAttributes"


    // $ANTLR start "ruleTableAttributes"
    // InternalRailsSchema.g:248:1: ruleTableAttributes returns [EObject current=null] : (otherlv_0= 't.' ( (lv_datatype_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_STRING ) ) (this_COMMA_3= RULE_COMMA (this_SPACE_4= RULE_SPACE )* ruleIgnoredHashKeyValue )* ) ;
    public final EObject ruleTableAttributes() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_datatype_1_0=null;
        Token lv_name_2_0=null;
        Token this_COMMA_3=null;
        Token this_SPACE_4=null;


        	enterRule();

        try {
            // InternalRailsSchema.g:254:2: ( (otherlv_0= 't.' ( (lv_datatype_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_STRING ) ) (this_COMMA_3= RULE_COMMA (this_SPACE_4= RULE_SPACE )* ruleIgnoredHashKeyValue )* ) )
            // InternalRailsSchema.g:255:2: (otherlv_0= 't.' ( (lv_datatype_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_STRING ) ) (this_COMMA_3= RULE_COMMA (this_SPACE_4= RULE_SPACE )* ruleIgnoredHashKeyValue )* )
            {
            // InternalRailsSchema.g:255:2: (otherlv_0= 't.' ( (lv_datatype_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_STRING ) ) (this_COMMA_3= RULE_COMMA (this_SPACE_4= RULE_SPACE )* ruleIgnoredHashKeyValue )* )
            // InternalRailsSchema.g:256:3: otherlv_0= 't.' ( (lv_datatype_1_0= RULE_ID ) ) ( (lv_name_2_0= RULE_STRING ) ) (this_COMMA_3= RULE_COMMA (this_SPACE_4= RULE_SPACE )* ruleIgnoredHashKeyValue )*
            {
            otherlv_0=(Token)match(input,23,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTableAttributesAccess().getTKeyword_0());
              		
            }
            // InternalRailsSchema.g:260:3: ( (lv_datatype_1_0= RULE_ID ) )
            // InternalRailsSchema.g:261:4: (lv_datatype_1_0= RULE_ID )
            {
            // InternalRailsSchema.g:261:4: (lv_datatype_1_0= RULE_ID )
            // InternalRailsSchema.g:262:5: lv_datatype_1_0= RULE_ID
            {
            lv_datatype_1_0=(Token)match(input,RULE_ID,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_datatype_1_0, grammarAccess.getTableAttributesAccess().getDatatypeIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTableAttributesRule());
              					}
              					setWithLastConsumed(
              						current,
              						"datatype",
              						lv_datatype_1_0,
              						"co.gruposaberes.model.RailsSchema.ID");
              				
            }

            }


            }

            // InternalRailsSchema.g:278:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalRailsSchema.g:279:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalRailsSchema.g:279:4: (lv_name_2_0= RULE_STRING )
            // InternalRailsSchema.g:280:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getTableAttributesAccess().getNameSTRINGTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTableAttributesRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"co.gruposaberes.model.RailsSchema.STRING");
              				
            }

            }


            }

            // InternalRailsSchema.g:296:3: (this_COMMA_3= RULE_COMMA (this_SPACE_4= RULE_SPACE )* ruleIgnoredHashKeyValue )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_COMMA) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalRailsSchema.g:297:4: this_COMMA_3= RULE_COMMA (this_SPACE_4= RULE_SPACE )* ruleIgnoredHashKeyValue
            	    {
            	    this_COMMA_3=(Token)match(input,RULE_COMMA,FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_COMMA_3, grammarAccess.getTableAttributesAccess().getCOMMATerminalRuleCall_3_0());
            	      			
            	    }
            	    // InternalRailsSchema.g:301:4: (this_SPACE_4= RULE_SPACE )*
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( (LA5_0==RULE_SPACE) ) {
            	            alt5=1;
            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // InternalRailsSchema.g:302:5: this_SPACE_4= RULE_SPACE
            	    	    {
            	    	    this_SPACE_4=(Token)match(input,RULE_SPACE,FOLLOW_8); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      					newLeafNode(this_SPACE_4, grammarAccess.getTableAttributesAccess().getSPACETerminalRuleCall_3_1());
            	    	      				
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop5;
            	        }
            	    } while (true);

            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getTableAttributesAccess().getIgnoredHashKeyValueParserRuleCall_3_2());
            	      			
            	    }
            	    pushFollow(FOLLOW_12);
            	    ruleIgnoredHashKeyValue();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
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
    // $ANTLR end "ruleTableAttributes"


    // $ANTLR start "entryRuleIgnoredHashKeyValue"
    // InternalRailsSchema.g:319:1: entryRuleIgnoredHashKeyValue returns [String current=null] : iv_ruleIgnoredHashKeyValue= ruleIgnoredHashKeyValue EOF ;
    public final String entryRuleIgnoredHashKeyValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIgnoredHashKeyValue = null;


        try {
            // InternalRailsSchema.g:319:59: (iv_ruleIgnoredHashKeyValue= ruleIgnoredHashKeyValue EOF )
            // InternalRailsSchema.g:320:2: iv_ruleIgnoredHashKeyValue= ruleIgnoredHashKeyValue EOF
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
    // InternalRailsSchema.g:326:1: ruleIgnoredHashKeyValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_SPACE_0= RULE_SPACE )* ( (this_ID_1= RULE_ID kw= ':' ) | ( (this_SYMBOL_3= RULE_SYMBOL | this_STRING_4= RULE_STRING ) (this_SPACE_5= RULE_SPACE )* kw= '=>' ) ) (this_SPACE_7= RULE_SPACE )* (this_SYMBOL_8= RULE_SYMBOL | this_STRING_9= RULE_STRING | this_ARRAY_BLOCK_10= RULE_ARRAY_BLOCK | this_INT_11= RULE_INT | this_ID_12= RULE_ID | this_DECIMAL_13= RULE_DECIMAL ) (this_SPACE_14= RULE_SPACE )* ) ;
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
        Token this_ARRAY_BLOCK_10=null;
        Token this_INT_11=null;
        Token this_ID_12=null;
        Token this_DECIMAL_13=null;
        Token this_SPACE_14=null;


        	enterRule();

        try {
            // InternalRailsSchema.g:332:2: ( ( (this_SPACE_0= RULE_SPACE )* ( (this_ID_1= RULE_ID kw= ':' ) | ( (this_SYMBOL_3= RULE_SYMBOL | this_STRING_4= RULE_STRING ) (this_SPACE_5= RULE_SPACE )* kw= '=>' ) ) (this_SPACE_7= RULE_SPACE )* (this_SYMBOL_8= RULE_SYMBOL | this_STRING_9= RULE_STRING | this_ARRAY_BLOCK_10= RULE_ARRAY_BLOCK | this_INT_11= RULE_INT | this_ID_12= RULE_ID | this_DECIMAL_13= RULE_DECIMAL ) (this_SPACE_14= RULE_SPACE )* ) )
            // InternalRailsSchema.g:333:2: ( (this_SPACE_0= RULE_SPACE )* ( (this_ID_1= RULE_ID kw= ':' ) | ( (this_SYMBOL_3= RULE_SYMBOL | this_STRING_4= RULE_STRING ) (this_SPACE_5= RULE_SPACE )* kw= '=>' ) ) (this_SPACE_7= RULE_SPACE )* (this_SYMBOL_8= RULE_SYMBOL | this_STRING_9= RULE_STRING | this_ARRAY_BLOCK_10= RULE_ARRAY_BLOCK | this_INT_11= RULE_INT | this_ID_12= RULE_ID | this_DECIMAL_13= RULE_DECIMAL ) (this_SPACE_14= RULE_SPACE )* )
            {
            // InternalRailsSchema.g:333:2: ( (this_SPACE_0= RULE_SPACE )* ( (this_ID_1= RULE_ID kw= ':' ) | ( (this_SYMBOL_3= RULE_SYMBOL | this_STRING_4= RULE_STRING ) (this_SPACE_5= RULE_SPACE )* kw= '=>' ) ) (this_SPACE_7= RULE_SPACE )* (this_SYMBOL_8= RULE_SYMBOL | this_STRING_9= RULE_STRING | this_ARRAY_BLOCK_10= RULE_ARRAY_BLOCK | this_INT_11= RULE_INT | this_ID_12= RULE_ID | this_DECIMAL_13= RULE_DECIMAL ) (this_SPACE_14= RULE_SPACE )* )
            // InternalRailsSchema.g:334:3: (this_SPACE_0= RULE_SPACE )* ( (this_ID_1= RULE_ID kw= ':' ) | ( (this_SYMBOL_3= RULE_SYMBOL | this_STRING_4= RULE_STRING ) (this_SPACE_5= RULE_SPACE )* kw= '=>' ) ) (this_SPACE_7= RULE_SPACE )* (this_SYMBOL_8= RULE_SYMBOL | this_STRING_9= RULE_STRING | this_ARRAY_BLOCK_10= RULE_ARRAY_BLOCK | this_INT_11= RULE_INT | this_ID_12= RULE_ID | this_DECIMAL_13= RULE_DECIMAL ) (this_SPACE_14= RULE_SPACE )*
            {
            // InternalRailsSchema.g:334:3: (this_SPACE_0= RULE_SPACE )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_SPACE) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalRailsSchema.g:335:4: this_SPACE_0= RULE_SPACE
            	    {
            	    this_SPACE_0=(Token)match(input,RULE_SPACE,FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_SPACE_0);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_SPACE_0, grammarAccess.getIgnoredHashKeyValueAccess().getSPACETerminalRuleCall_0());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // InternalRailsSchema.g:343:3: ( (this_ID_1= RULE_ID kw= ':' ) | ( (this_SYMBOL_3= RULE_SYMBOL | this_STRING_4= RULE_STRING ) (this_SPACE_5= RULE_SPACE )* kw= '=>' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_STRING||LA10_0==RULE_SYMBOL) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalRailsSchema.g:344:4: (this_ID_1= RULE_ID kw= ':' )
                    {
                    // InternalRailsSchema.g:344:4: (this_ID_1= RULE_ID kw= ':' )
                    // InternalRailsSchema.g:345:5: this_ID_1= RULE_ID kw= ':'
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(this_ID_1);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					newLeafNode(this_ID_1, grammarAccess.getIgnoredHashKeyValueAccess().getIDTerminalRuleCall_1_0_0());
                      				
                    }
                    kw=(Token)match(input,24,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(kw);
                      					newLeafNode(kw, grammarAccess.getIgnoredHashKeyValueAccess().getColonKeyword_1_0_1());
                      				
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalRailsSchema.g:359:4: ( (this_SYMBOL_3= RULE_SYMBOL | this_STRING_4= RULE_STRING ) (this_SPACE_5= RULE_SPACE )* kw= '=>' )
                    {
                    // InternalRailsSchema.g:359:4: ( (this_SYMBOL_3= RULE_SYMBOL | this_STRING_4= RULE_STRING ) (this_SPACE_5= RULE_SPACE )* kw= '=>' )
                    // InternalRailsSchema.g:360:5: (this_SYMBOL_3= RULE_SYMBOL | this_STRING_4= RULE_STRING ) (this_SPACE_5= RULE_SPACE )* kw= '=>'
                    {
                    // InternalRailsSchema.g:360:5: (this_SYMBOL_3= RULE_SYMBOL | this_STRING_4= RULE_STRING )
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==RULE_SYMBOL) ) {
                        alt8=1;
                    }
                    else if ( (LA8_0==RULE_STRING) ) {
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
                            // InternalRailsSchema.g:361:6: this_SYMBOL_3= RULE_SYMBOL
                            {
                            this_SYMBOL_3=(Token)match(input,RULE_SYMBOL,FOLLOW_15); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current.merge(this_SYMBOL_3);
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						newLeafNode(this_SYMBOL_3, grammarAccess.getIgnoredHashKeyValueAccess().getSYMBOLTerminalRuleCall_1_1_0_0());
                              					
                            }

                            }
                            break;
                        case 2 :
                            // InternalRailsSchema.g:369:6: this_STRING_4= RULE_STRING
                            {
                            this_STRING_4=(Token)match(input,RULE_STRING,FOLLOW_15); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current.merge(this_STRING_4);
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						newLeafNode(this_STRING_4, grammarAccess.getIgnoredHashKeyValueAccess().getSTRINGTerminalRuleCall_1_1_0_1());
                              					
                            }

                            }
                            break;

                    }

                    // InternalRailsSchema.g:377:5: (this_SPACE_5= RULE_SPACE )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==RULE_SPACE) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalRailsSchema.g:378:6: this_SPACE_5= RULE_SPACE
                    	    {
                    	    this_SPACE_5=(Token)match(input,RULE_SPACE,FOLLOW_15); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						current.merge(this_SPACE_5);
                    	      					
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(this_SPACE_5, grammarAccess.getIgnoredHashKeyValueAccess().getSPACETerminalRuleCall_1_1_1());
                    	      					
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    kw=(Token)match(input,25,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(kw);
                      					newLeafNode(kw, grammarAccess.getIgnoredHashKeyValueAccess().getEqualsSignGreaterThanSignKeyword_1_1_2());
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalRailsSchema.g:393:3: (this_SPACE_7= RULE_SPACE )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_SPACE) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalRailsSchema.g:394:4: this_SPACE_7= RULE_SPACE
            	    {
            	    this_SPACE_7=(Token)match(input,RULE_SPACE,FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_SPACE_7);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_SPACE_7, grammarAccess.getIgnoredHashKeyValueAccess().getSPACETerminalRuleCall_2());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // InternalRailsSchema.g:402:3: (this_SYMBOL_8= RULE_SYMBOL | this_STRING_9= RULE_STRING | this_ARRAY_BLOCK_10= RULE_ARRAY_BLOCK | this_INT_11= RULE_INT | this_ID_12= RULE_ID | this_DECIMAL_13= RULE_DECIMAL )
            int alt12=6;
            switch ( input.LA(1) ) {
            case RULE_SYMBOL:
                {
                alt12=1;
                }
                break;
            case RULE_STRING:
                {
                alt12=2;
                }
                break;
            case RULE_ARRAY_BLOCK:
                {
                alt12=3;
                }
                break;
            case RULE_INT:
                {
                alt12=4;
                }
                break;
            case RULE_ID:
                {
                alt12=5;
                }
                break;
            case RULE_DECIMAL:
                {
                alt12=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalRailsSchema.g:403:4: this_SYMBOL_8= RULE_SYMBOL
                    {
                    this_SYMBOL_8=(Token)match(input,RULE_SYMBOL,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_SYMBOL_8);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_SYMBOL_8, grammarAccess.getIgnoredHashKeyValueAccess().getSYMBOLTerminalRuleCall_3_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalRailsSchema.g:411:4: this_STRING_9= RULE_STRING
                    {
                    this_STRING_9=(Token)match(input,RULE_STRING,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_STRING_9);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_STRING_9, grammarAccess.getIgnoredHashKeyValueAccess().getSTRINGTerminalRuleCall_3_1());
                      			
                    }

                    }
                    break;
                case 3 :
                    // InternalRailsSchema.g:419:4: this_ARRAY_BLOCK_10= RULE_ARRAY_BLOCK
                    {
                    this_ARRAY_BLOCK_10=(Token)match(input,RULE_ARRAY_BLOCK,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ARRAY_BLOCK_10);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ARRAY_BLOCK_10, grammarAccess.getIgnoredHashKeyValueAccess().getARRAY_BLOCKTerminalRuleCall_3_2());
                      			
                    }

                    }
                    break;
                case 4 :
                    // InternalRailsSchema.g:427:4: this_INT_11= RULE_INT
                    {
                    this_INT_11=(Token)match(input,RULE_INT,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_INT_11);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_INT_11, grammarAccess.getIgnoredHashKeyValueAccess().getINTTerminalRuleCall_3_3());
                      			
                    }

                    }
                    break;
                case 5 :
                    // InternalRailsSchema.g:435:4: this_ID_12= RULE_ID
                    {
                    this_ID_12=(Token)match(input,RULE_ID,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ID_12);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ID_12, grammarAccess.getIgnoredHashKeyValueAccess().getIDTerminalRuleCall_3_4());
                      			
                    }

                    }
                    break;
                case 6 :
                    // InternalRailsSchema.g:443:4: this_DECIMAL_13= RULE_DECIMAL
                    {
                    this_DECIMAL_13=(Token)match(input,RULE_DECIMAL,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_DECIMAL_13);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_DECIMAL_13, grammarAccess.getIgnoredHashKeyValueAccess().getDECIMALTerminalRuleCall_3_5());
                      			
                    }

                    }
                    break;

            }

            // InternalRailsSchema.g:451:3: (this_SPACE_14= RULE_SPACE )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_SPACE) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalRailsSchema.g:452:4: this_SPACE_14= RULE_SPACE
            	    {
            	    this_SPACE_14=(Token)match(input,RULE_SPACE,FOLLOW_16); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_SPACE_14);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_SPACE_14, grammarAccess.getIgnoredHashKeyValueAccess().getSPACETerminalRuleCall_4());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop13;
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


    // $ANTLR start "entryRuleIndex"
    // InternalRailsSchema.g:464:1: entryRuleIndex returns [String current=null] : iv_ruleIndex= ruleIndex EOF ;
    public final String entryRuleIndex() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIndex = null;


        try {
            // InternalRailsSchema.g:464:45: (iv_ruleIndex= ruleIndex EOF )
            // InternalRailsSchema.g:465:2: iv_ruleIndex= ruleIndex EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIndexRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIndex=ruleIndex();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIndex.getText(); 
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
    // $ANTLR end "entryRuleIndex"


    // $ANTLR start "ruleIndex"
    // InternalRailsSchema.g:471:1: ruleIndex returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID this_STRING_1= RULE_STRING (this_COMMA_2= RULE_COMMA (this_IgnoredHashKeyValue_3= ruleIgnoredHashKeyValue | this_ARRAY_BLOCK_4= RULE_ARRAY_BLOCK ) )* ) ;
    public final AntlrDatatypeRuleToken ruleIndex() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_STRING_1=null;
        Token this_COMMA_2=null;
        Token this_ARRAY_BLOCK_4=null;
        AntlrDatatypeRuleToken this_IgnoredHashKeyValue_3 = null;



        	enterRule();

        try {
            // InternalRailsSchema.g:477:2: ( (this_ID_0= RULE_ID this_STRING_1= RULE_STRING (this_COMMA_2= RULE_COMMA (this_IgnoredHashKeyValue_3= ruleIgnoredHashKeyValue | this_ARRAY_BLOCK_4= RULE_ARRAY_BLOCK ) )* ) )
            // InternalRailsSchema.g:478:2: (this_ID_0= RULE_ID this_STRING_1= RULE_STRING (this_COMMA_2= RULE_COMMA (this_IgnoredHashKeyValue_3= ruleIgnoredHashKeyValue | this_ARRAY_BLOCK_4= RULE_ARRAY_BLOCK ) )* )
            {
            // InternalRailsSchema.g:478:2: (this_ID_0= RULE_ID this_STRING_1= RULE_STRING (this_COMMA_2= RULE_COMMA (this_IgnoredHashKeyValue_3= ruleIgnoredHashKeyValue | this_ARRAY_BLOCK_4= RULE_ARRAY_BLOCK ) )* )
            // InternalRailsSchema.g:479:3: this_ID_0= RULE_ID this_STRING_1= RULE_STRING (this_COMMA_2= RULE_COMMA (this_IgnoredHashKeyValue_3= ruleIgnoredHashKeyValue | this_ARRAY_BLOCK_4= RULE_ARRAY_BLOCK ) )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getIndexAccess().getIDTerminalRuleCall_0());
              		
            }
            this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_STRING_1);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_STRING_1, grammarAccess.getIndexAccess().getSTRINGTerminalRuleCall_1());
              		
            }
            // InternalRailsSchema.g:493:3: (this_COMMA_2= RULE_COMMA (this_IgnoredHashKeyValue_3= ruleIgnoredHashKeyValue | this_ARRAY_BLOCK_4= RULE_ARRAY_BLOCK ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_COMMA) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalRailsSchema.g:494:4: this_COMMA_2= RULE_COMMA (this_IgnoredHashKeyValue_3= ruleIgnoredHashKeyValue | this_ARRAY_BLOCK_4= RULE_ARRAY_BLOCK )
            	    {
            	    this_COMMA_2=(Token)match(input,RULE_COMMA,FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_COMMA_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_COMMA_2, grammarAccess.getIndexAccess().getCOMMATerminalRuleCall_2_0());
            	      			
            	    }
            	    // InternalRailsSchema.g:501:4: (this_IgnoredHashKeyValue_3= ruleIgnoredHashKeyValue | this_ARRAY_BLOCK_4= RULE_ARRAY_BLOCK )
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);

            	    if ( (LA14_0==RULE_STRING||(LA14_0>=RULE_ID && LA14_0<=RULE_SYMBOL)) ) {
            	        alt14=1;
            	    }
            	    else if ( (LA14_0==RULE_ARRAY_BLOCK) ) {
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
            	            // InternalRailsSchema.g:502:5: this_IgnoredHashKeyValue_3= ruleIgnoredHashKeyValue
            	            {
            	            if ( state.backtracking==0 ) {

            	              					newCompositeNode(grammarAccess.getIndexAccess().getIgnoredHashKeyValueParserRuleCall_2_1_0());
            	              				
            	            }
            	            pushFollow(FOLLOW_12);
            	            this_IgnoredHashKeyValue_3=ruleIgnoredHashKeyValue();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(this_IgnoredHashKeyValue_3);
            	              				
            	            }
            	            if ( state.backtracking==0 ) {

            	              					afterParserOrEnumRuleCall();
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalRailsSchema.g:513:5: this_ARRAY_BLOCK_4= RULE_ARRAY_BLOCK
            	            {
            	            this_ARRAY_BLOCK_4=(Token)match(input,RULE_ARRAY_BLOCK,FOLLOW_12); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(this_ARRAY_BLOCK_4);
            	              				
            	            }
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_ARRAY_BLOCK_4, grammarAccess.getIndexAccess().getARRAY_BLOCKTerminalRuleCall_2_1_1());
            	              				
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // $ANTLR end "ruleIndex"

    // $ANTLR start synpred1_InternalRailsSchema
    public final void synpred1_InternalRailsSchema_fragment() throws RecognitionException {   
        // InternalRailsSchema.g:231:4: ( RULE_END_WORD )
        // InternalRailsSchema.g:231:5: RULE_END_WORD
        {
        match(input,RULE_END_WORD,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalRailsSchema

    // Delegated rules

    public final boolean synpred1_InternalRailsSchema() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalRailsSchema_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000400440L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000001C80L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000800040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000000000FC80L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000800L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000003C80L});

}