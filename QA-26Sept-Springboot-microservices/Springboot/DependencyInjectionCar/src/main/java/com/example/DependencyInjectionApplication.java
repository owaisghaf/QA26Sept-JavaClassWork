package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.cars.AUDI;
import com.example.cars.BMW;
import com.example.interfaces.Car;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DependencyInjectionApplication.class, args);
		//AUDI car1=new AUDI();
		//BMW car2=new BMW();
		//Car car1=new AUDI();
		//Car car2=new BMW();
		
		Car car1=context.getBean("AUDI", Car.class);
		Car car2=context.getBean("BMW", Car.class);
		
		
		car1.spec();
		car2.spec();
	}

}
