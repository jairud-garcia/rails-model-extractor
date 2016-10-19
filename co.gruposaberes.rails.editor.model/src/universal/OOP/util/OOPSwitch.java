/**
 */
package universal.OOP.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import universal.OOP.CalculatedCouplingMeasure;
import universal.OOP.Composition;
import universal.OOP.CouplingBetweenObjectMeasure;
import universal.OOP.Dependency;
import universal.OOP.Generalization;
import universal.OOP.Interface;
import universal.OOP.Method;
import universal.OOP.NumberOfClassesMeasure;
import universal.OOP.NumberOfContainmentsMeasure;
import universal.OOP.NumberOfUsesMeasure;
import universal.OOP.OOPApplication;
import universal.OOP.OOPPackage;
import universal.OOP.Realization;
import universal.OOP.Type;
import universal.OOP.TypeRelationship;
import universal.OOP.WeigthedMethodsPerClassMeasure;

import universal.core.Application;
import universal.core.Container;
import universal.core.Element;
import universal.core.Relation;
import universal.core.SimpleElement;

import universal.metrics.Measure;

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
 * @see universal.OOP.OOPPackage
 * @generated
 */
public class OOPSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OOPPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OOPSwitch() {
		if (modelPackage == null) {
			modelPackage = OOPPackage.eINSTANCE;
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
			case OOPPackage.METHOD: {
				Method method = (Method)theEObject;
				T result = caseMethod(method);
				if (result == null) result = caseSimpleElement(method);
				if (result == null) result = caseElement(method);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OOPPackage.TYPE: {
				Type type = (Type)theEObject;
				T result = caseType(type);
				if (result == null) result = caseContainer(type);
				if (result == null) result = caseElement(type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OOPPackage.CLASS: {
				universal.OOP.Class class_ = (universal.OOP.Class)theEObject;
				T result = caseClass(class_);
				if (result == null) result = caseType(class_);
				if (result == null) result = caseContainer(class_);
				if (result == null) result = caseElement(class_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OOPPackage.INTERFACE: {
				Interface interface_ = (Interface)theEObject;
				T result = caseInterface(interface_);
				if (result == null) result = caseType(interface_);
				if (result == null) result = caseContainer(interface_);
				if (result == null) result = caseElement(interface_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OOPPackage.OOP_APPLICATION: {
				OOPApplication oopApplication = (OOPApplication)theEObject;
				T result = caseOOPApplication(oopApplication);
				if (result == null) result = caseApplication(oopApplication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OOPPackage.TYPE_RELATIONSHIP: {
				TypeRelationship typeRelationship = (TypeRelationship)theEObject;
				T result = caseTypeRelationship(typeRelationship);
				if (result == null) result = caseRelation(typeRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OOPPackage.GENERALIZATION: {
				Generalization generalization = (Generalization)theEObject;
				T result = caseGeneralization(generalization);
				if (result == null) result = caseTypeRelationship(generalization);
				if (result == null) result = caseRelation(generalization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OOPPackage.REALIZATION: {
				Realization realization = (Realization)theEObject;
				T result = caseRealization(realization);
				if (result == null) result = caseTypeRelationship(realization);
				if (result == null) result = caseRelation(realization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OOPPackage.COMPOSITION: {
				Composition composition = (Composition)theEObject;
				T result = caseComposition(composition);
				if (result == null) result = caseTypeRelationship(composition);
				if (result == null) result = caseRelation(composition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OOPPackage.DEPENDENCY: {
				Dependency dependency = (Dependency)theEObject;
				T result = caseDependency(dependency);
				if (result == null) result = caseTypeRelationship(dependency);
				if (result == null) result = caseRelation(dependency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OOPPackage.WEIGTHED_METHODS_PER_CLASS_MEASURE: {
				WeigthedMethodsPerClassMeasure weigthedMethodsPerClassMeasure = (WeigthedMethodsPerClassMeasure)theEObject;
				T result = caseWeigthedMethodsPerClassMeasure(weigthedMethodsPerClassMeasure);
				if (result == null) result = caseMeasure(weigthedMethodsPerClassMeasure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OOPPackage.NUMBER_OF_CLASSES_MEASURE: {
				NumberOfClassesMeasure numberOfClassesMeasure = (NumberOfClassesMeasure)theEObject;
				T result = caseNumberOfClassesMeasure(numberOfClassesMeasure);
				if (result == null) result = caseMeasure(numberOfClassesMeasure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OOPPackage.COUPLING_BETWEEN_OBJECT_MEASURE: {
				CouplingBetweenObjectMeasure couplingBetweenObjectMeasure = (CouplingBetweenObjectMeasure)theEObject;
				T result = caseCouplingBetweenObjectMeasure(couplingBetweenObjectMeasure);
				if (result == null) result = caseMeasure(couplingBetweenObjectMeasure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OOPPackage.NUMBER_OF_USES_MEASURE: {
				NumberOfUsesMeasure numberOfUsesMeasure = (NumberOfUsesMeasure)theEObject;
				T result = caseNumberOfUsesMeasure(numberOfUsesMeasure);
				if (result == null) result = caseMeasure(numberOfUsesMeasure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OOPPackage.CALCULATED_COUPLING_MEASURE: {
				CalculatedCouplingMeasure calculatedCouplingMeasure = (CalculatedCouplingMeasure)theEObject;
				T result = caseCalculatedCouplingMeasure(calculatedCouplingMeasure);
				if (result == null) result = caseMeasure(calculatedCouplingMeasure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OOPPackage.NUMBER_OF_CONTAINMENTS_MEASURE: {
				NumberOfContainmentsMeasure numberOfContainmentsMeasure = (NumberOfContainmentsMeasure)theEObject;
				T result = caseNumberOfContainmentsMeasure(numberOfContainmentsMeasure);
				if (result == null) result = caseMeasure(numberOfContainmentsMeasure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethod(Method object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClass(universal.OOP.Class object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterface(Interface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOOPApplication(OOPApplication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeRelationship(TypeRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generalization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generalization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralization(Generalization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Realization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Realization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRealization(Realization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComposition(Composition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDependency(Dependency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Weigthed Methods Per Class Measure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Weigthed Methods Per Class Measure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWeigthedMethodsPerClassMeasure(WeigthedMethodsPerClassMeasure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Of Classes Measure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Of Classes Measure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumberOfClassesMeasure(NumberOfClassesMeasure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coupling Between Object Measure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coupling Between Object Measure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCouplingBetweenObjectMeasure(CouplingBetweenObjectMeasure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Of Uses Measure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Of Uses Measure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumberOfUsesMeasure(NumberOfUsesMeasure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calculated Coupling Measure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calculated Coupling Measure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalculatedCouplingMeasure(CalculatedCouplingMeasure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Of Containments Measure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Of Containments Measure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumberOfContainmentsMeasure(NumberOfContainmentsMeasure object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Simple Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleElement(SimpleElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainer(Container object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplication(Application object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Measure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasure(Measure object) {
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

} //OOPSwitch
