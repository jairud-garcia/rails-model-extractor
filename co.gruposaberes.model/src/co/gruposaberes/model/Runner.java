package co.gruposaberes.model;

import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.emf.ecore.resource.Resource;

import java.io.File;
import java.io.FilenameFilter;

import org.eclipse.emf.common.util.URI;
import com.google.inject.Injector;

//import co.gruposaberes.model.rails.Application;
import co.gruposaberes.model.rails.RubyClass;
import co.gruposaberes.model.rails.impl.RailsFactoryImpl;

public class Runner {

	public static void main(String[] args) {
		new org.eclipse.emf.mwe.utils.StandaloneSetup().setPlatformUri("../");
		Injector injector = new RailsStandaloneSetup().createInjectorAndDoEMFRegistration();;
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		//Application application = RailsFactoryImpl.init().createApplication();
		
		
		
		File[] projectDirectories = (new File("/Users/jairud/rails/saberes")).listFiles(new FilenameFilter() {
		    public boolean accept(File dir, String name) {
		        return new File(dir, name).isDirectory();
		    }
		});
		int index = 0;
		
		for(File projectDirectory : projectDirectories){
			System.out.println("PROJECT: "+projectDirectory.getName());
			File f = new File(projectDirectory.getPath()+"/app/models");
			File[] matchingFiles = f.listFiles(new FilenameFilter() {
				public boolean accept(File dir, String name) {
			        return name.endsWith("rb");
			    }
			});
			for(File file : matchingFiles){
				index++;
				try{
					Resource resource = resourceSet.getResource(
						    URI.createURI("file://"+file.getPath()), true);
					RubyClass model = (RubyClass) resource.getContents().get(0);
					//application.getRubyClasses().add(model);					
					//debug
					System.out.println("Class: "+model.getName()+ " heredada de "+model.getSuperType());
				}catch(Exception e){
					 System.err.println("FILE: "+file.getPath()+": /"+e.getMessage());
				}
			}

		}
		System.out.println("Processed "+index);
	}
}
