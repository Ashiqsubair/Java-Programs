import java.io.*;
import java.lang.*;
class StaticVariable{
	static int x=10;
	static int y=20;
	public static void main(String args[]){
		System.out.println("Main function");
		System.out.println("x="+x);
		fn();
	}
	static void fn(){
	System.out.println("y="+y);
	}
}