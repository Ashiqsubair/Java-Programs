import java.io.*;
class ConsDemo{
	public static void main(String args[]){
		Demo d=new Demo();
		Demo d1=new Demo(10,"Rajagiri");
		d1.incre();
	}
}
class Demo{
	int a;
	String b;
	Demo(){
		System.out.println("Constructor is created without argument");
	}
	Demo(int x,String y){
		b=y;
		a=x;
		System.out.println(y);
		System.out.println(x);
	}
	void incre(){
		a++;
		System.out.println(a);
		System.out.println(b+" is my college.");
	}
}