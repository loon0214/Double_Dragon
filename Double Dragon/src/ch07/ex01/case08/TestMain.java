package ch07.ex01.case08;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clerk clerk = new Clerk();
		Flower flower = null;
		
		flower = clerk.sell("lily");
		System.out.println(flower);
		flower = clerk.sell("Rose");
		System.out.println(flower);

	}

}
