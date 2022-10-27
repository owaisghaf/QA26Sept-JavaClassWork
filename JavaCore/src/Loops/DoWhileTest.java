package Loops;

// prints out hello as long as a certain condition is met. 
// "Do this whilst ..."

public class DoWhileTest {
	public static void main(String[] args) {
		int x=0;
		do {
			System.out.println("Hello "+x+" times");
			x++;
		} while(x<=10);
	}
}
