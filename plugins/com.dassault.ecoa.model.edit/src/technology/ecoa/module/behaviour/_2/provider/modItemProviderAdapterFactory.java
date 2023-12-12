/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.module.behaviour._2.provider;

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

import technology.ecoa.module.behaviour._2.util.modAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class modItemProviderAdapterFactory extends modAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public modItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link technology.ecoa.module.behaviour._2.ActionSet} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionSetItemProvider actionSetItemProvider;

	/**
	 * This creates an adapter for a {@link technology.ecoa.module.behaviour._2.ActionSet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActionSetAdapter() {
		if (actionSetItemProvider == null) {
			actionSetItemProvider = new ActionSetItemProvider(this);
		}

		return actionSetItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link technology.ecoa.module.behaviour._2.Computing} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComputingItemProvider computingItemProvider;

	/**
	 * This creates an adapter for a {@link technology.ecoa.module.behaviour._2.Computing}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComputingAdapter() {
		if (computingItemProvider == null) {
			computingItemProvider = new ComputingItemProvider(this);
		}

		return computingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link technology.ecoa.module.behaviour._2.DataNotification} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataNotificationItemProvider dataNotificationItemProvider;

	/**
	 * This creates an adapter for a {@link technology.ecoa.module.behaviour._2.DataNotification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDataNotificationAdapter() {
		if (dataNotificationItemProvider == null) {
			dataNotificationItemProvider = new DataNotificationItemProvider(this);
		}

		return dataNotificationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link technology.ecoa.module.behaviour._2.DocumentRoot} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootItemProvider documentRootItemProvider;

	/**
	 * This creates an adapter for a {@link technology.ecoa.module.behaviour._2.DocumentRoot}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDocumentRootAdapter() {
		if (documentRootItemProvider == null) {
			documentRootItemProvider = new DocumentRootItemProvider(this);
		}

		return documentRootItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link technology.ecoa.module.behaviour._2.EntryPoint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntryPointItemProvider entryPointItemProvider;

	/**
	 * This creates an adapter for a {@link technology.ecoa.module.behaviour._2.EntryPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEntryPointAdapter() {
		if (entryPointItemProvider == null) {
			entryPointItemProvider = new EntryPointItemProvider(this);
		}

		return entryPointItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link technology.ecoa.module.behaviour._2.Loop} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoopItemProvider loopItemProvider;

	/**
	 * This creates an adapter for a {@link technology.ecoa.module.behaviour._2.Loop}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLoopAdapter() {
		if (loopItemProvider == null) {
			loopItemProvider = new LoopItemProvider(this);
		}

		return loopItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link technology.ecoa.module.behaviour._2.ModuleBehaviour} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleBehaviourItemProvider moduleBehaviourItemProvider;

	/**
	 * This creates an adapter for a {@link technology.ecoa.module.behaviour._2.ModuleBehaviour}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModuleBehaviourAdapter() {
		if (moduleBehaviourItemProvider == null) {
			moduleBehaviourItemProvider = new ModuleBehaviourItemProvider(this);
		}

		return moduleBehaviourItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link technology.ecoa.module.behaviour._2.ModuleLifeCycleNotification} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleLifeCycleNotificationItemProvider moduleLifeCycleNotificationItemProvider;

	/**
	 * This creates an adapter for a {@link technology.ecoa.module.behaviour._2.ModuleLifeCycleNotification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModuleLifeCycleNotificationAdapter() {
		if (moduleLifeCycleNotificationItemProvider == null) {
			moduleLifeCycleNotificationItemProvider = new ModuleLifeCycleNotificationItemProvider(this);
		}

		return moduleLifeCycleNotificationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link technology.ecoa.module.behaviour._2.OperationCall} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationCallItemProvider operationCallItemProvider;

	/**
	 * This creates an adapter for a {@link technology.ecoa.module.behaviour._2.OperationCall}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOperationCallAdapter() {
		if (operationCallItemProvider == null) {
			operationCallItemProvider = new OperationCallItemProvider(this);
		}

		return operationCallItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link technology.ecoa.module.behaviour._2.ResponseNotification} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResponseNotificationItemProvider responseNotificationItemProvider;

	/**
	 * This creates an adapter for a {@link technology.ecoa.module.behaviour._2.ResponseNotification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResponseNotificationAdapter() {
		if (responseNotificationItemProvider == null) {
			responseNotificationItemProvider = new ResponseNotificationItemProvider(this);
		}

		return responseNotificationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link technology.ecoa.module.behaviour._2.ServiceManagementNotification} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceManagementNotificationItemProvider serviceManagementNotificationItemProvider;

	/**
	 * This creates an adapter for a {@link technology.ecoa.module.behaviour._2.ServiceManagementNotification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createServiceManagementNotificationAdapter() {
		if (serviceManagementNotificationItemProvider == null) {
			serviceManagementNotificationItemProvider = new ServiceManagementNotificationItemProvider(this);
		}

		return serviceManagementNotificationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link technology.ecoa.module.behaviour._2.UseType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UseTypeItemProvider useTypeItemProvider;

	/**
	 * This creates an adapter for a {@link technology.ecoa.module.behaviour._2.UseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUseTypeAdapter() {
		if (useTypeItemProvider == null) {
			useTypeItemProvider = new UseTypeItemProvider(this);
		}

		return useTypeItemProvider;
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
		if (actionSetItemProvider != null) actionSetItemProvider.dispose();
		if (computingItemProvider != null) computingItemProvider.dispose();
		if (dataNotificationItemProvider != null) dataNotificationItemProvider.dispose();
		if (documentRootItemProvider != null) documentRootItemProvider.dispose();
		if (entryPointItemProvider != null) entryPointItemProvider.dispose();
		if (loopItemProvider != null) loopItemProvider.dispose();
		if (moduleBehaviourItemProvider != null) moduleBehaviourItemProvider.dispose();
		if (moduleLifeCycleNotificationItemProvider != null) moduleLifeCycleNotificationItemProvider.dispose();
		if (operationCallItemProvider != null) operationCallItemProvider.dispose();
		if (responseNotificationItemProvider != null) responseNotificationItemProvider.dispose();
		if (serviceManagementNotificationItemProvider != null) serviceManagementNotificationItemProvider.dispose();
		if (useTypeItemProvider != null) useTypeItemProvider.dispose();
	}

}
