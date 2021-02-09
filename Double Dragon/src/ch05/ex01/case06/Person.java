package ch05.ex01.case06;

public class Person { //#3
	private String name;
	private int age;
	
	public void setName(String myName) {
	if(myName.charAt(0)=='B')
		name = myName;
	else name = "Unknown";
	}
	
	public void setAge(int myAge) {
		if(20<=myAge && myAge<=29)
			age = myAge;
		else age = 0;
	}
	
	public String getName(int level) {
		String myName = "";
		if(level>5) myName = name;
		else myName = "Secret";
		return myName;
	}
	
	public int getAge(int level) {
		int myAge = 0;
		if(level>5) myAge = age;
		else myAge = 88888888;
		return myAge;
	}	
}