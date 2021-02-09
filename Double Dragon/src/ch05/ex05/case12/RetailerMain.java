package ch05.ex05.case12;

public class RetailerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Farmer farmer = new Farmer();
		Retailer retailer = new Retailer();
		
		Apple apple = retailer.sell(farmer.sell(1));
		System.out.println(apple.getPrice()+"$");
	}
}