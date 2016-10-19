/**
 */
package universal.oracleforms;

import universal.core.Relation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PLSQL Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see universal.oracleforms.OracleformsPackage#getPLSQLRelationship()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='plsqlRelationshipRule_SourceMustBeForm plsqlRelationshipRule_TargetsMustBeTable'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot plsqlRelationshipRule_SourceMustBeForm='self.source.oclIsTypeOf(Form) = true' plsqlRelationshipRule_TargetsMustBeTable='self.target.oclIsTypeOf(Table) = true'"
 * @generated
 */
public interface PLSQLRelationship extends Relation {
} // PLSQLRelationship
