package Poised;

public class Customer extends People {
	String name;
	String telephoneNo;
	String email;
	String contactAddress;

	public Customer(String name, String telephoneNo, String email, String contactAdress) {
		this.name = name;
		this.telephoneNo = telephoneNo;
		this.email = email;
		this.contactAddress = contactAdress;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getPhoneNo() {
		return this.telephoneNo;
	}

	@Override
	public String getEmail() {
		return this.email;
	}

	@Override
	public String getAddress() {
		return this.contactAddress;
	}

	@Override
	public String setName(String newName) {
		name = newName;
		return name;
	}

	@Override
	public String setPhoneNo(String newPhone) {
		telephoneNo = newPhone;
		return telephoneNo;
	}

	@Override
	public String setEmail(String newEmail) {
		email = newEmail;
		return email;
	}

	@Override
	public String setAddress(String newAddress) {
		contactAddress = newAddress;
		return contactAddress;
	}

}
