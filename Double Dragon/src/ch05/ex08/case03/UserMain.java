package ch05.ex08.case03;

import java.util.Date;

public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user1 = new User("bibi",26, new Date());
		User user2 = new User("basia", 24, new Date());
		
		User user3 = new User();
		user3.setUserName("Luna");
		user3.setAge(33);
		user3.setRegDate(new Date());
		
		System.out.printf("%s\n%s\n%s", user1, user2,user3);
	}
}