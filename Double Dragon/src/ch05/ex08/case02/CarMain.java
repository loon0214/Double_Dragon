package ch05.ex08.case02;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		car.setColor("nibieski");
		car.setDoor(4);
		System.out.println(car);
		
		car = new Car("czarwona", 2);
		System.out.println(car);

	}
}