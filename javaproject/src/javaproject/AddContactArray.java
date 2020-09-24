package javaproject;

import java.util.HashMap;

public class AddContactArray {
	private HashMap<String,AddressContact> arr= new HashMap<String,AddressContact>();
	public boolean containsKey(String firstName) {
		if (this.arr.containsKey(firstName))
		return true;
		else return false;
	}
	public void addContact(String firstName,String lastName,String city,int zip, long phoneNo, String email) {
		AddressContact add =new AddressContact(firstName,lastName,city,zip,phoneNo,email);
		arr.put(firstName,add);
	}
	public void editContact(String firstName,String lastName,String city,int zip, long phoneNo, String email) {
		AddressContact add =new AddressContact(firstName,lastName,city,zip,phoneNo,email);
		arr.replace(firstName, add);
		System.out.println("Record Changed");
		
		}
	public void deleteContact(String firstName) {
		arr.remove(firstName);
		System.out.println("Contact deleted");
	}

}
