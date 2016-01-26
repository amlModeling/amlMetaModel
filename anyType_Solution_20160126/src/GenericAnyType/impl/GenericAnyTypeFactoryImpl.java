/**
 */
package GenericAnyType.impl;

import GenericAnyType.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GenericAnyTypeFactoryImpl extends EFactoryImpl implements GenericAnyTypeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GenericAnyTypeFactory init() {
		try {
			GenericAnyTypeFactory theGenericAnyTypeFactory = (GenericAnyTypeFactory)EPackage.Registry.INSTANCE.getEFactory(GenericAnyTypePackage.eNS_URI);
			if (theGenericAnyTypeFactory != null) {
				return theGenericAnyTypeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GenericAnyTypeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericAnyTypeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GenericAnyTypePackage.GENERIC_ELEMENT: return createGenericElement();
			case GenericAnyTypePackage.GENERIC_ATTRIBUTE: return createGenericAttribute();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericElement createGenericElement() {
		GenericElementImpl genericElement = new GenericElementImpl();
		return genericElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericAttribute createGenericAttribute() {
		GenericAttributeImpl genericAttribute = new GenericAttributeImpl();
		return genericAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericAnyTypePackage getGenericAnyTypePackage() {
		return (GenericAnyTypePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GenericAnyTypePackage getPackage() {
		return GenericAnyTypePackage.eINSTANCE;
	}

} //GenericAnyTypeFactoryImpl
