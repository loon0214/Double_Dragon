package ch07.ex02.case14;

public class Dog {
	private String name;
	
	public Dog(String name) {
		this.name = name;
	}
	
	public void eat() {
		System.out.println(name + "eat");
	}
	@Override
	public String toString() {
		return name;
	}

}
