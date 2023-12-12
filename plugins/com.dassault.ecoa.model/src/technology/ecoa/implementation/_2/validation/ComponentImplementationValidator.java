/**
 *
 * $Id$
 */
package technology.ecoa.implementation._2.validation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

import technology.ecoa.implementation._2.DataLink;
import technology.ecoa.implementation._2.DynamicTriggerInstance;
import technology.ecoa.implementation._2.EventLink;
import technology.ecoa.implementation._2.ModuleImplementation;
import technology.ecoa.implementation._2.ModuleInstance;
import technology.ecoa.implementation._2.ModuleType;
import technology.ecoa.implementation._2.RequestLink;
import technology.ecoa.implementation._2.ServiceQoS;
import technology.ecoa.implementation._2.TriggerInstance;
import technology.ecoa.implementation._2.UseType;

/**
 * A sample validator interface for {@link technology.ecoa.implementation._2.ComponentImplementation}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ComponentImplementationValidator {
	boolean validate();

	boolean validateUse(EList<UseType> value);
	boolean validateService(EList<ServiceQoS> value);
	boolean validateReference(EList<ServiceQoS> value);
	boolean validateModuleType(EList<ModuleType> value);
	boolean validateModuleImplementation(EList<ModuleImplementation> value);
	boolean validateModuleInstance(EList<ModuleInstance> value);
	boolean validateTriggerInstance(EList<TriggerInstance> value);
	boolean validateDynamicTriggerInstance(EList<DynamicTriggerInstance> value);
	boolean validateGroup(FeatureMap value);
	boolean validateDataLink(EList<DataLink> value);
	boolean validateEventLink(EList<EventLink> value);
	boolean validateRequestLink(EList<RequestLink> value);
	boolean validateComponentDefinition(String value);
}
