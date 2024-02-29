package kiruba;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		scn.close();
		
		Random rdm=new Random();
		int rd=rdm.nextInt(100)+1;
		
		int count=0;
				
		while(true) {
		System.out.println("ENTER YOUR GUESS BETWEEN 0-100");
		int guess = scn.nextInt();
			count++;			
		 if(guess==rd) {
			System.out.println("You Guess is correct! you win!");
			System.out.println( "its your" +count+ "try");
			break;
		}
		else if (guess>rd) {
			System.out.println("Your guess is higher! Try again!");
			
		}
		
		else {
			System.out.println("Your guess is lower ! Try again!");
		}
		}
	}
}

