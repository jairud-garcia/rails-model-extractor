/**
 */
package universal.metrics.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import universal.OOP.OOPPackage;

import universal.OOP.impl.OOPPackageImpl;

import universal.core.CorePackage;

import universal.core.impl.CorePackageImpl;

import universal.metrics.DimensionalMeasurement;
import universal.metrics.DimensionalToObjectMeasurement;
import universal.metrics.Grade;
import universal.metrics.Measure;
import universal.metrics.Measurement;
import universal.metrics.MetricsFactory;
import universal.metrics.MetricsPackage;
import universal.metrics.NumberLinesMeasure;
import universal.metrics.Observations;
import universal.metrics.SimplifiedDecisionMetrics;

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
public class MetricsPackageImpl extends EPackageImpl implements MetricsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measurementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gradeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dimensionalMeasurementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dimensionalToObjectMeasurementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simplifiedDecisionMetricsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass observationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberLinesMeasureEClass = null;

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
	 * @see universal.metrics.MetricsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MetricsPackageImpl() {
		super(eNS_URI, MetricsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MetricsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MetricsPackage init() {
		if (isInited) return (MetricsPackage)EPackage.Registry.INSTANCE.getEPackage(MetricsPackage.eNS_URI);

		// Obtain or create and register package
		MetricsPackageImpl theMetricsPackage = (MetricsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MetricsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MetricsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		OracleformsPackageImpl theOracleformsPackage = (OracleformsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OracleformsPackage.eNS_URI) instanceof OracleformsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OracleformsPackage.eNS_URI) : OracleformsPackage.eINSTANCE);
		OOPPackageImpl theOOPPackage = (OOPPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OOPPackage.eNS_URI) instanceof OOPPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OOPPackage.eNS_URI) : OOPPackage.eINSTANCE);
		MicroservicePackageImpl theMicroservicePackage = (MicroservicePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MicroservicePackage.eNS_URI) instanceof MicroservicePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MicroservicePackage.eNS_URI) : MicroservicePackage.eINSTANCE);
		VisualizationPackageImpl theVisualizationPackage = (VisualizationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VisualizationPackage.eNS_URI) instanceof VisualizationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VisualizationPackage.eNS_URI) : VisualizationPackage.eINSTANCE);
		RailsPackageImpl theRailsPackage = (RailsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RailsPackage.eNS_URI) instanceof RailsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RailsPackage.eNS_URI) : RailsPackage.eINSTANCE);

		// Create package meta-data objects
		theMetricsPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theOracleformsPackage.createPackageContents();
		theOOPPackage.createPackageContents();
		theMicroservicePackage.createPackageContents();
		theVisualizationPackage.createPackageContents();
		theRailsPackage.createPackageContents();

		// Initialize created meta-data
		theMetricsPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theOracleformsPackage.initializePackageContents();
		theOOPPackage.initializePackageContents();
		theMicroservicePackage.initializePackageContents();
		theVisualizationPackage.initializePackageContents();
		theRailsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMetricsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MetricsPackage.eNS_URI, theMetricsPackage);
		return theMetricsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasurement() {
		return measurementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasurement_ElmentMeasurants() {
		return (EReference)measurementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasurement_RelationMeasurants() {
		return (EReference)measurementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasurement_Measure() {
		return (EReference)measurementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGrade() {
		return gradeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGrade_GradeValue() {
		return (EAttribute)gradeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDimensionalMeasurement() {
		return dimensionalMeasurementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDimensionalMeasurement_DimensionValue() {
		return (EAttribute)dimensionalMeasurementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDimensionalToObjectMeasurement() {
		return dimensionalToObjectMeasurementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasure() {
		return measureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasure_Name() {
		return (EAttribute)measureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasure_Description() {
		return (EAttribute)measureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimplifiedDecisionMetrics() {
		return simplifiedDecisionMetricsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimplifiedDecisionMetrics_Measures() {
		return (EReference)simplifiedDecisionMetricsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimplifiedDecisionMetrics_Observations() {
		return (EReference)simplifiedDecisionMetricsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObservations() {
		return observationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObservations_WhenObserved() {
		return (EAttribute)observationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservations_Measurement() {
		return (EReference)observationsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumberLinesMeasure() {
		return numberLinesMeasureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberLinesMeasure_TotalLines() {
		return (EAttribute)numberLinesMeasureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricsFactory getMetricsFactory() {
		return (MetricsFactory)getEFactoryInstance();
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
		measurementEClass = createEClass(MEASUREMENT);
		createEReference(measurementEClass, MEASUREMENT__ELMENT_MEASURANTS);
		createEReference(measurementEClass, MEASUREMENT__RELATION_MEASURANTS);
		createEReference(measurementEClass, MEASUREMENT__MEASURE);

		gradeEClass = createEClass(GRADE);
		createEAttribute(gradeEClass, GRADE__GRADE_VALUE);

		dimensionalMeasurementEClass = createEClass(DIMENSIONAL_MEASUREMENT);
		createEAttribute(dimensionalMeasurementEClass, DIMENSIONAL_MEASUREMENT__DIMENSION_VALUE);

		dimensionalToObjectMeasurementEClass = createEClass(DIMENSIONAL_TO_OBJECT_MEASUREMENT);

		measureEClass = createEClass(MEASURE);
		createEAttribute(measureEClass, MEASURE__NAME);
		createEAttribute(measureEClass, MEASURE__DESCRIPTION);

		simplifiedDecisionMetricsEClass = createEClass(SIMPLIFIED_DECISION_METRICS);
		createEReference(simplifiedDecisionMetricsEClass, SIMPLIFIED_DECISION_METRICS__MEASURES);
		createEReference(simplifiedDecisionMetricsEClass, SIMPLIFIED_DECISION_METRICS__OBSERVATIONS);

		observationsEClass = createEClass(OBSERVATIONS);
		createEAttribute(observationsEClass, OBSERVATIONS__WHEN_OBSERVED);
		createEReference(observationsEClass, OBSERVATIONS__MEASUREMENT);

		numberLinesMeasureEClass = createEClass(NUMBER_LINES_MEASURE);
		createEAttribute(numberLinesMeasureEClass, NUMBER_LINES_MEASURE__TOTAL_LINES);
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
		gradeEClass.getESuperTypes().add(this.getMeasurement());
		dimensionalMeasurementEClass.getESuperTypes().add(this.getMeasurement());
		dimensionalToObjectMeasurementEClass.getESuperTypes().add(this.getDimensionalMeasurement());
		numberLinesMeasureEClass.getESuperTypes().add(this.getMeasure());

		// Initialize classes, features, and operations; add parameters
		initEClass(measurementEClass, Measurement.class, "Measurement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMeasurement_ElmentMeasurants(), theCorePackage.getElement(), null, "elmentMeasurants", null, 0, -1, Measurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasurement_RelationMeasurants(), theCorePackage.getElement(), null, "relationMeasurants", null, 0, -1, Measurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasurement_Measure(), this.getMeasure(), null, "measure", null, 0, -1, Measurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gradeEClass, Grade.class, "Grade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGrade_GradeValue(), ecorePackage.getEString(), "gradeValue", null, 0, 1, Grade.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dimensionalMeasurementEClass, DimensionalMeasurement.class, "DimensionalMeasurement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDimensionalMeasurement_DimensionValue(), ecorePackage.getEDouble(), "dimensionValue", null, 0, 1, DimensionalMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dimensionalToObjectMeasurementEClass, DimensionalToObjectMeasurement.class, "DimensionalToObjectMeasurement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(measureEClass, Measure.class, "Measure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMeasure_Name(), ecorePackage.getEString(), "name", null, 0, 1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasure_Description(), ecorePackage.getEString(), "description", null, 0, 1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simplifiedDecisionMetricsEClass, SimplifiedDecisionMetrics.class, "SimplifiedDecisionMetrics", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimplifiedDecisionMetrics_Measures(), this.getMeasure(), null, "measures", null, 0, -1, SimplifiedDecisionMetrics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimplifiedDecisionMetrics_Observations(), this.getObservations(), null, "observations", null, 0, -1, SimplifiedDecisionMetrics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(observationsEClass, Observations.class, "Observations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObservations_WhenObserved(), ecorePackage.getEDate(), "whenObserved", null, 0, 1, Observations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObservations_Measurement(), this.getMeasurement(), null, "measurement", null, 0, -1, Observations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(numberLinesMeasureEClass, NumberLinesMeasure.class, "NumberLinesMeasure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNumberLinesMeasure_TotalLines(), ecorePackage.getEDouble(), "totalLines", null, 0, 1, NumberLinesMeasure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //MetricsPackageImpl
