import java.io.*;
import java.lang.*;

class Sq{
	public void squares(){
			int num,squ;
			System.out.println("Enter the number");
			DataInputStream dis=new DataInputStream(System.in);
			num=Integer.parseInt(dis.readLine());
			squ=num*num;
			System.out.println("The square of"+num+" is "+squ);
	}
}

class Square{
	public static void main(String args[]){
		
		try{
			Sq s=new Sq();
			s.squares();
		}
		catch(IOException e){
			System.out.println("error"+e);
		}
	}
}
