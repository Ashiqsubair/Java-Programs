import java.io.*;
import java.lang.*;
class SingleInheritance{
	public static void main(String args[]){
		Child c= new Child();
		c.fn();
	}
}
class Parent{
		int x=20;
		int y=40;
		void fn(){
			System.out.println("x is parent value: "+x);
		}
	}
class Child extends Parent{
	int x=23;
	void fn(){
		System.out.println("x is child value: "+x);
		System.out.println("y is child value: "+y);
	}
}
	

