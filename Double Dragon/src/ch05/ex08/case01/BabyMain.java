package ch05.ex08.case01;

public class BabyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Baby baby = new Baby();
		System.out.println(baby.getName());
		baby.setName("kotek");
		System.out.println(baby.getName());
		
		baby = new Baby("kotka");
		System.out.println(baby.getName());

	}
}