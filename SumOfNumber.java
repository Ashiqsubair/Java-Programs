import java.io.*;
class SumOfNumber{
	public static void main(String args[]){
		try{
			String num;
			int num2,x,sum=0;
			System.out.println("Enter a number");
			DataInputStream dis= new DataInputStream(System.in);
			num = dis.readLine();
			num2= Integer.parseInt(num);
			for(x=0;x<=num2;x++){
				sum=sum+x;
				}
			System.out.println(sum+" is the sum");
		}
		catch(IOException e){
			System.out.println(e);
		}
			
	}
}