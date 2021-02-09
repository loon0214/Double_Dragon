package ch05.ex02.case01;

public class ArithMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arith arith = new Arith();
		arith.setFirstNum(1);
		arith.setSecondNum(2);
		
		int result;
		result = arith.getFirstNum() + arith.getSecondNum();
		result = arith.getFirstNum() - arith.getSecondNum();
		result = arith.getFirstNum() * arith.getSecondNum();
		result = arith.getFirstNum() / arith.getSecondNum();

	}

}
