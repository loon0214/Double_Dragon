package ch03.ex09;

public class C02_Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score = 50;
		char grade = score >= 90 
				?'A':(score >=80? 'B':'C');
		System.out.println(grade);

	}

}
