package co.gruposaberes.rails.eclipse;

import info.debatty.java.stringsimilarity.Levenshtein;
import org.atteo.evo.inflector.English;

public class StringTool {
	private Levenshtein levenshtein;
	
	public StringTool(){
		this.levenshtein=new Levenshtein();
	}
	
	public String pluralize(String text){
		return English.plural(text);
	}
	
	public double distance(String text1, String text2){
		return this.levenshtein.distance(text1, text2);
	}

}
