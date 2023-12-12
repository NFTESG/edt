/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.insertion.policy._2.provider;

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

import technology.ecoa.insertion.policy._2.util.polAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class polItemProviderAdapterFactory extends polAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public polItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link technology.ecoa.insertion.policy._2.AperiodicActivationProfile} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AperiodicActivationProfileItemProvider aperiodicActivationProfileItemProvider;

	/**
	 * This creates an adapter for a {@link technology.ecoa.insertion.policy._2.AperiodicActivationProfile}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAperiodicActivationProfileAdapter() {
		if (aperiodicActivationProfileItemProvider == null) {
			aperiodicActivationProfileItemProvider = new AperiodicActivationProfileItemProvider(this);
		}

		return aperiodicActivationProfileItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link technology.ecoa.insertion.policy._2.Compiler} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompilerItemProvider compilerItemProvider;

	/**
	 * This creates an adapter for a {@link technology.ecoa.insertion.policy._2.Compiler}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCompilerAdapter() {
		if (compilerItemProvider == null) {
			compilerItemProvider = new CompilerItemProvider(this);
		}

		return compilerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link technology.ecoa.insertion.policy._2.DefaultPINFO} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefaultPINFOItemProvider defaultPINFOItemProvider;

	/**
	 * This creates an adapter for a {@link technology.ecoa.insertion.policy._2.DefaultPINFO}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDefaultPINFOAdapter() {
		if (defaultPINFOItemProvider == null) {
			defaultPINFOItemProvider = new DefaultPINFOItemProvider(this);
		}

		return defaultPINFOItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link technology.ecoa.insertion.policy._2.DefaultProperties} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefaultPropertiesItemProvider defaultPropertiesItemProvider;

	/**
	 * This creates an adapter for a {@link technology.ecoa.insertion.policy._2.DefaultProperties}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDefaultPropertiesAdapter() {
		if (defaultPropertiesItemProvider == null) {
			defaultPropertiesItemProvider = new DefaultPropertiesItemProvider(this);
		}

		return defaultPropertiesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link technology.ecoa.insertion.policy._2.DefaultPropertyValue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefaultPropertyValueItemProvider defaultPropertyValueItemProvider;

	/**
	 * This creates an adapter for a {@link technology.ecoa.insertion.policy._2.DefaultPropertyValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDefaultPropertyValueAdapter() {
		if (defaultPropertyValueItemProvider == null) {
			defaultPropertyValueItemProvider = new DefaultPropertyValueItemProvider(this);
		}

		return defaultPropertyValueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link technology.ecoa.insertion.policy._2.DeploymentConstraints} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeploymentConstraintsItemProvider deploymentConstraintsItemProvider;

	/**
	 * This creates an adapter for a {@link technology.ecoa.insertion.policy._2.DeploymentConstraints}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDeploymentConstraintsAdapter() {
		if (deploymentConstraintsItemProvider == null) {
			deploymentConstraintsItemProvider = new DeploymentConstraintsItemProvider(this);
		}

		return deploymentConstraintsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link technology.ecoa.insertion.policy._2.DocumentRoot} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootItemProvider documentRootItemProvider;

	/**
	 * This creates an adapter for a {@link technology.ecoa.insertion.policy._2.DocumentRoot}.
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
	 * This keeps track of the one adapter used for all {@link technology.ecoa.insertion.policy._2.DynamicMemoryType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DynamicMemoryTypeItemProvider dynamicMemoryTypeItemProvider;

	/**
	 * This creates an adapter for a {@link technology.ecoa.insertion.policy._2.DynamicMemoryType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDynamicMemoryTypeAdapter() {
		if (dynamicMemoryTypeItemProvider == null) {
			dynamicMemoryTypeItemProvider = new DynamicMemoryTypeItemProvider(this);
		}

		return dynamicMemoryTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link technology.ecoa.insertion.policy._2.ECOAProfile} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ECOAProfileItemProvider ecoaProfileItemProvider;

	/**
	 * This creates an adapter for a {@link technology.ecoa.insertion.policy._2.ECOAProfile}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createECOAProfileAdapter() {
		if (ecoaProfileItemProvider == null) {
			ecoaProfileItemProvider = new ECOAProfileItemProvider(this);
		}

		return ecoaProfileItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link technology.ecoa.insertion.policy._2.ExtraConcerns} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtraConcernsItemProvider extraConcernsItemProvider;

	/**
	 * This creates an adapter for a {@link technology.ecoa.insertion.policy._2.ExtraConcerns}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExtraConcernsAdapter() {
		if (extraConcernsItemProvider == null) {
			extraConcernsItemProvider = new ExtraConcernsItemProvider(this);
		}

		return extraConcernsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link technology.ecoa.insertion.policy._2.HighestActivationRate} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HighestActivationRateItemProvider highestActivationRateItemProvider;

	/**
	 * This creates an adapter for a {@link technology.ecoa.insertion.policy._2.HighestActivationRate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHighestActivationRateAdapter() {
		if (highestActivationRateItemProvider == null) {
			highestActivationRateItemProvider = new HighestActivationRateItemProvider(this);
		}

		return highestActivationRateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link technology.ecoa.insertion.policy._2.InsertionPolicy} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InsertionPolicyItemProvider insertionPolicyItemProvider;

	/**
	 * This creates an adapter for a {@link technology.ecoa.insertion.policy._2.InsertionPolicy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInsertionPolicyAdapter() {
		if (insertionPolicyItemProvider == null) {
			insertionPolicyItemProvider = new InsertionPolicyItemProvider(this);
		}

		return insertionPolicyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link technology.ecoa.insertion.policy._2.InsertionPolicyList} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InsertionPolicyListItemProvider insertionPolicyListItemProvider;

	/**
	 * This creates an adapter for a {@link technology.ecoa.insertion.policy._2.InsertionPolicyList}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInsertionPolicyListAdapter() {
		if (insertionPolicyListItemProvider == null) {
			insertionPolicyListItemProvider = new InsertionPolicyListItemProvider(this);
		}

		return insertionPolicyListItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link technology.ecoa.insertion.policy._2.LanguageLibraries} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LanguageLibrariesItemProvider languageLibrariesItemProvider;

	/**
	 * This creates an adapter for a {@link technology.ecoa.insertion.policy._2.LanguageLibraries}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLanguageLibrariesAdapter() {
		if (languageLibrariesItemProvider == null) {
			languageLibrariesItemProvider = new LanguageLibrariesItemProvider(this);
		}

		return languageLibrariesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link technology.ecoa.insertion.policy._2.LanguageLibrary} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LanguageLibraryItemProvider languageLibraryItemProvider;

	/**
	 * This creates an adapter for a {@link technology.ecoa.insertion.policy._2.LanguageLibrary}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLanguageLibraryAdapter() {
		if (languageLibraryItemProvider == null) {
			languageLibraryItemProvider = new LanguageLibraryItemProvider(this);
		}

		return languageLibraryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link technology.ecoa.insertion.policy._2.MemoryUsage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemoryUsageItemProvider memoryUsageItemProvider;

	/**
	 * This creates an adapter for a {@link technology.ecoa.insertion.policy._2.MemoryUsage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMemoryUsageAdapter() {
		if (memoryUsageItemProvider == null) {
			memoryUsageItemProvider = new MemoryUsageItemProvider(this);
		}

		return memoryUsageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link technology.ecoa.insertion.policy._2.ModuleActivationProfile} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleActivationProfileItemProvider moduleActivationProfileItemProvider;

	/**
	 * This creates an adapter for a {@link technology.ecoa.insertion.policy._2.ModuleActivationProfile}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModuleActivationProfileAdapter() {
		if (moduleActivationProfileItemProvider == null) {
			moduleActivationProfileItemProvider = new ModuleActivationProfileItemProvider(this);
		}

		return moduleActivationProfileItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link technology.ecoa.insertion.policy._2.ModuleActivationProfiles} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleActivationProfilesItemProvider moduleActivationProfilesItemProvider;

	/**
	 * This creates an adapter for a {@link technology.ecoa.insertion.policy._2.ModuleActivationProfiles}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModuleActivationProfilesAdapter() {
		if (moduleActivationProfilesItemProvider == null) {
			moduleActivationProfilesItemProvider = new ModuleActivationProfilesItemProvider(this);
		}

		return moduleActivationProfilesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link technology.ecoa.insertion.policy._2.ModuleCompilationOptions} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleCompilationOptionsItemProvider moduleCompilationOptionsItemProvider;

	/**
	 * This creates an adapter for a {@link technology.ecoa.insertion.policy._2.ModuleCompilationOptions}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModuleCompilationOptionsAdapter() {
		if (moduleCompilationOptionsItemProvider == null) {
			moduleCompilationOptionsItemProvider = new ModuleCompilationOptionsItemProvider(this);
		}

		return moduleCompilationOptionsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link technology.ecoa.insertion.policy._2.ModuleDependencies} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleDependenciesItemProvider moduleDependenciesItemProvider;

	/**
	 * This creates an adapter for a {@link technology.ecoa.insertion.policy._2.ModuleDependencies}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModuleDependenciesAdapter() {
		if (moduleDependenciesItemProvider == null) {
			moduleDependenciesItemProvider = new ModuleDependenciesItemProvider(this);
		}

		return moduleDependenciesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link technology.ecoa.insertion.policy._2.ModuleMemoryUsage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleMemoryUsageItemProvider moduleMemoryUsageItemProvider;

	/**
	 * This creates an adapter for a {@link technology.ecoa.insertion.policy._2.ModuleMemoryUsage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModuleMemoryUsageAdapter() {
		if (moduleMemoryUsageItemProvider == null) {
			moduleMemoryUsageItemProvider = new ModuleMemoryUsageItemProvider(this);
		}

		return moduleMemoryUsageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link technology.ecoa.insertion.policy._2.ModulePINFOType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModulePINFOTypeItemProvider modulePINFOTypeItemProvider;

	/**
	 * This creates an adapter for a {@link technology.ecoa.insertion.policy._2.ModulePINFOType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModulePINFOTypeAdapter() {
		if (modulePINFOTypeItemProvider == null) {
			modulePINFOTypeItemProvider = new ModulePINFOTypeItemProvider(this);
		}

		return modulePINFOTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link technology.ecoa.insertion.policy._2.ModulesDependencies} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModulesDependenciesItemProvider modulesDependenciesItemProvider;

	/**
	 * This creates an adapter for a {@link technology.ecoa.insertion.policy._2.ModulesDependencies}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModulesDependenciesAdapter() {
		if (modulesDependenciesItemProvider == null) {
			modulesDependenciesItemProvider = new ModulesDependenciesItemProvider(this);
		}

		return modulesDependenciesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link technology.ecoa.insertion.policy._2.OSAPIType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OSAPITypeItemProvider osapiTypeItemProvider;

	/**
	 * This creates an adapter for a {@link technology.ecoa.insertion.policy._2.OSAPIType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOSAPITypeAdapter() {
		if (osapiTypeItemProvider == null) {
			osapiTypeItemProvider = new OSAPITypeItemProvider(this);
		}

		return osapiTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link technology.ecoa.insertion.policy._2.PeriodicActivationProfile} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PeriodicActivationProfileItemProvider periodicActivationProfileItemProvider;

	/**
	 * This creates an adapter for a {@link technology.ecoa.insertion.policy._2.PeriodicActivationProfile}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPeriodicActivationProfileAdapter() {
		if (periodicActivationProfileItemProvider == null) {
			periodicActivationProfileItemProvider = new PeriodicActivationProfileItemProvider(this);
		}

		return periodicActivationProfileItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link technology.ecoa.insertion.policy._2.PINFOValue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PINFOValueItemProvider pinfoValueItemProvider;

	/**
	 * This creates an adapter for a {@link technology.ecoa.insertion.policy._2.PINFOValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPINFOValueAdapter() {
		if (pinfoValueItemProvider == null) {
			pinfoValueItemProvider = new PINFOValueItemProvider(this);
		}

		return pinfoValueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link technology.ecoa.insertion.policy._2.RealtimeCharacteristics} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RealtimeCharacteristicsItemProvider realtimeCharacteristicsItemProvider;

	/**
	 * This creates an adapter for a {@link technology.ecoa.insertion.policy._2.RealtimeCharacteristics}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRealtimeCharacteristicsAdapter() {
		if (realtimeCharacteristicsItemProvider == null) {
			realtimeCharacteristicsItemProvider = new RealtimeCharacteristicsItemProvider(this);
		}

		return realtimeCharacteristicsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link technology.ecoa.insertion.policy._2.RegisterSize} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegisterSizeItemProvider registerSizeItemProvider;

	/**
	 * This creates an adapter for a {@link technology.ecoa.insertion.policy._2.RegisterSize}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRegisterSizeAdapter() {
		if (registerSizeItemProvider == null) {
			registerSizeItemProvider = new RegisterSizeItemProvider(this);
		}

		return registerSizeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link technology.ecoa.insertion.policy._2.SchedulingPolicyType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchedulingPolicyTypeItemProvider schedulingPolicyTypeItemProvider;

	/**
	 * This creates an adapter for a {@link technology.ecoa.insertion.policy._2.SchedulingPolicyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSchedulingPolicyTypeAdapter() {
		if (schedulingPolicyTypeItemProvider == null) {
			schedulingPolicyTypeItemProvider = new SchedulingPolicyTypeItemProvider(this);
		}

		return schedulingPolicyTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link technology.ecoa.insertion.policy._2.TimeAccuracy} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeAccuracyItemProvider timeAccuracyItemProvider;

	/**
	 * This creates an adapter for a {@link technology.ecoa.insertion.policy._2.TimeAccuracy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTimeAccuracyAdapter() {
		if (timeAccuracyItemProvider == null) {
			timeAccuracyItemProvider = new TimeAccuracyItemProvider(this);
		}

		return timeAccuracyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link technology.ecoa.insertion.policy._2.TransportProtocol} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransportProtocolItemProvider transportProtocolItemProvider;

	/**
	 * This creates an adapter for a {@link technology.ecoa.insertion.policy._2.TransportProtocol}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTransportProtocolAdapter() {
		if (transportProtocolItemProvider == null) {
			transportProtocolItemProvider = new TransportProtocolItemProvider(this);
		}

		return transportProtocolItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link technology.ecoa.insertion.policy._2.UseType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UseTypeItemProvider useTypeItemProvider;

	/**
	 * This creates an adapter for a {@link technology.ecoa.insertion.policy._2.UseType}.
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
		if (aperiodicActivationProfileItemProvider != null) aperiodicActivationProfileItemProvider.dispose();
		if (compilerItemProvider != null) compilerItemProvider.dispose();
		if (defaultPINFOItemProvider != null) defaultPINFOItemProvider.dispose();
		if (defaultPropertiesItemProvider != null) defaultPropertiesItemProvider.dispose();
		if (defaultPropertyValueItemProvider != null) defaultPropertyValueItemProvider.dispose();
		if (deploymentConstraintsItemProvider != null) deploymentConstraintsItemProvider.dispose();
		if (documentRootItemProvider != null) documentRootItemProvider.dispose();
		if (dynamicMemoryTypeItemProvider != null) dynamicMemoryTypeItemProvider.dispose();
		if (ecoaProfileItemProvider != null) ecoaProfileItemProvider.dispose();
		if (extraConcernsItemProvider != null) extraConcernsItemProvider.dispose();
		if (highestActivationRateItemProvider != null) highestActivationRateItemProvider.dispose();
		if (insertionPolicyItemProvider != null) insertionPolicyItemProvider.dispose();
		if (insertionPolicyListItemProvider != null) insertionPolicyListItemProvider.dispose();
		if (languageLibrariesItemProvider != null) languageLibrariesItemProvider.dispose();
		if (languageLibraryItemProvider != null) languageLibraryItemProvider.dispose();
		if (memoryUsageItemProvider != null) memoryUsageItemProvider.dispose();
		if (moduleActivationProfileItemProvider != null) moduleActivationProfileItemProvider.dispose();
		if (moduleActivationProfilesItemProvider != null) moduleActivationProfilesItemProvider.dispose();
		if (moduleCompilationOptionsItemProvider != null) moduleCompilationOptionsItemProvider.dispose();
		if (moduleDependenciesItemProvider != null) moduleDependenciesItemProvider.dispose();
		if (moduleMemoryUsageItemProvider != null) moduleMemoryUsageItemProvider.dispose();
		if (modulePINFOTypeItemProvider != null) modulePINFOTypeItemProvider.dispose();
		if (modulesDependenciesItemProvider != null) modulesDependenciesItemProvider.dispose();
		if (osapiTypeItemProvider != null) osapiTypeItemProvider.dispose();
		if (periodicActivationProfileItemProvider != null) periodicActivationProfileItemProvider.dispose();
		if (pinfoValueItemProvider != null) pinfoValueItemProvider.dispose();
		if (realtimeCharacteristicsItemProvider != null) realtimeCharacteristicsItemProvider.dispose();
		if (registerSizeItemProvider != null) registerSizeItemProvider.dispose();
		if (schedulingPolicyTypeItemProvider != null) schedulingPolicyTypeItemProvider.dispose();
		if (timeAccuracyItemProvider != null) timeAccuracyItemProvider.dispose();
		if (transportProtocolItemProvider != null) transportProtocolItemProvider.dispose();
		if (useTypeItemProvider != null) useTypeItemProvider.dispose();
	}

}
