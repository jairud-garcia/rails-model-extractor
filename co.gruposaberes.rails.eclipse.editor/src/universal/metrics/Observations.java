/**
 */
package universal.metrics;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Observations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link universal.metrics.Observations#getWhenObserved <em>When Observed</em>}</li>
 *   <li>{@link universal.metrics.Observations#getMeasurement <em>Measurement</em>}</li>
 * </ul>
 *
 * @see universal.metrics.MetricsPackage#getObservations()
 * @model
 * @generated
 */
public interface Observations extends EObject {
	/**
	 * Returns the value of the '<em><b>When Observed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>When Observed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>When Observed</em>' attribute.
	 * @see #setWhenObserved(Date)
	 * @see universal.metrics.MetricsPackage#getObservations_WhenObserved()
	 * @model
	 * @generated
	 */
	Date getWhenObserved();

	/**
	 * Sets the value of the '{@link universal.metrics.Observations#getWhenObserved <em>When Observed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When Observed</em>' attribute.
	 * @see #getWhenObserved()
	 * @generated
	 */
	void setWhenObserved(Date value);

	/**
	 * Returns the value of the '<em><b>Measurement</b></em>' containment reference list.
	 * The list contents are of type {@link universal.metrics.Measurement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurement</em>' containment reference list.
	 * @see universal.metrics.MetricsPackage#getObservations_Measurement()
	 * @model containment="true"
	 * @generated
	 */
	EList<Measurement> getMeasurement();

} // Observations
