/**
 */
package universal.oracleforms;

import universal.core.Application;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Oracle Forms App</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see universal.oracleforms.OracleformsPackage#getOracleFormsApp()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='oracleAppRule_MustModule'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot oracleAppRule_MustModule='self.basicElements->forAll(md | md.oclIsTypeOf(Module)=true)'"
 * @generated
 */
public interface OracleFormsApp extends Application {
} // OracleFormsApp
