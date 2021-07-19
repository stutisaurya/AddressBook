package com.Address;

/**
 * interface class calling all functions
 *
 */

public interface IAddressBook {

	void add();

	void display();

	void edit();

	void delete(String firstName);

	void addMultiplePerson();

	void duplicateCheck(String firstName);

	/**
	 * Uc7: Ability to ensure there is no Duplicate Entry of the same Person in a
	 * particular Address Book.
	 */
	void searchPersonByName(String firstname);

	/**
	 * Uc8: Ability to search person in a city or state across the multiple
	 * AddressBook
	 */
	void searchPersonByState(String firstname);

}