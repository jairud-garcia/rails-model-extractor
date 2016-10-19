/**
 */
package universal.visualization.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import universal.visualization.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VisualizationFactoryImpl extends EFactoryImpl implements VisualizationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VisualizationFactory init() {
		try {
			VisualizationFactory theVisualizationFactory = (VisualizationFactory)EPackage.Registry.INSTANCE.getEFactory(VisualizationPackage.eNS_URI);
			if (theVisualizationFactory != null) {
				return theVisualizationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new VisualizationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualizationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case VisualizationPackage.VDIAGRAM_ELEMENT: return createVDiagramElement();
			case VisualizationPackage.VLABEL: return createVLabel();
			case VisualizationPackage.VDRAWABLE: return createVDrawable();
			case VisualizationPackage.VBORDER: return createVBorder();
			case VisualizationPackage.VCONTAINER: return createVContainer();
			case VisualizationPackage.VDIAGRAM: return createVDiagram();
			case VisualizationPackage.VCLASS: return createVClass();
			case VisualizationPackage.VPACKAGE: return createVPackage();
			case VisualizationPackage.VSHAPE: return createVShape();
			case VisualizationPackage.VCIRCULE: return createVCircule();
			case VisualizationPackage.VTRIANGLE: return createVTriangle();
			case VisualizationPackage.VDIAMOND: return createVDiamond();
			case VisualizationPackage.VQUADRANGLE: return createVQuadrangle();
			case VisualizationPackage.VDOT: return createVDot();
			case VisualizationPackage.VELLIPSE: return createVEllipse();
			case VisualizationPackage.VRELATION_INVOCATION: return createVRelationInvocation();
			case VisualizationPackage.VINVOCATION: return createVInvocation();
			case VisualizationPackage.VCONNECTOR_ELEMENT: return createVConnectorElement();
			case VisualizationPackage.VGENERALIZATION: return createVGeneralization();
			case VisualizationPackage.VIMPLEMENTS: return createVImplements();
			case VisualizationPackage.VDEPENDECY: return createVDependecy();
			case VisualizationPackage.VASSOCIATION: return createVAssociation();
			case VisualizationPackage.VAGREGATION: return createVAgregation();
			case VisualizationPackage.VCOMPOSITION: return createVComposition();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case VisualizationPackage.COLOR:
				return createColorFromString(eDataType, initialValue);
			case VisualizationPackage.ALIGNMENT:
				return createAlignmentFromString(eDataType, initialValue);
			case VisualizationPackage.POSITION:
				return createPositionFromString(eDataType, initialValue);
			case VisualizationPackage.LINE_TYPE:
				return createLineTypeFromString(eDataType, initialValue);
			case VisualizationPackage.ROUTING_TYPE:
				return createRoutingTypeFromString(eDataType, initialValue);
			case VisualizationPackage.ARROW_TYPE:
				return createArrowTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case VisualizationPackage.COLOR:
				return convertColorToString(eDataType, instanceValue);
			case VisualizationPackage.ALIGNMENT:
				return convertAlignmentToString(eDataType, instanceValue);
			case VisualizationPackage.POSITION:
				return convertPositionToString(eDataType, instanceValue);
			case VisualizationPackage.LINE_TYPE:
				return convertLineTypeToString(eDataType, instanceValue);
			case VisualizationPackage.ROUTING_TYPE:
				return convertRoutingTypeToString(eDataType, instanceValue);
			case VisualizationPackage.ARROW_TYPE:
				return convertArrowTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VDiagramElement createVDiagramElement() {
		VDiagramElementImpl vDiagramElement = new VDiagramElementImpl();
		return vDiagramElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VLabel createVLabel() {
		VLabelImpl vLabel = new VLabelImpl();
		return vLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VDrawable createVDrawable() {
		VDrawableImpl vDrawable = new VDrawableImpl();
		return vDrawable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VBorder createVBorder() {
		VBorderImpl vBorder = new VBorderImpl();
		return vBorder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VContainer createVContainer() {
		VContainerImpl vContainer = new VContainerImpl();
		return vContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VDiagram createVDiagram() {
		VDiagramImpl vDiagram = new VDiagramImpl();
		return vDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VClass createVClass() {
		VClassImpl vClass = new VClassImpl();
		return vClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VPackage createVPackage() {
		VPackageImpl vPackage = new VPackageImpl();
		return vPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VShape createVShape() {
		VShapeImpl vShape = new VShapeImpl();
		return vShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VCircule createVCircule() {
		VCirculeImpl vCircule = new VCirculeImpl();
		return vCircule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTriangle createVTriangle() {
		VTriangleImpl vTriangle = new VTriangleImpl();
		return vTriangle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VDiamond createVDiamond() {
		VDiamondImpl vDiamond = new VDiamondImpl();
		return vDiamond;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VQuadrangle createVQuadrangle() {
		VQuadrangleImpl vQuadrangle = new VQuadrangleImpl();
		return vQuadrangle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VDot createVDot() {
		VDotImpl vDot = new VDotImpl();
		return vDot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VEllipse createVEllipse() {
		VEllipseImpl vEllipse = new VEllipseImpl();
		return vEllipse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VRelationInvocation createVRelationInvocation() {
		VRelationInvocationImpl vRelationInvocation = new VRelationInvocationImpl();
		return vRelationInvocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VInvocation createVInvocation() {
		VInvocationImpl vInvocation = new VInvocationImpl();
		return vInvocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VConnectorElement createVConnectorElement() {
		VConnectorElementImpl vConnectorElement = new VConnectorElementImpl();
		return vConnectorElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VGeneralization createVGeneralization() {
		VGeneralizationImpl vGeneralization = new VGeneralizationImpl();
		return vGeneralization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VImplements createVImplements() {
		VImplementsImpl vImplements = new VImplementsImpl();
		return vImplements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VDependecy createVDependecy() {
		VDependecyImpl vDependecy = new VDependecyImpl();
		return vDependecy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VAssociation createVAssociation() {
		VAssociationImpl vAssociation = new VAssociationImpl();
		return vAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VAgregation createVAgregation() {
		VAgregationImpl vAgregation = new VAgregationImpl();
		return vAgregation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VComposition createVComposition() {
		VCompositionImpl vComposition = new VCompositionImpl();
		return vComposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color createColorFromString(EDataType eDataType, String initialValue) {
		Color result = Color.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Alignment createAlignmentFromString(EDataType eDataType, String initialValue) {
		Alignment result = Alignment.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignmentToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Position createPositionFromString(EDataType eDataType, String initialValue) {
		Position result = Position.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineType createLineTypeFromString(EDataType eDataType, String initialValue) {
		LineType result = LineType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLineTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoutingType createRoutingTypeFromString(EDataType eDataType, String initialValue) {
		RoutingType result = RoutingType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRoutingTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrowType createArrowTypeFromString(EDataType eDataType, String initialValue) {
		ArrowType result = ArrowType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArrowTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualizationPackage getVisualizationPackage() {
		return (VisualizationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static VisualizationPackage getPackage() {
		return VisualizationPackage.eINSTANCE;
	}

} //VisualizationFactoryImpl
