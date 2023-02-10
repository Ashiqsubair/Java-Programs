import java.lang.*;
class Item{
int i;
boolean produced=false;
synchronized void Produce(int x){
    if (produced){
        try{
            wait();

        }
        catch(Exception e){
            System.out.print(e);
        }
        i=x;
        produced=true;
        notify();
    }
}
    synchronized void Consume(){
        if(!produced){
            try{
                wait();
            }
            catch(Exception e){
                System.out.print(e);
            }
            produced=false;
            notify();
        }
    }
}
class Consumer extends Thread{
    Item q;
    Consumer(Item qq){
        q=qq;
    }
    public void run(){
        int i=0;
        while(true){
            q.Consume();
        }
    }
}
class Producer extends Thread{
    Item q;
    Producer(Item qq){
        q=qq;

    }
    public void run(){
        int i=0;
        while(true){
            q.Produce(i++);
        }
    }
}
class PC{
    public static void main(String args[]){
        Item i= new Item();
        Producer p=new Producer(i);
        Consumer c=new Consumer(i);
    }
}