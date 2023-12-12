/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package org.w3._2001.xml.xsd;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3._2001.xml.xsd.SchemaType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.w3._2001.xml.xsd.SchemaType#getInclude <em>Include</em>}</li>
 *   <li>{@link org.w3._2001.xml.xsd.SchemaType#getImport <em>Import</em>}</li>
 *   <li>{@link org.w3._2001.xml.xsd.SchemaType#getRedefine <em>Redefine</em>}</li>
 *   <li>{@link org.w3._2001.xml.xsd.SchemaType#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.w3._2001.xml.xsd.SchemaType#getGroup1 <em>Group1</em>}</li>
 *   <li>{@link org.w3._2001.xml.xsd.SchemaType#getSimpleType <em>Simple Type</em>}</li>
 *   <li>{@link org.w3._2001.xml.xsd.SchemaType#getComplexType <em>Complex Type</em>}</li>
 *   <li>{@link org.w3._2001.xml.xsd.SchemaType#getGroup2 <em>Group2</em>}</li>
 *   <li>{@link org.w3._2001.xml.xsd.SchemaType#getAttributeGroup <em>Attribute Group</em>}</li>
 *   <li>{@link org.w3._2001.xml.xsd.SchemaType#getElement <em>Element</em>}</li>
 *   <li>{@link org.w3._2001.xml.xsd.SchemaType#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.w3._2001.xml.xsd.SchemaType#getNotation <em>Notation</em>}</li>
 *   <li>{@link org.w3._2001.xml.xsd.SchemaType#getAnnotation1 <em>Annotation1</em>}</li>
 *   <li>{@link org.w3._2001.xml.xsd.SchemaType#getAttributeFormDefault <em>Attribute Form Default</em>}</li>
 *   <li>{@link org.w3._2001.xml.xsd.SchemaType#getBlockDefault <em>Block Default</em>}</li>
 *   <li>{@link org.w3._2001.xml.xsd.SchemaType#getElementFormDefault <em>Element Form Default</em>}</li>
 *   <li>{@link org.w3._2001.xml.xsd.SchemaType#getFinalDefault <em>Final Default</em>}</li>
 *   <li>{@link org.w3._2001.xml.xsd.SchemaType#getId <em>Id</em>}</li>
 *   <li>{@link org.w3._2001.xml.xsd.SchemaType#getTargetNamespace <em>Target Namespace</em>}</li>
 *   <li>{@link org.w3._2001.xml.xsd.SchemaType#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see org.w3._2001.xml.xsd.SchemaPackage#getSchemaType()
 * @model extendedMetaData="name='schema_._type' kind='elementOnly'"
 * @generated
 */
public interface SchemaType extends OpenAttrs {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.w3._2001.xml.xsd.SchemaPackage#getSchemaType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:1'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Include</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._2001.xml.xsd.IncludeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include</em>' containment reference list.
	 * @see org.w3._2001.xml.xsd.SchemaPackage#getSchemaType_Include()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='include' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<IncludeType> getInclude();

	/**
	 * Returns the value of the '<em><b>Import</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._2001.xml.xsd.ImportType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Import</em>' containment reference list.
	 * @see org.w3._2001.xml.xsd.SchemaPackage#getSchemaType_Import()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='import' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<ImportType> getImport();

	/**
	 * Returns the value of the '<em><b>Redefine</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._2001.xml.xsd.RedefineType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Redefine</em>' containment reference list.
	 * @see org.w3._2001.xml.xsd.SchemaPackage#getSchemaType_Redefine()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='redefine' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<RedefineType> getRedefine();

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._2001.xml.xsd.AnnotationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference list.
	 * @see org.w3._2001.xml.xsd.SchemaPackage#getSchemaType_Annotation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='annotation' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<AnnotationType> getAnnotation();

	/**
	 * Returns the value of the '<em><b>Group1</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group1</em>' attribute list.
	 * @see org.w3._2001.xml.xsd.SchemaPackage#getSchemaType_Group1()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:6'"
	 * @generated
	 */
	FeatureMap getGroup1();

	/**
	 * Returns the value of the '<em><b>Simple Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._2001.xml.xsd.TopLevelSimpleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Simple Type</em>' containment reference list.
	 * @see org.w3._2001.xml.xsd.SchemaPackage#getSchemaType_SimpleType()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='simpleType' namespace='##targetNamespace' group='#group:6'"
	 * @generated
	 */
	EList<TopLevelSimpleType> getSimpleType();

	/**
	 * Returns the value of the '<em><b>Complex Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._2001.xml.xsd.TopLevelComplexType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Complex Type</em>' containment reference list.
	 * @see org.w3._2001.xml.xsd.SchemaPackage#getSchemaType_ComplexType()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='complexType' namespace='##targetNamespace' group='#group:6'"
	 * @generated
	 */
	EList<TopLevelComplexType> getComplexType();

	/**
	 * Returns the value of the '<em><b>Group2</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._2001.xml.xsd.NamedGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group2</em>' containment reference list.
	 * @see org.w3._2001.xml.xsd.SchemaPackage#getSchemaType_Group2()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='group' namespace='##targetNamespace' group='#group:6'"
	 * @generated
	 */
	EList<NamedGroup> getGroup2();

	/**
	 * Returns the value of the '<em><b>Attribute Group</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._2001.xml.xsd.NamedAttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attribute Group</em>' containment reference list.
	 * @see org.w3._2001.xml.xsd.SchemaPackage#getSchemaType_AttributeGroup()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='attributeGroup' namespace='##targetNamespace' group='#group:6'"
	 * @generated
	 */
	EList<NamedAttributeGroup> getAttributeGroup();

	/**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._2001.xml.xsd.TopLevelElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Element</em>' containment reference list.
	 * @see org.w3._2001.xml.xsd.SchemaPackage#getSchemaType_Element()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='element' namespace='##targetNamespace' group='#group:6'"
	 * @generated
	 */
	EList<TopLevelElement> getElement();

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._2001.xml.xsd.TopLevelAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attribute</em>' containment reference list.
	 * @see org.w3._2001.xml.xsd.SchemaPackage#getSchemaType_Attribute()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='attribute' namespace='##targetNamespace' group='#group:6'"
	 * @generated
	 */
	EList<TopLevelAttribute> getAttribute();

	/**
	 * Returns the value of the '<em><b>Notation</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._2001.xml.xsd.NotationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Notation</em>' containment reference list.
	 * @see org.w3._2001.xml.xsd.SchemaPackage#getSchemaType_Notation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='notation' namespace='##targetNamespace' group='#group:6'"
	 * @generated
	 */
	EList<NotationType> getNotation();

	/**
	 * Returns the value of the '<em><b>Annotation1</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._2001.xml.xsd.AnnotationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annotation1</em>' containment reference list.
	 * @see org.w3._2001.xml.xsd.SchemaPackage#getSchemaType_Annotation1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='annotation' namespace='##targetNamespace' group='#group:6'"
	 * @generated
	 */
	EList<AnnotationType> getAnnotation1();

	/**
	 * Returns the value of the '<em><b>Attribute Form Default</b></em>' attribute.
	 * The default value is <code>"unqualified"</code>.
	 * The literals are from the enumeration {@link org.w3._2001.xml.xsd.FormChoice}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Form Default</em>' attribute.
	 * @see org.w3._2001.xml.xsd.FormChoice
	 * @see #isSetAttributeFormDefault()
	 * @see #unsetAttributeFormDefault()
	 * @see #setAttributeFormDefault(FormChoice)
	 * @see org.w3._2001.xml.xsd.SchemaPackage#getSchemaType_AttributeFormDefault()
	 * @model default="unqualified" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='attributeFormDefault'"
	 * @generated
	 */
	FormChoice getAttributeFormDefault();

	/**
	 * Sets the value of the '{@link org.w3._2001.xml.xsd.SchemaType#getAttributeFormDefault <em>Attribute Form Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Form Default</em>' attribute.
	 * @see org.w3._2001.xml.xsd.FormChoice
	 * @see #isSetAttributeFormDefault()
	 * @see #unsetAttributeFormDefault()
	 * @see #getAttributeFormDefault()
	 * @generated
	 */
	void setAttributeFormDefault(FormChoice value);

	/**
	 * Unsets the value of the '{@link org.w3._2001.xml.xsd.SchemaType#getAttributeFormDefault <em>Attribute Form Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAttributeFormDefault()
	 * @see #getAttributeFormDefault()
	 * @see #setAttributeFormDefault(FormChoice)
	 * @generated
	 */
	void unsetAttributeFormDefault();

	/**
	 * Returns whether the value of the '{@link org.w3._2001.xml.xsd.SchemaType#getAttributeFormDefault <em>Attribute Form Default</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Attribute Form Default</em>' attribute is set.
	 * @see #unsetAttributeFormDefault()
	 * @see #getAttributeFormDefault()
	 * @see #setAttributeFormDefault(FormChoice)
	 * @generated
	 */
	boolean isSetAttributeFormDefault();

	/**
	 * Returns the value of the '<em><b>Block Default</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block Default</em>' attribute.
	 * @see #isSetBlockDefault()
	 * @see #unsetBlockDefault()
	 * @see #setBlockDefault(Object)
	 * @see org.w3._2001.xml.xsd.SchemaPackage#getSchemaType_BlockDefault()
	 * @model default="" unsettable="true" dataType="org.w3._2001.xml.xsd.BlockSet"
	 *        extendedMetaData="kind='attribute' name='blockDefault'"
	 * @generated
	 */
	Object getBlockDefault();

	/**
	 * Sets the value of the '{@link org.w3._2001.xml.xsd.SchemaType#getBlockDefault <em>Block Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block Default</em>' attribute.
	 * @see #isSetBlockDefault()
	 * @see #unsetBlockDefault()
	 * @see #getBlockDefault()
	 * @generated
	 */
	void setBlockDefault(Object value);

	/**
	 * Unsets the value of the '{@link org.w3._2001.xml.xsd.SchemaType#getBlockDefault <em>Block Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBlockDefault()
	 * @see #getBlockDefault()
	 * @see #setBlockDefault(Object)
	 * @generated
	 */
	void unsetBlockDefault();

	/**
	 * Returns whether the value of the '{@link org.w3._2001.xml.xsd.SchemaType#getBlockDefault <em>Block Default</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Block Default</em>' attribute is set.
	 * @see #unsetBlockDefault()
	 * @see #getBlockDefault()
	 * @see #setBlockDefault(Object)
	 * @generated
	 */
	boolean isSetBlockDefault();

	/**
	 * Returns the value of the '<em><b>Element Form Default</b></em>' attribute.
	 * The default value is <code>"unqualified"</code>.
	 * The literals are from the enumeration {@link org.w3._2001.xml.xsd.FormChoice}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Form Default</em>' attribute.
	 * @see org.w3._2001.xml.xsd.FormChoice
	 * @see #isSetElementFormDefault()
	 * @see #unsetElementFormDefault()
	 * @see #setElementFormDefault(FormChoice)
	 * @see org.w3._2001.xml.xsd.SchemaPackage#getSchemaType_ElementFormDefault()
	 * @model default="unqualified" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='elementFormDefault'"
	 * @generated
	 */
	FormChoice getElementFormDefault();

	/**
	 * Sets the value of the '{@link org.w3._2001.xml.xsd.SchemaType#getElementFormDefault <em>Element Form Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Form Default</em>' attribute.
	 * @see org.w3._2001.xml.xsd.FormChoice
	 * @see #isSetElementFormDefault()
	 * @see #unsetElementFormDefault()
	 * @see #getElementFormDefault()
	 * @generated
	 */
	void setElementFormDefault(FormChoice value);

	/**
	 * Unsets the value of the '{@link org.w3._2001.xml.xsd.SchemaType#getElementFormDefault <em>Element Form Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetElementFormDefault()
	 * @see #getElementFormDefault()
	 * @see #setElementFormDefault(FormChoice)
	 * @generated
	 */
	void unsetElementFormDefault();

	/**
	 * Returns whether the value of the '{@link org.w3._2001.xml.xsd.SchemaType#getElementFormDefault <em>Element Form Default</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Element Form Default</em>' attribute is set.
	 * @see #unsetElementFormDefault()
	 * @see #getElementFormDefault()
	 * @see #setElementFormDefault(FormChoice)
	 * @generated
	 */
	boolean isSetElementFormDefault();

	/**
	 * Returns the value of the '<em><b>Final Default</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final Default</em>' attribute.
	 * @see #isSetFinalDefault()
	 * @see #unsetFinalDefault()
	 * @see #setFinalDefault(Object)
	 * @see org.w3._2001.xml.xsd.SchemaPackage#getSchemaType_FinalDefault()
	 * @model default="" unsettable="true" dataType="org.w3._2001.xml.xsd.FullDerivationSet"
	 *        extendedMetaData="kind='attribute' name='finalDefault'"
	 * @generated
	 */
	Object getFinalDefault();

	/**
	 * Sets the value of the '{@link org.w3._2001.xml.xsd.SchemaType#getFinalDefault <em>Final Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final Default</em>' attribute.
	 * @see #isSetFinalDefault()
	 * @see #unsetFinalDefault()
	 * @see #getFinalDefault()
	 * @generated
	 */
	void setFinalDefault(Object value);

	/**
	 * Unsets the value of the '{@link org.w3._2001.xml.xsd.SchemaType#getFinalDefault <em>Final Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFinalDefault()
	 * @see #getFinalDefault()
	 * @see #setFinalDefault(Object)
	 * @generated
	 */
	void unsetFinalDefault();

	/**
	 * Returns whether the value of the '{@link org.w3._2001.xml.xsd.SchemaType#getFinalDefault <em>Final Default</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Final Default</em>' attribute is set.
	 * @see #unsetFinalDefault()
	 * @see #getFinalDefault()
	 * @see #setFinalDefault(Object)
	 * @generated
	 */
	boolean isSetFinalDefault();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.w3._2001.xml.xsd.SchemaPackage#getSchemaType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.w3._2001.xml.xsd.SchemaType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Namespace</em>' attribute.
	 * @see #setTargetNamespace(String)
	 * @see org.w3._2001.xml.xsd.SchemaPackage#getSchemaType_TargetNamespace()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='targetNamespace'"
	 * @generated
	 */
	String getTargetNamespace();

	/**
	 * Sets the value of the '{@link org.w3._2001.xml.xsd.SchemaType#getTargetNamespace <em>Target Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Namespace</em>' attribute.
	 * @see #getTargetNamespace()
	 * @generated
	 */
	void setTargetNamespace(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.w3._2001.xml.xsd.SchemaPackage#getSchemaType_Version()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Token"
	 *        extendedMetaData="kind='attribute' name='version'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.w3._2001.xml.xsd.SchemaType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // SchemaType
