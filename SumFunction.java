import java.io.*;
class S_num{
	public int sum_num(int num){
		if(num>=1){
			return num+sum_num(num-1);
		}
		else{
			return 0;
		}
	}
}
class SumFunction{
	public static void main(String args[]){
		try{
			int num, sum;
			System.out.println("Enter the digit");
			DataInputStream dis= new DataInputStream(System.in);
			num=Integer.parseInt(dis.readLine());
			S_num S =new S_num();
			sum= S.sum_num(num);
			System.out.println("the sum of number is "+sum);
		}
		catch(IOException e){
			System.out.println(e);
		}
	}
}