package ch03.ex03;

public class BitWise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 10;
		System.out.printf("%s, %d\n",
		"000000000"+Integer.toBinaryString(x),x);
		
		x = ~ x;
		System.out.printf("%s, %d\n",Integer.toBinaryString(x),x);
		x = x+1;
		System.out.printf("%s, %d", Integer.toBinaryString(x),x);
	}

}
