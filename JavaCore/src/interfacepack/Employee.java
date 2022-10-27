package interfacepack;

public class Employee extends Person implements Artist,Player {
	
public void doSomething() {
	System.out.println("every employee has job profile to perform his duty.");
}
public void doArt() //no body
{
	System.out.println("employees can be interested in some art");
}

public void doPlay()
{
	System.out.println("playing something is good for mental and physical health");
}

public void do1()
{
	System.out.println("everything is doable");
}

}
