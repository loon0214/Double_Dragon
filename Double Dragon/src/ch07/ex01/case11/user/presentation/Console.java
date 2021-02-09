package ch07.ex01.case11.user.presentation;

import java.util.Scanner;

public class Console {
	private static Scanner sc;
	
	static {
		sc = new Scanner(System.in);
	}
	
	//type the String
	//return: typed String
	public static String inStr(String msg) {
		inMsg(msg);
		return sc.nextLine().trim();
}
	
	//type the Number
	//return: typed Number, -1:if type the character, return.
	public static int inNum(String msg) {
		inMsg(msg);
		int num = sc.nextInt(); sc.nextLine();
		return num;
	}
	
	//Outputs input guidance messages.
	//param : messages
	private static void inMsg(String msg) {
		System.out.print(msg + "\n> ");
	}
	
	//output the message.
	//param: message
	public static void info(String msg) {
		System.out.println(msg);
	}
	
	//output the object information/
	//param: object
	public static void info(Object obj) {
		System.out.println(obj);
	}
}
