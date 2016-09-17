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

@SuppressWarnings("all")
public class InternalRailsParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SYMBOL", "RULE_STRING", "RULE_BRACKET_BLOCK", "RULE_ARRAY_BLOCK", "RULE_CLASS_WORD", "RULE_SPACE", "RULE_END_WORD", "RULE_ID", "RULE_HAS_MANY_WORD", "RULE_SL_COMMENT", "RULE_HAS_AND_BELONGS_TO_MANY_WORD", "RULE_BELONGS_TO_WORD", "RULE_DEF_WORD", "RULE_MODULE_WORD", "RULE_ML_COMMENT", "RULE_WS", "RULE_INT", "RULE_ANY_OTHER", "'?'", "'='", "'<'", "'::'", "'.'", "','", "':'", "'=>'"
    };
    public static final int RULE_HAS_MANY_WORD=12;
    public static final int RULE_CLASS_WORD=8;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=13;
    public static final int RULE_HAS_AND_BELONGS_TO_MANY_WORD=14;
    public static final int RULE_SPACE=9;
    public static final int EOF=-1;
    public static final int RULE_ARRAY_BLOCK=7;
    public static final int RULE_ID=11;
    public static final int RULE_WS=19;
    public static final int RULE_ANY_OTHER=21;
    public static final int RULE_MODULE_WORD=17;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=20;
    public static final int T__29=29;
    public static final int RULE_BRACKET_BLOCK=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=18;
    public static final int T__23=23;
    public static final int RULE_SYMBOL=4;
    public static final int RULE_DEF_WORD=16;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_END_WORD=10;
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
    // InternalRails.g:60:1: entryRuleClass : ruleClass EOF ;
    public final void entryRuleClass() throws RecognitionException {
        try {
            // InternalRails.g:61:1: ( ruleClass EOF )
            // InternalRails.g:62:1: ruleClass EOF
            {
             before(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_1);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getClassRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRails.g:69:1: ruleClass : ( ( rule__Class__Group__0 ) ) ;
    public final void ruleClass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:73:2: ( ( ( rule__Class__Group__0 ) ) )
            // InternalRails.g:74:1: ( ( rule__Class__Group__0 ) )
            {
            // InternalRails.g:74:1: ( ( rule__Class__Group__0 ) )
            // InternalRails.g:75:1: ( rule__Class__Group__0 )
            {
             before(grammarAccess.getClassAccess().getGroup()); 
            // InternalRails.g:76:1: ( rule__Class__Group__0 )
            // InternalRails.g:76:2: rule__Class__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getGroup()); 

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
    // InternalRails.g:88:1: entryRuleNamespacedModuleName : ruleNamespacedModuleName EOF ;
    public final void entryRuleNamespacedModuleName() throws RecognitionException {
        try {
            // InternalRails.g:89:1: ( ruleNamespacedModuleName EOF )
            // InternalRails.g:90:1: ruleNamespacedModuleName EOF
            {
             before(grammarAccess.getNamespacedModuleNameRule()); 
            pushFollow(FOLLOW_1);
            ruleNamespacedModuleName();

            state._fsp--;

             after(grammarAccess.getNamespacedModuleNameRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRails.g:97:1: ruleNamespacedModuleName : ( ( rule__NamespacedModuleName__Group__0 ) ) ;
    public final void ruleNamespacedModuleName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:101:2: ( ( ( rule__NamespacedModuleName__Group__0 ) ) )
            // InternalRails.g:102:1: ( ( rule__NamespacedModuleName__Group__0 ) )
            {
            // InternalRails.g:102:1: ( ( rule__NamespacedModuleName__Group__0 ) )
            // InternalRails.g:103:1: ( rule__NamespacedModuleName__Group__0 )
            {
             before(grammarAccess.getNamespacedModuleNameAccess().getGroup()); 
            // InternalRails.g:104:1: ( rule__NamespacedModuleName__Group__0 )
            // InternalRails.g:104:2: rule__NamespacedModuleName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NamespacedModuleName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNamespacedModuleNameAccess().getGroup()); 

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
    // InternalRails.g:116:1: entryRuleMethodChainCall : ruleMethodChainCall EOF ;
    public final void entryRuleMethodChainCall() throws RecognitionException {
        try {
            // InternalRails.g:117:1: ( ruleMethodChainCall EOF )
            // InternalRails.g:118:1: ruleMethodChainCall EOF
            {
             before(grammarAccess.getMethodChainCallRule()); 
            pushFollow(FOLLOW_1);
            ruleMethodChainCall();

            state._fsp--;

             after(grammarAccess.getMethodChainCallRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRails.g:125:1: ruleMethodChainCall : ( ( rule__MethodChainCall__Group__0 ) ) ;
    public final void ruleMethodChainCall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:129:2: ( ( ( rule__MethodChainCall__Group__0 ) ) )
            // InternalRails.g:130:1: ( ( rule__MethodChainCall__Group__0 ) )
            {
            // InternalRails.g:130:1: ( ( rule__MethodChainCall__Group__0 ) )
            // InternalRails.g:131:1: ( rule__MethodChainCall__Group__0 )
            {
             before(grammarAccess.getMethodChainCallAccess().getGroup()); 
            // InternalRails.g:132:1: ( rule__MethodChainCall__Group__0 )
            // InternalRails.g:132:2: rule__MethodChainCall__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MethodChainCall__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMethodChainCallAccess().getGroup()); 

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
    // InternalRails.g:144:1: entryRuleClassElement : ruleClassElement EOF ;
    public final void entryRuleClassElement() throws RecognitionException {
        try {
            // InternalRails.g:145:1: ( ruleClassElement EOF )
            // InternalRails.g:146:1: ruleClassElement EOF
            {
             before(grammarAccess.getClassElementRule()); 
            pushFollow(FOLLOW_1);
            ruleClassElement();

            state._fsp--;

             after(grammarAccess.getClassElementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRails.g:153:1: ruleClassElement : ( ( rule__ClassElement__Alternatives ) ) ;
    public final void ruleClassElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:157:2: ( ( ( rule__ClassElement__Alternatives ) ) )
            // InternalRails.g:158:1: ( ( rule__ClassElement__Alternatives ) )
            {
            // InternalRails.g:158:1: ( ( rule__ClassElement__Alternatives ) )
            // InternalRails.g:159:1: ( rule__ClassElement__Alternatives )
            {
             before(grammarAccess.getClassElementAccess().getAlternatives()); 
            // InternalRails.g:160:1: ( rule__ClassElement__Alternatives )
            // InternalRails.g:160:2: rule__ClassElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ClassElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getClassElementAccess().getAlternatives()); 

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
    // InternalRails.g:172:1: entryRuleRelationship : ruleRelationship EOF ;
    public final void entryRuleRelationship() throws RecognitionException {
        try {
            // InternalRails.g:173:1: ( ruleRelationship EOF )
            // InternalRails.g:174:1: ruleRelationship EOF
            {
             before(grammarAccess.getRelationshipRule()); 
            pushFollow(FOLLOW_1);
            ruleRelationship();

            state._fsp--;

             after(grammarAccess.getRelationshipRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRails.g:181:1: ruleRelationship : ( ( rule__Relationship__Alternatives ) ) ;
    public final void ruleRelationship() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:185:2: ( ( ( rule__Relationship__Alternatives ) ) )
            // InternalRails.g:186:1: ( ( rule__Relationship__Alternatives ) )
            {
            // InternalRails.g:186:1: ( ( rule__Relationship__Alternatives ) )
            // InternalRails.g:187:1: ( rule__Relationship__Alternatives )
            {
             before(grammarAccess.getRelationshipAccess().getAlternatives()); 
            // InternalRails.g:188:1: ( rule__Relationship__Alternatives )
            // InternalRails.g:188:2: rule__Relationship__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Relationship__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRelationshipAccess().getAlternatives()); 

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
    // InternalRails.g:200:1: entryRuleHasMany : ruleHasMany EOF ;
    public final void entryRuleHasMany() throws RecognitionException {
        try {
            // InternalRails.g:201:1: ( ruleHasMany EOF )
            // InternalRails.g:202:1: ruleHasMany EOF
            {
             before(grammarAccess.getHasManyRule()); 
            pushFollow(FOLLOW_1);
            ruleHasMany();

            state._fsp--;

             after(grammarAccess.getHasManyRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRails.g:209:1: ruleHasMany : ( ( rule__HasMany__Group__0 ) ) ;
    public final void ruleHasMany() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:213:2: ( ( ( rule__HasMany__Group__0 ) ) )
            // InternalRails.g:214:1: ( ( rule__HasMany__Group__0 ) )
            {
            // InternalRails.g:214:1: ( ( rule__HasMany__Group__0 ) )
            // InternalRails.g:215:1: ( rule__HasMany__Group__0 )
            {
             before(grammarAccess.getHasManyAccess().getGroup()); 
            // InternalRails.g:216:1: ( rule__HasMany__Group__0 )
            // InternalRails.g:216:2: rule__HasMany__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__HasMany__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHasManyAccess().getGroup()); 

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
    // InternalRails.g:228:1: entryRuleHasAndBelongsToMany : ruleHasAndBelongsToMany EOF ;
    public final void entryRuleHasAndBelongsToMany() throws RecognitionException {
        try {
            // InternalRails.g:229:1: ( ruleHasAndBelongsToMany EOF )
            // InternalRails.g:230:1: ruleHasAndBelongsToMany EOF
            {
             before(grammarAccess.getHasAndBelongsToManyRule()); 
            pushFollow(FOLLOW_1);
            ruleHasAndBelongsToMany();

            state._fsp--;

             after(grammarAccess.getHasAndBelongsToManyRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRails.g:237:1: ruleHasAndBelongsToMany : ( ( rule__HasAndBelongsToMany__Group__0 ) ) ;
    public final void ruleHasAndBelongsToMany() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:241:2: ( ( ( rule__HasAndBelongsToMany__Group__0 ) ) )
            // InternalRails.g:242:1: ( ( rule__HasAndBelongsToMany__Group__0 ) )
            {
            // InternalRails.g:242:1: ( ( rule__HasAndBelongsToMany__Group__0 ) )
            // InternalRails.g:243:1: ( rule__HasAndBelongsToMany__Group__0 )
            {
             before(grammarAccess.getHasAndBelongsToManyAccess().getGroup()); 
            // InternalRails.g:244:1: ( rule__HasAndBelongsToMany__Group__0 )
            // InternalRails.g:244:2: rule__HasAndBelongsToMany__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__HasAndBelongsToMany__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHasAndBelongsToManyAccess().getGroup()); 

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
    // InternalRails.g:256:1: entryRuleBelongsTo : ruleBelongsTo EOF ;
    public final void entryRuleBelongsTo() throws RecognitionException {
        try {
            // InternalRails.g:257:1: ( ruleBelongsTo EOF )
            // InternalRails.g:258:1: ruleBelongsTo EOF
            {
             before(grammarAccess.getBelongsToRule()); 
            pushFollow(FOLLOW_1);
            ruleBelongsTo();

            state._fsp--;

             after(grammarAccess.getBelongsToRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRails.g:265:1: ruleBelongsTo : ( ( rule__BelongsTo__Group__0 ) ) ;
    public final void ruleBelongsTo() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:269:2: ( ( ( rule__BelongsTo__Group__0 ) ) )
            // InternalRails.g:270:1: ( ( rule__BelongsTo__Group__0 ) )
            {
            // InternalRails.g:270:1: ( ( rule__BelongsTo__Group__0 ) )
            // InternalRails.g:271:1: ( rule__BelongsTo__Group__0 )
            {
             before(grammarAccess.getBelongsToAccess().getGroup()); 
            // InternalRails.g:272:1: ( rule__BelongsTo__Group__0 )
            // InternalRails.g:272:2: rule__BelongsTo__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BelongsTo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBelongsToAccess().getGroup()); 

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
    // InternalRails.g:284:1: entryRuleHashKeyValue : ruleHashKeyValue EOF ;
    public final void entryRuleHashKeyValue() throws RecognitionException {
        try {
            // InternalRails.g:285:1: ( ruleHashKeyValue EOF )
            // InternalRails.g:286:1: ruleHashKeyValue EOF
            {
             before(grammarAccess.getHashKeyValueRule()); 
            pushFollow(FOLLOW_1);
            ruleHashKeyValue();

            state._fsp--;

             after(grammarAccess.getHashKeyValueRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRails.g:293:1: ruleHashKeyValue : ( ( rule__HashKeyValue__Group__0 ) ) ;
    public final void ruleHashKeyValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:297:2: ( ( ( rule__HashKeyValue__Group__0 ) ) )
            // InternalRails.g:298:1: ( ( rule__HashKeyValue__Group__0 ) )
            {
            // InternalRails.g:298:1: ( ( rule__HashKeyValue__Group__0 ) )
            // InternalRails.g:299:1: ( rule__HashKeyValue__Group__0 )
            {
             before(grammarAccess.getHashKeyValueAccess().getGroup()); 
            // InternalRails.g:300:1: ( rule__HashKeyValue__Group__0 )
            // InternalRails.g:300:2: rule__HashKeyValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__HashKeyValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHashKeyValueAccess().getGroup()); 

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
    // InternalRails.g:312:1: entryRuleMethod : ruleMethod EOF ;
    public final void entryRuleMethod() throws RecognitionException {
        try {
            // InternalRails.g:313:1: ( ruleMethod EOF )
            // InternalRails.g:314:1: ruleMethod EOF
            {
             before(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_1);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getMethodRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRails.g:321:1: ruleMethod : ( ( rule__Method__Group__0 ) ) ;
    public final void ruleMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:325:2: ( ( ( rule__Method__Group__0 ) ) )
            // InternalRails.g:326:1: ( ( rule__Method__Group__0 ) )
            {
            // InternalRails.g:326:1: ( ( rule__Method__Group__0 ) )
            // InternalRails.g:327:1: ( rule__Method__Group__0 )
            {
             before(grammarAccess.getMethodAccess().getGroup()); 
            // InternalRails.g:328:1: ( rule__Method__Group__0 )
            // InternalRails.g:328:2: rule__Method__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getGroup()); 

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
    // InternalRails.g:340:1: entryRuleMethodName : ruleMethodName EOF ;
    public final void entryRuleMethodName() throws RecognitionException {
        try {
            // InternalRails.g:341:1: ( ruleMethodName EOF )
            // InternalRails.g:342:1: ruleMethodName EOF
            {
             before(grammarAccess.getMethodNameRule()); 
            pushFollow(FOLLOW_1);
            ruleMethodName();

            state._fsp--;

             after(grammarAccess.getMethodNameRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRails.g:349:1: ruleMethodName : ( ( rule__MethodName__Group__0 ) ) ;
    public final void ruleMethodName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:353:2: ( ( ( rule__MethodName__Group__0 ) ) )
            // InternalRails.g:354:1: ( ( rule__MethodName__Group__0 ) )
            {
            // InternalRails.g:354:1: ( ( rule__MethodName__Group__0 ) )
            // InternalRails.g:355:1: ( rule__MethodName__Group__0 )
            {
             before(grammarAccess.getMethodNameAccess().getGroup()); 
            // InternalRails.g:356:1: ( rule__MethodName__Group__0 )
            // InternalRails.g:356:2: rule__MethodName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MethodName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMethodNameAccess().getGroup()); 

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
    // InternalRails.g:368:1: rule__ClassElement__Alternatives : ( ( ruleMethod ) | ( ruleRelationship ) );
    public final void rule__ClassElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:372:1: ( ( ruleMethod ) | ( ruleRelationship ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_DEF_WORD) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_HAS_MANY_WORD||(LA1_0>=RULE_HAS_AND_BELONGS_TO_MANY_WORD && LA1_0<=RULE_BELONGS_TO_WORD)) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalRails.g:373:1: ( ruleMethod )
                    {
                    // InternalRails.g:373:1: ( ruleMethod )
                    // InternalRails.g:374:1: ruleMethod
                    {
                     before(grammarAccess.getClassElementAccess().getMethodParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMethod();

                    state._fsp--;

                     after(grammarAccess.getClassElementAccess().getMethodParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRails.g:379:6: ( ruleRelationship )
                    {
                    // InternalRails.g:379:6: ( ruleRelationship )
                    // InternalRails.g:380:1: ruleRelationship
                    {
                     before(grammarAccess.getClassElementAccess().getRelationshipParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRelationship();

                    state._fsp--;

                     after(grammarAccess.getClassElementAccess().getRelationshipParserRuleCall_1()); 

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
    // InternalRails.g:390:1: rule__Relationship__Alternatives : ( ( ruleHasMany ) | ( ruleHasAndBelongsToMany ) | ( ruleBelongsTo ) );
    public final void rule__Relationship__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:394:1: ( ( ruleHasMany ) | ( ruleHasAndBelongsToMany ) | ( ruleBelongsTo ) )
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
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalRails.g:395:1: ( ruleHasMany )
                    {
                    // InternalRails.g:395:1: ( ruleHasMany )
                    // InternalRails.g:396:1: ruleHasMany
                    {
                     before(grammarAccess.getRelationshipAccess().getHasManyParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleHasMany();

                    state._fsp--;

                     after(grammarAccess.getRelationshipAccess().getHasManyParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRails.g:401:6: ( ruleHasAndBelongsToMany )
                    {
                    // InternalRails.g:401:6: ( ruleHasAndBelongsToMany )
                    // InternalRails.g:402:1: ruleHasAndBelongsToMany
                    {
                     before(grammarAccess.getRelationshipAccess().getHasAndBelongsToManyParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleHasAndBelongsToMany();

                    state._fsp--;

                     after(grammarAccess.getRelationshipAccess().getHasAndBelongsToManyParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRails.g:407:6: ( ruleBelongsTo )
                    {
                    // InternalRails.g:407:6: ( ruleBelongsTo )
                    // InternalRails.g:408:1: ruleBelongsTo
                    {
                     before(grammarAccess.getRelationshipAccess().getBelongsToParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleBelongsTo();

                    state._fsp--;

                     after(grammarAccess.getRelationshipAccess().getBelongsToParserRuleCall_2()); 

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
    // InternalRails.g:418:1: rule__HasMany__NameAlternatives_2_0 : ( ( RULE_SYMBOL ) | ( RULE_STRING ) );
    public final void rule__HasMany__NameAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:422:1: ( ( RULE_SYMBOL ) | ( RULE_STRING ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_SYMBOL) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_STRING) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalRails.g:423:1: ( RULE_SYMBOL )
                    {
                    // InternalRails.g:423:1: ( RULE_SYMBOL )
                    // InternalRails.g:424:1: RULE_SYMBOL
                    {
                     before(grammarAccess.getHasManyAccess().getNameSYMBOLTerminalRuleCall_2_0_0()); 
                    match(input,RULE_SYMBOL,FOLLOW_2); 
                     after(grammarAccess.getHasManyAccess().getNameSYMBOLTerminalRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRails.g:429:6: ( RULE_STRING )
                    {
                    // InternalRails.g:429:6: ( RULE_STRING )
                    // InternalRails.g:430:1: RULE_STRING
                    {
                     before(grammarAccess.getHasManyAccess().getNameSTRINGTerminalRuleCall_2_0_1()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getHasManyAccess().getNameSTRINGTerminalRuleCall_2_0_1()); 

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
    // InternalRails.g:440:1: rule__HasAndBelongsToMany__NameAlternatives_2_0 : ( ( RULE_SYMBOL ) | ( RULE_STRING ) );
    public final void rule__HasAndBelongsToMany__NameAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:444:1: ( ( RULE_SYMBOL ) | ( RULE_STRING ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_SYMBOL) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_STRING) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalRails.g:445:1: ( RULE_SYMBOL )
                    {
                    // InternalRails.g:445:1: ( RULE_SYMBOL )
                    // InternalRails.g:446:1: RULE_SYMBOL
                    {
                     before(grammarAccess.getHasAndBelongsToManyAccess().getNameSYMBOLTerminalRuleCall_2_0_0()); 
                    match(input,RULE_SYMBOL,FOLLOW_2); 
                     after(grammarAccess.getHasAndBelongsToManyAccess().getNameSYMBOLTerminalRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRails.g:451:6: ( RULE_STRING )
                    {
                    // InternalRails.g:451:6: ( RULE_STRING )
                    // InternalRails.g:452:1: RULE_STRING
                    {
                     before(grammarAccess.getHasAndBelongsToManyAccess().getNameSTRINGTerminalRuleCall_2_0_1()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getHasAndBelongsToManyAccess().getNameSTRINGTerminalRuleCall_2_0_1()); 

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
    // InternalRails.g:462:1: rule__BelongsTo__NameAlternatives_2_0 : ( ( RULE_SYMBOL ) | ( RULE_STRING ) );
    public final void rule__BelongsTo__NameAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:466:1: ( ( RULE_SYMBOL ) | ( RULE_STRING ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_SYMBOL) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_STRING) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalRails.g:467:1: ( RULE_SYMBOL )
                    {
                    // InternalRails.g:467:1: ( RULE_SYMBOL )
                    // InternalRails.g:468:1: RULE_SYMBOL
                    {
                     before(grammarAccess.getBelongsToAccess().getNameSYMBOLTerminalRuleCall_2_0_0()); 
                    match(input,RULE_SYMBOL,FOLLOW_2); 
                     after(grammarAccess.getBelongsToAccess().getNameSYMBOLTerminalRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRails.g:473:6: ( RULE_STRING )
                    {
                    // InternalRails.g:473:6: ( RULE_STRING )
                    // InternalRails.g:474:1: RULE_STRING
                    {
                     before(grammarAccess.getBelongsToAccess().getNameSTRINGTerminalRuleCall_2_0_1()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getBelongsToAccess().getNameSTRINGTerminalRuleCall_2_0_1()); 

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
    // InternalRails.g:484:1: rule__HashKeyValue__Alternatives_2 : ( ( ( rule__HashKeyValue__Group_2_0__0 ) ) | ( ( rule__HashKeyValue__Group_2_1__0 ) ) );
    public final void rule__HashKeyValue__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:488:1: ( ( ( rule__HashKeyValue__Group_2_0__0 ) ) | ( ( rule__HashKeyValue__Group_2_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=RULE_SYMBOL && LA6_0<=RULE_STRING)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalRails.g:489:1: ( ( rule__HashKeyValue__Group_2_0__0 ) )
                    {
                    // InternalRails.g:489:1: ( ( rule__HashKeyValue__Group_2_0__0 ) )
                    // InternalRails.g:490:1: ( rule__HashKeyValue__Group_2_0__0 )
                    {
                     before(grammarAccess.getHashKeyValueAccess().getGroup_2_0()); 
                    // InternalRails.g:491:1: ( rule__HashKeyValue__Group_2_0__0 )
                    // InternalRails.g:491:2: rule__HashKeyValue__Group_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__HashKeyValue__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getHashKeyValueAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRails.g:495:6: ( ( rule__HashKeyValue__Group_2_1__0 ) )
                    {
                    // InternalRails.g:495:6: ( ( rule__HashKeyValue__Group_2_1__0 ) )
                    // InternalRails.g:496:1: ( rule__HashKeyValue__Group_2_1__0 )
                    {
                     before(grammarAccess.getHashKeyValueAccess().getGroup_2_1()); 
                    // InternalRails.g:497:1: ( rule__HashKeyValue__Group_2_1__0 )
                    // InternalRails.g:497:2: rule__HashKeyValue__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__HashKeyValue__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getHashKeyValueAccess().getGroup_2_1()); 

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
    // InternalRails.g:506:1: rule__HashKeyValue__KeyAlternatives_2_1_0_0 : ( ( RULE_SYMBOL ) | ( RULE_STRING ) );
    public final void rule__HashKeyValue__KeyAlternatives_2_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:510:1: ( ( RULE_SYMBOL ) | ( RULE_STRING ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_SYMBOL) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_STRING) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalRails.g:511:1: ( RULE_SYMBOL )
                    {
                    // InternalRails.g:511:1: ( RULE_SYMBOL )
                    // InternalRails.g:512:1: RULE_SYMBOL
                    {
                     before(grammarAccess.getHashKeyValueAccess().getKeySYMBOLTerminalRuleCall_2_1_0_0_0()); 
                    match(input,RULE_SYMBOL,FOLLOW_2); 
                     after(grammarAccess.getHashKeyValueAccess().getKeySYMBOLTerminalRuleCall_2_1_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRails.g:517:6: ( RULE_STRING )
                    {
                    // InternalRails.g:517:6: ( RULE_STRING )
                    // InternalRails.g:518:1: RULE_STRING
                    {
                     before(grammarAccess.getHashKeyValueAccess().getKeySTRINGTerminalRuleCall_2_1_0_0_1()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getHashKeyValueAccess().getKeySTRINGTerminalRuleCall_2_1_0_0_1()); 

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
    // InternalRails.g:528:1: rule__HashKeyValue__ValueAlternatives_4_0 : ( ( RULE_SYMBOL ) | ( RULE_STRING ) | ( RULE_BRACKET_BLOCK ) | ( RULE_ARRAY_BLOCK ) | ( ruleMethodChainCall ) );
    public final void rule__HashKeyValue__ValueAlternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:532:1: ( ( RULE_SYMBOL ) | ( RULE_STRING ) | ( RULE_BRACKET_BLOCK ) | ( RULE_ARRAY_BLOCK ) | ( ruleMethodChainCall ) )
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
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalRails.g:533:1: ( RULE_SYMBOL )
                    {
                    // InternalRails.g:533:1: ( RULE_SYMBOL )
                    // InternalRails.g:534:1: RULE_SYMBOL
                    {
                     before(grammarAccess.getHashKeyValueAccess().getValueSYMBOLTerminalRuleCall_4_0_0()); 
                    match(input,RULE_SYMBOL,FOLLOW_2); 
                     after(grammarAccess.getHashKeyValueAccess().getValueSYMBOLTerminalRuleCall_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRails.g:539:6: ( RULE_STRING )
                    {
                    // InternalRails.g:539:6: ( RULE_STRING )
                    // InternalRails.g:540:1: RULE_STRING
                    {
                     before(grammarAccess.getHashKeyValueAccess().getValueSTRINGTerminalRuleCall_4_0_1()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getHashKeyValueAccess().getValueSTRINGTerminalRuleCall_4_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRails.g:545:6: ( RULE_BRACKET_BLOCK )
                    {
                    // InternalRails.g:545:6: ( RULE_BRACKET_BLOCK )
                    // InternalRails.g:546:1: RULE_BRACKET_BLOCK
                    {
                     before(grammarAccess.getHashKeyValueAccess().getValueBRACKET_BLOCKTerminalRuleCall_4_0_2()); 
                    match(input,RULE_BRACKET_BLOCK,FOLLOW_2); 
                     after(grammarAccess.getHashKeyValueAccess().getValueBRACKET_BLOCKTerminalRuleCall_4_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRails.g:551:6: ( RULE_ARRAY_BLOCK )
                    {
                    // InternalRails.g:551:6: ( RULE_ARRAY_BLOCK )
                    // InternalRails.g:552:1: RULE_ARRAY_BLOCK
                    {
                     before(grammarAccess.getHashKeyValueAccess().getValueARRAY_BLOCKTerminalRuleCall_4_0_3()); 
                    match(input,RULE_ARRAY_BLOCK,FOLLOW_2); 
                     after(grammarAccess.getHashKeyValueAccess().getValueARRAY_BLOCKTerminalRuleCall_4_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalRails.g:557:6: ( ruleMethodChainCall )
                    {
                    // InternalRails.g:557:6: ( ruleMethodChainCall )
                    // InternalRails.g:558:1: ruleMethodChainCall
                    {
                     before(grammarAccess.getHashKeyValueAccess().getValueMethodChainCallParserRuleCall_4_0_4()); 
                    pushFollow(FOLLOW_2);
                    ruleMethodChainCall();

                    state._fsp--;

                     after(grammarAccess.getHashKeyValueAccess().getValueMethodChainCallParserRuleCall_4_0_4()); 

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
    // InternalRails.g:568:1: rule__MethodName__Alternatives_1 : ( ( '?' ) | ( '=' ) );
    public final void rule__MethodName__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:572:1: ( ( '?' ) | ( '=' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            else if ( (LA9_0==23) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalRails.g:573:1: ( '?' )
                    {
                    // InternalRails.g:573:1: ( '?' )
                    // InternalRails.g:574:1: '?'
                    {
                     before(grammarAccess.getMethodNameAccess().getQuestionMarkKeyword_1_0()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getMethodNameAccess().getQuestionMarkKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRails.g:581:6: ( '=' )
                    {
                    // InternalRails.g:581:6: ( '=' )
                    // InternalRails.g:582:1: '='
                    {
                     before(grammarAccess.getMethodNameAccess().getEqualsSignKeyword_1_1()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getMethodNameAccess().getEqualsSignKeyword_1_1()); 

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
    // InternalRails.g:596:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:600:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // InternalRails.g:601:2: rule__Class__Group__0__Impl rule__Class__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Class__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__1();

            state._fsp--;


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
    // InternalRails.g:608:1: rule__Class__Group__0__Impl : ( RULE_CLASS_WORD ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:612:1: ( ( RULE_CLASS_WORD ) )
            // InternalRails.g:613:1: ( RULE_CLASS_WORD )
            {
            // InternalRails.g:613:1: ( RULE_CLASS_WORD )
            // InternalRails.g:614:1: RULE_CLASS_WORD
            {
             before(grammarAccess.getClassAccess().getCLASS_WORDTerminalRuleCall_0()); 
            match(input,RULE_CLASS_WORD,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getCLASS_WORDTerminalRuleCall_0()); 

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
    // InternalRails.g:625:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:629:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // InternalRails.g:630:2: rule__Class__Group__1__Impl rule__Class__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Class__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__2();

            state._fsp--;


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
    // InternalRails.g:637:1: rule__Class__Group__1__Impl : ( ( RULE_SPACE )* ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:641:1: ( ( ( RULE_SPACE )* ) )
            // InternalRails.g:642:1: ( ( RULE_SPACE )* )
            {
            // InternalRails.g:642:1: ( ( RULE_SPACE )* )
            // InternalRails.g:643:1: ( RULE_SPACE )*
            {
             before(grammarAccess.getClassAccess().getSPACETerminalRuleCall_1()); 
            // InternalRails.g:644:1: ( RULE_SPACE )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_SPACE) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalRails.g:644:3: RULE_SPACE
            	    {
            	    match(input,RULE_SPACE,FOLLOW_4); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getClassAccess().getSPACETerminalRuleCall_1()); 

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
    // InternalRails.g:654:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:658:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // InternalRails.g:659:2: rule__Class__Group__2__Impl rule__Class__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Class__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__3();

            state._fsp--;


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
    // InternalRails.g:666:1: rule__Class__Group__2__Impl : ( ( rule__Class__NameAssignment_2 ) ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:670:1: ( ( ( rule__Class__NameAssignment_2 ) ) )
            // InternalRails.g:671:1: ( ( rule__Class__NameAssignment_2 ) )
            {
            // InternalRails.g:671:1: ( ( rule__Class__NameAssignment_2 ) )
            // InternalRails.g:672:1: ( rule__Class__NameAssignment_2 )
            {
             before(grammarAccess.getClassAccess().getNameAssignment_2()); 
            // InternalRails.g:673:1: ( rule__Class__NameAssignment_2 )
            // InternalRails.g:673:2: rule__Class__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Class__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getNameAssignment_2()); 

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
    // InternalRails.g:683:1: rule__Class__Group__3 : rule__Class__Group__3__Impl rule__Class__Group__4 ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:687:1: ( rule__Class__Group__3__Impl rule__Class__Group__4 )
            // InternalRails.g:688:2: rule__Class__Group__3__Impl rule__Class__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Class__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__4();

            state._fsp--;


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
    // InternalRails.g:695:1: rule__Class__Group__3__Impl : ( ( rule__Class__Group_3__0 )? ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:699:1: ( ( ( rule__Class__Group_3__0 )? ) )
            // InternalRails.g:700:1: ( ( rule__Class__Group_3__0 )? )
            {
            // InternalRails.g:700:1: ( ( rule__Class__Group_3__0 )? )
            // InternalRails.g:701:1: ( rule__Class__Group_3__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_3()); 
            // InternalRails.g:702:1: ( rule__Class__Group_3__0 )?
            int alt11=2;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // InternalRails.g:702:2: rule__Class__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getGroup_3()); 

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
    // InternalRails.g:712:1: rule__Class__Group__4 : rule__Class__Group__4__Impl rule__Class__Group__5 ;
    public final void rule__Class__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:716:1: ( rule__Class__Group__4__Impl rule__Class__Group__5 )
            // InternalRails.g:717:2: rule__Class__Group__4__Impl rule__Class__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__Class__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__5();

            state._fsp--;


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
    // InternalRails.g:724:1: rule__Class__Group__4__Impl : ( ( RULE_SPACE )* ) ;
    public final void rule__Class__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:728:1: ( ( ( RULE_SPACE )* ) )
            // InternalRails.g:729:1: ( ( RULE_SPACE )* )
            {
            // InternalRails.g:729:1: ( ( RULE_SPACE )* )
            // InternalRails.g:730:1: ( RULE_SPACE )*
            {
             before(grammarAccess.getClassAccess().getSPACETerminalRuleCall_4()); 
            // InternalRails.g:731:1: ( RULE_SPACE )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_SPACE) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalRails.g:731:3: RULE_SPACE
            	    {
            	    match(input,RULE_SPACE,FOLLOW_4); 

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getClassAccess().getSPACETerminalRuleCall_4()); 

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
    // InternalRails.g:741:1: rule__Class__Group__5 : rule__Class__Group__5__Impl rule__Class__Group__6 ;
    public final void rule__Class__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:745:1: ( rule__Class__Group__5__Impl rule__Class__Group__6 )
            // InternalRails.g:746:2: rule__Class__Group__5__Impl rule__Class__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__Class__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__6();

            state._fsp--;


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
    // InternalRails.g:753:1: rule__Class__Group__5__Impl : ( ( rule__Class__ClassElementsAssignment_5 )* ) ;
    public final void rule__Class__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:757:1: ( ( ( rule__Class__ClassElementsAssignment_5 )* ) )
            // InternalRails.g:758:1: ( ( rule__Class__ClassElementsAssignment_5 )* )
            {
            // InternalRails.g:758:1: ( ( rule__Class__ClassElementsAssignment_5 )* )
            // InternalRails.g:759:1: ( rule__Class__ClassElementsAssignment_5 )*
            {
             before(grammarAccess.getClassAccess().getClassElementsAssignment_5()); 
            // InternalRails.g:760:1: ( rule__Class__ClassElementsAssignment_5 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_HAS_MANY_WORD||(LA13_0>=RULE_HAS_AND_BELONGS_TO_MANY_WORD && LA13_0<=RULE_DEF_WORD)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalRails.g:760:2: rule__Class__ClassElementsAssignment_5
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Class__ClassElementsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getClassAccess().getClassElementsAssignment_5()); 

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
    // InternalRails.g:770:1: rule__Class__Group__6 : rule__Class__Group__6__Impl ;
    public final void rule__Class__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:774:1: ( rule__Class__Group__6__Impl )
            // InternalRails.g:775:2: rule__Class__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group__6__Impl();

            state._fsp--;


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
    // InternalRails.g:781:1: rule__Class__Group__6__Impl : ( RULE_END_WORD ) ;
    public final void rule__Class__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:785:1: ( ( RULE_END_WORD ) )
            // InternalRails.g:786:1: ( RULE_END_WORD )
            {
            // InternalRails.g:786:1: ( RULE_END_WORD )
            // InternalRails.g:787:1: RULE_END_WORD
            {
             before(grammarAccess.getClassAccess().getEND_WORDTerminalRuleCall_6()); 
            match(input,RULE_END_WORD,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getEND_WORDTerminalRuleCall_6()); 

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
    // InternalRails.g:812:1: rule__Class__Group_3__0 : rule__Class__Group_3__0__Impl rule__Class__Group_3__1 ;
    public final void rule__Class__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:816:1: ( rule__Class__Group_3__0__Impl rule__Class__Group_3__1 )
            // InternalRails.g:817:2: rule__Class__Group_3__0__Impl rule__Class__Group_3__1
            {
            pushFollow(FOLLOW_7);
            rule__Class__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_3__1();

            state._fsp--;


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
    // InternalRails.g:824:1: rule__Class__Group_3__0__Impl : ( ( RULE_SPACE )* ) ;
    public final void rule__Class__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:828:1: ( ( ( RULE_SPACE )* ) )
            // InternalRails.g:829:1: ( ( RULE_SPACE )* )
            {
            // InternalRails.g:829:1: ( ( RULE_SPACE )* )
            // InternalRails.g:830:1: ( RULE_SPACE )*
            {
             before(grammarAccess.getClassAccess().getSPACETerminalRuleCall_3_0()); 
            // InternalRails.g:831:1: ( RULE_SPACE )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_SPACE) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalRails.g:831:3: RULE_SPACE
            	    {
            	    match(input,RULE_SPACE,FOLLOW_4); 

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getClassAccess().getSPACETerminalRuleCall_3_0()); 

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
    // InternalRails.g:841:1: rule__Class__Group_3__1 : rule__Class__Group_3__1__Impl rule__Class__Group_3__2 ;
    public final void rule__Class__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:845:1: ( rule__Class__Group_3__1__Impl rule__Class__Group_3__2 )
            // InternalRails.g:846:2: rule__Class__Group_3__1__Impl rule__Class__Group_3__2
            {
            pushFollow(FOLLOW_3);
            rule__Class__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_3__2();

            state._fsp--;


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
    // InternalRails.g:853:1: rule__Class__Group_3__1__Impl : ( '<' ) ;
    public final void rule__Class__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:857:1: ( ( '<' ) )
            // InternalRails.g:858:1: ( '<' )
            {
            // InternalRails.g:858:1: ( '<' )
            // InternalRails.g:859:1: '<'
            {
             before(grammarAccess.getClassAccess().getLessThanSignKeyword_3_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getLessThanSignKeyword_3_1()); 

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
    // InternalRails.g:872:1: rule__Class__Group_3__2 : rule__Class__Group_3__2__Impl rule__Class__Group_3__3 ;
    public final void rule__Class__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:876:1: ( rule__Class__Group_3__2__Impl rule__Class__Group_3__3 )
            // InternalRails.g:877:2: rule__Class__Group_3__2__Impl rule__Class__Group_3__3
            {
            pushFollow(FOLLOW_3);
            rule__Class__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_3__3();

            state._fsp--;


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
    // InternalRails.g:884:1: rule__Class__Group_3__2__Impl : ( ( RULE_SPACE )* ) ;
    public final void rule__Class__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:888:1: ( ( ( RULE_SPACE )* ) )
            // InternalRails.g:889:1: ( ( RULE_SPACE )* )
            {
            // InternalRails.g:889:1: ( ( RULE_SPACE )* )
            // InternalRails.g:890:1: ( RULE_SPACE )*
            {
             before(grammarAccess.getClassAccess().getSPACETerminalRuleCall_3_2()); 
            // InternalRails.g:891:1: ( RULE_SPACE )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_SPACE) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalRails.g:891:3: RULE_SPACE
            	    {
            	    match(input,RULE_SPACE,FOLLOW_4); 

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getClassAccess().getSPACETerminalRuleCall_3_2()); 

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
    // InternalRails.g:901:1: rule__Class__Group_3__3 : rule__Class__Group_3__3__Impl ;
    public final void rule__Class__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:905:1: ( rule__Class__Group_3__3__Impl )
            // InternalRails.g:906:2: rule__Class__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group_3__3__Impl();

            state._fsp--;


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
    // InternalRails.g:912:1: rule__Class__Group_3__3__Impl : ( ( rule__Class__SuperTypeAssignment_3_3 ) ) ;
    public final void rule__Class__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:916:1: ( ( ( rule__Class__SuperTypeAssignment_3_3 ) ) )
            // InternalRails.g:917:1: ( ( rule__Class__SuperTypeAssignment_3_3 ) )
            {
            // InternalRails.g:917:1: ( ( rule__Class__SuperTypeAssignment_3_3 ) )
            // InternalRails.g:918:1: ( rule__Class__SuperTypeAssignment_3_3 )
            {
             before(grammarAccess.getClassAccess().getSuperTypeAssignment_3_3()); 
            // InternalRails.g:919:1: ( rule__Class__SuperTypeAssignment_3_3 )
            // InternalRails.g:919:2: rule__Class__SuperTypeAssignment_3_3
            {
            pushFollow(FOLLOW_2);
            rule__Class__SuperTypeAssignment_3_3();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getSuperTypeAssignment_3_3()); 

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
    // InternalRails.g:937:1: rule__NamespacedModuleName__Group__0 : rule__NamespacedModuleName__Group__0__Impl rule__NamespacedModuleName__Group__1 ;
    public final void rule__NamespacedModuleName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:941:1: ( rule__NamespacedModuleName__Group__0__Impl rule__NamespacedModuleName__Group__1 )
            // InternalRails.g:942:2: rule__NamespacedModuleName__Group__0__Impl rule__NamespacedModuleName__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__NamespacedModuleName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamespacedModuleName__Group__1();

            state._fsp--;


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
    // InternalRails.g:949:1: rule__NamespacedModuleName__Group__0__Impl : ( ( rule__NamespacedModuleName__Group_0__0 )* ) ;
    public final void rule__NamespacedModuleName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:953:1: ( ( ( rule__NamespacedModuleName__Group_0__0 )* ) )
            // InternalRails.g:954:1: ( ( rule__NamespacedModuleName__Group_0__0 )* )
            {
            // InternalRails.g:954:1: ( ( rule__NamespacedModuleName__Group_0__0 )* )
            // InternalRails.g:955:1: ( rule__NamespacedModuleName__Group_0__0 )*
            {
             before(grammarAccess.getNamespacedModuleNameAccess().getGroup_0()); 
            // InternalRails.g:956:1: ( rule__NamespacedModuleName__Group_0__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    int LA16_1 = input.LA(2);

                    if ( (LA16_1==25) ) {
                        alt16=1;
                    }


                }


                switch (alt16) {
            	case 1 :
            	    // InternalRails.g:956:2: rule__NamespacedModuleName__Group_0__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__NamespacedModuleName__Group_0__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getNamespacedModuleNameAccess().getGroup_0()); 

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
    // InternalRails.g:966:1: rule__NamespacedModuleName__Group__1 : rule__NamespacedModuleName__Group__1__Impl ;
    public final void rule__NamespacedModuleName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:970:1: ( rule__NamespacedModuleName__Group__1__Impl )
            // InternalRails.g:971:2: rule__NamespacedModuleName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NamespacedModuleName__Group__1__Impl();

            state._fsp--;


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
    // InternalRails.g:977:1: rule__NamespacedModuleName__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__NamespacedModuleName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:981:1: ( ( RULE_ID ) )
            // InternalRails.g:982:1: ( RULE_ID )
            {
            // InternalRails.g:982:1: ( RULE_ID )
            // InternalRails.g:983:1: RULE_ID
            {
             before(grammarAccess.getNamespacedModuleNameAccess().getIDTerminalRuleCall_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNamespacedModuleNameAccess().getIDTerminalRuleCall_1()); 

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
    // InternalRails.g:998:1: rule__NamespacedModuleName__Group_0__0 : rule__NamespacedModuleName__Group_0__0__Impl rule__NamespacedModuleName__Group_0__1 ;
    public final void rule__NamespacedModuleName__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1002:1: ( rule__NamespacedModuleName__Group_0__0__Impl rule__NamespacedModuleName__Group_0__1 )
            // InternalRails.g:1003:2: rule__NamespacedModuleName__Group_0__0__Impl rule__NamespacedModuleName__Group_0__1
            {
            pushFollow(FOLLOW_9);
            rule__NamespacedModuleName__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NamespacedModuleName__Group_0__1();

            state._fsp--;


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
    // InternalRails.g:1010:1: rule__NamespacedModuleName__Group_0__0__Impl : ( RULE_ID ) ;
    public final void rule__NamespacedModuleName__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1014:1: ( ( RULE_ID ) )
            // InternalRails.g:1015:1: ( RULE_ID )
            {
            // InternalRails.g:1015:1: ( RULE_ID )
            // InternalRails.g:1016:1: RULE_ID
            {
             before(grammarAccess.getNamespacedModuleNameAccess().getIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNamespacedModuleNameAccess().getIDTerminalRuleCall_0_0()); 

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
    // InternalRails.g:1027:1: rule__NamespacedModuleName__Group_0__1 : rule__NamespacedModuleName__Group_0__1__Impl ;
    public final void rule__NamespacedModuleName__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1031:1: ( rule__NamespacedModuleName__Group_0__1__Impl )
            // InternalRails.g:1032:2: rule__NamespacedModuleName__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NamespacedModuleName__Group_0__1__Impl();

            state._fsp--;


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
    // InternalRails.g:1038:1: rule__NamespacedModuleName__Group_0__1__Impl : ( '::' ) ;
    public final void rule__NamespacedModuleName__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1042:1: ( ( '::' ) )
            // InternalRails.g:1043:1: ( '::' )
            {
            // InternalRails.g:1043:1: ( '::' )
            // InternalRails.g:1044:1: '::'
            {
             before(grammarAccess.getNamespacedModuleNameAccess().getColonColonKeyword_0_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getNamespacedModuleNameAccess().getColonColonKeyword_0_1()); 

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
    // InternalRails.g:1061:1: rule__MethodChainCall__Group__0 : rule__MethodChainCall__Group__0__Impl rule__MethodChainCall__Group__1 ;
    public final void rule__MethodChainCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1065:1: ( rule__MethodChainCall__Group__0__Impl rule__MethodChainCall__Group__1 )
            // InternalRails.g:1066:2: rule__MethodChainCall__Group__0__Impl rule__MethodChainCall__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__MethodChainCall__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodChainCall__Group__1();

            state._fsp--;


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
    // InternalRails.g:1073:1: rule__MethodChainCall__Group__0__Impl : ( ruleNamespacedModuleName ) ;
    public final void rule__MethodChainCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1077:1: ( ( ruleNamespacedModuleName ) )
            // InternalRails.g:1078:1: ( ruleNamespacedModuleName )
            {
            // InternalRails.g:1078:1: ( ruleNamespacedModuleName )
            // InternalRails.g:1079:1: ruleNamespacedModuleName
            {
             before(grammarAccess.getMethodChainCallAccess().getNamespacedModuleNameParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleNamespacedModuleName();

            state._fsp--;

             after(grammarAccess.getMethodChainCallAccess().getNamespacedModuleNameParserRuleCall_0()); 

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
    // InternalRails.g:1090:1: rule__MethodChainCall__Group__1 : rule__MethodChainCall__Group__1__Impl ;
    public final void rule__MethodChainCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1094:1: ( rule__MethodChainCall__Group__1__Impl )
            // InternalRails.g:1095:2: rule__MethodChainCall__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MethodChainCall__Group__1__Impl();

            state._fsp--;


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
    // InternalRails.g:1101:1: rule__MethodChainCall__Group__1__Impl : ( ( rule__MethodChainCall__Group_1__0 )* ) ;
    public final void rule__MethodChainCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1105:1: ( ( ( rule__MethodChainCall__Group_1__0 )* ) )
            // InternalRails.g:1106:1: ( ( rule__MethodChainCall__Group_1__0 )* )
            {
            // InternalRails.g:1106:1: ( ( rule__MethodChainCall__Group_1__0 )* )
            // InternalRails.g:1107:1: ( rule__MethodChainCall__Group_1__0 )*
            {
             before(grammarAccess.getMethodChainCallAccess().getGroup_1()); 
            // InternalRails.g:1108:1: ( rule__MethodChainCall__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==26) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalRails.g:1108:2: rule__MethodChainCall__Group_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__MethodChainCall__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getMethodChainCallAccess().getGroup_1()); 

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


    // $ANTLR start "rule__MethodChainCall__Group_1__0"
    // InternalRails.g:1122:1: rule__MethodChainCall__Group_1__0 : rule__MethodChainCall__Group_1__0__Impl rule__MethodChainCall__Group_1__1 ;
    public final void rule__MethodChainCall__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1126:1: ( rule__MethodChainCall__Group_1__0__Impl rule__MethodChainCall__Group_1__1 )
            // InternalRails.g:1127:2: rule__MethodChainCall__Group_1__0__Impl rule__MethodChainCall__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__MethodChainCall__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodChainCall__Group_1__1();

            state._fsp--;


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
    // InternalRails.g:1134:1: rule__MethodChainCall__Group_1__0__Impl : ( '.' ) ;
    public final void rule__MethodChainCall__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1138:1: ( ( '.' ) )
            // InternalRails.g:1139:1: ( '.' )
            {
            // InternalRails.g:1139:1: ( '.' )
            // InternalRails.g:1140:1: '.'
            {
             before(grammarAccess.getMethodChainCallAccess().getFullStopKeyword_1_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getMethodChainCallAccess().getFullStopKeyword_1_0()); 

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
    // InternalRails.g:1153:1: rule__MethodChainCall__Group_1__1 : rule__MethodChainCall__Group_1__1__Impl ;
    public final void rule__MethodChainCall__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1157:1: ( rule__MethodChainCall__Group_1__1__Impl )
            // InternalRails.g:1158:2: rule__MethodChainCall__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MethodChainCall__Group_1__1__Impl();

            state._fsp--;


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
    // InternalRails.g:1164:1: rule__MethodChainCall__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__MethodChainCall__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1168:1: ( ( RULE_ID ) )
            // InternalRails.g:1169:1: ( RULE_ID )
            {
            // InternalRails.g:1169:1: ( RULE_ID )
            // InternalRails.g:1170:1: RULE_ID
            {
             before(grammarAccess.getMethodChainCallAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMethodChainCallAccess().getIDTerminalRuleCall_1_1()); 

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
    // InternalRails.g:1185:1: rule__HasMany__Group__0 : rule__HasMany__Group__0__Impl rule__HasMany__Group__1 ;
    public final void rule__HasMany__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1189:1: ( rule__HasMany__Group__0__Impl rule__HasMany__Group__1 )
            // InternalRails.g:1190:2: rule__HasMany__Group__0__Impl rule__HasMany__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__HasMany__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HasMany__Group__1();

            state._fsp--;


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
    // InternalRails.g:1197:1: rule__HasMany__Group__0__Impl : ( RULE_HAS_MANY_WORD ) ;
    public final void rule__HasMany__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1201:1: ( ( RULE_HAS_MANY_WORD ) )
            // InternalRails.g:1202:1: ( RULE_HAS_MANY_WORD )
            {
            // InternalRails.g:1202:1: ( RULE_HAS_MANY_WORD )
            // InternalRails.g:1203:1: RULE_HAS_MANY_WORD
            {
             before(grammarAccess.getHasManyAccess().getHAS_MANY_WORDTerminalRuleCall_0()); 
            match(input,RULE_HAS_MANY_WORD,FOLLOW_2); 
             after(grammarAccess.getHasManyAccess().getHAS_MANY_WORDTerminalRuleCall_0()); 

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
    // InternalRails.g:1214:1: rule__HasMany__Group__1 : rule__HasMany__Group__1__Impl rule__HasMany__Group__2 ;
    public final void rule__HasMany__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1218:1: ( rule__HasMany__Group__1__Impl rule__HasMany__Group__2 )
            // InternalRails.g:1219:2: rule__HasMany__Group__1__Impl rule__HasMany__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__HasMany__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HasMany__Group__2();

            state._fsp--;


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
    // InternalRails.g:1226:1: rule__HasMany__Group__1__Impl : ( ( RULE_SPACE )* ) ;
    public final void rule__HasMany__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1230:1: ( ( ( RULE_SPACE )* ) )
            // InternalRails.g:1231:1: ( ( RULE_SPACE )* )
            {
            // InternalRails.g:1231:1: ( ( RULE_SPACE )* )
            // InternalRails.g:1232:1: ( RULE_SPACE )*
            {
             before(grammarAccess.getHasManyAccess().getSPACETerminalRuleCall_1()); 
            // InternalRails.g:1233:1: ( RULE_SPACE )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_SPACE) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalRails.g:1233:3: RULE_SPACE
            	    {
            	    match(input,RULE_SPACE,FOLLOW_4); 

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getHasManyAccess().getSPACETerminalRuleCall_1()); 

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
    // InternalRails.g:1243:1: rule__HasMany__Group__2 : rule__HasMany__Group__2__Impl rule__HasMany__Group__3 ;
    public final void rule__HasMany__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1247:1: ( rule__HasMany__Group__2__Impl rule__HasMany__Group__3 )
            // InternalRails.g:1248:2: rule__HasMany__Group__2__Impl rule__HasMany__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__HasMany__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HasMany__Group__3();

            state._fsp--;


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
    // InternalRails.g:1255:1: rule__HasMany__Group__2__Impl : ( ( rule__HasMany__NameAssignment_2 ) ) ;
    public final void rule__HasMany__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1259:1: ( ( ( rule__HasMany__NameAssignment_2 ) ) )
            // InternalRails.g:1260:1: ( ( rule__HasMany__NameAssignment_2 ) )
            {
            // InternalRails.g:1260:1: ( ( rule__HasMany__NameAssignment_2 ) )
            // InternalRails.g:1261:1: ( rule__HasMany__NameAssignment_2 )
            {
             before(grammarAccess.getHasManyAccess().getNameAssignment_2()); 
            // InternalRails.g:1262:1: ( rule__HasMany__NameAssignment_2 )
            // InternalRails.g:1262:2: rule__HasMany__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__HasMany__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getHasManyAccess().getNameAssignment_2()); 

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
    // InternalRails.g:1272:1: rule__HasMany__Group__3 : rule__HasMany__Group__3__Impl rule__HasMany__Group__4 ;
    public final void rule__HasMany__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1276:1: ( rule__HasMany__Group__3__Impl rule__HasMany__Group__4 )
            // InternalRails.g:1277:2: rule__HasMany__Group__3__Impl rule__HasMany__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__HasMany__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HasMany__Group__4();

            state._fsp--;


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
    // InternalRails.g:1284:1: rule__HasMany__Group__3__Impl : ( ( RULE_SPACE )* ) ;
    public final void rule__HasMany__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1288:1: ( ( ( RULE_SPACE )* ) )
            // InternalRails.g:1289:1: ( ( RULE_SPACE )* )
            {
            // InternalRails.g:1289:1: ( ( RULE_SPACE )* )
            // InternalRails.g:1290:1: ( RULE_SPACE )*
            {
             before(grammarAccess.getHasManyAccess().getSPACETerminalRuleCall_3()); 
            // InternalRails.g:1291:1: ( RULE_SPACE )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_SPACE) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalRails.g:1291:3: RULE_SPACE
            	    {
            	    match(input,RULE_SPACE,FOLLOW_4); 

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getHasManyAccess().getSPACETerminalRuleCall_3()); 

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
    // InternalRails.g:1301:1: rule__HasMany__Group__4 : rule__HasMany__Group__4__Impl rule__HasMany__Group__5 ;
    public final void rule__HasMany__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1305:1: ( rule__HasMany__Group__4__Impl rule__HasMany__Group__5 )
            // InternalRails.g:1306:2: rule__HasMany__Group__4__Impl rule__HasMany__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__HasMany__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HasMany__Group__5();

            state._fsp--;


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
    // InternalRails.g:1313:1: rule__HasMany__Group__4__Impl : ( ( rule__HasMany__OptionsAssignment_4 )* ) ;
    public final void rule__HasMany__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1317:1: ( ( ( rule__HasMany__OptionsAssignment_4 )* ) )
            // InternalRails.g:1318:1: ( ( rule__HasMany__OptionsAssignment_4 )* )
            {
            // InternalRails.g:1318:1: ( ( rule__HasMany__OptionsAssignment_4 )* )
            // InternalRails.g:1319:1: ( rule__HasMany__OptionsAssignment_4 )*
            {
             before(grammarAccess.getHasManyAccess().getOptionsAssignment_4()); 
            // InternalRails.g:1320:1: ( rule__HasMany__OptionsAssignment_4 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==27) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalRails.g:1320:2: rule__HasMany__OptionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__HasMany__OptionsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getHasManyAccess().getOptionsAssignment_4()); 

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
    // InternalRails.g:1330:1: rule__HasMany__Group__5 : rule__HasMany__Group__5__Impl ;
    public final void rule__HasMany__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1334:1: ( rule__HasMany__Group__5__Impl )
            // InternalRails.g:1335:2: rule__HasMany__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HasMany__Group__5__Impl();

            state._fsp--;


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
    // InternalRails.g:1341:1: rule__HasMany__Group__5__Impl : ( ( RULE_SL_COMMENT )? ) ;
    public final void rule__HasMany__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1345:1: ( ( ( RULE_SL_COMMENT )? ) )
            // InternalRails.g:1346:1: ( ( RULE_SL_COMMENT )? )
            {
            // InternalRails.g:1346:1: ( ( RULE_SL_COMMENT )? )
            // InternalRails.g:1347:1: ( RULE_SL_COMMENT )?
            {
             before(grammarAccess.getHasManyAccess().getSL_COMMENTTerminalRuleCall_5()); 
            // InternalRails.g:1348:1: ( RULE_SL_COMMENT )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_SL_COMMENT) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalRails.g:1348:3: RULE_SL_COMMENT
                    {
                    match(input,RULE_SL_COMMENT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getHasManyAccess().getSL_COMMENTTerminalRuleCall_5()); 

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
    // InternalRails.g:1370:1: rule__HasAndBelongsToMany__Group__0 : rule__HasAndBelongsToMany__Group__0__Impl rule__HasAndBelongsToMany__Group__1 ;
    public final void rule__HasAndBelongsToMany__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1374:1: ( rule__HasAndBelongsToMany__Group__0__Impl rule__HasAndBelongsToMany__Group__1 )
            // InternalRails.g:1375:2: rule__HasAndBelongsToMany__Group__0__Impl rule__HasAndBelongsToMany__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__HasAndBelongsToMany__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HasAndBelongsToMany__Group__1();

            state._fsp--;


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
    // InternalRails.g:1382:1: rule__HasAndBelongsToMany__Group__0__Impl : ( RULE_HAS_AND_BELONGS_TO_MANY_WORD ) ;
    public final void rule__HasAndBelongsToMany__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1386:1: ( ( RULE_HAS_AND_BELONGS_TO_MANY_WORD ) )
            // InternalRails.g:1387:1: ( RULE_HAS_AND_BELONGS_TO_MANY_WORD )
            {
            // InternalRails.g:1387:1: ( RULE_HAS_AND_BELONGS_TO_MANY_WORD )
            // InternalRails.g:1388:1: RULE_HAS_AND_BELONGS_TO_MANY_WORD
            {
             before(grammarAccess.getHasAndBelongsToManyAccess().getHAS_AND_BELONGS_TO_MANY_WORDTerminalRuleCall_0()); 
            match(input,RULE_HAS_AND_BELONGS_TO_MANY_WORD,FOLLOW_2); 
             after(grammarAccess.getHasAndBelongsToManyAccess().getHAS_AND_BELONGS_TO_MANY_WORDTerminalRuleCall_0()); 

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
    // InternalRails.g:1399:1: rule__HasAndBelongsToMany__Group__1 : rule__HasAndBelongsToMany__Group__1__Impl rule__HasAndBelongsToMany__Group__2 ;
    public final void rule__HasAndBelongsToMany__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1403:1: ( rule__HasAndBelongsToMany__Group__1__Impl rule__HasAndBelongsToMany__Group__2 )
            // InternalRails.g:1404:2: rule__HasAndBelongsToMany__Group__1__Impl rule__HasAndBelongsToMany__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__HasAndBelongsToMany__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HasAndBelongsToMany__Group__2();

            state._fsp--;


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
    // InternalRails.g:1411:1: rule__HasAndBelongsToMany__Group__1__Impl : ( ( RULE_SPACE )* ) ;
    public final void rule__HasAndBelongsToMany__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1415:1: ( ( ( RULE_SPACE )* ) )
            // InternalRails.g:1416:1: ( ( RULE_SPACE )* )
            {
            // InternalRails.g:1416:1: ( ( RULE_SPACE )* )
            // InternalRails.g:1417:1: ( RULE_SPACE )*
            {
             before(grammarAccess.getHasAndBelongsToManyAccess().getSPACETerminalRuleCall_1()); 
            // InternalRails.g:1418:1: ( RULE_SPACE )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_SPACE) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalRails.g:1418:3: RULE_SPACE
            	    {
            	    match(input,RULE_SPACE,FOLLOW_4); 

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getHasAndBelongsToManyAccess().getSPACETerminalRuleCall_1()); 

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
    // InternalRails.g:1428:1: rule__HasAndBelongsToMany__Group__2 : rule__HasAndBelongsToMany__Group__2__Impl rule__HasAndBelongsToMany__Group__3 ;
    public final void rule__HasAndBelongsToMany__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1432:1: ( rule__HasAndBelongsToMany__Group__2__Impl rule__HasAndBelongsToMany__Group__3 )
            // InternalRails.g:1433:2: rule__HasAndBelongsToMany__Group__2__Impl rule__HasAndBelongsToMany__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__HasAndBelongsToMany__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HasAndBelongsToMany__Group__3();

            state._fsp--;


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
    // InternalRails.g:1440:1: rule__HasAndBelongsToMany__Group__2__Impl : ( ( rule__HasAndBelongsToMany__NameAssignment_2 ) ) ;
    public final void rule__HasAndBelongsToMany__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1444:1: ( ( ( rule__HasAndBelongsToMany__NameAssignment_2 ) ) )
            // InternalRails.g:1445:1: ( ( rule__HasAndBelongsToMany__NameAssignment_2 ) )
            {
            // InternalRails.g:1445:1: ( ( rule__HasAndBelongsToMany__NameAssignment_2 ) )
            // InternalRails.g:1446:1: ( rule__HasAndBelongsToMany__NameAssignment_2 )
            {
             before(grammarAccess.getHasAndBelongsToManyAccess().getNameAssignment_2()); 
            // InternalRails.g:1447:1: ( rule__HasAndBelongsToMany__NameAssignment_2 )
            // InternalRails.g:1447:2: rule__HasAndBelongsToMany__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__HasAndBelongsToMany__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getHasAndBelongsToManyAccess().getNameAssignment_2()); 

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
    // InternalRails.g:1457:1: rule__HasAndBelongsToMany__Group__3 : rule__HasAndBelongsToMany__Group__3__Impl rule__HasAndBelongsToMany__Group__4 ;
    public final void rule__HasAndBelongsToMany__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1461:1: ( rule__HasAndBelongsToMany__Group__3__Impl rule__HasAndBelongsToMany__Group__4 )
            // InternalRails.g:1462:2: rule__HasAndBelongsToMany__Group__3__Impl rule__HasAndBelongsToMany__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__HasAndBelongsToMany__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HasAndBelongsToMany__Group__4();

            state._fsp--;


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
    // InternalRails.g:1469:1: rule__HasAndBelongsToMany__Group__3__Impl : ( ( RULE_SPACE )* ) ;
    public final void rule__HasAndBelongsToMany__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1473:1: ( ( ( RULE_SPACE )* ) )
            // InternalRails.g:1474:1: ( ( RULE_SPACE )* )
            {
            // InternalRails.g:1474:1: ( ( RULE_SPACE )* )
            // InternalRails.g:1475:1: ( RULE_SPACE )*
            {
             before(grammarAccess.getHasAndBelongsToManyAccess().getSPACETerminalRuleCall_3()); 
            // InternalRails.g:1476:1: ( RULE_SPACE )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_SPACE) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalRails.g:1476:3: RULE_SPACE
            	    {
            	    match(input,RULE_SPACE,FOLLOW_4); 

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getHasAndBelongsToManyAccess().getSPACETerminalRuleCall_3()); 

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
    // InternalRails.g:1486:1: rule__HasAndBelongsToMany__Group__4 : rule__HasAndBelongsToMany__Group__4__Impl ;
    public final void rule__HasAndBelongsToMany__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1490:1: ( rule__HasAndBelongsToMany__Group__4__Impl )
            // InternalRails.g:1491:2: rule__HasAndBelongsToMany__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HasAndBelongsToMany__Group__4__Impl();

            state._fsp--;


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
    // InternalRails.g:1497:1: rule__HasAndBelongsToMany__Group__4__Impl : ( ( rule__HasAndBelongsToMany__OptionsAssignment_4 )* ) ;
    public final void rule__HasAndBelongsToMany__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1501:1: ( ( ( rule__HasAndBelongsToMany__OptionsAssignment_4 )* ) )
            // InternalRails.g:1502:1: ( ( rule__HasAndBelongsToMany__OptionsAssignment_4 )* )
            {
            // InternalRails.g:1502:1: ( ( rule__HasAndBelongsToMany__OptionsAssignment_4 )* )
            // InternalRails.g:1503:1: ( rule__HasAndBelongsToMany__OptionsAssignment_4 )*
            {
             before(grammarAccess.getHasAndBelongsToManyAccess().getOptionsAssignment_4()); 
            // InternalRails.g:1504:1: ( rule__HasAndBelongsToMany__OptionsAssignment_4 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==27) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalRails.g:1504:2: rule__HasAndBelongsToMany__OptionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__HasAndBelongsToMany__OptionsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getHasAndBelongsToManyAccess().getOptionsAssignment_4()); 

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
    // InternalRails.g:1524:1: rule__BelongsTo__Group__0 : rule__BelongsTo__Group__0__Impl rule__BelongsTo__Group__1 ;
    public final void rule__BelongsTo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1528:1: ( rule__BelongsTo__Group__0__Impl rule__BelongsTo__Group__1 )
            // InternalRails.g:1529:2: rule__BelongsTo__Group__0__Impl rule__BelongsTo__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__BelongsTo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BelongsTo__Group__1();

            state._fsp--;


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
    // InternalRails.g:1536:1: rule__BelongsTo__Group__0__Impl : ( RULE_BELONGS_TO_WORD ) ;
    public final void rule__BelongsTo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1540:1: ( ( RULE_BELONGS_TO_WORD ) )
            // InternalRails.g:1541:1: ( RULE_BELONGS_TO_WORD )
            {
            // InternalRails.g:1541:1: ( RULE_BELONGS_TO_WORD )
            // InternalRails.g:1542:1: RULE_BELONGS_TO_WORD
            {
             before(grammarAccess.getBelongsToAccess().getBELONGS_TO_WORDTerminalRuleCall_0()); 
            match(input,RULE_BELONGS_TO_WORD,FOLLOW_2); 
             after(grammarAccess.getBelongsToAccess().getBELONGS_TO_WORDTerminalRuleCall_0()); 

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
    // InternalRails.g:1553:1: rule__BelongsTo__Group__1 : rule__BelongsTo__Group__1__Impl rule__BelongsTo__Group__2 ;
    public final void rule__BelongsTo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1557:1: ( rule__BelongsTo__Group__1__Impl rule__BelongsTo__Group__2 )
            // InternalRails.g:1558:2: rule__BelongsTo__Group__1__Impl rule__BelongsTo__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__BelongsTo__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BelongsTo__Group__2();

            state._fsp--;


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
    // InternalRails.g:1565:1: rule__BelongsTo__Group__1__Impl : ( ( RULE_SPACE )* ) ;
    public final void rule__BelongsTo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1569:1: ( ( ( RULE_SPACE )* ) )
            // InternalRails.g:1570:1: ( ( RULE_SPACE )* )
            {
            // InternalRails.g:1570:1: ( ( RULE_SPACE )* )
            // InternalRails.g:1571:1: ( RULE_SPACE )*
            {
             before(grammarAccess.getBelongsToAccess().getSPACETerminalRuleCall_1()); 
            // InternalRails.g:1572:1: ( RULE_SPACE )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_SPACE) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalRails.g:1572:3: RULE_SPACE
            	    {
            	    match(input,RULE_SPACE,FOLLOW_4); 

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getBelongsToAccess().getSPACETerminalRuleCall_1()); 

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
    // InternalRails.g:1582:1: rule__BelongsTo__Group__2 : rule__BelongsTo__Group__2__Impl rule__BelongsTo__Group__3 ;
    public final void rule__BelongsTo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1586:1: ( rule__BelongsTo__Group__2__Impl rule__BelongsTo__Group__3 )
            // InternalRails.g:1587:2: rule__BelongsTo__Group__2__Impl rule__BelongsTo__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__BelongsTo__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BelongsTo__Group__3();

            state._fsp--;


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
    // InternalRails.g:1594:1: rule__BelongsTo__Group__2__Impl : ( ( rule__BelongsTo__NameAssignment_2 ) ) ;
    public final void rule__BelongsTo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1598:1: ( ( ( rule__BelongsTo__NameAssignment_2 ) ) )
            // InternalRails.g:1599:1: ( ( rule__BelongsTo__NameAssignment_2 ) )
            {
            // InternalRails.g:1599:1: ( ( rule__BelongsTo__NameAssignment_2 ) )
            // InternalRails.g:1600:1: ( rule__BelongsTo__NameAssignment_2 )
            {
             before(grammarAccess.getBelongsToAccess().getNameAssignment_2()); 
            // InternalRails.g:1601:1: ( rule__BelongsTo__NameAssignment_2 )
            // InternalRails.g:1601:2: rule__BelongsTo__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__BelongsTo__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBelongsToAccess().getNameAssignment_2()); 

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
    // InternalRails.g:1611:1: rule__BelongsTo__Group__3 : rule__BelongsTo__Group__3__Impl rule__BelongsTo__Group__4 ;
    public final void rule__BelongsTo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1615:1: ( rule__BelongsTo__Group__3__Impl rule__BelongsTo__Group__4 )
            // InternalRails.g:1616:2: rule__BelongsTo__Group__3__Impl rule__BelongsTo__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__BelongsTo__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BelongsTo__Group__4();

            state._fsp--;


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
    // InternalRails.g:1623:1: rule__BelongsTo__Group__3__Impl : ( ( RULE_SPACE )* ) ;
    public final void rule__BelongsTo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1627:1: ( ( ( RULE_SPACE )* ) )
            // InternalRails.g:1628:1: ( ( RULE_SPACE )* )
            {
            // InternalRails.g:1628:1: ( ( RULE_SPACE )* )
            // InternalRails.g:1629:1: ( RULE_SPACE )*
            {
             before(grammarAccess.getBelongsToAccess().getSPACETerminalRuleCall_3()); 
            // InternalRails.g:1630:1: ( RULE_SPACE )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_SPACE) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalRails.g:1630:3: RULE_SPACE
            	    {
            	    match(input,RULE_SPACE,FOLLOW_4); 

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getBelongsToAccess().getSPACETerminalRuleCall_3()); 

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
    // InternalRails.g:1640:1: rule__BelongsTo__Group__4 : rule__BelongsTo__Group__4__Impl ;
    public final void rule__BelongsTo__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1644:1: ( rule__BelongsTo__Group__4__Impl )
            // InternalRails.g:1645:2: rule__BelongsTo__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BelongsTo__Group__4__Impl();

            state._fsp--;


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
    // InternalRails.g:1651:1: rule__BelongsTo__Group__4__Impl : ( ( rule__BelongsTo__OptionsAssignment_4 )* ) ;
    public final void rule__BelongsTo__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1655:1: ( ( ( rule__BelongsTo__OptionsAssignment_4 )* ) )
            // InternalRails.g:1656:1: ( ( rule__BelongsTo__OptionsAssignment_4 )* )
            {
            // InternalRails.g:1656:1: ( ( rule__BelongsTo__OptionsAssignment_4 )* )
            // InternalRails.g:1657:1: ( rule__BelongsTo__OptionsAssignment_4 )*
            {
             before(grammarAccess.getBelongsToAccess().getOptionsAssignment_4()); 
            // InternalRails.g:1658:1: ( rule__BelongsTo__OptionsAssignment_4 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==27) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalRails.g:1658:2: rule__BelongsTo__OptionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__BelongsTo__OptionsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getBelongsToAccess().getOptionsAssignment_4()); 

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
    // InternalRails.g:1678:1: rule__HashKeyValue__Group__0 : rule__HashKeyValue__Group__0__Impl rule__HashKeyValue__Group__1 ;
    public final void rule__HashKeyValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1682:1: ( rule__HashKeyValue__Group__0__Impl rule__HashKeyValue__Group__1 )
            // InternalRails.g:1683:2: rule__HashKeyValue__Group__0__Impl rule__HashKeyValue__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__HashKeyValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HashKeyValue__Group__1();

            state._fsp--;


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
    // InternalRails.g:1690:1: rule__HashKeyValue__Group__0__Impl : ( ',' ) ;
    public final void rule__HashKeyValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1694:1: ( ( ',' ) )
            // InternalRails.g:1695:1: ( ',' )
            {
            // InternalRails.g:1695:1: ( ',' )
            // InternalRails.g:1696:1: ','
            {
             before(grammarAccess.getHashKeyValueAccess().getCommaKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getHashKeyValueAccess().getCommaKeyword_0()); 

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
    // InternalRails.g:1709:1: rule__HashKeyValue__Group__1 : rule__HashKeyValue__Group__1__Impl rule__HashKeyValue__Group__2 ;
    public final void rule__HashKeyValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1713:1: ( rule__HashKeyValue__Group__1__Impl rule__HashKeyValue__Group__2 )
            // InternalRails.g:1714:2: rule__HashKeyValue__Group__1__Impl rule__HashKeyValue__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__HashKeyValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HashKeyValue__Group__2();

            state._fsp--;


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
    // InternalRails.g:1721:1: rule__HashKeyValue__Group__1__Impl : ( ( RULE_SPACE )* ) ;
    public final void rule__HashKeyValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1725:1: ( ( ( RULE_SPACE )* ) )
            // InternalRails.g:1726:1: ( ( RULE_SPACE )* )
            {
            // InternalRails.g:1726:1: ( ( RULE_SPACE )* )
            // InternalRails.g:1727:1: ( RULE_SPACE )*
            {
             before(grammarAccess.getHashKeyValueAccess().getSPACETerminalRuleCall_1()); 
            // InternalRails.g:1728:1: ( RULE_SPACE )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_SPACE) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalRails.g:1728:3: RULE_SPACE
            	    {
            	    match(input,RULE_SPACE,FOLLOW_4); 

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getHashKeyValueAccess().getSPACETerminalRuleCall_1()); 

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
    // InternalRails.g:1738:1: rule__HashKeyValue__Group__2 : rule__HashKeyValue__Group__2__Impl rule__HashKeyValue__Group__3 ;
    public final void rule__HashKeyValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1742:1: ( rule__HashKeyValue__Group__2__Impl rule__HashKeyValue__Group__3 )
            // InternalRails.g:1743:2: rule__HashKeyValue__Group__2__Impl rule__HashKeyValue__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__HashKeyValue__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HashKeyValue__Group__3();

            state._fsp--;


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
    // InternalRails.g:1750:1: rule__HashKeyValue__Group__2__Impl : ( ( rule__HashKeyValue__Alternatives_2 ) ) ;
    public final void rule__HashKeyValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1754:1: ( ( ( rule__HashKeyValue__Alternatives_2 ) ) )
            // InternalRails.g:1755:1: ( ( rule__HashKeyValue__Alternatives_2 ) )
            {
            // InternalRails.g:1755:1: ( ( rule__HashKeyValue__Alternatives_2 ) )
            // InternalRails.g:1756:1: ( rule__HashKeyValue__Alternatives_2 )
            {
             before(grammarAccess.getHashKeyValueAccess().getAlternatives_2()); 
            // InternalRails.g:1757:1: ( rule__HashKeyValue__Alternatives_2 )
            // InternalRails.g:1757:2: rule__HashKeyValue__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__HashKeyValue__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getHashKeyValueAccess().getAlternatives_2()); 

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
    // InternalRails.g:1767:1: rule__HashKeyValue__Group__3 : rule__HashKeyValue__Group__3__Impl rule__HashKeyValue__Group__4 ;
    public final void rule__HashKeyValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1771:1: ( rule__HashKeyValue__Group__3__Impl rule__HashKeyValue__Group__4 )
            // InternalRails.g:1772:2: rule__HashKeyValue__Group__3__Impl rule__HashKeyValue__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__HashKeyValue__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HashKeyValue__Group__4();

            state._fsp--;


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
    // InternalRails.g:1779:1: rule__HashKeyValue__Group__3__Impl : ( ( RULE_SPACE )* ) ;
    public final void rule__HashKeyValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1783:1: ( ( ( RULE_SPACE )* ) )
            // InternalRails.g:1784:1: ( ( RULE_SPACE )* )
            {
            // InternalRails.g:1784:1: ( ( RULE_SPACE )* )
            // InternalRails.g:1785:1: ( RULE_SPACE )*
            {
             before(grammarAccess.getHashKeyValueAccess().getSPACETerminalRuleCall_3()); 
            // InternalRails.g:1786:1: ( RULE_SPACE )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_SPACE) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalRails.g:1786:3: RULE_SPACE
            	    {
            	    match(input,RULE_SPACE,FOLLOW_4); 

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getHashKeyValueAccess().getSPACETerminalRuleCall_3()); 

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
    // InternalRails.g:1796:1: rule__HashKeyValue__Group__4 : rule__HashKeyValue__Group__4__Impl rule__HashKeyValue__Group__5 ;
    public final void rule__HashKeyValue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1800:1: ( rule__HashKeyValue__Group__4__Impl rule__HashKeyValue__Group__5 )
            // InternalRails.g:1801:2: rule__HashKeyValue__Group__4__Impl rule__HashKeyValue__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__HashKeyValue__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HashKeyValue__Group__5();

            state._fsp--;


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
    // InternalRails.g:1808:1: rule__HashKeyValue__Group__4__Impl : ( ( rule__HashKeyValue__ValueAssignment_4 ) ) ;
    public final void rule__HashKeyValue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1812:1: ( ( ( rule__HashKeyValue__ValueAssignment_4 ) ) )
            // InternalRails.g:1813:1: ( ( rule__HashKeyValue__ValueAssignment_4 ) )
            {
            // InternalRails.g:1813:1: ( ( rule__HashKeyValue__ValueAssignment_4 ) )
            // InternalRails.g:1814:1: ( rule__HashKeyValue__ValueAssignment_4 )
            {
             before(grammarAccess.getHashKeyValueAccess().getValueAssignment_4()); 
            // InternalRails.g:1815:1: ( rule__HashKeyValue__ValueAssignment_4 )
            // InternalRails.g:1815:2: rule__HashKeyValue__ValueAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__HashKeyValue__ValueAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getHashKeyValueAccess().getValueAssignment_4()); 

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
    // InternalRails.g:1825:1: rule__HashKeyValue__Group__5 : rule__HashKeyValue__Group__5__Impl ;
    public final void rule__HashKeyValue__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1829:1: ( rule__HashKeyValue__Group__5__Impl )
            // InternalRails.g:1830:2: rule__HashKeyValue__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HashKeyValue__Group__5__Impl();

            state._fsp--;


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
    // InternalRails.g:1836:1: rule__HashKeyValue__Group__5__Impl : ( ( RULE_SPACE )* ) ;
    public final void rule__HashKeyValue__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1840:1: ( ( ( RULE_SPACE )* ) )
            // InternalRails.g:1841:1: ( ( RULE_SPACE )* )
            {
            // InternalRails.g:1841:1: ( ( RULE_SPACE )* )
            // InternalRails.g:1842:1: ( RULE_SPACE )*
            {
             before(grammarAccess.getHashKeyValueAccess().getSPACETerminalRuleCall_5()); 
            // InternalRails.g:1843:1: ( RULE_SPACE )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_SPACE) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalRails.g:1843:3: RULE_SPACE
            	    {
            	    match(input,RULE_SPACE,FOLLOW_4); 

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getHashKeyValueAccess().getSPACETerminalRuleCall_5()); 

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
    // InternalRails.g:1865:1: rule__HashKeyValue__Group_2_0__0 : rule__HashKeyValue__Group_2_0__0__Impl rule__HashKeyValue__Group_2_0__1 ;
    public final void rule__HashKeyValue__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1869:1: ( rule__HashKeyValue__Group_2_0__0__Impl rule__HashKeyValue__Group_2_0__1 )
            // InternalRails.g:1870:2: rule__HashKeyValue__Group_2_0__0__Impl rule__HashKeyValue__Group_2_0__1
            {
            pushFollow(FOLLOW_20);
            rule__HashKeyValue__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HashKeyValue__Group_2_0__1();

            state._fsp--;


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
    // InternalRails.g:1877:1: rule__HashKeyValue__Group_2_0__0__Impl : ( ( rule__HashKeyValue__KeyAssignment_2_0_0 ) ) ;
    public final void rule__HashKeyValue__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1881:1: ( ( ( rule__HashKeyValue__KeyAssignment_2_0_0 ) ) )
            // InternalRails.g:1882:1: ( ( rule__HashKeyValue__KeyAssignment_2_0_0 ) )
            {
            // InternalRails.g:1882:1: ( ( rule__HashKeyValue__KeyAssignment_2_0_0 ) )
            // InternalRails.g:1883:1: ( rule__HashKeyValue__KeyAssignment_2_0_0 )
            {
             before(grammarAccess.getHashKeyValueAccess().getKeyAssignment_2_0_0()); 
            // InternalRails.g:1884:1: ( rule__HashKeyValue__KeyAssignment_2_0_0 )
            // InternalRails.g:1884:2: rule__HashKeyValue__KeyAssignment_2_0_0
            {
            pushFollow(FOLLOW_2);
            rule__HashKeyValue__KeyAssignment_2_0_0();

            state._fsp--;


            }

             after(grammarAccess.getHashKeyValueAccess().getKeyAssignment_2_0_0()); 

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
    // InternalRails.g:1894:1: rule__HashKeyValue__Group_2_0__1 : rule__HashKeyValue__Group_2_0__1__Impl ;
    public final void rule__HashKeyValue__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1898:1: ( rule__HashKeyValue__Group_2_0__1__Impl )
            // InternalRails.g:1899:2: rule__HashKeyValue__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HashKeyValue__Group_2_0__1__Impl();

            state._fsp--;


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
    // InternalRails.g:1905:1: rule__HashKeyValue__Group_2_0__1__Impl : ( ':' ) ;
    public final void rule__HashKeyValue__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1909:1: ( ( ':' ) )
            // InternalRails.g:1910:1: ( ':' )
            {
            // InternalRails.g:1910:1: ( ':' )
            // InternalRails.g:1911:1: ':'
            {
             before(grammarAccess.getHashKeyValueAccess().getColonKeyword_2_0_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getHashKeyValueAccess().getColonKeyword_2_0_1()); 

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
    // InternalRails.g:1928:1: rule__HashKeyValue__Group_2_1__0 : rule__HashKeyValue__Group_2_1__0__Impl rule__HashKeyValue__Group_2_1__1 ;
    public final void rule__HashKeyValue__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1932:1: ( rule__HashKeyValue__Group_2_1__0__Impl rule__HashKeyValue__Group_2_1__1 )
            // InternalRails.g:1933:2: rule__HashKeyValue__Group_2_1__0__Impl rule__HashKeyValue__Group_2_1__1
            {
            pushFollow(FOLLOW_21);
            rule__HashKeyValue__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HashKeyValue__Group_2_1__1();

            state._fsp--;


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
    // InternalRails.g:1940:1: rule__HashKeyValue__Group_2_1__0__Impl : ( ( rule__HashKeyValue__KeyAssignment_2_1_0 ) ) ;
    public final void rule__HashKeyValue__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1944:1: ( ( ( rule__HashKeyValue__KeyAssignment_2_1_0 ) ) )
            // InternalRails.g:1945:1: ( ( rule__HashKeyValue__KeyAssignment_2_1_0 ) )
            {
            // InternalRails.g:1945:1: ( ( rule__HashKeyValue__KeyAssignment_2_1_0 ) )
            // InternalRails.g:1946:1: ( rule__HashKeyValue__KeyAssignment_2_1_0 )
            {
             before(grammarAccess.getHashKeyValueAccess().getKeyAssignment_2_1_0()); 
            // InternalRails.g:1947:1: ( rule__HashKeyValue__KeyAssignment_2_1_0 )
            // InternalRails.g:1947:2: rule__HashKeyValue__KeyAssignment_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__HashKeyValue__KeyAssignment_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getHashKeyValueAccess().getKeyAssignment_2_1_0()); 

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
    // InternalRails.g:1957:1: rule__HashKeyValue__Group_2_1__1 : rule__HashKeyValue__Group_2_1__1__Impl rule__HashKeyValue__Group_2_1__2 ;
    public final void rule__HashKeyValue__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1961:1: ( rule__HashKeyValue__Group_2_1__1__Impl rule__HashKeyValue__Group_2_1__2 )
            // InternalRails.g:1962:2: rule__HashKeyValue__Group_2_1__1__Impl rule__HashKeyValue__Group_2_1__2
            {
            pushFollow(FOLLOW_21);
            rule__HashKeyValue__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HashKeyValue__Group_2_1__2();

            state._fsp--;


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
    // InternalRails.g:1969:1: rule__HashKeyValue__Group_2_1__1__Impl : ( ( RULE_SPACE )* ) ;
    public final void rule__HashKeyValue__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1973:1: ( ( ( RULE_SPACE )* ) )
            // InternalRails.g:1974:1: ( ( RULE_SPACE )* )
            {
            // InternalRails.g:1974:1: ( ( RULE_SPACE )* )
            // InternalRails.g:1975:1: ( RULE_SPACE )*
            {
             before(grammarAccess.getHashKeyValueAccess().getSPACETerminalRuleCall_2_1_1()); 
            // InternalRails.g:1976:1: ( RULE_SPACE )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_SPACE) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalRails.g:1976:3: RULE_SPACE
            	    {
            	    match(input,RULE_SPACE,FOLLOW_4); 

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getHashKeyValueAccess().getSPACETerminalRuleCall_2_1_1()); 

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
    // InternalRails.g:1986:1: rule__HashKeyValue__Group_2_1__2 : rule__HashKeyValue__Group_2_1__2__Impl ;
    public final void rule__HashKeyValue__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:1990:1: ( rule__HashKeyValue__Group_2_1__2__Impl )
            // InternalRails.g:1991:2: rule__HashKeyValue__Group_2_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HashKeyValue__Group_2_1__2__Impl();

            state._fsp--;


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
    // InternalRails.g:1997:1: rule__HashKeyValue__Group_2_1__2__Impl : ( '=>' ) ;
    public final void rule__HashKeyValue__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:2001:1: ( ( '=>' ) )
            // InternalRails.g:2002:1: ( '=>' )
            {
            // InternalRails.g:2002:1: ( '=>' )
            // InternalRails.g:2003:1: '=>'
            {
             before(grammarAccess.getHashKeyValueAccess().getEqualsSignGreaterThanSignKeyword_2_1_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getHashKeyValueAccess().getEqualsSignGreaterThanSignKeyword_2_1_2()); 

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
    // InternalRails.g:2022:1: rule__Method__Group__0 : rule__Method__Group__0__Impl rule__Method__Group__1 ;
    public final void rule__Method__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:2026:1: ( rule__Method__Group__0__Impl rule__Method__Group__1 )
            // InternalRails.g:2027:2: rule__Method__Group__0__Impl rule__Method__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Method__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__1();

            state._fsp--;


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
    // InternalRails.g:2034:1: rule__Method__Group__0__Impl : ( RULE_DEF_WORD ) ;
    public final void rule__Method__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:2038:1: ( ( RULE_DEF_WORD ) )
            // InternalRails.g:2039:1: ( RULE_DEF_WORD )
            {
            // InternalRails.g:2039:1: ( RULE_DEF_WORD )
            // InternalRails.g:2040:1: RULE_DEF_WORD
            {
             before(grammarAccess.getMethodAccess().getDEF_WORDTerminalRuleCall_0()); 
            match(input,RULE_DEF_WORD,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getDEF_WORDTerminalRuleCall_0()); 

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
    // InternalRails.g:2051:1: rule__Method__Group__1 : rule__Method__Group__1__Impl ;
    public final void rule__Method__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:2055:1: ( rule__Method__Group__1__Impl )
            // InternalRails.g:2056:2: rule__Method__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group__1__Impl();

            state._fsp--;


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
    // InternalRails.g:2062:1: rule__Method__Group__1__Impl : ( ( rule__Method__NameAssignment_1 ) ) ;
    public final void rule__Method__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:2066:1: ( ( ( rule__Method__NameAssignment_1 ) ) )
            // InternalRails.g:2067:1: ( ( rule__Method__NameAssignment_1 ) )
            {
            // InternalRails.g:2067:1: ( ( rule__Method__NameAssignment_1 ) )
            // InternalRails.g:2068:1: ( rule__Method__NameAssignment_1 )
            {
             before(grammarAccess.getMethodAccess().getNameAssignment_1()); 
            // InternalRails.g:2069:1: ( rule__Method__NameAssignment_1 )
            // InternalRails.g:2069:2: rule__Method__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Method__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getNameAssignment_1()); 

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


    // $ANTLR start "rule__MethodName__Group__0"
    // InternalRails.g:2083:1: rule__MethodName__Group__0 : rule__MethodName__Group__0__Impl rule__MethodName__Group__1 ;
    public final void rule__MethodName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:2087:1: ( rule__MethodName__Group__0__Impl rule__MethodName__Group__1 )
            // InternalRails.g:2088:2: rule__MethodName__Group__0__Impl rule__MethodName__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__MethodName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodName__Group__1();

            state._fsp--;


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
    // InternalRails.g:2095:1: rule__MethodName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__MethodName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:2099:1: ( ( RULE_ID ) )
            // InternalRails.g:2100:1: ( RULE_ID )
            {
            // InternalRails.g:2100:1: ( RULE_ID )
            // InternalRails.g:2101:1: RULE_ID
            {
             before(grammarAccess.getMethodNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMethodNameAccess().getIDTerminalRuleCall_0()); 

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
    // InternalRails.g:2112:1: rule__MethodName__Group__1 : rule__MethodName__Group__1__Impl ;
    public final void rule__MethodName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:2116:1: ( rule__MethodName__Group__1__Impl )
            // InternalRails.g:2117:2: rule__MethodName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MethodName__Group__1__Impl();

            state._fsp--;


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
    // InternalRails.g:2123:1: rule__MethodName__Group__1__Impl : ( ( rule__MethodName__Alternatives_1 )? ) ;
    public final void rule__MethodName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:2127:1: ( ( ( rule__MethodName__Alternatives_1 )? ) )
            // InternalRails.g:2128:1: ( ( rule__MethodName__Alternatives_1 )? )
            {
            // InternalRails.g:2128:1: ( ( rule__MethodName__Alternatives_1 )? )
            // InternalRails.g:2129:1: ( rule__MethodName__Alternatives_1 )?
            {
             before(grammarAccess.getMethodNameAccess().getAlternatives_1()); 
            // InternalRails.g:2130:1: ( rule__MethodName__Alternatives_1 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=22 && LA32_0<=23)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalRails.g:2130:2: rule__MethodName__Alternatives_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__MethodName__Alternatives_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMethodNameAccess().getAlternatives_1()); 

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
    // InternalRails.g:2145:1: rule__Class__NameAssignment_2 : ( ruleNamespacedModuleName ) ;
    public final void rule__Class__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:2149:1: ( ( ruleNamespacedModuleName ) )
            // InternalRails.g:2150:1: ( ruleNamespacedModuleName )
            {
            // InternalRails.g:2150:1: ( ruleNamespacedModuleName )
            // InternalRails.g:2151:1: ruleNamespacedModuleName
            {
             before(grammarAccess.getClassAccess().getNameNamespacedModuleNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNamespacedModuleName();

            state._fsp--;

             after(grammarAccess.getClassAccess().getNameNamespacedModuleNameParserRuleCall_2_0()); 

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
    // InternalRails.g:2160:1: rule__Class__SuperTypeAssignment_3_3 : ( ruleNamespacedModuleName ) ;
    public final void rule__Class__SuperTypeAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:2164:1: ( ( ruleNamespacedModuleName ) )
            // InternalRails.g:2165:1: ( ruleNamespacedModuleName )
            {
            // InternalRails.g:2165:1: ( ruleNamespacedModuleName )
            // InternalRails.g:2166:1: ruleNamespacedModuleName
            {
             before(grammarAccess.getClassAccess().getSuperTypeNamespacedModuleNameParserRuleCall_3_3_0()); 
            pushFollow(FOLLOW_2);
            ruleNamespacedModuleName();

            state._fsp--;

             after(grammarAccess.getClassAccess().getSuperTypeNamespacedModuleNameParserRuleCall_3_3_0()); 

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
    // InternalRails.g:2175:1: rule__Class__ClassElementsAssignment_5 : ( ruleClassElement ) ;
    public final void rule__Class__ClassElementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:2179:1: ( ( ruleClassElement ) )
            // InternalRails.g:2180:1: ( ruleClassElement )
            {
            // InternalRails.g:2180:1: ( ruleClassElement )
            // InternalRails.g:2181:1: ruleClassElement
            {
             before(grammarAccess.getClassAccess().getClassElementsClassElementParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleClassElement();

            state._fsp--;

             after(grammarAccess.getClassAccess().getClassElementsClassElementParserRuleCall_5_0()); 

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
    // InternalRails.g:2190:1: rule__HasMany__NameAssignment_2 : ( ( rule__HasMany__NameAlternatives_2_0 ) ) ;
    public final void rule__HasMany__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:2194:1: ( ( ( rule__HasMany__NameAlternatives_2_0 ) ) )
            // InternalRails.g:2195:1: ( ( rule__HasMany__NameAlternatives_2_0 ) )
            {
            // InternalRails.g:2195:1: ( ( rule__HasMany__NameAlternatives_2_0 ) )
            // InternalRails.g:2196:1: ( rule__HasMany__NameAlternatives_2_0 )
            {
             before(grammarAccess.getHasManyAccess().getNameAlternatives_2_0()); 
            // InternalRails.g:2197:1: ( rule__HasMany__NameAlternatives_2_0 )
            // InternalRails.g:2197:2: rule__HasMany__NameAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__HasMany__NameAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getHasManyAccess().getNameAlternatives_2_0()); 

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
    // InternalRails.g:2206:1: rule__HasMany__OptionsAssignment_4 : ( ruleHashKeyValue ) ;
    public final void rule__HasMany__OptionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:2210:1: ( ( ruleHashKeyValue ) )
            // InternalRails.g:2211:1: ( ruleHashKeyValue )
            {
            // InternalRails.g:2211:1: ( ruleHashKeyValue )
            // InternalRails.g:2212:1: ruleHashKeyValue
            {
             before(grammarAccess.getHasManyAccess().getOptionsHashKeyValueParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleHashKeyValue();

            state._fsp--;

             after(grammarAccess.getHasManyAccess().getOptionsHashKeyValueParserRuleCall_4_0()); 

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
    // InternalRails.g:2221:1: rule__HasAndBelongsToMany__NameAssignment_2 : ( ( rule__HasAndBelongsToMany__NameAlternatives_2_0 ) ) ;
    public final void rule__HasAndBelongsToMany__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:2225:1: ( ( ( rule__HasAndBelongsToMany__NameAlternatives_2_0 ) ) )
            // InternalRails.g:2226:1: ( ( rule__HasAndBelongsToMany__NameAlternatives_2_0 ) )
            {
            // InternalRails.g:2226:1: ( ( rule__HasAndBelongsToMany__NameAlternatives_2_0 ) )
            // InternalRails.g:2227:1: ( rule__HasAndBelongsToMany__NameAlternatives_2_0 )
            {
             before(grammarAccess.getHasAndBelongsToManyAccess().getNameAlternatives_2_0()); 
            // InternalRails.g:2228:1: ( rule__HasAndBelongsToMany__NameAlternatives_2_0 )
            // InternalRails.g:2228:2: rule__HasAndBelongsToMany__NameAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__HasAndBelongsToMany__NameAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getHasAndBelongsToManyAccess().getNameAlternatives_2_0()); 

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
    // InternalRails.g:2237:1: rule__HasAndBelongsToMany__OptionsAssignment_4 : ( ruleHashKeyValue ) ;
    public final void rule__HasAndBelongsToMany__OptionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:2241:1: ( ( ruleHashKeyValue ) )
            // InternalRails.g:2242:1: ( ruleHashKeyValue )
            {
            // InternalRails.g:2242:1: ( ruleHashKeyValue )
            // InternalRails.g:2243:1: ruleHashKeyValue
            {
             before(grammarAccess.getHasAndBelongsToManyAccess().getOptionsHashKeyValueParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleHashKeyValue();

            state._fsp--;

             after(grammarAccess.getHasAndBelongsToManyAccess().getOptionsHashKeyValueParserRuleCall_4_0()); 

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
    // InternalRails.g:2252:1: rule__BelongsTo__NameAssignment_2 : ( ( rule__BelongsTo__NameAlternatives_2_0 ) ) ;
    public final void rule__BelongsTo__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:2256:1: ( ( ( rule__BelongsTo__NameAlternatives_2_0 ) ) )
            // InternalRails.g:2257:1: ( ( rule__BelongsTo__NameAlternatives_2_0 ) )
            {
            // InternalRails.g:2257:1: ( ( rule__BelongsTo__NameAlternatives_2_0 ) )
            // InternalRails.g:2258:1: ( rule__BelongsTo__NameAlternatives_2_0 )
            {
             before(grammarAccess.getBelongsToAccess().getNameAlternatives_2_0()); 
            // InternalRails.g:2259:1: ( rule__BelongsTo__NameAlternatives_2_0 )
            // InternalRails.g:2259:2: rule__BelongsTo__NameAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__BelongsTo__NameAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getBelongsToAccess().getNameAlternatives_2_0()); 

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
    // InternalRails.g:2268:1: rule__BelongsTo__OptionsAssignment_4 : ( ruleHashKeyValue ) ;
    public final void rule__BelongsTo__OptionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:2272:1: ( ( ruleHashKeyValue ) )
            // InternalRails.g:2273:1: ( ruleHashKeyValue )
            {
            // InternalRails.g:2273:1: ( ruleHashKeyValue )
            // InternalRails.g:2274:1: ruleHashKeyValue
            {
             before(grammarAccess.getBelongsToAccess().getOptionsHashKeyValueParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleHashKeyValue();

            state._fsp--;

             after(grammarAccess.getBelongsToAccess().getOptionsHashKeyValueParserRuleCall_4_0()); 

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
    // InternalRails.g:2283:1: rule__HashKeyValue__KeyAssignment_2_0_0 : ( RULE_ID ) ;
    public final void rule__HashKeyValue__KeyAssignment_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:2287:1: ( ( RULE_ID ) )
            // InternalRails.g:2288:1: ( RULE_ID )
            {
            // InternalRails.g:2288:1: ( RULE_ID )
            // InternalRails.g:2289:1: RULE_ID
            {
             before(grammarAccess.getHashKeyValueAccess().getKeyIDTerminalRuleCall_2_0_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getHashKeyValueAccess().getKeyIDTerminalRuleCall_2_0_0_0()); 

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
    // InternalRails.g:2298:1: rule__HashKeyValue__KeyAssignment_2_1_0 : ( ( rule__HashKeyValue__KeyAlternatives_2_1_0_0 ) ) ;
    public final void rule__HashKeyValue__KeyAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:2302:1: ( ( ( rule__HashKeyValue__KeyAlternatives_2_1_0_0 ) ) )
            // InternalRails.g:2303:1: ( ( rule__HashKeyValue__KeyAlternatives_2_1_0_0 ) )
            {
            // InternalRails.g:2303:1: ( ( rule__HashKeyValue__KeyAlternatives_2_1_0_0 ) )
            // InternalRails.g:2304:1: ( rule__HashKeyValue__KeyAlternatives_2_1_0_0 )
            {
             before(grammarAccess.getHashKeyValueAccess().getKeyAlternatives_2_1_0_0()); 
            // InternalRails.g:2305:1: ( rule__HashKeyValue__KeyAlternatives_2_1_0_0 )
            // InternalRails.g:2305:2: rule__HashKeyValue__KeyAlternatives_2_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__HashKeyValue__KeyAlternatives_2_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getHashKeyValueAccess().getKeyAlternatives_2_1_0_0()); 

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
    // InternalRails.g:2314:1: rule__HashKeyValue__ValueAssignment_4 : ( ( rule__HashKeyValue__ValueAlternatives_4_0 ) ) ;
    public final void rule__HashKeyValue__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:2318:1: ( ( ( rule__HashKeyValue__ValueAlternatives_4_0 ) ) )
            // InternalRails.g:2319:1: ( ( rule__HashKeyValue__ValueAlternatives_4_0 ) )
            {
            // InternalRails.g:2319:1: ( ( rule__HashKeyValue__ValueAlternatives_4_0 ) )
            // InternalRails.g:2320:1: ( rule__HashKeyValue__ValueAlternatives_4_0 )
            {
             before(grammarAccess.getHashKeyValueAccess().getValueAlternatives_4_0()); 
            // InternalRails.g:2321:1: ( rule__HashKeyValue__ValueAlternatives_4_0 )
            // InternalRails.g:2321:2: rule__HashKeyValue__ValueAlternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__HashKeyValue__ValueAlternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getHashKeyValueAccess().getValueAlternatives_4_0()); 

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


    // $ANTLR start "rule__Method__NameAssignment_1"
    // InternalRails.g:2330:1: rule__Method__NameAssignment_1 : ( ruleMethodName ) ;
    public final void rule__Method__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRails.g:2334:1: ( ( ruleMethodName ) )
            // InternalRails.g:2335:1: ( ruleMethodName )
            {
            // InternalRails.g:2335:1: ( ruleMethodName )
            // InternalRails.g:2336:1: ruleMethodName
            {
             before(grammarAccess.getMethodAccess().getNameMethodNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMethodName();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getNameMethodNameParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Method__NameAssignment_1"

    // Delegated rules


    protected DFA11 dfa11 = new DFA11(this);
    static final String dfa_1s = "\4\uffff";
    static final String dfa_2s = "\2\11\2\uffff";
    static final String dfa_3s = "\2\30\2\uffff";
    static final String dfa_4s = "\2\uffff\1\1\1\2";
    static final String dfa_5s = "\4\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\3\1\uffff\1\3\1\uffff\3\3\7\uffff\1\2",
            "\1\1\1\3\1\uffff\1\3\1\uffff\3\3\7\uffff\1\2",
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
            return "702:1: ( rule__Class__Group_3__0 )?";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000A00L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000101D600L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000001D002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001000200L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000230L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008002200L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000200L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000A30L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000AF0L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000200L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000C00000L});

}