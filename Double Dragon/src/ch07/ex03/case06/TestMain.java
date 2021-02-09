package ch07.ex03.case06;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shooter shooter = new Shooter();
		Smith smith = new Smith();
		
		shooter.fire(()-> System.out.println("Bang Bang"));
		shooter.fire(smith.makeGun());
	}
}