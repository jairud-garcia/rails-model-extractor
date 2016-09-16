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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SYMBOL", "RULE_STRING", "RULE_CLASS_WORD", "RULE_END_WORD", "RULE_ID", "RULE_HAS_MANY_WORD", "RULE_HAS_AND_BELONGS_TO_MANY_WORD", "RULE_BELONGS_TO_WORD", "RULE_DEF_WORD", "RULE_MODULE_WORD", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_INT", "RULE_ANY_OTHER", "'?'", "'='", "' '", "'<'", "'::'", "','", "':'", "'=>'"
    };
    public static final int RULE_HAS_MANY_WORD=9;
    public static final int RULE_CLASS_WORD=6;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=15;
    public static final int T__19=19;
    public static final int RULE_HAS_AND_BELONGS_TO_MANY_WORD=10;
    public static final int EOF=-1;
    public static final int RULE_ID=8;
    public static final int RULE_WS=16;
    public static final int RULE_ANY_OTHER=18;
    public static final int RULE_MODULE_WORD=13;
    public static final int T__26=26;
    public static final int RULE_INT=17;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=14;
    public static final int T__23=23;
    public static final int RULE_SYMBOL=4;
    public static final int RULE_DEF_WORD=12;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_END_WORD=7;
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


    // $ANTLR start "entryRuleClassElement"
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:116:1: entryRuleClassElement : ruleClassElement EOF ;
    public final void entryRuleClassElement() throws RecognitionException {
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:117:1: ( ruleClassElement EOF )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:118:1: ruleClassElement EOF
            {
             before(grammarAccess.getClassElementRule()); 
            pushFollow(FOLLOW_ruleClassElement_in_entryRuleClassElement181);
            ruleClassElement();

            state._fsp--;

             after(grammarAccess.getClassElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassElement188); 

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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:125:1: ruleClassElement : ( ( rule__ClassElement__Alternatives ) ) ;
    public final void ruleClassElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:129:2: ( ( ( rule__ClassElement__Alternatives ) ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:130:1: ( ( rule__ClassElement__Alternatives ) )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:130:1: ( ( rule__ClassElement__Alternatives ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:131:1: ( rule__ClassElement__Alternatives )
            {
             before(grammarAccess.getClassElementAccess().getAlternatives()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:132:1: ( rule__ClassElement__Alternatives )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:132:2: rule__ClassElement__Alternatives
            {
            pushFollow(FOLLOW_rule__ClassElement__Alternatives_in_ruleClassElement214);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:144:1: entryRuleRelationship : ruleRelationship EOF ;
    public final void entryRuleRelationship() throws RecognitionException {
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:145:1: ( ruleRelationship EOF )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:146:1: ruleRelationship EOF
            {
             before(grammarAccess.getRelationshipRule()); 
            pushFollow(FOLLOW_ruleRelationship_in_entryRuleRelationship241);
            ruleRelationship();

            state._fsp--;

             after(grammarAccess.getRelationshipRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationship248); 

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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:153:1: ruleRelationship : ( ( rule__Relationship__Alternatives ) ) ;
    public final void ruleRelationship() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:157:2: ( ( ( rule__Relationship__Alternatives ) ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:158:1: ( ( rule__Relationship__Alternatives ) )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:158:1: ( ( rule__Relationship__Alternatives ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:159:1: ( rule__Relationship__Alternatives )
            {
             before(grammarAccess.getRelationshipAccess().getAlternatives()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:160:1: ( rule__Relationship__Alternatives )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:160:2: rule__Relationship__Alternatives
            {
            pushFollow(FOLLOW_rule__Relationship__Alternatives_in_ruleRelationship274);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:172:1: entryRuleHasMany : ruleHasMany EOF ;
    public final void entryRuleHasMany() throws RecognitionException {
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:173:1: ( ruleHasMany EOF )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:174:1: ruleHasMany EOF
            {
             before(grammarAccess.getHasManyRule()); 
            pushFollow(FOLLOW_ruleHasMany_in_entryRuleHasMany301);
            ruleHasMany();

            state._fsp--;

             after(grammarAccess.getHasManyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHasMany308); 

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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:181:1: ruleHasMany : ( ( rule__HasMany__Group__0 ) ) ;
    public final void ruleHasMany() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:185:2: ( ( ( rule__HasMany__Group__0 ) ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:186:1: ( ( rule__HasMany__Group__0 ) )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:186:1: ( ( rule__HasMany__Group__0 ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:187:1: ( rule__HasMany__Group__0 )
            {
             before(grammarAccess.getHasManyAccess().getGroup()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:188:1: ( rule__HasMany__Group__0 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:188:2: rule__HasMany__Group__0
            {
            pushFollow(FOLLOW_rule__HasMany__Group__0_in_ruleHasMany334);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:200:1: entryRuleHasAndBelongsToMany : ruleHasAndBelongsToMany EOF ;
    public final void entryRuleHasAndBelongsToMany() throws RecognitionException {
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:201:1: ( ruleHasAndBelongsToMany EOF )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:202:1: ruleHasAndBelongsToMany EOF
            {
             before(grammarAccess.getHasAndBelongsToManyRule()); 
            pushFollow(FOLLOW_ruleHasAndBelongsToMany_in_entryRuleHasAndBelongsToMany361);
            ruleHasAndBelongsToMany();

            state._fsp--;

             after(grammarAccess.getHasAndBelongsToManyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHasAndBelongsToMany368); 

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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:209:1: ruleHasAndBelongsToMany : ( ( rule__HasAndBelongsToMany__Group__0 ) ) ;
    public final void ruleHasAndBelongsToMany() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:213:2: ( ( ( rule__HasAndBelongsToMany__Group__0 ) ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:214:1: ( ( rule__HasAndBelongsToMany__Group__0 ) )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:214:1: ( ( rule__HasAndBelongsToMany__Group__0 ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:215:1: ( rule__HasAndBelongsToMany__Group__0 )
            {
             before(grammarAccess.getHasAndBelongsToManyAccess().getGroup()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:216:1: ( rule__HasAndBelongsToMany__Group__0 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:216:2: rule__HasAndBelongsToMany__Group__0
            {
            pushFollow(FOLLOW_rule__HasAndBelongsToMany__Group__0_in_ruleHasAndBelongsToMany394);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:228:1: entryRuleBelongsTo : ruleBelongsTo EOF ;
    public final void entryRuleBelongsTo() throws RecognitionException {
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:229:1: ( ruleBelongsTo EOF )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:230:1: ruleBelongsTo EOF
            {
             before(grammarAccess.getBelongsToRule()); 
            pushFollow(FOLLOW_ruleBelongsTo_in_entryRuleBelongsTo421);
            ruleBelongsTo();

            state._fsp--;

             after(grammarAccess.getBelongsToRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBelongsTo428); 

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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:237:1: ruleBelongsTo : ( ( rule__BelongsTo__Group__0 ) ) ;
    public final void ruleBelongsTo() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:241:2: ( ( ( rule__BelongsTo__Group__0 ) ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:242:1: ( ( rule__BelongsTo__Group__0 ) )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:242:1: ( ( rule__BelongsTo__Group__0 ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:243:1: ( rule__BelongsTo__Group__0 )
            {
             before(grammarAccess.getBelongsToAccess().getGroup()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:244:1: ( rule__BelongsTo__Group__0 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:244:2: rule__BelongsTo__Group__0
            {
            pushFollow(FOLLOW_rule__BelongsTo__Group__0_in_ruleBelongsTo454);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:256:1: entryRuleHashKeyValue : ruleHashKeyValue EOF ;
    public final void entryRuleHashKeyValue() throws RecognitionException {
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:257:1: ( ruleHashKeyValue EOF )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:258:1: ruleHashKeyValue EOF
            {
             before(grammarAccess.getHashKeyValueRule()); 
            pushFollow(FOLLOW_ruleHashKeyValue_in_entryRuleHashKeyValue481);
            ruleHashKeyValue();

            state._fsp--;

             after(grammarAccess.getHashKeyValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHashKeyValue488); 

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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:265:1: ruleHashKeyValue : ( ( rule__HashKeyValue__Group__0 ) ) ;
    public final void ruleHashKeyValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:269:2: ( ( ( rule__HashKeyValue__Group__0 ) ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:270:1: ( ( rule__HashKeyValue__Group__0 ) )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:270:1: ( ( rule__HashKeyValue__Group__0 ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:271:1: ( rule__HashKeyValue__Group__0 )
            {
             before(grammarAccess.getHashKeyValueAccess().getGroup()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:272:1: ( rule__HashKeyValue__Group__0 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:272:2: rule__HashKeyValue__Group__0
            {
            pushFollow(FOLLOW_rule__HashKeyValue__Group__0_in_ruleHashKeyValue514);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:284:1: entryRuleMethod : ruleMethod EOF ;
    public final void entryRuleMethod() throws RecognitionException {
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:285:1: ( ruleMethod EOF )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:286:1: ruleMethod EOF
            {
             before(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_ruleMethod_in_entryRuleMethod541);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getMethodRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethod548); 

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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:293:1: ruleMethod : ( ( rule__Method__Group__0 ) ) ;
    public final void ruleMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:297:2: ( ( ( rule__Method__Group__0 ) ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:298:1: ( ( rule__Method__Group__0 ) )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:298:1: ( ( rule__Method__Group__0 ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:299:1: ( rule__Method__Group__0 )
            {
             before(grammarAccess.getMethodAccess().getGroup()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:300:1: ( rule__Method__Group__0 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:300:2: rule__Method__Group__0
            {
            pushFollow(FOLLOW_rule__Method__Group__0_in_ruleMethod574);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:312:1: entryRuleMethodName : ruleMethodName EOF ;
    public final void entryRuleMethodName() throws RecognitionException {
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:313:1: ( ruleMethodName EOF )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:314:1: ruleMethodName EOF
            {
             before(grammarAccess.getMethodNameRule()); 
            pushFollow(FOLLOW_ruleMethodName_in_entryRuleMethodName601);
            ruleMethodName();

            state._fsp--;

             after(grammarAccess.getMethodNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodName608); 

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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:321:1: ruleMethodName : ( ( rule__MethodName__Group__0 ) ) ;
    public final void ruleMethodName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:325:2: ( ( ( rule__MethodName__Group__0 ) ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:326:1: ( ( rule__MethodName__Group__0 ) )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:326:1: ( ( rule__MethodName__Group__0 ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:327:1: ( rule__MethodName__Group__0 )
            {
             before(grammarAccess.getMethodNameAccess().getGroup()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:328:1: ( rule__MethodName__Group__0 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:328:2: rule__MethodName__Group__0
            {
            pushFollow(FOLLOW_rule__MethodName__Group__0_in_ruleMethodName634);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:340:1: rule__ClassElement__Alternatives : ( ( ruleMethod ) | ( ruleRelationship ) );
    public final void rule__ClassElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:344:1: ( ( ruleMethod ) | ( ruleRelationship ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_DEF_WORD) ) {
                alt1=1;
            }
            else if ( ((LA1_0>=RULE_HAS_MANY_WORD && LA1_0<=RULE_BELONGS_TO_WORD)) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:345:1: ( ruleMethod )
                    {
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:345:1: ( ruleMethod )
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:346:1: ruleMethod
                    {
                     before(grammarAccess.getClassElementAccess().getMethodParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleMethod_in_rule__ClassElement__Alternatives670);
                    ruleMethod();

                    state._fsp--;

                     after(grammarAccess.getClassElementAccess().getMethodParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:351:6: ( ruleRelationship )
                    {
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:351:6: ( ruleRelationship )
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:352:1: ruleRelationship
                    {
                     before(grammarAccess.getClassElementAccess().getRelationshipParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleRelationship_in_rule__ClassElement__Alternatives687);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:362:1: rule__Relationship__Alternatives : ( ( ruleHasMany ) | ( ruleHasAndBelongsToMany ) | ( ruleBelongsTo ) );
    public final void rule__Relationship__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:366:1: ( ( ruleHasMany ) | ( ruleHasAndBelongsToMany ) | ( ruleBelongsTo ) )
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
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:367:1: ( ruleHasMany )
                    {
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:367:1: ( ruleHasMany )
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:368:1: ruleHasMany
                    {
                     before(grammarAccess.getRelationshipAccess().getHasManyParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleHasMany_in_rule__Relationship__Alternatives719);
                    ruleHasMany();

                    state._fsp--;

                     after(grammarAccess.getRelationshipAccess().getHasManyParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:373:6: ( ruleHasAndBelongsToMany )
                    {
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:373:6: ( ruleHasAndBelongsToMany )
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:374:1: ruleHasAndBelongsToMany
                    {
                     before(grammarAccess.getRelationshipAccess().getHasAndBelongsToManyParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleHasAndBelongsToMany_in_rule__Relationship__Alternatives736);
                    ruleHasAndBelongsToMany();

                    state._fsp--;

                     after(grammarAccess.getRelationshipAccess().getHasAndBelongsToManyParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:379:6: ( ruleBelongsTo )
                    {
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:379:6: ( ruleBelongsTo )
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:380:1: ruleBelongsTo
                    {
                     before(grammarAccess.getRelationshipAccess().getBelongsToParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleBelongsTo_in_rule__Relationship__Alternatives753);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:390:1: rule__HasMany__NameAlternatives_2_0 : ( ( RULE_SYMBOL ) | ( RULE_STRING ) );
    public final void rule__HasMany__NameAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:394:1: ( ( RULE_SYMBOL ) | ( RULE_STRING ) )
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
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:395:1: ( RULE_SYMBOL )
                    {
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:395:1: ( RULE_SYMBOL )
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:396:1: RULE_SYMBOL
                    {
                     before(grammarAccess.getHasManyAccess().getNameSYMBOLTerminalRuleCall_2_0_0()); 
                    match(input,RULE_SYMBOL,FOLLOW_RULE_SYMBOL_in_rule__HasMany__NameAlternatives_2_0785); 
                     after(grammarAccess.getHasManyAccess().getNameSYMBOLTerminalRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:401:6: ( RULE_STRING )
                    {
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:401:6: ( RULE_STRING )
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:402:1: RULE_STRING
                    {
                     before(grammarAccess.getHasManyAccess().getNameSTRINGTerminalRuleCall_2_0_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__HasMany__NameAlternatives_2_0802); 
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:412:1: rule__HasAndBelongsToMany__NameAlternatives_2_0 : ( ( RULE_SYMBOL ) | ( RULE_STRING ) );
    public final void rule__HasAndBelongsToMany__NameAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:416:1: ( ( RULE_SYMBOL ) | ( RULE_STRING ) )
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
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:417:1: ( RULE_SYMBOL )
                    {
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:417:1: ( RULE_SYMBOL )
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:418:1: RULE_SYMBOL
                    {
                     before(grammarAccess.getHasAndBelongsToManyAccess().getNameSYMBOLTerminalRuleCall_2_0_0()); 
                    match(input,RULE_SYMBOL,FOLLOW_RULE_SYMBOL_in_rule__HasAndBelongsToMany__NameAlternatives_2_0834); 
                     after(grammarAccess.getHasAndBelongsToManyAccess().getNameSYMBOLTerminalRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:423:6: ( RULE_STRING )
                    {
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:423:6: ( RULE_STRING )
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:424:1: RULE_STRING
                    {
                     before(grammarAccess.getHasAndBelongsToManyAccess().getNameSTRINGTerminalRuleCall_2_0_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__HasAndBelongsToMany__NameAlternatives_2_0851); 
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:434:1: rule__BelongsTo__NameAlternatives_2_0 : ( ( RULE_SYMBOL ) | ( RULE_STRING ) );
    public final void rule__BelongsTo__NameAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:438:1: ( ( RULE_SYMBOL ) | ( RULE_STRING ) )
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
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:439:1: ( RULE_SYMBOL )
                    {
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:439:1: ( RULE_SYMBOL )
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:440:1: RULE_SYMBOL
                    {
                     before(grammarAccess.getBelongsToAccess().getNameSYMBOLTerminalRuleCall_2_0_0()); 
                    match(input,RULE_SYMBOL,FOLLOW_RULE_SYMBOL_in_rule__BelongsTo__NameAlternatives_2_0883); 
                     after(grammarAccess.getBelongsToAccess().getNameSYMBOLTerminalRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:445:6: ( RULE_STRING )
                    {
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:445:6: ( RULE_STRING )
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:446:1: RULE_STRING
                    {
                     before(grammarAccess.getBelongsToAccess().getNameSTRINGTerminalRuleCall_2_0_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__BelongsTo__NameAlternatives_2_0900); 
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:456:1: rule__HashKeyValue__Alternatives_2 : ( ( ( rule__HashKeyValue__Group_2_0__0 ) ) | ( ( rule__HashKeyValue__Group_2_1__0 ) ) );
    public final void rule__HashKeyValue__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:460:1: ( ( ( rule__HashKeyValue__Group_2_0__0 ) ) | ( ( rule__HashKeyValue__Group_2_1__0 ) ) )
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
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:461:1: ( ( rule__HashKeyValue__Group_2_0__0 ) )
                    {
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:461:1: ( ( rule__HashKeyValue__Group_2_0__0 ) )
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:462:1: ( rule__HashKeyValue__Group_2_0__0 )
                    {
                     before(grammarAccess.getHashKeyValueAccess().getGroup_2_0()); 
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:463:1: ( rule__HashKeyValue__Group_2_0__0 )
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:463:2: rule__HashKeyValue__Group_2_0__0
                    {
                    pushFollow(FOLLOW_rule__HashKeyValue__Group_2_0__0_in_rule__HashKeyValue__Alternatives_2932);
                    rule__HashKeyValue__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getHashKeyValueAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:467:6: ( ( rule__HashKeyValue__Group_2_1__0 ) )
                    {
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:467:6: ( ( rule__HashKeyValue__Group_2_1__0 ) )
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:468:1: ( rule__HashKeyValue__Group_2_1__0 )
                    {
                     before(grammarAccess.getHashKeyValueAccess().getGroup_2_1()); 
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:469:1: ( rule__HashKeyValue__Group_2_1__0 )
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:469:2: rule__HashKeyValue__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__HashKeyValue__Group_2_1__0_in_rule__HashKeyValue__Alternatives_2950);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:478:1: rule__HashKeyValue__KeyAlternatives_2_1_0_0 : ( ( RULE_SYMBOL ) | ( RULE_STRING ) );
    public final void rule__HashKeyValue__KeyAlternatives_2_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:482:1: ( ( RULE_SYMBOL ) | ( RULE_STRING ) )
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
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:483:1: ( RULE_SYMBOL )
                    {
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:483:1: ( RULE_SYMBOL )
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:484:1: RULE_SYMBOL
                    {
                     before(grammarAccess.getHashKeyValueAccess().getKeySYMBOLTerminalRuleCall_2_1_0_0_0()); 
                    match(input,RULE_SYMBOL,FOLLOW_RULE_SYMBOL_in_rule__HashKeyValue__KeyAlternatives_2_1_0_0983); 
                     after(grammarAccess.getHashKeyValueAccess().getKeySYMBOLTerminalRuleCall_2_1_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:489:6: ( RULE_STRING )
                    {
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:489:6: ( RULE_STRING )
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:490:1: RULE_STRING
                    {
                     before(grammarAccess.getHashKeyValueAccess().getKeySTRINGTerminalRuleCall_2_1_0_0_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__HashKeyValue__KeyAlternatives_2_1_0_01000); 
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:500:1: rule__HashKeyValue__ValueAlternatives_4_0 : ( ( RULE_SYMBOL ) | ( RULE_STRING ) );
    public final void rule__HashKeyValue__ValueAlternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:504:1: ( ( RULE_SYMBOL ) | ( RULE_STRING ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_SYMBOL) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_STRING) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:505:1: ( RULE_SYMBOL )
                    {
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:505:1: ( RULE_SYMBOL )
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:506:1: RULE_SYMBOL
                    {
                     before(grammarAccess.getHashKeyValueAccess().getValueSYMBOLTerminalRuleCall_4_0_0()); 
                    match(input,RULE_SYMBOL,FOLLOW_RULE_SYMBOL_in_rule__HashKeyValue__ValueAlternatives_4_01032); 
                     after(grammarAccess.getHashKeyValueAccess().getValueSYMBOLTerminalRuleCall_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:511:6: ( RULE_STRING )
                    {
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:511:6: ( RULE_STRING )
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:512:1: RULE_STRING
                    {
                     before(grammarAccess.getHashKeyValueAccess().getValueSTRINGTerminalRuleCall_4_0_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__HashKeyValue__ValueAlternatives_4_01049); 
                     after(grammarAccess.getHashKeyValueAccess().getValueSTRINGTerminalRuleCall_4_0_1()); 

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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:522:1: rule__MethodName__Alternatives_1 : ( ( '?' ) | ( '=' ) );
    public final void rule__MethodName__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:526:1: ( ( '?' ) | ( '=' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            else if ( (LA9_0==20) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:527:1: ( '?' )
                    {
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:527:1: ( '?' )
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:528:1: '?'
                    {
                     before(grammarAccess.getMethodNameAccess().getQuestionMarkKeyword_1_0()); 
                    match(input,19,FOLLOW_19_in_rule__MethodName__Alternatives_11082); 
                     after(grammarAccess.getMethodNameAccess().getQuestionMarkKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:535:6: ( '=' )
                    {
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:535:6: ( '=' )
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:536:1: '='
                    {
                     before(grammarAccess.getMethodNameAccess().getEqualsSignKeyword_1_1()); 
                    match(input,20,FOLLOW_20_in_rule__MethodName__Alternatives_11102); 
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:550:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:554:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:555:2: rule__Class__Group__0__Impl rule__Class__Group__1
            {
            pushFollow(FOLLOW_rule__Class__Group__0__Impl_in_rule__Class__Group__01134);
            rule__Class__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__1_in_rule__Class__Group__01137);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:562:1: rule__Class__Group__0__Impl : ( RULE_CLASS_WORD ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:566:1: ( ( RULE_CLASS_WORD ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:567:1: ( RULE_CLASS_WORD )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:567:1: ( RULE_CLASS_WORD )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:568:1: RULE_CLASS_WORD
            {
             before(grammarAccess.getClassAccess().getCLASS_WORDTerminalRuleCall_0()); 
            match(input,RULE_CLASS_WORD,FOLLOW_RULE_CLASS_WORD_in_rule__Class__Group__0__Impl1164); 
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:579:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:583:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:584:2: rule__Class__Group__1__Impl rule__Class__Group__2
            {
            pushFollow(FOLLOW_rule__Class__Group__1__Impl_in_rule__Class__Group__11193);
            rule__Class__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__2_in_rule__Class__Group__11196);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:591:1: rule__Class__Group__1__Impl : ( ( ' ' )* ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:595:1: ( ( ( ' ' )* ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:596:1: ( ( ' ' )* )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:596:1: ( ( ' ' )* )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:597:1: ( ' ' )*
            {
             before(grammarAccess.getClassAccess().getSpaceKeyword_1()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:598:1: ( ' ' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==21) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:599:2: ' '
            	    {
            	    match(input,21,FOLLOW_21_in_rule__Class__Group__1__Impl1225); 

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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:610:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:614:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:615:2: rule__Class__Group__2__Impl rule__Class__Group__3
            {
            pushFollow(FOLLOW_rule__Class__Group__2__Impl_in_rule__Class__Group__21258);
            rule__Class__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__3_in_rule__Class__Group__21261);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:622:1: rule__Class__Group__2__Impl : ( ( rule__Class__NameAssignment_2 ) ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:626:1: ( ( ( rule__Class__NameAssignment_2 ) ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:627:1: ( ( rule__Class__NameAssignment_2 ) )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:627:1: ( ( rule__Class__NameAssignment_2 ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:628:1: ( rule__Class__NameAssignment_2 )
            {
             before(grammarAccess.getClassAccess().getNameAssignment_2()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:629:1: ( rule__Class__NameAssignment_2 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:629:2: rule__Class__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Class__NameAssignment_2_in_rule__Class__Group__2__Impl1288);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:639:1: rule__Class__Group__3 : rule__Class__Group__3__Impl rule__Class__Group__4 ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:643:1: ( rule__Class__Group__3__Impl rule__Class__Group__4 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:644:2: rule__Class__Group__3__Impl rule__Class__Group__4
            {
            pushFollow(FOLLOW_rule__Class__Group__3__Impl_in_rule__Class__Group__31318);
            rule__Class__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__4_in_rule__Class__Group__31321);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:651:1: rule__Class__Group__3__Impl : ( ( rule__Class__Group_3__0 )? ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:655:1: ( ( ( rule__Class__Group_3__0 )? ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:656:1: ( ( rule__Class__Group_3__0 )? )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:656:1: ( ( rule__Class__Group_3__0 )? )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:657:1: ( rule__Class__Group_3__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_3()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:658:1: ( rule__Class__Group_3__0 )?
            int alt11=2;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:658:2: rule__Class__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Class__Group_3__0_in_rule__Class__Group__3__Impl1348);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:668:1: rule__Class__Group__4 : rule__Class__Group__4__Impl rule__Class__Group__5 ;
    public final void rule__Class__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:672:1: ( rule__Class__Group__4__Impl rule__Class__Group__5 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:673:2: rule__Class__Group__4__Impl rule__Class__Group__5
            {
            pushFollow(FOLLOW_rule__Class__Group__4__Impl_in_rule__Class__Group__41379);
            rule__Class__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__5_in_rule__Class__Group__41382);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:680:1: rule__Class__Group__4__Impl : ( ( ' ' )* ) ;
    public final void rule__Class__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:684:1: ( ( ( ' ' )* ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:685:1: ( ( ' ' )* )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:685:1: ( ( ' ' )* )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:686:1: ( ' ' )*
            {
             before(grammarAccess.getClassAccess().getSpaceKeyword_4()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:687:1: ( ' ' )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==21) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:688:2: ' '
            	    {
            	    match(input,21,FOLLOW_21_in_rule__Class__Group__4__Impl1411); 

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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:699:1: rule__Class__Group__5 : rule__Class__Group__5__Impl rule__Class__Group__6 ;
    public final void rule__Class__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:703:1: ( rule__Class__Group__5__Impl rule__Class__Group__6 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:704:2: rule__Class__Group__5__Impl rule__Class__Group__6
            {
            pushFollow(FOLLOW_rule__Class__Group__5__Impl_in_rule__Class__Group__51444);
            rule__Class__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__6_in_rule__Class__Group__51447);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:711:1: rule__Class__Group__5__Impl : ( ( rule__Class__ClassElementsAssignment_5 )* ) ;
    public final void rule__Class__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:715:1: ( ( ( rule__Class__ClassElementsAssignment_5 )* ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:716:1: ( ( rule__Class__ClassElementsAssignment_5 )* )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:716:1: ( ( rule__Class__ClassElementsAssignment_5 )* )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:717:1: ( rule__Class__ClassElementsAssignment_5 )*
            {
             before(grammarAccess.getClassAccess().getClassElementsAssignment_5()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:718:1: ( rule__Class__ClassElementsAssignment_5 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RULE_HAS_MANY_WORD && LA13_0<=RULE_DEF_WORD)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:718:2: rule__Class__ClassElementsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Class__ClassElementsAssignment_5_in_rule__Class__Group__5__Impl1474);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:728:1: rule__Class__Group__6 : rule__Class__Group__6__Impl ;
    public final void rule__Class__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:732:1: ( rule__Class__Group__6__Impl )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:733:2: rule__Class__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Class__Group__6__Impl_in_rule__Class__Group__61505);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:739:1: rule__Class__Group__6__Impl : ( RULE_END_WORD ) ;
    public final void rule__Class__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:743:1: ( ( RULE_END_WORD ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:744:1: ( RULE_END_WORD )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:744:1: ( RULE_END_WORD )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:745:1: RULE_END_WORD
            {
             before(grammarAccess.getClassAccess().getEND_WORDTerminalRuleCall_6()); 
            match(input,RULE_END_WORD,FOLLOW_RULE_END_WORD_in_rule__Class__Group__6__Impl1532); 
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:770:1: rule__Class__Group_3__0 : rule__Class__Group_3__0__Impl rule__Class__Group_3__1 ;
    public final void rule__Class__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:774:1: ( rule__Class__Group_3__0__Impl rule__Class__Group_3__1 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:775:2: rule__Class__Group_3__0__Impl rule__Class__Group_3__1
            {
            pushFollow(FOLLOW_rule__Class__Group_3__0__Impl_in_rule__Class__Group_3__01575);
            rule__Class__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group_3__1_in_rule__Class__Group_3__01578);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:782:1: rule__Class__Group_3__0__Impl : ( ( ' ' )* ) ;
    public final void rule__Class__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:786:1: ( ( ( ' ' )* ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:787:1: ( ( ' ' )* )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:787:1: ( ( ' ' )* )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:788:1: ( ' ' )*
            {
             before(grammarAccess.getClassAccess().getSpaceKeyword_3_0()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:789:1: ( ' ' )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==21) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:790:2: ' '
            	    {
            	    match(input,21,FOLLOW_21_in_rule__Class__Group_3__0__Impl1607); 

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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:801:1: rule__Class__Group_3__1 : rule__Class__Group_3__1__Impl rule__Class__Group_3__2 ;
    public final void rule__Class__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:805:1: ( rule__Class__Group_3__1__Impl rule__Class__Group_3__2 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:806:2: rule__Class__Group_3__1__Impl rule__Class__Group_3__2
            {
            pushFollow(FOLLOW_rule__Class__Group_3__1__Impl_in_rule__Class__Group_3__11640);
            rule__Class__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group_3__2_in_rule__Class__Group_3__11643);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:813:1: rule__Class__Group_3__1__Impl : ( '<' ) ;
    public final void rule__Class__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:817:1: ( ( '<' ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:818:1: ( '<' )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:818:1: ( '<' )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:819:1: '<'
            {
             before(grammarAccess.getClassAccess().getLessThanSignKeyword_3_1()); 
            match(input,22,FOLLOW_22_in_rule__Class__Group_3__1__Impl1671); 
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:832:1: rule__Class__Group_3__2 : rule__Class__Group_3__2__Impl rule__Class__Group_3__3 ;
    public final void rule__Class__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:836:1: ( rule__Class__Group_3__2__Impl rule__Class__Group_3__3 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:837:2: rule__Class__Group_3__2__Impl rule__Class__Group_3__3
            {
            pushFollow(FOLLOW_rule__Class__Group_3__2__Impl_in_rule__Class__Group_3__21702);
            rule__Class__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group_3__3_in_rule__Class__Group_3__21705);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:844:1: rule__Class__Group_3__2__Impl : ( ( ' ' )* ) ;
    public final void rule__Class__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:848:1: ( ( ( ' ' )* ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:849:1: ( ( ' ' )* )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:849:1: ( ( ' ' )* )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:850:1: ( ' ' )*
            {
             before(grammarAccess.getClassAccess().getSpaceKeyword_3_2()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:851:1: ( ' ' )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==21) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:852:2: ' '
            	    {
            	    match(input,21,FOLLOW_21_in_rule__Class__Group_3__2__Impl1734); 

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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:863:1: rule__Class__Group_3__3 : rule__Class__Group_3__3__Impl ;
    public final void rule__Class__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:867:1: ( rule__Class__Group_3__3__Impl )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:868:2: rule__Class__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__Class__Group_3__3__Impl_in_rule__Class__Group_3__31767);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:874:1: rule__Class__Group_3__3__Impl : ( ( rule__Class__SuperTypeAssignment_3_3 ) ) ;
    public final void rule__Class__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:878:1: ( ( ( rule__Class__SuperTypeAssignment_3_3 ) ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:879:1: ( ( rule__Class__SuperTypeAssignment_3_3 ) )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:879:1: ( ( rule__Class__SuperTypeAssignment_3_3 ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:880:1: ( rule__Class__SuperTypeAssignment_3_3 )
            {
             before(grammarAccess.getClassAccess().getSuperTypeAssignment_3_3()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:881:1: ( rule__Class__SuperTypeAssignment_3_3 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:881:2: rule__Class__SuperTypeAssignment_3_3
            {
            pushFollow(FOLLOW_rule__Class__SuperTypeAssignment_3_3_in_rule__Class__Group_3__3__Impl1794);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:899:1: rule__NamespacedModuleName__Group__0 : rule__NamespacedModuleName__Group__0__Impl rule__NamespacedModuleName__Group__1 ;
    public final void rule__NamespacedModuleName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:903:1: ( rule__NamespacedModuleName__Group__0__Impl rule__NamespacedModuleName__Group__1 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:904:2: rule__NamespacedModuleName__Group__0__Impl rule__NamespacedModuleName__Group__1
            {
            pushFollow(FOLLOW_rule__NamespacedModuleName__Group__0__Impl_in_rule__NamespacedModuleName__Group__01832);
            rule__NamespacedModuleName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamespacedModuleName__Group__1_in_rule__NamespacedModuleName__Group__01835);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:911:1: rule__NamespacedModuleName__Group__0__Impl : ( ( rule__NamespacedModuleName__Group_0__0 )* ) ;
    public final void rule__NamespacedModuleName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:915:1: ( ( ( rule__NamespacedModuleName__Group_0__0 )* ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:916:1: ( ( rule__NamespacedModuleName__Group_0__0 )* )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:916:1: ( ( rule__NamespacedModuleName__Group_0__0 )* )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:917:1: ( rule__NamespacedModuleName__Group_0__0 )*
            {
             before(grammarAccess.getNamespacedModuleNameAccess().getGroup_0()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:918:1: ( rule__NamespacedModuleName__Group_0__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    int LA16_1 = input.LA(2);

                    if ( (LA16_1==23) ) {
                        alt16=1;
                    }


                }


                switch (alt16) {
            	case 1 :
            	    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:918:2: rule__NamespacedModuleName__Group_0__0
            	    {
            	    pushFollow(FOLLOW_rule__NamespacedModuleName__Group_0__0_in_rule__NamespacedModuleName__Group__0__Impl1862);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:928:1: rule__NamespacedModuleName__Group__1 : rule__NamespacedModuleName__Group__1__Impl ;
    public final void rule__NamespacedModuleName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:932:1: ( rule__NamespacedModuleName__Group__1__Impl )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:933:2: rule__NamespacedModuleName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NamespacedModuleName__Group__1__Impl_in_rule__NamespacedModuleName__Group__11893);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:939:1: rule__NamespacedModuleName__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__NamespacedModuleName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:943:1: ( ( RULE_ID ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:944:1: ( RULE_ID )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:944:1: ( RULE_ID )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:945:1: RULE_ID
            {
             before(grammarAccess.getNamespacedModuleNameAccess().getIDTerminalRuleCall_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NamespacedModuleName__Group__1__Impl1920); 
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:960:1: rule__NamespacedModuleName__Group_0__0 : rule__NamespacedModuleName__Group_0__0__Impl rule__NamespacedModuleName__Group_0__1 ;
    public final void rule__NamespacedModuleName__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:964:1: ( rule__NamespacedModuleName__Group_0__0__Impl rule__NamespacedModuleName__Group_0__1 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:965:2: rule__NamespacedModuleName__Group_0__0__Impl rule__NamespacedModuleName__Group_0__1
            {
            pushFollow(FOLLOW_rule__NamespacedModuleName__Group_0__0__Impl_in_rule__NamespacedModuleName__Group_0__01953);
            rule__NamespacedModuleName__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamespacedModuleName__Group_0__1_in_rule__NamespacedModuleName__Group_0__01956);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:972:1: rule__NamespacedModuleName__Group_0__0__Impl : ( RULE_ID ) ;
    public final void rule__NamespacedModuleName__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:976:1: ( ( RULE_ID ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:977:1: ( RULE_ID )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:977:1: ( RULE_ID )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:978:1: RULE_ID
            {
             before(grammarAccess.getNamespacedModuleNameAccess().getIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NamespacedModuleName__Group_0__0__Impl1983); 
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:989:1: rule__NamespacedModuleName__Group_0__1 : rule__NamespacedModuleName__Group_0__1__Impl ;
    public final void rule__NamespacedModuleName__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:993:1: ( rule__NamespacedModuleName__Group_0__1__Impl )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:994:2: rule__NamespacedModuleName__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__NamespacedModuleName__Group_0__1__Impl_in_rule__NamespacedModuleName__Group_0__12012);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1000:1: rule__NamespacedModuleName__Group_0__1__Impl : ( '::' ) ;
    public final void rule__NamespacedModuleName__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1004:1: ( ( '::' ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1005:1: ( '::' )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1005:1: ( '::' )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1006:1: '::'
            {
             before(grammarAccess.getNamespacedModuleNameAccess().getColonColonKeyword_0_1()); 
            match(input,23,FOLLOW_23_in_rule__NamespacedModuleName__Group_0__1__Impl2040); 
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


    // $ANTLR start "rule__HasMany__Group__0"
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1023:1: rule__HasMany__Group__0 : rule__HasMany__Group__0__Impl rule__HasMany__Group__1 ;
    public final void rule__HasMany__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1027:1: ( rule__HasMany__Group__0__Impl rule__HasMany__Group__1 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1028:2: rule__HasMany__Group__0__Impl rule__HasMany__Group__1
            {
            pushFollow(FOLLOW_rule__HasMany__Group__0__Impl_in_rule__HasMany__Group__02075);
            rule__HasMany__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HasMany__Group__1_in_rule__HasMany__Group__02078);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1035:1: rule__HasMany__Group__0__Impl : ( RULE_HAS_MANY_WORD ) ;
    public final void rule__HasMany__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1039:1: ( ( RULE_HAS_MANY_WORD ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1040:1: ( RULE_HAS_MANY_WORD )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1040:1: ( RULE_HAS_MANY_WORD )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1041:1: RULE_HAS_MANY_WORD
            {
             before(grammarAccess.getHasManyAccess().getHAS_MANY_WORDTerminalRuleCall_0()); 
            match(input,RULE_HAS_MANY_WORD,FOLLOW_RULE_HAS_MANY_WORD_in_rule__HasMany__Group__0__Impl2105); 
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1052:1: rule__HasMany__Group__1 : rule__HasMany__Group__1__Impl rule__HasMany__Group__2 ;
    public final void rule__HasMany__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1056:1: ( rule__HasMany__Group__1__Impl rule__HasMany__Group__2 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1057:2: rule__HasMany__Group__1__Impl rule__HasMany__Group__2
            {
            pushFollow(FOLLOW_rule__HasMany__Group__1__Impl_in_rule__HasMany__Group__12134);
            rule__HasMany__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HasMany__Group__2_in_rule__HasMany__Group__12137);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1064:1: rule__HasMany__Group__1__Impl : ( ( ' ' )* ) ;
    public final void rule__HasMany__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1068:1: ( ( ( ' ' )* ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1069:1: ( ( ' ' )* )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1069:1: ( ( ' ' )* )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1070:1: ( ' ' )*
            {
             before(grammarAccess.getHasManyAccess().getSpaceKeyword_1()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1071:1: ( ' ' )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==21) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1072:2: ' '
            	    {
            	    match(input,21,FOLLOW_21_in_rule__HasMany__Group__1__Impl2166); 

            	    }
            	    break;

            	default :
            	    break loop17;
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1083:1: rule__HasMany__Group__2 : rule__HasMany__Group__2__Impl rule__HasMany__Group__3 ;
    public final void rule__HasMany__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1087:1: ( rule__HasMany__Group__2__Impl rule__HasMany__Group__3 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1088:2: rule__HasMany__Group__2__Impl rule__HasMany__Group__3
            {
            pushFollow(FOLLOW_rule__HasMany__Group__2__Impl_in_rule__HasMany__Group__22199);
            rule__HasMany__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HasMany__Group__3_in_rule__HasMany__Group__22202);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1095:1: rule__HasMany__Group__2__Impl : ( ( rule__HasMany__NameAssignment_2 ) ) ;
    public final void rule__HasMany__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1099:1: ( ( ( rule__HasMany__NameAssignment_2 ) ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1100:1: ( ( rule__HasMany__NameAssignment_2 ) )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1100:1: ( ( rule__HasMany__NameAssignment_2 ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1101:1: ( rule__HasMany__NameAssignment_2 )
            {
             before(grammarAccess.getHasManyAccess().getNameAssignment_2()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1102:1: ( rule__HasMany__NameAssignment_2 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1102:2: rule__HasMany__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__HasMany__NameAssignment_2_in_rule__HasMany__Group__2__Impl2229);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1112:1: rule__HasMany__Group__3 : rule__HasMany__Group__3__Impl rule__HasMany__Group__4 ;
    public final void rule__HasMany__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1116:1: ( rule__HasMany__Group__3__Impl rule__HasMany__Group__4 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1117:2: rule__HasMany__Group__3__Impl rule__HasMany__Group__4
            {
            pushFollow(FOLLOW_rule__HasMany__Group__3__Impl_in_rule__HasMany__Group__32259);
            rule__HasMany__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HasMany__Group__4_in_rule__HasMany__Group__32262);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1124:1: rule__HasMany__Group__3__Impl : ( ( ' ' )* ) ;
    public final void rule__HasMany__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1128:1: ( ( ( ' ' )* ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1129:1: ( ( ' ' )* )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1129:1: ( ( ' ' )* )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1130:1: ( ' ' )*
            {
             before(grammarAccess.getHasManyAccess().getSpaceKeyword_3()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1131:1: ( ' ' )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==21) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1132:2: ' '
            	    {
            	    match(input,21,FOLLOW_21_in_rule__HasMany__Group__3__Impl2291); 

            	    }
            	    break;

            	default :
            	    break loop18;
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1143:1: rule__HasMany__Group__4 : rule__HasMany__Group__4__Impl ;
    public final void rule__HasMany__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1147:1: ( rule__HasMany__Group__4__Impl )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1148:2: rule__HasMany__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__HasMany__Group__4__Impl_in_rule__HasMany__Group__42324);
            rule__HasMany__Group__4__Impl();

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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1154:1: rule__HasMany__Group__4__Impl : ( ( rule__HasMany__OptionsAssignment_4 )* ) ;
    public final void rule__HasMany__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1158:1: ( ( ( rule__HasMany__OptionsAssignment_4 )* ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1159:1: ( ( rule__HasMany__OptionsAssignment_4 )* )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1159:1: ( ( rule__HasMany__OptionsAssignment_4 )* )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1160:1: ( rule__HasMany__OptionsAssignment_4 )*
            {
             before(grammarAccess.getHasManyAccess().getOptionsAssignment_4()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1161:1: ( rule__HasMany__OptionsAssignment_4 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==24) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1161:2: rule__HasMany__OptionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__HasMany__OptionsAssignment_4_in_rule__HasMany__Group__4__Impl2351);
            	    rule__HasMany__OptionsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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


    // $ANTLR start "rule__HasAndBelongsToMany__Group__0"
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1181:1: rule__HasAndBelongsToMany__Group__0 : rule__HasAndBelongsToMany__Group__0__Impl rule__HasAndBelongsToMany__Group__1 ;
    public final void rule__HasAndBelongsToMany__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1185:1: ( rule__HasAndBelongsToMany__Group__0__Impl rule__HasAndBelongsToMany__Group__1 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1186:2: rule__HasAndBelongsToMany__Group__0__Impl rule__HasAndBelongsToMany__Group__1
            {
            pushFollow(FOLLOW_rule__HasAndBelongsToMany__Group__0__Impl_in_rule__HasAndBelongsToMany__Group__02392);
            rule__HasAndBelongsToMany__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HasAndBelongsToMany__Group__1_in_rule__HasAndBelongsToMany__Group__02395);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1193:1: rule__HasAndBelongsToMany__Group__0__Impl : ( RULE_HAS_AND_BELONGS_TO_MANY_WORD ) ;
    public final void rule__HasAndBelongsToMany__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1197:1: ( ( RULE_HAS_AND_BELONGS_TO_MANY_WORD ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1198:1: ( RULE_HAS_AND_BELONGS_TO_MANY_WORD )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1198:1: ( RULE_HAS_AND_BELONGS_TO_MANY_WORD )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1199:1: RULE_HAS_AND_BELONGS_TO_MANY_WORD
            {
             before(grammarAccess.getHasAndBelongsToManyAccess().getHAS_AND_BELONGS_TO_MANY_WORDTerminalRuleCall_0()); 
            match(input,RULE_HAS_AND_BELONGS_TO_MANY_WORD,FOLLOW_RULE_HAS_AND_BELONGS_TO_MANY_WORD_in_rule__HasAndBelongsToMany__Group__0__Impl2422); 
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1210:1: rule__HasAndBelongsToMany__Group__1 : rule__HasAndBelongsToMany__Group__1__Impl rule__HasAndBelongsToMany__Group__2 ;
    public final void rule__HasAndBelongsToMany__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1214:1: ( rule__HasAndBelongsToMany__Group__1__Impl rule__HasAndBelongsToMany__Group__2 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1215:2: rule__HasAndBelongsToMany__Group__1__Impl rule__HasAndBelongsToMany__Group__2
            {
            pushFollow(FOLLOW_rule__HasAndBelongsToMany__Group__1__Impl_in_rule__HasAndBelongsToMany__Group__12451);
            rule__HasAndBelongsToMany__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HasAndBelongsToMany__Group__2_in_rule__HasAndBelongsToMany__Group__12454);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1222:1: rule__HasAndBelongsToMany__Group__1__Impl : ( ( ' ' )* ) ;
    public final void rule__HasAndBelongsToMany__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1226:1: ( ( ( ' ' )* ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1227:1: ( ( ' ' )* )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1227:1: ( ( ' ' )* )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1228:1: ( ' ' )*
            {
             before(grammarAccess.getHasAndBelongsToManyAccess().getSpaceKeyword_1()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1229:1: ( ' ' )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==21) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1230:2: ' '
            	    {
            	    match(input,21,FOLLOW_21_in_rule__HasAndBelongsToMany__Group__1__Impl2483); 

            	    }
            	    break;

            	default :
            	    break loop20;
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1241:1: rule__HasAndBelongsToMany__Group__2 : rule__HasAndBelongsToMany__Group__2__Impl rule__HasAndBelongsToMany__Group__3 ;
    public final void rule__HasAndBelongsToMany__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1245:1: ( rule__HasAndBelongsToMany__Group__2__Impl rule__HasAndBelongsToMany__Group__3 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1246:2: rule__HasAndBelongsToMany__Group__2__Impl rule__HasAndBelongsToMany__Group__3
            {
            pushFollow(FOLLOW_rule__HasAndBelongsToMany__Group__2__Impl_in_rule__HasAndBelongsToMany__Group__22516);
            rule__HasAndBelongsToMany__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HasAndBelongsToMany__Group__3_in_rule__HasAndBelongsToMany__Group__22519);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1253:1: rule__HasAndBelongsToMany__Group__2__Impl : ( ( rule__HasAndBelongsToMany__NameAssignment_2 ) ) ;
    public final void rule__HasAndBelongsToMany__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1257:1: ( ( ( rule__HasAndBelongsToMany__NameAssignment_2 ) ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1258:1: ( ( rule__HasAndBelongsToMany__NameAssignment_2 ) )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1258:1: ( ( rule__HasAndBelongsToMany__NameAssignment_2 ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1259:1: ( rule__HasAndBelongsToMany__NameAssignment_2 )
            {
             before(grammarAccess.getHasAndBelongsToManyAccess().getNameAssignment_2()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1260:1: ( rule__HasAndBelongsToMany__NameAssignment_2 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1260:2: rule__HasAndBelongsToMany__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__HasAndBelongsToMany__NameAssignment_2_in_rule__HasAndBelongsToMany__Group__2__Impl2546);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1270:1: rule__HasAndBelongsToMany__Group__3 : rule__HasAndBelongsToMany__Group__3__Impl rule__HasAndBelongsToMany__Group__4 ;
    public final void rule__HasAndBelongsToMany__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1274:1: ( rule__HasAndBelongsToMany__Group__3__Impl rule__HasAndBelongsToMany__Group__4 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1275:2: rule__HasAndBelongsToMany__Group__3__Impl rule__HasAndBelongsToMany__Group__4
            {
            pushFollow(FOLLOW_rule__HasAndBelongsToMany__Group__3__Impl_in_rule__HasAndBelongsToMany__Group__32576);
            rule__HasAndBelongsToMany__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HasAndBelongsToMany__Group__4_in_rule__HasAndBelongsToMany__Group__32579);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1282:1: rule__HasAndBelongsToMany__Group__3__Impl : ( ( ' ' )* ) ;
    public final void rule__HasAndBelongsToMany__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1286:1: ( ( ( ' ' )* ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1287:1: ( ( ' ' )* )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1287:1: ( ( ' ' )* )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1288:1: ( ' ' )*
            {
             before(grammarAccess.getHasAndBelongsToManyAccess().getSpaceKeyword_3()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1289:1: ( ' ' )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==21) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1290:2: ' '
            	    {
            	    match(input,21,FOLLOW_21_in_rule__HasAndBelongsToMany__Group__3__Impl2608); 

            	    }
            	    break;

            	default :
            	    break loop21;
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1301:1: rule__HasAndBelongsToMany__Group__4 : rule__HasAndBelongsToMany__Group__4__Impl ;
    public final void rule__HasAndBelongsToMany__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1305:1: ( rule__HasAndBelongsToMany__Group__4__Impl )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1306:2: rule__HasAndBelongsToMany__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__HasAndBelongsToMany__Group__4__Impl_in_rule__HasAndBelongsToMany__Group__42641);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1312:1: rule__HasAndBelongsToMany__Group__4__Impl : ( ( rule__HasAndBelongsToMany__OptionsAssignment_4 )* ) ;
    public final void rule__HasAndBelongsToMany__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1316:1: ( ( ( rule__HasAndBelongsToMany__OptionsAssignment_4 )* ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1317:1: ( ( rule__HasAndBelongsToMany__OptionsAssignment_4 )* )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1317:1: ( ( rule__HasAndBelongsToMany__OptionsAssignment_4 )* )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1318:1: ( rule__HasAndBelongsToMany__OptionsAssignment_4 )*
            {
             before(grammarAccess.getHasAndBelongsToManyAccess().getOptionsAssignment_4()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1319:1: ( rule__HasAndBelongsToMany__OptionsAssignment_4 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==24) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1319:2: rule__HasAndBelongsToMany__OptionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__HasAndBelongsToMany__OptionsAssignment_4_in_rule__HasAndBelongsToMany__Group__4__Impl2668);
            	    rule__HasAndBelongsToMany__OptionsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1339:1: rule__BelongsTo__Group__0 : rule__BelongsTo__Group__0__Impl rule__BelongsTo__Group__1 ;
    public final void rule__BelongsTo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1343:1: ( rule__BelongsTo__Group__0__Impl rule__BelongsTo__Group__1 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1344:2: rule__BelongsTo__Group__0__Impl rule__BelongsTo__Group__1
            {
            pushFollow(FOLLOW_rule__BelongsTo__Group__0__Impl_in_rule__BelongsTo__Group__02709);
            rule__BelongsTo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BelongsTo__Group__1_in_rule__BelongsTo__Group__02712);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1351:1: rule__BelongsTo__Group__0__Impl : ( RULE_BELONGS_TO_WORD ) ;
    public final void rule__BelongsTo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1355:1: ( ( RULE_BELONGS_TO_WORD ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1356:1: ( RULE_BELONGS_TO_WORD )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1356:1: ( RULE_BELONGS_TO_WORD )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1357:1: RULE_BELONGS_TO_WORD
            {
             before(grammarAccess.getBelongsToAccess().getBELONGS_TO_WORDTerminalRuleCall_0()); 
            match(input,RULE_BELONGS_TO_WORD,FOLLOW_RULE_BELONGS_TO_WORD_in_rule__BelongsTo__Group__0__Impl2739); 
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1368:1: rule__BelongsTo__Group__1 : rule__BelongsTo__Group__1__Impl rule__BelongsTo__Group__2 ;
    public final void rule__BelongsTo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1372:1: ( rule__BelongsTo__Group__1__Impl rule__BelongsTo__Group__2 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1373:2: rule__BelongsTo__Group__1__Impl rule__BelongsTo__Group__2
            {
            pushFollow(FOLLOW_rule__BelongsTo__Group__1__Impl_in_rule__BelongsTo__Group__12768);
            rule__BelongsTo__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BelongsTo__Group__2_in_rule__BelongsTo__Group__12771);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1380:1: rule__BelongsTo__Group__1__Impl : ( ( ' ' )* ) ;
    public final void rule__BelongsTo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1384:1: ( ( ( ' ' )* ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1385:1: ( ( ' ' )* )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1385:1: ( ( ' ' )* )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1386:1: ( ' ' )*
            {
             before(grammarAccess.getBelongsToAccess().getSpaceKeyword_1()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1387:1: ( ' ' )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==21) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1388:2: ' '
            	    {
            	    match(input,21,FOLLOW_21_in_rule__BelongsTo__Group__1__Impl2800); 

            	    }
            	    break;

            	default :
            	    break loop23;
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1399:1: rule__BelongsTo__Group__2 : rule__BelongsTo__Group__2__Impl rule__BelongsTo__Group__3 ;
    public final void rule__BelongsTo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1403:1: ( rule__BelongsTo__Group__2__Impl rule__BelongsTo__Group__3 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1404:2: rule__BelongsTo__Group__2__Impl rule__BelongsTo__Group__3
            {
            pushFollow(FOLLOW_rule__BelongsTo__Group__2__Impl_in_rule__BelongsTo__Group__22833);
            rule__BelongsTo__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BelongsTo__Group__3_in_rule__BelongsTo__Group__22836);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1411:1: rule__BelongsTo__Group__2__Impl : ( ( rule__BelongsTo__NameAssignment_2 ) ) ;
    public final void rule__BelongsTo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1415:1: ( ( ( rule__BelongsTo__NameAssignment_2 ) ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1416:1: ( ( rule__BelongsTo__NameAssignment_2 ) )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1416:1: ( ( rule__BelongsTo__NameAssignment_2 ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1417:1: ( rule__BelongsTo__NameAssignment_2 )
            {
             before(grammarAccess.getBelongsToAccess().getNameAssignment_2()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1418:1: ( rule__BelongsTo__NameAssignment_2 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1418:2: rule__BelongsTo__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__BelongsTo__NameAssignment_2_in_rule__BelongsTo__Group__2__Impl2863);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1428:1: rule__BelongsTo__Group__3 : rule__BelongsTo__Group__3__Impl rule__BelongsTo__Group__4 ;
    public final void rule__BelongsTo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1432:1: ( rule__BelongsTo__Group__3__Impl rule__BelongsTo__Group__4 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1433:2: rule__BelongsTo__Group__3__Impl rule__BelongsTo__Group__4
            {
            pushFollow(FOLLOW_rule__BelongsTo__Group__3__Impl_in_rule__BelongsTo__Group__32893);
            rule__BelongsTo__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BelongsTo__Group__4_in_rule__BelongsTo__Group__32896);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1440:1: rule__BelongsTo__Group__3__Impl : ( ( ' ' )* ) ;
    public final void rule__BelongsTo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1444:1: ( ( ( ' ' )* ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1445:1: ( ( ' ' )* )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1445:1: ( ( ' ' )* )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1446:1: ( ' ' )*
            {
             before(grammarAccess.getBelongsToAccess().getSpaceKeyword_3()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1447:1: ( ' ' )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==21) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1448:2: ' '
            	    {
            	    match(input,21,FOLLOW_21_in_rule__BelongsTo__Group__3__Impl2925); 

            	    }
            	    break;

            	default :
            	    break loop24;
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1459:1: rule__BelongsTo__Group__4 : rule__BelongsTo__Group__4__Impl ;
    public final void rule__BelongsTo__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1463:1: ( rule__BelongsTo__Group__4__Impl )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1464:2: rule__BelongsTo__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__BelongsTo__Group__4__Impl_in_rule__BelongsTo__Group__42958);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1470:1: rule__BelongsTo__Group__4__Impl : ( ( rule__BelongsTo__OptionsAssignment_4 )* ) ;
    public final void rule__BelongsTo__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1474:1: ( ( ( rule__BelongsTo__OptionsAssignment_4 )* ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1475:1: ( ( rule__BelongsTo__OptionsAssignment_4 )* )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1475:1: ( ( rule__BelongsTo__OptionsAssignment_4 )* )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1476:1: ( rule__BelongsTo__OptionsAssignment_4 )*
            {
             before(grammarAccess.getBelongsToAccess().getOptionsAssignment_4()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1477:1: ( rule__BelongsTo__OptionsAssignment_4 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==24) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1477:2: rule__BelongsTo__OptionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__BelongsTo__OptionsAssignment_4_in_rule__BelongsTo__Group__4__Impl2985);
            	    rule__BelongsTo__OptionsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1497:1: rule__HashKeyValue__Group__0 : rule__HashKeyValue__Group__0__Impl rule__HashKeyValue__Group__1 ;
    public final void rule__HashKeyValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1501:1: ( rule__HashKeyValue__Group__0__Impl rule__HashKeyValue__Group__1 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1502:2: rule__HashKeyValue__Group__0__Impl rule__HashKeyValue__Group__1
            {
            pushFollow(FOLLOW_rule__HashKeyValue__Group__0__Impl_in_rule__HashKeyValue__Group__03026);
            rule__HashKeyValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HashKeyValue__Group__1_in_rule__HashKeyValue__Group__03029);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1509:1: rule__HashKeyValue__Group__0__Impl : ( ',' ) ;
    public final void rule__HashKeyValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1513:1: ( ( ',' ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1514:1: ( ',' )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1514:1: ( ',' )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1515:1: ','
            {
             before(grammarAccess.getHashKeyValueAccess().getCommaKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__HashKeyValue__Group__0__Impl3057); 
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1528:1: rule__HashKeyValue__Group__1 : rule__HashKeyValue__Group__1__Impl rule__HashKeyValue__Group__2 ;
    public final void rule__HashKeyValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1532:1: ( rule__HashKeyValue__Group__1__Impl rule__HashKeyValue__Group__2 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1533:2: rule__HashKeyValue__Group__1__Impl rule__HashKeyValue__Group__2
            {
            pushFollow(FOLLOW_rule__HashKeyValue__Group__1__Impl_in_rule__HashKeyValue__Group__13088);
            rule__HashKeyValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HashKeyValue__Group__2_in_rule__HashKeyValue__Group__13091);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1540:1: rule__HashKeyValue__Group__1__Impl : ( ( ' ' )* ) ;
    public final void rule__HashKeyValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1544:1: ( ( ( ' ' )* ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1545:1: ( ( ' ' )* )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1545:1: ( ( ' ' )* )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1546:1: ( ' ' )*
            {
             before(grammarAccess.getHashKeyValueAccess().getSpaceKeyword_1()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1547:1: ( ' ' )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==21) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1548:2: ' '
            	    {
            	    match(input,21,FOLLOW_21_in_rule__HashKeyValue__Group__1__Impl3120); 

            	    }
            	    break;

            	default :
            	    break loop26;
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1559:1: rule__HashKeyValue__Group__2 : rule__HashKeyValue__Group__2__Impl rule__HashKeyValue__Group__3 ;
    public final void rule__HashKeyValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1563:1: ( rule__HashKeyValue__Group__2__Impl rule__HashKeyValue__Group__3 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1564:2: rule__HashKeyValue__Group__2__Impl rule__HashKeyValue__Group__3
            {
            pushFollow(FOLLOW_rule__HashKeyValue__Group__2__Impl_in_rule__HashKeyValue__Group__23153);
            rule__HashKeyValue__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HashKeyValue__Group__3_in_rule__HashKeyValue__Group__23156);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1571:1: rule__HashKeyValue__Group__2__Impl : ( ( rule__HashKeyValue__Alternatives_2 ) ) ;
    public final void rule__HashKeyValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1575:1: ( ( ( rule__HashKeyValue__Alternatives_2 ) ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1576:1: ( ( rule__HashKeyValue__Alternatives_2 ) )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1576:1: ( ( rule__HashKeyValue__Alternatives_2 ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1577:1: ( rule__HashKeyValue__Alternatives_2 )
            {
             before(grammarAccess.getHashKeyValueAccess().getAlternatives_2()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1578:1: ( rule__HashKeyValue__Alternatives_2 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1578:2: rule__HashKeyValue__Alternatives_2
            {
            pushFollow(FOLLOW_rule__HashKeyValue__Alternatives_2_in_rule__HashKeyValue__Group__2__Impl3183);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1588:1: rule__HashKeyValue__Group__3 : rule__HashKeyValue__Group__3__Impl rule__HashKeyValue__Group__4 ;
    public final void rule__HashKeyValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1592:1: ( rule__HashKeyValue__Group__3__Impl rule__HashKeyValue__Group__4 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1593:2: rule__HashKeyValue__Group__3__Impl rule__HashKeyValue__Group__4
            {
            pushFollow(FOLLOW_rule__HashKeyValue__Group__3__Impl_in_rule__HashKeyValue__Group__33213);
            rule__HashKeyValue__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HashKeyValue__Group__4_in_rule__HashKeyValue__Group__33216);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1600:1: rule__HashKeyValue__Group__3__Impl : ( ( ' ' )* ) ;
    public final void rule__HashKeyValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1604:1: ( ( ( ' ' )* ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1605:1: ( ( ' ' )* )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1605:1: ( ( ' ' )* )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1606:1: ( ' ' )*
            {
             before(grammarAccess.getHashKeyValueAccess().getSpaceKeyword_3()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1607:1: ( ' ' )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==21) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1608:2: ' '
            	    {
            	    match(input,21,FOLLOW_21_in_rule__HashKeyValue__Group__3__Impl3245); 

            	    }
            	    break;

            	default :
            	    break loop27;
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1619:1: rule__HashKeyValue__Group__4 : rule__HashKeyValue__Group__4__Impl ;
    public final void rule__HashKeyValue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1623:1: ( rule__HashKeyValue__Group__4__Impl )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1624:2: rule__HashKeyValue__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__HashKeyValue__Group__4__Impl_in_rule__HashKeyValue__Group__43278);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1630:1: rule__HashKeyValue__Group__4__Impl : ( ( rule__HashKeyValue__ValueAssignment_4 ) ) ;
    public final void rule__HashKeyValue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1634:1: ( ( ( rule__HashKeyValue__ValueAssignment_4 ) ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1635:1: ( ( rule__HashKeyValue__ValueAssignment_4 ) )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1635:1: ( ( rule__HashKeyValue__ValueAssignment_4 ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1636:1: ( rule__HashKeyValue__ValueAssignment_4 )
            {
             before(grammarAccess.getHashKeyValueAccess().getValueAssignment_4()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1637:1: ( rule__HashKeyValue__ValueAssignment_4 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1637:2: rule__HashKeyValue__ValueAssignment_4
            {
            pushFollow(FOLLOW_rule__HashKeyValue__ValueAssignment_4_in_rule__HashKeyValue__Group__4__Impl3305);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1657:1: rule__HashKeyValue__Group_2_0__0 : rule__HashKeyValue__Group_2_0__0__Impl rule__HashKeyValue__Group_2_0__1 ;
    public final void rule__HashKeyValue__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1661:1: ( rule__HashKeyValue__Group_2_0__0__Impl rule__HashKeyValue__Group_2_0__1 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1662:2: rule__HashKeyValue__Group_2_0__0__Impl rule__HashKeyValue__Group_2_0__1
            {
            pushFollow(FOLLOW_rule__HashKeyValue__Group_2_0__0__Impl_in_rule__HashKeyValue__Group_2_0__03345);
            rule__HashKeyValue__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HashKeyValue__Group_2_0__1_in_rule__HashKeyValue__Group_2_0__03348);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1669:1: rule__HashKeyValue__Group_2_0__0__Impl : ( ( rule__HashKeyValue__KeyAssignment_2_0_0 ) ) ;
    public final void rule__HashKeyValue__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1673:1: ( ( ( rule__HashKeyValue__KeyAssignment_2_0_0 ) ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1674:1: ( ( rule__HashKeyValue__KeyAssignment_2_0_0 ) )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1674:1: ( ( rule__HashKeyValue__KeyAssignment_2_0_0 ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1675:1: ( rule__HashKeyValue__KeyAssignment_2_0_0 )
            {
             before(grammarAccess.getHashKeyValueAccess().getKeyAssignment_2_0_0()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1676:1: ( rule__HashKeyValue__KeyAssignment_2_0_0 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1676:2: rule__HashKeyValue__KeyAssignment_2_0_0
            {
            pushFollow(FOLLOW_rule__HashKeyValue__KeyAssignment_2_0_0_in_rule__HashKeyValue__Group_2_0__0__Impl3375);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1686:1: rule__HashKeyValue__Group_2_0__1 : rule__HashKeyValue__Group_2_0__1__Impl ;
    public final void rule__HashKeyValue__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1690:1: ( rule__HashKeyValue__Group_2_0__1__Impl )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1691:2: rule__HashKeyValue__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_rule__HashKeyValue__Group_2_0__1__Impl_in_rule__HashKeyValue__Group_2_0__13405);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1697:1: rule__HashKeyValue__Group_2_0__1__Impl : ( ':' ) ;
    public final void rule__HashKeyValue__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1701:1: ( ( ':' ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1702:1: ( ':' )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1702:1: ( ':' )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1703:1: ':'
            {
             before(grammarAccess.getHashKeyValueAccess().getColonKeyword_2_0_1()); 
            match(input,25,FOLLOW_25_in_rule__HashKeyValue__Group_2_0__1__Impl3433); 
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1720:1: rule__HashKeyValue__Group_2_1__0 : rule__HashKeyValue__Group_2_1__0__Impl rule__HashKeyValue__Group_2_1__1 ;
    public final void rule__HashKeyValue__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1724:1: ( rule__HashKeyValue__Group_2_1__0__Impl rule__HashKeyValue__Group_2_1__1 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1725:2: rule__HashKeyValue__Group_2_1__0__Impl rule__HashKeyValue__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__HashKeyValue__Group_2_1__0__Impl_in_rule__HashKeyValue__Group_2_1__03468);
            rule__HashKeyValue__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HashKeyValue__Group_2_1__1_in_rule__HashKeyValue__Group_2_1__03471);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1732:1: rule__HashKeyValue__Group_2_1__0__Impl : ( ( rule__HashKeyValue__KeyAssignment_2_1_0 ) ) ;
    public final void rule__HashKeyValue__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1736:1: ( ( ( rule__HashKeyValue__KeyAssignment_2_1_0 ) ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1737:1: ( ( rule__HashKeyValue__KeyAssignment_2_1_0 ) )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1737:1: ( ( rule__HashKeyValue__KeyAssignment_2_1_0 ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1738:1: ( rule__HashKeyValue__KeyAssignment_2_1_0 )
            {
             before(grammarAccess.getHashKeyValueAccess().getKeyAssignment_2_1_0()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1739:1: ( rule__HashKeyValue__KeyAssignment_2_1_0 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1739:2: rule__HashKeyValue__KeyAssignment_2_1_0
            {
            pushFollow(FOLLOW_rule__HashKeyValue__KeyAssignment_2_1_0_in_rule__HashKeyValue__Group_2_1__0__Impl3498);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1749:1: rule__HashKeyValue__Group_2_1__1 : rule__HashKeyValue__Group_2_1__1__Impl rule__HashKeyValue__Group_2_1__2 ;
    public final void rule__HashKeyValue__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1753:1: ( rule__HashKeyValue__Group_2_1__1__Impl rule__HashKeyValue__Group_2_1__2 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1754:2: rule__HashKeyValue__Group_2_1__1__Impl rule__HashKeyValue__Group_2_1__2
            {
            pushFollow(FOLLOW_rule__HashKeyValue__Group_2_1__1__Impl_in_rule__HashKeyValue__Group_2_1__13528);
            rule__HashKeyValue__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HashKeyValue__Group_2_1__2_in_rule__HashKeyValue__Group_2_1__13531);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1761:1: rule__HashKeyValue__Group_2_1__1__Impl : ( ( ' ' )* ) ;
    public final void rule__HashKeyValue__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1765:1: ( ( ( ' ' )* ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1766:1: ( ( ' ' )* )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1766:1: ( ( ' ' )* )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1767:1: ( ' ' )*
            {
             before(grammarAccess.getHashKeyValueAccess().getSpaceKeyword_2_1_1()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1768:1: ( ' ' )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==21) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1769:2: ' '
            	    {
            	    match(input,21,FOLLOW_21_in_rule__HashKeyValue__Group_2_1__1__Impl3560); 

            	    }
            	    break;

            	default :
            	    break loop28;
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1780:1: rule__HashKeyValue__Group_2_1__2 : rule__HashKeyValue__Group_2_1__2__Impl ;
    public final void rule__HashKeyValue__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1784:1: ( rule__HashKeyValue__Group_2_1__2__Impl )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1785:2: rule__HashKeyValue__Group_2_1__2__Impl
            {
            pushFollow(FOLLOW_rule__HashKeyValue__Group_2_1__2__Impl_in_rule__HashKeyValue__Group_2_1__23593);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1791:1: rule__HashKeyValue__Group_2_1__2__Impl : ( '=>' ) ;
    public final void rule__HashKeyValue__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1795:1: ( ( '=>' ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1796:1: ( '=>' )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1796:1: ( '=>' )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1797:1: '=>'
            {
             before(grammarAccess.getHashKeyValueAccess().getEqualsSignGreaterThanSignKeyword_2_1_2()); 
            match(input,26,FOLLOW_26_in_rule__HashKeyValue__Group_2_1__2__Impl3621); 
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1816:1: rule__Method__Group__0 : rule__Method__Group__0__Impl rule__Method__Group__1 ;
    public final void rule__Method__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1820:1: ( rule__Method__Group__0__Impl rule__Method__Group__1 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1821:2: rule__Method__Group__0__Impl rule__Method__Group__1
            {
            pushFollow(FOLLOW_rule__Method__Group__0__Impl_in_rule__Method__Group__03658);
            rule__Method__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__1_in_rule__Method__Group__03661);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1828:1: rule__Method__Group__0__Impl : ( RULE_DEF_WORD ) ;
    public final void rule__Method__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1832:1: ( ( RULE_DEF_WORD ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1833:1: ( RULE_DEF_WORD )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1833:1: ( RULE_DEF_WORD )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1834:1: RULE_DEF_WORD
            {
             before(grammarAccess.getMethodAccess().getDEF_WORDTerminalRuleCall_0()); 
            match(input,RULE_DEF_WORD,FOLLOW_RULE_DEF_WORD_in_rule__Method__Group__0__Impl3688); 
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1845:1: rule__Method__Group__1 : rule__Method__Group__1__Impl ;
    public final void rule__Method__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1849:1: ( rule__Method__Group__1__Impl )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1850:2: rule__Method__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Method__Group__1__Impl_in_rule__Method__Group__13717);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1856:1: rule__Method__Group__1__Impl : ( ( rule__Method__NameAssignment_1 ) ) ;
    public final void rule__Method__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1860:1: ( ( ( rule__Method__NameAssignment_1 ) ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1861:1: ( ( rule__Method__NameAssignment_1 ) )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1861:1: ( ( rule__Method__NameAssignment_1 ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1862:1: ( rule__Method__NameAssignment_1 )
            {
             before(grammarAccess.getMethodAccess().getNameAssignment_1()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1863:1: ( rule__Method__NameAssignment_1 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1863:2: rule__Method__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Method__NameAssignment_1_in_rule__Method__Group__1__Impl3744);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1877:1: rule__MethodName__Group__0 : rule__MethodName__Group__0__Impl rule__MethodName__Group__1 ;
    public final void rule__MethodName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1881:1: ( rule__MethodName__Group__0__Impl rule__MethodName__Group__1 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1882:2: rule__MethodName__Group__0__Impl rule__MethodName__Group__1
            {
            pushFollow(FOLLOW_rule__MethodName__Group__0__Impl_in_rule__MethodName__Group__03778);
            rule__MethodName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MethodName__Group__1_in_rule__MethodName__Group__03781);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1889:1: rule__MethodName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__MethodName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1893:1: ( ( RULE_ID ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1894:1: ( RULE_ID )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1894:1: ( RULE_ID )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1895:1: RULE_ID
            {
             before(grammarAccess.getMethodNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MethodName__Group__0__Impl3808); 
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1906:1: rule__MethodName__Group__1 : rule__MethodName__Group__1__Impl ;
    public final void rule__MethodName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1910:1: ( rule__MethodName__Group__1__Impl )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1911:2: rule__MethodName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MethodName__Group__1__Impl_in_rule__MethodName__Group__13837);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1917:1: rule__MethodName__Group__1__Impl : ( ( rule__MethodName__Alternatives_1 )? ) ;
    public final void rule__MethodName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1921:1: ( ( ( rule__MethodName__Alternatives_1 )? ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1922:1: ( ( rule__MethodName__Alternatives_1 )? )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1922:1: ( ( rule__MethodName__Alternatives_1 )? )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1923:1: ( rule__MethodName__Alternatives_1 )?
            {
             before(grammarAccess.getMethodNameAccess().getAlternatives_1()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1924:1: ( rule__MethodName__Alternatives_1 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=19 && LA29_0<=20)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1924:2: rule__MethodName__Alternatives_1
                    {
                    pushFollow(FOLLOW_rule__MethodName__Alternatives_1_in_rule__MethodName__Group__1__Impl3864);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1939:1: rule__Class__NameAssignment_2 : ( ruleNamespacedModuleName ) ;
    public final void rule__Class__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1943:1: ( ( ruleNamespacedModuleName ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1944:1: ( ruleNamespacedModuleName )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1944:1: ( ruleNamespacedModuleName )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1945:1: ruleNamespacedModuleName
            {
             before(grammarAccess.getClassAccess().getNameNamespacedModuleNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleNamespacedModuleName_in_rule__Class__NameAssignment_23904);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1954:1: rule__Class__SuperTypeAssignment_3_3 : ( ruleNamespacedModuleName ) ;
    public final void rule__Class__SuperTypeAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1958:1: ( ( ruleNamespacedModuleName ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1959:1: ( ruleNamespacedModuleName )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1959:1: ( ruleNamespacedModuleName )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1960:1: ruleNamespacedModuleName
            {
             before(grammarAccess.getClassAccess().getSuperTypeNamespacedModuleNameParserRuleCall_3_3_0()); 
            pushFollow(FOLLOW_ruleNamespacedModuleName_in_rule__Class__SuperTypeAssignment_3_33935);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1969:1: rule__Class__ClassElementsAssignment_5 : ( ruleClassElement ) ;
    public final void rule__Class__ClassElementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1973:1: ( ( ruleClassElement ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1974:1: ( ruleClassElement )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1974:1: ( ruleClassElement )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1975:1: ruleClassElement
            {
             before(grammarAccess.getClassAccess().getClassElementsClassElementParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleClassElement_in_rule__Class__ClassElementsAssignment_53966);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1984:1: rule__HasMany__NameAssignment_2 : ( ( rule__HasMany__NameAlternatives_2_0 ) ) ;
    public final void rule__HasMany__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1988:1: ( ( ( rule__HasMany__NameAlternatives_2_0 ) ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1989:1: ( ( rule__HasMany__NameAlternatives_2_0 ) )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1989:1: ( ( rule__HasMany__NameAlternatives_2_0 ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1990:1: ( rule__HasMany__NameAlternatives_2_0 )
            {
             before(grammarAccess.getHasManyAccess().getNameAlternatives_2_0()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1991:1: ( rule__HasMany__NameAlternatives_2_0 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1991:2: rule__HasMany__NameAlternatives_2_0
            {
            pushFollow(FOLLOW_rule__HasMany__NameAlternatives_2_0_in_rule__HasMany__NameAssignment_23997);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2000:1: rule__HasMany__OptionsAssignment_4 : ( ruleHashKeyValue ) ;
    public final void rule__HasMany__OptionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2004:1: ( ( ruleHashKeyValue ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2005:1: ( ruleHashKeyValue )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2005:1: ( ruleHashKeyValue )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2006:1: ruleHashKeyValue
            {
             before(grammarAccess.getHasManyAccess().getOptionsHashKeyValueParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleHashKeyValue_in_rule__HasMany__OptionsAssignment_44030);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2015:1: rule__HasAndBelongsToMany__NameAssignment_2 : ( ( rule__HasAndBelongsToMany__NameAlternatives_2_0 ) ) ;
    public final void rule__HasAndBelongsToMany__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2019:1: ( ( ( rule__HasAndBelongsToMany__NameAlternatives_2_0 ) ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2020:1: ( ( rule__HasAndBelongsToMany__NameAlternatives_2_0 ) )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2020:1: ( ( rule__HasAndBelongsToMany__NameAlternatives_2_0 ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2021:1: ( rule__HasAndBelongsToMany__NameAlternatives_2_0 )
            {
             before(grammarAccess.getHasAndBelongsToManyAccess().getNameAlternatives_2_0()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2022:1: ( rule__HasAndBelongsToMany__NameAlternatives_2_0 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2022:2: rule__HasAndBelongsToMany__NameAlternatives_2_0
            {
            pushFollow(FOLLOW_rule__HasAndBelongsToMany__NameAlternatives_2_0_in_rule__HasAndBelongsToMany__NameAssignment_24061);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2031:1: rule__HasAndBelongsToMany__OptionsAssignment_4 : ( ruleHashKeyValue ) ;
    public final void rule__HasAndBelongsToMany__OptionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2035:1: ( ( ruleHashKeyValue ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2036:1: ( ruleHashKeyValue )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2036:1: ( ruleHashKeyValue )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2037:1: ruleHashKeyValue
            {
             before(grammarAccess.getHasAndBelongsToManyAccess().getOptionsHashKeyValueParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleHashKeyValue_in_rule__HasAndBelongsToMany__OptionsAssignment_44094);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2046:1: rule__BelongsTo__NameAssignment_2 : ( ( rule__BelongsTo__NameAlternatives_2_0 ) ) ;
    public final void rule__BelongsTo__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2050:1: ( ( ( rule__BelongsTo__NameAlternatives_2_0 ) ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2051:1: ( ( rule__BelongsTo__NameAlternatives_2_0 ) )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2051:1: ( ( rule__BelongsTo__NameAlternatives_2_0 ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2052:1: ( rule__BelongsTo__NameAlternatives_2_0 )
            {
             before(grammarAccess.getBelongsToAccess().getNameAlternatives_2_0()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2053:1: ( rule__BelongsTo__NameAlternatives_2_0 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2053:2: rule__BelongsTo__NameAlternatives_2_0
            {
            pushFollow(FOLLOW_rule__BelongsTo__NameAlternatives_2_0_in_rule__BelongsTo__NameAssignment_24125);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2062:1: rule__BelongsTo__OptionsAssignment_4 : ( ruleHashKeyValue ) ;
    public final void rule__BelongsTo__OptionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2066:1: ( ( ruleHashKeyValue ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2067:1: ( ruleHashKeyValue )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2067:1: ( ruleHashKeyValue )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2068:1: ruleHashKeyValue
            {
             before(grammarAccess.getBelongsToAccess().getOptionsHashKeyValueParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleHashKeyValue_in_rule__BelongsTo__OptionsAssignment_44158);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2077:1: rule__HashKeyValue__KeyAssignment_2_0_0 : ( RULE_ID ) ;
    public final void rule__HashKeyValue__KeyAssignment_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2081:1: ( ( RULE_ID ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2082:1: ( RULE_ID )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2082:1: ( RULE_ID )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2083:1: RULE_ID
            {
             before(grammarAccess.getHashKeyValueAccess().getKeyIDTerminalRuleCall_2_0_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__HashKeyValue__KeyAssignment_2_0_04189); 
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2092:1: rule__HashKeyValue__KeyAssignment_2_1_0 : ( ( rule__HashKeyValue__KeyAlternatives_2_1_0_0 ) ) ;
    public final void rule__HashKeyValue__KeyAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2096:1: ( ( ( rule__HashKeyValue__KeyAlternatives_2_1_0_0 ) ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2097:1: ( ( rule__HashKeyValue__KeyAlternatives_2_1_0_0 ) )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2097:1: ( ( rule__HashKeyValue__KeyAlternatives_2_1_0_0 ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2098:1: ( rule__HashKeyValue__KeyAlternatives_2_1_0_0 )
            {
             before(grammarAccess.getHashKeyValueAccess().getKeyAlternatives_2_1_0_0()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2099:1: ( rule__HashKeyValue__KeyAlternatives_2_1_0_0 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2099:2: rule__HashKeyValue__KeyAlternatives_2_1_0_0
            {
            pushFollow(FOLLOW_rule__HashKeyValue__KeyAlternatives_2_1_0_0_in_rule__HashKeyValue__KeyAssignment_2_1_04220);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2108:1: rule__HashKeyValue__ValueAssignment_4 : ( ( rule__HashKeyValue__ValueAlternatives_4_0 ) ) ;
    public final void rule__HashKeyValue__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2112:1: ( ( ( rule__HashKeyValue__ValueAlternatives_4_0 ) ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2113:1: ( ( rule__HashKeyValue__ValueAlternatives_4_0 ) )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2113:1: ( ( rule__HashKeyValue__ValueAlternatives_4_0 ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2114:1: ( rule__HashKeyValue__ValueAlternatives_4_0 )
            {
             before(grammarAccess.getHashKeyValueAccess().getValueAlternatives_4_0()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2115:1: ( rule__HashKeyValue__ValueAlternatives_4_0 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2115:2: rule__HashKeyValue__ValueAlternatives_4_0
            {
            pushFollow(FOLLOW_rule__HashKeyValue__ValueAlternatives_4_0_in_rule__HashKeyValue__ValueAssignment_44253);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2124:1: rule__Method__NameAssignment_1 : ( ruleMethodName ) ;
    public final void rule__Method__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2128:1: ( ( ruleMethodName ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2129:1: ( ruleMethodName )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2129:1: ( ruleMethodName )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:2130:1: ruleMethodName
            {
             before(grammarAccess.getMethodAccess().getNameMethodNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleMethodName_in_rule__Method__NameAssignment_14286);
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
        "\2\7\2\uffff";
    static final String DFA11_maxS =
        "\2\26\2\uffff";
    static final String DFA11_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA11_specialS =
        "\4\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\3\1\uffff\4\3\10\uffff\1\1\1\2",
            "\1\3\1\uffff\4\3\10\uffff\1\1\1\2",
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
            return "658:1: ( rule__Class__Group_3__0 )?";
        }
    }
 

    public static final BitSet FOLLOW_ruleClass_in_entryRuleClass61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__0_in_ruleClass94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespacedModuleName_in_entryRuleNamespacedModuleName121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamespacedModuleName128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespacedModuleName__Group__0_in_ruleNamespacedModuleName154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassElement_in_entryRuleClassElement181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassElement188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassElement__Alternatives_in_ruleClassElement214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationship_in_entryRuleRelationship241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationship248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__Alternatives_in_ruleRelationship274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHasMany_in_entryRuleHasMany301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHasMany308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HasMany__Group__0_in_ruleHasMany334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHasAndBelongsToMany_in_entryRuleHasAndBelongsToMany361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHasAndBelongsToMany368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HasAndBelongsToMany__Group__0_in_ruleHasAndBelongsToMany394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBelongsTo_in_entryRuleBelongsTo421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBelongsTo428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BelongsTo__Group__0_in_ruleBelongsTo454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHashKeyValue_in_entryRuleHashKeyValue481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHashKeyValue488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HashKeyValue__Group__0_in_ruleHashKeyValue514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_entryRuleMethod541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethod548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__0_in_ruleMethod574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodName_in_entryRuleMethodName601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodName608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodName__Group__0_in_ruleMethodName634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_rule__ClassElement__Alternatives670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationship_in_rule__ClassElement__Alternatives687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHasMany_in_rule__Relationship__Alternatives719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHasAndBelongsToMany_in_rule__Relationship__Alternatives736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBelongsTo_in_rule__Relationship__Alternatives753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SYMBOL_in_rule__HasMany__NameAlternatives_2_0785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__HasMany__NameAlternatives_2_0802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SYMBOL_in_rule__HasAndBelongsToMany__NameAlternatives_2_0834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__HasAndBelongsToMany__NameAlternatives_2_0851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SYMBOL_in_rule__BelongsTo__NameAlternatives_2_0883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__BelongsTo__NameAlternatives_2_0900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HashKeyValue__Group_2_0__0_in_rule__HashKeyValue__Alternatives_2932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HashKeyValue__Group_2_1__0_in_rule__HashKeyValue__Alternatives_2950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SYMBOL_in_rule__HashKeyValue__KeyAlternatives_2_1_0_0983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__HashKeyValue__KeyAlternatives_2_1_0_01000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SYMBOL_in_rule__HashKeyValue__ValueAlternatives_4_01032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__HashKeyValue__ValueAlternatives_4_01049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__MethodName__Alternatives_11082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__MethodName__Alternatives_11102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__0__Impl_in_rule__Class__Group__01134 = new BitSet(new long[]{0x0000000000200100L});
    public static final BitSet FOLLOW_rule__Class__Group__1_in_rule__Class__Group__01137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CLASS_WORD_in_rule__Class__Group__0__Impl1164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__1__Impl_in_rule__Class__Group__11193 = new BitSet(new long[]{0x0000000000200100L});
    public static final BitSet FOLLOW_rule__Class__Group__2_in_rule__Class__Group__11196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Class__Group__1__Impl1225 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Class__Group__2__Impl_in_rule__Class__Group__21258 = new BitSet(new long[]{0x0000000000601E80L});
    public static final BitSet FOLLOW_rule__Class__Group__3_in_rule__Class__Group__21261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__NameAssignment_2_in_rule__Class__Group__2__Impl1288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__3__Impl_in_rule__Class__Group__31318 = new BitSet(new long[]{0x0000000000601E80L});
    public static final BitSet FOLLOW_rule__Class__Group__4_in_rule__Class__Group__31321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group_3__0_in_rule__Class__Group__3__Impl1348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__4__Impl_in_rule__Class__Group__41379 = new BitSet(new long[]{0x0000000000601E80L});
    public static final BitSet FOLLOW_rule__Class__Group__5_in_rule__Class__Group__41382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Class__Group__4__Impl1411 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Class__Group__5__Impl_in_rule__Class__Group__51444 = new BitSet(new long[]{0x0000000000601E80L});
    public static final BitSet FOLLOW_rule__Class__Group__6_in_rule__Class__Group__51447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__ClassElementsAssignment_5_in_rule__Class__Group__5__Impl1474 = new BitSet(new long[]{0x0000000000001E02L});
    public static final BitSet FOLLOW_rule__Class__Group__6__Impl_in_rule__Class__Group__61505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_END_WORD_in_rule__Class__Group__6__Impl1532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group_3__0__Impl_in_rule__Class__Group_3__01575 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__Class__Group_3__1_in_rule__Class__Group_3__01578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Class__Group_3__0__Impl1607 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Class__Group_3__1__Impl_in_rule__Class__Group_3__11640 = new BitSet(new long[]{0x0000000000200100L});
    public static final BitSet FOLLOW_rule__Class__Group_3__2_in_rule__Class__Group_3__11643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Class__Group_3__1__Impl1671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group_3__2__Impl_in_rule__Class__Group_3__21702 = new BitSet(new long[]{0x0000000000200100L});
    public static final BitSet FOLLOW_rule__Class__Group_3__3_in_rule__Class__Group_3__21705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Class__Group_3__2__Impl1734 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Class__Group_3__3__Impl_in_rule__Class__Group_3__31767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__SuperTypeAssignment_3_3_in_rule__Class__Group_3__3__Impl1794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespacedModuleName__Group__0__Impl_in_rule__NamespacedModuleName__Group__01832 = new BitSet(new long[]{0x0000000000200100L});
    public static final BitSet FOLLOW_rule__NamespacedModuleName__Group__1_in_rule__NamespacedModuleName__Group__01835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespacedModuleName__Group_0__0_in_rule__NamespacedModuleName__Group__0__Impl1862 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__NamespacedModuleName__Group__1__Impl_in_rule__NamespacedModuleName__Group__11893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NamespacedModuleName__Group__1__Impl1920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespacedModuleName__Group_0__0__Impl_in_rule__NamespacedModuleName__Group_0__01953 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__NamespacedModuleName__Group_0__1_in_rule__NamespacedModuleName__Group_0__01956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NamespacedModuleName__Group_0__0__Impl1983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespacedModuleName__Group_0__1__Impl_in_rule__NamespacedModuleName__Group_0__12012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__NamespacedModuleName__Group_0__1__Impl2040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HasMany__Group__0__Impl_in_rule__HasMany__Group__02075 = new BitSet(new long[]{0x0000000000200030L});
    public static final BitSet FOLLOW_rule__HasMany__Group__1_in_rule__HasMany__Group__02078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HAS_MANY_WORD_in_rule__HasMany__Group__0__Impl2105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HasMany__Group__1__Impl_in_rule__HasMany__Group__12134 = new BitSet(new long[]{0x0000000000200030L});
    public static final BitSet FOLLOW_rule__HasMany__Group__2_in_rule__HasMany__Group__12137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__HasMany__Group__1__Impl2166 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__HasMany__Group__2__Impl_in_rule__HasMany__Group__22199 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_rule__HasMany__Group__3_in_rule__HasMany__Group__22202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HasMany__NameAssignment_2_in_rule__HasMany__Group__2__Impl2229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HasMany__Group__3__Impl_in_rule__HasMany__Group__32259 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_rule__HasMany__Group__4_in_rule__HasMany__Group__32262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__HasMany__Group__3__Impl2291 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__HasMany__Group__4__Impl_in_rule__HasMany__Group__42324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HasMany__OptionsAssignment_4_in_rule__HasMany__Group__4__Impl2351 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__HasAndBelongsToMany__Group__0__Impl_in_rule__HasAndBelongsToMany__Group__02392 = new BitSet(new long[]{0x0000000000200030L});
    public static final BitSet FOLLOW_rule__HasAndBelongsToMany__Group__1_in_rule__HasAndBelongsToMany__Group__02395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HAS_AND_BELONGS_TO_MANY_WORD_in_rule__HasAndBelongsToMany__Group__0__Impl2422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HasAndBelongsToMany__Group__1__Impl_in_rule__HasAndBelongsToMany__Group__12451 = new BitSet(new long[]{0x0000000000200030L});
    public static final BitSet FOLLOW_rule__HasAndBelongsToMany__Group__2_in_rule__HasAndBelongsToMany__Group__12454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__HasAndBelongsToMany__Group__1__Impl2483 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__HasAndBelongsToMany__Group__2__Impl_in_rule__HasAndBelongsToMany__Group__22516 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_rule__HasAndBelongsToMany__Group__3_in_rule__HasAndBelongsToMany__Group__22519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HasAndBelongsToMany__NameAssignment_2_in_rule__HasAndBelongsToMany__Group__2__Impl2546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HasAndBelongsToMany__Group__3__Impl_in_rule__HasAndBelongsToMany__Group__32576 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_rule__HasAndBelongsToMany__Group__4_in_rule__HasAndBelongsToMany__Group__32579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__HasAndBelongsToMany__Group__3__Impl2608 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__HasAndBelongsToMany__Group__4__Impl_in_rule__HasAndBelongsToMany__Group__42641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HasAndBelongsToMany__OptionsAssignment_4_in_rule__HasAndBelongsToMany__Group__4__Impl2668 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__BelongsTo__Group__0__Impl_in_rule__BelongsTo__Group__02709 = new BitSet(new long[]{0x0000000000200030L});
    public static final BitSet FOLLOW_rule__BelongsTo__Group__1_in_rule__BelongsTo__Group__02712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BELONGS_TO_WORD_in_rule__BelongsTo__Group__0__Impl2739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BelongsTo__Group__1__Impl_in_rule__BelongsTo__Group__12768 = new BitSet(new long[]{0x0000000000200030L});
    public static final BitSet FOLLOW_rule__BelongsTo__Group__2_in_rule__BelongsTo__Group__12771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__BelongsTo__Group__1__Impl2800 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__BelongsTo__Group__2__Impl_in_rule__BelongsTo__Group__22833 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_rule__BelongsTo__Group__3_in_rule__BelongsTo__Group__22836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BelongsTo__NameAssignment_2_in_rule__BelongsTo__Group__2__Impl2863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BelongsTo__Group__3__Impl_in_rule__BelongsTo__Group__32893 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_rule__BelongsTo__Group__4_in_rule__BelongsTo__Group__32896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__BelongsTo__Group__3__Impl2925 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__BelongsTo__Group__4__Impl_in_rule__BelongsTo__Group__42958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BelongsTo__OptionsAssignment_4_in_rule__BelongsTo__Group__4__Impl2985 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__HashKeyValue__Group__0__Impl_in_rule__HashKeyValue__Group__03026 = new BitSet(new long[]{0x0000000000200130L});
    public static final BitSet FOLLOW_rule__HashKeyValue__Group__1_in_rule__HashKeyValue__Group__03029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__HashKeyValue__Group__0__Impl3057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HashKeyValue__Group__1__Impl_in_rule__HashKeyValue__Group__13088 = new BitSet(new long[]{0x0000000000200130L});
    public static final BitSet FOLLOW_rule__HashKeyValue__Group__2_in_rule__HashKeyValue__Group__13091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__HashKeyValue__Group__1__Impl3120 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__HashKeyValue__Group__2__Impl_in_rule__HashKeyValue__Group__23153 = new BitSet(new long[]{0x0000000000200030L});
    public static final BitSet FOLLOW_rule__HashKeyValue__Group__3_in_rule__HashKeyValue__Group__23156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HashKeyValue__Alternatives_2_in_rule__HashKeyValue__Group__2__Impl3183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HashKeyValue__Group__3__Impl_in_rule__HashKeyValue__Group__33213 = new BitSet(new long[]{0x0000000000200030L});
    public static final BitSet FOLLOW_rule__HashKeyValue__Group__4_in_rule__HashKeyValue__Group__33216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__HashKeyValue__Group__3__Impl3245 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__HashKeyValue__Group__4__Impl_in_rule__HashKeyValue__Group__43278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HashKeyValue__ValueAssignment_4_in_rule__HashKeyValue__Group__4__Impl3305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HashKeyValue__Group_2_0__0__Impl_in_rule__HashKeyValue__Group_2_0__03345 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__HashKeyValue__Group_2_0__1_in_rule__HashKeyValue__Group_2_0__03348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HashKeyValue__KeyAssignment_2_0_0_in_rule__HashKeyValue__Group_2_0__0__Impl3375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HashKeyValue__Group_2_0__1__Impl_in_rule__HashKeyValue__Group_2_0__13405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__HashKeyValue__Group_2_0__1__Impl3433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HashKeyValue__Group_2_1__0__Impl_in_rule__HashKeyValue__Group_2_1__03468 = new BitSet(new long[]{0x0000000004200000L});
    public static final BitSet FOLLOW_rule__HashKeyValue__Group_2_1__1_in_rule__HashKeyValue__Group_2_1__03471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HashKeyValue__KeyAssignment_2_1_0_in_rule__HashKeyValue__Group_2_1__0__Impl3498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HashKeyValue__Group_2_1__1__Impl_in_rule__HashKeyValue__Group_2_1__13528 = new BitSet(new long[]{0x0000000004200000L});
    public static final BitSet FOLLOW_rule__HashKeyValue__Group_2_1__2_in_rule__HashKeyValue__Group_2_1__13531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__HashKeyValue__Group_2_1__1__Impl3560 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__HashKeyValue__Group_2_1__2__Impl_in_rule__HashKeyValue__Group_2_1__23593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__HashKeyValue__Group_2_1__2__Impl3621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__0__Impl_in_rule__Method__Group__03658 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Method__Group__1_in_rule__Method__Group__03661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DEF_WORD_in_rule__Method__Group__0__Impl3688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__1__Impl_in_rule__Method__Group__13717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__NameAssignment_1_in_rule__Method__Group__1__Impl3744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodName__Group__0__Impl_in_rule__MethodName__Group__03778 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_rule__MethodName__Group__1_in_rule__MethodName__Group__03781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MethodName__Group__0__Impl3808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodName__Group__1__Impl_in_rule__MethodName__Group__13837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodName__Alternatives_1_in_rule__MethodName__Group__1__Impl3864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespacedModuleName_in_rule__Class__NameAssignment_23904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespacedModuleName_in_rule__Class__SuperTypeAssignment_3_33935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassElement_in_rule__Class__ClassElementsAssignment_53966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HasMany__NameAlternatives_2_0_in_rule__HasMany__NameAssignment_23997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHashKeyValue_in_rule__HasMany__OptionsAssignment_44030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HasAndBelongsToMany__NameAlternatives_2_0_in_rule__HasAndBelongsToMany__NameAssignment_24061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHashKeyValue_in_rule__HasAndBelongsToMany__OptionsAssignment_44094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BelongsTo__NameAlternatives_2_0_in_rule__BelongsTo__NameAssignment_24125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHashKeyValue_in_rule__BelongsTo__OptionsAssignment_44158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__HashKeyValue__KeyAssignment_2_0_04189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HashKeyValue__KeyAlternatives_2_1_0_0_in_rule__HashKeyValue__KeyAssignment_2_1_04220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HashKeyValue__ValueAlternatives_4_0_in_rule__HashKeyValue__ValueAssignment_44253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodName_in_rule__Method__NameAssignment_14286 = new BitSet(new long[]{0x0000000000000002L});

}