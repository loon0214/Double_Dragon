package ch04.Domowa.Praca;

import java.util.Scanner;

public class Rock_Scissor_Paper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("1.Rock, 2.Scissor, 3.Paper\n>> ");
		int me = s.nextInt();
		int com = (int)(Math.random()*3)+1;
		
		String pick = "";
		
		switch(me) {
		case 1: pick = "Rock"; break;
		case 2: pick = "Scissor"; break;
		case 3: pick = "Paper";
		}
		System.out.println("You: " + pick);		
		
		switch(com){
		case 1: pick = "Rock"; break;
		case 2: pick = "Scissor"; break;
		case 3: pick = "Paper";
		}
		System.out.println("AI bot: " +pick);	
		
		String result = "";
		
		switch(me-com) {
		case -1: case 2: result = "You won"; break;
		case -2: case 1: result = "You lose"; break;
		case 0: result = "Draw";
		}
		System.out.printf(result);
		s.close();
	}
}
