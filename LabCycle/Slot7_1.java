import java.io.*;
import java.lang.*;
class Slot7_1{
    public static void main(String args[]){
        Cstring c= new Cstring();
        c.readString();
        c.displayString();
        c.compare();
        c.add();
        c.concat();
    }
}
class Cstring{
    String Strn1,Strn2;
    void readString(){
        try{
            DataInputStream dis= new DataInputStream(System.in);
            System.out.print("Enter the string 1 :");
            Strn1=dis.readLine();
            System.out.print("Enter the string 2 :");
            Strn2=dis.readLine();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
    void displayString(){
        System.out.println("The string 1 is "+Strn1);
        System.out.println("The string 2 is "+Strn2);
    }
    void compare(){
        if(Strn1.compareTo(Strn2)==0){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
    void add(){
        String Str=Strn1+Strn2;
        System.out.println("After adding "+Str);
    }

    void concat(){
        System.out.println("Concating String "+(Strn1).concat(Strn2));
    }
}
