package ch04.Domowa.Praca;

import java.util.Scanner;

public class Present_IV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.print("1.Travel 2.House\n> ");
		int main = s.nextInt();
		String gift = "";
		String country = "";
		
		switch(main) {
		case 1: gift = "Travel"; break;
		case 2: gift = "house"; break;
		default : gift = "iPhone";
		}
		
		switch(main) {
		case 1: case 2:
		System.out.print("1.Polska, 2.Deutchland, 3.hungary\n>>");
		int sub = s.nextInt();
		
		
		switch(sub) {
		case 1: country = "Polska"; break;
		case 2: country = "Deutschland"; break;
		case 3: country = "Hungary";
		}
	}
		System.out.printf("%s %s has been given.",country ,gift);
		s.close();
		}
}
