import java.io.*;
class Swap{
	public static void main(String args[]){
		try{
			String num1,num2,num3;
			System.out.println("Enter the numbers two numnber");
			DataInputStream dis=new DataInputStream(System.in);
			num1=dis.readLine();
			num2=dis.readLine();
			
			num3=num1;
			num1=num2;
			num2=num3;
			System.out.println("The Swapped numbers num1 is"+num1+"Swapped numbers num2 is"+num2);
		}
		catch(IOException e){
			System.out.println(e);
		}
	}
}