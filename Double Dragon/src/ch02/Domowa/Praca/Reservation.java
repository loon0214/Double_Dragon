package ch02.Domowa.Praca;

import java.time.LocalDate;
import java.util.Scanner;

public class Reservation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * reserve. you can refunt until before 3 Days.
		 * --
		 * 
		 * type the date of performance.
		 * year: a 
		 * month: b
		 * day: c
		 * a - b - c  date performance has reserved.
		 * you can free refund till (abc - 3days).
		 */
		
		Scanner s = new Scanner(System.in);
		int year = 0;
		int month = 0;
		int day = 0;
		
		System.out.println("type the date of performance");
		System.out.print("year: "); year = s.nextInt();
		System.out.print("month: "); month = s.nextInt();
		System.out.print("day: "); day = s.nextInt();
		
		LocalDate date = LocalDate.of(year, month, day);
		System.out.println(date + " date performance has reserved." );
		System.out.println("you can free refund until "
		+ date.minusDays(3));

	}

}
