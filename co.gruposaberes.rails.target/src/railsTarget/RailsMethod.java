/**
 */
package railsTarget;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rails Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link railsTarget.RailsMethod#getName <em>Name</em>}</li>
 *   <li>{@link railsTarget.RailsMethod#getMethodType <em>Method Type</em>}</li>
 * </ul>
 *
 * @see railsTarget.RailsTargetPackage#getRailsMethod()
 * @model
 * @generated
 */
public interface RailsMethod extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see railsTarget.RailsTargetPackage#getRailsMethod_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link railsTarget.RailsMethod#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Method Type</b></em>' attribute.
	 * The literals are from the enumeration {@link railsTarget.RailsMethodType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Type</em>' attribute.
	 * @see railsTarget.RailsMethodType
	 * @see #setMethodType(RailsMethodType)
	 * @see railsTarget.RailsTargetPackage#getRailsMethod_MethodType()
	 * @model required="true"
	 * @generated
	 */
	RailsMethodType getMethodType();

	/**
	 * Sets the value of the '{@link railsTarget.RailsMethod#getMethodType <em>Method Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Type</em>' attribute.
	 * @see railsTarget.RailsMethodType
	 * @see #getMethodType()
	 * @generated
	 */
	void setMethodType(RailsMethodType value);

} // RailsMethod
