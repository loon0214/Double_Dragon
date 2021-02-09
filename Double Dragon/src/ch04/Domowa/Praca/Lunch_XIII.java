package ch04.Domowa.Praca;

public class Lunch_XIII { // #10
	/*
	 eat more than 30 cal.
	 if you eat spoiled food, stop eating.
	 spoiled food is, 5 times for calories value.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cal = 0; // sum calories
		int food = 0; // random food calories 1~10
		boolean status = true; // food's status
		
		while(cal < 30 && status) {
			food = (int)(Math.random()*10)+1;
			System.out.print(food + "cal.");
			if(food%5 == 0) {
				status = false;
				System.out.println(" spit");
			}else {
				System.out.println(" eat.");
				cal += food;
			}
		}
		System.out.println();
		System.out.println("ate " +cal+ " cal");
	}
}