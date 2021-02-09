package ch07.ex01.case07;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human man = new Human();
		Kimchi kimchi = new Kimchi();
		Ramen ramen = new Ramen();
		
		man.eat(ramen);
		man.eat(kimchi);

	}

}
