package ch06.ex03.case06.home;

public class Point {
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return String.format("(%d, %d)",x,y);
	}

}
