//논리 연산
package ch03.ex08;

public class Logical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(2>1 && 2>1);
		System.out.println(2<1 && 2>1);
		System.out.println(2<1 || 2>1);
		System.out.println();
		
		int a = 0, b = 0;
		System.out.println(++a<0 && ++b<0);
		//if first calc is false,
		//they dnt calc next one.
		System.out.printf("a:%d, b:%d\n", a,b);
		
		a = b = 0;
		System.out.println(++a>0 || ++b<0);
		System.out.printf("a:%d, b:%d",a,b);
		
		
		

	}

}
