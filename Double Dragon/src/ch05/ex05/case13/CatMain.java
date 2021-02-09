package ch05.ex05.case13;

public class CatMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat mama = new Cat();
		mama.setName("kotka");
		
		Cat baby = mama.breed();
		baby.setName("kitten");
		
		System.out.printf("mama: %s\nbaby: %s",
				mama.getName(),baby.getName());
	}
}