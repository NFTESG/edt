/**
 *
 * $Id$
 */
package technology.ecoa.insertion.policy._2.validation;

import java.math.BigInteger;

import technology.ecoa.insertion.policy._2.ActivationTypeType;
import technology.ecoa.insertion.policy._2.AperiodicActivationProfile;
import technology.ecoa.insertion.policy._2.PeriodicActivationProfile;

/**
 * A sample validator interface for {@link technology.ecoa.insertion.policy._2.ModuleActivationProfile}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ModuleActivationProfileValidator {
	boolean validate();

	boolean validatePeriodic(PeriodicActivationProfile value);
	boolean validateReactive(AperiodicActivationProfile value);
	boolean validateActivationType(ActivationTypeType value);
	boolean validateBehaviour(String value);
	boolean validateInstanceName(String value);
	boolean validateMaxNbOfProcessedOpsPerActivation(BigInteger value);
	boolean validateQueueDepth(BigInteger value);
}
