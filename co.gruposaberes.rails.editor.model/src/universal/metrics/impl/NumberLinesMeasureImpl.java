/**
 */
package universal.metrics.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import universal.metrics.MetricsPackage;
import universal.metrics.NumberLinesMeasure;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Number Lines Measure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link universal.metrics.impl.NumberLinesMeasureImpl#getTotalLines <em>Total Lines</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NumberLinesMeasureImpl extends MeasureImpl implements NumberLinesMeasure {
	/**
	 * The default value of the '{@link #getTotalLines() <em>Total Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalLines()
	 * @generated
	 * @ordered
	 */
	protected static final double TOTAL_LINES_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTotalLines() <em>Total Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalLines()
	 * @generated
	 * @ordered
	 */
	protected double totalLines = TOTAL_LINES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumberLinesMeasureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricsPackage.Literals.NUMBER_LINES_MEASURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTotalLines() {
		return totalLines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalLines(double newTotalLines) {
		double oldTotalLines = totalLines;
		totalLines = newTotalLines;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetricsPackage.NUMBER_LINES_MEASURE__TOTAL_LINES, oldTotalLines, totalLines));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetricsPackage.NUMBER_LINES_MEASURE__TOTAL_LINES:
				return getTotalLines();
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
			case MetricsPackage.NUMBER_LINES_MEASURE__TOTAL_LINES:
				setTotalLines((Double)newValue);
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
			case MetricsPackage.NUMBER_LINES_MEASURE__TOTAL_LINES:
				setTotalLines(TOTAL_LINES_EDEFAULT);
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
			case MetricsPackage.NUMBER_LINES_MEASURE__TOTAL_LINES:
				return totalLines != TOTAL_LINES_EDEFAULT;
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
		result.append(" (totalLines: ");
		result.append(totalLines);
		result.append(')');
		return result.toString();
	}

} //NumberLinesMeasureImpl
