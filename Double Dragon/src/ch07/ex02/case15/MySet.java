package ch07.ex02.case15;

import java.util.HashSet;
import java.util.Set;

public class MySet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(1);
		
		System.out.println(set);

	}

}
