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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nominal Scaled</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CAEX.NominalScaled#getRequiredValue <em>Required Value</em>}</li>
 * </ul>
 *
 * @see CAEX.CAEXPackage#getNominalScaled()
 * @model extendedMetaData="name='NominalScaledType' kind='elementOnly'"
 * @generated
 */
public interface NominalScaled extends EObject {
	/**
	 * Returns the value of the '<em><b>Required Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Element to define a required value of an attribute. It may be defined multiple times in order to define a discrete value range of the attribute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Required Value</em>' attribute.
	 * @see #setRequiredValue(String)
	 * @see CAEX.CAEXPackage#getNominalScaled_RequiredValue()
	 * @model extendedMetaData="kind='element' name='RequiredValue' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRequiredValue();

	/**
	 * Sets the value of the '{@link CAEX.NominalScaled#getRequiredValue <em>Required Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Value</em>' attribute.
	 * @see #getRequiredValue()
	 * @generated
	 */
	void setRequiredValue(String value);

} // NominalScaled
