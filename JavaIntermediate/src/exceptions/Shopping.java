package exceptions;

public class Shopping {
	
	// Handling the Exception | take the responsibility of fixing all the issues by itself
	public void addToCart()
	{
		String[] cart=new String[5];
		cart[5]="mobile";
	}
	
	// Declaring the exception | I will pass the ownership to calling environment
	public void makePayment() throws Exception
	{
		int x = 10;
		int y= 0;
		int z = x/y;
	}

}
