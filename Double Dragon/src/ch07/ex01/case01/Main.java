package ch07.ex01.case01;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c = new C();
		B b = c;
		A a = c;
		
		
		a = (A)a;
		a = (A)b;
		a = (A)c;
		
		b = (B)a;
		b = (B)b;
		b = (B)c;
		
		c = (C)a;
		c = (C)b;
		c = (C)c;
		

	}

}
