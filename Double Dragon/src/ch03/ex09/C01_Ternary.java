//삼항 연산
package ch03.ex09;

public class C01_Ternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = -10;
		
		int absX = (x >= 0) ? x : -x;
		int absY = (y >= 0) ? y : -y;
		
		System.out.println(absX);
		System.out.println(absY);

	}

}
