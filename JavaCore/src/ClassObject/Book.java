package ClassObject;

public class Book {
	String title;
	String author;
	float price;
	String publisher;
	
	public void print()
	{
		System.out.println("The title of the book is " +title);
		System.out.println("The Author of the book is " +author);
		System.out.println("The Publisher of the book is " +publisher);
		System.out.println("The price of the book is £" +price);
	}

}
