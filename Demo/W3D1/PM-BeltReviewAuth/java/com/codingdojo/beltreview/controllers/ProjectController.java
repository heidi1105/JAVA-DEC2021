package com.codingdojo.beltreview.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProjectController {

	@GetMapping("/dashboard")
	public String dashboard(HttpSession session) {
		if(session.getAttribute("userId")==null) {
			return "redirect:/";
		}
		return "dashboard.jsp";
	}
	
	
}
