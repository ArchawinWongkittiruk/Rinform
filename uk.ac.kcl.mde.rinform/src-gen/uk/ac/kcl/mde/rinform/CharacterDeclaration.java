/**
 * generated by Xtext 2.20.0
 */
package uk.ac.kcl.mde.rinform;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Character Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.mde.rinform.CharacterDeclaration#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.kcl.mde.rinform.CharacterDeclaration#getRoom <em>Room</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.mde.rinform.RinformPackage#getCharacterDeclaration()
 * @model
 * @generated
 */
public interface CharacterDeclaration extends SentencePart
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see uk.ac.kcl.mde.rinform.RinformPackage#getCharacterDeclaration_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link uk.ac.kcl.mde.rinform.CharacterDeclaration#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Room</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Room</em>' reference.
   * @see #setRoom(RoomDeclaration)
   * @see uk.ac.kcl.mde.rinform.RinformPackage#getCharacterDeclaration_Room()
   * @model
   * @generated
   */
  RoomDeclaration getRoom();

  /**
   * Sets the value of the '{@link uk.ac.kcl.mde.rinform.CharacterDeclaration#getRoom <em>Room</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Room</em>' reference.
   * @see #getRoom()
   * @generated
   */
  void setRoom(RoomDeclaration value);

} // CharacterDeclaration