package com.example.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.example.interfaces.Car;
import com.example.interfaces.Engine;

@Component("AUDI") // this generates AUDI bean
public class AUDI implements Car{
	@Autowired
	@Qualifier("V8")
	Engine eng;
	public String spec()
	{
		System.out.println("This car has "+eng.spec());
		return eng.spec();
}
}
