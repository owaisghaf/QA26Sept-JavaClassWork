package calculator;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
	Calculator CALC=new Calculator();
	Scanner scn = new Scanner(System.in);
	System.out.println("Please enter the first number");
	int x=scn.nextInt();
	System.out.println("Please enter the operation (+ , - , / , * )");
	CALC.operation = scn.next();
	System.out.println("Please enter the second number");
	int y=scn.nextInt();
	
	switch (CALC.operation) {
	case "+":
		System.out.println("The answer is " +CALC.add(x, y));
	break;
	case "-":
		System.out.println("The answer is " +CALC.minus(x, y));
	break;
	case "/":
		System.out.println("The answer is " +CALC.div());
	break;
	case "*":
		System.out.println("The answer is " +CALC.multi());
	break;
	default :
		System.out.println("You have entered an invalid operation");
	}
		System.out.println("End of program");
	}
	

}
