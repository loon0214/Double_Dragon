package ch02.ex04;

public class C01_Over_flow_Cast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte b = 10;
		int i = b;
		i = (int)b;
		System.out.println(i);
		
		int i2 = 300;
		byte b2 = (byte)i2;
		System.out.println(b2);

	}

}
