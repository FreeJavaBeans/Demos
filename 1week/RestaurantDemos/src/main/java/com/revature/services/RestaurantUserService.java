package com.revature.services;

import java.util.List;

import com.revature.exceptions.InternalErrorException;
import com.revature.exceptions.UserNotFoundException;
import com.revature.models.User;

public interface RestaurantUserService {
	
	public User login(String username, String password) throws UserNotFoundException, InternalErrorException;
	
	public User createNewUser(User u);
	
	public User findUserByUserId(int userId);
	
	public List<User> findAllUsers();
	

}
