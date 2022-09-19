package com.example.learning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.learning.service.UserService;

@RestController
@CrossOrigin
@RequestMapping(value = "/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/welcome/{userName}")
	public String welcomeUser(@PathVariable(name = "userName") String userName) {
		return userService.createWelcomeMsg(userName);
	}

}
