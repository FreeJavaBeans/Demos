package com.revature.misfitToys;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuSelector {
	
	
	//an array of all menus?
	
	//currentMenu
	private FoodMenu currentMenu;
	//manage use input
	private Scanner input;
	
	/**
	 * Show the current menu and prompt the use for an input
	 */
	public void display() {
		System.out.println(currentMenu.display());
		getUserInput();
	}
	
	
	private void getUserInput() {
		
		System.out.println("Please choose a number between " 
		                    + "1"
		                    + "-" 
		                    + (currentMenu.getMenu().size()));
		
		if(input.hasNextInt()) {
			int choice = input.nextInt();
			if(0< choice && choice <= currentMenu.getMenu().size()) {
				currentMenu.chooseALine(choice-1);
			}else {
				System.out.println("Please input a valid Choice");
			}
		} else {
			System.out.println("Please input a valid Choice");
			//a little regex
			input.next();
			//input.skip(".*") // didn't work
			//the . character in regex will match any character
			//the * modifier on a character means match o to inifinty in a row
			//a* -> o to inifinty aaaaaa aaa aaa aaaaaaaa all of these would watch
			//. matches a or z or \ or > 
			//.* will match everything from 0-> infinity
		}
	}
	
	public MenuSelector() {
		super();
		currentMenu = new FoodMenu();
		this.input = new Scanner(System.in);
	}


	public FoodMenu getCurrentMenu() {
		return currentMenu;
	}


	public void setCurrentMenu(FoodMenu currentMenu) {
		this.currentMenu = currentMenu;
	}


	public Scanner getInput() {
		return input;
	}


	public void setInput(Scanner input) {
		this.input = input;
	}


	@Override
	public String toString() {
		return "MenuSelector [currentMenu=" + currentMenu + ", input=" + input + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((currentMenu == null) ? 0 : currentMenu.hashCode());
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
		MenuSelector other = (MenuSelector) obj;
		if (currentMenu == null) {
			if (other.currentMenu != null)
				return false;
		} else if (!currentMenu.equals(other.currentMenu))
			return false;
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
