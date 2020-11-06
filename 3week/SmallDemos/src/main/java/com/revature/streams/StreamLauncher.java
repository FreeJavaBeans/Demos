package com.revature.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamLauncher {

	
	public static void main(String[] args) {
		Food f1 = new Food("Witches Brew", 250, "Wiccan", "Drink",3);
		Food f2 = new Food("Pumpkin Pie", 2500, "Puritans", "Dessert", 1);
		Food f3 = new Food("Candy Corn", 150, "Demons", "Dessert", 0);
		Food f4 = new Food("Vampire Blood Wine", 450, "Transylvanian", "Drink", 0 );
		Food f5 = new Food("Mutton", 450, "Cows", "Meat", 5);
		
		List<Food> fList = new ArrayList<Food>();
		fList.add(f1);
		fList.add(f2);
		fList.add(f3);
		fList.add(f4);
		fList.add(f5);
		
		//For each is not pure
		//the function we write inside can definitely change the elements
		//fList.forEach(f -> f.setName("Something bad"));
		
		//fList.forEach(f -> System.out.println(f.getName()));
		
		//we have a list of food
		//we want to make a set of all unique desserts
		Set<String> desserts = fList.stream()
											.filter((Food f)->{//a predicate takes in one param, returns true to allow it to move downstream or false to stop its evaluation
													return f.getType().equals("Dessert");
											})
											.map((Food f) ->{ return f.getName();})//changed us from food to String
											.distinct()
											.collect(Collectors.toSet());
		
		desserts.forEach(f -> System.out.println(f));
		
//		Thread t = new Thread(()-> {
//			while(true) {
//				System.out.println("Lambdas are cool");
//			}
//		});
//		t.start();
		
		
	}
	
	
}
