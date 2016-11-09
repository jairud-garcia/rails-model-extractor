/**
 */
package railsTarget;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rails Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link railsTarget.RailsAttribute#getDataType <em>Data Type</em>}</li>
 *   <li>{@link railsTarget.RailsAttribute#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see railsTarget.RailsTargetPackage#getRailsAttribute()
 * @model
 * @generated
 */
public interface RailsAttribute extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' attribute.
	 * The literals are from the enumeration {@link railsTarget.RailsDataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' attribute.
	 * @see railsTarget.RailsDataType
	 * @see #setDataType(RailsDataType)
	 * @see railsTarget.RailsTargetPackage#getRailsAttribute_DataType()
	 * @model required="true"
	 * @generated
	 */
	RailsDataType getDataType();

	/**
	 * Sets the value of the '{@link railsTarget.RailsAttribute#getDataType <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' attribute.
	 * @see railsTarget.RailsDataType
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(RailsDataType value);

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
	 * @see railsTarget.RailsTargetPackage#getRailsAttribute_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link railsTarget.RailsAttribute#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // RailsAttribute
