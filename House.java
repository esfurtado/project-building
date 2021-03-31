package Poised;

public class House extends Building {
	private long projectNo;
	private String typeOfBuild;
	private String projectName;
	private String buildAdress;
	private double fee;
	private long erfNo;
	private String deadline;
	private double amountPaid;
	private People contractor;
	private People architect;
	private People customer;
	private boolean finalise;

	public House(long projectNo, String typeOfBuild, String buildAdress, double fee, long erfNo, String deadline,
			double amountPaid, People contractor, People architect, People customer, boolean finalise) {
		this.projectNo = projectNo;
		this.typeOfBuild = typeOfBuild;
		this.buildAdress = buildAdress;
		this.fee = fee;
		this.erfNo = erfNo;
		this.deadline = deadline;
		this.amountPaid = amountPaid;
		this.contractor = contractor;
		this.architect = architect;
		this.customer = customer;
		this.finalise = finalise;
	}

	// getters
	@Override
	public String getdeadline() {
		return this.deadline;
	}

	@Override
	public double getamountPaid() {
		return this.amountPaid;
	}

	@Override
	public double getFee() {
		return this.fee;
	}

	@Override
	public boolean getFinalise() {
		return this.finalise;
	}

	@Override
	public long getprojectNo() {
		return this.projectNo;
	}

	@Override
	public String gettypeOfBuild() {
		String build = "House";
		return build;
	}

	@Override
	public String getprojectName() {
		// project name = type of building + customer name
		String name = this.gettypeOfBuild() + " " + this.getCustomer().getName();
		return name;
	}

	@Override
	public String getbuildAdress() {
		return this.buildAdress;
	}

	@Override
	public long geterfNo() { // PROBABLY DELETE THIS, DON'T NEED IT
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public People getContractor() {
		return this.contractor;
	}

	@Override
	public People getArchitect() {
		return this.architect;
	}

	@Override
	public People getCustomer() {
		return this.customer;
	}

	// setters
	@Override
	public String setdeadline(String newDeadline) {
		deadline = newDeadline;
		return deadline;
	}

	@Override
	public boolean setFinalise(boolean isFinalised) {
		finalise = isFinalised;
		return finalise;
	}

	@Override
	public double setamountPaid(double newAmountPaid) {
		amountPaid = amountPaid + newAmountPaid; // This adds to the previous amount
		return amountPaid;
	}

	@Override
	public double setFee(double newFee) { //This will throw an error if the user inputs a negative number, which will be caught in a try/catch error handling
		if (newFee < 0) {
			throw new IllegalArgumentException("newFee cannot be negative");
		}
		fee = newFee;
		return fee;
	}
}
