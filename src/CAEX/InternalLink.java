/*******************************************************************************
 * Copyright (c) 2015 Business Informatics Group at TU Wien
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Manuel Wimmer and Emanuel Maetzler
 *******************************************************************************/
/**
 */
package CAEX;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Internal Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CAEX.InternalLink#getRefPartnerSideA <em>Ref Partner Side A</em>}</li>
 *   <li>{@link CAEX.InternalLink#getRefPartnerSideB <em>Ref Partner Side B</em>}</li>
 *   <li>{@link CAEX.InternalLink#getPartnerSideA <em>Partner Side A</em>}</li>
 *   <li>{@link CAEX.InternalLink#getPartnerSideB <em>Partner Side B</em>}</li>
 * </ul>
 *
 * @see CAEX.CAEXPackage#getInternalLink()
 * @model extendedMetaData="name='InternalLink' kind='elementOnly'"
 * @generated
 */
public interface InternalLink extends CAEXObject {
	/**
	 * Returns the value of the '<em><b>Ref Partner Side A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Partner Side A</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Partner Side A</em>' attribute.
	 * @see #setRefPartnerSideA(String)
	 * @see CAEX.CAEXPackage#getInternalLink_RefPartnerSideA()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='RefPartnerSideA' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRefPartnerSideA();

	/**
	 * Sets the value of the '{@link CAEX.InternalLink#getRefPartnerSideA <em>Ref Partner Side A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Partner Side A</em>' attribute.
	 * @see #getRefPartnerSideA()
	 * @generated
	 */
	void setRefPartnerSideA(String value);

	/**
	 * Returns the value of the '<em><b>Ref Partner Side B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Partner Side B</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Partner Side B</em>' attribute.
	 * @see #setRefPartnerSideB(String)
	 * @see CAEX.CAEXPackage#getInternalLink_RefPartnerSideB()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='RefPartnerSideB' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRefPartnerSideB();

	/**
	 * Sets the value of the '{@link CAEX.InternalLink#getRefPartnerSideB <em>Ref Partner Side B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Partner Side B</em>' attribute.
	 * @see #getRefPartnerSideB()
	 * @generated
	 */
	void setRefPartnerSideB(String value);

	/**
	 * Returns the value of the '<em><b>Partner Side A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partner Side A</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partner Side A</em>' reference.
	 * @see #setPartnerSideA(InterfaceClass)
	 * @see CAEX.CAEXPackage#getInternalLink_PartnerSideA()
	 * @model
	 * @generated
	 */
	InterfaceClass getPartnerSideA();

	/**
	 * Sets the value of the '{@link CAEX.InternalLink#getPartnerSideA <em>Partner Side A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partner Side A</em>' reference.
	 * @see #getPartnerSideA()
	 * @generated
	 */
	void setPartnerSideA(InterfaceClass value);

	/**
	 * Returns the value of the '<em><b>Partner Side B</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partner Side B</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partner Side B</em>' reference.
	 * @see #setPartnerSideB(InterfaceClass)
	 * @see CAEX.CAEXPackage#getInternalLink_PartnerSideB()
	 * @model
	 * @generated
	 */
	InterfaceClass getPartnerSideB();

	/**
	 * Sets the value of the '{@link CAEX.InternalLink#getPartnerSideB <em>Partner Side B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partner Side B</em>' reference.
	 * @see #getPartnerSideB()
	 * @generated
	 */
	void setPartnerSideB(InterfaceClass value);

} // InternalLink
