//실수 소소줌 이하 자리수 조정하
package ch03.ex04;

public class C02_Decimal_Point {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double pi = 3.141592;
		
		double shortPi = (int)(pi*10) / 10d;
		System.out.println(shortPi);
		
		shortPi = (int)(pi * 1000) / 1000d;
		System.out.println(shortPi);
		
		shortPi = Math.round(pi*1000)/1000d;
		System.out.println(shortPi);

	}

}
