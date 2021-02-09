package ch08.ex01;

public class C06Throws {
	public void first() {
		try {
			second();
		}catch(Exception e) {
			System.out.println("first: ArithmeticException");
		}
	}
	
	public void second() throws Exception{
		third();
	}
	
	public void third() throws Exception{
		int i = 3/0;
	}
	
	public static void main(String[] args) {
		C06Throws t = new C06Throws();
		t.first();
	}

}
