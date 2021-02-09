package ch05.ex01.case02;

public class TimeMain { //#4

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Time time = new Time();
		time.hour = 12;
		time.minute = 35;
		time.second = 30;
		System.out.printf("%dhour %dmin %dsec\n",
				time.hour, time.minute, time.second);
		
		System.out.printf("%s", time);
	}
}