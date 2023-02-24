import java.net.*;
import java.io.*;
public class Slot_13_2Client {
    public static void main(String args[]){
        try {
            Socket so=new Socket("localhost",1234);//establishing the connection
            System.out.println("Sending request to Server");
            DataOutputStream dos=new DataOutputStream(so.getOutputStream());//sending information to server
            dos.writeUTF("hello");//sending to the Server
            DataInputStream dis=new DataInputStream(so.getInputStream());//receiving some string information from server
            String str= (String)dis.readUTF();
            System.out.println("The message from server:"+str);//printing the information
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
