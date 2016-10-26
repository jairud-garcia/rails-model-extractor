/**
 */
package universal.OOP.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

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
import universal.OOP.OOPFactory;
import universal.OOP.OOPPackage;
import universal.OOP.Realization;
import universal.OOP.Type;
import universal.OOP.TypeRelationship;
import universal.OOP.WeigthedMethodsPerClassMeasure;

import universal.OOP.util.OOPValidator;

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

import universal.visualization.VisualizationPackage;

import universal.visualization.impl.VisualizationPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OOPPackageImpl extends EPackageImpl implements OOPPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oopApplicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass weigthedMethodsPerClassMeasureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberOfClassesMeasureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass couplingBetweenObjectMeasureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberOfUsesMeasureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calculatedCouplingMeasureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberOfContainmentsMeasureEClass = null;

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
	 * @see universal.OOP.OOPPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OOPPackageImpl() {
		super(eNS_URI, OOPFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link OOPPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OOPPackage init() {
		if (isInited) return (OOPPackage)EPackage.Registry.INSTANCE.getEPackage(OOPPackage.eNS_URI);

		// Obtain or create and register package
		OOPPackageImpl theOOPPackage = (OOPPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OOPPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OOPPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		MetricsPackageImpl theMetricsPackage = (MetricsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MetricsPackage.eNS_URI) instanceof MetricsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MetricsPackage.eNS_URI) : MetricsPackage.eINSTANCE);
		OracleformsPackageImpl theOracleformsPackage = (OracleformsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OracleformsPackage.eNS_URI) instanceof OracleformsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OracleformsPackage.eNS_URI) : OracleformsPackage.eINSTANCE);
		MicroservicePackageImpl theMicroservicePackage = (MicroservicePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MicroservicePackage.eNS_URI) instanceof MicroservicePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MicroservicePackage.eNS_URI) : MicroservicePackage.eINSTANCE);
		VisualizationPackageImpl theVisualizationPackage = (VisualizationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VisualizationPackage.eNS_URI) instanceof VisualizationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VisualizationPackage.eNS_URI) : VisualizationPackage.eINSTANCE);
		RailsPackageImpl theRailsPackage = (RailsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RailsPackage.eNS_URI) instanceof RailsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RailsPackage.eNS_URI) : RailsPackage.eINSTANCE);

		// Create package meta-data objects
		theOOPPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theMetricsPackage.createPackageContents();
		theOracleformsPackage.createPackageContents();
		theMicroservicePackage.createPackageContents();
		theVisualizationPackage.createPackageContents();
		theRailsPackage.createPackageContents();

		// Initialize created meta-data
		theOOPPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theMetricsPackage.initializePackageContents();
		theOracleformsPackage.initializePackageContents();
		theMicroservicePackage.initializePackageContents();
		theVisualizationPackage.initializePackageContents();
		theRailsPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theOOPPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return OOPValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theOOPPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OOPPackage.eNS_URI, theOOPPackage);
		return theOOPPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethod() {
		return methodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getType() {
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClass_() {
		return classEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterface() {
		return interfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOOPApplication() {
		return oopApplicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeRelationship() {
		return typeRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralization() {
		return generalizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRealization() {
		return realizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComposition() {
		return compositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDependency() {
		return dependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependency_MethodInvokedFromSourceClass() {
		return (EReference)dependencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependency_MethodInvokerFromTargetClass() {
		return (EReference)dependencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWeigthedMethodsPerClassMeasure() {
		return weigthedMethodsPerClassMeasureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumberOfClassesMeasure() {
		return numberOfClassesMeasureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCouplingBetweenObjectMeasure() {
		return couplingBetweenObjectMeasureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumberOfUsesMeasure() {
		return numberOfUsesMeasureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalculatedCouplingMeasure() {
		return calculatedCouplingMeasureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumberOfContainmentsMeasure() {
		return numberOfContainmentsMeasureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OOPFactory getOOPFactory() {
		return (OOPFactory)getEFactoryInstance();
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
		methodEClass = createEClass(METHOD);

		typeEClass = createEClass(TYPE);

		classEClass = createEClass(CLASS);

		interfaceEClass = createEClass(INTERFACE);

		oopApplicationEClass = createEClass(OOP_APPLICATION);

		typeRelationshipEClass = createEClass(TYPE_RELATIONSHIP);

		generalizationEClass = createEClass(GENERALIZATION);

		realizationEClass = createEClass(REALIZATION);

		compositionEClass = createEClass(COMPOSITION);

		dependencyEClass = createEClass(DEPENDENCY);
		createEReference(dependencyEClass, DEPENDENCY__METHOD_INVOKED_FROM_SOURCE_CLASS);
		createEReference(dependencyEClass, DEPENDENCY__METHOD_INVOKER_FROM_TARGET_CLASS);

		weigthedMethodsPerClassMeasureEClass = createEClass(WEIGTHED_METHODS_PER_CLASS_MEASURE);

		numberOfClassesMeasureEClass = createEClass(NUMBER_OF_CLASSES_MEASURE);

		couplingBetweenObjectMeasureEClass = createEClass(COUPLING_BETWEEN_OBJECT_MEASURE);

		numberOfUsesMeasureEClass = createEClass(NUMBER_OF_USES_MEASURE);

		calculatedCouplingMeasureEClass = createEClass(CALCULATED_COUPLING_MEASURE);

		numberOfContainmentsMeasureEClass = createEClass(NUMBER_OF_CONTAINMENTS_MEASURE);
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
		MetricsPackage theMetricsPackage = (MetricsPackage)EPackage.Registry.INSTANCE.getEPackage(MetricsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		methodEClass.getESuperTypes().add(theCorePackage.getSimpleElement());
		typeEClass.getESuperTypes().add(theCorePackage.getContainer());
		classEClass.getESuperTypes().add(this.getType());
		interfaceEClass.getESuperTypes().add(this.getType());
		oopApplicationEClass.getESuperTypes().add(theCorePackage.getApplication());
		typeRelationshipEClass.getESuperTypes().add(theCorePackage.getRelation());
		generalizationEClass.getESuperTypes().add(this.getTypeRelationship());
		realizationEClass.getESuperTypes().add(this.getTypeRelationship());
		compositionEClass.getESuperTypes().add(this.getTypeRelationship());
		dependencyEClass.getESuperTypes().add(this.getTypeRelationship());
		weigthedMethodsPerClassMeasureEClass.getESuperTypes().add(theMetricsPackage.getMeasure());
		numberOfClassesMeasureEClass.getESuperTypes().add(theMetricsPackage.getMeasure());
		couplingBetweenObjectMeasureEClass.getESuperTypes().add(theMetricsPackage.getMeasure());
		numberOfUsesMeasureEClass.getESuperTypes().add(theMetricsPackage.getMeasure());
		calculatedCouplingMeasureEClass.getESuperTypes().add(theMetricsPackage.getMeasure());
		numberOfContainmentsMeasureEClass.getESuperTypes().add(theMetricsPackage.getMeasure());

		// Initialize classes and features; add operations and parameters
		initEClass(methodEClass, Method.class, "Method", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(classEClass, universal.OOP.Class.class, "Class", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(interfaceEClass, Interface.class, "Interface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(oopApplicationEClass, OOPApplication.class, "OOPApplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(typeRelationshipEClass, TypeRelationship.class, "TypeRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(generalizationEClass, Generalization.class, "Generalization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(realizationEClass, Realization.class, "Realization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(compositionEClass, Composition.class, "Composition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dependencyEClass, Dependency.class, "Dependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDependency_MethodInvokedFromSourceClass(), this.getMethod(), null, "methodInvokedFromSourceClass", null, 1, 1, Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDependency_MethodInvokerFromTargetClass(), this.getMethod(), null, "methodInvokerFromTargetClass", null, 1, 1, Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(weigthedMethodsPerClassMeasureEClass, WeigthedMethodsPerClassMeasure.class, "WeigthedMethodsPerClassMeasure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(numberOfClassesMeasureEClass, NumberOfClassesMeasure.class, "NumberOfClassesMeasure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(couplingBetweenObjectMeasureEClass, CouplingBetweenObjectMeasure.class, "CouplingBetweenObjectMeasure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(numberOfUsesMeasureEClass, NumberOfUsesMeasure.class, "NumberOfUsesMeasure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(calculatedCouplingMeasureEClass, CalculatedCouplingMeasure.class, "CalculatedCouplingMeasure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(numberOfContainmentsMeasureEClass, NumberOfContainmentsMeasure.class, "NumberOfContainmentsMeasure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
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
		  (typeEClass, 
		   source, 
		   new String[] {
			 "constraints", "TypeRule_MustContaintMethod"
		   });	
		addAnnotation
		  (oopApplicationEClass, 
		   source, 
		   new String[] {
			 "constraints", "OOPApplication_MustContaintTypes"
		   });	
		addAnnotation
		  (typeRelationshipEClass, 
		   source, 
		   new String[] {
			 "constraints", "typeRelationshipRule_SourceMustBeType typeRelationshipRule_TargetsMustBeTypes"
		   });	
		addAnnotation
		  (dependencyEClass, 
		   source, 
		   new String[] {
			 "constraints", "DependencyRule_SourceClassMustBeType DependencyRule_TargetClassMustBeType DependencyRule_MethodInvoked DependencyRule_MethodInvoker"
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
		  (typeEClass, 
		   source, 
		   new String[] {
			 "TypeRule_MustContaintMethod", "self.innerElements->forAll(mt | mt.oclIsTypeOf(Method) = true)"
		   });	
		addAnnotation
		  (oopApplicationEClass, 
		   source, 
		   new String[] {
			 "OOPApplication_MustContaintTypes", "self.basicElements->forAll(el | el.oclIsTypeOf(Type) = true)"
		   });	
		addAnnotation
		  (typeRelationshipEClass, 
		   source, 
		   new String[] {
			 "typeRelationshipRule_SourceMustBeType", "self.source.oclIsKindOf(Type) = true",
			 "typeRelationshipRule_TargetsMustBeTypes", "self.target.oclIsKindOf(Type) = true"
		   });	
		addAnnotation
		  (dependencyEClass, 
		   source, 
		   new String[] {
			 "DependencyRule_SourceClassMustBeType", "self.source.oclIsTypeOf(Type) = true",
			 "DependencyRule_TargetClassMustBeType", "self.target.oclIsTypeOf(Type) = true",
			 "DependencyRule_MethodInvoked", "self.methodInvokedFromSourceClass.oclIsTypeOf(Method) = true",
			 "DependencyRule_MethodInvoker", "self.methodInvokerFromTargetClass.oclIsTypeOf(Method) = true"
		   });
	}

} //OOPPackageImpl
