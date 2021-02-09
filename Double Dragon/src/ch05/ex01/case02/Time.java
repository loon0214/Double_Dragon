package ch05.ex01.case02;

public class Time { //#4
	int hour;
	int minute;
	int second;
	
	public String toString() {
		return String.format("%dhour %dmin %dsec",
				hour, minute, second);
	}
}