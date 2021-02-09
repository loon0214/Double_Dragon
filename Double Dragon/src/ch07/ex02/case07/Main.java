package ch07.ex02.case07;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal[] animals = new Animal[3];
		animals[0] = new Cat("kitty");
		animals[1] = new Dog("kowalski");
		animals[2] = new Dog("walawender");
		
		for(Animal animal:animals)
			System.out.println(animal);

	}

}
