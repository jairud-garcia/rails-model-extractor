package co.gruposaberes.rails;

public class Main {
	public static void main(String[] args) {
		Parser parser = new Parser();
		parser.setProjectPath(args[0]);
		parser.parseModel();
		parser.parseSchema();
	}
}