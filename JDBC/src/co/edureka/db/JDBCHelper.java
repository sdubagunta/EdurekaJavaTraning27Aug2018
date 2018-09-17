package co.edureka.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import co.edureka.model.Employee;

//Data Access Object
//JDBCHelper Object will be used to access database 
/*JDBC Procedure:
 1. Load the Driver
  1.1 Download Type4 Driver from DB Vendor Website which is a .jar file
      .jar file is a zipped file which contains lot of .class files
  1.2 Link .jar file with your project in Eclipse
  1.3 Use Class.forname API to load the Driver

 2. Create the Connection with DB
  2.1 Username and password : root | ""
  2.2 URL : jdbc:mysql://localhost/dbname | Diff for diff db's
  2.3 Use Connection and DriverManager APIs

 3. Write SQL Statement
  String sql  = "insert into Employee values(null,.......)"; 

 4. Execute SQL Statement
  Use Statement or PreparedStatement API

 5. Close the Connection
  Use method close() to close the connection for releasing memory resources*/

public class JDBCHelper {
	Connection Con;
	Statement stmt;
	PreparedStatement pStmt;
	public JDBCHelper() {
		try {
			// 1.Load JDBC driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded");

		} catch (Exception e) {
			System.out.println("Some Exception" + e);
		}
	}

	public void createConnection() {
		try {
			// 2.Create connection with DB
			String user = "root";
			String password = "root";
			String url = "jdbc:mysql://localhost/edureka";
																	// db name

			Con = DriverManager.getConnection(url, user, password);
			System.out.println("Connection created");

		} catch (Exception e) {
			System.out.println("Some Exception" + e);
		}

	}



public void saveEmployee(Employee emp){
	try{
		 //3. Create SQL Statement
		   //String sql = "insert into Employee values(null,'George',6,54500,'Redwood Shores')";
		   
		   //String sql = "insert into Employee values(null,'"+emp.name+"',"+emp.exp+","+emp.salary+",'"+emp.address+"')";
		   
		   //4. Execute SQL Statement
		   //stmt = con.createStatement();
		   //int i = stmt.executeUpdate(sql);
		   
		                  // indexing starts from 1  2  3  4
		   String sql = "insert into Employee values(null , ?, ?, ?, ?)"; // ? is a wild card
		   
		   pStmt = Con.prepareStatement(sql);
		//   pStmt.setInt(1, emp.eid);
		   pStmt.setString(1, emp.name);
		   pStmt.setInt(2, emp.exp);
		   pStmt.setInt(3, emp.salary);
		   pStmt.setString(4, emp.address);
		   
		   int i = pStmt.executeUpdate();
		   
		   //System.out.println("PreparedStatemnt: "+pStmt.toString());
		   
		   if(i>0){
		    System.out.println(">>"+emp.name+" Saved "+i);
		   }else{
		    System.out.println(">>Record Not Saved "+i);
		   }
		   
		  } catch (Exception e) {
		   System.out.println("Some Exception: "+e);
		  }
		 }
	public void closeConnection(){
		try{
			Con.close();
			System.out.println("connection closed");
		}catch(Exception e) {
			System.out.println("Some Exception" + e);
		}
	}

}