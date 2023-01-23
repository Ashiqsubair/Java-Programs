import java.io.*;
public class WritingIntoFile {
    public static void main(String args[]){
        try{
            FileOutputStream f=new FileOutputStream("testwrite.txt");
            DataInputStream dis=new DataInputStream(System.in);
            System.out.println("Enter some texts");
            while(true){
                String data=dis.readLine();
                if(data.equals("1")){
                    break;
                }
                else{
                    f.write(data.getBytes());
                    f.write("\n".getBytes());
                }
            }
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
