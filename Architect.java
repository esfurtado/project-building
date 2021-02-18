package Poised;

public class Architect {
	String name;
	String telephoneNo;
	String email;
	String contactAddress;
	
	public Architect (String name, String telephoneNo, String email, String contactAdress) {
		this.name = name;
		this.telephoneNo = telephoneNo;
		this.email = email;
		this.contactAddress = contactAdress;
		
	}
	
	public String toString() {
		String output = "Architect's name: " + name;
		output = output + "\nArchitect's telephone number: " + telephoneNo;
		output = output + "\nArchitect's email: " + email;
		output = output + "\nArchitect's address: " + contactAddress;
		
		return output;
	
	}
}
