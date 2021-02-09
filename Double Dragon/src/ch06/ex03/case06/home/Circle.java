package ch06.ex03.case06.home;

public class Circle {
	private Point point;
	private int r;
	
	public Circle(Point point, int r) {
		this.point = point;
		this.r = r;
	}
	
	public String toString() {
		return String.format("%s %d", point, r);
	}

}
