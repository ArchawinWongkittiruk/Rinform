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

import uk.ac.kcl.mde.rinform.PersonDeclaration;
import uk.ac.kcl.mde.rinform.PersonDescription;
import uk.ac.kcl.mde.rinform.RinformPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.mde.rinform.impl.PersonDescriptionImpl#getPersonDescription <em>Person Description</em>}</li>
 *   <li>{@link uk.ac.kcl.mde.rinform.impl.PersonDescriptionImpl#getPerson <em>Person</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersonDescriptionImpl extends SentencePartImpl implements PersonDescription
{
  /**
   * The cached value of the '{@link #getPersonDescription() <em>Person Description</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPersonDescription()
   * @generated
   * @ordered
   */
  protected EList<String> personDescription;

  /**
   * The cached value of the '{@link #getPerson() <em>Person</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPerson()
   * @generated
   * @ordered
   */
  protected PersonDeclaration person;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PersonDescriptionImpl()
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
    return RinformPackage.Literals.PERSON_DESCRIPTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getPersonDescription()
  {
    if (personDescription == null)
    {
      personDescription = new EDataTypeEList<String>(String.class, this, RinformPackage.PERSON_DESCRIPTION__PERSON_DESCRIPTION);
    }
    return personDescription;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PersonDeclaration getPerson()
  {
    if (person != null && person.eIsProxy())
    {
      InternalEObject oldPerson = (InternalEObject)person;
      person = (PersonDeclaration)eResolveProxy(oldPerson);
      if (person != oldPerson)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RinformPackage.PERSON_DESCRIPTION__PERSON, oldPerson, person));
      }
    }
    return person;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PersonDeclaration basicGetPerson()
  {
    return person;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPerson(PersonDeclaration newPerson)
  {
    PersonDeclaration oldPerson = person;
    person = newPerson;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RinformPackage.PERSON_DESCRIPTION__PERSON, oldPerson, person));
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
      case RinformPackage.PERSON_DESCRIPTION__PERSON_DESCRIPTION:
        return getPersonDescription();
      case RinformPackage.PERSON_DESCRIPTION__PERSON:
        if (resolve) return getPerson();
        return basicGetPerson();
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
      case RinformPackage.PERSON_DESCRIPTION__PERSON_DESCRIPTION:
        getPersonDescription().clear();
        getPersonDescription().addAll((Collection<? extends String>)newValue);
        return;
      case RinformPackage.PERSON_DESCRIPTION__PERSON:
        setPerson((PersonDeclaration)newValue);
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
      case RinformPackage.PERSON_DESCRIPTION__PERSON_DESCRIPTION:
        getPersonDescription().clear();
        return;
      case RinformPackage.PERSON_DESCRIPTION__PERSON:
        setPerson((PersonDeclaration)null);
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
      case RinformPackage.PERSON_DESCRIPTION__PERSON_DESCRIPTION:
        return personDescription != null && !personDescription.isEmpty();
      case RinformPackage.PERSON_DESCRIPTION__PERSON:
        return person != null;
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
    result.append(" (personDescription: ");
    result.append(personDescription);
    result.append(')');
    return result.toString();
  }

} //PersonDescriptionImpl