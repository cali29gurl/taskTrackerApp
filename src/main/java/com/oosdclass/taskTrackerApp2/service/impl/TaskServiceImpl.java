package com.oosdclass.taskTrackerApp2.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.oosdclass.taskTrackerApp2.model.Task;
import com.oosdclass.taskTrackerApp2.service.TaskService;

public class TaskServiceImpl implements TaskService {

	@Override
	public List<Task> retrieveAllTasks() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	public List<Task> mockTaskDAO(){
		Task task1 = new Task();
		Task task2 = new Task();
		//set all the values for task 1 and 2 
		
		task1.setTaskID(1);
		task1.setDescription("abc");
		task1.setStatus("Accomplished");
		task1.setAssignedTo("Open");
		
		task2.setTaskID(1);
		task2.setDescription("abc");
		task2.setStatus("Accomplished");
		task2.setAssignedTo("Open");
		
		
		List<Task> taskList = new ArrayList<Task>();
		taskList.add(task1);
		taskList.add(task2);
		
		return taskList;
	}

}
