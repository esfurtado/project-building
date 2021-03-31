package Poised;

public abstract class Building {
	
	//getters
	public abstract long getprojectNo();
	public abstract String gettypeOfBuild();
	public abstract String getprojectName();
	public abstract String getbuildAdress();
	public abstract double getFee();
	public abstract long geterfNo();
	public abstract String getdeadline();
	public abstract double getamountPaid();
	public abstract People getContractor();
	public abstract People getArchitect();
	public abstract People getCustomer();
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
		output = output + "\nContractor name: " + this.getContractor().getName();
		output = output + "\nArchitect name: " + this.getArchitect().getName();
		output = output + "\nCustomer name: " + this.getCustomer().getName();
		
		return output;
	}
	


}
