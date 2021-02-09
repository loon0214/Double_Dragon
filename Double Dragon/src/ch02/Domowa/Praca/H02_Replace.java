package ch02.Domowa.Praca;

import java.util.Scanner;

public class H02_Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * a,b change the both variable value.
		 * --
		 * type the value to save on a : 1
		 * type the value to save on b : 2
		 * a:1, b:2 has saved.
		 * a, b value will be changed.
		 * a:2, b:1 has been changed.
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.print("type the value to save on a: ");
		int a = sc.nextInt();
		System.out.print("type the value to save on b: ");
		int b = sc.nextInt();
		System.out.printf("a: %d, b:%d has saved.\n",a,b);
		
		System.out.println("value a and b will be replaced");
		int s = a;
		a = b;
		b = s;
		System.out.printf("a:%d, b:%d has replaced ",a,b);
		
		sc.close();
	}

}
