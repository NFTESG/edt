/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package org.w3._2001.xml.xsd;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3._2001.xml.xsd.FieldType#getXpath <em>Xpath</em>}</li>
 * </ul>
 *
 * @see org.w3._2001.xml.xsd.SchemaPackage#getFieldType()
 * @model extendedMetaData="name='field_._type' kind='elementOnly'"
 * @generated
 */
public interface FieldType extends Annotated {
	/**
	 * Returns the value of the '<em><b>Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xpath</em>' attribute.
	 * @see #setXpath(String)
	 * @see org.w3._2001.xml.xsd.SchemaPackage#getFieldType_Xpath()
	 * @model dataType="org.w3._2001.xml.xsd.XpathType" required="true"
	 *        extendedMetaData="kind='attribute' name='xpath'"
	 * @generated
	 */
	String getXpath();

	/**
	 * Sets the value of the '{@link org.w3._2001.xml.xsd.FieldType#getXpath <em>Xpath</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xpath</em>' attribute.
	 * @see #getXpath()
	 * @generated
	 */
	void setXpath(String value);

} // FieldType
