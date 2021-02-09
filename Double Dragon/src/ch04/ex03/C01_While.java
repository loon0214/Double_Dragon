package ch04.ex03;
// while: Jump rope until you got 60kg.
public class C01_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int weight = 88;
		int jumpCnt = 0;
		while (weight > 60) {
			jumpCnt++;
			weight--;
		}
		System.out.printf("Jump rope %d times, you got weight %dkg",
				jumpCnt,weight);
	}
}
