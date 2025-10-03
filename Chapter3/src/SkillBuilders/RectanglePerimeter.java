package SkillBuilders;
import java.util.Scanner;
public class RectanglePerimeter 
{

	public static void main(String[] args) 
	{
			// Declare variables
			int width ;
			int length;
			
			
			try (//Create Scanner object
			Scanner input = new Scanner(System.in)) {
			
			
				// Get different types of input
			System.out.print("Enter a width:   ");
			width = input.nextInt();
			System.out.print("Enter a length:   ");
			length = input.nextInt();
			
			
			
			//Print width and length
			System.out.print("The width is: " + width);
			System.out.print(" The length is: " + length);
			
			
			//Calculate perimeter and print it
			int sum = length + width + length + width;
			System.out.print("  The Perimeter is: " + sum  );
			
			
			}

			 
			
	}

}