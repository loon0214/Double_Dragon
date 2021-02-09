package ch05.ex08.case02;

public class Car {
	private String color;
	private int door;
	
	public Car() {}
	
	public Car(String color, int door) {
		this.color = color;
		this.door = door;
	}
	
	public String getColor() {
		return color;
	}
	
	int getDoor() {
		return door;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	void setDoor(int door) {
		this.door = door;
	}
	
	public String toString() {
		return String.format("%s car with %d door",
				color ,door);
	}
}