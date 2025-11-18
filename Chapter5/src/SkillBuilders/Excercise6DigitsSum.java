package SkillBuilders;

import java.util.Scanner;

public class Excercise6DigitsSum {

	public static void main(String[] args) {
	
		
		//Declare variables
		int integer = 0;
	
		//Prepare for and get input
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter a positive integer to get the sum of the digits: ");
		integer = input.nextInt();
		}
			//Calculate the hundreds
			int hundreds  = integer / 100;
		
			
			//Calculate the tens
			int integer2 = integer % 100;
			int tens = integer2 / 10;
		
	
			//Calculate the ones
			int integer3 = integer2 % 10;
			int ones = integer3 / 1;
			
			//Calculate and declare variable of sum
			int sum = hundreds + tens + ones;
			
			System.out.println("The sum of the digits is: " + sum);
			
	
		
		
	}

}
