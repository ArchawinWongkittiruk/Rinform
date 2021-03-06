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

import uk.ac.kcl.mde.rinform.CharacterAlias;
import uk.ac.kcl.mde.rinform.CharacterDeclaration;
import uk.ac.kcl.mde.rinform.RinformPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Character Alias</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.mde.rinform.impl.CharacterAliasImpl#getCharacter <em>Character</em>}</li>
 *   <li>{@link uk.ac.kcl.mde.rinform.impl.CharacterAliasImpl#getAliases <em>Aliases</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CharacterAliasImpl extends SentencePartImpl implements CharacterAlias
{
  /**
   * The cached value of the '{@link #getCharacter() <em>Character</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCharacter()
   * @generated
   * @ordered
   */
  protected CharacterDeclaration character;

  /**
   * The cached value of the '{@link #getAliases() <em>Aliases</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAliases()
   * @generated
   * @ordered
   */
  protected EList<String> aliases;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CharacterAliasImpl()
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
    return RinformPackage.Literals.CHARACTER_ALIAS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CharacterDeclaration getCharacter()
  {
    if (character != null && character.eIsProxy())
    {
      InternalEObject oldCharacter = (InternalEObject)character;
      character = (CharacterDeclaration)eResolveProxy(oldCharacter);
      if (character != oldCharacter)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RinformPackage.CHARACTER_ALIAS__CHARACTER, oldCharacter, character));
      }
    }
    return character;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CharacterDeclaration basicGetCharacter()
  {
    return character;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCharacter(CharacterDeclaration newCharacter)
  {
    CharacterDeclaration oldCharacter = character;
    character = newCharacter;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RinformPackage.CHARACTER_ALIAS__CHARACTER, oldCharacter, character));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getAliases()
  {
    if (aliases == null)
    {
      aliases = new EDataTypeEList<String>(String.class, this, RinformPackage.CHARACTER_ALIAS__ALIASES);
    }
    return aliases;
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
      case RinformPackage.CHARACTER_ALIAS__CHARACTER:
        if (resolve) return getCharacter();
        return basicGetCharacter();
      case RinformPackage.CHARACTER_ALIAS__ALIASES:
        return getAliases();
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
      case RinformPackage.CHARACTER_ALIAS__CHARACTER:
        setCharacter((CharacterDeclaration)newValue);
        return;
      case RinformPackage.CHARACTER_ALIAS__ALIASES:
        getAliases().clear();
        getAliases().addAll((Collection<? extends String>)newValue);
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
      case RinformPackage.CHARACTER_ALIAS__CHARACTER:
        setCharacter((CharacterDeclaration)null);
        return;
      case RinformPackage.CHARACTER_ALIAS__ALIASES:
        getAliases().clear();
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
      case RinformPackage.CHARACTER_ALIAS__CHARACTER:
        return character != null;
      case RinformPackage.CHARACTER_ALIAS__ALIASES:
        return aliases != null && !aliases.isEmpty();
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
    result.append(" (aliases: ");
    result.append(aliases);
    result.append(')');
    return result.toString();
  }

} //CharacterAliasImpl
