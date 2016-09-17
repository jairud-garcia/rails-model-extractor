/*
* generated by Xtext
*/
package co.gruposaberes.model.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import co.gruposaberes.model.services.RailsGrammarAccess;

public class RailsParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private RailsGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected co.gruposaberes.model.parser.antlr.internal.InternalRailsParser createParser(XtextTokenStream stream) {
		return new co.gruposaberes.model.parser.antlr.internal.InternalRailsParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Class";
	}
	
	public RailsGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(RailsGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}