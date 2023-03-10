package Socket_Programming;
import java.io.ObjectOutputStream;
import java.net.*;
public class Client {
    public static void main(String[] args) {
        try {
            Socket s=new Socket("localhost", 1234);
            ObjectOutputStream oos=new ObjectOutputStream(s.getOutputStream());
            oos.writeUTF("Hello Server");
            oos.close();
            s.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
