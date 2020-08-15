package com.example.Mapping01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.example")
@SpringBootApplication
public class Mapping01Application {

	public static void main(String[] args) {
		SpringApplication.run(Mapping01Application.class, args);
	}

}
