 package com.mkyong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootWebApplication {

	public static void main(String[] args) throws Exception {
		System.out.println("SpringBootWebApplication.main(): Start");
		SpringApplication.run(SpringBootWebApplication.class, args);
		System.out.println("SpringBootWebApplication.main(): End");
	}

}