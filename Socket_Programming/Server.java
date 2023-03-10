package Socket_Programming;
import java.io.ObjectInputStream;
import java.net.*;
public class Server {
    public static void main(String[] args) {
        try {
            try (ServerSocket ss = new ServerSocket(1234)) {
                Socket s=ss.accept();
                ObjectInputStream ois=new ObjectInputStream(s.getInputStream());
                String str=(String)ois.readUTF();
                System.out.println("The message is "+str);
                ss.close();
                ois.close();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
