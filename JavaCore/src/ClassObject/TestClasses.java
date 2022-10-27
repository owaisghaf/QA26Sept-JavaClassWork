package ClassObject;

import java.util.Scanner;

public class TestClasses {
	public static void main(String[] args) {
		Book book1=new Book(); // creates an object and allocates a memory
		//book1 -->0000x
		book1.title="Tell me your dreams";
		book1.author="Sidney  Sheldon";
		book1.price=15.50F;
		book1.publisher="XYZ publishing";
		
		book1.print();
		
		// asks for input for the title, author, publisher and price and then calls on Book method to print it
		Book book2=new Book();
		Scanner scn=new Scanner(System.in);
		System.out.println("enter title");
		book2.title=scn.nextLine();
		System.out.println("enter author");
		book2.author=scn.nextLine();
		System.out.println("enter publisher");
		book2.publisher=scn.nextLine();
		System.out.println("enter price");
		book2.price=scn.nextFloat();

		
		book2.print();
		
		
	}

}
