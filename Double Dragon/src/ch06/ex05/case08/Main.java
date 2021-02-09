package ch06.ex05.case08;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inVal = 1;
		
		String msg = "";
		switch(inVal) {
		case 1: msg = "added"; break;
		case 2: msg = "deleted"; 
		}
		
		switch(inVal) {
		case Code.USER_ADD: msg = "Added"; break;
		case Code.USER_DEL: msg = "deleted";
		}

	}

}
