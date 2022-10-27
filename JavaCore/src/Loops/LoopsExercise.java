package Loops;

// if loop inside a while loop to run through a set of values
// and displays whether they are odd or even

public class LoopsExercise {
	public static void main(String[] args) {
	int x=1;
	while (x<=20)
	{ 
	if (x%2==0) 
	{
		System.out.println(x+" is an even number");
	} 
	else {
		System.out.println(x+" is an odd number");
	}
	x++;
	}
}
}