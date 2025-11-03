package SkillBuilders;

import java.util.Scanner;


public class exersice1Printing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int copies;	
	double price = 0;	
	


	
	
		try (//Create Scanner object
				Scanner input = new Scanner(System.in)){	
		
		
			// Get input from user
			System.out.print("Enter the number of copies you want to print:   ");
			copies = input.nextInt();
		
		
		
				if (copies >= 0 && copies <= 99){
					price = 0.30;
					System.out.println("Price per copy is: 0.30$ ");
				} else if (copies >= 100 && copies <= 499){ 
					price = 0.28;
					System.out.println("Price per copy is: 0.28$");
				
				}
				  else if (copies >= 500 && copies <= 749){ 
					price = 0.27;
					System.out.println("Price per copy is: 0.27$");
					
					}			
			
				  else if (copies >= 750 && copies <= 1000){ 
						price = 0.26;
						System.out.println("Price per copy is: 0.26$");
					
					}		
		
				  else if (copies > 1000){ 
						price = 0.25;
						System.out.println("Price per copy is: 0.25$");
					
					}
		
				
				
				System.out.println("Total cost is:" + copies * price);		
							
		
		
		
		
		}	
	}

}
