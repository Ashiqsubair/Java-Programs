//Working program
import java.io.*;
class Slot_7_4{
    public static void main(String args[]) {
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter a String:");
            StringBuffer s=new StringBuffer(br.readLine());
            System.out.print("Reversed String:");
            System.out.print(s.reverse());
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
}
