package ch02.Domowa.Praca;

public class H01_Replace {
	public static void main(String[] args) {
		
		/*
		change the 2 values.
		a:1 b:2
		a:2, b:1
		 */
		
		int a = 1;
		int b = 2;
		int bb = 0;
		
		System.out.printf("a: %d, b: %d\n",  a,b);
		
		bb = a;
		a = b;
		b = bb;
		System.out.printf("a: %d, b: %d\n", a, b);
		
	
	}

}
