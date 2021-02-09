package ch05.ex05.case08;

public class ArithMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Paper paper = new Paper();
		Arith arith = new Arith();
		
		paper.setX(10);
		arith.toHalf(paper);
		System.out.println(paper.getX());
	}
}