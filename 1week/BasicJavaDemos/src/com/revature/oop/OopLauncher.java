package com.revature.oop;



public class OopLauncher {
	
	public static void main(String[] args) {
		
		
		Food iceCream = new Food();
		iceCream.setName("Ice Cream");
		iceCream.setCalories(800);
		iceCream.setCulture("Chinese");
		iceCream.setType("Dairy");
		iceCream.setSpiciness(0);
		
		Food curry = new Food("Curry", 750, "India", "Meal", 7 );
		
		//when we treat an object as one of its subtypes
		//we can only use fields and methods on the sub type
		//the others still exist, it just gives us compiler errors
		Eater e = new AliveThing();//anything that implements the type eater
		
		//the only way around the above situation is by downcasting the Eater into a living being
		//this is potentially dangerous because there is no guarantee that e is a living being
		((LivingBeing)e).setName("Gordon Ramsey") ; //(Type)object -> casting compiler, pretend object is of type type 
		
		e.eat(curry);
		
		
	}
}
