import java.io.*;
import java.lang.*;
class Rev{
	public int Rev_num(int num){
		int x=0,temp=0;
		while(num>0){
			x=x*10;
			x=x+(num%10);
			
			num=num/10;
			
		}
		return x;
	}
}
class Reverse_num{
	public static void main(String args[]){
		try{
			int num,Reverse;
			System.out.println("Enter the digit");
			DataInputStream dis= new DataInputStream(System.in);
			num=Integer.parseInt(dis.readLine());
			Rev R = new Rev();
			Reverse=R.Rev_num(num);
			System.out.println("the sum of number is "+Reverse);
		}
		catch(IOException e){
			System.out.println(e);
		}
	}
}