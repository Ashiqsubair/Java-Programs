import java.io.*;
public class FindAinString {
    public static void main(String args[]){
        try {
            FileInputStream file=new FileInputStream("Add.java");
            int i= file.read();
            int count=0;
            while(i!=-1){
                char c=(char)i;
                if(c=='a'){
                }
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
