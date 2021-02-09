package ch03.ex04;

public class C01_Arith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte a = 3;
		byte b = 2;
	//  byte c = a + b; compile error: result type is int
		
		byte c = (byte)(a + b);
		System.out.println(c);
		
	//	c = c + 1; compile error: result type is int
		c++;
		System.out.println(c);
		
		double d = a/b;
		System.out.println(d);
		
		//Dobrze
		d = (double)a/b;
		System.out.println(d);
		d = 1.0 * a/b;
		System.out.println(d);
		
		//zle
		d = (double)(a/b);
		System.out.println(d);
		d = a/b * 1.0;
		System.out.println(d);
		

	}

}
