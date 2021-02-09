package ch04.Domowa.Praca;

import java.util.Scanner;

public class Season_If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Season Class with if Grammar
		which month? x
		x is season
		which month ? 13
		13 is not exist month.	*/
		
		int month = 0;
		String season = "";
		Scanner s = new Scanner(System.in);
		
		System.out.print("which month? ");
		month = s.nextInt();
		
		if(3<=month && month <=5) season = "Spring";
		else if(6<=month && month <=8) season = "Summer";
		else if(9<=month && month <11) season = "Autumn";
		else season = "is not exist month.";
		
		System.out.printf("%d month is the %s",month, season);
				s.close();

	}

}
