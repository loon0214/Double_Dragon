package ch02.ex02;

public class C12_Str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String src = "moja zona ";
		String s1, s2, s3;
		char c;
		
		int len = src.length();
		System.out.println("length: " + len);
		
		s1 = src.concat("kocha mnie.");
		s2 = src.replace("zona", "croka");
		s3 = src.substring(0,9);
		c = src.charAt(5);
		System.out.printf("%s\n%s\n%s\n%c", s1, s2, s3, c);

	}

}
