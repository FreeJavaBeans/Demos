package com.revature.services;

import com.revature.models.Food;
import com.revature.models.Order;
import com.revature.models.User;

public interface RestaureantOrderService {

	
	public Order addFoodToOrder(Food f, User currentUser);
	
	
	
	
}
