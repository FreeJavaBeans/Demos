package com.revature.repositories;

import java.util.Set;

import com.revature.exceptions.ClosedKitchenException;
import com.revature.models.Food;

public interface RestaurantMenuRepository {
	
	
	/**
	 * So the Eater is aware of all choices of food
	 * @return the full menu of all food items
	 */
	public Set<Food> getAllFoodOnMenu();
	
	//consider live updates to the menu
	/**
	 * An eater can try to request a new food off menu
	 * the kitchen will determine if it's possible
	 * @param f
	 * @return Food if the kitchen can make it
	 * 	throws exception if incorrect ingredients
	 */
	public Food customOrder(Food newFood) throws ClosedKitchenException;
	
	
	/**
	 * For when the eater does not know what they want to eat
	 * 
	 * @return A food on menu chosen randomly
	 */
	public Food randomOrder();
	
	
	public Food getFoodById(int id);
	
	public Food saveOneFood(Food f);
	

}
