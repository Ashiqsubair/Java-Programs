import java.io.*;
class Bill{
    public static void main(String args[]){
        int i,n;
        double sum=0;
        try{
            Billing b= new Billing();
            for(i=0;i<b.n;i++ ){
                b.item(i);
            }
            System.out.println("Product name \t"+"Quantity\t"+"Price per kg"+"\tPrice per item");
            for(int x=0;x<b.n;x++){
                System.out.println(b.pname[x]+"\t\t"+b.PQty[x]+"\t\t"+b.Pprice[x]+"\t\t"+b.PQty[x]*b.Pprice[x]);
                sum=sum+(b.Pprice[x]*b.PQty[x]);
            }
            System.out.println("Total amount:"+sum);
        }
        catch(Exception e){
            System.out.println(e);
        }

    }
}
class Billing{
    int n;
    double Pprice[];
    float PQty[];
    String pname[];
    Billing(){
        try{
            System.out.println("Enter the number of items you want to bill");
            DataInputStream dis=new DataInputStream(System.in);
            n=Integer.parseInt(dis.readLine());
            Pprice=new double[n];
            PQty= new float[n];
            pname=new String[n];
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public void item(int i){
        try {
            
            DataInputStream dis=new DataInputStream(System.in);
            System.out.println("Product Name: ");
            pname[i]=dis.readLine();
            System.out.println("Product Qty: ");
            PQty[i]=Float.parseFloat(dis.readLine());
            System.out.println("Price per Kilo ");
            Pprice[i]=Double.parseDouble(dis.readLine());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
