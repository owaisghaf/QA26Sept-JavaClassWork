package conditions;

public class TestCondition {
	
public static void main(String[] args)  {
	
	// if statement to find which int is biggest
	int x=10;
	int y=20;
	int z=30;
	if(x>y && y>z) {
		System.out.println("x is biggest");
	}else if(y>x && x>z) {
		System.out.println("y is biggest");
	}else 
		System.out.println("z is biggest");
	
	// if statement to find if 2 strings are the same
	String city="NewYork";
	if(city=="NewYork")
	{
		System.out.println("welcome to new york");
	}else
	{
		System.out.println("you are somewhere else");
	}

	
	
	
}
	
	
}
