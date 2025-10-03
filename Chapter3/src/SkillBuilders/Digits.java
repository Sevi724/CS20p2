package SkillBuilders;
import java.util.Scanner;
public class Digits {

	public static void main(String[] args) {


		//Declare variables
		int digits;


		try (//Create Scanner object
				Scanner input = new Scanner(System.in)){
	
		// Get 2 digit input from user
		System.out.print("Enter a two digit number:   ");
		digits = input.nextInt();
	
		//Print out the two digits separately
		System.out.print("Your digits are " + digits / 10 );
		System.out.print(" and " + digits % 10);
		}
	
	}

}
