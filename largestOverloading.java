import java.io.*;
class largestOverloading{
	public static void main(String args[]){
		largestOfNum s=new largestOfNum();
		int y=s.largest(1,2);
		System.out.println("The largest of int and int is "+y);
		float z=s.largest(1,2.5F);
		System.out.println("The largest of int and float is "+z);
		float x=s.largest(1.1F,2.1F);
		System.out.println("The largest of float and float is "+x);
		float a=s.largest(1.3F,2);
		System.out.println("The largest of float and int is "+a);
	}
}
class largestOfNum{
	
	int largest(int a,int b){
		return a>b?a:b;
		}
	float largest(int a,float b){
		return a>b?a:b;
	}
	float largest(float a,float b){
		return a>b?a:b;
	}
	float largest(float a,int b){
		return a>b?a:b;
	}
}