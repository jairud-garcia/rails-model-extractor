/**
 */
package railsTarget;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see railsTarget.RailsTargetPackage
 * @generated
 */
public interface RailsTargetFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RailsTargetFactory eINSTANCE = railsTarget.impl.RailsTargetFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Rails Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rails Attribute</em>'.
	 * @generated
	 */
	RailsAttribute createRailsAttribute();

	/**
	 * Returns a new object of class '<em>Rails Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rails Method</em>'.
	 * @generated
	 */
	RailsMethod createRailsMethod();

	/**
	 * Returns a new object of class '<em>Rails Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rails Class</em>'.
	 * @generated
	 */
	RailsClass createRailsClass();

	/**
	 * Returns a new object of class '<em>Rails Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rails Association</em>'.
	 * @generated
	 */
	RailsAssociation createRailsAssociation();

	/**
	 * Returns a new object of class '<em>Rails Namespace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rails Namespace</em>'.
	 * @generated
	 */
	RailsNamespace createRailsNamespace();

	/**
	 * Returns a new object of class '<em>Rails Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rails Application</em>'.
	 * @generated
	 */
	RailsApplication createRailsApplication();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RailsTargetPackage getRailsTargetPackage();

} //RailsTargetFactory
