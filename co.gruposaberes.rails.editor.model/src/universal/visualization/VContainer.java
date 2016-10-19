/**
 */
package universal.visualization;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VContainer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * --- Containers
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link universal.visualization.VContainer#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see universal.visualization.VisualizationPackage#getVContainer()
 * @model
 * @generated
 */
public interface VContainer extends VDiagramElement {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' reference list.
	 * The list contents are of type {@link universal.visualization.VDiagramElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' reference list.
	 * @see universal.visualization.VisualizationPackage#getVContainer_Elements()
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<VDiagramElement> getElements();

} // VContainer
