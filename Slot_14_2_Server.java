import java.net.*;
import java.io.*;
public class Slot_14_2_Server {
    public static void main(String args[]){

    
    try {
        ServerSocket ss=new ServerSocket(1234);//port of the socket
        System.out.println("waiting for the connection");
        Socket so= ss.accept();
        System.out.println("Connection made");
        DataInputStream dis=new DataInputStream(so.getInputStream());//getting the information from the client
        String str=(String)dis.readUTF();
        System.out.println("The message from Client is :"+str);//printing the string information
        DataOutputStream dos=new DataOutputStream(so.getOutputStream());//sending some message to the client
        while(true){
            Integer str3=(Integer)dis.readInt();
            if(str3!=null){
                int fact=1;
                for(int i=1;i<str3;i++){
                    fact=fact*i;
                }
                System.out.println("Factorial is :"+fact);
            }
        }
        // ss.close();
    } catch (Exception e) {
        System.out.print(e);
    }
}
}
