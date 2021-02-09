package ch04.ex02;

import java.util.Scanner;

public class C05_Season {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int month = 0;
		String season = "";
		Scanner s = new Scanner(System.in);
		
		System.out.print("which Month?");
		month = s.nextInt();
		
		switch(month){
		case 3:
		case 4:
		case 5:
			season = "Spring"; break;
		case 6: case 7: case 8:
			season = "Summer"; break;
		case 9: case 10: case 11:
			season = "autumn"; break;
		case 12: case 1: case 2: season = "winter";
		}
		System.out.printf("%d montn is %s.",
				month,season);
		
		s.close();
	}

}
