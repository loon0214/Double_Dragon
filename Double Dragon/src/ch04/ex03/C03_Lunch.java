package ch04.ex03;

public class C03_Lunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 eat more than 30 cal.
		 if you eat spoiled food, stop eating.
		 spoiled food is, 5 times for calories value.
		 */
		
		int cal = 0;
		int food = 0;
		
		while(cal < 30) {
			food = (int)(Math.random()*10)+1;
			System.out.print(food + " cal.");
			if(food %5 ==0) { //if spiled food,
				System.out.println("spit");
				break;
			}
			System.out.println("eat.");
			cal += food;
		}
		System.out.println();
		System.out.println("ate " + cal + "cal");
	}
}
		
