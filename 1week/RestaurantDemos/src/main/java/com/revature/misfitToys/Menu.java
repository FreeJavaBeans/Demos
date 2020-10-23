package com.revature.misfitToys;

import java.util.List;

//this will be expanded in the future
//tie the choice to a particular method call
public abstract class Menu implements Displayable{

	private List<MenuLine> menuDisplay;
	
	public String display() {
		String display = "";
		for(MenuLine ml : menuDisplay) {
			display += ml.display();
		}
		return buildBorder(display);
	}
	
	public void chooseItem(int choice) {
		//menuDisplay.get(choice).doAction();
	}
	
	protected abstract String buildBorder(String display);

	
	
}
