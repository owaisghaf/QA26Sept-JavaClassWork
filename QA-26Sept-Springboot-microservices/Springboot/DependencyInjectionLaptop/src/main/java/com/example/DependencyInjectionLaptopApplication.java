package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.Storage.laptop;

@SpringBootApplication
public class DependencyInjectionLaptopApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DependencyInjectionLaptopApplication.class, args);
			laptop LT1=context.getBean("Dell", laptop.class);
			laptop LT2=context.getBean("Apple", laptop.class);
			
			LT1.spec();
			LT2.spec();
	
	
	}

}
