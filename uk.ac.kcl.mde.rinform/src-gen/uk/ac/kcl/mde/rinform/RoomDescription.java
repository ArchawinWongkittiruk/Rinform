/**
 * generated by Xtext 2.20.0
 */
package uk.ac.kcl.mde.rinform;


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
 *   <li>{@link uk.ac.kcl.mde.rinform.RoomDescription#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.mde.rinform.RinformPackage#getRoomDescription()
 * @model
 * @generated
 */
public interface RoomDescription extends SentenceParts
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
   * Returns the value of the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text</em>' containment reference.
   * @see #setText(Text)
   * @see uk.ac.kcl.mde.rinform.RinformPackage#getRoomDescription_Text()
   * @model containment="true"
   * @generated
   */
  Text getText();

  /**
   * Sets the value of the '{@link uk.ac.kcl.mde.rinform.RoomDescription#getText <em>Text</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text</em>' containment reference.
   * @see #getText()
   * @generated
   */
  void setText(Text value);

} // RoomDescription
