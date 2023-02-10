//wait synchronized
import java.lang.*;
class Sum extends Thread{
    int total=0;
    public void run(){
        for(int i=0;i<=10;i++){
            total=total+i;
        }
        
    }
    
}
public class InterThread {
    public static void main(String args[]){
        Sum s=new Sum();
        s.start();
        synchronized(s){
            try{
                s.wait();
            }
            catch(InterruptedException e){
                System.out.print(e);
            }
            
        }
        System.out.print("Sum is "+s.total);
    }
}
