package UDPConnection;
import java.net.*;
public class Server {
    public static void main(String[] args) {
        try {
            DatagramSocket ds=new DatagramSocket(1234);
            byte[] b=new byte[1024];
            DatagramPacket dp=new DatagramPacket(b, b.length);
            String str=new String(dp.getData());
            ds.receive(dp);
            System.out.println("Message is "+str);
            ds.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
