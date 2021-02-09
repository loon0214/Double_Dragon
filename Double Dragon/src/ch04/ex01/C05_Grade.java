package ch04.ex01;

public class C05_Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score = 45;
		char grade = 0;
		
		if(score >= 90) grade = 'A';
		else if(score >= 80) grade = 'B';
		else grade = 'C';
		
		System.out.println(grade);
	}
}
