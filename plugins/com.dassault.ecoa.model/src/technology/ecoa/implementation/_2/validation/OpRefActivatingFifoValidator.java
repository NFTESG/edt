/**
 *
 * $Id$
 */
package technology.ecoa.implementation._2.validation;

import java.math.BigInteger;

/**
 * A sample validator interface for {@link technology.ecoa.implementation._2.OpRefActivatingFifo}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface OpRefActivatingFifoValidator {
	boolean validate();

	boolean validateFifoSize(BigInteger value);
}
