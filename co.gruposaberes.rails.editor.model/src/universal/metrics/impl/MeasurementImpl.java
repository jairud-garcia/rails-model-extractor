/**
 */
package universal.metrics.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import universal.core.Element;

import universal.metrics.Measure;
import universal.metrics.Measurement;
import universal.metrics.MetricsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measurement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link universal.metrics.impl.MeasurementImpl#getElmentMeasurants <em>Elment Measurants</em>}</li>
 *   <li>{@link universal.metrics.impl.MeasurementImpl#getRelationMeasurants <em>Relation Measurants</em>}</li>
 *   <li>{@link universal.metrics.impl.MeasurementImpl#getMeasure <em>Measure</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeasurementImpl extends MinimalEObjectImpl.Container implements Measurement {
	/**
	 * The cached value of the '{@link #getElmentMeasurants() <em>Elment Measurants</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElmentMeasurants()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> elmentMeasurants;

	/**
	 * The cached value of the '{@link #getRelationMeasurants() <em>Relation Measurants</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationMeasurants()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> relationMeasurants;

	/**
	 * The cached value of the '{@link #getMeasure() <em>Measure</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasure()
	 * @generated
	 * @ordered
	 */
	protected EList<Measure> measure;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasurementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricsPackage.Literals.MEASUREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getElmentMeasurants() {
		if (elmentMeasurants == null) {
			elmentMeasurants = new EObjectResolvingEList<Element>(Element.class, this, MetricsPackage.MEASUREMENT__ELMENT_MEASURANTS);
		}
		return elmentMeasurants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getRelationMeasurants() {
		if (relationMeasurants == null) {
			relationMeasurants = new EObjectResolvingEList<Element>(Element.class, this, MetricsPackage.MEASUREMENT__RELATION_MEASURANTS);
		}
		return relationMeasurants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Measure> getMeasure() {
		if (measure == null) {
			measure = new EObjectResolvingEList<Measure>(Measure.class, this, MetricsPackage.MEASUREMENT__MEASURE);
		}
		return measure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetricsPackage.MEASUREMENT__ELMENT_MEASURANTS:
				return getElmentMeasurants();
			case MetricsPackage.MEASUREMENT__RELATION_MEASURANTS:
				return getRelationMeasurants();
			case MetricsPackage.MEASUREMENT__MEASURE:
				return getMeasure();
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
			case MetricsPackage.MEASUREMENT__ELMENT_MEASURANTS:
				getElmentMeasurants().clear();
				getElmentMeasurants().addAll((Collection<? extends Element>)newValue);
				return;
			case MetricsPackage.MEASUREMENT__RELATION_MEASURANTS:
				getRelationMeasurants().clear();
				getRelationMeasurants().addAll((Collection<? extends Element>)newValue);
				return;
			case MetricsPackage.MEASUREMENT__MEASURE:
				getMeasure().clear();
				getMeasure().addAll((Collection<? extends Measure>)newValue);
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
			case MetricsPackage.MEASUREMENT__ELMENT_MEASURANTS:
				getElmentMeasurants().clear();
				return;
			case MetricsPackage.MEASUREMENT__RELATION_MEASURANTS:
				getRelationMeasurants().clear();
				return;
			case MetricsPackage.MEASUREMENT__MEASURE:
				getMeasure().clear();
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
			case MetricsPackage.MEASUREMENT__ELMENT_MEASURANTS:
				return elmentMeasurants != null && !elmentMeasurants.isEmpty();
			case MetricsPackage.MEASUREMENT__RELATION_MEASURANTS:
				return relationMeasurants != null && !relationMeasurants.isEmpty();
			case MetricsPackage.MEASUREMENT__MEASURE:
				return measure != null && !measure.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MeasurementImpl
