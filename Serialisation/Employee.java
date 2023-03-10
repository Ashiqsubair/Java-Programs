import java.io.Serializable;

public class Employee implements Serializable {
    public int empID;
    public String empName;
    public String empJob;
    public Employee(int empID,String empName,String empJob){
        this.empID=empID;
        this.empJob=empJob;
        this.empName=empName;
    }
}
