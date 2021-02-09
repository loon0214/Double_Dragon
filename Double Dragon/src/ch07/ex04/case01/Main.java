package ch07.ex04.case01;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day day = Day.TUE;
		
		String dayName = "";
		switch(day) {
		case MON: dayName = "Monday"; break;
		case TUE: dayName = "Tuesday"; break;
		default:  dayName = "wed ~ sun";
		}
		
		System.out.println(dayName);

	}

}
