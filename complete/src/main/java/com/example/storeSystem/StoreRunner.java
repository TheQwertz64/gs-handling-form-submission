package com.example.storeSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
public class StoreRunner {

	private static final Logger log = LoggerFactory.getLogger(StoreRunner.class);

	public static void main(String[] args) {
		SpringApplication.run(StoreRunner.class, args);
	}

	/*@Bean 
		public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
			return args -> {
				= restTemplate.get
			}
		}*/
}


