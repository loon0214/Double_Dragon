package ch04.ex02;

public class C03_Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score = 95;
		char grade = 0;
		
		switch(score/10){
			case 10: case 9: grade = 'A'; break;
			case 8: grade = 'B'; break;
			case 7: grade = 'C'; break;
			default: grade = 'D';
		}
		System.out.println(grade);
	}
}
