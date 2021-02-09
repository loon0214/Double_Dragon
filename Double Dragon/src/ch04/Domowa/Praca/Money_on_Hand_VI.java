package ch04.Domowa.Praca;

public class Money_on_Hand_VI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*
	 trying buy item which cost is 30$
	 take the bills out of your wallet several times
	 and hold them on hands.
	 assume that there is no 50$.
	 
	 takes out A$
	 takes out B$
	 takes out C$
	 got the A+B+C $ on the hands
	 */
		
		int hand = 0; // money on the hands
		int price = 30; //item's price
		int paper = 0; // bill from wallet
		while(hand < price) {
			paper = (int)(Math.random()*10)+1;
			System.out.println(paper + "$ has been took ");
			hand += paper;
		}
		System.out.println(hand + "$ on the hands");
	}
}