package ch04.ex04;

import java.util.Scanner;

public class C01_Do_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int result = 0;
		
		do {
			System.out.print("Press the 1st number.");
			a = s.nextInt();
			System.out.print("Press the 2nd number.");
			b = s.nextInt();
			result = a + b;
			System.out.printf("%d + %d = %d\n" ,a ,b, result);
		}while(result!= 0);
		
		System.out.println("sum became 0, so End.");
		s.close();
	}
}
