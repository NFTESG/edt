/**
 *
 * $Id$
 */
package org.w3._2001.xml.xsd.validation;

import org.w3._2001.xml.xsd.AnnotationType;

/**
 * A sample validator interface for {@link org.w3._2001.xml.xsd.Annotated}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface AnnotatedValidator {
	boolean validate();

	boolean validateAnnotation(AnnotationType value);
	boolean validateId(String value);
}