package ch03.Domowa.Praca;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		int Kor, Eng, Math = 0;
		int sum = 0;
		double avg = 0.0;
		char grade = 0;
		
		System.out.print("Korean: ");
		Kor = s.nextInt();
		System.out.print("English: ");
		Eng = s.nextInt();
		System.out.print("Math: ");
		Math = s.nextInt();
		
		sum = Kor + Eng + Math;
		avg = sum / 3.0;
		
		grade = avg >= 90 ? 'A':
		(avg >= 80 ? 'B':(avg >= 70 ? 'C' : 'D'));
		
		System.out.printf("Total score: %d\nAverage: %.1f\nGrade: %c",
				sum, avg, grade);
		
		s.close();
		

	}

}
