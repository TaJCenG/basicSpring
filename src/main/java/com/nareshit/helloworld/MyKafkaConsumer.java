package com.nareshit.helloworld;

import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


@Service
public class MyKafkaConsumer {
    private final Logger logger = LoggerFactory.getLogger(MyKafkaConsumer.class);

   
    public void processMessage(String message, String message1) {
    	Properties props = new Properties();
        props.put("bootstrap.servers", "localhost:8081");
        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        logger.info("Received message from Kafka: " + message);
        logger.info("Received message from Kafka: " + message1);
        // Process the message as needed
    }
}
