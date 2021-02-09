package ch03.Domowa.Praca;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 Enter the two number, 
		 and get the total
		 */
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("a: ");
		int a = s.nextInt();
		System.out.println("b: ");
		int b = s.nextInt();
		
		System.out.printf("%d + %d = %d",a,b,a+b);
		
		s.close();

	}

}
