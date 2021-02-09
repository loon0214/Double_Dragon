package ch04.ex01;

public class C06_Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score = 82;
		String grade = "";
		
		System.out.println("score: " + score);
		if(score >= 90) {
			grade = "A";
			if(score >= 98) grade += "+";
			else if(score < 94) grade += "-";
		}else if(score >= 80) {
			grade = "B";
			if(score >= 88) grade += "+";
			else if(score < 84) grade += "-";
		}else grade = "C";
		
		System.out.println("Grade: " + grade);
	}
}
