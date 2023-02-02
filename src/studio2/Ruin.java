package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("what is your start amount?");
		int startAmount = in.nextInt();
		
		System.out.println("what is your win chance?");
		double winChance = in.nextDouble();
		
		System.out.println("what is your win limit?");
		int winLimit = in.nextInt();

		System.out.println("what is your total simulations you want to run?");
		int totalSimulations = in.nextInt();
		boolean coinFlip;
		int simulations = 1;
		int rounds = 0;
		
		while(simulations <= totalSimulations) {
		
			rounds = 0;
			
		while(startAmount < winLimit) {
			
			if(startAmount > 0) {
				
				coinFlip = Math.random() < winChance;
				
				System.out.println (coinFlip);
				
				if (coinFlip) {
					
					startAmount++;
					System.out.println (startAmount);
					rounds++;
					
				} else if (!coinFlip){
					
					startAmount--;
					System.out.println (startAmount);
					rounds++;
					
				}
				
			} else {
				
				System.out.println("You Lose!");
				
			}
			
			
			System.out.println("Simulation " + simulations + ": " + rounds);
		}
		System.out.println("Thanks for playing you win!");
		System.out.println("Simulation " + simulations + ": ");
		
		}
		
		
		
		
		
	}

}
