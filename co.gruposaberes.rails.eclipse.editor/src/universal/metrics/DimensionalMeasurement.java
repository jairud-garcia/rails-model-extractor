/**
 */
package universal.metrics;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dimensional Measurement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link universal.metrics.DimensionalMeasurement#getDimensionValue <em>Dimension Value</em>}</li>
 * </ul>
 *
 * @see universal.metrics.MetricsPackage#getDimensionalMeasurement()
 * @model
 * @generated
 */
public interface DimensionalMeasurement extends Measurement {
	/**
	 * Returns the value of the '<em><b>Dimension Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dimension Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimension Value</em>' attribute.
	 * @see #setDimensionValue(double)
	 * @see universal.metrics.MetricsPackage#getDimensionalMeasurement_DimensionValue()
	 * @model
	 * @generated
	 */
	double getDimensionValue();

	/**
	 * Sets the value of the '{@link universal.metrics.DimensionalMeasurement#getDimensionValue <em>Dimension Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimension Value</em>' attribute.
	 * @see #getDimensionValue()
	 * @generated
	 */
	void setDimensionValue(double value);

} // DimensionalMeasurement
