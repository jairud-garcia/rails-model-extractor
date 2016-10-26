/**
 */
package universal.visualization.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import universal.visualization.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see universal.visualization.VisualizationPackage
 * @generated
 */
public class VisualizationValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final VisualizationValidator INSTANCE = new VisualizationValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "universal.visualization";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualizationValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return VisualizationPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case VisualizationPackage.VDIAGRAM_ELEMENT:
				return validateVDiagramElement((VDiagramElement)value, diagnostics, context);
			case VisualizationPackage.VLABEL:
				return validateVLabel((VLabel)value, diagnostics, context);
			case VisualizationPackage.VDRAWABLE:
				return validateVDrawable((VDrawable)value, diagnostics, context);
			case VisualizationPackage.VBORDER:
				return validateVBorder((VBorder)value, diagnostics, context);
			case VisualizationPackage.VCONTAINER:
				return validateVContainer((VContainer)value, diagnostics, context);
			case VisualizationPackage.VDIAGRAM:
				return validateVDiagram((VDiagram)value, diagnostics, context);
			case VisualizationPackage.VCLASS:
				return validateVClass((VClass)value, diagnostics, context);
			case VisualizationPackage.VPACKAGE:
				return validateVPackage((VPackage)value, diagnostics, context);
			case VisualizationPackage.VSHAPE:
				return validateVShape((VShape)value, diagnostics, context);
			case VisualizationPackage.VCIRCULE:
				return validateVCircule((VCircule)value, diagnostics, context);
			case VisualizationPackage.VTRIANGLE:
				return validateVTriangle((VTriangle)value, diagnostics, context);
			case VisualizationPackage.VDIAMOND:
				return validateVDiamond((VDiamond)value, diagnostics, context);
			case VisualizationPackage.VQUADRANGLE:
				return validateVQuadrangle((VQuadrangle)value, diagnostics, context);
			case VisualizationPackage.VDOT:
				return validateVDot((VDot)value, diagnostics, context);
			case VisualizationPackage.VELLIPSE:
				return validateVEllipse((VEllipse)value, diagnostics, context);
			case VisualizationPackage.VRELATION_INVOCATION:
				return validateVRelationInvocation((VRelationInvocation)value, diagnostics, context);
			case VisualizationPackage.VINVOCATION:
				return validateVInvocation((VInvocation)value, diagnostics, context);
			case VisualizationPackage.VCONNECTOR_ELEMENT:
				return validateVConnectorElement((VConnectorElement)value, diagnostics, context);
			case VisualizationPackage.VGENERALIZATION:
				return validateVGeneralization((VGeneralization)value, diagnostics, context);
			case VisualizationPackage.VIMPLEMENTS:
				return validateVImplements((VImplements)value, diagnostics, context);
			case VisualizationPackage.VDEPENDECY:
				return validateVDependecy((VDependecy)value, diagnostics, context);
			case VisualizationPackage.VASSOCIATION:
				return validateVAssociation((VAssociation)value, diagnostics, context);
			case VisualizationPackage.VAGREGATION:
				return validateVAgregation((VAgregation)value, diagnostics, context);
			case VisualizationPackage.VCOMPOSITION:
				return validateVComposition((VComposition)value, diagnostics, context);
			case VisualizationPackage.COLOR:
				return validateColor((Color)value, diagnostics, context);
			case VisualizationPackage.ALIGNMENT:
				return validateAlignment((Alignment)value, diagnostics, context);
			case VisualizationPackage.POSITION:
				return validatePosition((Position)value, diagnostics, context);
			case VisualizationPackage.LINE_TYPE:
				return validateLineType((LineType)value, diagnostics, context);
			case VisualizationPackage.ROUTING_TYPE:
				return validateRoutingType((RoutingType)value, diagnostics, context);
			case VisualizationPackage.ARROW_TYPE:
				return validateArrowType((ArrowType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVDiagramElement(VDiagramElement vDiagramElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vDiagramElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVLabel(VLabel vLabel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vLabel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVDrawable(VDrawable vDrawable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vDrawable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVBorder(VBorder vBorder, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vBorder, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVContainer(VContainer vContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vContainer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVDiagram(VDiagram vDiagram, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vDiagram, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVClass(VClass vClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVPackage(VPackage vPackage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vPackage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVShape(VShape vShape, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vShape, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVCircule(VCircule vCircule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vCircule, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVTriangle(VTriangle vTriangle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vTriangle, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVDiamond(VDiamond vDiamond, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vDiamond, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVQuadrangle(VQuadrangle vQuadrangle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vQuadrangle, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVDot(VDot vDot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vDot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVEllipse(VEllipse vEllipse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vEllipse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVRelationInvocation(VRelationInvocation vRelationInvocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vRelationInvocation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVInvocation(VInvocation vInvocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vInvocation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVConnectorElement(VConnectorElement vConnectorElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(vConnectorElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(vConnectorElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(vConnectorElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(vConnectorElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(vConnectorElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(vConnectorElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(vConnectorElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(vConnectorElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(vConnectorElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateVConnectorElement_vConnectElementRule_SourceMustBeVDiagramElement(vConnectorElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateVConnectorElement_vConnectElementRule_TargetMustBeVDiagramElement(vConnectorElement, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the vConnectElementRule_SourceMustBeVDiagramElement constraint of '<em>VConnector Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String VCONNECTOR_ELEMENT__VCONNECT_ELEMENT_RULE_SOURCE_MUST_BE_VDIAGRAM_ELEMENT__EEXPRESSION = "self.source.oclIsTypeOf(VDiagramElement) = true";

	/**
	 * Validates the vConnectElementRule_SourceMustBeVDiagramElement constraint of '<em>VConnector Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVConnectorElement_vConnectElementRule_SourceMustBeVDiagramElement(VConnectorElement vConnectorElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(VisualizationPackage.Literals.VCONNECTOR_ELEMENT,
				 vConnectorElement,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "vConnectElementRule_SourceMustBeVDiagramElement",
				 VCONNECTOR_ELEMENT__VCONNECT_ELEMENT_RULE_SOURCE_MUST_BE_VDIAGRAM_ELEMENT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the vConnectElementRule_TargetMustBeVDiagramElement constraint of '<em>VConnector Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String VCONNECTOR_ELEMENT__VCONNECT_ELEMENT_RULE_TARGET_MUST_BE_VDIAGRAM_ELEMENT__EEXPRESSION = "self.target.oclIsTypeOf(VDiagramElement) = true";

	/**
	 * Validates the vConnectElementRule_TargetMustBeVDiagramElement constraint of '<em>VConnector Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVConnectorElement_vConnectElementRule_TargetMustBeVDiagramElement(VConnectorElement vConnectorElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(VisualizationPackage.Literals.VCONNECTOR_ELEMENT,
				 vConnectorElement,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "vConnectElementRule_TargetMustBeVDiagramElement",
				 VCONNECTOR_ELEMENT__VCONNECT_ELEMENT_RULE_TARGET_MUST_BE_VDIAGRAM_ELEMENT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVGeneralization(VGeneralization vGeneralization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(vGeneralization, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(vGeneralization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(vGeneralization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(vGeneralization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(vGeneralization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(vGeneralization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(vGeneralization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(vGeneralization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(vGeneralization, diagnostics, context);
		if (result || diagnostics != null) result &= validateVConnectorElement_vConnectElementRule_SourceMustBeVDiagramElement(vGeneralization, diagnostics, context);
		if (result || diagnostics != null) result &= validateVConnectorElement_vConnectElementRule_TargetMustBeVDiagramElement(vGeneralization, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVImplements(VImplements vImplements, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(vImplements, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(vImplements, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(vImplements, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(vImplements, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(vImplements, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(vImplements, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(vImplements, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(vImplements, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(vImplements, diagnostics, context);
		if (result || diagnostics != null) result &= validateVConnectorElement_vConnectElementRule_SourceMustBeVDiagramElement(vImplements, diagnostics, context);
		if (result || diagnostics != null) result &= validateVConnectorElement_vConnectElementRule_TargetMustBeVDiagramElement(vImplements, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVDependecy(VDependecy vDependecy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(vDependecy, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(vDependecy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(vDependecy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(vDependecy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(vDependecy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(vDependecy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(vDependecy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(vDependecy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(vDependecy, diagnostics, context);
		if (result || diagnostics != null) result &= validateVConnectorElement_vConnectElementRule_SourceMustBeVDiagramElement(vDependecy, diagnostics, context);
		if (result || diagnostics != null) result &= validateVConnectorElement_vConnectElementRule_TargetMustBeVDiagramElement(vDependecy, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVAssociation(VAssociation vAssociation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(vAssociation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(vAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(vAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(vAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(vAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(vAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(vAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(vAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(vAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validateVConnectorElement_vConnectElementRule_SourceMustBeVDiagramElement(vAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validateVConnectorElement_vConnectElementRule_TargetMustBeVDiagramElement(vAssociation, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVAgregation(VAgregation vAgregation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(vAgregation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(vAgregation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(vAgregation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(vAgregation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(vAgregation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(vAgregation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(vAgregation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(vAgregation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(vAgregation, diagnostics, context);
		if (result || diagnostics != null) result &= validateVConnectorElement_vConnectElementRule_SourceMustBeVDiagramElement(vAgregation, diagnostics, context);
		if (result || diagnostics != null) result &= validateVConnectorElement_vConnectElementRule_TargetMustBeVDiagramElement(vAgregation, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVComposition(VComposition vComposition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(vComposition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(vComposition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(vComposition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(vComposition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(vComposition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(vComposition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(vComposition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(vComposition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(vComposition, diagnostics, context);
		if (result || diagnostics != null) result &= validateVConnectorElement_vConnectElementRule_SourceMustBeVDiagramElement(vComposition, diagnostics, context);
		if (result || diagnostics != null) result &= validateVConnectorElement_vConnectElementRule_TargetMustBeVDiagramElement(vComposition, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColor(Color color, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlignment(Alignment alignment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePosition(Position position, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLineType(LineType lineType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoutingType(RoutingType routingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArrowType(ArrowType arrowType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //VisualizationValidator
