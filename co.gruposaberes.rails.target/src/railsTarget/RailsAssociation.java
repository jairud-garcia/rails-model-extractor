/**
 */
package railsTarget;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rails Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link railsTarget.RailsAssociation#getSource <em>Source</em>}</li>
 *   <li>{@link railsTarget.RailsAssociation#getTarget <em>Target</em>}</li>
 *   <li>{@link railsTarget.RailsAssociation#getForeignKeyColumnName <em>Foreign Key Column Name</em>}</li>
 *   <li>{@link railsTarget.RailsAssociation#getSourceRoleName <em>Source Role Name</em>}</li>
 *   <li>{@link railsTarget.RailsAssociation#getTargetRoleName <em>Target Role Name</em>}</li>
 *   <li>{@link railsTarget.RailsAssociation#getSourceCardinality <em>Source Cardinality</em>}</li>
 *   <li>{@link railsTarget.RailsAssociation#getTargetCardinality <em>Target Cardinality</em>}</li>
 *   <li>{@link railsTarget.RailsAssociation#getAssociationType <em>Association Type</em>}</li>
 * </ul>
 *
 * @see railsTarget.RailsTargetPackage#getRailsAssociation()
 * @model
 * @generated
 */
public interface RailsAssociation extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(RailsClass)
	 * @see railsTarget.RailsTargetPackage#getRailsAssociation_Source()
	 * @model required="true"
	 * @generated
	 */
	RailsClass getSource();

	/**
	 * Sets the value of the '{@link railsTarget.RailsAssociation#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(RailsClass value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(RailsClass)
	 * @see railsTarget.RailsTargetPackage#getRailsAssociation_Target()
	 * @model required="true"
	 * @generated
	 */
	RailsClass getTarget();

	/**
	 * Sets the value of the '{@link railsTarget.RailsAssociation#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(RailsClass value);

	/**
	 * Returns the value of the '<em><b>Foreign Key Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Foreign Key Column Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign Key Column Name</em>' attribute.
	 * @see #setForeignKeyColumnName(String)
	 * @see railsTarget.RailsTargetPackage#getRailsAssociation_ForeignKeyColumnName()
	 * @model
	 * @generated
	 */
	String getForeignKeyColumnName();

	/**
	 * Sets the value of the '{@link railsTarget.RailsAssociation#getForeignKeyColumnName <em>Foreign Key Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Foreign Key Column Name</em>' attribute.
	 * @see #getForeignKeyColumnName()
	 * @generated
	 */
	void setForeignKeyColumnName(String value);

	/**
	 * Returns the value of the '<em><b>Source Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Role Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Role Name</em>' attribute.
	 * @see #setSourceRoleName(String)
	 * @see railsTarget.RailsTargetPackage#getRailsAssociation_SourceRoleName()
	 * @model
	 * @generated
	 */
	String getSourceRoleName();

	/**
	 * Sets the value of the '{@link railsTarget.RailsAssociation#getSourceRoleName <em>Source Role Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Role Name</em>' attribute.
	 * @see #getSourceRoleName()
	 * @generated
	 */
	void setSourceRoleName(String value);

	/**
	 * Returns the value of the '<em><b>Target Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Role Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Role Name</em>' attribute.
	 * @see #setTargetRoleName(String)
	 * @see railsTarget.RailsTargetPackage#getRailsAssociation_TargetRoleName()
	 * @model
	 * @generated
	 */
	String getTargetRoleName();

	/**
	 * Sets the value of the '{@link railsTarget.RailsAssociation#getTargetRoleName <em>Target Role Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Role Name</em>' attribute.
	 * @see #getTargetRoleName()
	 * @generated
	 */
	void setTargetRoleName(String value);

	/**
	 * Returns the value of the '<em><b>Source Cardinality</b></em>' attribute.
	 * The literals are from the enumeration {@link railsTarget.RailsCardinality}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Cardinality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Cardinality</em>' attribute.
	 * @see railsTarget.RailsCardinality
	 * @see #setSourceCardinality(RailsCardinality)
	 * @see railsTarget.RailsTargetPackage#getRailsAssociation_SourceCardinality()
	 * @model required="true"
	 * @generated
	 */
	RailsCardinality getSourceCardinality();

	/**
	 * Sets the value of the '{@link railsTarget.RailsAssociation#getSourceCardinality <em>Source Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Cardinality</em>' attribute.
	 * @see railsTarget.RailsCardinality
	 * @see #getSourceCardinality()
	 * @generated
	 */
	void setSourceCardinality(RailsCardinality value);

	/**
	 * Returns the value of the '<em><b>Target Cardinality</b></em>' attribute.
	 * The literals are from the enumeration {@link railsTarget.RailsCardinality}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Cardinality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Cardinality</em>' attribute.
	 * @see railsTarget.RailsCardinality
	 * @see #setTargetCardinality(RailsCardinality)
	 * @see railsTarget.RailsTargetPackage#getRailsAssociation_TargetCardinality()
	 * @model required="true"
	 * @generated
	 */
	RailsCardinality getTargetCardinality();

	/**
	 * Sets the value of the '{@link railsTarget.RailsAssociation#getTargetCardinality <em>Target Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Cardinality</em>' attribute.
	 * @see railsTarget.RailsCardinality
	 * @see #getTargetCardinality()
	 * @generated
	 */
	void setTargetCardinality(RailsCardinality value);

	/**
	 * Returns the value of the '<em><b>Association Type</b></em>' attribute.
	 * The literals are from the enumeration {@link railsTarget.RailsAssociationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Type</em>' attribute.
	 * @see railsTarget.RailsAssociationType
	 * @see #setAssociationType(RailsAssociationType)
	 * @see railsTarget.RailsTargetPackage#getRailsAssociation_AssociationType()
	 * @model required="true"
	 * @generated
	 */
	RailsAssociationType getAssociationType();

	/**
	 * Sets the value of the '{@link railsTarget.RailsAssociation#getAssociationType <em>Association Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association Type</em>' attribute.
	 * @see railsTarget.RailsAssociationType
	 * @see #getAssociationType()
	 * @generated
	 */
	void setAssociationType(RailsAssociationType value);

} // RailsAssociation
