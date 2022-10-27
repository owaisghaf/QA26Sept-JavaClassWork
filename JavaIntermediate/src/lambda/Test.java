package lambda;

public class Test {
	
	public static void main(String[] args) {
		Person p=new Person();
		p.greet();
		// greeting gr=new Greeting  - not allowed
		//Greeting gr= new Person(); - depending on class person
	
	// Anonymous class
		Greeting gr=new Greeting() {
			public void greet()
			{
				System.out.println("hello world");
			}
			public void Welcome() {
				System.out.println("welcome");
			}
		};
		gr.greet();
		
		// lambda expression
		// leftside -> rightside
		// arguments -> body
		
		Greeting gr1=()->{System.out.println("Hello world");};
		gr1.greet();
		
		GreetingWithName grName =(x)->{System.out.println( "Hello "+x) ;};
		grName.greet("Kevin");
		
		GreetingWithReturn grReturn=(x)->{return "Hello "+x ;};
		System.out.println(grReturn.greet("hasan"));
	}


}
