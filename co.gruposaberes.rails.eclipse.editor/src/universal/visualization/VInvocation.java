/**
 */
package universal.visualization;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VInvocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link universal.visualization.VInvocation#getFromMethod <em>From Method</em>}</li>
 *   <li>{@link universal.visualization.VInvocation#getToMethod <em>To Method</em>}</li>
 * </ul>
 *
 * @see universal.visualization.VisualizationPackage#getVInvocation()
 * @model
 * @generated
 */
public interface VInvocation extends EObject {
	/**
	 * Returns the value of the '<em><b>From Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Method</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Method</em>' reference.
	 * @see #setFromMethod(VRelationInvocation)
	 * @see universal.visualization.VisualizationPackage#getVInvocation_FromMethod()
	 * @model
	 * @generated
	 */
	VRelationInvocation getFromMethod();

	/**
	 * Sets the value of the '{@link universal.visualization.VInvocation#getFromMethod <em>From Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Method</em>' reference.
	 * @see #getFromMethod()
	 * @generated
	 */
	void setFromMethod(VRelationInvocation value);

	/**
	 * Returns the value of the '<em><b>To Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Method</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Method</em>' reference.
	 * @see #setToMethod(VRelationInvocation)
	 * @see universal.visualization.VisualizationPackage#getVInvocation_ToMethod()
	 * @model
	 * @generated
	 */
	VRelationInvocation getToMethod();

	/**
	 * Sets the value of the '{@link universal.visualization.VInvocation#getToMethod <em>To Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Method</em>' reference.
	 * @see #getToMethod()
	 * @generated
	 */
	void setToMethod(VRelationInvocation value);

} // VInvocation
