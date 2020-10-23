package com.revature.models;

//anything that can eat a food
public class LivingBeing implements Eater{
	
	private double hunger;
	
	private String name;

	public void eat(Food f) {
		this.hunger -= f.getCalories(); //-= is a special shorthand operator for x = x - y -> x -= y
		System.out.println( "My name is " + this.name + " and I think that " + f.getName() + " was tasty!");
	}

	public double getHunger() {
		return hunger;
	}

	public void setHunger(double hunger) {
		this.hunger = hunger;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LivingBeing(double hunger, String name) {
		super();
		this.hunger = hunger;
		this.name = name;
	}

	public LivingBeing() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "LivingBeing [hunger=" + hunger + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(hunger);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		LivingBeing other = (LivingBeing) obj;
		if (Double.doubleToLongBits(hunger) != Double.doubleToLongBits(other.hunger))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	
	
	 
	
	
	

}
