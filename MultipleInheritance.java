import java.io.*;
import java.lang.*;
interface A{
}
interface B{}
class C implements A,B{
    C() {
        System.out.println("Heelloooo");
    }
}
class MultipleInheritance{
    public static void main(String args[]){
        C c=new C();
    }
    static{
        System.out.println("This Statement will run first");
    }
    
}
