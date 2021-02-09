package ch04.Domowa.Praca;

public class Game369_V {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~99, make the 369 game
		
		int one = 0; //ten digit
		int two = 0; //first digit
		
		for(int i=1; i<100; i++) {
			one = i/10;
			two = i%10;
			System.out.print(" " +i);
			
			if(one!=0 && one%3==0)
				System.out.print("clap");
			if(two!=0 && two%3==0)
				System.out.print("clap");
			if(i%10==0)
				System.out.println();
		}
	}
}
