/**
 */
package universal.visualization;

import universal.core.Relation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VConnector Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link universal.visualization.VConnectorElement#getName <em>Name</em>}</li>
 *   <li>{@link universal.visualization.VConnectorElement#getLineType <em>Line Type</em>}</li>
 *   <li>{@link universal.visualization.VConnectorElement#getRoutingType <em>Routing Type</em>}</li>
 *   <li>{@link universal.visualization.VConnectorElement#getArrowTypeForSource <em>Arrow Type For Source</em>}</li>
 *   <li>{@link universal.visualization.VConnectorElement#getArrowTypeForTarget <em>Arrow Type For Target</em>}</li>
 *   <li>{@link universal.visualization.VConnectorElement#getSourceID <em>Source ID</em>}</li>
 *   <li>{@link universal.visualization.VConnectorElement#getTargetID <em>Target ID</em>}</li>
 *   <li>{@link universal.visualization.VConnectorElement#getInvocations <em>Invocations</em>}</li>
 *   <li>{@link universal.visualization.VConnectorElement#getConnectors <em>Connectors</em>}</li>
 * </ul>
 *
 * @see universal.visualization.VisualizationPackage#getVConnectorElement()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='vConnectElementRule_SourceMustBeVDiagramElement vConnectElementRule_TargetMustBeVDiagramElement'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot vConnectElementRule_SourceMustBeVDiagramElement='self.source.oclIsTypeOf(VDiagramElement) = true' vConnectElementRule_TargetMustBeVDiagramElement='self.target.oclIsTypeOf(VDiagramElement) = true'"
 * @generated
 */
public interface VConnectorElement extends VDrawable, Relation {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see universal.visualization.VisualizationPackage#getVConnectorElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link universal.visualization.VConnectorElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Line Type</b></em>' attribute.
	 * The literals are from the enumeration {@link universal.visualization.LineType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Type</em>' attribute.
	 * @see universal.visualization.LineType
	 * @see #setLineType(LineType)
	 * @see universal.visualization.VisualizationPackage#getVConnectorElement_LineType()
	 * @model
	 * @generated
	 */
	LineType getLineType();

	/**
	 * Sets the value of the '{@link universal.visualization.VConnectorElement#getLineType <em>Line Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Type</em>' attribute.
	 * @see universal.visualization.LineType
	 * @see #getLineType()
	 * @generated
	 */
	void setLineType(LineType value);

	/**
	 * Returns the value of the '<em><b>Routing Type</b></em>' attribute.
	 * The literals are from the enumeration {@link universal.visualization.RoutingType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Routing Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routing Type</em>' attribute.
	 * @see universal.visualization.RoutingType
	 * @see #setRoutingType(RoutingType)
	 * @see universal.visualization.VisualizationPackage#getVConnectorElement_RoutingType()
	 * @model
	 * @generated
	 */
	RoutingType getRoutingType();

	/**
	 * Sets the value of the '{@link universal.visualization.VConnectorElement#getRoutingType <em>Routing Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Routing Type</em>' attribute.
	 * @see universal.visualization.RoutingType
	 * @see #getRoutingType()
	 * @generated
	 */
	void setRoutingType(RoutingType value);

	/**
	 * Returns the value of the '<em><b>Arrow Type For Source</b></em>' attribute.
	 * The literals are from the enumeration {@link universal.visualization.ArrowType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arrow Type For Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arrow Type For Source</em>' attribute.
	 * @see universal.visualization.ArrowType
	 * @see #setArrowTypeForSource(ArrowType)
	 * @see universal.visualization.VisualizationPackage#getVConnectorElement_ArrowTypeForSource()
	 * @model
	 * @generated
	 */
	ArrowType getArrowTypeForSource();

	/**
	 * Sets the value of the '{@link universal.visualization.VConnectorElement#getArrowTypeForSource <em>Arrow Type For Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arrow Type For Source</em>' attribute.
	 * @see universal.visualization.ArrowType
	 * @see #getArrowTypeForSource()
	 * @generated
	 */
	void setArrowTypeForSource(ArrowType value);

	/**
	 * Returns the value of the '<em><b>Arrow Type For Target</b></em>' attribute.
	 * The literals are from the enumeration {@link universal.visualization.ArrowType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arrow Type For Target</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arrow Type For Target</em>' attribute.
	 * @see universal.visualization.ArrowType
	 * @see #setArrowTypeForTarget(ArrowType)
	 * @see universal.visualization.VisualizationPackage#getVConnectorElement_ArrowTypeForTarget()
	 * @model
	 * @generated
	 */
	ArrowType getArrowTypeForTarget();

	/**
	 * Sets the value of the '{@link universal.visualization.VConnectorElement#getArrowTypeForTarget <em>Arrow Type For Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arrow Type For Target</em>' attribute.
	 * @see universal.visualization.ArrowType
	 * @see #getArrowTypeForTarget()
	 * @generated
	 */
	void setArrowTypeForTarget(ArrowType value);

	/**
	 * Returns the value of the '<em><b>Source ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source ID</em>' attribute.
	 * @see #setSourceID(String)
	 * @see universal.visualization.VisualizationPackage#getVConnectorElement_SourceID()
	 * @model
	 * @generated
	 */
	String getSourceID();

	/**
	 * Sets the value of the '{@link universal.visualization.VConnectorElement#getSourceID <em>Source ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source ID</em>' attribute.
	 * @see #getSourceID()
	 * @generated
	 */
	void setSourceID(String value);

	/**
	 * Returns the value of the '<em><b>Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target ID</em>' attribute.
	 * @see #setTargetID(String)
	 * @see universal.visualization.VisualizationPackage#getVConnectorElement_TargetID()
	 * @model
	 * @generated
	 */
	String getTargetID();

	/**
	 * Sets the value of the '{@link universal.visualization.VConnectorElement#getTargetID <em>Target ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target ID</em>' attribute.
	 * @see #getTargetID()
	 * @generated
	 */
	void setTargetID(String value);

	/**
	 * Returns the value of the '<em><b>Invocations</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invocations</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invocations</em>' reference.
	 * @see #setInvocations(VInvocation)
	 * @see universal.visualization.VisualizationPackage#getVConnectorElement_Invocations()
	 * @model
	 * @generated
	 */
	VInvocation getInvocations();

	/**
	 * Sets the value of the '{@link universal.visualization.VConnectorElement#getInvocations <em>Invocations</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invocations</em>' reference.
	 * @see #getInvocations()
	 * @generated
	 */
	void setInvocations(VInvocation value);

	/**
	 * Returns the value of the '<em><b>Connectors</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectors</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectors</em>' reference.
	 * @see #setConnectors(VDiagramElement)
	 * @see universal.visualization.VisualizationPackage#getVConnectorElement_Connectors()
	 * @model
	 * @generated
	 */
	VDiagramElement getConnectors();

	/**
	 * Sets the value of the '{@link universal.visualization.VConnectorElement#getConnectors <em>Connectors</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connectors</em>' reference.
	 * @see #getConnectors()
	 * @generated
	 */
	void setConnectors(VDiagramElement value);

} // VConnectorElement
