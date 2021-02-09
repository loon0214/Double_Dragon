package ch05.ex02.case02;

public class ArithMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arith arith = new Arith();
		arith.setFirstNum(3);
		arith.setSecondNum(2);
		
		System.out.println("+++: " + arith.add());
		System.out.println("---:" + arith.minus());
		System.out.println("***:" + arith.multiply());
		System.out.println("///:" + arith.divide());
	}
}