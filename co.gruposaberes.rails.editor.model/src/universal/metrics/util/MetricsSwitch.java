/**
 */
package universal.metrics.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import universal.metrics.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see universal.metrics.MetricsPackage
 * @generated
 */
public class MetricsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MetricsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricsSwitch() {
		if (modelPackage == null) {
			modelPackage = MetricsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case MetricsPackage.MEASUREMENT: {
				Measurement measurement = (Measurement)theEObject;
				T result = caseMeasurement(measurement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetricsPackage.GRADE: {
				Grade grade = (Grade)theEObject;
				T result = caseGrade(grade);
				if (result == null) result = caseMeasurement(grade);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetricsPackage.DIMENSIONAL_MEASUREMENT: {
				DimensionalMeasurement dimensionalMeasurement = (DimensionalMeasurement)theEObject;
				T result = caseDimensionalMeasurement(dimensionalMeasurement);
				if (result == null) result = caseMeasurement(dimensionalMeasurement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetricsPackage.DIMENSIONAL_TO_OBJECT_MEASUREMENT: {
				DimensionalToObjectMeasurement dimensionalToObjectMeasurement = (DimensionalToObjectMeasurement)theEObject;
				T result = caseDimensionalToObjectMeasurement(dimensionalToObjectMeasurement);
				if (result == null) result = caseDimensionalMeasurement(dimensionalToObjectMeasurement);
				if (result == null) result = caseMeasurement(dimensionalToObjectMeasurement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetricsPackage.MEASURE: {
				Measure measure = (Measure)theEObject;
				T result = caseMeasure(measure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetricsPackage.SIMPLIFIED_DECISION_METRICS: {
				SimplifiedDecisionMetrics simplifiedDecisionMetrics = (SimplifiedDecisionMetrics)theEObject;
				T result = caseSimplifiedDecisionMetrics(simplifiedDecisionMetrics);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetricsPackage.OBSERVATIONS: {
				Observations observations = (Observations)theEObject;
				T result = caseObservations(observations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetricsPackage.NUMBER_LINES_MEASURE: {
				NumberLinesMeasure numberLinesMeasure = (NumberLinesMeasure)theEObject;
				T result = caseNumberLinesMeasure(numberLinesMeasure);
				if (result == null) result = caseMeasure(numberLinesMeasure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measurement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measurement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasurement(Measurement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Grade</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Grade</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGrade(Grade object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dimensional Measurement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dimensional Measurement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDimensionalMeasurement(DimensionalMeasurement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dimensional To Object Measurement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dimensional To Object Measurement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDimensionalToObjectMeasurement(DimensionalToObjectMeasurement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasure(Measure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simplified Decision Metrics</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simplified Decision Metrics</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimplifiedDecisionMetrics(SimplifiedDecisionMetrics object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Observations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Observations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObservations(Observations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Lines Measure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Lines Measure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumberLinesMeasure(NumberLinesMeasure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //MetricsSwitch
