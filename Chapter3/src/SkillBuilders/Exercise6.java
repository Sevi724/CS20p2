package SkillBuilders;

import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {
		
		
		//Declare variable
		int digits = 0;
		
		
		try (//Create Scanner object
				Scanner input = new Scanner(System.in)){
	
			
		//Get three digit input 
		System.out.print("Enter a three digit number:   ");
		digits = input.nextInt();
	
	
		//Separate three digit input into 3 numbers and print it
		int NewDigits = digits % 100;
		System.out.print("The hundreds place digit is: " + digits / 100 );
		System.out.print("	The tens place digit is:  " + NewDigits / 10);
		System.out.print("	The ones place digit is:  " + digits % 10);
		}

	}
 
}
