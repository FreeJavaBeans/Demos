package com.revature.comparable;

import java.util.Comparator;

import com.revature.streams.Food;

public class FoodCultureComparator implements Comparator<Food> {

	@Override
	public int compare(Food o1, Food o2) {
		return o1.getCulture().compareTo(o2.getCulture());
	}

}
