package com.codingdojo.beltreview.services;

import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.codingdojo.beltreview.models.LoginUser;
import com.codingdojo.beltreview.models.User;
import com.codingdojo.beltreview.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepo;
	
	public User register(User newUser, BindingResult result) {
		if(userRepo.findByEmail(newUser.getEmail()).isPresent()) {     // Check email uniqueness
			result.rejectValue("email", "Unique", "This email is already in use!");  // create the errors back to result
		}
		if(!newUser.getPassword().equals(newUser.getConfirm())) { //Check password & confirm are the same
			result.rejectValue("confirm", "Matches", "The confirmed password does not match.");
		}
		if(result.hasErrors()) { 
			return null;
		}else {
			String hashed = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt()); // hash with new salt
			newUser.setPassword(hashed);
			return userRepo.save(newUser);
		}
	}
	
	// 1. check if the user exists (findByEmail)
		public User login(LoginUser newLogin, BindingResult result) {
			if(result.hasErrors()) {
				return null;
			}
			
			Optional<User> potentialUser = userRepo.findByEmail(newLogin.getEmail());
			if(!potentialUser.isPresent()){
				result.rejectValue("email", "Unqiue", "Unknown Email");
				return null;
			}
	// 2. if it exist, get the user, then checkPw by BCrypt function
			User user = potentialUser.get();
			if(!BCrypt.checkpw(newLogin.getPassword(), user.getPassword())) {
				result.rejectValue("password", "Matches", "Invalid password.");
			}
			if(result.hasErrors()) {
				return null;
			}else {
				return user;
			}	
		}	
		
		// show One User
		public User getUserById(Long id) {
			Optional<User> optionalUser =userRepo.findById(id);
			if(optionalUser.isPresent()) {
				return optionalUser.get();
			}else {
				return null;
			}
		}
	
	
}
