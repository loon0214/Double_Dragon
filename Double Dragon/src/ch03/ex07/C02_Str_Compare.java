package ch03.ex07;

public class C02_Str_Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println('a' == 'a');
		System.out.println("a" == "a");
		System.out.println("a" == "b");
		
		String s = "a";
		System.out.println(s == "a");
		
		s = new String("a");
		System.out.println(s == "a");
		
		s = new String("a");
		System.out.println(s == "a");
		System.out.println(s.equals("a"));

	}

}
