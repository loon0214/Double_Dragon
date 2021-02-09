package ch05.ex04.case03;

public class Ship {
	private int ppl; // 배별 승선객수
	private static int sum; // 누적 승선객수
	
	public void sail(int ppl) {
		this.ppl = ppl;
		sum += ppl;
	}
	public int getSum() {
		return sum;
	}
}