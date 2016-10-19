/**
 */
package universal.metrics.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import universal.metrics.Measure;
import universal.metrics.MetricsPackage;
import universal.metrics.Observations;
import universal.metrics.SimplifiedDecisionMetrics;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simplified Decision Metrics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link universal.metrics.impl.SimplifiedDecisionMetricsImpl#getMeasures <em>Measures</em>}</li>
 *   <li>{@link universal.metrics.impl.SimplifiedDecisionMetricsImpl#getObservations <em>Observations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimplifiedDecisionMetricsImpl extends MinimalEObjectImpl.Container implements SimplifiedDecisionMetrics {
	/**
	 * The cached value of the '{@link #getMeasures() <em>Measures</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasures()
	 * @generated
	 * @ordered
	 */
	protected EList<Measure> measures;

	/**
	 * The cached value of the '{@link #getObservations() <em>Observations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservations()
	 * @generated
	 * @ordered
	 */
	protected EList<Observations> observations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimplifiedDecisionMetricsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricsPackage.Literals.SIMPLIFIED_DECISION_METRICS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Measure> getMeasures() {
		if (measures == null) {
			measures = new EObjectContainmentEList<Measure>(Measure.class, this, MetricsPackage.SIMPLIFIED_DECISION_METRICS__MEASURES);
		}
		return measures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Observations> getObservations() {
		if (observations == null) {
			observations = new EObjectContainmentEList<Observations>(Observations.class, this, MetricsPackage.SIMPLIFIED_DECISION_METRICS__OBSERVATIONS);
		}
		return observations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetricsPackage.SIMPLIFIED_DECISION_METRICS__MEASURES:
				return ((InternalEList<?>)getMeasures()).basicRemove(otherEnd, msgs);
			case MetricsPackage.SIMPLIFIED_DECISION_METRICS__OBSERVATIONS:
				return ((InternalEList<?>)getObservations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetricsPackage.SIMPLIFIED_DECISION_METRICS__MEASURES:
				return getMeasures();
			case MetricsPackage.SIMPLIFIED_DECISION_METRICS__OBSERVATIONS:
				return getObservations();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MetricsPackage.SIMPLIFIED_DECISION_METRICS__MEASURES:
				getMeasures().clear();
				getMeasures().addAll((Collection<? extends Measure>)newValue);
				return;
			case MetricsPackage.SIMPLIFIED_DECISION_METRICS__OBSERVATIONS:
				getObservations().clear();
				getObservations().addAll((Collection<? extends Observations>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MetricsPackage.SIMPLIFIED_DECISION_METRICS__MEASURES:
				getMeasures().clear();
				return;
			case MetricsPackage.SIMPLIFIED_DECISION_METRICS__OBSERVATIONS:
				getObservations().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MetricsPackage.SIMPLIFIED_DECISION_METRICS__MEASURES:
				return measures != null && !measures.isEmpty();
			case MetricsPackage.SIMPLIFIED_DECISION_METRICS__OBSERVATIONS:
				return observations != null && !observations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SimplifiedDecisionMetricsImpl
