package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int startAmount = 2; 
		double winChance = 0.7;
		int winLimit = 10;
		int totalSimulations = 500;
		
		for (int x = totalSimulations; x > 0; x--)
		{
			while (startAmount < winLimit && startAmount != 0)
				
			{
				double randomNumber = Math.random();
				
				if(randomNumber <= winChance)
				{
					System.out.println("Win");
					startAmount += 1;
				}
				else 
				{
					System.out.println("Lose");
					startAmount -= 1;
				}
			}
		}
		
		
		if (startAmount >= winLimit)
		{
			System.out.println("Success");
		}
		 if (startAmount == 0)
		 {
			System.out.println("Ruin");
		 }
	}

}
