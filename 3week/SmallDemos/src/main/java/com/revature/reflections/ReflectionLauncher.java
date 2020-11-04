package com.revature.reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

public class ReflectionLauncher {
	
	public static void main(String[] args) {
		Food f = new Food("Witches Brew", 250, "Wiccan", "Drink",3);
		Class foodClass = f.getClass();
		foodClass = Food.class;
		
		//we could implement soime code to build an instance of an object while not being able to access any of the code of that object
//		for(Constructor c : foodClass.getConstructors()) {
//			Object[] args2;
//			args2 = new Object[2];
//			args2[0] = "pumpkin";
//			args2[1] = ((Double) 200.5);
//			if(c.getParameterCount() <= args2.length) {
//				c.getParameterTypes();
//				c.getParameters();
//				Parameter p;
//				p.
//			}
//			
//			c.newInstance(args2);
//		}
		
		for(Constructor c : foodClass.getConstructors()) {
			System.out.println("Constructor [ ");
			System.out.println("Usable? " + Modifier.isPublic(c.getModifiers()));
			for(Parameter p : c.getParameters()) {
				System.out.println(p.getName() + ", " + p.getType().toString().split("\\.")[p.getType().toString().split("\\.").length - 1] + ",");
			}
			System.out.println(" ]");
		}
		
		
		
		
		
	}
	
	
	
	

}
