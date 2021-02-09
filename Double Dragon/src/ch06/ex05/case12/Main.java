package ch06.ex05.case12;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BusCard card = new BusCard() {
			public void tagOn() {
				System.out.println("tag ON");
			}
			
			public void tagOff() {
				System.out.println("tag OFF");
			}
		};
		
		card.tagOn();
		card.tagOff();

	}

}
