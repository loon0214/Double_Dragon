package ch04.Domowa.Praca;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
	
		/*
		 after Enter the Kor, Eng, Math Score,
		 output the total, average, grade score.
		 90 ~ A
		 80 ~ B
		 70 ~ C
		 else D
		 
		 Kor:
		 Eng:
		 Math:
		 total:
		 Avg:
		 Grade:
		 */
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Korean: ");
		int Kor = s.nextInt();
		System.out.print("English: ");
		int Eng = s.nextInt();
		System.out.print("Math: ");
		int Math = s.nextInt();
		
		int sum = Kor + Eng + Math;
		double avg = sum/3.0;
		char grade = 0;
		
		if (avg >= 90) grade = 'A';
		else if( avg >= 80) grade = 'B';
		else if(avg >= 70) grade = 'C';
		else grade = 'D';
		
		System.out.printf("Total Score: %d\nAverage: %.1f\nGrade: %s",
				sum,avg,grade);
		s.close();

	}

}
