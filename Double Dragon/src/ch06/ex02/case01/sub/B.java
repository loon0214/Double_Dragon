package ch06.ex02.case01.sub;

import ch06.ex02.case01.A;

public class B extends A{  
	public void test() {
		A test = new A();
		int x = 0;
	//	x = test.a;		private
	//	x = test.b;		default
	//	x = test.c;		protected	
		x = test.d;		
		
	//	test.m1();
	//	test.m2();
	//	test.m3();
		test.m4();
	}
}

	//nie rozumiem
	//dlaczego m3 nie pracowac.