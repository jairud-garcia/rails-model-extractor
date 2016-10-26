/**
 */
package universal.oracleforms;

import universal.core.Relation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form Call Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see universal.oracleforms.OracleformsPackage#getFormCallRelationship()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='formCallRelationshipRule_SourceMustBeForm formCallRelationshipRule_TargetsMustBeForms'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot formCallRelationshipRule_SourceMustBeForm='self.source->forAll(mod | mod.oclIsTypeOf(Form) = true)' formCallRelationshipRule_TargetsMustBeForms='self.target.oclIsTypeOf(Form) = true'"
 * @generated
 */
public interface FormCallRelationship extends Relation {
} // FormCallRelationship
