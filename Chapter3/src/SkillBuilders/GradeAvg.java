package SkillBuilders;

import java.util.Scanner;

public class GradeAvg {

	public static void main(String[] args) {
		
	//Declare variables
	int grade1;
	int grade2;
	int grade3;
	int grade4;
	int grade5;
	
		
		
	try (//Create Scanner object
			Scanner input = new Scanner(System.in)){	
		
		
		//Get 5 different grade inputs
		System.out.print("Enter your first grade:   ");
		grade1 = input.nextInt();
		
		System.out.print("Enter your second grade:   ");
		grade2 = input.nextInt();
		
		System.out.print("Enter your third grade:   ");
		grade3 = input.nextInt();
		
		System.out.print("Enter your fourth grade:   ");
		grade4 = input.nextInt();
		
		System.out.print("Enter your fifth grade:   ");
		grade5 = input.nextInt();

		
		
		//Calculate and print grade average
		int gradeAverage = grade1 + grade2 + grade3 + grade4 + grade5; 
		System.out.print("Your grade average is " + gradeAverage / 5);
		System.out.print("%");
	
	
	
	}
	
	
	}
}
