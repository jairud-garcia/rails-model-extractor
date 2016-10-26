/**
 */
package universal.visualization.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import universal.visualization.VInvocation;
import universal.visualization.VRelationInvocation;
import universal.visualization.VisualizationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VInvocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link universal.visualization.impl.VInvocationImpl#getFromMethod <em>From Method</em>}</li>
 *   <li>{@link universal.visualization.impl.VInvocationImpl#getToMethod <em>To Method</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VInvocationImpl extends EObjectImpl implements VInvocation {
	/**
	 * The cached value of the '{@link #getFromMethod() <em>From Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromMethod()
	 * @generated
	 * @ordered
	 */
	protected VRelationInvocation fromMethod;

	/**
	 * The cached value of the '{@link #getToMethod() <em>To Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToMethod()
	 * @generated
	 * @ordered
	 */
	protected VRelationInvocation toMethod;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VInvocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisualizationPackage.Literals.VINVOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VRelationInvocation getFromMethod() {
		if (fromMethod != null && fromMethod.eIsProxy()) {
			InternalEObject oldFromMethod = (InternalEObject)fromMethod;
			fromMethod = (VRelationInvocation)eResolveProxy(oldFromMethod);
			if (fromMethod != oldFromMethod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VisualizationPackage.VINVOCATION__FROM_METHOD, oldFromMethod, fromMethod));
			}
		}
		return fromMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VRelationInvocation basicGetFromMethod() {
		return fromMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromMethod(VRelationInvocation newFromMethod) {
		VRelationInvocation oldFromMethod = fromMethod;
		fromMethod = newFromMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizationPackage.VINVOCATION__FROM_METHOD, oldFromMethod, fromMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VRelationInvocation getToMethod() {
		if (toMethod != null && toMethod.eIsProxy()) {
			InternalEObject oldToMethod = (InternalEObject)toMethod;
			toMethod = (VRelationInvocation)eResolveProxy(oldToMethod);
			if (toMethod != oldToMethod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VisualizationPackage.VINVOCATION__TO_METHOD, oldToMethod, toMethod));
			}
		}
		return toMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VRelationInvocation basicGetToMethod() {
		return toMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToMethod(VRelationInvocation newToMethod) {
		VRelationInvocation oldToMethod = toMethod;
		toMethod = newToMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizationPackage.VINVOCATION__TO_METHOD, oldToMethod, toMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisualizationPackage.VINVOCATION__FROM_METHOD:
				if (resolve) return getFromMethod();
				return basicGetFromMethod();
			case VisualizationPackage.VINVOCATION__TO_METHOD:
				if (resolve) return getToMethod();
				return basicGetToMethod();
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
			case VisualizationPackage.VINVOCATION__FROM_METHOD:
				setFromMethod((VRelationInvocation)newValue);
				return;
			case VisualizationPackage.VINVOCATION__TO_METHOD:
				setToMethod((VRelationInvocation)newValue);
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
			case VisualizationPackage.VINVOCATION__FROM_METHOD:
				setFromMethod((VRelationInvocation)null);
				return;
			case VisualizationPackage.VINVOCATION__TO_METHOD:
				setToMethod((VRelationInvocation)null);
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
			case VisualizationPackage.VINVOCATION__FROM_METHOD:
				return fromMethod != null;
			case VisualizationPackage.VINVOCATION__TO_METHOD:
				return toMethod != null;
		}
		return super.eIsSet(featureID);
	}

} //VInvocationImpl
