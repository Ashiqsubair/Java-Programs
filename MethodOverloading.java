import java.io.*;
class MethodOverloading{
	public static void main(String args[]){
		SumOfNum s=new SumOfNum();
		int y=s.sum(1,2);
		System.out.println("The sum of int and int is "+y);
		float z=s.sum(1,2.5F);
		System.out.println("The sum of int and float is "+z);
		float x=s.sum(1.1F,2.1F);
		System.out.println("The sum of float and float is "+x);
		float a=s.sum(1.3F,2);
		System.out.println("The sum of float and int is "+a);
	}
}
class SumOfNum{
	
	int sum(int a,int b){
		return (a+b);
		}
	float sum(int a,float b){
		return (a+b);
	}
	float sum(float a,float b){
		return (a+b);
	}
	float sum(float a,int b){
		return (a+b);
	}
}