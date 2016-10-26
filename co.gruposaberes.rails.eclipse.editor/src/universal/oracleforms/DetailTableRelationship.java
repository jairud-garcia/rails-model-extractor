/**
 */
package universal.oracleforms;

import universal.core.Relation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Detail Table Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see universal.oracleforms.OracleformsPackage#getDetailTableRelationship()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='DetailTableRelationshipRule_SourceMustBeTable DetailTableRelationshipRule_TargetsMustBeTable'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot DetailTableRelationshipRule_SourceMustBeTable='self.source.oclIsTypeOf(Table) = true' DetailTableRelationshipRule_TargetsMustBeTable='self.target.oclIsTypeOf(Table) = true'"
 * @generated
 */
public interface DetailTableRelationship extends Relation {
} // DetailTableRelationship
