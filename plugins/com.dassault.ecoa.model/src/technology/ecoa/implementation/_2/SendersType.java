/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.implementation._2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Senders Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.implementation._2.SendersType#getGroup <em>Group</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.SendersType#getService <em>Service</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.SendersType#getReference <em>Reference</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.SendersType#getModuleInstance <em>Module Instance</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.SendersType#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.SendersType#getDynamicTrigger <em>Dynamic Trigger</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.SendersType#getExternal <em>External</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.implementation._2.impPackage#getSendersType()
 * @model extendedMetaData="name='senders_._type' kind='elementOnly'"
 * @generated
 */
public interface SendersType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see technology.ecoa.implementation._2.impPackage#getSendersType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Service</b></em>' containment reference list.
	 * The list contents are of type {@link technology.ecoa.implementation._2.OpRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' containment reference list.
	 * @see technology.ecoa.implementation._2.impPackage#getSendersType_Service()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='service' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<OpRef> getService();

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' containment reference list.
	 * The list contents are of type {@link technology.ecoa.implementation._2.OpRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' containment reference list.
	 * @see technology.ecoa.implementation._2.impPackage#getSendersType_Reference()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='reference' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<OpRef> getReference();

	/**
	 * Returns the value of the '<em><b>Module Instance</b></em>' containment reference list.
	 * The list contents are of type {@link technology.ecoa.implementation._2.OpRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module Instance</em>' containment reference list.
	 * @see technology.ecoa.implementation._2.impPackage#getSendersType_ModuleInstance()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='moduleInstance' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<OpRef> getModuleInstance();

	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' containment reference list.
	 * The list contents are of type {@link technology.ecoa.implementation._2.OpRefTrigger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger</em>' containment reference list.
	 * @see technology.ecoa.implementation._2.impPackage#getSendersType_Trigger()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='trigger' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<OpRefTrigger> getTrigger();

	/**
	 * Returns the value of the '<em><b>Dynamic Trigger</b></em>' containment reference list.
	 * The list contents are of type {@link technology.ecoa.implementation._2.OpRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dynamic Trigger</em>' containment reference list.
	 * @see technology.ecoa.implementation._2.impPackage#getSendersType_DynamicTrigger()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dynamicTrigger' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<OpRef> getDynamicTrigger();

	/**
	 * Returns the value of the '<em><b>External</b></em>' containment reference list.
	 * The list contents are of type {@link technology.ecoa.implementation._2.OpRefExternal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External</em>' containment reference list.
	 * @see technology.ecoa.implementation._2.impPackage#getSendersType_External()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='external' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<OpRefExternal> getExternal();

} // SendersType
