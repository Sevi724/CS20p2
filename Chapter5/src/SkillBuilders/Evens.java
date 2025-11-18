package SkillBuilders;

public class Evens {

	public static void main(String[] args) 
	{
		//Declare variables
		int maxNumber = 20;
		
		int evensValue = 0;
		
		//Tell user what is being printed
		System.out.println("All the even numbers from 1-20");
		
		//Getting all even numbers and printing them
		while (evensValue < maxNumber)
	{
			evensValue += 2;
			System.out.println(evensValue);
	}
		
	}

}
