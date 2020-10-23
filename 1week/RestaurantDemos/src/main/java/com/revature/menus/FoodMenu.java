package com.revature.menus;

import java.util.ArrayList;
import java.util.List;

import com.revature.models.Food;
import com.revature.services.RestaureantOrderService;
import com.revature.services.TrickOrEatOrderService;

//menu relating to food operations
public class FoodMenu {
	
	private List<FoodMenuLine> menu;
	
	//make one object for all lines to use
	private RestaureantOrderService ros = new TrickOrEatOrderService();
	
	
	public String display() {
		//returns complete menu display 
		StringBuilder sb = new StringBuilder();
		for(FoodMenuLine fl : menu) {
			sb.append(fl.display());
			sb.append('\n');
		}
		return sb.toString();
	}
	
	public void chooseALine(int i) {
		menu.get(i).doAction();
	}
	
	
	public FoodMenu() {
		super();
		//build all of the lines
		//call get all food from the service
		//build the menu
		FoodMenuLine fl1 = new FoodMenuLine(1, new Food("Witches Brew", 250, "Wiccan", "Drink",3), ros);
		FoodMenuLine fl2 = new FoodMenuLine(2, new Food("Pumpkin Pie", 2500, "Puritans", "Dessert", 1), ros);
		FoodMenuLine fl3 = new FoodMenuLine(3, new Food("Candy Corn", 150, "Demons", "Dessert", 0), ros);
		FoodMenuLine fl4 = new FoodMenuLine(4, new Food("Vampire Blood Wine", 450, "Transylvanian", "Drink", 0 ), ros);
		FoodMenuLine fl5 = new FoodMenuLine(5, new Food("Mutton", 450, "Cows", "Meat", 5), ros);
		this.menu = new ArrayList<FoodMenuLine>();
		menu.add(fl1);
		menu.add(fl2);
		menu.add(fl3);
		menu.add(fl4);
		menu.add(fl5);
	}
	
	

	public List<FoodMenuLine> getMenu() {
		return menu;
	}

	public void setMenu(List<FoodMenuLine> menu) {
		this.menu = menu;
	}

	@Override
	public String toString() {
		return "FoodMenu [menu=" + menu + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((menu == null) ? 0 : menu.hashCode());
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
		FoodMenu other = (FoodMenu) obj;
		if (menu == null) {
			if (other.menu != null)
				return false;
		} else if (!menu.equals(other.menu))
			return false;
		return true;
	}
	
	

}
