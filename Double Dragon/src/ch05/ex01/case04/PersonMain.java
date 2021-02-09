package ch05.ex01.case04;

public class PersonMain { //#3

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person person = new Person();
		person.setName("Basia");
		person.setAge(24);
		
		System.out.printf("Name: %s, Age: %d",
				person.getName(), person.getAge());
	}
}