/**
 * generated by Xtext 2.11.0
 */
package uk.ac.kcl.mde.rinform.ui.labeling;

import com.google.inject.Inject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;

/**
 * Provides labels for EObjects.
 * 
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#label-provider
 */
@SuppressWarnings("all")
public class RInformLabelProvider extends DefaultEObjectLabelProvider {
  @Inject
  public RInformLabelProvider(final AdapterFactoryLabelProvider delegate) {
    super(delegate);
  }
}
