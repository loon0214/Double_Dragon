package ch04.ex01;

public class C02_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int visitCnt = 0;
		
		if(visitCnt < 1) {
			System.out.println("first Visit");
			visitCnt++;
		}else {
			System.out.println("revisit");
		}
		System.out.println();
		
		if(visitCnt < 1) 
			System.out.println("first Visit");
		else System.out.println("revisit");

	}

}
