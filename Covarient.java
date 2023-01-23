import java.io.*;
import java.lang.*;
class A{
    A display(){
        System.out.println("Display A");
    return (this);
}
}
class B extends A{
    B display(){
        System.out.println("Display B");
    return(this);
}
}
class Covarient{
    public static void main(String args[]){
       A a=new A(); a= a.display();
       B b=new B(); b= b.display();
    }
}