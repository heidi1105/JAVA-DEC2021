package com.codingdojo.advancedform.controllers;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.codingdojo.advancedform.models.Song;


@Controller
public class HomeController {

	@GetMapping("/basicform")
	public String basicForm() {
		return "form.jsp";
	}
	
	@GetMapping("/showBasicform")
	public String showbasicForm() {
		return "showForm.jsp";
	}
	
	@PostMapping("/processBasicform")
	public String processBasicform(
			@RequestParam("name")String name,
			@RequestParam("singer")String singer,
			@RequestParam("debut") @DateTimeFormat(pattern="yyyy-MM-dd") Date debut,
			HttpSession session 
			) {
		session.setAttribute("name", name);
		session.setAttribute("singer", singer);
		session.setAttribute("debut", debut);
		
		return "redirect:/showBasicform";
	}
	
	@GetMapping("/formform")
	public String formform(@ModelAttribute("song") Song song) {
		return "formform.jsp";
	}
	
	@GetMapping("/showFormform")
	public String showFormform() {
		return "showFormform.jsp";
	}
	
	@PostMapping("/processFormform")
	public String processFormform(@ModelAttribute("song") Song song, 
			BindingResult result,
			HttpSession session 
			) {
		session.setAttribute("song", song);

		
		return "redirect:/showFormform";
	}
	
	
}
