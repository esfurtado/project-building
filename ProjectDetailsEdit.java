package Poised;

import java.util.Random;
import java.util.Scanner;

public class ProjectDetailsEdit {
	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);

		Random randnum = new Random(); // This is to create the object attributes that have numbers

		// Create all the variables that are needed to create a new building object
		// The objects for now are created out of the user's menu, which may be changed
		// on the next Capstone

		long projectNo;
		projectNo = randnum.nextInt(10000);

		long erfNo;
		erfNo = randnum.nextInt(999);

		String typeOfBuild;
		System.out.println("Define the type of building: ");
		typeOfBuild = userInput.nextLine();

		String buildAdress;
		System.out.println("Type the address where the building will be constructed: ");
		buildAdress = userInput.nextLine();

		double fee;
		System.out.println("What is the final price of this project? ");
		fee = userInput.nextDouble();
		userInput.nextLine();

		String deadline;
		System.out.println("Set the deadline to finalise the building: ");
		deadline = userInput.nextLine();

		double amountPaid;
		System.out.println("Input any amounts paid towards the fee: ");
		amountPaid = userInput.nextDouble();
		userInput.nextLine();

		boolean finalise = false;

		// Create all variables required to create Contractor, Architect and Customer
		// objects -- this may later be implemented so the client creates these objects
		// at will as well

		String newCustomer = "customer";

		String custName;
		System.out.println("Customer name: ");
		custName = userInput.nextLine();

		String custTelephoneNo;
		System.out.println("Customer telephone number: ");
		custTelephoneNo = userInput.nextLine();

		String custEmail;
		System.out.println("Customer email: ");
		custEmail = userInput.nextLine();

		String custContactAdress;
		System.out.println("Customer address: ");
		custContactAdress = userInput.nextLine();

		String newArchitect = "architect";

		String arcName;
		System.out.println("Architect name: ");
		arcName = userInput.nextLine();

		String arcTelephoneNo;
		System.out.println("Architect telephone number: ");
		arcTelephoneNo = userInput.nextLine();

		String arcEmail;
		System.out.println("Architect email: ");
		arcEmail = userInput.nextLine();

		String arcContactAdress;
		System.out.println("Architect address: ");
		arcContactAdress = userInput.nextLine();

		String newContractor = "contractor";

		String contName;
		System.out.println("Contractor name: ");
		contName = userInput.nextLine();

		String contTelephoneNo;
		System.out.println("Contractor telephone number: ");
		contTelephoneNo = userInput.nextLine();

		String contEmail;
		System.out.println("Contractor email: ");
		contEmail = userInput.nextLine();

		String contContactAdress;
		System.out.println("Contractor address: ");
		contContactAdress = userInput.nextLine();

		// Creating the objects necessary for building project
		People contractor = PeopleFactory.getPerson(newContractor, contName, contTelephoneNo, contEmail,
				contContactAdress);

		People architect = PeopleFactory.getPerson(newArchitect, arcName, arcTelephoneNo, arcEmail, arcContactAdress);

		People customer = PeopleFactory.getPerson(newCustomer, custName, custTelephoneNo, custEmail, custContactAdress);

		Building newBuild = BuildingFactory.getBuilding(projectNo, typeOfBuild, buildAdress, fee, erfNo, deadline,
				amountPaid, contractor, architect, customer, finalise);

		// MAIN MENU
		boolean exit = false;

		while (exit == false) {
			System.out.println("Which part of the project would you like to edit?\nPlease select from the following: \n"
					+ "0. exit\n" + "1. View project details\n" + "2. Change the due date\n"
					+ "3. Add/Subtract to the amount paid\n" + "4. Change the project fee\n"
					+ "5. Update the contractor's details\n" + "6. Finalise the project");

			int optionSelect = userInput.nextInt();
			userInput.nextLine();

			if (optionSelect == 0) {
				exit = true;
			}

			else if (optionSelect == 1) {
				System.out.println(newBuild.toString() + "\n");
			}

			else if (optionSelect == 2) {
				String newDeadline;
				System.out.println("Enter the new deadline: ");
				newDeadline = userInput.nextLine();
				newBuild.setdeadline(newDeadline);
			}

			else if (optionSelect == 3) {
				double newAmountPaid;
				System.out.println(
						"Add (or subtract by entering a negative number) the amount of money that has been paid/taken ");
				newAmountPaid = userInput.nextInt();
				newBuild.setamountPaid(newAmountPaid);
			}

			else if (optionSelect == 4) {

				try {
					System.out.println("What is the new fee? ");
					double newFee = userInput.nextInt();
					newBuild.setFee(newFee);
				}

				catch (Exception e) {
					System.err.println("You cannot enter a negative number: " + e.getLocalizedMessage());
				}
			}

			// Make a secondary menu to edit the contractor's details
			else if (optionSelect == 5) {
				System.out.println("Select which detail you would like to edit:\n" + "a. Name\n"
						+ "b. Telephone number\n" + "c. Email\n" + "d. Contact address");

				char option = userInput.next().charAt(0);

				if (option == 'a') {
					userInput.nextLine();
					System.out.println("What is the contractor's name? ");
					String newName = userInput.nextLine();
					contractor.setName(newName);
				}

				else if (option == 'b') {
					userInput.nextLine();
					System.out.println("Update telephone number: ");
					String newPhone = userInput.nextLine();
					contractor.setPhoneNo(newPhone);
				}

				else if (option == 'c') {
					userInput.nextLine();
					System.out.println("Update email: ");
					String newEmail = userInput.nextLine();
					contractor.setEmail(newEmail);

				}

				else if (option == 'd') {
					userInput.nextLine();
					System.out.println("Update the contractor's contact address: ");
					String newAddress = userInput.nextLine();
					contractor.setAddress(newAddress);
				}
			}

			// Finalise the project based on whether the fee has been paid in full
			else if (optionSelect == 6) {
				finalise = newBuild.getFinalise();
				amountPaid = newBuild.getamountPaid();
				fee = newBuild.getFee();

				if (finalise == true) {
					System.out.println("This project has been finalised.");
				} else {
					boolean isFinal;
					try {
						isFinal = Finalise(fee, amountPaid);
						finalise = newBuild.setFinalise(isFinal);
					} catch (Exception e) {
						System.err.println(e.getMessage());
					}
				}
			}
		}

	}

	// A method has been created to analise whether the fee has been paid (that is
	// the amount paid covers the fee). If so it returns true, so then the finalise
	// variable can be set as true.
	// This also includes an error throw, in case the previous condition isn't met.
	// This will be caught by a try and catch error handling

	private static boolean Finalise(double fee, double amountPaid) {
		if ((fee - amountPaid) > 0) {
			throw new IllegalArgumentException(
					"The project cannot be finalised until the fee has been fully paid. An invoice will be generated.");
		}
		return true;
	}

}
