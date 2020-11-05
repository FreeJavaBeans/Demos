package com.revature.services;

import java.util.List;

import com.revature.RestaurantLauncher;
import com.revature.exceptions.InternalErrorException;
import com.revature.exceptions.UserNotFoundException;
import com.revature.models.User;
import com.revature.repositories.RestaurantUserDao;
import com.revature.repositories.TrickOrEatUserDao;

public class TrickOrEatUserService implements RestaurantUserService {
	
	private RestaurantUserDao rud = new TrickOrEatUserDao();
	
	

	
	public User login(String username, String password) throws UserNotFoundException, InternalErrorException {
		User login = rud.findUserByUsernameAndPassword(username, password);
		RestaurantLauncher.logger.info(login.getName() + " has logged in");
		return login;
	}

		public User createNewUser(User u) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public User findUserByUserId(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

}
