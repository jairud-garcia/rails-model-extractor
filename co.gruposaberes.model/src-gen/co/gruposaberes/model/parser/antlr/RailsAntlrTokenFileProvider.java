/*
* generated by Xtext
*/
package co.gruposaberes.model.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class RailsAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("co/gruposaberes/model/parser/antlr/internal/InternalRails.tokens");
	}
}