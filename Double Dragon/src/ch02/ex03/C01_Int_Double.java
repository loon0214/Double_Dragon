package ch02.ex03;

public class C01_Int_Double {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 1;
		double d = 0.0;
		
		d = i;
		System.out.println(d);
		d = (double)i;
		System.out.println(d);
		
		//i = d; compile error
		
		i = (int)d;
		System.out.println(i);
		System.out.println(d);

	}

}
