package co.gruposaberes.model.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import co.gruposaberes.model.services.RailsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalRailsParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SYMBOL", "RULE_STRING", "RULE_BRACKET_BLOCK", "RULE_ARRAY_BLOCK", "RULE_CLASS_WORD", "RULE_SPACE", "RULE_END_WORD", "RULE_ID", "RULE_PARENTHESIS_BLOCK", "RULE_HAS_MANY_WORD", "RULE_SL_COMMENT", "RULE_HAS_AND_BELONGS_TO_MANY_WORD", "RULE_BELONGS_TO_WORD", "RULE_DEF_WORD", "RULE_UNTIL_END", "RULE_MODULE_WORD", "RULE_ML_COMMENT", "RULE_WS", "RULE_INT", "RULE_ANY_OTHER", "'?'", "'='", "'<'", "'::'", "'.'", "','", "':'", "'=>'"
    };
    public static final int RULE_HAS_MANY_WORD=13;
    public static final int RULE_CLASS_WORD=8;
    public static final int RULE_PARENTHESIS_BLOCK=12;
    public static final int RULE_STRING=5;
    public static final int RULE_UNTIL_END=18;
    public static final int RULE_SL_COMMENT=14;
    public static final int RULE_HAS_AND_BELONGS_TO_MANY_WORD=15;
    public static final int RULE_SPACE=9;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_ARRAY_BLOCK=7;
    public static final int RULE_ID=11;
    public static final int RULE_WS=21;
    public static final int RULE_ANY_OTHER=23;
    public static final int RULE_MODULE_WORD=19;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=22;
    public static final int T__29=29;
    public static final int RULE_BRACKET_BLOCK=6;
    public static final int RULE_ML_COMMENT=20;
    public static final int RULE_SYMBOL=4;
    public static final int RULE_DEF_WORD=17;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_END_WORD=10;
    public static final int RULE_BELONGS_TO_WORD=16;

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
     	
        public void setGrammarAccess(RailsGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleClass"
    // InternalRails.g:61:1: entryRuleClass : ruleClass EOF ;
    public final void entryRuleClass() throws RecognitionException {
        try {
            // InternalRails.g:62:1: ( ruleClass EOF )
            // InternalRails.g:63:1: ruleClass EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleClass();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassRule()); 
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
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // InternalRails.g:70:1: ruleClass : ( ( rule__Class__Group__0 ) ) ;
    public final void ruleClass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:74:2: ( ( ( rule__Class__Group__0 ) ) )
            // InternalRails.g:75:1: ( ( rule__Class__Group__0 ) )
            {
            // InternalRails.g:75:1: ( ( rule__Class__Group__0 ) )
            // InternalRails.g:76:1: ( rule__Class__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getGroup()); 
            }
            // InternalRails.g:77:1: ( rule__Class__Group__0 )
            // InternalRails.g:77:2: rule__Class__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getGroup()); 
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
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleNamespacedModuleName"
    // InternalRails.g:89:1: entryRuleNamespacedModuleName : ruleNamespacedModuleName EOF ;
    public final void entryRuleNamespacedModuleName() throws RecognitionException {
        try {
            // InternalRails.g:90:1: ( ruleNamespacedModuleName EOF )
            // InternalRails.g:91:1: ruleNamespacedModuleName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamespacedModuleNameRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleNamespacedModuleName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNamespacedModuleNameRule()); 
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
    // $ANTLR end "entryRuleNamespacedModuleName"


    // $ANTLR start "ruleNamespacedModuleName"
    // InternalRails.g:98:1: ruleNamespacedModuleName : ( ( rule__NamespacedModuleName__Group__0 ) ) ;
    public final void ruleNamespacedModuleName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:102:2: ( ( ( rule__NamespacedModuleName__Group__0 ) ) )
            // InternalRails.g:103:1: ( ( rule__NamespacedModuleName__Group__0 ) )
            {
            // InternalRails.g:103:1: ( ( rule__NamespacedModuleName__Group__0 ) )
            // InternalRails.g:104:1: ( rule__NamespacedModuleName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamespacedModuleNameAccess().getGroup()); 
            }
            // InternalRails.g:105:1: ( rule__NamespacedModuleName__Group__0 )
            // InternalRails.g:105:2: rule__NamespacedModuleName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NamespacedModuleName__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNamespacedModuleNameAccess().getGroup()); 
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
    // $ANTLR end "ruleNamespacedModuleName"


    // $ANTLR start "entryRuleMethodChainCall"
    // InternalRails.g:117:1: entryRuleMethodChainCall : ruleMethodChainCall EOF ;
    public final void entryRuleMethodChainCall() throws RecognitionException {
        try {
            // InternalRails.g:118:1: ( ruleMethodChainCall EOF )
            // InternalRails.g:119:1: ruleMethodChainCall EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodChainCallRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMethodChainCall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodChainCallRule()); 
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
    // $ANTLR end "entryRuleMethodChainCall"


    // $ANTLR start "ruleMethodChainCall"
    // InternalRails.g:126:1: ruleMethodChainCall : ( ( rule__MethodChainCall__Group__0 ) ) ;
    public final void ruleMethodChainCall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:130:2: ( ( ( rule__MethodChainCall__Group__0 ) ) )
            // InternalRails.g:131:1: ( ( rule__MethodChainCall__Group__0 ) )
            {
            // InternalRails.g:131:1: ( ( rule__MethodChainCall__Group__0 ) )
            // InternalRails.g:132:1: ( rule__MethodChainCall__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodChainCallAccess().getGroup()); 
            }
            // InternalRails.g:133:1: ( rule__MethodChainCall__Group__0 )
            // InternalRails.g:133:2: rule__MethodChainCall__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MethodChainCall__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodChainCallAccess().getGroup()); 
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
    // $ANTLR end "ruleMethodChainCall"


    // $ANTLR start "entryRuleClassElement"
    // InternalRails.g:145:1: entryRuleClassElement : ruleClassElement EOF ;
    public final void entryRuleClassElement() throws RecognitionException {
        try {
            // InternalRails.g:146:1: ( ruleClassElement EOF )
            // InternalRails.g:147:1: ruleClassElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassElementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleClassElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassElementRule()); 
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
    // $ANTLR end "entryRuleClassElement"


    // $ANTLR start "ruleClassElement"
    // InternalRails.g:154:1: ruleClassElement : ( ( rule__ClassElement__Alternatives ) ) ;
    public final void ruleClassElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:158:2: ( ( ( rule__ClassElement__Alternatives ) ) )
            // InternalRails.g:159:1: ( ( rule__ClassElement__Alternatives ) )
            {
            // InternalRails.g:159:1: ( ( rule__ClassElement__Alternatives ) )
            // InternalRails.g:160:1: ( rule__ClassElement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassElementAccess().getAlternatives()); 
            }
            // InternalRails.g:161:1: ( rule__ClassElement__Alternatives )
            // InternalRails.g:161:2: rule__ClassElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ClassElement__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassElementAccess().getAlternatives()); 
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
    // $ANTLR end "ruleClassElement"


    // $ANTLR start "entryRuleRelationship"
    // InternalRails.g:173:1: entryRuleRelationship : ruleRelationship EOF ;
    public final void entryRuleRelationship() throws RecognitionException {
        try {
            // InternalRails.g:174:1: ( ruleRelationship EOF )
            // InternalRails.g:175:1: ruleRelationship EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRelationship();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipRule()); 
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
    // $ANTLR end "entryRuleRelationship"


    // $ANTLR start "ruleRelationship"
    // InternalRails.g:182:1: ruleRelationship : ( ( rule__Relationship__Alternatives ) ) ;
    public final void ruleRelationship() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:186:2: ( ( ( rule__Relationship__Alternatives ) ) )
            // InternalRails.g:187:1: ( ( rule__Relationship__Alternatives ) )
            {
            // InternalRails.g:187:1: ( ( rule__Relationship__Alternatives ) )
            // InternalRails.g:188:1: ( rule__Relationship__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getAlternatives()); 
            }
            // InternalRails.g:189:1: ( rule__Relationship__Alternatives )
            // InternalRails.g:189:2: rule__Relationship__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Relationship__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getAlternatives()); 
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
    // $ANTLR end "ruleRelationship"


    // $ANTLR start "entryRuleHasMany"
    // InternalRails.g:201:1: entryRuleHasMany : ruleHasMany EOF ;
    public final void entryRuleHasMany() throws RecognitionException {
        try {
            // InternalRails.g:202:1: ( ruleHasMany EOF )
            // InternalRails.g:203:1: ruleHasMany EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHasManyRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleHasMany();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHasManyRule()); 
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
    // $ANTLR end "entryRuleHasMany"


    // $ANTLR start "ruleHasMany"
    // InternalRails.g:210:1: ruleHasMany : ( ( rule__HasMany__Group__0 ) ) ;
    public final void ruleHasMany() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:214:2: ( ( ( rule__HasMany__Group__0 ) ) )
            // InternalRails.g:215:1: ( ( rule__HasMany__Group__0 ) )
            {
            // InternalRails.g:215:1: ( ( rule__HasMany__Group__0 ) )
            // InternalRails.g:216:1: ( rule__HasMany__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHasManyAccess().getGroup()); 
            }
            // InternalRails.g:217:1: ( rule__HasMany__Group__0 )
            // InternalRails.g:217:2: rule__HasMany__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__HasMany__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHasManyAccess().getGroup()); 
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
    // $ANTLR end "ruleHasMany"


    // $ANTLR start "entryRuleHasAndBelongsToMany"
    // InternalRails.g:229:1: entryRuleHasAndBelongsToMany : ruleHasAndBelongsToMany EOF ;
    public final void entryRuleHasAndBelongsToMany() throws RecognitionException {
        try {
            // InternalRails.g:230:1: ( ruleHasAndBelongsToMany EOF )
            // InternalRails.g:231:1: ruleHasAndBelongsToMany EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHasAndBelongsToManyRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleHasAndBelongsToMany();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHasAndBelongsToManyRule()); 
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
    // $ANTLR end "entryRuleHasAndBelongsToMany"


    // $ANTLR start "ruleHasAndBelongsToMany"
    // InternalRails.g:238:1: ruleHasAndBelongsToMany : ( ( rule__HasAndBelongsToMany__Group__0 ) ) ;
    public final void ruleHasAndBelongsToMany() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:242:2: ( ( ( rule__HasAndBelongsToMany__Group__0 ) ) )
            // InternalRails.g:243:1: ( ( rule__HasAndBelongsToMany__Group__0 ) )
            {
            // InternalRails.g:243:1: ( ( rule__HasAndBelongsToMany__Group__0 ) )
            // InternalRails.g:244:1: ( rule__HasAndBelongsToMany__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHasAndBelongsToManyAccess().getGroup()); 
            }
            // InternalRails.g:245:1: ( rule__HasAndBelongsToMany__Group__0 )
            // InternalRails.g:245:2: rule__HasAndBelongsToMany__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__HasAndBelongsToMany__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHasAndBelongsToManyAccess().getGroup()); 
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
    // $ANTLR end "ruleHasAndBelongsToMany"


    // $ANTLR start "entryRuleBelongsTo"
    // InternalRails.g:257:1: entryRuleBelongsTo : ruleBelongsTo EOF ;
    public final void entryRuleBelongsTo() throws RecognitionException {
        try {
            // InternalRails.g:258:1: ( ruleBelongsTo EOF )
            // InternalRails.g:259:1: ruleBelongsTo EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBelongsToRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBelongsTo();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBelongsToRule()); 
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
    // $ANTLR end "entryRuleBelongsTo"


    // $ANTLR start "ruleBelongsTo"
    // InternalRails.g:266:1: ruleBelongsTo : ( ( rule__BelongsTo__Group__0 ) ) ;
    public final void ruleBelongsTo() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:270:2: ( ( ( rule__BelongsTo__Group__0 ) ) )
            // InternalRails.g:271:1: ( ( rule__BelongsTo__Group__0 ) )
            {
            // InternalRails.g:271:1: ( ( rule__BelongsTo__Group__0 ) )
            // InternalRails.g:272:1: ( rule__BelongsTo__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBelongsToAccess().getGroup()); 
            }
            // InternalRails.g:273:1: ( rule__BelongsTo__Group__0 )
            // InternalRails.g:273:2: rule__BelongsTo__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BelongsTo__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBelongsToAccess().getGroup()); 
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
    // $ANTLR end "ruleBelongsTo"


    // $ANTLR start "entryRuleHashKeyValue"
    // InternalRails.g:285:1: entryRuleHashKeyValue : ruleHashKeyValue EOF ;
    public final void entryRuleHashKeyValue() throws RecognitionException {
        try {
            // InternalRails.g:286:1: ( ruleHashKeyValue EOF )
            // InternalRails.g:287:1: ruleHashKeyValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHashKeyValueRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleHashKeyValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHashKeyValueRule()); 
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
    // $ANTLR end "entryRuleHashKeyValue"


    // $ANTLR start "ruleHashKeyValue"
    // InternalRails.g:294:1: ruleHashKeyValue : ( ( rule__HashKeyValue__Group__0 ) ) ;
    public final void ruleHashKeyValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:298:2: ( ( ( rule__HashKeyValue__Group__0 ) ) )
            // InternalRails.g:299:1: ( ( rule__HashKeyValue__Group__0 ) )
            {
            // InternalRails.g:299:1: ( ( rule__HashKeyValue__Group__0 ) )
            // InternalRails.g:300:1: ( rule__HashKeyValue__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHashKeyValueAccess().getGroup()); 
            }
            // InternalRails.g:301:1: ( rule__HashKeyValue__Group__0 )
            // InternalRails.g:301:2: rule__HashKeyValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__HashKeyValue__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHashKeyValueAccess().getGroup()); 
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
    // $ANTLR end "ruleHashKeyValue"


    // $ANTLR start "entryRuleMethod"
    // InternalRails.g:313:1: entryRuleMethod : ruleMethod EOF ;
    public final void entryRuleMethod() throws RecognitionException {
        try {
            // InternalRails.g:314:1: ( ruleMethod EOF )
            // InternalRails.g:315:1: ruleMethod EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMethod();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodRule()); 
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
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // InternalRails.g:322:1: ruleMethod : ( ( rule__Method__Group__0 ) ) ;
    public final void ruleMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:326:2: ( ( ( rule__Method__Group__0 ) ) )
            // InternalRails.g:327:1: ( ( rule__Method__Group__0 ) )
            {
            // InternalRails.g:327:1: ( ( rule__Method__Group__0 ) )
            // InternalRails.g:328:1: ( rule__Method__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getGroup()); 
            }
            // InternalRails.g:329:1: ( rule__Method__Group__0 )
            // InternalRails.g:329:2: rule__Method__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getGroup()); 
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
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleMethodName"
    // InternalRails.g:341:1: entryRuleMethodName : ruleMethodName EOF ;
    public final void entryRuleMethodName() throws RecognitionException {
        try {
            // InternalRails.g:342:1: ( ruleMethodName EOF )
            // InternalRails.g:343:1: ruleMethodName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodNameRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMethodName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodNameRule()); 
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
    // $ANTLR end "entryRuleMethodName"


    // $ANTLR start "ruleMethodName"
    // InternalRails.g:350:1: ruleMethodName : ( ( rule__MethodName__Group__0 ) ) ;
    public final void ruleMethodName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:354:2: ( ( ( rule__MethodName__Group__0 ) ) )
            // InternalRails.g:355:1: ( ( rule__MethodName__Group__0 ) )
            {
            // InternalRails.g:355:1: ( ( rule__MethodName__Group__0 ) )
            // InternalRails.g:356:1: ( rule__MethodName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodNameAccess().getGroup()); 
            }
            // InternalRails.g:357:1: ( rule__MethodName__Group__0 )
            // InternalRails.g:357:2: rule__MethodName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MethodName__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodNameAccess().getGroup()); 
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
    // $ANTLR end "ruleMethodName"


    // $ANTLR start "rule__ClassElement__Alternatives"
    // InternalRails.g:369:1: rule__ClassElement__Alternatives : ( ( ruleMethod ) | ( ruleRelationship ) );
    public final void rule__ClassElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:373:1: ( ( ruleMethod ) | ( ruleRelationship ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_DEF_WORD) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_HAS_MANY_WORD||(LA1_0>=RULE_HAS_AND_BELONGS_TO_MANY_WORD && LA1_0<=RULE_BELONGS_TO_WORD)) ) {
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
                    // InternalRails.g:374:1: ( ruleMethod )
                    {
                    // InternalRails.g:374:1: ( ruleMethod )
                    // InternalRails.g:375:1: ruleMethod
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getClassElementAccess().getMethodParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleMethod();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getClassElementAccess().getMethodParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalRails.g:380:6: ( ruleRelationship )
                    {
                    // InternalRails.g:380:6: ( ruleRelationship )
                    // InternalRails.g:381:1: ruleRelationship
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getClassElementAccess().getRelationshipParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleRelationship();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getClassElementAccess().getRelationshipParserRuleCall_1()); 
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
    // $ANTLR end "rule__ClassElement__Alternatives"


    // $ANTLR start "rule__Relationship__Alternatives"
    // InternalRails.g:391:1: rule__Relationship__Alternatives : ( ( ruleHasMany ) | ( ruleHasAndBelongsToMany ) | ( ruleBelongsTo ) );
    public final void rule__Relationship__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:395:1: ( ( ruleHasMany ) | ( ruleHasAndBelongsToMany ) | ( ruleBelongsTo ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case RULE_HAS_MANY_WORD:
                {
                alt2=1;
                }
                break;
            case RULE_HAS_AND_BELONGS_TO_MANY_WORD:
                {
                alt2=2;
                }
                break;
            case RULE_BELONGS_TO_WORD:
                {
                alt2=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalRails.g:396:1: ( ruleHasMany )
                    {
                    // InternalRails.g:396:1: ( ruleHasMany )
                    // InternalRails.g:397:1: ruleHasMany
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationshipAccess().getHasManyParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleHasMany();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationshipAccess().getHasManyParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalRails.g:402:6: ( ruleHasAndBelongsToMany )
                    {
                    // InternalRails.g:402:6: ( ruleHasAndBelongsToMany )
                    // InternalRails.g:403:1: ruleHasAndBelongsToMany
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationshipAccess().getHasAndBelongsToManyParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleHasAndBelongsToMany();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationshipAccess().getHasAndBelongsToManyParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalRails.g:408:6: ( ruleBelongsTo )
                    {
                    // InternalRails.g:408:6: ( ruleBelongsTo )
                    // InternalRails.g:409:1: ruleBelongsTo
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationshipAccess().getBelongsToParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleBelongsTo();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationshipAccess().getBelongsToParserRuleCall_2()); 
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
    // $ANTLR end "rule__Relationship__Alternatives"


    // $ANTLR start "rule__HasMany__NameAlternatives_2_0"
    // InternalRails.g:419:1: rule__HasMany__NameAlternatives_2_0 : ( ( RULE_SYMBOL ) | ( RULE_STRING ) );
    public final void rule__HasMany__NameAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:423:1: ( ( RULE_SYMBOL ) | ( RULE_STRING ) )
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
                    // InternalRails.g:424:1: ( RULE_SYMBOL )
                    {
                    // InternalRails.g:424:1: ( RULE_SYMBOL )
                    // InternalRails.g:425:1: RULE_SYMBOL
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getHasManyAccess().getNameSYMBOLTerminalRuleCall_2_0_0()); 
                    }
                    match(input,RULE_SYMBOL,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getHasManyAccess().getNameSYMBOLTerminalRuleCall_2_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalRails.g:430:6: ( RULE_STRING )
                    {
                    // InternalRails.g:430:6: ( RULE_STRING )
                    // InternalRails.g:431:1: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getHasManyAccess().getNameSTRINGTerminalRuleCall_2_0_1()); 
                    }
                    match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getHasManyAccess().getNameSTRINGTerminalRuleCall_2_0_1()); 
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
    // $ANTLR end "rule__HasMany__NameAlternatives_2_0"


    // $ANTLR start "rule__HasAndBelongsToMany__NameAlternatives_2_0"
    // InternalRails.g:441:1: rule__HasAndBelongsToMany__NameAlternatives_2_0 : ( ( RULE_SYMBOL ) | ( RULE_STRING ) );
    public final void rule__HasAndBelongsToMany__NameAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:445:1: ( ( RULE_SYMBOL ) | ( RULE_STRING ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_SYMBOL) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_STRING) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalRails.g:446:1: ( RULE_SYMBOL )
                    {
                    // InternalRails.g:446:1: ( RULE_SYMBOL )
                    // InternalRails.g:447:1: RULE_SYMBOL
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getHasAndBelongsToManyAccess().getNameSYMBOLTerminalRuleCall_2_0_0()); 
                    }
                    match(input,RULE_SYMBOL,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getHasAndBelongsToManyAccess().getNameSYMBOLTerminalRuleCall_2_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalRails.g:452:6: ( RULE_STRING )
                    {
                    // InternalRails.g:452:6: ( RULE_STRING )
                    // InternalRails.g:453:1: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getHasAndBelongsToManyAccess().getNameSTRINGTerminalRuleCall_2_0_1()); 
                    }
                    match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getHasAndBelongsToManyAccess().getNameSTRINGTerminalRuleCall_2_0_1()); 
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
    // $ANTLR end "rule__HasAndBelongsToMany__NameAlternatives_2_0"


    // $ANTLR start "rule__BelongsTo__NameAlternatives_2_0"
    // InternalRails.g:463:1: rule__BelongsTo__NameAlternatives_2_0 : ( ( RULE_SYMBOL ) | ( RULE_STRING ) );
    public final void rule__BelongsTo__NameAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:467:1: ( ( RULE_SYMBOL ) | ( RULE_STRING ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_SYMBOL) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_STRING) ) {
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
                    // InternalRails.g:468:1: ( RULE_SYMBOL )
                    {
                    // InternalRails.g:468:1: ( RULE_SYMBOL )
                    // InternalRails.g:469:1: RULE_SYMBOL
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBelongsToAccess().getNameSYMBOLTerminalRuleCall_2_0_0()); 
                    }
                    match(input,RULE_SYMBOL,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBelongsToAccess().getNameSYMBOLTerminalRuleCall_2_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalRails.g:474:6: ( RULE_STRING )
                    {
                    // InternalRails.g:474:6: ( RULE_STRING )
                    // InternalRails.g:475:1: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBelongsToAccess().getNameSTRINGTerminalRuleCall_2_0_1()); 
                    }
                    match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBelongsToAccess().getNameSTRINGTerminalRuleCall_2_0_1()); 
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
    // $ANTLR end "rule__BelongsTo__NameAlternatives_2_0"


    // $ANTLR start "rule__HashKeyValue__Alternatives_2"
    // InternalRails.g:485:1: rule__HashKeyValue__Alternatives_2 : ( ( ( rule__HashKeyValue__Group_2_0__0 ) ) | ( ( rule__HashKeyValue__Group_2_1__0 ) ) );
    public final void rule__HashKeyValue__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:489:1: ( ( ( rule__HashKeyValue__Group_2_0__0 ) ) | ( ( rule__HashKeyValue__Group_2_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=RULE_SYMBOL && LA6_0<=RULE_STRING)) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalRails.g:490:1: ( ( rule__HashKeyValue__Group_2_0__0 ) )
                    {
                    // InternalRails.g:490:1: ( ( rule__HashKeyValue__Group_2_0__0 ) )
                    // InternalRails.g:491:1: ( rule__HashKeyValue__Group_2_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getHashKeyValueAccess().getGroup_2_0()); 
                    }
                    // InternalRails.g:492:1: ( rule__HashKeyValue__Group_2_0__0 )
                    // InternalRails.g:492:2: rule__HashKeyValue__Group_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__HashKeyValue__Group_2_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getHashKeyValueAccess().getGroup_2_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalRails.g:496:6: ( ( rule__HashKeyValue__Group_2_1__0 ) )
                    {
                    // InternalRails.g:496:6: ( ( rule__HashKeyValue__Group_2_1__0 ) )
                    // InternalRails.g:497:1: ( rule__HashKeyValue__Group_2_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getHashKeyValueAccess().getGroup_2_1()); 
                    }
                    // InternalRails.g:498:1: ( rule__HashKeyValue__Group_2_1__0 )
                    // InternalRails.g:498:2: rule__HashKeyValue__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__HashKeyValue__Group_2_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getHashKeyValueAccess().getGroup_2_1()); 
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
    // $ANTLR end "rule__HashKeyValue__Alternatives_2"


    // $ANTLR start "rule__HashKeyValue__KeyAlternatives_2_1_0_0"
    // InternalRails.g:507:1: rule__HashKeyValue__KeyAlternatives_2_1_0_0 : ( ( RULE_SYMBOL ) | ( RULE_STRING ) );
    public final void rule__HashKeyValue__KeyAlternatives_2_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:511:1: ( ( RULE_SYMBOL ) | ( RULE_STRING ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_SYMBOL) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_STRING) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalRails.g:512:1: ( RULE_SYMBOL )
                    {
                    // InternalRails.g:512:1: ( RULE_SYMBOL )
                    // InternalRails.g:513:1: RULE_SYMBOL
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getHashKeyValueAccess().getKeySYMBOLTerminalRuleCall_2_1_0_0_0()); 
                    }
                    match(input,RULE_SYMBOL,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getHashKeyValueAccess().getKeySYMBOLTerminalRuleCall_2_1_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalRails.g:518:6: ( RULE_STRING )
                    {
                    // InternalRails.g:518:6: ( RULE_STRING )
                    // InternalRails.g:519:1: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getHashKeyValueAccess().getKeySTRINGTerminalRuleCall_2_1_0_0_1()); 
                    }
                    match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getHashKeyValueAccess().getKeySTRINGTerminalRuleCall_2_1_0_0_1()); 
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
    // $ANTLR end "rule__HashKeyValue__KeyAlternatives_2_1_0_0"


    // $ANTLR start "rule__HashKeyValue__ValueAlternatives_4_0"
    // InternalRails.g:529:1: rule__HashKeyValue__ValueAlternatives_4_0 : ( ( RULE_SYMBOL ) | ( RULE_STRING ) | ( RULE_BRACKET_BLOCK ) | ( RULE_ARRAY_BLOCK ) | ( ruleMethodChainCall ) );
    public final void rule__HashKeyValue__ValueAlternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:533:1: ( ( RULE_SYMBOL ) | ( RULE_STRING ) | ( RULE_BRACKET_BLOCK ) | ( RULE_ARRAY_BLOCK ) | ( ruleMethodChainCall ) )
            int alt8=5;
            switch ( input.LA(1) ) {
            case RULE_SYMBOL:
                {
                alt8=1;
                }
                break;
            case RULE_STRING:
                {
                alt8=2;
                }
                break;
            case RULE_BRACKET_BLOCK:
                {
                alt8=3;
                }
                break;
            case RULE_ARRAY_BLOCK:
                {
                alt8=4;
                }
                break;
            case RULE_ID:
                {
                alt8=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalRails.g:534:1: ( RULE_SYMBOL )
                    {
                    // InternalRails.g:534:1: ( RULE_SYMBOL )
                    // InternalRails.g:535:1: RULE_SYMBOL
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getHashKeyValueAccess().getValueSYMBOLTerminalRuleCall_4_0_0()); 
                    }
                    match(input,RULE_SYMBOL,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getHashKeyValueAccess().getValueSYMBOLTerminalRuleCall_4_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalRails.g:540:6: ( RULE_STRING )
                    {
                    // InternalRails.g:540:6: ( RULE_STRING )
                    // InternalRails.g:541:1: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getHashKeyValueAccess().getValueSTRINGTerminalRuleCall_4_0_1()); 
                    }
                    match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getHashKeyValueAccess().getValueSTRINGTerminalRuleCall_4_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalRails.g:546:6: ( RULE_BRACKET_BLOCK )
                    {
                    // InternalRails.g:546:6: ( RULE_BRACKET_BLOCK )
                    // InternalRails.g:547:1: RULE_BRACKET_BLOCK
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getHashKeyValueAccess().getValueBRACKET_BLOCKTerminalRuleCall_4_0_2()); 
                    }
                    match(input,RULE_BRACKET_BLOCK,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getHashKeyValueAccess().getValueBRACKET_BLOCKTerminalRuleCall_4_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalRails.g:552:6: ( RULE_ARRAY_BLOCK )
                    {
                    // InternalRails.g:552:6: ( RULE_ARRAY_BLOCK )
                    // InternalRails.g:553:1: RULE_ARRAY_BLOCK
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getHashKeyValueAccess().getValueARRAY_BLOCKTerminalRuleCall_4_0_3()); 
                    }
                    match(input,RULE_ARRAY_BLOCK,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getHashKeyValueAccess().getValueARRAY_BLOCKTerminalRuleCall_4_0_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalRails.g:558:6: ( ruleMethodChainCall )
                    {
                    // InternalRails.g:558:6: ( ruleMethodChainCall )
                    // InternalRails.g:559:1: ruleMethodChainCall
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getHashKeyValueAccess().getValueMethodChainCallParserRuleCall_4_0_4()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleMethodChainCall();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getHashKeyValueAccess().getValueMethodChainCallParserRuleCall_4_0_4()); 
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
    // $ANTLR end "rule__HashKeyValue__ValueAlternatives_4_0"


    // $ANTLR start "rule__MethodName__Alternatives_1"
    // InternalRails.g:569:1: rule__MethodName__Alternatives_1 : ( ( '?' ) | ( '=' ) );
    public final void rule__MethodName__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:573:1: ( ( '?' ) | ( '=' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            else if ( (LA9_0==25) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalRails.g:574:1: ( '?' )
                    {
                    // InternalRails.g:574:1: ( '?' )
                    // InternalRails.g:575:1: '?'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMethodNameAccess().getQuestionMarkKeyword_1_0()); 
                    }
                    match(input,24,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMethodNameAccess().getQuestionMarkKeyword_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalRails.g:582:6: ( '=' )
                    {
                    // InternalRails.g:582:6: ( '=' )
                    // InternalRails.g:583:1: '='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMethodNameAccess().getEqualsSignKeyword_1_1()); 
                    }
                    match(input,25,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMethodNameAccess().getEqualsSignKeyword_1_1()); 
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
    // $ANTLR end "rule__MethodName__Alternatives_1"


    // $ANTLR start "rule__Class__Group__0"
    // InternalRails.g:597:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:601:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // InternalRails.g:602:2: rule__Class__Group__0__Impl rule__Class__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Class__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Class__Group__1();

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
    // $ANTLR end "rule__Class__Group__0"


    // $ANTLR start "rule__Class__Group__0__Impl"
    // InternalRails.g:609:1: rule__Class__Group__0__Impl : ( RULE_CLASS_WORD ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:613:1: ( ( RULE_CLASS_WORD ) )
            // InternalRails.g:614:1: ( RULE_CLASS_WORD )
            {
            // InternalRails.g:614:1: ( RULE_CLASS_WORD )
            // InternalRails.g:615:1: RULE_CLASS_WORD
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getCLASS_WORDTerminalRuleCall_0()); 
            }
            match(input,RULE_CLASS_WORD,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getCLASS_WORDTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__Class__Group__0__Impl"


    // $ANTLR start "rule__Class__Group__1"
    // InternalRails.g:626:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:630:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // InternalRails.g:631:2: rule__Class__Group__1__Impl rule__Class__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Class__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Class__Group__2();

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
    // $ANTLR end "rule__Class__Group__1"


    // $ANTLR start "rule__Class__Group__1__Impl"
    // InternalRails.g:638:1: rule__Class__Group__1__Impl : ( ( RULE_SPACE )* ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:642:1: ( ( ( RULE_SPACE )* ) )
            // InternalRails.g:643:1: ( ( RULE_SPACE )* )
            {
            // InternalRails.g:643:1: ( ( RULE_SPACE )* )
            // InternalRails.g:644:1: ( RULE_SPACE )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getSPACETerminalRuleCall_1()); 
            }
            // InternalRails.g:645:1: ( RULE_SPACE )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_SPACE) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalRails.g:645:3: RULE_SPACE
            	    {
            	    match(input,RULE_SPACE,FOLLOW_4); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getSPACETerminalRuleCall_1()); 
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
    // $ANTLR end "rule__Class__Group__1__Impl"


    // $ANTLR start "rule__Class__Group__2"
    // InternalRails.g:655:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:659:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // InternalRails.g:660:2: rule__Class__Group__2__Impl rule__Class__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Class__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Class__Group__3();

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
    // $ANTLR end "rule__Class__Group__2"


    // $ANTLR start "rule__Class__Group__2__Impl"
    // InternalRails.g:667:1: rule__Class__Group__2__Impl : ( ( rule__Class__NameAssignment_2 ) ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:671:1: ( ( ( rule__Class__NameAssignment_2 ) ) )
            // InternalRails.g:672:1: ( ( rule__Class__NameAssignment_2 ) )
            {
            // InternalRails.g:672:1: ( ( rule__Class__NameAssignment_2 ) )
            // InternalRails.g:673:1: ( rule__Class__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getNameAssignment_2()); 
            }
            // InternalRails.g:674:1: ( rule__Class__NameAssignment_2 )
            // InternalRails.g:674:2: rule__Class__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Class__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getNameAssignment_2()); 
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
    // $ANTLR end "rule__Class__Group__2__Impl"


    // $ANTLR start "rule__Class__Group__3"
    // InternalRails.g:684:1: rule__Class__Group__3 : rule__Class__Group__3__Impl rule__Class__Group__4 ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:688:1: ( rule__Class__Group__3__Impl rule__Class__Group__4 )
            // InternalRails.g:689:2: rule__Class__Group__3__Impl rule__Class__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Class__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Class__Group__4();

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
    // $ANTLR end "rule__Class__Group__3"


    // $ANTLR start "rule__Class__Group__3__Impl"
    // InternalRails.g:696:1: rule__Class__Group__3__Impl : ( ( rule__Class__Group_3__0 )? ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:700:1: ( ( ( rule__Class__Group_3__0 )? ) )
            // InternalRails.g:701:1: ( ( rule__Class__Group_3__0 )? )
            {
            // InternalRails.g:701:1: ( ( rule__Class__Group_3__0 )? )
            // InternalRails.g:702:1: ( rule__Class__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getGroup_3()); 
            }
            // InternalRails.g:703:1: ( rule__Class__Group_3__0 )?
            int alt11=2;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // InternalRails.g:703:2: rule__Class__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getGroup_3()); 
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
    // $ANTLR end "rule__Class__Group__3__Impl"


    // $ANTLR start "rule__Class__Group__4"
    // InternalRails.g:713:1: rule__Class__Group__4 : rule__Class__Group__4__Impl rule__Class__Group__5 ;
    public final void rule__Class__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:717:1: ( rule__Class__Group__4__Impl rule__Class__Group__5 )
            // InternalRails.g:718:2: rule__Class__Group__4__Impl rule__Class__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__Class__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Class__Group__5();

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
    // $ANTLR end "rule__Class__Group__4"


    // $ANTLR start "rule__Class__Group__4__Impl"
    // InternalRails.g:725:1: rule__Class__Group__4__Impl : ( ( RULE_SPACE )* ) ;
    public final void rule__Class__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:729:1: ( ( ( RULE_SPACE )* ) )
            // InternalRails.g:730:1: ( ( RULE_SPACE )* )
            {
            // InternalRails.g:730:1: ( ( RULE_SPACE )* )
            // InternalRails.g:731:1: ( RULE_SPACE )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getSPACETerminalRuleCall_4()); 
            }
            // InternalRails.g:732:1: ( RULE_SPACE )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_SPACE) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalRails.g:732:3: RULE_SPACE
            	    {
            	    match(input,RULE_SPACE,FOLLOW_4); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getSPACETerminalRuleCall_4()); 
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
    // $ANTLR end "rule__Class__Group__4__Impl"


    // $ANTLR start "rule__Class__Group__5"
    // InternalRails.g:742:1: rule__Class__Group__5 : rule__Class__Group__5__Impl rule__Class__Group__6 ;
    public final void rule__Class__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:746:1: ( rule__Class__Group__5__Impl rule__Class__Group__6 )
            // InternalRails.g:747:2: rule__Class__Group__5__Impl rule__Class__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__Class__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Class__Group__6();

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
    // $ANTLR end "rule__Class__Group__5"


    // $ANTLR start "rule__Class__Group__5__Impl"
    // InternalRails.g:754:1: rule__Class__Group__5__Impl : ( ( rule__Class__ClassElementsAssignment_5 )* ) ;
    public final void rule__Class__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:758:1: ( ( ( rule__Class__ClassElementsAssignment_5 )* ) )
            // InternalRails.g:759:1: ( ( rule__Class__ClassElementsAssignment_5 )* )
            {
            // InternalRails.g:759:1: ( ( rule__Class__ClassElementsAssignment_5 )* )
            // InternalRails.g:760:1: ( rule__Class__ClassElementsAssignment_5 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getClassElementsAssignment_5()); 
            }
            // InternalRails.g:761:1: ( rule__Class__ClassElementsAssignment_5 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_HAS_MANY_WORD||(LA13_0>=RULE_HAS_AND_BELONGS_TO_MANY_WORD && LA13_0<=RULE_DEF_WORD)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalRails.g:761:2: rule__Class__ClassElementsAssignment_5
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Class__ClassElementsAssignment_5();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getClassElementsAssignment_5()); 
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
    // $ANTLR end "rule__Class__Group__5__Impl"


    // $ANTLR start "rule__Class__Group__6"
    // InternalRails.g:771:1: rule__Class__Group__6 : rule__Class__Group__6__Impl ;
    public final void rule__Class__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:775:1: ( rule__Class__Group__6__Impl )
            // InternalRails.g:776:2: rule__Class__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group__6__Impl();

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
    // $ANTLR end "rule__Class__Group__6"


    // $ANTLR start "rule__Class__Group__6__Impl"
    // InternalRails.g:782:1: rule__Class__Group__6__Impl : ( RULE_END_WORD ) ;
    public final void rule__Class__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:786:1: ( ( RULE_END_WORD ) )
            // InternalRails.g:787:1: ( RULE_END_WORD )
            {
            // InternalRails.g:787:1: ( RULE_END_WORD )
            // InternalRails.g:788:1: RULE_END_WORD
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getEND_WORDTerminalRuleCall_6()); 
            }
            match(input,RULE_END_WORD,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getEND_WORDTerminalRuleCall_6()); 
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
    // $ANTLR end "rule__Class__Group__6__Impl"


    // $ANTLR start "rule__Class__Group_3__0"
    // InternalRails.g:813:1: rule__Class__Group_3__0 : rule__Class__Group_3__0__Impl rule__Class__Group_3__1 ;
    public final void rule__Class__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:817:1: ( rule__Class__Group_3__0__Impl rule__Class__Group_3__1 )
            // InternalRails.g:818:2: rule__Class__Group_3__0__Impl rule__Class__Group_3__1
            {
            pushFollow(FOLLOW_7);
            rule__Class__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Class__Group_3__1();

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
    // $ANTLR end "rule__Class__Group_3__0"


    // $ANTLR start "rule__Class__Group_3__0__Impl"
    // InternalRails.g:825:1: rule__Class__Group_3__0__Impl : ( ( RULE_SPACE )* ) ;
    public final void rule__Class__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:829:1: ( ( ( RULE_SPACE )* ) )
            // InternalRails.g:830:1: ( ( RULE_SPACE )* )
            {
            // InternalRails.g:830:1: ( ( RULE_SPACE )* )
            // InternalRails.g:831:1: ( RULE_SPACE )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getSPACETerminalRuleCall_3_0()); 
            }
            // InternalRails.g:832:1: ( RULE_SPACE )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_SPACE) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalRails.g:832:3: RULE_SPACE
            	    {
            	    match(input,RULE_SPACE,FOLLOW_4); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getSPACETerminalRuleCall_3_0()); 
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
    // $ANTLR end "rule__Class__Group_3__0__Impl"


    // $ANTLR start "rule__Class__Group_3__1"
    // InternalRails.g:842:1: rule__Class__Group_3__1 : rule__Class__Group_3__1__Impl rule__Class__Group_3__2 ;
    public final void rule__Class__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:846:1: ( rule__Class__Group_3__1__Impl rule__Class__Group_3__2 )
            // InternalRails.g:847:2: rule__Class__Group_3__1__Impl rule__Class__Group_3__2
            {
            pushFollow(FOLLOW_3);
            rule__Class__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Class__Group_3__2();

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
    // $ANTLR end "rule__Class__Group_3__1"


    // $ANTLR start "rule__Class__Group_3__1__Impl"
    // InternalRails.g:854:1: rule__Class__Group_3__1__Impl : ( '<' ) ;
    public final void rule__Class__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:858:1: ( ( '<' ) )
            // InternalRails.g:859:1: ( '<' )
            {
            // InternalRails.g:859:1: ( '<' )
            // InternalRails.g:860:1: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getLessThanSignKeyword_3_1()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getLessThanSignKeyword_3_1()); 
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
    // $ANTLR end "rule__Class__Group_3__1__Impl"


    // $ANTLR start "rule__Class__Group_3__2"
    // InternalRails.g:873:1: rule__Class__Group_3__2 : rule__Class__Group_3__2__Impl rule__Class__Group_3__3 ;
    public final void rule__Class__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:877:1: ( rule__Class__Group_3__2__Impl rule__Class__Group_3__3 )
            // InternalRails.g:878:2: rule__Class__Group_3__2__Impl rule__Class__Group_3__3
            {
            pushFollow(FOLLOW_3);
            rule__Class__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Class__Group_3__3();

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
    // $ANTLR end "rule__Class__Group_3__2"


    // $ANTLR start "rule__Class__Group_3__2__Impl"
    // InternalRails.g:885:1: rule__Class__Group_3__2__Impl : ( ( RULE_SPACE )* ) ;
    public final void rule__Class__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:889:1: ( ( ( RULE_SPACE )* ) )
            // InternalRails.g:890:1: ( ( RULE_SPACE )* )
            {
            // InternalRails.g:890:1: ( ( RULE_SPACE )* )
            // InternalRails.g:891:1: ( RULE_SPACE )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getSPACETerminalRuleCall_3_2()); 
            }
            // InternalRails.g:892:1: ( RULE_SPACE )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_SPACE) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalRails.g:892:3: RULE_SPACE
            	    {
            	    match(input,RULE_SPACE,FOLLOW_4); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getSPACETerminalRuleCall_3_2()); 
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
    // $ANTLR end "rule__Class__Group_3__2__Impl"


    // $ANTLR start "rule__Class__Group_3__3"
    // InternalRails.g:902:1: rule__Class__Group_3__3 : rule__Class__Group_3__3__Impl ;
    public final void rule__Class__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:906:1: ( rule__Class__Group_3__3__Impl )
            // InternalRails.g:907:2: rule__Class__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group_3__3__Impl();

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
    // $ANTLR end "rule__Class__Group_3__3"


    // $ANTLR start "rule__Class__Group_3__3__Impl"
    // InternalRails.g:913:1: rule__Class__Group_3__3__Impl : ( ( rule__Class__SuperTypeAssignment_3_3 ) ) ;
    public final void rule__Class__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:917:1: ( ( ( rule__Class__SuperTypeAssignment_3_3 ) ) )
            // InternalRails.g:918:1: ( ( rule__Class__SuperTypeAssignment_3_3 ) )
            {
            // InternalRails.g:918:1: ( ( rule__Class__SuperTypeAssignment_3_3 ) )
            // InternalRails.g:919:1: ( rule__Class__SuperTypeAssignment_3_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getSuperTypeAssignment_3_3()); 
            }
            // InternalRails.g:920:1: ( rule__Class__SuperTypeAssignment_3_3 )
            // InternalRails.g:920:2: rule__Class__SuperTypeAssignment_3_3
            {
            pushFollow(FOLLOW_2);
            rule__Class__SuperTypeAssignment_3_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getSuperTypeAssignment_3_3()); 
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
    // $ANTLR end "rule__Class__Group_3__3__Impl"


    // $ANTLR start "rule__NamespacedModuleName__Group__0"
    // InternalRails.g:938:1: rule__NamespacedModuleName__Group__0 : rule__NamespacedModuleName__Group__0__Impl rule__NamespacedModuleName__Group__1 ;
    public final void rule__NamespacedModuleName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:942:1: ( rule__NamespacedModuleName__Group__0__Impl rule__NamespacedModuleName__Group__1 )
            // InternalRails.g:943:2: rule__NamespacedModuleName__Group__0__Impl rule__NamespacedModuleName__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__NamespacedModuleName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NamespacedModuleName__Group__1();

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
    // $ANTLR end "rule__NamespacedModuleName__Group__0"


    // $ANTLR start "rule__NamespacedModuleName__Group__0__Impl"
    // InternalRails.g:950:1: rule__NamespacedModuleName__Group__0__Impl : ( ( rule__NamespacedModuleName__Group_0__0 )* ) ;
    public final void rule__NamespacedModuleName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:954:1: ( ( ( rule__NamespacedModuleName__Group_0__0 )* ) )
            // InternalRails.g:955:1: ( ( rule__NamespacedModuleName__Group_0__0 )* )
            {
            // InternalRails.g:955:1: ( ( rule__NamespacedModuleName__Group_0__0 )* )
            // InternalRails.g:956:1: ( rule__NamespacedModuleName__Group_0__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamespacedModuleNameAccess().getGroup_0()); 
            }
            // InternalRails.g:957:1: ( rule__NamespacedModuleName__Group_0__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    int LA16_1 = input.LA(2);

                    if ( (LA16_1==27) ) {
                        alt16=1;
                    }


                }


                switch (alt16) {
            	case 1 :
            	    // InternalRails.g:957:2: rule__NamespacedModuleName__Group_0__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__NamespacedModuleName__Group_0__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNamespacedModuleNameAccess().getGroup_0()); 
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
    // $ANTLR end "rule__NamespacedModuleName__Group__0__Impl"


    // $ANTLR start "rule__NamespacedModuleName__Group__1"
    // InternalRails.g:967:1: rule__NamespacedModuleName__Group__1 : rule__NamespacedModuleName__Group__1__Impl ;
    public final void rule__NamespacedModuleName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:971:1: ( rule__NamespacedModuleName__Group__1__Impl )
            // InternalRails.g:972:2: rule__NamespacedModuleName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NamespacedModuleName__Group__1__Impl();

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
    // $ANTLR end "rule__NamespacedModuleName__Group__1"


    // $ANTLR start "rule__NamespacedModuleName__Group__1__Impl"
    // InternalRails.g:978:1: rule__NamespacedModuleName__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__NamespacedModuleName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:982:1: ( ( RULE_ID ) )
            // InternalRails.g:983:1: ( RULE_ID )
            {
            // InternalRails.g:983:1: ( RULE_ID )
            // InternalRails.g:984:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamespacedModuleNameAccess().getIDTerminalRuleCall_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNamespacedModuleNameAccess().getIDTerminalRuleCall_1()); 
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
    // $ANTLR end "rule__NamespacedModuleName__Group__1__Impl"


    // $ANTLR start "rule__NamespacedModuleName__Group_0__0"
    // InternalRails.g:999:1: rule__NamespacedModuleName__Group_0__0 : rule__NamespacedModuleName__Group_0__0__Impl rule__NamespacedModuleName__Group_0__1 ;
    public final void rule__NamespacedModuleName__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1003:1: ( rule__NamespacedModuleName__Group_0__0__Impl rule__NamespacedModuleName__Group_0__1 )
            // InternalRails.g:1004:2: rule__NamespacedModuleName__Group_0__0__Impl rule__NamespacedModuleName__Group_0__1
            {
            pushFollow(FOLLOW_9);
            rule__NamespacedModuleName__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NamespacedModuleName__Group_0__1();

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
    // $ANTLR end "rule__NamespacedModuleName__Group_0__0"


    // $ANTLR start "rule__NamespacedModuleName__Group_0__0__Impl"
    // InternalRails.g:1011:1: rule__NamespacedModuleName__Group_0__0__Impl : ( RULE_ID ) ;
    public final void rule__NamespacedModuleName__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1015:1: ( ( RULE_ID ) )
            // InternalRails.g:1016:1: ( RULE_ID )
            {
            // InternalRails.g:1016:1: ( RULE_ID )
            // InternalRails.g:1017:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamespacedModuleNameAccess().getIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNamespacedModuleNameAccess().getIDTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__NamespacedModuleName__Group_0__0__Impl"


    // $ANTLR start "rule__NamespacedModuleName__Group_0__1"
    // InternalRails.g:1028:1: rule__NamespacedModuleName__Group_0__1 : rule__NamespacedModuleName__Group_0__1__Impl ;
    public final void rule__NamespacedModuleName__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1032:1: ( rule__NamespacedModuleName__Group_0__1__Impl )
            // InternalRails.g:1033:2: rule__NamespacedModuleName__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NamespacedModuleName__Group_0__1__Impl();

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
    // $ANTLR end "rule__NamespacedModuleName__Group_0__1"


    // $ANTLR start "rule__NamespacedModuleName__Group_0__1__Impl"
    // InternalRails.g:1039:1: rule__NamespacedModuleName__Group_0__1__Impl : ( '::' ) ;
    public final void rule__NamespacedModuleName__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1043:1: ( ( '::' ) )
            // InternalRails.g:1044:1: ( '::' )
            {
            // InternalRails.g:1044:1: ( '::' )
            // InternalRails.g:1045:1: '::'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamespacedModuleNameAccess().getColonColonKeyword_0_1()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNamespacedModuleNameAccess().getColonColonKeyword_0_1()); 
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
    // $ANTLR end "rule__NamespacedModuleName__Group_0__1__Impl"


    // $ANTLR start "rule__MethodChainCall__Group__0"
    // InternalRails.g:1062:1: rule__MethodChainCall__Group__0 : rule__MethodChainCall__Group__0__Impl rule__MethodChainCall__Group__1 ;
    public final void rule__MethodChainCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1066:1: ( rule__MethodChainCall__Group__0__Impl rule__MethodChainCall__Group__1 )
            // InternalRails.g:1067:2: rule__MethodChainCall__Group__0__Impl rule__MethodChainCall__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__MethodChainCall__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MethodChainCall__Group__1();

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
    // $ANTLR end "rule__MethodChainCall__Group__0"


    // $ANTLR start "rule__MethodChainCall__Group__0__Impl"
    // InternalRails.g:1074:1: rule__MethodChainCall__Group__0__Impl : ( ruleNamespacedModuleName ) ;
    public final void rule__MethodChainCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1078:1: ( ( ruleNamespacedModuleName ) )
            // InternalRails.g:1079:1: ( ruleNamespacedModuleName )
            {
            // InternalRails.g:1079:1: ( ruleNamespacedModuleName )
            // InternalRails.g:1080:1: ruleNamespacedModuleName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodChainCallAccess().getNamespacedModuleNameParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNamespacedModuleName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodChainCallAccess().getNamespacedModuleNameParserRuleCall_0()); 
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
    // $ANTLR end "rule__MethodChainCall__Group__0__Impl"


    // $ANTLR start "rule__MethodChainCall__Group__1"
    // InternalRails.g:1091:1: rule__MethodChainCall__Group__1 : rule__MethodChainCall__Group__1__Impl rule__MethodChainCall__Group__2 ;
    public final void rule__MethodChainCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1095:1: ( rule__MethodChainCall__Group__1__Impl rule__MethodChainCall__Group__2 )
            // InternalRails.g:1096:2: rule__MethodChainCall__Group__1__Impl rule__MethodChainCall__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__MethodChainCall__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MethodChainCall__Group__2();

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
    // $ANTLR end "rule__MethodChainCall__Group__1"


    // $ANTLR start "rule__MethodChainCall__Group__1__Impl"
    // InternalRails.g:1103:1: rule__MethodChainCall__Group__1__Impl : ( ( rule__MethodChainCall__Group_1__0 )* ) ;
    public final void rule__MethodChainCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1107:1: ( ( ( rule__MethodChainCall__Group_1__0 )* ) )
            // InternalRails.g:1108:1: ( ( rule__MethodChainCall__Group_1__0 )* )
            {
            // InternalRails.g:1108:1: ( ( rule__MethodChainCall__Group_1__0 )* )
            // InternalRails.g:1109:1: ( rule__MethodChainCall__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodChainCallAccess().getGroup_1()); 
            }
            // InternalRails.g:1110:1: ( rule__MethodChainCall__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==28) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalRails.g:1110:2: rule__MethodChainCall__Group_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__MethodChainCall__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodChainCallAccess().getGroup_1()); 
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
    // $ANTLR end "rule__MethodChainCall__Group__1__Impl"


    // $ANTLR start "rule__MethodChainCall__Group__2"
    // InternalRails.g:1120:1: rule__MethodChainCall__Group__2 : rule__MethodChainCall__Group__2__Impl rule__MethodChainCall__Group__3 ;
    public final void rule__MethodChainCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1124:1: ( rule__MethodChainCall__Group__2__Impl rule__MethodChainCall__Group__3 )
            // InternalRails.g:1125:2: rule__MethodChainCall__Group__2__Impl rule__MethodChainCall__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__MethodChainCall__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MethodChainCall__Group__3();

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
    // $ANTLR end "rule__MethodChainCall__Group__2"


    // $ANTLR start "rule__MethodChainCall__Group__2__Impl"
    // InternalRails.g:1132:1: rule__MethodChainCall__Group__2__Impl : ( ( RULE_SPACE )* ) ;
    public final void rule__MethodChainCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1136:1: ( ( ( RULE_SPACE )* ) )
            // InternalRails.g:1137:1: ( ( RULE_SPACE )* )
            {
            // InternalRails.g:1137:1: ( ( RULE_SPACE )* )
            // InternalRails.g:1138:1: ( RULE_SPACE )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodChainCallAccess().getSPACETerminalRuleCall_2()); 
            }
            // InternalRails.g:1139:1: ( RULE_SPACE )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_SPACE) ) {
                    int LA18_2 = input.LA(2);

                    if ( (synpred22_InternalRails()) ) {
                        alt18=1;
                    }


                }


                switch (alt18) {
            	case 1 :
            	    // InternalRails.g:1139:3: RULE_SPACE
            	    {
            	    match(input,RULE_SPACE,FOLLOW_4); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodChainCallAccess().getSPACETerminalRuleCall_2()); 
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
    // $ANTLR end "rule__MethodChainCall__Group__2__Impl"


    // $ANTLR start "rule__MethodChainCall__Group__3"
    // InternalRails.g:1149:1: rule__MethodChainCall__Group__3 : rule__MethodChainCall__Group__3__Impl rule__MethodChainCall__Group__4 ;
    public final void rule__MethodChainCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1153:1: ( rule__MethodChainCall__Group__3__Impl rule__MethodChainCall__Group__4 )
            // InternalRails.g:1154:2: rule__MethodChainCall__Group__3__Impl rule__MethodChainCall__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__MethodChainCall__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MethodChainCall__Group__4();

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
    // $ANTLR end "rule__MethodChainCall__Group__3"


    // $ANTLR start "rule__MethodChainCall__Group__3__Impl"
    // InternalRails.g:1161:1: rule__MethodChainCall__Group__3__Impl : ( ( RULE_PARENTHESIS_BLOCK )? ) ;
    public final void rule__MethodChainCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1165:1: ( ( ( RULE_PARENTHESIS_BLOCK )? ) )
            // InternalRails.g:1166:1: ( ( RULE_PARENTHESIS_BLOCK )? )
            {
            // InternalRails.g:1166:1: ( ( RULE_PARENTHESIS_BLOCK )? )
            // InternalRails.g:1167:1: ( RULE_PARENTHESIS_BLOCK )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodChainCallAccess().getPARENTHESIS_BLOCKTerminalRuleCall_3()); 
            }
            // InternalRails.g:1168:1: ( RULE_PARENTHESIS_BLOCK )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_PARENTHESIS_BLOCK) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalRails.g:1168:3: RULE_PARENTHESIS_BLOCK
                    {
                    match(input,RULE_PARENTHESIS_BLOCK,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodChainCallAccess().getPARENTHESIS_BLOCKTerminalRuleCall_3()); 
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
    // $ANTLR end "rule__MethodChainCall__Group__3__Impl"


    // $ANTLR start "rule__MethodChainCall__Group__4"
    // InternalRails.g:1178:1: rule__MethodChainCall__Group__4 : rule__MethodChainCall__Group__4__Impl rule__MethodChainCall__Group__5 ;
    public final void rule__MethodChainCall__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1182:1: ( rule__MethodChainCall__Group__4__Impl rule__MethodChainCall__Group__5 )
            // InternalRails.g:1183:2: rule__MethodChainCall__Group__4__Impl rule__MethodChainCall__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__MethodChainCall__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MethodChainCall__Group__5();

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
    // $ANTLR end "rule__MethodChainCall__Group__4"


    // $ANTLR start "rule__MethodChainCall__Group__4__Impl"
    // InternalRails.g:1190:1: rule__MethodChainCall__Group__4__Impl : ( ( RULE_SPACE )* ) ;
    public final void rule__MethodChainCall__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1194:1: ( ( ( RULE_SPACE )* ) )
            // InternalRails.g:1195:1: ( ( RULE_SPACE )* )
            {
            // InternalRails.g:1195:1: ( ( RULE_SPACE )* )
            // InternalRails.g:1196:1: ( RULE_SPACE )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodChainCallAccess().getSPACETerminalRuleCall_4()); 
            }
            // InternalRails.g:1197:1: ( RULE_SPACE )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_SPACE) ) {
                    int LA20_2 = input.LA(2);

                    if ( (synpred24_InternalRails()) ) {
                        alt20=1;
                    }


                }


                switch (alt20) {
            	case 1 :
            	    // InternalRails.g:1197:3: RULE_SPACE
            	    {
            	    match(input,RULE_SPACE,FOLLOW_4); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodChainCallAccess().getSPACETerminalRuleCall_4()); 
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
    // $ANTLR end "rule__MethodChainCall__Group__4__Impl"


    // $ANTLR start "rule__MethodChainCall__Group__5"
    // InternalRails.g:1207:1: rule__MethodChainCall__Group__5 : rule__MethodChainCall__Group__5__Impl ;
    public final void rule__MethodChainCall__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1211:1: ( rule__MethodChainCall__Group__5__Impl )
            // InternalRails.g:1212:2: rule__MethodChainCall__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MethodChainCall__Group__5__Impl();

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
    // $ANTLR end "rule__MethodChainCall__Group__5"


    // $ANTLR start "rule__MethodChainCall__Group__5__Impl"
    // InternalRails.g:1218:1: rule__MethodChainCall__Group__5__Impl : ( ( RULE_BRACKET_BLOCK )? ) ;
    public final void rule__MethodChainCall__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1222:1: ( ( ( RULE_BRACKET_BLOCK )? ) )
            // InternalRails.g:1223:1: ( ( RULE_BRACKET_BLOCK )? )
            {
            // InternalRails.g:1223:1: ( ( RULE_BRACKET_BLOCK )? )
            // InternalRails.g:1224:1: ( RULE_BRACKET_BLOCK )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodChainCallAccess().getBRACKET_BLOCKTerminalRuleCall_5()); 
            }
            // InternalRails.g:1225:1: ( RULE_BRACKET_BLOCK )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_BRACKET_BLOCK) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalRails.g:1225:3: RULE_BRACKET_BLOCK
                    {
                    match(input,RULE_BRACKET_BLOCK,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodChainCallAccess().getBRACKET_BLOCKTerminalRuleCall_5()); 
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
    // $ANTLR end "rule__MethodChainCall__Group__5__Impl"


    // $ANTLR start "rule__MethodChainCall__Group_1__0"
    // InternalRails.g:1247:1: rule__MethodChainCall__Group_1__0 : rule__MethodChainCall__Group_1__0__Impl rule__MethodChainCall__Group_1__1 ;
    public final void rule__MethodChainCall__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1251:1: ( rule__MethodChainCall__Group_1__0__Impl rule__MethodChainCall__Group_1__1 )
            // InternalRails.g:1252:2: rule__MethodChainCall__Group_1__0__Impl rule__MethodChainCall__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__MethodChainCall__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MethodChainCall__Group_1__1();

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
    // $ANTLR end "rule__MethodChainCall__Group_1__0"


    // $ANTLR start "rule__MethodChainCall__Group_1__0__Impl"
    // InternalRails.g:1259:1: rule__MethodChainCall__Group_1__0__Impl : ( '.' ) ;
    public final void rule__MethodChainCall__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1263:1: ( ( '.' ) )
            // InternalRails.g:1264:1: ( '.' )
            {
            // InternalRails.g:1264:1: ( '.' )
            // InternalRails.g:1265:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodChainCallAccess().getFullStopKeyword_1_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodChainCallAccess().getFullStopKeyword_1_0()); 
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
    // $ANTLR end "rule__MethodChainCall__Group_1__0__Impl"


    // $ANTLR start "rule__MethodChainCall__Group_1__1"
    // InternalRails.g:1278:1: rule__MethodChainCall__Group_1__1 : rule__MethodChainCall__Group_1__1__Impl ;
    public final void rule__MethodChainCall__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1282:1: ( rule__MethodChainCall__Group_1__1__Impl )
            // InternalRails.g:1283:2: rule__MethodChainCall__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MethodChainCall__Group_1__1__Impl();

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
    // $ANTLR end "rule__MethodChainCall__Group_1__1"


    // $ANTLR start "rule__MethodChainCall__Group_1__1__Impl"
    // InternalRails.g:1289:1: rule__MethodChainCall__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__MethodChainCall__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1293:1: ( ( RULE_ID ) )
            // InternalRails.g:1294:1: ( RULE_ID )
            {
            // InternalRails.g:1294:1: ( RULE_ID )
            // InternalRails.g:1295:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodChainCallAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodChainCallAccess().getIDTerminalRuleCall_1_1()); 
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
    // $ANTLR end "rule__MethodChainCall__Group_1__1__Impl"


    // $ANTLR start "rule__HasMany__Group__0"
    // InternalRails.g:1310:1: rule__HasMany__Group__0 : rule__HasMany__Group__0__Impl rule__HasMany__Group__1 ;
    public final void rule__HasMany__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1314:1: ( rule__HasMany__Group__0__Impl rule__HasMany__Group__1 )
            // InternalRails.g:1315:2: rule__HasMany__Group__0__Impl rule__HasMany__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__HasMany__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__HasMany__Group__1();

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
    // $ANTLR end "rule__HasMany__Group__0"


    // $ANTLR start "rule__HasMany__Group__0__Impl"
    // InternalRails.g:1322:1: rule__HasMany__Group__0__Impl : ( RULE_HAS_MANY_WORD ) ;
    public final void rule__HasMany__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1326:1: ( ( RULE_HAS_MANY_WORD ) )
            // InternalRails.g:1327:1: ( RULE_HAS_MANY_WORD )
            {
            // InternalRails.g:1327:1: ( RULE_HAS_MANY_WORD )
            // InternalRails.g:1328:1: RULE_HAS_MANY_WORD
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHasManyAccess().getHAS_MANY_WORDTerminalRuleCall_0()); 
            }
            match(input,RULE_HAS_MANY_WORD,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHasManyAccess().getHAS_MANY_WORDTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__HasMany__Group__0__Impl"


    // $ANTLR start "rule__HasMany__Group__1"
    // InternalRails.g:1339:1: rule__HasMany__Group__1 : rule__HasMany__Group__1__Impl rule__HasMany__Group__2 ;
    public final void rule__HasMany__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1343:1: ( rule__HasMany__Group__1__Impl rule__HasMany__Group__2 )
            // InternalRails.g:1344:2: rule__HasMany__Group__1__Impl rule__HasMany__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__HasMany__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__HasMany__Group__2();

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
    // $ANTLR end "rule__HasMany__Group__1"


    // $ANTLR start "rule__HasMany__Group__1__Impl"
    // InternalRails.g:1351:1: rule__HasMany__Group__1__Impl : ( ( RULE_SPACE )* ) ;
    public final void rule__HasMany__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1355:1: ( ( ( RULE_SPACE )* ) )
            // InternalRails.g:1356:1: ( ( RULE_SPACE )* )
            {
            // InternalRails.g:1356:1: ( ( RULE_SPACE )* )
            // InternalRails.g:1357:1: ( RULE_SPACE )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHasManyAccess().getSPACETerminalRuleCall_1()); 
            }
            // InternalRails.g:1358:1: ( RULE_SPACE )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_SPACE) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalRails.g:1358:3: RULE_SPACE
            	    {
            	    match(input,RULE_SPACE,FOLLOW_4); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHasManyAccess().getSPACETerminalRuleCall_1()); 
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
    // $ANTLR end "rule__HasMany__Group__1__Impl"


    // $ANTLR start "rule__HasMany__Group__2"
    // InternalRails.g:1368:1: rule__HasMany__Group__2 : rule__HasMany__Group__2__Impl rule__HasMany__Group__3 ;
    public final void rule__HasMany__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1372:1: ( rule__HasMany__Group__2__Impl rule__HasMany__Group__3 )
            // InternalRails.g:1373:2: rule__HasMany__Group__2__Impl rule__HasMany__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__HasMany__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__HasMany__Group__3();

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
    // $ANTLR end "rule__HasMany__Group__2"


    // $ANTLR start "rule__HasMany__Group__2__Impl"
    // InternalRails.g:1380:1: rule__HasMany__Group__2__Impl : ( ( rule__HasMany__NameAssignment_2 ) ) ;
    public final void rule__HasMany__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1384:1: ( ( ( rule__HasMany__NameAssignment_2 ) ) )
            // InternalRails.g:1385:1: ( ( rule__HasMany__NameAssignment_2 ) )
            {
            // InternalRails.g:1385:1: ( ( rule__HasMany__NameAssignment_2 ) )
            // InternalRails.g:1386:1: ( rule__HasMany__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHasManyAccess().getNameAssignment_2()); 
            }
            // InternalRails.g:1387:1: ( rule__HasMany__NameAssignment_2 )
            // InternalRails.g:1387:2: rule__HasMany__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__HasMany__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHasManyAccess().getNameAssignment_2()); 
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
    // $ANTLR end "rule__HasMany__Group__2__Impl"


    // $ANTLR start "rule__HasMany__Group__3"
    // InternalRails.g:1397:1: rule__HasMany__Group__3 : rule__HasMany__Group__3__Impl rule__HasMany__Group__4 ;
    public final void rule__HasMany__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1401:1: ( rule__HasMany__Group__3__Impl rule__HasMany__Group__4 )
            // InternalRails.g:1402:2: rule__HasMany__Group__3__Impl rule__HasMany__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__HasMany__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__HasMany__Group__4();

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
    // $ANTLR end "rule__HasMany__Group__3"


    // $ANTLR start "rule__HasMany__Group__3__Impl"
    // InternalRails.g:1409:1: rule__HasMany__Group__3__Impl : ( ( RULE_SPACE )* ) ;
    public final void rule__HasMany__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1413:1: ( ( ( RULE_SPACE )* ) )
            // InternalRails.g:1414:1: ( ( RULE_SPACE )* )
            {
            // InternalRails.g:1414:1: ( ( RULE_SPACE )* )
            // InternalRails.g:1415:1: ( RULE_SPACE )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHasManyAccess().getSPACETerminalRuleCall_3()); 
            }
            // InternalRails.g:1416:1: ( RULE_SPACE )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_SPACE) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalRails.g:1416:3: RULE_SPACE
            	    {
            	    match(input,RULE_SPACE,FOLLOW_4); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHasManyAccess().getSPACETerminalRuleCall_3()); 
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
    // $ANTLR end "rule__HasMany__Group__3__Impl"


    // $ANTLR start "rule__HasMany__Group__4"
    // InternalRails.g:1426:1: rule__HasMany__Group__4 : rule__HasMany__Group__4__Impl rule__HasMany__Group__5 ;
    public final void rule__HasMany__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1430:1: ( rule__HasMany__Group__4__Impl rule__HasMany__Group__5 )
            // InternalRails.g:1431:2: rule__HasMany__Group__4__Impl rule__HasMany__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__HasMany__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__HasMany__Group__5();

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
    // $ANTLR end "rule__HasMany__Group__4"


    // $ANTLR start "rule__HasMany__Group__4__Impl"
    // InternalRails.g:1438:1: rule__HasMany__Group__4__Impl : ( ( rule__HasMany__OptionsAssignment_4 )* ) ;
    public final void rule__HasMany__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1442:1: ( ( ( rule__HasMany__OptionsAssignment_4 )* ) )
            // InternalRails.g:1443:1: ( ( rule__HasMany__OptionsAssignment_4 )* )
            {
            // InternalRails.g:1443:1: ( ( rule__HasMany__OptionsAssignment_4 )* )
            // InternalRails.g:1444:1: ( rule__HasMany__OptionsAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHasManyAccess().getOptionsAssignment_4()); 
            }
            // InternalRails.g:1445:1: ( rule__HasMany__OptionsAssignment_4 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==29) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalRails.g:1445:2: rule__HasMany__OptionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__HasMany__OptionsAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHasManyAccess().getOptionsAssignment_4()); 
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
    // $ANTLR end "rule__HasMany__Group__4__Impl"


    // $ANTLR start "rule__HasMany__Group__5"
    // InternalRails.g:1455:1: rule__HasMany__Group__5 : rule__HasMany__Group__5__Impl ;
    public final void rule__HasMany__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1459:1: ( rule__HasMany__Group__5__Impl )
            // InternalRails.g:1460:2: rule__HasMany__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HasMany__Group__5__Impl();

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
    // $ANTLR end "rule__HasMany__Group__5"


    // $ANTLR start "rule__HasMany__Group__5__Impl"
    // InternalRails.g:1466:1: rule__HasMany__Group__5__Impl : ( ( RULE_SL_COMMENT )? ) ;
    public final void rule__HasMany__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1470:1: ( ( ( RULE_SL_COMMENT )? ) )
            // InternalRails.g:1471:1: ( ( RULE_SL_COMMENT )? )
            {
            // InternalRails.g:1471:1: ( ( RULE_SL_COMMENT )? )
            // InternalRails.g:1472:1: ( RULE_SL_COMMENT )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHasManyAccess().getSL_COMMENTTerminalRuleCall_5()); 
            }
            // InternalRails.g:1473:1: ( RULE_SL_COMMENT )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_SL_COMMENT) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalRails.g:1473:3: RULE_SL_COMMENT
                    {
                    match(input,RULE_SL_COMMENT,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHasManyAccess().getSL_COMMENTTerminalRuleCall_5()); 
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
    // $ANTLR end "rule__HasMany__Group__5__Impl"


    // $ANTLR start "rule__HasAndBelongsToMany__Group__0"
    // InternalRails.g:1495:1: rule__HasAndBelongsToMany__Group__0 : rule__HasAndBelongsToMany__Group__0__Impl rule__HasAndBelongsToMany__Group__1 ;
    public final void rule__HasAndBelongsToMany__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1499:1: ( rule__HasAndBelongsToMany__Group__0__Impl rule__HasAndBelongsToMany__Group__1 )
            // InternalRails.g:1500:2: rule__HasAndBelongsToMany__Group__0__Impl rule__HasAndBelongsToMany__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__HasAndBelongsToMany__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__HasAndBelongsToMany__Group__1();

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
    // $ANTLR end "rule__HasAndBelongsToMany__Group__0"


    // $ANTLR start "rule__HasAndBelongsToMany__Group__0__Impl"
    // InternalRails.g:1507:1: rule__HasAndBelongsToMany__Group__0__Impl : ( RULE_HAS_AND_BELONGS_TO_MANY_WORD ) ;
    public final void rule__HasAndBelongsToMany__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1511:1: ( ( RULE_HAS_AND_BELONGS_TO_MANY_WORD ) )
            // InternalRails.g:1512:1: ( RULE_HAS_AND_BELONGS_TO_MANY_WORD )
            {
            // InternalRails.g:1512:1: ( RULE_HAS_AND_BELONGS_TO_MANY_WORD )
            // InternalRails.g:1513:1: RULE_HAS_AND_BELONGS_TO_MANY_WORD
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHasAndBelongsToManyAccess().getHAS_AND_BELONGS_TO_MANY_WORDTerminalRuleCall_0()); 
            }
            match(input,RULE_HAS_AND_BELONGS_TO_MANY_WORD,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHasAndBelongsToManyAccess().getHAS_AND_BELONGS_TO_MANY_WORDTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__HasAndBelongsToMany__Group__0__Impl"


    // $ANTLR start "rule__HasAndBelongsToMany__Group__1"
    // InternalRails.g:1524:1: rule__HasAndBelongsToMany__Group__1 : rule__HasAndBelongsToMany__Group__1__Impl rule__HasAndBelongsToMany__Group__2 ;
    public final void rule__HasAndBelongsToMany__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1528:1: ( rule__HasAndBelongsToMany__Group__1__Impl rule__HasAndBelongsToMany__Group__2 )
            // InternalRails.g:1529:2: rule__HasAndBelongsToMany__Group__1__Impl rule__HasAndBelongsToMany__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__HasAndBelongsToMany__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__HasAndBelongsToMany__Group__2();

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
    // $ANTLR end "rule__HasAndBelongsToMany__Group__1"


    // $ANTLR start "rule__HasAndBelongsToMany__Group__1__Impl"
    // InternalRails.g:1536:1: rule__HasAndBelongsToMany__Group__1__Impl : ( ( RULE_SPACE )* ) ;
    public final void rule__HasAndBelongsToMany__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1540:1: ( ( ( RULE_SPACE )* ) )
            // InternalRails.g:1541:1: ( ( RULE_SPACE )* )
            {
            // InternalRails.g:1541:1: ( ( RULE_SPACE )* )
            // InternalRails.g:1542:1: ( RULE_SPACE )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHasAndBelongsToManyAccess().getSPACETerminalRuleCall_1()); 
            }
            // InternalRails.g:1543:1: ( RULE_SPACE )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_SPACE) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalRails.g:1543:3: RULE_SPACE
            	    {
            	    match(input,RULE_SPACE,FOLLOW_4); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHasAndBelongsToManyAccess().getSPACETerminalRuleCall_1()); 
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
    // $ANTLR end "rule__HasAndBelongsToMany__Group__1__Impl"


    // $ANTLR start "rule__HasAndBelongsToMany__Group__2"
    // InternalRails.g:1553:1: rule__HasAndBelongsToMany__Group__2 : rule__HasAndBelongsToMany__Group__2__Impl rule__HasAndBelongsToMany__Group__3 ;
    public final void rule__HasAndBelongsToMany__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1557:1: ( rule__HasAndBelongsToMany__Group__2__Impl rule__HasAndBelongsToMany__Group__3 )
            // InternalRails.g:1558:2: rule__HasAndBelongsToMany__Group__2__Impl rule__HasAndBelongsToMany__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__HasAndBelongsToMany__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__HasAndBelongsToMany__Group__3();

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
    // $ANTLR end "rule__HasAndBelongsToMany__Group__2"


    // $ANTLR start "rule__HasAndBelongsToMany__Group__2__Impl"
    // InternalRails.g:1565:1: rule__HasAndBelongsToMany__Group__2__Impl : ( ( rule__HasAndBelongsToMany__NameAssignment_2 ) ) ;
    public final void rule__HasAndBelongsToMany__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1569:1: ( ( ( rule__HasAndBelongsToMany__NameAssignment_2 ) ) )
            // InternalRails.g:1570:1: ( ( rule__HasAndBelongsToMany__NameAssignment_2 ) )
            {
            // InternalRails.g:1570:1: ( ( rule__HasAndBelongsToMany__NameAssignment_2 ) )
            // InternalRails.g:1571:1: ( rule__HasAndBelongsToMany__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHasAndBelongsToManyAccess().getNameAssignment_2()); 
            }
            // InternalRails.g:1572:1: ( rule__HasAndBelongsToMany__NameAssignment_2 )
            // InternalRails.g:1572:2: rule__HasAndBelongsToMany__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__HasAndBelongsToMany__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHasAndBelongsToManyAccess().getNameAssignment_2()); 
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
    // $ANTLR end "rule__HasAndBelongsToMany__Group__2__Impl"


    // $ANTLR start "rule__HasAndBelongsToMany__Group__3"
    // InternalRails.g:1582:1: rule__HasAndBelongsToMany__Group__3 : rule__HasAndBelongsToMany__Group__3__Impl rule__HasAndBelongsToMany__Group__4 ;
    public final void rule__HasAndBelongsToMany__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1586:1: ( rule__HasAndBelongsToMany__Group__3__Impl rule__HasAndBelongsToMany__Group__4 )
            // InternalRails.g:1587:2: rule__HasAndBelongsToMany__Group__3__Impl rule__HasAndBelongsToMany__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__HasAndBelongsToMany__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__HasAndBelongsToMany__Group__4();

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
    // $ANTLR end "rule__HasAndBelongsToMany__Group__3"


    // $ANTLR start "rule__HasAndBelongsToMany__Group__3__Impl"
    // InternalRails.g:1594:1: rule__HasAndBelongsToMany__Group__3__Impl : ( ( RULE_SPACE )* ) ;
    public final void rule__HasAndBelongsToMany__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1598:1: ( ( ( RULE_SPACE )* ) )
            // InternalRails.g:1599:1: ( ( RULE_SPACE )* )
            {
            // InternalRails.g:1599:1: ( ( RULE_SPACE )* )
            // InternalRails.g:1600:1: ( RULE_SPACE )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHasAndBelongsToManyAccess().getSPACETerminalRuleCall_3()); 
            }
            // InternalRails.g:1601:1: ( RULE_SPACE )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_SPACE) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalRails.g:1601:3: RULE_SPACE
            	    {
            	    match(input,RULE_SPACE,FOLLOW_4); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHasAndBelongsToManyAccess().getSPACETerminalRuleCall_3()); 
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
    // $ANTLR end "rule__HasAndBelongsToMany__Group__3__Impl"


    // $ANTLR start "rule__HasAndBelongsToMany__Group__4"
    // InternalRails.g:1611:1: rule__HasAndBelongsToMany__Group__4 : rule__HasAndBelongsToMany__Group__4__Impl ;
    public final void rule__HasAndBelongsToMany__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1615:1: ( rule__HasAndBelongsToMany__Group__4__Impl )
            // InternalRails.g:1616:2: rule__HasAndBelongsToMany__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HasAndBelongsToMany__Group__4__Impl();

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
    // $ANTLR end "rule__HasAndBelongsToMany__Group__4"


    // $ANTLR start "rule__HasAndBelongsToMany__Group__4__Impl"
    // InternalRails.g:1622:1: rule__HasAndBelongsToMany__Group__4__Impl : ( ( rule__HasAndBelongsToMany__OptionsAssignment_4 )* ) ;
    public final void rule__HasAndBelongsToMany__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1626:1: ( ( ( rule__HasAndBelongsToMany__OptionsAssignment_4 )* ) )
            // InternalRails.g:1627:1: ( ( rule__HasAndBelongsToMany__OptionsAssignment_4 )* )
            {
            // InternalRails.g:1627:1: ( ( rule__HasAndBelongsToMany__OptionsAssignment_4 )* )
            // InternalRails.g:1628:1: ( rule__HasAndBelongsToMany__OptionsAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHasAndBelongsToManyAccess().getOptionsAssignment_4()); 
            }
            // InternalRails.g:1629:1: ( rule__HasAndBelongsToMany__OptionsAssignment_4 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==29) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalRails.g:1629:2: rule__HasAndBelongsToMany__OptionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__HasAndBelongsToMany__OptionsAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHasAndBelongsToManyAccess().getOptionsAssignment_4()); 
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
    // $ANTLR end "rule__HasAndBelongsToMany__Group__4__Impl"


    // $ANTLR start "rule__BelongsTo__Group__0"
    // InternalRails.g:1649:1: rule__BelongsTo__Group__0 : rule__BelongsTo__Group__0__Impl rule__BelongsTo__Group__1 ;
    public final void rule__BelongsTo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1653:1: ( rule__BelongsTo__Group__0__Impl rule__BelongsTo__Group__1 )
            // InternalRails.g:1654:2: rule__BelongsTo__Group__0__Impl rule__BelongsTo__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__BelongsTo__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BelongsTo__Group__1();

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
    // $ANTLR end "rule__BelongsTo__Group__0"


    // $ANTLR start "rule__BelongsTo__Group__0__Impl"
    // InternalRails.g:1661:1: rule__BelongsTo__Group__0__Impl : ( RULE_BELONGS_TO_WORD ) ;
    public final void rule__BelongsTo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1665:1: ( ( RULE_BELONGS_TO_WORD ) )
            // InternalRails.g:1666:1: ( RULE_BELONGS_TO_WORD )
            {
            // InternalRails.g:1666:1: ( RULE_BELONGS_TO_WORD )
            // InternalRails.g:1667:1: RULE_BELONGS_TO_WORD
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBelongsToAccess().getBELONGS_TO_WORDTerminalRuleCall_0()); 
            }
            match(input,RULE_BELONGS_TO_WORD,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBelongsToAccess().getBELONGS_TO_WORDTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__BelongsTo__Group__0__Impl"


    // $ANTLR start "rule__BelongsTo__Group__1"
    // InternalRails.g:1678:1: rule__BelongsTo__Group__1 : rule__BelongsTo__Group__1__Impl rule__BelongsTo__Group__2 ;
    public final void rule__BelongsTo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1682:1: ( rule__BelongsTo__Group__1__Impl rule__BelongsTo__Group__2 )
            // InternalRails.g:1683:2: rule__BelongsTo__Group__1__Impl rule__BelongsTo__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__BelongsTo__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BelongsTo__Group__2();

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
    // $ANTLR end "rule__BelongsTo__Group__1"


    // $ANTLR start "rule__BelongsTo__Group__1__Impl"
    // InternalRails.g:1690:1: rule__BelongsTo__Group__1__Impl : ( ( RULE_SPACE )* ) ;
    public final void rule__BelongsTo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1694:1: ( ( ( RULE_SPACE )* ) )
            // InternalRails.g:1695:1: ( ( RULE_SPACE )* )
            {
            // InternalRails.g:1695:1: ( ( RULE_SPACE )* )
            // InternalRails.g:1696:1: ( RULE_SPACE )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBelongsToAccess().getSPACETerminalRuleCall_1()); 
            }
            // InternalRails.g:1697:1: ( RULE_SPACE )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_SPACE) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalRails.g:1697:3: RULE_SPACE
            	    {
            	    match(input,RULE_SPACE,FOLLOW_4); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBelongsToAccess().getSPACETerminalRuleCall_1()); 
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
    // $ANTLR end "rule__BelongsTo__Group__1__Impl"


    // $ANTLR start "rule__BelongsTo__Group__2"
    // InternalRails.g:1707:1: rule__BelongsTo__Group__2 : rule__BelongsTo__Group__2__Impl rule__BelongsTo__Group__3 ;
    public final void rule__BelongsTo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1711:1: ( rule__BelongsTo__Group__2__Impl rule__BelongsTo__Group__3 )
            // InternalRails.g:1712:2: rule__BelongsTo__Group__2__Impl rule__BelongsTo__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__BelongsTo__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BelongsTo__Group__3();

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
    // $ANTLR end "rule__BelongsTo__Group__2"


    // $ANTLR start "rule__BelongsTo__Group__2__Impl"
    // InternalRails.g:1719:1: rule__BelongsTo__Group__2__Impl : ( ( rule__BelongsTo__NameAssignment_2 ) ) ;
    public final void rule__BelongsTo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1723:1: ( ( ( rule__BelongsTo__NameAssignment_2 ) ) )
            // InternalRails.g:1724:1: ( ( rule__BelongsTo__NameAssignment_2 ) )
            {
            // InternalRails.g:1724:1: ( ( rule__BelongsTo__NameAssignment_2 ) )
            // InternalRails.g:1725:1: ( rule__BelongsTo__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBelongsToAccess().getNameAssignment_2()); 
            }
            // InternalRails.g:1726:1: ( rule__BelongsTo__NameAssignment_2 )
            // InternalRails.g:1726:2: rule__BelongsTo__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__BelongsTo__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBelongsToAccess().getNameAssignment_2()); 
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
    // $ANTLR end "rule__BelongsTo__Group__2__Impl"


    // $ANTLR start "rule__BelongsTo__Group__3"
    // InternalRails.g:1736:1: rule__BelongsTo__Group__3 : rule__BelongsTo__Group__3__Impl rule__BelongsTo__Group__4 ;
    public final void rule__BelongsTo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1740:1: ( rule__BelongsTo__Group__3__Impl rule__BelongsTo__Group__4 )
            // InternalRails.g:1741:2: rule__BelongsTo__Group__3__Impl rule__BelongsTo__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__BelongsTo__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BelongsTo__Group__4();

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
    // $ANTLR end "rule__BelongsTo__Group__3"


    // $ANTLR start "rule__BelongsTo__Group__3__Impl"
    // InternalRails.g:1748:1: rule__BelongsTo__Group__3__Impl : ( ( RULE_SPACE )* ) ;
    public final void rule__BelongsTo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1752:1: ( ( ( RULE_SPACE )* ) )
            // InternalRails.g:1753:1: ( ( RULE_SPACE )* )
            {
            // InternalRails.g:1753:1: ( ( RULE_SPACE )* )
            // InternalRails.g:1754:1: ( RULE_SPACE )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBelongsToAccess().getSPACETerminalRuleCall_3()); 
            }
            // InternalRails.g:1755:1: ( RULE_SPACE )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_SPACE) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalRails.g:1755:3: RULE_SPACE
            	    {
            	    match(input,RULE_SPACE,FOLLOW_4); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBelongsToAccess().getSPACETerminalRuleCall_3()); 
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
    // $ANTLR end "rule__BelongsTo__Group__3__Impl"


    // $ANTLR start "rule__BelongsTo__Group__4"
    // InternalRails.g:1765:1: rule__BelongsTo__Group__4 : rule__BelongsTo__Group__4__Impl ;
    public final void rule__BelongsTo__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1769:1: ( rule__BelongsTo__Group__4__Impl )
            // InternalRails.g:1770:2: rule__BelongsTo__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BelongsTo__Group__4__Impl();

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
    // $ANTLR end "rule__BelongsTo__Group__4"


    // $ANTLR start "rule__BelongsTo__Group__4__Impl"
    // InternalRails.g:1776:1: rule__BelongsTo__Group__4__Impl : ( ( rule__BelongsTo__OptionsAssignment_4 )* ) ;
    public final void rule__BelongsTo__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1780:1: ( ( ( rule__BelongsTo__OptionsAssignment_4 )* ) )
            // InternalRails.g:1781:1: ( ( rule__BelongsTo__OptionsAssignment_4 )* )
            {
            // InternalRails.g:1781:1: ( ( rule__BelongsTo__OptionsAssignment_4 )* )
            // InternalRails.g:1782:1: ( rule__BelongsTo__OptionsAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBelongsToAccess().getOptionsAssignment_4()); 
            }
            // InternalRails.g:1783:1: ( rule__BelongsTo__OptionsAssignment_4 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==29) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalRails.g:1783:2: rule__BelongsTo__OptionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__BelongsTo__OptionsAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBelongsToAccess().getOptionsAssignment_4()); 
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
    // $ANTLR end "rule__BelongsTo__Group__4__Impl"


    // $ANTLR start "rule__HashKeyValue__Group__0"
    // InternalRails.g:1803:1: rule__HashKeyValue__Group__0 : rule__HashKeyValue__Group__0__Impl rule__HashKeyValue__Group__1 ;
    public final void rule__HashKeyValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1807:1: ( rule__HashKeyValue__Group__0__Impl rule__HashKeyValue__Group__1 )
            // InternalRails.g:1808:2: rule__HashKeyValue__Group__0__Impl rule__HashKeyValue__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__HashKeyValue__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__HashKeyValue__Group__1();

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
    // $ANTLR end "rule__HashKeyValue__Group__0"


    // $ANTLR start "rule__HashKeyValue__Group__0__Impl"
    // InternalRails.g:1815:1: rule__HashKeyValue__Group__0__Impl : ( ',' ) ;
    public final void rule__HashKeyValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1819:1: ( ( ',' ) )
            // InternalRails.g:1820:1: ( ',' )
            {
            // InternalRails.g:1820:1: ( ',' )
            // InternalRails.g:1821:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHashKeyValueAccess().getCommaKeyword_0()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHashKeyValueAccess().getCommaKeyword_0()); 
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
    // $ANTLR end "rule__HashKeyValue__Group__0__Impl"


    // $ANTLR start "rule__HashKeyValue__Group__1"
    // InternalRails.g:1834:1: rule__HashKeyValue__Group__1 : rule__HashKeyValue__Group__1__Impl rule__HashKeyValue__Group__2 ;
    public final void rule__HashKeyValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1838:1: ( rule__HashKeyValue__Group__1__Impl rule__HashKeyValue__Group__2 )
            // InternalRails.g:1839:2: rule__HashKeyValue__Group__1__Impl rule__HashKeyValue__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__HashKeyValue__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__HashKeyValue__Group__2();

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
    // $ANTLR end "rule__HashKeyValue__Group__1"


    // $ANTLR start "rule__HashKeyValue__Group__1__Impl"
    // InternalRails.g:1846:1: rule__HashKeyValue__Group__1__Impl : ( ( RULE_SPACE )* ) ;
    public final void rule__HashKeyValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1850:1: ( ( ( RULE_SPACE )* ) )
            // InternalRails.g:1851:1: ( ( RULE_SPACE )* )
            {
            // InternalRails.g:1851:1: ( ( RULE_SPACE )* )
            // InternalRails.g:1852:1: ( RULE_SPACE )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHashKeyValueAccess().getSPACETerminalRuleCall_1()); 
            }
            // InternalRails.g:1853:1: ( RULE_SPACE )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_SPACE) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalRails.g:1853:3: RULE_SPACE
            	    {
            	    match(input,RULE_SPACE,FOLLOW_4); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHashKeyValueAccess().getSPACETerminalRuleCall_1()); 
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
    // $ANTLR end "rule__HashKeyValue__Group__1__Impl"


    // $ANTLR start "rule__HashKeyValue__Group__2"
    // InternalRails.g:1863:1: rule__HashKeyValue__Group__2 : rule__HashKeyValue__Group__2__Impl rule__HashKeyValue__Group__3 ;
    public final void rule__HashKeyValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1867:1: ( rule__HashKeyValue__Group__2__Impl rule__HashKeyValue__Group__3 )
            // InternalRails.g:1868:2: rule__HashKeyValue__Group__2__Impl rule__HashKeyValue__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__HashKeyValue__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__HashKeyValue__Group__3();

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
    // $ANTLR end "rule__HashKeyValue__Group__2"


    // $ANTLR start "rule__HashKeyValue__Group__2__Impl"
    // InternalRails.g:1875:1: rule__HashKeyValue__Group__2__Impl : ( ( rule__HashKeyValue__Alternatives_2 ) ) ;
    public final void rule__HashKeyValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1879:1: ( ( ( rule__HashKeyValue__Alternatives_2 ) ) )
            // InternalRails.g:1880:1: ( ( rule__HashKeyValue__Alternatives_2 ) )
            {
            // InternalRails.g:1880:1: ( ( rule__HashKeyValue__Alternatives_2 ) )
            // InternalRails.g:1881:1: ( rule__HashKeyValue__Alternatives_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHashKeyValueAccess().getAlternatives_2()); 
            }
            // InternalRails.g:1882:1: ( rule__HashKeyValue__Alternatives_2 )
            // InternalRails.g:1882:2: rule__HashKeyValue__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__HashKeyValue__Alternatives_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHashKeyValueAccess().getAlternatives_2()); 
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
    // $ANTLR end "rule__HashKeyValue__Group__2__Impl"


    // $ANTLR start "rule__HashKeyValue__Group__3"
    // InternalRails.g:1892:1: rule__HashKeyValue__Group__3 : rule__HashKeyValue__Group__3__Impl rule__HashKeyValue__Group__4 ;
    public final void rule__HashKeyValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1896:1: ( rule__HashKeyValue__Group__3__Impl rule__HashKeyValue__Group__4 )
            // InternalRails.g:1897:2: rule__HashKeyValue__Group__3__Impl rule__HashKeyValue__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__HashKeyValue__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__HashKeyValue__Group__4();

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
    // $ANTLR end "rule__HashKeyValue__Group__3"


    // $ANTLR start "rule__HashKeyValue__Group__3__Impl"
    // InternalRails.g:1904:1: rule__HashKeyValue__Group__3__Impl : ( ( RULE_SPACE )* ) ;
    public final void rule__HashKeyValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1908:1: ( ( ( RULE_SPACE )* ) )
            // InternalRails.g:1909:1: ( ( RULE_SPACE )* )
            {
            // InternalRails.g:1909:1: ( ( RULE_SPACE )* )
            // InternalRails.g:1910:1: ( RULE_SPACE )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHashKeyValueAccess().getSPACETerminalRuleCall_3()); 
            }
            // InternalRails.g:1911:1: ( RULE_SPACE )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_SPACE) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalRails.g:1911:3: RULE_SPACE
            	    {
            	    match(input,RULE_SPACE,FOLLOW_4); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHashKeyValueAccess().getSPACETerminalRuleCall_3()); 
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
    // $ANTLR end "rule__HashKeyValue__Group__3__Impl"


    // $ANTLR start "rule__HashKeyValue__Group__4"
    // InternalRails.g:1921:1: rule__HashKeyValue__Group__4 : rule__HashKeyValue__Group__4__Impl rule__HashKeyValue__Group__5 ;
    public final void rule__HashKeyValue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1925:1: ( rule__HashKeyValue__Group__4__Impl rule__HashKeyValue__Group__5 )
            // InternalRails.g:1926:2: rule__HashKeyValue__Group__4__Impl rule__HashKeyValue__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__HashKeyValue__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__HashKeyValue__Group__5();

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
    // $ANTLR end "rule__HashKeyValue__Group__4"


    // $ANTLR start "rule__HashKeyValue__Group__4__Impl"
    // InternalRails.g:1933:1: rule__HashKeyValue__Group__4__Impl : ( ( rule__HashKeyValue__ValueAssignment_4 ) ) ;
    public final void rule__HashKeyValue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1937:1: ( ( ( rule__HashKeyValue__ValueAssignment_4 ) ) )
            // InternalRails.g:1938:1: ( ( rule__HashKeyValue__ValueAssignment_4 ) )
            {
            // InternalRails.g:1938:1: ( ( rule__HashKeyValue__ValueAssignment_4 ) )
            // InternalRails.g:1939:1: ( rule__HashKeyValue__ValueAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHashKeyValueAccess().getValueAssignment_4()); 
            }
            // InternalRails.g:1940:1: ( rule__HashKeyValue__ValueAssignment_4 )
            // InternalRails.g:1940:2: rule__HashKeyValue__ValueAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__HashKeyValue__ValueAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHashKeyValueAccess().getValueAssignment_4()); 
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
    // $ANTLR end "rule__HashKeyValue__Group__4__Impl"


    // $ANTLR start "rule__HashKeyValue__Group__5"
    // InternalRails.g:1950:1: rule__HashKeyValue__Group__5 : rule__HashKeyValue__Group__5__Impl ;
    public final void rule__HashKeyValue__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1954:1: ( rule__HashKeyValue__Group__5__Impl )
            // InternalRails.g:1955:2: rule__HashKeyValue__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HashKeyValue__Group__5__Impl();

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
    // $ANTLR end "rule__HashKeyValue__Group__5"


    // $ANTLR start "rule__HashKeyValue__Group__5__Impl"
    // InternalRails.g:1961:1: rule__HashKeyValue__Group__5__Impl : ( ( RULE_SPACE )* ) ;
    public final void rule__HashKeyValue__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1965:1: ( ( ( RULE_SPACE )* ) )
            // InternalRails.g:1966:1: ( ( RULE_SPACE )* )
            {
            // InternalRails.g:1966:1: ( ( RULE_SPACE )* )
            // InternalRails.g:1967:1: ( RULE_SPACE )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHashKeyValueAccess().getSPACETerminalRuleCall_5()); 
            }
            // InternalRails.g:1968:1: ( RULE_SPACE )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_SPACE) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalRails.g:1968:3: RULE_SPACE
            	    {
            	    match(input,RULE_SPACE,FOLLOW_4); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHashKeyValueAccess().getSPACETerminalRuleCall_5()); 
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
    // $ANTLR end "rule__HashKeyValue__Group__5__Impl"


    // $ANTLR start "rule__HashKeyValue__Group_2_0__0"
    // InternalRails.g:1990:1: rule__HashKeyValue__Group_2_0__0 : rule__HashKeyValue__Group_2_0__0__Impl rule__HashKeyValue__Group_2_0__1 ;
    public final void rule__HashKeyValue__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1994:1: ( rule__HashKeyValue__Group_2_0__0__Impl rule__HashKeyValue__Group_2_0__1 )
            // InternalRails.g:1995:2: rule__HashKeyValue__Group_2_0__0__Impl rule__HashKeyValue__Group_2_0__1
            {
            pushFollow(FOLLOW_20);
            rule__HashKeyValue__Group_2_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__HashKeyValue__Group_2_0__1();

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
    // $ANTLR end "rule__HashKeyValue__Group_2_0__0"


    // $ANTLR start "rule__HashKeyValue__Group_2_0__0__Impl"
    // InternalRails.g:2002:1: rule__HashKeyValue__Group_2_0__0__Impl : ( ( rule__HashKeyValue__KeyAssignment_2_0_0 ) ) ;
    public final void rule__HashKeyValue__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:2006:1: ( ( ( rule__HashKeyValue__KeyAssignment_2_0_0 ) ) )
            // InternalRails.g:2007:1: ( ( rule__HashKeyValue__KeyAssignment_2_0_0 ) )
            {
            // InternalRails.g:2007:1: ( ( rule__HashKeyValue__KeyAssignment_2_0_0 ) )
            // InternalRails.g:2008:1: ( rule__HashKeyValue__KeyAssignment_2_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHashKeyValueAccess().getKeyAssignment_2_0_0()); 
            }
            // InternalRails.g:2009:1: ( rule__HashKeyValue__KeyAssignment_2_0_0 )
            // InternalRails.g:2009:2: rule__HashKeyValue__KeyAssignment_2_0_0
            {
            pushFollow(FOLLOW_2);
            rule__HashKeyValue__KeyAssignment_2_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHashKeyValueAccess().getKeyAssignment_2_0_0()); 
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
    // $ANTLR end "rule__HashKeyValue__Group_2_0__0__Impl"


    // $ANTLR start "rule__HashKeyValue__Group_2_0__1"
    // InternalRails.g:2019:1: rule__HashKeyValue__Group_2_0__1 : rule__HashKeyValue__Group_2_0__1__Impl ;
    public final void rule__HashKeyValue__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:2023:1: ( rule__HashKeyValue__Group_2_0__1__Impl )
            // InternalRails.g:2024:2: rule__HashKeyValue__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HashKeyValue__Group_2_0__1__Impl();

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
    // $ANTLR end "rule__HashKeyValue__Group_2_0__1"


    // $ANTLR start "rule__HashKeyValue__Group_2_0__1__Impl"
    // InternalRails.g:2030:1: rule__HashKeyValue__Group_2_0__1__Impl : ( ':' ) ;
    public final void rule__HashKeyValue__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:2034:1: ( ( ':' ) )
            // InternalRails.g:2035:1: ( ':' )
            {
            // InternalRails.g:2035:1: ( ':' )
            // InternalRails.g:2036:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHashKeyValueAccess().getColonKeyword_2_0_1()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHashKeyValueAccess().getColonKeyword_2_0_1()); 
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
    // $ANTLR end "rule__HashKeyValue__Group_2_0__1__Impl"


    // $ANTLR start "rule__HashKeyValue__Group_2_1__0"
    // InternalRails.g:2053:1: rule__HashKeyValue__Group_2_1__0 : rule__HashKeyValue__Group_2_1__0__Impl rule__HashKeyValue__Group_2_1__1 ;
    public final void rule__HashKeyValue__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:2057:1: ( rule__HashKeyValue__Group_2_1__0__Impl rule__HashKeyValue__Group_2_1__1 )
            // InternalRails.g:2058:2: rule__HashKeyValue__Group_2_1__0__Impl rule__HashKeyValue__Group_2_1__1
            {
            pushFollow(FOLLOW_21);
            rule__HashKeyValue__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__HashKeyValue__Group_2_1__1();

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
    // $ANTLR end "rule__HashKeyValue__Group_2_1__0"


    // $ANTLR start "rule__HashKeyValue__Group_2_1__0__Impl"
    // InternalRails.g:2065:1: rule__HashKeyValue__Group_2_1__0__Impl : ( ( rule__HashKeyValue__KeyAssignment_2_1_0 ) ) ;
    public final void rule__HashKeyValue__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:2069:1: ( ( ( rule__HashKeyValue__KeyAssignment_2_1_0 ) ) )
            // InternalRails.g:2070:1: ( ( rule__HashKeyValue__KeyAssignment_2_1_0 ) )
            {
            // InternalRails.g:2070:1: ( ( rule__HashKeyValue__KeyAssignment_2_1_0 ) )
            // InternalRails.g:2071:1: ( rule__HashKeyValue__KeyAssignment_2_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHashKeyValueAccess().getKeyAssignment_2_1_0()); 
            }
            // InternalRails.g:2072:1: ( rule__HashKeyValue__KeyAssignment_2_1_0 )
            // InternalRails.g:2072:2: rule__HashKeyValue__KeyAssignment_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__HashKeyValue__KeyAssignment_2_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHashKeyValueAccess().getKeyAssignment_2_1_0()); 
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
    // $ANTLR end "rule__HashKeyValue__Group_2_1__0__Impl"


    // $ANTLR start "rule__HashKeyValue__Group_2_1__1"
    // InternalRails.g:2082:1: rule__HashKeyValue__Group_2_1__1 : rule__HashKeyValue__Group_2_1__1__Impl rule__HashKeyValue__Group_2_1__2 ;
    public final void rule__HashKeyValue__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:2086:1: ( rule__HashKeyValue__Group_2_1__1__Impl rule__HashKeyValue__Group_2_1__2 )
            // InternalRails.g:2087:2: rule__HashKeyValue__Group_2_1__1__Impl rule__HashKeyValue__Group_2_1__2
            {
            pushFollow(FOLLOW_21);
            rule__HashKeyValue__Group_2_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__HashKeyValue__Group_2_1__2();

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
    // $ANTLR end "rule__HashKeyValue__Group_2_1__1"


    // $ANTLR start "rule__HashKeyValue__Group_2_1__1__Impl"
    // InternalRails.g:2094:1: rule__HashKeyValue__Group_2_1__1__Impl : ( ( RULE_SPACE )* ) ;
    public final void rule__HashKeyValue__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:2098:1: ( ( ( RULE_SPACE )* ) )
            // InternalRails.g:2099:1: ( ( RULE_SPACE )* )
            {
            // InternalRails.g:2099:1: ( ( RULE_SPACE )* )
            // InternalRails.g:2100:1: ( RULE_SPACE )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHashKeyValueAccess().getSPACETerminalRuleCall_2_1_1()); 
            }
            // InternalRails.g:2101:1: ( RULE_SPACE )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_SPACE) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalRails.g:2101:3: RULE_SPACE
            	    {
            	    match(input,RULE_SPACE,FOLLOW_4); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHashKeyValueAccess().getSPACETerminalRuleCall_2_1_1()); 
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
    // $ANTLR end "rule__HashKeyValue__Group_2_1__1__Impl"


    // $ANTLR start "rule__HashKeyValue__Group_2_1__2"
    // InternalRails.g:2111:1: rule__HashKeyValue__Group_2_1__2 : rule__HashKeyValue__Group_2_1__2__Impl ;
    public final void rule__HashKeyValue__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:2115:1: ( rule__HashKeyValue__Group_2_1__2__Impl )
            // InternalRails.g:2116:2: rule__HashKeyValue__Group_2_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HashKeyValue__Group_2_1__2__Impl();

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
    // $ANTLR end "rule__HashKeyValue__Group_2_1__2"


    // $ANTLR start "rule__HashKeyValue__Group_2_1__2__Impl"
    // InternalRails.g:2122:1: rule__HashKeyValue__Group_2_1__2__Impl : ( '=>' ) ;
    public final void rule__HashKeyValue__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:2126:1: ( ( '=>' ) )
            // InternalRails.g:2127:1: ( '=>' )
            {
            // InternalRails.g:2127:1: ( '=>' )
            // InternalRails.g:2128:1: '=>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHashKeyValueAccess().getEqualsSignGreaterThanSignKeyword_2_1_2()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHashKeyValueAccess().getEqualsSignGreaterThanSignKeyword_2_1_2()); 
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
    // $ANTLR end "rule__HashKeyValue__Group_2_1__2__Impl"


    // $ANTLR start "rule__Method__Group__0"
    // InternalRails.g:2147:1: rule__Method__Group__0 : rule__Method__Group__0__Impl rule__Method__Group__1 ;
    public final void rule__Method__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:2151:1: ( rule__Method__Group__0__Impl rule__Method__Group__1 )
            // InternalRails.g:2152:2: rule__Method__Group__0__Impl rule__Method__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Method__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Method__Group__1();

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
    // $ANTLR end "rule__Method__Group__0"


    // $ANTLR start "rule__Method__Group__0__Impl"
    // InternalRails.g:2159:1: rule__Method__Group__0__Impl : ( RULE_DEF_WORD ) ;
    public final void rule__Method__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:2163:1: ( ( RULE_DEF_WORD ) )
            // InternalRails.g:2164:1: ( RULE_DEF_WORD )
            {
            // InternalRails.g:2164:1: ( RULE_DEF_WORD )
            // InternalRails.g:2165:1: RULE_DEF_WORD
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getDEF_WORDTerminalRuleCall_0()); 
            }
            match(input,RULE_DEF_WORD,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getDEF_WORDTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__Method__Group__0__Impl"


    // $ANTLR start "rule__Method__Group__1"
    // InternalRails.g:2176:1: rule__Method__Group__1 : rule__Method__Group__1__Impl rule__Method__Group__2 ;
    public final void rule__Method__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:2180:1: ( rule__Method__Group__1__Impl rule__Method__Group__2 )
            // InternalRails.g:2181:2: rule__Method__Group__1__Impl rule__Method__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Method__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Method__Group__2();

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
    // $ANTLR end "rule__Method__Group__1"


    // $ANTLR start "rule__Method__Group__1__Impl"
    // InternalRails.g:2188:1: rule__Method__Group__1__Impl : ( ( RULE_SPACE )* ) ;
    public final void rule__Method__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:2192:1: ( ( ( RULE_SPACE )* ) )
            // InternalRails.g:2193:1: ( ( RULE_SPACE )* )
            {
            // InternalRails.g:2193:1: ( ( RULE_SPACE )* )
            // InternalRails.g:2194:1: ( RULE_SPACE )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getSPACETerminalRuleCall_1()); 
            }
            // InternalRails.g:2195:1: ( RULE_SPACE )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_SPACE) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalRails.g:2195:3: RULE_SPACE
            	    {
            	    match(input,RULE_SPACE,FOLLOW_4); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getSPACETerminalRuleCall_1()); 
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
    // $ANTLR end "rule__Method__Group__1__Impl"


    // $ANTLR start "rule__Method__Group__2"
    // InternalRails.g:2205:1: rule__Method__Group__2 : rule__Method__Group__2__Impl rule__Method__Group__3 ;
    public final void rule__Method__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:2209:1: ( rule__Method__Group__2__Impl rule__Method__Group__3 )
            // InternalRails.g:2210:2: rule__Method__Group__2__Impl rule__Method__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__Method__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Method__Group__3();

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
    // $ANTLR end "rule__Method__Group__2"


    // $ANTLR start "rule__Method__Group__2__Impl"
    // InternalRails.g:2217:1: rule__Method__Group__2__Impl : ( ( rule__Method__NameAssignment_2 ) ) ;
    public final void rule__Method__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:2221:1: ( ( ( rule__Method__NameAssignment_2 ) ) )
            // InternalRails.g:2222:1: ( ( rule__Method__NameAssignment_2 ) )
            {
            // InternalRails.g:2222:1: ( ( rule__Method__NameAssignment_2 ) )
            // InternalRails.g:2223:1: ( rule__Method__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getNameAssignment_2()); 
            }
            // InternalRails.g:2224:1: ( rule__Method__NameAssignment_2 )
            // InternalRails.g:2224:2: rule__Method__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Method__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getNameAssignment_2()); 
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
    // $ANTLR end "rule__Method__Group__2__Impl"


    // $ANTLR start "rule__Method__Group__3"
    // InternalRails.g:2234:1: rule__Method__Group__3 : rule__Method__Group__3__Impl rule__Method__Group__4 ;
    public final void rule__Method__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:2238:1: ( rule__Method__Group__3__Impl rule__Method__Group__4 )
            // InternalRails.g:2239:2: rule__Method__Group__3__Impl rule__Method__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__Method__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Method__Group__4();

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
    // $ANTLR end "rule__Method__Group__3"


    // $ANTLR start "rule__Method__Group__3__Impl"
    // InternalRails.g:2246:1: rule__Method__Group__3__Impl : ( ( RULE_SPACE )* ) ;
    public final void rule__Method__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:2250:1: ( ( ( RULE_SPACE )* ) )
            // InternalRails.g:2251:1: ( ( RULE_SPACE )* )
            {
            // InternalRails.g:2251:1: ( ( RULE_SPACE )* )
            // InternalRails.g:2252:1: ( RULE_SPACE )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getSPACETerminalRuleCall_3()); 
            }
            // InternalRails.g:2253:1: ( RULE_SPACE )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_SPACE) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalRails.g:2253:3: RULE_SPACE
            	    {
            	    match(input,RULE_SPACE,FOLLOW_4); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getSPACETerminalRuleCall_3()); 
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
    // $ANTLR end "rule__Method__Group__3__Impl"


    // $ANTLR start "rule__Method__Group__4"
    // InternalRails.g:2263:1: rule__Method__Group__4 : rule__Method__Group__4__Impl rule__Method__Group__5 ;
    public final void rule__Method__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:2267:1: ( rule__Method__Group__4__Impl rule__Method__Group__5 )
            // InternalRails.g:2268:2: rule__Method__Group__4__Impl rule__Method__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__Method__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Method__Group__5();

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
    // $ANTLR end "rule__Method__Group__4"


    // $ANTLR start "rule__Method__Group__4__Impl"
    // InternalRails.g:2275:1: rule__Method__Group__4__Impl : ( ( RULE_PARENTHESIS_BLOCK )? ) ;
    public final void rule__Method__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:2279:1: ( ( ( RULE_PARENTHESIS_BLOCK )? ) )
            // InternalRails.g:2280:1: ( ( RULE_PARENTHESIS_BLOCK )? )
            {
            // InternalRails.g:2280:1: ( ( RULE_PARENTHESIS_BLOCK )? )
            // InternalRails.g:2281:1: ( RULE_PARENTHESIS_BLOCK )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getPARENTHESIS_BLOCKTerminalRuleCall_4()); 
            }
            // InternalRails.g:2282:1: ( RULE_PARENTHESIS_BLOCK )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_PARENTHESIS_BLOCK) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalRails.g:2282:3: RULE_PARENTHESIS_BLOCK
                    {
                    match(input,RULE_PARENTHESIS_BLOCK,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getPARENTHESIS_BLOCKTerminalRuleCall_4()); 
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
    // $ANTLR end "rule__Method__Group__4__Impl"


    // $ANTLR start "rule__Method__Group__5"
    // InternalRails.g:2292:1: rule__Method__Group__5 : rule__Method__Group__5__Impl ;
    public final void rule__Method__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:2296:1: ( rule__Method__Group__5__Impl )
            // InternalRails.g:2297:2: rule__Method__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group__5__Impl();

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
    // $ANTLR end "rule__Method__Group__5"


    // $ANTLR start "rule__Method__Group__5__Impl"
    // InternalRails.g:2303:1: rule__Method__Group__5__Impl : ( ( RULE_UNTIL_END ) ) ;
    public final void rule__Method__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:2307:1: ( ( ( RULE_UNTIL_END ) ) )
            // InternalRails.g:2308:1: ( ( RULE_UNTIL_END ) )
            {
            // InternalRails.g:2308:1: ( ( RULE_UNTIL_END ) )
            // InternalRails.g:2309:1: ( RULE_UNTIL_END )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getUNTIL_ENDTerminalRuleCall_5()); 
            }
            // InternalRails.g:2310:1: ( RULE_UNTIL_END )
            // InternalRails.g:2310:3: RULE_UNTIL_END
            {
            match(input,RULE_UNTIL_END,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getUNTIL_ENDTerminalRuleCall_5()); 
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
    // $ANTLR end "rule__Method__Group__5__Impl"


    // $ANTLR start "rule__MethodName__Group__0"
    // InternalRails.g:2332:1: rule__MethodName__Group__0 : rule__MethodName__Group__0__Impl rule__MethodName__Group__1 ;
    public final void rule__MethodName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:2336:1: ( rule__MethodName__Group__0__Impl rule__MethodName__Group__1 )
            // InternalRails.g:2337:2: rule__MethodName__Group__0__Impl rule__MethodName__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__MethodName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MethodName__Group__1();

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
    // $ANTLR end "rule__MethodName__Group__0"


    // $ANTLR start "rule__MethodName__Group__0__Impl"
    // InternalRails.g:2344:1: rule__MethodName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__MethodName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:2348:1: ( ( RULE_ID ) )
            // InternalRails.g:2349:1: ( RULE_ID )
            {
            // InternalRails.g:2349:1: ( RULE_ID )
            // InternalRails.g:2350:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodNameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodNameAccess().getIDTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__MethodName__Group__0__Impl"


    // $ANTLR start "rule__MethodName__Group__1"
    // InternalRails.g:2361:1: rule__MethodName__Group__1 : rule__MethodName__Group__1__Impl ;
    public final void rule__MethodName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:2365:1: ( rule__MethodName__Group__1__Impl )
            // InternalRails.g:2366:2: rule__MethodName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MethodName__Group__1__Impl();

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
    // $ANTLR end "rule__MethodName__Group__1"


    // $ANTLR start "rule__MethodName__Group__1__Impl"
    // InternalRails.g:2372:1: rule__MethodName__Group__1__Impl : ( ( rule__MethodName__Alternatives_1 )? ) ;
    public final void rule__MethodName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:2376:1: ( ( ( rule__MethodName__Alternatives_1 )? ) )
            // InternalRails.g:2377:1: ( ( rule__MethodName__Alternatives_1 )? )
            {
            // InternalRails.g:2377:1: ( ( rule__MethodName__Alternatives_1 )? )
            // InternalRails.g:2378:1: ( rule__MethodName__Alternatives_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodNameAccess().getAlternatives_1()); 
            }
            // InternalRails.g:2379:1: ( rule__MethodName__Alternatives_1 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=24 && LA39_0<=25)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalRails.g:2379:2: rule__MethodName__Alternatives_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__MethodName__Alternatives_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodNameAccess().getAlternatives_1()); 
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
    // $ANTLR end "rule__MethodName__Group__1__Impl"


    // $ANTLR start "rule__Class__NameAssignment_2"
    // InternalRails.g:2394:1: rule__Class__NameAssignment_2 : ( ruleNamespacedModuleName ) ;
    public final void rule__Class__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:2398:1: ( ( ruleNamespacedModuleName ) )
            // InternalRails.g:2399:1: ( ruleNamespacedModuleName )
            {
            // InternalRails.g:2399:1: ( ruleNamespacedModuleName )
            // InternalRails.g:2400:1: ruleNamespacedModuleName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getNameNamespacedModuleNameParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNamespacedModuleName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getNameNamespacedModuleNameParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__Class__NameAssignment_2"


    // $ANTLR start "rule__Class__SuperTypeAssignment_3_3"
    // InternalRails.g:2409:1: rule__Class__SuperTypeAssignment_3_3 : ( ruleNamespacedModuleName ) ;
    public final void rule__Class__SuperTypeAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:2413:1: ( ( ruleNamespacedModuleName ) )
            // InternalRails.g:2414:1: ( ruleNamespacedModuleName )
            {
            // InternalRails.g:2414:1: ( ruleNamespacedModuleName )
            // InternalRails.g:2415:1: ruleNamespacedModuleName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getSuperTypeNamespacedModuleNameParserRuleCall_3_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNamespacedModuleName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getSuperTypeNamespacedModuleNameParserRuleCall_3_3_0()); 
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
    // $ANTLR end "rule__Class__SuperTypeAssignment_3_3"


    // $ANTLR start "rule__Class__ClassElementsAssignment_5"
    // InternalRails.g:2424:1: rule__Class__ClassElementsAssignment_5 : ( ruleClassElement ) ;
    public final void rule__Class__ClassElementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:2428:1: ( ( ruleClassElement ) )
            // InternalRails.g:2429:1: ( ruleClassElement )
            {
            // InternalRails.g:2429:1: ( ruleClassElement )
            // InternalRails.g:2430:1: ruleClassElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getClassElementsClassElementParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleClassElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getClassElementsClassElementParserRuleCall_5_0()); 
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
    // $ANTLR end "rule__Class__ClassElementsAssignment_5"


    // $ANTLR start "rule__HasMany__NameAssignment_2"
    // InternalRails.g:2439:1: rule__HasMany__NameAssignment_2 : ( ( rule__HasMany__NameAlternatives_2_0 ) ) ;
    public final void rule__HasMany__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:2443:1: ( ( ( rule__HasMany__NameAlternatives_2_0 ) ) )
            // InternalRails.g:2444:1: ( ( rule__HasMany__NameAlternatives_2_0 ) )
            {
            // InternalRails.g:2444:1: ( ( rule__HasMany__NameAlternatives_2_0 ) )
            // InternalRails.g:2445:1: ( rule__HasMany__NameAlternatives_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHasManyAccess().getNameAlternatives_2_0()); 
            }
            // InternalRails.g:2446:1: ( rule__HasMany__NameAlternatives_2_0 )
            // InternalRails.g:2446:2: rule__HasMany__NameAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__HasMany__NameAlternatives_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHasManyAccess().getNameAlternatives_2_0()); 
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
    // $ANTLR end "rule__HasMany__NameAssignment_2"


    // $ANTLR start "rule__HasMany__OptionsAssignment_4"
    // InternalRails.g:2455:1: rule__HasMany__OptionsAssignment_4 : ( ruleHashKeyValue ) ;
    public final void rule__HasMany__OptionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:2459:1: ( ( ruleHashKeyValue ) )
            // InternalRails.g:2460:1: ( ruleHashKeyValue )
            {
            // InternalRails.g:2460:1: ( ruleHashKeyValue )
            // InternalRails.g:2461:1: ruleHashKeyValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHasManyAccess().getOptionsHashKeyValueParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleHashKeyValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHasManyAccess().getOptionsHashKeyValueParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__HasMany__OptionsAssignment_4"


    // $ANTLR start "rule__HasAndBelongsToMany__NameAssignment_2"
    // InternalRails.g:2470:1: rule__HasAndBelongsToMany__NameAssignment_2 : ( ( rule__HasAndBelongsToMany__NameAlternatives_2_0 ) ) ;
    public final void rule__HasAndBelongsToMany__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:2474:1: ( ( ( rule__HasAndBelongsToMany__NameAlternatives_2_0 ) ) )
            // InternalRails.g:2475:1: ( ( rule__HasAndBelongsToMany__NameAlternatives_2_0 ) )
            {
            // InternalRails.g:2475:1: ( ( rule__HasAndBelongsToMany__NameAlternatives_2_0 ) )
            // InternalRails.g:2476:1: ( rule__HasAndBelongsToMany__NameAlternatives_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHasAndBelongsToManyAccess().getNameAlternatives_2_0()); 
            }
            // InternalRails.g:2477:1: ( rule__HasAndBelongsToMany__NameAlternatives_2_0 )
            // InternalRails.g:2477:2: rule__HasAndBelongsToMany__NameAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__HasAndBelongsToMany__NameAlternatives_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHasAndBelongsToManyAccess().getNameAlternatives_2_0()); 
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
    // $ANTLR end "rule__HasAndBelongsToMany__NameAssignment_2"


    // $ANTLR start "rule__HasAndBelongsToMany__OptionsAssignment_4"
    // InternalRails.g:2486:1: rule__HasAndBelongsToMany__OptionsAssignment_4 : ( ruleHashKeyValue ) ;
    public final void rule__HasAndBelongsToMany__OptionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:2490:1: ( ( ruleHashKeyValue ) )
            // InternalRails.g:2491:1: ( ruleHashKeyValue )
            {
            // InternalRails.g:2491:1: ( ruleHashKeyValue )
            // InternalRails.g:2492:1: ruleHashKeyValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHasAndBelongsToManyAccess().getOptionsHashKeyValueParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleHashKeyValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHasAndBelongsToManyAccess().getOptionsHashKeyValueParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__HasAndBelongsToMany__OptionsAssignment_4"


    // $ANTLR start "rule__BelongsTo__NameAssignment_2"
    // InternalRails.g:2501:1: rule__BelongsTo__NameAssignment_2 : ( ( rule__BelongsTo__NameAlternatives_2_0 ) ) ;
    public final void rule__BelongsTo__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:2505:1: ( ( ( rule__BelongsTo__NameAlternatives_2_0 ) ) )
            // InternalRails.g:2506:1: ( ( rule__BelongsTo__NameAlternatives_2_0 ) )
            {
            // InternalRails.g:2506:1: ( ( rule__BelongsTo__NameAlternatives_2_0 ) )
            // InternalRails.g:2507:1: ( rule__BelongsTo__NameAlternatives_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBelongsToAccess().getNameAlternatives_2_0()); 
            }
            // InternalRails.g:2508:1: ( rule__BelongsTo__NameAlternatives_2_0 )
            // InternalRails.g:2508:2: rule__BelongsTo__NameAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__BelongsTo__NameAlternatives_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBelongsToAccess().getNameAlternatives_2_0()); 
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
    // $ANTLR end "rule__BelongsTo__NameAssignment_2"


    // $ANTLR start "rule__BelongsTo__OptionsAssignment_4"
    // InternalRails.g:2517:1: rule__BelongsTo__OptionsAssignment_4 : ( ruleHashKeyValue ) ;
    public final void rule__BelongsTo__OptionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:2521:1: ( ( ruleHashKeyValue ) )
            // InternalRails.g:2522:1: ( ruleHashKeyValue )
            {
            // InternalRails.g:2522:1: ( ruleHashKeyValue )
            // InternalRails.g:2523:1: ruleHashKeyValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBelongsToAccess().getOptionsHashKeyValueParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleHashKeyValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBelongsToAccess().getOptionsHashKeyValueParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__BelongsTo__OptionsAssignment_4"


    // $ANTLR start "rule__HashKeyValue__KeyAssignment_2_0_0"
    // InternalRails.g:2532:1: rule__HashKeyValue__KeyAssignment_2_0_0 : ( RULE_ID ) ;
    public final void rule__HashKeyValue__KeyAssignment_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:2536:1: ( ( RULE_ID ) )
            // InternalRails.g:2537:1: ( RULE_ID )
            {
            // InternalRails.g:2537:1: ( RULE_ID )
            // InternalRails.g:2538:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHashKeyValueAccess().getKeyIDTerminalRuleCall_2_0_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHashKeyValueAccess().getKeyIDTerminalRuleCall_2_0_0_0()); 
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
    // $ANTLR end "rule__HashKeyValue__KeyAssignment_2_0_0"


    // $ANTLR start "rule__HashKeyValue__KeyAssignment_2_1_0"
    // InternalRails.g:2547:1: rule__HashKeyValue__KeyAssignment_2_1_0 : ( ( rule__HashKeyValue__KeyAlternatives_2_1_0_0 ) ) ;
    public final void rule__HashKeyValue__KeyAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:2551:1: ( ( ( rule__HashKeyValue__KeyAlternatives_2_1_0_0 ) ) )
            // InternalRails.g:2552:1: ( ( rule__HashKeyValue__KeyAlternatives_2_1_0_0 ) )
            {
            // InternalRails.g:2552:1: ( ( rule__HashKeyValue__KeyAlternatives_2_1_0_0 ) )
            // InternalRails.g:2553:1: ( rule__HashKeyValue__KeyAlternatives_2_1_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHashKeyValueAccess().getKeyAlternatives_2_1_0_0()); 
            }
            // InternalRails.g:2554:1: ( rule__HashKeyValue__KeyAlternatives_2_1_0_0 )
            // InternalRails.g:2554:2: rule__HashKeyValue__KeyAlternatives_2_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__HashKeyValue__KeyAlternatives_2_1_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHashKeyValueAccess().getKeyAlternatives_2_1_0_0()); 
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
    // $ANTLR end "rule__HashKeyValue__KeyAssignment_2_1_0"


    // $ANTLR start "rule__HashKeyValue__ValueAssignment_4"
    // InternalRails.g:2563:1: rule__HashKeyValue__ValueAssignment_4 : ( ( rule__HashKeyValue__ValueAlternatives_4_0 ) ) ;
    public final void rule__HashKeyValue__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:2567:1: ( ( ( rule__HashKeyValue__ValueAlternatives_4_0 ) ) )
            // InternalRails.g:2568:1: ( ( rule__HashKeyValue__ValueAlternatives_4_0 ) )
            {
            // InternalRails.g:2568:1: ( ( rule__HashKeyValue__ValueAlternatives_4_0 ) )
            // InternalRails.g:2569:1: ( rule__HashKeyValue__ValueAlternatives_4_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHashKeyValueAccess().getValueAlternatives_4_0()); 
            }
            // InternalRails.g:2570:1: ( rule__HashKeyValue__ValueAlternatives_4_0 )
            // InternalRails.g:2570:2: rule__HashKeyValue__ValueAlternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__HashKeyValue__ValueAlternatives_4_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHashKeyValueAccess().getValueAlternatives_4_0()); 
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
    // $ANTLR end "rule__HashKeyValue__ValueAssignment_4"


    // $ANTLR start "rule__Method__NameAssignment_2"
    // InternalRails.g:2579:1: rule__Method__NameAssignment_2 : ( ruleMethodName ) ;
    public final void rule__Method__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:2583:1: ( ( ruleMethodName ) )
            // InternalRails.g:2584:1: ( ruleMethodName )
            {
            // InternalRails.g:2584:1: ( ruleMethodName )
            // InternalRails.g:2585:1: ruleMethodName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getNameMethodNameParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMethodName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getNameMethodNameParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__Method__NameAssignment_2"

    // $ANTLR start synpred22_InternalRails
    public final void synpred22_InternalRails_fragment() throws RecognitionException {   
        // InternalRails.g:1139:3: ( RULE_SPACE )
        // InternalRails.g:1139:3: RULE_SPACE
        {
        match(input,RULE_SPACE,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_InternalRails

    // $ANTLR start synpred24_InternalRails
    public final void synpred24_InternalRails_fragment() throws RecognitionException {   
        // InternalRails.g:1197:3: ( RULE_SPACE )
        // InternalRails.g:1197:3: RULE_SPACE
        {
        match(input,RULE_SPACE,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred24_InternalRails

    // Delegated rules

    public final boolean synpred24_InternalRails() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_InternalRails_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_InternalRails() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalRails_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA11 dfa11 = new DFA11(this);
    static final String dfa_1s = "\4\uffff";
    static final String dfa_2s = "\2\11\2\uffff";
    static final String dfa_3s = "\2\32\2\uffff";
    static final String dfa_4s = "\2\uffff\1\1\1\2";
    static final String dfa_5s = "\4\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\3\2\uffff\1\3\1\uffff\3\3\10\uffff\1\2",
            "\1\1\1\3\2\uffff\1\3\1\uffff\3\3\10\uffff\1\2",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "703:1: ( rule__Class__Group_3__0 )?";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000A00L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000403A600L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000003A002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000004000200L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000010001240L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000230L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000020004200L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000020000200L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000A30L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000AF0L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080000200L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000041200L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000003000000L});

}