package ch06.ex05.case09;

public interface Animal {
	public default void eat() {
		System.out.println("eat by Mouth");
		
	}
	void move();

}
