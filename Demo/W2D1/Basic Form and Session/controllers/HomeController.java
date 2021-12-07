package com.codingdojo.sessionformdemo.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@GetMapping("/setCount")
	public String setCount(HttpSession session) {
		if(session.getAttribute("count") == null) {
			session.setAttribute("count", 1);
		}else {
			// if session is availabe, cast the session count as integer, then add 1 
			Integer count = (Integer) session.getAttribute("count");
			session.setAttribute("count", count+1);
		}
		return "setCount.jsp";	
	}
	
	@GetMapping("/addCount/{addCount}")
	public String setCount(HttpSession session, @PathVariable("addCount") Integer addCount) {
		if(session.getAttribute("count") == null) {
			session.setAttribute("count", addCount);
		}else {
			Integer count = (Integer) session.getAttribute("count");
			session.setAttribute("count", count+addCount);
		}
		return "setCount.jsp";	
	}
	
	@GetMapping("/getCount")
	public String getCount() {
		return "getCount.jsp";
	}
	
	@GetMapping("/form")
	public String form() {
		System.out.println("Showing the form.jsp");
		return "form.jsp";
	}
	
	@PostMapping("/processForm")
	public String processForm(
			@RequestParam("name") String name,
			@RequestParam("quantity") Integer quantity,
			@RequestParam("description") String description,
			HttpSession session
			) {
		session.setAttribute("name", name);
		session.setAttribute("quantity", quantity);
		session.setAttribute("description", description);
		System.out.println("in post request for process form");
		return "redirect:/showForm";
	}
	
	@GetMapping("/showForm")
	public String showForm() {
		System.out.println("in showForm");
		return "showForm.jsp";
	}
	
// ************* Get Method *******************	
	@GetMapping("/searchForm")
	public String searchForm() {
		return "searchForm.jsp";
	}
	
	@GetMapping("/showSearch")
	public String showSearchForm(@RequestParam("keyword")String keyword, Model model) {
		model.addAttribute("keyword",keyword);
		return "showSearch.jsp";
	}
	
	
}
