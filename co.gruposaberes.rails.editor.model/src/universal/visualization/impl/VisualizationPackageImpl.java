/**
 */
package universal.visualization.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import universal.OOP.OOPPackage;

import universal.OOP.impl.OOPPackageImpl;

import universal.core.CorePackage;

import universal.core.impl.CorePackageImpl;

import universal.metrics.MetricsPackage;

import universal.metrics.impl.MetricsPackageImpl;

import universal.microservice.MicroservicePackage;

import universal.microservice.impl.MicroservicePackageImpl;

import universal.oracleforms.OracleformsPackage;

import universal.oracleforms.impl.OracleformsPackageImpl;

import universal.rails.RailsPackage;

import universal.rails.impl.RailsPackageImpl;

import universal.visualization.Alignment;
import universal.visualization.ArrowType;
import universal.visualization.Color;
import universal.visualization.LineType;
import universal.visualization.Position;
import universal.visualization.RoutingType;
import universal.visualization.VAgregation;
import universal.visualization.VAssociation;
import universal.visualization.VBorder;
import universal.visualization.VCircule;
import universal.visualization.VClass;
import universal.visualization.VComposition;
import universal.visualization.VConnectorElement;
import universal.visualization.VContainer;
import universal.visualization.VDependecy;
import universal.visualization.VDiagram;
import universal.visualization.VDiagramElement;
import universal.visualization.VDiamond;
import universal.visualization.VDot;
import universal.visualization.VDrawable;
import universal.visualization.VEllipse;
import universal.visualization.VGeneralization;
import universal.visualization.VImplements;
import universal.visualization.VInvocation;
import universal.visualization.VLabel;
import universal.visualization.VPackage;
import universal.visualization.VQuadrangle;
import universal.visualization.VRelationInvocation;
import universal.visualization.VShape;
import universal.visualization.VTriangle;
import universal.visualization.VisualizationFactory;
import universal.visualization.VisualizationPackage;

import universal.visualization.util.VisualizationValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VisualizationPackageImpl extends EPackageImpl implements VisualizationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vDiagramElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vDrawableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vBorderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vShapeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vCirculeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vTriangleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vDiamondEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vQuadrangleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vDotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vEllipseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vRelationInvocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vInvocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vConnectorElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vGeneralizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vImplementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vDependecyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vAgregationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vCompositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum colorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum alignmentEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum positionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum lineTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum routingTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum arrowTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see universal.visualization.VisualizationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private VisualizationPackageImpl() {
		super(eNS_URI, VisualizationFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link VisualizationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static VisualizationPackage init() {
		if (isInited) return (VisualizationPackage)EPackage.Registry.INSTANCE.getEPackage(VisualizationPackage.eNS_URI);

		// Obtain or create and register package
		VisualizationPackageImpl theVisualizationPackage = (VisualizationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof VisualizationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new VisualizationPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		MetricsPackageImpl theMetricsPackage = (MetricsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MetricsPackage.eNS_URI) instanceof MetricsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MetricsPackage.eNS_URI) : MetricsPackage.eINSTANCE);
		OracleformsPackageImpl theOracleformsPackage = (OracleformsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OracleformsPackage.eNS_URI) instanceof OracleformsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OracleformsPackage.eNS_URI) : OracleformsPackage.eINSTANCE);
		OOPPackageImpl theOOPPackage = (OOPPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OOPPackage.eNS_URI) instanceof OOPPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OOPPackage.eNS_URI) : OOPPackage.eINSTANCE);
		MicroservicePackageImpl theMicroservicePackage = (MicroservicePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MicroservicePackage.eNS_URI) instanceof MicroservicePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MicroservicePackage.eNS_URI) : MicroservicePackage.eINSTANCE);
		RailsPackageImpl theRailsPackage = (RailsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RailsPackage.eNS_URI) instanceof RailsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RailsPackage.eNS_URI) : RailsPackage.eINSTANCE);

		// Create package meta-data objects
		theVisualizationPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theMetricsPackage.createPackageContents();
		theOracleformsPackage.createPackageContents();
		theOOPPackage.createPackageContents();
		theMicroservicePackage.createPackageContents();
		theRailsPackage.createPackageContents();

		// Initialize created meta-data
		theVisualizationPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theMetricsPackage.initializePackageContents();
		theOracleformsPackage.initializePackageContents();
		theOOPPackage.initializePackageContents();
		theMicroservicePackage.initializePackageContents();
		theRailsPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theVisualizationPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return VisualizationValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theVisualizationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(VisualizationPackage.eNS_URI, theVisualizationPackage);
		return theVisualizationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVDiagramElement() {
		return vDiagramElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVDiagramElement_Uuid() {
		return (EAttribute)vDiagramElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVDiagramElement_Label() {
		return (EReference)vDiagramElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVDiagramElement_Border() {
		return (EReference)vDiagramElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVLabel() {
		return vLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVLabel_Size() {
		return (EAttribute)vLabelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVLabel_Font() {
		return (EAttribute)vLabelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVLabel_IsBold() {
		return (EAttribute)vLabelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVLabel_IsItalic() {
		return (EAttribute)vLabelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVLabel_Alignment() {
		return (EAttribute)vLabelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVLabel_Position() {
		return (EAttribute)vLabelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVDrawable() {
		return vDrawableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVDrawable_Color() {
		return (EAttribute)vDrawableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVDrawable_Thickness() {
		return (EAttribute)vDrawableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVBorder() {
		return vBorderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVContainer() {
		return vContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVContainer_Elements() {
		return (EReference)vContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVDiagram() {
		return vDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVDiagram_IsRoot() {
		return (EAttribute)vDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVClass() {
		return vClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVClass_IsShared() {
		return (EAttribute)vClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVPackage() {
		return vPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVShape() {
		return vShapeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVShape_Color() {
		return (EAttribute)vShapeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVShape_Width() {
		return (EAttribute)vShapeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVShape_Heigth() {
		return (EAttribute)vShapeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVCircule() {
		return vCirculeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVTriangle() {
		return vTriangleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVDiamond() {
		return vDiamondEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVQuadrangle() {
		return vQuadrangleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVDot() {
		return vDotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVEllipse() {
		return vEllipseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVRelationInvocation() {
		return vRelationInvocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVRelationInvocation_ClassName() {
		return (EAttribute)vRelationInvocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVRelationInvocation_MethodName() {
		return (EAttribute)vRelationInvocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVInvocation() {
		return vInvocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVInvocation_FromMethod() {
		return (EReference)vInvocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVInvocation_ToMethod() {
		return (EReference)vInvocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVConnectorElement() {
		return vConnectorElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVConnectorElement_Name() {
		return (EAttribute)vConnectorElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVConnectorElement_LineType() {
		return (EAttribute)vConnectorElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVConnectorElement_RoutingType() {
		return (EAttribute)vConnectorElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVConnectorElement_ArrowTypeForSource() {
		return (EAttribute)vConnectorElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVConnectorElement_ArrowTypeForTarget() {
		return (EAttribute)vConnectorElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVConnectorElement_SourceID() {
		return (EAttribute)vConnectorElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVConnectorElement_TargetID() {
		return (EAttribute)vConnectorElementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVConnectorElement_Invocations() {
		return (EReference)vConnectorElementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVConnectorElement_Connectors() {
		return (EReference)vConnectorElementEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVGeneralization() {
		return vGeneralizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVImplements() {
		return vImplementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVDependecy() {
		return vDependecyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVAssociation() {
		return vAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVAgregation() {
		return vAgregationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVComposition() {
		return vCompositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getColor() {
		return colorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAlignment() {
		return alignmentEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPosition() {
		return positionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLineType() {
		return lineTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRoutingType() {
		return routingTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getArrowType() {
		return arrowTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualizationFactory getVisualizationFactory() {
		return (VisualizationFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		vDiagramElementEClass = createEClass(VDIAGRAM_ELEMENT);
		createEAttribute(vDiagramElementEClass, VDIAGRAM_ELEMENT__UUID);
		createEReference(vDiagramElementEClass, VDIAGRAM_ELEMENT__LABEL);
		createEReference(vDiagramElementEClass, VDIAGRAM_ELEMENT__BORDER);

		vLabelEClass = createEClass(VLABEL);
		createEAttribute(vLabelEClass, VLABEL__SIZE);
		createEAttribute(vLabelEClass, VLABEL__FONT);
		createEAttribute(vLabelEClass, VLABEL__IS_BOLD);
		createEAttribute(vLabelEClass, VLABEL__IS_ITALIC);
		createEAttribute(vLabelEClass, VLABEL__ALIGNMENT);
		createEAttribute(vLabelEClass, VLABEL__POSITION);

		vDrawableEClass = createEClass(VDRAWABLE);
		createEAttribute(vDrawableEClass, VDRAWABLE__COLOR);
		createEAttribute(vDrawableEClass, VDRAWABLE__THICKNESS);

		vBorderEClass = createEClass(VBORDER);

		vContainerEClass = createEClass(VCONTAINER);
		createEReference(vContainerEClass, VCONTAINER__ELEMENTS);

		vDiagramEClass = createEClass(VDIAGRAM);
		createEAttribute(vDiagramEClass, VDIAGRAM__IS_ROOT);

		vClassEClass = createEClass(VCLASS);
		createEAttribute(vClassEClass, VCLASS__IS_SHARED);

		vPackageEClass = createEClass(VPACKAGE);

		vShapeEClass = createEClass(VSHAPE);
		createEAttribute(vShapeEClass, VSHAPE__COLOR);
		createEAttribute(vShapeEClass, VSHAPE__WIDTH);
		createEAttribute(vShapeEClass, VSHAPE__HEIGTH);

		vCirculeEClass = createEClass(VCIRCULE);

		vTriangleEClass = createEClass(VTRIANGLE);

		vDiamondEClass = createEClass(VDIAMOND);

		vQuadrangleEClass = createEClass(VQUADRANGLE);

		vDotEClass = createEClass(VDOT);

		vEllipseEClass = createEClass(VELLIPSE);

		vRelationInvocationEClass = createEClass(VRELATION_INVOCATION);
		createEAttribute(vRelationInvocationEClass, VRELATION_INVOCATION__CLASS_NAME);
		createEAttribute(vRelationInvocationEClass, VRELATION_INVOCATION__METHOD_NAME);

		vInvocationEClass = createEClass(VINVOCATION);
		createEReference(vInvocationEClass, VINVOCATION__FROM_METHOD);
		createEReference(vInvocationEClass, VINVOCATION__TO_METHOD);

		vConnectorElementEClass = createEClass(VCONNECTOR_ELEMENT);
		createEAttribute(vConnectorElementEClass, VCONNECTOR_ELEMENT__NAME);
		createEAttribute(vConnectorElementEClass, VCONNECTOR_ELEMENT__LINE_TYPE);
		createEAttribute(vConnectorElementEClass, VCONNECTOR_ELEMENT__ROUTING_TYPE);
		createEAttribute(vConnectorElementEClass, VCONNECTOR_ELEMENT__ARROW_TYPE_FOR_SOURCE);
		createEAttribute(vConnectorElementEClass, VCONNECTOR_ELEMENT__ARROW_TYPE_FOR_TARGET);
		createEAttribute(vConnectorElementEClass, VCONNECTOR_ELEMENT__SOURCE_ID);
		createEAttribute(vConnectorElementEClass, VCONNECTOR_ELEMENT__TARGET_ID);
		createEReference(vConnectorElementEClass, VCONNECTOR_ELEMENT__INVOCATIONS);
		createEReference(vConnectorElementEClass, VCONNECTOR_ELEMENT__CONNECTORS);

		vGeneralizationEClass = createEClass(VGENERALIZATION);

		vImplementsEClass = createEClass(VIMPLEMENTS);

		vDependecyEClass = createEClass(VDEPENDECY);

		vAssociationEClass = createEClass(VASSOCIATION);

		vAgregationEClass = createEClass(VAGREGATION);

		vCompositionEClass = createEClass(VCOMPOSITION);

		// Create enums
		colorEEnum = createEEnum(COLOR);
		alignmentEEnum = createEEnum(ALIGNMENT);
		positionEEnum = createEEnum(POSITION);
		lineTypeEEnum = createEEnum(LINE_TYPE);
		routingTypeEEnum = createEEnum(ROUTING_TYPE);
		arrowTypeEEnum = createEEnum(ARROW_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		vDiagramElementEClass.getESuperTypes().add(theCorePackage.getElement());
		vBorderEClass.getESuperTypes().add(this.getVDrawable());
		vContainerEClass.getESuperTypes().add(this.getVDiagramElement());
		vDiagramEClass.getESuperTypes().add(this.getVContainer());
		vClassEClass.getESuperTypes().add(this.getVContainer());
		vPackageEClass.getESuperTypes().add(this.getVContainer());
		vShapeEClass.getESuperTypes().add(this.getVDiagramElement());
		vCirculeEClass.getESuperTypes().add(this.getVShape());
		vTriangleEClass.getESuperTypes().add(this.getVShape());
		vDiamondEClass.getESuperTypes().add(this.getVShape());
		vQuadrangleEClass.getESuperTypes().add(this.getVShape());
		vDotEClass.getESuperTypes().add(this.getVShape());
		vEllipseEClass.getESuperTypes().add(this.getVShape());
		vConnectorElementEClass.getESuperTypes().add(this.getVDrawable());
		vConnectorElementEClass.getESuperTypes().add(theCorePackage.getRelation());
		vGeneralizationEClass.getESuperTypes().add(this.getVConnectorElement());
		vImplementsEClass.getESuperTypes().add(this.getVConnectorElement());
		vDependecyEClass.getESuperTypes().add(this.getVConnectorElement());
		vAssociationEClass.getESuperTypes().add(this.getVConnectorElement());
		vAgregationEClass.getESuperTypes().add(this.getVConnectorElement());
		vCompositionEClass.getESuperTypes().add(this.getVConnectorElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(vDiagramElementEClass, VDiagramElement.class, "VDiagramElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVDiagramElement_Uuid(), ecorePackage.getEString(), "uuid", null, 0, 1, VDiagramElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVDiagramElement_Label(), this.getVLabel(), null, "label", null, 0, 1, VDiagramElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVDiagramElement_Border(), this.getVBorder(), null, "border", null, 0, 1, VDiagramElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vLabelEClass, VLabel.class, "VLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVLabel_Size(), ecorePackage.getEInt(), "size", null, 1, 1, VLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVLabel_Font(), ecorePackage.getEString(), "font", null, 0, 1, VLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVLabel_IsBold(), ecorePackage.getEBoolean(), "isBold", null, 0, 1, VLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVLabel_IsItalic(), ecorePackage.getEBoolean(), "isItalic", null, 0, 1, VLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVLabel_Alignment(), this.getAlignment(), "alignment", null, 0, 1, VLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVLabel_Position(), this.getPosition(), "position", null, 0, 1, VLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vDrawableEClass, VDrawable.class, "VDrawable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVDrawable_Color(), this.getColor(), "color", null, 0, 1, VDrawable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVDrawable_Thickness(), ecorePackage.getEInt(), "thickness", null, 1, 1, VDrawable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vBorderEClass, VBorder.class, "VBorder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vContainerEClass, VContainer.class, "VContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVContainer_Elements(), this.getVDiagramElement(), null, "elements", null, 0, -1, VContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(vDiagramEClass, VDiagram.class, "VDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVDiagram_IsRoot(), ecorePackage.getEBoolean(), "isRoot", null, 0, 1, VDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vClassEClass, VClass.class, "VClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVClass_IsShared(), ecorePackage.getEBoolean(), "isShared", null, 0, 1, VClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vPackageEClass, VPackage.class, "VPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vShapeEClass, VShape.class, "VShape", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVShape_Color(), this.getColor(), "color", null, 0, 1, VShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVShape_Width(), ecorePackage.getEDouble(), "width", null, 1, 1, VShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVShape_Heigth(), ecorePackage.getEDouble(), "heigth", null, 1, 1, VShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vCirculeEClass, VCircule.class, "VCircule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vTriangleEClass, VTriangle.class, "VTriangle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vDiamondEClass, VDiamond.class, "VDiamond", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vQuadrangleEClass, VQuadrangle.class, "VQuadrangle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vDotEClass, VDot.class, "VDot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vEllipseEClass, VEllipse.class, "VEllipse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vRelationInvocationEClass, VRelationInvocation.class, "VRelationInvocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVRelationInvocation_ClassName(), ecorePackage.getEString(), "className", null, 0, 1, VRelationInvocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVRelationInvocation_MethodName(), ecorePackage.getEString(), "methodName", null, 0, 1, VRelationInvocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vInvocationEClass, VInvocation.class, "VInvocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVInvocation_FromMethod(), this.getVRelationInvocation(), null, "fromMethod", null, 0, 1, VInvocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVInvocation_ToMethod(), this.getVRelationInvocation(), null, "toMethod", null, 0, 1, VInvocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vConnectorElementEClass, VConnectorElement.class, "VConnectorElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVConnectorElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, VConnectorElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVConnectorElement_LineType(), this.getLineType(), "lineType", null, 0, 1, VConnectorElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVConnectorElement_RoutingType(), this.getRoutingType(), "routingType", null, 0, 1, VConnectorElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVConnectorElement_ArrowTypeForSource(), this.getArrowType(), "arrowTypeForSource", null, 0, 1, VConnectorElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVConnectorElement_ArrowTypeForTarget(), this.getArrowType(), "arrowTypeForTarget", null, 0, 1, VConnectorElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVConnectorElement_SourceID(), ecorePackage.getEString(), "sourceID", null, 0, 1, VConnectorElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVConnectorElement_TargetID(), ecorePackage.getEString(), "targetID", null, 0, 1, VConnectorElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVConnectorElement_Invocations(), this.getVInvocation(), null, "invocations", null, 0, 1, VConnectorElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVConnectorElement_Connectors(), this.getVDiagramElement(), null, "connectors", null, 0, 1, VConnectorElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vGeneralizationEClass, VGeneralization.class, "VGeneralization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vImplementsEClass, VImplements.class, "VImplements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vDependecyEClass, VDependecy.class, "VDependecy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vAssociationEClass, VAssociation.class, "VAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vAgregationEClass, VAgregation.class, "VAgregation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vCompositionEClass, VComposition.class, "VComposition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(colorEEnum, Color.class, "Color");
		addEEnumLiteral(colorEEnum, Color.WHITE);
		addEEnumLiteral(colorEEnum, Color.BLACK);
		addEEnumLiteral(colorEEnum, Color.BLUE);
		addEEnumLiteral(colorEEnum, Color.CHOCOLATE);
		addEEnumLiteral(colorEEnum, Color.GRAY);
		addEEnumLiteral(colorEEnum, Color.GREEN);
		addEEnumLiteral(colorEEnum, Color.ORANGE);
		addEEnumLiteral(colorEEnum, Color.PURPLE);
		addEEnumLiteral(colorEEnum, Color.RED);
		addEEnumLiteral(colorEEnum, Color.YELLOW);

		initEEnum(alignmentEEnum, Alignment.class, "Alignment");
		addEEnumLiteral(alignmentEEnum, Alignment.CENTER);
		addEEnumLiteral(alignmentEEnum, Alignment.LEFT);
		addEEnumLiteral(alignmentEEnum, Alignment.RIGHT);

		initEEnum(positionEEnum, Position.class, "Position");
		addEEnumLiteral(positionEEnum, Position.BORDER);
		addEEnumLiteral(positionEEnum, Position.NODE);

		initEEnum(lineTypeEEnum, LineType.class, "LineType");
		addEEnumLiteral(lineTypeEEnum, LineType.STRING);
		addEEnumLiteral(lineTypeEEnum, LineType.STROKE);
		addEEnumLiteral(lineTypeEEnum, LineType.POINTS);
		addEEnumLiteral(lineTypeEEnum, LineType.MIXED);

		initEEnum(routingTypeEEnum, RoutingType.class, "RoutingType");
		addEEnumLiteral(routingTypeEEnum, RoutingType.DIRECT);
		addEEnumLiteral(routingTypeEEnum, RoutingType.RECTILINEAL);
		addEEnumLiteral(routingTypeEEnum, RoutingType.TREE);

		initEEnum(arrowTypeEEnum, ArrowType.class, "ArrowType");
		addEEnumLiteral(arrowTypeEEnum, ArrowType.NONE);
		addEEnumLiteral(arrowTypeEEnum, ArrowType.SIMPLE);
		addEEnumLiteral(arrowTypeEEnum, ArrowType.TRIANGULAR);
		addEEnumLiteral(arrowTypeEEnum, ArrowType.TRIANGULAR_FILLED);
		addEEnumLiteral(arrowTypeEEnum, ArrowType.DIAMOND);
		addEEnumLiteral(arrowTypeEEnum, ArrowType.DIAMOND_FILLED);
		addEEnumLiteral(arrowTypeEEnum, ArrowType.ARROW_DIAMOND);
		addEEnumLiteral(arrowTypeEEnum, ArrowType.ARROW_DIAMOND_FILLED);
		addEEnumLiteral(arrowTypeEEnum, ArrowType.MANY);
		addEEnumLiteral(arrowTypeEEnum, ArrowType.MANY_TRIANGULAR);
		addEEnumLiteral(arrowTypeEEnum, ArrowType.MANY_FILLED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/OCL/Collection
		createCollectionAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });	
		addAnnotation
		  (vConnectorElementEClass, 
		   source, 
		   new String[] {
			 "constraints", "vConnectElementRule_SourceMustBeVDiagramElement vConnectElementRule_TargetMustBeVDiagramElement"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Collection</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createCollectionAnnotations() {
		String source = "http://www.eclipse.org/OCL/Collection";	
		addAnnotation
		  (getVContainer_Elements(), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";	
		addAnnotation
		  (vConnectorElementEClass, 
		   source, 
		   new String[] {
			 "vConnectElementRule_SourceMustBeVDiagramElement", "self.source.oclIsTypeOf(VDiagramElement) = true",
			 "vConnectElementRule_TargetMustBeVDiagramElement", "self.target.oclIsTypeOf(VDiagramElement) = true"
		   });
	}

} //VisualizationPackageImpl
