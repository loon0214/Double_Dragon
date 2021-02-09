package ch05.ex01.case05;

public class PersonMain { //#3

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person();
		
		person.setName("Basia");
		person.setAge(24);
		System.out.printf("Name: %s, Age: %d\n",
				person.getName(7), person.getAge(7));
		System.out.printf("Name: %s, Age: %d\n",
				person.getName(3), person.getAge(3));
		
		person.setName("loon");
		person.setAge(33);
		System.out.printf("Name: %s, Age: %d\n",
				person.getName(3), person.getAge(3));
		
		//Still possilbe
		person.name = "kloudia";
		person.age = 23;
		String name = person.name;
		int age = person.age;
	}
}