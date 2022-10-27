package ListOfObjects;

import java.util.ArrayList;

public class TestPerson {
	
	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList();
		list.add(new Person("Owais", 25, "Trainer"));
		list.add(new Person("Owais", 25, "Trainer"));
		list.add(new Person("Owais", 25, "Trainer"));
		list.add(new Person("Owais", 25, "Trainer"));
		
		Person p=new Person();
		p.getPerson(list);
	}
	
	public void Person() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	}


