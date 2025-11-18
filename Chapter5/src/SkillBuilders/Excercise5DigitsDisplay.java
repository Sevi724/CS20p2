package SkillBuilders;

import java.util.Scanner;

public class Excercise5DigitsDisplay {

	public static void main(String[] args) 
	{
		//Declare variables
		int integer = 0;
	
		//Prepare for and get input
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter a positive integer to get the digits: ");
		integer = input.nextInt();
		}

			//Calculate and print the hundreds
			int hundreds  = integer / 100;
			System.out.println("Hundreds: " + hundreds);
			
			
			//Calculate and print the tens
			int integer2 = integer % 100;
			int tens = integer2 / 10;
			System.out.println("Tens: " + tens);
			
			//Calculate and print the ones
			int integer3 = integer2 % 10;
			int ones = integer3 / 1;
			System.out.println("Ones: " + ones);
		
			
		
		
		
		
		
		
		
		
	}

}
