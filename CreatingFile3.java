import java.nio.file.*;
import java.io.*;
public class CreatingFile3 {
    public static void main(String args[]){
        try{
            Path pf=Paths.get("test2342.txt");
            Path p=Files.createFile(pf);
            System.out.println("File created");
        }
        catch(IOException e){
            System.out.println(e);
        } 
    }
}
