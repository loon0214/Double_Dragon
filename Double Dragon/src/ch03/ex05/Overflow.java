package ch03.ex05;

public class Overflow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 1000000;
		int b = 1000000;
		long c = a*b;
		System.out.println(c);
		c = a*(long)b;
		System.out.println(c);
		
		int x = 1000000 * 1000000 / 1000000;
		int y = 1000000 / 1000000 * 1000000;
		System.out.println(x);
		System.out.println(y);
	}

}
