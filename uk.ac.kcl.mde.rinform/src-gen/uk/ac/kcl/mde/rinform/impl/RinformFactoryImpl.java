/**
 * generated by Xtext 2.20.0
 */
package uk.ac.kcl.mde.rinform.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uk.ac.kcl.mde.rinform.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RinformFactoryImpl extends EFactoryImpl implements RinformFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static RinformFactory init()
  {
    try
    {
      RinformFactory theRinformFactory = (RinformFactory)EPackage.Registry.INSTANCE.getEFactory(RinformPackage.eNS_URI);
      if (theRinformFactory != null)
      {
        return theRinformFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new RinformFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RinformFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case RinformPackage.REVERSE_INFORM_PROGRAM: return createReverseInformProgram();
      case RinformPackage.SENTENCE_PART: return createSentencePart();
      case RinformPackage.ROOM_DECLARATION: return createRoomDeclaration();
      case RinformPackage.ROOM_ALIAS: return createRoomAlias();
      case RinformPackage.ROOM_DESCRIPTION: return createRoomDescription();
      case RinformPackage.ITEM_IN_ROOM_DECLARATION: return createItemInRoomDeclaration();
      case RinformPackage.ITEM_IN_CONTAINER_DECLARATION: return createItemInContainerDeclaration();
      case RinformPackage.ITEM_DECLARATION: return createItemDeclaration();
      case RinformPackage.ITEM_DESCRIPTION: return createItemDescription();
      case RinformPackage.PERSON_DECLARATION: return createPersonDeclaration();
      case RinformPackage.PERSON_DESCRIPTION: return createPersonDescription();
      case RinformPackage.DIRECTION_STATEMENT: return createDirectionStatement();
      case RinformPackage.WORDS: return createWords();
      case RinformPackage.SYMBOL: return createSymbol();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case RinformPackage.DIRECTION:
        return createDirectionFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case RinformPackage.DIRECTION:
        return convertDirectionToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ReverseInformProgram createReverseInformProgram()
  {
    ReverseInformProgramImpl reverseInformProgram = new ReverseInformProgramImpl();
    return reverseInformProgram;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SentencePart createSentencePart()
  {
    SentencePartImpl sentencePart = new SentencePartImpl();
    return sentencePart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RoomDeclaration createRoomDeclaration()
  {
    RoomDeclarationImpl roomDeclaration = new RoomDeclarationImpl();
    return roomDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RoomAlias createRoomAlias()
  {
    RoomAliasImpl roomAlias = new RoomAliasImpl();
    return roomAlias;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RoomDescription createRoomDescription()
  {
    RoomDescriptionImpl roomDescription = new RoomDescriptionImpl();
    return roomDescription;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ItemInRoomDeclaration createItemInRoomDeclaration()
  {
    ItemInRoomDeclarationImpl itemInRoomDeclaration = new ItemInRoomDeclarationImpl();
    return itemInRoomDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ItemInContainerDeclaration createItemInContainerDeclaration()
  {
    ItemInContainerDeclarationImpl itemInContainerDeclaration = new ItemInContainerDeclarationImpl();
    return itemInContainerDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ItemDeclaration createItemDeclaration()
  {
    ItemDeclarationImpl itemDeclaration = new ItemDeclarationImpl();
    return itemDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ItemDescription createItemDescription()
  {
    ItemDescriptionImpl itemDescription = new ItemDescriptionImpl();
    return itemDescription;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PersonDeclaration createPersonDeclaration()
  {
    PersonDeclarationImpl personDeclaration = new PersonDeclarationImpl();
    return personDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PersonDescription createPersonDescription()
  {
    PersonDescriptionImpl personDescription = new PersonDescriptionImpl();
    return personDescription;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DirectionStatement createDirectionStatement()
  {
    DirectionStatementImpl directionStatement = new DirectionStatementImpl();
    return directionStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Words createWords()
  {
    WordsImpl words = new WordsImpl();
    return words;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Symbol createSymbol()
  {
    SymbolImpl symbol = new SymbolImpl();
    return symbol;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Direction createDirectionFromString(EDataType eDataType, String initialValue)
  {
    Direction result = Direction.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertDirectionToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RinformPackage getRinformPackage()
  {
    return (RinformPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static RinformPackage getPackage()
  {
    return RinformPackage.eINSTANCE;
  }

} //RinformFactoryImpl
