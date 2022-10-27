package arrays;

public class ArrayExample {

	public static void main(String[] args) {
	// declare 
	// instantiate
	// initialize
		
		String[] student;	    // declare
		student=new String[5];	// instantiate
		student[0]="Owais";		// initialise
		student[1]="laraib";
		student[2]="zayn";
		student[3]="aneeqa";
		student[4]="ibi";
	
		for (int i=0; i<student.length; i++)
		{System.out.println(student[i]); }
		
		String[] fruits= {"banana", "apple", "grapes", "guava", "pineapple", "avocado"};	// declare 
		for (int i=0; i<fruits.length; i++)
		{System.out.println(fruits[i]); }
		
		int[] zipcode= {234, 345, 456, 567, 678, 678, 789};
		for (int i=0; i<zipcode.length; i++)
		{System.out.println(zipcode[i]); }
	}
}
