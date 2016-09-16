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


    // $ANTLR start "entryRuleHashKeyValue"
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:232:1: entryRuleHashKeyValue : ruleHashKeyValue EOF ;
    public final void entryRuleHashKeyValue() throws RecognitionException {
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:233:1: ( ruleHashKeyValue EOF )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:234:1: ruleHashKeyValue EOF
            {
             before(grammarAccess.getHashKeyValueRule()); 
            pushFollow(FOLLOW_ruleHashKeyValue_in_entryRuleHashKeyValue425);
            ruleHashKeyValue();

            state._fsp--;

             after(grammarAccess.getHashKeyValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHashKeyValue432); 

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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:241:1: ruleHashKeyValue : ( ( rule__HashKeyValue__Group__0 ) ) ;
    public final void ruleHashKeyValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:245:2: ( ( ( rule__HashKeyValue__Group__0 ) ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:246:1: ( ( rule__HashKeyValue__Group__0 ) )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:246:1: ( ( rule__HashKeyValue__Group__0 ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:247:1: ( rule__HashKeyValue__Group__0 )
            {
             before(grammarAccess.getHashKeyValueAccess().getGroup()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:248:1: ( rule__HashKeyValue__Group__0 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:248:2: rule__HashKeyValue__Group__0
            {
            pushFollow(FOLLOW_rule__HashKeyValue__Group__0_in_ruleHashKeyValue458);
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


    // $ANTLR start "entryRuleBelongsTo"
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:260:1: entryRuleBelongsTo : ruleBelongsTo EOF ;
    public final void entryRuleBelongsTo() throws RecognitionException {
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:261:1: ( ruleBelongsTo EOF )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:262:1: ruleBelongsTo EOF
            {
             before(grammarAccess.getBelongsToRule()); 
            pushFollow(FOLLOW_ruleBelongsTo_in_entryRuleBelongsTo485);
            ruleBelongsTo();

            state._fsp--;

             after(grammarAccess.getBelongsToRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBelongsTo492); 

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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:269:1: ruleBelongsTo : ( ( rule__BelongsTo__Group__0 ) ) ;
    public final void ruleBelongsTo() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:273:2: ( ( ( rule__BelongsTo__Group__0 ) ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:274:1: ( ( rule__BelongsTo__Group__0 ) )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:274:1: ( ( rule__BelongsTo__Group__0 ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:275:1: ( rule__BelongsTo__Group__0 )
            {
             before(grammarAccess.getBelongsToAccess().getGroup()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:276:1: ( rule__BelongsTo__Group__0 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:276:2: rule__BelongsTo__Group__0
            {
            pushFollow(FOLLOW_rule__BelongsTo__Group__0_in_ruleBelongsTo518);
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


    // $ANTLR start "entryRuleMethod"
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:288:1: entryRuleMethod : ruleMethod EOF ;
    public final void entryRuleMethod() throws RecognitionException {
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:289:1: ( ruleMethod EOF )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:290:1: ruleMethod EOF
            {
             before(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_ruleMethod_in_entryRuleMethod545);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getMethodRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethod552); 

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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:297:1: ruleMethod : ( ( rule__Method__Group__0 ) ) ;
    public final void ruleMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:301:2: ( ( ( rule__Method__Group__0 ) ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:302:1: ( ( rule__Method__Group__0 ) )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:302:1: ( ( rule__Method__Group__0 ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:303:1: ( rule__Method__Group__0 )
            {
             before(grammarAccess.getMethodAccess().getGroup()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:304:1: ( rule__Method__Group__0 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:304:2: rule__Method__Group__0
            {
            pushFollow(FOLLOW_rule__Method__Group__0_in_ruleMethod578);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:316:1: entryRuleMethodName : ruleMethodName EOF ;
    public final void entryRuleMethodName() throws RecognitionException {
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:317:1: ( ruleMethodName EOF )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:318:1: ruleMethodName EOF
            {
             before(grammarAccess.getMethodNameRule()); 
            pushFollow(FOLLOW_ruleMethodName_in_entryRuleMethodName605);
            ruleMethodName();

            state._fsp--;

             after(grammarAccess.getMethodNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodName612); 

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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:325:1: ruleMethodName : ( ( rule__MethodName__Group__0 ) ) ;
    public final void ruleMethodName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:329:2: ( ( ( rule__MethodName__Group__0 ) ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:330:1: ( ( rule__MethodName__Group__0 ) )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:330:1: ( ( rule__MethodName__Group__0 ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:331:1: ( rule__MethodName__Group__0 )
            {
             before(grammarAccess.getMethodNameAccess().getGroup()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:332:1: ( rule__MethodName__Group__0 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:332:2: rule__MethodName__Group__0
            {
            pushFollow(FOLLOW_rule__MethodName__Group__0_in_ruleMethodName638);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:344:1: rule__ClassElement__Alternatives : ( ( ruleMethod ) | ( ruleRelationship ) );
    public final void rule__ClassElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:348:1: ( ( ruleMethod ) | ( ruleRelationship ) )
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
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:349:1: ( ruleMethod )
                    {
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:349:1: ( ruleMethod )
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:350:1: ruleMethod
                    {
                     before(grammarAccess.getClassElementAccess().getMethodParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleMethod_in_rule__ClassElement__Alternatives674);
                    ruleMethod();

                    state._fsp--;

                     after(grammarAccess.getClassElementAccess().getMethodParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:355:6: ( ruleRelationship )
                    {
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:355:6: ( ruleRelationship )
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:356:1: ruleRelationship
                    {
                     before(grammarAccess.getClassElementAccess().getRelationshipParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleRelationship_in_rule__ClassElement__Alternatives691);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:366:1: rule__Relationship__Alternatives : ( ( ruleHasMany ) | ( ruleHasAndBelongsToMany ) | ( ruleBelongsTo ) );
    public final void rule__Relationship__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:370:1: ( ( ruleHasMany ) | ( ruleHasAndBelongsToMany ) | ( ruleBelongsTo ) )
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
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:371:1: ( ruleHasMany )
                    {
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:371:1: ( ruleHasMany )
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:372:1: ruleHasMany
                    {
                     before(grammarAccess.getRelationshipAccess().getHasManyParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleHasMany_in_rule__Relationship__Alternatives723);
                    ruleHasMany();

                    state._fsp--;

                     after(grammarAccess.getRelationshipAccess().getHasManyParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:377:6: ( ruleHasAndBelongsToMany )
                    {
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:377:6: ( ruleHasAndBelongsToMany )
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:378:1: ruleHasAndBelongsToMany
                    {
                     before(grammarAccess.getRelationshipAccess().getHasAndBelongsToManyParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleHasAndBelongsToMany_in_rule__Relationship__Alternatives740);
                    ruleHasAndBelongsToMany();

                    state._fsp--;

                     after(grammarAccess.getRelationshipAccess().getHasAndBelongsToManyParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:383:6: ( ruleBelongsTo )
                    {
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:383:6: ( ruleBelongsTo )
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:384:1: ruleBelongsTo
                    {
                     before(grammarAccess.getRelationshipAccess().getBelongsToParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleBelongsTo_in_rule__Relationship__Alternatives757);
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


    // $ANTLR start "rule__HashKeyValue__Alternatives_2"
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:397:1: rule__HashKeyValue__Alternatives_2 : ( ( ( rule__HashKeyValue__Group_2_0__0 ) ) | ( ( rule__HashKeyValue__Group_2_1__0 ) ) );
    public final void rule__HashKeyValue__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:401:1: ( ( ( rule__HashKeyValue__Group_2_0__0 ) ) | ( ( rule__HashKeyValue__Group_2_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=RULE_SYMBOL && LA3_0<=RULE_STRING)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:402:1: ( ( rule__HashKeyValue__Group_2_0__0 ) )
                    {
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:402:1: ( ( rule__HashKeyValue__Group_2_0__0 ) )
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:403:1: ( rule__HashKeyValue__Group_2_0__0 )
                    {
                     before(grammarAccess.getHashKeyValueAccess().getGroup_2_0()); 
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:404:1: ( rule__HashKeyValue__Group_2_0__0 )
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:404:2: rule__HashKeyValue__Group_2_0__0
                    {
                    pushFollow(FOLLOW_rule__HashKeyValue__Group_2_0__0_in_rule__HashKeyValue__Alternatives_2792);
                    rule__HashKeyValue__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getHashKeyValueAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:408:6: ( ( rule__HashKeyValue__Group_2_1__0 ) )
                    {
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:408:6: ( ( rule__HashKeyValue__Group_2_1__0 ) )
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:409:1: ( rule__HashKeyValue__Group_2_1__0 )
                    {
                     before(grammarAccess.getHashKeyValueAccess().getGroup_2_1()); 
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:410:1: ( rule__HashKeyValue__Group_2_1__0 )
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:410:2: rule__HashKeyValue__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__HashKeyValue__Group_2_1__0_in_rule__HashKeyValue__Alternatives_2810);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:419:1: rule__HashKeyValue__KeyAlternatives_2_1_0_0 : ( ( RULE_SYMBOL ) | ( RULE_STRING ) );
    public final void rule__HashKeyValue__KeyAlternatives_2_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:423:1: ( ( RULE_SYMBOL ) | ( RULE_STRING ) )
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
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:424:1: ( RULE_SYMBOL )
                    {
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:424:1: ( RULE_SYMBOL )
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:425:1: RULE_SYMBOL
                    {
                     before(grammarAccess.getHashKeyValueAccess().getKeySYMBOLTerminalRuleCall_2_1_0_0_0()); 
                    match(input,RULE_SYMBOL,FOLLOW_RULE_SYMBOL_in_rule__HashKeyValue__KeyAlternatives_2_1_0_0843); 
                     after(grammarAccess.getHashKeyValueAccess().getKeySYMBOLTerminalRuleCall_2_1_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:430:6: ( RULE_STRING )
                    {
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:430:6: ( RULE_STRING )
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:431:1: RULE_STRING
                    {
                     before(grammarAccess.getHashKeyValueAccess().getKeySTRINGTerminalRuleCall_2_1_0_0_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__HashKeyValue__KeyAlternatives_2_1_0_0860); 
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:441:1: rule__HashKeyValue__ValueAlternatives_4_0 : ( ( RULE_SYMBOL ) | ( RULE_STRING ) );
    public final void rule__HashKeyValue__ValueAlternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:445:1: ( ( RULE_SYMBOL ) | ( RULE_STRING ) )
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
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:446:1: ( RULE_SYMBOL )
                    {
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:446:1: ( RULE_SYMBOL )
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:447:1: RULE_SYMBOL
                    {
                     before(grammarAccess.getHashKeyValueAccess().getValueSYMBOLTerminalRuleCall_4_0_0()); 
                    match(input,RULE_SYMBOL,FOLLOW_RULE_SYMBOL_in_rule__HashKeyValue__ValueAlternatives_4_0892); 
                     after(grammarAccess.getHashKeyValueAccess().getValueSYMBOLTerminalRuleCall_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:452:6: ( RULE_STRING )
                    {
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:452:6: ( RULE_STRING )
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:453:1: RULE_STRING
                    {
                     before(grammarAccess.getHashKeyValueAccess().getValueSTRINGTerminalRuleCall_4_0_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__HashKeyValue__ValueAlternatives_4_0909); 
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


    // $ANTLR start "rule__BelongsTo__NameAlternatives_2_0"
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:463:1: rule__BelongsTo__NameAlternatives_2_0 : ( ( RULE_SYMBOL ) | ( RULE_STRING ) );
    public final void rule__BelongsTo__NameAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:467:1: ( ( RULE_SYMBOL ) | ( RULE_STRING ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_SYMBOL) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_STRING) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:468:1: ( RULE_SYMBOL )
                    {
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:468:1: ( RULE_SYMBOL )
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:469:1: RULE_SYMBOL
                    {
                     before(grammarAccess.getBelongsToAccess().getNameSYMBOLTerminalRuleCall_2_0_0()); 
                    match(input,RULE_SYMBOL,FOLLOW_RULE_SYMBOL_in_rule__BelongsTo__NameAlternatives_2_0941); 
                     after(grammarAccess.getBelongsToAccess().getNameSYMBOLTerminalRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:474:6: ( RULE_STRING )
                    {
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:474:6: ( RULE_STRING )
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:475:1: RULE_STRING
                    {
                     before(grammarAccess.getBelongsToAccess().getNameSTRINGTerminalRuleCall_2_0_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__BelongsTo__NameAlternatives_2_0958); 
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


    // $ANTLR start "rule__MethodName__Alternatives_1"
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:485:1: rule__MethodName__Alternatives_1 : ( ( '?' ) | ( '=' ) );
    public final void rule__MethodName__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:489:1: ( ( '?' ) | ( '=' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            else if ( (LA7_0==20) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:490:1: ( '?' )
                    {
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:490:1: ( '?' )
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:491:1: '?'
                    {
                     before(grammarAccess.getMethodNameAccess().getQuestionMarkKeyword_1_0()); 
                    match(input,19,FOLLOW_19_in_rule__MethodName__Alternatives_1991); 
                     after(grammarAccess.getMethodNameAccess().getQuestionMarkKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:498:6: ( '=' )
                    {
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:498:6: ( '=' )
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:499:1: '='
                    {
                     before(grammarAccess.getMethodNameAccess().getEqualsSignKeyword_1_1()); 
                    match(input,20,FOLLOW_20_in_rule__MethodName__Alternatives_11011); 
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:513:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:517:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:518:2: rule__Class__Group__0__Impl rule__Class__Group__1
            {
            pushFollow(FOLLOW_rule__Class__Group__0__Impl_in_rule__Class__Group__01043);
            rule__Class__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__1_in_rule__Class__Group__01046);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:525:1: rule__Class__Group__0__Impl : ( RULE_CLASS_WORD ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:529:1: ( ( RULE_CLASS_WORD ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:530:1: ( RULE_CLASS_WORD )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:530:1: ( RULE_CLASS_WORD )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:531:1: RULE_CLASS_WORD
            {
             before(grammarAccess.getClassAccess().getCLASS_WORDTerminalRuleCall_0()); 
            match(input,RULE_CLASS_WORD,FOLLOW_RULE_CLASS_WORD_in_rule__Class__Group__0__Impl1073); 
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:542:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:546:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:547:2: rule__Class__Group__1__Impl rule__Class__Group__2
            {
            pushFollow(FOLLOW_rule__Class__Group__1__Impl_in_rule__Class__Group__11102);
            rule__Class__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__2_in_rule__Class__Group__11105);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:554:1: rule__Class__Group__1__Impl : ( ( ' ' )* ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:558:1: ( ( ( ' ' )* ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:559:1: ( ( ' ' )* )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:559:1: ( ( ' ' )* )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:560:1: ( ' ' )*
            {
             before(grammarAccess.getClassAccess().getSpaceKeyword_1()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:561:1: ( ' ' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==21) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:562:2: ' '
            	    {
            	    match(input,21,FOLLOW_21_in_rule__Class__Group__1__Impl1134); 

            	    }
            	    break;

            	default :
            	    break loop8;
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:573:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:577:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:578:2: rule__Class__Group__2__Impl rule__Class__Group__3
            {
            pushFollow(FOLLOW_rule__Class__Group__2__Impl_in_rule__Class__Group__21167);
            rule__Class__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__3_in_rule__Class__Group__21170);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:585:1: rule__Class__Group__2__Impl : ( ( rule__Class__NameAssignment_2 ) ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:589:1: ( ( ( rule__Class__NameAssignment_2 ) ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:590:1: ( ( rule__Class__NameAssignment_2 ) )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:590:1: ( ( rule__Class__NameAssignment_2 ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:591:1: ( rule__Class__NameAssignment_2 )
            {
             before(grammarAccess.getClassAccess().getNameAssignment_2()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:592:1: ( rule__Class__NameAssignment_2 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:592:2: rule__Class__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Class__NameAssignment_2_in_rule__Class__Group__2__Impl1197);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:602:1: rule__Class__Group__3 : rule__Class__Group__3__Impl rule__Class__Group__4 ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:606:1: ( rule__Class__Group__3__Impl rule__Class__Group__4 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:607:2: rule__Class__Group__3__Impl rule__Class__Group__4
            {
            pushFollow(FOLLOW_rule__Class__Group__3__Impl_in_rule__Class__Group__31227);
            rule__Class__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__4_in_rule__Class__Group__31230);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:614:1: rule__Class__Group__3__Impl : ( ( rule__Class__Group_3__0 )? ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:618:1: ( ( ( rule__Class__Group_3__0 )? ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:619:1: ( ( rule__Class__Group_3__0 )? )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:619:1: ( ( rule__Class__Group_3__0 )? )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:620:1: ( rule__Class__Group_3__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_3()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:621:1: ( rule__Class__Group_3__0 )?
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:621:2: rule__Class__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Class__Group_3__0_in_rule__Class__Group__3__Impl1257);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:631:1: rule__Class__Group__4 : rule__Class__Group__4__Impl rule__Class__Group__5 ;
    public final void rule__Class__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:635:1: ( rule__Class__Group__4__Impl rule__Class__Group__5 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:636:2: rule__Class__Group__4__Impl rule__Class__Group__5
            {
            pushFollow(FOLLOW_rule__Class__Group__4__Impl_in_rule__Class__Group__41288);
            rule__Class__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__5_in_rule__Class__Group__41291);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:643:1: rule__Class__Group__4__Impl : ( ( ' ' )* ) ;
    public final void rule__Class__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:647:1: ( ( ( ' ' )* ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:648:1: ( ( ' ' )* )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:648:1: ( ( ' ' )* )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:649:1: ( ' ' )*
            {
             before(grammarAccess.getClassAccess().getSpaceKeyword_4()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:650:1: ( ' ' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==21) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:651:2: ' '
            	    {
            	    match(input,21,FOLLOW_21_in_rule__Class__Group__4__Impl1320); 

            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:662:1: rule__Class__Group__5 : rule__Class__Group__5__Impl rule__Class__Group__6 ;
    public final void rule__Class__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:666:1: ( rule__Class__Group__5__Impl rule__Class__Group__6 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:667:2: rule__Class__Group__5__Impl rule__Class__Group__6
            {
            pushFollow(FOLLOW_rule__Class__Group__5__Impl_in_rule__Class__Group__51353);
            rule__Class__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__6_in_rule__Class__Group__51356);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:674:1: rule__Class__Group__5__Impl : ( ( rule__Class__ClassElementsAssignment_5 )* ) ;
    public final void rule__Class__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:678:1: ( ( ( rule__Class__ClassElementsAssignment_5 )* ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:679:1: ( ( rule__Class__ClassElementsAssignment_5 )* )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:679:1: ( ( rule__Class__ClassElementsAssignment_5 )* )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:680:1: ( rule__Class__ClassElementsAssignment_5 )*
            {
             before(grammarAccess.getClassAccess().getClassElementsAssignment_5()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:681:1: ( rule__Class__ClassElementsAssignment_5 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=RULE_HAS_MANY_WORD && LA11_0<=RULE_DEF_WORD)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:681:2: rule__Class__ClassElementsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Class__ClassElementsAssignment_5_in_rule__Class__Group__5__Impl1383);
            	    rule__Class__ClassElementsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:691:1: rule__Class__Group__6 : rule__Class__Group__6__Impl ;
    public final void rule__Class__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:695:1: ( rule__Class__Group__6__Impl )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:696:2: rule__Class__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Class__Group__6__Impl_in_rule__Class__Group__61414);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:702:1: rule__Class__Group__6__Impl : ( RULE_END_WORD ) ;
    public final void rule__Class__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:706:1: ( ( RULE_END_WORD ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:707:1: ( RULE_END_WORD )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:707:1: ( RULE_END_WORD )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:708:1: RULE_END_WORD
            {
             before(grammarAccess.getClassAccess().getEND_WORDTerminalRuleCall_6()); 
            match(input,RULE_END_WORD,FOLLOW_RULE_END_WORD_in_rule__Class__Group__6__Impl1441); 
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:733:1: rule__Class__Group_3__0 : rule__Class__Group_3__0__Impl rule__Class__Group_3__1 ;
    public final void rule__Class__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:737:1: ( rule__Class__Group_3__0__Impl rule__Class__Group_3__1 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:738:2: rule__Class__Group_3__0__Impl rule__Class__Group_3__1
            {
            pushFollow(FOLLOW_rule__Class__Group_3__0__Impl_in_rule__Class__Group_3__01484);
            rule__Class__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group_3__1_in_rule__Class__Group_3__01487);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:745:1: rule__Class__Group_3__0__Impl : ( ( ' ' )* ) ;
    public final void rule__Class__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:749:1: ( ( ( ' ' )* ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:750:1: ( ( ' ' )* )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:750:1: ( ( ' ' )* )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:751:1: ( ' ' )*
            {
             before(grammarAccess.getClassAccess().getSpaceKeyword_3_0()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:752:1: ( ' ' )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==21) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:753:2: ' '
            	    {
            	    match(input,21,FOLLOW_21_in_rule__Class__Group_3__0__Impl1516); 

            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:764:1: rule__Class__Group_3__1 : rule__Class__Group_3__1__Impl rule__Class__Group_3__2 ;
    public final void rule__Class__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:768:1: ( rule__Class__Group_3__1__Impl rule__Class__Group_3__2 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:769:2: rule__Class__Group_3__1__Impl rule__Class__Group_3__2
            {
            pushFollow(FOLLOW_rule__Class__Group_3__1__Impl_in_rule__Class__Group_3__11549);
            rule__Class__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group_3__2_in_rule__Class__Group_3__11552);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:776:1: rule__Class__Group_3__1__Impl : ( '<' ) ;
    public final void rule__Class__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:780:1: ( ( '<' ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:781:1: ( '<' )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:781:1: ( '<' )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:782:1: '<'
            {
             before(grammarAccess.getClassAccess().getLessThanSignKeyword_3_1()); 
            match(input,22,FOLLOW_22_in_rule__Class__Group_3__1__Impl1580); 
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:795:1: rule__Class__Group_3__2 : rule__Class__Group_3__2__Impl rule__Class__Group_3__3 ;
    public final void rule__Class__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:799:1: ( rule__Class__Group_3__2__Impl rule__Class__Group_3__3 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:800:2: rule__Class__Group_3__2__Impl rule__Class__Group_3__3
            {
            pushFollow(FOLLOW_rule__Class__Group_3__2__Impl_in_rule__Class__Group_3__21611);
            rule__Class__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group_3__3_in_rule__Class__Group_3__21614);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:807:1: rule__Class__Group_3__2__Impl : ( ( ' ' )* ) ;
    public final void rule__Class__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:811:1: ( ( ( ' ' )* ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:812:1: ( ( ' ' )* )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:812:1: ( ( ' ' )* )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:813:1: ( ' ' )*
            {
             before(grammarAccess.getClassAccess().getSpaceKeyword_3_2()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:814:1: ( ' ' )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==21) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:815:2: ' '
            	    {
            	    match(input,21,FOLLOW_21_in_rule__Class__Group_3__2__Impl1643); 

            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:826:1: rule__Class__Group_3__3 : rule__Class__Group_3__3__Impl ;
    public final void rule__Class__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:830:1: ( rule__Class__Group_3__3__Impl )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:831:2: rule__Class__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__Class__Group_3__3__Impl_in_rule__Class__Group_3__31676);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:837:1: rule__Class__Group_3__3__Impl : ( ( rule__Class__SuperTypeAssignment_3_3 ) ) ;
    public final void rule__Class__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:841:1: ( ( ( rule__Class__SuperTypeAssignment_3_3 ) ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:842:1: ( ( rule__Class__SuperTypeAssignment_3_3 ) )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:842:1: ( ( rule__Class__SuperTypeAssignment_3_3 ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:843:1: ( rule__Class__SuperTypeAssignment_3_3 )
            {
             before(grammarAccess.getClassAccess().getSuperTypeAssignment_3_3()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:844:1: ( rule__Class__SuperTypeAssignment_3_3 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:844:2: rule__Class__SuperTypeAssignment_3_3
            {
            pushFollow(FOLLOW_rule__Class__SuperTypeAssignment_3_3_in_rule__Class__Group_3__3__Impl1703);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:862:1: rule__NamespacedModuleName__Group__0 : rule__NamespacedModuleName__Group__0__Impl rule__NamespacedModuleName__Group__1 ;
    public final void rule__NamespacedModuleName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:866:1: ( rule__NamespacedModuleName__Group__0__Impl rule__NamespacedModuleName__Group__1 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:867:2: rule__NamespacedModuleName__Group__0__Impl rule__NamespacedModuleName__Group__1
            {
            pushFollow(FOLLOW_rule__NamespacedModuleName__Group__0__Impl_in_rule__NamespacedModuleName__Group__01741);
            rule__NamespacedModuleName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamespacedModuleName__Group__1_in_rule__NamespacedModuleName__Group__01744);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:874:1: rule__NamespacedModuleName__Group__0__Impl : ( ( rule__NamespacedModuleName__Group_0__0 )* ) ;
    public final void rule__NamespacedModuleName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:878:1: ( ( ( rule__NamespacedModuleName__Group_0__0 )* ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:879:1: ( ( rule__NamespacedModuleName__Group_0__0 )* )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:879:1: ( ( rule__NamespacedModuleName__Group_0__0 )* )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:880:1: ( rule__NamespacedModuleName__Group_0__0 )*
            {
             before(grammarAccess.getNamespacedModuleNameAccess().getGroup_0()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:881:1: ( rule__NamespacedModuleName__Group_0__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    int LA14_1 = input.LA(2);

                    if ( (LA14_1==23) ) {
                        alt14=1;
                    }


                }


                switch (alt14) {
            	case 1 :
            	    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:881:2: rule__NamespacedModuleName__Group_0__0
            	    {
            	    pushFollow(FOLLOW_rule__NamespacedModuleName__Group_0__0_in_rule__NamespacedModuleName__Group__0__Impl1771);
            	    rule__NamespacedModuleName__Group_0__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:891:1: rule__NamespacedModuleName__Group__1 : rule__NamespacedModuleName__Group__1__Impl ;
    public final void rule__NamespacedModuleName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:895:1: ( rule__NamespacedModuleName__Group__1__Impl )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:896:2: rule__NamespacedModuleName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NamespacedModuleName__Group__1__Impl_in_rule__NamespacedModuleName__Group__11802);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:902:1: rule__NamespacedModuleName__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__NamespacedModuleName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:906:1: ( ( RULE_ID ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:907:1: ( RULE_ID )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:907:1: ( RULE_ID )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:908:1: RULE_ID
            {
             before(grammarAccess.getNamespacedModuleNameAccess().getIDTerminalRuleCall_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NamespacedModuleName__Group__1__Impl1829); 
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:923:1: rule__NamespacedModuleName__Group_0__0 : rule__NamespacedModuleName__Group_0__0__Impl rule__NamespacedModuleName__Group_0__1 ;
    public final void rule__NamespacedModuleName__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:927:1: ( rule__NamespacedModuleName__Group_0__0__Impl rule__NamespacedModuleName__Group_0__1 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:928:2: rule__NamespacedModuleName__Group_0__0__Impl rule__NamespacedModuleName__Group_0__1
            {
            pushFollow(FOLLOW_rule__NamespacedModuleName__Group_0__0__Impl_in_rule__NamespacedModuleName__Group_0__01862);
            rule__NamespacedModuleName__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamespacedModuleName__Group_0__1_in_rule__NamespacedModuleName__Group_0__01865);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:935:1: rule__NamespacedModuleName__Group_0__0__Impl : ( RULE_ID ) ;
    public final void rule__NamespacedModuleName__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:939:1: ( ( RULE_ID ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:940:1: ( RULE_ID )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:940:1: ( RULE_ID )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:941:1: RULE_ID
            {
             before(grammarAccess.getNamespacedModuleNameAccess().getIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NamespacedModuleName__Group_0__0__Impl1892); 
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:952:1: rule__NamespacedModuleName__Group_0__1 : rule__NamespacedModuleName__Group_0__1__Impl ;
    public final void rule__NamespacedModuleName__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:956:1: ( rule__NamespacedModuleName__Group_0__1__Impl )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:957:2: rule__NamespacedModuleName__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__NamespacedModuleName__Group_0__1__Impl_in_rule__NamespacedModuleName__Group_0__11921);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:963:1: rule__NamespacedModuleName__Group_0__1__Impl : ( '::' ) ;
    public final void rule__NamespacedModuleName__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:967:1: ( ( '::' ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:968:1: ( '::' )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:968:1: ( '::' )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:969:1: '::'
            {
             before(grammarAccess.getNamespacedModuleNameAccess().getColonColonKeyword_0_1()); 
            match(input,23,FOLLOW_23_in_rule__NamespacedModuleName__Group_0__1__Impl1949); 
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:986:1: rule__HasMany__Group__0 : rule__HasMany__Group__0__Impl rule__HasMany__Group__1 ;
    public final void rule__HasMany__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:990:1: ( rule__HasMany__Group__0__Impl rule__HasMany__Group__1 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:991:2: rule__HasMany__Group__0__Impl rule__HasMany__Group__1
            {
            pushFollow(FOLLOW_rule__HasMany__Group__0__Impl_in_rule__HasMany__Group__01984);
            rule__HasMany__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HasMany__Group__1_in_rule__HasMany__Group__01987);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:998:1: rule__HasMany__Group__0__Impl : ( RULE_HAS_MANY_WORD ) ;
    public final void rule__HasMany__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1002:1: ( ( RULE_HAS_MANY_WORD ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1003:1: ( RULE_HAS_MANY_WORD )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1003:1: ( RULE_HAS_MANY_WORD )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1004:1: RULE_HAS_MANY_WORD
            {
             before(grammarAccess.getHasManyAccess().getHAS_MANY_WORDTerminalRuleCall_0()); 
            match(input,RULE_HAS_MANY_WORD,FOLLOW_RULE_HAS_MANY_WORD_in_rule__HasMany__Group__0__Impl2014); 
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1015:1: rule__HasMany__Group__1 : rule__HasMany__Group__1__Impl ;
    public final void rule__HasMany__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1019:1: ( rule__HasMany__Group__1__Impl )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1020:2: rule__HasMany__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__HasMany__Group__1__Impl_in_rule__HasMany__Group__12043);
            rule__HasMany__Group__1__Impl();

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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1026:1: rule__HasMany__Group__1__Impl : ( ( rule__HasMany__NameAssignment_1 ) ) ;
    public final void rule__HasMany__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1030:1: ( ( ( rule__HasMany__NameAssignment_1 ) ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1031:1: ( ( rule__HasMany__NameAssignment_1 ) )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1031:1: ( ( rule__HasMany__NameAssignment_1 ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1032:1: ( rule__HasMany__NameAssignment_1 )
            {
             before(grammarAccess.getHasManyAccess().getNameAssignment_1()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1033:1: ( rule__HasMany__NameAssignment_1 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1033:2: rule__HasMany__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__HasMany__NameAssignment_1_in_rule__HasMany__Group__1__Impl2070);
            rule__HasMany__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHasManyAccess().getNameAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__HasAndBelongsToMany__Group__0"
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1047:1: rule__HasAndBelongsToMany__Group__0 : rule__HasAndBelongsToMany__Group__0__Impl rule__HasAndBelongsToMany__Group__1 ;
    public final void rule__HasAndBelongsToMany__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1051:1: ( rule__HasAndBelongsToMany__Group__0__Impl rule__HasAndBelongsToMany__Group__1 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1052:2: rule__HasAndBelongsToMany__Group__0__Impl rule__HasAndBelongsToMany__Group__1
            {
            pushFollow(FOLLOW_rule__HasAndBelongsToMany__Group__0__Impl_in_rule__HasAndBelongsToMany__Group__02104);
            rule__HasAndBelongsToMany__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HasAndBelongsToMany__Group__1_in_rule__HasAndBelongsToMany__Group__02107);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1059:1: rule__HasAndBelongsToMany__Group__0__Impl : ( RULE_HAS_AND_BELONGS_TO_MANY_WORD ) ;
    public final void rule__HasAndBelongsToMany__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1063:1: ( ( RULE_HAS_AND_BELONGS_TO_MANY_WORD ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1064:1: ( RULE_HAS_AND_BELONGS_TO_MANY_WORD )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1064:1: ( RULE_HAS_AND_BELONGS_TO_MANY_WORD )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1065:1: RULE_HAS_AND_BELONGS_TO_MANY_WORD
            {
             before(grammarAccess.getHasAndBelongsToManyAccess().getHAS_AND_BELONGS_TO_MANY_WORDTerminalRuleCall_0()); 
            match(input,RULE_HAS_AND_BELONGS_TO_MANY_WORD,FOLLOW_RULE_HAS_AND_BELONGS_TO_MANY_WORD_in_rule__HasAndBelongsToMany__Group__0__Impl2134); 
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1076:1: rule__HasAndBelongsToMany__Group__1 : rule__HasAndBelongsToMany__Group__1__Impl ;
    public final void rule__HasAndBelongsToMany__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1080:1: ( rule__HasAndBelongsToMany__Group__1__Impl )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1081:2: rule__HasAndBelongsToMany__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__HasAndBelongsToMany__Group__1__Impl_in_rule__HasAndBelongsToMany__Group__12163);
            rule__HasAndBelongsToMany__Group__1__Impl();

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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1087:1: rule__HasAndBelongsToMany__Group__1__Impl : ( ( rule__HasAndBelongsToMany__NameAssignment_1 ) ) ;
    public final void rule__HasAndBelongsToMany__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1091:1: ( ( ( rule__HasAndBelongsToMany__NameAssignment_1 ) ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1092:1: ( ( rule__HasAndBelongsToMany__NameAssignment_1 ) )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1092:1: ( ( rule__HasAndBelongsToMany__NameAssignment_1 ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1093:1: ( rule__HasAndBelongsToMany__NameAssignment_1 )
            {
             before(grammarAccess.getHasAndBelongsToManyAccess().getNameAssignment_1()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1094:1: ( rule__HasAndBelongsToMany__NameAssignment_1 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1094:2: rule__HasAndBelongsToMany__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__HasAndBelongsToMany__NameAssignment_1_in_rule__HasAndBelongsToMany__Group__1__Impl2190);
            rule__HasAndBelongsToMany__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHasAndBelongsToManyAccess().getNameAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__HashKeyValue__Group__0"
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1112:1: rule__HashKeyValue__Group__0 : rule__HashKeyValue__Group__0__Impl rule__HashKeyValue__Group__1 ;
    public final void rule__HashKeyValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1116:1: ( rule__HashKeyValue__Group__0__Impl rule__HashKeyValue__Group__1 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1117:2: rule__HashKeyValue__Group__0__Impl rule__HashKeyValue__Group__1
            {
            pushFollow(FOLLOW_rule__HashKeyValue__Group__0__Impl_in_rule__HashKeyValue__Group__02228);
            rule__HashKeyValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HashKeyValue__Group__1_in_rule__HashKeyValue__Group__02231);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1124:1: rule__HashKeyValue__Group__0__Impl : ( ',' ) ;
    public final void rule__HashKeyValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1128:1: ( ( ',' ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1129:1: ( ',' )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1129:1: ( ',' )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1130:1: ','
            {
             before(grammarAccess.getHashKeyValueAccess().getCommaKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__HashKeyValue__Group__0__Impl2259); 
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1143:1: rule__HashKeyValue__Group__1 : rule__HashKeyValue__Group__1__Impl rule__HashKeyValue__Group__2 ;
    public final void rule__HashKeyValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1147:1: ( rule__HashKeyValue__Group__1__Impl rule__HashKeyValue__Group__2 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1148:2: rule__HashKeyValue__Group__1__Impl rule__HashKeyValue__Group__2
            {
            pushFollow(FOLLOW_rule__HashKeyValue__Group__1__Impl_in_rule__HashKeyValue__Group__12290);
            rule__HashKeyValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HashKeyValue__Group__2_in_rule__HashKeyValue__Group__12293);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1155:1: rule__HashKeyValue__Group__1__Impl : ( ( ' ' )* ) ;
    public final void rule__HashKeyValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1159:1: ( ( ( ' ' )* ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1160:1: ( ( ' ' )* )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1160:1: ( ( ' ' )* )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1161:1: ( ' ' )*
            {
             before(grammarAccess.getHashKeyValueAccess().getSpaceKeyword_1()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1162:1: ( ' ' )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==21) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1163:2: ' '
            	    {
            	    match(input,21,FOLLOW_21_in_rule__HashKeyValue__Group__1__Impl2322); 

            	    }
            	    break;

            	default :
            	    break loop15;
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1174:1: rule__HashKeyValue__Group__2 : rule__HashKeyValue__Group__2__Impl rule__HashKeyValue__Group__3 ;
    public final void rule__HashKeyValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1178:1: ( rule__HashKeyValue__Group__2__Impl rule__HashKeyValue__Group__3 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1179:2: rule__HashKeyValue__Group__2__Impl rule__HashKeyValue__Group__3
            {
            pushFollow(FOLLOW_rule__HashKeyValue__Group__2__Impl_in_rule__HashKeyValue__Group__22355);
            rule__HashKeyValue__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HashKeyValue__Group__3_in_rule__HashKeyValue__Group__22358);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1186:1: rule__HashKeyValue__Group__2__Impl : ( ( rule__HashKeyValue__Alternatives_2 ) ) ;
    public final void rule__HashKeyValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1190:1: ( ( ( rule__HashKeyValue__Alternatives_2 ) ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1191:1: ( ( rule__HashKeyValue__Alternatives_2 ) )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1191:1: ( ( rule__HashKeyValue__Alternatives_2 ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1192:1: ( rule__HashKeyValue__Alternatives_2 )
            {
             before(grammarAccess.getHashKeyValueAccess().getAlternatives_2()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1193:1: ( rule__HashKeyValue__Alternatives_2 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1193:2: rule__HashKeyValue__Alternatives_2
            {
            pushFollow(FOLLOW_rule__HashKeyValue__Alternatives_2_in_rule__HashKeyValue__Group__2__Impl2385);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1203:1: rule__HashKeyValue__Group__3 : rule__HashKeyValue__Group__3__Impl rule__HashKeyValue__Group__4 ;
    public final void rule__HashKeyValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1207:1: ( rule__HashKeyValue__Group__3__Impl rule__HashKeyValue__Group__4 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1208:2: rule__HashKeyValue__Group__3__Impl rule__HashKeyValue__Group__4
            {
            pushFollow(FOLLOW_rule__HashKeyValue__Group__3__Impl_in_rule__HashKeyValue__Group__32415);
            rule__HashKeyValue__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HashKeyValue__Group__4_in_rule__HashKeyValue__Group__32418);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1215:1: rule__HashKeyValue__Group__3__Impl : ( ( ' ' )* ) ;
    public final void rule__HashKeyValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1219:1: ( ( ( ' ' )* ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1220:1: ( ( ' ' )* )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1220:1: ( ( ' ' )* )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1221:1: ( ' ' )*
            {
             before(grammarAccess.getHashKeyValueAccess().getSpaceKeyword_3()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1222:1: ( ' ' )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==21) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1223:2: ' '
            	    {
            	    match(input,21,FOLLOW_21_in_rule__HashKeyValue__Group__3__Impl2447); 

            	    }
            	    break;

            	default :
            	    break loop16;
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1234:1: rule__HashKeyValue__Group__4 : rule__HashKeyValue__Group__4__Impl ;
    public final void rule__HashKeyValue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1238:1: ( rule__HashKeyValue__Group__4__Impl )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1239:2: rule__HashKeyValue__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__HashKeyValue__Group__4__Impl_in_rule__HashKeyValue__Group__42480);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1245:1: rule__HashKeyValue__Group__4__Impl : ( ( rule__HashKeyValue__ValueAssignment_4 ) ) ;
    public final void rule__HashKeyValue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1249:1: ( ( ( rule__HashKeyValue__ValueAssignment_4 ) ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1250:1: ( ( rule__HashKeyValue__ValueAssignment_4 ) )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1250:1: ( ( rule__HashKeyValue__ValueAssignment_4 ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1251:1: ( rule__HashKeyValue__ValueAssignment_4 )
            {
             before(grammarAccess.getHashKeyValueAccess().getValueAssignment_4()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1252:1: ( rule__HashKeyValue__ValueAssignment_4 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1252:2: rule__HashKeyValue__ValueAssignment_4
            {
            pushFollow(FOLLOW_rule__HashKeyValue__ValueAssignment_4_in_rule__HashKeyValue__Group__4__Impl2507);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1272:1: rule__HashKeyValue__Group_2_0__0 : rule__HashKeyValue__Group_2_0__0__Impl rule__HashKeyValue__Group_2_0__1 ;
    public final void rule__HashKeyValue__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1276:1: ( rule__HashKeyValue__Group_2_0__0__Impl rule__HashKeyValue__Group_2_0__1 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1277:2: rule__HashKeyValue__Group_2_0__0__Impl rule__HashKeyValue__Group_2_0__1
            {
            pushFollow(FOLLOW_rule__HashKeyValue__Group_2_0__0__Impl_in_rule__HashKeyValue__Group_2_0__02547);
            rule__HashKeyValue__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HashKeyValue__Group_2_0__1_in_rule__HashKeyValue__Group_2_0__02550);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1284:1: rule__HashKeyValue__Group_2_0__0__Impl : ( ( rule__HashKeyValue__KeyAssignment_2_0_0 ) ) ;
    public final void rule__HashKeyValue__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1288:1: ( ( ( rule__HashKeyValue__KeyAssignment_2_0_0 ) ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1289:1: ( ( rule__HashKeyValue__KeyAssignment_2_0_0 ) )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1289:1: ( ( rule__HashKeyValue__KeyAssignment_2_0_0 ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1290:1: ( rule__HashKeyValue__KeyAssignment_2_0_0 )
            {
             before(grammarAccess.getHashKeyValueAccess().getKeyAssignment_2_0_0()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1291:1: ( rule__HashKeyValue__KeyAssignment_2_0_0 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1291:2: rule__HashKeyValue__KeyAssignment_2_0_0
            {
            pushFollow(FOLLOW_rule__HashKeyValue__KeyAssignment_2_0_0_in_rule__HashKeyValue__Group_2_0__0__Impl2577);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1301:1: rule__HashKeyValue__Group_2_0__1 : rule__HashKeyValue__Group_2_0__1__Impl ;
    public final void rule__HashKeyValue__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1305:1: ( rule__HashKeyValue__Group_2_0__1__Impl )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1306:2: rule__HashKeyValue__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_rule__HashKeyValue__Group_2_0__1__Impl_in_rule__HashKeyValue__Group_2_0__12607);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1312:1: rule__HashKeyValue__Group_2_0__1__Impl : ( ':' ) ;
    public final void rule__HashKeyValue__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1316:1: ( ( ':' ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1317:1: ( ':' )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1317:1: ( ':' )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1318:1: ':'
            {
             before(grammarAccess.getHashKeyValueAccess().getColonKeyword_2_0_1()); 
            match(input,25,FOLLOW_25_in_rule__HashKeyValue__Group_2_0__1__Impl2635); 
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1335:1: rule__HashKeyValue__Group_2_1__0 : rule__HashKeyValue__Group_2_1__0__Impl rule__HashKeyValue__Group_2_1__1 ;
    public final void rule__HashKeyValue__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1339:1: ( rule__HashKeyValue__Group_2_1__0__Impl rule__HashKeyValue__Group_2_1__1 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1340:2: rule__HashKeyValue__Group_2_1__0__Impl rule__HashKeyValue__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__HashKeyValue__Group_2_1__0__Impl_in_rule__HashKeyValue__Group_2_1__02670);
            rule__HashKeyValue__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HashKeyValue__Group_2_1__1_in_rule__HashKeyValue__Group_2_1__02673);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1347:1: rule__HashKeyValue__Group_2_1__0__Impl : ( ( rule__HashKeyValue__KeyAssignment_2_1_0 ) ) ;
    public final void rule__HashKeyValue__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1351:1: ( ( ( rule__HashKeyValue__KeyAssignment_2_1_0 ) ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1352:1: ( ( rule__HashKeyValue__KeyAssignment_2_1_0 ) )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1352:1: ( ( rule__HashKeyValue__KeyAssignment_2_1_0 ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1353:1: ( rule__HashKeyValue__KeyAssignment_2_1_0 )
            {
             before(grammarAccess.getHashKeyValueAccess().getKeyAssignment_2_1_0()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1354:1: ( rule__HashKeyValue__KeyAssignment_2_1_0 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1354:2: rule__HashKeyValue__KeyAssignment_2_1_0
            {
            pushFollow(FOLLOW_rule__HashKeyValue__KeyAssignment_2_1_0_in_rule__HashKeyValue__Group_2_1__0__Impl2700);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1364:1: rule__HashKeyValue__Group_2_1__1 : rule__HashKeyValue__Group_2_1__1__Impl rule__HashKeyValue__Group_2_1__2 ;
    public final void rule__HashKeyValue__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1368:1: ( rule__HashKeyValue__Group_2_1__1__Impl rule__HashKeyValue__Group_2_1__2 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1369:2: rule__HashKeyValue__Group_2_1__1__Impl rule__HashKeyValue__Group_2_1__2
            {
            pushFollow(FOLLOW_rule__HashKeyValue__Group_2_1__1__Impl_in_rule__HashKeyValue__Group_2_1__12730);
            rule__HashKeyValue__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HashKeyValue__Group_2_1__2_in_rule__HashKeyValue__Group_2_1__12733);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1376:1: rule__HashKeyValue__Group_2_1__1__Impl : ( ( ' ' )* ) ;
    public final void rule__HashKeyValue__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1380:1: ( ( ( ' ' )* ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1381:1: ( ( ' ' )* )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1381:1: ( ( ' ' )* )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1382:1: ( ' ' )*
            {
             before(grammarAccess.getHashKeyValueAccess().getSpaceKeyword_2_1_1()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1383:1: ( ' ' )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==21) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1384:2: ' '
            	    {
            	    match(input,21,FOLLOW_21_in_rule__HashKeyValue__Group_2_1__1__Impl2762); 

            	    }
            	    break;

            	default :
            	    break loop17;
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1395:1: rule__HashKeyValue__Group_2_1__2 : rule__HashKeyValue__Group_2_1__2__Impl ;
    public final void rule__HashKeyValue__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1399:1: ( rule__HashKeyValue__Group_2_1__2__Impl )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1400:2: rule__HashKeyValue__Group_2_1__2__Impl
            {
            pushFollow(FOLLOW_rule__HashKeyValue__Group_2_1__2__Impl_in_rule__HashKeyValue__Group_2_1__22795);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1406:1: rule__HashKeyValue__Group_2_1__2__Impl : ( '=>' ) ;
    public final void rule__HashKeyValue__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1410:1: ( ( '=>' ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1411:1: ( '=>' )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1411:1: ( '=>' )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1412:1: '=>'
            {
             before(grammarAccess.getHashKeyValueAccess().getEqualsSignGreaterThanSignKeyword_2_1_2()); 
            match(input,26,FOLLOW_26_in_rule__HashKeyValue__Group_2_1__2__Impl2823); 
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


    // $ANTLR start "rule__BelongsTo__Group__0"
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1431:1: rule__BelongsTo__Group__0 : rule__BelongsTo__Group__0__Impl rule__BelongsTo__Group__1 ;
    public final void rule__BelongsTo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1435:1: ( rule__BelongsTo__Group__0__Impl rule__BelongsTo__Group__1 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1436:2: rule__BelongsTo__Group__0__Impl rule__BelongsTo__Group__1
            {
            pushFollow(FOLLOW_rule__BelongsTo__Group__0__Impl_in_rule__BelongsTo__Group__02860);
            rule__BelongsTo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BelongsTo__Group__1_in_rule__BelongsTo__Group__02863);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1443:1: rule__BelongsTo__Group__0__Impl : ( RULE_BELONGS_TO_WORD ) ;
    public final void rule__BelongsTo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1447:1: ( ( RULE_BELONGS_TO_WORD ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1448:1: ( RULE_BELONGS_TO_WORD )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1448:1: ( RULE_BELONGS_TO_WORD )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1449:1: RULE_BELONGS_TO_WORD
            {
             before(grammarAccess.getBelongsToAccess().getBELONGS_TO_WORDTerminalRuleCall_0()); 
            match(input,RULE_BELONGS_TO_WORD,FOLLOW_RULE_BELONGS_TO_WORD_in_rule__BelongsTo__Group__0__Impl2890); 
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1460:1: rule__BelongsTo__Group__1 : rule__BelongsTo__Group__1__Impl rule__BelongsTo__Group__2 ;
    public final void rule__BelongsTo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1464:1: ( rule__BelongsTo__Group__1__Impl rule__BelongsTo__Group__2 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1465:2: rule__BelongsTo__Group__1__Impl rule__BelongsTo__Group__2
            {
            pushFollow(FOLLOW_rule__BelongsTo__Group__1__Impl_in_rule__BelongsTo__Group__12919);
            rule__BelongsTo__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BelongsTo__Group__2_in_rule__BelongsTo__Group__12922);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1472:1: rule__BelongsTo__Group__1__Impl : ( ( ' ' )* ) ;
    public final void rule__BelongsTo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1476:1: ( ( ( ' ' )* ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1477:1: ( ( ' ' )* )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1477:1: ( ( ' ' )* )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1478:1: ( ' ' )*
            {
             before(grammarAccess.getBelongsToAccess().getSpaceKeyword_1()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1479:1: ( ' ' )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==21) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1480:2: ' '
            	    {
            	    match(input,21,FOLLOW_21_in_rule__BelongsTo__Group__1__Impl2951); 

            	    }
            	    break;

            	default :
            	    break loop18;
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1491:1: rule__BelongsTo__Group__2 : rule__BelongsTo__Group__2__Impl rule__BelongsTo__Group__3 ;
    public final void rule__BelongsTo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1495:1: ( rule__BelongsTo__Group__2__Impl rule__BelongsTo__Group__3 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1496:2: rule__BelongsTo__Group__2__Impl rule__BelongsTo__Group__3
            {
            pushFollow(FOLLOW_rule__BelongsTo__Group__2__Impl_in_rule__BelongsTo__Group__22984);
            rule__BelongsTo__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BelongsTo__Group__3_in_rule__BelongsTo__Group__22987);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1503:1: rule__BelongsTo__Group__2__Impl : ( ( rule__BelongsTo__NameAssignment_2 ) ) ;
    public final void rule__BelongsTo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1507:1: ( ( ( rule__BelongsTo__NameAssignment_2 ) ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1508:1: ( ( rule__BelongsTo__NameAssignment_2 ) )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1508:1: ( ( rule__BelongsTo__NameAssignment_2 ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1509:1: ( rule__BelongsTo__NameAssignment_2 )
            {
             before(grammarAccess.getBelongsToAccess().getNameAssignment_2()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1510:1: ( rule__BelongsTo__NameAssignment_2 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1510:2: rule__BelongsTo__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__BelongsTo__NameAssignment_2_in_rule__BelongsTo__Group__2__Impl3014);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1520:1: rule__BelongsTo__Group__3 : rule__BelongsTo__Group__3__Impl rule__BelongsTo__Group__4 ;
    public final void rule__BelongsTo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1524:1: ( rule__BelongsTo__Group__3__Impl rule__BelongsTo__Group__4 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1525:2: rule__BelongsTo__Group__3__Impl rule__BelongsTo__Group__4
            {
            pushFollow(FOLLOW_rule__BelongsTo__Group__3__Impl_in_rule__BelongsTo__Group__33044);
            rule__BelongsTo__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BelongsTo__Group__4_in_rule__BelongsTo__Group__33047);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1532:1: rule__BelongsTo__Group__3__Impl : ( ( ' ' )* ) ;
    public final void rule__BelongsTo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1536:1: ( ( ( ' ' )* ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1537:1: ( ( ' ' )* )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1537:1: ( ( ' ' )* )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1538:1: ( ' ' )*
            {
             before(grammarAccess.getBelongsToAccess().getSpaceKeyword_3()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1539:1: ( ' ' )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==21) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1540:2: ' '
            	    {
            	    match(input,21,FOLLOW_21_in_rule__BelongsTo__Group__3__Impl3076); 

            	    }
            	    break;

            	default :
            	    break loop19;
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1551:1: rule__BelongsTo__Group__4 : rule__BelongsTo__Group__4__Impl ;
    public final void rule__BelongsTo__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1555:1: ( rule__BelongsTo__Group__4__Impl )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1556:2: rule__BelongsTo__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__BelongsTo__Group__4__Impl_in_rule__BelongsTo__Group__43109);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1562:1: rule__BelongsTo__Group__4__Impl : ( ( rule__BelongsTo__OptionsAssignment_4 )* ) ;
    public final void rule__BelongsTo__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1566:1: ( ( ( rule__BelongsTo__OptionsAssignment_4 )* ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1567:1: ( ( rule__BelongsTo__OptionsAssignment_4 )* )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1567:1: ( ( rule__BelongsTo__OptionsAssignment_4 )* )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1568:1: ( rule__BelongsTo__OptionsAssignment_4 )*
            {
             before(grammarAccess.getBelongsToAccess().getOptionsAssignment_4()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1569:1: ( rule__BelongsTo__OptionsAssignment_4 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==24) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1569:2: rule__BelongsTo__OptionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__BelongsTo__OptionsAssignment_4_in_rule__BelongsTo__Group__4__Impl3136);
            	    rule__BelongsTo__OptionsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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


    // $ANTLR start "rule__Method__Group__0"
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1589:1: rule__Method__Group__0 : rule__Method__Group__0__Impl rule__Method__Group__1 ;
    public final void rule__Method__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1593:1: ( rule__Method__Group__0__Impl rule__Method__Group__1 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1594:2: rule__Method__Group__0__Impl rule__Method__Group__1
            {
            pushFollow(FOLLOW_rule__Method__Group__0__Impl_in_rule__Method__Group__03177);
            rule__Method__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method__Group__1_in_rule__Method__Group__03180);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1601:1: rule__Method__Group__0__Impl : ( RULE_DEF_WORD ) ;
    public final void rule__Method__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1605:1: ( ( RULE_DEF_WORD ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1606:1: ( RULE_DEF_WORD )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1606:1: ( RULE_DEF_WORD )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1607:1: RULE_DEF_WORD
            {
             before(grammarAccess.getMethodAccess().getDEF_WORDTerminalRuleCall_0()); 
            match(input,RULE_DEF_WORD,FOLLOW_RULE_DEF_WORD_in_rule__Method__Group__0__Impl3207); 
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1618:1: rule__Method__Group__1 : rule__Method__Group__1__Impl ;
    public final void rule__Method__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1622:1: ( rule__Method__Group__1__Impl )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1623:2: rule__Method__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Method__Group__1__Impl_in_rule__Method__Group__13236);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1629:1: rule__Method__Group__1__Impl : ( ( rule__Method__NameAssignment_1 ) ) ;
    public final void rule__Method__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1633:1: ( ( ( rule__Method__NameAssignment_1 ) ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1634:1: ( ( rule__Method__NameAssignment_1 ) )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1634:1: ( ( rule__Method__NameAssignment_1 ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1635:1: ( rule__Method__NameAssignment_1 )
            {
             before(grammarAccess.getMethodAccess().getNameAssignment_1()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1636:1: ( rule__Method__NameAssignment_1 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1636:2: rule__Method__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Method__NameAssignment_1_in_rule__Method__Group__1__Impl3263);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1650:1: rule__MethodName__Group__0 : rule__MethodName__Group__0__Impl rule__MethodName__Group__1 ;
    public final void rule__MethodName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1654:1: ( rule__MethodName__Group__0__Impl rule__MethodName__Group__1 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1655:2: rule__MethodName__Group__0__Impl rule__MethodName__Group__1
            {
            pushFollow(FOLLOW_rule__MethodName__Group__0__Impl_in_rule__MethodName__Group__03297);
            rule__MethodName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MethodName__Group__1_in_rule__MethodName__Group__03300);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1662:1: rule__MethodName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__MethodName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1666:1: ( ( RULE_ID ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1667:1: ( RULE_ID )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1667:1: ( RULE_ID )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1668:1: RULE_ID
            {
             before(grammarAccess.getMethodNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MethodName__Group__0__Impl3327); 
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1679:1: rule__MethodName__Group__1 : rule__MethodName__Group__1__Impl ;
    public final void rule__MethodName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1683:1: ( rule__MethodName__Group__1__Impl )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1684:2: rule__MethodName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MethodName__Group__1__Impl_in_rule__MethodName__Group__13356);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1690:1: rule__MethodName__Group__1__Impl : ( ( rule__MethodName__Alternatives_1 )? ) ;
    public final void rule__MethodName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1694:1: ( ( ( rule__MethodName__Alternatives_1 )? ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1695:1: ( ( rule__MethodName__Alternatives_1 )? )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1695:1: ( ( rule__MethodName__Alternatives_1 )? )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1696:1: ( rule__MethodName__Alternatives_1 )?
            {
             before(grammarAccess.getMethodNameAccess().getAlternatives_1()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1697:1: ( rule__MethodName__Alternatives_1 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=19 && LA21_0<=20)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1697:2: rule__MethodName__Alternatives_1
                    {
                    pushFollow(FOLLOW_rule__MethodName__Alternatives_1_in_rule__MethodName__Group__1__Impl3383);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1712:1: rule__Class__NameAssignment_2 : ( ruleNamespacedModuleName ) ;
    public final void rule__Class__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1716:1: ( ( ruleNamespacedModuleName ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1717:1: ( ruleNamespacedModuleName )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1717:1: ( ruleNamespacedModuleName )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1718:1: ruleNamespacedModuleName
            {
             before(grammarAccess.getClassAccess().getNameNamespacedModuleNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleNamespacedModuleName_in_rule__Class__NameAssignment_23423);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1727:1: rule__Class__SuperTypeAssignment_3_3 : ( ruleNamespacedModuleName ) ;
    public final void rule__Class__SuperTypeAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1731:1: ( ( ruleNamespacedModuleName ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1732:1: ( ruleNamespacedModuleName )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1732:1: ( ruleNamespacedModuleName )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1733:1: ruleNamespacedModuleName
            {
             before(grammarAccess.getClassAccess().getSuperTypeNamespacedModuleNameParserRuleCall_3_3_0()); 
            pushFollow(FOLLOW_ruleNamespacedModuleName_in_rule__Class__SuperTypeAssignment_3_33454);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1742:1: rule__Class__ClassElementsAssignment_5 : ( ruleClassElement ) ;
    public final void rule__Class__ClassElementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1746:1: ( ( ruleClassElement ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1747:1: ( ruleClassElement )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1747:1: ( ruleClassElement )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1748:1: ruleClassElement
            {
             before(grammarAccess.getClassAccess().getClassElementsClassElementParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleClassElement_in_rule__Class__ClassElementsAssignment_53485);
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


    // $ANTLR start "rule__HasMany__NameAssignment_1"
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1757:1: rule__HasMany__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__HasMany__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1761:1: ( ( RULE_STRING ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1762:1: ( RULE_STRING )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1762:1: ( RULE_STRING )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1763:1: RULE_STRING
            {
             before(grammarAccess.getHasManyAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__HasMany__NameAssignment_13516); 
             after(grammarAccess.getHasManyAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HasMany__NameAssignment_1"


    // $ANTLR start "rule__HasAndBelongsToMany__NameAssignment_1"
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1772:1: rule__HasAndBelongsToMany__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__HasAndBelongsToMany__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1776:1: ( ( RULE_STRING ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1777:1: ( RULE_STRING )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1777:1: ( RULE_STRING )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1778:1: RULE_STRING
            {
             before(grammarAccess.getHasAndBelongsToManyAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__HasAndBelongsToMany__NameAssignment_13547); 
             after(grammarAccess.getHasAndBelongsToManyAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HasAndBelongsToMany__NameAssignment_1"


    // $ANTLR start "rule__HashKeyValue__KeyAssignment_2_0_0"
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1789:1: rule__HashKeyValue__KeyAssignment_2_0_0 : ( RULE_ID ) ;
    public final void rule__HashKeyValue__KeyAssignment_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1793:1: ( ( RULE_ID ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1794:1: ( RULE_ID )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1794:1: ( RULE_ID )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1795:1: RULE_ID
            {
             before(grammarAccess.getHashKeyValueAccess().getKeyIDTerminalRuleCall_2_0_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__HashKeyValue__KeyAssignment_2_0_03580); 
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1804:1: rule__HashKeyValue__KeyAssignment_2_1_0 : ( ( rule__HashKeyValue__KeyAlternatives_2_1_0_0 ) ) ;
    public final void rule__HashKeyValue__KeyAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1808:1: ( ( ( rule__HashKeyValue__KeyAlternatives_2_1_0_0 ) ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1809:1: ( ( rule__HashKeyValue__KeyAlternatives_2_1_0_0 ) )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1809:1: ( ( rule__HashKeyValue__KeyAlternatives_2_1_0_0 ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1810:1: ( rule__HashKeyValue__KeyAlternatives_2_1_0_0 )
            {
             before(grammarAccess.getHashKeyValueAccess().getKeyAlternatives_2_1_0_0()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1811:1: ( rule__HashKeyValue__KeyAlternatives_2_1_0_0 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1811:2: rule__HashKeyValue__KeyAlternatives_2_1_0_0
            {
            pushFollow(FOLLOW_rule__HashKeyValue__KeyAlternatives_2_1_0_0_in_rule__HashKeyValue__KeyAssignment_2_1_03611);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1820:1: rule__HashKeyValue__ValueAssignment_4 : ( ( rule__HashKeyValue__ValueAlternatives_4_0 ) ) ;
    public final void rule__HashKeyValue__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1824:1: ( ( ( rule__HashKeyValue__ValueAlternatives_4_0 ) ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1825:1: ( ( rule__HashKeyValue__ValueAlternatives_4_0 ) )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1825:1: ( ( rule__HashKeyValue__ValueAlternatives_4_0 ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1826:1: ( rule__HashKeyValue__ValueAlternatives_4_0 )
            {
             before(grammarAccess.getHashKeyValueAccess().getValueAlternatives_4_0()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1827:1: ( rule__HashKeyValue__ValueAlternatives_4_0 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1827:2: rule__HashKeyValue__ValueAlternatives_4_0
            {
            pushFollow(FOLLOW_rule__HashKeyValue__ValueAlternatives_4_0_in_rule__HashKeyValue__ValueAssignment_43644);
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


    // $ANTLR start "rule__BelongsTo__NameAssignment_2"
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1836:1: rule__BelongsTo__NameAssignment_2 : ( ( rule__BelongsTo__NameAlternatives_2_0 ) ) ;
    public final void rule__BelongsTo__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1840:1: ( ( ( rule__BelongsTo__NameAlternatives_2_0 ) ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1841:1: ( ( rule__BelongsTo__NameAlternatives_2_0 ) )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1841:1: ( ( rule__BelongsTo__NameAlternatives_2_0 ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1842:1: ( rule__BelongsTo__NameAlternatives_2_0 )
            {
             before(grammarAccess.getBelongsToAccess().getNameAlternatives_2_0()); 
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1843:1: ( rule__BelongsTo__NameAlternatives_2_0 )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1843:2: rule__BelongsTo__NameAlternatives_2_0
            {
            pushFollow(FOLLOW_rule__BelongsTo__NameAlternatives_2_0_in_rule__BelongsTo__NameAssignment_23677);
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
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1852:1: rule__BelongsTo__OptionsAssignment_4 : ( ruleHashKeyValue ) ;
    public final void rule__BelongsTo__OptionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1856:1: ( ( ruleHashKeyValue ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1857:1: ( ruleHashKeyValue )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1857:1: ( ruleHashKeyValue )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1858:1: ruleHashKeyValue
            {
             before(grammarAccess.getBelongsToAccess().getOptionsHashKeyValueParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleHashKeyValue_in_rule__BelongsTo__OptionsAssignment_43710);
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


    // $ANTLR start "rule__Method__NameAssignment_1"
    // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1867:1: rule__Method__NameAssignment_1 : ( ruleMethodName ) ;
    public final void rule__Method__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1871:1: ( ( ruleMethodName ) )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1872:1: ( ruleMethodName )
            {
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1872:1: ( ruleMethodName )
            // ../co.gruposaberes.model.ui/src-gen/co/gruposaberes/model/ui/contentassist/antlr/internal/InternalRails.g:1873:1: ruleMethodName
            {
             before(grammarAccess.getMethodAccess().getNameMethodNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleMethodName_in_rule__Method__NameAssignment_13741);
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


    protected DFA9 dfa9 = new DFA9(this);
    static final String DFA9_eotS =
        "\4\uffff";
    static final String DFA9_eofS =
        "\4\uffff";
    static final String DFA9_minS =
        "\2\7\2\uffff";
    static final String DFA9_maxS =
        "\2\26\2\uffff";
    static final String DFA9_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA9_specialS =
        "\4\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\3\1\uffff\4\3\10\uffff\1\1\1\2",
            "\1\3\1\uffff\4\3\10\uffff\1\1\1\2",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "621:1: ( rule__Class__Group_3__0 )?";
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
    public static final BitSet FOLLOW_ruleHashKeyValue_in_entryRuleHashKeyValue425 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHashKeyValue432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HashKeyValue__Group__0_in_ruleHashKeyValue458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBelongsTo_in_entryRuleBelongsTo485 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBelongsTo492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BelongsTo__Group__0_in_ruleBelongsTo518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_entryRuleMethod545 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethod552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__0_in_ruleMethod578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodName_in_entryRuleMethodName605 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodName612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodName__Group__0_in_ruleMethodName638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_rule__ClassElement__Alternatives674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationship_in_rule__ClassElement__Alternatives691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHasMany_in_rule__Relationship__Alternatives723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHasAndBelongsToMany_in_rule__Relationship__Alternatives740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBelongsTo_in_rule__Relationship__Alternatives757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HashKeyValue__Group_2_0__0_in_rule__HashKeyValue__Alternatives_2792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HashKeyValue__Group_2_1__0_in_rule__HashKeyValue__Alternatives_2810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SYMBOL_in_rule__HashKeyValue__KeyAlternatives_2_1_0_0843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__HashKeyValue__KeyAlternatives_2_1_0_0860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SYMBOL_in_rule__HashKeyValue__ValueAlternatives_4_0892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__HashKeyValue__ValueAlternatives_4_0909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SYMBOL_in_rule__BelongsTo__NameAlternatives_2_0941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__BelongsTo__NameAlternatives_2_0958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__MethodName__Alternatives_1991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__MethodName__Alternatives_11011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__0__Impl_in_rule__Class__Group__01043 = new BitSet(new long[]{0x0000000000200100L});
    public static final BitSet FOLLOW_rule__Class__Group__1_in_rule__Class__Group__01046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CLASS_WORD_in_rule__Class__Group__0__Impl1073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__1__Impl_in_rule__Class__Group__11102 = new BitSet(new long[]{0x0000000000200100L});
    public static final BitSet FOLLOW_rule__Class__Group__2_in_rule__Class__Group__11105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Class__Group__1__Impl1134 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Class__Group__2__Impl_in_rule__Class__Group__21167 = new BitSet(new long[]{0x0000000000601E80L});
    public static final BitSet FOLLOW_rule__Class__Group__3_in_rule__Class__Group__21170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__NameAssignment_2_in_rule__Class__Group__2__Impl1197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__3__Impl_in_rule__Class__Group__31227 = new BitSet(new long[]{0x0000000000601E80L});
    public static final BitSet FOLLOW_rule__Class__Group__4_in_rule__Class__Group__31230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group_3__0_in_rule__Class__Group__3__Impl1257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__4__Impl_in_rule__Class__Group__41288 = new BitSet(new long[]{0x0000000000601E80L});
    public static final BitSet FOLLOW_rule__Class__Group__5_in_rule__Class__Group__41291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Class__Group__4__Impl1320 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Class__Group__5__Impl_in_rule__Class__Group__51353 = new BitSet(new long[]{0x0000000000601E80L});
    public static final BitSet FOLLOW_rule__Class__Group__6_in_rule__Class__Group__51356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__ClassElementsAssignment_5_in_rule__Class__Group__5__Impl1383 = new BitSet(new long[]{0x0000000000001E02L});
    public static final BitSet FOLLOW_rule__Class__Group__6__Impl_in_rule__Class__Group__61414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_END_WORD_in_rule__Class__Group__6__Impl1441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group_3__0__Impl_in_rule__Class__Group_3__01484 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__Class__Group_3__1_in_rule__Class__Group_3__01487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Class__Group_3__0__Impl1516 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Class__Group_3__1__Impl_in_rule__Class__Group_3__11549 = new BitSet(new long[]{0x0000000000200100L});
    public static final BitSet FOLLOW_rule__Class__Group_3__2_in_rule__Class__Group_3__11552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Class__Group_3__1__Impl1580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group_3__2__Impl_in_rule__Class__Group_3__21611 = new BitSet(new long[]{0x0000000000200100L});
    public static final BitSet FOLLOW_rule__Class__Group_3__3_in_rule__Class__Group_3__21614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Class__Group_3__2__Impl1643 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Class__Group_3__3__Impl_in_rule__Class__Group_3__31676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__SuperTypeAssignment_3_3_in_rule__Class__Group_3__3__Impl1703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespacedModuleName__Group__0__Impl_in_rule__NamespacedModuleName__Group__01741 = new BitSet(new long[]{0x0000000000200100L});
    public static final BitSet FOLLOW_rule__NamespacedModuleName__Group__1_in_rule__NamespacedModuleName__Group__01744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespacedModuleName__Group_0__0_in_rule__NamespacedModuleName__Group__0__Impl1771 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__NamespacedModuleName__Group__1__Impl_in_rule__NamespacedModuleName__Group__11802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NamespacedModuleName__Group__1__Impl1829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespacedModuleName__Group_0__0__Impl_in_rule__NamespacedModuleName__Group_0__01862 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__NamespacedModuleName__Group_0__1_in_rule__NamespacedModuleName__Group_0__01865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NamespacedModuleName__Group_0__0__Impl1892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespacedModuleName__Group_0__1__Impl_in_rule__NamespacedModuleName__Group_0__11921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__NamespacedModuleName__Group_0__1__Impl1949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HasMany__Group__0__Impl_in_rule__HasMany__Group__01984 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__HasMany__Group__1_in_rule__HasMany__Group__01987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HAS_MANY_WORD_in_rule__HasMany__Group__0__Impl2014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HasMany__Group__1__Impl_in_rule__HasMany__Group__12043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HasMany__NameAssignment_1_in_rule__HasMany__Group__1__Impl2070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HasAndBelongsToMany__Group__0__Impl_in_rule__HasAndBelongsToMany__Group__02104 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__HasAndBelongsToMany__Group__1_in_rule__HasAndBelongsToMany__Group__02107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HAS_AND_BELONGS_TO_MANY_WORD_in_rule__HasAndBelongsToMany__Group__0__Impl2134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HasAndBelongsToMany__Group__1__Impl_in_rule__HasAndBelongsToMany__Group__12163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HasAndBelongsToMany__NameAssignment_1_in_rule__HasAndBelongsToMany__Group__1__Impl2190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HashKeyValue__Group__0__Impl_in_rule__HashKeyValue__Group__02228 = new BitSet(new long[]{0x0000000000200130L});
    public static final BitSet FOLLOW_rule__HashKeyValue__Group__1_in_rule__HashKeyValue__Group__02231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__HashKeyValue__Group__0__Impl2259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HashKeyValue__Group__1__Impl_in_rule__HashKeyValue__Group__12290 = new BitSet(new long[]{0x0000000000200130L});
    public static final BitSet FOLLOW_rule__HashKeyValue__Group__2_in_rule__HashKeyValue__Group__12293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__HashKeyValue__Group__1__Impl2322 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__HashKeyValue__Group__2__Impl_in_rule__HashKeyValue__Group__22355 = new BitSet(new long[]{0x0000000000200030L});
    public static final BitSet FOLLOW_rule__HashKeyValue__Group__3_in_rule__HashKeyValue__Group__22358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HashKeyValue__Alternatives_2_in_rule__HashKeyValue__Group__2__Impl2385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HashKeyValue__Group__3__Impl_in_rule__HashKeyValue__Group__32415 = new BitSet(new long[]{0x0000000000200030L});
    public static final BitSet FOLLOW_rule__HashKeyValue__Group__4_in_rule__HashKeyValue__Group__32418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__HashKeyValue__Group__3__Impl2447 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__HashKeyValue__Group__4__Impl_in_rule__HashKeyValue__Group__42480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HashKeyValue__ValueAssignment_4_in_rule__HashKeyValue__Group__4__Impl2507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HashKeyValue__Group_2_0__0__Impl_in_rule__HashKeyValue__Group_2_0__02547 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__HashKeyValue__Group_2_0__1_in_rule__HashKeyValue__Group_2_0__02550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HashKeyValue__KeyAssignment_2_0_0_in_rule__HashKeyValue__Group_2_0__0__Impl2577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HashKeyValue__Group_2_0__1__Impl_in_rule__HashKeyValue__Group_2_0__12607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__HashKeyValue__Group_2_0__1__Impl2635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HashKeyValue__Group_2_1__0__Impl_in_rule__HashKeyValue__Group_2_1__02670 = new BitSet(new long[]{0x0000000004200000L});
    public static final BitSet FOLLOW_rule__HashKeyValue__Group_2_1__1_in_rule__HashKeyValue__Group_2_1__02673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HashKeyValue__KeyAssignment_2_1_0_in_rule__HashKeyValue__Group_2_1__0__Impl2700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HashKeyValue__Group_2_1__1__Impl_in_rule__HashKeyValue__Group_2_1__12730 = new BitSet(new long[]{0x0000000004200000L});
    public static final BitSet FOLLOW_rule__HashKeyValue__Group_2_1__2_in_rule__HashKeyValue__Group_2_1__12733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__HashKeyValue__Group_2_1__1__Impl2762 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__HashKeyValue__Group_2_1__2__Impl_in_rule__HashKeyValue__Group_2_1__22795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__HashKeyValue__Group_2_1__2__Impl2823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BelongsTo__Group__0__Impl_in_rule__BelongsTo__Group__02860 = new BitSet(new long[]{0x0000000000200030L});
    public static final BitSet FOLLOW_rule__BelongsTo__Group__1_in_rule__BelongsTo__Group__02863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BELONGS_TO_WORD_in_rule__BelongsTo__Group__0__Impl2890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BelongsTo__Group__1__Impl_in_rule__BelongsTo__Group__12919 = new BitSet(new long[]{0x0000000000200030L});
    public static final BitSet FOLLOW_rule__BelongsTo__Group__2_in_rule__BelongsTo__Group__12922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__BelongsTo__Group__1__Impl2951 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__BelongsTo__Group__2__Impl_in_rule__BelongsTo__Group__22984 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_rule__BelongsTo__Group__3_in_rule__BelongsTo__Group__22987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BelongsTo__NameAssignment_2_in_rule__BelongsTo__Group__2__Impl3014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BelongsTo__Group__3__Impl_in_rule__BelongsTo__Group__33044 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_rule__BelongsTo__Group__4_in_rule__BelongsTo__Group__33047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__BelongsTo__Group__3__Impl3076 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__BelongsTo__Group__4__Impl_in_rule__BelongsTo__Group__43109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BelongsTo__OptionsAssignment_4_in_rule__BelongsTo__Group__4__Impl3136 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Method__Group__0__Impl_in_rule__Method__Group__03177 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Method__Group__1_in_rule__Method__Group__03180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DEF_WORD_in_rule__Method__Group__0__Impl3207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__Group__1__Impl_in_rule__Method__Group__13236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method__NameAssignment_1_in_rule__Method__Group__1__Impl3263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodName__Group__0__Impl_in_rule__MethodName__Group__03297 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_rule__MethodName__Group__1_in_rule__MethodName__Group__03300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MethodName__Group__0__Impl3327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodName__Group__1__Impl_in_rule__MethodName__Group__13356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodName__Alternatives_1_in_rule__MethodName__Group__1__Impl3383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespacedModuleName_in_rule__Class__NameAssignment_23423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespacedModuleName_in_rule__Class__SuperTypeAssignment_3_33454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassElement_in_rule__Class__ClassElementsAssignment_53485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__HasMany__NameAssignment_13516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__HasAndBelongsToMany__NameAssignment_13547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__HashKeyValue__KeyAssignment_2_0_03580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HashKeyValue__KeyAlternatives_2_1_0_0_in_rule__HashKeyValue__KeyAssignment_2_1_03611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HashKeyValue__ValueAlternatives_4_0_in_rule__HashKeyValue__ValueAssignment_43644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BelongsTo__NameAlternatives_2_0_in_rule__BelongsTo__NameAssignment_23677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHashKeyValue_in_rule__BelongsTo__OptionsAssignment_43710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodName_in_rule__Method__NameAssignment_13741 = new BitSet(new long[]{0x0000000000000002L});

}