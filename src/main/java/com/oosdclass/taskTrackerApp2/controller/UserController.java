package com.oosdclass.taskTrackerApp2.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.oosdclass.taskTrackerApp2.model.User;

@Controller
public class UserController {
	
	// (/) method (GET) is the first method trhat is called when the user accesses
	//our app using
	//the root context and displays the home page, which is nothing but login
	//when the user accesses the login page we are initializing User object for the user
	//to fill in
	@RequestMapping(value = "/") 
	public ModelAndView login(ModelAndView model) { 
		User user = new User(); 
	//by adding object we are informing  
	//spring mvc to initialize user object on the login page 
	model.addObject(user); 
	//by setting viewname to home spring mvc displays  
	//the jsp that is name home 
	model.setViewName("home"); 
	return model; 

}
	//(/login) method (POST) is mapped to /login URL where user post/submits the 
	// form which is mapped to user object and we pass to service 
	@RequestMapping(value = "/login", method = RequestMethod.POST) 
		public ModelAndView login(User userLoginFormObject) { 
			System.out.println("username captured from the user is:" + userLoginFormObject.getUsername()); 
			System.out.println("password captured from the user is:" + userLoginFormObject.getPassword()); 
			
			ModelAndView model = new ModelAndView(); 
			model.setViewName("viewTask"); 
			return model; 
		} 
	}
	 



