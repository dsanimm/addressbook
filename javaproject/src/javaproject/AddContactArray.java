package javaproject;

import java.util.HashMap;

public class AddContactArray {
	private HashMap<String,AddressContact> arr= new HashMap<String,AddressContact>();
	
	public void addContact(String firstName,String lastName,String city,int zip, long phoneNo, String email) {
		AddressContact add =new AddressContact(firstName,lastName,city,zip,phoneNo,email);
		arr.put(firstName,add);
	}
	

}
