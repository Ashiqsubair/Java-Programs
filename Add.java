import java.io.*;
class Add{
	public static void main(String args[]){
	String str1,str2;
	int x,y,z;
		try{
			System.out.println("Enter the number1");
			DataInputStream dis=new DataInputStream(System.in);
			str1= dis.readLine();
			System.out.println("Enter the number2");
			str2= dis.readLine();
			x=Integer.parseInt(str1);
			y=Integer.parseInt(str2);
			z=x+y;
			System.out.println("The sum is "+z);
		}
		catch(IOException e){
			System.out.println(e);
			
		}
	}
}