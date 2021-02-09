package ch02.ex03;

public class C03_String_Int {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 1;
		String str = "" + i;
		System.out.println(str);
		
		str = "1";
		i = Integer.parseInt(str);
		
		str = "1";
		i = Integer.parseInt(str);
		int result = i + 1;
		System.out.println(result);

	}

}
