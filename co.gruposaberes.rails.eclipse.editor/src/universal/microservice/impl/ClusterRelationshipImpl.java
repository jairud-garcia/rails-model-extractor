/**
 */
package universal.microservice.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import universal.core.impl.RelationImpl;

import universal.microservice.ClusterRelationship;
import universal.microservice.MicroservicePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cluster Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link universal.microservice.impl.ClusterRelationshipImpl#getTypesContainedLeft <em>Types Contained Left</em>}</li>
 *   <li>{@link universal.microservice.impl.ClusterRelationshipImpl#getTypesContainedRight <em>Types Contained Right</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClusterRelationshipImpl extends RelationImpl implements ClusterRelationship {
	/**
	 * The default value of the '{@link #getTypesContainedLeft() <em>Types Contained Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypesContainedLeft()
	 * @generated
	 * @ordered
	 */
	protected static final double TYPES_CONTAINED_LEFT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTypesContainedLeft() <em>Types Contained Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypesContainedLeft()
	 * @generated
	 * @ordered
	 */
	protected double typesContainedLeft = TYPES_CONTAINED_LEFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypesContainedRight() <em>Types Contained Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypesContainedRight()
	 * @generated
	 * @ordered
	 */
	protected static final double TYPES_CONTAINED_RIGHT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTypesContainedRight() <em>Types Contained Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypesContainedRight()
	 * @generated
	 * @ordered
	 */
	protected double typesContainedRight = TYPES_CONTAINED_RIGHT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClusterRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MicroservicePackage.Literals.CLUSTER_RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTypesContainedLeft() {
		return typesContainedLeft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypesContainedLeft(double newTypesContainedLeft) {
		double oldTypesContainedLeft = typesContainedLeft;
		typesContainedLeft = newTypesContainedLeft;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroservicePackage.CLUSTER_RELATIONSHIP__TYPES_CONTAINED_LEFT, oldTypesContainedLeft, typesContainedLeft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTypesContainedRight() {
		return typesContainedRight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypesContainedRight(double newTypesContainedRight) {
		double oldTypesContainedRight = typesContainedRight;
		typesContainedRight = newTypesContainedRight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroservicePackage.CLUSTER_RELATIONSHIP__TYPES_CONTAINED_RIGHT, oldTypesContainedRight, typesContainedRight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MicroservicePackage.CLUSTER_RELATIONSHIP__TYPES_CONTAINED_LEFT:
				return getTypesContainedLeft();
			case MicroservicePackage.CLUSTER_RELATIONSHIP__TYPES_CONTAINED_RIGHT:
				return getTypesContainedRight();
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
			case MicroservicePackage.CLUSTER_RELATIONSHIP__TYPES_CONTAINED_LEFT:
				setTypesContainedLeft((Double)newValue);
				return;
			case MicroservicePackage.CLUSTER_RELATIONSHIP__TYPES_CONTAINED_RIGHT:
				setTypesContainedRight((Double)newValue);
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
			case MicroservicePackage.CLUSTER_RELATIONSHIP__TYPES_CONTAINED_LEFT:
				setTypesContainedLeft(TYPES_CONTAINED_LEFT_EDEFAULT);
				return;
			case MicroservicePackage.CLUSTER_RELATIONSHIP__TYPES_CONTAINED_RIGHT:
				setTypesContainedRight(TYPES_CONTAINED_RIGHT_EDEFAULT);
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
			case MicroservicePackage.CLUSTER_RELATIONSHIP__TYPES_CONTAINED_LEFT:
				return typesContainedLeft != TYPES_CONTAINED_LEFT_EDEFAULT;
			case MicroservicePackage.CLUSTER_RELATIONSHIP__TYPES_CONTAINED_RIGHT:
				return typesContainedRight != TYPES_CONTAINED_RIGHT_EDEFAULT;
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
		result.append(" (typesContainedLeft: ");
		result.append(typesContainedLeft);
		result.append(", typesContainedRight: ");
		result.append(typesContainedRight);
		result.append(')');
		return result.toString();
	}

} //ClusterRelationshipImpl
