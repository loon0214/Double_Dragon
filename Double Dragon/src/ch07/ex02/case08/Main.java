package ch07.ex02.case08;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal[] animals = new Animal[3];
		animals[0] = new Cat();
		animals[1] = new Cat();
		animals[2] = new Eagle();
		
		for(Animal animal:animals) {
			animal.eat();
		//	animal.move();
		}
		System.out.println();
		
		((Cat)animals[1]).move();
		((Eagle)animals[2]).move();

	}

}
