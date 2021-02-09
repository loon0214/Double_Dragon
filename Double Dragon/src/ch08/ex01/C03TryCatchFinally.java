package ch08.ex01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class C03TryCatchFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintWriter out = null;
		int[] list = {1,2,3};
		
		try {
			out = new PrintWriter(new FileWriter("c:DEV/a.txt"));
			for(int i=0; i<list.length; i++)
				out.println("list["+i+"]: "+list[i]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("Array Exception");
		}catch(IOException e) {
			System.out.println("file Exception");
		}finally {
			if(out != null) out.close();
		}
		System.out.println("END");
	}
}