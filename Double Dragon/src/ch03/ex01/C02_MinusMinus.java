package ch03.ex01;

public class C02_MinusMinus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 9;
		--i;
		System.out.println(i);
		i--;
		System.out.println(i);
		
		i = 9;
		int j = --i;
		System.out.printf("i:%d, j:%d\n", i,j);
		i = 9;
		j = i--;
		System.out.printf("i:%d, j:%d", i,j);

	}

}
