/**
 *
 * $Id$
 */
package org.w3._2001.xml.xsd.validation;

import javax.xml.namespace.QName;

import org.w3._2001.xml.xsd.FormChoice;
import org.w3._2001.xml.xsd.LocalSimpleType;
import org.w3._2001.xml.xsd.UseType;

/**
 * A sample validator interface for {@link org.w3._2001.xml.xsd.Attribute}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface AttributeValidator {
	boolean validate();

	boolean validateSimpleType(LocalSimpleType value);
	boolean validateDefault(String value);
	boolean validateFixed(String value);
	boolean validateForm(FormChoice value);
	boolean validateName(String value);
	boolean validateRef(QName value);
	boolean validateType(QName value);
	boolean validateUse(UseType value);
}
