/*
 * generated by Xtext
 */
package co.gruposaberes.model.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractRailsValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(co.gruposaberes.model.rails.RailsPackage.eINSTANCE);
		return result;
	}
}
