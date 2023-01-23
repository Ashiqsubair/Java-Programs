import java.io.*;
class CharRead{
	public static void main(String args[]){
		try{
			char c;
			System.out.println("Enter the character");
			DataInputStream dis=new DataInputStream(System.in);
			c=(char)dis.read();
			System.out.println("The character is "+c);
		}
		catch(IOException e){
			System.out.println(e);
		}
	}
}