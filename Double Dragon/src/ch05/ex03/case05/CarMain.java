package ch05.ex03.case05;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
		Car car2 = new Car();
		
		car1.setPrice(80000);
		car1.setBrand("Tesla");
		car2.setPrice(15000);
		car2.setBrand("Mercedes");
		
		car1.startUp();
		car2.startUp();
	}
}