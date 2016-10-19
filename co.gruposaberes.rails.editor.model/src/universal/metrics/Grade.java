/**
 */
package universal.metrics;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grade</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link universal.metrics.Grade#getGradeValue <em>Grade Value</em>}</li>
 * </ul>
 *
 * @see universal.metrics.MetricsPackage#getGrade()
 * @model
 * @generated
 */
public interface Grade extends Measurement {
	/**
	 * Returns the value of the '<em><b>Grade Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grade Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grade Value</em>' attribute.
	 * @see #setGradeValue(String)
	 * @see universal.metrics.MetricsPackage#getGrade_GradeValue()
	 * @model
	 * @generated
	 */
	String getGradeValue();

	/**
	 * Sets the value of the '{@link universal.metrics.Grade#getGradeValue <em>Grade Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grade Value</em>' attribute.
	 * @see #getGradeValue()
	 * @generated
	 */
	void setGradeValue(String value);

} // Grade
