/**
 * generated by Xtext 2.10.0
 */
package co.gruposaberes.rails.parser;

import co.gruposaberes.rails.parser.ModelsStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class ModelsStandaloneSetup extends ModelsStandaloneSetupGenerated {
  public static void doSetup() {
    ModelsStandaloneSetup _modelsStandaloneSetup = new ModelsStandaloneSetup();
    _modelsStandaloneSetup.createInjectorAndDoEMFRegistration();
  }
}