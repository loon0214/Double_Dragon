package ch06.ex02.case02;

public class Parent {
	private int id; //regidence registration number
	private String name;
	private int wealth; // amount of property
	
	private int getId() {
	return id;

}
	public String getName() {
		return name;
	}
	protected int getWealth() {
		return wealth;
	}
	void addMoney(int money) {
		this.wealth += money;
	}
}