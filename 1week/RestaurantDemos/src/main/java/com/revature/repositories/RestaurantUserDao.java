package com.revature.repositories;

import java.util.List;

import com.revature.exceptions.InternalErrorException;
import com.revature.exceptions.UserNotFoundException;
import com.revature.models.User;

public interface RestaurantUserDao {

	public User findUserByUsernameAndPassword(String username, String password) throws UserNotFoundException, InternalErrorException;
	
	public List<User> findAllusers();
	
	public User findUserByUserId(int userId);
	
	
}
