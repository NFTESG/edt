/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.implementation._2.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import technology.ecoa.implementation._2.RequestReceivedType;
import technology.ecoa.implementation._2.impPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Request Received Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.implementation._2.impl.RequestReceivedTypeImpl#getMaxConcurrentRequests <em>Max Concurrent Requests</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequestReceivedTypeImpl extends RequestResponseImpl implements RequestReceivedType {
	/**
	 * The default value of the '{@link #getMaxConcurrentRequests() <em>Max Concurrent Requests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxConcurrentRequests()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MAX_CONCURRENT_REQUESTS_EDEFAULT = new BigInteger("10");

	/**
	 * The cached value of the '{@link #getMaxConcurrentRequests() <em>Max Concurrent Requests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxConcurrentRequests()
	 * @generated
	 * @ordered
	 */
	protected BigInteger maxConcurrentRequests = MAX_CONCURRENT_REQUESTS_EDEFAULT;

	/**
	 * This is true if the Max Concurrent Requests attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxConcurrentRequestsESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequestReceivedTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return impPackage.Literals.REQUEST_RECEIVED_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMaxConcurrentRequests() {
		return maxConcurrentRequests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxConcurrentRequests(BigInteger newMaxConcurrentRequests) {
		BigInteger oldMaxConcurrentRequests = maxConcurrentRequests;
		maxConcurrentRequests = newMaxConcurrentRequests;
		boolean oldMaxConcurrentRequestsESet = maxConcurrentRequestsESet;
		maxConcurrentRequestsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, impPackage.REQUEST_RECEIVED_TYPE__MAX_CONCURRENT_REQUESTS, oldMaxConcurrentRequests, maxConcurrentRequests, !oldMaxConcurrentRequestsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaxConcurrentRequests() {
		BigInteger oldMaxConcurrentRequests = maxConcurrentRequests;
		boolean oldMaxConcurrentRequestsESet = maxConcurrentRequestsESet;
		maxConcurrentRequests = MAX_CONCURRENT_REQUESTS_EDEFAULT;
		maxConcurrentRequestsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, impPackage.REQUEST_RECEIVED_TYPE__MAX_CONCURRENT_REQUESTS, oldMaxConcurrentRequests, MAX_CONCURRENT_REQUESTS_EDEFAULT, oldMaxConcurrentRequestsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaxConcurrentRequests() {
		return maxConcurrentRequestsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case impPackage.REQUEST_RECEIVED_TYPE__MAX_CONCURRENT_REQUESTS:
				return getMaxConcurrentRequests();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case impPackage.REQUEST_RECEIVED_TYPE__MAX_CONCURRENT_REQUESTS:
				setMaxConcurrentRequests((BigInteger)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case impPackage.REQUEST_RECEIVED_TYPE__MAX_CONCURRENT_REQUESTS:
				unsetMaxConcurrentRequests();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case impPackage.REQUEST_RECEIVED_TYPE__MAX_CONCURRENT_REQUESTS:
				return isSetMaxConcurrentRequests();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (maxConcurrentRequests: ");
		if (maxConcurrentRequestsESet) result.append(maxConcurrentRequests); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //RequestReceivedTypeImpl
