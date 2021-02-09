package ch05.ex06.case03;

public class ConsoleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Console.info("test the static Method");
		
		Console.inMsg("Enter the number");
		int num = Console.inNum();
		
		Console.inMsg("Enter the String");
		String str =  Console.inStr();
		
		System.out.printf("typed %d and %s", num, str);
	}
}