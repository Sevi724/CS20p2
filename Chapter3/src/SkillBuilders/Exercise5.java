package SkillBuilders;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		
		
		//Declare variable
		int change = 0;
		
		
		try (//Create Scanner object
				Scanner input = new Scanner(System.in)){
	
		//Get input of an amount of change less than 1.00$
		System.out.print("Enter a amount of change less than 1.00$:   ");
		change = input.nextInt();
		
		//Print the amount of quarters
		int quarters = change / 25;
		System.out.print("The minimum number of coins is:");
		System.out.print(" Quarters: " + quarters);
		
		//Declare variables
		int change2 = change % 25;
		int dimes = change2 / 10;
		
		//Print amount of dimes
		System.out.print(" Dimes: " + dimes);
		
		//Declare variables
		int change3 = change2 % 10;
		int nickels = change3 / 5;
		
		//Print amount of nickels
		System.out.print(" Nickels: " + nickels);
		
		//Declare variables
		int change4 = change3 % 5;
		int pennies = change4 / 1;
		
		//Print amount of pennies
		System.out.print(" Pennies: " + pennies);
		
		}
	}

}
