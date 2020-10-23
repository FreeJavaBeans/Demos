package com.revature;

import com.revature.menus.MenuSelector;
import com.revature.models.Eater;
import com.revature.models.LivingBeing;

public class RestaurantLauncher {
	
	public static Eater currentEater = new LivingBeing(2000, "Alec");
	
	public static void main(String[] args) {
		MenuSelector ms = new MenuSelector();
		while(true) {
			ms.display();
			//login logout functionality
		}
	}

}
