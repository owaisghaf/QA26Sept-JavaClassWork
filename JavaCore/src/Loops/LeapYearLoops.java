package Loops;

// program for loops in a loop.
// satisfy a number of conditions that are reliant on each other

import java.util.Scanner;

public class LeapYearLoops {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter the year");
		int x = scn.nextInt();
	
	if(x%4==0) 
	{
		if (x%100==0) {
			if (x%400==0) {
			System.out.println(x+ " is a leap year");
		} else {
			System.out.println(x+ " is not a leap year");
		}
	}
	}
	else
	{System.out.println(x+ " is not a leap year");}
	}
}