package ch07.ex03.case03;

public interface Cosmos {
	public static Animal getAnimal(String aniName) {
		Animal animal = null;
		
		switch(aniName) {
		case "Falcon": animal = new Falcon(); break;
		case "Tiger" : animal = new Tiger();
		}
		
		return animal;
	}

}
