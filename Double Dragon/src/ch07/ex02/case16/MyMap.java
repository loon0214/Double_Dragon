package ch07.ex02.case16;

import java.util.HashMap;
import java.util.Map;

public class MyMap {
	public static void main(String[] args) {
		Map<Integer, User> map = new HashMap<>();
		map.put(1, new User("Basia"));
		map.put(1, new User("aga"));
		map.put(1, new User("shy"));
		map.put(1, new User("mimi"));
		System.out.println(map);
		
		User user = map.get(1);
		System.out.println(user);
		System.out.println(map);
		
		map.remove(1);
		System.out.println(map);
	}

}
