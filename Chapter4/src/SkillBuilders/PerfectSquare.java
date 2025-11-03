package SkillBuilders;
import java.lang.Math;
import java.util.Scanner;

public class PerfectSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number;
		
		
		try (//Create Scanner object
				Scanner input = new Scanner(System.in)){
	
		// Get a number from user
		System.out.print("Enter a whole number to check if its a perfect square: ");
		number = input.nextInt();
		
		double root = + Math.sqrt(number);
		
	
		// Determines and displays whether the number is a perfect square or not
		if (root % 1 == 0) {
		    System.out.println((number) + " is a perfect square.");
		} else {
		    System.out.println((number) + " is not a perfect square.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		}	
		
		
		
	}

}
