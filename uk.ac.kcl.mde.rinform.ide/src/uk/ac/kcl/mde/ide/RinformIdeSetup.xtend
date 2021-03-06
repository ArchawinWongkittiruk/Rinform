/*
 * generated by Xtext 2.20.0
 */
package uk.ac.kcl.mde.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import uk.ac.kcl.mde.RinformRuntimeModule
import uk.ac.kcl.mde.RinformStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class RinformIdeSetup extends RinformStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new RinformRuntimeModule, new RinformIdeModule))
	}
	
}
