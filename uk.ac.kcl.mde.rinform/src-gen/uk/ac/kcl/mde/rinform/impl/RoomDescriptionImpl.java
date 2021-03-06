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

import uk.ac.kcl.mde.rinform.RinformPackage;
import uk.ac.kcl.mde.rinform.RoomDeclaration;
import uk.ac.kcl.mde.rinform.RoomDescription;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.mde.rinform.impl.RoomDescriptionImpl#getRoomDescription <em>Room Description</em>}</li>
 *   <li>{@link uk.ac.kcl.mde.rinform.impl.RoomDescriptionImpl#getRoom <em>Room</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoomDescriptionImpl extends SentencePartImpl implements RoomDescription
{
  /**
   * The cached value of the '{@link #getRoomDescription() <em>Room Description</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRoomDescription()
   * @generated
   * @ordered
   */
  protected EList<String> roomDescription;

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
  protected RoomDescriptionImpl()
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
    return RinformPackage.Literals.ROOM_DESCRIPTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getRoomDescription()
  {
    if (roomDescription == null)
    {
      roomDescription = new EDataTypeEList<String>(String.class, this, RinformPackage.ROOM_DESCRIPTION__ROOM_DESCRIPTION);
    }
    return roomDescription;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RinformPackage.ROOM_DESCRIPTION__ROOM, oldRoom, room));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RinformPackage.ROOM_DESCRIPTION__ROOM, oldRoom, room));
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
      case RinformPackage.ROOM_DESCRIPTION__ROOM_DESCRIPTION:
        return getRoomDescription();
      case RinformPackage.ROOM_DESCRIPTION__ROOM:
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
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RinformPackage.ROOM_DESCRIPTION__ROOM_DESCRIPTION:
        getRoomDescription().clear();
        getRoomDescription().addAll((Collection<? extends String>)newValue);
        return;
      case RinformPackage.ROOM_DESCRIPTION__ROOM:
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
      case RinformPackage.ROOM_DESCRIPTION__ROOM_DESCRIPTION:
        getRoomDescription().clear();
        return;
      case RinformPackage.ROOM_DESCRIPTION__ROOM:
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
      case RinformPackage.ROOM_DESCRIPTION__ROOM_DESCRIPTION:
        return roomDescription != null && !roomDescription.isEmpty();
      case RinformPackage.ROOM_DESCRIPTION__ROOM:
        return room != null;
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
    result.append(" (roomDescription: ");
    result.append(roomDescription);
    result.append(')');
    return result.toString();
  }

} //RoomDescriptionImpl
