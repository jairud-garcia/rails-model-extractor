/**
 */
package universal.visualization.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import universal.core.Element;
import universal.core.Relation;

import universal.visualization.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see universal.visualization.VisualizationPackage
 * @generated
 */
public class VisualizationAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static VisualizationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualizationAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = VisualizationPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VisualizationSwitch<Adapter> modelSwitch =
		new VisualizationSwitch<Adapter>() {
			@Override
			public Adapter caseVDiagramElement(VDiagramElement object) {
				return createVDiagramElementAdapter();
			}
			@Override
			public Adapter caseVLabel(VLabel object) {
				return createVLabelAdapter();
			}
			@Override
			public Adapter caseVDrawable(VDrawable object) {
				return createVDrawableAdapter();
			}
			@Override
			public Adapter caseVBorder(VBorder object) {
				return createVBorderAdapter();
			}
			@Override
			public Adapter caseVContainer(VContainer object) {
				return createVContainerAdapter();
			}
			@Override
			public Adapter caseVDiagram(VDiagram object) {
				return createVDiagramAdapter();
			}
			@Override
			public Adapter caseVClass(VClass object) {
				return createVClassAdapter();
			}
			@Override
			public Adapter caseVPackage(VPackage object) {
				return createVPackageAdapter();
			}
			@Override
			public Adapter caseVShape(VShape object) {
				return createVShapeAdapter();
			}
			@Override
			public Adapter caseVCircule(VCircule object) {
				return createVCirculeAdapter();
			}
			@Override
			public Adapter caseVTriangle(VTriangle object) {
				return createVTriangleAdapter();
			}
			@Override
			public Adapter caseVDiamond(VDiamond object) {
				return createVDiamondAdapter();
			}
			@Override
			public Adapter caseVQuadrangle(VQuadrangle object) {
				return createVQuadrangleAdapter();
			}
			@Override
			public Adapter caseVDot(VDot object) {
				return createVDotAdapter();
			}
			@Override
			public Adapter caseVEllipse(VEllipse object) {
				return createVEllipseAdapter();
			}
			@Override
			public Adapter caseVRelationInvocation(VRelationInvocation object) {
				return createVRelationInvocationAdapter();
			}
			@Override
			public Adapter caseVInvocation(VInvocation object) {
				return createVInvocationAdapter();
			}
			@Override
			public Adapter caseVConnectorElement(VConnectorElement object) {
				return createVConnectorElementAdapter();
			}
			@Override
			public Adapter caseVGeneralization(VGeneralization object) {
				return createVGeneralizationAdapter();
			}
			@Override
			public Adapter caseVImplements(VImplements object) {
				return createVImplementsAdapter();
			}
			@Override
			public Adapter caseVDependecy(VDependecy object) {
				return createVDependecyAdapter();
			}
			@Override
			public Adapter caseVAssociation(VAssociation object) {
				return createVAssociationAdapter();
			}
			@Override
			public Adapter caseVAgregation(VAgregation object) {
				return createVAgregationAdapter();
			}
			@Override
			public Adapter caseVComposition(VComposition object) {
				return createVCompositionAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseRelation(Relation object) {
				return createRelationAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link universal.visualization.VDiagramElement <em>VDiagram Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see universal.visualization.VDiagramElement
	 * @generated
	 */
	public Adapter createVDiagramElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link universal.visualization.VLabel <em>VLabel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see universal.visualization.VLabel
	 * @generated
	 */
	public Adapter createVLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link universal.visualization.VDrawable <em>VDrawable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see universal.visualization.VDrawable
	 * @generated
	 */
	public Adapter createVDrawableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link universal.visualization.VBorder <em>VBorder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see universal.visualization.VBorder
	 * @generated
	 */
	public Adapter createVBorderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link universal.visualization.VContainer <em>VContainer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see universal.visualization.VContainer
	 * @generated
	 */
	public Adapter createVContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link universal.visualization.VDiagram <em>VDiagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see universal.visualization.VDiagram
	 * @generated
	 */
	public Adapter createVDiagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link universal.visualization.VClass <em>VClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see universal.visualization.VClass
	 * @generated
	 */
	public Adapter createVClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link universal.visualization.VPackage <em>VPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see universal.visualization.VPackage
	 * @generated
	 */
	public Adapter createVPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link universal.visualization.VShape <em>VShape</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see universal.visualization.VShape
	 * @generated
	 */
	public Adapter createVShapeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link universal.visualization.VCircule <em>VCircule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see universal.visualization.VCircule
	 * @generated
	 */
	public Adapter createVCirculeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link universal.visualization.VTriangle <em>VTriangle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see universal.visualization.VTriangle
	 * @generated
	 */
	public Adapter createVTriangleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link universal.visualization.VDiamond <em>VDiamond</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see universal.visualization.VDiamond
	 * @generated
	 */
	public Adapter createVDiamondAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link universal.visualization.VQuadrangle <em>VQuadrangle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see universal.visualization.VQuadrangle
	 * @generated
	 */
	public Adapter createVQuadrangleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link universal.visualization.VDot <em>VDot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see universal.visualization.VDot
	 * @generated
	 */
	public Adapter createVDotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link universal.visualization.VEllipse <em>VEllipse</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see universal.visualization.VEllipse
	 * @generated
	 */
	public Adapter createVEllipseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link universal.visualization.VRelationInvocation <em>VRelation Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see universal.visualization.VRelationInvocation
	 * @generated
	 */
	public Adapter createVRelationInvocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link universal.visualization.VInvocation <em>VInvocation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see universal.visualization.VInvocation
	 * @generated
	 */
	public Adapter createVInvocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link universal.visualization.VConnectorElement <em>VConnector Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see universal.visualization.VConnectorElement
	 * @generated
	 */
	public Adapter createVConnectorElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link universal.visualization.VGeneralization <em>VGeneralization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see universal.visualization.VGeneralization
	 * @generated
	 */
	public Adapter createVGeneralizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link universal.visualization.VImplements <em>VImplements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see universal.visualization.VImplements
	 * @generated
	 */
	public Adapter createVImplementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link universal.visualization.VDependecy <em>VDependecy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see universal.visualization.VDependecy
	 * @generated
	 */
	public Adapter createVDependecyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link universal.visualization.VAssociation <em>VAssociation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see universal.visualization.VAssociation
	 * @generated
	 */
	public Adapter createVAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link universal.visualization.VAgregation <em>VAgregation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see universal.visualization.VAgregation
	 * @generated
	 */
	public Adapter createVAgregationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link universal.visualization.VComposition <em>VComposition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see universal.visualization.VComposition
	 * @generated
	 */
	public Adapter createVCompositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link universal.core.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see universal.core.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link universal.core.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see universal.core.Relation
	 * @generated
	 */
	public Adapter createRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //VisualizationAdapterFactory
