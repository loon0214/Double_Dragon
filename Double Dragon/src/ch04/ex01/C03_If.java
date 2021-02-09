package ch04.ex01;

public class C03_If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int hour = 13;
		if(hour < 12) {
			System.out.println("Guten Morgen");
			
		}else if(hour < 18) {
			System.out.println("Guten Nachmittag");
		}else if(hour < 21) {
			System.out.println("Guten Abend");
		}else {
			System.out.println("Gute nacht");
	}
		
		hour = 20;
		String bow = "";
		if(hour < 12) bow = "Guten Morgen";
		else if(hour < 18) bow = "Guten Nachmittag";
		else if(hour < 21) bow = "Guten Abend";
		else bow = "Gute Nacht";
		System.out.println(bow);
		
	}

}
