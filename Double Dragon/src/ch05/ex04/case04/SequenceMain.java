package ch05.ex04.case04;

public class SequenceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sequence seq1 = new Sequence();
		Sequence seq2 = new Sequence();
		
		Sequence.setZero(1);
		System.out.printf("seq1: %d\n",seq1.next());
		System.out.printf("seq2: %d\n",seq2.next());
		System.out.printf("seq2: %d\n\n",seq2.next());
		
		Sequence.setZero(11);
		System.out.printf("seq1: %d\n",seq1.next());
		System.out.printf("seq2: %d\n",seq2.next());
		System.out.printf("seq1: %d\n\n",seq1.next());
	}
}