package ch05.ex06.case03;

import java.util.Scanner;

public class Console {
	private static Scanner s = new Scanner(System.in);
	
	//type the String
	//return: typed string
	public static String inStr() {
		return s.nextLine().trim();
	}
	
	//the the number
	//return: typed number
	public static int inNum() {
		int num = s.nextInt(); s.nextLine();
		return num;
	}
	
	//output the message/
	//param: message
	public static void info(String msg) {
		System.out.println(msg);
	}
	
	//Outputs input guidance messages.
	//param: message
	public static void inMsg(String msg) {
		System.out.print(msg+ "\n> ");
	}
}