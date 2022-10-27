package jdbc;

// code to connect to the sql database using login details. will tell you error too. try and catch

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJDBC {
	public static void main(String[] args) {
		try {
			String url = "jdbc:mysql://localhost:3306/javaintermediate";
			String userName = "root";
			String password = "Manutdrshit123-";
			Connection con = DriverManager.getConnection(url, userName, password);
			System.out.println("connected successfully");

		} catch (Exception e) {
			System.out.println("somehing went wrong");
			System.out.println(e.getMessage());
		}

	}

}
