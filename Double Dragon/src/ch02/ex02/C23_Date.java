package ch02.ex02;

import java.time.LocalDate;

public class C23_Date {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		date = date.plusDays(1);
		System.out.println(date);
		
		date = date.minusDays(1);
		System.out.println(date);
	}

}
