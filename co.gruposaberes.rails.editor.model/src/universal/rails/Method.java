/**
 */
package universal.rails;

import universal.core.SimpleElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link universal.rails.Method#getMethodType <em>Method Type</em>}</li>
 * </ul>
 *
 * @see universal.rails.RailsPackage#getMethod()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='methodTypeInvariant'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot methodTypeInvariant='self.methodType = \'instance\' or self.methodType = \'class\''"
 * @generated
 */
public interface Method extends SimpleElement {
	/**
	 * Returns the value of the '<em><b>Method Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Type</em>' attribute.
	 * @see #setMethodType(String)
	 * @see universal.rails.RailsPackage#getMethod_MethodType()
	 * @model
	 * @generated
	 */
	String getMethodType();

	/**
	 * Sets the value of the '{@link universal.rails.Method#getMethodType <em>Method Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Type</em>' attribute.
	 * @see #getMethodType()
	 * @generated
	 */
	void setMethodType(String value);

} // Method
