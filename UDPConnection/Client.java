package UDPConnection;
import java.net.*;
public class Client {
    public static void main(String[] args) {
        try {
            DatagramSocket ds=new DatagramSocket();
            String S="Hello server";
            byte[] b=String.valueOf(S).getBytes();
            InetAddress in=InetAddress.getLocalHost();
            DatagramPacket dp=new DatagramPacket(b, b.length, in,1234);
            ds.send(dp);
            ds.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
