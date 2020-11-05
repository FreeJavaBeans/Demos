package com.revature.menus;

import java.util.Scanner;

import com.revature.exceptions.InternalErrorException;
import com.revature.exceptions.UserNotFoundException;
import com.revature.models.User;
import com.revature.services.RestaurantUserService;
import com.revature.services.TrickOrEatOrderService;
import com.revature.services.TrickOrEatUserService;

public class Menu {
	// is going to contain a string for each menu in our program
	// some menus will be fixed -> their data will never change
	// we can directly declare
	// some menus will be dynamic, their data relies on data from the database
	// build in the constructor and maybe update occasionally
	private RestaurantUserService rus = new TrickOrEatUserService();

	private Scanner inputReader;

	private String header;

	private String loginMenu;
	private String mainMenu;
	private String orderMenu;// show your current order

	private String currentMenu;// only ever set to one of the other menus

	private User currentUser;

	{

		header = "Welcome to Trick or Eat!\n" + "-----------------------\n";

		loginMenu = "Press Enter to Login";

		mainMenu = "1: Add Food to Order\n" + "2: Current Order\n" + "3: Pay Bill\n";

	}

	public Menu() {
		this.inputReader = new Scanner(System.in);
		this.currentMenu = this.loginMenu;

	}

	public String display() {
		String ret = header + currentMenu;
		return ret;
	}

	public void handleInput() {
		// just add more elseIfs for more menus
		try {
			if (currentMenu.equals(loginMenu)) {
				loginMenuInput();
			} else if (currentMenu.equals(mainMenu)) {
				mainMenuInput();
			} else if (currentMenu.equals(orderMenu)) {
				orderMenuInput();
			}
		} catch (InternalErrorException e) {// do a reset becasue something bad happened
			System.out.println("Oops sonething went wrong. Taking you back to login");
			currentMenu = loginMenu;
			currentUser = null;
		}

	}

	private void loginMenuInput() throws InternalErrorException {
		inputReader.nextLine();// wait for them to hit enter
		String username;
		String password;
		System.out.print("Please Enter your Username: ");
		username = inputReader.nextLine();
		System.out.print("Please Enter your Password: ");
		password = inputReader.nextLine();
		try {
			this.currentUser = rus.login(username, password);
			currentMenu = mainMenu;
		} catch (UserNotFoundException e) {// expected possibility
			System.out.println("Your Username or Password was Incorrect. Please Try Again");
		}
	}

	private void mainMenuInput() {
		System.out.println("Enter 1-3 to make a choice");
		try {
			int choice = Integer.parseInt(inputReader.nextLine());
			System.out.println("Your choice was " + choice);
			// write a switch statement to handle each of the choices
			switch (choice) {
			case 1: {
				//change to food menu
			}
			case 2: {
				//change to order menu
			}
			case 3: {
				//change to bill menu
			}
			default: {
				System.out.println("Not a valid Choice");
			}
			}
		} catch (NumberFormatException e) {
			System.out.println("Not a valid Choice");
		}

	}

	private void orderMenuInput() {

	}

}
