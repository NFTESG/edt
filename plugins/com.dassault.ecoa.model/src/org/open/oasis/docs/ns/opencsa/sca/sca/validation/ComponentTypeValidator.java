/**
 *
 * $Id$
 */
package org.open.oasis.docs.ns.opencsa.sca.sca.validation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.open.oasis.docs.ns.opencsa.sca.sca.ComponentTypeReference;
import org.open.oasis.docs.ns.opencsa.sca.sca.Property;
import org.open.oasis.docs.ns.opencsa.sca.sca.ServiceType;

/**
 * A sample validator interface for {@link org.open.oasis.docs.ns.opencsa.sca.sca.ComponentType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ComponentTypeValidator {
	boolean validate();

	boolean validateGroup(FeatureMap value);
	boolean validateService(EList<ServiceType> value);
	boolean validateReference(EList<ComponentTypeReference> value);
	boolean validateProperty(EList<Property> value);
}
