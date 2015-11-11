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
 * A representation of the model object '<em><b>Interface Family</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines base structures for a hierarchical InterfaceClass tree. The hierarchical structure of an interface library has organizational character only.  
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CAEX.InterfaceFamily#getInterfaceClass <em>Interface Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see CAEX.CAEXPackage#getInterfaceFamily()
 * @model extendedMetaData="name='InterfaceFamilyType' kind='elementOnly'"
 * @generated
 */
public interface InterfaceFamily extends InterfaceClass {
	/**
	 * Returns the value of the '<em><b>Interface Class</b></em>' containment reference list.
	 * The list contents are of type {@link CAEX.InterfaceFamily}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Element that allows definition of child InterfaceClasses within the class hierarchy. The parent child relation between two InterfaceClasses has no semantic.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interface Class</em>' containment reference list.
	 * @see CAEX.CAEXPackage#getInterfaceFamily_InterfaceClass()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='InterfaceClass' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InterfaceFamily> getInterfaceClass();

} // InterfaceFamily
