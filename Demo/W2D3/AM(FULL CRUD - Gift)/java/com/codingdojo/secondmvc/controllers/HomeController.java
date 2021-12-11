package com.codingdojo.secondmvc.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.codingdojo.secondmvc.models.Gift;
import com.codingdojo.secondmvc.services.GiftService;

@Controller
public class HomeController {
	
	@Autowired
	GiftService giftService;
	
	// ****** find all ********
	@GetMapping("/dashboard")
	public String dashboard(Model model) {
		List<Gift> gifts = giftService.allGifts();
		model.addAttribute("gifts", gifts);
		return "dashboard.jsp";
	}
	
	// ****** CREATE ******** (GET to render form, POST to process form)
	@GetMapping("/gifts/create")
	public String createForm(@ModelAttribute("newGift")Gift newGift) {
		
		return "createForm.jsp";
	}
	
	@PostMapping("/gifts/create")
	public String processCreateForm(@Valid @ModelAttribute("newGift")Gift newGift, 
			BindingResult result) {
		if(result.hasErrors()) {
			return "createForm.jsp";
		}else {
			giftService.addGift(newGift);
			return "redirect:/dashboard";			
		}
	}
	
	// ****** SHOW ONE ******* use path variable
	@GetMapping("/gifts/{id}")
	public String showOneGift(@PathVariable("id")Long id, Model model) {
		Gift gift = giftService.findOneGift(id);
		model.addAttribute("gift", gift);
		return "showOneGift.jsp";
	}
	
	// ****** EDIT ******** (combining showOne & create)
	//  (GET to render form, PUT to process form)
	@GetMapping("/gifts/{id}/edit")
	public String editForm(@PathVariable("id")Long id, Model model) {
		Gift gift = giftService.findOneGift(id);
//		Gift emptyGift = new Gift();
		model.addAttribute("gift", gift);
		return "editForm.jsp";
	}	
	
	@PutMapping("/gifts/{id}/edit")
	public String processEditForm(@Valid @ModelAttribute("gift")Gift gift,
			BindingResult result, @PathVariable("id")Long id) {
		if(result.hasErrors()) {
			return "editForm.jsp";
		}else {
			giftService.editGift(gift);
			return "redirect:/dashboard";
		}
	}
	
	@DeleteMapping("/gifts/{id}/delete")
	public String processDeleteGift(@PathVariable("id")Long id) {
		giftService.deleteGift(id);
		return "redirect:/dashboard";
	}
	
	
}
