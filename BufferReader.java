import java.io.*;
public class BufferReader {
    public static void main(String args[]) throws IOException
    {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter String");
            String s=br.readLine();
            System.out.println("string "+s);
        
    }
}
