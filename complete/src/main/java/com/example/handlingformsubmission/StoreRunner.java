package com.example.handlingformsubmission;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class StoreRunner {

	private static final Logger log = LoggerFactory.getLogger(StoreRunner.class);

	public static void main(String[] args) {
		SpringApplication.run(StoreRunner.class, args);
	}

	@Autowired
	RepoService myRepo;

		@Bean
			Public CommandLineRunner handlingformsubmission(RecTVRepo repository) {
				return (args) -> {

					RecTV demoTv = new RecTV(1,"mod1","0\"", "0x0","man1","0","1","0.0");

					repository.save(demoTv);

					//for (RecTv )
					
					Optional<RecTv> tv = repository.findById(1L);
				}
			}
}


