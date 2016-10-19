/**
 */
package universal.metrics;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Number Lines Measure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link universal.metrics.NumberLinesMeasure#getTotalLines <em>Total Lines</em>}</li>
 * </ul>
 *
 * @see universal.metrics.MetricsPackage#getNumberLinesMeasure()
 * @model
 * @generated
 */
public interface NumberLinesMeasure extends Measure {
	/**
	 * Returns the value of the '<em><b>Total Lines</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Lines</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Lines</em>' attribute.
	 * @see #setTotalLines(double)
	 * @see universal.metrics.MetricsPackage#getNumberLinesMeasure_TotalLines()
	 * @model
	 * @generated
	 */
	double getTotalLines();

	/**
	 * Sets the value of the '{@link universal.metrics.NumberLinesMeasure#getTotalLines <em>Total Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Lines</em>' attribute.
	 * @see #getTotalLines()
	 * @generated
	 */
	void setTotalLines(double value);

} // NumberLinesMeasure
