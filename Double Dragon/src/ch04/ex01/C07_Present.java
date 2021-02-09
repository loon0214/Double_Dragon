package ch04.ex01;

import java.util.Scanner;

public class C07_Present {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int main = 0;
		int sub = 0;
		String prize = "";
		String brand = "";
		
		System.out.print("1.Europe Travel, 2.house\n");
		main = s.nextInt();
		if(main == 1) prize = "Europe Travel";
		else if(main == 2) prize = "house";
		else prize = "iPhone";
		
		if(main < 3) {
			System.out.print("1.Apple, 2.SAMSUNG, 3.LG\n");
			sub = s.nextInt();
			if(sub == 1) brand = "Apple's";
			else if(sub == 2) brand = "SAMSUNG's";
			else brand = "LG";
		}
		prize = brand + " " + prize;
		System.out.println(prize + " has been given.");
		s.close();
	}

}
