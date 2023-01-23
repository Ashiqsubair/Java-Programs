import java.io.*;
class OddOrEven{
	public static void main(String args[]){
		try{
			int num;
			String str;
			System.out.println("Enter the number:");
			DataInputStream dis = new DataInputStream(System.in);
			str = dis.readLine();
			num =	Integer.parseInt(str);
			if(num%2==0){
				System.out.println(num+" Even Number");
			}
			else{
				System.out.println(num+" Odd Number");
			}
		}
		catch(IOException e){
			System.out.println(e);
		}
	}
}