package ch04.ex04;

import java.util.Scanner;

public class C04_Guess_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Guess the number
		 computer will choose number between 1 ~ 1000.
		 user guess the number that computer think.
		 */
		
		Scanner s = new Scanner(System.in);
		
		int target = (int)(Math.random()* 1000) + 1;
		int guess = 0;
		int tries = 0;
		
		do {
			System.out.print("press the number: ");
			guess = s.nextInt();
			tries++;
			
			if(guess > target)
				System.out.println("you typed bigger number");
			else if(guess < target)
				System.out.println("you typed smaller number");
		}while(guess != target);
		
		System.out.printf("your %d times tries, you got the %d.",
				tries, target);
		s.close();
	}

}
