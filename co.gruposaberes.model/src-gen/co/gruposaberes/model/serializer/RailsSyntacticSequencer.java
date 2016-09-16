package co.gruposaberes.model.serializer;

import co.gruposaberes.model.services.RailsGrammarAccess;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class RailsSyntacticSequencer extends AbstractSyntacticSequencer {

	protected RailsGrammarAccess grammarAccess;
	protected AbstractElementAlias match_BelongsTo_SpaceKeyword_1_a;
	protected AbstractElementAlias match_BelongsTo_SpaceKeyword_3_a;
	protected AbstractElementAlias match_ClassName_SpaceKeyword_1_a;
	protected AbstractElementAlias match_ClassName_SpaceKeyword_3_a;
	protected AbstractElementAlias match_ClassName___Class_nameKeyword_2_0_or_Class_nameKeyword_2_1___or___Class_nameKeyword_2_2_0_SpaceKeyword_2_2_1_a_EqualsSignGreaterThanSignKeyword_2_2_2__;
	protected AbstractElementAlias match_Class_SpaceKeyword_1_a;
	protected AbstractElementAlias match_Class_SpaceKeyword_3_0_a;
	protected AbstractElementAlias match_Class_SpaceKeyword_3_2_a;
	protected AbstractElementAlias match_Class_SpaceKeyword_4_a;
	protected AbstractElementAlias match_Dependent_SpaceKeyword_1_a;
	protected AbstractElementAlias match_Dependent_SpaceKeyword_3_a;
	protected AbstractElementAlias match_Dependent___DependentKeyword_2_0_or_DependentKeyword_2_1___or___DependentKeyword_2_2_0_SpaceKeyword_2_2_1_a_EqualsSignGreaterThanSignKeyword_2_2_2__;
	protected AbstractElementAlias match_HashKeyValue_SpaceKeyword_1_a;
	protected AbstractElementAlias match_HashKeyValue_SpaceKeyword_2_1_1_a;
	protected AbstractElementAlias match_HashKeyValue_SpaceKeyword_3_a;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (RailsGrammarAccess) access;
		match_BelongsTo_SpaceKeyword_1_a = new TokenAlias(true, true, grammarAccess.getBelongsToAccess().getSpaceKeyword_1());
		match_BelongsTo_SpaceKeyword_3_a = new TokenAlias(true, true, grammarAccess.getBelongsToAccess().getSpaceKeyword_3());
		match_ClassName_SpaceKeyword_1_a = new TokenAlias(true, true, grammarAccess.getClassNameAccess().getSpaceKeyword_1());
		match_ClassName_SpaceKeyword_3_a = new TokenAlias(true, true, grammarAccess.getClassNameAccess().getSpaceKeyword_3());
		match_ClassName___Class_nameKeyword_2_0_or_Class_nameKeyword_2_1___or___Class_nameKeyword_2_2_0_SpaceKeyword_2_2_1_a_EqualsSignGreaterThanSignKeyword_2_2_2__ = new AlternativeAlias(false, false, new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getClassNameAccess().getClass_nameKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getClassNameAccess().getClass_nameKeyword_2_1())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getClassNameAccess().getClass_nameKeyword_2_2_0()), new TokenAlias(true, true, grammarAccess.getClassNameAccess().getSpaceKeyword_2_2_1()), new TokenAlias(false, false, grammarAccess.getClassNameAccess().getEqualsSignGreaterThanSignKeyword_2_2_2())));
		match_Class_SpaceKeyword_1_a = new TokenAlias(true, true, grammarAccess.getClassAccess().getSpaceKeyword_1());
		match_Class_SpaceKeyword_3_0_a = new TokenAlias(true, true, grammarAccess.getClassAccess().getSpaceKeyword_3_0());
		match_Class_SpaceKeyword_3_2_a = new TokenAlias(true, true, grammarAccess.getClassAccess().getSpaceKeyword_3_2());
		match_Class_SpaceKeyword_4_a = new TokenAlias(true, true, grammarAccess.getClassAccess().getSpaceKeyword_4());
		match_Dependent_SpaceKeyword_1_a = new TokenAlias(true, true, grammarAccess.getDependentAccess().getSpaceKeyword_1());
		match_Dependent_SpaceKeyword_3_a = new TokenAlias(true, true, grammarAccess.getDependentAccess().getSpaceKeyword_3());
		match_Dependent___DependentKeyword_2_0_or_DependentKeyword_2_1___or___DependentKeyword_2_2_0_SpaceKeyword_2_2_1_a_EqualsSignGreaterThanSignKeyword_2_2_2__ = new AlternativeAlias(false, false, new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getDependentAccess().getDependentKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getDependentAccess().getDependentKeyword_2_1())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getDependentAccess().getDependentKeyword_2_2_0()), new TokenAlias(true, true, grammarAccess.getDependentAccess().getSpaceKeyword_2_2_1()), new TokenAlias(false, false, grammarAccess.getDependentAccess().getEqualsSignGreaterThanSignKeyword_2_2_2())));
		match_HashKeyValue_SpaceKeyword_1_a = new TokenAlias(true, true, grammarAccess.getHashKeyValueAccess().getSpaceKeyword_1());
		match_HashKeyValue_SpaceKeyword_2_1_1_a = new TokenAlias(true, true, grammarAccess.getHashKeyValueAccess().getSpaceKeyword_2_1_1());
		match_HashKeyValue_SpaceKeyword_3_a = new TokenAlias(true, true, grammarAccess.getHashKeyValueAccess().getSpaceKeyword_3());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getBELONGS_TO_WORDRule())
			return getBELONGS_TO_WORDToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getCLASS_WORDRule())
			return getCLASS_WORDToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getDEF_WORDRule())
			return getDEF_WORDToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getEND_WORDRule())
			return getEND_WORDToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getHAS_AND_BELONGS_TO_MANY_WORDRule())
			return getHAS_AND_BELONGS_TO_MANY_WORDToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getHAS_MANY_WORDRule())
			return getHAS_MANY_WORDToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal BELONGS_TO_WORD: 'belongs_to';
	 */
	protected String getBELONGS_TO_WORDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "belongs_to";
	}
	
	/**
	 * terminal CLASS_WORD: 'class';
	 */
	protected String getCLASS_WORDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "class";
	}
	
	/**
	 * terminal DEF_WORD: 'def';
	 */
	protected String getDEF_WORDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "def";
	}
	
	/**
	 * terminal END_WORD: 'end';
	 */
	protected String getEND_WORDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "end";
	}
	
	/**
	 * terminal HAS_AND_BELONGS_TO_MANY_WORD: 'has_and_belongs_to_many';
	 */
	protected String getHAS_AND_BELONGS_TO_MANY_WORDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "has_and_belongs_to_many";
	}
	
	/**
	 * terminal HAS_MANY_WORD: 'has_many';
	 */
	protected String getHAS_MANY_WORDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "has_many";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_BelongsTo_SpaceKeyword_1_a.equals(syntax))
				emit_BelongsTo_SpaceKeyword_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_BelongsTo_SpaceKeyword_3_a.equals(syntax))
				emit_BelongsTo_SpaceKeyword_3_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ClassName_SpaceKeyword_1_a.equals(syntax))
				emit_ClassName_SpaceKeyword_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ClassName_SpaceKeyword_3_a.equals(syntax))
				emit_ClassName_SpaceKeyword_3_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ClassName___Class_nameKeyword_2_0_or_Class_nameKeyword_2_1___or___Class_nameKeyword_2_2_0_SpaceKeyword_2_2_1_a_EqualsSignGreaterThanSignKeyword_2_2_2__.equals(syntax))
				emit_ClassName___Class_nameKeyword_2_0_or_Class_nameKeyword_2_1___or___Class_nameKeyword_2_2_0_SpaceKeyword_2_2_1_a_EqualsSignGreaterThanSignKeyword_2_2_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Class_SpaceKeyword_1_a.equals(syntax))
				emit_Class_SpaceKeyword_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Class_SpaceKeyword_3_0_a.equals(syntax))
				emit_Class_SpaceKeyword_3_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Class_SpaceKeyword_3_2_a.equals(syntax))
				emit_Class_SpaceKeyword_3_2_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Class_SpaceKeyword_4_a.equals(syntax))
				emit_Class_SpaceKeyword_4_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Dependent_SpaceKeyword_1_a.equals(syntax))
				emit_Dependent_SpaceKeyword_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Dependent_SpaceKeyword_3_a.equals(syntax))
				emit_Dependent_SpaceKeyword_3_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Dependent___DependentKeyword_2_0_or_DependentKeyword_2_1___or___DependentKeyword_2_2_0_SpaceKeyword_2_2_1_a_EqualsSignGreaterThanSignKeyword_2_2_2__.equals(syntax))
				emit_Dependent___DependentKeyword_2_0_or_DependentKeyword_2_1___or___DependentKeyword_2_2_0_SpaceKeyword_2_2_1_a_EqualsSignGreaterThanSignKeyword_2_2_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_HashKeyValue_SpaceKeyword_1_a.equals(syntax))
				emit_HashKeyValue_SpaceKeyword_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_HashKeyValue_SpaceKeyword_2_1_1_a.equals(syntax))
				emit_HashKeyValue_SpaceKeyword_2_1_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_HashKeyValue_SpaceKeyword_3_a.equals(syntax))
				emit_HashKeyValue_SpaceKeyword_3_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ' '*
	 */
	protected void emit_BelongsTo_SpaceKeyword_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ' '*
	 */
	protected void emit_BelongsTo_SpaceKeyword_3_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ' '*
	 */
	protected void emit_ClassName_SpaceKeyword_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ' '*
	 */
	protected void emit_ClassName_SpaceKeyword_3_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (':class_name' ' '* '=>') | ('class_name:' | ':class_name=>')
	 */
	protected void emit_ClassName___Class_nameKeyword_2_0_or_Class_nameKeyword_2_1___or___Class_nameKeyword_2_2_0_SpaceKeyword_2_2_1_a_EqualsSignGreaterThanSignKeyword_2_2_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ' '*
	 */
	protected void emit_Class_SpaceKeyword_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ' '*
	 */
	protected void emit_Class_SpaceKeyword_3_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ' '*
	 */
	protected void emit_Class_SpaceKeyword_3_2_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ' '*
	 */
	protected void emit_Class_SpaceKeyword_4_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ' '*
	 */
	protected void emit_Dependent_SpaceKeyword_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ' '*
	 */
	protected void emit_Dependent_SpaceKeyword_3_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (':dependent' ' '* '=>') | ('dependent:' | ':dependent=>')
	 */
	protected void emit_Dependent___DependentKeyword_2_0_or_DependentKeyword_2_1___or___DependentKeyword_2_2_0_SpaceKeyword_2_2_1_a_EqualsSignGreaterThanSignKeyword_2_2_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ' '*
	 */
	protected void emit_HashKeyValue_SpaceKeyword_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ' '*
	 */
	protected void emit_HashKeyValue_SpaceKeyword_2_1_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ' '*
	 */
	protected void emit_HashKeyValue_SpaceKeyword_3_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
