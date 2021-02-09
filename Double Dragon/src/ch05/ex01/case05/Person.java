package ch05.ex01.case05;

public class Person { //#3
	String name;
	int age;
	
	void setName(String myName) {
		if(myName.charAt(0)=='B')
			name = myName;
		else name = "unknown";
	}
	
	void setAge(int myAge) {
		if(20<= myAge && myAge <=29)
			age = myAge;
		else age = 0;
	}
	
	String getName(int level) {
		String myName = "";
		if(level>5) myName = name;
		else myName = "secret";
		return myName;
	}
	
	int getAge(int level) {
		int myAge = 0;
		if(level > 5) myAge = age;
		else myAge = 888888;
		return myAge;
	}
}