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
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class RecTVController implements storeInterface{

	@Bean
		public RestTemplate restTemplate(RestTemplateBuilder builder) {
			return builder.build();
		}
	
	@Autowired
	RepoService myRepo;

	@GetMapping("/rectvpage")
	public String searchForm(Model model, RestTemplate restTemplate) {
		model.addAttribute("rectv", new RecTV());
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
