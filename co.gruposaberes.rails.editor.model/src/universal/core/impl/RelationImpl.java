/**
 */
package universal.core.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import universal.core.CorePackage;
import universal.core.Element;
import universal.core.Relation;

import universal.metrics.Measurement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link universal.core.impl.RelationImpl#getSource <em>Source</em>}</li>
 *   <li>{@link universal.core.impl.RelationImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link universal.core.impl.RelationImpl#getMeasurant <em>Measurant</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationImpl extends MinimalEObjectImpl.Container implements Relation {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Element source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Element target;

	/**
	 * The cached value of the '{@link #getMeasurant() <em>Measurant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurant()
	 * @generated
	 * @ordered
	 */
	protected Measurement measurant;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Element)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.RELATION__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Element newSource) {
		Element oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.RELATION__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (Element)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.RELATION__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Element newTarget) {
		Element oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.RELATION__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Measurement getMeasurant() {
		if (measurant != null && measurant.eIsProxy()) {
			InternalEObject oldMeasurant = (InternalEObject)measurant;
			measurant = (Measurement)eResolveProxy(oldMeasurant);
			if (measurant != oldMeasurant) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.RELATION__MEASURANT, oldMeasurant, measurant));
			}
		}
		return measurant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Measurement basicGetMeasurant() {
		return measurant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasurant(Measurement newMeasurant) {
		Measurement oldMeasurant = measurant;
		measurant = newMeasurant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.RELATION__MEASURANT, oldMeasurant, measurant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.RELATION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case CorePackage.RELATION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case CorePackage.RELATION__MEASURANT:
				if (resolve) return getMeasurant();
				return basicGetMeasurant();
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
			case CorePackage.RELATION__SOURCE:
				setSource((Element)newValue);
				return;
			case CorePackage.RELATION__TARGET:
				setTarget((Element)newValue);
				return;
			case CorePackage.RELATION__MEASURANT:
				setMeasurant((Measurement)newValue);
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
			case CorePackage.RELATION__SOURCE:
				setSource((Element)null);
				return;
			case CorePackage.RELATION__TARGET:
				setTarget((Element)null);
				return;
			case CorePackage.RELATION__MEASURANT:
				setMeasurant((Measurement)null);
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
			case CorePackage.RELATION__SOURCE:
				return source != null;
			case CorePackage.RELATION__TARGET:
				return target != null;
			case CorePackage.RELATION__MEASURANT:
				return measurant != null;
		}
		return super.eIsSet(featureID);
	}

} //RelationImpl
