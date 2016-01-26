/**
 */
package GenericAnyType.util;

import GenericAnyType.GenericAnyTypePackage;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GenericAnyTypeXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericAnyTypeXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		GenericAnyTypePackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the GenericAnyTypeResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new GenericAnyTypeResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new GenericAnyTypeResourceFactoryImpl());
		}
		return registrations;
	}

} //GenericAnyTypeXMLProcessor
