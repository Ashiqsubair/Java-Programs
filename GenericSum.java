import java.io.*;

class GenericSum{
    public static <G> void display(G[] a){
         int sum=0;
        for(G el:a){
            sum=sum + el;
        }
        System.out.println("Sum is "+sum);
    }
    public static void main(String args[]){
        
            Integer[] ia={1,2,3,4,5};
            Double[] da={1.1,2.2,3.3,4.4,5.5};
            display(ia);
            display(da);
        
    }
}