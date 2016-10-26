/**
 */
package universal.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link universal.core.Container#getInnerElements <em>Inner Elements</em>}</li>
 * </ul>
 *
 * @see universal.core.CorePackage#getContainer()
 * @model
 * @generated
 */
public interface Container extends Element {
	/**
	 * Returns the value of the '<em><b>Inner Elements</b></em>' containment reference list.
	 * The list contents are of type {@link universal.core.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inner Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner Elements</em>' containment reference list.
	 * @see universal.core.CorePackage#getContainer_InnerElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getInnerElements();

} // Container
