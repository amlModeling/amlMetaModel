package CAEX.util;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMLResource;

import CAEX.CAEXFile;
import CAEX.CAEXPackage;
import CAEX.DocumentRoot;
import GenericAnyType.util.GenericAnyTypeUtil;

/*******************************************************************************
 * Copyright (c) 2014, 2015 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Alexander Bergmayr - initial API and implementation
 *
 *******************************************************************************/


public class CaexSerializer {
	
	public void writeXML(Resource xmiResource, String xmlFile) throws Exception {		
		// create the resource set and register the metamodel packages		
	
		xmiResource.getResourceSet().getPackageRegistry().put(CAEXPackage.eINSTANCE.getNsURI(), CAEXPackage.eINSTANCE);
		
		final ExtendedMetaData extendedMetaData = new BasicExtendedMetaData(xmiResource.getResourceSet().getPackageRegistry());
		// put metadata options
		Map<Object,Object> options = new HashMap<Object,Object>();
		options.put(XMLResource.OPTION_EXTENDED_META_DATA, extendedMetaData);
		
		URI xmlURI = URI.createFileURI(new File(xmlFile).getAbsolutePath());
		CAEXResourceImpl caexResource = new CAEXResourceImpl(xmiResource.getURI());
		
		caexResource.getContents().add(EcoreUtil.copy(xmiResource.getContents().get(0)));
		caexResource.setURI(xmlURI);
		caexResource.save(options);
		
		GenericAnyTypeUtil.xsl(xmlFile, "trafo/postAnyTypeTrafo.xslt");
		
	}
	
	public void writeXMI(File xmlFile, ResourceSet resourceSet, String modelFile) throws IOException {
		FileInputStream stream = new FileInputStream(xmlFile);
		
		CAEXXMLProcessor processor = new CAEXXMLProcessor();
		
		final ExtendedMetaData extendedMetaData = new BasicExtendedMetaData(processor.getEPackageRegistry());
		// put metadata options
		Map<Object,Object> options = new HashMap<Object,Object>();
		options.put(XMLResource.OPTION_EXTENDED_META_DATA, extendedMetaData);
		
		Resource amlResource = processor.load(stream, options);
		CAEXFile caexFile = (CAEXFile) amlResource.getContents().get(0).eContents().get(0);
		
		URI modelURI = URI.createFileURI(new File(modelFile).getAbsolutePath());
		Resource xmiResource = resourceSet.createResource(modelURI);

		GenericAnyTypeUtil.deSerializeAnyType(caexFile);
		
		xmiResource.getContents().add(EcoreUtil.copy(caexFile));
		xmiResource.save(null);
	}

}
