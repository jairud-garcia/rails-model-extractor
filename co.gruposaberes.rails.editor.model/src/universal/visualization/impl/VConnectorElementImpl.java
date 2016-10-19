/**
 */
package universal.visualization.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import universal.core.CorePackage;
import universal.core.Element;
import universal.core.Relation;

import universal.metrics.Measurement;

import universal.visualization.ArrowType;
import universal.visualization.LineType;
import universal.visualization.RoutingType;
import universal.visualization.VConnectorElement;
import universal.visualization.VDiagramElement;
import universal.visualization.VInvocation;
import universal.visualization.VisualizationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VConnector Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link universal.visualization.impl.VConnectorElementImpl#getSource <em>Source</em>}</li>
 *   <li>{@link universal.visualization.impl.VConnectorElementImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link universal.visualization.impl.VConnectorElementImpl#getMeasurant <em>Measurant</em>}</li>
 *   <li>{@link universal.visualization.impl.VConnectorElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link universal.visualization.impl.VConnectorElementImpl#getLineType <em>Line Type</em>}</li>
 *   <li>{@link universal.visualization.impl.VConnectorElementImpl#getRoutingType <em>Routing Type</em>}</li>
 *   <li>{@link universal.visualization.impl.VConnectorElementImpl#getArrowTypeForSource <em>Arrow Type For Source</em>}</li>
 *   <li>{@link universal.visualization.impl.VConnectorElementImpl#getArrowTypeForTarget <em>Arrow Type For Target</em>}</li>
 *   <li>{@link universal.visualization.impl.VConnectorElementImpl#getSourceID <em>Source ID</em>}</li>
 *   <li>{@link universal.visualization.impl.VConnectorElementImpl#getTargetID <em>Target ID</em>}</li>
 *   <li>{@link universal.visualization.impl.VConnectorElementImpl#getInvocations <em>Invocations</em>}</li>
 *   <li>{@link universal.visualization.impl.VConnectorElementImpl#getConnectors <em>Connectors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VConnectorElementImpl extends VDrawableImpl implements VConnectorElement {
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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLineType() <em>Line Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineType()
	 * @generated
	 * @ordered
	 */
	protected static final LineType LINE_TYPE_EDEFAULT = LineType.STRING;

	/**
	 * The cached value of the '{@link #getLineType() <em>Line Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineType()
	 * @generated
	 * @ordered
	 */
	protected LineType lineType = LINE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRoutingType() <em>Routing Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoutingType()
	 * @generated
	 * @ordered
	 */
	protected static final RoutingType ROUTING_TYPE_EDEFAULT = RoutingType.DIRECT;

	/**
	 * The cached value of the '{@link #getRoutingType() <em>Routing Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoutingType()
	 * @generated
	 * @ordered
	 */
	protected RoutingType routingType = ROUTING_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getArrowTypeForSource() <em>Arrow Type For Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrowTypeForSource()
	 * @generated
	 * @ordered
	 */
	protected static final ArrowType ARROW_TYPE_FOR_SOURCE_EDEFAULT = ArrowType.NONE;

	/**
	 * The cached value of the '{@link #getArrowTypeForSource() <em>Arrow Type For Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrowTypeForSource()
	 * @generated
	 * @ordered
	 */
	protected ArrowType arrowTypeForSource = ARROW_TYPE_FOR_SOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getArrowTypeForTarget() <em>Arrow Type For Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrowTypeForTarget()
	 * @generated
	 * @ordered
	 */
	protected static final ArrowType ARROW_TYPE_FOR_TARGET_EDEFAULT = ArrowType.NONE;

	/**
	 * The cached value of the '{@link #getArrowTypeForTarget() <em>Arrow Type For Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrowTypeForTarget()
	 * @generated
	 * @ordered
	 */
	protected ArrowType arrowTypeForTarget = ARROW_TYPE_FOR_TARGET_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceID() <em>Source ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceID()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceID() <em>Source ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceID()
	 * @generated
	 * @ordered
	 */
	protected String sourceID = SOURCE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetID() <em>Target ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetID()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetID() <em>Target ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetID()
	 * @generated
	 * @ordered
	 */
	protected String targetID = TARGET_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInvocations() <em>Invocations</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvocations()
	 * @generated
	 * @ordered
	 */
	protected VInvocation invocations;

	/**
	 * The cached value of the '{@link #getConnectors() <em>Connectors</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectors()
	 * @generated
	 * @ordered
	 */
	protected VDiagramElement connectors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VConnectorElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisualizationPackage.Literals.VCONNECTOR_ELEMENT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VisualizationPackage.VCONNECTOR_ELEMENT__SOURCE, oldSource, source));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizationPackage.VCONNECTOR_ELEMENT__SOURCE, oldSource, source));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VisualizationPackage.VCONNECTOR_ELEMENT__TARGET, oldTarget, target));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizationPackage.VCONNECTOR_ELEMENT__TARGET, oldTarget, target));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VisualizationPackage.VCONNECTOR_ELEMENT__MEASURANT, oldMeasurant, measurant));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizationPackage.VCONNECTOR_ELEMENT__MEASURANT, oldMeasurant, measurant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizationPackage.VCONNECTOR_ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineType getLineType() {
		return lineType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineType(LineType newLineType) {
		LineType oldLineType = lineType;
		lineType = newLineType == null ? LINE_TYPE_EDEFAULT : newLineType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizationPackage.VCONNECTOR_ELEMENT__LINE_TYPE, oldLineType, lineType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoutingType getRoutingType() {
		return routingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoutingType(RoutingType newRoutingType) {
		RoutingType oldRoutingType = routingType;
		routingType = newRoutingType == null ? ROUTING_TYPE_EDEFAULT : newRoutingType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizationPackage.VCONNECTOR_ELEMENT__ROUTING_TYPE, oldRoutingType, routingType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrowType getArrowTypeForSource() {
		return arrowTypeForSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArrowTypeForSource(ArrowType newArrowTypeForSource) {
		ArrowType oldArrowTypeForSource = arrowTypeForSource;
		arrowTypeForSource = newArrowTypeForSource == null ? ARROW_TYPE_FOR_SOURCE_EDEFAULT : newArrowTypeForSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizationPackage.VCONNECTOR_ELEMENT__ARROW_TYPE_FOR_SOURCE, oldArrowTypeForSource, arrowTypeForSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrowType getArrowTypeForTarget() {
		return arrowTypeForTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArrowTypeForTarget(ArrowType newArrowTypeForTarget) {
		ArrowType oldArrowTypeForTarget = arrowTypeForTarget;
		arrowTypeForTarget = newArrowTypeForTarget == null ? ARROW_TYPE_FOR_TARGET_EDEFAULT : newArrowTypeForTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizationPackage.VCONNECTOR_ELEMENT__ARROW_TYPE_FOR_TARGET, oldArrowTypeForTarget, arrowTypeForTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceID() {
		return sourceID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceID(String newSourceID) {
		String oldSourceID = sourceID;
		sourceID = newSourceID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizationPackage.VCONNECTOR_ELEMENT__SOURCE_ID, oldSourceID, sourceID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetID() {
		return targetID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetID(String newTargetID) {
		String oldTargetID = targetID;
		targetID = newTargetID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizationPackage.VCONNECTOR_ELEMENT__TARGET_ID, oldTargetID, targetID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VInvocation getInvocations() {
		if (invocations != null && invocations.eIsProxy()) {
			InternalEObject oldInvocations = (InternalEObject)invocations;
			invocations = (VInvocation)eResolveProxy(oldInvocations);
			if (invocations != oldInvocations) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VisualizationPackage.VCONNECTOR_ELEMENT__INVOCATIONS, oldInvocations, invocations));
			}
		}
		return invocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VInvocation basicGetInvocations() {
		return invocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvocations(VInvocation newInvocations) {
		VInvocation oldInvocations = invocations;
		invocations = newInvocations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizationPackage.VCONNECTOR_ELEMENT__INVOCATIONS, oldInvocations, invocations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VDiagramElement getConnectors() {
		if (connectors != null && connectors.eIsProxy()) {
			InternalEObject oldConnectors = (InternalEObject)connectors;
			connectors = (VDiagramElement)eResolveProxy(oldConnectors);
			if (connectors != oldConnectors) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VisualizationPackage.VCONNECTOR_ELEMENT__CONNECTORS, oldConnectors, connectors));
			}
		}
		return connectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VDiagramElement basicGetConnectors() {
		return connectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectors(VDiagramElement newConnectors) {
		VDiagramElement oldConnectors = connectors;
		connectors = newConnectors;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizationPackage.VCONNECTOR_ELEMENT__CONNECTORS, oldConnectors, connectors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisualizationPackage.VCONNECTOR_ELEMENT__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case VisualizationPackage.VCONNECTOR_ELEMENT__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case VisualizationPackage.VCONNECTOR_ELEMENT__MEASURANT:
				if (resolve) return getMeasurant();
				return basicGetMeasurant();
			case VisualizationPackage.VCONNECTOR_ELEMENT__NAME:
				return getName();
			case VisualizationPackage.VCONNECTOR_ELEMENT__LINE_TYPE:
				return getLineType();
			case VisualizationPackage.VCONNECTOR_ELEMENT__ROUTING_TYPE:
				return getRoutingType();
			case VisualizationPackage.VCONNECTOR_ELEMENT__ARROW_TYPE_FOR_SOURCE:
				return getArrowTypeForSource();
			case VisualizationPackage.VCONNECTOR_ELEMENT__ARROW_TYPE_FOR_TARGET:
				return getArrowTypeForTarget();
			case VisualizationPackage.VCONNECTOR_ELEMENT__SOURCE_ID:
				return getSourceID();
			case VisualizationPackage.VCONNECTOR_ELEMENT__TARGET_ID:
				return getTargetID();
			case VisualizationPackage.VCONNECTOR_ELEMENT__INVOCATIONS:
				if (resolve) return getInvocations();
				return basicGetInvocations();
			case VisualizationPackage.VCONNECTOR_ELEMENT__CONNECTORS:
				if (resolve) return getConnectors();
				return basicGetConnectors();
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
			case VisualizationPackage.VCONNECTOR_ELEMENT__SOURCE:
				setSource((Element)newValue);
				return;
			case VisualizationPackage.VCONNECTOR_ELEMENT__TARGET:
				setTarget((Element)newValue);
				return;
			case VisualizationPackage.VCONNECTOR_ELEMENT__MEASURANT:
				setMeasurant((Measurement)newValue);
				return;
			case VisualizationPackage.VCONNECTOR_ELEMENT__NAME:
				setName((String)newValue);
				return;
			case VisualizationPackage.VCONNECTOR_ELEMENT__LINE_TYPE:
				setLineType((LineType)newValue);
				return;
			case VisualizationPackage.VCONNECTOR_ELEMENT__ROUTING_TYPE:
				setRoutingType((RoutingType)newValue);
				return;
			case VisualizationPackage.VCONNECTOR_ELEMENT__ARROW_TYPE_FOR_SOURCE:
				setArrowTypeForSource((ArrowType)newValue);
				return;
			case VisualizationPackage.VCONNECTOR_ELEMENT__ARROW_TYPE_FOR_TARGET:
				setArrowTypeForTarget((ArrowType)newValue);
				return;
			case VisualizationPackage.VCONNECTOR_ELEMENT__SOURCE_ID:
				setSourceID((String)newValue);
				return;
			case VisualizationPackage.VCONNECTOR_ELEMENT__TARGET_ID:
				setTargetID((String)newValue);
				return;
			case VisualizationPackage.VCONNECTOR_ELEMENT__INVOCATIONS:
				setInvocations((VInvocation)newValue);
				return;
			case VisualizationPackage.VCONNECTOR_ELEMENT__CONNECTORS:
				setConnectors((VDiagramElement)newValue);
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
			case VisualizationPackage.VCONNECTOR_ELEMENT__SOURCE:
				setSource((Element)null);
				return;
			case VisualizationPackage.VCONNECTOR_ELEMENT__TARGET:
				setTarget((Element)null);
				return;
			case VisualizationPackage.VCONNECTOR_ELEMENT__MEASURANT:
				setMeasurant((Measurement)null);
				return;
			case VisualizationPackage.VCONNECTOR_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case VisualizationPackage.VCONNECTOR_ELEMENT__LINE_TYPE:
				setLineType(LINE_TYPE_EDEFAULT);
				return;
			case VisualizationPackage.VCONNECTOR_ELEMENT__ROUTING_TYPE:
				setRoutingType(ROUTING_TYPE_EDEFAULT);
				return;
			case VisualizationPackage.VCONNECTOR_ELEMENT__ARROW_TYPE_FOR_SOURCE:
				setArrowTypeForSource(ARROW_TYPE_FOR_SOURCE_EDEFAULT);
				return;
			case VisualizationPackage.VCONNECTOR_ELEMENT__ARROW_TYPE_FOR_TARGET:
				setArrowTypeForTarget(ARROW_TYPE_FOR_TARGET_EDEFAULT);
				return;
			case VisualizationPackage.VCONNECTOR_ELEMENT__SOURCE_ID:
				setSourceID(SOURCE_ID_EDEFAULT);
				return;
			case VisualizationPackage.VCONNECTOR_ELEMENT__TARGET_ID:
				setTargetID(TARGET_ID_EDEFAULT);
				return;
			case VisualizationPackage.VCONNECTOR_ELEMENT__INVOCATIONS:
				setInvocations((VInvocation)null);
				return;
			case VisualizationPackage.VCONNECTOR_ELEMENT__CONNECTORS:
				setConnectors((VDiagramElement)null);
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
			case VisualizationPackage.VCONNECTOR_ELEMENT__SOURCE:
				return source != null;
			case VisualizationPackage.VCONNECTOR_ELEMENT__TARGET:
				return target != null;
			case VisualizationPackage.VCONNECTOR_ELEMENT__MEASURANT:
				return measurant != null;
			case VisualizationPackage.VCONNECTOR_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case VisualizationPackage.VCONNECTOR_ELEMENT__LINE_TYPE:
				return lineType != LINE_TYPE_EDEFAULT;
			case VisualizationPackage.VCONNECTOR_ELEMENT__ROUTING_TYPE:
				return routingType != ROUTING_TYPE_EDEFAULT;
			case VisualizationPackage.VCONNECTOR_ELEMENT__ARROW_TYPE_FOR_SOURCE:
				return arrowTypeForSource != ARROW_TYPE_FOR_SOURCE_EDEFAULT;
			case VisualizationPackage.VCONNECTOR_ELEMENT__ARROW_TYPE_FOR_TARGET:
				return arrowTypeForTarget != ARROW_TYPE_FOR_TARGET_EDEFAULT;
			case VisualizationPackage.VCONNECTOR_ELEMENT__SOURCE_ID:
				return SOURCE_ID_EDEFAULT == null ? sourceID != null : !SOURCE_ID_EDEFAULT.equals(sourceID);
			case VisualizationPackage.VCONNECTOR_ELEMENT__TARGET_ID:
				return TARGET_ID_EDEFAULT == null ? targetID != null : !TARGET_ID_EDEFAULT.equals(targetID);
			case VisualizationPackage.VCONNECTOR_ELEMENT__INVOCATIONS:
				return invocations != null;
			case VisualizationPackage.VCONNECTOR_ELEMENT__CONNECTORS:
				return connectors != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Relation.class) {
			switch (derivedFeatureID) {
				case VisualizationPackage.VCONNECTOR_ELEMENT__SOURCE: return CorePackage.RELATION__SOURCE;
				case VisualizationPackage.VCONNECTOR_ELEMENT__TARGET: return CorePackage.RELATION__TARGET;
				case VisualizationPackage.VCONNECTOR_ELEMENT__MEASURANT: return CorePackage.RELATION__MEASURANT;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Relation.class) {
			switch (baseFeatureID) {
				case CorePackage.RELATION__SOURCE: return VisualizationPackage.VCONNECTOR_ELEMENT__SOURCE;
				case CorePackage.RELATION__TARGET: return VisualizationPackage.VCONNECTOR_ELEMENT__TARGET;
				case CorePackage.RELATION__MEASURANT: return VisualizationPackage.VCONNECTOR_ELEMENT__MEASURANT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", lineType: ");
		result.append(lineType);
		result.append(", routingType: ");
		result.append(routingType);
		result.append(", arrowTypeForSource: ");
		result.append(arrowTypeForSource);
		result.append(", arrowTypeForTarget: ");
		result.append(arrowTypeForTarget);
		result.append(", sourceID: ");
		result.append(sourceID);
		result.append(", targetID: ");
		result.append(targetID);
		result.append(')');
		return result.toString();
	}

} //VConnectorElementImpl
