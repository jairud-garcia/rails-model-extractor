/**
 */
package universal.oracleforms;

import universal.core.Relation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Table Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see universal.oracleforms.OracleformsPackage#getSingleTableRelationship()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='singleTableRelationshipRule_SourceMustBeForm singleTableRelationshipRule_TargetsMustBeTable'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot singleTableRelationshipRule_SourceMustBeForm='self.source.oclIsTypeOf(Form) = true' singleTableRelationshipRule_TargetsMustBeTable='self.target.oclIsTypeOf(Table) = true'"
 * @generated
 */
public interface SingleTableRelationship extends Relation {
} // SingleTableRelationship
