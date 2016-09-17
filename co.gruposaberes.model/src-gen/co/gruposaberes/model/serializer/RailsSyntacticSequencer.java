/*
 * generated by Xtext
 */
package co.gruposaberes.model.serializer;

import co.gruposaberes.model.services.RailsGrammarAccess;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class RailsSyntacticSequencer extends AbstractSyntacticSequencer {

	protected RailsGrammarAccess grammarAccess;
	protected AbstractElementAlias match_BelongsTo_SPACETerminalRuleCall_1_a;
	protected AbstractElementAlias match_BelongsTo_SPACETerminalRuleCall_3_a;
	protected AbstractElementAlias match_Class_SPACETerminalRuleCall_1_a;
	protected AbstractElementAlias match_Class_SPACETerminalRuleCall_3_0_a;
	protected AbstractElementAlias match_Class_SPACETerminalRuleCall_3_2_a;
	protected AbstractElementAlias match_Class_SPACETerminalRuleCall_4_a;
	protected AbstractElementAlias match_HasAndBelongsToMany_SPACETerminalRuleCall_1_a;
	protected AbstractElementAlias match_HasAndBelongsToMany_SPACETerminalRuleCall_3_a;
	protected AbstractElementAlias match_HasMany_SL_COMMENTTerminalRuleCall_5_q;
	protected AbstractElementAlias match_HasMany_SPACETerminalRuleCall_1_a;
	protected AbstractElementAlias match_HasMany_SPACETerminalRuleCall_3_a;
	protected AbstractElementAlias match_HashKeyValue_SPACETerminalRuleCall_1_a;
	protected AbstractElementAlias match_HashKeyValue_SPACETerminalRuleCall_2_1_1_a;
	protected AbstractElementAlias match_HashKeyValue_SPACETerminalRuleCall_3_a;
	protected AbstractElementAlias match_HashKeyValue_SPACETerminalRuleCall_5_a;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (RailsGrammarAccess) access;
		match_BelongsTo_SPACETerminalRuleCall_1_a = new TokenAlias(true, true, grammarAccess.getBelongsToAccess().getSPACETerminalRuleCall_1());
		match_BelongsTo_SPACETerminalRuleCall_3_a = new TokenAlias(true, true, grammarAccess.getBelongsToAccess().getSPACETerminalRuleCall_3());
		match_Class_SPACETerminalRuleCall_1_a = new TokenAlias(true, true, grammarAccess.getClassAccess().getSPACETerminalRuleCall_1());
		match_Class_SPACETerminalRuleCall_3_0_a = new TokenAlias(true, true, grammarAccess.getClassAccess().getSPACETerminalRuleCall_3_0());
		match_Class_SPACETerminalRuleCall_3_2_a = new TokenAlias(true, true, grammarAccess.getClassAccess().getSPACETerminalRuleCall_3_2());
		match_Class_SPACETerminalRuleCall_4_a = new TokenAlias(true, true, grammarAccess.getClassAccess().getSPACETerminalRuleCall_4());
		match_HasAndBelongsToMany_SPACETerminalRuleCall_1_a = new TokenAlias(true, true, grammarAccess.getHasAndBelongsToManyAccess().getSPACETerminalRuleCall_1());
		match_HasAndBelongsToMany_SPACETerminalRuleCall_3_a = new TokenAlias(true, true, grammarAccess.getHasAndBelongsToManyAccess().getSPACETerminalRuleCall_3());
		match_HasMany_SL_COMMENTTerminalRuleCall_5_q = new TokenAlias(false, true, grammarAccess.getHasManyAccess().getSL_COMMENTTerminalRuleCall_5());
		match_HasMany_SPACETerminalRuleCall_1_a = new TokenAlias(true, true, grammarAccess.getHasManyAccess().getSPACETerminalRuleCall_1());
		match_HasMany_SPACETerminalRuleCall_3_a = new TokenAlias(true, true, grammarAccess.getHasManyAccess().getSPACETerminalRuleCall_3());
		match_HashKeyValue_SPACETerminalRuleCall_1_a = new TokenAlias(true, true, grammarAccess.getHashKeyValueAccess().getSPACETerminalRuleCall_1());
		match_HashKeyValue_SPACETerminalRuleCall_2_1_1_a = new TokenAlias(true, true, grammarAccess.getHashKeyValueAccess().getSPACETerminalRuleCall_2_1_1());
		match_HashKeyValue_SPACETerminalRuleCall_3_a = new TokenAlias(true, true, grammarAccess.getHashKeyValueAccess().getSPACETerminalRuleCall_3());
		match_HashKeyValue_SPACETerminalRuleCall_5_a = new TokenAlias(true, true, grammarAccess.getHashKeyValueAccess().getSPACETerminalRuleCall_5());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getBELONGS_TO_WORDRule())
			return getBELONGS_TO_WORDToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getCLASS_WORDRule())
			return getCLASS_WORDToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getDEF_WORDRule())
			return getDEF_WORDToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getEND_WORDRule())
			return getEND_WORDToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getHAS_AND_BELONGS_TO_MANY_WORDRule())
			return getHAS_AND_BELONGS_TO_MANY_WORDToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getHAS_MANY_WORDRule())
			return getHAS_MANY_WORDToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getSL_COMMENTRule())
			return getSL_COMMENTToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getSPACERule())
			return getSPACEToken(semanticObject, ruleCall, node);
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
	
	/**
	 * terminal SL_COMMENT : '#'->'\n';
	 */
	protected String getSL_COMMENTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "#";
	}
	
	/**
	 * terminal SPACE: ' ';
	 */
	protected String getSPACEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return " ";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_BelongsTo_SPACETerminalRuleCall_1_a.equals(syntax))
				emit_BelongsTo_SPACETerminalRuleCall_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_BelongsTo_SPACETerminalRuleCall_3_a.equals(syntax))
				emit_BelongsTo_SPACETerminalRuleCall_3_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Class_SPACETerminalRuleCall_1_a.equals(syntax))
				emit_Class_SPACETerminalRuleCall_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Class_SPACETerminalRuleCall_3_0_a.equals(syntax))
				emit_Class_SPACETerminalRuleCall_3_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Class_SPACETerminalRuleCall_3_2_a.equals(syntax))
				emit_Class_SPACETerminalRuleCall_3_2_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Class_SPACETerminalRuleCall_4_a.equals(syntax))
				emit_Class_SPACETerminalRuleCall_4_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_HasAndBelongsToMany_SPACETerminalRuleCall_1_a.equals(syntax))
				emit_HasAndBelongsToMany_SPACETerminalRuleCall_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_HasAndBelongsToMany_SPACETerminalRuleCall_3_a.equals(syntax))
				emit_HasAndBelongsToMany_SPACETerminalRuleCall_3_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_HasMany_SL_COMMENTTerminalRuleCall_5_q.equals(syntax))
				emit_HasMany_SL_COMMENTTerminalRuleCall_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_HasMany_SPACETerminalRuleCall_1_a.equals(syntax))
				emit_HasMany_SPACETerminalRuleCall_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_HasMany_SPACETerminalRuleCall_3_a.equals(syntax))
				emit_HasMany_SPACETerminalRuleCall_3_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_HashKeyValue_SPACETerminalRuleCall_1_a.equals(syntax))
				emit_HashKeyValue_SPACETerminalRuleCall_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_HashKeyValue_SPACETerminalRuleCall_2_1_1_a.equals(syntax))
				emit_HashKeyValue_SPACETerminalRuleCall_2_1_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_HashKeyValue_SPACETerminalRuleCall_3_a.equals(syntax))
				emit_HashKeyValue_SPACETerminalRuleCall_3_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_HashKeyValue_SPACETerminalRuleCall_5_a.equals(syntax))
				emit_HashKeyValue_SPACETerminalRuleCall_5_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     SPACE*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) BELONGS_TO_WORD (ambiguity) name=STRING
	 *     (rule start) BELONGS_TO_WORD (ambiguity) name=SYMBOL
	 */
	protected void emit_BelongsTo_SPACETerminalRuleCall_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     SPACE*
	 *
	 * This ambiguous syntax occurs at:
	 *     name=STRING (ambiguity) (rule end)
	 *     name=STRING (ambiguity) options+=HashKeyValue
	 *     name=SYMBOL (ambiguity) (rule end)
	 *     name=SYMBOL (ambiguity) options+=HashKeyValue
	 */
	protected void emit_BelongsTo_SPACETerminalRuleCall_3_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     SPACE*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) CLASS_WORD (ambiguity) name=NamespacedModuleName
	 */
	protected void emit_Class_SPACETerminalRuleCall_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     SPACE*
	 *
	 * This ambiguous syntax occurs at:
	 *     name=NamespacedModuleName (ambiguity) '<' SPACE* superType=NamespacedModuleName
	 */
	protected void emit_Class_SPACETerminalRuleCall_3_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     SPACE*
	 *
	 * This ambiguous syntax occurs at:
	 *     name=NamespacedModuleName SPACE* '<' (ambiguity) superType=NamespacedModuleName
	 */
	protected void emit_Class_SPACETerminalRuleCall_3_2_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     SPACE*
	 *
	 * This ambiguous syntax occurs at:
	 *     name=NamespacedModuleName (ambiguity) END_WORD (rule end)
	 *     name=NamespacedModuleName (ambiguity) classElements+=ClassElement
	 *     superType=NamespacedModuleName (ambiguity) END_WORD (rule end)
	 *     superType=NamespacedModuleName (ambiguity) classElements+=ClassElement
	 */
	protected void emit_Class_SPACETerminalRuleCall_4_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     SPACE*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) HAS_AND_BELONGS_TO_MANY_WORD (ambiguity) name=STRING
	 *     (rule start) HAS_AND_BELONGS_TO_MANY_WORD (ambiguity) name=SYMBOL
	 */
	protected void emit_HasAndBelongsToMany_SPACETerminalRuleCall_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     SPACE*
	 *
	 * This ambiguous syntax occurs at:
	 *     name=STRING (ambiguity) (rule end)
	 *     name=STRING (ambiguity) options+=HashKeyValue
	 *     name=SYMBOL (ambiguity) (rule end)
	 *     name=SYMBOL (ambiguity) options+=HashKeyValue
	 */
	protected void emit_HasAndBelongsToMany_SPACETerminalRuleCall_3_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     SL_COMMENT?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=STRING SPACE* (ambiguity) (rule end)
	 *     name=SYMBOL SPACE* (ambiguity) (rule end)
	 *     options+=HashKeyValue (ambiguity) (rule end)
	 */
	protected void emit_HasMany_SL_COMMENTTerminalRuleCall_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     SPACE*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) HAS_MANY_WORD (ambiguity) name=STRING
	 *     (rule start) HAS_MANY_WORD (ambiguity) name=SYMBOL
	 */
	protected void emit_HasMany_SPACETerminalRuleCall_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     SPACE*
	 *
	 * This ambiguous syntax occurs at:
	 *     name=STRING (ambiguity) SL_COMMENT? (rule end)
	 *     name=STRING (ambiguity) options+=HashKeyValue
	 *     name=SYMBOL (ambiguity) SL_COMMENT? (rule end)
	 *     name=SYMBOL (ambiguity) options+=HashKeyValue
	 */
	protected void emit_HasMany_SPACETerminalRuleCall_3_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     SPACE*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) ',' (ambiguity) key=ID
	 *     (rule start) ',' (ambiguity) key=STRING
	 *     (rule start) ',' (ambiguity) key=SYMBOL
	 */
	protected void emit_HashKeyValue_SPACETerminalRuleCall_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     SPACE*
	 *
	 * This ambiguous syntax occurs at:
	 *     key=STRING (ambiguity) '=>' SPACE* value=ARRAY_BLOCK
	 *     key=STRING (ambiguity) '=>' SPACE* value=BRACKET_BLOCK
	 *     key=STRING (ambiguity) '=>' SPACE* value=MethodChainCall
	 *     key=STRING (ambiguity) '=>' SPACE* value=STRING
	 *     key=STRING (ambiguity) '=>' SPACE* value=SYMBOL
	 *     key=SYMBOL (ambiguity) '=>' SPACE* value=ARRAY_BLOCK
	 *     key=SYMBOL (ambiguity) '=>' SPACE* value=BRACKET_BLOCK
	 *     key=SYMBOL (ambiguity) '=>' SPACE* value=MethodChainCall
	 *     key=SYMBOL (ambiguity) '=>' SPACE* value=STRING
	 *     key=SYMBOL (ambiguity) '=>' SPACE* value=SYMBOL
	 */
	protected void emit_HashKeyValue_SPACETerminalRuleCall_2_1_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     SPACE*
	 *
	 * This ambiguous syntax occurs at:
	 *     key=ID ':' (ambiguity) value=ARRAY_BLOCK
	 *     key=ID ':' (ambiguity) value=BRACKET_BLOCK
	 *     key=ID ':' (ambiguity) value=MethodChainCall
	 *     key=ID ':' (ambiguity) value=STRING
	 *     key=ID ':' (ambiguity) value=SYMBOL
	 *     key=STRING SPACE* '=>' (ambiguity) value=ARRAY_BLOCK
	 *     key=STRING SPACE* '=>' (ambiguity) value=BRACKET_BLOCK
	 *     key=STRING SPACE* '=>' (ambiguity) value=MethodChainCall
	 *     key=STRING SPACE* '=>' (ambiguity) value=STRING
	 *     key=STRING SPACE* '=>' (ambiguity) value=SYMBOL
	 *     key=SYMBOL SPACE* '=>' (ambiguity) value=ARRAY_BLOCK
	 *     key=SYMBOL SPACE* '=>' (ambiguity) value=BRACKET_BLOCK
	 *     key=SYMBOL SPACE* '=>' (ambiguity) value=MethodChainCall
	 *     key=SYMBOL SPACE* '=>' (ambiguity) value=STRING
	 *     key=SYMBOL SPACE* '=>' (ambiguity) value=SYMBOL
	 */
	protected void emit_HashKeyValue_SPACETerminalRuleCall_3_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     SPACE*
	 *
	 * This ambiguous syntax occurs at:
	 *     value=ARRAY_BLOCK (ambiguity) (rule end)
	 *     value=BRACKET_BLOCK (ambiguity) (rule end)
	 *     value=MethodChainCall (ambiguity) (rule end)
	 *     value=STRING (ambiguity) (rule end)
	 *     value=SYMBOL (ambiguity) (rule end)
	 */
	protected void emit_HashKeyValue_SPACETerminalRuleCall_5_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
