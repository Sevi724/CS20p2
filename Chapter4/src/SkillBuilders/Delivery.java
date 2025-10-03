package SkillBuilders;

import java.util.Scanner;

public class Delivery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	double width;
	double length; 
	double height;
		
		
	try (//Create Scanner object
			Scanner input = new Scanner(System.in)){

		// Get the width from user
		System.out.print("Enter the width of the package, if bigger than 10 it will not work:   ");
		width = input.nextDouble();
		
		// Get the length from user
		System.out.print("Enter the length of the package, if bigger than 10 it will not work:   ");
		length = input.nextDouble();
		
		// Get the height from user
		System.out.print("Enter the height of the package, if bigger than 10 it will not work:   ");
		height = input.nextDouble();
		
			
			if (width > 10 || length > 10 || height > 10) { //invalid dimensions
				System.out.println("Reject");
			} else if (width <= 10 && length <= 10 && height <= 10) { // valid dimensions
				System.out.println("Accept!");
			}
			
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
