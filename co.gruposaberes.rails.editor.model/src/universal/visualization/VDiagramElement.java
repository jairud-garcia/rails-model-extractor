/**
 */
package universal.visualization;

import universal.core.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VDiagram Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * --- Core Classes
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link universal.visualization.VDiagramElement#getUuid <em>Uuid</em>}</li>
 *   <li>{@link universal.visualization.VDiagramElement#getLabel <em>Label</em>}</li>
 *   <li>{@link universal.visualization.VDiagramElement#getBorder <em>Border</em>}</li>
 * </ul>
 *
 * @see universal.visualization.VisualizationPackage#getVDiagramElement()
 * @model
 * @generated
 */
public interface VDiagramElement extends Element {
	/**
	 * Returns the value of the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uuid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uuid</em>' attribute.
	 * @see #setUuid(String)
	 * @see universal.visualization.VisualizationPackage#getVDiagramElement_Uuid()
	 * @model
	 * @generated
	 */
	String getUuid();

	/**
	 * Sets the value of the '{@link universal.visualization.VDiagramElement#getUuid <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uuid</em>' attribute.
	 * @see #getUuid()
	 * @generated
	 */
	void setUuid(String value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' reference.
	 * @see #setLabel(VLabel)
	 * @see universal.visualization.VisualizationPackage#getVDiagramElement_Label()
	 * @model
	 * @generated
	 */
	VLabel getLabel();

	/**
	 * Sets the value of the '{@link universal.visualization.VDiagramElement#getLabel <em>Label</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' reference.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(VLabel value);

	/**
	 * Returns the value of the '<em><b>Border</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Border</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Border</em>' reference.
	 * @see #setBorder(VBorder)
	 * @see universal.visualization.VisualizationPackage#getVDiagramElement_Border()
	 * @model
	 * @generated
	 */
	VBorder getBorder();

	/**
	 * Sets the value of the '{@link universal.visualization.VDiagramElement#getBorder <em>Border</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Border</em>' reference.
	 * @see #getBorder()
	 * @generated
	 */
	void setBorder(VBorder value);

} // VDiagramElement
