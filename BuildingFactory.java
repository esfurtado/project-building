package Poised;

public class BuildingFactory {
	
	public static Building getBuilding(long projectNo, String typeOfBuild, String buildAdress, double fee, long erfNo, String deadline,
			double amountPaid, People contractor, People architect, People customer, boolean finalise) {
		
		if ("Bloc of flats".equalsIgnoreCase(typeOfBuild)) {

			return new BlocOfFlats(projectNo, typeOfBuild, buildAdress, fee, erfNo, deadline,
					amountPaid, contractor, architect, customer, finalise);
			
		} else if ("House".equalsIgnoreCase(typeOfBuild)) {

			return new House(projectNo, typeOfBuild, buildAdress, fee, erfNo, deadline,
					amountPaid, contractor, architect, customer, finalise);
		}
		
		return null;
	}

}
