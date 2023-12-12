/**
 *
 * $Id$
 */
package technology.ecoa.sca.extension.scaExt.validation;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.util.FeatureMap;

import technology.ecoa.sca.extension.scaExt.Instance;
import technology.ecoa.sca.extension.scaExt.Interface;

/**
 * A sample validator interface for {@link technology.ecoa.sca.extension.scaExt.DocumentRoot}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface DocumentRootValidator {
	boolean validate();

	boolean validateMixed(FeatureMap value);
	boolean validateXMLNSPrefixMap(EMap<String, String> value);
	boolean validateXSISchemaLocation(EMap<String, String> value);
	boolean validateInstance(Instance value);
	boolean validateInterface(Interface value);
	boolean validateDeployment(String value);
	boolean validateType(String value);
}
