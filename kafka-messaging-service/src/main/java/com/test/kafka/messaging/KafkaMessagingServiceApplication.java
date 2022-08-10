package com.test.kafka.messaging;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class KafkaMessagingServiceApplication implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(KafkaMessagingServiceApplication.class, args);
	}

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	public void sendMessage(String msg) {
		System.out.println("Sending message");
		kafkaTemplate.send("weatherreport", msg);
	}

	@KafkaListener(topics = "weatherreport", groupId = "group-id")
	public void listen(String message) {
		System.out.println("Received Messasge in group - group-id: " + message);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("run() method called");
		sendMessage("Weather is 40 degrees");
	}

}
