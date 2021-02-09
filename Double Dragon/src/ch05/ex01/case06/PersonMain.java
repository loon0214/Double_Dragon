package ch05.ex01.case06;

public class PersonMain { //#2

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person();
		
		person.setName("Basia");
		person.setAge(24);
		System.out.printf("Name: %s, Age:%d\n",
				person.getName(7),person.getAge(7));
		System.out.printf("Name: %s, Age: %d\n", 
				person.getName(3),person.getAge(3));
		
		person.setName("ola");
		person.setAge(33);
		System.out.printf("Name: %s, Age: %d\n", 
				person.getName(7),person.getAge(7));
		
		/* compile Error
		person.name = "hello";
		person.age = 23;
		person,name;
		person.age;
		*/
	}
}