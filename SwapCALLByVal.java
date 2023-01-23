import java.io.*;
class SwapCALLByVal{
	public static void main(String args[]){
        int x=10;
        int y=20;
        System.out.println("x is "+x+ " y is "+y);
		Swap s=new Swap();
        s.Swapnum(x,y);
        System.out.println("x is "+x+ " y is "+y);
	}
}
class Swap{
   void Swapnum(int x,int y){
    try{
        int temp;
        temp=x;
        x=y;
        y=temp;
			System.out.println("The Swapped numbers num1 is"+x+"Swapped numbers num2 is"+y);
		}
		catch(Exception e){
			System.out.println(e);
		}
    }
}