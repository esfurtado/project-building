package Poised;

public class PeopleFactory {
	
	public static People getPerson(String personType, String name, String telephoneNo, String email, String contactAdress) {
		
		if ("contractor".equalsIgnoreCase(personType)) {

			return new Contractor(name, telephoneNo, email, contactAdress);
			
		} else if ("customer".equalsIgnoreCase(personType)) {

			return new Customer(name, telephoneNo, email, contactAdress);
			
		} else if ("architect".equalsIgnoreCase(personType)) {

			return new Architect(name, telephoneNo, email, contactAdress);
		}
		
		return null;
	}

}

