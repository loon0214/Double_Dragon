package ch02.ex02;

public class C01_Int {
	public static void main(String[] args_) {
		int x = 10; //decimal, 10진수
		System.out.println(Integer.toBinaryString(x));
		
		x = 012; //octal, 8진수
		System.out.println(Integer.toBinaryString(x));
		
		x = 0xA; //hexadecimal, 16진수
		System.out.println(Integer.toBinaryString(x));
		
		x = 0b1010; //binary, 2진
		System.out.println(Integer.toBinaryString(x));
		
		x = 1_234_567;
		System.out.println(x);
		
		double y = 1e1;
		System.out.println(y);
	}

}
