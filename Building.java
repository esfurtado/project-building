package Poised;

public abstract class Building {
	
	public long projectNo;
	public String typeOfBuild;
	public String projectName;
	public String buildAdress;
	public double fee;
	public long erfNo;
	public String deadline;
	public double amountPaid;
	public Contractor contractor; 
	public Architect architect; 
	public Customer customer;
	public boolean finalise;
	
	//getters
	public abstract long getprojectNo();
	public abstract String gettypeOfBuild();
	public abstract String getprojectName();
	public abstract String getbuildAdress();
	public abstract double getFee();
	public abstract long geterfNo();
	public abstract String getdeadline();
	public abstract double getamountPaid();
	public abstract Contractor getContractor();
	public abstract Architect getArchitect();
	public abstract Customer getCustomer();
	public abstract boolean getFinalise();
	
	
	//setters
	public abstract String setdeadline(String newDeadline);
	public abstract double setamountPaid(double newAmountPaid);
	public abstract double setFee(double newFee);
	public abstract boolean setFinalise(boolean isFinalised);	
	
	
	public String toString() {
		
		String output = "Project number: " + this.getprojectNo();
		output = output + "\nBuilding: " + this.gettypeOfBuild();
		output = output + "\nProject name: " + this.getprojectName();
		output = output + "\nBuilding address: " + this.getbuildAdress();
		output = output + "\nTotal cost fee: " + this.getFee();
		output = output + "\nERF: " + this.geterfNo();
		output = output + "\nDeadline: " + this.getdeadline();
		output = output + "\nAmount paid: " + this.getamountPaid();
		output = output + "\nFinalised: " + this.getFinalise();
		output = output + "\nContractor name: " + contractor.name;
		output = output + "\nArchitect name: " + architect.name;
		output = output + "\nCustomer name: " + customer.name;
		
		return output;
	}
	


}
