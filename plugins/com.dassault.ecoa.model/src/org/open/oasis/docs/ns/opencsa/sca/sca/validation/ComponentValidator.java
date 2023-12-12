/**
 *
 * $Id$
 */
package org.open.oasis.docs.ns.opencsa.sca.sca.validation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.open.oasis.docs.ns.opencsa.sca.sca.ComponentReference;
import org.open.oasis.docs.ns.opencsa.sca.sca.ComponentService;
import org.open.oasis.docs.ns.opencsa.sca.sca.Implementation;
import org.open.oasis.docs.ns.opencsa.sca.sca.PropertyValue;

/**
 * A sample validator interface for {@link org.open.oasis.docs.ns.opencsa.sca.sca.Component}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ComponentValidator {
	boolean validate();

	boolean validateImplementationGroup(FeatureMap value);
	boolean validateImplementation(Implementation value);
	boolean validateGroup(FeatureMap value);
	boolean validateService(EList<ComponentService> value);
	boolean validateReference(EList<ComponentReference> value);
	boolean validateProperty(EList<PropertyValue> value);
	boolean validateName(String value);
}