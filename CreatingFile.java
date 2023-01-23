import java.io.*;
class CreatingFile{
    public static void main(String args[]){
        try{
            File f1=new File("test.txt");
            boolean f=f1.createNewFile();
            if(f){
                System.out.print("Successfully created");
            }
            else{
                System.out.print("Not created, already exist");
            }
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}