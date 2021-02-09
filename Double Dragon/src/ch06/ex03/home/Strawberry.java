package ch06.ex03.home;

public class Strawberry extends IceCream {
	private int price;
	
	public Strawberry(String name, int price) {
		super(name);
		this.price = price;
	}
	
	public String toString() {
		return String.format("%s iceCream, %d$",
				this.name, this.price);
	}

}
