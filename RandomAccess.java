import java.io.*;
class RandomAccess{
    public static void main(String args[]){
        try{
            RandomAccessFile file=new RandomAccessFile("test.txt", "rw");
            file.seek(file.length());
            file.write("Hello my write ".getBytes());
            System.out.println(file.read());
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}