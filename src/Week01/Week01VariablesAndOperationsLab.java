//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  Variables & Operations Lab
// Java Week 01 Lab  
//
package Week01;

public class Week01VariablesAndOperationsLab {

	public static void main(String[] args) {
		
		System.out.println("Week 1 Lab");

		// 1. Create a variable to hold the quantity of 
		//		available plane seats left on a flight		
		int seatsAvailable = 25;
		
		// 2. Create a variable to hold the cost of groceries at checkout
		double costOfGroceries = 34.98;
		
		// 3. Create a variable to hold a person's middle initial
		char middleInitial = 'A';
	
		// 4. Create a variable to hold true if it's hot outside 
		//		and false if it's cold outside
		boolean isHotOutside = true;
		
		// 5. Create a variable to hold a customer's first name
		String firstName = "Zack";
		
		// 6. Create a variable to hold a street address
		String streetAddress = "1368 S Holland Dr";

		// 7. Print all variables to the console
		System.out.println(seatsAvailable);
		System.out.println(costOfGroceries);
		System.out.println(middleInitial);
		System.out.println(isHotOutside);
		System.out.println(firstName);
		System.out.println(streetAddress);

		// 8. A customer booked 2 plane seats, 
		//		remove 2 seats from the available seats variable
		seatsAvailable = seatsAvailable - 2;
		System.out.println(seatsAvailable);


		// 9. Impulse candy bar purchase, add 2.15 to the grocery total
		costOfGroceries = costOfGroceries + 2.15;
		System.out.println(costOfGroceries);


		// 10.  The birth certificate was printed incorrectly, 
		//		change the middle initial to something else
		middleInitial = 'D';
		System.out.println(middleInitial);


		// 11.  The season has changed, update the hot outside 
		//			variable to be opposite of what it was
		isHotOutside = false;
		System.out.println(isHotOutside);


		// 12.  Create a new variable called full name using the customer's first name, 
		//			the middle initial, and a last name of your choice
		String fullName = firstName + " " + middleInitial + " " + "Minor";
		System.out.println(fullName);

		// 13.  Print a line to the console that introduces the customer and says they live
		// 			at the address variable
		System.out.println("This is my friend " + fullName + " and he lives at " + streetAddress);
		
		
	}
}