import j

class Student{
    String name;
    int age;
    void setname(String sname){
        name=sname;
    }
    void setage(int sage){
        age=sage;
    }
    void getname(){
        System.out.println("Name "+name);
    }
    void getage(){
        System.out.println("Age "+age);
    }
}
class Encap{
    public static void main(String args[]){
        Student s=new Student;
        s.setname("Arya");
        s.setage(123);//setter methods, give values to variable
        s.getname();
        s.getage();//getter methods to take values from variables
    }

}