import java.io.*;
import java.lang.*;
class FinalVariable{
	public static void main(String args[]){
		final int x=10;
		int x=x+1;
		System.out.println("Final value is "+x);
	}
}