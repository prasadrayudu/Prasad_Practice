package code_30days;
/*
 7 Steps to Connect Application to database
1)Import the package
2)Load and Register driver
3)Create Connection
4)Create Statement
5)Execute the query
6)process the results
7)close connection

 */
import java.sql.*;
public class JDBC_Demo_Createtable {
	
// ************ JDBC CREATETABLE EXAMPLE *************
/* 
	public static void main(String[] args) throws Exception
	{
		//"jdbc:oracle:thin:@localhost:1521:xe","system","oracle");  

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
	    String Uname = "OracleEdu";
	    String Pwd = "Rayudu@46";
	    String query ="CREATE TABLE STUDENT2\r\n" + 
	    		"(\r\n" + 
	    		"STDID NUMBER(10),\r\n" + 
	    		"STDNAME VARCHAR2(20)\r\n" + 
	    		")";
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection(url,Uname,Pwd);
			Statement st =con.createStatement();
			System.out.println("Create a table");
		ResultSet rs= st.executeQuery(query);
			rs.next();
			System.out.println("Table is created successfully");
		//	System.out.println(");
			st.close();
			con.close();
	}   
	
	// ************ JDBC CONNECTION EXAMPLE *************
	public static void main(String[] args) throws Exception
	{
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
	    String Uname = "OracleEdu";
	    String Pwd = "Rayudu@46";
	    String query ="select job from emp where empno = '7698'";
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection(url,Uname,Pwd);
			Statement st =con.createStatement();
			ResultSet rs= st.executeQuery(query);
			rs.next();
			String str = rs.getString("job");
			System.out.println(str);
			st.close();
			con.close();
	}  */
	
	public static void main(String[] args) throws Exception
	{
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
	    String Uname = "OracleEdu";
	    String Pwd = "Rayudu@46";
	    String query ="select job from emp where empno = '7698'";
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection(url,Uname,Pwd);
			Statement st =con.createStatement();
			ResultSet rs= st.executeQuery(query);
			rs.next();
			String str = rs.getString("job");
			System.out.println(str);
			st.close();
			con.close();

		}
}

