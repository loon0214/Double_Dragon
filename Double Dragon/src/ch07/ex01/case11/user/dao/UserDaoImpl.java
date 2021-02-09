package ch07.ex01.case11.user.dao;

import ch07.ex01.case11.user.domain.User;

public class UserDaoImpl implements UserDao {

	@Override
	public User getUser(int level) {
		// TODO Auto-generated method stub
		return new User("Walawender", level *100);
	}

}
