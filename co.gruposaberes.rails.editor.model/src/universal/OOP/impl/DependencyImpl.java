/**
 */
package universal.OOP.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import universal.OOP.Dependency;
import universal.OOP.Method;
import universal.OOP.OOPPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link universal.OOP.impl.DependencyImpl#getMethodInvokedFromSourceClass <em>Method Invoked From Source Class</em>}</li>
 *   <li>{@link universal.OOP.impl.DependencyImpl#getMethodInvokerFromTargetClass <em>Method Invoker From Target Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DependencyImpl extends TypeRelationshipImpl implements Dependency {
	/**
	 * The cached value of the '{@link #getMethodInvokedFromSourceClass() <em>Method Invoked From Source Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodInvokedFromSourceClass()
	 * @generated
	 * @ordered
	 */
	protected Method methodInvokedFromSourceClass;

	/**
	 * The cached value of the '{@link #getMethodInvokerFromTargetClass() <em>Method Invoker From Target Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodInvokerFromTargetClass()
	 * @generated
	 * @ordered
	 */
	protected Method methodInvokerFromTargetClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OOPPackage.Literals.DEPENDENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method getMethodInvokedFromSourceClass() {
		if (methodInvokedFromSourceClass != null && methodInvokedFromSourceClass.eIsProxy()) {
			InternalEObject oldMethodInvokedFromSourceClass = (InternalEObject)methodInvokedFromSourceClass;
			methodInvokedFromSourceClass = (Method)eResolveProxy(oldMethodInvokedFromSourceClass);
			if (methodInvokedFromSourceClass != oldMethodInvokedFromSourceClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OOPPackage.DEPENDENCY__METHOD_INVOKED_FROM_SOURCE_CLASS, oldMethodInvokedFromSourceClass, methodInvokedFromSourceClass));
			}
		}
		return methodInvokedFromSourceClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method basicGetMethodInvokedFromSourceClass() {
		return methodInvokedFromSourceClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodInvokedFromSourceClass(Method newMethodInvokedFromSourceClass) {
		Method oldMethodInvokedFromSourceClass = methodInvokedFromSourceClass;
		methodInvokedFromSourceClass = newMethodInvokedFromSourceClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OOPPackage.DEPENDENCY__METHOD_INVOKED_FROM_SOURCE_CLASS, oldMethodInvokedFromSourceClass, methodInvokedFromSourceClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method getMethodInvokerFromTargetClass() {
		if (methodInvokerFromTargetClass != null && methodInvokerFromTargetClass.eIsProxy()) {
			InternalEObject oldMethodInvokerFromTargetClass = (InternalEObject)methodInvokerFromTargetClass;
			methodInvokerFromTargetClass = (Method)eResolveProxy(oldMethodInvokerFromTargetClass);
			if (methodInvokerFromTargetClass != oldMethodInvokerFromTargetClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OOPPackage.DEPENDENCY__METHOD_INVOKER_FROM_TARGET_CLASS, oldMethodInvokerFromTargetClass, methodInvokerFromTargetClass));
			}
		}
		return methodInvokerFromTargetClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method basicGetMethodInvokerFromTargetClass() {
		return methodInvokerFromTargetClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodInvokerFromTargetClass(Method newMethodInvokerFromTargetClass) {
		Method oldMethodInvokerFromTargetClass = methodInvokerFromTargetClass;
		methodInvokerFromTargetClass = newMethodInvokerFromTargetClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OOPPackage.DEPENDENCY__METHOD_INVOKER_FROM_TARGET_CLASS, oldMethodInvokerFromTargetClass, methodInvokerFromTargetClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OOPPackage.DEPENDENCY__METHOD_INVOKED_FROM_SOURCE_CLASS:
				if (resolve) return getMethodInvokedFromSourceClass();
				return basicGetMethodInvokedFromSourceClass();
			case OOPPackage.DEPENDENCY__METHOD_INVOKER_FROM_TARGET_CLASS:
				if (resolve) return getMethodInvokerFromTargetClass();
				return basicGetMethodInvokerFromTargetClass();
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
			case OOPPackage.DEPENDENCY__METHOD_INVOKED_FROM_SOURCE_CLASS:
				setMethodInvokedFromSourceClass((Method)newValue);
				return;
			case OOPPackage.DEPENDENCY__METHOD_INVOKER_FROM_TARGET_CLASS:
				setMethodInvokerFromTargetClass((Method)newValue);
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
			case OOPPackage.DEPENDENCY__METHOD_INVOKED_FROM_SOURCE_CLASS:
				setMethodInvokedFromSourceClass((Method)null);
				return;
			case OOPPackage.DEPENDENCY__METHOD_INVOKER_FROM_TARGET_CLASS:
				setMethodInvokerFromTargetClass((Method)null);
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
			case OOPPackage.DEPENDENCY__METHOD_INVOKED_FROM_SOURCE_CLASS:
				return methodInvokedFromSourceClass != null;
			case OOPPackage.DEPENDENCY__METHOD_INVOKER_FROM_TARGET_CLASS:
				return methodInvokerFromTargetClass != null;
		}
		return super.eIsSet(featureID);
	}

} //DependencyImpl
