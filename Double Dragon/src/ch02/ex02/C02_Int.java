package ch02.ex02;

public class C02_Int {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char c = 'A';
		System.out.printf("%c, %s\n",c,Integer.toBinaryString(c));
		
		c = 65;
		System.out.printf("%c, %s\n",c,Integer.toBinaryString(c));

		c = 0x0041;
		System.out.printf("%c, %s\n",c,Integer.toBinaryString(c));
		
		c = '\u0041';
		System.out.printf("%c, %s\n",c,Integer.toBinaryString(c));
	}

}
