package com.revature.misfitToys;

import com.revature.models.Food;
import com.revature.models.Order;
import com.revature.services.RestaureantOrderService;
import com.revature.services.TrickOrEatOrderService;

//a single line on the food menu
public class FoodMenuLine {
	
	private int lineNumber;
	
	private Food food;
	
	//we should give the service to the menu
	//menu can pass it to each line
	private RestaureantOrderService ros;
	
	
	public String display() {
		return lineNumber + ". " + food.getName() + " - " + "This Food comes from " + food.getCulture();
	}
	
	public void doAction() {
		//what happens when you choose a food from the menu
		//probably we add it to your order
		//Order o = ros.addFoodToOrder(food);
		//System.out.println("your order is : " + o);
	}

	public int getLineNumber() {
		return lineNumber;
	}

	public void setLineNumber(int lineNumber) {
		this.lineNumber = lineNumber;
	}

	public Food getFood() {
		return food;
	}

	public void setFood(Food food) {
		this.food = food;
	}

	public FoodMenuLine() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FoodMenuLine(int lineNumber, Food food, RestaureantOrderService ros) {
		super();
		this.lineNumber = lineNumber;
		this.food = food;
		this.ros = ros;
	}

	@Override
	public String toString() {
		return "FoodMenuLine [lineNumber=" + lineNumber + ", food=" + food + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((food == null) ? 0 : food.hashCode());
		result = prime * result + lineNumber;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FoodMenuLine other = (FoodMenuLine) obj;
		if (food == null) {
			if (other.food != null)
				return false;
		} else if (!food.equals(other.food))
			return false;
		if (lineNumber != other.lineNumber)
			return false;
		return true;
	}
	
	
	

}
