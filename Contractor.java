package Poised;

public class Contractor {
	String name;
	String telephoneNo;
	String email;
	String contactAddress;
	
	//get and set for all above parameters:
	
	public String getName() {
		
		return name;
	}
	
	public String setName(String newName) {
		
		name = newName;
		return name;
	}
	
	public String getPhoneNo() {
		
		return telephoneNo; 
	}
	
	public String setPhoneNo(String newPhone) {
		
		telephoneNo = newPhone;
		return telephoneNo;
	}
	
	public String getEmail() {
		
		return email;
	}
	
	public String setEmail(String newEmail) {
		
		email = newEmail;
		return email;
	}
	
	public String getAddress() {
		
		return contactAddress;
	}
	
	public String setAddress(String newAddress) {
		
		contactAddress = newAddress;
		return contactAddress;
	}
	
	
	//Constructor
	
	public Contractor (String name, String telephoneNo, String email, String contactAdress) {
		this.name = name;
		this.telephoneNo = telephoneNo;
		this.email = email;
		this.contactAddress = contactAdress;
		
	}
	
	
	// To string method
	
	public String toString() {
		String output = "Contractor's name: " + name;
		output = output + "\nContractor's telephone number: " + telephoneNo;
		output = output + "\nContractor's email: " + email;
		output = output + "\nContractor's address: " + contactAddress;
		
		return output;
	
	}
	
	

}
