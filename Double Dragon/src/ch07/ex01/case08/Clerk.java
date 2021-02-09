package ch07.ex01.case08;

public class Clerk {
	public Flower sell(String flowerName) {
		Flower flower = null;
		switch(flowerName) {
		case "Lily":flower = new Lily(); break;
		case "Rose":flower = new Rose();
		
		}
		return flower;
	}
}