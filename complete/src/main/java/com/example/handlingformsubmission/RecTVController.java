package com.example.handlingformsubmission;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
public class RecTVController {

	
	@Autowired
	RepoService myRepo;

	@GetMapping("/rectvpage")
	public String searchForm(Model model) {
		model.addAttribute("rectv", new RecTV());
		return "rectv";
	}

	@PostMapping("/rectvpage")
	public String searchSubmit(@ModelAttribute RecTV niceTV, Model model) {
		model.addAttribute("rectv", niceTV);
		return "result";
	}

	@GetMapping("/Final")
	public String mod(@ModelAttribute RecTV recTV, Model model){
		model.addAttribute("RecTV", recTV);
		return "result";
	}

	@PostMapping("/Final")
	public String selModel(@ModelAttribute RecTV recTV, Model model){
		model.addAttribute("RecTV", recTV);
		//myRepo.saveRecTV(recTV);
		return "final";
	}

	/*
	 * @GetMapping("/Sales")
	 * @PostMapping("/Sales")
	 * 
	 * 
	 * @GetMapping("/Special_Order")
	 * @PostMapping("/Special_Order")
	 * 
	 */

}
