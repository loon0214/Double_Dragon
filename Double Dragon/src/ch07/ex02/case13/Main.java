package ch07.ex02.case13;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Cat> house = new ArrayList<>();
		house.add(new Cat("cathy"));
		house.add(new Cat("newby"));
		house.add(new Cat("hyebi"));
		
		for(Cat cat:house)cat.eat();
	}
}