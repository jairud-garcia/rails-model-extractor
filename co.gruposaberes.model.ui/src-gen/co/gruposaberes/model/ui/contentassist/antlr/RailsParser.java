/*
 * generated by Xtext
 */
package co.gruposaberes.model.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import co.gruposaberes.model.services.RailsGrammarAccess;

public class RailsParser extends AbstractContentAssistParser {
	
	@Inject
	private RailsGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected co.gruposaberes.model.ui.contentassist.antlr.internal.InternalRailsParser createParser() {
		co.gruposaberes.model.ui.contentassist.antlr.internal.InternalRailsParser result = new co.gruposaberes.model.ui.contentassist.antlr.internal.InternalRailsParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getClassElementAccess().getAlternatives(), "rule__ClassElement__Alternatives");
					put(grammarAccess.getMethodCallParametersAccess().getAlternatives(), "rule__MethodCallParameters__Alternatives");
					put(grammarAccess.getExpressionWithOutBracketAccess().getAlternatives(), "rule__ExpressionWithOutBracket__Alternatives");
					put(grammarAccess.getExpressionAccess().getAlternatives(), "rule__Expression__Alternatives");
					put(grammarAccess.getOperationsChainAccess().getAlternatives_1_0(), "rule__OperationsChain__Alternatives_1_0");
					put(grammarAccess.getOperationsChainAccess().getAlternatives_1_1(), "rule__OperationsChain__Alternatives_1_1");
					put(grammarAccess.getRelationshipAccess().getAlternatives(), "rule__Relationship__Alternatives");
					put(grammarAccess.getHasManyAccess().getNameAlternatives_2_0(), "rule__HasMany__NameAlternatives_2_0");
					put(grammarAccess.getHasOneAccess().getNameAlternatives_2_0(), "rule__HasOne__NameAlternatives_2_0");
					put(grammarAccess.getHasAndBelongsToManyAccess().getNameAlternatives_2_0(), "rule__HasAndBelongsToMany__NameAlternatives_2_0");
					put(grammarAccess.getBelongsToAccess().getNameAlternatives_2_0(), "rule__BelongsTo__NameAlternatives_2_0");
					put(grammarAccess.getHashKeyValueAccess().getAlternatives_2(), "rule__HashKeyValue__Alternatives_2");
					put(grammarAccess.getHashKeyValueAccess().getKeyAlternatives_2_1_0_0(), "rule__HashKeyValue__KeyAlternatives_2_1_0_0");
					put(grammarAccess.getHashKeyValueAccess().getValueAlternatives_4_0(), "rule__HashKeyValue__ValueAlternatives_4_0");
					put(grammarAccess.getIgnoredHashKeyValueAccess().getAlternatives_1(), "rule__IgnoredHashKeyValue__Alternatives_1");
					put(grammarAccess.getIgnoredHashKeyValueAccess().getAlternatives_1_1_0(), "rule__IgnoredHashKeyValue__Alternatives_1_1_0");
					put(grammarAccess.getIgnoredHashKeyValueAccess().getAlternatives_3(), "rule__IgnoredHashKeyValue__Alternatives_3");
					put(grammarAccess.getMethodNameAccess().getAlternatives_1(), "rule__MethodName__Alternatives_1");
					put(grammarAccess.getBracketBlockAccess().getAlternatives(), "rule__BracketBlock__Alternatives");
					put(grammarAccess.getClassAccess().getGroup(), "rule__Class__Group__0");
					put(grammarAccess.getClassAccess().getGroup_3(), "rule__Class__Group_3__0");
					put(grammarAccess.getNamespacedModuleNameAccess().getGroup(), "rule__NamespacedModuleName__Group__0");
					put(grammarAccess.getNamespacedModuleNameAccess().getGroup_0(), "rule__NamespacedModuleName__Group_0__0");
					put(grammarAccess.getMethodChainCallAccess().getGroup(), "rule__MethodChainCall__Group__0");
					put(grammarAccess.getMethodChainCallAccess().getGroup_1(), "rule__MethodChainCall__Group_1__0");
					put(grammarAccess.getExpressionsSeparatedByCommasAccess().getGroup(), "rule__ExpressionsSeparatedByCommas__Group__0");
					put(grammarAccess.getExpressionsSeparatedByCommasAccess().getGroup_1(), "rule__ExpressionsSeparatedByCommas__Group_1__0");
					put(grammarAccess.getOperationsChainAccess().getGroup(), "rule__OperationsChain__Group__0");
					put(grammarAccess.getOperationsChainAccess().getGroup_1(), "rule__OperationsChain__Group_1__0");
					put(grammarAccess.getHasManyAccess().getGroup(), "rule__HasMany__Group__0");
					put(grammarAccess.getHasOneAccess().getGroup(), "rule__HasOne__Group__0");
					put(grammarAccess.getHasAndBelongsToManyAccess().getGroup(), "rule__HasAndBelongsToMany__Group__0");
					put(grammarAccess.getBelongsToAccess().getGroup(), "rule__BelongsTo__Group__0");
					put(grammarAccess.getHashKeyValueAccess().getGroup(), "rule__HashKeyValue__Group__0");
					put(grammarAccess.getHashKeyValueAccess().getGroup_2_0(), "rule__HashKeyValue__Group_2_0__0");
					put(grammarAccess.getHashKeyValueAccess().getGroup_2_1(), "rule__HashKeyValue__Group_2_1__0");
					put(grammarAccess.getIgnoredHashKeyValueAccess().getGroup(), "rule__IgnoredHashKeyValue__Group__0");
					put(grammarAccess.getIgnoredHashKeyValueAccess().getGroup_1_0(), "rule__IgnoredHashKeyValue__Group_1_0__0");
					put(grammarAccess.getIgnoredHashKeyValueAccess().getGroup_1_1(), "rule__IgnoredHashKeyValue__Group_1_1__0");
					put(grammarAccess.getMethodAccess().getGroup(), "rule__Method__Group__0");
					put(grammarAccess.getMethodNameAccess().getGroup(), "rule__MethodName__Group__0");
					put(grammarAccess.getBracketBlockAccess().getGroup_1(), "rule__BracketBlock__Group_1__0");
					put(grammarAccess.getClassAccess().getNameAssignment_2(), "rule__Class__NameAssignment_2");
					put(grammarAccess.getClassAccess().getSuperTypeAssignment_3_3(), "rule__Class__SuperTypeAssignment_3_3");
					put(grammarAccess.getClassAccess().getClassElementsAssignment_5(), "rule__Class__ClassElementsAssignment_5");
					put(grammarAccess.getHasManyAccess().getNameAssignment_2(), "rule__HasMany__NameAssignment_2");
					put(grammarAccess.getHasManyAccess().getOptionsAssignment_4(), "rule__HasMany__OptionsAssignment_4");
					put(grammarAccess.getHasOneAccess().getNameAssignment_2(), "rule__HasOne__NameAssignment_2");
					put(grammarAccess.getHasOneAccess().getOptionsAssignment_4(), "rule__HasOne__OptionsAssignment_4");
					put(grammarAccess.getHasAndBelongsToManyAccess().getNameAssignment_2(), "rule__HasAndBelongsToMany__NameAssignment_2");
					put(grammarAccess.getHasAndBelongsToManyAccess().getOptionsAssignment_4(), "rule__HasAndBelongsToMany__OptionsAssignment_4");
					put(grammarAccess.getBelongsToAccess().getNameAssignment_2(), "rule__BelongsTo__NameAssignment_2");
					put(grammarAccess.getBelongsToAccess().getOptionsAssignment_4(), "rule__BelongsTo__OptionsAssignment_4");
					put(grammarAccess.getHashKeyValueAccess().getKeyAssignment_2_0_0(), "rule__HashKeyValue__KeyAssignment_2_0_0");
					put(grammarAccess.getHashKeyValueAccess().getKeyAssignment_2_1_0(), "rule__HashKeyValue__KeyAssignment_2_1_0");
					put(grammarAccess.getHashKeyValueAccess().getValueAssignment_4(), "rule__HashKeyValue__ValueAssignment_4");
					put(grammarAccess.getMethodAccess().getNameAssignment_2(), "rule__Method__NameAssignment_2");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			co.gruposaberes.model.ui.contentassist.antlr.internal.InternalRailsParser typedParser = (co.gruposaberes.model.ui.contentassist.antlr.internal.InternalRailsParser) parser;
			typedParser.entryRuleClass();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_BS", "RULE_SPACE", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public RailsGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(RailsGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
