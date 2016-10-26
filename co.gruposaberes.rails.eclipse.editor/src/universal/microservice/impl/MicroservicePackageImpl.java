/**
 */
package universal.microservice.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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

import universal.microservice.ClusterRelationConflictPercentageMeasure;
import universal.microservice.ClusterRelationship;
import universal.microservice.Microservice;
import universal.microservice.MicroserviceArchitecture;
import universal.microservice.MicroserviceFactory;
import universal.microservice.MicroservicePackage;
import universal.microservice.MicroserviceRelationship;
import universal.microservice.SessionToEntityCluster;

import universal.microservice.util.MicroserviceValidator;

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
public class MicroservicePackageImpl extends EPackageImpl implements MicroservicePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sessionToEntityClusterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass microserviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass microserviceArchitectureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clusterRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass microserviceRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clusterRelationConflictPercentageMeasureEClass = null;

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
	 * @see universal.microservice.MicroservicePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MicroservicePackageImpl() {
		super(eNS_URI, MicroserviceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MicroservicePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MicroservicePackage init() {
		if (isInited) return (MicroservicePackage)EPackage.Registry.INSTANCE.getEPackage(MicroservicePackage.eNS_URI);

		// Obtain or create and register package
		MicroservicePackageImpl theMicroservicePackage = (MicroservicePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MicroservicePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MicroservicePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		MetricsPackageImpl theMetricsPackage = (MetricsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MetricsPackage.eNS_URI) instanceof MetricsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MetricsPackage.eNS_URI) : MetricsPackage.eINSTANCE);
		OracleformsPackageImpl theOracleformsPackage = (OracleformsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OracleformsPackage.eNS_URI) instanceof OracleformsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OracleformsPackage.eNS_URI) : OracleformsPackage.eINSTANCE);
		OOPPackageImpl theOOPPackage = (OOPPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OOPPackage.eNS_URI) instanceof OOPPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OOPPackage.eNS_URI) : OOPPackage.eINSTANCE);
		VisualizationPackageImpl theVisualizationPackage = (VisualizationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VisualizationPackage.eNS_URI) instanceof VisualizationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VisualizationPackage.eNS_URI) : VisualizationPackage.eINSTANCE);
		RailsPackageImpl theRailsPackage = (RailsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RailsPackage.eNS_URI) instanceof RailsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RailsPackage.eNS_URI) : RailsPackage.eINSTANCE);

		// Create package meta-data objects
		theMicroservicePackage.createPackageContents();
		theCorePackage.createPackageContents();
		theMetricsPackage.createPackageContents();
		theOracleformsPackage.createPackageContents();
		theOOPPackage.createPackageContents();
		theVisualizationPackage.createPackageContents();
		theRailsPackage.createPackageContents();

		// Initialize created meta-data
		theMicroservicePackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theMetricsPackage.initializePackageContents();
		theOracleformsPackage.initializePackageContents();
		theOOPPackage.initializePackageContents();
		theVisualizationPackage.initializePackageContents();
		theRailsPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theMicroservicePackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return MicroserviceValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theMicroservicePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MicroservicePackage.eNS_URI, theMicroservicePackage);
		return theMicroservicePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSessionToEntityCluster() {
		return sessionToEntityClusterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSessionToEntityCluster_NumberOfTypes() {
		return (EAttribute)sessionToEntityClusterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSessionToEntityCluster_NumberOfLines() {
		return (EAttribute)sessionToEntityClusterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionToEntityCluster_TypeReferences() {
		return (EReference)sessionToEntityClusterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMicroservice() {
		return microserviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMicroserviceArchitecture() {
		return microserviceArchitectureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClusterRelationship() {
		return clusterRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClusterRelationship_TypesContainedLeft() {
		return (EAttribute)clusterRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClusterRelationship_TypesContainedRight() {
		return (EAttribute)clusterRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMicroserviceRelationship() {
		return microserviceRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMicroserviceRelationship_Dependencies() {
		return (EReference)microserviceRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClusterRelationConflictPercentageMeasure() {
		return clusterRelationConflictPercentageMeasureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MicroserviceFactory getMicroserviceFactory() {
		return (MicroserviceFactory)getEFactoryInstance();
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
		sessionToEntityClusterEClass = createEClass(SESSION_TO_ENTITY_CLUSTER);
		createEAttribute(sessionToEntityClusterEClass, SESSION_TO_ENTITY_CLUSTER__NUMBER_OF_TYPES);
		createEAttribute(sessionToEntityClusterEClass, SESSION_TO_ENTITY_CLUSTER__NUMBER_OF_LINES);
		createEReference(sessionToEntityClusterEClass, SESSION_TO_ENTITY_CLUSTER__TYPE_REFERENCES);

		microserviceEClass = createEClass(MICROSERVICE);

		microserviceArchitectureEClass = createEClass(MICROSERVICE_ARCHITECTURE);

		clusterRelationshipEClass = createEClass(CLUSTER_RELATIONSHIP);
		createEAttribute(clusterRelationshipEClass, CLUSTER_RELATIONSHIP__TYPES_CONTAINED_LEFT);
		createEAttribute(clusterRelationshipEClass, CLUSTER_RELATIONSHIP__TYPES_CONTAINED_RIGHT);

		microserviceRelationshipEClass = createEClass(MICROSERVICE_RELATIONSHIP);
		createEReference(microserviceRelationshipEClass, MICROSERVICE_RELATIONSHIP__DEPENDENCIES);

		clusterRelationConflictPercentageMeasureEClass = createEClass(CLUSTER_RELATION_CONFLICT_PERCENTAGE_MEASURE);
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
		OOPPackage theOOPPackage = (OOPPackage)EPackage.Registry.INSTANCE.getEPackage(OOPPackage.eNS_URI);
		MetricsPackage theMetricsPackage = (MetricsPackage)EPackage.Registry.INSTANCE.getEPackage(MetricsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		sessionToEntityClusterEClass.getESuperTypes().add(theCorePackage.getSimpleElement());
		microserviceEClass.getESuperTypes().add(theCorePackage.getContainer());
		microserviceArchitectureEClass.getESuperTypes().add(theCorePackage.getApplication());
		clusterRelationshipEClass.getESuperTypes().add(theCorePackage.getRelation());
		microserviceRelationshipEClass.getESuperTypes().add(theCorePackage.getRelation());
		clusterRelationConflictPercentageMeasureEClass.getESuperTypes().add(theMetricsPackage.getMeasure());

		// Initialize classes and features; add operations and parameters
		initEClass(sessionToEntityClusterEClass, SessionToEntityCluster.class, "SessionToEntityCluster", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSessionToEntityCluster_NumberOfTypes(), ecorePackage.getEDouble(), "numberOfTypes", null, 0, 1, SessionToEntityCluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSessionToEntityCluster_NumberOfLines(), ecorePackage.getEDouble(), "numberOfLines", null, 0, 1, SessionToEntityCluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSessionToEntityCluster_TypeReferences(), theOOPPackage.getType(), null, "typeReferences", null, 0, -1, SessionToEntityCluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(microserviceEClass, Microservice.class, "Microservice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(microserviceArchitectureEClass, MicroserviceArchitecture.class, "MicroserviceArchitecture", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(clusterRelationshipEClass, ClusterRelationship.class, "ClusterRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClusterRelationship_TypesContainedLeft(), ecorePackage.getEDouble(), "typesContainedLeft", null, 0, 1, ClusterRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClusterRelationship_TypesContainedRight(), ecorePackage.getEDouble(), "typesContainedRight", null, 0, 1, ClusterRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(microserviceRelationshipEClass, MicroserviceRelationship.class, "MicroserviceRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMicroserviceRelationship_Dependencies(), theOOPPackage.getDependency(), null, "dependencies", null, 0, -1, MicroserviceRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(clusterRelationConflictPercentageMeasureEClass, ClusterRelationConflictPercentageMeasure.class, "ClusterRelationConflictPercentageMeasure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
		  (microserviceEClass, 
		   source, 
		   new String[] {
			 "constraints", "MicroserviceRule_MustContaintClusters"
		   });	
		addAnnotation
		  (microserviceArchitectureEClass, 
		   source, 
		   new String[] {
			 "constraints", "MicroserviceArchitectureRule_MustMicroserviceElements"
		   });	
		addAnnotation
		  (clusterRelationshipEClass, 
		   source, 
		   new String[] {
			 "constraints", "clusterRelationshipRule_SourceMustBeCluster clusterRelationshipRule_TargetsMustBeClusters"
		   });	
		addAnnotation
		  (microserviceRelationshipEClass, 
		   source, 
		   new String[] {
			 "constraints", "microserviceRelationshipRule_SourceMustBeMicroservice microserviceRelationshipRule_TargetsMustBeMicroservices"
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
		  (microserviceEClass, 
		   source, 
		   new String[] {
			 "MicroserviceRule_MustContaintClusters", "self.innerElements->forAll(cluster | cluster.oclIsTypeOf(SessionToEntityCluster) = true)"
		   });	
		addAnnotation
		  (microserviceArchitectureEClass, 
		   source, 
		   new String[] {
			 "MicroserviceArchitectureRule_MustMicroserviceElements", "self.basicElements->forAll(mc | mc.oclIsTypeOf(Microservice) = true or mc.oclIsKindOf(universal::OOP::Type) = true)"
		   });	
		addAnnotation
		  (clusterRelationshipEClass, 
		   source, 
		   new String[] {
			 "clusterRelationshipRule_SourceMustBeCluster", "self.source.oclIsTypeOf(SessionToEntityCluster) = true",
			 "clusterRelationshipRule_TargetsMustBeClusters", "self.target.oclIsTypeOf(SessionToEntityCluster) = true"
		   });	
		addAnnotation
		  (microserviceRelationshipEClass, 
		   source, 
		   new String[] {
			 "microserviceRelationshipRule_SourceMustBeMicroservice", "self.source.oclIsTypeOf(Microservice) = true",
			 "microserviceRelationshipRule_TargetsMustBeMicroservices", "self.target.oclIsTypeOf(Microservice) = true"
		   });
	}

} //MicroservicePackageImpl
