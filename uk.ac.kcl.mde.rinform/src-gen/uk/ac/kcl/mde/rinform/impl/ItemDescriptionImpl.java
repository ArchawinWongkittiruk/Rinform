/**
 * generated by Xtext 2.20.0
 */
package uk.ac.kcl.mde.rinform.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import uk.ac.kcl.mde.rinform.ItemDeclaration;
import uk.ac.kcl.mde.rinform.ItemDescription;
import uk.ac.kcl.mde.rinform.RinformPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.mde.rinform.impl.ItemDescriptionImpl#getItem <em>Item</em>}</li>
 *   <li>{@link uk.ac.kcl.mde.rinform.impl.ItemDescriptionImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ItemDescriptionImpl extends SentencePartImpl implements ItemDescription
{
  /**
   * The cached value of the '{@link #getItem() <em>Item</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getItem()
   * @generated
   * @ordered
   */
  protected ItemDeclaration item;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected EList<String> description;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ItemDescriptionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return RinformPackage.Literals.ITEM_DESCRIPTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ItemDeclaration getItem()
  {
    if (item != null && item.eIsProxy())
    {
      InternalEObject oldItem = (InternalEObject)item;
      item = (ItemDeclaration)eResolveProxy(oldItem);
      if (item != oldItem)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RinformPackage.ITEM_DESCRIPTION__ITEM, oldItem, item));
      }
    }
    return item;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ItemDeclaration basicGetItem()
  {
    return item;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setItem(ItemDeclaration newItem)
  {
    ItemDeclaration oldItem = item;
    item = newItem;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RinformPackage.ITEM_DESCRIPTION__ITEM, oldItem, item));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getDescription()
  {
    if (description == null)
    {
      description = new EDataTypeEList<String>(String.class, this, RinformPackage.ITEM_DESCRIPTION__DESCRIPTION);
    }
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case RinformPackage.ITEM_DESCRIPTION__ITEM:
        if (resolve) return getItem();
        return basicGetItem();
      case RinformPackage.ITEM_DESCRIPTION__DESCRIPTION:
        return getDescription();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RinformPackage.ITEM_DESCRIPTION__ITEM:
        setItem((ItemDeclaration)newValue);
        return;
      case RinformPackage.ITEM_DESCRIPTION__DESCRIPTION:
        getDescription().clear();
        getDescription().addAll((Collection<? extends String>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case RinformPackage.ITEM_DESCRIPTION__ITEM:
        setItem((ItemDeclaration)null);
        return;
      case RinformPackage.ITEM_DESCRIPTION__DESCRIPTION:
        getDescription().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case RinformPackage.ITEM_DESCRIPTION__ITEM:
        return item != null;
      case RinformPackage.ITEM_DESCRIPTION__DESCRIPTION:
        return description != null && !description.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (description: ");
    result.append(description);
    result.append(')');
    return result.toString();
  }

} //ItemDescriptionImpl
