/**
 */
package universal.rails;

import universal.core.Application;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see universal.rails.RailsPackage#getRailsApplication()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='simpleRelationShipsInvariant basicElementsInvariant'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot simpleRelationShipsInvariant='self.simpleRelationships->forAll(e | e.oclIsTypeOf(RailsAssociation)=true)' basicElementsInvariant='self.basicElements->forAll(\n       \t\t\te | e.oclIsTypeOf(RailsMethod)=true or e.oclIsTypeOf(RailsAttribute)=true or e.oclIsTypeOf(RailsClass)=true or e.oclIsTypeOf(RailsNamespace)=true  \t\t\t\n       \t\t)'"
 * @generated
 */
public interface RailsApplication extends Application {
} // RailsApplication
