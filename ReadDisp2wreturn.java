import java.io.*;
class ReadDisp2wreturn{
	public static void main(String args[]){
		System.out.println("First object");
		Comp c1=new Comp();
		c1.Read();
		c1.Disp();
		System.out.println("Second object");
		Comp c2=new Comp();
		c2.Read();
		c2.Disp();
		//Adding
		Comp c3=new Comp();
		c3=c1.add(c2);
		System.out.println("The sum is "+c3.rl+"+"+c3.im+"i");
	}
}
class Comp{
	int rl;
	int im;
	void Read(){
		try{
			System.out.println("Enter the real part");
		DataInputStream dis= new DataInputStream(System.in);
		rl=Integer.parseInt(dis.readLine());
		System.out.println("Enter the imaginary part");
		im=Integer.parseInt(dis.readLine());
		}
		catch(IOException e){
			System.out.println(e);
		}
	}
	void Disp(){
		System.out.println("The number is "+rl+"+"+im+"i");
	}
	Comp add(Comp c2){
		Comp c= new Comp();
		c.rl=this.rl+c2.rl;
		c.im=this.im+c2.im;
		return c;
	}
}