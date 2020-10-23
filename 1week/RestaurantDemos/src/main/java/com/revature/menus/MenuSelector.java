package com.revature.menus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuSelector {
	
	
	//an array of all menus?
	
	//currentMenu
	private Menu currentMenu;
	//manage use input
	private Scanner input;
	
	/**
	 * Show the current menu and prompt the use for an input
	 */
	public void display() {
		System.out.println(currentMenu.getMenuDisplay());
		getUserInput();
	}
	
	
	private void getUserInput() {
		
		System.out.println("Please choose a number between " 
		                    + currentMenu.getChoices().get(0) 
		                    + "-" 
		                    + currentMenu.getChoices().get(currentMenu.getChoices().size() - 1));
		
		if(input.hasNextInt()) {
			int choice = input.nextInt();
			if(currentMenu.getChoices().contains(choice)) {
				System.out.println("Your Choice was " + choice + " Thank you");
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
	
	
	
	
	
	
	
	
	
	
	
	public Menu getCurrentMenu() {
		return currentMenu;
	}
	public void setCurrentMenu(Menu currentMenu) {
		this.currentMenu = currentMenu;
	}
	public Scanner getInput() {
		return input;
	}
	public void setInput(Scanner input) {
		this.input = input;
	}
	public MenuSelector() {
		super();
		input = new Scanner(System.in);
		String l1 = "1. See All Food\n";
		String l2 = "2. Make An Order\n";
		String l3 = "3. Pay your Bill\n";
		String l4 = "4. Leave\n";
		String display = l1 + l2 + l3 + l4;
		List<Integer> choices = new ArrayList<Integer>();
		choices.add(1);
		choices.add(2);
		choices.add(3);
		choices.add(4);
		currentMenu = new Menu(display, choices);
	}
	public MenuSelector(Menu currentMenu, Scanner input) {
		super();
		this.currentMenu = currentMenu;
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
