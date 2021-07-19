package com.Address;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		System.out.println("Welcome to the Address Book Problem");
		AddressBook adressBookImplementation = new AddressBook();
		int k = 0;
		boolean condition = true;

		while (condition == true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("1.add" + "\n" + "2.Display" + "\n" + "3.edit" + "\n" + "4.delete" + "\n"
					+ "5.addMultiplePerson" + "\n" + "6.duplicateCheck" + "\n" + "7.searchPersonByName" + "\n"
					+ "8.searchPersonByState");
			Scanner option = new Scanner(System.in);

			switch (option.nextInt()) {
			case 1:
				adressBookImplementation.add();
				break;
			case 2:
				adressBookImplementation.display();
				break;
			case 3:
				adressBookImplementation.edit();
				break;
			case 4:
				System.out.println("Enter the Name of the person do you wants to delete");
				String name = scanner.nextLine();
				adressBookImplementation.delete(name);
				break;
			case 5:
				adressBookImplementation.addMultiplePerson();
				break;
			case 6:
				System.out.println(
						"Enter the Name of the person you wants to check, weather that person is present or not");
				String name1 = scanner.nextLine();
				adressBookImplementation.duplicateCheck(name1);
				break;
			case 7:
				System.out.println("Enter a Name");
				String firstName1 = scanner.nextLine();
				adressBookImplementation.searchPersonByName(firstName1);
				break;
			case 8:
				System.out.println("Enter a name");
				String state = scanner.nextLine();
				adressBookImplementation.searchPersonByState(state);
				break;
			default:
				System.out.println("Invalid Input");
			}
		}
	}
}
