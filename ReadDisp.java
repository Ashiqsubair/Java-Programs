import java.io.*;
class ReadDisp{
	public static void main(String args[]){
		Comp c=new Comp();
		c.Read();
		c.Disp();
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
}