/**
 *
 * $Id$
 */
package technology.ecoa.insertion.policy._2.validation;

import org.eclipse.emf.common.util.EList;

import technology.ecoa.insertion.policy._2.PINFOValue;

/**
 * A sample validator interface for {@link technology.ecoa.insertion.policy._2.ModulePINFOType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ModulePINFOTypeValidator {
	boolean validate();

	boolean validatePublicPINFO(EList<PINFOValue> value);
	boolean validatePrivatePINFO(EList<PINFOValue> value);
	boolean validateInstanceName(String value);
}
