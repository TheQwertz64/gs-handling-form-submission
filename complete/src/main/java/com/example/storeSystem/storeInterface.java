package com.example.storeSystem;

import org.springframework.web.client.RestTemplate;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

public interface storeInterface {
    
    @GetMapping("/rectvpage")
	public String searchForm(Model model, RestTemplate restTemplate);

    @PostMapping("/rectvpage")
	public String searchSubmit(@ModelAttribute RecTV niceTV, Model model, RestTemplate restTemplate);



    @GetMapping("/result")
	public String chooseRes(@ModelAttribute RecTV foundTV, Model model);

    @PostMapping("/result")
	public String resChose(@ModelAttribute RecTV recTV, Model model);
}
