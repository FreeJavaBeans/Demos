package com.revature.repositories;

import java.util.ArrayList;
import java.util.List;

import com.revature.models.Eater;
import com.revature.models.Order;

public class TrickOrEatOrderDAO implements RestaurantOrderRepository {
	
	//the data we keep track of is in place of a real database
	//eventually this will be replaced;
	private List<Order> allOrders;
	
	
	public TrickOrEatOrderDAO() {
		super();
		allOrders = new ArrayList<Order>();
	}
	
	
	// this is an operation to find data
	// data should not be changed
	public Order findOrderByEater(Eater e) {
		Order found = null;
		for(Order o : allOrders) {
			if(o.getOrderer().equals(e)) {
				found = o;
				break;
			}
		}
		return found;
	}

	public List<Order> findAllOrders() {
		// TODO Auto-generated method stub
		return allOrders;
	}

	public void deleteOrder(Order o) {
		// TODO Auto-generated method stub
		allOrders.remove(allOrders.indexOf(o));
	}
	
	//requires eaters to only have a single order
	public Order updateOrder(Order o) {
		boolean found = false;
		for(Order toUpdate : allOrders) {
			if(toUpdate.getOrderer().equals(o.getOrderer())) {
				toUpdate = o;
				found = true;
				break;
			}
		}		
		if(found) {
			return o;
		}else {
			return null;
		}
	}

	public Order createOrder(Order o) {
		allOrders.add(o);
		return o;
	} 

}
