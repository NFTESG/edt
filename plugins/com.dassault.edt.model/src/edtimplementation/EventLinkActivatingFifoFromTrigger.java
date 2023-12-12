/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtimplementation;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Link Activating Fifo From Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edtimplementation.EventLinkActivatingFifoFromTrigger#getReceiverFifoSize <em>Receiver Fifo Size</em>}</li>
 *   <li>{@link edtimplementation.EventLinkActivatingFifoFromTrigger#getSender <em>Sender</em>}</li>
 *   <li>{@link edtimplementation.EventLinkActivatingFifoFromTrigger#getReceiver <em>Receiver</em>}</li>
 *   <li>{@link edtimplementation.EventLinkActivatingFifoFromTrigger#getTriggerPeriod <em>Trigger Period</em>}</li>
 * </ul>
 *
 * @see edtimplementation.EdtimplementationPackage#getEventLinkActivatingFifoFromTrigger()
 * @model
 * @generated
 */
public interface EventLinkActivatingFifoFromTrigger extends EventLink {
	/**
	 * Returns the value of the '<em><b>Receiver Fifo Size</b></em>' attribute.
	 * The default value is <code>"8"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receiver Fifo Size</em>' attribute.
	 * @see #isSetReceiverFifoSize()
	 * @see #unsetReceiverFifoSize()
	 * @see #setReceiverFifoSize(BigInteger)
	 * @see edtimplementation.EdtimplementationPackage#getEventLinkActivatingFifoFromTrigger_ReceiverFifoSize()
	 * @model default="8" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger"
	 * @generated
	 */
	BigInteger getReceiverFifoSize();

	/**
	 * Sets the value of the '{@link edtimplementation.EventLinkActivatingFifoFromTrigger#getReceiverFifoSize <em>Receiver Fifo Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receiver Fifo Size</em>' attribute.
	 * @see #isSetReceiverFifoSize()
	 * @see #unsetReceiverFifoSize()
	 * @see #getReceiverFifoSize()
	 * @generated
	 */
	void setReceiverFifoSize(BigInteger value);

	/**
	 * Unsets the value of the '{@link edtimplementation.EventLinkActivatingFifoFromTrigger#getReceiverFifoSize <em>Receiver Fifo Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReceiverFifoSize()
	 * @see #getReceiverFifoSize()
	 * @see #setReceiverFifoSize(BigInteger)
	 * @generated
	 */
	void unsetReceiverFifoSize();

	/**
	 * Returns whether the value of the '{@link edtimplementation.EventLinkActivatingFifoFromTrigger#getReceiverFifoSize <em>Receiver Fifo Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Receiver Fifo Size</em>' attribute is set.
	 * @see #unsetReceiverFifoSize()
	 * @see #getReceiverFifoSize()
	 * @see #setReceiverFifoSize(BigInteger)
	 * @generated
	 */
	boolean isSetReceiverFifoSize();

	/**
	 * Returns the value of the '<em><b>Sender</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sender</em>' reference.
	 * @see #setSender(TriggerSender)
	 * @see edtimplementation.EdtimplementationPackage#getEventLinkActivatingFifoFromTrigger_Sender()
	 * @model required="true"
	 * @generated
	 */
	TriggerSender getSender();

	/**
	 * Sets the value of the '{@link edtimplementation.EventLinkActivatingFifoFromTrigger#getSender <em>Sender</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sender</em>' reference.
	 * @see #getSender()
	 * @generated
	 */
	void setSender(TriggerSender value);

	/**
	 * Returns the value of the '<em><b>Receiver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receiver</em>' reference.
	 * @see #setReceiver(DynamicTriggerEventReceiverInstance)
	 * @see edtimplementation.EdtimplementationPackage#getEventLinkActivatingFifoFromTrigger_Receiver()
	 * @model required="true"
	 * @generated
	 */
	DynamicTriggerEventReceiverInstance getReceiver();

	/**
	 * Sets the value of the '{@link edtimplementation.EventLinkActivatingFifoFromTrigger#getReceiver <em>Receiver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receiver</em>' reference.
	 * @see #getReceiver()
	 * @generated
	 */
	void setReceiver(DynamicTriggerEventReceiverInstance value);

	/**
	 * Returns the value of the '<em><b>Trigger Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger Period</em>' attribute.
	 * @see #setTriggerPeriod(double)
	 * @see edtimplementation.EdtimplementationPackage#getEventLinkActivatingFifoFromTrigger_TriggerPeriod()
	 * @model dataType="technology.ecoa.implementation._2.TimeDuration" required="true"
	 * @generated
	 */
	double getTriggerPeriod();

	/**
	 * Sets the value of the '{@link edtimplementation.EventLinkActivatingFifoFromTrigger#getTriggerPeriod <em>Trigger Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger Period</em>' attribute.
	 * @see #getTriggerPeriod()
	 * @generated
	 */
	void setTriggerPeriod(double value);

} // EventLinkActivatingFifoFromTrigger
