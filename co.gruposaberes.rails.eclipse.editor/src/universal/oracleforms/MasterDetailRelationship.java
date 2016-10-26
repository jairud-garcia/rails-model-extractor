/**
 */
package universal.oracleforms;

import universal.core.RelationContainer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Master Detail Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see universal.oracleforms.OracleformsPackage#getMasterDetailRelationship()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='masterDetailRelationshipRule_LimitRelations masterDetailRelationshipRule_FirstMustBeSingleTableRelationship masterDetailRelationshipRule_SegundMustBeSingleTableRelationship'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot masterDetailRelationshipRule_LimitRelations='self.relations->size() = 2' masterDetailRelationshipRule_FirstMustBeSingleTableRelationship='self.relations->first().oclIsTypeOf(SingleTableRelationship) = true' masterDetailRelationshipRule_SegundMustBeSingleTableRelationship='self.relations->last().oclIsTypeOf(DetailTableRelationship) = true'"
 * @generated
 */
public interface MasterDetailRelationship extends RelationContainer {
} // MasterDetailRelationship
