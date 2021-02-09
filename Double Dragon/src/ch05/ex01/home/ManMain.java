package ch05.ex01.home;

import java.time.LocalDate;
import java.util.Scanner;

public class ManMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("type the name.\n>> ");
		String name = sc.nextLine();
		System.out.print("type the age.\n>> ");
		int age = sc.nextInt();
		
		Man man = new Man();
		man.setName(name);
		man.setAge(age);
		man.setRegDate(LocalDate.now());
		
		System.out.println("\n the person you typed information is as follows");
		System.out.printf("name: %s\n,age: %d\nreg date: %s",
				man.getName(), man.getAge(), man.getRegDate());
	}
}
