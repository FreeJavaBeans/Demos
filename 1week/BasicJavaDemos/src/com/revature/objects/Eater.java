package com.revature.objects;

//anything that can eat a food
public class Eater {
	
	double hunger;
	
	String name;
	
	//method can take in any number of paramaters of any types
	public void eat(Food f) {
		this.hunger -= f.calories; //-= is a special shorthand operator for x = x - y -> x -= y
		System.out.println( "My name is " + this.name + " and I think that " + f.name + " was tasty!");
	}
	

}
