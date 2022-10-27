package ListOfObjects;

import java.util.ArrayList;
import java.util.Scanner;

public class Person {
	String name;
	int age;
	String jobTitle;
	public void getPerson(ArrayList<Person> x)
	{ 
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Job Title: ");
		String jTitle = scn.next();
		for(int i=0;i<x.size();i++) {
			if(x.get(i).jobTitle.equals(jTitle));
			System.out.println(x.get(i));
		}
		
	}
	
}
