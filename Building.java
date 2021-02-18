package Poised;

public class Building {
	
	private long projectNo;
	private String typeOfBuild;
	private String projectName; //project name = type of building + customer name
	private String buildAdress;
	private double fee;
	private long erfNo;
	private String deadline;
	private double amountPaid;
	private Contractor contractor; 
	private Architect architect; 
	private Customer customer;
	private boolean finalise;
	
	
	public String getdeadline() {
		
		return deadline;
	}
	
	public String setdeadline(String newDeadline) {
		
		deadline = newDeadline;
		return deadline;
	}
	
	public double getamoundPaid() {
		
		return amountPaid;
	}
	
	public double setamountPaid(double newAmountPaid) {
		
		amountPaid = amountPaid + newAmountPaid; //This adds to the previous amount
		return amountPaid;
	}
	
	public double getFee() {
		
		return fee;
	}
	
	public double setFee(double newFee) {
		fee = newFee;
		return fee;
	}
	
	public boolean getFinalise() {
		
		return finalise;
	}
	
	public boolean setFinalise(boolean isFinalised) {
		
		finalise = isFinalised;
		return finalise;
	}
	
	public Building(long projectNo, String typeOfBuild, String buildAdress, double fee, long erfNo,
			String deadline, double amountPaid, Contractor contractor, Architect architect, Customer customer) {
		this.projectNo = projectNo;
		this.typeOfBuild = typeOfBuild;
		this.projectName = typeOfBuild + customer.name;
		this.buildAdress = buildAdress;
		this.fee = fee;
		this.erfNo = erfNo;
		this.deadline = deadline;
		this.amountPaid = amountPaid;
		this.finalise = false;
		this.contractor = contractor;
		this.architect = architect;
		this.customer = customer;
	}
	
	
	public String toString() {
		
		String output = "Project number: " + projectNo;
		output = output + "\nBuilding: " + typeOfBuild;
		output = output + "\nProject name: " + projectName;
		output = output + "\nBuilding address: " + buildAdress;
		output = output + "\nTotal cost fee: " + fee;
		output = output + "\nERF: " +erfNo;
		output = output + "\nDeadline: " + deadline;
		output = output + "\nAmount paid: " + amountPaid;
		output = output + "\nFinalised: " + finalise;
		output = output + "\nContractor name: " + contractor.name;
		output = output + "\nArchitect name: " + architect.name;
		output = output + "\nCustomer name: " + customer.name;
		
		return output;
	}


}
