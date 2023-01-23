import java.io.*;
import java.lang.*;

class SuperVariable{
	public static void main(String args[]){
		Cats c= new Cats();
		c.print();
	}
}
class Animal{
	Animal(){
		System.out.println("Constructor called");
	}
	String Colour="Black";
	void eats(){
		System.out.println("The colour of animal "+Colour);
	}
}
class Cats extends Animal{
	void print(){
		System.out.println("The colour of cat is "+super.Colour);
		eats();
	}
}