package exceptions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Sample {
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

		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("cannot divide number by zero");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.out.println("cannot place elements out of array's boundary");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			System.out.println("cannot connect to database");
		} finally {
			System.out.println("I will always get executed");
		}
		}
	}
