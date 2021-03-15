/**
 * generated by Xtext 2.20.0
 */
package uk.ac.kcl.mde.rinform;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.mde.rinform.RoomDescription#getRoom <em>Room</em>}</li>
 *   <li>{@link uk.ac.kcl.mde.rinform.RoomDescription#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.mde.rinform.RinformPackage#getRoomDescription()
 * @model
 * @generated
 */
public interface RoomDescription extends SentencePart
{
  /**
   * Returns the value of the '<em><b>Room</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Room</em>' reference.
   * @see #setRoom(RoomDeclaration)
   * @see uk.ac.kcl.mde.rinform.RinformPackage#getRoomDescription_Room()
   * @model
   * @generated
   */
  RoomDeclaration getRoom();

  /**
   * Sets the value of the '{@link uk.ac.kcl.mde.rinform.RoomDescription#getRoom <em>Room</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Room</em>' reference.
   * @see #getRoom()
   * @generated
   */
  void setRoom(RoomDeclaration value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute list.
   * @see uk.ac.kcl.mde.rinform.RinformPackage#getRoomDescription_Description()
   * @model unique="false"
   * @generated
   */
  EList<String> getDescription();

} // RoomDescription
