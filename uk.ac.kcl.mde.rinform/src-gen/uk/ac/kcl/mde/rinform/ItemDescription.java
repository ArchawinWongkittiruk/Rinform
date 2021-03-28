/**
 * generated by Xtext 2.20.0
 */
package uk.ac.kcl.mde.rinform;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.mde.rinform.ItemDescription#getItemDescription <em>Item Description</em>}</li>
 *   <li>{@link uk.ac.kcl.mde.rinform.ItemDescription#getItem <em>Item</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.mde.rinform.RinformPackage#getItemDescription()
 * @model
 * @generated
 */
public interface ItemDescription extends SentencePart
{
  /**
   * Returns the value of the '<em><b>Item Description</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Item Description</em>' attribute list.
   * @see uk.ac.kcl.mde.rinform.RinformPackage#getItemDescription_ItemDescription()
   * @model unique="false"
   * @generated
   */
  EList<String> getItemDescription();

  /**
   * Returns the value of the '<em><b>Item</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Item</em>' reference.
   * @see #setItem(ItemDeclaration)
   * @see uk.ac.kcl.mde.rinform.RinformPackage#getItemDescription_Item()
   * @model
   * @generated
   */
  ItemDeclaration getItem();

  /**
   * Sets the value of the '{@link uk.ac.kcl.mde.rinform.ItemDescription#getItem <em>Item</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Item</em>' reference.
   * @see #getItem()
   * @generated
   */
  void setItem(ItemDeclaration value);

} // ItemDescription
