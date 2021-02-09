package ch05.ex04.case04;

public class Sequence {
	private static int zero; //base Number
	private int now; //Current Number
	
	public static void setZero(int myZero) {
		Sequence.zero = myZero;
	}
	public int next() {
		now = zero++;
		return now;
	}
}