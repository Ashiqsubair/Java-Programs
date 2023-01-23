class Count{
public static void main(String args[]){
	int count=args.length;
	int i=0;
	while(i<count){
		System.out.println("The "+i+"th argument is "+args[i]);
		i=i+1;
	}
	
}
}