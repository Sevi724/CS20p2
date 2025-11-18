package SkillBuilders;

import java.util.Scanner;

public class OddSum {

	public static void main(String[] args) 
	{
		//Declare variables
		int minNumber = 0;
		int maxNumber = 0;
		int oddSumNumber = 0;
		
		//Getting ready for and receiving input from user
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter a positive whole number: ");
			maxNumber = input.nextInt();
		}

		//Adding 1 to start so all the numbers are odd instead of even
		minNumber += 1;
		oddSumNumber += minNumber;
		
		//Getting and adding all odd numbers up to the number entered by user
		while (minNumber < maxNumber - 1)
		{
				minNumber += 2;
				oddSumNumber += minNumber;
				
		}
		//Printing the sum of the odd numbers
		System.out.println("The sum of the odd numbers is: " + oddSumNumber);
		
	




		
		
		
		
		
		

	}

}
