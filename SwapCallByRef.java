import java.io.*;
class Num{
    int x;
}
class SwapCALLByRef{
	public static void main(String args[]){
        Num n1=new Num();
        n1.x=10;
        Num n2=new Num();
        n2.x=20;
        System.out.println("x is "+n1.x+ " y is "+n2.x);
		Swap s=new Swap();
        s.Swapnum(n1,n2);
        System.out.println("x is "+n1.x+ " y is "+n2.x);
	}
}
class Swap{
   void Swapnum(Num n1,Num n2){
    try{
        int temp;
        temp=n1.x;
        n1.x=n2.x;
        n2.x=temp;
			System.out.println("The Swapped numbers n1.x is "+n1.x+" Swapped numbers n2.x is "+n2.x);
		}
		catch(Exception e){
			System.out.println(e);
		}
    }
}