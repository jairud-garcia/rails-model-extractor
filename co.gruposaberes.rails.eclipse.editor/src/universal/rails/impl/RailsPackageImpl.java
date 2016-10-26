/**
 */
package universal.rails.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
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

import universal.rails.RailsApplication;
import universal.rails.RailsAssociation;
import universal.rails.RailsAttribute;
import universal.rails.RailsClass;
import universal.rails.RailsFactory;
import universal.rails.RailsMethod;
import universal.rails.RailsNamespace;
import universal.rails.RailsPackage;

import universal.rails.util.RailsValidator;

import universal.visualization.VisualizationPackage;

import universal.visualization.impl.VisualizationPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RailsPackageImpl extends EPackageImpl implements RailsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass railsApplicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass railsAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass railsNamespaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass railsClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass railsMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass railsAttributeEClass = null;

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
	 * @see universal.rails.RailsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RailsPackageImpl() {
		super(eNS_URI, RailsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RailsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RailsPackage init() {
		if (isInited) return (RailsPackage)EPackage.Registry.INSTANCE.getEPackage(RailsPackage.eNS_URI);

		// Obtain or create and register package
		RailsPackageImpl theRailsPackage = (RailsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RailsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RailsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		MetricsPackageImpl theMetricsPackage = (MetricsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MetricsPackage.eNS_URI) instanceof MetricsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MetricsPackage.eNS_URI) : MetricsPackage.eINSTANCE);
		OracleformsPackageImpl theOracleformsPackage = (OracleformsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OracleformsPackage.eNS_URI) instanceof OracleformsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OracleformsPackage.eNS_URI) : OracleformsPackage.eINSTANCE);
		OOPPackageImpl theOOPPackage = (OOPPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OOPPackage.eNS_URI) instanceof OOPPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OOPPackage.eNS_URI) : OOPPackage.eINSTANCE);
		MicroservicePackageImpl theMicroservicePackage = (MicroservicePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MicroservicePackage.eNS_URI) instanceof MicroservicePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MicroservicePackage.eNS_URI) : MicroservicePackage.eINSTANCE);
		VisualizationPackageImpl theVisualizationPackage = (VisualizationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VisualizationPackage.eNS_URI) instanceof VisualizationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VisualizationPackage.eNS_URI) : VisualizationPackage.eINSTANCE);

		// Create package meta-data objects
		theRailsPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theMetricsPackage.createPackageContents();
		theOracleformsPackage.createPackageContents();
		theOOPPackage.createPackageContents();
		theMicroservicePackage.createPackageContents();
		theVisualizationPackage.createPackageContents();

		// Initialize created meta-data
		theRailsPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theMetricsPackage.initializePackageContents();
		theOracleformsPackage.initializePackageContents();
		theOOPPackage.initializePackageContents();
		theMicroservicePackage.initializePackageContents();
		theVisualizationPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theRailsPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return RailsValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theRailsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RailsPackage.eNS_URI, theRailsPackage);
		return theRailsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRailsApplication() {
		return railsApplicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRailsAssociation() {
		return railsAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRailsAssociation_AssociationType() {
		return (EAttribute)railsAssociationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRailsAssociation_SourceName() {
		return (EAttribute)railsAssociationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRailsAssociation_TargetName() {
		return (EAttribute)railsAssociationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRailsAssociation_ForeignKey() {
		return (EAttribute)railsAssociationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRailsNamespace() {
		return railsNamespaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRailsClass() {
		return railsClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRailsClass_SuperClass() {
		return (EAttribute)railsClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRailsClass_FullName() {
		return (EAttribute)railsClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRailsMethod() {
		return railsMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRailsMethod_MethodType() {
		return (EAttribute)railsMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRailsAttribute() {
		return railsAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRailsAttribute_DataType() {
		return (EAttribute)railsAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RailsFactory getRailsFactory() {
		return (RailsFactory)getEFactoryInstance();
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
		railsApplicationEClass = createEClass(RAILS_APPLICATION);

		railsAssociationEClass = createEClass(RAILS_ASSOCIATION);
		createEAttribute(railsAssociationEClass, RAILS_ASSOCIATION__ASSOCIATION_TYPE);
		createEAttribute(railsAssociationEClass, RAILS_ASSOCIATION__SOURCE_NAME);
		createEAttribute(railsAssociationEClass, RAILS_ASSOCIATION__TARGET_NAME);
		createEAttribute(railsAssociationEClass, RAILS_ASSOCIATION__FOREIGN_KEY);

		railsNamespaceEClass = createEClass(RAILS_NAMESPACE);

		railsClassEClass = createEClass(RAILS_CLASS);
		createEAttribute(railsClassEClass, RAILS_CLASS__SUPER_CLASS);
		createEAttribute(railsClassEClass, RAILS_CLASS__FULL_NAME);

		railsMethodEClass = createEClass(RAILS_METHOD);
		createEAttribute(railsMethodEClass, RAILS_METHOD__METHOD_TYPE);

		railsAttributeEClass = createEClass(RAILS_ATTRIBUTE);
		createEAttribute(railsAttributeEClass, RAILS_ATTRIBUTE__DATA_TYPE);
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
		railsApplicationEClass.getESuperTypes().add(theCorePackage.getApplication());
		railsAssociationEClass.getESuperTypes().add(theCorePackage.getRelation());
		railsNamespaceEClass.getESuperTypes().add(theCorePackage.getContainer());
		railsClassEClass.getESuperTypes().add(theCorePackage.getContainer());
		railsMethodEClass.getESuperTypes().add(theCorePackage.getSimpleElement());
		railsAttributeEClass.getESuperTypes().add(theCorePackage.getSimpleElement());

		// Initialize classes and features; add operations and parameters
		initEClass(railsApplicationEClass, RailsApplication.class, "RailsApplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(railsAssociationEClass, RailsAssociation.class, "RailsAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRailsAssociation_AssociationType(), ecorePackage.getEString(), "associationType", null, 0, 1, RailsAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRailsAssociation_SourceName(), ecorePackage.getEString(), "sourceName", null, 0, 1, RailsAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRailsAssociation_TargetName(), ecorePackage.getEString(), "targetName", null, 0, 1, RailsAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRailsAssociation_ForeignKey(), ecorePackage.getEString(), "foreignKey", null, 0, 1, RailsAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(railsNamespaceEClass, RailsNamespace.class, "RailsNamespace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(railsClassEClass, RailsClass.class, "RailsClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRailsClass_SuperClass(), ecorePackage.getEString(), "superClass", null, 0, 1, RailsClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRailsClass_FullName(), ecorePackage.getEString(), "fullName", null, 0, 1, RailsClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(railsMethodEClass, RailsMethod.class, "RailsMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRailsMethod_MethodType(), ecorePackage.getEString(), "methodType", null, 0, 1, RailsMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(railsAttributeEClass, RailsAttribute.class, "RailsAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRailsAttribute_DataType(), ecorePackage.getEString(), "dataType", null, 0, 1, RailsAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (railsApplicationEClass, 
		   source, 
		   new String[] {
			 "constraints", "simpleRelationShipsInvariant basicElementsInvariant"
		   });	
		addAnnotation
		  (railsAssociationEClass, 
		   source, 
		   new String[] {
			 "constraints", "associationTypeInvariant sourceInvariant targetInvariant"
		   });	
		addAnnotation
		  (railsNamespaceEClass, 
		   source, 
		   new String[] {
			 "constraints", "innerElementsInvariant"
		   });	
		addAnnotation
		  (railsClassEClass, 
		   source, 
		   new String[] {
			 "constraints", "innerElementsInvariant"
		   });	
		addAnnotation
		  (railsMethodEClass, 
		   source, 
		   new String[] {
			 "constraints", "methodTypeInvariant"
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
		  (railsApplicationEClass, 
		   source, 
		   new String[] {
			 "simpleRelationShipsInvariant", "self.simpleRelationships->forAll(e | e.oclIsTypeOf(RailsAssociation)=true)",
			 "basicElementsInvariant", "self.basicElements->forAll(\n       \t\t\te | e.oclIsTypeOf(RailsMethod)=true or e.oclIsTypeOf(RailsAttribute)=true or e.oclIsTypeOf(RailsClass)=true or e.oclIsTypeOf(RailsNamespace)=true  \t\t\t\n       \t\t)"
		   });	
		addAnnotation
		  (railsAssociationEClass, 
		   source, 
		   new String[] {
			 "associationTypeInvariant", "self.associationType = null or \n\t\t\t\tself.associationType = \'M2M\' or self.associationType = \'O2M\' or self.associationType = \'O2O\'",
			 "sourceInvariant", "self.source.oclIsTypeOf(RailsClass)=true",
			 "targetInvariant", "self.target.oclIsTypeOf(RailsClass)=true"
		   });	
		addAnnotation
		  (railsNamespaceEClass, 
		   source, 
		   new String[] {
			 "innerElementsInvariant", "self.innerElements->forAll(\n\t\t\t\te|e.oclIsTypeOf(RailsClass)=true or e.oclIsTypeOf(RailsNamespace)=true\n\t\t\t)"
		   });	
		addAnnotation
		  (railsClassEClass, 
		   source, 
		   new String[] {
			 "innerElementsInvariant", "self.innerElements->forAll(\n\t\t\t\te|e.oclIsTypeOf(RailsMethod)=true or e.oclIsTypeOf(RailsAttribute)=true\n\t\t\t)"
		   });	
		addAnnotation
		  (railsMethodEClass, 
		   source, 
		   new String[] {
			 "methodTypeInvariant", "self.methodType = \'instance\' or self.methodType = \'class\'"
		   });
	}

} //RailsPackageImpl
