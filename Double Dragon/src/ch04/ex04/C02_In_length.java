package ch04.ex04;

import java.util.Scanner;

public class C02_In_length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		String input = "";
		int len = 0;
		
		do {
			System.out.print("Enter: ");
			input = s.nextLine();
			len = input.length();
			System.out.println(len + " letters have been entered.");
		}while(len == 0 || len >1);
		
		System.out.println("End");
		s.close();

	}

}
