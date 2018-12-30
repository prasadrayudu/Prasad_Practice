package JDBC_CRUD_Application;
import java.sql.*;

public class SelectQuery {

public static void main(String a[])throws Exception
{
    
    Class.forName("oracle.jdbc.driver.OracleDriver");
    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","OracleEdu","Rayudu@46");
    Statement st=con.createStatement();
    ResultSet rs=st.executeQuery("select * from EMP");
    
    while(rs.next())
        System.out.println(rs.getInt(1)+" "+rs.getString(2)+ "  " +rs.getString(3));

con.close();
}
}