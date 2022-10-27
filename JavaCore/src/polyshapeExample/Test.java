package polyshapeExample;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("What shape do you have? Triangle, Square or Circle");
		String x= scn.next();
				
		Circle c=new Circle();
		Square s=new Square();
		Triangle t=new Triangle();
		
		switch(x) {
		case "Triangle":
		t.CalculateArea(3, 1);
		break;
		
		case "Circle":
		c.CalculateArea(5);
		break;
		
		case "Square":
		s.CalculateArea(4);
		break;
		
		default:
		System.out.println("you have entered the wrong shape, please try again");
		}
	}

}
