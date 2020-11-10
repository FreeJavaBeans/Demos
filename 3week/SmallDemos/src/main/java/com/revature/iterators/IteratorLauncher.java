package com.revature.iterators;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.revature.streams.Food;

public class IteratorLauncher {
	
	
	
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
		
		Set<Food> fSet = new HashSet<>(fList);//you can pass any collection into the constructor of a different collection to intialize it 
		
		
		Iterator<Food> it = fSet.iterator();
		//is only good for a single loop
		//then we have to recreate it
		while(it.hasNext()) {
			Food f = it.next();
			f.setCalories(f.getCalories() * 2);
		}
		//recreate after it was used once
		it = fSet.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}
