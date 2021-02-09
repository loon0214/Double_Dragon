package ch04.Domowa.Praca;

import java.util.Scanner;

public class Calculator_XI { //#4

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 Enter two numbers, one operator, 
		 perform arithmetic operations.
		 1st number: a
		 (+,-,*,/): ?
		 2nd number: b
		 a ? b =
		 Continue? (y/n)? y
		  1st number: a
		 (+,-,*,/): ?
		 2nd number: b
		 a ? b =
		 Continue? (y/n)? n
		 End.		 */

		Scanner s = new Scanner(System.in);
		int a, b = 0; //random mumber 1 and 2.
		char op = 0; // operator + - * /
		int result = 0;
		char repeat = 0; // continue or not
		
		do {
			System.out.print("Number 1: ");
			a = s.nextInt(); s.nextLine();
			System.out.print("(+ - * /) >> ");
			op = s.nextLine().charAt(0);
			System.out.print("Number 2: ");
			b = s.nextInt(); s.nextLine();
			
			switch(op) {
			case '+' : result = a + b; break;
			case '-' : result = a - b; break;
			case '*' : result = a * b; break;
			case '/' : result = a / b;
			}
			
			System.out.printf("%d %c %d = %d\n", a, op, b,result);
			System.out.print("Continue(y/n)? ");
			repeat = s.nextLine().charAt(0);
		}while(repeat =='y');
		System.out.println("END");
		s.close();					
		}
	}
