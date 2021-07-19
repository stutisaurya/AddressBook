package com.Address;

public interface IAddressBook {

	void add();

	void display();

	void edit(String firstName);

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

	/**
	 * Uc9: view person by city or state
	 */
	void viewByCity(String city);

	/**
	 * Uc10: count by city or state
	 */
	void searchPersonInCity(String firstName);

}