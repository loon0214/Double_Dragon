package ch06.ex02.case01;

public class B {
	public void test() {
		A test = new A();
		int x = 0;
	//	x = test.a;   private
		x = test.b; //default
		x = test.c; //protected
		x = test.d; //public
		
	//	test.m1();
		test.m2();
		test.m3();
		test.m4();
		
	}

}
