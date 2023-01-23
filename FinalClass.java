import java.io.*;
import java.lang.*;
class FinalClass{
	public static void  main(String args[]){
		Cat c= new Cat();
		c.eats();
	}
}
final class Animal{
	Animal(){
		System.out.println("Constructor for animal class");
	}
	public void eats(){
		System.out.println("Animal Eats food");
	}
}
class Cat extends Animal{
	public void eats(){
		System.out.println("Cat Eats food");
	}
}