package ch07.ex03.case02;

public class Alien extends Life {
//	@Override
	public static void eat() {
		System.out.println("Alien eat");
	}
	
	@Override
	public void shout() {
		System.out.println("Alien shout");
	}
	
	public static void main(String[] args) {
		Life alien1 = new Alien();
		Alien alien2 = new Alien();
		
		alien1.eat(); Life.eat();
		alien1.shout();
		System.out.println();
		alien2.eat(); Alien.eat();
		alien2.shout();
	}

}
