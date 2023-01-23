import java.io.*;
import java.lang.*;
class FinalMethod{
	public static void  main(String args[]){
		Cat c= new Cat();
		c.eats();
	}
}
class Animal{
	Animal(){
		System.out.println("Constructor for animal class");
	}
	public final void eats(){
		System.out.println("Animal Eats food");
	}
}
class Cat extends Animal{
	public void eats(){
		System.out.println("Cat Eats food");
	}
}