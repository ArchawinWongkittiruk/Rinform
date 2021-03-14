/**
 * generated by Xtext 2.20.0
 */
package uk.ac.kcl.mde.rinform.impl;

import org.eclipse.emf.ecore.EClass;
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
      case RinformPackage.SENTENCE_PARTS: return createSentenceParts();
      case RinformPackage.ROOM_DECLARATION: return createRoomDeclaration();
      case RinformPackage.ROOM_DESCRIPTION: return createRoomDescription();
      case RinformPackage.ITEM_DECLARATION: return createItemDeclaration();
      case RinformPackage.ITEM_DESCRIPTION: return createItemDescription();
      case RinformPackage.ROOM_NAME: return createRoomName();
      case RinformPackage.ITEM_NAME: return createItemName();
      case RinformPackage.TEXT: return createText();
      case RinformPackage.WORD: return createWord();
      case RinformPackage.SYMBOL: return createSymbol();
      case RinformPackage.DOT: return createDot();
      case RinformPackage.COMMA: return createComma();
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
  public SentenceParts createSentenceParts()
  {
    SentencePartsImpl sentenceParts = new SentencePartsImpl();
    return sentenceParts;
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
  public RoomName createRoomName()
  {
    RoomNameImpl roomName = new RoomNameImpl();
    return roomName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ItemName createItemName()
  {
    ItemNameImpl itemName = new ItemNameImpl();
    return itemName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Text createText()
  {
    TextImpl text = new TextImpl();
    return text;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Word createWord()
  {
    WordImpl word = new WordImpl();
    return word;
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
  @Override
  public Dot createDot()
  {
    DotImpl dot = new DotImpl();
    return dot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Comma createComma()
  {
    CommaImpl comma = new CommaImpl();
    return comma;
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
