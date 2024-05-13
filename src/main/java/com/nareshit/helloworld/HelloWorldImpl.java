package com.nareshit.helloworld;

import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //in Real Classes
public class HelloWorldImpl {
	
	@RequestMapping(value="/") //in Real Classes
	public String getHelloWorld() {
		final org.slf4j.Logger logger = LoggerFactory.getLogger(HelloWorldImpl.class);
		logger .info("Welcome to Spring Boot 8 to 9 AM Batch from Naresh IT");
		return "Welcome to Spring Boot 8 to 9 AM Batch from Naresh IT";
	}
	
	
	//HelloWorldImpl obj=new HelloWorldImpl();
	//obj.getHelloWorld();

}
