/**
 */
package universal.metrics.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import universal.metrics.DimensionalMeasurement;
import universal.metrics.MetricsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dimensional Measurement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link universal.metrics.impl.DimensionalMeasurementImpl#getDimensionValue <em>Dimension Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DimensionalMeasurementImpl extends MeasurementImpl implements DimensionalMeasurement {
	/**
	 * The default value of the '{@link #getDimensionValue() <em>Dimension Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimensionValue()
	 * @generated
	 * @ordered
	 */
	protected static final double DIMENSION_VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDimensionValue() <em>Dimension Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimensionValue()
	 * @generated
	 * @ordered
	 */
	protected double dimensionValue = DIMENSION_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DimensionalMeasurementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricsPackage.Literals.DIMENSIONAL_MEASUREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDimensionValue() {
		return dimensionValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDimensionValue(double newDimensionValue) {
		double oldDimensionValue = dimensionValue;
		dimensionValue = newDimensionValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetricsPackage.DIMENSIONAL_MEASUREMENT__DIMENSION_VALUE, oldDimensionValue, dimensionValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetricsPackage.DIMENSIONAL_MEASUREMENT__DIMENSION_VALUE:
				return getDimensionValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MetricsPackage.DIMENSIONAL_MEASUREMENT__DIMENSION_VALUE:
				setDimensionValue((Double)newValue);
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
			case MetricsPackage.DIMENSIONAL_MEASUREMENT__DIMENSION_VALUE:
				setDimensionValue(DIMENSION_VALUE_EDEFAULT);
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
			case MetricsPackage.DIMENSIONAL_MEASUREMENT__DIMENSION_VALUE:
				return dimensionValue != DIMENSION_VALUE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (dimensionValue: ");
		result.append(dimensionValue);
		result.append(')');
		return result.toString();
	}

} //DimensionalMeasurementImpl
