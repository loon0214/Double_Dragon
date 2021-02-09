package ch02.ex02;

public class C13_Str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer src = new StringBuffer("moja zona ");
		
		int len = src.length();
		System.out.println("length: " + len);
		
		src.append("kocha mnie.");
		src.replace(5, 9, "croka");
		System.out.printf("%s",  src);
		
		String str = src.toString();

	}

}
