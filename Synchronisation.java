import java.lang.*;
class First{
    synchronized public void disp(String msg){
        System.out.print("["+msg);
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
        System.out.print("]");
     }
}
class Second extends Thread{
    First ff;
    String ss;
    Second(First f,String s){
        ff=f;
        ss=s;
    }
    public void run(){
        ff.disp(ss);
     }
}
class Synchronisation{
    public static void main(String args[]){
        First fnew=new First();
        Second snew1=new Second(fnew,"Rajagiri");
        snew1.start();
        Second snew2=new Second(fnew,"College");
        snew2.start();
        Second snew3=new Second(fnew,"kalamasery");
        snew3.start();
    }
}