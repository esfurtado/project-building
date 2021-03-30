package Poised;

public abstract class People {

	public String name;
	public String telephoneNo;
	public String email;
	public String contactAddress;

	// getters
	public abstract String getName();
	public abstract String getPhoneNo();
	public abstract String getEmail();
	public abstract String getAddress();
	
	//setters
	
	public abstract String setName(String newName);
	public abstract String setPhoneNo(String newPhone);
	public abstract String setEmail(String newEmail);
	public abstract String setAddress(String newAddress);

}
