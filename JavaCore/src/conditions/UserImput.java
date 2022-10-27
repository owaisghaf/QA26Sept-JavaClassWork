package conditions;

// allows for system input and then compares input to criteria using if statement

import java.util.Scanner;

public class UserImput {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter your name");
		String name = scn.next();
		System.out.println("Please enter the city you are from");
		String city = scn.next();
		
		if(city.equals("NewYork")) {
			System.out.println("Hello " +name+ " you are a new yorker");
		}
		else if(city.equals("London")) {
			System.out.println("Hello " +name+ " you are from London");
		}
		else {
				System.out.println("Hello " +name+ " you are from " +city);
		} 
	}
}
