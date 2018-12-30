package JDBC_CRUD_Application;

import java.sql.*;
import java.io.*;
class InsertQuery
{
    
public static void main(String args[])throws Exception
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    
    System.out.println("Enter the student no:");//4
    int sno=Integer.parseInt(br.readLine());//4
    
    System.out.println("Enter the student name:");//Satya
    String sname=br.readLine();//Satya
    
    System.out.println("Enter the student address");//Hyd
    String addre=br.readLine();//Hyd
       
    Class.forName("oracle.jdbc.driver.OracleDriver");
    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","password");
    Statement st=con.createStatement();
    int result=st.executeUpdate("insert into student values("+sno+",'"+sname+"','"+addre+"')");
    
    //result=st.getUpdateCount();
    if(result>0)
    {
    
    System.out.println( "Successfully inserted");
    }

else
    {
    System.out.println("Insertion failed!");
    }
}
}