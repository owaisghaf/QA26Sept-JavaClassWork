package inheritence;

// intermediate class
// Person > Employee > Manager

public class Employee extends Person{
	int empID;
	
	public Employee(String name, int age, int empID)
	{
		super(name, age);
		this.empID=empID;
		System.out.println("Employee constructed");
		//super()// calls the constructor of super class (immediate child)
	}
		public void doSomething()
	    {
	        System.out.println("People do something to make their living");
	    }

}
