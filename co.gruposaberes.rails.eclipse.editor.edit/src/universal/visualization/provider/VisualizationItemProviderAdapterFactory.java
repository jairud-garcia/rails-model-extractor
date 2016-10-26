/**
 */
package universal.visualization.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import universal.visualization.util.VisualizationAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class VisualizationItemProviderAdapterFactory extends VisualizationAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualizationItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link universal.visualization.VDiagramElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VDiagramElementItemProvider vDiagramElementItemProvider;

	/**
	 * This creates an adapter for a {@link universal.visualization.VDiagramElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVDiagramElementAdapter() {
		if (vDiagramElementItemProvider == null) {
			vDiagramElementItemProvider = new VDiagramElementItemProvider(this);
		}

		return vDiagramElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link universal.visualization.VLabel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VLabelItemProvider vLabelItemProvider;

	/**
	 * This creates an adapter for a {@link universal.visualization.VLabel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVLabelAdapter() {
		if (vLabelItemProvider == null) {
			vLabelItemProvider = new VLabelItemProvider(this);
		}

		return vLabelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link universal.visualization.VDrawable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VDrawableItemProvider vDrawableItemProvider;

	/**
	 * This creates an adapter for a {@link universal.visualization.VDrawable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVDrawableAdapter() {
		if (vDrawableItemProvider == null) {
			vDrawableItemProvider = new VDrawableItemProvider(this);
		}

		return vDrawableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link universal.visualization.VBorder} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VBorderItemProvider vBorderItemProvider;

	/**
	 * This creates an adapter for a {@link universal.visualization.VBorder}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVBorderAdapter() {
		if (vBorderItemProvider == null) {
			vBorderItemProvider = new VBorderItemProvider(this);
		}

		return vBorderItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link universal.visualization.VContainer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VContainerItemProvider vContainerItemProvider;

	/**
	 * This creates an adapter for a {@link universal.visualization.VContainer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVContainerAdapter() {
		if (vContainerItemProvider == null) {
			vContainerItemProvider = new VContainerItemProvider(this);
		}

		return vContainerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link universal.visualization.VDiagram} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VDiagramItemProvider vDiagramItemProvider;

	/**
	 * This creates an adapter for a {@link universal.visualization.VDiagram}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVDiagramAdapter() {
		if (vDiagramItemProvider == null) {
			vDiagramItemProvider = new VDiagramItemProvider(this);
		}

		return vDiagramItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link universal.visualization.VClass} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VClassItemProvider vClassItemProvider;

	/**
	 * This creates an adapter for a {@link universal.visualization.VClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVClassAdapter() {
		if (vClassItemProvider == null) {
			vClassItemProvider = new VClassItemProvider(this);
		}

		return vClassItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link universal.visualization.VPackage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VPackageItemProvider vPackageItemProvider;

	/**
	 * This creates an adapter for a {@link universal.visualization.VPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVPackageAdapter() {
		if (vPackageItemProvider == null) {
			vPackageItemProvider = new VPackageItemProvider(this);
		}

		return vPackageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link universal.visualization.VShape} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VShapeItemProvider vShapeItemProvider;

	/**
	 * This creates an adapter for a {@link universal.visualization.VShape}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVShapeAdapter() {
		if (vShapeItemProvider == null) {
			vShapeItemProvider = new VShapeItemProvider(this);
		}

		return vShapeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link universal.visualization.VCircule} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VCirculeItemProvider vCirculeItemProvider;

	/**
	 * This creates an adapter for a {@link universal.visualization.VCircule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVCirculeAdapter() {
		if (vCirculeItemProvider == null) {
			vCirculeItemProvider = new VCirculeItemProvider(this);
		}

		return vCirculeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link universal.visualization.VTriangle} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VTriangleItemProvider vTriangleItemProvider;

	/**
	 * This creates an adapter for a {@link universal.visualization.VTriangle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVTriangleAdapter() {
		if (vTriangleItemProvider == null) {
			vTriangleItemProvider = new VTriangleItemProvider(this);
		}

		return vTriangleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link universal.visualization.VDiamond} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VDiamondItemProvider vDiamondItemProvider;

	/**
	 * This creates an adapter for a {@link universal.visualization.VDiamond}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVDiamondAdapter() {
		if (vDiamondItemProvider == null) {
			vDiamondItemProvider = new VDiamondItemProvider(this);
		}

		return vDiamondItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link universal.visualization.VQuadrangle} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VQuadrangleItemProvider vQuadrangleItemProvider;

	/**
	 * This creates an adapter for a {@link universal.visualization.VQuadrangle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVQuadrangleAdapter() {
		if (vQuadrangleItemProvider == null) {
			vQuadrangleItemProvider = new VQuadrangleItemProvider(this);
		}

		return vQuadrangleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link universal.visualization.VDot} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VDotItemProvider vDotItemProvider;

	/**
	 * This creates an adapter for a {@link universal.visualization.VDot}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVDotAdapter() {
		if (vDotItemProvider == null) {
			vDotItemProvider = new VDotItemProvider(this);
		}

		return vDotItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link universal.visualization.VEllipse} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VEllipseItemProvider vEllipseItemProvider;

	/**
	 * This creates an adapter for a {@link universal.visualization.VEllipse}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVEllipseAdapter() {
		if (vEllipseItemProvider == null) {
			vEllipseItemProvider = new VEllipseItemProvider(this);
		}

		return vEllipseItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link universal.visualization.VRelationInvocation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VRelationInvocationItemProvider vRelationInvocationItemProvider;

	/**
	 * This creates an adapter for a {@link universal.visualization.VRelationInvocation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVRelationInvocationAdapter() {
		if (vRelationInvocationItemProvider == null) {
			vRelationInvocationItemProvider = new VRelationInvocationItemProvider(this);
		}

		return vRelationInvocationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link universal.visualization.VInvocation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VInvocationItemProvider vInvocationItemProvider;

	/**
	 * This creates an adapter for a {@link universal.visualization.VInvocation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVInvocationAdapter() {
		if (vInvocationItemProvider == null) {
			vInvocationItemProvider = new VInvocationItemProvider(this);
		}

		return vInvocationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link universal.visualization.VConnectorElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VConnectorElementItemProvider vConnectorElementItemProvider;

	/**
	 * This creates an adapter for a {@link universal.visualization.VConnectorElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVConnectorElementAdapter() {
		if (vConnectorElementItemProvider == null) {
			vConnectorElementItemProvider = new VConnectorElementItemProvider(this);
		}

		return vConnectorElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link universal.visualization.VGeneralization} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VGeneralizationItemProvider vGeneralizationItemProvider;

	/**
	 * This creates an adapter for a {@link universal.visualization.VGeneralization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVGeneralizationAdapter() {
		if (vGeneralizationItemProvider == null) {
			vGeneralizationItemProvider = new VGeneralizationItemProvider(this);
		}

		return vGeneralizationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link universal.visualization.VImplements} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VImplementsItemProvider vImplementsItemProvider;

	/**
	 * This creates an adapter for a {@link universal.visualization.VImplements}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVImplementsAdapter() {
		if (vImplementsItemProvider == null) {
			vImplementsItemProvider = new VImplementsItemProvider(this);
		}

		return vImplementsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link universal.visualization.VDependecy} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VDependecyItemProvider vDependecyItemProvider;

	/**
	 * This creates an adapter for a {@link universal.visualization.VDependecy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVDependecyAdapter() {
		if (vDependecyItemProvider == null) {
			vDependecyItemProvider = new VDependecyItemProvider(this);
		}

		return vDependecyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link universal.visualization.VAssociation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VAssociationItemProvider vAssociationItemProvider;

	/**
	 * This creates an adapter for a {@link universal.visualization.VAssociation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVAssociationAdapter() {
		if (vAssociationItemProvider == null) {
			vAssociationItemProvider = new VAssociationItemProvider(this);
		}

		return vAssociationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link universal.visualization.VAgregation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VAgregationItemProvider vAgregationItemProvider;

	/**
	 * This creates an adapter for a {@link universal.visualization.VAgregation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVAgregationAdapter() {
		if (vAgregationItemProvider == null) {
			vAgregationItemProvider = new VAgregationItemProvider(this);
		}

		return vAgregationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link universal.visualization.VComposition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VCompositionItemProvider vCompositionItemProvider;

	/**
	 * This creates an adapter for a {@link universal.visualization.VComposition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVCompositionAdapter() {
		if (vCompositionItemProvider == null) {
			vCompositionItemProvider = new VCompositionItemProvider(this);
		}

		return vCompositionItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (vDiagramElementItemProvider != null) vDiagramElementItemProvider.dispose();
		if (vLabelItemProvider != null) vLabelItemProvider.dispose();
		if (vDrawableItemProvider != null) vDrawableItemProvider.dispose();
		if (vBorderItemProvider != null) vBorderItemProvider.dispose();
		if (vContainerItemProvider != null) vContainerItemProvider.dispose();
		if (vDiagramItemProvider != null) vDiagramItemProvider.dispose();
		if (vClassItemProvider != null) vClassItemProvider.dispose();
		if (vPackageItemProvider != null) vPackageItemProvider.dispose();
		if (vShapeItemProvider != null) vShapeItemProvider.dispose();
		if (vCirculeItemProvider != null) vCirculeItemProvider.dispose();
		if (vTriangleItemProvider != null) vTriangleItemProvider.dispose();
		if (vDiamondItemProvider != null) vDiamondItemProvider.dispose();
		if (vQuadrangleItemProvider != null) vQuadrangleItemProvider.dispose();
		if (vDotItemProvider != null) vDotItemProvider.dispose();
		if (vEllipseItemProvider != null) vEllipseItemProvider.dispose();
		if (vRelationInvocationItemProvider != null) vRelationInvocationItemProvider.dispose();
		if (vInvocationItemProvider != null) vInvocationItemProvider.dispose();
		if (vConnectorElementItemProvider != null) vConnectorElementItemProvider.dispose();
		if (vGeneralizationItemProvider != null) vGeneralizationItemProvider.dispose();
		if (vImplementsItemProvider != null) vImplementsItemProvider.dispose();
		if (vDependecyItemProvider != null) vDependecyItemProvider.dispose();
		if (vAssociationItemProvider != null) vAssociationItemProvider.dispose();
		if (vAgregationItemProvider != null) vAgregationItemProvider.dispose();
		if (vCompositionItemProvider != null) vCompositionItemProvider.dispose();
	}

}