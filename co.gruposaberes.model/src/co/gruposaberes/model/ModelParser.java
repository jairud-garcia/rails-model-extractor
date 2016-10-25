package co.gruposaberes.model;

import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import com.google.inject.Injector;

import co.gruposaberes.model.rails.Application;
import co.gruposaberes.model.rails.RubyClass;
import co.gruposaberes.model.rails.impl.RailsFactoryImpl;

public class ModelParser {
	
	private String projectPath;
	private Application application;
	
	public void parseModels(){
		new org.eclipse.emf.mwe.utils.StandaloneSetup().setPlatformUri("../");
		Injector injector = new RailsStandaloneSetup().createInjectorAndDoEMFRegistration();;
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		application=(RailsFactoryImpl.init().createApplication());
		String[] pathComponents=projectPath.split(File.separator);
		application.setName(pathComponents[pathComponents.length-1]);
		
		File f = new File(projectPath+"/app/models".replace("/",File.separator));
		File[] matchingFiles = f.listFiles(new FilenameFilter() {
			public boolean accept(File dir, String name) {
		        return name.endsWith("rb");
		    }
		});
		for(File file : matchingFiles){
			try{
				Resource resource = resourceSet.getResource(
					    URI.createURI("file://"+file.getPath()), true);
				RubyClass model = (RubyClass) resource.getContents().get(0);
				getApplication().getRubyClasses().add(model);					
				System.out.println("Class: "+model.getName()+ " heredada de "+model.getSuperType());
			}catch(Exception e){
				System.err.println("FILE: "+file.getPath()+": /"+e.getMessage());
			}
		}
	}
	
	public String saveModel(){
		String filePath=this.application.getName()+"_application.xmi";
		 Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
         Map<String, Object> m = reg.getExtensionToFactoryMap();
         m.put("application", new XMIResourceFactoryImpl());

         ResourceSet resSet = new ResourceSetImpl();

         Resource resource = resSet.createResource(URI
                         .createURI(filePath));
         
         resource.getContents().add(application);

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

	public Application getApplication() {
		return application;
	}
}
