package com.nareshit.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Bootstrap Class ==> Stating Point

@SpringBootApplication

public class HelloWorldInit {

	public static void main(String[] args) {
		System.setProperty("server.port", "8082");
		SpringApplication.run(HelloWorldInit.class, args);

	}

}
