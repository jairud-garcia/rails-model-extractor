/*
 * generated by Xtext 2.10.0
 */
package co.gruposaberes.rails.parser.parser.antlr;

import co.gruposaberes.rails.parser.parser.antlr.internal.InternalModelsParser;
import co.gruposaberes.rails.parser.services.ModelsGrammarAccess;
import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class ModelsParser extends AbstractAntlrParser {

	@Inject
	private ModelsGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_LF", "RULE_CR", "RULE_SPACE", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "RULE_REQUIRE");
	}
	

	@Override
	protected InternalModelsParser createParser(XtextTokenStream stream) {
		return new InternalModelsParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Class";
	}

	public ModelsGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ModelsGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}