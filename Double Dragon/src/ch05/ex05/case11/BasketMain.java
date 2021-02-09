package ch05.ex05.case11;

public class BasketMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple apple = new Apple();
		apple.setPrice(1);
		
		Basket basket = new Basket();
		basket.setApple(apple);
		System.out.println(basket.getApple().getPrice()+"$");
	}
}