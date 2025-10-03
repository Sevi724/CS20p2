package SkillBuilders;
import java.util.Scanner;
import java.lang.Math;
public class RandomNum {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub


	int minimum;
	int maximum;
		
		
		try (//Create Scanner object
				Scanner input = new Scanner(System.in)){
	
		// Get minimum value for random number
		System.out.print("Enter the minimum value for a random number:   ");
		minimum = input.nextInt();
		
		// Get minimum value for random number
		System.out.print("Enter the maximum value for a random number:   ");
		maximum = input.nextInt();
		
		//Print random number between min and max
		System.out.println("Random Number: " +
		(int)((maximum - minimum + 1) * Math.random() + minimum));
		
		
		
		
		
		
		
		
		
		
		
	}

}
}