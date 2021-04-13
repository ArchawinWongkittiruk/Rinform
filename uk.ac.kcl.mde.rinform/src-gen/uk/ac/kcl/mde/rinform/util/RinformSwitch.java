/**
 * generated by Xtext 2.20.0
 */
package uk.ac.kcl.mde.rinform.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import uk.ac.kcl.mde.rinform.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see uk.ac.kcl.mde.rinform.RinformPackage
 * @generated
 */
public class RinformSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static RinformPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RinformSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = RinformPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case RinformPackage.REVERSE_INFORM_PROGRAM:
      {
        ReverseInformProgram reverseInformProgram = (ReverseInformProgram)theEObject;
        T result = caseReverseInformProgram(reverseInformProgram);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RinformPackage.SENTENCE_PART:
      {
        SentencePart sentencePart = (SentencePart)theEObject;
        T result = caseSentencePart(sentencePart);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RinformPackage.ROOM_DECLARATION:
      {
        RoomDeclaration roomDeclaration = (RoomDeclaration)theEObject;
        T result = caseRoomDeclaration(roomDeclaration);
        if (result == null) result = caseSentencePart(roomDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RinformPackage.ROOM_ALIAS:
      {
        RoomAlias roomAlias = (RoomAlias)theEObject;
        T result = caseRoomAlias(roomAlias);
        if (result == null) result = caseSentencePart(roomAlias);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RinformPackage.ROOM_DESCRIPTION:
      {
        RoomDescription roomDescription = (RoomDescription)theEObject;
        T result = caseRoomDescription(roomDescription);
        if (result == null) result = caseSentencePart(roomDescription);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RinformPackage.CONTAINER_DECLARATION:
      {
        ContainerDeclaration containerDeclaration = (ContainerDeclaration)theEObject;
        T result = caseContainerDeclaration(containerDeclaration);
        if (result == null) result = caseItemDeclaration(containerDeclaration);
        if (result == null) result = caseSentencePart(containerDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RinformPackage.ITEM_IN_ROOM_DECLARATION:
      {
        ItemInRoomDeclaration itemInRoomDeclaration = (ItemInRoomDeclaration)theEObject;
        T result = caseItemInRoomDeclaration(itemInRoomDeclaration);
        if (result == null) result = caseItemDeclaration(itemInRoomDeclaration);
        if (result == null) result = caseSentencePart(itemInRoomDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RinformPackage.ITEM_IN_CONTAINER_DECLARATION:
      {
        ItemInContainerDeclaration itemInContainerDeclaration = (ItemInContainerDeclaration)theEObject;
        T result = caseItemInContainerDeclaration(itemInContainerDeclaration);
        if (result == null) result = caseItemDeclaration(itemInContainerDeclaration);
        if (result == null) result = caseSentencePart(itemInContainerDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RinformPackage.ITEM_DECLARATION:
      {
        ItemDeclaration itemDeclaration = (ItemDeclaration)theEObject;
        T result = caseItemDeclaration(itemDeclaration);
        if (result == null) result = caseSentencePart(itemDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RinformPackage.ITEM_DESCRIPTION:
      {
        ItemDescription itemDescription = (ItemDescription)theEObject;
        T result = caseItemDescription(itemDescription);
        if (result == null) result = caseSentencePart(itemDescription);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RinformPackage.PERSON_DECLARATION:
      {
        PersonDeclaration personDeclaration = (PersonDeclaration)theEObject;
        T result = casePersonDeclaration(personDeclaration);
        if (result == null) result = caseSentencePart(personDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RinformPackage.PERSON_DESCRIPTION:
      {
        PersonDescription personDescription = (PersonDescription)theEObject;
        T result = casePersonDescription(personDescription);
        if (result == null) result = caseSentencePart(personDescription);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RinformPackage.DIRECTION_STATEMENT:
      {
        DirectionStatement directionStatement = (DirectionStatement)theEObject;
        T result = caseDirectionStatement(directionStatement);
        if (result == null) result = caseSentencePart(directionStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RinformPackage.WORDS:
      {
        Words words = (Words)theEObject;
        T result = caseWords(words);
        if (result == null) result = caseSentencePart(words);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RinformPackage.SYMBOL:
      {
        Symbol symbol = (Symbol)theEObject;
        T result = caseSymbol(symbol);
        if (result == null) result = caseSentencePart(symbol);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Reverse Inform Program</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Reverse Inform Program</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReverseInformProgram(ReverseInformProgram object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sentence Part</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sentence Part</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSentencePart(SentencePart object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Room Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Room Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRoomDeclaration(RoomDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Room Alias</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Room Alias</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRoomAlias(RoomAlias object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Room Description</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Room Description</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRoomDescription(RoomDescription object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Container Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Container Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContainerDeclaration(ContainerDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Item In Room Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Item In Room Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseItemInRoomDeclaration(ItemInRoomDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Item In Container Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Item In Container Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseItemInContainerDeclaration(ItemInContainerDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Item Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Item Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseItemDeclaration(ItemDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Item Description</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Item Description</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseItemDescription(ItemDescription object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Person Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Person Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePersonDeclaration(PersonDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Person Description</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Person Description</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePersonDescription(PersonDescription object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Direction Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Direction Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDirectionStatement(DirectionStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Words</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Words</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWords(Words object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Symbol</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Symbol</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSymbol(Symbol object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //RinformSwitch
