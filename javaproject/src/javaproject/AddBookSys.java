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
				add.addContact(firstName, lastName, city, zip, phoneNo, 				email);
				System.out.println("Record Added");
				break;
			
				
		
		
	}
}
