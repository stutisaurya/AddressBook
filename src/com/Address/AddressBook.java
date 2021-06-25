package com.Address;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Added AddressbookArray class to add an arraylist code in it.
 */

public class AddressBook extends Contact {
	Scanner sc = new Scanner(System.in);
	private ArrayList<Contact> contactList = new ArrayList<Contact>();

	/**
	 * This is a parameterized constructor having the given parameters.
	 *
	 * @param firstname
	 * @param lastname
	 * @param address
	 * @param city
	 * @param state
	 * @param zip
	 * @param phonenumber
	 * @param email
	 */
	public AddressBook(String firstname, String lastname, String address, String city, String state, int zip,
			long phonenumber, String email) {
		super(firstname, lastname, address, city, state, zip, phonenumber, email);
	}

	public AddressBook() {
		super();
	}

	public void insertContact(AddressBook contactDetailObject) {

		contactList.add(contactDetailObject);
	}

	/**
	 * This Editcontact method will take the firstname as a parameter and according
	 * to that it will edit the data.
	 * 
	 * @param nameToEdit
	 */
	public void editContact(String nameToEdit) {
		for (Contact editContact : contactList) {
			if (editContact.getFirstName().equals(nameToEdit)) {

				System.out.println("Edit Firstname : ");
				String firstname = sc.nextLine();
				editContact.setFirstName(firstname);

				System.out.println("Edit Lastname : ");
				String lastname = sc.nextLine();
				editContact.setLastName(lastname);

				System.out.println("Edit Address : ");
				String address = sc.nextLine();
				editContact.setAddress(address);

				System.out.println("Edit City : ");
				String city = sc.nextLine();
				editContact.setCity(city);

				System.out.println("Edit State : ");
				String state = sc.nextLine();
				editContact.setState(state);

				System.out.println("Edit Zip : ");
				int zip = sc.nextInt();
				editContact.setZip(zip);

				System.out.println("Edit PhoneNumber : ");
				long phonenumber = sc.nextLong();
				sc.nextLine();
				editContact.setPhoneNo(phonenumber);

				System.out.println("Edit Email : ");
				String email = sc.nextLine();
				editContact.setEmail(email);
			}
		}
	}

	/**
	 * Here i have added delete method which will delete the data comparing to the
	 * firstname.
	 * 
	 * @param nameToDelete
	 */
	public void delete(String nameToDelete) {
		int i = 0;
		for (i = 0; i < contactList.size(); i++) {
			if (contactList.get(i).firstname.equals(nameToDelete)) {
				contactList.remove(i);
				System.out.println("Contact is Deleted");
			} else {
				System.out.println("Contact not found!");
			}
		}
	}

	/**
	 * This printContactDetails will print all the information after data got
	 * edited.
	 */
	public void printContactDetails() {
		for (Contact getInfo : contactList) {
			System.out.println("Firstname : " + getInfo.getFirstName());
			System.out.println("Lastname : " + getInfo.getLastName());
			System.out.println("Address : " + getInfo.getAddress());
			System.out.println("City : " + getInfo.getCity());
			System.out.println("State : " + getInfo.getState());
			System.out.println("Zip : " + getInfo.getZip());
			System.out.println("PhoneNumber : " + getInfo.getPhoneNo());
			System.out.println("Email : " + getInfo.getEmail());
		}
	}

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		AddressBook addressObject = new AddressBook();
		String choice = "y";
		System.out.println("Welcome to Address Book Program!");
		while (true) {
			System.out.println("Enter 1: add 2: edit 3: delete 4: view 5: exit");
			System.out.println("Enter choice : ");
			int switchChoice = scan.nextInt();
			scan.nextLine();
			/**
			 * i have taken 4 options in this switch case According to value it'll call the
			 * method. Case 1 will add new contact data. Case2 will edit the contact. Case3
			 * will delete the contact data. Case4 will print all the data of that
			 * Arraylist. Case5 will exit from this loop.
			 */
			switch (switchChoice) {
			case 1:
				while (choice.equals("y")) {
					System.out.println("Firstname : ");
					String firstname = scan.nextLine();
					System.out.println("Lastname : ");
					String lastname = scan.nextLine();
					System.out.println("Address : ");
					String address = scan.nextLine();
					System.out.println("City : ");
					String city = scan.nextLine();
					System.out.println("State : ");
					String state = scan.nextLine();
					System.out.println("Zip : ");
					int zip = scan.nextInt();
					System.out.println("PhoneNumber : ");
					long phonenumber = scan.nextLong();
					System.out.println("Email : ");
					scan.nextLine();
					String email = scan.nextLine();
					System.out.println("Do you want add more contact : ");
					choice = scan.nextLine();

					AddressBook contact = new AddressBook(firstname, lastname, address, city, state, zip, phonenumber,
							email);
					addressObject.insertContact(contact);
				}
				break;
			case 2:
				System.out.println("Enter name of contact to edit : ");
				String nameToEdit = scan.nextLine();
				addressObject.editContact(nameToEdit);
				break;
			case 3:
				System.out.println("Enter name of contact to edit : ");
				String deleteCon = scan.nextLine();
				addressObject.delete(deleteCon);
				break;
			case 4:
				System.out.println("Contact List : ");
				addressObject.printContactDetails();
				break;
			default:
				System.exit(0);
			}
		}

	}

}
