package com.oosdclass.taskTrackerApp2.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oosdclass.taskTrackerApp2.dao.TaskDAO;
import com.oosdclass.taskTrackerApp2.model.Task;
import com.oosdclass.taskTrackerApp2.service.TaskService;

@Service
public class TaskServiceImpl implements TaskService {

	// create default properties

	public static final String DEFAULT_STATUS = "OPEN";

	public static final String DEFAULT_ASSIGNED = "UNASSIGNED";

	// Dependency Injection & Inversion Of Control

	@Autowired

	TaskDAO taskdao;

	@Override

	public List<Task> retrieveAllTasks() {

		return taskdao.retrieveAllTasks();

	}

	// to be replaced by whatever the service layer creates - this is my attempt at
	// the service layer!

	@Override

	public void saveTask(Task task) {

		task.setStatus(DEFAULT_STATUS);

		task.setAssignedTo(DEFAULT_ASSIGNED);

		taskdao.saveTask(task);
	}

}
