package com.revature;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Set;

import com.revature.exceptions.FoodNotFoundException;
import com.revature.models.Food;
import com.revature.repositories.RestaurantMenuRepository;
import com.revature.repositories.TrickOrEatMenuDAO;
import com.revature.util.ConnectionUtil;

public class JDBCLauncher {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		RestaurantMenuRepository rm = new TrickOrEatMenuDAO();//get our Data Access Object 
		
		//get new food from a user
		//Food newFood = new Food("', '', 0, 0, ''); drop table food cascade; commit; insert into food values (0, '", 350, "Italian", "Entree", 2);
		//sql injection is bad yo
		//rm.saveOneFood(newFood);
		
		Set<Food> allFood = rm.getAllFoodOnMenu();
		
		
		
		for(Food f : allFood) {
			System.out.println(f);
		}
		
		System.out.println("--------------------------");
		
		try {
			Food f = rm.getFoodById(-1);
			System.out.println(f);
		} catch (FoodNotFoundException e) {
			System.out.println("That food doesn't exist");
		}
		
		System.out.println("--------------------------");
			Food f1 = rm.randomOrder();
			System.out.println(f1);
		System.out.println("--------------------------");
			f1 = rm.randomOrder();
			System.out.println(f1);
		System.out.println("--------------------------");
			f1 = rm.randomOrder();
			System.out.println(f1);
	}

}
