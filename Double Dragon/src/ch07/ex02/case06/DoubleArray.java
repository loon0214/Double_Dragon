package ch07.ex02.case06;

public class DoubleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] score = {
				{90,90,90},
				{20,20,20},
				{30,30,30},
				{40,40,40},
				{50,50,50}
				
		};
		
		System.out.println("num Kor Eng Math sum avg");
		System.out.println("===========================");
		
		for(int i=0; i<score.length; i++) {
			int sum = 0;
			System.out.print(" " + (i+1) + " ");
			
			for(int j = 0; j<score[i].length; j++) {
				sum += score[i][j];
				System.out.printf("%4d",  score[i][j]);
			}
			System.out.printf("%4d %3d\n", sum, sum/score[i].length);
		}
		System.out.println("===========================");

	}

}
