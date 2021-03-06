package com.revature.services;

import java.util.ArrayList;
import java.util.List;

import com.revature.RestaurantLauncher;
import com.revature.models.Food;
import com.revature.models.Order;
import com.revature.models.User;
import com.revature.repositories.RestaurantOrderRepository;
import com.revature.repositories.TrickOrEatOrderDAO;

public class TrickOrEatOrderService implements RestaureantOrderService {
	
	RestaurantOrderRepository ror = new TrickOrEatOrderDAO();
	

	public Order addFoodToOrder(Food f, User currentUser) {
		//look for a current order
		Order current = ror.findOrderByEater(currentUser);
		//if DNE
		if(current == null) {
			//make a new order
			List<Food> orderFood = new ArrayList<Food>();
			orderFood.add(f);
			Order newOrder = new Order (orderFood, currentUser);
			//save it
			return ror.createOrder(newOrder);
		}else {
			//IF DE
			//Modify
			current.getOrderItems().add(f);
			//Update
			return ror.updateOrder(current);
		}
		
	}

}
