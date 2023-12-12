/**
 *
 * $Id$
 */
package technology.ecoa.insertion.policy._2.validation;

import technology.ecoa.insertion.policy._2.ProfileType;

/**
 * A sample validator interface for {@link technology.ecoa.insertion.policy._2.ECOAProfile}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ECOAProfileValidator {
	boolean validate();

	boolean validateProfile(ProfileType value);
}
