import java.io.*;
class FileCreatio_another{
    public static void main(String args[]){
        try{
            FileOutputStream f1=new FileOutputStream("E:\\Ashiq\\WTL\\test22.txt");
            System.out.println("File created");
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}