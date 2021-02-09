package ch06.ex05.case11;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AppleSW apple = new AppleSW();
		GoogleSW google = new GoogleSW();
		
		Tesla car1 = new Tesla(apple);
		Tesla car2 = new Tesla(google);
		
		car1.start();
		car1.stop();
		car1.klaxon();
		System.out.println();
		
		car2.start();
		car2.stop();
		car2.klaxon();
		

	}

}
