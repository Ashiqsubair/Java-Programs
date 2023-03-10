package URL;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.*;
public class URLDownload {
    public static void main(String[] args) {
        try {
            URL u=new URL("https://africau.edu/images/default/sample.pdf");
            InputStream is=u.openStream();
            FileOutputStream fis=new FileOutputStream("path");
            byte[] b=new byte[1024];
            int length;
            while((length=is.read())!=-1){
                fis.write(b);
            }
            is.close();
            fis.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
