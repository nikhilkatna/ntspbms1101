package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClassA {

	public static void main(String[] args) {
		SpringApplication.run(ClassA.class, args);
        System.out.println("Welcome to Docker Application..");
	}

}
