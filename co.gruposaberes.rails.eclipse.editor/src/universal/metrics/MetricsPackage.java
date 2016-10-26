/**
 */
package universal.metrics;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see universal.metrics.MetricsFactory
 * @model kind="package"
 * @generated
 */
public interface MetricsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "metrics";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://universal/metrics";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "unmet";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MetricsPackage eINSTANCE = universal.metrics.impl.MetricsPackageImpl.init();

	/**
	 * The meta object id for the '{@link universal.metrics.impl.MeasurementImpl <em>Measurement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universal.metrics.impl.MeasurementImpl
	 * @see universal.metrics.impl.MetricsPackageImpl#getMeasurement()
	 * @generated
	 */
	int MEASUREMENT = 0;

	/**
	 * The feature id for the '<em><b>Elment Measurants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__ELMENT_MEASURANTS = 0;

	/**
	 * The feature id for the '<em><b>Relation Measurants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__RELATION_MEASURANTS = 1;

	/**
	 * The feature id for the '<em><b>Measure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__MEASURE = 2;

	/**
	 * The number of structural features of the '<em>Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link universal.metrics.impl.GradeImpl <em>Grade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universal.metrics.impl.GradeImpl
	 * @see universal.metrics.impl.MetricsPackageImpl#getGrade()
	 * @generated
	 */
	int GRADE = 1;

	/**
	 * The feature id for the '<em><b>Elment Measurants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE__ELMENT_MEASURANTS = MEASUREMENT__ELMENT_MEASURANTS;

	/**
	 * The feature id for the '<em><b>Relation Measurants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE__RELATION_MEASURANTS = MEASUREMENT__RELATION_MEASURANTS;

	/**
	 * The feature id for the '<em><b>Measure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE__MEASURE = MEASUREMENT__MEASURE;

	/**
	 * The feature id for the '<em><b>Grade Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE__GRADE_VALUE = MEASUREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Grade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE_FEATURE_COUNT = MEASUREMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link universal.metrics.impl.DimensionalMeasurementImpl <em>Dimensional Measurement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universal.metrics.impl.DimensionalMeasurementImpl
	 * @see universal.metrics.impl.MetricsPackageImpl#getDimensionalMeasurement()
	 * @generated
	 */
	int DIMENSIONAL_MEASUREMENT = 2;

	/**
	 * The feature id for the '<em><b>Elment Measurants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASUREMENT__ELMENT_MEASURANTS = MEASUREMENT__ELMENT_MEASURANTS;

	/**
	 * The feature id for the '<em><b>Relation Measurants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASUREMENT__RELATION_MEASURANTS = MEASUREMENT__RELATION_MEASURANTS;

	/**
	 * The feature id for the '<em><b>Measure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASUREMENT__MEASURE = MEASUREMENT__MEASURE;

	/**
	 * The feature id for the '<em><b>Dimension Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASUREMENT__DIMENSION_VALUE = MEASUREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dimensional Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASUREMENT_FEATURE_COUNT = MEASUREMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link universal.metrics.impl.DimensionalToObjectMeasurementImpl <em>Dimensional To Object Measurement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universal.metrics.impl.DimensionalToObjectMeasurementImpl
	 * @see universal.metrics.impl.MetricsPackageImpl#getDimensionalToObjectMeasurement()
	 * @generated
	 */
	int DIMENSIONAL_TO_OBJECT_MEASUREMENT = 3;

	/**
	 * The feature id for the '<em><b>Elment Measurants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_TO_OBJECT_MEASUREMENT__ELMENT_MEASURANTS = DIMENSIONAL_MEASUREMENT__ELMENT_MEASURANTS;

	/**
	 * The feature id for the '<em><b>Relation Measurants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_TO_OBJECT_MEASUREMENT__RELATION_MEASURANTS = DIMENSIONAL_MEASUREMENT__RELATION_MEASURANTS;

	/**
	 * The feature id for the '<em><b>Measure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_TO_OBJECT_MEASUREMENT__MEASURE = DIMENSIONAL_MEASUREMENT__MEASURE;

	/**
	 * The feature id for the '<em><b>Dimension Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_TO_OBJECT_MEASUREMENT__DIMENSION_VALUE = DIMENSIONAL_MEASUREMENT__DIMENSION_VALUE;

	/**
	 * The number of structural features of the '<em>Dimensional To Object Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_TO_OBJECT_MEASUREMENT_FEATURE_COUNT = DIMENSIONAL_MEASUREMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link universal.metrics.impl.MeasureImpl <em>Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universal.metrics.impl.MeasureImpl
	 * @see universal.metrics.impl.MetricsPackageImpl#getMeasure()
	 * @generated
	 */
	int MEASURE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link universal.metrics.impl.SimplifiedDecisionMetricsImpl <em>Simplified Decision Metrics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universal.metrics.impl.SimplifiedDecisionMetricsImpl
	 * @see universal.metrics.impl.MetricsPackageImpl#getSimplifiedDecisionMetrics()
	 * @generated
	 */
	int SIMPLIFIED_DECISION_METRICS = 5;

	/**
	 * The feature id for the '<em><b>Measures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLIFIED_DECISION_METRICS__MEASURES = 0;

	/**
	 * The feature id for the '<em><b>Observations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLIFIED_DECISION_METRICS__OBSERVATIONS = 1;

	/**
	 * The number of structural features of the '<em>Simplified Decision Metrics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLIFIED_DECISION_METRICS_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link universal.metrics.impl.ObservationsImpl <em>Observations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universal.metrics.impl.ObservationsImpl
	 * @see universal.metrics.impl.MetricsPackageImpl#getObservations()
	 * @generated
	 */
	int OBSERVATIONS = 6;

	/**
	 * The feature id for the '<em><b>When Observed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATIONS__WHEN_OBSERVED = 0;

	/**
	 * The feature id for the '<em><b>Measurement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATIONS__MEASUREMENT = 1;

	/**
	 * The number of structural features of the '<em>Observations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATIONS_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link universal.metrics.impl.NumberLinesMeasureImpl <em>Number Lines Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see universal.metrics.impl.NumberLinesMeasureImpl
	 * @see universal.metrics.impl.MetricsPackageImpl#getNumberLinesMeasure()
	 * @generated
	 */
	int NUMBER_LINES_MEASURE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_LINES_MEASURE__NAME = MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_LINES_MEASURE__DESCRIPTION = MEASURE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Total Lines</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_LINES_MEASURE__TOTAL_LINES = MEASURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Number Lines Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_LINES_MEASURE_FEATURE_COUNT = MEASURE_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link universal.metrics.Measurement <em>Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measurement</em>'.
	 * @see universal.metrics.Measurement
	 * @generated
	 */
	EClass getMeasurement();

	/**
	 * Returns the meta object for the reference list '{@link universal.metrics.Measurement#getElmentMeasurants <em>Elment Measurants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Elment Measurants</em>'.
	 * @see universal.metrics.Measurement#getElmentMeasurants()
	 * @see #getMeasurement()
	 * @generated
	 */
	EReference getMeasurement_ElmentMeasurants();

	/**
	 * Returns the meta object for the reference list '{@link universal.metrics.Measurement#getRelationMeasurants <em>Relation Measurants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Relation Measurants</em>'.
	 * @see universal.metrics.Measurement#getRelationMeasurants()
	 * @see #getMeasurement()
	 * @generated
	 */
	EReference getMeasurement_RelationMeasurants();

	/**
	 * Returns the meta object for the reference list '{@link universal.metrics.Measurement#getMeasure <em>Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Measure</em>'.
	 * @see universal.metrics.Measurement#getMeasure()
	 * @see #getMeasurement()
	 * @generated
	 */
	EReference getMeasurement_Measure();

	/**
	 * Returns the meta object for class '{@link universal.metrics.Grade <em>Grade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grade</em>'.
	 * @see universal.metrics.Grade
	 * @generated
	 */
	EClass getGrade();

	/**
	 * Returns the meta object for the attribute '{@link universal.metrics.Grade#getGradeValue <em>Grade Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grade Value</em>'.
	 * @see universal.metrics.Grade#getGradeValue()
	 * @see #getGrade()
	 * @generated
	 */
	EAttribute getGrade_GradeValue();

	/**
	 * Returns the meta object for class '{@link universal.metrics.DimensionalMeasurement <em>Dimensional Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dimensional Measurement</em>'.
	 * @see universal.metrics.DimensionalMeasurement
	 * @generated
	 */
	EClass getDimensionalMeasurement();

	/**
	 * Returns the meta object for the attribute '{@link universal.metrics.DimensionalMeasurement#getDimensionValue <em>Dimension Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dimension Value</em>'.
	 * @see universal.metrics.DimensionalMeasurement#getDimensionValue()
	 * @see #getDimensionalMeasurement()
	 * @generated
	 */
	EAttribute getDimensionalMeasurement_DimensionValue();

	/**
	 * Returns the meta object for class '{@link universal.metrics.DimensionalToObjectMeasurement <em>Dimensional To Object Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dimensional To Object Measurement</em>'.
	 * @see universal.metrics.DimensionalToObjectMeasurement
	 * @generated
	 */
	EClass getDimensionalToObjectMeasurement();

	/**
	 * Returns the meta object for class '{@link universal.metrics.Measure <em>Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measure</em>'.
	 * @see universal.metrics.Measure
	 * @generated
	 */
	EClass getMeasure();

	/**
	 * Returns the meta object for the attribute '{@link universal.metrics.Measure#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see universal.metrics.Measure#getName()
	 * @see #getMeasure()
	 * @generated
	 */
	EAttribute getMeasure_Name();

	/**
	 * Returns the meta object for the attribute '{@link universal.metrics.Measure#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see universal.metrics.Measure#getDescription()
	 * @see #getMeasure()
	 * @generated
	 */
	EAttribute getMeasure_Description();

	/**
	 * Returns the meta object for class '{@link universal.metrics.SimplifiedDecisionMetrics <em>Simplified Decision Metrics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simplified Decision Metrics</em>'.
	 * @see universal.metrics.SimplifiedDecisionMetrics
	 * @generated
	 */
	EClass getSimplifiedDecisionMetrics();

	/**
	 * Returns the meta object for the containment reference list '{@link universal.metrics.SimplifiedDecisionMetrics#getMeasures <em>Measures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measures</em>'.
	 * @see universal.metrics.SimplifiedDecisionMetrics#getMeasures()
	 * @see #getSimplifiedDecisionMetrics()
	 * @generated
	 */
	EReference getSimplifiedDecisionMetrics_Measures();

	/**
	 * Returns the meta object for the containment reference list '{@link universal.metrics.SimplifiedDecisionMetrics#getObservations <em>Observations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Observations</em>'.
	 * @see universal.metrics.SimplifiedDecisionMetrics#getObservations()
	 * @see #getSimplifiedDecisionMetrics()
	 * @generated
	 */
	EReference getSimplifiedDecisionMetrics_Observations();

	/**
	 * Returns the meta object for class '{@link universal.metrics.Observations <em>Observations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Observations</em>'.
	 * @see universal.metrics.Observations
	 * @generated
	 */
	EClass getObservations();

	/**
	 * Returns the meta object for the attribute '{@link universal.metrics.Observations#getWhenObserved <em>When Observed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>When Observed</em>'.
	 * @see universal.metrics.Observations#getWhenObserved()
	 * @see #getObservations()
	 * @generated
	 */
	EAttribute getObservations_WhenObserved();

	/**
	 * Returns the meta object for the containment reference list '{@link universal.metrics.Observations#getMeasurement <em>Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measurement</em>'.
	 * @see universal.metrics.Observations#getMeasurement()
	 * @see #getObservations()
	 * @generated
	 */
	EReference getObservations_Measurement();

	/**
	 * Returns the meta object for class '{@link universal.metrics.NumberLinesMeasure <em>Number Lines Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Lines Measure</em>'.
	 * @see universal.metrics.NumberLinesMeasure
	 * @generated
	 */
	EClass getNumberLinesMeasure();

	/**
	 * Returns the meta object for the attribute '{@link universal.metrics.NumberLinesMeasure#getTotalLines <em>Total Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Lines</em>'.
	 * @see universal.metrics.NumberLinesMeasure#getTotalLines()
	 * @see #getNumberLinesMeasure()
	 * @generated
	 */
	EAttribute getNumberLinesMeasure_TotalLines();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MetricsFactory getMetricsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link universal.metrics.impl.MeasurementImpl <em>Measurement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universal.metrics.impl.MeasurementImpl
		 * @see universal.metrics.impl.MetricsPackageImpl#getMeasurement()
		 * @generated
		 */
		EClass MEASUREMENT = eINSTANCE.getMeasurement();

		/**
		 * The meta object literal for the '<em><b>Elment Measurants</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT__ELMENT_MEASURANTS = eINSTANCE.getMeasurement_ElmentMeasurants();

		/**
		 * The meta object literal for the '<em><b>Relation Measurants</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT__RELATION_MEASURANTS = eINSTANCE.getMeasurement_RelationMeasurants();

		/**
		 * The meta object literal for the '<em><b>Measure</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT__MEASURE = eINSTANCE.getMeasurement_Measure();

		/**
		 * The meta object literal for the '{@link universal.metrics.impl.GradeImpl <em>Grade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universal.metrics.impl.GradeImpl
		 * @see universal.metrics.impl.MetricsPackageImpl#getGrade()
		 * @generated
		 */
		EClass GRADE = eINSTANCE.getGrade();

		/**
		 * The meta object literal for the '<em><b>Grade Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRADE__GRADE_VALUE = eINSTANCE.getGrade_GradeValue();

		/**
		 * The meta object literal for the '{@link universal.metrics.impl.DimensionalMeasurementImpl <em>Dimensional Measurement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universal.metrics.impl.DimensionalMeasurementImpl
		 * @see universal.metrics.impl.MetricsPackageImpl#getDimensionalMeasurement()
		 * @generated
		 */
		EClass DIMENSIONAL_MEASUREMENT = eINSTANCE.getDimensionalMeasurement();

		/**
		 * The meta object literal for the '<em><b>Dimension Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSIONAL_MEASUREMENT__DIMENSION_VALUE = eINSTANCE.getDimensionalMeasurement_DimensionValue();

		/**
		 * The meta object literal for the '{@link universal.metrics.impl.DimensionalToObjectMeasurementImpl <em>Dimensional To Object Measurement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universal.metrics.impl.DimensionalToObjectMeasurementImpl
		 * @see universal.metrics.impl.MetricsPackageImpl#getDimensionalToObjectMeasurement()
		 * @generated
		 */
		EClass DIMENSIONAL_TO_OBJECT_MEASUREMENT = eINSTANCE.getDimensionalToObjectMeasurement();

		/**
		 * The meta object literal for the '{@link universal.metrics.impl.MeasureImpl <em>Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universal.metrics.impl.MeasureImpl
		 * @see universal.metrics.impl.MetricsPackageImpl#getMeasure()
		 * @generated
		 */
		EClass MEASURE = eINSTANCE.getMeasure();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASURE__NAME = eINSTANCE.getMeasure_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASURE__DESCRIPTION = eINSTANCE.getMeasure_Description();

		/**
		 * The meta object literal for the '{@link universal.metrics.impl.SimplifiedDecisionMetricsImpl <em>Simplified Decision Metrics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universal.metrics.impl.SimplifiedDecisionMetricsImpl
		 * @see universal.metrics.impl.MetricsPackageImpl#getSimplifiedDecisionMetrics()
		 * @generated
		 */
		EClass SIMPLIFIED_DECISION_METRICS = eINSTANCE.getSimplifiedDecisionMetrics();

		/**
		 * The meta object literal for the '<em><b>Measures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLIFIED_DECISION_METRICS__MEASURES = eINSTANCE.getSimplifiedDecisionMetrics_Measures();

		/**
		 * The meta object literal for the '<em><b>Observations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLIFIED_DECISION_METRICS__OBSERVATIONS = eINSTANCE.getSimplifiedDecisionMetrics_Observations();

		/**
		 * The meta object literal for the '{@link universal.metrics.impl.ObservationsImpl <em>Observations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universal.metrics.impl.ObservationsImpl
		 * @see universal.metrics.impl.MetricsPackageImpl#getObservations()
		 * @generated
		 */
		EClass OBSERVATIONS = eINSTANCE.getObservations();

		/**
		 * The meta object literal for the '<em><b>When Observed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBSERVATIONS__WHEN_OBSERVED = eINSTANCE.getObservations_WhenObserved();

		/**
		 * The meta object literal for the '<em><b>Measurement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBSERVATIONS__MEASUREMENT = eINSTANCE.getObservations_Measurement();

		/**
		 * The meta object literal for the '{@link universal.metrics.impl.NumberLinesMeasureImpl <em>Number Lines Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see universal.metrics.impl.NumberLinesMeasureImpl
		 * @see universal.metrics.impl.MetricsPackageImpl#getNumberLinesMeasure()
		 * @generated
		 */
		EClass NUMBER_LINES_MEASURE = eINSTANCE.getNumberLinesMeasure();

		/**
		 * The meta object literal for the '<em><b>Total Lines</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_LINES_MEASURE__TOTAL_LINES = eINSTANCE.getNumberLinesMeasure_TotalLines();

	}

} //MetricsPackage
