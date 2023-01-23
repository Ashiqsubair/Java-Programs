import java.io.*;
class FileCreation{
    public static void main(String args[]){
        try{
            File f1=new File("E:\\Ashiq\\WTL\\test22.txt");
           boolean fc= f1.createNewFile();
            if (fc) {
                System.out.println("File created");
            }
            else{
                System.out.println("File not created");
            }
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}