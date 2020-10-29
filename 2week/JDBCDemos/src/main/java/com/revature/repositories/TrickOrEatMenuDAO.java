package com.revature.repositories;

import java.sql.Connection;
import java.util.Set;

import com.revature.exceptions.ClosedKitchenException;
import com.revature.models.Food;
import com.revature.util.ConnectionUtil;

public class TrickOrEatMenuDAO implements RestaurantMenuRepository {
	
	
	private ConnectionUtil cu = ConnectionUtil.getConnectionUtil();
	

	public Set<Food> getAllFoodOnMenu() {
		//get a connection
		Connection conn = cu.getConnection();
		//prepare a sql statement to get all food "Select * from Food;"
		//execute the statement
		//loop through resultset building food objects
		//add food to a hashset
		//return that set
		return null;
	}

	public Food customOrder(Food newFood) throws ClosedKitchenException {
		throw new ClosedKitchenException();
	}

	public Food randomOrder() {
		//we need to know all of the potential choices
		//get a connection
		Connection conn = cu.getConnection();
		//prepare a sql statement to get all food ids
		//execute query
		//we loop through result set adding ids to an arrayList
		//we roll random number base on the size of the arrayList
		//we execute a second sql statement to get a food based on the id we chose
		//execute query
		//we process the result set to get the food object
		//we return it
		return null;
	}

	public Food getFoodById(int id) {
		//get a connection
		Connection conn = cu.getConnection();
		//prepare a sql statement based on the id
		//execute query
		//process result set to a food object
		//return the object
		return null;
	}

	public Food saveOneFood(Food f) {
		// TODO Auto-generated method stub
		return null;
	}

}
