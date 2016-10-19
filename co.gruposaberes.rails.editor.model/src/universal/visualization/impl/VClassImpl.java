/**
 */
package universal.visualization.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import universal.visualization.VClass;
import universal.visualization.VisualizationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VClass</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link universal.visualization.impl.VClassImpl#isIsShared <em>Is Shared</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VClassImpl extends VContainerImpl implements VClass {
	/**
	 * The default value of the '{@link #isIsShared() <em>Is Shared</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsShared()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SHARED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsShared() <em>Is Shared</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsShared()
	 * @generated
	 * @ordered
	 */
	protected boolean isShared = IS_SHARED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisualizationPackage.Literals.VCLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsShared() {
		return isShared;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsShared(boolean newIsShared) {
		boolean oldIsShared = isShared;
		isShared = newIsShared;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizationPackage.VCLASS__IS_SHARED, oldIsShared, isShared));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisualizationPackage.VCLASS__IS_SHARED:
				return isIsShared();
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
			case VisualizationPackage.VCLASS__IS_SHARED:
				setIsShared((Boolean)newValue);
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
			case VisualizationPackage.VCLASS__IS_SHARED:
				setIsShared(IS_SHARED_EDEFAULT);
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
			case VisualizationPackage.VCLASS__IS_SHARED:
				return isShared != IS_SHARED_EDEFAULT;
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
		result.append(" (isShared: ");
		result.append(isShared);
		result.append(')');
		return result.toString();
	}

} //VClassImpl
