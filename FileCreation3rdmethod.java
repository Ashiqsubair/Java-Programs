import java.io.*;
import java.nio.file.*;
class FileCreation3rdmethod{
    public static void main(String args[]){
        try{
            Path pf=Paths.get("E:\\Ashiq\\WTL\\test22.txt");
            Path p=Files.createFile(pf);
            System.out.println("File created");
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}