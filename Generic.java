import java.io.*;

class Generic{
    public static <G> void display(G[] a){
        for(G el:a){
            System.out.println(el);
        }
    }
    public static void main(String args[]){
        
            Integer[] ia={1,2,3,4,5};
            Double[] da={1.1,2.2,3.3,4.4,5.5};
            Character[] ca={'a','b','c','d'};
            display(ia);
            display(da);
            display(ca);
        
    }
}