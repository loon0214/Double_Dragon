package ch02.ex02;

public class C11_Str {
	public static void main(String[] args) {
	
	int a = 1, b = 2, c = 3;
	int sum = a + b + c;
	System.out.printf("sum: %d\n", sum);
	
	String numStr = "" + a;
	System.out.println("numStr:  "+ numStr);
	
	String concat = "" + a + b + c;
	System.out.println("concat: " +concat);
	
	concat = a + b + "" + c;
	System.out.println("concar: "+ concat);
	
	String dialog = "Daria Mowi," + "\"czesc\".";
	System.out.println(dialog);
	
	
	}
}
