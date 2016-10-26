/**
 */
package universal.metrics;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import universal.core.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measurement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link universal.metrics.Measurement#getElmentMeasurants <em>Elment Measurants</em>}</li>
 *   <li>{@link universal.metrics.Measurement#getRelationMeasurants <em>Relation Measurants</em>}</li>
 *   <li>{@link universal.metrics.Measurement#getMeasure <em>Measure</em>}</li>
 * </ul>
 *
 * @see universal.metrics.MetricsPackage#getMeasurement()
 * @model
 * @generated
 */
public interface Measurement extends EObject {
	/**
	 * Returns the value of the '<em><b>Elment Measurants</b></em>' reference list.
	 * The list contents are of type {@link universal.core.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elment Measurants</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elment Measurants</em>' reference list.
	 * @see universal.metrics.MetricsPackage#getMeasurement_ElmentMeasurants()
	 * @model
	 * @generated
	 */
	EList<Element> getElmentMeasurants();

	/**
	 * Returns the value of the '<em><b>Relation Measurants</b></em>' reference list.
	 * The list contents are of type {@link universal.core.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relation Measurants</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation Measurants</em>' reference list.
	 * @see universal.metrics.MetricsPackage#getMeasurement_RelationMeasurants()
	 * @model
	 * @generated
	 */
	EList<Element> getRelationMeasurants();

	/**
	 * Returns the value of the '<em><b>Measure</b></em>' reference list.
	 * The list contents are of type {@link universal.metrics.Measure}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measure</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measure</em>' reference list.
	 * @see universal.metrics.MetricsPackage#getMeasurement_Measure()
	 * @model
	 * @generated
	 */
	EList<Measure> getMeasure();

} // Measurement
