package com.oosdclass.taskTrackerApp2.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oosdclass.taskTrackerApp2.dao.UserDAO;
import com.oosdclass.taskTrackerApp2.model.User;
import com.oosdclass.taskTrackerApp2.service.UserService;

@Repository
public class UserServiceImpl implements UserService {

	@Autowired
	UserDAO userDAO;

	@Override

	public boolean isUserValid(User user) {

		User userFromDb = userDAO.retrieveByUserName(user.getUsername());

		// if no user with user name exists in the DB return false
		if (userFromDb == null) {
			return false;

		}

		// if user name/password typed in by user matches user name/password from data base
		// return true
		if (user.getUsername().equals(userFromDb.getUsername()) && user.getPassword().equals(userFromDb.getPassword())) {
			return true;
		}

		else {
			return false;
		}

	}

	@Override
	public boolean doesUserExist(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isUserAdmin(User user) {
		// TODO Auto-generated method stub
		return false;
	}

}
