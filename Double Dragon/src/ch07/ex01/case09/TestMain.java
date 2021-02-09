package ch07.ex01.case09;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pistol pistol = new Pistol();
		Rifle rifle = new Rifle();
		Shooter shooter = new Shooter();
		
		shooter.setGun(pistol);
		shooter.fire();
		shooter.setGun(rifle);
		shooter.fire();

	}

}
