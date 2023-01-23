import Package1.*;

class P1Demo{
    public static void main(String args[]){
        P1 pobj=new P1();
        P2 pobj2=new P2();
        int x=pobj.add(20,30);
		System.out.println("The sum is "+x);
        int y=pobj2.multi(20,30);
		System.out.println("The sum is "+y);
    }
}