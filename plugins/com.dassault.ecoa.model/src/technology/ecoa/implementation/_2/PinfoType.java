/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.implementation._2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pinfo Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.implementation._2.PinfoType#getPublicPinfo <em>Public Pinfo</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.PinfoType#getPrivatePinfo <em>Private Pinfo</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.implementation._2.impPackage#getPinfoType()
 * @model extendedMetaData="name='pinfo_._type' kind='elementOnly'"
 * @generated
 */
public interface PinfoType extends EObject {
	/**
	 * Returns the value of the '<em><b>Public Pinfo</b></em>' containment reference list.
	 * The list contents are of type {@link technology.ecoa.implementation._2.PinfoValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Public Pinfo</em>' containment reference list.
	 * @see technology.ecoa.implementation._2.impPackage#getPinfoType_PublicPinfo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='publicPinfo' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PinfoValue> getPublicPinfo();

	/**
	 * Returns the value of the '<em><b>Private Pinfo</b></em>' containment reference list.
	 * The list contents are of type {@link technology.ecoa.implementation._2.PinfoValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Private Pinfo</em>' containment reference list.
	 * @see technology.ecoa.implementation._2.impPackage#getPinfoType_PrivatePinfo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='privatePinfo' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PinfoValue> getPrivatePinfo();

} // PinfoType
