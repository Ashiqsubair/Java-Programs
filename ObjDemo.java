class test{
int a,b;
	public void check(){
		System.out.println("a is "+a);
		System.out.println("b is "+b);
	}
}
class ObjDemo{
	public static void main(String args[]){
		test t=new test();
		t.a=10;
		t.b=20;
		t.check();
	}
}