package com.revature.objects;

//this class is going to be about food related data
//and food related behaviours
/**
 * 
 * @author Alec
 *
 */
public class Food {
	
	static int numberOfFoodCreated = 0;//we can assign a default value to field when it gets created
	
	static Food  []   allFoods = new Food[10];
	
	
	//this is a field
	String name;
	
	double calories;
	
	String culture = "unknown";
	
	String type;
	
	int spiciness;
	
	//this is a method
	//we can call it on any object made from the class
	public String describe() {
		//the this keyword refers to the specific object we called the method on
		return "Food" +
				"\n Name: " + this.name + 
				"\n Calories: " + this.calories + 
				"\n Culture: " + this.culture + 
				"\n Type: " + this.type + 
				"\n Spiciness: " + this.spiciness;
	}
	
	//void return type means a method doesn't return anything
	/**
	 * 
	 */
	public void rot() {
		this.name = "Rotten " + this.name;
		this.calories = this.calories/2;
	}

	//most of the time we include a default constructor unless we have a good reason not too
	//a good reason not to have one is if our object requires another object for it to function
	public Food() {
		super();
		allFoods[numberOfFoodCreated] = this;
		numberOfFoodCreated++;
		
	}
	
	//a constructor for a food of unknown origins
	public Food(String name, double calories, String type, int spiciness) {
		//this keyword is for calling another constructor in the same class
		this(name, calories, "Unknown", type, spiciness);
	}
	
	//common constructor pattern
	//we take in every single field
	//we initialize the object with those fields
	public Food(String name, double calories, String culture, String type, int spiciness) {
		super();//we get an object from object
		this.name = name;
		this.calories = calories;
		this.culture = culture;
		this.type = type;
		this.spiciness = spiciness;
		
		allFoods[numberOfFoodCreated] = this;
		numberOfFoodCreated++;
		//customizing the object because this is the food constructor
	}
}
