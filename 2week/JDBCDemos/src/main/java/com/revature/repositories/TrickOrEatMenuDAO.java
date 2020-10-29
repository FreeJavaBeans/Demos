package com.revature.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import com.revature.exceptions.ClosedKitchenException;
import com.revature.exceptions.FoodNotFoundException;
import com.revature.models.Food;
import com.revature.util.ConnectionUtil;

public class TrickOrEatMenuDAO implements RestaurantMenuRepository {
	
	
	private ConnectionUtil cu = ConnectionUtil.getConnectionUtil();
	

	public Set<Food> getAllFoodOnMenu() {
		//get a connection
		Connection conn = cu.getConnection();
		Set<Food> allFood = new HashSet<Food>();
		
		try {
			//prepare a sql statement to get all food "select * from food;"
			Statement statementObject = conn.createStatement();
			
			String queryString = "select * from Food;";
			//execute the statement
			ResultSet results = statementObject.executeQuery(queryString);
			
			

			//loop through result set building food objects
			//calling first() or next() will take us to the first row
			while(results.next()) {
				Food f = new Food();
				f.setName(results.getString("name"));
				f.setCalories(results.getDouble("calories"));
				f.setCulture(results.getString("culture"));
				f.setSpiciness(results.getInt("spiciness"));
				f.setType(results.getString("type"));
				f.setFoodId(results.getInt("food_id"));
				//add food to a hashset
				allFood.add(f);
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Get ALL Food Failed");
		}
		
		
		//return that set
		return allFood;
	}

	public Food customOrder(Food newFood) throws ClosedKitchenException {
		throw new ClosedKitchenException();
	}

	public Food randomOrder() {
		//we need to know all of the potential choices
		//get a connection
		Connection conn = cu.getConnection();
		try {
			//prepare a sql statement to get all food ids
			PreparedStatement ps1 = conn.prepareStatement("select food_id from food;");
			
			List<Integer> foodIds = new ArrayList<Integer>();
			
			ResultSet results = ps1.executeQuery();
			//put all food ids into a list
			while(results.next()) {
				foodIds.add(results.getInt("food_id"));
			}
			//randomly choose an id
			Random rand = new Random();
			int choosenId = foodIds.get(rand.nextInt(foodIds.size()));
			
			try {
				//call find by id with chosen id
				Food f = getFoodById(choosenId);
				return f;//return the food
			} catch ( FoodNotFoundException e) {
				System.out.println("Random Order Failed");
			}
			
			return null;
			
		} catch (SQLException e) {
			System.out.println("Random Order Failed");
		}
		return null;
	}

	public Food getFoodById(int id) throws FoodNotFoundException {
		//get a connection
		Connection conn = cu.getConnection();
		//prepare a sql statement based on the id
		try {
			PreparedStatement ps = conn.prepareStatement("select * from food where food_id = ?");
			
			ps.setInt(1, id);
			//execute query
			ResultSet rs = ps.executeQuery();
			//process result set to a food object
			if(rs.next()) {
				Food f = new Food();
				f.setName(rs.getString("name"));
				f.setCalories(rs.getDouble("calories"));
				f.setCulture(rs.getString("culture"));
				f.setSpiciness(rs.getInt("spiciness"));
				f.setType(rs.getString("type"));
				f.setFoodId(rs.getInt("food_id"));
				//return the object
				return f;
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
			System.out.println("failed to find by id");
		}
		
		throw new FoodNotFoundException();
		
	}

	public Food saveOneFood(Food f) {
		//get a connection
		Connection conn = cu.getConnection();
		try {
			//prepare a statement
			//if you are ever ever ever taking in input from a dirty no good down low user 
			//use an preapared statement
			PreparedStatement prepStatement = conn.prepareStatement("insert into food (\"name\", culture, spiciness, calories, \"type\" ) "
																	+ " values ( ?, ?, ?, ?, ?) returning food.food_id;");
			//start at 1 in a prep statment
			//parameterize the statement
			//protecting us from sql injection
			prepStatement.setString(1, f.getName());
			prepStatement.setString(2, f.getCulture());
			prepStatement.setInt(3, f.getSpiciness());
			prepStatement.setDouble(4, f.getCalories());
			prepStatement.setString(5, f.getType());
			
			
			//execute query
			ResultSet results = prepStatement.executeQuery();
			//process results for the new id
			results.next();
			f.setFoodId(results.getInt("food_id"));
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Save Food Failed");
		}
		
		//return the original food object with its new id from the database
		return f;
	}

}
