package ch07.ex03.case03;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Animal> zoo = new ArrayList<>();
		zoo.add(new Falcon());
		zoo.add(new Tiger());
		
		for(Animal animal:zoo) {
			animal.eat();
			animal.move();
		}
		System.out.println();
		
		zoo.clear();
		zoo.add(Cosmos.getAnimal("Falcon"));
		zoo.add(Cosmos.getAnimal("Tiger"));
		
		for(Animal animal:zoo) {
			System.out.println(animal);
			animal.eat();
			animal.move();
		}
	}
}