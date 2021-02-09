package ch06.ex03.case05;

public class Circle extends Point {
	private int r;
	
	public Circle(int x, int y, int r) {
		super(x,y);
		this.r = r;
	}
	public String toString() {
		return String.format("(%d,%d) %d",
				this.getX(), this.getY(), this.r);
	}
}