package com.codingdojo.onetomanydemo.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.onetomanydemo.models.Breed;
import com.codingdojo.onetomanydemo.models.Dog;
import com.codingdojo.onetomanydemo.services.MainService;

@Controller
public class MainController {

	@Autowired
	MainService mainService;
	
	@GetMapping("/")
	public String index(Model model) {
		List<Dog> dogs = mainService.allDogs();
		model.addAttribute("dogs", dogs);
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
	
	// CREATE DOGS 
	@GetMapping("/dogs/add")
	public String addDogForm(@ModelAttribute("dog")Dog dog, Model model) {
		List<Breed> breeds = mainService.allBreeds();
		model.addAttribute("breeds", breeds);
		return "addDogForm.jsp";
	}
	
	@PostMapping("/dogs/add")
	public String processAddDog(@Valid @ModelAttribute("dog")Dog dog, 
			BindingResult result, Model model) {
		if(result.hasErrors()) {
			List<Breed> breeds = mainService.allBreeds();
			model.addAttribute("breeds", breeds);
			return "addDogForm.jsp";
		}else {
			mainService.saveDog(dog);
			return "redirect:/";
		}
	}
	
	// SHOW ONE BREED
	@GetMapping("/breeds/{breedId}")
	public String showOneBreed(@PathVariable("breedId") Long breedId, Model model) {
		Breed breed = mainService.findOneBreed(breedId);
		model.addAttribute("breed", breed);
		return "showBreed.jsp";
	}
	
	
	
	
	
	
}
