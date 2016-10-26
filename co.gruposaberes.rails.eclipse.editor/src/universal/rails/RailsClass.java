/**
 */
package universal.rails;

import universal.core.Container;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link universal.rails.RailsClass#getSuperClass <em>Super Class</em>}</li>
 *   <li>{@link universal.rails.RailsClass#getFullName <em>Full Name</em>}</li>
 * </ul>
 *
 * @see universal.rails.RailsPackage#getRailsClass()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='innerElementsInvariant'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot innerElementsInvariant='self.innerElements->forAll(\n\t\t\t\te|e.oclIsTypeOf(RailsMethod)=true or e.oclIsTypeOf(RailsAttribute)=true\n\t\t\t)'"
 * @generated
 */
public interface RailsClass extends Container {
	/**
	 * Returns the value of the '<em><b>Super Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Class</em>' attribute.
	 * @see #setSuperClass(String)
	 * @see universal.rails.RailsPackage#getRailsClass_SuperClass()
	 * @model
	 * @generated
	 */
	String getSuperClass();

	/**
	 * Sets the value of the '{@link universal.rails.RailsClass#getSuperClass <em>Super Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Class</em>' attribute.
	 * @see #getSuperClass()
	 * @generated
	 */
	void setSuperClass(String value);

	/**
	 * Returns the value of the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Full Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Full Name</em>' attribute.
	 * @see #setFullName(String)
	 * @see universal.rails.RailsPackage#getRailsClass_FullName()
	 * @model
	 * @generated
	 */
	String getFullName();

	/**
	 * Sets the value of the '{@link universal.rails.RailsClass#getFullName <em>Full Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Full Name</em>' attribute.
	 * @see #getFullName()
	 * @generated
	 */
	void setFullName(String value);

} // RailsClass
