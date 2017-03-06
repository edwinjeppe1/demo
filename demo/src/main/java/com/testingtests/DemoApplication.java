package com.testingtests;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);	
		 System.out.println("5 X 2 = "+Calculations.Multiply(5, 2));			 
	}
}
