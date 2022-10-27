package inheritence;

public class Test {

	public static void main(String[] args) {
		
		// Person p=new Person();
		// Employee e=new Employee();
		Manager m=new Manager("Owais", 25, 1009, "Operations");
		System.out.println("End of code");
		System.out.println(m.name);
		System.out.println(m.age);
		System.out.println(m.empID);
		System.out.println(m.dept);
		m.doSomething();
	}
}
