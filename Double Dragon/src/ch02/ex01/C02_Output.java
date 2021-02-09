package ch02.ex01;

public class C02_Output {
	public static void main(String[] args) {
		
		int score = 100;
		System.out.println(100);
		System.out.println(score);
		System.out.println(100+1);
		System.out.println(Math.random());
		
		System.out.print(200);
		System.out.print(300);
		System.out.print("\n");
		
		System.out.printf("%b ,%c, %d, %.1f, %s\n",
				true,'a',10,10.15,"hello");
		String name = "Daria";
		int age = 27;
		System.out.printf("%s jest %d rat",name,age);
		System.out.println();
		System.out.println(name + " jest " + age + " rat");
	}

}
