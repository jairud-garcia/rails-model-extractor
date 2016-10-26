/**
 */
package universal.oracleforms;

import universal.core.Relation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Relation Classes
 * <!-- end-model-doc -->
 *
 *
 * @see universal.oracleforms.OracleformsPackage#getModuleRelationship()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='moduleRealtionshiRuel_SourceMustBeModule moduleRealtionshiRuel_TargetsMustBeModule'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot moduleRealtionshiRuel_SourceMustBeModule='self.source.oclIsTypeOf(Module) = true' moduleRealtionshiRuel_TargetsMustBeModule='self.target.oclIsTypeOf(Module) = true'"
 * @generated
 */
public interface ModuleRelationship extends Relation {
} // ModuleRelationship
