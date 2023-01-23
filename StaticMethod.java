import java.io.*;
import java.lang.*;
class StaticMethod{
	static{
		System.out.println("Static method is running first");
		
	}
	public static void main(String args[]){
		System.out.println("Main function");
	}
}