package com.example.handlingformsubmission;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RecTVController {

	@GetMapping("/RecTV")
	public String searchForm(Model model) {
		model.addAttribute("RecTV", new RecTV());
		return "Rectv";
	}

	@PostMapping("/RecTV")
	public String searchSubmit(@ModelAttribute RecTV recTV, Model model) {
		model.addAttribute("RecTV", recTV);
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
