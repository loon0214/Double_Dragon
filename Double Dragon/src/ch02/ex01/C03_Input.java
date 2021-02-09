package ch02.ex01;

import java.util.Scanner;

public class C03_Input {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("type the sentence\n");
		String s = sc.nextLine();
		System.out.println(s + " has typed");
		
		System.out.print("type the number\n");
		int a = sc.nextInt(); sc.nextLine();
		System.out.println(a + " has typed");
		
		System.out.print("type the sentence\n");
		s = sc.nextLine();
		System.out.println(s + " has typed");
		
		System.out.print("type the character\n");
		char c = sc.nextLine().charAt(0);
		System.out.println(c+ " has typed");

		
	}

}
