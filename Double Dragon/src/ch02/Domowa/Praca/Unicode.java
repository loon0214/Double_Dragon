package ch02.Domowa.Praca;

import java.util.Scanner;

public class Unicode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * print the unicode from you typed.
		 --
		 type the character: ?
		 ? 's unicode is X.	 
		  */
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("type the character: ");
		char c = s.nextLine().charAt(0);
		
		int unicode = (int)c;
		System.out.printf("%c's unicode is %d.", c, unicode);
		

	}

}
