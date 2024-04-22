package com.example.handlingformsubmission;

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

	

	@Bean
		public RestTemplate restTemplate(RestTemplateBuilder builder) {
			return builder.build();
		}
	
	@Bean
		public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
			return args -> {
		RecTV testTv2 = restTemplate.getForObject("http://localhost:8081/store", RecTV.class);
			};
		}
	
		@Autowired
		RepoService myRepo;
	
			@Bean
				public CommandLineRunner handlingformsubmission(RecTVRepo repository) {
					return (args) -> {
						RecTV testTv = new RecTV();
							testTv.setSid(99L);

							//myRepo.saveRecTV(testTv);


						RecTV demoTv = new RecTV(1L,"mod1","0\"", "0x0","man1",0.0f,1,0.0f);
						//myRepo.saveRecTV(demoTv);
						
						repository.save(demoTv);
	
						
						Optional<RecTV> tv = repository.findById(1L);
					};
				}


}


