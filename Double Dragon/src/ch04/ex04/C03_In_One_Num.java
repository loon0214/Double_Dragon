package ch04.ex04;

import java.util.Scanner;

public class C03_In_One_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		String input = "";
		boolean isOne = false;
		String errMsg = "Press the One digit integer.";
		
		do {
			System.out.print("type: ");
			input = s.nextLine();
			if(input.length()== 1 && input.charAt(0) > 
			'0' && input.charAt(0) <= '9')
				isOne = true;
			else System.out.println(errMsg);
		}while(!isOne);
		
		System.out.println("End");
		s.close();
	}
}
