/**
 *
 * $Id$
 */
package technology.ecoa.insertion.policy._2.validation;

import org.eclipse.emf.common.util.EList;

import technology.ecoa.insertion.policy._2.LanguageLibrary;

/**
 * A sample validator interface for {@link technology.ecoa.insertion.policy._2.LanguageLibraries}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface LanguageLibrariesValidator {
	boolean validate();

	boolean validateLibrary(EList<LanguageLibrary> value);
}
