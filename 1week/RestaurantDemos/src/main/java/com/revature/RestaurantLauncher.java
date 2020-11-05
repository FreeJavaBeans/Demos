package com.revature;


import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.revature.menus.Menu;


public class RestaurantLauncher {
	
	public static Logger logger = LogManager.getLogger("com.revature.trickoreat");
	
	public static void main(String[] args) throws IOException {
		Menu m = new Menu();		

		while(true) {
			
			System.out.println(m.display());
			m.handleInput();

		}
	}

		
	
}
