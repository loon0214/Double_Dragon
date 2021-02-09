package ch07.ex01.case11.user.domain;

public class User {
	private String userName;
	private int point;
	
	public User(String userName, int point) {
		this.userName = userName;
		this.point = point;
	}
	
	public String toString() {
		return String.format("Name: %s\nPoint: %d",
				userName, point);
	}
}