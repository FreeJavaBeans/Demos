package com.revature.streams;

//this class is going to be about food related data
//and food related behaviours
/**
 * 
 * @author Alec
 *
 */
public class Food {
	
	
	//this is a field
	private String name;
	
	private double calories;
	
	private String culture = "unknown";
	
	private String type;
	
	private int spiciness;
	
	//we declare a method with the same signature as one we inherited from OBject
	@Override
	public String toString() {
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
		
		
		//customizing the object because this is the food constructor
	}
	
	
	
	
	//ignore for now
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(calories);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((culture == null) ? 0 : culture.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + spiciness;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	//compares all fields of the object to check for equality
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Food other = (Food) obj;
		if (Double.doubleToLongBits(calories) != Double.doubleToLongBits(other.calories))
			return false;
		if (culture == null) {
			if (other.culture != null)
				return false;
		} else if (!culture.equals(other.culture))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (spiciness != other.spiciness)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	
	
	
	
	
	
	//beneath here lies your doom ( getters and setters )
	



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCalories() {
		return calories;
	}

	public void setCalories(double calories) {
		this.calories = calories;
	}

	public String getCulture() {
		return culture;
	}

	public void setCulture(String culture) {
		this.culture = culture;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		//limit to a specific array of strings
		this.type = type;
	}

	public int getSpiciness() {
		return spiciness;
	}

	public void setSpiciness(int spiciness) {
		//maybe check spiciness to be positive
		this.spiciness = spiciness;
	}
	
	
	
}
