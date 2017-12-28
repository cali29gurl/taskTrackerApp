package com.oosdclass.taskTrackerApp2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.oosdclass.taskTrackerApp2.model.User;
import com.oosdclass.taskTrackerApp2.service.UserService;


@Controller
public class UserController {
	
	// (/) method (GET) is the first method that is called when the user accesses
	//our app using
	//the root context and displays the home page, which is nothing but login
	//when the user accesses the login page we are initializing User object for the user
	//to fill in
	
@Autowired
UserService userService;

//GET: display user form
	@RequestMapping(value = "/")
	public ModelAndView login(ModelAndView model) {
		
		User user = new User();
		model.addObject(user);
		model.setViewName("home");
		return model;
	}
	
	//POST: post user info
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView login(User userLoginFormObject) {
		
		ModelAndView model = null;
		
		if(userService.isUserValid(userLoginFormObject)) {
			model = new ModelAndView("redirect:/adminTasks");
		} else {
			model = new ModelAndView("home");
			model.addObject("error", "Username does not exist");
		}
		return model;
	}

}




