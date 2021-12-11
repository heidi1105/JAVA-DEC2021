package com.codingdojo.firstrealspringdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/restcontroller")
public class HomeController {
	
	@RequestMapping("/hello")
	public String hello() {
		return "hello";	
	}
	
	@GetMapping("/world")
	public String world() {
		return "world";	
	}
	
	
	//******************* REQUEST PARAM ********************************
	@GetMapping("/christmas")
	public String songs(@RequestParam(value="name", required=false) String queryValue, @RequestParam(value="singer", required=false) String singerQueryValue) {
		// Query: ?name = queryValue
		// queryValue = whatever
		return "name: " + queryValue + "singer: " + singerQueryValue;
	}
	
	@GetMapping("/artist")
	public String artist(@RequestParam(value="firstname", required=false) String firstname, 
			@RequestParam(value="lastname", required=false) String lastname,
			@RequestParam(value="count") int count) {
		//default of RequestParam --> required is true
		count += 10;
		
		return "first name: " + firstname + " last name: " + lastname + " Count: " + count;
	}	
	
	//Query parameters     http://www.google.com/search?q=alskdjflaksdjflaksdj
	// http://localhost:8080/?name=heidi&company=codingdojo
	// firstname: justin
	// lastname: bieber
	
	//******************* PATH VARIABLES ********************************
	// https://login.codingdojo.com/m/315/12312421
	
	@GetMapping("/path/{firstname}/{lastname}/{count}")
	public String pathdemo(
			@PathVariable("firstname") String firstname, 
			@PathVariable("lastname") String lastname,
			@PathVariable("count") int count
			) {
		count += 10;		
		return "first name: " + firstname + " last name: " + lastname + " Count: " + count;
	}
	
	
}
