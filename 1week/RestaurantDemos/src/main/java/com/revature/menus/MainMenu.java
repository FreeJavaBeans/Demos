package com.revature.menus;

import java.util.ArrayList;
import java.util.List;

public class MainMenu extends AbstractMenu{

	@Override
	public void handleInput() {
		
		String input = this.getInputReader().nextLine();
		try {
			int choice = Integer.parseInt(input) - 1;
			//in bounds
			if(choice >=0 && choice < this.getLines().size()) {
				this.getLines().get(choice).doAction();
			}else {
				System.out.println("Please Make a Valid Choice");
			}
		}catch (NumberFormatException e) {
			System.out.println("Please Make a Valid Choice");
		}
		
		
	}

	@Override
	public List<MenuLine> buildMenu() {
		MenuLine l1 = new MenuLine(0, ()->"1: Look At Food Choices", ()->{
				MenuSelector.getMenuSelector().traverse(0);
			});
		MenuLine l2 = new MenuLine(1, ()->"2: Look At Current Order", ()->{
				System.out.println("503 Not Implemented");
			});
		MenuLine l3 = new MenuLine(2, ()->"3: Pay Your Bill", ()->{
				System.out.println("503 Not Implemented");
			});
		MenuLine l4 = new MenuLine(3, ()->"4: Go Back", ()->{
				MenuSelector.getMenuSelector().traverse(-1); 
			});
		List<MenuLine> ret = new ArrayList<MenuLine>();
		ret.add(l1);
		ret.add(l2);
		ret.add(l3);
		ret.add(l4);
		
		return ret;
	}

}
