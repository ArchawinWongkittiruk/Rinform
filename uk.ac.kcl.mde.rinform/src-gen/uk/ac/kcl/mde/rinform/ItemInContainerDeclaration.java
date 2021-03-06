/**
 * generated by Xtext 2.20.0
 */
package uk.ac.kcl.mde.rinform;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item In Container Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.mde.rinform.ItemInContainerDeclaration#getContainer <em>Container</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.mde.rinform.RinformPackage#getItemInContainerDeclaration()
 * @model
 * @generated
 */
public interface ItemInContainerDeclaration extends ItemDeclaration
{
  /**
   * Returns the value of the '<em><b>Container</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Container</em>' reference.
   * @see #setContainer(ContainerDeclaration)
   * @see uk.ac.kcl.mde.rinform.RinformPackage#getItemInContainerDeclaration_Container()
   * @model
   * @generated
   */
  ContainerDeclaration getContainer();

  /**
   * Sets the value of the '{@link uk.ac.kcl.mde.rinform.ItemInContainerDeclaration#getContainer <em>Container</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Container</em>' reference.
   * @see #getContainer()
   * @generated
   */
  void setContainer(ContainerDeclaration value);

} // ItemInContainerDeclaration
