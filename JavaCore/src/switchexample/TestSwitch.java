package switchexample;

import java.util.Scanner;

//Assignment > create a calculator using switch

public class TestSwitch {
	
	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		String continents=scn.next();
		System.out.println("Please enter the name of the continent");
	
		switch (continents) {
		case "Africa":
			System.out.println("you are in Africa!");
			break;
		case "Europe":
			System.out.println("you are in Europe!");
			break;
		case "Asia":
			System.out.println("you are in Asia!");
			break;
		case "North America":
			System.out.println("you are in North America!");
			break;
		case "South America":
			System.out.println("you are in South America!");
			break;
		case "Antarctica":
			System.out.println("you are in Antarctica!");
			break;
		case "Australasia":
			System.out.println("you are in Australasia!");
			break;
		default :
			System.out.println("That continent doesn't exist or you have made a spelling mistake");
	}
		System.out.println("End of program");
	}
}
	


//Try out code in following sections
//Flow Control
//Condition
//Create a simple calculator
//Complete Amazon app with Customer and Product
