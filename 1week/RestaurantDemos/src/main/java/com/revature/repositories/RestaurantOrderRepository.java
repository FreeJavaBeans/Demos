package com.revature.repositories;

import java.util.List;

import com.revature.models.Eater;
import com.revature.models.Order;

//behaviours our Order "database" should have
public interface RestaurantOrderRepository {
	
	public Order findOrderByEater(Eater e);
	
	public List<Order> findAllOrders();
	
	public void deleteOrder(Order o);
	
	public Order updateOrder(Order o);
	
	public Order createOrder(Order o);
	
	

}
