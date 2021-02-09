package ch04.ex03;

public class C02_Drawing_lots {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int random = 1;
		int cnt = 0; // pick up times *count
		
		while(!(random % 3 ==0)) {
			cnt++;
			random = (int)(Math.random() * 100) +1;
		}
		System.out.printf("picked up %d times, found %d",
				cnt,random);
	}
}
