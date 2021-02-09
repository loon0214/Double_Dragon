package ch07.ex01.case11.user.presentation;

import ch07.ex01.case11.user.domain.User;
import ch07.ex01.case11.user.service.UserService;

public class UserIo {
	private UserService userService;
	
	public UserIo(UserService userService) {
		this.userService = userService;
	}
	
	public void play() {
		int level = 0;
		User user = null;
		String isRepeat = "";
		
		do {
			level = Console.inNum("type the class");
			user = userService.findUser(level);
			Console.info(user);
			isRepeat = Console.inStr("should I find other User?");
		}while(isRepeat.contentEquals("y"));
	}
}