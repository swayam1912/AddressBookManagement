package com.dev.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
	
	Scanner sc = new Scanner(System.in);
	ArrayList<Contact> contactArrayList = new ArrayList<>();
	
	public void addContact() {
		
		Contact contact = new Contact();
		
		System.out.println("Enter First Name : ");
		contact.setFirstName(sc.next());
		System.out.println("Enter Last Name : ");
		contact.setLastName(sc.next());
		System.out.println("Enter Address : ");
		contact.setAddress(sc.next());
		System.out.println("Enter city : ");
		contact.setCity(sc.next());
		System.out.println("Enter state : ");
		contact.setState(sc.next());
		System.out.println("Enter zipcode : ");
		contact.setZipCode(sc.next());
		System.out.println("Enter mobile number : ");
		contact.setMobile(sc.next());
		System.out.println("Enter email id : ");
		contact.setEmailId(sc.next());
		contactArrayList.add(contact);
	}
	
	public void displayContact() {
		for(int i = 0; i < contactArrayList.size(); i++) {
			Contact contact = contactArrayList.get(i);
			System.out.println(contact.toString());
		}
	}

}
