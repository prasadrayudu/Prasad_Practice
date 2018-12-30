package JDBC_CRUD_Application;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.ResultSet;
import java.sql.Statement;

public class deleteQuery {
	  
public static void main(String a[])throws Exception
{  	int result;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the student no:");//101
    int snumber=Integer.parseInt(br.readLine());
    Class.forName("oracle.jdbc.driver.OracleDriver");
    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","OracleEdu","Rayudu@46");
    Statement st=con.createStatement();
    result= st.executeUpdate("delete from student where STDID="+snumber);
    if(result>0)
    {
    
    System.out.println("successful deletion");
    }

else
    {
    System.out.println("failure");
    }
}
}