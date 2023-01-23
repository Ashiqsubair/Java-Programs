import java.io.*;
class Arithmeticerror{
 public static void main(String args[]){
    try {
        int a[]={1,2,3};
        System.out.println(a[2]);
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println(e);
        e.printStackTrace();
    }
    finally{
        System.out.println("finally printed");
    }

    // try{
    //     String s="reg";
    // int i= Integer.parseInt(s);
    // i++;
    // }
    // catch(NumberFormatException e){
    //     System.out.print(e);
    // }



//String Exception
    // try{
    //     String s=null;
    // System.out.print(s.length());
    // }
    // catch(NullPointerException e){
    //     System.out.println(e);
    // }

// Arithmetic exception
    // try{
    //     int i=50/0;
    // System.out.print(i);
    // }
    // catch(ArithmeticException e){
    //     int i=50/2;
    // System.out.print(i);
    // }
    
 }
}