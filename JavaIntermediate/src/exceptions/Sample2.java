package exceptions;

// combining exception statements

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Sample2 {
	public static void main(String[] args) {
	try {
		//ArithmeticException
		int x = 10;
		int y = 10;
		int z = x/y; // logical issue
		//System.out.println(z);
		
		//ArrayIndexOutOfBoundsException
		int[] nums=new int[5];
		nums[2]=200;
		//System.out.println();
		
		//SQLException
		Connection con=DriverManager.getConnection("","","");

	} catch (ArithmeticException | ArrayIndexOutOfBoundsException | SQLException e) {
		System.out.println(e.getMessage());
		System.out.println("cannot divide number by zero");
	}

	}
}
