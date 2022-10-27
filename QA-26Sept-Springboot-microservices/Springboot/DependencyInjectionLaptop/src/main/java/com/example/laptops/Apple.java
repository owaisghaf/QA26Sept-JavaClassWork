package com.example.laptops;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.example.Storage.laptop;
import com.example.Storage.storage;

@Component("Apple")
public class Apple implements laptop{
	
	@Autowired
	@Qualifier("1TB")
	storage sto;
	public String spec() {
		
		System.out.println("This laptop has "+sto.spec()+" sized HDD");
		return sto.spec();

}
}
