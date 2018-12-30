package JDBC_CRUD_Application;
import java.io.*;
import java.sql.*;
class preparedStatement
{
public static void main(String a[])throws Exception
{
    Class.forName("oracle.jdbc.driver.OracleDriver");
    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","password");
    PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?)");
   DataInputStream dis=new DataInputStream(System.in);
   System.out.println("Enter the number of students:");//2
   int n=Integer.parseInt(dis.readLine());//2
   for(int i=1;i<=n;i++)
   {
   System.out.println("Enter the details of student"+i);//1
   
   System.out.println("Enter the student no:");//5
   int rno=Integer.parseInt(dis.readLine());//5
   
   System.out.println("Enter the student name:");//Roja
   String name=dis.readLine();//Roja   
   System.out.println("Enter the student address:");//rjy
   String saddress=dis.readLine();//rjy
   
   ps.setInt(1,rno);
   ps.setString(2,name);
   ps.setString(3,saddress);
   
   int res=ps.executeUpdate();
   if(res>0)
       System.out.println("Record(s) was successfully inserted");
   else
       System.out.println("Failure");
   
   
   }
   
   }

}

