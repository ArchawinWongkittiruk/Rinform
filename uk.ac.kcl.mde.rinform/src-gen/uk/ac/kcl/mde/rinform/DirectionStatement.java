/**
 * generated by Xtext 2.20.0
 */
package uk.ac.kcl.mde.rinform;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Direction Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.mde.rinform.DirectionStatement#getRoom1 <em>Room1</em>}</li>
 *   <li>{@link uk.ac.kcl.mde.rinform.DirectionStatement#getDirection <em>Direction</em>}</li>
 *   <li>{@link uk.ac.kcl.mde.rinform.DirectionStatement#getRoom2 <em>Room2</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.mde.rinform.RinformPackage#getDirectionStatement()
 * @model
 * @generated
 */
public interface DirectionStatement extends SentencePart
{
  /**
   * Returns the value of the '<em><b>Room1</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Room1</em>' reference.
   * @see #setRoom1(RoomDeclaration)
   * @see uk.ac.kcl.mde.rinform.RinformPackage#getDirectionStatement_Room1()
   * @model
   * @generated
   */
  RoomDeclaration getRoom1();

  /**
   * Sets the value of the '{@link uk.ac.kcl.mde.rinform.DirectionStatement#getRoom1 <em>Room1</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Room1</em>' reference.
   * @see #getRoom1()
   * @generated
   */
  void setRoom1(RoomDeclaration value);

  /**
   * Returns the value of the '<em><b>Direction</b></em>' attribute.
   * The literals are from the enumeration {@link uk.ac.kcl.mde.rinform.Direction}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Direction</em>' attribute.
   * @see uk.ac.kcl.mde.rinform.Direction
   * @see #setDirection(Direction)
   * @see uk.ac.kcl.mde.rinform.RinformPackage#getDirectionStatement_Direction()
   * @model
   * @generated
   */
  Direction getDirection();

  /**
   * Sets the value of the '{@link uk.ac.kcl.mde.rinform.DirectionStatement#getDirection <em>Direction</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Direction</em>' attribute.
   * @see uk.ac.kcl.mde.rinform.Direction
   * @see #getDirection()
   * @generated
   */
  void setDirection(Direction value);

  /**
   * Returns the value of the '<em><b>Room2</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Room2</em>' reference.
   * @see #setRoom2(RoomDeclaration)
   * @see uk.ac.kcl.mde.rinform.RinformPackage#getDirectionStatement_Room2()
   * @model
   * @generated
   */
  RoomDeclaration getRoom2();

  /**
   * Sets the value of the '{@link uk.ac.kcl.mde.rinform.DirectionStatement#getRoom2 <em>Room2</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Room2</em>' reference.
   * @see #getRoom2()
   * @generated
   */
  void setRoom2(RoomDeclaration value);

} // DirectionStatement