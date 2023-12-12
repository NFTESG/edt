/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.insertion.policy._2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modules Dependencies</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.insertion.policy._2.ModulesDependencies#getModuleDependencies <em>Module Dependencies</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.insertion.policy._2.polPackage#getModulesDependencies()
 * @model extendedMetaData="name='ModulesDependencies' kind='elementOnly'"
 * @generated
 */
public interface ModulesDependencies extends EObject {
	/**
	 * Returns the value of the '<em><b>Module Dependencies</b></em>' containment reference list.
	 * The list contents are of type {@link technology.ecoa.insertion.policy._2.ModuleDependencies}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Module dependencies entry
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Module Dependencies</em>' containment reference list.
	 * @see technology.ecoa.insertion.policy._2.polPackage#getModulesDependencies_ModuleDependencies()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='moduleDependencies' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ModuleDependencies> getModuleDependencies();

} // ModulesDependencies
