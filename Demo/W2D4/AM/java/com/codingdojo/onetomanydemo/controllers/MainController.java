package com.codingdojo.onetomanydemo.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.onetomanydemo.models.Breed;
import com.codingdojo.onetomanydemo.services.MainService;

@Controller
public class MainController {

	@Autowired
	MainService mainService;
	
	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	// create - render form, post mapping
	@GetMapping("/breeds/add")
	public String addBreedForm(@ModelAttribute("breed")Breed breed) {
		return "addBreedForm.jsp";
	}
	
	@PostMapping("/breeds/add")
	public String processAddBreed(@Valid @ModelAttribute("breed")Breed breed, BindingResult result) {
		if(result.hasErrors()) {
			return "addBreedForm.jsp";
		}else {
			mainService.saveBreed(breed);
			return "redirect:/";
		}
	}
	
	
}
