/*
* generated by Xtext
*/
grammar InternalRails;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package co.gruposaberes.model.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package co.gruposaberes.model.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import co.gruposaberes.model.services.RailsGrammarAccess;

}

@parser::members {

 	private RailsGrammarAccess grammarAccess;
 	
    public InternalRailsParser(TokenStream input, RailsGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "Class";	
   	}
   	
   	@Override
   	protected RailsGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleClass
entryRuleClass returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getClassRule()); }
	 iv_ruleClass=ruleClass 
	 { $current=$iv_ruleClass.current; } 
	 EOF 
;

// Rule Class
ruleClass returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(this_CLASS_WORD_0=RULE_CLASS_WORD
    { 
    newLeafNode(this_CLASS_WORD_0, grammarAccess.getClassAccess().getCLASS_WORDTerminalRuleCall_0()); 
    }
(	otherlv_1=' ' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getClassAccess().getSpaceKeyword_1());
    }
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getClassAccess().getNameNamespacedModuleNameParserRuleCall_2_0()); 
	    }
		lv_name_2_0=ruleNamespacedModuleName		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getClassRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"NamespacedModuleName");
	        afterParserOrEnumRuleCall();
	    }

)
)((	otherlv_3=' ' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getClassAccess().getSpaceKeyword_3_0());
    }
)*	otherlv_4='<' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getClassAccess().getLessThanSignKeyword_3_1());
    }
(	otherlv_5=' ' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getClassAccess().getSpaceKeyword_3_2());
    }
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getClassAccess().getSuperTypeNamespacedModuleNameParserRuleCall_3_3_0()); 
	    }
		lv_superType_6_0=ruleNamespacedModuleName		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getClassRule());
	        }
       		set(
       			$current, 
       			"superType",
        		lv_superType_6_0, 
        		"NamespacedModuleName");
	        afterParserOrEnumRuleCall();
	    }

)
))?(	otherlv_7=' ' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getClassAccess().getSpaceKeyword_4());
    }
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getClassAccess().getClassElementsClassElementParserRuleCall_5_0()); 
	    }
		lv_classElements_8_0=ruleClassElement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getClassRule());
	        }
       		add(
       			$current, 
       			"classElements",
        		lv_classElements_8_0, 
        		"ClassElement");
	        afterParserOrEnumRuleCall();
	    }

)
)*this_END_WORD_9=RULE_END_WORD
    { 
    newLeafNode(this_END_WORD_9, grammarAccess.getClassAccess().getEND_WORDTerminalRuleCall_6()); 
    }
)
;





// Entry rule entryRuleNamespacedModuleName
entryRuleNamespacedModuleName returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getNamespacedModuleNameRule()); } 
	 iv_ruleNamespacedModuleName=ruleNamespacedModuleName 
	 { $current=$iv_ruleNamespacedModuleName.current.getText(); }  
	 EOF 
;

// Rule NamespacedModuleName
ruleNamespacedModuleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((    this_ID_0=RULE_ID    {
		$current.merge(this_ID_0);
    }

    { 
    newLeafNode(this_ID_0, grammarAccess.getNamespacedModuleNameAccess().getIDTerminalRuleCall_0_0()); 
    }

	kw='::' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getNamespacedModuleNameAccess().getColonColonKeyword_0_1()); 
    }
)*    this_ID_2=RULE_ID    {
		$current.merge(this_ID_2);
    }

    { 
    newLeafNode(this_ID_2, grammarAccess.getNamespacedModuleNameAccess().getIDTerminalRuleCall_1()); 
    }
)
    ;





// Entry rule entryRuleClassElement
entryRuleClassElement returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getClassElementRule()); }
	 iv_ruleClassElement=ruleClassElement 
	 { $current=$iv_ruleClassElement.current; } 
	 EOF 
;

// Rule ClassElement
ruleClassElement returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getClassElementAccess().getMethodParserRuleCall_0()); 
    }
    this_Method_0=ruleMethod
    { 
        $current = $this_Method_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getClassElementAccess().getRelationshipParserRuleCall_1()); 
    }
    this_Relationship_1=ruleRelationship
    { 
        $current = $this_Relationship_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleRelationship
entryRuleRelationship returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getRelationshipRule()); }
	 iv_ruleRelationship=ruleRelationship 
	 { $current=$iv_ruleRelationship.current; } 
	 EOF 
;

// Rule Relationship
ruleRelationship returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getRelationshipAccess().getHasManyParserRuleCall_0()); 
    }
    this_HasMany_0=ruleHasMany
    { 
        $current = $this_HasMany_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getRelationshipAccess().getHasAndBelongsToManyParserRuleCall_1()); 
    }
    this_HasAndBelongsToMany_1=ruleHasAndBelongsToMany
    { 
        $current = $this_HasAndBelongsToMany_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getRelationshipAccess().getBelongsToParserRuleCall_2()); 
    }
    this_BelongsTo_2=ruleBelongsTo
    { 
        $current = $this_BelongsTo_2.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleHasMany
entryRuleHasMany returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getHasManyRule()); }
	 iv_ruleHasMany=ruleHasMany 
	 { $current=$iv_ruleHasMany.current; } 
	 EOF 
;

// Rule HasMany
ruleHasMany returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(this_HAS_MANY_WORD_0=RULE_HAS_MANY_WORD
    { 
    newLeafNode(this_HAS_MANY_WORD_0, grammarAccess.getHasManyAccess().getHAS_MANY_WORDTerminalRuleCall_0()); 
    }
(
(
		lv_name_1_0=RULE_STRING
		{
			newLeafNode(lv_name_1_0, grammarAccess.getHasManyAccess().getNameSTRINGTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getHasManyRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"STRING");
	    }

)
))
;





// Entry rule entryRuleHasAndBelongsToMany
entryRuleHasAndBelongsToMany returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getHasAndBelongsToManyRule()); }
	 iv_ruleHasAndBelongsToMany=ruleHasAndBelongsToMany 
	 { $current=$iv_ruleHasAndBelongsToMany.current; } 
	 EOF 
;

// Rule HasAndBelongsToMany
ruleHasAndBelongsToMany returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(this_HAS_AND_BELONGS_TO_MANY_WORD_0=RULE_HAS_AND_BELONGS_TO_MANY_WORD
    { 
    newLeafNode(this_HAS_AND_BELONGS_TO_MANY_WORD_0, grammarAccess.getHasAndBelongsToManyAccess().getHAS_AND_BELONGS_TO_MANY_WORDTerminalRuleCall_0()); 
    }
(
(
		lv_name_1_0=RULE_STRING
		{
			newLeafNode(lv_name_1_0, grammarAccess.getHasAndBelongsToManyAccess().getNameSTRINGTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getHasAndBelongsToManyRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"STRING");
	    }

)
))
;









// Entry rule entryRuleHashKeyValue
entryRuleHashKeyValue returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getHashKeyValueRule()); }
	 iv_ruleHashKeyValue=ruleHashKeyValue 
	 { $current=$iv_ruleHashKeyValue.current; } 
	 EOF 
;

// Rule HashKeyValue
ruleHashKeyValue returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0=',' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getHashKeyValueAccess().getCommaKeyword_0());
    }
(	otherlv_1=' ' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getHashKeyValueAccess().getSpaceKeyword_1());
    }
)*(((
(
		lv_key_2_0=RULE_ID
		{
			newLeafNode(lv_key_2_0, grammarAccess.getHashKeyValueAccess().getKeyIDTerminalRuleCall_2_0_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getHashKeyValueRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"key",
        		lv_key_2_0, 
        		"ID");
	    }

)
)	otherlv_3=':' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getHashKeyValueAccess().getColonKeyword_2_0_1());
    }
)
    |((
(
(
		lv_key_4_1=RULE_SYMBOL
		{
			newLeafNode(lv_key_4_1, grammarAccess.getHashKeyValueAccess().getKeySYMBOLTerminalRuleCall_2_1_0_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getHashKeyValueRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"key",
        		lv_key_4_1, 
        		"SYMBOL");
	    }

    |		lv_key_4_2=RULE_STRING
		{
			newLeafNode(lv_key_4_2, grammarAccess.getHashKeyValueAccess().getKeySTRINGTerminalRuleCall_2_1_0_0_1()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getHashKeyValueRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"key",
        		lv_key_4_2, 
        		"STRING");
	    }

)

)
)(	otherlv_5=' ' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getHashKeyValueAccess().getSpaceKeyword_2_1_1());
    }
)*	otherlv_6='=>' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getHashKeyValueAccess().getEqualsSignGreaterThanSignKeyword_2_1_2());
    }
))(	otherlv_7=' ' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getHashKeyValueAccess().getSpaceKeyword_3());
    }
)*(
(
(
		lv_value_8_1=RULE_SYMBOL
		{
			newLeafNode(lv_value_8_1, grammarAccess.getHashKeyValueAccess().getValueSYMBOLTerminalRuleCall_4_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getHashKeyValueRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"value",
        		lv_value_8_1, 
        		"SYMBOL");
	    }

    |		lv_value_8_2=RULE_STRING
		{
			newLeafNode(lv_value_8_2, grammarAccess.getHashKeyValueAccess().getValueSTRINGTerminalRuleCall_4_0_1()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getHashKeyValueRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"value",
        		lv_value_8_2, 
        		"STRING");
	    }

)

)
))
;





// Entry rule entryRuleBelongsTo
entryRuleBelongsTo returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getBelongsToRule()); }
	 iv_ruleBelongsTo=ruleBelongsTo 
	 { $current=$iv_ruleBelongsTo.current; } 
	 EOF 
;

// Rule BelongsTo
ruleBelongsTo returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(this_BELONGS_TO_WORD_0=RULE_BELONGS_TO_WORD
    { 
    newLeafNode(this_BELONGS_TO_WORD_0, grammarAccess.getBelongsToAccess().getBELONGS_TO_WORDTerminalRuleCall_0()); 
    }
(	otherlv_1=' ' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getBelongsToAccess().getSpaceKeyword_1());
    }
)*(
(
(
		lv_name_2_1=RULE_SYMBOL
		{
			newLeafNode(lv_name_2_1, grammarAccess.getBelongsToAccess().getNameSYMBOLTerminalRuleCall_2_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getBelongsToRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_1, 
        		"SYMBOL");
	    }

    |		lv_name_2_2=RULE_STRING
		{
			newLeafNode(lv_name_2_2, grammarAccess.getBelongsToAccess().getNameSTRINGTerminalRuleCall_2_0_1()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getBelongsToRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_2, 
        		"STRING");
	    }

)

)
)(	otherlv_3=' ' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getBelongsToAccess().getSpaceKeyword_3());
    }
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getBelongsToAccess().getOptionsHashKeyValueParserRuleCall_4_0()); 
	    }
		lv_options_4_0=ruleHashKeyValue		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getBelongsToRule());
	        }
       		add(
       			$current, 
       			"options",
        		lv_options_4_0, 
        		"HashKeyValue");
	        afterParserOrEnumRuleCall();
	    }

)
)*)
;





// Entry rule entryRuleMethod
entryRuleMethod returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMethodRule()); }
	 iv_ruleMethod=ruleMethod 
	 { $current=$iv_ruleMethod.current; } 
	 EOF 
;

// Rule Method
ruleMethod returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(this_DEF_WORD_0=RULE_DEF_WORD
    { 
    newLeafNode(this_DEF_WORD_0, grammarAccess.getMethodAccess().getDEF_WORDTerminalRuleCall_0()); 
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMethodAccess().getNameMethodNameParserRuleCall_1_0()); 
	    }
		lv_name_1_0=ruleMethodName		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMethodRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"MethodName");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleMethodName
entryRuleMethodName returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getMethodNameRule()); } 
	 iv_ruleMethodName=ruleMethodName 
	 { $current=$iv_ruleMethodName.current.getText(); }  
	 EOF 
;

// Rule MethodName
ruleMethodName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_ID_0=RULE_ID    {
		$current.merge(this_ID_0);
    }

    { 
    newLeafNode(this_ID_0, grammarAccess.getMethodNameAccess().getIDTerminalRuleCall_0()); 
    }
(
	kw='?' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getMethodNameAccess().getQuestionMarkKeyword_1_0()); 
    }

    |
	kw='=' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getMethodNameAccess().getEqualsSignKeyword_1_1()); 
    }
)?)
    ;





RULE_BELONGS_TO_WORD : 'belongs_to';

RULE_HAS_MANY_WORD : 'has_many';

RULE_HAS_AND_BELONGS_TO_MANY_WORD : 'has_and_belongs_to_many';

RULE_CLASS_WORD : 'class';

RULE_MODULE_WORD : 'module';

RULE_DEF_WORD : 'def';

RULE_END_WORD : 'end';

RULE_SYMBOL : ':' RULE_ID;

RULE_ID : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_STRING : ('"' ( options {greedy=false;} : . )*'"'|'\'' ( options {greedy=false;} : . )*'\'');

RULE_ML_COMMENT : '=begin' ( options {greedy=false;} : . )*'=end';

RULE_SL_COMMENT : '#' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_INT : ('0'..'9')+;

RULE_ANY_OTHER : .;


