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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SYMBOL", "RULE_STRING", "RULE_BRACKET_BLOCK", "RULE_ARRAY_BLOCK", "RULE_CLASS_WORD", "RULE_END_WORD", "RULE_ID", "RULE_HAS_MANY_WORD", "RULE_SL_COMMENT", "RULE_HAS_AND_BELONGS_TO_MANY_WORD", "RULE_BELONGS_TO_WORD", "RULE_DEF_WORD", "RULE_MODULE_WORD", "RULE_ML_COMMENT", "RULE_WS", "RULE_INT", "RULE_ANY_OTHER", "'?'", "'='", "' '", "'<'", "'::'", "'.'", "','", "':'", "'=>'"
    };
    public static final int RULE_HAS_MANY_WORD=11;
    public static final int RULE_CLASS_WORD=8;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=12;
    public static final int RULE_HAS_AND_BELONGS_TO_MANY_WORD=13;
    public static final int EOF=-1;
    public static final int RULE_ARRAY_BLOCK=7;
    public static final int RULE_ID=10;
    public static final int RULE_WS=18;
    public static final int RULE_ANY_OTHER=20;
    public static final int RULE_MODULE_WORD=16;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=19;
    public static final int T__29=29;
    public static final int RULE_BRACKET_BLOCK=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=17;
    public static final int T__23=23;
    public static final int RULE_SYMBOL=4;
    public static final int RULE_DEF_WORD=15;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_END_WORD=9;
    public static final int RULE_BELONGS_TO_WORD=14;
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
    public String getGrammarFileName() { return "../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g"; }


     
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:60:1: entryRuleClass : ruleClass EOF ;
    public final void entryRuleClass() throws RecognitionException {
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:61:1: ( ruleClass EOF )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:62:1: ruleClass EOF
            {
             before(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_ruleClass_in_entryRuleClass61);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getClassRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClass68); 

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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:69:1: ruleClass : ( ( rule__Class__Group__0 ) ) ;
    public final void ruleClass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:73:2: ( ( ( rule__Class__Group__0 ) ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:74:1: ( ( rule__Class__Group__0 ) )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:74:1: ( ( rule__Class__Group__0 ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:75:1: ( rule__Class__Group__0 )
            {
             before(grammarAccess.getClassAccess().getGroup()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:76:1: ( rule__Class__Group__0 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:76:2: rule__Class__Group__0
            {
            pushFollow(FOLLOW_rule__Class__Group__0_in_ruleClass94);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:88:1: entryRuleNamespacedModuleName : ruleNamespacedModuleName EOF ;
    public final void entryRuleNamespacedModuleName() throws RecognitionException {
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:89:1: ( ruleNamespacedModuleName EOF )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:90:1: ruleNamespacedModuleName EOF
            {
             before(grammarAccess.getNamespacedModuleNameRule()); 
            pushFollow(FOLLOW_ruleNamespacedModuleName_in_entryRuleNamespacedModuleName121);
            ruleNamespacedModuleName();

            state._fsp--;

             after(grammarAccess.getNamespacedModuleNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamespacedModuleName128); 

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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:97:1: ruleNamespacedModuleName : ( ( rule__NamespacedModuleName__Group__0 ) ) ;
    public final void ruleNamespacedModuleName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:101:2: ( ( ( rule__NamespacedModuleName__Group__0 ) ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:102:1: ( ( rule__NamespacedModuleName__Group__0 ) )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:102:1: ( ( rule__NamespacedModuleName__Group__0 ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:103:1: ( rule__NamespacedModuleName__Group__0 )
            {
             before(grammarAccess.getNamespacedModuleNameAccess().getGroup()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:104:1: ( rule__NamespacedModuleName__Group__0 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:104:2: rule__NamespacedModuleName__Group__0
            {
            pushFollow(FOLLOW_rule__NamespacedModuleName__Group__0_in_ruleNamespacedModuleName154);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:116:1: entryRuleMethodChainCall : ruleMethodChainCall EOF ;
    public final void entryRuleMethodChainCall() throws RecognitionException {
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:117:1: ( ruleMethodChainCall EOF )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:118:1: ruleMethodChainCall EOF
            {
             before(grammarAccess.getMethodChainCallRule()); 
            pushFollow(FOLLOW_ruleMethodChainCall_in_entryRuleMethodChainCall181);
            ruleMethodChainCall();

            state._fsp--;

             after(grammarAccess.getMethodChainCallRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodChainCall188); 

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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:125:1: ruleMethodChainCall : ( ( rule__MethodChainCall__Group__0 ) ) ;
    public final void ruleMethodChainCall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:129:2: ( ( ( rule__MethodChainCall__Group__0 ) ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:130:1: ( ( rule__MethodChainCall__Group__0 ) )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:130:1: ( ( rule__MethodChainCall__Group__0 ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:131:1: ( rule__MethodChainCall__Group__0 )
            {
             before(grammarAccess.getMethodChainCallAccess().getGroup()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:132:1: ( rule__MethodChainCall__Group__0 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:132:2: rule__MethodChainCall__Group__0
            {
            pushFollow(FOLLOW_rule__MethodChainCall__Group__0_in_ruleMethodChainCall214);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:144:1: entryRuleClassElement : ruleClassElement EOF ;
    public final void entryRuleClassElement() throws RecognitionException {
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:145:1: ( ruleClassElement EOF )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:146:1: ruleClassElement EOF
            {
             before(grammarAccess.getClassElementRule()); 
            pushFollow(FOLLOW_ruleClassElement_in_entryRuleClassElement241);
            ruleClassElement();

            state._fsp--;

             after(grammarAccess.getClassElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassElement248); 

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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:153:1: ruleClassElement : ( ( rule__ClassElement__Alternatives ) ) ;
    public final void ruleClassElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:157:2: ( ( ( rule__ClassElement__Alternatives ) ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:158:1: ( ( rule__ClassElement__Alternatives ) )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:158:1: ( ( rule__ClassElement__Alternatives ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:159:1: ( rule__ClassElement__Alternatives )
            {
             before(grammarAccess.getClassElementAccess().getAlternatives()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:160:1: ( rule__ClassElement__Alternatives )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:160:2: rule__ClassElement__Alternatives
            {
            pushFollow(FOLLOW_rule__ClassElement__Alternatives_in_ruleClassElement274);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:172:1: entryRuleRelationship : ruleRelationship EOF ;
    public final void entryRuleRelationship() throws RecognitionException {
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:173:1: ( ruleRelationship EOF )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:174:1: ruleRelationship EOF
            {
             before(grammarAccess.getRelationshipRule()); 
            pushFollow(FOLLOW_ruleRelationship_in_entryRuleRelationship301);
            ruleRelationship();

            state._fsp--;

             after(grammarAccess.getRelationshipRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationship308); 

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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:181:1: ruleRelationship : ( ( rule__Relationship__Alternatives ) ) ;
    public final void ruleRelationship() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:185:2: ( ( ( rule__Relationship__Alternatives ) ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:186:1: ( ( rule__Relationship__Alternatives ) )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:186:1: ( ( rule__Relationship__Alternatives ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:187:1: ( rule__Relationship__Alternatives )
            {
             before(grammarAccess.getRelationshipAccess().getAlternatives()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:188:1: ( rule__Relationship__Alternatives )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:188:2: rule__Relationship__Alternatives
            {
            pushFollow(FOLLOW_rule__Relationship__Alternatives_in_ruleRelationship334);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:200:1: entryRuleHasMany : ruleHasMany EOF ;
    public final void entryRuleHasMany() throws RecognitionException {
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:201:1: ( ruleHasMany EOF )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:202:1: ruleHasMany EOF
            {
             before(grammarAccess.getHasManyRule()); 
            pushFollow(FOLLOW_ruleHasMany_in_entryRuleHasMany361);
            ruleHasMany();

            state._fsp--;

             after(grammarAccess.getHasManyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHasMany368); 

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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:209:1: ruleHasMany : ( ( rule__HasMany__Group__0 ) ) ;
    public final void ruleHasMany() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:213:2: ( ( ( rule__HasMany__Group__0 ) ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:214:1: ( ( rule__HasMany__Group__0 ) )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:214:1: ( ( rule__HasMany__Group__0 ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:215:1: ( rule__HasMany__Group__0 )
            {
             before(grammarAccess.getHasManyAccess().getGroup()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:216:1: ( rule__HasMany__Group__0 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:216:2: rule__HasMany__Group__0
            {
            pushFollow(FOLLOW_rule__HasMany__Group__0_in_ruleHasMany394);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:228:1: entryRuleHasAndBelongsToMany : ruleHasAndBelongsToMany EOF ;
    public final void entryRuleHasAndBelongsToMany() throws RecognitionException {
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:229:1: ( ruleHasAndBelongsToMany EOF )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:230:1: ruleHasAndBelongsToMany EOF
            {
             before(grammarAccess.getHasAndBelongsToManyRule()); 
            pushFollow(FOLLOW_ruleHasAndBelongsToMany_in_entryRuleHasAndBelongsToMany421);
            ruleHasAndBelongsToMany();

            state._fsp--;

             after(grammarAccess.getHasAndBelongsToManyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHasAndBelongsToMany428); 

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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:237:1: ruleHasAndBelongsToMany : ( ( rule__HasAndBelongsToMany__Group__0 ) ) ;
    public final void ruleHasAndBelongsToMany() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:241:2: ( ( ( rule__HasAndBelongsToMany__Group__0 ) ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:242:1: ( ( rule__HasAndBelongsToMany__Group__0 ) )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:242:1: ( ( rule__HasAndBelongsToMany__Group__0 ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:243:1: ( rule__HasAndBelongsToMany__Group__0 )
            {
             before(grammarAccess.getHasAndBelongsToManyAccess().getGroup()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:244:1: ( rule__HasAndBelongsToMany__Group__0 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:244:2: rule__HasAndBelongsToMany__Group__0
            {
            pushFollow(FOLLOW_rule__HasAndBelongsToMany__Group__0_in_ruleHasAndBelongsToMany454);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:256:1: entryRuleBelongsTo : ruleBelongsTo EOF ;
    public final void entryRuleBelongsTo() throws RecognitionException {
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:257:1: ( ruleBelongsTo EOF )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:258:1: ruleBelongsTo EOF
            {
             before(grammarAccess.getBelongsToRule()); 
            pushFollow(FOLLOW_ruleBelongsTo_in_entryRuleBelongsTo481);
            ruleBelongsTo();

            state._fsp--;

             after(grammarAccess.getBelongsToRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBelongsTo488); 

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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:265:1: ruleBelongsTo : ( ( rule__BelongsTo__Group__0 ) ) ;
    public final void ruleBelongsTo() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:269:2: ( ( ( rule__BelongsTo__Group__0 ) ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:270:1: ( ( rule__BelongsTo__Group__0 ) )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:270:1: ( ( rule__BelongsTo__Group__0 ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:271:1: ( rule__BelongsTo__Group__0 )
            {
             before(grammarAccess.getBelongsToAccess().getGroup()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:272:1: ( rule__BelongsTo__Group__0 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:272:2: rule__BelongsTo__Group__0
            {
            pushFollow(FOLLOW_rule__BelongsTo__Group__0_in_ruleBelongsTo514);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:284:1: entryRuleHashKeyValue : ruleHashKeyValue EOF ;
    public final void entryRuleHashKeyValue() throws RecognitionException {
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:285:1: ( ruleHashKeyValue EOF )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:286:1: ruleHashKeyValue EOF
            {
             before(grammarAccess.getHashKeyValueRule()); 
            pushFollow(FOLLOW_ruleHashKeyValue_in_entryRuleHashKeyValue541);
            ruleHashKeyValue();

            state._fsp--;

             after(grammarAccess.getHashKeyValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHashKeyValue548); 

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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:293:1: ruleHashKeyValue : ( ( rule__HashKeyValue__Group__0 ) ) ;
    public final void ruleHashKeyValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:297:2: ( ( ( rule__HashKeyValue__Group__0 ) ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:298:1: ( ( rule__HashKeyValue__Group__0 ) )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:298:1: ( ( rule__HashKeyValue__Group__0 ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:299:1: ( rule__HashKeyValue__Group__0 )
            {
             before(grammarAccess.getHashKeyValueAccess().getGroup()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:300:1: ( rule__HashKeyValue__Group__0 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:300:2: rule__HashKeyValue__Group__0
            {
            pushFollow(FOLLOW_rule__HashKeyValue__Group__0_in_ruleHashKeyValue574);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:312:1: entryRuleMethod : ruleMethod EOF ;
    public final void entryRuleMethod() throws RecognitionException {
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:313:1: ( ruleMethod EOF )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:314:1: ruleMethod EOF
            {
             before(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_ruleMethod_in_entryRuleMethod601);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getMethodRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethod608); 

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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:321:1: ruleMethod : ( ( rule__Method__Group__0 ) ) ;
    public final void ruleMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:325:2: ( ( ( rule__Method__Group__0 ) ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:326:1: ( ( rule__Method__Group__0 ) )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:326:1: ( ( rule__Method__Group__0 ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:327:1: ( rule__Method__Group__0 )
            {
             before(grammarAccess.getMethodAccess().getGroup()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:328:1: ( rule__Method__Group__0 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:328:2: rule__Method__Group__0
            {
            pushFollow(FOLLOW_rule__Method__Group__0_in_ruleMethod634);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:340:1: entryRuleMethodName : ruleMethodName EOF ;
    public final void entryRuleMethodName() throws RecognitionException {
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:341:1: ( ruleMethodName EOF )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:342:1: ruleMethodName EOF
            {
             before(grammarAccess.getMethodNameRule()); 
            pushFollow(FOLLOW_ruleMethodName_in_entryRuleMethodName661);
            ruleMethodName();

            state._fsp--;

             after(grammarAccess.getMethodNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodName668); 

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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:349:1: ruleMethodName : ( ( rule__MethodName__Group__0 ) ) ;
    public final void ruleMethodName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:353:2: ( ( ( rule__MethodName__Group__0 ) ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:354:1: ( ( rule__MethodName__Group__0 ) )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:354:1: ( ( rule__MethodName__Group__0 ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:355:1: ( rule__MethodName__Group__0 )
            {
             before(grammarAccess.getMethodNameAccess().getGroup()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:356:1: ( rule__MethodName__Group__0 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:356:2: rule__MethodName__Group__0
            {
            pushFollow(FOLLOW_rule__MethodName__Group__0_in_ruleMethodName694);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:368:1: rule__ClassElement__Alternatives : ( ( ruleMethod ) | ( ruleRelationship ) );
    public final void rule__ClassElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:372:1: ( ( ruleMethod ) | ( ruleRelationship ) )
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
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:373:1: ( ruleMethod )
                    {
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:373:1: ( ruleMethod )
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:374:1: ruleMethod
                    {
                     before(grammarAccess.getClassElementAccess().getMethodParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleMethod_in_rule__ClassElement__Alternatives730);
                    ruleMethod();

                    state._fsp--;

                     after(grammarAccess.getClassElementAccess().getMethodParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:379:6: ( ruleRelationship )
                    {
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:379:6: ( ruleRelationship )
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:380:1: ruleRelationship
                    {
                     before(grammarAccess.getClassElementAccess().getRelationshipParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleRelationship_in_rule__ClassElement__Alternatives747);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:390:1: rule__Relationship__Alternatives : ( ( ruleHasMany ) | ( ruleHasAndBelongsToMany ) | ( ruleBelongsTo ) );
    public final void rule__Relationship__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:394:1: ( ( ruleHasMany ) | ( ruleHasAndBelongsToMany ) | ( ruleBelongsTo ) )
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
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:395:1: ( ruleHasMany )
                    {
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:395:1: ( ruleHasMany )
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:396:1: ruleHasMany
                    {
                     before(grammarAccess.getRelationshipAccess().getHasManyParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleHasMany_in_rule__Relationship__Alternatives779);
                    ruleHasMany();

                    state._fsp--;

                     after(grammarAccess.getRelationshipAccess().getHasManyParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:401:6: ( ruleHasAndBelongsToMany )
                    {
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:401:6: ( ruleHasAndBelongsToMany )
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:402:1: ruleHasAndBelongsToMany
                    {
                     before(grammarAccess.getRelationshipAccess().getHasAndBelongsToManyParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleHasAndBelongsToMany_in_rule__Relationship__Alternatives796);
                    ruleHasAndBelongsToMany();

                    state._fsp--;

                     after(grammarAccess.getRelationshipAccess().getHasAndBelongsToManyParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:407:6: ( ruleBelongsTo )
                    {
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:407:6: ( ruleBelongsTo )
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:408:1: ruleBelongsTo
                    {
                     before(grammarAccess.getRelationshipAccess().getBelongsToParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleBelongsTo_in_rule__Relationship__Alternatives813);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:418:1: rule__HasMany__NameAlternatives_2_0 : ( ( RULE_SYMBOL ) | ( RULE_STRING ) );
    public final void rule__HasMany__NameAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:422:1: ( ( RULE_SYMBOL ) | ( RULE_STRING ) )
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
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:423:1: ( RULE_SYMBOL )
                    {
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:423:1: ( RULE_SYMBOL )
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:424:1: RULE_SYMBOL
                    {
                     before(grammarAccess.getHasManyAccess().getNameSYMBOLTerminalRuleCall_2_0_0()); 
                    match(input,RULE_SYMBOL,FOLLOW_RULE_SYMBOL_in_rule__HasMany__NameAlternatives_2_0845); 
                     after(grammarAccess.getHasManyAccess().getNameSYMBOLTerminalRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:429:6: ( RULE_STRING )
                    {
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:429:6: ( RULE_STRING )
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:430:1: RULE_STRING
                    {
                     before(grammarAccess.getHasManyAccess().getNameSTRINGTerminalRuleCall_2_0_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__HasMany__NameAlternatives_2_0862); 
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:440:1: rule__HasAndBelongsToMany__NameAlternatives_2_0 : ( ( RULE_SYMBOL ) | ( RULE_STRING ) );
    public final void rule__HasAndBelongsToMany__NameAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:444:1: ( ( RULE_SYMBOL ) | ( RULE_STRING ) )
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
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:445:1: ( RULE_SYMBOL )
                    {
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:445:1: ( RULE_SYMBOL )
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:446:1: RULE_SYMBOL
                    {
                     before(grammarAccess.getHasAndBelongsToManyAccess().getNameSYMBOLTerminalRuleCall_2_0_0()); 
                    match(input,RULE_SYMBOL,FOLLOW_RULE_SYMBOL_in_rule__HasAndBelongsToMany__NameAlternatives_2_0894); 
                     after(grammarAccess.getHasAndBelongsToManyAccess().getNameSYMBOLTerminalRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:451:6: ( RULE_STRING )
                    {
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:451:6: ( RULE_STRING )
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:452:1: RULE_STRING
                    {
                     before(grammarAccess.getHasAndBelongsToManyAccess().getNameSTRINGTerminalRuleCall_2_0_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__HasAndBelongsToMany__NameAlternatives_2_0911); 
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:462:1: rule__BelongsTo__NameAlternatives_2_0 : ( ( RULE_SYMBOL ) | ( RULE_STRING ) );
    public final void rule__BelongsTo__NameAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:466:1: ( ( RULE_SYMBOL ) | ( RULE_STRING ) )
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
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:467:1: ( RULE_SYMBOL )
                    {
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:467:1: ( RULE_SYMBOL )
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:468:1: RULE_SYMBOL
                    {
                     before(grammarAccess.getBelongsToAccess().getNameSYMBOLTerminalRuleCall_2_0_0()); 
                    match(input,RULE_SYMBOL,FOLLOW_RULE_SYMBOL_in_rule__BelongsTo__NameAlternatives_2_0943); 
                     after(grammarAccess.getBelongsToAccess().getNameSYMBOLTerminalRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:473:6: ( RULE_STRING )
                    {
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:473:6: ( RULE_STRING )
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:474:1: RULE_STRING
                    {
                     before(grammarAccess.getBelongsToAccess().getNameSTRINGTerminalRuleCall_2_0_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__BelongsTo__NameAlternatives_2_0960); 
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:484:1: rule__HashKeyValue__Alternatives_2 : ( ( ( rule__HashKeyValue__Group_2_0__0 ) ) | ( ( rule__HashKeyValue__Group_2_1__0 ) ) );
    public final void rule__HashKeyValue__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:488:1: ( ( ( rule__HashKeyValue__Group_2_0__0 ) ) | ( ( rule__HashKeyValue__Group_2_1__0 ) ) )
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
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:489:1: ( ( rule__HashKeyValue__Group_2_0__0 ) )
                    {
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:489:1: ( ( rule__HashKeyValue__Group_2_0__0 ) )
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:490:1: ( rule__HashKeyValue__Group_2_0__0 )
                    {
                     before(grammarAccess.getHashKeyValueAccess().getGroup_2_0()); 
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:491:1: ( rule__HashKeyValue__Group_2_0__0 )
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:491:2: rule__HashKeyValue__Group_2_0__0
                    {
                    pushFollow(FOLLOW_rule__HashKeyValue__Group_2_0__0_in_rule__HashKeyValue__Alternatives_2992);
                    rule__HashKeyValue__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getHashKeyValueAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:495:6: ( ( rule__HashKeyValue__Group_2_1__0 ) )
                    {
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:495:6: ( ( rule__HashKeyValue__Group_2_1__0 ) )
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:496:1: ( rule__HashKeyValue__Group_2_1__0 )
                    {
                     before(grammarAccess.getHashKeyValueAccess().getGroup_2_1()); 
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:497:1: ( rule__HashKeyValue__Group_2_1__0 )
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:497:2: rule__HashKeyValue__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__HashKeyValue__Group_2_1__0_in_rule__HashKeyValue__Alternatives_21010);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:506:1: rule__HashKeyValue__KeyAlternatives_2_1_0_0 : ( ( RULE_SYMBOL ) | ( RULE_STRING ) );
    public final void rule__HashKeyValue__KeyAlternatives_2_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:510:1: ( ( RULE_SYMBOL ) | ( RULE_STRING ) )
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
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:511:1: ( RULE_SYMBOL )
                    {
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:511:1: ( RULE_SYMBOL )
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:512:1: RULE_SYMBOL
                    {
                     before(grammarAccess.getHashKeyValueAccess().getKeySYMBOLTerminalRuleCall_2_1_0_0_0()); 
                    match(input,RULE_SYMBOL,FOLLOW_RULE_SYMBOL_in_rule__HashKeyValue__KeyAlternatives_2_1_0_01043); 
                     after(grammarAccess.getHashKeyValueAccess().getKeySYMBOLTerminalRuleCall_2_1_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:517:6: ( RULE_STRING )
                    {
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:517:6: ( RULE_STRING )
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:518:1: RULE_STRING
                    {
                     before(grammarAccess.getHashKeyValueAccess().getKeySTRINGTerminalRuleCall_2_1_0_0_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__HashKeyValue__KeyAlternatives_2_1_0_01060); 
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:528:1: rule__HashKeyValue__ValueAlternatives_4_0 : ( ( RULE_SYMBOL ) | ( RULE_STRING ) | ( RULE_BRACKET_BLOCK ) | ( RULE_ARRAY_BLOCK ) | ( ruleMethodChainCall ) );
    public final void rule__HashKeyValue__ValueAlternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:532:1: ( ( RULE_SYMBOL ) | ( RULE_STRING ) | ( RULE_BRACKET_BLOCK ) | ( RULE_ARRAY_BLOCK ) | ( ruleMethodChainCall ) )
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
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:533:1: ( RULE_SYMBOL )
                    {
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:533:1: ( RULE_SYMBOL )
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:534:1: RULE_SYMBOL
                    {
                     before(grammarAccess.getHashKeyValueAccess().getValueSYMBOLTerminalRuleCall_4_0_0()); 
                    match(input,RULE_SYMBOL,FOLLOW_RULE_SYMBOL_in_rule__HashKeyValue__ValueAlternatives_4_01092); 
                     after(grammarAccess.getHashKeyValueAccess().getValueSYMBOLTerminalRuleCall_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:539:6: ( RULE_STRING )
                    {
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:539:6: ( RULE_STRING )
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:540:1: RULE_STRING
                    {
                     before(grammarAccess.getHashKeyValueAccess().getValueSTRINGTerminalRuleCall_4_0_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__HashKeyValue__ValueAlternatives_4_01109); 
                     after(grammarAccess.getHashKeyValueAccess().getValueSTRINGTerminalRuleCall_4_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:545:6: ( RULE_BRACKET_BLOCK )
                    {
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:545:6: ( RULE_BRACKET_BLOCK )
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:546:1: RULE_BRACKET_BLOCK
                    {
                     before(grammarAccess.getHashKeyValueAccess().getValueBRACKET_BLOCKTerminalRuleCall_4_0_2()); 
                    match(input,RULE_BRACKET_BLOCK,FOLLOW_RULE_BRACKET_BLOCK_in_rule__HashKeyValue__ValueAlternatives_4_01126); 
                     after(grammarAccess.getHashKeyValueAccess().getValueBRACKET_BLOCKTerminalRuleCall_4_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:551:6: ( RULE_ARRAY_BLOCK )
                    {
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:551:6: ( RULE_ARRAY_BLOCK )
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:552:1: RULE_ARRAY_BLOCK
                    {
                     before(grammarAccess.getHashKeyValueAccess().getValueARRAY_BLOCKTerminalRuleCall_4_0_3()); 
                    match(input,RULE_ARRAY_BLOCK,FOLLOW_RULE_ARRAY_BLOCK_in_rule__HashKeyValue__ValueAlternatives_4_01143); 
                     after(grammarAccess.getHashKeyValueAccess().getValueARRAY_BLOCKTerminalRuleCall_4_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:557:6: ( ruleMethodChainCall )
                    {
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:557:6: ( ruleMethodChainCall )
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:558:1: ruleMethodChainCall
                    {
                     before(grammarAccess.getHashKeyValueAccess().getValueMethodChainCallParserRuleCall_4_0_4()); 
                    pushFollow(FOLLOW_ruleMethodChainCall_in_rule__HashKeyValue__ValueAlternatives_4_01160);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:568:1: rule__MethodName__Alternatives_1 : ( ( '?' ) | ( '=' ) );
    public final void rule__MethodName__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:572:1: ( ( '?' ) | ( '=' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            else if ( (LA9_0==22) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:573:1: ( '?' )
                    {
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:573:1: ( '?' )
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:574:1: '?'
                    {
                     before(grammarAccess.getMethodNameAccess().getQuestionMarkKeyword_1_0()); 
                    match(input,21,FOLLOW_21_in_rule__MethodName__Alternatives_11193); 
                     after(grammarAccess.getMethodNameAccess().getQuestionMarkKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:581:6: ( '=' )
                    {
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:581:6: ( '=' )
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:582:1: '='
                    {
                     before(grammarAccess.getMethodNameAccess().getEqualsSignKeyword_1_1()); 
                    match(input,22,FOLLOW_22_in_rule__MethodName__Alternatives_11213); 
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:596:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:600:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:601:2: rule__Class__Group__0__Impl rule__Class__Group__1
            {
            pushFollow(FOLLOW_rule__Class__Group__0__Impl_in_rule__Class__Group__01245);
            rule__Class__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__1_in_rule__Class__Group__01248);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:608:1: rule__Class__Group__0__Impl : ( RULE_CLASS_WORD ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:612:1: ( ( RULE_CLASS_WORD ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:613:1: ( RULE_CLASS_WORD )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:613:1: ( RULE_CLASS_WORD )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:614:1: RULE_CLASS_WORD
            {
             before(grammarAccess.getClassAccess().getCLASS_WORDTerminalRuleCall_0()); 
            match(input,RULE_CLASS_WORD,FOLLOW_RULE_CLASS_WORD_in_rule__Class__Group__0__Impl1275); 
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:625:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:629:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:630:2: rule__Class__Group__1__Impl rule__Class__Group__2
            {
            pushFollow(FOLLOW_rule__Class__Group__1__Impl_in_rule__Class__Group__11304);
            rule__Class__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__2_in_rule__Class__Group__11307);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:637:1: rule__Class__Group__1__Impl : ( ( ' ' )* ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:641:1: ( ( ( ' ' )* ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:642:1: ( ( ' ' )* )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:642:1: ( ( ' ' )* )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:643:1: ( ' ' )*
            {
             before(grammarAccess.getClassAccess().getSpaceKeyword_1()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:644:1: ( ' ' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==23) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:645:2: ' '
            	    {
            	    match(input,23,FOLLOW_23_in_rule__Class__Group__1__Impl1336); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getClassAccess().getSpaceKeyword_1()); 

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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:656:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:660:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:661:2: rule__Class__Group__2__Impl rule__Class__Group__3
            {
            pushFollow(FOLLOW_rule__Class__Group__2__Impl_in_rule__Class__Group__21369);
            rule__Class__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__3_in_rule__Class__Group__21372);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:668:1: rule__Class__Group__2__Impl : ( ( rule__Class__NameAssignment_2 ) ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:672:1: ( ( ( rule__Class__NameAssignment_2 ) ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:673:1: ( ( rule__Class__NameAssignment_2 ) )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:673:1: ( ( rule__Class__NameAssignment_2 ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:674:1: ( rule__Class__NameAssignment_2 )
            {
             before(grammarAccess.getClassAccess().getNameAssignment_2()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:675:1: ( rule__Class__NameAssignment_2 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:675:2: rule__Class__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Class__NameAssignment_2_in_rule__Class__Group__2__Impl1399);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:685:1: rule__Class__Group__3 : rule__Class__Group__3__Impl rule__Class__Group__4 ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:689:1: ( rule__Class__Group__3__Impl rule__Class__Group__4 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:690:2: rule__Class__Group__3__Impl rule__Class__Group__4
            {
            pushFollow(FOLLOW_rule__Class__Group__3__Impl_in_rule__Class__Group__31429);
            rule__Class__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__4_in_rule__Class__Group__31432);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:697:1: rule__Class__Group__3__Impl : ( ( rule__Class__Group_3__0 )? ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:701:1: ( ( ( rule__Class__Group_3__0 )? ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:702:1: ( ( rule__Class__Group_3__0 )? )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:702:1: ( ( rule__Class__Group_3__0 )? )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:703:1: ( rule__Class__Group_3__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_3()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:704:1: ( rule__Class__Group_3__0 )?
            int alt11=2;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:704:2: rule__Class__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Class__Group_3__0_in_rule__Class__Group__3__Impl1459);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:714:1: rule__Class__Group__4 : rule__Class__Group__4__Impl rule__Class__Group__5 ;
    public final void rule__Class__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:718:1: ( rule__Class__Group__4__Impl rule__Class__Group__5 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:719:2: rule__Class__Group__4__Impl rule__Class__Group__5
            {
            pushFollow(FOLLOW_rule__Class__Group__4__Impl_in_rule__Class__Group__41490);
            rule__Class__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__5_in_rule__Class__Group__41493);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:726:1: rule__Class__Group__4__Impl : ( ( ' ' )* ) ;
    public final void rule__Class__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:730:1: ( ( ( ' ' )* ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:731:1: ( ( ' ' )* )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:731:1: ( ( ' ' )* )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:732:1: ( ' ' )*
            {
             before(grammarAccess.getClassAccess().getSpaceKeyword_4()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:733:1: ( ' ' )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==23) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:734:2: ' '
            	    {
            	    match(input,23,FOLLOW_23_in_rule__Class__Group__4__Impl1522); 

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getClassAccess().getSpaceKeyword_4()); 

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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:745:1: rule__Class__Group__5 : rule__Class__Group__5__Impl rule__Class__Group__6 ;
    public final void rule__Class__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:749:1: ( rule__Class__Group__5__Impl rule__Class__Group__6 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:750:2: rule__Class__Group__5__Impl rule__Class__Group__6
            {
            pushFollow(FOLLOW_rule__Class__Group__5__Impl_in_rule__Class__Group__51555);
            rule__Class__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__6_in_rule__Class__Group__51558);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:757:1: rule__Class__Group__5__Impl : ( ( rule__Class__ClassElementsAssignment_5 )* ) ;
    public final void rule__Class__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:761:1: ( ( ( rule__Class__ClassElementsAssignment_5 )* ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:762:1: ( ( rule__Class__ClassElementsAssignment_5 )* )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:762:1: ( ( rule__Class__ClassElementsAssignment_5 )* )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:763:1: ( rule__Class__ClassElementsAssignment_5 )*
            {
             before(grammarAccess.getClassAccess().getClassElementsAssignment_5()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:764:1: ( rule__Class__ClassElementsAssignment_5 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_HAS_MANY_WORD||(LA13_0>=RULE_HAS_AND_BELONGS_TO_MANY_WORD && LA13_0<=RULE_DEF_WORD)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:764:2: rule__Class__ClassElementsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Class__ClassElementsAssignment_5_in_rule__Class__Group__5__Impl1585);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:774:1: rule__Class__Group__6 : rule__Class__Group__6__Impl ;
    public final void rule__Class__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:778:1: ( rule__Class__Group__6__Impl )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:779:2: rule__Class__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Class__Group__6__Impl_in_rule__Class__Group__61616);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:785:1: rule__Class__Group__6__Impl : ( RULE_END_WORD ) ;
    public final void rule__Class__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:789:1: ( ( RULE_END_WORD ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:790:1: ( RULE_END_WORD )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:790:1: ( RULE_END_WORD )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:791:1: RULE_END_WORD
            {
             before(grammarAccess.getClassAccess().getEND_WORDTerminalRuleCall_6()); 
            match(input,RULE_END_WORD,FOLLOW_RULE_END_WORD_in_rule__Class__Group__6__Impl1643); 
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:816:1: rule__Class__Group_3__0 : rule__Class__Group_3__0__Impl rule__Class__Group_3__1 ;
    public final void rule__Class__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:820:1: ( rule__Class__Group_3__0__Impl rule__Class__Group_3__1 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:821:2: rule__Class__Group_3__0__Impl rule__Class__Group_3__1
            {
            pushFollow(FOLLOW_rule__Class__Group_3__0__Impl_in_rule__Class__Group_3__01686);
            rule__Class__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group_3__1_in_rule__Class__Group_3__01689);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:828:1: rule__Class__Group_3__0__Impl : ( ( ' ' )* ) ;
    public final void rule__Class__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:832:1: ( ( ( ' ' )* ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:833:1: ( ( ' ' )* )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:833:1: ( ( ' ' )* )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:834:1: ( ' ' )*
            {
             before(grammarAccess.getClassAccess().getSpaceKeyword_3_0()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:835:1: ( ' ' )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==23) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:836:2: ' '
            	    {
            	    match(input,23,FOLLOW_23_in_rule__Class__Group_3__0__Impl1718); 

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getClassAccess().getSpaceKeyword_3_0()); 

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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:847:1: rule__Class__Group_3__1 : rule__Class__Group_3__1__Impl rule__Class__Group_3__2 ;
    public final void rule__Class__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:851:1: ( rule__Class__Group_3__1__Impl rule__Class__Group_3__2 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:852:2: rule__Class__Group_3__1__Impl rule__Class__Group_3__2
            {
            pushFollow(FOLLOW_rule__Class__Group_3__1__Impl_in_rule__Class__Group_3__11751);
            rule__Class__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group_3__2_in_rule__Class__Group_3__11754);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:859:1: rule__Class__Group_3__1__Impl : ( '<' ) ;
    public final void rule__Class__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:863:1: ( ( '<' ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:864:1: ( '<' )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:864:1: ( '<' )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:865:1: '<'
            {
             before(grammarAccess.getClassAccess().getLessThanSignKeyword_3_1()); 
            match(input,24,FOLLOW_24_in_rule__Class__Group_3__1__Impl1782); 
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:878:1: rule__Class__Group_3__2 : rule__Class__Group_3__2__Impl rule__Class__Group_3__3 ;
    public final void rule__Class__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:882:1: ( rule__Class__Group_3__2__Impl rule__Class__Group_3__3 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:883:2: rule__Class__Group_3__2__Impl rule__Class__Group_3__3
            {
            pushFollow(FOLLOW_rule__Class__Group_3__2__Impl_in_rule__Class__Group_3__21813);
            rule__Class__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group_3__3_in_rule__Class__Group_3__21816);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:890:1: rule__Class__Group_3__2__Impl : ( ( ' ' )* ) ;
    public final void rule__Class__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:894:1: ( ( ( ' ' )* ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:895:1: ( ( ' ' )* )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:895:1: ( ( ' ' )* )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:896:1: ( ' ' )*
            {
             before(grammarAccess.getClassAccess().getSpaceKeyword_3_2()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:897:1: ( ' ' )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==23) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:898:2: ' '
            	    {
            	    match(input,23,FOLLOW_23_in_rule__Class__Group_3__2__Impl1845); 

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getClassAccess().getSpaceKeyword_3_2()); 

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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:909:1: rule__Class__Group_3__3 : rule__Class__Group_3__3__Impl ;
    public final void rule__Class__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:913:1: ( rule__Class__Group_3__3__Impl )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:914:2: rule__Class__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__Class__Group_3__3__Impl_in_rule__Class__Group_3__31878);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:920:1: rule__Class__Group_3__3__Impl : ( ( rule__Class__SuperTypeAssignment_3_3 ) ) ;
    public final void rule__Class__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:924:1: ( ( ( rule__Class__SuperTypeAssignment_3_3 ) ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:925:1: ( ( rule__Class__SuperTypeAssignment_3_3 ) )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:925:1: ( ( rule__Class__SuperTypeAssignment_3_3 ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:926:1: ( rule__Class__SuperTypeAssignment_3_3 )
            {
             before(grammarAccess.getClassAccess().getSuperTypeAssignment_3_3()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:927:1: ( rule__Class__SuperTypeAssignment_3_3 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:927:2: rule__Class__SuperTypeAssignment_3_3
            {
            pushFollow(FOLLOW_rule__Class__SuperTypeAssignment_3_3_in_rule__Class__Group_3__3__Impl1905);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:945:1: rule__NamespacedModuleName__Group__0 : rule__NamespacedModuleName__Group__0__Impl rule__NamespacedModuleName__Group__1 ;
    public final void rule__NamespacedModuleName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:949:1: ( rule__NamespacedModuleName__Group__0__Impl rule__NamespacedModuleName__Group__1 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:950:2: rule__NamespacedModuleName__Group__0__Impl rule__NamespacedModuleName__Group__1
            {
            pushFollow(FOLLOW_rule__NamespacedModuleName__Group__0__Impl_in_rule__NamespacedModuleName__Group__01943);
            rule__NamespacedModuleName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamespacedModuleName__Group__1_in_rule__NamespacedModuleName__Group__01946);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:957:1: rule__NamespacedModuleName__Group__0__Impl : ( ( rule__NamespacedModuleName__Group_0__0 )* ) ;
    public final void rule__NamespacedModuleName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:961:1: ( ( ( rule__NamespacedModuleName__Group_0__0 )* ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:962:1: ( ( rule__NamespacedModuleName__Group_0__0 )* )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:962:1: ( ( rule__NamespacedModuleName__Group_0__0 )* )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:963:1: ( rule__NamespacedModuleName__Group_0__0 )*
            {
             before(grammarAccess.getNamespacedModuleNameAccess().getGroup_0()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:964:1: ( rule__NamespacedModuleName__Group_0__0 )*
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
            	    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:964:2: rule__NamespacedModuleName__Group_0__0
            	    {
            	    pushFollow(FOLLOW_rule__NamespacedModuleName__Group_0__0_in_rule__NamespacedModuleName__Group__0__Impl1973);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:974:1: rule__NamespacedModuleName__Group__1 : rule__NamespacedModuleName__Group__1__Impl ;
    public final void rule__NamespacedModuleName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:978:1: ( rule__NamespacedModuleName__Group__1__Impl )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:979:2: rule__NamespacedModuleName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NamespacedModuleName__Group__1__Impl_in_rule__NamespacedModuleName__Group__12004);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:985:1: rule__NamespacedModuleName__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__NamespacedModuleName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:989:1: ( ( RULE_ID ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:990:1: ( RULE_ID )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:990:1: ( RULE_ID )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:991:1: RULE_ID
            {
             before(grammarAccess.getNamespacedModuleNameAccess().getIDTerminalRuleCall_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NamespacedModuleName__Group__1__Impl2031); 
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1006:1: rule__NamespacedModuleName__Group_0__0 : rule__NamespacedModuleName__Group_0__0__Impl rule__NamespacedModuleName__Group_0__1 ;
    public final void rule__NamespacedModuleName__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1010:1: ( rule__NamespacedModuleName__Group_0__0__Impl rule__NamespacedModuleName__Group_0__1 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1011:2: rule__NamespacedModuleName__Group_0__0__Impl rule__NamespacedModuleName__Group_0__1
            {
            pushFollow(FOLLOW_rule__NamespacedModuleName__Group_0__0__Impl_in_rule__NamespacedModuleName__Group_0__02064);
            rule__NamespacedModuleName__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamespacedModuleName__Group_0__1_in_rule__NamespacedModuleName__Group_0__02067);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1018:1: rule__NamespacedModuleName__Group_0__0__Impl : ( RULE_ID ) ;
    public final void rule__NamespacedModuleName__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1022:1: ( ( RULE_ID ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1023:1: ( RULE_ID )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1023:1: ( RULE_ID )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1024:1: RULE_ID
            {
             before(grammarAccess.getNamespacedModuleNameAccess().getIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NamespacedModuleName__Group_0__0__Impl2094); 
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1035:1: rule__NamespacedModuleName__Group_0__1 : rule__NamespacedModuleName__Group_0__1__Impl ;
    public final void rule__NamespacedModuleName__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1039:1: ( rule__NamespacedModuleName__Group_0__1__Impl )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1040:2: rule__NamespacedModuleName__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__NamespacedModuleName__Group_0__1__Impl_in_rule__NamespacedModuleName__Group_0__12123);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1046:1: rule__NamespacedModuleName__Group_0__1__Impl : ( '::' ) ;
    public final void rule__NamespacedModuleName__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1050:1: ( ( '::' ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1051:1: ( '::' )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1051:1: ( '::' )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1052:1: '::'
            {
             before(grammarAccess.getNamespacedModuleNameAccess().getColonColonKeyword_0_1()); 
            match(input,25,FOLLOW_25_in_rule__NamespacedModuleName__Group_0__1__Impl2151); 
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1069:1: rule__MethodChainCall__Group__0 : rule__MethodChainCall__Group__0__Impl rule__MethodChainCall__Group__1 ;
    public final void rule__MethodChainCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1073:1: ( rule__MethodChainCall__Group__0__Impl rule__MethodChainCall__Group__1 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1074:2: rule__MethodChainCall__Group__0__Impl rule__MethodChainCall__Group__1
            {
            pushFollow(FOLLOW_rule__MethodChainCall__Group__0__Impl_in_rule__MethodChainCall__Group__02186);
            rule__MethodChainCall__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MethodChainCall__Group__1_in_rule__MethodChainCall__Group__02189);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1081:1: rule__MethodChainCall__Group__0__Impl : ( ruleNamespacedModuleName ) ;
    public final void rule__MethodChainCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1085:1: ( ( ruleNamespacedModuleName ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1086:1: ( ruleNamespacedModuleName )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1086:1: ( ruleNamespacedModuleName )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1087:1: ruleNamespacedModuleName
            {
             before(grammarAccess.getMethodChainCallAccess().getNamespacedModuleNameParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleNamespacedModuleName_in_rule__MethodChainCall__Group__0__Impl2216);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1098:1: rule__MethodChainCall__Group__1 : rule__MethodChainCall__Group__1__Impl ;
    public final void rule__MethodChainCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1102:1: ( rule__MethodChainCall__Group__1__Impl )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1103:2: rule__MethodChainCall__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MethodChainCall__Group__1__Impl_in_rule__MethodChainCall__Group__12245);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1109:1: rule__MethodChainCall__Group__1__Impl : ( ( rule__MethodChainCall__Group_1__0 )* ) ;
    public final void rule__MethodChainCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1113:1: ( ( ( rule__MethodChainCall__Group_1__0 )* ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1114:1: ( ( rule__MethodChainCall__Group_1__0 )* )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1114:1: ( ( rule__MethodChainCall__Group_1__0 )* )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1115:1: ( rule__MethodChainCall__Group_1__0 )*
            {
             before(grammarAccess.getMethodChainCallAccess().getGroup_1()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1116:1: ( rule__MethodChainCall__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==26) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1116:2: rule__MethodChainCall__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__MethodChainCall__Group_1__0_in_rule__MethodChainCall__Group__1__Impl2272);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1130:1: rule__MethodChainCall__Group_1__0 : rule__MethodChainCall__Group_1__0__Impl rule__MethodChainCall__Group_1__1 ;
    public final void rule__MethodChainCall__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1134:1: ( rule__MethodChainCall__Group_1__0__Impl rule__MethodChainCall__Group_1__1 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1135:2: rule__MethodChainCall__Group_1__0__Impl rule__MethodChainCall__Group_1__1
            {
            pushFollow(FOLLOW_rule__MethodChainCall__Group_1__0__Impl_in_rule__MethodChainCall__Group_1__02307);
            rule__MethodChainCall__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MethodChainCall__Group_1__1_in_rule__MethodChainCall__Group_1__02310);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1142:1: rule__MethodChainCall__Group_1__0__Impl : ( '.' ) ;
    public final void rule__MethodChainCall__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1146:1: ( ( '.' ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1147:1: ( '.' )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1147:1: ( '.' )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1148:1: '.'
            {
             before(grammarAccess.getMethodChainCallAccess().getFullStopKeyword_1_0()); 
            match(input,26,FOLLOW_26_in_rule__MethodChainCall__Group_1__0__Impl2338); 
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1161:1: rule__MethodChainCall__Group_1__1 : rule__MethodChainCall__Group_1__1__Impl ;
    public final void rule__MethodChainCall__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1165:1: ( rule__MethodChainCall__Group_1__1__Impl )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1166:2: rule__MethodChainCall__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__MethodChainCall__Group_1__1__Impl_in_rule__MethodChainCall__Group_1__12369);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1172:1: rule__MethodChainCall__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__MethodChainCall__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1176:1: ( ( RULE_ID ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1177:1: ( RULE_ID )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1177:1: ( RULE_ID )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1178:1: RULE_ID
            {
             before(grammarAccess.getMethodChainCallAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MethodChainCall__Group_1__1__Impl2396); 
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1193:1: rule__HasMany__Group__0 : rule__HasMany__Group__0__Impl rule__HasMany__Group__1 ;
    public final void rule__HasMany__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1197:1: ( rule__HasMany__Group__0__Impl rule__HasMany__Group__1 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1198:2: rule__HasMany__Group__0__Impl rule__HasMany__Group__1
            {
            pushFollow(FOLLOW_rule__HasMany__Group__0__Impl_in_rule__HasMany__Group__02429);
            rule__HasMany__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HasMany__Group__1_in_rule__HasMany__Group__02432);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1205:1: rule__HasMany__Group__0__Impl : ( RULE_HAS_MANY_WORD ) ;
    public final void rule__HasMany__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1209:1: ( ( RULE_HAS_MANY_WORD ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1210:1: ( RULE_HAS_MANY_WORD )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1210:1: ( RULE_HAS_MANY_WORD )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1211:1: RULE_HAS_MANY_WORD
            {
             before(grammarAccess.getHasManyAccess().getHAS_MANY_WORDTerminalRuleCall_0()); 
            match(input,RULE_HAS_MANY_WORD,FOLLOW_RULE_HAS_MANY_WORD_in_rule__HasMany__Group__0__Impl2459); 
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1222:1: rule__HasMany__Group__1 : rule__HasMany__Group__1__Impl rule__HasMany__Group__2 ;
    public final void rule__HasMany__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1226:1: ( rule__HasMany__Group__1__Impl rule__HasMany__Group__2 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1227:2: rule__HasMany__Group__1__Impl rule__HasMany__Group__2
            {
            pushFollow(FOLLOW_rule__HasMany__Group__1__Impl_in_rule__HasMany__Group__12488);
            rule__HasMany__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HasMany__Group__2_in_rule__HasMany__Group__12491);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1234:1: rule__HasMany__Group__1__Impl : ( ( ' ' )* ) ;
    public final void rule__HasMany__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1238:1: ( ( ( ' ' )* ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1239:1: ( ( ' ' )* )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1239:1: ( ( ' ' )* )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1240:1: ( ' ' )*
            {
             before(grammarAccess.getHasManyAccess().getSpaceKeyword_1()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1241:1: ( ' ' )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==23) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1242:2: ' '
            	    {
            	    match(input,23,FOLLOW_23_in_rule__HasMany__Group__1__Impl2520); 

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getHasManyAccess().getSpaceKeyword_1()); 

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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1253:1: rule__HasMany__Group__2 : rule__HasMany__Group__2__Impl rule__HasMany__Group__3 ;
    public final void rule__HasMany__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1257:1: ( rule__HasMany__Group__2__Impl rule__HasMany__Group__3 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1258:2: rule__HasMany__Group__2__Impl rule__HasMany__Group__3
            {
            pushFollow(FOLLOW_rule__HasMany__Group__2__Impl_in_rule__HasMany__Group__22553);
            rule__HasMany__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HasMany__Group__3_in_rule__HasMany__Group__22556);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1265:1: rule__HasMany__Group__2__Impl : ( ( rule__HasMany__NameAssignment_2 ) ) ;
    public final void rule__HasMany__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1269:1: ( ( ( rule__HasMany__NameAssignment_2 ) ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1270:1: ( ( rule__HasMany__NameAssignment_2 ) )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1270:1: ( ( rule__HasMany__NameAssignment_2 ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1271:1: ( rule__HasMany__NameAssignment_2 )
            {
             before(grammarAccess.getHasManyAccess().getNameAssignment_2()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1272:1: ( rule__HasMany__NameAssignment_2 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1272:2: rule__HasMany__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__HasMany__NameAssignment_2_in_rule__HasMany__Group__2__Impl2583);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1282:1: rule__HasMany__Group__3 : rule__HasMany__Group__3__Impl rule__HasMany__Group__4 ;
    public final void rule__HasMany__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1286:1: ( rule__HasMany__Group__3__Impl rule__HasMany__Group__4 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1287:2: rule__HasMany__Group__3__Impl rule__HasMany__Group__4
            {
            pushFollow(FOLLOW_rule__HasMany__Group__3__Impl_in_rule__HasMany__Group__32613);
            rule__HasMany__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HasMany__Group__4_in_rule__HasMany__Group__32616);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1294:1: rule__HasMany__Group__3__Impl : ( ( ' ' )* ) ;
    public final void rule__HasMany__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1298:1: ( ( ( ' ' )* ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1299:1: ( ( ' ' )* )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1299:1: ( ( ' ' )* )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1300:1: ( ' ' )*
            {
             before(grammarAccess.getHasManyAccess().getSpaceKeyword_3()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1301:1: ( ' ' )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==23) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1302:2: ' '
            	    {
            	    match(input,23,FOLLOW_23_in_rule__HasMany__Group__3__Impl2645); 

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getHasManyAccess().getSpaceKeyword_3()); 

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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1313:1: rule__HasMany__Group__4 : rule__HasMany__Group__4__Impl rule__HasMany__Group__5 ;
    public final void rule__HasMany__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1317:1: ( rule__HasMany__Group__4__Impl rule__HasMany__Group__5 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1318:2: rule__HasMany__Group__4__Impl rule__HasMany__Group__5
            {
            pushFollow(FOLLOW_rule__HasMany__Group__4__Impl_in_rule__HasMany__Group__42678);
            rule__HasMany__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HasMany__Group__5_in_rule__HasMany__Group__42681);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1325:1: rule__HasMany__Group__4__Impl : ( ( rule__HasMany__OptionsAssignment_4 )* ) ;
    public final void rule__HasMany__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1329:1: ( ( ( rule__HasMany__OptionsAssignment_4 )* ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1330:1: ( ( rule__HasMany__OptionsAssignment_4 )* )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1330:1: ( ( rule__HasMany__OptionsAssignment_4 )* )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1331:1: ( rule__HasMany__OptionsAssignment_4 )*
            {
             before(grammarAccess.getHasManyAccess().getOptionsAssignment_4()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1332:1: ( rule__HasMany__OptionsAssignment_4 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==27) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1332:2: rule__HasMany__OptionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__HasMany__OptionsAssignment_4_in_rule__HasMany__Group__4__Impl2708);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1342:1: rule__HasMany__Group__5 : rule__HasMany__Group__5__Impl ;
    public final void rule__HasMany__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1346:1: ( rule__HasMany__Group__5__Impl )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1347:2: rule__HasMany__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__HasMany__Group__5__Impl_in_rule__HasMany__Group__52739);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1353:1: rule__HasMany__Group__5__Impl : ( ( RULE_SL_COMMENT )? ) ;
    public final void rule__HasMany__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1357:1: ( ( ( RULE_SL_COMMENT )? ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1358:1: ( ( RULE_SL_COMMENT )? )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1358:1: ( ( RULE_SL_COMMENT )? )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1359:1: ( RULE_SL_COMMENT )?
            {
             before(grammarAccess.getHasManyAccess().getSL_COMMENTTerminalRuleCall_5()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1360:1: ( RULE_SL_COMMENT )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_SL_COMMENT) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1360:3: RULE_SL_COMMENT
                    {
                    match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_rule__HasMany__Group__5__Impl2767); 

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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1382:1: rule__HasAndBelongsToMany__Group__0 : rule__HasAndBelongsToMany__Group__0__Impl rule__HasAndBelongsToMany__Group__1 ;
    public final void rule__HasAndBelongsToMany__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1386:1: ( rule__HasAndBelongsToMany__Group__0__Impl rule__HasAndBelongsToMany__Group__1 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1387:2: rule__HasAndBelongsToMany__Group__0__Impl rule__HasAndBelongsToMany__Group__1
            {
            pushFollow(FOLLOW_rule__HasAndBelongsToMany__Group__0__Impl_in_rule__HasAndBelongsToMany__Group__02810);
            rule__HasAndBelongsToMany__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HasAndBelongsToMany__Group__1_in_rule__HasAndBelongsToMany__Group__02813);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1394:1: rule__HasAndBelongsToMany__Group__0__Impl : ( RULE_HAS_AND_BELONGS_TO_MANY_WORD ) ;
    public final void rule__HasAndBelongsToMany__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1398:1: ( ( RULE_HAS_AND_BELONGS_TO_MANY_WORD ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1399:1: ( RULE_HAS_AND_BELONGS_TO_MANY_WORD )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1399:1: ( RULE_HAS_AND_BELONGS_TO_MANY_WORD )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1400:1: RULE_HAS_AND_BELONGS_TO_MANY_WORD
            {
             before(grammarAccess.getHasAndBelongsToManyAccess().getHAS_AND_BELONGS_TO_MANY_WORDTerminalRuleCall_0()); 
            match(input,RULE_HAS_AND_BELONGS_TO_MANY_WORD,FOLLOW_RULE_HAS_AND_BELONGS_TO_MANY_WORD_in_rule__HasAndBelongsToMany__Group__0__Impl2840); 
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1411:1: rule__HasAndBelongsToMany__Group__1 : rule__HasAndBelongsToMany__Group__1__Impl rule__HasAndBelongsToMany__Group__2 ;
    public final void rule__HasAndBelongsToMany__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1415:1: ( rule__HasAndBelongsToMany__Group__1__Impl rule__HasAndBelongsToMany__Group__2 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1416:2: rule__HasAndBelongsToMany__Group__1__Impl rule__HasAndBelongsToMany__Group__2
            {
            pushFollow(FOLLOW_rule__HasAndBelongsToMany__Group__1__Impl_in_rule__HasAndBelongsToMany__Group__12869);
            rule__HasAndBelongsToMany__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HasAndBelongsToMany__Group__2_in_rule__HasAndBelongsToMany__Group__12872);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1423:1: rule__HasAndBelongsToMany__Group__1__Impl : ( ( ' ' )* ) ;
    public final void rule__HasAndBelongsToMany__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1427:1: ( ( ( ' ' )* ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1428:1: ( ( ' ' )* )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1428:1: ( ( ' ' )* )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1429:1: ( ' ' )*
            {
             before(grammarAccess.getHasAndBelongsToManyAccess().getSpaceKeyword_1()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1430:1: ( ' ' )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==23) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1431:2: ' '
            	    {
            	    match(input,23,FOLLOW_23_in_rule__HasAndBelongsToMany__Group__1__Impl2901); 

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getHasAndBelongsToManyAccess().getSpaceKeyword_1()); 

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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1442:1: rule__HasAndBelongsToMany__Group__2 : rule__HasAndBelongsToMany__Group__2__Impl rule__HasAndBelongsToMany__Group__3 ;
    public final void rule__HasAndBelongsToMany__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1446:1: ( rule__HasAndBelongsToMany__Group__2__Impl rule__HasAndBelongsToMany__Group__3 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1447:2: rule__HasAndBelongsToMany__Group__2__Impl rule__HasAndBelongsToMany__Group__3
            {
            pushFollow(FOLLOW_rule__HasAndBelongsToMany__Group__2__Impl_in_rule__HasAndBelongsToMany__Group__22934);
            rule__HasAndBelongsToMany__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HasAndBelongsToMany__Group__3_in_rule__HasAndBelongsToMany__Group__22937);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1454:1: rule__HasAndBelongsToMany__Group__2__Impl : ( ( rule__HasAndBelongsToMany__NameAssignment_2 ) ) ;
    public final void rule__HasAndBelongsToMany__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1458:1: ( ( ( rule__HasAndBelongsToMany__NameAssignment_2 ) ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1459:1: ( ( rule__HasAndBelongsToMany__NameAssignment_2 ) )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1459:1: ( ( rule__HasAndBelongsToMany__NameAssignment_2 ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1460:1: ( rule__HasAndBelongsToMany__NameAssignment_2 )
            {
             before(grammarAccess.getHasAndBelongsToManyAccess().getNameAssignment_2()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1461:1: ( rule__HasAndBelongsToMany__NameAssignment_2 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1461:2: rule__HasAndBelongsToMany__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__HasAndBelongsToMany__NameAssignment_2_in_rule__HasAndBelongsToMany__Group__2__Impl2964);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1471:1: rule__HasAndBelongsToMany__Group__3 : rule__HasAndBelongsToMany__Group__3__Impl rule__HasAndBelongsToMany__Group__4 ;
    public final void rule__HasAndBelongsToMany__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1475:1: ( rule__HasAndBelongsToMany__Group__3__Impl rule__HasAndBelongsToMany__Group__4 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1476:2: rule__HasAndBelongsToMany__Group__3__Impl rule__HasAndBelongsToMany__Group__4
            {
            pushFollow(FOLLOW_rule__HasAndBelongsToMany__Group__3__Impl_in_rule__HasAndBelongsToMany__Group__32994);
            rule__HasAndBelongsToMany__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HasAndBelongsToMany__Group__4_in_rule__HasAndBelongsToMany__Group__32997);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1483:1: rule__HasAndBelongsToMany__Group__3__Impl : ( ( ' ' )* ) ;
    public final void rule__HasAndBelongsToMany__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1487:1: ( ( ( ' ' )* ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1488:1: ( ( ' ' )* )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1488:1: ( ( ' ' )* )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1489:1: ( ' ' )*
            {
             before(grammarAccess.getHasAndBelongsToManyAccess().getSpaceKeyword_3()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1490:1: ( ' ' )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==23) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1491:2: ' '
            	    {
            	    match(input,23,FOLLOW_23_in_rule__HasAndBelongsToMany__Group__3__Impl3026); 

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getHasAndBelongsToManyAccess().getSpaceKeyword_3()); 

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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1502:1: rule__HasAndBelongsToMany__Group__4 : rule__HasAndBelongsToMany__Group__4__Impl ;
    public final void rule__HasAndBelongsToMany__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1506:1: ( rule__HasAndBelongsToMany__Group__4__Impl )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1507:2: rule__HasAndBelongsToMany__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__HasAndBelongsToMany__Group__4__Impl_in_rule__HasAndBelongsToMany__Group__43059);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1513:1: rule__HasAndBelongsToMany__Group__4__Impl : ( ( rule__HasAndBelongsToMany__OptionsAssignment_4 )* ) ;
    public final void rule__HasAndBelongsToMany__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1517:1: ( ( ( rule__HasAndBelongsToMany__OptionsAssignment_4 )* ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1518:1: ( ( rule__HasAndBelongsToMany__OptionsAssignment_4 )* )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1518:1: ( ( rule__HasAndBelongsToMany__OptionsAssignment_4 )* )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1519:1: ( rule__HasAndBelongsToMany__OptionsAssignment_4 )*
            {
             before(grammarAccess.getHasAndBelongsToManyAccess().getOptionsAssignment_4()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1520:1: ( rule__HasAndBelongsToMany__OptionsAssignment_4 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==27) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1520:2: rule__HasAndBelongsToMany__OptionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__HasAndBelongsToMany__OptionsAssignment_4_in_rule__HasAndBelongsToMany__Group__4__Impl3086);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1540:1: rule__BelongsTo__Group__0 : rule__BelongsTo__Group__0__Impl rule__BelongsTo__Group__1 ;
    public final void rule__BelongsTo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1544:1: ( rule__BelongsTo__Group__0__Impl rule__BelongsTo__Group__1 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1545:2: rule__BelongsTo__Group__0__Impl rule__BelongsTo__Group__1
            {
            pushFollow(FOLLOW_rule__BelongsTo__Group__0__Impl_in_rule__BelongsTo__Group__03127);
            rule__BelongsTo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BelongsTo__Group__1_in_rule__BelongsTo__Group__03130);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1552:1: rule__BelongsTo__Group__0__Impl : ( RULE_BELONGS_TO_WORD ) ;
    public final void rule__BelongsTo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1556:1: ( ( RULE_BELONGS_TO_WORD ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1557:1: ( RULE_BELONGS_TO_WORD )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1557:1: ( RULE_BELONGS_TO_WORD )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1558:1: RULE_BELONGS_TO_WORD
            {
             before(grammarAccess.getBelongsToAccess().getBELONGS_TO_WORDTerminalRuleCall_0()); 
            match(input,RULE_BELONGS_TO_WORD,FOLLOW_RULE_BELONGS_TO_WORD_in_rule__BelongsTo__Group__0__Impl3157); 
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1569:1: rule__BelongsTo__Group__1 : rule__BelongsTo__Group__1__Impl rule__BelongsTo__Group__2 ;
    public final void rule__BelongsTo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1573:1: ( rule__BelongsTo__Group__1__Impl rule__BelongsTo__Group__2 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1574:2: rule__BelongsTo__Group__1__Impl rule__BelongsTo__Group__2
            {
            pushFollow(FOLLOW_rule__BelongsTo__Group__1__Impl_in_rule__BelongsTo__Group__13186);
            rule__BelongsTo__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BelongsTo__Group__2_in_rule__BelongsTo__Group__13189);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1581:1: rule__BelongsTo__Group__1__Impl : ( ( ' ' )* ) ;
    public final void rule__BelongsTo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1585:1: ( ( ( ' ' )* ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1586:1: ( ( ' ' )* )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1586:1: ( ( ' ' )* )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1587:1: ( ' ' )*
            {
             before(grammarAccess.getBelongsToAccess().getSpaceKeyword_1()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1588:1: ( ' ' )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==23) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1589:2: ' '
            	    {
            	    match(input,23,FOLLOW_23_in_rule__BelongsTo__Group__1__Impl3218); 

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getBelongsToAccess().getSpaceKeyword_1()); 

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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1600:1: rule__BelongsTo__Group__2 : rule__BelongsTo__Group__2__Impl rule__BelongsTo__Group__3 ;
    public final void rule__BelongsTo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1604:1: ( rule__BelongsTo__Group__2__Impl rule__BelongsTo__Group__3 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1605:2: rule__BelongsTo__Group__2__Impl rule__BelongsTo__Group__3
            {
            pushFollow(FOLLOW_rule__BelongsTo__Group__2__Impl_in_rule__BelongsTo__Group__23251);
            rule__BelongsTo__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BelongsTo__Group__3_in_rule__BelongsTo__Group__23254);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1612:1: rule__BelongsTo__Group__2__Impl : ( ( rule__BelongsTo__NameAssignment_2 ) ) ;
    public final void rule__BelongsTo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1616:1: ( ( ( rule__BelongsTo__NameAssignment_2 ) ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1617:1: ( ( rule__BelongsTo__NameAssignment_2 ) )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1617:1: ( ( rule__BelongsTo__NameAssignment_2 ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1618:1: ( rule__BelongsTo__NameAssignment_2 )
            {
             before(grammarAccess.getBelongsToAccess().getNameAssignment_2()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1619:1: ( rule__BelongsTo__NameAssignment_2 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1619:2: rule__BelongsTo__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__BelongsTo__NameAssignment_2_in_rule__BelongsTo__Group__2__Impl3281);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1629:1: rule__BelongsTo__Group__3 : rule__BelongsTo__Group__3__Impl rule__BelongsTo__Group__4 ;
    public final void rule__BelongsTo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1633:1: ( rule__BelongsTo__Group__3__Impl rule__BelongsTo__Group__4 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1634:2: rule__BelongsTo__Group__3__Impl rule__BelongsTo__Group__4
            {
            pushFollow(FOLLOW_rule__BelongsTo__Group__3__Impl_in_rule__BelongsTo__Group__33311);
            rule__BelongsTo__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BelongsTo__Group__4_in_rule__BelongsTo__Group__33314);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1641:1: rule__BelongsTo__Group__3__Impl : ( ( ' ' )* ) ;
    public final void rule__BelongsTo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1645:1: ( ( ( ' ' )* ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1646:1: ( ( ' ' )* )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1646:1: ( ( ' ' )* )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1647:1: ( ' ' )*
            {
             before(grammarAccess.getBelongsToAccess().getSpaceKeyword_3()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1648:1: ( ' ' )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==23) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1649:2: ' '
            	    {
            	    match(input,23,FOLLOW_23_in_rule__BelongsTo__Group__3__Impl3343); 

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getBelongsToAccess().getSpaceKeyword_3()); 

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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1660:1: rule__BelongsTo__Group__4 : rule__BelongsTo__Group__4__Impl ;
    public final void rule__BelongsTo__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1664:1: ( rule__BelongsTo__Group__4__Impl )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1665:2: rule__BelongsTo__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__BelongsTo__Group__4__Impl_in_rule__BelongsTo__Group__43376);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1671:1: rule__BelongsTo__Group__4__Impl : ( ( rule__BelongsTo__OptionsAssignment_4 )* ) ;
    public final void rule__BelongsTo__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1675:1: ( ( ( rule__BelongsTo__OptionsAssignment_4 )* ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1676:1: ( ( rule__BelongsTo__OptionsAssignment_4 )* )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1676:1: ( ( rule__BelongsTo__OptionsAssignment_4 )* )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1677:1: ( rule__BelongsTo__OptionsAssignment_4 )*
            {
             before(grammarAccess.getBelongsToAccess().getOptionsAssignment_4()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1678:1: ( rule__BelongsTo__OptionsAssignment_4 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==27) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1678:2: rule__BelongsTo__OptionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__BelongsTo__OptionsAssignment_4_in_rule__BelongsTo__Group__4__Impl3403);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1698:1: rule__HashKeyValue__Group__0 : rule__HashKeyValue__Group__0__Impl rule__HashKeyValue__Group__1 ;
    public final void rule__HashKeyValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1702:1: ( rule__HashKeyValue__Group__0__Impl rule__HashKeyValue__Group__1 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1703:2: rule__HashKeyValue__Group__0__Impl rule__HashKeyValue__Group__1
            {
            pushFollow(FOLLOW_rule__HashKeyValue__Group__0__Impl_in_rule__HashKeyValue__Group__03444);
            rule__HashKeyValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HashKeyValue__Group__1_in_rule__HashKeyValue__Group__03447);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1710:1: rule__HashKeyValue__Group__0__Impl : ( ',' ) ;
    public final void rule__HashKeyValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1714:1: ( ( ',' ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1715:1: ( ',' )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1715:1: ( ',' )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1716:1: ','
            {
             before(grammarAccess.getHashKeyValueAccess().getCommaKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__HashKeyValue__Group__0__Impl3475); 
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1729:1: rule__HashKeyValue__Group__1 : rule__HashKeyValue__Group__1__Impl rule__HashKeyValue__Group__2 ;
    public final void rule__HashKeyValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1733:1: ( rule__HashKeyValue__Group__1__Impl rule__HashKeyValue__Group__2 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1734:2: rule__HashKeyValue__Group__1__Impl rule__HashKeyValue__Group__2
            {
            pushFollow(FOLLOW_rule__HashKeyValue__Group__1__Impl_in_rule__HashKeyValue__Group__13506);
            rule__HashKeyValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HashKeyValue__Group__2_in_rule__HashKeyValue__Group__13509);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1741:1: rule__HashKeyValue__Group__1__Impl : ( ( ' ' )* ) ;
    public final void rule__HashKeyValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1745:1: ( ( ( ' ' )* ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1746:1: ( ( ' ' )* )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1746:1: ( ( ' ' )* )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1747:1: ( ' ' )*
            {
             before(grammarAccess.getHashKeyValueAccess().getSpaceKeyword_1()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1748:1: ( ' ' )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==23) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1749:2: ' '
            	    {
            	    match(input,23,FOLLOW_23_in_rule__HashKeyValue__Group__1__Impl3538); 

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getHashKeyValueAccess().getSpaceKeyword_1()); 

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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1760:1: rule__HashKeyValue__Group__2 : rule__HashKeyValue__Group__2__Impl rule__HashKeyValue__Group__3 ;
    public final void rule__HashKeyValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1764:1: ( rule__HashKeyValue__Group__2__Impl rule__HashKeyValue__Group__3 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1765:2: rule__HashKeyValue__Group__2__Impl rule__HashKeyValue__Group__3
            {
            pushFollow(FOLLOW_rule__HashKeyValue__Group__2__Impl_in_rule__HashKeyValue__Group__23571);
            rule__HashKeyValue__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HashKeyValue__Group__3_in_rule__HashKeyValue__Group__23574);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1772:1: rule__HashKeyValue__Group__2__Impl : ( ( rule__HashKeyValue__Alternatives_2 ) ) ;
    public final void rule__HashKeyValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1776:1: ( ( ( rule__HashKeyValue__Alternatives_2 ) ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1777:1: ( ( rule__HashKeyValue__Alternatives_2 ) )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1777:1: ( ( rule__HashKeyValue__Alternatives_2 ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1778:1: ( rule__HashKeyValue__Alternatives_2 )
            {
             before(grammarAccess.getHashKeyValueAccess().getAlternatives_2()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1779:1: ( rule__HashKeyValue__Alternatives_2 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1779:2: rule__HashKeyValue__Alternatives_2
            {
            pushFollow(FOLLOW_rule__HashKeyValue__Alternatives_2_in_rule__HashKeyValue__Group__2__Impl3601);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1789:1: rule__HashKeyValue__Group__3 : rule__HashKeyValue__Group__3__Impl rule__HashKeyValue__Group__4 ;
    public final void rule__HashKeyValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1793:1: ( rule__HashKeyValue__Group__3__Impl rule__HashKeyValue__Group__4 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1794:2: rule__HashKeyValue__Group__3__Impl rule__HashKeyValue__Group__4
            {
            pushFollow(FOLLOW_rule__HashKeyValue__Group__3__Impl_in_rule__HashKeyValue__Group__33631);
            rule__HashKeyValue__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HashKeyValue__Group__4_in_rule__HashKeyValue__Group__33634);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1801:1: rule__HashKeyValue__Group__3__Impl : ( ( ' ' )* ) ;
    public final void rule__HashKeyValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1805:1: ( ( ( ' ' )* ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1806:1: ( ( ' ' )* )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1806:1: ( ( ' ' )* )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1807:1: ( ' ' )*
            {
             before(grammarAccess.getHashKeyValueAccess().getSpaceKeyword_3()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1808:1: ( ' ' )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==23) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1809:2: ' '
            	    {
            	    match(input,23,FOLLOW_23_in_rule__HashKeyValue__Group__3__Impl3663); 

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getHashKeyValueAccess().getSpaceKeyword_3()); 

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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1820:1: rule__HashKeyValue__Group__4 : rule__HashKeyValue__Group__4__Impl ;
    public final void rule__HashKeyValue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1824:1: ( rule__HashKeyValue__Group__4__Impl )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1825:2: rule__HashKeyValue__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__HashKeyValue__Group__4__Impl_in_rule__HashKeyValue__Group__43696);
            rule__HashKeyValue__Group__4__Impl();

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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1831:1: rule__HashKeyValue__Group__4__Impl : ( ( rule__HashKeyValue__ValueAssignment_4 ) ) ;
    public final void rule__HashKeyValue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1835:1: ( ( ( rule__HashKeyValue__ValueAssignment_4 ) ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1836:1: ( ( rule__HashKeyValue__ValueAssignment_4 ) )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1836:1: ( ( rule__HashKeyValue__ValueAssignment_4 ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1837:1: ( rule__HashKeyValue__ValueAssignment_4 )
            {
             before(grammarAccess.getHashKeyValueAccess().getValueAssignment_4()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1838:1: ( rule__HashKeyValue__ValueAssignment_4 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1838:2: rule__HashKeyValue__ValueAssignment_4
            {
            pushFollow(FOLLOW_rule__HashKeyValue__ValueAssignment_4_in_rule__HashKeyValue__Group__4__Impl3723);
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


    // $ANTLR start "rule__HashKeyValue__Group_2_0__0"
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1858:1: rule__HashKeyValue__Group_2_0__0 : rule__HashKeyValue__Group_2_0__0__Impl rule__HashKeyValue__Group_2_0__1 ;
    public final void rule__HashKeyValue__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1862:1: ( rule__HashKeyValue__Group_2_0__0__Impl rule__HashKeyValue__Group_2_0__1 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1863:2: rule__HashKeyValue__Group_2_0__0__Impl rule__HashKeyValue__Group_2_0__1
            {
            pushFollow(FOLLOW_rule__HashKeyValue__Group_2_0__0__Impl_in_rule__HashKeyValue__Group_2_0__03763);
            rule__HashKeyValue__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HashKeyValue__Group_2_0__1_in_rule__HashKeyValue__Group_2_0__03766);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1870:1: rule__HashKeyValue__Group_2_0__0__Impl : ( ( rule__HashKeyValue__KeyAssignment_2_0_0 ) ) ;
    public final void rule__HashKeyValue__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1874:1: ( ( ( rule__HashKeyValue__KeyAssignment_2_0_0 ) ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1875:1: ( ( rule__HashKeyValue__KeyAssignment_2_0_0 ) )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1875:1: ( ( rule__HashKeyValue__KeyAssignment_2_0_0 ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1876:1: ( rule__HashKeyValue__KeyAssignment_2_0_0 )
            {
             before(grammarAccess.getHashKeyValueAccess().getKeyAssignment_2_0_0()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1877:1: ( rule__HashKeyValue__KeyAssignment_2_0_0 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1877:2: rule__HashKeyValue__KeyAssignment_2_0_0
            {
            pushFollow(FOLLOW_rule__HashKeyValue__KeyAssignment_2_0_0_in_rule__HashKeyValue__Group_2_0__0__Impl3793);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1887:1: rule__HashKeyValue__Group_2_0__1 : rule__HashKeyValue__Group_2_0__1__Impl ;
    public final void rule__HashKeyValue__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1891:1: ( rule__HashKeyValue__Group_2_0__1__Impl )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1892:2: rule__HashKeyValue__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_rule__HashKeyValue__Group_2_0__1__Impl_in_rule__HashKeyValue__Group_2_0__13823);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1898:1: rule__HashKeyValue__Group_2_0__1__Impl : ( ':' ) ;
    public final void rule__HashKeyValue__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1902:1: ( ( ':' ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1903:1: ( ':' )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1903:1: ( ':' )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1904:1: ':'
            {
             before(grammarAccess.getHashKeyValueAccess().getColonKeyword_2_0_1()); 
            match(input,28,FOLLOW_28_in_rule__HashKeyValue__Group_2_0__1__Impl3851); 
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1921:1: rule__HashKeyValue__Group_2_1__0 : rule__HashKeyValue__Group_2_1__0__Impl rule__HashKeyValue__Group_2_1__1 ;
    public final void rule__HashKeyValue__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1925:1: ( rule__HashKeyValue__Group_2_1__0__Impl rule__HashKeyValue__Group_2_1__1 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1926:2: rule__HashKeyValue__Group_2_1__0__Impl rule__HashKeyValue__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__HashKeyValue__Group_2_1__0__Impl_in_rule__HashKeyValue__Group_2_1__03886);
            rule__HashKeyValue__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HashKeyValue__Group_2_1__1_in_rule__HashKeyValue__Group_2_1__03889);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1933:1: rule__HashKeyValue__Group_2_1__0__Impl : ( ( rule__HashKeyValue__KeyAssignment_2_1_0 ) ) ;
    public final void rule__HashKeyValue__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1937:1: ( ( ( rule__HashKeyValue__KeyAssignment_2_1_0 ) ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1938:1: ( ( rule__HashKeyValue__KeyAssignment_2_1_0 ) )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1938:1: ( ( rule__HashKeyValue__KeyAssignment_2_1_0 ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1939:1: ( rule__HashKeyValue__KeyAssignment_2_1_0 )
            {
             before(grammarAccess.getHashKeyValueAccess().getKeyAssignment_2_1_0()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1940:1: ( rule__HashKeyValue__KeyAssignment_2_1_0 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1940:2: rule__HashKeyValue__KeyAssignment_2_1_0
            {
            pushFollow(FOLLOW_rule__HashKeyValue__KeyAssignment_2_1_0_in_rule__HashKeyValue__Group_2_1__0__Impl3916);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1950:1: rule__HashKeyValue__Group_2_1__1 : rule__HashKeyValue__Group_2_1__1__Impl rule__HashKeyValue__Group_2_1__2 ;
    public final void rule__HashKeyValue__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1954:1: ( rule__HashKeyValue__Group_2_1__1__Impl rule__HashKeyValue__Group_2_1__2 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1955:2: rule__HashKeyValue__Group_2_1__1__Impl rule__HashKeyValue__Group_2_1__2
            {
            pushFollow(FOLLOW_rule__HashKeyValue__Group_2_1__1__Impl_in_rule__HashKeyValue__Group_2_1__13946);
            rule__HashKeyValue__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HashKeyValue__Group_2_1__2_in_rule__HashKeyValue__Group_2_1__13949);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1962:1: rule__HashKeyValue__Group_2_1__1__Impl : ( ( ' ' )* ) ;
    public final void rule__HashKeyValue__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1966:1: ( ( ( ' ' )* ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1967:1: ( ( ' ' )* )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1967:1: ( ( ' ' )* )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1968:1: ( ' ' )*
            {
             before(grammarAccess.getHashKeyValueAccess().getSpaceKeyword_2_1_1()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1969:1: ( ' ' )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==23) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1970:2: ' '
            	    {
            	    match(input,23,FOLLOW_23_in_rule__HashKeyValue__Group_2_1__1__Impl3978); 

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getHashKeyValueAccess().getSpaceKeyword_2_1_1()); 

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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1981:1: rule__HashKeyValue__Group_2_1__2 : rule__HashKeyValue__Group_2_1__2__Impl ;
    public final void rule__HashKeyValue__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1985:1: ( rule__HashKeyValue__Group_2_1__2__Impl )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1986:2: rule__HashKeyValue__Group_2_1__2__Impl
            {
            pushFollow(FOLLOW_rule__HashKeyValue__Group_2_1__2__Impl_in_rule__HashKeyValue__Group_2_1__24011);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1992:1: rule__HashKeyValue__Group_2_1__2__Impl : ( '=>' ) ;
    public final void rule__HashKeyValue__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1996:1: ( ( '=>' ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1997:1: ( '=>' )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1997:1: ( '=>' )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1998:1: '=>'
            {
             before(grammarAccess.getHashKeyValueAccess().getEqualsSignGreaterThanSignKeyword_2_1_2()); 
            match(input,29,FOLLOW_29_in_rule__HashKeyValue__Group_2_1__2__Impl4039); 
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2017:1: rule__Method__Group__0 : rule__Method__Group__0__Impl rule__Method__Group__1 ;
    public final void rule__Method__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2021:1: ( rule__Method__Group__0__Impl rule__Method__Group__1 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2022:2: rule__Method__Group__0__Impl rule__Method__Group__1
            {
            pushFollow(FOLLOW_rule__Method__Group__0__Impl_in_rule__Method__Group__04076);
            rule__Method__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__1_in_rule__Method__Group__04079);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2029:1: rule__Method__Group__0__Impl : ( RULE_DEF_WORD ) ;
    public final void rule__Method__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2033:1: ( ( RULE_DEF_WORD ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2034:1: ( RULE_DEF_WORD )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2034:1: ( RULE_DEF_WORD )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2035:1: RULE_DEF_WORD
            {
             before(grammarAccess.getMethodAccess().getDEF_WORDTerminalRuleCall_0()); 
            match(input,RULE_DEF_WORD,FOLLOW_RULE_DEF_WORD_in_rule__Method__Group__0__Impl4106); 
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2046:1: rule__Method__Group__1 : rule__Method__Group__1__Impl ;
    public final void rule__Method__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2050:1: ( rule__Method__Group__1__Impl )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2051:2: rule__Method__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Method__Group__1__Impl_in_rule__Method__Group__14135);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2057:1: rule__Method__Group__1__Impl : ( ( rule__Method__NameAssignment_1 ) ) ;
    public final void rule__Method__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2061:1: ( ( ( rule__Method__NameAssignment_1 ) ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2062:1: ( ( rule__Method__NameAssignment_1 ) )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2062:1: ( ( rule__Method__NameAssignment_1 ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2063:1: ( rule__Method__NameAssignment_1 )
            {
             before(grammarAccess.getMethodAccess().getNameAssignment_1()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2064:1: ( rule__Method__NameAssignment_1 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2064:2: rule__Method__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Method__NameAssignment_1_in_rule__Method__Group__1__Impl4162);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2078:1: rule__MethodName__Group__0 : rule__MethodName__Group__0__Impl rule__MethodName__Group__1 ;
    public final void rule__MethodName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2082:1: ( rule__MethodName__Group__0__Impl rule__MethodName__Group__1 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2083:2: rule__MethodName__Group__0__Impl rule__MethodName__Group__1
            {
            pushFollow(FOLLOW_rule__MethodName__Group__0__Impl_in_rule__MethodName__Group__04196);
            rule__MethodName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MethodName__Group__1_in_rule__MethodName__Group__04199);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2090:1: rule__MethodName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__MethodName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2094:1: ( ( RULE_ID ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2095:1: ( RULE_ID )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2095:1: ( RULE_ID )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2096:1: RULE_ID
            {
             before(grammarAccess.getMethodNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MethodName__Group__0__Impl4226); 
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2107:1: rule__MethodName__Group__1 : rule__MethodName__Group__1__Impl ;
    public final void rule__MethodName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2111:1: ( rule__MethodName__Group__1__Impl )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2112:2: rule__MethodName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MethodName__Group__1__Impl_in_rule__MethodName__Group__14255);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2118:1: rule__MethodName__Group__1__Impl : ( ( rule__MethodName__Alternatives_1 )? ) ;
    public final void rule__MethodName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2122:1: ( ( ( rule__MethodName__Alternatives_1 )? ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2123:1: ( ( rule__MethodName__Alternatives_1 )? )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2123:1: ( ( rule__MethodName__Alternatives_1 )? )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2124:1: ( rule__MethodName__Alternatives_1 )?
            {
             before(grammarAccess.getMethodNameAccess().getAlternatives_1()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2125:1: ( rule__MethodName__Alternatives_1 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=21 && LA31_0<=22)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2125:2: rule__MethodName__Alternatives_1
                    {
                    pushFollow(FOLLOW_rule__MethodName__Alternatives_1_in_rule__MethodName__Group__1__Impl4282);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2140:1: rule__Class__NameAssignment_2 : ( ruleNamespacedModuleName ) ;
    public final void rule__Class__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2144:1: ( ( ruleNamespacedModuleName ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2145:1: ( ruleNamespacedModuleName )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2145:1: ( ruleNamespacedModuleName )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2146:1: ruleNamespacedModuleName
            {
             before(grammarAccess.getClassAccess().getNameNamespacedModuleNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleNamespacedModuleName_in_rule__Class__NameAssignment_24322);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2155:1: rule__Class__SuperTypeAssignment_3_3 : ( ruleNamespacedModuleName ) ;
    public final void rule__Class__SuperTypeAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2159:1: ( ( ruleNamespacedModuleName ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2160:1: ( ruleNamespacedModuleName )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2160:1: ( ruleNamespacedModuleName )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2161:1: ruleNamespacedModuleName
            {
             before(grammarAccess.getClassAccess().getSuperTypeNamespacedModuleNameParserRuleCall_3_3_0()); 
            pushFollow(FOLLOW_ruleNamespacedModuleName_in_rule__Class__SuperTypeAssignment_3_34353);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2170:1: rule__Class__ClassElementsAssignment_5 : ( ruleClassElement ) ;
    public final void rule__Class__ClassElementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2174:1: ( ( ruleClassElement ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2175:1: ( ruleClassElement )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2175:1: ( ruleClassElement )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2176:1: ruleClassElement
            {
             before(grammarAccess.getClassAccess().getClassElementsClassElementParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleClassElement_in_rule__Class__ClassElementsAssignment_54384);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2185:1: rule__HasMany__NameAssignment_2 : ( ( rule__HasMany__NameAlternatives_2_0 ) ) ;
    public final void rule__HasMany__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2189:1: ( ( ( rule__HasMany__NameAlternatives_2_0 ) ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2190:1: ( ( rule__HasMany__NameAlternatives_2_0 ) )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2190:1: ( ( rule__HasMany__NameAlternatives_2_0 ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2191:1: ( rule__HasMany__NameAlternatives_2_0 )
            {
             before(grammarAccess.getHasManyAccess().getNameAlternatives_2_0()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2192:1: ( rule__HasMany__NameAlternatives_2_0 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2192:2: rule__HasMany__NameAlternatives_2_0
            {
            pushFollow(FOLLOW_rule__HasMany__NameAlternatives_2_0_in_rule__HasMany__NameAssignment_24415);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2201:1: rule__HasMany__OptionsAssignment_4 : ( ruleHashKeyValue ) ;
    public final void rule__HasMany__OptionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2205:1: ( ( ruleHashKeyValue ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2206:1: ( ruleHashKeyValue )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2206:1: ( ruleHashKeyValue )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2207:1: ruleHashKeyValue
            {
             before(grammarAccess.getHasManyAccess().getOptionsHashKeyValueParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleHashKeyValue_in_rule__HasMany__OptionsAssignment_44448);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2216:1: rule__HasAndBelongsToMany__NameAssignment_2 : ( ( rule__HasAndBelongsToMany__NameAlternatives_2_0 ) ) ;
    public final void rule__HasAndBelongsToMany__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2220:1: ( ( ( rule__HasAndBelongsToMany__NameAlternatives_2_0 ) ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2221:1: ( ( rule__HasAndBelongsToMany__NameAlternatives_2_0 ) )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2221:1: ( ( rule__HasAndBelongsToMany__NameAlternatives_2_0 ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2222:1: ( rule__HasAndBelongsToMany__NameAlternatives_2_0 )
            {
             before(grammarAccess.getHasAndBelongsToManyAccess().getNameAlternatives_2_0()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2223:1: ( rule__HasAndBelongsToMany__NameAlternatives_2_0 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2223:2: rule__HasAndBelongsToMany__NameAlternatives_2_0
            {
            pushFollow(FOLLOW_rule__HasAndBelongsToMany__NameAlternatives_2_0_in_rule__HasAndBelongsToMany__NameAssignment_24479);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2232:1: rule__HasAndBelongsToMany__OptionsAssignment_4 : ( ruleHashKeyValue ) ;
    public final void rule__HasAndBelongsToMany__OptionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2236:1: ( ( ruleHashKeyValue ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2237:1: ( ruleHashKeyValue )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2237:1: ( ruleHashKeyValue )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2238:1: ruleHashKeyValue
            {
             before(grammarAccess.getHasAndBelongsToManyAccess().getOptionsHashKeyValueParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleHashKeyValue_in_rule__HasAndBelongsToMany__OptionsAssignment_44512);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2247:1: rule__BelongsTo__NameAssignment_2 : ( ( rule__BelongsTo__NameAlternatives_2_0 ) ) ;
    public final void rule__BelongsTo__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2251:1: ( ( ( rule__BelongsTo__NameAlternatives_2_0 ) ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2252:1: ( ( rule__BelongsTo__NameAlternatives_2_0 ) )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2252:1: ( ( rule__BelongsTo__NameAlternatives_2_0 ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2253:1: ( rule__BelongsTo__NameAlternatives_2_0 )
            {
             before(grammarAccess.getBelongsToAccess().getNameAlternatives_2_0()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2254:1: ( rule__BelongsTo__NameAlternatives_2_0 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2254:2: rule__BelongsTo__NameAlternatives_2_0
            {
            pushFollow(FOLLOW_rule__BelongsTo__NameAlternatives_2_0_in_rule__BelongsTo__NameAssignment_24543);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2263:1: rule__BelongsTo__OptionsAssignment_4 : ( ruleHashKeyValue ) ;
    public final void rule__BelongsTo__OptionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2267:1: ( ( ruleHashKeyValue ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2268:1: ( ruleHashKeyValue )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2268:1: ( ruleHashKeyValue )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2269:1: ruleHashKeyValue
            {
             before(grammarAccess.getBelongsToAccess().getOptionsHashKeyValueParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleHashKeyValue_in_rule__BelongsTo__OptionsAssignment_44576);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2278:1: rule__HashKeyValue__KeyAssignment_2_0_0 : ( RULE_ID ) ;
    public final void rule__HashKeyValue__KeyAssignment_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2282:1: ( ( RULE_ID ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2283:1: ( RULE_ID )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2283:1: ( RULE_ID )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2284:1: RULE_ID
            {
             before(grammarAccess.getHashKeyValueAccess().getKeyIDTerminalRuleCall_2_0_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__HashKeyValue__KeyAssignment_2_0_04607); 
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2293:1: rule__HashKeyValue__KeyAssignment_2_1_0 : ( ( rule__HashKeyValue__KeyAlternatives_2_1_0_0 ) ) ;
    public final void rule__HashKeyValue__KeyAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2297:1: ( ( ( rule__HashKeyValue__KeyAlternatives_2_1_0_0 ) ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2298:1: ( ( rule__HashKeyValue__KeyAlternatives_2_1_0_0 ) )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2298:1: ( ( rule__HashKeyValue__KeyAlternatives_2_1_0_0 ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2299:1: ( rule__HashKeyValue__KeyAlternatives_2_1_0_0 )
            {
             before(grammarAccess.getHashKeyValueAccess().getKeyAlternatives_2_1_0_0()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2300:1: ( rule__HashKeyValue__KeyAlternatives_2_1_0_0 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2300:2: rule__HashKeyValue__KeyAlternatives_2_1_0_0
            {
            pushFollow(FOLLOW_rule__HashKeyValue__KeyAlternatives_2_1_0_0_in_rule__HashKeyValue__KeyAssignment_2_1_04638);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2309:1: rule__HashKeyValue__ValueAssignment_4 : ( ( rule__HashKeyValue__ValueAlternatives_4_0 ) ) ;
    public final void rule__HashKeyValue__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2313:1: ( ( ( rule__HashKeyValue__ValueAlternatives_4_0 ) ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2314:1: ( ( rule__HashKeyValue__ValueAlternatives_4_0 ) )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2314:1: ( ( rule__HashKeyValue__ValueAlternatives_4_0 ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2315:1: ( rule__HashKeyValue__ValueAlternatives_4_0 )
            {
             before(grammarAccess.getHashKeyValueAccess().getValueAlternatives_4_0()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2316:1: ( rule__HashKeyValue__ValueAlternatives_4_0 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2316:2: rule__HashKeyValue__ValueAlternatives_4_0
            {
            pushFollow(FOLLOW_rule__HashKeyValue__ValueAlternatives_4_0_in_rule__HashKeyValue__ValueAssignment_44671);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2325:1: rule__Method__NameAssignment_1 : ( ruleMethodName ) ;
    public final void rule__Method__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2329:1: ( ( ruleMethodName ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2330:1: ( ruleMethodName )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2330:1: ( ruleMethodName )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2331:1: ruleMethodName
            {
             before(grammarAccess.getMethodAccess().getNameMethodNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleMethodName_in_rule__Method__NameAssignment_14704);
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
    static final String DFA11_eotS =
        "\4\uffff";
    static final String DFA11_eofS =
        "\4\uffff";
    static final String DFA11_minS =
        "\2\11\2\uffff";
    static final String DFA11_maxS =
        "\2\30\2\uffff";
    static final String DFA11_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA11_specialS =
        "\4\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\3\1\uffff\1\3\1\uffff\3\3\7\uffff\1\1\1\2",
            "\1\3\1\uffff\1\3\1\uffff\3\3\7\uffff\1\1\1\2",
            "",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "704:1: ( rule__Class__Group_3__0 )?";
        }
    }
 

    public static final BitSet FOLLOW_ruleClass_in_entryRuleClass61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__0_in_ruleClass94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespacedModuleName_in_entryRuleNamespacedModuleName121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamespacedModuleName128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespacedModuleName__Group__0_in_ruleNamespacedModuleName154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodChainCall_in_entryRuleMethodChainCall181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodChainCall188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodChainCall__Group__0_in_ruleMethodChainCall214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassElement_in_entryRuleClassElement241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassElement248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassElement__Alternatives_in_ruleClassElement274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationship_in_entryRuleRelationship301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationship308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__Alternatives_in_ruleRelationship334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHasMany_in_entryRuleHasMany361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHasMany368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HasMany__Group__0_in_ruleHasMany394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHasAndBelongsToMany_in_entryRuleHasAndBelongsToMany421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHasAndBelongsToMany428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HasAndBelongsToMany__Group__0_in_ruleHasAndBelongsToMany454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBelongsTo_in_entryRuleBelongsTo481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBelongsTo488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BelongsTo__Group__0_in_ruleBelongsTo514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHashKeyValue_in_entryRuleHashKeyValue541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHashKeyValue548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HashKeyValue__Group__0_in_ruleHashKeyValue574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_entryRuleMethod601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethod608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__0_in_ruleMethod634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodName_in_entryRuleMethodName661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodName668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodName__Group__0_in_ruleMethodName694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_rule__ClassElement__Alternatives730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationship_in_rule__ClassElement__Alternatives747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHasMany_in_rule__Relationship__Alternatives779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHasAndBelongsToMany_in_rule__Relationship__Alternatives796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBelongsTo_in_rule__Relationship__Alternatives813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SYMBOL_in_rule__HasMany__NameAlternatives_2_0845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__HasMany__NameAlternatives_2_0862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SYMBOL_in_rule__HasAndBelongsToMany__NameAlternatives_2_0894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__HasAndBelongsToMany__NameAlternatives_2_0911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SYMBOL_in_rule__BelongsTo__NameAlternatives_2_0943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__BelongsTo__NameAlternatives_2_0960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HashKeyValue__Group_2_0__0_in_rule__HashKeyValue__Alternatives_2992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HashKeyValue__Group_2_1__0_in_rule__HashKeyValue__Alternatives_21010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SYMBOL_in_rule__HashKeyValue__KeyAlternatives_2_1_0_01043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__HashKeyValue__KeyAlternatives_2_1_0_01060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SYMBOL_in_rule__HashKeyValue__ValueAlternatives_4_01092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__HashKeyValue__ValueAlternatives_4_01109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BRACKET_BLOCK_in_rule__HashKeyValue__ValueAlternatives_4_01126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ARRAY_BLOCK_in_rule__HashKeyValue__ValueAlternatives_4_01143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodChainCall_in_rule__HashKeyValue__ValueAlternatives_4_01160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__MethodName__Alternatives_11193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__MethodName__Alternatives_11213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__0__Impl_in_rule__Class__Group__01245 = new BitSet(new long[]{0x0000000000800400L});
    public static final BitSet FOLLOW_rule__Class__Group__1_in_rule__Class__Group__01248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CLASS_WORD_in_rule__Class__Group__0__Impl1275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__1__Impl_in_rule__Class__Group__11304 = new BitSet(new long[]{0x0000000000800400L});
    public static final BitSet FOLLOW_rule__Class__Group__2_in_rule__Class__Group__11307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Class__Group__1__Impl1336 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__Class__Group__2__Impl_in_rule__Class__Group__21369 = new BitSet(new long[]{0x000000000180EA00L});
    public static final BitSet FOLLOW_rule__Class__Group__3_in_rule__Class__Group__21372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__NameAssignment_2_in_rule__Class__Group__2__Impl1399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__3__Impl_in_rule__Class__Group__31429 = new BitSet(new long[]{0x000000000180EA00L});
    public static final BitSet FOLLOW_rule__Class__Group__4_in_rule__Class__Group__31432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group_3__0_in_rule__Class__Group__3__Impl1459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__4__Impl_in_rule__Class__Group__41490 = new BitSet(new long[]{0x000000000180EA00L});
    public static final BitSet FOLLOW_rule__Class__Group__5_in_rule__Class__Group__41493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Class__Group__4__Impl1522 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__Class__Group__5__Impl_in_rule__Class__Group__51555 = new BitSet(new long[]{0x000000000180EA00L});
    public static final BitSet FOLLOW_rule__Class__Group__6_in_rule__Class__Group__51558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__ClassElementsAssignment_5_in_rule__Class__Group__5__Impl1585 = new BitSet(new long[]{0x000000000000E802L});
    public static final BitSet FOLLOW_rule__Class__Group__6__Impl_in_rule__Class__Group__61616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_END_WORD_in_rule__Class__Group__6__Impl1643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group_3__0__Impl_in_rule__Class__Group_3__01686 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__Class__Group_3__1_in_rule__Class__Group_3__01689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Class__Group_3__0__Impl1718 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__Class__Group_3__1__Impl_in_rule__Class__Group_3__11751 = new BitSet(new long[]{0x0000000000800400L});
    public static final BitSet FOLLOW_rule__Class__Group_3__2_in_rule__Class__Group_3__11754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Class__Group_3__1__Impl1782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group_3__2__Impl_in_rule__Class__Group_3__21813 = new BitSet(new long[]{0x0000000000800400L});
    public static final BitSet FOLLOW_rule__Class__Group_3__3_in_rule__Class__Group_3__21816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Class__Group_3__2__Impl1845 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__Class__Group_3__3__Impl_in_rule__Class__Group_3__31878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__SuperTypeAssignment_3_3_in_rule__Class__Group_3__3__Impl1905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespacedModuleName__Group__0__Impl_in_rule__NamespacedModuleName__Group__01943 = new BitSet(new long[]{0x0000000000800400L});
    public static final BitSet FOLLOW_rule__NamespacedModuleName__Group__1_in_rule__NamespacedModuleName__Group__01946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespacedModuleName__Group_0__0_in_rule__NamespacedModuleName__Group__0__Impl1973 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_rule__NamespacedModuleName__Group__1__Impl_in_rule__NamespacedModuleName__Group__12004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NamespacedModuleName__Group__1__Impl2031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespacedModuleName__Group_0__0__Impl_in_rule__NamespacedModuleName__Group_0__02064 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__NamespacedModuleName__Group_0__1_in_rule__NamespacedModuleName__Group_0__02067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NamespacedModuleName__Group_0__0__Impl2094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespacedModuleName__Group_0__1__Impl_in_rule__NamespacedModuleName__Group_0__12123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__NamespacedModuleName__Group_0__1__Impl2151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodChainCall__Group__0__Impl_in_rule__MethodChainCall__Group__02186 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__MethodChainCall__Group__1_in_rule__MethodChainCall__Group__02189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespacedModuleName_in_rule__MethodChainCall__Group__0__Impl2216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodChainCall__Group__1__Impl_in_rule__MethodChainCall__Group__12245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodChainCall__Group_1__0_in_rule__MethodChainCall__Group__1__Impl2272 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__MethodChainCall__Group_1__0__Impl_in_rule__MethodChainCall__Group_1__02307 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__MethodChainCall__Group_1__1_in_rule__MethodChainCall__Group_1__02310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__MethodChainCall__Group_1__0__Impl2338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodChainCall__Group_1__1__Impl_in_rule__MethodChainCall__Group_1__12369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MethodChainCall__Group_1__1__Impl2396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HasMany__Group__0__Impl_in_rule__HasMany__Group__02429 = new BitSet(new long[]{0x0000000000800030L});
    public static final BitSet FOLLOW_rule__HasMany__Group__1_in_rule__HasMany__Group__02432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HAS_MANY_WORD_in_rule__HasMany__Group__0__Impl2459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HasMany__Group__1__Impl_in_rule__HasMany__Group__12488 = new BitSet(new long[]{0x0000000000800030L});
    public static final BitSet FOLLOW_rule__HasMany__Group__2_in_rule__HasMany__Group__12491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__HasMany__Group__1__Impl2520 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__HasMany__Group__2__Impl_in_rule__HasMany__Group__22553 = new BitSet(new long[]{0x0000000008801000L});
    public static final BitSet FOLLOW_rule__HasMany__Group__3_in_rule__HasMany__Group__22556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HasMany__NameAssignment_2_in_rule__HasMany__Group__2__Impl2583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HasMany__Group__3__Impl_in_rule__HasMany__Group__32613 = new BitSet(new long[]{0x0000000008801000L});
    public static final BitSet FOLLOW_rule__HasMany__Group__4_in_rule__HasMany__Group__32616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__HasMany__Group__3__Impl2645 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__HasMany__Group__4__Impl_in_rule__HasMany__Group__42678 = new BitSet(new long[]{0x0000000008801000L});
    public static final BitSet FOLLOW_rule__HasMany__Group__5_in_rule__HasMany__Group__42681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HasMany__OptionsAssignment_4_in_rule__HasMany__Group__4__Impl2708 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__HasMany__Group__5__Impl_in_rule__HasMany__Group__52739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_rule__HasMany__Group__5__Impl2767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HasAndBelongsToMany__Group__0__Impl_in_rule__HasAndBelongsToMany__Group__02810 = new BitSet(new long[]{0x0000000000800030L});
    public static final BitSet FOLLOW_rule__HasAndBelongsToMany__Group__1_in_rule__HasAndBelongsToMany__Group__02813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HAS_AND_BELONGS_TO_MANY_WORD_in_rule__HasAndBelongsToMany__Group__0__Impl2840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HasAndBelongsToMany__Group__1__Impl_in_rule__HasAndBelongsToMany__Group__12869 = new BitSet(new long[]{0x0000000000800030L});
    public static final BitSet FOLLOW_rule__HasAndBelongsToMany__Group__2_in_rule__HasAndBelongsToMany__Group__12872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__HasAndBelongsToMany__Group__1__Impl2901 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__HasAndBelongsToMany__Group__2__Impl_in_rule__HasAndBelongsToMany__Group__22934 = new BitSet(new long[]{0x0000000008800000L});
    public static final BitSet FOLLOW_rule__HasAndBelongsToMany__Group__3_in_rule__HasAndBelongsToMany__Group__22937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HasAndBelongsToMany__NameAssignment_2_in_rule__HasAndBelongsToMany__Group__2__Impl2964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HasAndBelongsToMany__Group__3__Impl_in_rule__HasAndBelongsToMany__Group__32994 = new BitSet(new long[]{0x0000000008800000L});
    public static final BitSet FOLLOW_rule__HasAndBelongsToMany__Group__4_in_rule__HasAndBelongsToMany__Group__32997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__HasAndBelongsToMany__Group__3__Impl3026 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__HasAndBelongsToMany__Group__4__Impl_in_rule__HasAndBelongsToMany__Group__43059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HasAndBelongsToMany__OptionsAssignment_4_in_rule__HasAndBelongsToMany__Group__4__Impl3086 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__BelongsTo__Group__0__Impl_in_rule__BelongsTo__Group__03127 = new BitSet(new long[]{0x0000000000800030L});
    public static final BitSet FOLLOW_rule__BelongsTo__Group__1_in_rule__BelongsTo__Group__03130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BELONGS_TO_WORD_in_rule__BelongsTo__Group__0__Impl3157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BelongsTo__Group__1__Impl_in_rule__BelongsTo__Group__13186 = new BitSet(new long[]{0x0000000000800030L});
    public static final BitSet FOLLOW_rule__BelongsTo__Group__2_in_rule__BelongsTo__Group__13189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__BelongsTo__Group__1__Impl3218 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__BelongsTo__Group__2__Impl_in_rule__BelongsTo__Group__23251 = new BitSet(new long[]{0x0000000008800000L});
    public static final BitSet FOLLOW_rule__BelongsTo__Group__3_in_rule__BelongsTo__Group__23254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BelongsTo__NameAssignment_2_in_rule__BelongsTo__Group__2__Impl3281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BelongsTo__Group__3__Impl_in_rule__BelongsTo__Group__33311 = new BitSet(new long[]{0x0000000008800000L});
    public static final BitSet FOLLOW_rule__BelongsTo__Group__4_in_rule__BelongsTo__Group__33314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__BelongsTo__Group__3__Impl3343 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__BelongsTo__Group__4__Impl_in_rule__BelongsTo__Group__43376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BelongsTo__OptionsAssignment_4_in_rule__BelongsTo__Group__4__Impl3403 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__HashKeyValue__Group__0__Impl_in_rule__HashKeyValue__Group__03444 = new BitSet(new long[]{0x0000000000800430L});
    public static final BitSet FOLLOW_rule__HashKeyValue__Group__1_in_rule__HashKeyValue__Group__03447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__HashKeyValue__Group__0__Impl3475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HashKeyValue__Group__1__Impl_in_rule__HashKeyValue__Group__13506 = new BitSet(new long[]{0x0000000000800430L});
    public static final BitSet FOLLOW_rule__HashKeyValue__Group__2_in_rule__HashKeyValue__Group__13509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__HashKeyValue__Group__1__Impl3538 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__HashKeyValue__Group__2__Impl_in_rule__HashKeyValue__Group__23571 = new BitSet(new long[]{0x00000000008004F0L});
    public static final BitSet FOLLOW_rule__HashKeyValue__Group__3_in_rule__HashKeyValue__Group__23574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HashKeyValue__Alternatives_2_in_rule__HashKeyValue__Group__2__Impl3601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HashKeyValue__Group__3__Impl_in_rule__HashKeyValue__Group__33631 = new BitSet(new long[]{0x00000000008004F0L});
    public static final BitSet FOLLOW_rule__HashKeyValue__Group__4_in_rule__HashKeyValue__Group__33634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__HashKeyValue__Group__3__Impl3663 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__HashKeyValue__Group__4__Impl_in_rule__HashKeyValue__Group__43696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HashKeyValue__ValueAssignment_4_in_rule__HashKeyValue__Group__4__Impl3723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HashKeyValue__Group_2_0__0__Impl_in_rule__HashKeyValue__Group_2_0__03763 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__HashKeyValue__Group_2_0__1_in_rule__HashKeyValue__Group_2_0__03766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HashKeyValue__KeyAssignment_2_0_0_in_rule__HashKeyValue__Group_2_0__0__Impl3793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HashKeyValue__Group_2_0__1__Impl_in_rule__HashKeyValue__Group_2_0__13823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__HashKeyValue__Group_2_0__1__Impl3851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HashKeyValue__Group_2_1__0__Impl_in_rule__HashKeyValue__Group_2_1__03886 = new BitSet(new long[]{0x0000000020800000L});
    public static final BitSet FOLLOW_rule__HashKeyValue__Group_2_1__1_in_rule__HashKeyValue__Group_2_1__03889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HashKeyValue__KeyAssignment_2_1_0_in_rule__HashKeyValue__Group_2_1__0__Impl3916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HashKeyValue__Group_2_1__1__Impl_in_rule__HashKeyValue__Group_2_1__13946 = new BitSet(new long[]{0x0000000020800000L});
    public static final BitSet FOLLOW_rule__HashKeyValue__Group_2_1__2_in_rule__HashKeyValue__Group_2_1__13949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__HashKeyValue__Group_2_1__1__Impl3978 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__HashKeyValue__Group_2_1__2__Impl_in_rule__HashKeyValue__Group_2_1__24011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__HashKeyValue__Group_2_1__2__Impl4039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__0__Impl_in_rule__Method__Group__04076 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__Method__Group__1_in_rule__Method__Group__04079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DEF_WORD_in_rule__Method__Group__0__Impl4106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__1__Impl_in_rule__Method__Group__14135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__NameAssignment_1_in_rule__Method__Group__1__Impl4162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodName__Group__0__Impl_in_rule__MethodName__Group__04196 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__MethodName__Group__1_in_rule__MethodName__Group__04199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MethodName__Group__0__Impl4226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodName__Group__1__Impl_in_rule__MethodName__Group__14255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodName__Alternatives_1_in_rule__MethodName__Group__1__Impl4282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespacedModuleName_in_rule__Class__NameAssignment_24322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespacedModuleName_in_rule__Class__SuperTypeAssignment_3_34353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassElement_in_rule__Class__ClassElementsAssignment_54384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HasMany__NameAlternatives_2_0_in_rule__HasMany__NameAssignment_24415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHashKeyValue_in_rule__HasMany__OptionsAssignment_44448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HasAndBelongsToMany__NameAlternatives_2_0_in_rule__HasAndBelongsToMany__NameAssignment_24479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHashKeyValue_in_rule__HasAndBelongsToMany__OptionsAssignment_44512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BelongsTo__NameAlternatives_2_0_in_rule__BelongsTo__NameAssignment_24543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHashKeyValue_in_rule__BelongsTo__OptionsAssignment_44576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__HashKeyValue__KeyAssignment_2_0_04607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HashKeyValue__KeyAlternatives_2_1_0_0_in_rule__HashKeyValue__KeyAssignment_2_1_04638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HashKeyValue__ValueAlternatives_4_0_in_rule__HashKeyValue__ValueAssignment_44671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodName_in_rule__Method__NameAssignment_14704 = new BitSet(new long[]{0x0000000000000002L});

}