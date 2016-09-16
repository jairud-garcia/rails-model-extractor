package co.gruposaberes.model.serializer;

import co.gruposaberes.model.rails.BelongsTo;
import co.gruposaberes.model.rails.HasAndBelongsToMany;
import co.gruposaberes.model.rails.HasMany;
import co.gruposaberes.model.rails.HashKeyValue;
import co.gruposaberes.model.rails.RailsPackage;
import co.gruposaberes.model.rails.RubyClass;
import co.gruposaberes.model.rails.RubyMethod;
import co.gruposaberes.model.services.RailsGrammarAccess;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class RailsSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private RailsGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == RailsPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case RailsPackage.BELONGS_TO:
				if(context == grammarAccess.getBelongsToRule() ||
				   context == grammarAccess.getClassElementRule() ||
				   context == grammarAccess.getRelationshipRule()) {
					sequence_BelongsTo(context, (BelongsTo) semanticObject); 
					return; 
				}
				else break;
			case RailsPackage.HAS_AND_BELONGS_TO_MANY:
				if(context == grammarAccess.getClassElementRule() ||
				   context == grammarAccess.getHasAndBelongsToManyRule() ||
				   context == grammarAccess.getRelationshipRule()) {
					sequence_HasAndBelongsToMany(context, (HasAndBelongsToMany) semanticObject); 
					return; 
				}
				else break;
			case RailsPackage.HAS_MANY:
				if(context == grammarAccess.getClassElementRule() ||
				   context == grammarAccess.getHasManyRule() ||
				   context == grammarAccess.getRelationshipRule()) {
					sequence_HasMany(context, (HasMany) semanticObject); 
					return; 
				}
				else break;
			case RailsPackage.HASH_KEY_VALUE:
				if(context == grammarAccess.getHashKeyValueRule()) {
					sequence_HashKeyValue(context, (HashKeyValue) semanticObject); 
					return; 
				}
				else break;
			case RailsPackage.RUBY_CLASS:
				if(context == grammarAccess.getClassRule()) {
					sequence_Class(context, (RubyClass) semanticObject); 
					return; 
				}
				else break;
			case RailsPackage.RUBY_METHOD:
				if(context == grammarAccess.getClassElementRule() ||
				   context == grammarAccess.getMethodRule()) {
					sequence_Method(context, (RubyMethod) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     ((name=SYMBOL | name=STRING) options+=HashKeyValue*)
	 */
	protected void sequence_BelongsTo(EObject context, BelongsTo semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=NamespacedModuleName superType=NamespacedModuleName? classElements+=ClassElement*)
	 */
	protected void sequence_Class(EObject context, RubyClass semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((name=SYMBOL | name=STRING) options+=HashKeyValue*)
	 */
	protected void sequence_HasAndBelongsToMany(EObject context, HasAndBelongsToMany semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((name=SYMBOL | name=STRING) options+=HashKeyValue*)
	 */
	protected void sequence_HasMany(EObject context, HasMany semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((key=ID | key=SYMBOL | key=STRING) (value=SYMBOL | value=STRING))
	 */
	protected void sequence_HashKeyValue(EObject context, HashKeyValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=MethodName
	 */
	protected void sequence_Method(EObject context, RubyMethod semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RailsPackage.Literals.CLASS_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RailsPackage.Literals.CLASS_ELEMENT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMethodAccess().getNameMethodNameParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
}
