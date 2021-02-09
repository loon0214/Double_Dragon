package ch04.ex01;

public class C04_Condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 3;
		if(0<a && a<4)
			System.out.println("1~3");
		
		char c = 'b';
		if('a'<c && c<'e')
			System.out.println("b~d");
		
		int x = 0;
		int y = 0;
		if((x = 1+2)>0 || (y = 1-2)>0)
			System.out.printf("x:%d, y:%d\n", x,y);
		
		String s = "she";
		if(s.equals("she") || s.equals("SHE"))
				System.out.println("she");
		
		if(s != null && !s.contentEquals(""))
			System.out.println("there are character String");
		
		boolean flag = false;
		if(!flag) {
			System.out.println("turn on the power");
		}
		

	}

}
