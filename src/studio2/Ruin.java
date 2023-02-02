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
		int simulations = 0;
		int rounds = 0;
		int temp = startAmount;
		int loss = 0;
		String result;
		double expectedRuin;
		double alpha;
		alpha = (1-winChance)/winChance;
	
		
		while(simulations < totalSimulations) {
			
			rounds = 0;
			simulations++;
			startAmount = temp;
			
			while((startAmount < winLimit) && (startAmount > 0)) {
			
				coinFlip = Math.random() < winChance;
				
				if (coinFlip) {
					
					startAmount++;
					//System.out.println(startAmount);
					
				} else {
					
					startAmount--;
					
				}
			
				rounds++;
			
			}
		
			if(startAmount == winLimit) {
			
				result = "win";
			
			} else {
			
				result = "lose";
				loss++;
				
			
			}
			
			System.out.println("Simulation " + simulations + ": " + rounds + " " + result);
		
		}
		
		System.out.println("You lost " + loss + " times!");
		
		if (winChance == 0.5) {
			expectedRuin = 1 - (startAmount/winLimit);
		} else {
			expectedRuin = ((Math.pow(alpha,startAmount))-(Math.pow(alpha, winLimit)))/(1-(Math.pow(alpha,winLimit)));
		}
		
		System.out.println(expectedRuin);
		
	}

}
