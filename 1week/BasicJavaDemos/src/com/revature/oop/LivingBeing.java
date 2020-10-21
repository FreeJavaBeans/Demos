package com.revature.oop;

//anything that can eat a food
public class LivingBeing implements Eater{
	
	double hunger;
	
	String name;

	@Override
	public void eat(Food f) {
			this.hunger -= f.getCalories(); //-= is a special shorthand operator for x = x - y -> x -= y
			System.out.println( "My name is " + this.name + " and I think that " + f.getName() + " was tasty!");
	}
	
	
	

}
