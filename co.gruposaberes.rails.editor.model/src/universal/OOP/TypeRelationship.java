/**
 */
package universal.OOP;

import universal.core.Relation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Relation Classes
 * <!-- end-model-doc -->
 *
 *
 * @see universal.OOP.OOPPackage#getTypeRelationship()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='typeRelationshipRule_SourceMustBeType typeRelationshipRule_TargetsMustBeTypes'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot typeRelationshipRule_SourceMustBeType='self.source.oclIsKindOf(Type) = true' typeRelationshipRule_TargetsMustBeTypes='self.target.oclIsKindOf(Type) = true'"
 * @generated
 */
public interface TypeRelationship extends Relation {
} // TypeRelationship
