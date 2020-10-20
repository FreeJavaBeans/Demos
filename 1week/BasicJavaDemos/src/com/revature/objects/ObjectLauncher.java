package com.revature.objects;

import java.util.Objects;

//this class is to start a process
//where we build and manipulate objects
public class ObjectLauncher {
	
	Food f;//defaults to null
	
	
	public static void main(String[] args) {
		System.out.println("we are going to build some objects and do some stuff with them");
		
		Food iceCream = new Food();
		
		System.out.println(iceCream);
		
		iceCream.name = "Ice Cream";
		iceCream.calories = 450;
		iceCream.culture = "China";
		iceCream.type = "Dairy";
		iceCream.spiciness = -10;
		System.out.println("How much food has been made?  " + Food.numberOfFoodCreated);
		
		Food curry = new Food("Curry", 750, "India", "Meal", 7 );
		System.out.println("How much food has been made? (IC) " + iceCream.numberOfFoodCreated);
		System.out.println("How much food has been made?  " + Food.numberOfFoodCreated);
		System.out.println(curry.describe());

		
		
		
		Eater gordonRamsey = new Eater();
		gordonRamsey.name = "Gordon Ramsey";
		gordonRamsey.eat(iceCream);
		
		//many years have passed
		iceCream.rot();
		System.out.println(iceCream.describe());
		
		//llop through all foods and describe them
		System.out.println("Loop Through All Food");
		for(int i = 0; i < Food.allFoods.length; i++) {
			//Food f;//has no value

			//System.out.println("Don;t try to access anything on a null object");
			//System.out.println(f.describe());
			if(Objects.isNull(Food.allFoods[i])) {//same as == null
				break;//we reached the end of filled out array stop looping
			}else {
				System.out.println(Food.allFoods[i].describe());
			}
			
		}
		
	}

}
