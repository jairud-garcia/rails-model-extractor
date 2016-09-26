package co.gruposaberes.model.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import co.gruposaberes.model.services.RailsSchemaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalRailsSchemaParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SYMBOL", "RULE_STRING", "RULE_ARRAY_BLOCK", "RULE_INT", "RULE_ID", "RULE_DECIMAL", "RULE_PARENTHESIS_BLOCK", "RULE_DO_WORD", "RULE_END_WORD", "RULE_BLOCK_PARAMS", "RULE_COMMA", "RULE_SPACE", "RULE_BRACKET_BLOCK_ALONE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_BS", "RULE_ANY_OTHER", "'ActiveRecord::Schema.define'", "'create_table'", "'t.'", "':'", "'=>'"
    };
    public static final int RULE_DO_WORD=11;
    public static final int RULE_PARENTHESIS_BLOCK=10;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=18;
    public static final int RULE_BRACKET_BLOCK_ALONE=16;
    public static final int RULE_SPACE=15;
    public static final int EOF=-1;
    public static final int RULE_ARRAY_BLOCK=6;
    public static final int RULE_ID=8;
    public static final int RULE_COMMA=14;
    public static final int RULE_ANY_OTHER=20;
    public static final int RULE_BS=19;
    public static final int RULE_DECIMAL=9;
    public static final int RULE_INT=7;
    public static final int RULE_BLOCK_PARAMS=13;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=17;
    public static final int T__23=23;
    public static final int RULE_SYMBOL=4;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_END_WORD=12;
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

    	public void setGrammarAccess(RailsSchemaGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleSchema"
    // InternalRailsSchema.g:54:1: entryRuleSchema : ruleSchema EOF ;
    public final void entryRuleSchema() throws RecognitionException {
        try {
            // InternalRailsSchema.g:55:1: ( ruleSchema EOF )
            // InternalRailsSchema.g:56:1: ruleSchema EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSchemaRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSchema();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSchemaRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSchema"


    // $ANTLR start "ruleSchema"
    // InternalRailsSchema.g:63:1: ruleSchema : ( ( rule__Schema__Group__0 ) ) ;
    public final void ruleSchema() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailsSchema.g:67:2: ( ( ( rule__Schema__Group__0 ) ) )
            // InternalRailsSchema.g:68:2: ( ( rule__Schema__Group__0 ) )
            {
            // InternalRailsSchema.g:68:2: ( ( rule__Schema__Group__0 ) )
            // InternalRailsSchema.g:69:3: ( rule__Schema__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSchemaAccess().getGroup()); 
            }
            // InternalRailsSchema.g:70:3: ( rule__Schema__Group__0 )
            // InternalRailsSchema.g:70:4: rule__Schema__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Schema__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSchemaAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSchema"


    // $ANTLR start "entryRuleSchemaMember"
    // InternalRailsSchema.g:79:1: entryRuleSchemaMember : ruleSchemaMember EOF ;
    public final void entryRuleSchemaMember() throws RecognitionException {
        try {
            // InternalRailsSchema.g:80:1: ( ruleSchemaMember EOF )
            // InternalRailsSchema.g:81:1: ruleSchemaMember EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSchemaMemberRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSchemaMember();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSchemaMemberRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSchemaMember"


    // $ANTLR start "ruleSchemaMember"
    // InternalRailsSchema.g:88:1: ruleSchemaMember : ( ( rule__SchemaMember__Alternatives ) ) ;
    public final void ruleSchemaMember() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailsSchema.g:92:2: ( ( ( rule__SchemaMember__Alternatives ) ) )
            // InternalRailsSchema.g:93:2: ( ( rule__SchemaMember__Alternatives ) )
            {
            // InternalRailsSchema.g:93:2: ( ( rule__SchemaMember__Alternatives ) )
            // InternalRailsSchema.g:94:3: ( rule__SchemaMember__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSchemaMemberAccess().getAlternatives()); 
            }
            // InternalRailsSchema.g:95:3: ( rule__SchemaMember__Alternatives )
            // InternalRailsSchema.g:95:4: rule__SchemaMember__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SchemaMember__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSchemaMemberAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSchemaMember"


    // $ANTLR start "entryRuleTable"
    // InternalRailsSchema.g:104:1: entryRuleTable : ruleTable EOF ;
    public final void entryRuleTable() throws RecognitionException {
        try {
            // InternalRailsSchema.g:105:1: ( ruleTable EOF )
            // InternalRailsSchema.g:106:1: ruleTable EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTable"


    // $ANTLR start "ruleTable"
    // InternalRailsSchema.g:113:1: ruleTable : ( ( rule__Table__Group__0 ) ) ;
    public final void ruleTable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailsSchema.g:117:2: ( ( ( rule__Table__Group__0 ) ) )
            // InternalRailsSchema.g:118:2: ( ( rule__Table__Group__0 ) )
            {
            // InternalRailsSchema.g:118:2: ( ( rule__Table__Group__0 ) )
            // InternalRailsSchema.g:119:3: ( rule__Table__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getGroup()); 
            }
            // InternalRailsSchema.g:120:3: ( rule__Table__Group__0 )
            // InternalRailsSchema.g:120:4: rule__Table__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Table__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTable"


    // $ANTLR start "entryRuleTableAttributes"
    // InternalRailsSchema.g:129:1: entryRuleTableAttributes : ruleTableAttributes EOF ;
    public final void entryRuleTableAttributes() throws RecognitionException {
        try {
            // InternalRailsSchema.g:130:1: ( ruleTableAttributes EOF )
            // InternalRailsSchema.g:131:1: ruleTableAttributes EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAttributesRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTableAttributes();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableAttributesRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTableAttributes"


    // $ANTLR start "ruleTableAttributes"
    // InternalRailsSchema.g:138:1: ruleTableAttributes : ( ( rule__TableAttributes__Group__0 ) ) ;
    public final void ruleTableAttributes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailsSchema.g:142:2: ( ( ( rule__TableAttributes__Group__0 ) ) )
            // InternalRailsSchema.g:143:2: ( ( rule__TableAttributes__Group__0 ) )
            {
            // InternalRailsSchema.g:143:2: ( ( rule__TableAttributes__Group__0 ) )
            // InternalRailsSchema.g:144:3: ( rule__TableAttributes__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAttributesAccess().getGroup()); 
            }
            // InternalRailsSchema.g:145:3: ( rule__TableAttributes__Group__0 )
            // InternalRailsSchema.g:145:4: rule__TableAttributes__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TableAttributes__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableAttributesAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTableAttributes"


    // $ANTLR start "entryRuleIgnoredHashKeyValue"
    // InternalRailsSchema.g:154:1: entryRuleIgnoredHashKeyValue : ruleIgnoredHashKeyValue EOF ;
    public final void entryRuleIgnoredHashKeyValue() throws RecognitionException {
        try {
            // InternalRailsSchema.g:155:1: ( ruleIgnoredHashKeyValue EOF )
            // InternalRailsSchema.g:156:1: ruleIgnoredHashKeyValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIgnoredHashKeyValueRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleIgnoredHashKeyValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIgnoredHashKeyValueRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIgnoredHashKeyValue"


    // $ANTLR start "ruleIgnoredHashKeyValue"
    // InternalRailsSchema.g:163:1: ruleIgnoredHashKeyValue : ( ( rule__IgnoredHashKeyValue__Group__0 ) ) ;
    public final void ruleIgnoredHashKeyValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailsSchema.g:167:2: ( ( ( rule__IgnoredHashKeyValue__Group__0 ) ) )
            // InternalRailsSchema.g:168:2: ( ( rule__IgnoredHashKeyValue__Group__0 ) )
            {
            // InternalRailsSchema.g:168:2: ( ( rule__IgnoredHashKeyValue__Group__0 ) )
            // InternalRailsSchema.g:169:3: ( rule__IgnoredHashKeyValue__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIgnoredHashKeyValueAccess().getGroup()); 
            }
            // InternalRailsSchema.g:170:3: ( rule__IgnoredHashKeyValue__Group__0 )
            // InternalRailsSchema.g:170:4: rule__IgnoredHashKeyValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IgnoredHashKeyValue__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIgnoredHashKeyValueAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIgnoredHashKeyValue"


    // $ANTLR start "entryRuleIndex"
    // InternalRailsSchema.g:179:1: entryRuleIndex : ruleIndex EOF ;
    public final void entryRuleIndex() throws RecognitionException {
        try {
            // InternalRailsSchema.g:180:1: ( ruleIndex EOF )
            // InternalRailsSchema.g:181:1: ruleIndex EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIndexRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleIndex();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIndexRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIndex"


    // $ANTLR start "ruleIndex"
    // InternalRailsSchema.g:188:1: ruleIndex : ( ( rule__Index__Group__0 ) ) ;
    public final void ruleIndex() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailsSchema.g:192:2: ( ( ( rule__Index__Group__0 ) ) )
            // InternalRailsSchema.g:193:2: ( ( rule__Index__Group__0 ) )
            {
            // InternalRailsSchema.g:193:2: ( ( rule__Index__Group__0 ) )
            // InternalRailsSchema.g:194:3: ( rule__Index__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIndexAccess().getGroup()); 
            }
            // InternalRailsSchema.g:195:3: ( rule__Index__Group__0 )
            // InternalRailsSchema.g:195:4: rule__Index__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Index__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIndexAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIndex"


    // $ANTLR start "rule__SchemaMember__Alternatives"
    // InternalRailsSchema.g:203:1: rule__SchemaMember__Alternatives : ( ( ruleTable ) | ( ruleIndex ) );
    public final void rule__SchemaMember__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailsSchema.g:207:1: ( ( ruleTable ) | ( ruleIndex ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==22) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalRailsSchema.g:208:2: ( ruleTable )
                    {
                    // InternalRailsSchema.g:208:2: ( ruleTable )
                    // InternalRailsSchema.g:209:3: ruleTable
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSchemaMemberAccess().getTableParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleTable();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSchemaMemberAccess().getTableParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalRailsSchema.g:214:2: ( ruleIndex )
                    {
                    // InternalRailsSchema.g:214:2: ( ruleIndex )
                    // InternalRailsSchema.g:215:3: ruleIndex
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSchemaMemberAccess().getIndexParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleIndex();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSchemaMemberAccess().getIndexParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchemaMember__Alternatives"


    // $ANTLR start "rule__IgnoredHashKeyValue__Alternatives_1"
    // InternalRailsSchema.g:224:1: rule__IgnoredHashKeyValue__Alternatives_1 : ( ( ( rule__IgnoredHashKeyValue__Group_1_0__0 ) ) | ( ( rule__IgnoredHashKeyValue__Group_1_1__0 ) ) );
    public final void rule__IgnoredHashKeyValue__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailsSchema.g:228:1: ( ( ( rule__IgnoredHashKeyValue__Group_1_0__0 ) ) | ( ( rule__IgnoredHashKeyValue__Group_1_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=RULE_SYMBOL && LA2_0<=RULE_STRING)) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalRailsSchema.g:229:2: ( ( rule__IgnoredHashKeyValue__Group_1_0__0 ) )
                    {
                    // InternalRailsSchema.g:229:2: ( ( rule__IgnoredHashKeyValue__Group_1_0__0 ) )
                    // InternalRailsSchema.g:230:3: ( rule__IgnoredHashKeyValue__Group_1_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIgnoredHashKeyValueAccess().getGroup_1_0()); 
                    }
                    // InternalRailsSchema.g:231:3: ( rule__IgnoredHashKeyValue__Group_1_0__0 )
                    // InternalRailsSchema.g:231:4: rule__IgnoredHashKeyValue__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__IgnoredHashKeyValue__Group_1_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIgnoredHashKeyValueAccess().getGroup_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalRailsSchema.g:235:2: ( ( rule__IgnoredHashKeyValue__Group_1_1__0 ) )
                    {
                    // InternalRailsSchema.g:235:2: ( ( rule__IgnoredHashKeyValue__Group_1_1__0 ) )
                    // InternalRailsSchema.g:236:3: ( rule__IgnoredHashKeyValue__Group_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIgnoredHashKeyValueAccess().getGroup_1_1()); 
                    }
                    // InternalRailsSchema.g:237:3: ( rule__IgnoredHashKeyValue__Group_1_1__0 )
                    // InternalRailsSchema.g:237:4: rule__IgnoredHashKeyValue__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__IgnoredHashKeyValue__Group_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIgnoredHashKeyValueAccess().getGroup_1_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IgnoredHashKeyValue__Alternatives_1"


    // $ANTLR start "rule__IgnoredHashKeyValue__Alternatives_1_1_0"
    // InternalRailsSchema.g:245:1: rule__IgnoredHashKeyValue__Alternatives_1_1_0 : ( ( RULE_SYMBOL ) | ( RULE_STRING ) );
    public final void rule__IgnoredHashKeyValue__Alternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailsSchema.g:249:1: ( ( RULE_SYMBOL ) | ( RULE_STRING ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_SYMBOL) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_STRING) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalRailsSchema.g:250:2: ( RULE_SYMBOL )
                    {
                    // InternalRailsSchema.g:250:2: ( RULE_SYMBOL )
                    // InternalRailsSchema.g:251:3: RULE_SYMBOL
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIgnoredHashKeyValueAccess().getSYMBOLTerminalRuleCall_1_1_0_0()); 
                    }
                    match(input,RULE_SYMBOL,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIgnoredHashKeyValueAccess().getSYMBOLTerminalRuleCall_1_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalRailsSchema.g:256:2: ( RULE_STRING )
                    {
                    // InternalRailsSchema.g:256:2: ( RULE_STRING )
                    // InternalRailsSchema.g:257:3: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIgnoredHashKeyValueAccess().getSTRINGTerminalRuleCall_1_1_0_1()); 
                    }
                    match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIgnoredHashKeyValueAccess().getSTRINGTerminalRuleCall_1_1_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IgnoredHashKeyValue__Alternatives_1_1_0"


    // $ANTLR start "rule__IgnoredHashKeyValue__Alternatives_3"
    // InternalRailsSchema.g:266:1: rule__IgnoredHashKeyValue__Alternatives_3 : ( ( RULE_SYMBOL ) | ( RULE_STRING ) | ( RULE_ARRAY_BLOCK ) | ( RULE_INT ) | ( RULE_ID ) | ( RULE_DECIMAL ) );
    public final void rule__IgnoredHashKeyValue__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailsSchema.g:270:1: ( ( RULE_SYMBOL ) | ( RULE_STRING ) | ( RULE_ARRAY_BLOCK ) | ( RULE_INT ) | ( RULE_ID ) | ( RULE_DECIMAL ) )
            int alt4=6;
            switch ( input.LA(1) ) {
            case RULE_SYMBOL:
                {
                alt4=1;
                }
                break;
            case RULE_STRING:
                {
                alt4=2;
                }
                break;
            case RULE_ARRAY_BLOCK:
                {
                alt4=3;
                }
                break;
            case RULE_INT:
                {
                alt4=4;
                }
                break;
            case RULE_ID:
                {
                alt4=5;
                }
                break;
            case RULE_DECIMAL:
                {
                alt4=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalRailsSchema.g:271:2: ( RULE_SYMBOL )
                    {
                    // InternalRailsSchema.g:271:2: ( RULE_SYMBOL )
                    // InternalRailsSchema.g:272:3: RULE_SYMBOL
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIgnoredHashKeyValueAccess().getSYMBOLTerminalRuleCall_3_0()); 
                    }
                    match(input,RULE_SYMBOL,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIgnoredHashKeyValueAccess().getSYMBOLTerminalRuleCall_3_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalRailsSchema.g:277:2: ( RULE_STRING )
                    {
                    // InternalRailsSchema.g:277:2: ( RULE_STRING )
                    // InternalRailsSchema.g:278:3: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIgnoredHashKeyValueAccess().getSTRINGTerminalRuleCall_3_1()); 
                    }
                    match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIgnoredHashKeyValueAccess().getSTRINGTerminalRuleCall_3_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalRailsSchema.g:283:2: ( RULE_ARRAY_BLOCK )
                    {
                    // InternalRailsSchema.g:283:2: ( RULE_ARRAY_BLOCK )
                    // InternalRailsSchema.g:284:3: RULE_ARRAY_BLOCK
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIgnoredHashKeyValueAccess().getARRAY_BLOCKTerminalRuleCall_3_2()); 
                    }
                    match(input,RULE_ARRAY_BLOCK,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIgnoredHashKeyValueAccess().getARRAY_BLOCKTerminalRuleCall_3_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalRailsSchema.g:289:2: ( RULE_INT )
                    {
                    // InternalRailsSchema.g:289:2: ( RULE_INT )
                    // InternalRailsSchema.g:290:3: RULE_INT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIgnoredHashKeyValueAccess().getINTTerminalRuleCall_3_3()); 
                    }
                    match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIgnoredHashKeyValueAccess().getINTTerminalRuleCall_3_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalRailsSchema.g:295:2: ( RULE_ID )
                    {
                    // InternalRailsSchema.g:295:2: ( RULE_ID )
                    // InternalRailsSchema.g:296:3: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIgnoredHashKeyValueAccess().getIDTerminalRuleCall_3_4()); 
                    }
                    match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIgnoredHashKeyValueAccess().getIDTerminalRuleCall_3_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalRailsSchema.g:301:2: ( RULE_DECIMAL )
                    {
                    // InternalRailsSchema.g:301:2: ( RULE_DECIMAL )
                    // InternalRailsSchema.g:302:3: RULE_DECIMAL
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIgnoredHashKeyValueAccess().getDECIMALTerminalRuleCall_3_5()); 
                    }
                    match(input,RULE_DECIMAL,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIgnoredHashKeyValueAccess().getDECIMALTerminalRuleCall_3_5()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IgnoredHashKeyValue__Alternatives_3"


    // $ANTLR start "rule__Index__Alternatives_2_1"
    // InternalRailsSchema.g:311:1: rule__Index__Alternatives_2_1 : ( ( ruleIgnoredHashKeyValue ) | ( RULE_ARRAY_BLOCK ) );
    public final void rule__Index__Alternatives_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailsSchema.g:315:1: ( ( ruleIgnoredHashKeyValue ) | ( RULE_ARRAY_BLOCK ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_SYMBOL && LA5_0<=RULE_STRING)||LA5_0==RULE_ID||LA5_0==RULE_SPACE) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ARRAY_BLOCK) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalRailsSchema.g:316:2: ( ruleIgnoredHashKeyValue )
                    {
                    // InternalRailsSchema.g:316:2: ( ruleIgnoredHashKeyValue )
                    // InternalRailsSchema.g:317:3: ruleIgnoredHashKeyValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIndexAccess().getIgnoredHashKeyValueParserRuleCall_2_1_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleIgnoredHashKeyValue();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIndexAccess().getIgnoredHashKeyValueParserRuleCall_2_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalRailsSchema.g:322:2: ( RULE_ARRAY_BLOCK )
                    {
                    // InternalRailsSchema.g:322:2: ( RULE_ARRAY_BLOCK )
                    // InternalRailsSchema.g:323:3: RULE_ARRAY_BLOCK
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIndexAccess().getARRAY_BLOCKTerminalRuleCall_2_1_1()); 
                    }
                    match(input,RULE_ARRAY_BLOCK,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIndexAccess().getARRAY_BLOCKTerminalRuleCall_2_1_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Index__Alternatives_2_1"


    // $ANTLR start "rule__Schema__Group__0"
    // InternalRailsSchema.g:332:1: rule__Schema__Group__0 : rule__Schema__Group__0__Impl rule__Schema__Group__1 ;
    public final void rule__Schema__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailsSchema.g:336:1: ( rule__Schema__Group__0__Impl rule__Schema__Group__1 )
            // InternalRailsSchema.g:337:2: rule__Schema__Group__0__Impl rule__Schema__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Schema__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Schema__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group__0"


    // $ANTLR start "rule__Schema__Group__0__Impl"
    // InternalRailsSchema.g:344:1: rule__Schema__Group__0__Impl : ( 'ActiveRecord::Schema.define' ) ;
    public final void rule__Schema__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailsSchema.g:348:1: ( ( 'ActiveRecord::Schema.define' ) )
            // InternalRailsSchema.g:349:1: ( 'ActiveRecord::Schema.define' )
            {
            // InternalRailsSchema.g:349:1: ( 'ActiveRecord::Schema.define' )
            // InternalRailsSchema.g:350:2: 'ActiveRecord::Schema.define'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSchemaAccess().getActiveRecordSchemaDefineKeyword_0()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSchemaAccess().getActiveRecordSchemaDefineKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group__0__Impl"


    // $ANTLR start "rule__Schema__Group__1"
    // InternalRailsSchema.g:359:1: rule__Schema__Group__1 : rule__Schema__Group__1__Impl rule__Schema__Group__2 ;
    public final void rule__Schema__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailsSchema.g:363:1: ( rule__Schema__Group__1__Impl rule__Schema__Group__2 )
            // InternalRailsSchema.g:364:2: rule__Schema__Group__1__Impl rule__Schema__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Schema__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Schema__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group__1"


    // $ANTLR start "rule__Schema__Group__1__Impl"
    // InternalRailsSchema.g:371:1: rule__Schema__Group__1__Impl : ( RULE_PARENTHESIS_BLOCK ) ;
    public final void rule__Schema__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailsSchema.g:375:1: ( ( RULE_PARENTHESIS_BLOCK ) )
            // InternalRailsSchema.g:376:1: ( RULE_PARENTHESIS_BLOCK )
            {
            // InternalRailsSchema.g:376:1: ( RULE_PARENTHESIS_BLOCK )
            // InternalRailsSchema.g:377:2: RULE_PARENTHESIS_BLOCK
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSchemaAccess().getPARENTHESIS_BLOCKTerminalRuleCall_1()); 
            }
            match(input,RULE_PARENTHESIS_BLOCK,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSchemaAccess().getPARENTHESIS_BLOCKTerminalRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group__1__Impl"


    // $ANTLR start "rule__Schema__Group__2"
    // InternalRailsSchema.g:386:1: rule__Schema__Group__2 : rule__Schema__Group__2__Impl rule__Schema__Group__3 ;
    public final void rule__Schema__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailsSchema.g:390:1: ( rule__Schema__Group__2__Impl rule__Schema__Group__3 )
            // InternalRailsSchema.g:391:2: rule__Schema__Group__2__Impl rule__Schema__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Schema__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Schema__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group__2"


    // $ANTLR start "rule__Schema__Group__2__Impl"
    // InternalRailsSchema.g:398:1: rule__Schema__Group__2__Impl : ( RULE_DO_WORD ) ;
    public final void rule__Schema__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailsSchema.g:402:1: ( ( RULE_DO_WORD ) )
            // InternalRailsSchema.g:403:1: ( RULE_DO_WORD )
            {
            // InternalRailsSchema.g:403:1: ( RULE_DO_WORD )
            // InternalRailsSchema.g:404:2: RULE_DO_WORD
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSchemaAccess().getDO_WORDTerminalRuleCall_2()); 
            }
            match(input,RULE_DO_WORD,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSchemaAccess().getDO_WORDTerminalRuleCall_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group__2__Impl"


    // $ANTLR start "rule__Schema__Group__3"
    // InternalRailsSchema.g:413:1: rule__Schema__Group__3 : rule__Schema__Group__3__Impl rule__Schema__Group__4 ;
    public final void rule__Schema__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailsSchema.g:417:1: ( rule__Schema__Group__3__Impl rule__Schema__Group__4 )
            // InternalRailsSchema.g:418:2: rule__Schema__Group__3__Impl rule__Schema__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Schema__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Schema__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group__3"


    // $ANTLR start "rule__Schema__Group__3__Impl"
    // InternalRailsSchema.g:425:1: rule__Schema__Group__3__Impl : ( ( rule__Schema__Schema_membersAssignment_3 )* ) ;
    public final void rule__Schema__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailsSchema.g:429:1: ( ( ( rule__Schema__Schema_membersAssignment_3 )* ) )
            // InternalRailsSchema.g:430:1: ( ( rule__Schema__Schema_membersAssignment_3 )* )
            {
            // InternalRailsSchema.g:430:1: ( ( rule__Schema__Schema_membersAssignment_3 )* )
            // InternalRailsSchema.g:431:2: ( rule__Schema__Schema_membersAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSchemaAccess().getSchema_membersAssignment_3()); 
            }
            // InternalRailsSchema.g:432:2: ( rule__Schema__Schema_membersAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||LA6_0==22) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalRailsSchema.g:432:3: rule__Schema__Schema_membersAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Schema__Schema_membersAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSchemaAccess().getSchema_membersAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group__3__Impl"


    // $ANTLR start "rule__Schema__Group__4"
    // InternalRailsSchema.g:440:1: rule__Schema__Group__4 : rule__Schema__Group__4__Impl ;
    public final void rule__Schema__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailsSchema.g:444:1: ( rule__Schema__Group__4__Impl )
            // InternalRailsSchema.g:445:2: rule__Schema__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Schema__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group__4"


    // $ANTLR start "rule__Schema__Group__4__Impl"
    // InternalRailsSchema.g:451:1: rule__Schema__Group__4__Impl : ( RULE_END_WORD ) ;
    public final void rule__Schema__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailsSchema.g:455:1: ( ( RULE_END_WORD ) )
            // InternalRailsSchema.g:456:1: ( RULE_END_WORD )
            {
            // InternalRailsSchema.g:456:1: ( RULE_END_WORD )
            // InternalRailsSchema.g:457:2: RULE_END_WORD
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSchemaAccess().getEND_WORDTerminalRuleCall_4()); 
            }
            match(input,RULE_END_WORD,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSchemaAccess().getEND_WORDTerminalRuleCall_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group__4__Impl"


    // $ANTLR start "rule__Table__Group__0"
    // InternalRailsSchema.g:467:1: rule__Table__Group__0 : rule__Table__Group__0__Impl rule__Table__Group__1 ;
    public final void rule__Table__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailsSchema.g:471:1: ( rule__Table__Group__0__Impl rule__Table__Group__1 )
            // InternalRailsSchema.g:472:2: rule__Table__Group__0__Impl rule__Table__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Table__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Table__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__0"


    // $ANTLR start "rule__Table__Group__0__Impl"
    // InternalRailsSchema.g:479:1: rule__Table__Group__0__Impl : ( 'create_table' ) ;
    public final void rule__Table__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailsSchema.g:483:1: ( ( 'create_table' ) )
            // InternalRailsSchema.g:484:1: ( 'create_table' )
            {
            // InternalRailsSchema.g:484:1: ( 'create_table' )
            // InternalRailsSchema.g:485:2: 'create_table'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getCreate_tableKeyword_0()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableAccess().getCreate_tableKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__0__Impl"


    // $ANTLR start "rule__Table__Group__1"
    // InternalRailsSchema.g:494:1: rule__Table__Group__1 : rule__Table__Group__1__Impl rule__Table__Group__2 ;
    public final void rule__Table__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailsSchema.g:498:1: ( rule__Table__Group__1__Impl rule__Table__Group__2 )
            // InternalRailsSchema.g:499:2: rule__Table__Group__1__Impl rule__Table__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Table__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Table__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__1"


    // $ANTLR start "rule__Table__Group__1__Impl"
    // InternalRailsSchema.g:506:1: rule__Table__Group__1__Impl : ( ( rule__Table__NameAssignment_1 ) ) ;
    public final void rule__Table__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailsSchema.g:510:1: ( ( ( rule__Table__NameAssignment_1 ) ) )
            // InternalRailsSchema.g:511:1: ( ( rule__Table__NameAssignment_1 ) )
            {
            // InternalRailsSchema.g:511:1: ( ( rule__Table__NameAssignment_1 ) )
            // InternalRailsSchema.g:512:2: ( rule__Table__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getNameAssignment_1()); 
            }
            // InternalRailsSchema.g:513:2: ( rule__Table__NameAssignment_1 )
            // InternalRailsSchema.g:513:3: rule__Table__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Table__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__1__Impl"


    // $ANTLR start "rule__Table__Group__2"
    // InternalRailsSchema.g:521:1: rule__Table__Group__2 : rule__Table__Group__2__Impl rule__Table__Group__3 ;
    public final void rule__Table__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailsSchema.g:525:1: ( rule__Table__Group__2__Impl rule__Table__Group__3 )
            // InternalRailsSchema.g:526:2: rule__Table__Group__2__Impl rule__Table__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Table__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Table__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__2"


    // $ANTLR start "rule__Table__Group__2__Impl"
    // InternalRailsSchema.g:533:1: rule__Table__Group__2__Impl : ( ( rule__Table__Group_2__0 )* ) ;
    public final void rule__Table__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailsSchema.g:537:1: ( ( ( rule__Table__Group_2__0 )* ) )
            // InternalRailsSchema.g:538:1: ( ( rule__Table__Group_2__0 )* )
            {
            // InternalRailsSchema.g:538:1: ( ( rule__Table__Group_2__0 )* )
            // InternalRailsSchema.g:539:2: ( rule__Table__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getGroup_2()); 
            }
            // InternalRailsSchema.g:540:2: ( rule__Table__Group_2__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_COMMA) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalRailsSchema.g:540:3: rule__Table__Group_2__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Table__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__2__Impl"


    // $ANTLR start "rule__Table__Group__3"
    // InternalRailsSchema.g:548:1: rule__Table__Group__3 : rule__Table__Group__3__Impl rule__Table__Group__4 ;
    public final void rule__Table__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailsSchema.g:552:1: ( rule__Table__Group__3__Impl rule__Table__Group__4 )
            // InternalRailsSchema.g:553:2: rule__Table__Group__3__Impl rule__Table__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Table__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Table__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__3"


    // $ANTLR start "rule__Table__Group__3__Impl"
    // InternalRailsSchema.g:560:1: rule__Table__Group__3__Impl : ( RULE_DO_WORD ) ;
    public final void rule__Table__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailsSchema.g:564:1: ( ( RULE_DO_WORD ) )
            // InternalRailsSchema.g:565:1: ( RULE_DO_WORD )
            {
            // InternalRailsSchema.g:565:1: ( RULE_DO_WORD )
            // InternalRailsSchema.g:566:2: RULE_DO_WORD
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getDO_WORDTerminalRuleCall_3()); 
            }
            match(input,RULE_DO_WORD,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableAccess().getDO_WORDTerminalRuleCall_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__3__Impl"


    // $ANTLR start "rule__Table__Group__4"
    // InternalRailsSchema.g:575:1: rule__Table__Group__4 : rule__Table__Group__4__Impl rule__Table__Group__5 ;
    public final void rule__Table__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailsSchema.g:579:1: ( rule__Table__Group__4__Impl rule__Table__Group__5 )
            // InternalRailsSchema.g:580:2: rule__Table__Group__4__Impl rule__Table__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__Table__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Table__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__4"


    // $ANTLR start "rule__Table__Group__4__Impl"
    // InternalRailsSchema.g:587:1: rule__Table__Group__4__Impl : ( RULE_BLOCK_PARAMS ) ;
    public final void rule__Table__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailsSchema.g:591:1: ( ( RULE_BLOCK_PARAMS ) )
            // InternalRailsSchema.g:592:1: ( RULE_BLOCK_PARAMS )
            {
            // InternalRailsSchema.g:592:1: ( RULE_BLOCK_PARAMS )
            // InternalRailsSchema.g:593:2: RULE_BLOCK_PARAMS
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getBLOCK_PARAMSTerminalRuleCall_4()); 
            }
            match(input,RULE_BLOCK_PARAMS,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableAccess().getBLOCK_PARAMSTerminalRuleCall_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__4__Impl"


    // $ANTLR start "rule__Table__Group__5"
    // InternalRailsSchema.g:602:1: rule__Table__Group__5 : rule__Table__Group__5__Impl rule__Table__Group__6 ;
    public final void rule__Table__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailsSchema.g:606:1: ( rule__Table__Group__5__Impl rule__Table__Group__6 )
            // InternalRailsSchema.g:607:2: rule__Table__Group__5__Impl rule__Table__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__Table__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Table__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__5"


    // $ANTLR start "rule__Table__Group__5__Impl"
    // InternalRailsSchema.g:614:1: rule__Table__Group__5__Impl : ( ( rule__Table__AttributesAssignment_5 )* ) ;
    public final void rule__Table__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailsSchema.g:618:1: ( ( ( rule__Table__AttributesAssignment_5 )* ) )
            // InternalRailsSchema.g:619:1: ( ( rule__Table__AttributesAssignment_5 )* )
            {
            // InternalRailsSchema.g:619:1: ( ( rule__Table__AttributesAssignment_5 )* )
            // InternalRailsSchema.g:620:2: ( rule__Table__AttributesAssignment_5 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getAttributesAssignment_5()); 
            }
            // InternalRailsSchema.g:621:2: ( rule__Table__AttributesAssignment_5 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==23) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalRailsSchema.g:621:3: rule__Table__AttributesAssignment_5
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Table__AttributesAssignment_5();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableAccess().getAttributesAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__5__Impl"


    // $ANTLR start "rule__Table__Group__6"
    // InternalRailsSchema.g:629:1: rule__Table__Group__6 : rule__Table__Group__6__Impl ;
    public final void rule__Table__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailsSchema.g:633:1: ( rule__Table__Group__6__Impl )
            // InternalRailsSchema.g:634:2: rule__Table__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Table__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__6"


    // $ANTLR start "rule__Table__Group__6__Impl"
    // InternalRailsSchema.g:640:1: rule__Table__Group__6__Impl : ( ( RULE_END_WORD ) ) ;
    public final void rule__Table__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailsSchema.g:644:1: ( ( ( RULE_END_WORD ) ) )
            // InternalRailsSchema.g:645:1: ( ( RULE_END_WORD ) )
            {
            // InternalRailsSchema.g:645:1: ( ( RULE_END_WORD ) )
            // InternalRailsSchema.g:646:2: ( RULE_END_WORD )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getEND_WORDTerminalRuleCall_6()); 
            }
            // InternalRailsSchema.g:647:2: ( RULE_END_WORD )
            // InternalRailsSchema.g:647:3: RULE_END_WORD
            {
            match(input,RULE_END_WORD,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableAccess().getEND_WORDTerminalRuleCall_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__6__Impl"


    // $ANTLR start "rule__Table__Group_2__0"
    // InternalRailsSchema.g:656:1: rule__Table__Group_2__0 : rule__Table__Group_2__0__Impl rule__Table__Group_2__1 ;
    public final void rule__Table__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailsSchema.g:660:1: ( rule__Table__Group_2__0__Impl rule__Table__Group_2__1 )
            // InternalRailsSchema.g:661:2: rule__Table__Group_2__0__Impl rule__Table__Group_2__1
            {
            pushFollow(FOLLOW_13);
            rule__Table__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Table__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_2__0"


    // $ANTLR start "rule__Table__Group_2__0__Impl"
    // InternalRailsSchema.g:668:1: rule__Table__Group_2__0__Impl : ( RULE_COMMA ) ;
    public final void rule__Table__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailsSchema.g:672:1: ( ( RULE_COMMA ) )
            // InternalRailsSchema.g:673:1: ( RULE_COMMA )
            {
            // InternalRailsSchema.g:673:1: ( RULE_COMMA )
            // InternalRailsSchema.g:674:2: RULE_COMMA
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getCOMMATerminalRuleCall_2_0()); 
            }
            match(input,RULE_COMMA,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableAccess().getCOMMATerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_2__0__Impl"


    // $ANTLR start "rule__Table__Group_2__1"
    // InternalRailsSchema.g:683:1: rule__Table__Group_2__1 : rule__Table__Group_2__1__Impl ;
    public final void rule__Table__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailsSchema.g:687:1: ( rule__Table__Group_2__1__Impl )
            // InternalRailsSchema.g:688:2: rule__Table__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Table__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_2__1"


    // $ANTLR start "rule__Table__Group_2__1__Impl"
    // InternalRailsSchema.g:694:1: rule__Table__Group_2__1__Impl : ( ruleIgnoredHashKeyValue ) ;
    public final void rule__Table__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailsSchema.g:698:1: ( ( ruleIgnoredHashKeyValue ) )
            // InternalRailsSchema.g:699:1: ( ruleIgnoredHashKeyValue )
            {
            // InternalRailsSchema.g:699:1: ( ruleIgnoredHashKeyValue )
            // InternalRailsSchema.g:700:2: ruleIgnoredHashKeyValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getIgnoredHashKeyValueParserRuleCall_2_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleIgnoredHashKeyValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableAccess().getIgnoredHashKeyValueParserRuleCall_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_2__1__Impl"


    // $ANTLR start "rule__TableAttributes__Group__0"
    // InternalRailsSchema.g:710:1: rule__TableAttributes__Group__0 : rule__TableAttributes__Group__0__Impl rule__TableAttributes__Group__1 ;
    public final void rule__TableAttributes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailsSchema.g:714:1: ( rule__TableAttributes__Group__0__Impl rule__TableAttributes__Group__1 )
            // InternalRailsSchema.g:715:2: rule__TableAttributes__Group__0__Impl rule__TableAttributes__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__TableAttributes__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TableAttributes__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableAttributes__Group__0"


    // $ANTLR start "rule__TableAttributes__Group__0__Impl"
    // InternalRailsSchema.g:722:1: rule__TableAttributes__Group__0__Impl : ( 't.' ) ;
    public final void rule__TableAttributes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailsSchema.g:726:1: ( ( 't.' ) )
            // InternalRailsSchema.g:727:1: ( 't.' )
            {
            // InternalRailsSchema.g:727:1: ( 't.' )
            // InternalRailsSchema.g:728:2: 't.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAttributesAccess().getTKeyword_0()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableAttributesAccess().getTKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableAttributes__Group__0__Impl"


    // $ANTLR start "rule__TableAttributes__Group__1"
    // InternalRailsSchema.g:737:1: rule__TableAttributes__Group__1 : rule__TableAttributes__Group__1__Impl rule__TableAttributes__Group__2 ;
    public final void rule__TableAttributes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailsSchema.g:741:1: ( rule__TableAttributes__Group__1__Impl rule__TableAttributes__Group__2 )
            // InternalRailsSchema.g:742:2: rule__TableAttributes__Group__1__Impl rule__TableAttributes__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__TableAttributes__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TableAttributes__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableAttributes__Group__1"


    // $ANTLR start "rule__TableAttributes__Group__1__Impl"
    // InternalRailsSchema.g:749:1: rule__TableAttributes__Group__1__Impl : ( ( rule__TableAttributes__DatatypeAssignment_1 ) ) ;
    public final void rule__TableAttributes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailsSchema.g:753:1: ( ( ( rule__TableAttributes__DatatypeAssignment_1 ) ) )
            // InternalRailsSchema.g:754:1: ( ( rule__TableAttributes__DatatypeAssignment_1 ) )
            {
            // InternalRailsSchema.g:754:1: ( ( rule__TableAttributes__DatatypeAssignment_1 ) )
            // InternalRailsSchema.g:755:2: ( rule__TableAttributes__DatatypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAttributesAccess().getDatatypeAssignment_1()); 
            }
            // InternalRailsSchema.g:756:2: ( rule__TableAttributes__DatatypeAssignment_1 )
            // InternalRailsSchema.g:756:3: rule__TableAttributes__DatatypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TableAttributes__DatatypeAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableAttributesAccess().getDatatypeAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableAttributes__Group__1__Impl"


    // $ANTLR start "rule__TableAttributes__Group__2"
    // InternalRailsSchema.g:764:1: rule__TableAttributes__Group__2 : rule__TableAttributes__Group__2__Impl rule__TableAttributes__Group__3 ;
    public final void rule__TableAttributes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailsSchema.g:768:1: ( rule__TableAttributes__Group__2__Impl rule__TableAttributes__Group__3 )
            // InternalRailsSchema.g:769:2: rule__TableAttributes__Group__2__Impl rule__TableAttributes__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__TableAttributes__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TableAttributes__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableAttributes__Group__2"


    // $ANTLR start "rule__TableAttributes__Group__2__Impl"
    // InternalRailsSchema.g:776:1: rule__TableAttributes__Group__2__Impl : ( ( rule__TableAttributes__NameAssignment_2 ) ) ;
    public final void rule__TableAttributes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailsSchema.g:780:1: ( ( ( rule__TableAttributes__NameAssignment_2 ) ) )
            // InternalRailsSchema.g:781:1: ( ( rule__TableAttributes__NameAssignment_2 ) )
            {
            // InternalRailsSchema.g:781:1: ( ( rule__TableAttributes__NameAssignment_2 ) )
            // InternalRailsSchema.g:782:2: ( rule__TableAttributes__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAttributesAccess().getNameAssignment_2()); 
            }
            // InternalRailsSchema.g:783:2: ( rule__TableAttributes__NameAssignment_2 )
            // InternalRailsSchema.g:783:3: rule__TableAttributes__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TableAttributes__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableAttributesAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableAttributes__Group__2__Impl"


    // $ANTLR start "rule__TableAttributes__Group__3"
    // InternalRailsSchema.g:791:1: rule__TableAttributes__Group__3 : rule__TableAttributes__Group__3__Impl ;
    public final void rule__TableAttributes__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailsSchema.g:795:1: ( rule__TableAttributes__Group__3__Impl )
            // InternalRailsSchema.g:796:2: rule__TableAttributes__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TableAttributes__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableAttributes__Group__3"


    // $ANTLR start "rule__TableAttributes__Group__3__Impl"
    // InternalRailsSchema.g:802:1: rule__TableAttributes__Group__3__Impl : ( ( rule__TableAttributes__Group_3__0 )* ) ;
    public final void rule__TableAttributes__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailsSchema.g:806:1: ( ( ( rule__TableAttributes__Group_3__0 )* ) )
            // InternalRailsSchema.g:807:1: ( ( rule__TableAttributes__Group_3__0 )* )
            {
            // InternalRailsSchema.g:807:1: ( ( rule__TableAttributes__Group_3__0 )* )
            // InternalRailsSchema.g:808:2: ( rule__TableAttributes__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAttributesAccess().getGroup_3()); 
            }
            // InternalRailsSchema.g:809:2: ( rule__TableAttributes__Group_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_COMMA) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalRailsSchema.g:809:3: rule__TableAttributes__Group_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__TableAttributes__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableAttributesAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableAttributes__Group__3__Impl"


    // $ANTLR start "rule__TableAttributes__Group_3__0"
    // InternalRailsSchema.g:818:1: rule__TableAttributes__Group_3__0 : rule__TableAttributes__Group_3__0__Impl rule__TableAttributes__Group_3__1 ;
    public final void rule__TableAttributes__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailsSchema.g:822:1: ( rule__TableAttributes__Group_3__0__Impl rule__TableAttributes__Group_3__1 )
            // InternalRailsSchema.g:823:2: rule__TableAttributes__Group_3__0__Impl rule__TableAttributes__Group_3__1
            {
            pushFollow(FOLLOW_13);
            rule__TableAttributes__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TableAttributes__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableAttributes__Group_3__0"


    // $ANTLR start "rule__TableAttributes__Group_3__0__Impl"
    // InternalRailsSchema.g:830:1: rule__TableAttributes__Group_3__0__Impl : ( RULE_COMMA ) ;
    public final void rule__TableAttributes__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailsSchema.g:834:1: ( ( RULE_COMMA ) )
            // InternalRailsSchema.g:835:1: ( RULE_COMMA )
            {
            // InternalRailsSchema.g:835:1: ( RULE_COMMA )
            // InternalRailsSchema.g:836:2: RULE_COMMA
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAttributesAccess().getCOMMATerminalRuleCall_3_0()); 
            }
            match(input,RULE_COMMA,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableAttributesAccess().getCOMMATerminalRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableAttributes__Group_3__0__Impl"


    // $ANTLR start "rule__TableAttributes__Group_3__1"
    // InternalRailsSchema.g:845:1: rule__TableAttributes__Group_3__1 : rule__TableAttributes__Group_3__1__Impl rule__TableAttributes__Group_3__2 ;
    public final void rule__TableAttributes__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailsSchema.g:849:1: ( rule__TableAttributes__Group_3__1__Impl rule__TableAttributes__Group_3__2 )
            // InternalRailsSchema.g:850:2: rule__TableAttributes__Group_3__1__Impl rule__TableAttributes__Group_3__2
            {
            pushFollow(FOLLOW_13);
            rule__TableAttributes__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TableAttributes__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableAttributes__Group_3__1"


    // $ANTLR start "rule__TableAttributes__Group_3__1__Impl"
    // InternalRailsSchema.g:857:1: rule__TableAttributes__Group_3__1__Impl : ( ( RULE_SPACE )* ) ;
    public final void rule__TableAttributes__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailsSchema.g:861:1: ( ( ( RULE_SPACE )* ) )
            // InternalRailsSchema.g:862:1: ( ( RULE_SPACE )* )
            {
            // InternalRailsSchema.g:862:1: ( ( RULE_SPACE )* )
            // InternalRailsSchema.g:863:2: ( RULE_SPACE )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAttributesAccess().getSPACETerminalRuleCall_3_1()); 
            }
            // InternalRailsSchema.g:864:2: ( RULE_SPACE )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_SPACE) ) {
                    int LA10_1 = input.LA(2);

                    if ( (synpred14_InternalRailsSchema()) ) {
                        alt10=1;
                    }


                }


                switch (alt10) {
            	case 1 :
            	    // InternalRailsSchema.g:864:3: RULE_SPACE
            	    {
            	    match(input,RULE_SPACE,FOLLOW_16); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableAttributesAccess().getSPACETerminalRuleCall_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableAttributes__Group_3__1__Impl"


    // $ANTLR start "rule__TableAttributes__Group_3__2"
    // InternalRailsSchema.g:872:1: rule__TableAttributes__Group_3__2 : rule__TableAttributes__Group_3__2__Impl ;
    public final void rule__TableAttributes__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailsSchema.g:876:1: ( rule__TableAttributes__Group_3__2__Impl )
            // InternalRailsSchema.g:877:2: rule__TableAttributes__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TableAttributes__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableAttributes__Group_3__2"


    // $ANTLR start "rule__TableAttributes__Group_3__2__Impl"
    // InternalRailsSchema.g:883:1: rule__TableAttributes__Group_3__2__Impl : ( ruleIgnoredHashKeyValue ) ;
    public final void rule__TableAttributes__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailsSchema.g:887:1: ( ( ruleIgnoredHashKeyValue ) )
            // InternalRailsSchema.g:888:1: ( ruleIgnoredHashKeyValue )
            {
            // InternalRailsSchema.g:888:1: ( ruleIgnoredHashKeyValue )
            // InternalRailsSchema.g:889:2: ruleIgnoredHashKeyValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAttributesAccess().getIgnoredHashKeyValueParserRuleCall_3_2()); 
            }
            pushFollow(FOLLOW_2);
            ruleIgnoredHashKeyValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableAttributesAccess().getIgnoredHashKeyValueParserRuleCall_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableAttributes__Group_3__2__Impl"


    // $ANTLR start "rule__IgnoredHashKeyValue__Group__0"
    // InternalRailsSchema.g:899:1: rule__IgnoredHashKeyValue__Group__0 : rule__IgnoredHashKeyValue__Group__0__Impl rule__IgnoredHashKeyValue__Group__1 ;
    public final void rule__IgnoredHashKeyValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailsSchema.g:903:1: ( rule__IgnoredHashKeyValue__Group__0__Impl rule__IgnoredHashKeyValue__Group__1 )
            // InternalRailsSchema.g:904:2: rule__IgnoredHashKeyValue__Group__0__Impl rule__IgnoredHashKeyValue__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__IgnoredHashKeyValue__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IgnoredHashKeyValue__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IgnoredHashKeyValue__Group__0"


    // $ANTLR start "rule__IgnoredHashKeyValue__Group__0__Impl"
    // InternalRailsSchema.g:911:1: rule__IgnoredHashKeyValue__Group__0__Impl : ( ( RULE_SPACE )* ) ;
    public final void rule__IgnoredHashKeyValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailsSchema.g:915:1: ( ( ( RULE_SPACE )* ) )
            // InternalRailsSchema.g:916:1: ( ( RULE_SPACE )* )
            {
            // InternalRailsSchema.g:916:1: ( ( RULE_SPACE )* )
            // InternalRailsSchema.g:917:2: ( RULE_SPACE )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIgnoredHashKeyValueAccess().getSPACETerminalRuleCall_0()); 
            }
            // InternalRailsSchema.g:918:2: ( RULE_SPACE )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_SPACE) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalRailsSchema.g:918:3: RULE_SPACE
            	    {
            	    match(input,RULE_SPACE,FOLLOW_16); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIgnoredHashKeyValueAccess().getSPACETerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IgnoredHashKeyValue__Group__0__Impl"


    // $ANTLR start "rule__IgnoredHashKeyValue__Group__1"
    // InternalRailsSchema.g:926:1: rule__IgnoredHashKeyValue__Group__1 : rule__IgnoredHashKeyValue__Group__1__Impl rule__IgnoredHashKeyValue__Group__2 ;
    public final void rule__IgnoredHashKeyValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailsSchema.g:930:1: ( rule__IgnoredHashKeyValue__Group__1__Impl rule__IgnoredHashKeyValue__Group__2 )
            // InternalRailsSchema.g:931:2: rule__IgnoredHashKeyValue__Group__1__Impl rule__IgnoredHashKeyValue__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__IgnoredHashKeyValue__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IgnoredHashKeyValue__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IgnoredHashKeyValue__Group__1"


    // $ANTLR start "rule__IgnoredHashKeyValue__Group__1__Impl"
    // InternalRailsSchema.g:938:1: rule__IgnoredHashKeyValue__Group__1__Impl : ( ( rule__IgnoredHashKeyValue__Alternatives_1 ) ) ;
    public final void rule__IgnoredHashKeyValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailsSchema.g:942:1: ( ( ( rule__IgnoredHashKeyValue__Alternatives_1 ) ) )
            // InternalRailsSchema.g:943:1: ( ( rule__IgnoredHashKeyValue__Alternatives_1 ) )
            {
            // InternalRailsSchema.g:943:1: ( ( rule__IgnoredHashKeyValue__Alternatives_1 ) )
            // InternalRailsSchema.g:944:2: ( rule__IgnoredHashKeyValue__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIgnoredHashKeyValueAccess().getAlternatives_1()); 
            }
            // InternalRailsSchema.g:945:2: ( rule__IgnoredHashKeyValue__Alternatives_1 )
            // InternalRailsSchema.g:945:3: rule__IgnoredHashKeyValue__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__IgnoredHashKeyValue__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIgnoredHashKeyValueAccess().getAlternatives_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IgnoredHashKeyValue__Group__1__Impl"


    // $ANTLR start "rule__IgnoredHashKeyValue__Group__2"
    // InternalRailsSchema.g:953:1: rule__IgnoredHashKeyValue__Group__2 : rule__IgnoredHashKeyValue__Group__2__Impl rule__IgnoredHashKeyValue__Group__3 ;
    public final void rule__IgnoredHashKeyValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailsSchema.g:957:1: ( rule__IgnoredHashKeyValue__Group__2__Impl rule__IgnoredHashKeyValue__Group__3 )
            // InternalRailsSchema.g:958:2: rule__IgnoredHashKeyValue__Group__2__Impl rule__IgnoredHashKeyValue__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__IgnoredHashKeyValue__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IgnoredHashKeyValue__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IgnoredHashKeyValue__Group__2"


    // $ANTLR start "rule__IgnoredHashKeyValue__Group__2__Impl"
    // InternalRailsSchema.g:965:1: rule__IgnoredHashKeyValue__Group__2__Impl : ( ( RULE_SPACE )* ) ;
    public final void rule__IgnoredHashKeyValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailsSchema.g:969:1: ( ( ( RULE_SPACE )* ) )
            // InternalRailsSchema.g:970:1: ( ( RULE_SPACE )* )
            {
            // InternalRailsSchema.g:970:1: ( ( RULE_SPACE )* )
            // InternalRailsSchema.g:971:2: ( RULE_SPACE )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIgnoredHashKeyValueAccess().getSPACETerminalRuleCall_2()); 
            }
            // InternalRailsSchema.g:972:2: ( RULE_SPACE )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_SPACE) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalRailsSchema.g:972:3: RULE_SPACE
            	    {
            	    match(input,RULE_SPACE,FOLLOW_16); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIgnoredHashKeyValueAccess().getSPACETerminalRuleCall_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IgnoredHashKeyValue__Group__2__Impl"


    // $ANTLR start "rule__IgnoredHashKeyValue__Group__3"
    // InternalRailsSchema.g:980:1: rule__IgnoredHashKeyValue__Group__3 : rule__IgnoredHashKeyValue__Group__3__Impl rule__IgnoredHashKeyValue__Group__4 ;
    public final void rule__IgnoredHashKeyValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailsSchema.g:984:1: ( rule__IgnoredHashKeyValue__Group__3__Impl rule__IgnoredHashKeyValue__Group__4 )
            // InternalRailsSchema.g:985:2: rule__IgnoredHashKeyValue__Group__3__Impl rule__IgnoredHashKeyValue__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__IgnoredHashKeyValue__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IgnoredHashKeyValue__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IgnoredHashKeyValue__Group__3"


    // $ANTLR start "rule__IgnoredHashKeyValue__Group__3__Impl"
    // InternalRailsSchema.g:992:1: rule__IgnoredHashKeyValue__Group__3__Impl : ( ( rule__IgnoredHashKeyValue__Alternatives_3 ) ) ;
    public final void rule__IgnoredHashKeyValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailsSchema.g:996:1: ( ( ( rule__IgnoredHashKeyValue__Alternatives_3 ) ) )
            // InternalRailsSchema.g:997:1: ( ( rule__IgnoredHashKeyValue__Alternatives_3 ) )
            {
            // InternalRailsSchema.g:997:1: ( ( rule__IgnoredHashKeyValue__Alternatives_3 ) )
            // InternalRailsSchema.g:998:2: ( rule__IgnoredHashKeyValue__Alternatives_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIgnoredHashKeyValueAccess().getAlternatives_3()); 
            }
            // InternalRailsSchema.g:999:2: ( rule__IgnoredHashKeyValue__Alternatives_3 )
            // InternalRailsSchema.g:999:3: rule__IgnoredHashKeyValue__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__IgnoredHashKeyValue__Alternatives_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIgnoredHashKeyValueAccess().getAlternatives_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IgnoredHashKeyValue__Group__3__Impl"


    // $ANTLR start "rule__IgnoredHashKeyValue__Group__4"
    // InternalRailsSchema.g:1007:1: rule__IgnoredHashKeyValue__Group__4 : rule__IgnoredHashKeyValue__Group__4__Impl ;
    public final void rule__IgnoredHashKeyValue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailsSchema.g:1011:1: ( rule__IgnoredHashKeyValue__Group__4__Impl )
            // InternalRailsSchema.g:1012:2: rule__IgnoredHashKeyValue__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IgnoredHashKeyValue__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IgnoredHashKeyValue__Group__4"


    // $ANTLR start "rule__IgnoredHashKeyValue__Group__4__Impl"
    // InternalRailsSchema.g:1018:1: rule__IgnoredHashKeyValue__Group__4__Impl : ( ( RULE_SPACE )* ) ;
    public final void rule__IgnoredHashKeyValue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailsSchema.g:1022:1: ( ( ( RULE_SPACE )* ) )
            // InternalRailsSchema.g:1023:1: ( ( RULE_SPACE )* )
            {
            // InternalRailsSchema.g:1023:1: ( ( RULE_SPACE )* )
            // InternalRailsSchema.g:1024:2: ( RULE_SPACE )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIgnoredHashKeyValueAccess().getSPACETerminalRuleCall_4()); 
            }
            // InternalRailsSchema.g:1025:2: ( RULE_SPACE )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_SPACE) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalRailsSchema.g:1025:3: RULE_SPACE
            	    {
            	    match(input,RULE_SPACE,FOLLOW_16); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIgnoredHashKeyValueAccess().getSPACETerminalRuleCall_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IgnoredHashKeyValue__Group__4__Impl"


    // $ANTLR start "rule__IgnoredHashKeyValue__Group_1_0__0"
    // InternalRailsSchema.g:1034:1: rule__IgnoredHashKeyValue__Group_1_0__0 : rule__IgnoredHashKeyValue__Group_1_0__0__Impl rule__IgnoredHashKeyValue__Group_1_0__1 ;
    public final void rule__IgnoredHashKeyValue__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailsSchema.g:1038:1: ( rule__IgnoredHashKeyValue__Group_1_0__0__Impl rule__IgnoredHashKeyValue__Group_1_0__1 )
            // InternalRailsSchema.g:1039:2: rule__IgnoredHashKeyValue__Group_1_0__0__Impl rule__IgnoredHashKeyValue__Group_1_0__1
            {
            pushFollow(FOLLOW_19);
            rule__IgnoredHashKeyValue__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IgnoredHashKeyValue__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IgnoredHashKeyValue__Group_1_0__0"


    // $ANTLR start "rule__IgnoredHashKeyValue__Group_1_0__0__Impl"
    // InternalRailsSchema.g:1046:1: rule__IgnoredHashKeyValue__Group_1_0__0__Impl : ( RULE_ID ) ;
    public final void rule__IgnoredHashKeyValue__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailsSchema.g:1050:1: ( ( RULE_ID ) )
            // InternalRailsSchema.g:1051:1: ( RULE_ID )
            {
            // InternalRailsSchema.g:1051:1: ( RULE_ID )
            // InternalRailsSchema.g:1052:2: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIgnoredHashKeyValueAccess().getIDTerminalRuleCall_1_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIgnoredHashKeyValueAccess().getIDTerminalRuleCall_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IgnoredHashKeyValue__Group_1_0__0__Impl"


    // $ANTLR start "rule__IgnoredHashKeyValue__Group_1_0__1"
    // InternalRailsSchema.g:1061:1: rule__IgnoredHashKeyValue__Group_1_0__1 : rule__IgnoredHashKeyValue__Group_1_0__1__Impl ;
    public final void rule__IgnoredHashKeyValue__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailsSchema.g:1065:1: ( rule__IgnoredHashKeyValue__Group_1_0__1__Impl )
            // InternalRailsSchema.g:1066:2: rule__IgnoredHashKeyValue__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IgnoredHashKeyValue__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IgnoredHashKeyValue__Group_1_0__1"


    // $ANTLR start "rule__IgnoredHashKeyValue__Group_1_0__1__Impl"
    // InternalRailsSchema.g:1072:1: rule__IgnoredHashKeyValue__Group_1_0__1__Impl : ( ':' ) ;
    public final void rule__IgnoredHashKeyValue__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailsSchema.g:1076:1: ( ( ':' ) )
            // InternalRailsSchema.g:1077:1: ( ':' )
            {
            // InternalRailsSchema.g:1077:1: ( ':' )
            // InternalRailsSchema.g:1078:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIgnoredHashKeyValueAccess().getColonKeyword_1_0_1()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIgnoredHashKeyValueAccess().getColonKeyword_1_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IgnoredHashKeyValue__Group_1_0__1__Impl"


    // $ANTLR start "rule__IgnoredHashKeyValue__Group_1_1__0"
    // InternalRailsSchema.g:1088:1: rule__IgnoredHashKeyValue__Group_1_1__0 : rule__IgnoredHashKeyValue__Group_1_1__0__Impl rule__IgnoredHashKeyValue__Group_1_1__1 ;
    public final void rule__IgnoredHashKeyValue__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailsSchema.g:1092:1: ( rule__IgnoredHashKeyValue__Group_1_1__0__Impl rule__IgnoredHashKeyValue__Group_1_1__1 )
            // InternalRailsSchema.g:1093:2: rule__IgnoredHashKeyValue__Group_1_1__0__Impl rule__IgnoredHashKeyValue__Group_1_1__1
            {
            pushFollow(FOLLOW_20);
            rule__IgnoredHashKeyValue__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IgnoredHashKeyValue__Group_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IgnoredHashKeyValue__Group_1_1__0"


    // $ANTLR start "rule__IgnoredHashKeyValue__Group_1_1__0__Impl"
    // InternalRailsSchema.g:1100:1: rule__IgnoredHashKeyValue__Group_1_1__0__Impl : ( ( rule__IgnoredHashKeyValue__Alternatives_1_1_0 ) ) ;
    public final void rule__IgnoredHashKeyValue__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailsSchema.g:1104:1: ( ( ( rule__IgnoredHashKeyValue__Alternatives_1_1_0 ) ) )
            // InternalRailsSchema.g:1105:1: ( ( rule__IgnoredHashKeyValue__Alternatives_1_1_0 ) )
            {
            // InternalRailsSchema.g:1105:1: ( ( rule__IgnoredHashKeyValue__Alternatives_1_1_0 ) )
            // InternalRailsSchema.g:1106:2: ( rule__IgnoredHashKeyValue__Alternatives_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIgnoredHashKeyValueAccess().getAlternatives_1_1_0()); 
            }
            // InternalRailsSchema.g:1107:2: ( rule__IgnoredHashKeyValue__Alternatives_1_1_0 )
            // InternalRailsSchema.g:1107:3: rule__IgnoredHashKeyValue__Alternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__IgnoredHashKeyValue__Alternatives_1_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIgnoredHashKeyValueAccess().getAlternatives_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IgnoredHashKeyValue__Group_1_1__0__Impl"


    // $ANTLR start "rule__IgnoredHashKeyValue__Group_1_1__1"
    // InternalRailsSchema.g:1115:1: rule__IgnoredHashKeyValue__Group_1_1__1 : rule__IgnoredHashKeyValue__Group_1_1__1__Impl rule__IgnoredHashKeyValue__Group_1_1__2 ;
    public final void rule__IgnoredHashKeyValue__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailsSchema.g:1119:1: ( rule__IgnoredHashKeyValue__Group_1_1__1__Impl rule__IgnoredHashKeyValue__Group_1_1__2 )
            // InternalRailsSchema.g:1120:2: rule__IgnoredHashKeyValue__Group_1_1__1__Impl rule__IgnoredHashKeyValue__Group_1_1__2
            {
            pushFollow(FOLLOW_20);
            rule__IgnoredHashKeyValue__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IgnoredHashKeyValue__Group_1_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IgnoredHashKeyValue__Group_1_1__1"


    // $ANTLR start "rule__IgnoredHashKeyValue__Group_1_1__1__Impl"
    // InternalRailsSchema.g:1127:1: rule__IgnoredHashKeyValue__Group_1_1__1__Impl : ( ( RULE_SPACE )* ) ;
    public final void rule__IgnoredHashKeyValue__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailsSchema.g:1131:1: ( ( ( RULE_SPACE )* ) )
            // InternalRailsSchema.g:1132:1: ( ( RULE_SPACE )* )
            {
            // InternalRailsSchema.g:1132:1: ( ( RULE_SPACE )* )
            // InternalRailsSchema.g:1133:2: ( RULE_SPACE )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIgnoredHashKeyValueAccess().getSPACETerminalRuleCall_1_1_1()); 
            }
            // InternalRailsSchema.g:1134:2: ( RULE_SPACE )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_SPACE) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalRailsSchema.g:1134:3: RULE_SPACE
            	    {
            	    match(input,RULE_SPACE,FOLLOW_16); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIgnoredHashKeyValueAccess().getSPACETerminalRuleCall_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IgnoredHashKeyValue__Group_1_1__1__Impl"


    // $ANTLR start "rule__IgnoredHashKeyValue__Group_1_1__2"
    // InternalRailsSchema.g:1142:1: rule__IgnoredHashKeyValue__Group_1_1__2 : rule__IgnoredHashKeyValue__Group_1_1__2__Impl ;
    public final void rule__IgnoredHashKeyValue__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailsSchema.g:1146:1: ( rule__IgnoredHashKeyValue__Group_1_1__2__Impl )
            // InternalRailsSchema.g:1147:2: rule__IgnoredHashKeyValue__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IgnoredHashKeyValue__Group_1_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IgnoredHashKeyValue__Group_1_1__2"


    // $ANTLR start "rule__IgnoredHashKeyValue__Group_1_1__2__Impl"
    // InternalRailsSchema.g:1153:1: rule__IgnoredHashKeyValue__Group_1_1__2__Impl : ( '=>' ) ;
    public final void rule__IgnoredHashKeyValue__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailsSchema.g:1157:1: ( ( '=>' ) )
            // InternalRailsSchema.g:1158:1: ( '=>' )
            {
            // InternalRailsSchema.g:1158:1: ( '=>' )
            // InternalRailsSchema.g:1159:2: '=>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIgnoredHashKeyValueAccess().getEqualsSignGreaterThanSignKeyword_1_1_2()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIgnoredHashKeyValueAccess().getEqualsSignGreaterThanSignKeyword_1_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IgnoredHashKeyValue__Group_1_1__2__Impl"


    // $ANTLR start "rule__Index__Group__0"
    // InternalRailsSchema.g:1169:1: rule__Index__Group__0 : rule__Index__Group__0__Impl rule__Index__Group__1 ;
    public final void rule__Index__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailsSchema.g:1173:1: ( rule__Index__Group__0__Impl rule__Index__Group__1 )
            // InternalRailsSchema.g:1174:2: rule__Index__Group__0__Impl rule__Index__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Index__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Index__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Index__Group__0"


    // $ANTLR start "rule__Index__Group__0__Impl"
    // InternalRailsSchema.g:1181:1: rule__Index__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__Index__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailsSchema.g:1185:1: ( ( RULE_ID ) )
            // InternalRailsSchema.g:1186:1: ( RULE_ID )
            {
            // InternalRailsSchema.g:1186:1: ( RULE_ID )
            // InternalRailsSchema.g:1187:2: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIndexAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIndexAccess().getIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Index__Group__0__Impl"


    // $ANTLR start "rule__Index__Group__1"
    // InternalRailsSchema.g:1196:1: rule__Index__Group__1 : rule__Index__Group__1__Impl rule__Index__Group__2 ;
    public final void rule__Index__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailsSchema.g:1200:1: ( rule__Index__Group__1__Impl rule__Index__Group__2 )
            // InternalRailsSchema.g:1201:2: rule__Index__Group__1__Impl rule__Index__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Index__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Index__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Index__Group__1"


    // $ANTLR start "rule__Index__Group__1__Impl"
    // InternalRailsSchema.g:1208:1: rule__Index__Group__1__Impl : ( RULE_STRING ) ;
    public final void rule__Index__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailsSchema.g:1212:1: ( ( RULE_STRING ) )
            // InternalRailsSchema.g:1213:1: ( RULE_STRING )
            {
            // InternalRailsSchema.g:1213:1: ( RULE_STRING )
            // InternalRailsSchema.g:1214:2: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIndexAccess().getSTRINGTerminalRuleCall_1()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIndexAccess().getSTRINGTerminalRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Index__Group__1__Impl"


    // $ANTLR start "rule__Index__Group__2"
    // InternalRailsSchema.g:1223:1: rule__Index__Group__2 : rule__Index__Group__2__Impl ;
    public final void rule__Index__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailsSchema.g:1227:1: ( rule__Index__Group__2__Impl )
            // InternalRailsSchema.g:1228:2: rule__Index__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Index__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Index__Group__2"


    // $ANTLR start "rule__Index__Group__2__Impl"
    // InternalRailsSchema.g:1234:1: rule__Index__Group__2__Impl : ( ( rule__Index__Group_2__0 )* ) ;
    public final void rule__Index__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailsSchema.g:1238:1: ( ( ( rule__Index__Group_2__0 )* ) )
            // InternalRailsSchema.g:1239:1: ( ( rule__Index__Group_2__0 )* )
            {
            // InternalRailsSchema.g:1239:1: ( ( rule__Index__Group_2__0 )* )
            // InternalRailsSchema.g:1240:2: ( rule__Index__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIndexAccess().getGroup_2()); 
            }
            // InternalRailsSchema.g:1241:2: ( rule__Index__Group_2__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_COMMA) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalRailsSchema.g:1241:3: rule__Index__Group_2__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Index__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIndexAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Index__Group__2__Impl"


    // $ANTLR start "rule__Index__Group_2__0"
    // InternalRailsSchema.g:1250:1: rule__Index__Group_2__0 : rule__Index__Group_2__0__Impl rule__Index__Group_2__1 ;
    public final void rule__Index__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailsSchema.g:1254:1: ( rule__Index__Group_2__0__Impl rule__Index__Group_2__1 )
            // InternalRailsSchema.g:1255:2: rule__Index__Group_2__0__Impl rule__Index__Group_2__1
            {
            pushFollow(FOLLOW_21);
            rule__Index__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Index__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Index__Group_2__0"


    // $ANTLR start "rule__Index__Group_2__0__Impl"
    // InternalRailsSchema.g:1262:1: rule__Index__Group_2__0__Impl : ( RULE_COMMA ) ;
    public final void rule__Index__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailsSchema.g:1266:1: ( ( RULE_COMMA ) )
            // InternalRailsSchema.g:1267:1: ( RULE_COMMA )
            {
            // InternalRailsSchema.g:1267:1: ( RULE_COMMA )
            // InternalRailsSchema.g:1268:2: RULE_COMMA
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIndexAccess().getCOMMATerminalRuleCall_2_0()); 
            }
            match(input,RULE_COMMA,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIndexAccess().getCOMMATerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Index__Group_2__0__Impl"


    // $ANTLR start "rule__Index__Group_2__1"
    // InternalRailsSchema.g:1277:1: rule__Index__Group_2__1 : rule__Index__Group_2__1__Impl ;
    public final void rule__Index__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailsSchema.g:1281:1: ( rule__Index__Group_2__1__Impl )
            // InternalRailsSchema.g:1282:2: rule__Index__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Index__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Index__Group_2__1"


    // $ANTLR start "rule__Index__Group_2__1__Impl"
    // InternalRailsSchema.g:1288:1: rule__Index__Group_2__1__Impl : ( ( rule__Index__Alternatives_2_1 ) ) ;
    public final void rule__Index__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailsSchema.g:1292:1: ( ( ( rule__Index__Alternatives_2_1 ) ) )
            // InternalRailsSchema.g:1293:1: ( ( rule__Index__Alternatives_2_1 ) )
            {
            // InternalRailsSchema.g:1293:1: ( ( rule__Index__Alternatives_2_1 ) )
            // InternalRailsSchema.g:1294:2: ( rule__Index__Alternatives_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIndexAccess().getAlternatives_2_1()); 
            }
            // InternalRailsSchema.g:1295:2: ( rule__Index__Alternatives_2_1 )
            // InternalRailsSchema.g:1295:3: rule__Index__Alternatives_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Index__Alternatives_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIndexAccess().getAlternatives_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Index__Group_2__1__Impl"


    // $ANTLR start "rule__Schema__Schema_membersAssignment_3"
    // InternalRailsSchema.g:1304:1: rule__Schema__Schema_membersAssignment_3 : ( ruleSchemaMember ) ;
    public final void rule__Schema__Schema_membersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailsSchema.g:1308:1: ( ( ruleSchemaMember ) )
            // InternalRailsSchema.g:1309:2: ( ruleSchemaMember )
            {
            // InternalRailsSchema.g:1309:2: ( ruleSchemaMember )
            // InternalRailsSchema.g:1310:3: ruleSchemaMember
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSchemaAccess().getSchema_membersSchemaMemberParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSchemaMember();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSchemaAccess().getSchema_membersSchemaMemberParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Schema_membersAssignment_3"


    // $ANTLR start "rule__Table__NameAssignment_1"
    // InternalRailsSchema.g:1319:1: rule__Table__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Table__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailsSchema.g:1323:1: ( ( RULE_STRING ) )
            // InternalRailsSchema.g:1324:2: ( RULE_STRING )
            {
            // InternalRailsSchema.g:1324:2: ( RULE_STRING )
            // InternalRailsSchema.g:1325:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__NameAssignment_1"


    // $ANTLR start "rule__Table__AttributesAssignment_5"
    // InternalRailsSchema.g:1334:1: rule__Table__AttributesAssignment_5 : ( ruleTableAttributes ) ;
    public final void rule__Table__AttributesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailsSchema.g:1338:1: ( ( ruleTableAttributes ) )
            // InternalRailsSchema.g:1339:2: ( ruleTableAttributes )
            {
            // InternalRailsSchema.g:1339:2: ( ruleTableAttributes )
            // InternalRailsSchema.g:1340:3: ruleTableAttributes
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getAttributesTableAttributesParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTableAttributes();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableAccess().getAttributesTableAttributesParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__AttributesAssignment_5"


    // $ANTLR start "rule__TableAttributes__DatatypeAssignment_1"
    // InternalRailsSchema.g:1349:1: rule__TableAttributes__DatatypeAssignment_1 : ( RULE_ID ) ;
    public final void rule__TableAttributes__DatatypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailsSchema.g:1353:1: ( ( RULE_ID ) )
            // InternalRailsSchema.g:1354:2: ( RULE_ID )
            {
            // InternalRailsSchema.g:1354:2: ( RULE_ID )
            // InternalRailsSchema.g:1355:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAttributesAccess().getDatatypeIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableAttributesAccess().getDatatypeIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableAttributes__DatatypeAssignment_1"


    // $ANTLR start "rule__TableAttributes__NameAssignment_2"
    // InternalRailsSchema.g:1364:1: rule__TableAttributes__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__TableAttributes__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailsSchema.g:1368:1: ( ( RULE_STRING ) )
            // InternalRailsSchema.g:1369:2: ( RULE_STRING )
            {
            // InternalRailsSchema.g:1369:2: ( RULE_STRING )
            // InternalRailsSchema.g:1370:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAttributesAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableAttributesAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableAttributes__NameAssignment_2"

    // $ANTLR start synpred14_InternalRailsSchema
    public final void synpred14_InternalRailsSchema_fragment() throws RecognitionException {   
        // InternalRailsSchema.g:864:3: ( RULE_SPACE )
        // InternalRailsSchema.g:864:3: RULE_SPACE
        {
        match(input,RULE_SPACE,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred14_InternalRailsSchema

    // Delegated rules

    public final boolean synpred14_InternalRailsSchema() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalRailsSchema_fragment(); // can never throw exception
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000401100L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000400102L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004800L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000801000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000008130L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000000000083F0L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002008000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000008170L});

}