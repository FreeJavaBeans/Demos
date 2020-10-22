package com.revature.protorestaurant;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;


import com.revature.oop.Eater;
import com.revature.oop.Food;
import com.revature.oop.LivingBeing;


//the biggest problem with this application is we don't know what the launcher is supposed to be
//is launcher an interface between you and a single restaurant?
//is it an interface between you and many different restaurants?
public class PRestaurantLauncher {
	
	public static void main(String[] args) {
		//we need an object that represents all the food we can have
		RestaurantMenu halloweenTheme = new TrickOrEats("1111 Elm Street", new ArrayList<Employee>());
		halloweenTheme.getAllFoodOnMenu();
		
		//we need an object that represents orders to eat food our eaters can make
		//List vs Queue?
		//Queue Pros
		//first come first serve -> probably good
		//vip support -> priority queue can do
		//List Pros
		//list is indexed -> search through it ( making batches of things )
		//to deliver foods out of order -> kitchen is wild, somethings are made more quickly than others
		
		
		Queue<Order> orders = new PriorityQueue<>();
		
		
		Eater alec = new LivingBeing(5000, "Alec");
		try {
			Food spaghetti = new Food("Spaghetti", 750, "Italians", "Grain", 2);
			halloweenTheme.customOrder(spaghetti);
		} catch(ClosedKitchenException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println("Remember, more general excpetions go later in the catch block chain");
		}finally {
			System.out.println("Me oh MY I sure am hungry");
		}
		List<Food> choices = new ArrayList<>();
		choices.add(halloweenTheme.randomOrder());
		choices.add(halloweenTheme.randomOrder());
		choices.add(halloweenTheme.randomOrder());
		
		orders.add(new Order(choices, alec));
		
		//we will make some orders for our eaters
		//we have some sort of proccess that represents a kitchen 
		//when the order is complete
		Order completed = orders.poll();
		
		//enhanced For Loop
		//is special notation for looping through something that is iterable
		//exactly something that implements the iterable interface
		//I recommend this one over others whenever you can
		for(Food f : completed.getOrderItems()) {//left of the colon is a variable representing one object in the iterable, the right it the iterable object
			alec.eat(f);
		}
		
		System.out.println(completed);
	}

}
