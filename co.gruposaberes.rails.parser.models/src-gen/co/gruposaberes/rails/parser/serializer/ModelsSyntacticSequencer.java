/*
 * generated by Xtext 2.10.0
 */
package co.gruposaberes.rails.parser.serializer;

import co.gruposaberes.rails.parser.services.ModelsGrammarAccess;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class ModelsSyntacticSequencer extends AbstractSyntacticSequencer {

	protected ModelsGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Class_SPACETerminalRuleCall_1_a;
	protected AbstractElementAlias match_Class_SPACETerminalRuleCall_3_0_a;
	protected AbstractElementAlias match_Class_SPACETerminalRuleCall_3_2_a;
	protected AbstractElementAlias match_Class_SPACETerminalRuleCall_4_a;
	protected AbstractElementAlias match_HashKeyValue_SPACETerminalRuleCall_1_a;
	protected AbstractElementAlias match_HashKeyValue_SPACETerminalRuleCall_3_1_1_a;
	protected AbstractElementAlias match_HashKeyValue_SPACETerminalRuleCall_4_a;
	protected AbstractElementAlias match_HashKeyValue_SPACETerminalRuleCall_6_a;
	protected AbstractElementAlias match_HashKeyValue___LFTerminalRuleCall_2_0_SPACETerminalRuleCall_2_1_a__q;
	protected AbstractElementAlias match_Method_LFTerminalRuleCall_6_q;
	protected AbstractElementAlias match_Method_PARENTHESIS_BLOCKTerminalRuleCall_4_q;
	protected AbstractElementAlias match_Method_SPACETerminalRuleCall_1_a;
	protected AbstractElementAlias match_Method_SPACETerminalRuleCall_3_a;
	protected AbstractElementAlias match_Method_SPACETerminalRuleCall_5_a;
	protected AbstractElementAlias match_Relationship_SPACETerminalRuleCall_1_a;
	protected AbstractElementAlias match_Relationship_SPACETerminalRuleCall_3_a;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (ModelsGrammarAccess) access;
		match_Class_SPACETerminalRuleCall_1_a = new TokenAlias(true, true, grammarAccess.getClassAccess().getSPACETerminalRuleCall_1());
		match_Class_SPACETerminalRuleCall_3_0_a = new TokenAlias(true, true, grammarAccess.getClassAccess().getSPACETerminalRuleCall_3_0());
		match_Class_SPACETerminalRuleCall_3_2_a = new TokenAlias(true, true, grammarAccess.getClassAccess().getSPACETerminalRuleCall_3_2());
		match_Class_SPACETerminalRuleCall_4_a = new TokenAlias(true, true, grammarAccess.getClassAccess().getSPACETerminalRuleCall_4());
		match_HashKeyValue_SPACETerminalRuleCall_1_a = new TokenAlias(true, true, grammarAccess.getHashKeyValueAccess().getSPACETerminalRuleCall_1());
		match_HashKeyValue_SPACETerminalRuleCall_3_1_1_a = new TokenAlias(true, true, grammarAccess.getHashKeyValueAccess().getSPACETerminalRuleCall_3_1_1());
		match_HashKeyValue_SPACETerminalRuleCall_4_a = new TokenAlias(true, true, grammarAccess.getHashKeyValueAccess().getSPACETerminalRuleCall_4());
		match_HashKeyValue_SPACETerminalRuleCall_6_a = new TokenAlias(true, true, grammarAccess.getHashKeyValueAccess().getSPACETerminalRuleCall_6());
		match_HashKeyValue___LFTerminalRuleCall_2_0_SPACETerminalRuleCall_2_1_a__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getHashKeyValueAccess().getLFTerminalRuleCall_2_0()), new TokenAlias(true, true, grammarAccess.getHashKeyValueAccess().getSPACETerminalRuleCall_2_1()));
		match_Method_LFTerminalRuleCall_6_q = new TokenAlias(false, true, grammarAccess.getMethodAccess().getLFTerminalRuleCall_6());
		match_Method_PARENTHESIS_BLOCKTerminalRuleCall_4_q = new TokenAlias(false, true, grammarAccess.getMethodAccess().getPARENTHESIS_BLOCKTerminalRuleCall_4());
		match_Method_SPACETerminalRuleCall_1_a = new TokenAlias(true, true, grammarAccess.getMethodAccess().getSPACETerminalRuleCall_1());
		match_Method_SPACETerminalRuleCall_3_a = new TokenAlias(true, true, grammarAccess.getMethodAccess().getSPACETerminalRuleCall_3());
		match_Method_SPACETerminalRuleCall_5_a = new TokenAlias(true, true, grammarAccess.getMethodAccess().getSPACETerminalRuleCall_5());
		match_Relationship_SPACETerminalRuleCall_1_a = new TokenAlias(true, true, grammarAccess.getRelationshipAccess().getSPACETerminalRuleCall_1());
		match_Relationship_SPACETerminalRuleCall_3_a = new TokenAlias(true, true, grammarAccess.getRelationshipAccess().getSPACETerminalRuleCall_3());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getCLASS_WORDRule())
			return getCLASS_WORDToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getCOMMARule())
			return getCOMMAToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getDEF_WORDRule())
			return getDEF_WORDToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getLFRule())
			return getLFToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getOperationsChainRule())
			return getOperationsChainToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getPARENTHESIS_BLOCKRule())
			return getPARENTHESIS_BLOCKToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getSET_TABLE_NAMERule())
			return getSET_TABLE_NAMEToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getSPACERule())
			return getSPACEToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal CLASS_WORD: 'class ';
	 */
	protected String getCLASS_WORDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "class ";
	}
	
	/**
	 * terminal COMMA: ',';
	 */
	protected String getCOMMAToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ",";
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
	 * terminal LF	: '\n';
	 */
	protected String getLFToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\n";
	}
	
	/**
	 * OperationsChain:
	 * 	MethodChainCall (OperatorRule (BRACKET_BLOCK|DECIMAL|MethodChainCall|REGEXP))*
	 * ;
	 */
	protected String getOperationsChainToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ":class ";
	}
	
	/**
	 * terminal PARENTHESIS_BLOCK: 
	 *   '(' 
	 *   	NOT_PARENTHESIS_SEQ 
	 *     THIRD_LEVEL_PARENTHESIS_BLOCK*  
	 *   ')'
	 * ;
	 */
	protected String getPARENTHESIS_BLOCKToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "()";
	}
	
	/**
	 * terminal SET_TABLE_NAME: 'set_table_name';
	 */
	protected String getSET_TABLE_NAMEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "set_table_name";
	}
	
	/**
	 * terminal SPACE: ' '|'\t';
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
			if (match_Class_SPACETerminalRuleCall_1_a.equals(syntax))
				emit_Class_SPACETerminalRuleCall_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Class_SPACETerminalRuleCall_3_0_a.equals(syntax))
				emit_Class_SPACETerminalRuleCall_3_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Class_SPACETerminalRuleCall_3_2_a.equals(syntax))
				emit_Class_SPACETerminalRuleCall_3_2_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Class_SPACETerminalRuleCall_4_a.equals(syntax))
				emit_Class_SPACETerminalRuleCall_4_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_HashKeyValue_SPACETerminalRuleCall_1_a.equals(syntax))
				emit_HashKeyValue_SPACETerminalRuleCall_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_HashKeyValue_SPACETerminalRuleCall_3_1_1_a.equals(syntax))
				emit_HashKeyValue_SPACETerminalRuleCall_3_1_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_HashKeyValue_SPACETerminalRuleCall_4_a.equals(syntax))
				emit_HashKeyValue_SPACETerminalRuleCall_4_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_HashKeyValue_SPACETerminalRuleCall_6_a.equals(syntax))
				emit_HashKeyValue_SPACETerminalRuleCall_6_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_HashKeyValue___LFTerminalRuleCall_2_0_SPACETerminalRuleCall_2_1_a__q.equals(syntax))
				emit_HashKeyValue___LFTerminalRuleCall_2_0_SPACETerminalRuleCall_2_1_a__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Method_LFTerminalRuleCall_6_q.equals(syntax))
				emit_Method_LFTerminalRuleCall_6_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Method_PARENTHESIS_BLOCKTerminalRuleCall_4_q.equals(syntax))
				emit_Method_PARENTHESIS_BLOCKTerminalRuleCall_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Method_SPACETerminalRuleCall_1_a.equals(syntax))
				emit_Method_SPACETerminalRuleCall_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Method_SPACETerminalRuleCall_3_a.equals(syntax))
				emit_Method_SPACETerminalRuleCall_3_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Method_SPACETerminalRuleCall_5_a.equals(syntax))
				emit_Method_SPACETerminalRuleCall_5_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Relationship_SPACETerminalRuleCall_1_a.equals(syntax))
				emit_Relationship_SPACETerminalRuleCall_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Relationship_SPACETerminalRuleCall_3_a.equals(syntax))
				emit_Relationship_SPACETerminalRuleCall_3_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
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
	 *     name=NamespacedModuleName (ambiguity) (rule end)
	 *     name=NamespacedModuleName (ambiguity) classElements+=ClassElement
	 *     superType=NamespacedModuleName (ambiguity) (rule end)
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
	 *     (rule start) COMMA (ambiguity) (LF SPACE*)? key=ID
	 *     (rule start) COMMA (ambiguity) (LF SPACE*)? key=STRING
	 *     (rule start) COMMA (ambiguity) (LF SPACE*)? key=SYMBOL
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
	 *     key=STRING (ambiguity) '=>' SPACE* value=DECIMAL
	 *     key=STRING (ambiguity) '=>' SPACE* value=INT
	 *     key=STRING (ambiguity) '=>' SPACE* value=INT_METHOD
	 *     key=STRING (ambiguity) '=>' SPACE* value=MethodChainCall
	 *     key=STRING (ambiguity) '=>' SPACE* value=STRING
	 *     key=STRING (ambiguity) '=>' SPACE* value=SYMBOL
	 *     key=SYMBOL (ambiguity) '=>' SPACE* value=ARRAY_BLOCK
	 *     key=SYMBOL (ambiguity) '=>' SPACE* value=BRACKET_BLOCK
	 *     key=SYMBOL (ambiguity) '=>' SPACE* value=DECIMAL
	 *     key=SYMBOL (ambiguity) '=>' SPACE* value=INT
	 *     key=SYMBOL (ambiguity) '=>' SPACE* value=INT_METHOD
	 *     key=SYMBOL (ambiguity) '=>' SPACE* value=MethodChainCall
	 *     key=SYMBOL (ambiguity) '=>' SPACE* value=STRING
	 *     key=SYMBOL (ambiguity) '=>' SPACE* value=SYMBOL
	 */
	protected void emit_HashKeyValue_SPACETerminalRuleCall_3_1_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     SPACE*
	 *
	 * This ambiguous syntax occurs at:
	 *     key=ID ':' (ambiguity) value=ARRAY_BLOCK
	 *     key=ID ':' (ambiguity) value=BRACKET_BLOCK
	 *     key=ID ':' (ambiguity) value=DECIMAL
	 *     key=ID ':' (ambiguity) value=INT
	 *     key=ID ':' (ambiguity) value=INT_METHOD
	 *     key=ID ':' (ambiguity) value=MethodChainCall
	 *     key=ID ':' (ambiguity) value=STRING
	 *     key=ID ':' (ambiguity) value=SYMBOL
	 *     key=STRING SPACE* '=>' (ambiguity) value=ARRAY_BLOCK
	 *     key=STRING SPACE* '=>' (ambiguity) value=BRACKET_BLOCK
	 *     key=STRING SPACE* '=>' (ambiguity) value=DECIMAL
	 *     key=STRING SPACE* '=>' (ambiguity) value=INT
	 *     key=STRING SPACE* '=>' (ambiguity) value=INT_METHOD
	 *     key=STRING SPACE* '=>' (ambiguity) value=MethodChainCall
	 *     key=STRING SPACE* '=>' (ambiguity) value=STRING
	 *     key=STRING SPACE* '=>' (ambiguity) value=SYMBOL
	 *     key=SYMBOL SPACE* '=>' (ambiguity) value=ARRAY_BLOCK
	 *     key=SYMBOL SPACE* '=>' (ambiguity) value=BRACKET_BLOCK
	 *     key=SYMBOL SPACE* '=>' (ambiguity) value=DECIMAL
	 *     key=SYMBOL SPACE* '=>' (ambiguity) value=INT
	 *     key=SYMBOL SPACE* '=>' (ambiguity) value=INT_METHOD
	 *     key=SYMBOL SPACE* '=>' (ambiguity) value=MethodChainCall
	 *     key=SYMBOL SPACE* '=>' (ambiguity) value=STRING
	 *     key=SYMBOL SPACE* '=>' (ambiguity) value=SYMBOL
	 */
	protected void emit_HashKeyValue_SPACETerminalRuleCall_4_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     SPACE*
	 *
	 * This ambiguous syntax occurs at:
	 *     value=ARRAY_BLOCK (ambiguity) (rule end)
	 *     value=BRACKET_BLOCK (ambiguity) (rule end)
	 *     value=DECIMAL (ambiguity) (rule end)
	 *     value=INT (ambiguity) (rule end)
	 *     value=INT_METHOD (ambiguity) (rule end)
	 *     value=MethodChainCall (ambiguity) (rule end)
	 *     value=STRING (ambiguity) (rule end)
	 *     value=SYMBOL (ambiguity) (rule end)
	 */
	protected void emit_HashKeyValue_SPACETerminalRuleCall_6_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (LF SPACE*)?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) COMMA SPACE* (ambiguity) key=ID
	 *     (rule start) COMMA SPACE* (ambiguity) key=STRING
	 *     (rule start) COMMA SPACE* (ambiguity) key=SYMBOL
	 */
	protected void emit_HashKeyValue___LFTerminalRuleCall_2_0_SPACETerminalRuleCall_2_1_a__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     LF?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=MethodName SPACE* PARENTHESIS_BLOCK? SPACE* (ambiguity) (rule end)
	 */
	protected void emit_Method_LFTerminalRuleCall_6_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     PARENTHESIS_BLOCK?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=MethodName SPACE* (ambiguity) SPACE* LF? (rule end)
	 */
	protected void emit_Method_PARENTHESIS_BLOCKTerminalRuleCall_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     SPACE*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) DEF_WORD (ambiguity) name=MethodName
	 */
	protected void emit_Method_SPACETerminalRuleCall_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     SPACE*
	 *
	 * This ambiguous syntax occurs at:
	 *     name=MethodName (ambiguity) PARENTHESIS_BLOCK? SPACE* LF? (rule end)
	 */
	protected void emit_Method_SPACETerminalRuleCall_3_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     SPACE*
	 *
	 * This ambiguous syntax occurs at:
	 *     name=MethodName SPACE* PARENTHESIS_BLOCK? (ambiguity) LF? (rule end)
	 */
	protected void emit_Method_SPACETerminalRuleCall_5_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     SPACE*
	 *
	 * This ambiguous syntax occurs at:
	 *     relationType=BELONGS_TO_WORD (ambiguity) name=STRING
	 *     relationType=BELONGS_TO_WORD (ambiguity) name=SYMBOL
	 *     relationType=HAS_AND_BELONGS_TO_MANY_WORD (ambiguity) name=STRING
	 *     relationType=HAS_AND_BELONGS_TO_MANY_WORD (ambiguity) name=SYMBOL
	 *     relationType=HAS_MANY_WORD (ambiguity) name=STRING
	 *     relationType=HAS_MANY_WORD (ambiguity) name=SYMBOL
	 *     relationType=HAS_ONE_WORD (ambiguity) name=STRING
	 *     relationType=HAS_ONE_WORD (ambiguity) name=SYMBOL
	 */
	protected void emit_Relationship_SPACETerminalRuleCall_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	protected void emit_Relationship_SPACETerminalRuleCall_3_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}