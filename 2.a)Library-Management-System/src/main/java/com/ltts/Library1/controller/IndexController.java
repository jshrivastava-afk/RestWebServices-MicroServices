package com.ltts.Library1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.ltts.Library1.model.User;
import com.ltts.Library1.repository.UserRepository;

@Controller
public class IndexController {

	@Autowired
	private UserRepository userRepo;
	
	
	@GetMapping("")
	public String viewHomePage() {
		return "indexmain";
	}
	
	@GetMapping("/register")
	public String showRegistrationForm(Model model) {
		model.addAttribute("user", new User());
		
		return "signup_form";
	}
	
	@PostMapping("/process_register")
	public String processRegister(User user) {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String encodedPassword = passwordEncoder.encode(user.getPassword());
		user.setPassword(encodedPassword);
		
		userRepo.save(user);
		
		return "register_success";
	}
	@GetMapping("/user1")
	public String listUsers(Model model) {
		List<User> listUsers = userRepo.findAll();
		model.addAttribute("listUsers", listUsers);
		
		return "user";	
		}
	
	@GetMapping("/users")
	public String view() {
		
		
		return "index";
	}
	
}
