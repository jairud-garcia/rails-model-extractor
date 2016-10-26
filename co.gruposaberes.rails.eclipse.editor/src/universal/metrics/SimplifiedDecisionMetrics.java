/**
 */
package universal.metrics;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simplified Decision Metrics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link universal.metrics.SimplifiedDecisionMetrics#getMeasures <em>Measures</em>}</li>
 *   <li>{@link universal.metrics.SimplifiedDecisionMetrics#getObservations <em>Observations</em>}</li>
 * </ul>
 *
 * @see universal.metrics.MetricsPackage#getSimplifiedDecisionMetrics()
 * @model
 * @generated
 */
public interface SimplifiedDecisionMetrics extends EObject {
	/**
	 * Returns the value of the '<em><b>Measures</b></em>' containment reference list.
	 * The list contents are of type {@link universal.metrics.Measure}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measures</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measures</em>' containment reference list.
	 * @see universal.metrics.MetricsPackage#getSimplifiedDecisionMetrics_Measures()
	 * @model containment="true"
	 * @generated
	 */
	EList<Measure> getMeasures();

	/**
	 * Returns the value of the '<em><b>Observations</b></em>' containment reference list.
	 * The list contents are of type {@link universal.metrics.Observations}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Observations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Observations</em>' containment reference list.
	 * @see universal.metrics.MetricsPackage#getSimplifiedDecisionMetrics_Observations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Observations> getObservations();

} // SimplifiedDecisionMetrics
