package jdbc;

// allows you to access the SQL database and make changes from Java

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class InsertRecord {

	public static void main(String[] args) {
		try {
			String url = "jdbc:mysql://localhost:3306/javaintermediate";
			String userName = "root";
			String password = "Manutdrshit123-";
			Connection con = DriverManager.getConnection(url, userName, password);
			System.out.println("connected successfully");
			
			String query = ("update customerJ set id=110 where name='ghaf'"); // query to be executed against database
			Statement stmt=con.createStatement(); // to create SQL statement
			stmt.execute(query);
			System.out.println("one record was inserted successfully");
		}
		catch (Exception e) {
			System.out.println("something went wrong");
			System.out.println(e.getMessage());
		}
}
}
