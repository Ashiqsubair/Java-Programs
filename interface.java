import java.io.*;
import java.lang.*;
interface Shape{
    public double area();
    public void display();
    
}
class Rectangle implements Shape{
    double l,b;
    Rectangle(double x, double y){
        l=x;b=y;
    }
    public double area(){
        return (l*b);
    }
    public void display(){
        System.out.println("Rectangle")
    }
}
class Rectangle implements Shape{
    double l,b;
    Rectangle(double x,double y){
        l=x;
        b=y;
    }
    public double area(){
        return l*b;
    }
    public void display(){
        System.out.println("Rectangle");
        }
}
class Triangle implements Shape{
    double l,b;
    Triangle(double x, double y){
        l=x;
        b=y;
    }
    public double area(){
        return (.5*l*b);
    }
    public void display(){
        System.out.println("Triangle");
    }
}
class Shape{
    public static void main(String[] args) {
    Rectangle r=new Rectangle();
    }
}