import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialisation {
    public static void main(String[] args) throws Exception{
        Employee e=null;
        FileInputStream fis=new FileInputStream("\\E:\\Ashiq\\java\\Serialisation\\test.txt");
        try (ObjectInputStream ois = new ObjectInputStream(fis)) {
            e =(Employee)ois.readObject();
        }
        System.out.println("Employee ID: "+e.empID);
        System.out.println("Employee Name: "+e.empName);
        System.out.println("Employee ID: "+e.empJob);
    }
}
