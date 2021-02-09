package ch08.ex01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class C04TryWithResource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = {1,2,3};
		try(PrintWriter out
				= new PrintWriter(new FileWriter("c:/DEV/ch08.ex04"));
			PrintWriter out2
			= new PrintWriter(new FileWriter("c:/DEV/ch08.ex04.case04.2.txt"))){
		for(int i=0; i<list.length; i++) {
			out.println("list["+i+"]: "+list[i]);
			out2.println("list["+i+"]: "+list[i]);
		}
	}catch(ArrayIndexOutOfBoundsException e) {
		System.err.println("Array Exception");
	}catch(IOException e) {
		System.err.println("File Exception");
	}
		System.out.println("END");
	}
}
