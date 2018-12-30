package JDBC_CRUD_Application;
import java.sql.*;


public class CreateQuery {
public static void main(String a[])throws Exception
{
    
    Class.forName("oracle.jdbc.driver.OracleDriver");
    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","OracleEdu","Rayudu@46");
    Statement st=con.createStatement();
    String query ="CREATE TABLE HELL\r\n" + 
    		"(\r\n" + 
    		"STDID NUMBER(10),\r\n" + 
    		"STDNAME VARCHAR2(20)\r\n" + 
    		")";
    ResultSet rs=st.executeQuery(query);
    rs.next();
        System.out.println("Table created successfully:");
        st.close();
        con.close();
}
}