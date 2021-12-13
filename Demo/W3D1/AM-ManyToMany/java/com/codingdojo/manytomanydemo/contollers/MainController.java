package com.codingdojo.manytomanydemo.contollers;

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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.codingdojo.manytomanydemo.models.Dog;
import com.codingdojo.manytomanydemo.models.Treat;
import com.codingdojo.manytomanydemo.services.MainService;

@Controller
public class MainController {
	
	@Autowired
	private MainService mainService;

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("dogs", mainService.allDogs());
		return "index.jsp";
	}
	
	//Add a dog (one get, one post)
	@GetMapping("/dogs/add")
	public String createDogForm(@ModelAttribute("dog") Dog dog) {
		return "newDog.jsp";
	}
	
	@PostMapping("/dogs/add")
	public String processCreateDog(@Valid @ModelAttribute("dog") Dog dog, BindingResult result) {
		if(result.hasErrors()) {
			return "newDog.jsp";
		}else {
			mainService.addDog(dog);
			return "redirect:/";
		}
	}
	
	// Add a treat
	@GetMapping("/treats/add")
	public String createTreatForm(@ModelAttribute("treat")Treat treat) {
		return "newTreat.jsp";
	}
	
	@PostMapping("/treats/add")
	public String processCreateTreat(@Valid @ModelAttribute("treat") Treat treat, BindingResult result) {
		if(result.hasErrors()) {
			return "newTreat.jsp";
		}else {
			mainService.addTreat(treat);
			return "redirect:/";
		}
	}
	
	// show One dog
	@GetMapping("/dogs/{dogId}")
	public String showOneDog(@PathVariable("dogId")Long dogId, Model model) {
		Dog dog = mainService.findOneDog(dogId);
		model.addAttribute("dog", dog);
		List<Treat> allTreats = mainService.allTreats();
		model.addAttribute("allTreats", allTreats);
		return "showOneDog.jsp";
	}
	
	@PutMapping("/dogs/{dogId}")
	public String addTreatToDog(@PathVariable("dogId")Long dogId, 
			@RequestParam("treatId")Long treatId
			) {
		Dog dog = mainService.findOneDog(dogId);
		Treat treat = mainService.findOneTreat(treatId);
		dog.getTreats().add(treat);
		mainService.addTreatToDog(dog);
		return "redirect:/";
		
		// 1. find the dog
		// 2. find the item
		// 3. save to the dog table
		
		
		
	}
	
	
	
	
}
