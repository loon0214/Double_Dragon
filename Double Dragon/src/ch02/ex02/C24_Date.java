package ch02.ex02;

import java.sql.Date;

public class C24_Date {
	public static void main(String[] args) {
		
		java.util.Date date = new java.util.Date();
		System.out.println("date: " + date);
		System.out.println("time: " + date.getTime());
		
		Date date2 = new Date(1577341024265L);
		System.out.println("date2: " + date2);
		java.time.LocalDate date3 = date2.toLocalDate();
		System.out.println("date3: " + date3);
		
		Date date4 = Date.valueOf("2022-01-05");
		System.out.println("date4: " + date4);
		
		
	}

}
