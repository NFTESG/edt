/**
 *
 * $Id$
 */
package org.w3._2001.xml.xsd.validation;

import java.math.BigInteger;

/**
 * A sample validator interface for {@link org.w3._2001.xml.xsd.AnyType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface AnyTypeValidator {
	boolean validate();

	boolean validateMaxOccurs(Object value);
	boolean validateMinOccurs(BigInteger value);
}
