package inheritence;

// Parent most class
// Person > Employee > Manager

public class Manager extends Employee {
	String dept;

	public Manager(String name, int age, int empID, String dept)
	{
		super(name, age, empID);
		this.dept=dept;
		System.out.println("Manager constructed");
		//super()// calls the constructor of super class (immediate child)
	}
		public void doSomething()
	    {
	        System.out.println("People do something to make their living");
	    }
	
	
}
