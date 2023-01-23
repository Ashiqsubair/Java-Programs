import java.io.*;
public class ReadingFile {
    public static void main(String args[]){
        try{
            FileInputStream fin= new FileInputStream("Add.java");
            int i=fin.read();
            while(i!=-1){
                char c=(char)i;
                System.out.print(c);
                i=fin.read();
            }
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
