package ch05.ex04.case03;

public class ShipMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ship ship1 = new Ship();
		Ship ship2 = new Ship();
		Ship ship3 = new Ship();
		
		ship1.sail(100);
		ship2.sail(200);
		ship3.sail(300);
		
		System.out.printf("Passenger number of ferry terminal is %d.\n",
				ship1.getSum());
		System.out.printf("Passenger number of ferry terminal is %d.\n",
				ship2.getSum());
	}
}