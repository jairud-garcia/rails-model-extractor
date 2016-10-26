/**
 */
package universal.visualization.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import universal.core.Element;
import universal.core.Relation;

import universal.visualization.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see universal.visualization.VisualizationPackage
 * @generated
 */
public class VisualizationSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static VisualizationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualizationSwitch() {
		if (modelPackage == null) {
			modelPackage = VisualizationPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case VisualizationPackage.VDIAGRAM_ELEMENT: {
				VDiagramElement vDiagramElement = (VDiagramElement)theEObject;
				T result = caseVDiagramElement(vDiagramElement);
				if (result == null) result = caseElement(vDiagramElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizationPackage.VLABEL: {
				VLabel vLabel = (VLabel)theEObject;
				T result = caseVLabel(vLabel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizationPackage.VDRAWABLE: {
				VDrawable vDrawable = (VDrawable)theEObject;
				T result = caseVDrawable(vDrawable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizationPackage.VBORDER: {
				VBorder vBorder = (VBorder)theEObject;
				T result = caseVBorder(vBorder);
				if (result == null) result = caseVDrawable(vBorder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizationPackage.VCONTAINER: {
				VContainer vContainer = (VContainer)theEObject;
				T result = caseVContainer(vContainer);
				if (result == null) result = caseVDiagramElement(vContainer);
				if (result == null) result = caseElement(vContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizationPackage.VDIAGRAM: {
				VDiagram vDiagram = (VDiagram)theEObject;
				T result = caseVDiagram(vDiagram);
				if (result == null) result = caseVContainer(vDiagram);
				if (result == null) result = caseVDiagramElement(vDiagram);
				if (result == null) result = caseElement(vDiagram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizationPackage.VCLASS: {
				VClass vClass = (VClass)theEObject;
				T result = caseVClass(vClass);
				if (result == null) result = caseVContainer(vClass);
				if (result == null) result = caseVDiagramElement(vClass);
				if (result == null) result = caseElement(vClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizationPackage.VPACKAGE: {
				VPackage vPackage = (VPackage)theEObject;
				T result = caseVPackage(vPackage);
				if (result == null) result = caseVContainer(vPackage);
				if (result == null) result = caseVDiagramElement(vPackage);
				if (result == null) result = caseElement(vPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizationPackage.VSHAPE: {
				VShape vShape = (VShape)theEObject;
				T result = caseVShape(vShape);
				if (result == null) result = caseVDiagramElement(vShape);
				if (result == null) result = caseElement(vShape);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizationPackage.VCIRCULE: {
				VCircule vCircule = (VCircule)theEObject;
				T result = caseVCircule(vCircule);
				if (result == null) result = caseVShape(vCircule);
				if (result == null) result = caseVDiagramElement(vCircule);
				if (result == null) result = caseElement(vCircule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizationPackage.VTRIANGLE: {
				VTriangle vTriangle = (VTriangle)theEObject;
				T result = caseVTriangle(vTriangle);
				if (result == null) result = caseVShape(vTriangle);
				if (result == null) result = caseVDiagramElement(vTriangle);
				if (result == null) result = caseElement(vTriangle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizationPackage.VDIAMOND: {
				VDiamond vDiamond = (VDiamond)theEObject;
				T result = caseVDiamond(vDiamond);
				if (result == null) result = caseVShape(vDiamond);
				if (result == null) result = caseVDiagramElement(vDiamond);
				if (result == null) result = caseElement(vDiamond);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizationPackage.VQUADRANGLE: {
				VQuadrangle vQuadrangle = (VQuadrangle)theEObject;
				T result = caseVQuadrangle(vQuadrangle);
				if (result == null) result = caseVShape(vQuadrangle);
				if (result == null) result = caseVDiagramElement(vQuadrangle);
				if (result == null) result = caseElement(vQuadrangle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizationPackage.VDOT: {
				VDot vDot = (VDot)theEObject;
				T result = caseVDot(vDot);
				if (result == null) result = caseVShape(vDot);
				if (result == null) result = caseVDiagramElement(vDot);
				if (result == null) result = caseElement(vDot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizationPackage.VELLIPSE: {
				VEllipse vEllipse = (VEllipse)theEObject;
				T result = caseVEllipse(vEllipse);
				if (result == null) result = caseVShape(vEllipse);
				if (result == null) result = caseVDiagramElement(vEllipse);
				if (result == null) result = caseElement(vEllipse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizationPackage.VRELATION_INVOCATION: {
				VRelationInvocation vRelationInvocation = (VRelationInvocation)theEObject;
				T result = caseVRelationInvocation(vRelationInvocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizationPackage.VINVOCATION: {
				VInvocation vInvocation = (VInvocation)theEObject;
				T result = caseVInvocation(vInvocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizationPackage.VCONNECTOR_ELEMENT: {
				VConnectorElement vConnectorElement = (VConnectorElement)theEObject;
				T result = caseVConnectorElement(vConnectorElement);
				if (result == null) result = caseVDrawable(vConnectorElement);
				if (result == null) result = caseRelation(vConnectorElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizationPackage.VGENERALIZATION: {
				VGeneralization vGeneralization = (VGeneralization)theEObject;
				T result = caseVGeneralization(vGeneralization);
				if (result == null) result = caseVConnectorElement(vGeneralization);
				if (result == null) result = caseVDrawable(vGeneralization);
				if (result == null) result = caseRelation(vGeneralization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizationPackage.VIMPLEMENTS: {
				VImplements vImplements = (VImplements)theEObject;
				T result = caseVImplements(vImplements);
				if (result == null) result = caseVConnectorElement(vImplements);
				if (result == null) result = caseVDrawable(vImplements);
				if (result == null) result = caseRelation(vImplements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizationPackage.VDEPENDECY: {
				VDependecy vDependecy = (VDependecy)theEObject;
				T result = caseVDependecy(vDependecy);
				if (result == null) result = caseVConnectorElement(vDependecy);
				if (result == null) result = caseVDrawable(vDependecy);
				if (result == null) result = caseRelation(vDependecy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizationPackage.VASSOCIATION: {
				VAssociation vAssociation = (VAssociation)theEObject;
				T result = caseVAssociation(vAssociation);
				if (result == null) result = caseVConnectorElement(vAssociation);
				if (result == null) result = caseVDrawable(vAssociation);
				if (result == null) result = caseRelation(vAssociation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizationPackage.VAGREGATION: {
				VAgregation vAgregation = (VAgregation)theEObject;
				T result = caseVAgregation(vAgregation);
				if (result == null) result = caseVConnectorElement(vAgregation);
				if (result == null) result = caseVDrawable(vAgregation);
				if (result == null) result = caseRelation(vAgregation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizationPackage.VCOMPOSITION: {
				VComposition vComposition = (VComposition)theEObject;
				T result = caseVComposition(vComposition);
				if (result == null) result = caseVConnectorElement(vComposition);
				if (result == null) result = caseVDrawable(vComposition);
				if (result == null) result = caseRelation(vComposition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VDiagram Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VDiagram Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVDiagramElement(VDiagramElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VLabel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VLabel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVLabel(VLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VDrawable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VDrawable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVDrawable(VDrawable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VBorder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VBorder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVBorder(VBorder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VContainer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VContainer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVContainer(VContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VDiagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VDiagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVDiagram(VDiagram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVClass(VClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VPackage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VPackage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVPackage(VPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VShape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VShape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVShape(VShape object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VCircule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VCircule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVCircule(VCircule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VTriangle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VTriangle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVTriangle(VTriangle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VDiamond</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VDiamond</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVDiamond(VDiamond object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VQuadrangle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VQuadrangle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVQuadrangle(VQuadrangle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VDot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VDot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVDot(VDot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VEllipse</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VEllipse</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVEllipse(VEllipse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VRelation Invocation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VRelation Invocation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVRelationInvocation(VRelationInvocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VInvocation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VInvocation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVInvocation(VInvocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VConnector Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VConnector Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVConnectorElement(VConnectorElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VGeneralization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VGeneralization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVGeneralization(VGeneralization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VImplements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VImplements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVImplements(VImplements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VDependecy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VDependecy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVDependecy(VDependecy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VAssociation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VAssociation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVAssociation(VAssociation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VAgregation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VAgregation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVAgregation(VAgregation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VComposition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VComposition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVComposition(VComposition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelation(Relation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //VisualizationSwitch
