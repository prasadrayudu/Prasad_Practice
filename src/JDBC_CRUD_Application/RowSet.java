package JDBC_CRUD_Application;

import javax.sql.rowset.JdbcRowSet;  
import javax.sql.rowset.RowSetProvider;
  
      
    public class RowSet {  
            public static void main(String[] args) throws Exception {  
                     Class.forName("oracle.jdbc.driver.OracleDriver");  
          
        //Creating and Executing RowSet  
            JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();  
            rowSet.setUrl("jdbc:oracle:thin:@localhost:1521:xe");  
            rowSet.setUsername("OracleEdu");  
            rowSet.setPassword("Rayudu@46");  
                       
            rowSet.setCommand("select * from emp");  
            rowSet.execute();  
                       
        while (rowSet.next()) {  
                            // Generating cursor Moved event  
                            System.out.println("Id: " + rowSet.getString(1));  
                            System.out.println("Name: " + rowSet.getString(2));  
                            System.out.println("Salary: " + rowSet.getString(3));  
                    }  
                     
            }  
    } 
    
//    "OracleEdu","Rayudu@46"