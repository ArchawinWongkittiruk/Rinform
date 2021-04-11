/**
 * generated by Xtext 2.20.0
 */
package uk.ac.kcl.mde.rinform;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.kcl.mde.rinform.RinformPackage
 * @generated
 */
public interface RinformFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  RinformFactory eINSTANCE = uk.ac.kcl.mde.rinform.impl.RinformFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Reverse Inform Program</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Reverse Inform Program</em>'.
   * @generated
   */
  ReverseInformProgram createReverseInformProgram();

  /**
   * Returns a new object of class '<em>Sentence Part</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sentence Part</em>'.
   * @generated
   */
  SentencePart createSentencePart();

  /**
   * Returns a new object of class '<em>Room Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Room Declaration</em>'.
   * @generated
   */
  RoomDeclaration createRoomDeclaration();

  /**
   * Returns a new object of class '<em>Room Description</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Room Description</em>'.
   * @generated
   */
  RoomDescription createRoomDescription();

  /**
   * Returns a new object of class '<em>Container Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Container Declaration</em>'.
   * @generated
   */
  ContainerDeclaration createContainerDeclaration();

  /**
   * Returns a new object of class '<em>Item In Container Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Item In Container Declaration</em>'.
   * @generated
   */
  ItemInContainerDeclaration createItemInContainerDeclaration();

  /**
   * Returns a new object of class '<em>Item Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Item Declaration</em>'.
   * @generated
   */
  ItemDeclaration createItemDeclaration();

  /**
   * Returns a new object of class '<em>Item Description</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Item Description</em>'.
   * @generated
   */
  ItemDescription createItemDescription();

  /**
   * Returns a new object of class '<em>Direction Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Direction Statement</em>'.
   * @generated
   */
  DirectionStatement createDirectionStatement();

  /**
   * Returns a new object of class '<em>Words</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Words</em>'.
   * @generated
   */
  Words createWords();

  /**
   * Returns a new object of class '<em>Symbol</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Symbol</em>'.
   * @generated
   */
  Symbol createSymbol();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  RinformPackage getRinformPackage();

} //RinformFactory
