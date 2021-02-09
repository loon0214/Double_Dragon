package ch06.ex04.case07;

public class Shoes extends Product {
	private int price;
	
	public Shoes(int price) {
		super(price);
		this.price = price;
		
	}
	@Override
	public int getPrice() {
		return this.price;
	}
	
	public String toString() {
		return String.format("sell as %d$, half discount for %d$",
				this.price, super.price);
	}
}