package GenericAnyType.util;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.SourceLocator;
import javax.xml.transform.Templates;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.xml.type.impl.AnyTypeImpl;

import GenericAnyType.GenericAnyTypeFactory;
import GenericAnyType.GenericAttribute;
import GenericAnyType.GenericElement;


public class GenericAnyTypeUtil {
	
	private static GenericAnyTypeFactory anyTypeFactory = GenericAnyTypeFactory.eINSTANCE;

	public static void deSerializeAnyType(EObject root){

		for(EObject o: root.eContents()){
			
			if(o instanceof GenericElement){				
				GenericElement elem = ((GenericElement)o);
				
				//case: if top-level element has no sub-elements -> attributes still have to be created
				if(elem.getElementFeatureMap().size() == 0){
					//Add attibutes for Generic root Element
					for(FeatureMap.Entry attributeFeature: elem.getAttributeFeatureMap()){
						GenericAttribute newAttribute = anyTypeFactory.createGenericAttribute();
						newAttribute.setName(attributeFeature.getEStructuralFeature().getName());
						newAttribute.setValue(attributeFeature.getValue().toString());
						elem.getAttributes().add(newAttribute);
					}
				}
							
				for(FeatureMap.Entry featureEntry: elem.getElementFeatureMap()){
					buildGenericModel(elem,featureEntry);
				}
						
			}
		}
	}
	
	private static void buildGenericModel(GenericElement parentElement, FeatureMap.Entry currentElement){

		//Add attibutes
		for(FeatureMap.Entry attributeFeature: parentElement.getAttributeFeatureMap()){
			GenericAttribute newAttribute = anyTypeFactory.createGenericAttribute();
			newAttribute.setName(attributeFeature.getEStructuralFeature().getName());
			newAttribute.setValue(attributeFeature.getValue().toString());
			parentElement.getAttributes().add(newAttribute);
		}

		//create new Element
		GenericElement newSubElement = anyTypeFactory.createGenericElement();
		parentElement.getNestedElements().add(newSubElement);
		AnyTypeImpl subStructure = (AnyTypeImpl)currentElement.getValue();
		
		newSubElement.setName(currentElement.getEStructuralFeature().getName());
		newSubElement.setValue(subStructure.getMixed().getValue(0).toString().trim());
		
		//recursion for child elements
		for(FeatureMap.Entry subFeature: subStructure.getAny()){	
			buildGenericModel(newSubElement,subFeature);

		}
	}

	
    public static void xsl(String inFilename, String xslFilename) {
        try {
        	
        	String outFilename = inFilename + "_tmp";
        	
            // Create transformer factory
            TransformerFactory factory = TransformerFactory.newInstance();

            // Use the factory to create a template containing the xsl file
            Templates template = factory.newTemplates(new StreamSource(
                new FileInputStream(xslFilename)));

            // Use the template to create a transformer
            Transformer xformer = template.newTransformer();

            FileInputStream fis = new FileInputStream(inFilename);
            
            // Prepare the input and output files
            Source source = new StreamSource(new FileInputStream(inFilename));
            Result result = new StreamResult(new FileOutputStream(outFilename));

            // Apply the xsl file to the source file and write the result to the output file
            xformer.transform(source, result);

            File originalFile = new File(inFilename);
            File tempFile = new File(outFilename);
            
            originalFile.delete();
            copyFile(tempFile,originalFile);
            
            tempFile.delete();
            
            
        } catch (FileNotFoundException e) {
        	System.out.println(e);
        } catch (TransformerConfigurationException e) {
            // An error occurred in the XSL file
        } catch (TransformerException e) {
            // An error occurred while applying the XSL file
            // Get location of error in input file
            SourceLocator locator = e.getLocator();
            int col = locator.getColumnNumber();
            int line = locator.getLineNumber();
            String publicId = locator.getPublicId();
            String systemId = locator.getSystemId();
        } catch (IOException e) {

			e.printStackTrace();
		}
    }
    
    private static void copyFile(File sourceFile, File destFile) throws IOException {
        if(!destFile.exists()) {
            destFile.createNewFile();
        }

        FileChannel source = null;
        FileChannel destination = null;

        try {
            source = new FileInputStream(sourceFile).getChannel();
            destination = new FileOutputStream(destFile).getChannel();
            destination.transferFrom(source, 0, source.size());
        }
        finally {
            if(source != null) {
                source.close();
            }
            if(destination != null) {
                destination.close();
            }
        }
    }
	
}
