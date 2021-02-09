package ch03.Domowa.Praca;

public class Adjust {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 Using the % operator
		 convert a real number 3.141592 to 3.0
		 */
		
		double f = 3.141592;
		
		double result = f - f%1;
		System.out.println(result);
		
		result = Math.floor(f);
		System.out.println(result);
	}

}
