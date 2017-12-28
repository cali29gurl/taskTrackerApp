package com.oosdclass.taskTrackerApp2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.oosdclass.taskTrackerApp2.model.Task;
import com.oosdclass.taskTrackerApp2.service.TaskService;

@Controller
public class TaskController {

	//link the UI to the service layer
	@Autowired
	TaskService taskService;
	
	//GET: show the task view page-map viewTasks method to web page
	@RequestMapping(value="/adminTasks")
	public ModelAndView viewTasks(ModelAndView model) {
		//map list of tasks to table in view page
		List<Task> taskList = taskService.retrieveAllTasks();
		model.addObject(taskList);
		model.setViewName("adminTask");
		return model;	
	}
	//GET: show the administrator
	@RequestMapping(value="/createTaskForm")
	public ModelAndView createTaskForm(ModelAndView model) {
		//map create task form in the view page
		//replace the mock method with the service
		Task task =new Task();
		model.addObject(task);
		model.setViewName("createTask");
		return model;
	}
	
	
	
		
	//POST: to DAO
	@RequestMapping(value="/createTask", method= RequestMethod.POST)
	public ModelAndView createTask(Task task) {
		
		ModelAndView model=null;
		model = new ModelAndView("redirect:adminTasks");
		
		//Task task = new Task();
		//model.setViewName("viewTask");
		return model;
}
}