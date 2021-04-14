/**
 * generated by Xtext 2.20.0
 */
package uk.ac.kcl.mde.rinform.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import uk.ac.kcl.mde.rinform.CharacterAlias;
import uk.ac.kcl.mde.rinform.CharacterDeclaration;
import uk.ac.kcl.mde.rinform.CharacterDescription;
import uk.ac.kcl.mde.rinform.ContainerDeclaration;
import uk.ac.kcl.mde.rinform.Direction;
import uk.ac.kcl.mde.rinform.DirectionStatement;
import uk.ac.kcl.mde.rinform.ItemAlias;
import uk.ac.kcl.mde.rinform.ItemDeclaration;
import uk.ac.kcl.mde.rinform.ItemDescription;
import uk.ac.kcl.mde.rinform.ItemInContainerDeclaration;
import uk.ac.kcl.mde.rinform.ItemInRoomDeclaration;
import uk.ac.kcl.mde.rinform.ReverseInformProgram;
import uk.ac.kcl.mde.rinform.RinformFactory;
import uk.ac.kcl.mde.rinform.RinformPackage;
import uk.ac.kcl.mde.rinform.RoomAlias;
import uk.ac.kcl.mde.rinform.RoomDeclaration;
import uk.ac.kcl.mde.rinform.RoomDescription;
import uk.ac.kcl.mde.rinform.SentencePart;
import uk.ac.kcl.mde.rinform.Words;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RinformPackageImpl extends EPackageImpl implements RinformPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass reverseInformProgramEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sentencePartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass roomDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass roomDescriptionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass roomAliasEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass itemDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass containerDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass itemInRoomDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass itemInContainerDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass itemDescriptionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass itemAliasEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass characterDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass characterDescriptionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass characterAliasEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass directionStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass wordsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum directionEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see uk.ac.kcl.mde.rinform.RinformPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private RinformPackageImpl()
  {
    super(eNS_URI, RinformFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link RinformPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static RinformPackage init()
  {
    if (isInited) return (RinformPackage)EPackage.Registry.INSTANCE.getEPackage(RinformPackage.eNS_URI);

    // Obtain or create and register package
    Object registeredRinformPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    RinformPackageImpl theRinformPackage = registeredRinformPackage instanceof RinformPackageImpl ? (RinformPackageImpl)registeredRinformPackage : new RinformPackageImpl();

    isInited = true;

    // Create package meta-data objects
    theRinformPackage.createPackageContents();

    // Initialize created meta-data
    theRinformPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theRinformPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(RinformPackage.eNS_URI, theRinformPackage);
    return theRinformPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getReverseInformProgram()
  {
    return reverseInformProgramEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getReverseInformProgram_Sentences()
  {
    return (EReference)reverseInformProgramEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSentencePart()
  {
    return sentencePartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getRoomDeclaration()
  {
    return roomDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getRoomDeclaration_Name()
  {
    return (EAttribute)roomDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getRoomDescription()
  {
    return roomDescriptionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getRoomDescription_RoomDescription()
  {
    return (EAttribute)roomDescriptionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getRoomDescription_Room()
  {
    return (EReference)roomDescriptionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getRoomAlias()
  {
    return roomAliasEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getRoomAlias_Room()
  {
    return (EReference)roomAliasEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getRoomAlias_Aliases()
  {
    return (EAttribute)roomAliasEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getItemDeclaration()
  {
    return itemDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getItemDeclaration_Name()
  {
    return (EAttribute)itemDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getContainerDeclaration()
  {
    return containerDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getContainerDeclaration_Room()
  {
    return (EReference)containerDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getItemInRoomDeclaration()
  {
    return itemInRoomDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getItemInRoomDeclaration_Room()
  {
    return (EReference)itemInRoomDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getItemInContainerDeclaration()
  {
    return itemInContainerDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getItemInContainerDeclaration_Container()
  {
    return (EReference)itemInContainerDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getItemDescription()
  {
    return itemDescriptionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getItemDescription_ItemDescription()
  {
    return (EAttribute)itemDescriptionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getItemDescription_Item()
  {
    return (EReference)itemDescriptionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getItemAlias()
  {
    return itemAliasEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getItemAlias_Item()
  {
    return (EReference)itemAliasEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getItemAlias_Aliases()
  {
    return (EAttribute)itemAliasEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getCharacterDeclaration()
  {
    return characterDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getCharacterDeclaration_Name()
  {
    return (EAttribute)characterDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getCharacterDeclaration_Room()
  {
    return (EReference)characterDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getCharacterDescription()
  {
    return characterDescriptionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getCharacterDescription_PersonDescription()
  {
    return (EAttribute)characterDescriptionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getCharacterDescription_Person()
  {
    return (EReference)characterDescriptionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getCharacterAlias()
  {
    return characterAliasEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getCharacterAlias_Character()
  {
    return (EReference)characterAliasEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getCharacterAlias_Aliases()
  {
    return (EAttribute)characterAliasEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getDirectionStatement()
  {
    return directionStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getDirectionStatement_Room1()
  {
    return (EReference)directionStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getDirectionStatement_Direction()
  {
    return (EAttribute)directionStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getDirectionStatement_Room2()
  {
    return (EReference)directionStatementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getWords()
  {
    return wordsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getWords_Words()
  {
    return (EAttribute)wordsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EEnum getDirection()
  {
    return directionEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RinformFactory getRinformFactory()
  {
    return (RinformFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    reverseInformProgramEClass = createEClass(REVERSE_INFORM_PROGRAM);
    createEReference(reverseInformProgramEClass, REVERSE_INFORM_PROGRAM__SENTENCES);

    sentencePartEClass = createEClass(SENTENCE_PART);

    roomDeclarationEClass = createEClass(ROOM_DECLARATION);
    createEAttribute(roomDeclarationEClass, ROOM_DECLARATION__NAME);

    roomDescriptionEClass = createEClass(ROOM_DESCRIPTION);
    createEAttribute(roomDescriptionEClass, ROOM_DESCRIPTION__ROOM_DESCRIPTION);
    createEReference(roomDescriptionEClass, ROOM_DESCRIPTION__ROOM);

    roomAliasEClass = createEClass(ROOM_ALIAS);
    createEReference(roomAliasEClass, ROOM_ALIAS__ROOM);
    createEAttribute(roomAliasEClass, ROOM_ALIAS__ALIASES);

    itemDeclarationEClass = createEClass(ITEM_DECLARATION);
    createEAttribute(itemDeclarationEClass, ITEM_DECLARATION__NAME);

    containerDeclarationEClass = createEClass(CONTAINER_DECLARATION);
    createEReference(containerDeclarationEClass, CONTAINER_DECLARATION__ROOM);

    itemInRoomDeclarationEClass = createEClass(ITEM_IN_ROOM_DECLARATION);
    createEReference(itemInRoomDeclarationEClass, ITEM_IN_ROOM_DECLARATION__ROOM);

    itemInContainerDeclarationEClass = createEClass(ITEM_IN_CONTAINER_DECLARATION);
    createEReference(itemInContainerDeclarationEClass, ITEM_IN_CONTAINER_DECLARATION__CONTAINER);

    itemDescriptionEClass = createEClass(ITEM_DESCRIPTION);
    createEAttribute(itemDescriptionEClass, ITEM_DESCRIPTION__ITEM_DESCRIPTION);
    createEReference(itemDescriptionEClass, ITEM_DESCRIPTION__ITEM);

    itemAliasEClass = createEClass(ITEM_ALIAS);
    createEReference(itemAliasEClass, ITEM_ALIAS__ITEM);
    createEAttribute(itemAliasEClass, ITEM_ALIAS__ALIASES);

    characterDeclarationEClass = createEClass(CHARACTER_DECLARATION);
    createEAttribute(characterDeclarationEClass, CHARACTER_DECLARATION__NAME);
    createEReference(characterDeclarationEClass, CHARACTER_DECLARATION__ROOM);

    characterDescriptionEClass = createEClass(CHARACTER_DESCRIPTION);
    createEAttribute(characterDescriptionEClass, CHARACTER_DESCRIPTION__PERSON_DESCRIPTION);
    createEReference(characterDescriptionEClass, CHARACTER_DESCRIPTION__PERSON);

    characterAliasEClass = createEClass(CHARACTER_ALIAS);
    createEReference(characterAliasEClass, CHARACTER_ALIAS__CHARACTER);
    createEAttribute(characterAliasEClass, CHARACTER_ALIAS__ALIASES);

    directionStatementEClass = createEClass(DIRECTION_STATEMENT);
    createEReference(directionStatementEClass, DIRECTION_STATEMENT__ROOM1);
    createEAttribute(directionStatementEClass, DIRECTION_STATEMENT__DIRECTION);
    createEReference(directionStatementEClass, DIRECTION_STATEMENT__ROOM2);

    wordsEClass = createEClass(WORDS);
    createEAttribute(wordsEClass, WORDS__WORDS);

    // Create enums
    directionEEnum = createEEnum(DIRECTION);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    roomDeclarationEClass.getESuperTypes().add(this.getSentencePart());
    roomDescriptionEClass.getESuperTypes().add(this.getSentencePart());
    roomAliasEClass.getESuperTypes().add(this.getSentencePart());
    itemDeclarationEClass.getESuperTypes().add(this.getSentencePart());
    containerDeclarationEClass.getESuperTypes().add(this.getItemDeclaration());
    itemInRoomDeclarationEClass.getESuperTypes().add(this.getItemDeclaration());
    itemInContainerDeclarationEClass.getESuperTypes().add(this.getItemDeclaration());
    itemDescriptionEClass.getESuperTypes().add(this.getSentencePart());
    itemAliasEClass.getESuperTypes().add(this.getSentencePart());
    characterDeclarationEClass.getESuperTypes().add(this.getSentencePart());
    characterDescriptionEClass.getESuperTypes().add(this.getSentencePart());
    characterAliasEClass.getESuperTypes().add(this.getSentencePart());
    directionStatementEClass.getESuperTypes().add(this.getSentencePart());
    wordsEClass.getESuperTypes().add(this.getSentencePart());

    // Initialize classes and features; add operations and parameters
    initEClass(reverseInformProgramEClass, ReverseInformProgram.class, "ReverseInformProgram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getReverseInformProgram_Sentences(), this.getSentencePart(), null, "sentences", null, 0, -1, ReverseInformProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sentencePartEClass, SentencePart.class, "SentencePart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(roomDeclarationEClass, RoomDeclaration.class, "RoomDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRoomDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, RoomDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(roomDescriptionEClass, RoomDescription.class, "RoomDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRoomDescription_RoomDescription(), ecorePackage.getEString(), "roomDescription", null, 0, -1, RoomDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRoomDescription_Room(), this.getRoomDeclaration(), null, "room", null, 0, 1, RoomDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(roomAliasEClass, RoomAlias.class, "RoomAlias", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRoomAlias_Room(), this.getRoomDeclaration(), null, "room", null, 0, 1, RoomAlias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRoomAlias_Aliases(), ecorePackage.getEString(), "aliases", null, 0, -1, RoomAlias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(itemDeclarationEClass, ItemDeclaration.class, "ItemDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getItemDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, ItemDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(containerDeclarationEClass, ContainerDeclaration.class, "ContainerDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getContainerDeclaration_Room(), this.getRoomDeclaration(), null, "room", null, 0, 1, ContainerDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(itemInRoomDeclarationEClass, ItemInRoomDeclaration.class, "ItemInRoomDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getItemInRoomDeclaration_Room(), this.getRoomDeclaration(), null, "room", null, 0, 1, ItemInRoomDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(itemInContainerDeclarationEClass, ItemInContainerDeclaration.class, "ItemInContainerDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getItemInContainerDeclaration_Container(), this.getContainerDeclaration(), null, "container", null, 0, 1, ItemInContainerDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(itemDescriptionEClass, ItemDescription.class, "ItemDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getItemDescription_ItemDescription(), ecorePackage.getEString(), "itemDescription", null, 0, -1, ItemDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getItemDescription_Item(), this.getItemDeclaration(), null, "item", null, 0, 1, ItemDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(itemAliasEClass, ItemAlias.class, "ItemAlias", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getItemAlias_Item(), this.getItemDeclaration(), null, "item", null, 0, 1, ItemAlias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getItemAlias_Aliases(), ecorePackage.getEString(), "aliases", null, 0, -1, ItemAlias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(characterDeclarationEClass, CharacterDeclaration.class, "CharacterDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCharacterDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, CharacterDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCharacterDeclaration_Room(), this.getRoomDeclaration(), null, "room", null, 0, 1, CharacterDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(characterDescriptionEClass, CharacterDescription.class, "CharacterDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCharacterDescription_PersonDescription(), ecorePackage.getEString(), "personDescription", null, 0, -1, CharacterDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCharacterDescription_Person(), this.getCharacterDeclaration(), null, "person", null, 0, 1, CharacterDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(characterAliasEClass, CharacterAlias.class, "CharacterAlias", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCharacterAlias_Character(), this.getCharacterDeclaration(), null, "character", null, 0, 1, CharacterAlias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCharacterAlias_Aliases(), ecorePackage.getEString(), "aliases", null, 0, -1, CharacterAlias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(directionStatementEClass, DirectionStatement.class, "DirectionStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDirectionStatement_Room1(), this.getRoomDeclaration(), null, "room1", null, 0, 1, DirectionStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDirectionStatement_Direction(), this.getDirection(), "direction", null, 0, 1, DirectionStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDirectionStatement_Room2(), this.getRoomDeclaration(), null, "room2", null, 0, 1, DirectionStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(wordsEClass, Words.class, "Words", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getWords_Words(), ecorePackage.getEString(), "words", null, 0, -1, Words.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(directionEEnum, Direction.class, "Direction");
    addEEnumLiteral(directionEEnum, Direction.SOUTH);
    addEEnumLiteral(directionEEnum, Direction.NORTH);
    addEEnumLiteral(directionEEnum, Direction.EAST);
    addEEnumLiteral(directionEEnum, Direction.WEST);
    addEEnumLiteral(directionEEnum, Direction.BELOW);
    addEEnumLiteral(directionEEnum, Direction.ABOVE);

    // Create resource
    createResource(eNS_URI);
  }

} //RinformPackageImpl
