/*
 * generated by Xtext 2.10.0
 */
package co.gruposaberes.rails.parser


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class ModelsStandaloneSetup extends ModelsStandaloneSetupGenerated {

	def static void doSetup() {
		new ModelsStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
