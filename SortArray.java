import java.io.*;
import java.lang.*;
class SortArray{
	public static void main(String args[]){
		try{
			int a[],sum=0;
			int i,n,j;
			System.out.println("Enter the limit");
			DataInputStream dis= new DataInputStream(System.in);
			n=Integer.parseInt(dis.readLine());
			a =new int[n];
			for(i=0;i<n;i++){
				a[i]=Integer.parseInt(dis.readLine());
			}
			for(i=0;i<n;i++){
				for(j=i+1;j<n;j++){
					if(a[i]>a[j]){
						int temp;
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
			}
			System.out.println("Sorted Array is:");
			for(i=0;i<n;i++){
				System.out.println(a[i]);
			}
		}
		catch(IOException e){
			System.out.println(e);
		}
	}
}