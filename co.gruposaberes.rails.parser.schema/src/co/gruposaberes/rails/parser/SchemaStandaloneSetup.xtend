/*
 * generated by Xtext 2.10.0
 */
package co.gruposaberes.rails.parser


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class SchemaStandaloneSetup extends SchemaStandaloneSetupGenerated {

	def static void doSetup() {
		new SchemaStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
