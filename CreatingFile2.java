import java.io.FileOutputStream;
import java.io.IOException;

public class CreatingFile2 {
    public static void main(String args[]){
        try{
            FileOutputStream f1= new FileOutputStream("test2.jpg");
            System.out.print("file created");
        }
        catch(IOException e){
            System.out.print(e);
        }
    }
}
