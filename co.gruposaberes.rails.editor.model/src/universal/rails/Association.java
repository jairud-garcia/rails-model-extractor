/**
 */
package universal.rails;

import universal.core.Relation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link universal.rails.Association#getAssociationType <em>Association Type</em>}</li>
 *   <li>{@link universal.rails.Association#getSourceName <em>Source Name</em>}</li>
 *   <li>{@link universal.rails.Association#getTargetName <em>Target Name</em>}</li>
 *   <li>{@link universal.rails.Association#getForeignKey <em>Foreign Key</em>}</li>
 * </ul>
 *
 * @see universal.rails.RailsPackage#getAssociation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='associationTypeInvariant sourceInvariant targetInvariant'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot associationTypeInvariant='self.associationType = null or \n\t\t\t\tself.associationType = \'M2M\' or self.associationType = \'O2M\' or self.associationType = \'O2O\'' sourceInvariant='self.source.oclIsTypeOf(RubyClass)=true' targetInvariant='self.target.oclIsTypeOf(RubyClass)=true'"
 * @generated
 */
public interface Association extends Relation {
	/**
	 * Returns the value of the '<em><b>Association Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Type</em>' attribute.
	 * @see #setAssociationType(String)
	 * @see universal.rails.RailsPackage#getAssociation_AssociationType()
	 * @model
	 * @generated
	 */
	String getAssociationType();

	/**
	 * Sets the value of the '{@link universal.rails.Association#getAssociationType <em>Association Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association Type</em>' attribute.
	 * @see #getAssociationType()
	 * @generated
	 */
	void setAssociationType(String value);

	/**
	 * Returns the value of the '<em><b>Source Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Name</em>' attribute.
	 * @see #setSourceName(String)
	 * @see universal.rails.RailsPackage#getAssociation_SourceName()
	 * @model
	 * @generated
	 */
	String getSourceName();

	/**
	 * Sets the value of the '{@link universal.rails.Association#getSourceName <em>Source Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Name</em>' attribute.
	 * @see #getSourceName()
	 * @generated
	 */
	void setSourceName(String value);

	/**
	 * Returns the value of the '<em><b>Target Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Name</em>' attribute.
	 * @see #setTargetName(String)
	 * @see universal.rails.RailsPackage#getAssociation_TargetName()
	 * @model
	 * @generated
	 */
	String getTargetName();

	/**
	 * Sets the value of the '{@link universal.rails.Association#getTargetName <em>Target Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Name</em>' attribute.
	 * @see #getTargetName()
	 * @generated
	 */
	void setTargetName(String value);

	/**
	 * Returns the value of the '<em><b>Foreign Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Foreign Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign Key</em>' attribute.
	 * @see #setForeignKey(String)
	 * @see universal.rails.RailsPackage#getAssociation_ForeignKey()
	 * @model
	 * @generated
	 */
	String getForeignKey();

	/**
	 * Sets the value of the '{@link universal.rails.Association#getForeignKey <em>Foreign Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Foreign Key</em>' attribute.
	 * @see #getForeignKey()
	 * @generated
	 */
	void setForeignKey(String value);

} // Association
