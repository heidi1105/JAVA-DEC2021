package com.codingdojo.firstrealspringdemo;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/")
	public String index(Model model) {
		ArrayList<String> xmasgifts = new ArrayList<>();
		xmasgifts.add("Justin Bieber Concert Ticket");
		xmasgifts.add("Macbook Pro ");
		xmasgifts.add("Air Fryer");
		
		for(String element : xmasgifts) {
			System.out.println(element);
		}
		
		
		model.addAttribute("giftsInJsp", xmasgifts);
		model.addAttribute("name", "justinbieber");
		return "index.jsp";
	}
	
	
	@GetMapping("/gifts")
	public String gifts(Model model) {
		ArrayList<Gift> gifts = new ArrayList<>();
		Gift a = new Gift("Chocolate", 5.99);
		Gift b = new Gift("Black Belt", 99.99);
		Gift c = new Gift("air ticket", 599);
		gifts.add(a);
		gifts.add(b);
		gifts.add(c);
		
		for(Gift gift : gifts) {
			System.out.println(gift.getName());
		}
		
		
		model.addAttribute("gifts", gifts);
		return "gifts.jsp";
	}
		// connect the jsp files
		// c tag (jstl)
		// c: forEach
		// model.addAttributes
	
}
