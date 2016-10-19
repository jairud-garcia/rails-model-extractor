/**
 */
package universal.visualization;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see universal.visualization.VisualizationPackage
 * @generated
 */
public interface VisualizationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VisualizationFactory eINSTANCE = universal.visualization.impl.VisualizationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>VDiagram Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VDiagram Element</em>'.
	 * @generated
	 */
	VDiagramElement createVDiagramElement();

	/**
	 * Returns a new object of class '<em>VLabel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VLabel</em>'.
	 * @generated
	 */
	VLabel createVLabel();

	/**
	 * Returns a new object of class '<em>VDrawable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VDrawable</em>'.
	 * @generated
	 */
	VDrawable createVDrawable();

	/**
	 * Returns a new object of class '<em>VBorder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VBorder</em>'.
	 * @generated
	 */
	VBorder createVBorder();

	/**
	 * Returns a new object of class '<em>VContainer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VContainer</em>'.
	 * @generated
	 */
	VContainer createVContainer();

	/**
	 * Returns a new object of class '<em>VDiagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VDiagram</em>'.
	 * @generated
	 */
	VDiagram createVDiagram();

	/**
	 * Returns a new object of class '<em>VClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VClass</em>'.
	 * @generated
	 */
	VClass createVClass();

	/**
	 * Returns a new object of class '<em>VPackage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VPackage</em>'.
	 * @generated
	 */
	VPackage createVPackage();

	/**
	 * Returns a new object of class '<em>VShape</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VShape</em>'.
	 * @generated
	 */
	VShape createVShape();

	/**
	 * Returns a new object of class '<em>VCircule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VCircule</em>'.
	 * @generated
	 */
	VCircule createVCircule();

	/**
	 * Returns a new object of class '<em>VTriangle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VTriangle</em>'.
	 * @generated
	 */
	VTriangle createVTriangle();

	/**
	 * Returns a new object of class '<em>VDiamond</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VDiamond</em>'.
	 * @generated
	 */
	VDiamond createVDiamond();

	/**
	 * Returns a new object of class '<em>VQuadrangle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VQuadrangle</em>'.
	 * @generated
	 */
	VQuadrangle createVQuadrangle();

	/**
	 * Returns a new object of class '<em>VDot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VDot</em>'.
	 * @generated
	 */
	VDot createVDot();

	/**
	 * Returns a new object of class '<em>VEllipse</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VEllipse</em>'.
	 * @generated
	 */
	VEllipse createVEllipse();

	/**
	 * Returns a new object of class '<em>VRelation Invocation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VRelation Invocation</em>'.
	 * @generated
	 */
	VRelationInvocation createVRelationInvocation();

	/**
	 * Returns a new object of class '<em>VInvocation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VInvocation</em>'.
	 * @generated
	 */
	VInvocation createVInvocation();

	/**
	 * Returns a new object of class '<em>VConnector Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VConnector Element</em>'.
	 * @generated
	 */
	VConnectorElement createVConnectorElement();

	/**
	 * Returns a new object of class '<em>VGeneralization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VGeneralization</em>'.
	 * @generated
	 */
	VGeneralization createVGeneralization();

	/**
	 * Returns a new object of class '<em>VImplements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VImplements</em>'.
	 * @generated
	 */
	VImplements createVImplements();

	/**
	 * Returns a new object of class '<em>VDependecy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VDependecy</em>'.
	 * @generated
	 */
	VDependecy createVDependecy();

	/**
	 * Returns a new object of class '<em>VAssociation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VAssociation</em>'.
	 * @generated
	 */
	VAssociation createVAssociation();

	/**
	 * Returns a new object of class '<em>VAgregation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VAgregation</em>'.
	 * @generated
	 */
	VAgregation createVAgregation();

	/**
	 * Returns a new object of class '<em>VComposition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VComposition</em>'.
	 * @generated
	 */
	VComposition createVComposition();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	VisualizationPackage getVisualizationPackage();

} //VisualizationFactory
