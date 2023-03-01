package packages;

public class Prime {
    public static void FindPrime(Long num){
        int count=0;
        for(int i=2;i<num;i++){
            if(num%i==0){
                count=count+1;
            }
        }
        if(count==0){
            System.out.println("Number is Prime");
        }
        else{
            System.out.println("Number is Not Prime");
        }
    }
}
