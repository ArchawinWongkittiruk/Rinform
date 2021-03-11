/*
 * generated by Xtext 2.20.0
 */
package uk.ac.kcl.mde.ui;

import com.google.inject.Injector;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import uk.ac.kcl.mde.rinform.ui.internal.RinformActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class RinformExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(RinformActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		RinformActivator activator = RinformActivator.getInstance();
		return activator != null ? activator.getInjector(RinformActivator.UK_AC_KCL_MDE_RINFORM) : null;
	}

}
