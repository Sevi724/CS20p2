package SkillBuilders;

import java.util.Scanner;

public class Excercise2MetricConversion {

	public static void main(String[] args)
	{
		
			
		
		Scanner input = new Scanner(System.in);
       

		System.out.println("1. Inches to Centimeters");
        System.out.println("2. Feet to Cenimeters");
        System.out.println("3. Yards to Meters");
        System.out.println("4. Miles to Kilometers");
        System.out.println("5. Centimeters to Inches");
        System.out.println("6. Centimeters to Feet");
        System.out.println("7. Meters to Yards");
        System.out.println("8. Kilometers to Miles");
		
        System.out.print("Enter your choice: ");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                inchesToCentimeters();
                break;
            case 2:
                feetToCentimeters();
                break;
            case 3:
                yardsToMeters();
                break;
            case 4:
                milesToKilometers();
                break;
            case 5:
                centimetersToInches();
                break;
            case 6:
                centimetersToFeet();
                break;
            case 7:
                metersToYards();
                break;
            case 8:
                kilometersToMiles();
                break;
            default:
                System.out.println("Invalid choice.");
        }
	}

			public static void inchesToCentimeters()
			{
				double inches, centimeters;
				try (Scanner input = new Scanner(System.in)) {
					System.out.print("Enter the amount of inches: ");
					inches = input.nextDouble();
				}
				centimeters = inches * 2.54;
				System.out.println("The amount of centimeters is: " + centimeters);
			}
			
			public static void feetToCentimeters()
			{
				double feet, centimeters;
				try (Scanner input = new Scanner(System.in)) {
					System.out.print("Enter the amount of feet: ");
					feet = input.nextDouble();
				}
				centimeters = feet * 30;
				System.out.println("The amount of centimeters is: " + centimeters);
			}
			
			public static void yardsToMeters()
			{
				double yards, meters;
				try (Scanner input = new Scanner(System.in)) {
					System.out.print("Enter the amount of yards: ");
					yards = input.nextDouble();
				}
				meters = yards * 0.91;
				System.out.println("The amount of meters is: " + meters);
			}
			
			public static void milesToKilometers()
			{
				double miles, kilometers;
				try (Scanner input = new Scanner(System.in)) {
					System.out.print("Enter the amount of miles: ");
					miles = input.nextDouble();
				}
				kilometers = miles * 1.6;
				System.out.println("The amount of kilometers is: " + kilometers);		
			}
			
			public static void centimetersToInches()
			{
				double centimeters, inches;
				try (Scanner input = new Scanner(System.in)) {
					System.out.print("Enter the amount of centimeters: ");
					centimeters = input.nextDouble();
				}
				inches = centimeters / 2.54;
				System.out.println("The amount of inches is: " + inches);
			}
			
			public static void centimetersToFeet()
			{
				double centimeters, feet;
				try (Scanner input = new Scanner(System.in)) {
					System.out.print("Enter the amount of centimeters: ");
					centimeters = input.nextDouble();
				}
				feet = centimeters / 30;
				System.out.println("The amount of feet is: " + feet);
				
			}	
			public static void metersToYards()
			{
				double meters, yards;
				try (Scanner input = new Scanner(System.in)) {
					System.out.print("Enter the amount of meters: ");
					meters = input.nextDouble();
				}
				yards = meters * 1.094;
				System.out.println("The amount of yards is: " + yards);
			}					
				
			
			public static void kilometersToMiles()
			{
				double kilometers, miles;
				try (Scanner input = new Scanner(System.in)) {
					System.out.print("Enter the amount of kilometers: ");
					kilometers = input.nextDouble();
				}
				miles = kilometers / 1.6;
				System.out.println("The amount of miles is: " + miles);	
			}            
}	
		
		
		
		
		
		
		
		
		
		
		
		
		

	


