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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Unit Class Lib</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CAEX.SystemUnitClassLib#getSystemUnitClass <em>System Unit Class</em>}</li>
 * </ul>
 *
 * @see CAEX.CAEXPackage#getSystemUnitClassLib()
 * @model extendedMetaData="name='SystemUnitClassLib' kind='elementOnly'"
 * @generated
 */
public interface SystemUnitClassLib extends CAEXObject {
	/**
	 * Returns the value of the '<em><b>System Unit Class</b></em>' containment reference list.
	 * The list contents are of type {@link CAEX.SystemUnitClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Shall be used for SystemUnitClass definition, provides definition of a class of a SystemUnitClass type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System Unit Class</em>' containment reference list.
	 * @see CAEX.CAEXPackage#getSystemUnitClassLib_SystemUnitClass()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SystemUnitClass' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SystemUnitClass> getSystemUnitClass();

} // SystemUnitClassLib
