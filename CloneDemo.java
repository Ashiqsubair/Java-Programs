// import java.io.*;

// class Test{
//     int a,b;
// }
// class CloneDemo{
//     public static void main(String args[]){
//         Test t1= new Test();
//         t1.a=10;
//         t1.b=20;
//         System.out.println("t1.a"+t1.a+"t1.b"+t1.b);
 //           Test t2= new Test();
//         t2.a=10;
//         t2.b=20;
//         System.out.println("t2.a"+t2.a+"t2.b"+t2.b); 
//     }

// }
import java.io.*;

class Test implements Cloneable{
    int a,b;
        public Object clone(){
            try {
            return super.clone();
        }
        catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        return 0;
    }
}
class CloneDemo{
    public static void main(String args[]){
        Test t1= new Test();
        t1.a=10;
        t1.b=20;
        System.out.println("t1.a ="+t1.a+"t1.b ="+t1.b);
        Test t2=(Test)t1.clone();//creation of clone
        System.out.println("t2.a ="+t2.a+"t2.b ="+t2.b);
    }

}