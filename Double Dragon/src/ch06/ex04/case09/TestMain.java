package ch06.ex04.case09;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShinhanBank shinhan = new ShinhanBank(0.01);
		System.out.printf("interest: %.1f%%",
				shinhan.getRate()*100);

	}

}
