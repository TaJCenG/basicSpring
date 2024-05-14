package com.nareshit.helloworld;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //in Real Classes
public class HelloWorldImpl {
	
	@RequestMapping(value="/") 
	public String getHelloWorld() {
		Properties props = new Properties();
        props.put("bootstrap.servers", "localhost:8081");
        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        try (Producer<String, String> producer = new KafkaProducer<>(props)) {
			//try (Producer<String, String> producer1 = new KafkaProducer<>(props)) {
				String message = "Welcome to  Spring Boot A";
			//	String message1 = "Welcome to  Spring Boot A message1";
				final org.slf4j.Logger logger = LoggerFactory.getLogger(HelloWorldImpl.class);
				logger .info("Welcome to Spring Boot A service");
				//logger .info("Welcome to Spring Boot A service");
				producer.send(new ProducerRecord<>("my-topic", "key", message));
				//producer1.send(new ProducerRecord<>("my-topic", "key", message1));
			}
		//}
        return " return Spring Boot A";
	}
}
