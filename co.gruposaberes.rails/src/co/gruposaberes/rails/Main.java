package co.gruposaberes.rails;

import co.gruposaberes.model.ModelParser;

public class Main {
	public static void main(String[] args) {
		ModelParser modelParser = new ModelParser();
		modelParser.setProjectPath("/Users/jairud/rails/saberes/freemium");
		modelParser.parseModels();
		modelParser.saveModel();
	}
}
