package com.codingdojo.secondmvc.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;
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
import org.springframework.web.bind.annotation.RequestParam;

import com.codingdojo.secondmvc.models.Gift;
import com.codingdojo.secondmvc.models.User;
import com.codingdojo.secondmvc.services.GiftService;
import com.codingdojo.secondmvc.services.UserService;

@Controller
public class HomeController {
	
	@Autowired
	GiftService giftService;
	
	@Autowired
	UserService userService;		

	
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
	
	// ****** DELETE ********
	@DeleteMapping("/gifts/{id}/delete")
	public String processDeleteGift(@PathVariable("id")Long id) {
		giftService.deleteGift(id);
		return "redirect:/dashboard";
	}
	
	// ****** COMBINE FORM & DASHBOARD ********
	@GetMapping("/dashboard")
	public String combineBoth(Model model, HttpSession session) {
		if(session.getAttribute("userId")==null) {
			return "redirect:/";
		}
		Gift newGift = new Gift();

		model.addAttribute("newGift", newGift);
		List<Gift> gifts = giftService.allGifts();
		model.addAttribute("gifts", gifts);
		return "combined.jsp";
	}
	
	@PostMapping("/dashboard")
	public String processCombine(@Valid @ModelAttribute("newGift") Gift newGift,
			BindingResult result, Model model, HttpSession session) {
		if(session.getAttribute("userId")==null) {
			return "redirect:/";
		}
		if(result.hasErrors()) {
			List<Gift> gifts = giftService.allGifts();
			model.addAttribute("gifts", gifts);
			return "combined.jsp";
		}else {
			giftService.addGift(newGift);
			return "redirect:/";			
		}
	}
	
	// ****** order By ********
	@GetMapping("/orderByQuantity")
	public String showAllByQuantity(Model model, HttpSession session) {
		if(session.getAttribute("userId")==null) {
			return "redirect:/";
		}
		List<Gift> gifts = giftService.searchAllByQuantityOrder();
		gifts = giftService.searchWithNativeQuery();
		model.addAttribute("gifts", gifts);
		return "dashboard.jsp";
	}
	
	// ****** find name containing keyword ********	
	@GetMapping("/movies/search")
	public String showGiftsWithKeyword(Model model, @RequestParam("keyword") String keyword, HttpSession session) {
		if(session.getAttribute("userId")==null) {
			return "redirect:/";
		}
		List<Gift> gifts = giftService.searchByNameContaining(keyword);
		model.addAttribute("gifts", gifts);
		return "dashboard.jsp";
	}
	
	@PutMapping("/gifts/{giftId}/receive")
	public String receiveGift(@PathVariable("giftId")Long giftId, HttpSession session) {
		Gift gift = giftService.findOneGift(giftId);
		Long userId = (Long) session.getAttribute("userId");
		User user = userService.getOneUser(userId);
		gift.setReceiver(user);
		giftService.editGift(gift);
		return "redirect:/dashboard";
		
	}
	
	
}










