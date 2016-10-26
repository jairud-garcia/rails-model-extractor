/**
 */
package universal.microservice.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import universal.microservice.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see universal.microservice.MicroservicePackage
 * @generated
 */
public class MicroserviceValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final MicroserviceValidator INSTANCE = new MicroserviceValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "universal.microservice";

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
	public MicroserviceValidator() {
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
	  return MicroservicePackage.eINSTANCE;
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
			case MicroservicePackage.SESSION_TO_ENTITY_CLUSTER:
				return validateSessionToEntityCluster((SessionToEntityCluster)value, diagnostics, context);
			case MicroservicePackage.MICROSERVICE:
				return validateMicroservice((Microservice)value, diagnostics, context);
			case MicroservicePackage.MICROSERVICE_ARCHITECTURE:
				return validateMicroserviceArchitecture((MicroserviceArchitecture)value, diagnostics, context);
			case MicroservicePackage.CLUSTER_RELATIONSHIP:
				return validateClusterRelationship((ClusterRelationship)value, diagnostics, context);
			case MicroservicePackage.MICROSERVICE_RELATIONSHIP:
				return validateMicroserviceRelationship((MicroserviceRelationship)value, diagnostics, context);
			case MicroservicePackage.CLUSTER_RELATION_CONFLICT_PERCENTAGE_MEASURE:
				return validateClusterRelationConflictPercentageMeasure((ClusterRelationConflictPercentageMeasure)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSessionToEntityCluster(SessionToEntityCluster sessionToEntityCluster, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sessionToEntityCluster, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMicroservice(Microservice microservice, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(microservice, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(microservice, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(microservice, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(microservice, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(microservice, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(microservice, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(microservice, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(microservice, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(microservice, diagnostics, context);
		if (result || diagnostics != null) result &= validateMicroservice_MicroserviceRule_MustContaintClusters(microservice, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the MicroserviceRule_MustContaintClusters constraint of '<em>Microservice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MICROSERVICE__MICROSERVICE_RULE_MUST_CONTAINT_CLUSTERS__EEXPRESSION = "self.innerElements->forAll(cluster | cluster.oclIsTypeOf(SessionToEntityCluster) = true)";

	/**
	 * Validates the MicroserviceRule_MustContaintClusters constraint of '<em>Microservice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMicroservice_MicroserviceRule_MustContaintClusters(Microservice microservice, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MicroservicePackage.Literals.MICROSERVICE,
				 microservice,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "MicroserviceRule_MustContaintClusters",
				 MICROSERVICE__MICROSERVICE_RULE_MUST_CONTAINT_CLUSTERS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMicroserviceArchitecture(MicroserviceArchitecture microserviceArchitecture, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(microserviceArchitecture, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(microserviceArchitecture, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(microserviceArchitecture, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(microserviceArchitecture, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(microserviceArchitecture, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(microserviceArchitecture, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(microserviceArchitecture, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(microserviceArchitecture, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(microserviceArchitecture, diagnostics, context);
		if (result || diagnostics != null) result &= validateMicroserviceArchitecture_MicroserviceArchitectureRule_MustMicroserviceElements(microserviceArchitecture, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the MicroserviceArchitectureRule_MustMicroserviceElements constraint of '<em>Architecture</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MICROSERVICE_ARCHITECTURE__MICROSERVICE_ARCHITECTURE_RULE_MUST_MICROSERVICE_ELEMENTS__EEXPRESSION = "self.basicElements->forAll(mc | mc.oclIsTypeOf(Microservice) = true or mc.oclIsKindOf(universal::OOP::Type) = true)";

	/**
	 * Validates the MicroserviceArchitectureRule_MustMicroserviceElements constraint of '<em>Architecture</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMicroserviceArchitecture_MicroserviceArchitectureRule_MustMicroserviceElements(MicroserviceArchitecture microserviceArchitecture, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MicroservicePackage.Literals.MICROSERVICE_ARCHITECTURE,
				 microserviceArchitecture,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "MicroserviceArchitectureRule_MustMicroserviceElements",
				 MICROSERVICE_ARCHITECTURE__MICROSERVICE_ARCHITECTURE_RULE_MUST_MICROSERVICE_ELEMENTS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClusterRelationship(ClusterRelationship clusterRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(clusterRelationship, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(clusterRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(clusterRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(clusterRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(clusterRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(clusterRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(clusterRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(clusterRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(clusterRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validateClusterRelationship_clusterRelationshipRule_SourceMustBeCluster(clusterRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validateClusterRelationship_clusterRelationshipRule_TargetsMustBeClusters(clusterRelationship, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the clusterRelationshipRule_SourceMustBeCluster constraint of '<em>Cluster Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLUSTER_RELATIONSHIP__CLUSTER_RELATIONSHIP_RULE_SOURCE_MUST_BE_CLUSTER__EEXPRESSION = "self.source.oclIsTypeOf(SessionToEntityCluster) = true";

	/**
	 * Validates the clusterRelationshipRule_SourceMustBeCluster constraint of '<em>Cluster Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClusterRelationship_clusterRelationshipRule_SourceMustBeCluster(ClusterRelationship clusterRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MicroservicePackage.Literals.CLUSTER_RELATIONSHIP,
				 clusterRelationship,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "clusterRelationshipRule_SourceMustBeCluster",
				 CLUSTER_RELATIONSHIP__CLUSTER_RELATIONSHIP_RULE_SOURCE_MUST_BE_CLUSTER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the clusterRelationshipRule_TargetsMustBeClusters constraint of '<em>Cluster Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLUSTER_RELATIONSHIP__CLUSTER_RELATIONSHIP_RULE_TARGETS_MUST_BE_CLUSTERS__EEXPRESSION = "self.target.oclIsTypeOf(SessionToEntityCluster) = true";

	/**
	 * Validates the clusterRelationshipRule_TargetsMustBeClusters constraint of '<em>Cluster Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClusterRelationship_clusterRelationshipRule_TargetsMustBeClusters(ClusterRelationship clusterRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MicroservicePackage.Literals.CLUSTER_RELATIONSHIP,
				 clusterRelationship,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "clusterRelationshipRule_TargetsMustBeClusters",
				 CLUSTER_RELATIONSHIP__CLUSTER_RELATIONSHIP_RULE_TARGETS_MUST_BE_CLUSTERS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMicroserviceRelationship(MicroserviceRelationship microserviceRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(microserviceRelationship, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(microserviceRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(microserviceRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(microserviceRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(microserviceRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(microserviceRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(microserviceRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(microserviceRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(microserviceRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validateMicroserviceRelationship_microserviceRelationshipRule_SourceMustBeMicroservice(microserviceRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validateMicroserviceRelationship_microserviceRelationshipRule_TargetsMustBeMicroservices(microserviceRelationship, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the microserviceRelationshipRule_SourceMustBeMicroservice constraint of '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MICROSERVICE_RELATIONSHIP__MICROSERVICE_RELATIONSHIP_RULE_SOURCE_MUST_BE_MICROSERVICE__EEXPRESSION = "self.source.oclIsTypeOf(Microservice) = true";

	/**
	 * Validates the microserviceRelationshipRule_SourceMustBeMicroservice constraint of '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMicroserviceRelationship_microserviceRelationshipRule_SourceMustBeMicroservice(MicroserviceRelationship microserviceRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MicroservicePackage.Literals.MICROSERVICE_RELATIONSHIP,
				 microserviceRelationship,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "microserviceRelationshipRule_SourceMustBeMicroservice",
				 MICROSERVICE_RELATIONSHIP__MICROSERVICE_RELATIONSHIP_RULE_SOURCE_MUST_BE_MICROSERVICE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the microserviceRelationshipRule_TargetsMustBeMicroservices constraint of '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MICROSERVICE_RELATIONSHIP__MICROSERVICE_RELATIONSHIP_RULE_TARGETS_MUST_BE_MICROSERVICES__EEXPRESSION = "self.target.oclIsTypeOf(Microservice) = true";

	/**
	 * Validates the microserviceRelationshipRule_TargetsMustBeMicroservices constraint of '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMicroserviceRelationship_microserviceRelationshipRule_TargetsMustBeMicroservices(MicroserviceRelationship microserviceRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MicroservicePackage.Literals.MICROSERVICE_RELATIONSHIP,
				 microserviceRelationship,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "microserviceRelationshipRule_TargetsMustBeMicroservices",
				 MICROSERVICE_RELATIONSHIP__MICROSERVICE_RELATIONSHIP_RULE_TARGETS_MUST_BE_MICROSERVICES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClusterRelationConflictPercentageMeasure(ClusterRelationConflictPercentageMeasure clusterRelationConflictPercentageMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(clusterRelationConflictPercentageMeasure, diagnostics, context);
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

} //MicroserviceValidator
