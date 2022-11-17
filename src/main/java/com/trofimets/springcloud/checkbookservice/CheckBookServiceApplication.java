package com.trofimets.springcloud.checkbookservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableBinding(Processor.class)
public class CheckBookServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CheckBookServiceApplication.class, args);
	}

}
