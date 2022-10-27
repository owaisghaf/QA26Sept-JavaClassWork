package methodoverloading;

public class Sample {

	// method overloading is when we have more than one methods with the same name but they differ in the
	// no. of args
	// data of args
	// order og args
	
	public void sum(int x, int y) {}
	public void sum(float x, float y) {}
	public void sum(int x, float y) {}
	public void sum(float y, int x) {}
	public void sum(double x, double y, double z) {}
	public void sum(int x, int y, int z) {}
	
}
