package com.example.learning.service;

import org.springframework.stereotype.Component;

@Component
public class UserService {

	public String createWelcomeMsg(String userName)
	{
		return "hello <b>"+userName+"</b> Welcome in our Learning Project";
	}
}
