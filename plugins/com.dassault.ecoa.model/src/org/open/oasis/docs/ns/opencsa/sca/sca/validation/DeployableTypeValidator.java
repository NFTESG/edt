/**
 *
 * $Id$
 */
package org.open.oasis.docs.ns.opencsa.sca.sca.validation;

import javax.xml.namespace.QName;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * A sample validator interface for {@link org.open.oasis.docs.ns.opencsa.sca.sca.DeployableType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface DeployableTypeValidator {
	boolean validate();

	boolean validateAny(FeatureMap value);
	boolean validateComposite(QName value);
	boolean validateDeployment(String value);
}
