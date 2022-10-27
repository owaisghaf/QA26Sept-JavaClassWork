package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteRecord {
	
	public static void main(String[] args) {
		try {
			String url = "jdbc:mysql://localhost:3306/javaintermediate";
			String userName = "root";
			String password = "Manutdrshit123-";
			Connection con = DriverManager.getConnection(url, userName, password);
			System.out.println("connected successfully");
			
			String query = ("delete from customerJ where id=106"); // query to be executed against database
			Statement stmt=con.createStatement(); // to create SQL statement
			stmt.execute(query);
			System.out.println("one record was deleted successfully");
		}
		catch (Exception e) {
			System.out.println("something went wrong");
			System.out.println(e.getMessage());
		}
}
}
