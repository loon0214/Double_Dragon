package ch05.ex07.case02;

public class Stack {
	public void first() {
		int a = 0;
		System.out.println("first() start");
		this.second();
		System.out.println("first() Exit");
	}
	
	public void second() {
		int a = 0;
		System.out.println("second() start");
		System.out.println("second() Exit");
	}
}