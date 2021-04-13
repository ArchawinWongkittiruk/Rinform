/**
 * generated by Xtext 2.20.0
 */
package uk.ac.kcl.mde.rinform.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.kcl.mde.rinform.ItemInContainerDeclaration;
import uk.ac.kcl.mde.rinform.ItemInRoomDeclaration;
import uk.ac.kcl.mde.rinform.RinformPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item In Container Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.mde.rinform.impl.ItemInContainerDeclarationImpl#getContainer <em>Container</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ItemInContainerDeclarationImpl extends ItemDeclarationImpl implements ItemInContainerDeclaration
{
  /**
   * The cached value of the '{@link #getContainer() <em>Container</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContainer()
   * @generated
   * @ordered
   */
  protected ItemInRoomDeclaration container;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ItemInContainerDeclarationImpl()
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
    return RinformPackage.Literals.ITEM_IN_CONTAINER_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ItemInRoomDeclaration getContainer()
  {
    if (container != null && container.eIsProxy())
    {
      InternalEObject oldContainer = (InternalEObject)container;
      container = (ItemInRoomDeclaration)eResolveProxy(oldContainer);
      if (container != oldContainer)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RinformPackage.ITEM_IN_CONTAINER_DECLARATION__CONTAINER, oldContainer, container));
      }
    }
    return container;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ItemInRoomDeclaration basicGetContainer()
  {
    return container;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setContainer(ItemInRoomDeclaration newContainer)
  {
    ItemInRoomDeclaration oldContainer = container;
    container = newContainer;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RinformPackage.ITEM_IN_CONTAINER_DECLARATION__CONTAINER, oldContainer, container));
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
      case RinformPackage.ITEM_IN_CONTAINER_DECLARATION__CONTAINER:
        if (resolve) return getContainer();
        return basicGetContainer();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RinformPackage.ITEM_IN_CONTAINER_DECLARATION__CONTAINER:
        setContainer((ItemInRoomDeclaration)newValue);
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
      case RinformPackage.ITEM_IN_CONTAINER_DECLARATION__CONTAINER:
        setContainer((ItemInRoomDeclaration)null);
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
      case RinformPackage.ITEM_IN_CONTAINER_DECLARATION__CONTAINER:
        return container != null;
    }
    return super.eIsSet(featureID);
  }

} //ItemInContainerDeclarationImpl
