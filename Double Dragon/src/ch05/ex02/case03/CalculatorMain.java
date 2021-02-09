package ch05.ex02.case03;

public class CalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc = new Calculator();
		
		System.out.println("++: " + calc.add(1, 2));
		System.out.println("--: " + calc.minus(3,4));
		System.out.println("**: " + calc.multiply(5,6));
		System.out.println("//: " + calc.divide(7,8));

	}
}