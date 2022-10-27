package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Execution point
@SpringBootApplication
//@ComponentScan -- look for based package -- com.example
//@EnableAutoConfiguration -- auto configure many tools that are embedded in SB app
//@Configure -- all codes written by the developer are configured internally

public class MyFirstWebSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyFirstWebSpringApplication.class, args);
	}

}
