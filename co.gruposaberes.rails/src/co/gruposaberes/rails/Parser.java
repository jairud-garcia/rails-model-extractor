package co.gruposaberes.rails;

import co.gruposaberes.model.ModelParser;
import co.gruposaberes.model.SchemaParser;

public class Parser {
	
	private String projectPath;

	public String parseModel(){
		ModelParser modelParser = new ModelParser();
		modelParser.setProjectPath(projectPath);
		modelParser.parseModels();
		return modelParser.saveModel();
	}
	
	public String parseSchema(){
		SchemaParser schemaParser = new SchemaParser();
		schemaParser.setProjectPath(projectPath);
		schemaParser.parseModels();
		return schemaParser.saveModel();
	}

	public void setProjectPath(String projectPath) {
		this.projectPath = projectPath;
	}

}
