/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtimplementation.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import edtimplementation.DataWriterInstance;
import edtimplementation.EdtimplementationPackage;
import edtimplementation.ModuleOperation;
import edtimplementation.OperationInheritingFromMT;
import edtimplementation.OperationLink;
import edtproject.Steps;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Data
 * Writer Instance</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edtimplementation.impl.DataWriterInstanceImpl#getName <em>Name</em>}</li>
 *   <li>{@link edtimplementation.impl.DataWriterInstanceImpl#getMTOperationRef <em>MT Operation Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataWriterInstanceImpl extends MinimalEObjectImpl.Container implements DataWriterInstance {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMTOperationRef() <em>MT Operation Ref</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMTOperationRef()
	 * @generated
	 * @ordered
	 */
	protected ModuleOperation mtOperationRef;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected DataWriterInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdtimplementationPackage.Literals.DATA_WRITER_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public String getName() {
		if (mtOperationRef != null) {
			name = mtOperationRef.getName();
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtimplementationPackage.DATA_WRITER_INSTANCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModuleOperation getMTOperationRef() {
		if (mtOperationRef != null && mtOperationRef.eIsProxy()) {
			InternalEObject oldMTOperationRef = (InternalEObject)mtOperationRef;
			mtOperationRef = (ModuleOperation)eResolveProxy(oldMTOperationRef);
			if (mtOperationRef != oldMTOperationRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EdtimplementationPackage.DATA_WRITER_INSTANCE__MT_OPERATION_REF, oldMTOperationRef, mtOperationRef));
			}
		}
		return mtOperationRef;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleOperation basicGetMTOperationRef() {
		return mtOperationRef;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMTOperationRef(ModuleOperation newMTOperationRef) {
		ModuleOperation oldMTOperationRef = mtOperationRef;
		mtOperationRef = newMTOperationRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtimplementationPackage.DATA_WRITER_INSTANCE__MT_OPERATION_REF, oldMTOperationRef, mtOperationRef));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EdtimplementationPackage.DATA_WRITER_INSTANCE__NAME:
				return getName();
			case EdtimplementationPackage.DATA_WRITER_INSTANCE__MT_OPERATION_REF:
				if (resolve) return getMTOperationRef();
				return basicGetMTOperationRef();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EdtimplementationPackage.DATA_WRITER_INSTANCE__NAME:
				setName((String)newValue);
				return;
			case EdtimplementationPackage.DATA_WRITER_INSTANCE__MT_OPERATION_REF:
				setMTOperationRef((ModuleOperation)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EdtimplementationPackage.DATA_WRITER_INSTANCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EdtimplementationPackage.DATA_WRITER_INSTANCE__MT_OPERATION_REF:
				setMTOperationRef((ModuleOperation)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EdtimplementationPackage.DATA_WRITER_INSTANCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EdtimplementationPackage.DATA_WRITER_INSTANCE__MT_OPERATION_REF:
				return mtOperationRef != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == OperationInheritingFromMT.class) {
			switch (derivedFeatureID) {
				case EdtimplementationPackage.DATA_WRITER_INSTANCE__MT_OPERATION_REF: return EdtimplementationPackage.OPERATION_INHERITING_FROM_MT__MT_OPERATION_REF;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == OperationInheritingFromMT.class) {
			switch (baseFeatureID) {
				case EdtimplementationPackage.OPERATION_INHERITING_FROM_MT__MT_OPERATION_REF: return EdtimplementationPackage.DATA_WRITER_INSTANCE__MT_OPERATION_REF;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

	@Override
	public String getSimplifiedClassName() {
		return "Data Writer";
	}

	@Override
	public EList<OperationLink> findOperationLink() {
		Steps steps = Steps.findStepsContainer(this);
		EList<OperationLink> operationLink = new BasicEList<>();
		if (steps != null) {
			Collection<Setting> crossReferences = EcoreUtil.UsageCrossReferencer.find(this, steps);
			for (Setting crossReference : crossReferences) {
				if (crossReference.getEObject() instanceof OperationLink component) {
					operationLink.add(component);
				}
			}
		}
		return operationLink;
	}

} // DataWriterInstanceImpl
