package com.example.storeSystem;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.core.ParameterizedTypeReference;


@Controller
public class RecTVController implements storeInterface{

	private static final Logger log = LoggerFactory.getLogger(RecTVController.class);

	@Bean
		public RestTemplate restTemplate(RestTemplateBuilder builder) {
			return builder.build();
		}
	
	@Autowired
	RepoService myRepo;
	

	@GetMapping("/rectvpage")
	public String searchForm(Model model, RestTemplate restTemplate) {
		model.addAttribute("rectv", new RecTV());
		String url = "http://localhost:8080/getTvInfo/{sid}";
		long sid = 1l;
		ResponseEntity<String> myTv = restTemplate.exchange(url,HttpMethod.GET,null, new ParameterizedTypeReference<String>() {}, sid);
		log.info(myTv.getBody());
		return "rectvpage";
	}

	@PostMapping("/rectvpage")
	public String searchSubmit(@ModelAttribute RecTV niceTV, Model model, RestTemplate restTemplate) {
		model.addAttribute("rectv", myRepo.findByTwo(niceTV));
		return "result";
	}

	@GetMapping("/result")
	public String chooseRes(@ModelAttribute RecTV foundTV, Model model, RestTemplate restTemplate){
		if (foundTV.getStock() == 0)
		model.addAttribute("rectv", foundTV);
		return "result";
	}

	@PostMapping("/result")
	public String resChose(@ModelAttribute RecTV foundTV, Model model, RestTemplate restTemplate){
		return "final";
	}

}
