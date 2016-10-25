package co.gruposaberes.model;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import co.gruposaberes.model.railsSchema.Schema;

import com.google.inject.Injector;

public class SchemaParser {
	
	private String projectPath;
	private Schema schema;
	private String name;
	
	public void parseModels(){
		new org.eclipse.emf.mwe.utils.StandaloneSetup().setPlatformUri("../");
		Injector injector = new RailsSchemaStandaloneSetup().createInjectorAndDoEMFRegistration();;
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);	
		
		File f = new File(projectPath+"/db/schema.rb".replace("/",File.separator));
		String[] pathComponents=projectPath.split(File.separator);
		this.name=pathComponents[pathComponents.length-1];
		
		Resource resource = resourceSet.getResource(
			    URI.createURI("file://"+f.getPath()), true);
		schema = (Schema) resource.getContents().get(0);
	}
	
	public String saveModel(){
		String filePath="results/"+this.name+"_schema.xmi";
		 Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
         Map<String, Object> m = reg.getExtensionToFactoryMap();
         m.put("schema", new XMIResourceFactoryImpl());

         ResourceSet resSet = new ResourceSetImpl();

         Resource resource = resSet.createResource(URI
                         .createURI(filePath));
         
         resource.getContents().add(schema);

         try {
        	 resource.save(Collections.EMPTY_MAP);
         } catch (IOException e) {
        	 e.printStackTrace();
         }
		return filePath;
	}


	public void setProjectPath(String projectPath) {
		this.projectPath = projectPath;
	}
}
