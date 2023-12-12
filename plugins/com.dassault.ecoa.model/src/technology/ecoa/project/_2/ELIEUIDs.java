/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.project._2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ELIEUI Ds</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * List of bindings
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.project._2.ELIEUIDs#getEUID <em>EUID</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.project._2.projPackage#getELIEUIDs()
 * @model extendedMetaData="name='ELI_EUIDs' kind='elementOnly'"
 * @generated
 */
public interface ELIEUIDs extends EObject {
	/**
	 * Returns the value of the '<em><b>EUID</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EUID</em>' attribute list.
	 * @see technology.ecoa.project._2.projPackage#getELIEUIDs_EUID()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 *        extendedMetaData="kind='element' name='EUID' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getEUID();

} // ELIEUIDs
