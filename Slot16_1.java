
import java.sql.*;
public class Slot16_1 {
    public static void main(String[] args) {
        try{
        	Class.forName("oracle.jdbc.OracleDriver");//specify the db
			Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","mca","mca");
            Statement stmt=con.createStatement();
            stmt.executeQuery("create table Citizen (id int primary key, name varchar2(15),age int, address varchar2(20),dob date)");
            
            System.out.println("Table Created");
            stmt.executeQuery("insert into citizen values(1,'Ashiq',24,'Kollam,Kerala','22-12-1998')");
            stmt.executeQuery("insert into citizen values(2,'Lemin',24,'Kumbalangi,Kerala','8-9-1998')");
            stmt.executeQuery("insert into citizen values(3,'Abhay',22,'Kozhikode,Kerala','17-8-2000')");
            stmt.executeQuery("insert into citizen values(4,'Sumesh',21,'Fort-Kochi,Kerala','22-12-2001')");
        }
        catch(Exception e) {
            System.out.println(e);
        }
        

    }
}
