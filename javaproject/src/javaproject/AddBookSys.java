package javaproject;

import java.util.Scanner;

public class AddBookSys {
	
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");
		Scanner sc=new Scanner(System.in);		
		
		String firstName,lastName,city,email;
		int zip,choice=1;
		long phoneNo;
		AddContactArray add = new AddContactArray();

		while(choice!=4) {
			System.out.println("Enter your choice:\n1. Enter contact\n2. Edit Contact\n3. Delete Contact\n4. Exit");

			choice = sc.nextInt();


			switch(choice) {
			case 1:
				System.out.println("Enter First Name:");
				 firstName = sc.next();
				System.out.println("Enter Last Name:");
				 lastName=sc.next();
				System.out.println("Enter city:");
				 city=sc.next();
				System.out.println("Enter zip:");
				 zip=sc.nextInt();
				System.out.println("Enter phone No.:");
				 phoneNo=sc.nextLong();
				System.out.println("Enter email address:");
				 email=sc.next();
				add.addContact(firstName, lastName, city, zip, phoneNo, email);
				System.out.println("Record Added");
				break;
			case 2:
				System.out.println("Enter First Name:");
				 firstName = sc.next();

				if(add.containsKey(firstName)) {
					System.out.println("Enter Last Name:");
					 lastName=sc.next();
					System.out.println("Enter city:");
					 city=sc.next();
					System.out.println("Enter zip:");
					 zip=sc.nextInt();
					System.out.println("Enter phone No.:");
					 phoneNo=sc.nextInt();
					System.out.println("Enter email address:");
					 email=sc.next();
				add.editContact(firstName, lastName, city, zip, phoneNo, email);
				}
				else System.out.println("Record Not Found");
				
				
				break;
			case 3:
				System.out.println("Enter First Name:");
				firstName = sc.next();

				if(add.containsKey(firstName)) {
					add.deleteContact(firstName);
				}
				else
					System.out.println("Record not found");
				break;
			case 4:
				break;
			default: System.out.println("Wrong choice");
				
				
		
		}
	}
	}
}
