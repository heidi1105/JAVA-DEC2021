package com.codingdojo.secondmvc.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.secondmvc.models.LoginUser;
import com.codingdojo.secondmvc.models.User;
import com.codingdojo.secondmvc.services.UserService;


@Controller
public class UserController {
	
	@Autowired
	private UserService userServ;
	
	
	@GetMapping("/")
	public String index(Model model, HttpSession session) {
		if(session.getAttribute("userId")!= null) {
			return "redirect:/dashboard";
		}
		model.addAttribute("newUser", new User()); //for Register form
		model.addAttribute("newLogin", new LoginUser()); //for Login form
		return "index.jsp";
	}
	
    @PostMapping("/register")
    public String register(@Valid @ModelAttribute("newUser") User newUser, 
            BindingResult result,  HttpSession session, Model model) {
        userServ.register(newUser, result);
        if(result.hasErrors()) {
    		model.addAttribute("newLogin", new LoginUser());//+Login form model
            return "index.jsp";
        }
        session.setAttribute("userId", newUser.getId());
        session.setAttribute("userName", newUser.getUserName());
        return "redirect:/dashboard";
    }
    
    @PostMapping("/login")
    public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, 
            BindingResult result, Model model, HttpSession session) {
        User user = userServ.login(newLogin, result);
        if(result.hasErrors()) {
            model.addAttribute("newUser", new User());//+register form model
            return "index.jsp";
        }
        session.setAttribute("userId", user.getId());
        session.setAttribute("userName", user.getUserName());
        return "redirect:/dashboard";
    }
    
    
    @GetMapping("/logout")
    public String home(HttpSession session) {
    	session.invalidate();
    	return "redirect:/";
    }
	
}