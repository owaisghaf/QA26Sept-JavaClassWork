package com.example.mybeans;

public class Person {
	
	String Name;
	int Age;
	public Person(String name, int age) {
		super();
		this.Name = name;
		this.Age = age;
	}
	@Override
	public String toString() {
		return "Person [Name=" + Name + ", Age=" + Age + "]";
	}

	

}
