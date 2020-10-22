package com.revature.protorestaurant;

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import com.revature.oop.Food;

public class TrickOrEats implements RestaurantMenu {

	private String address;
	
	private List<Employee> workers;
	
	private Set<Food> menu;
	
	
	@Override
	public Set<Food> getAllFoodOnMenu() {
		// TODO Auto-generated method stub
		return menu;
	}

	@Override
	public Food customOrder(Food newFood) throws ClosedKitchenException {
		// We have an "implementation"
		//that impl is we don't support this behaviour
		//anyone calling this method must prepare for it to fail
		throw new ClosedKitchenException();
		//return null;
	}

	@Override
	public Food randomOrder() {
		Random rand = new Random();//get a random generator
		int i = rand.nextInt(menu.size());//roll a random int between 0 and the size ( exclusive )

		return (Food)menu.toArray()[i];
	}
	
	//our default ++ constructor
	public TrickOrEats() {
		super();
		//we will make the food for the menu
		//we should read in from a file the configuration options for making the food
		this.menu = new HashSet<Food>();
		menu.add(new Food("Witches Brew", 250, "Wiccan", "Drink",3));
		menu.add(new Food("Pumpkin Pie", 2500, "Puritans", "Dessert", 1));
		menu.add(new Food("Candy Corn", 150, "Demons", "Dessert", 0));
		menu.add(new Food("Vampire Blood Wine", 450, "Transylvanian", "Drink", 0 ));
		menu.add(new Food("Mutton", 450, "Cows", "Meat", 5));
	}
	
	//overloaded
	public TrickOrEats(String address, List<Employee> workers) {
		this();//call the default++ constructor to get the menu made
		//then do additional constructing
		this.address = address;
		this.workers = workers;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Employee> getWorkers() {
		return workers;
	}

	public void setWorkers(List<Employee> workers) {
		this.workers = workers;
	}

	public Set<Food> getMenu() {
		return menu;
	}

	public void setMenu(Set<Food> menu) {
		this.menu = menu;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((menu == null) ? 0 : menu.hashCode());
		result = prime * result + ((workers == null) ? 0 : workers.hashCode());
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
		TrickOrEats other = (TrickOrEats) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (menu == null) {
			if (other.menu != null)
				return false;
		} else if (!menu.equals(other.menu))
			return false;
		if (workers == null) {
			if (other.workers != null)
				return false;
		} else if (!workers.equals(other.workers))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TrickOrEats [address=" + address + ", workers=" + workers + ", menu=" + menu + "]";
	}
	

	
	
}
