package JDBC_CRUD_Application;

import java.sql.*;  
class ResultMetaData{  
public static void main(String args[]){  
try{  
Class.forName("oracle.jdbc.driver.OracleDriver");  
  
Connection con=DriverManager.getConnection(  
"jdbc:oracle:thin:@localhost:1521:xe","system","password");  
  
PreparedStatement ps=con.prepareStatement("select * from student");  
ResultSet rs=ps.executeQuery();  
  
ResultSetMetaData rsmd=rs.getMetaData();  
  
System.out.println("Total columns: "+rsmd.getColumnCount());  
System.out.println("Column Name of 1st column: "+rsmd.getColumnName(1));  
System.out.println("Data Type of 1st column: "+rsmd.getColumnTypeName(1));  
  
con.close();  
  
}catch(Exception e){ System.out.println(e);}  
  
}  
}