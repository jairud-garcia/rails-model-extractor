/**
 */
package co.gruposaberes.model.rails.util;

import co.gruposaberes.model.rails.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see co.gruposaberes.model.rails.RailsPackage
 * @generated
 */
public class RailsAdapterFactory extends AdapterFactoryImpl
{
  /**
	 * The cached model package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static RailsPackage modelPackage;

  /**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public RailsAdapterFactory()
  {
		if (modelPackage == null) {
			modelPackage = RailsPackage.eINSTANCE;
		}
	}

  /**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
  @Override
  public boolean isFactoryForType(Object object)
  {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

  /**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected RailsSwitch<Adapter> modelSwitch =
    new RailsSwitch<Adapter>() {
			@Override
			public Adapter caseApplication(Application object) {
				return createApplicationAdapter();
			}
			@Override
			public Adapter caseRubyClass(RubyClass object) {
				return createRubyClassAdapter();
			}
			@Override
			public Adapter caseClassElement(ClassElement object) {
				return createClassElementAdapter();
			}
			@Override
			public Adapter caseTableName(TableName object) {
				return createTableNameAdapter();
			}
			@Override
			public Adapter caseRelationship(Relationship object) {
				return createRelationshipAdapter();
			}
			@Override
			public Adapter caseHashKeyValue(HashKeyValue object) {
				return createHashKeyValueAdapter();
			}
			@Override
			public Adapter caseRubyMethod(RubyMethod object) {
				return createRubyMethodAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

  /**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
  @Override
  public Adapter createAdapter(Notifier target)
  {
		return modelSwitch.doSwitch((EObject)target);
	}


  /**
	 * Creates a new adapter for an object of class '{@link co.gruposaberes.model.rails.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.gruposaberes.model.rails.Application
	 * @generated
	 */
	public Adapter createApplicationAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link co.gruposaberes.model.rails.RubyClass <em>Ruby Class</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.gruposaberes.model.rails.RubyClass
	 * @generated
	 */
  public Adapter createRubyClassAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link co.gruposaberes.model.rails.ClassElement <em>Class Element</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.gruposaberes.model.rails.ClassElement
	 * @generated
	 */
  public Adapter createClassElementAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link co.gruposaberes.model.rails.TableName <em>Table Name</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.gruposaberes.model.rails.TableName
	 * @generated
	 */
  public Adapter createTableNameAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link co.gruposaberes.model.rails.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.gruposaberes.model.rails.Relationship
	 * @generated
	 */
  public Adapter createRelationshipAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link co.gruposaberes.model.rails.HashKeyValue <em>Hash Key Value</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.gruposaberes.model.rails.HashKeyValue
	 * @generated
	 */
  public Adapter createHashKeyValueAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link co.gruposaberes.model.rails.RubyMethod <em>Ruby Method</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see co.gruposaberes.model.rails.RubyMethod
	 * @generated
	 */
  public Adapter createRubyMethodAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
  public Adapter createEObjectAdapter()
  {
		return null;
	}

} //RailsAdapterFactory
