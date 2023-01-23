import java.io.*;
import java.lang.*;
class Slot7_3{
    public static void main(String args[]){
        int choice=0;
        Strings s=new Strings();
        s.readString();
        while(choice!=5){
            System.out.println("1.Check Length of the String\n2. Compare for Equality\n 3. Extract SubString\n4. Convert to UpperCase to Lower");
            DataInputStream dis=new DataInputStream(System.in);
            choice=Integer.parseInt(dis.readLine());
            switch(choice){
                case 1:{
                    s.len();
                    break;
                }
                case 2:{
                    s.compare();
                    break;
                }
                case 3:{
                    System.out.println("1.Slice First String\t 2.Slice Second String");
                    DataInputStream dis2=new DataInputStream(System.in);
                    int choice2=Integer.parseInt(dis2.readLine());
                    switch(choice2){
                        case 1:{
                            System.out.println(s.str1.substring(1,5));
                            break;
                        }
                        case 2:{
                            System.out.println(s.str2.substring(1,5));
                            break;
                        }
                    }
                    break;
                }
                case 4:{
                    System.out.println("TO upper : "+s.str1.toUpperCase());
                    System.out.println("TO upper : "+s.str2.toUpperCase());
                    break;
                }
                default:{
                    System.out.println("Wrong choice");
                }
            }
        }
    }
}
class Strings{
    String str1,str2;
    void readString(){
        try{
            DataInputStream dis= new DataInputStream(System.in);
            System.out.print("Enter the string 1 :");
            str1=dis.readLine();
            System.out.print("Enter the string 2 :");
            str2=dis.readLine();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
    void len(){
        System.out.println("Length of "+str1+" is "+str1.length()+"\n Lenghth of "+str2+" is "+str2.length());
    }
    void compare(){
        if(str1.compareTo(str2)==0){
            System.out.println("Equal String");
        }
        else{
            System.out.println("Not Equal String");
        }
    }
}