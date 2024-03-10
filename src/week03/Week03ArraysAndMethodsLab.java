//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject: Arrays & Methods
// Java Week 03 Lab
//
package week03;

public class Week03ArraysAndMethodsLab {

	public static void main(String[] args) {
			
		//
		// Arrays:
		//
		
		// 1. Create an array with the following values 1, 5, 2, 8, 13, 6
		int[] numbers = {1, 5, 2, 8, 13, 6};
		
		// 2. Print out the first element in the array
		System.out.println(numbers[0]);
		
		// 3. Print out the last element in the array without using the number 5
		System.out.println(numbers[numbers.length - 1]);
		
		// 4. Print out the element in the array at position 6, what happens?
		//System.out.println(numbers[6]);
		
		// 5. Print out the element in the array at position -1, what happens?
		//System.out.println(numbers[-1]);
			
		// 6. Write a traditional for loop that prints out each element in the array
		System.out.println("Number 6:");
		for (int i = 0; i <= 5; i++) {
			System.out.println(numbers[i]);
		}
			
		// 7. Write an enhanced for loop that prints out each element in the array
		System.out.println("Number 7:");

		for (int number : numbers) {
			System.out.println(number);
		}
		
		// 8. Create a new variable called sum, write a loop that adds 
		//			each element in the array to the sum
		System.out.println("Number 8:");

		double sum = 0;
		
		for (int number : numbers) {
			sum += number;
		}
		System.out.println(sum);
			
		// 9. Create a new variable called average and assign the average value of the array to it
		double average = sum / numbers.length;
		
		System.out.println(average);
		
		
		// 10. Write an enhanced for loop that prints out each number in the array 
		//			only if the number is odd
		for (int number : numbers) {
			if (number % 2 != 0){
				System.out.println(number);
			}
		}
		
		// 11. Create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"
		String[] names = {"Sam", "Sally", "Thomas", "Robert"};

		
		// 12. Calculate the sum of all the letters in the new array
		System.out.println("Number 12:");

		double sumNames = 0;
		
		for (String name : names) {
			sumNames += name.length();
		}
		System.out.println(sumNames);
		

		//
		// Methods:
		//
		
		// 13. Write and test a method that takes a String name and prints out a greeting. 
		//			This method returns nothing.
		System.out.print("\n");
		System.out.println("Method 13:");
		
		printNameGreeting("Zack", "Hello");
		
		
		// 14. Write and test a method that takes a String name and  
		//			returns a greeting.  Do not print in the method.
		System.out.print("\n");
		System.out.println("Method 14:");

		String result = returnNameGreeting("Jimmy", "Howdy");
		System.out.println(result);
		
		// Compare method 13 and method 14:  
		//		a. Analyze the difference between these two methods.
		//		b. What do you find? 
		//		c. How are they different?


		
		
		// 15. Write and test a method that takes a String and an int and 
		//			returns true if the number of letters in the string is greater than the int
		System.out.print("\n");
		System.out.println("Method 15:");

		boolean answer = isGreaterThan("Happy", 4);
		System.out.println(answer);
		
		// 16. Write and test a method that takes an array of string and a string and 
		//			returns true if the string passed in exists in the array
		System.out.print("\n");
		System.out.println("Method 16:");
		
		String[] team = {"Zack", "Jimmy", "Harry"};

		boolean result16 = doesStringExist(team, "Mary");
		System.out.println(result16);
		
		// 17. Write and test a method that takes an array of int and 
		//			returns the smallest number in the array
		System.out.print("\n");
		System.out.println("Method 17:");
		
		System.out.println(returnSmallestNumber(numbers));

		
		// 18. Write and test a method that takes an array of double and 
		//			returns the average
		System.out.print("\n");
		System.out.println("Method 18:");
		
		double[] array = {75, 99, 85, 100};
		
		System.out.println(returnAverage(array));



		// 19. Write and test a method that takes an array of Strings and 
		//			returns an array of int where each element
		//			matches the length of the string at that position
		System.out.print("\n");
		System.out.println("Method 19:");
		
		int[] nameLengths = extractStringLengths(names);
		for (int number : nameLengths) {
			System.out.println(number);
		}

				
		// 20. Write and test a method that takes an array of strings and 
		//			returns true if the sum of letters for all strings with an even amount of letters
		//			is greater than the sum of those with an odd amount of letters.
		System.out.print("\n");
		System.out.println("Method 20:");

	
		// 21. Write and test a method that takes a string and 
		//			returns true if the string is a palindrome
		System.out.print("\n");
		System.out.println("Method 21:");

		
		
	}
	

	
	// Method 13:
	public static void printNameGreeting(String name, String greeting) {
		System.out.println(greeting + ", " + name + "!");
	}

	// Method 14:
	public static String returnNameGreeting(String name, String greeting) {
		return greeting + ", " + name + "!";
	}
	
	// Method 15:Write and test a method that takes a String and an int and 
	//			returns true if the number of letters in the string is greater than the int
	public static boolean isGreaterThan(String word, int number) {
		if (word.length() > number) {
			return true;
		} else {
			return false;
		}
		
	}
	
	// Method 16: Write and test a method that takes an array of string and a string and 
	//			returns true if the string passed in exists in the array
	public static boolean doesStringExist(String[] array, String s) {
		boolean result = false;
		for (String input : array) {
			if (s.equals(input)) {
				result = true;
			}
			
		}
			
		return result;
		
	}

	
	// Method 17:Write and test a method that takes an array of int and 
	//			returns the smallest number in the array
	public static int returnSmallestNumber(int [] numbers) {
			int smallest = numbers[0];
			for (int number : numbers) {
				if (number < smallest) {
					smallest = number;
				}
			}
			return smallest;

	}

	
	// Method 18: Write and test a method that takes an array of double and 
	//			returns the average
	public static double returnAverage(double[] numbers) {
		double average = 0;
		double sum = 0;
		for (double number : numbers) {
			sum += number;
			average = sum / numbers.length;
		}
		return average;
	}

	
	// Method 19: Write and test a method that takes an array of Strings and 
	//			returns an array of int where each element
	//			matches the length of the string at that position
	public static int[] extractStringLengths(String[] strings) {
		int[] results = new int[strings.length];
		for (int i = 0; i < strings.length; i++) {
			results[i] = strings[i].length();
		}
		return results;
	}

	
	// Method 20:
	
	
	// Method 21:
	

}