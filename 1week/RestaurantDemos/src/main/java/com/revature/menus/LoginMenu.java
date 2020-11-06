package com.revature.menus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.revature.exceptions.InternalErrorException;
import com.revature.exceptions.UserNotFoundException;
import com.revature.services.RestaurantUserService;
import com.revature.services.TrickOrEatUserService;

public class LoginMenu extends AbstractMenu{
	
	private RestaurantUserService rus = new TrickOrEatUserService();

	@Override
	//specifically for taking in which line gets chosen
	public void handleInput() {
		this.getInputReader().nextLine();// wait for them to hit enter
		this.getLines().get(0).doAction();
		
	}

	@Override
	public List<MenuLine> buildMenu() {
		//a menu line has a display, and an action to execute if it gets chosen
		MenuLine l1 = new MenuLine(0, ()->"Press Enter to Login", ()->{
			String username;
			String password;
			System.out.print("Please Enter your Username: ");
			username = this.getInputReader().nextLine();
			System.out.print("Please Enter your Password: ");
			password = this.getInputReader().nextLine();
			try {
				MenuSelector.getMenuSelector().setCurrentUser(rus.login(username, password));
				MenuSelector.getMenuSelector().traverse(0);
			} catch (UserNotFoundException e) {// expected possibility
				System.out.println("Your Username or Password was Incorrect. Please Try Again");
			} catch (InternalErrorException e) {
				// TODO Auto-generated catch block
				System.out.println("OOps something went wrong takingyou back to login");
				MenuSelector.getMenuSelector().reset();
			}
		});
		List<MenuLine> ret = new ArrayList<MenuLine>();
		ret.add(l1);
		return ret;
	}

	
	
	
	
	

		
	

}
