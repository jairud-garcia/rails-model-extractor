/**
 */
package universal.oracleforms;

import universal.core.Container;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see universal.oracleforms.OracleformsPackage#getModule()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='moduleInnerElementsRule'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot moduleInnerElementsRule='self.innerElements->forAll(el |\n\t\t\t\t\tel.oclIsTypeOf(Form) = true or el.oclIsTypeOf(Table) = true)'"
 * @generated
 */
public interface Module extends Container {
} // Module
