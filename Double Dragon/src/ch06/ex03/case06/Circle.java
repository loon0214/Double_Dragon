package ch06.ex03.case06;

public class Circle extends Point{
	private int r;
	
	public Circle(int x, int y, int r) {
		super(x,y);
		this.r = r;
	}
	
	public String toString() {
		return String.format("(%d, %d) %d", x, y, r);
	}
}