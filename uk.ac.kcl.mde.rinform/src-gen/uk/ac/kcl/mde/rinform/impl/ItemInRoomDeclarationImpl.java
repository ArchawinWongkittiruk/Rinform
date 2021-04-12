/**
 * generated by Xtext 2.20.0
 */
package uk.ac.kcl.mde.rinform.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.kcl.mde.rinform.ItemInRoomDeclaration;
import uk.ac.kcl.mde.rinform.RinformPackage;
import uk.ac.kcl.mde.rinform.RoomDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item In Room Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.mde.rinform.impl.ItemInRoomDeclarationImpl#getRoom <em>Room</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ItemInRoomDeclarationImpl extends ItemDeclarationImpl implements ItemInRoomDeclaration
{
  /**
   * The cached value of the '{@link #getRoom() <em>Room</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRoom()
   * @generated
   * @ordered
   */
  protected RoomDeclaration room;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ItemInRoomDeclarationImpl()
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
    return RinformPackage.Literals.ITEM_IN_ROOM_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RoomDeclaration getRoom()
  {
    if (room != null && room.eIsProxy())
    {
      InternalEObject oldRoom = (InternalEObject)room;
      room = (RoomDeclaration)eResolveProxy(oldRoom);
      if (room != oldRoom)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RinformPackage.ITEM_IN_ROOM_DECLARATION__ROOM, oldRoom, room));
      }
    }
    return room;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RoomDeclaration basicGetRoom()
  {
    return room;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRoom(RoomDeclaration newRoom)
  {
    RoomDeclaration oldRoom = room;
    room = newRoom;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RinformPackage.ITEM_IN_ROOM_DECLARATION__ROOM, oldRoom, room));
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
      case RinformPackage.ITEM_IN_ROOM_DECLARATION__ROOM:
        if (resolve) return getRoom();
        return basicGetRoom();
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
      case RinformPackage.ITEM_IN_ROOM_DECLARATION__ROOM:
        setRoom((RoomDeclaration)newValue);
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
      case RinformPackage.ITEM_IN_ROOM_DECLARATION__ROOM:
        setRoom((RoomDeclaration)null);
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
      case RinformPackage.ITEM_IN_ROOM_DECLARATION__ROOM:
        return room != null;
    }
    return super.eIsSet(featureID);
  }

} //ItemInRoomDeclarationImpl