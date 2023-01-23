import java.io.*;
class length{
	public static void main(String args[]){
		System.out.println("First object");
		Value v1=new Value();
		v1.Read();
		v1.Disp();
		System.out.println("Second object");
		Value v2=new Value();
		v2.Read();
		v2.Disp();
		//Adding
		Value v3=new Value();
		v3=v1.add(c2);
		System.out.println("The sum is "+c3.rl+"+"+c3.im+"i");
	}
}
class Value{
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