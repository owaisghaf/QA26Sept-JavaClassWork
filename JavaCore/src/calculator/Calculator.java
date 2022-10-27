package calculator;

public class Calculator {
	String operation;
	int x;
	int y;
	
	public int add(int x, int y) {
		return (x+y);
	}

	public int minus(int x, int y) {
		return (x-y);
	}
	
	public int div() {
		return (x/y);
	}
	
	public int multi() {
		return (x*y);
	}
}
