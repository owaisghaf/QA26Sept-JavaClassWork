package inheritence;

// child most class
// Person > Employee > Manager

public abstract class Person {
	int age;
	String name;
	
	public Person(String name, int age)
	{
		this.name=name;
		this.age=age;
		System.out.println("person constructed");
	}
		public abstract void doSomething(); //no body
		
		public void talk()
	    {
	        System.out.println("People do something to make their living");
	    }

}
