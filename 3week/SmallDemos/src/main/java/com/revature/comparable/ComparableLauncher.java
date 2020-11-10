package com.revature.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.revature.streams.Food;

public class ComparableLauncher {
	
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
		
		Collections.sort(fList);
		
		Set<Food> tMap = new TreeSet<>(fList);
		
		//the enhanced actually just builds an iterator behind the scenes
		for( Food f : fList) {
			System.out.println(f);
			
		}
		
		System.out.println("--------------------------------------------");
		Comparator<Food> cultureComp = new FoodCultureComparator();
		Collections.sort(fList, cultureComp);
		
		for( Food f : fList) {
			System.out.println(f);
			
		}
		
		System.out.println("--------------------------------------------");
		Collections.sort(fList, (e1,e2)->{
			return (int) (e1.getCalories() - e2.getCalories());
		});
		
		for( Food f : fList) {
			System.out.println(f);
			
		}
		
	}

}
