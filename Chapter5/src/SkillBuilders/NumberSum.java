package SkillBuilders;
import java.util.Scanner;
public class NumberSum {

	public static void main(String[] args) 
	{
		//Declare variables
		int minNumber = 0;
		int maxNumber = 0;
		int sumNumber = 0;
		
		//Preparing for and receiving input from user
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter a positive whole number: ");
			maxNumber = input.nextInt();
		}
		//Printing and receiving all numbers up to user max
		while (minNumber < maxNumber)
		{
				minNumber += 1;
				System.out.println(minNumber);
				sumNumber += minNumber;
				
		}
		//Printing the sum of all the numbers up to user max
		System.out.println("The sum of the numbers is: " + sumNumber);
		
	}

}

