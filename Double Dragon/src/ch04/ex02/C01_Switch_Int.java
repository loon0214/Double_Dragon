package ch04.ex02;

public class C01_Switch_Int {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int grade = 3;
		String coupon = "";
		
		switch(grade) {
		case 3: coupon += "10$ ";
		case 2: coupon += "5$ ";
		case 1: coupon += "1$ ";
		}
		System.out.println(coupon + "has been given");
	}
}
