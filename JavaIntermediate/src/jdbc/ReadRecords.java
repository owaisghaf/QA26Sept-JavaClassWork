package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReadRecords {

		public static void main(String[] args) {
			try {
				String url = "jdbc:mysql://localhost:3306/javaintermediate";
				String userName = "root";
				String password = "Manutdrshit123-";
				Connection con = DriverManager.getConnection(url, userName, password);
				System.out.println("connected successfully");
				
				String query = "select * from customerJ"; // query to be executed against database
				Statement stmt=con.createStatement(); // to create SQL statement
				ResultSet rs = stmt.executeQuery(query);
				while(rs.next())
				{
					int id=rs.getInt(1); // gets column
					String name=rs.getString(2);
					int phone=rs.getInt(3);
					String email=rs.getString(4);
				    System.out.println("***"+id+"***"+name+"***"+phone+"***"+email);
				}
			
			} catch (Exception e) {
				System.out.println("somehing went wrong");
				System.out.println(e.getMessage());
			}

		}

}
