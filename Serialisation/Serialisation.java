import java.io.*;
public class Serialisation {
    public static void main(String[] args) throws Exception {
        Employee e=new Employee(1, "Ashiq", "Manager");
        FileOutputStream fos=new FileOutputStream("\\E:\\Ashiq\\java\\Serialisation\\test.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(e);
        fos.close();
        oos.close();
    }
}
