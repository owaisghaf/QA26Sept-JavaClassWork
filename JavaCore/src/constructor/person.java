package constructor;

public class person {
	String name;
	int age;
	String address;
	int phone;
	
	public person(String n, int a, String add, int p) {
		name=n;
		if(a<=0)
		{
			System.out.println("age cannot be less than 0");
		}
		else {
			age=a;
		}
			
		address=add;
		phone=p;
		System.out.println(name+"|"+age+"|"+address+"|"+phone);
	}

}
