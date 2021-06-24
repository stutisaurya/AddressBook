package com.Address;

import java.util.Scanner;

public class Contact {

	private String first_name;
	private String last_name;
	private String address;
	private String city;
	private String state;
	private int zip;
	private String phone_number;
	private String email;

	void addContacts() {
		Contact object = new Contact();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First Name:");
		object.first_name = scan.next();
		System.out.println("Enter Last Name:");
		object.last_name = scan.next();
		System.out.println("Enter Address:");
		object.address = scan.next();
		System.out.println("Enter City:");
		object.city = scan.next();
		System.out.println("Enter State:");
		object.state = scan.next();
		System.out.println("Enter zip:");
		object.zip = scan.nextInt();
		System.out.println("Enter Phone number:");
		object.phone_number = scan.next();
		System.out.println("Enter Email:");
		object.email = scan.next();
		scan.close();
	}

}
