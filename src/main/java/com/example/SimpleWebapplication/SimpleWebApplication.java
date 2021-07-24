package com.example.SimpleWebapplication;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Enumeration;


@SpringBootApplication
public class SimpleWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleWebApplication.class, args);
	}
}
