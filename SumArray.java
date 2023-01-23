import java.io.*;
import java.lang.*;
class SumArray{
	public static void main(String args[]){
		try{
			float a[],sum=0;
			int i,n;
			System.out.println("Enter the limit");
			DataInputStream dis= new DataInputStream(System.in);
			n=Integer.parseInt(dis.readLine());
			a =new float[n];
			for(i=0;i<n;i++){
				a[i]=Float.parseFloat(dis.readLine());
			}
			for(i=0;i<n;i++){
				sum=sum+a[i];
			}
			System.out.println("The sum is"+sum);
		}
		catch(IOException e){
			System.out.println(e);
		}
	}
}