package SkillBuilders;

import java.util.Scanner;

public class Hurricane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int category;
		
		try (//Create Scanner object
				Scanner input = new Scanner(System.in)){
	
		// Get hurricane category number 1 through 5
		System.out.print("Enter hurricane category 1-5:   ");
		category = input.nextInt();
		
		// Displays corresponding tornado speeds
		switch (category) {
		case 1: System.out.println("74-95 mph  64-82 kts  119-153 km/hr"); break;
		case 2: System.out.println("96-110 mph  83-95 kts  154-177 km/hr"); break;
		case 3: System.out.println("111-130 mph  96-113 kts  178-209 km/hr"); break;
		case 4: System.out.println("131-155 mph  114-135 kts  210-249 km/hr"); break;
		case 5: System.out.println("155+ mph  135+ kts  249+ km/hr"); break;
		}
		
		
		
		
		
		
		
		
	}

	}
}