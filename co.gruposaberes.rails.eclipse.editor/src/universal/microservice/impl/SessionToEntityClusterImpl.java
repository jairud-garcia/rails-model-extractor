/**
 */
package universal.microservice.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import universal.OOP.Type;

import universal.core.impl.SimpleElementImpl;

import universal.microservice.MicroservicePackage;
import universal.microservice.SessionToEntityCluster;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Session To Entity Cluster</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link universal.microservice.impl.SessionToEntityClusterImpl#getNumberOfTypes <em>Number Of Types</em>}</li>
 *   <li>{@link universal.microservice.impl.SessionToEntityClusterImpl#getNumberOfLines <em>Number Of Lines</em>}</li>
 *   <li>{@link universal.microservice.impl.SessionToEntityClusterImpl#getTypeReferences <em>Type References</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SessionToEntityClusterImpl extends SimpleElementImpl implements SessionToEntityCluster {
	/**
	 * The default value of the '{@link #getNumberOfTypes() <em>Number Of Types</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfTypes()
	 * @generated
	 * @ordered
	 */
	protected static final double NUMBER_OF_TYPES_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getNumberOfTypes() <em>Number Of Types</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfTypes()
	 * @generated
	 * @ordered
	 */
	protected double numberOfTypes = NUMBER_OF_TYPES_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfLines() <em>Number Of Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfLines()
	 * @generated
	 * @ordered
	 */
	protected static final double NUMBER_OF_LINES_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getNumberOfLines() <em>Number Of Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfLines()
	 * @generated
	 * @ordered
	 */
	protected double numberOfLines = NUMBER_OF_LINES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTypeReferences() <em>Type References</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> typeReferences;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SessionToEntityClusterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MicroservicePackage.Literals.SESSION_TO_ENTITY_CLUSTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getNumberOfTypes() {
		return numberOfTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfTypes(double newNumberOfTypes) {
		double oldNumberOfTypes = numberOfTypes;
		numberOfTypes = newNumberOfTypes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroservicePackage.SESSION_TO_ENTITY_CLUSTER__NUMBER_OF_TYPES, oldNumberOfTypes, numberOfTypes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getNumberOfLines() {
		return numberOfLines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfLines(double newNumberOfLines) {
		double oldNumberOfLines = numberOfLines;
		numberOfLines = newNumberOfLines;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroservicePackage.SESSION_TO_ENTITY_CLUSTER__NUMBER_OF_LINES, oldNumberOfLines, numberOfLines));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getTypeReferences() {
		if (typeReferences == null) {
			typeReferences = new EObjectResolvingEList<Type>(Type.class, this, MicroservicePackage.SESSION_TO_ENTITY_CLUSTER__TYPE_REFERENCES);
		}
		return typeReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MicroservicePackage.SESSION_TO_ENTITY_CLUSTER__NUMBER_OF_TYPES:
				return getNumberOfTypes();
			case MicroservicePackage.SESSION_TO_ENTITY_CLUSTER__NUMBER_OF_LINES:
				return getNumberOfLines();
			case MicroservicePackage.SESSION_TO_ENTITY_CLUSTER__TYPE_REFERENCES:
				return getTypeReferences();
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
			case MicroservicePackage.SESSION_TO_ENTITY_CLUSTER__NUMBER_OF_TYPES:
				setNumberOfTypes((Double)newValue);
				return;
			case MicroservicePackage.SESSION_TO_ENTITY_CLUSTER__NUMBER_OF_LINES:
				setNumberOfLines((Double)newValue);
				return;
			case MicroservicePackage.SESSION_TO_ENTITY_CLUSTER__TYPE_REFERENCES:
				getTypeReferences().clear();
				getTypeReferences().addAll((Collection<? extends Type>)newValue);
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
			case MicroservicePackage.SESSION_TO_ENTITY_CLUSTER__NUMBER_OF_TYPES:
				setNumberOfTypes(NUMBER_OF_TYPES_EDEFAULT);
				return;
			case MicroservicePackage.SESSION_TO_ENTITY_CLUSTER__NUMBER_OF_LINES:
				setNumberOfLines(NUMBER_OF_LINES_EDEFAULT);
				return;
			case MicroservicePackage.SESSION_TO_ENTITY_CLUSTER__TYPE_REFERENCES:
				getTypeReferences().clear();
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
			case MicroservicePackage.SESSION_TO_ENTITY_CLUSTER__NUMBER_OF_TYPES:
				return numberOfTypes != NUMBER_OF_TYPES_EDEFAULT;
			case MicroservicePackage.SESSION_TO_ENTITY_CLUSTER__NUMBER_OF_LINES:
				return numberOfLines != NUMBER_OF_LINES_EDEFAULT;
			case MicroservicePackage.SESSION_TO_ENTITY_CLUSTER__TYPE_REFERENCES:
				return typeReferences != null && !typeReferences.isEmpty();
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
		result.append(" (numberOfTypes: ");
		result.append(numberOfTypes);
		result.append(", numberOfLines: ");
		result.append(numberOfLines);
		result.append(')');
		return result.toString();
	}

} //SessionToEntityClusterImpl
