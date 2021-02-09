package ch07.ex02.case05;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat[] cats = new Cat[3];
		cats[0] = new Cat("coco");
		cats[1] = new Cat("kotek");
		cats[2] = new Cat("kotka");
	//	cats[2] = new Dog();
		
		for(Cat cat:cats) System.out.println(cat);

	}

}
