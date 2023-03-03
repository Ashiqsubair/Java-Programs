import java.net.*;
import java.io.*;
public class Slot14_2Client {
    public static void main(String args[]){
        try {
            Socket so=new Socket("localhost",1234);//establishing the connection
            System.out.println("Sending request to Server");
            DataOutputStream dos=new DataOutputStream(so.getOutputStream());//sending information to server
            dos.writeUTF("Communication completed");//sending to the Server
            System.out.println("Communication completed");
            DataInputStream dis=new DataInputStream(so.getInputStream());//receiving some string information from server
            DataInputStream dis2=new DataInputStream(System.in);
            while(true){
                System.out.print("Enter the number: ");
                int x=Integer.parseInt(dis2.readLine()) ;
                dos.writeInt(x);
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
