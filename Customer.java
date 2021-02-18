package Poised;

public class Customer {
	String name;
	String telephoneNo;
	String email;
	String contactAddress;
	
	public Customer (String name, String telephoneNo, String email, String contactAdress) {
		this.name = name;
		this.telephoneNo = telephoneNo;
		this.email = email;
		this.contactAddress = contactAdress;
	}

public String toString() {
	String output = "Customer name: " + name;
	output = output + "\nCustomer telephone number: " + telephoneNo;
	output = output + "\nCustomer email: " + email;
	output = output + "\nCustomer's address: " + contactAddress;
	
	return output;
	}
}
